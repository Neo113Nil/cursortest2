package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gmh {
    public final efi a;
    public final lj2 b;

    public gmh(efi efiVar, lj2 lj2Var) {
        this.a = efiVar;
        this.b = lj2Var;
    }

    public final void a() {
        lj2 lj2Var = this.b;
        if (lj2Var.r() instanceof oed) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(kmh.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gmh.class == obj.getClass()) {
            gmh gmhVar = (gmh) obj;
            return Intrinsics.c(this.a, gmhVar.a) && this.b == gmhVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
