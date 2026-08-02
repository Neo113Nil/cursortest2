package com.vk.superapp.vksteps.utils;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class DataReadResponseInfo {

    @pmi0("buckets")
    private final List<BucketInfo> buckets;

    @pmi0("dataSets")
    private final List<DataSetInfo> dataSets;

    @pmi0("status")
    private final StatusInfo status;

    public DataReadResponseInfo(List<DataSetInfo> list, List<BucketInfo> list2, StatusInfo statusInfo) {
        this.dataSets = list;
        this.buckets = list2;
        this.status = statusInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataReadResponseInfo)) {
            return false;
        }
        DataReadResponseInfo dataReadResponseInfo = (DataReadResponseInfo) obj;
        return epx.f(this.dataSets, dataReadResponseInfo.dataSets) && epx.f(this.buckets, dataReadResponseInfo.buckets) && epx.f(this.status, dataReadResponseInfo.status);
    }

    public final int hashCode() {
        return this.status.hashCode() + fw3.a(this.dataSets.hashCode() * 31, 31, this.buckets);
    }

    public final String toString() {
        return "DataReadResponseInfo(dataSets=" + this.dataSets + ", buckets=" + this.buckets + ", status=" + this.status + ')';
    }
}
