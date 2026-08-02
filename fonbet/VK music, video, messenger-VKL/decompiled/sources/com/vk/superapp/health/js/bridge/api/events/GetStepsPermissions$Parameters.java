package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetStepsPermissions.kt */
/* loaded from: classes6.dex */
public final class GetStepsPermissions$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_health_connect")
    private final Boolean useHealthConnect;

    public GetStepsPermissions$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.useHealthConnect = bool;
    }

    public static final GetStepsPermissions$Parameters a(GetStepsPermissions$Parameters getStepsPermissions$Parameters) {
        return getStepsPermissions$Parameters.requestId == null ? new GetStepsPermissions$Parameters("default_request_id", getStepsPermissions$Parameters.useHealthConnect) : getStepsPermissions$Parameters;
    }

    public static final void b(GetStepsPermissions$Parameters getStepsPermissions$Parameters) {
        if (getStepsPermissions$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.useHealthConnect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStepsPermissions$Parameters)) {
            return false;
        }
        GetStepsPermissions$Parameters getStepsPermissions$Parameters = (GetStepsPermissions$Parameters) obj;
        return epx.f(this.requestId, getStepsPermissions$Parameters.requestId) && epx.f(this.useHealthConnect, getStepsPermissions$Parameters.useHealthConnect);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.useHealthConnect;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", useHealthConnect=");
        return tn.a(sb, this.useHealthConnect, ')');
    }

    public /* synthetic */ GetStepsPermissions$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
