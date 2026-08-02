package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xel {
    public static final joa i;
    public final wn1 a;
    public final r9k b;
    public final r9k c;
    public final String d;
    public final r9k e;
    public final boolean f;
    public final boolean g;
    public final and h;

    static {
        g0l g0lVar = new g0l(24);
        ysa ysaVar = ysa.c;
        i = ypa.a(ysaVar, g0lVar);
        ypa.a(ysaVar, new g0l(25));
        ypa.a(ysaVar, new g0l(26));
        ypa.a(ysaVar, new g0l(27));
        ypa.a(ysaVar, new g0l(28));
        ypa.a(ysaVar, new g0l(29));
        ypa.a(ysaVar, new wel(0));
    }

    public xel(wn1 wn1Var, r9k r9kVar, r9k r9kVar2, String str, r9k r9kVar3, boolean z, boolean z2, and andVar) {
        wn1Var.getClass();
        this.a = wn1Var;
        this.b = r9kVar;
        this.c = r9kVar2;
        this.d = str;
        this.e = r9kVar3;
        this.f = z;
        this.g = z2;
        this.h = andVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xel)) {
            return false;
        }
        xel xelVar = (xel) obj;
        return Intrinsics.c(this.a, xelVar.a) && this.b.equals(xelVar.b) && this.c.equals(xelVar.c) && this.d.equals(xelVar.d) && Intrinsics.c(this.e, xelVar.e) && this.f == xelVar.f && this.g == xelVar.g && Intrinsics.c(this.h, xelVar.h);
    }

    public final int hashCode() {
        int c = dmi.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        r9k r9kVar = this.e;
        int e = dmi.e(dmi.e((c + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31, this.f), 31, this.g);
        and andVar = this.h;
        return e + (andVar != null ? andVar.hashCode() : 0);
    }

    public final String toString() {
        return "WorldCupHighlightedEventWrapper(event=" + this.a + ", groupName=" + this.b + ", roundName=" + this.c + ", location=" + this.d + ", headerDate=" + this.e + ", thirdPlaceMatch=" + this.f + ", finalMatch=" + this.g + ", oddsWithProvider=" + this.h + ")";
    }
}
