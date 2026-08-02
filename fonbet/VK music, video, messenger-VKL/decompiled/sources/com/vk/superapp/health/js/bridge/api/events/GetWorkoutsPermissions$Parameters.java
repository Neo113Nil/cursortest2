package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetWorkoutsPermissions.kt */
/* loaded from: classes6.dex */
public final class GetWorkoutsPermissions$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_health_connect")
    private final Boolean useHealthConnect;

    public GetWorkoutsPermissions$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.useHealthConnect = bool;
    }

    public static final GetWorkoutsPermissions$Parameters a(GetWorkoutsPermissions$Parameters getWorkoutsPermissions$Parameters) {
        return getWorkoutsPermissions$Parameters.requestId == null ? new GetWorkoutsPermissions$Parameters("default_request_id", getWorkoutsPermissions$Parameters.useHealthConnect) : getWorkoutsPermissions$Parameters;
    }

    public static final void b(GetWorkoutsPermissions$Parameters getWorkoutsPermissions$Parameters) {
        if (getWorkoutsPermissions$Parameters.requestId == null) {
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
        if (!(obj instanceof GetWorkoutsPermissions$Parameters)) {
            return false;
        }
        GetWorkoutsPermissions$Parameters getWorkoutsPermissions$Parameters = (GetWorkoutsPermissions$Parameters) obj;
        return epx.f(this.requestId, getWorkoutsPermissions$Parameters.requestId) && epx.f(this.useHealthConnect, getWorkoutsPermissions$Parameters.useHealthConnect);
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

    public /* synthetic */ GetWorkoutsPermissions$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
