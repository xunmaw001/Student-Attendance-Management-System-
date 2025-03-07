package com.entity.vo;

import com.entity.KaoqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考勤
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoqin")
public class KaoqinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 课程
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 考勤类型
     */

    @TableField(value = "kaoqin_types")
    private Integer kaoqinTypes;


    /**
     * 二级考勤类型
     */

    @TableField(value = "kaoqin_erji_types")
    private Integer kaoqinErjiTypes;


    /**
     * 本次考勤得分
     */

    @TableField(value = "kaoqin_defen")
    private Double kaoqinDefen;


    /**
     * 考勤备注
     */

    @TableField(value = "kaoqin_content")
    private String kaoqinContent;


    /**
     * 考勤日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaoqin_time")
    private Date kaoqinTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：考勤类型
	 */
    public Integer getKaoqinTypes() {
        return kaoqinTypes;
    }


    /**
	 * 获取：考勤类型
	 */

    public void setKaoqinTypes(Integer kaoqinTypes) {
        this.kaoqinTypes = kaoqinTypes;
    }
    /**
	 * 设置：二级考勤类型
	 */
    public Integer getKaoqinErjiTypes() {
        return kaoqinErjiTypes;
    }


    /**
	 * 获取：二级考勤类型
	 */

    public void setKaoqinErjiTypes(Integer kaoqinErjiTypes) {
        this.kaoqinErjiTypes = kaoqinErjiTypes;
    }
    /**
	 * 设置：本次考勤得分
	 */
    public Double getKaoqinDefen() {
        return kaoqinDefen;
    }


    /**
	 * 获取：本次考勤得分
	 */

    public void setKaoqinDefen(Double kaoqinDefen) {
        this.kaoqinDefen = kaoqinDefen;
    }
    /**
	 * 设置：考勤备注
	 */
    public String getKaoqinContent() {
        return kaoqinContent;
    }


    /**
	 * 获取：考勤备注
	 */

    public void setKaoqinContent(String kaoqinContent) {
        this.kaoqinContent = kaoqinContent;
    }
    /**
	 * 设置：考勤日期
	 */
    public Date getKaoqinTime() {
        return kaoqinTime;
    }


    /**
	 * 获取：考勤日期
	 */

    public void setKaoqinTime(Date kaoqinTime) {
        this.kaoqinTime = kaoqinTime;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
