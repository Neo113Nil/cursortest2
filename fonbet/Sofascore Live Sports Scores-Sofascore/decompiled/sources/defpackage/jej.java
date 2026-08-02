package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jej {
    public final sf8 a;
    public final kx4 b;
    public final ema c;
    public final sx2 d;

    public jej(sf8 sf8Var, kx4 kx4Var, ema emaVar, int i) {
        sx2 sx2Var;
        this.a = sf8Var;
        this.b = kx4Var;
        this.c = emaVar;
        if (i > 0) {
            sx2Var = new sx2();
            sx2Var.a = i != 1 ? new zmb(i) : null;
        } else {
            sx2Var = null;
        }
        this.d = sx2Var;
    }

    public static aej a(jej jejVar, String str, dfj dfjVar, int i) {
        int i2 = (i & 16) != 0 ? Integer.MAX_VALUE : 1;
        long b = cn3.b(0, 0, 0, 0, 15);
        ema emaVar = jejVar.c;
        kx4 kx4Var = jejVar.b;
        sf8 sf8Var = jejVar.a;
        jejVar.getClass();
        return b(jejVar, new q80(str), dfjVar, true, i2, null, b, emaVar, kx4Var, sf8Var, 32);
    }

    public static aej b(jej jejVar, q80 q80Var, dfj dfjVar, boolean z, int i, List list, long j, ema emaVar, kx4 kx4Var, sf8 sf8Var, int i2) {
        aej aejVar;
        List list2 = (i2 & 32) != 0 ? km5.a : list;
        sf8 sf8Var2 = (i2 & 512) != 0 ? jejVar.a : sf8Var;
        sx2 sx2Var = jejVar.d;
        List list3 = list2;
        sf8 sf8Var3 = sf8Var2;
        zdj zdjVar = new zdj(q80Var, dfjVar, list3, i, z, 1, kx4Var, emaVar, sf8Var3, j);
        aej aejVar2 = null;
        if (sx2Var != null) {
            hf2 hf2Var = new hf2(zdjVar);
            zmb zmbVar = (zmb) sx2Var.a;
            if (zmbVar != null) {
                aejVar = (aej) zmbVar.c(hf2Var);
            } else if (Intrinsics.c((hf2) sx2Var.b, hf2Var)) {
                aejVar = (aej) sx2Var.c;
            }
            if (aejVar != null && !aejVar.b.a.a()) {
                aejVar2 = aejVar;
            }
        }
        if (aejVar2 != null) {
            return new aej(zdjVar, aejVar2.b, cn3.d(j, (((int) Math.ceil(r1.d)) << 32) | (((int) Math.ceil(r1.e)) & 4294967295L)));
        }
        p03 p03Var = new p03(q80Var, g7a.C(dfjVar, emaVar), list3, kx4Var, sf8Var3);
        int j2 = an3.j(j);
        int h = (z && an3.d(j)) ? an3.h(j) : Integer.MAX_VALUE;
        if (j2 != h) {
            h = llf.c((int) Math.ceil(p03Var.c()), j2, h);
        }
        aej aejVar3 = new aej(zdjVar, new eyc(p03Var, pco.E(0, h, 0, an3.g(j)), i, 1), cn3.d(j, (((int) Math.ceil(r13.d)) << 32) | (((int) Math.ceil(r13.e)) & 4294967295L)));
        if (sx2Var != null) {
            zmb zmbVar2 = (zmb) sx2Var.a;
            if (zmbVar2 != null) {
                zmbVar2.d(new hf2(zdjVar), aejVar3);
                return aejVar3;
            }
            sx2Var.b = new hf2(zdjVar);
            sx2Var.c = aejVar3;
        }
        return aejVar3;
    }
}
