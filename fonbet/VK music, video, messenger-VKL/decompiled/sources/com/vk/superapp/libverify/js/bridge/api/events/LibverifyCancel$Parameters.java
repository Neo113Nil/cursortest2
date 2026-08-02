package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LibverifyCancel.kt */
/* loaded from: classes6.dex */
public final class LibverifyCancel$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LibverifyCancel$Parameters(String str) {
        this.requestId = str;
    }

    public static final LibverifyCancel$Parameters a(LibverifyCancel$Parameters libverifyCancel$Parameters) {
        return libverifyCancel$Parameters.requestId == null ? new LibverifyCancel$Parameters("default_request_id") : libverifyCancel$Parameters;
    }

    public static final void b(LibverifyCancel$Parameters libverifyCancel$Parameters) {
        if (libverifyCancel$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LibverifyCancel$Parameters) && epx.f(this.requestId, ((LibverifyCancel$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
