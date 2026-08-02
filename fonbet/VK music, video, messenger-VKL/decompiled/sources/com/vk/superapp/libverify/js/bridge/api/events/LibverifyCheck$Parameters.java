package com.vk.superapp.libverify.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: LibverifyCheck.kt */
/* loaded from: classes6.dex */
public final class LibverifyCheck$Parameters implements ad6 {

    @pmi0("otp")
    private final String otp;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public LibverifyCheck$Parameters(String str, String str2) {
        this.requestId = str;
        this.otp = str2;
    }

    public static final LibverifyCheck$Parameters a(LibverifyCheck$Parameters libverifyCheck$Parameters) {
        return libverifyCheck$Parameters.requestId == null ? new LibverifyCheck$Parameters("default_request_id", libverifyCheck$Parameters.otp) : libverifyCheck$Parameters;
    }

    public static final void b(LibverifyCheck$Parameters libverifyCheck$Parameters) {
        if (libverifyCheck$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
        if (libverifyCheck$Parameters.otp == null) {
            throw new IllegalArgumentException("Value of non-nullable member otp cannot be\n                        null");
        }
    }

    public final String c() {
        return this.otp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibverifyCheck$Parameters)) {
            return false;
        }
        LibverifyCheck$Parameters libverifyCheck$Parameters = (LibverifyCheck$Parameters) obj;
        return epx.f(this.requestId, libverifyCheck$Parameters.requestId) && epx.f(this.otp, libverifyCheck$Parameters.otp);
    }

    public final int hashCode() {
        return this.otp.hashCode() + (this.requestId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", otp=");
        return ho8.a(sb, this.otp, ')');
    }
}
