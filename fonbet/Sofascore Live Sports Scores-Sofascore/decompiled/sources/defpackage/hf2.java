package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hf2 {
    public final zdj a;

    public hf2(zdj zdjVar) {
        this.a = zdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2)) {
            return false;
        }
        zdj zdjVar = this.a;
        q80 q80Var = zdjVar.a;
        zdj zdjVar2 = ((hf2) obj).a;
        return Intrinsics.c(q80Var, zdjVar2.a) && zdjVar.b.d(zdjVar2.b) && Intrinsics.c(zdjVar.c, zdjVar2.c) && zdjVar.d == zdjVar2.d && zdjVar.e == zdjVar2.e && zdjVar.f == zdjVar2.f && Intrinsics.c(zdjVar.g, zdjVar2.g) && zdjVar.h == zdjVar2.h && zdjVar.i == zdjVar2.i && an3.b(zdjVar.j, zdjVar2.j);
    }

    public final int hashCode() {
        zdj zdjVar = this.a;
        int hashCode = zdjVar.a.hashCode() * 31;
        dfj dfjVar = zdjVar.b;
        pwh pwhVar = dfjVar.a;
        long j = pwhVar.b;
        mfj[] mfjVarArr = lfj.b;
        int hashCode2 = Long.hashCode(j) * 31;
        wg8 wg8Var = pwhVar.c;
        int i = (hashCode2 + (wg8Var != null ? wg8Var.a : 0)) * 31;
        rg8 rg8Var = pwhVar.d;
        int hashCode3 = (i + (rg8Var != null ? Integer.hashCode(rg8Var.a) : 0)) * 31;
        sg8 sg8Var = pwhVar.e;
        int hashCode4 = (hashCode3 + (sg8Var != null ? Integer.hashCode(sg8Var.a) : 0)) * 31;
        tf8 tf8Var = pwhVar.f;
        int hashCode5 = (hashCode4 + (tf8Var != null ? tf8Var.hashCode() : 0)) * 31;
        String str = pwhVar.g;
        int c = ljg.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, pwhVar.h);
        sn1 sn1Var = pwhVar.i;
        int hashCode6 = (c + (sn1Var != null ? Float.hashCode(sn1Var.a) : 0)) * 31;
        zcj zcjVar = pwhVar.j;
        int hashCode7 = (hashCode6 + (zcjVar != null ? zcjVar.hashCode() : 0)) * 31;
        eib eibVar = pwhVar.k;
        int hashCode8 = (hashCode7 + (eibVar != null ? eibVar.a.hashCode() : 0)) * 31;
        long j2 = pwhVar.l;
        int i2 = r13.j;
        d8k d8kVar = e8k.b;
        int c2 = ljg.c(hashCode8, 31, j2);
        mje mjeVar = pwhVar.o;
        int hashCode9 = (dfjVar.b.hashCode() + ((c2 + (mjeVar != null ? mjeVar.hashCode() : 0)) * 31)) * 31;
        tje tjeVar = dfjVar.c;
        return Long.hashCode(zdjVar.j) + ((zdjVar.i.hashCode() + ((zdjVar.h.hashCode() + ((zdjVar.g.hashCode() + wv8.a(zdjVar.f, dmi.e((dmi.d((hashCode9 + (tjeVar != null ? tjeVar.hashCode() : 0) + hashCode) * 31, 31, zdjVar.c) + zdjVar.d) * 31, 31, zdjVar.e), 31)) * 31)) * 31)) * 31);
    }
}
