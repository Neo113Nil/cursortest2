package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenDebugSettings.kt */
/* loaded from: classes6.dex */
public final class OpenDebugSettings$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenDebugSettings$Parameters(String str) {
        this.requestId = str;
    }

    public static final OpenDebugSettings$Parameters a(OpenDebugSettings$Parameters openDebugSettings$Parameters) {
        return openDebugSettings$Parameters.requestId == null ? new OpenDebugSettings$Parameters("default_request_id") : openDebugSettings$Parameters;
    }

    public static final void b(OpenDebugSettings$Parameters openDebugSettings$Parameters) {
        if (openDebugSettings$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenDebugSettings$Parameters) && epx.f(this.requestId, ((OpenDebugSettings$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
