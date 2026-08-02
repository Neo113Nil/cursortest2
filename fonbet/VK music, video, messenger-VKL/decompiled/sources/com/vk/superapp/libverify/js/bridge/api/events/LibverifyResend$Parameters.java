package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LibverifyResend.kt */
/* loaded from: classes6.dex */
public final class LibverifyResend$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LibverifyResend$Parameters(String str) {
        this.requestId = str;
    }

    public static final LibverifyResend$Parameters a(LibverifyResend$Parameters libverifyResend$Parameters) {
        return libverifyResend$Parameters.requestId == null ? new LibverifyResend$Parameters("default_request_id") : libverifyResend$Parameters;
    }

    public static final void b(LibverifyResend$Parameters libverifyResend$Parameters) {
        if (libverifyResend$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibverifyResend$Parameters) && epx.f(this.requestId, ((LibverifyResend$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
