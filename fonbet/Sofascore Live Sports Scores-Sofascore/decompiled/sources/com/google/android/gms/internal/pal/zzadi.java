package com.google.android.gms.internal.pal;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzadi extends IOException {
    public static zzadh d() {
        return new zzadh("Protocol message tag had invalid wire type.");
    }

    public static zzadi g() {
        return new zzadi("Protocol message had invalid UTF-8.");
    }

    public static zzadi h() {
        return new zzadi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzadi i() {
        return new zzadi("Failed to parse the message.");
    }

    public static zzadi j() {
        return new zzadi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
