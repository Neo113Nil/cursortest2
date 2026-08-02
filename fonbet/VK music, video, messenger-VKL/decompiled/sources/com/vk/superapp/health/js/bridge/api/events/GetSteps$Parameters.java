package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetSteps.kt */
/* loaded from: classes6.dex */
public final class GetSteps$Parameters implements ad6 {

    @pmi0("date")
    private final String date;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_health_connect")
    private final Boolean useHealthConnect;

    public GetSteps$Parameters(String str, String str2, Boolean bool) {
        this.requestId = str;
        this.date = str2;
        this.useHealthConnect = bool;
    }

    public static final GetSteps$Parameters a(GetSteps$Parameters getSteps$Parameters) {
        return getSteps$Parameters.requestId == null ? new GetSteps$Parameters("default_request_id", getSteps$Parameters.date, getSteps$Parameters.useHealthConnect) : getSteps$Parameters;
    }

    public static final void b(GetSteps$Parameters getSteps$Parameters) {
        if (getSteps$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.date;
    }

    public final Boolean d() {
        return this.useHealthConnect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSteps$Parameters)) {
            return false;
        }
        GetSteps$Parameters getSteps$Parameters = (GetSteps$Parameters) obj;
        return epx.f(this.requestId, getSteps$Parameters.requestId) && epx.f(this.date, getSteps$Parameters.date) && epx.f(this.useHealthConnect, getSteps$Parameters.useHealthConnect);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.date;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.useHealthConnect;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", useHealthConnect=");
        return tn.a(sb, this.useHealthConnect, ')');
    }

    public /* synthetic */ GetSteps$Parameters(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
