package com.vk.superapp.vksteps.utils;

import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DataPointInfo {

    @pmi0("dataSource")
    private final DataSourceInfo dataSource;

    @pmi0("data_type")
    private final DataTypeInfo dataType;

    @pmi0("local_time_end")
    private final String endLocalTime;

    @pmi0("end_time")
    private final long endTime;

    @pmi0("originalDataSource")
    private final DataSourceInfo originalDataSource;

    @pmi0("local_time_start")
    private final String startLocalTime;

    @pmi0("start_time")
    private final long startTime;

    @pmi0("values")
    private final List<FieldInfo> values;

    public DataPointInfo(DataTypeInfo dataTypeInfo, DataSourceInfo dataSourceInfo, DataSourceInfo dataSourceInfo2, List<FieldInfo> list, long j, long j2, String str, String str2) {
        this.dataType = dataTypeInfo;
        this.dataSource = dataSourceInfo;
        this.originalDataSource = dataSourceInfo2;
        this.values = list;
        this.startTime = j;
        this.endTime = j2;
        this.startLocalTime = str;
        this.endLocalTime = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointInfo)) {
            return false;
        }
        DataPointInfo dataPointInfo = (DataPointInfo) obj;
        return epx.f(this.dataType, dataPointInfo.dataType) && epx.f(this.dataSource, dataPointInfo.dataSource) && epx.f(this.originalDataSource, dataPointInfo.originalDataSource) && epx.f(this.values, dataPointInfo.values) && this.startTime == dataPointInfo.startTime && this.endTime == dataPointInfo.endTime && epx.f(this.startLocalTime, dataPointInfo.startLocalTime) && epx.f(this.endLocalTime, dataPointInfo.endLocalTime);
    }

    public final int hashCode() {
        return this.endLocalTime.hashCode() + urd0.a(bh10.a(bh10.a(fw3.a((this.originalDataSource.hashCode() + ((this.dataSource.hashCode() + (this.dataType.hashCode() * 31)) * 31)) * 31, 31, this.values), 31, this.startTime), 31, this.endTime), 31, this.startLocalTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointInfo(dataType=");
        sb.append(this.dataType);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", originalDataSource=");
        sb.append(this.originalDataSource);
        sb.append(", values=");
        sb.append(this.values);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", startLocalTime=");
        sb.append(this.startLocalTime);
        sb.append(", endLocalTime=");
        return ho8.a(sb, this.endLocalTime, ')');
    }
}
