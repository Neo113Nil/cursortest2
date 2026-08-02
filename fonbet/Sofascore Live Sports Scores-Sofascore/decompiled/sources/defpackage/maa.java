package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class maa extends IOException {
    public boolean a;

    public static maa d() {
        return new maa("Protocol message had invalid UTF-8.");
    }

    public static kaa g() {
        return new kaa("Protocol message tag had invalid wire type.");
    }

    public static maa h() {
        return new maa("CodedInputStream encountered a malformed varint.");
    }

    public static maa i() {
        return new maa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static maa j() {
        return new maa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
