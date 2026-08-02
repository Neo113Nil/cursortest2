package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cch {
    public final n7g a;
    public final n7g b;
    public final n7g c;
    public final n7g d;
    public final n7g e;
    public final n7g f;
    public final n7g g;
    public final n7g h;

    public cch(n7g n7gVar, n7g n7gVar2, n7g n7gVar3, n7g n7gVar4, n7g n7gVar5) {
        n7g n7gVar6 = cbh.e;
        n7g n7gVar7 = cbh.g;
        n7g n7gVar8 = cbh.h;
        this.a = n7gVar;
        this.b = n7gVar2;
        this.c = n7gVar3;
        this.d = n7gVar4;
        this.e = n7gVar5;
        this.f = n7gVar6;
        this.g = n7gVar7;
        this.h = n7gVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cch)) {
            return false;
        }
        cch cchVar = (cch) obj;
        return Intrinsics.c(this.a, cchVar.a) && Intrinsics.c(this.b, cchVar.b) && Intrinsics.c(this.c, cchVar.c) && Intrinsics.c(this.d, cchVar.d) && Intrinsics.c(this.e, cchVar.e) && Intrinsics.c(this.f, cchVar.f) && Intrinsics.c(this.g, cchVar.g) && Intrinsics.c(this.h, cchVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
