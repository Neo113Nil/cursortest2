package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LibverifySupported.kt */
/* loaded from: classes6.dex */
public final class LibverifySupported$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LibverifySupported$Parameters(String str) {
        this.requestId = str;
    }

    public static final LibverifySupported$Parameters a(LibverifySupported$Parameters libverifySupported$Parameters) {
        return libverifySupported$Parameters.requestId == null ? new LibverifySupported$Parameters("default_request_id") : libverifySupported$Parameters;
    }

    public static final void b(LibverifySupported$Parameters libverifySupported$Parameters) {
        if (libverifySupported$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibverifySupported$Parameters) && epx.f(this.requestId, ((LibverifySupported$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
