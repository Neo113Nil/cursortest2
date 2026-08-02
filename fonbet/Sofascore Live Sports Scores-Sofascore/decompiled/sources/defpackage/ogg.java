package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ogg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ogg(String str, String str2, String str3, String str4) {
        w1l.y(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogg)) {
            return false;
        }
        ogg oggVar = (ogg) obj;
        return Intrinsics.c(this.a, oggVar.a) && Intrinsics.c(this.b, oggVar.b) && Intrinsics.c(this.c, oggVar.c) && Intrinsics.c(this.d, oggVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return fc6.o(mz1.s("MediationParameters(sdkName=", this.a, ", sdkVersion=", this.b, ", adapterVersion="), this.c, ", adapterClassname=", this.d, ")");
    }
}
