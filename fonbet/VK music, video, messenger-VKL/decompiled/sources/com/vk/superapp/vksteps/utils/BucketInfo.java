package com.vk.superapp.vksteps.utils;

import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class BucketInfo {

    @pmi0("activity")
    private final String activity;

    @pmi0("bucketType")
    private final int bucketType;

    @pmi0("data_sets")
    private final List<DataSetInfo> dataSets;

    @pmi0("local_time_end")
    private final String endLocalTime;

    @pmi0("end_time")
    private final long endTime;

    @pmi0("session")
    private final SessionInfo session;

    @pmi0("local_time_start")
    private final String startLocalTime;

    @pmi0("start_time")
    private final long startTime;

    public BucketInfo(String str, long j, long j2, List<DataSetInfo> list, SessionInfo sessionInfo, int i, String str2, String str3) {
        this.activity = str;
        this.startTime = j;
        this.endTime = j2;
        this.dataSets = list;
        this.session = sessionInfo;
        this.bucketType = i;
        this.startLocalTime = str2;
        this.endLocalTime = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BucketInfo)) {
            return false;
        }
        BucketInfo bucketInfo = (BucketInfo) obj;
        return epx.f(this.activity, bucketInfo.activity) && this.startTime == bucketInfo.startTime && this.endTime == bucketInfo.endTime && epx.f(this.dataSets, bucketInfo.dataSets) && epx.f(this.session, bucketInfo.session) && this.bucketType == bucketInfo.bucketType && epx.f(this.startLocalTime, bucketInfo.startLocalTime) && epx.f(this.endLocalTime, bucketInfo.endLocalTime);
    }

    public final int hashCode() {
        return this.endLocalTime.hashCode() + urd0.a(shy.a(this.bucketType, (this.session.hashCode() + fw3.a(bh10.a(bh10.a(this.activity.hashCode() * 31, 31, this.startTime), 31, this.endTime), 31, this.dataSets)) * 31, 31), 31, this.startLocalTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BucketInfo(activity=");
        sb.append(this.activity);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", dataSets=");
        sb.append(this.dataSets);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", bucketType=");
        sb.append(this.bucketType);
        sb.append(", startLocalTime=");
        sb.append(this.startLocalTime);
        sb.append(", endLocalTime=");
        return ho8.a(sb, this.endLocalTime, ')');
    }
}
