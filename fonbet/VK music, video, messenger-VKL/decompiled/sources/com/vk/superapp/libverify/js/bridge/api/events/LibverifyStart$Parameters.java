package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LibverifyStart.kt */
/* loaded from: classes6.dex */
public final class LibverifyStart$Parameters implements ad6 {

    @pmi0("auth_key")
    private final String authKey;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LibverifyStart$Parameters(String str, String str2) {
        this.requestId = str;
        this.authKey = str2;
    }

    public static final LibverifyStart$Parameters a(LibverifyStart$Parameters libverifyStart$Parameters) {
        return libverifyStart$Parameters.requestId == null ? new LibverifyStart$Parameters("default_request_id", libverifyStart$Parameters.authKey) : libverifyStart$Parameters;
    }

    public static final void b(LibverifyStart$Parameters libverifyStart$Parameters) {
        if (libverifyStart$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (libverifyStart$Parameters.authKey == null) {
            throw new IllegalArgumentException("Value of non-nullable member authKey cannot be\n                        null");
        }
    }

    public final String c() {
        return this.authKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibverifyStart$Parameters)) {
            return false;
        }
        LibverifyStart$Parameters libverifyStart$Parameters = (LibverifyStart$Parameters) obj;
        return epx.f(this.requestId, libverifyStart$Parameters.requestId) && epx.f(this.authKey, libverifyStart$Parameters.authKey);
    }

    public final int hashCode() {
        return this.authKey.hashCode() + (this.requestId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", authKey=");
        return ho8.a(sb, this.authKey, ')');
    }
}
