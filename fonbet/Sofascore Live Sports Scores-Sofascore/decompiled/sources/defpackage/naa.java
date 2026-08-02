package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class naa extends IOException {
    public boolean a;

    public static naa d() {
        return new naa("Protocol message had invalid UTF-8.");
    }

    public static laa g() {
        return new laa("Protocol message tag had invalid wire type.");
    }

    public static naa h() {
        return new naa("CodedInputStream encountered a malformed varint.");
    }

    public static naa i() {
        return new naa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static naa j() {
        return new naa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
