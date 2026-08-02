package com.vk.superapp.vksteps.utils;

import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DataSetInfo {

    @pmi0("dataPoints")
    private final List<DataPointInfo> dataPoints;

    @pmi0("dataSource")
    private final DataSourceInfo dataSource;

    @pmi0("dataType")
    private final String dataType;

    @pmi0("isEmpty")
    private final boolean isEmpty;

    public DataSetInfo(List<DataPointInfo> list, String str, DataSourceInfo dataSourceInfo, boolean z) {
        this.dataPoints = list;
        this.dataType = str;
        this.dataSource = dataSourceInfo;
        this.isEmpty = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataSetInfo)) {
            return false;
        }
        DataSetInfo dataSetInfo = (DataSetInfo) obj;
        return epx.f(this.dataPoints, dataSetInfo.dataPoints) && epx.f(this.dataType, dataSetInfo.dataType) && epx.f(this.dataSource, dataSetInfo.dataSource) && this.isEmpty == dataSetInfo.isEmpty;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isEmpty) + ((this.dataSource.hashCode() + urd0.a(this.dataPoints.hashCode() * 31, 31, this.dataType)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSetInfo(dataPoints=");
        sb.append(this.dataPoints);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", isEmpty=");
        return q0.a(sb, this.isEmpty, ')');
    }
}
