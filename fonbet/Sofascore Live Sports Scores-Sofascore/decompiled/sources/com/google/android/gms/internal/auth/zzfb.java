package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfb extends IOException {
    public static zzfb d() {
        return new zzfb("Protocol message had invalid UTF-8.");
    }

    public static zzfb g() {
        return new zzfb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfb h() {
        return new zzfb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
