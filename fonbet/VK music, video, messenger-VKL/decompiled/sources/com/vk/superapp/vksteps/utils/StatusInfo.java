package com.vk.superapp.vksteps.utils;

import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class StatusInfo {

    @pmi0("connectionResult")
    private final ConnectionResultInfo connectionResult;

    @pmi0("hasResolution")
    private final boolean hasResolution;

    @pmi0("isCanceled")
    private final boolean isCanceled;

    @pmi0("isInterrupted")
    private final boolean isInterrupted;

    @pmi0("isSuccess")
    private final boolean isSuccess;

    @pmi0(CommonCode.MapKey.HAS_RESOLUTION)
    private final String resolution;

    @pmi0(HiAnalyticsConstant.HaKey.BI_KEY_RESULT)
    private final int statusCode;

    @pmi0("statusMessage")
    private final String statusMessage;

    public StatusInfo(int i, String str, ConnectionResultInfo connectionResultInfo, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.statusCode = i;
        this.statusMessage = str;
        this.connectionResult = connectionResultInfo;
        this.isCanceled = z;
        this.isSuccess = z2;
        this.isInterrupted = z3;
        this.hasResolution = z4;
        this.resolution = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInfo)) {
            return false;
        }
        StatusInfo statusInfo = (StatusInfo) obj;
        return this.statusCode == statusInfo.statusCode && epx.f(this.statusMessage, statusInfo.statusMessage) && epx.f(this.connectionResult, statusInfo.connectionResult) && this.isCanceled == statusInfo.isCanceled && this.isSuccess == statusInfo.isSuccess && this.isInterrupted == statusInfo.isInterrupted && this.hasResolution == statusInfo.hasResolution && epx.f(this.resolution, statusInfo.resolution);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.statusCode) * 31;
        String str = this.statusMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ConnectionResultInfo connectionResultInfo = this.connectionResult;
        return this.resolution.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (connectionResultInfo != null ? connectionResultInfo.hashCode() : 0)) * 31, 31, this.isCanceled), 31, this.isSuccess), 31, this.isInterrupted), 31, this.hasResolution);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusInfo(statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusMessage=");
        sb.append(this.statusMessage);
        sb.append(", connectionResult=");
        sb.append(this.connectionResult);
        sb.append(", isCanceled=");
        sb.append(this.isCanceled);
        sb.append(", isSuccess=");
        sb.append(this.isSuccess);
        sb.append(", isInterrupted=");
        sb.append(this.isInterrupted);
        sb.append(", hasResolution=");
        sb.append(this.hasResolution);
        sb.append(", resolution=");
        return ho8.a(sb, this.resolution, ')');
    }
}
