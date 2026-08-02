package com.vk.superapp.vksteps.utils;

import com.huawei.hms.adapter.internal.CommonCode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class ConnectionResultInfo {

    @pmi0("errorCode")
    private final int errorCode;

    @pmi0("errorMessage")
    private final String errorMessage;

    @pmi0("hasResolution")
    private final boolean hasResolution;

    @pmi0("isSuccess")
    private final boolean isSuccess;

    @pmi0(CommonCode.MapKey.HAS_RESOLUTION)
    private final String resolution;

    public ConnectionResultInfo(int i, boolean z, String str, boolean z2, String str2) {
        this.errorCode = i;
        this.isSuccess = z;
        this.errorMessage = str;
        this.hasResolution = z2;
        this.resolution = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionResultInfo)) {
            return false;
        }
        ConnectionResultInfo connectionResultInfo = (ConnectionResultInfo) obj;
        return this.errorCode == connectionResultInfo.errorCode && this.isSuccess == connectionResultInfo.isSuccess && epx.f(this.errorMessage, connectionResultInfo.errorMessage) && this.hasResolution == connectionResultInfo.hasResolution && epx.f(this.resolution, connectionResultInfo.resolution);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.errorCode) * 31, 31, this.isSuccess);
        String str = this.errorMessage;
        int b2 = qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasResolution);
        String str2 = this.resolution;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionResultInfo(errorCode=");
        sb.append(this.errorCode);
        sb.append(", isSuccess=");
        sb.append(this.isSuccess);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", hasResolution=");
        sb.append(this.hasResolution);
        sb.append(", resolution=");
        return ho8.a(sb, this.resolution, ')');
    }
}
