package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: Init.kt */
/* loaded from: classes6.dex */
public final class Init$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("supports_transparent_status")
    private final Boolean supportsTransparentStatus;

    public Init$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.supportsTransparentStatus = bool;
    }

    public static final Init$Parameters a(Init$Parameters init$Parameters) {
        return init$Parameters.requestId == null ? new Init$Parameters("default_request_id", init$Parameters.supportsTransparentStatus) : init$Parameters;
    }

    public static final void b(Init$Parameters init$Parameters) {
        if (init$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.supportsTransparentStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Init$Parameters)) {
            return false;
        }
        Init$Parameters init$Parameters = (Init$Parameters) obj;
        return epx.f(this.requestId, init$Parameters.requestId) && epx.f(this.supportsTransparentStatus, init$Parameters.supportsTransparentStatus);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.supportsTransparentStatus;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", supportsTransparentStatus=");
        return tn.a(sb, this.supportsTransparentStatus, ')');
    }

    public /* synthetic */ Init$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
