package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GetStepStats.kt */
/* loaded from: classes6.dex */
public final class GetStepStats$Parameters implements ad6 {

    @pmi0("format")
    private final String format;

    @pmi0("from_date")
    private final String fromDate;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("to_date")
    private final String toDate;

    public GetStepStats$Parameters(String str, String str2, String str3, String str4) {
        this.fromDate = str;
        this.toDate = str2;
        this.format = str3;
        this.requestId = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStepStats$Parameters)) {
            return false;
        }
        GetStepStats$Parameters getStepStats$Parameters = (GetStepStats$Parameters) obj;
        return epx.f(this.fromDate, getStepStats$Parameters.fromDate) && epx.f(this.toDate, getStepStats$Parameters.toDate) && epx.f(this.format, getStepStats$Parameters.format) && epx.f(this.requestId, getStepStats$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + urd0.a(urd0.a(this.fromDate.hashCode() * 31, 31, this.toDate), 31, this.format);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(fromDate=");
        sb.append(this.fromDate);
        sb.append(", toDate=");
        sb.append(this.toDate);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
