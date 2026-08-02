package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Logout.kt */
/* loaded from: classes6.dex */
public final class Logout$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public Logout$Parameters(String str) {
        this.requestId = str;
    }

    public static final Logout$Parameters a(Logout$Parameters logout$Parameters) {
        return logout$Parameters.requestId == null ? new Logout$Parameters("default_request_id") : logout$Parameters;
    }

    public static final void b(Logout$Parameters logout$Parameters) {
        if (logout$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Logout$Parameters) && epx.f(this.requestId, ((Logout$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
