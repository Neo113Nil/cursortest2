package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetWorkouts.kt */
/* loaded from: classes6.dex */
public final class GetWorkouts$Parameters implements ad6 {

    @pmi0("need_resync")
    private final Boolean needResync;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("use_health_connect")
    private final Boolean useHealthConnect;

    public GetWorkouts$Parameters(String str, Boolean bool, Boolean bool2) {
        this.requestId = str;
        this.needResync = bool;
        this.useHealthConnect = bool2;
    }

    public static final GetWorkouts$Parameters a(GetWorkouts$Parameters getWorkouts$Parameters) {
        return getWorkouts$Parameters.requestId == null ? new GetWorkouts$Parameters("default_request_id", getWorkouts$Parameters.needResync, getWorkouts$Parameters.useHealthConnect) : getWorkouts$Parameters;
    }

    public static final void b(GetWorkouts$Parameters getWorkouts$Parameters) {
        if (getWorkouts$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.needResync;
    }

    public final Boolean d() {
        return this.useHealthConnect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetWorkouts$Parameters)) {
            return false;
        }
        GetWorkouts$Parameters getWorkouts$Parameters = (GetWorkouts$Parameters) obj;
        return epx.f(this.requestId, getWorkouts$Parameters.requestId) && epx.f(this.needResync, getWorkouts$Parameters.needResync) && epx.f(this.useHealthConnect, getWorkouts$Parameters.useHealthConnect);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.needResync;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useHealthConnect;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", needResync=");
        sb.append(this.needResync);
        sb.append(", useHealthConnect=");
        return tn.a(sb, this.useHealthConnect, ')');
    }

    public /* synthetic */ GetWorkouts$Parameters(String str, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
