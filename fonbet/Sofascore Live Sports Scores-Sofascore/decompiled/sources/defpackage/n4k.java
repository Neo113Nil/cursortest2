package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n4k extends o4k {
    public final String a;
    public final String b;
    public final String c;

    public n4k(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4k)) {
            return false;
        }
        n4k n4kVar = (n4k) obj;
        return Intrinsics.c(this.a, n4kVar.a) && Intrinsics.c(this.b, n4kVar.b) && Intrinsics.c(this.c, n4kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.o(mz1.s("TwitterVideoItem(videoId=", this.a, ", thumbnailUrl=", this.b, ", videoUrl="), this.c, ")");
    }
}
