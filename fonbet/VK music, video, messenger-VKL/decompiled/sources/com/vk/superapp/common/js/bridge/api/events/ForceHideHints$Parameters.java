package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ForceHideHints.kt */
/* loaded from: classes6.dex */
public final class ForceHideHints$Parameters implements ad6 {

    @pmi0("hints")
    private final List<String> hints;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public ForceHideHints$Parameters(String str, List<String> list) {
        this.requestId = str;
        this.hints = list;
    }

    public static final ForceHideHints$Parameters a(ForceHideHints$Parameters forceHideHints$Parameters) {
        return forceHideHints$Parameters.requestId == null ? new ForceHideHints$Parameters("default_request_id", forceHideHints$Parameters.hints) : forceHideHints$Parameters;
    }

    public static final void b(ForceHideHints$Parameters forceHideHints$Parameters) {
        if (forceHideHints$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (forceHideHints$Parameters.hints == null) {
            throw new IllegalArgumentException("Value of non-nullable member hints cannot be\n                        null");
        }
    }

    public final List<String> c() {
        return this.hints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceHideHints$Parameters)) {
            return false;
        }
        ForceHideHints$Parameters forceHideHints$Parameters = (ForceHideHints$Parameters) obj;
        return epx.f(this.requestId, forceHideHints$Parameters.requestId) && epx.f(this.hints, forceHideHints$Parameters.hints);
    }

    public final int hashCode() {
        return this.hints.hashCode() + (this.requestId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", hints=");
        return ms9.a(')', sb, this.hints);
    }
}
