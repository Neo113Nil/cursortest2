package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenMultiaccountSwitcher.kt */
/* loaded from: classes6.dex */
public final class OpenMultiaccountSwitcher$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenMultiaccountSwitcher$Parameters(String str) {
        this.requestId = str;
    }

    public static final OpenMultiaccountSwitcher$Parameters a(OpenMultiaccountSwitcher$Parameters openMultiaccountSwitcher$Parameters) {
        return openMultiaccountSwitcher$Parameters.requestId == null ? new OpenMultiaccountSwitcher$Parameters("default_request_id") : openMultiaccountSwitcher$Parameters;
    }

    public static final void b(OpenMultiaccountSwitcher$Parameters openMultiaccountSwitcher$Parameters) {
        if (openMultiaccountSwitcher$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenMultiaccountSwitcher$Parameters) && epx.f(this.requestId, ((OpenMultiaccountSwitcher$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
