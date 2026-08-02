package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: AskWorkoutsPermissions.kt */
/* loaded from: classes6.dex */
public final class AskWorkoutsPermissions$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_health_connect")
    private final Boolean useHealthConnect;

    public AskWorkoutsPermissions$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.useHealthConnect = bool;
    }

    public static final AskWorkoutsPermissions$Parameters a(AskWorkoutsPermissions$Parameters askWorkoutsPermissions$Parameters) {
        return askWorkoutsPermissions$Parameters.requestId == null ? new AskWorkoutsPermissions$Parameters("default_request_id", askWorkoutsPermissions$Parameters.useHealthConnect) : askWorkoutsPermissions$Parameters;
    }

    public static final void b(AskWorkoutsPermissions$Parameters askWorkoutsPermissions$Parameters) {
        if (askWorkoutsPermissions$Parameters.requestId == null) {
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
        if (!(obj instanceof AskWorkoutsPermissions$Parameters)) {
            return false;
        }
        AskWorkoutsPermissions$Parameters askWorkoutsPermissions$Parameters = (AskWorkoutsPermissions$Parameters) obj;
        return epx.f(this.requestId, askWorkoutsPermissions$Parameters.requestId) && epx.f(this.useHealthConnect, askWorkoutsPermissions$Parameters.useHealthConnect);
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

    public /* synthetic */ AskWorkoutsPermissions$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
