package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f9g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public f9g(String str, String str2, String str3, String str4, String str5, String str6) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9g)) {
            return false;
        }
        f9g f9gVar = (f9g) obj;
        return Intrinsics.c(this.a, f9gVar.a) && Intrinsics.c(this.b, f9gVar.b) && Intrinsics.c(this.c, f9gVar.c) && this.d.equals(f9gVar.d) && this.e.equals(f9gVar.e) && this.f.equals(f9gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dmi.c(dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = mz1.s("RssUIModel(id=", this.a, ", title=", this.b, ", description=");
        bf3.v(s, this.c, ", imageUrl=", this.d, ", articleUrl=");
        return fc6.o(s, this.e, ", date=", this.f, ")");
    }
}
