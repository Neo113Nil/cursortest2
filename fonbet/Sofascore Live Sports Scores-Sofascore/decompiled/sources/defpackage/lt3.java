package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lt3 implements k1c {
    public final /* synthetic */ q5b a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ wcj c;
    public final /* synthetic */ nnd d;
    public final /* synthetic */ kx4 e;
    public final /* synthetic */ int f;

    public lt3(q5b q5bVar, Function1 function1, wcj wcjVar, nnd nndVar, kx4 kx4Var, int i) {
        this.a = q5bVar;
        this.b = function1;
        this.c = wcjVar;
        this.d = nndVar;
        this.e = kx4Var;
        this.f = i;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        q5b q5bVar = this.a;
        q5bVar.a.a(l9aVar.getLayoutDirection());
        p03 p03Var = (p03) q5bVar.a.g;
        if (p03Var != null) {
            return ufa.l(p03Var.c());
        }
        a70.r("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f8  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [dma] */
    @Override // defpackage.k1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c d(m1c m1cVar, List list, long j) {
        long j2;
        aej aejVar;
        l1c l1cVar;
        aej aejVar2;
        q5b q5bVar;
        bej bejVar;
        aej aejVar3;
        lt3 lt3Var;
        q5b q5bVar2;
        int i;
        q5b q5bVar3 = this.a;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            bej d = q5bVar3.d();
            aej aejVar4 = d != null ? d.a : null;
            z05 z05Var = q5bVar3.a;
            ema layoutDirection = m1cVar.getLayoutDirection();
            boolean z = z05Var.a;
            int i2 = Integer.MAX_VALUE;
            if (aejVar4 != null) {
                eyc eycVar = aejVar4.b;
                zdj zdjVar = aejVar4.a;
                q80 q80Var = (q80) z05Var.b;
                dfj dfjVar = (dfj) z05Var.c;
                List list2 = (List) z05Var.f;
                kx4 kx4Var = (kx4) z05Var.d;
                l1cVar = null;
                sf8 sf8Var = (sf8) z05Var.e;
                if (eycVar.a.a()) {
                    j2 = j;
                    aejVar = aejVar4;
                } else {
                    q80 q80Var2 = zdjVar.a;
                    aej aejVar5 = aejVar4;
                    long j3 = zdjVar.j;
                    if (Intrinsics.c(q80Var2, q80Var) && zdjVar.b.d(dfjVar) && Intrinsics.c(zdjVar.c, list2) && zdjVar.d == Integer.MAX_VALUE && zdjVar.e == z && zdjVar.f == 1 && Intrinsics.c(zdjVar.g, kx4Var) && zdjVar.h == layoutDirection && Intrinsics.c(zdjVar.i, sf8Var) && an3.j(j) == an3.j(j3) && (!z || (an3.h(j) == an3.h(j3) && an3.g(j) == an3.g(j3)))) {
                        aejVar3 = new aej(new zdj(zdjVar.a, (dfj) z05Var.c, zdjVar.c, zdjVar.d, zdjVar.e, zdjVar.f, zdjVar.g, zdjVar.h, zdjVar.i, j), eycVar, cn3.d(j, (ufa.l(eycVar.e) & 4294967295L) | (ufa.l(eycVar.d) << 32)));
                        q5bVar = q5bVar3;
                        aejVar2 = aejVar5;
                        bejVar = d;
                        long j4 = aejVar3.c;
                        Integer valueOf = Integer.valueOf((int) (j4 >> 32));
                        Integer valueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                        int intValue = valueOf.intValue();
                        int intValue2 = valueOf2.intValue();
                        if (Intrinsics.c(aejVar2, aejVar3)) {
                            q5bVar2 = q5bVar;
                            ((eoh) q5bVar2.i).setValue(new bej(aejVar3, bejVar != null ? bejVar.c : l1cVar));
                            i = 0;
                            q5bVar2.p = false;
                            lt3Var = this;
                            lt3Var.b.invoke(aejVar3);
                            l98.Z(q5bVar2, lt3Var.c, lt3Var.d);
                        } else {
                            lt3Var = this;
                            q5bVar2 = q5bVar;
                            i = 0;
                        }
                        ((eoh) q5bVar2.g).setValue(new p75(lt3Var.e.C0(lt3Var.f != 1 ? ufa.l(aejVar3.b.b(i)) : i)));
                        return m1cVar.v0(intValue, intValue2, tub.h(new Pair(mo.a, Integer.valueOf(Math.round(aejVar3.d))), new Pair(mo.b, Integer.valueOf(Math.round(aejVar3.e)))), new q73(11));
                    }
                    j2 = j;
                    aejVar = aejVar5;
                }
            } else {
                j2 = j;
                aejVar = aejVar4;
                l1cVar = null;
            }
            z05Var.a(layoutDirection);
            int j5 = an3.j(j2);
            if (z && an3.d(j2)) {
                i2 = an3.h(j2);
            }
            if (j5 != i2) {
                p03 p03Var = (p03) z05Var.g;
                if (p03Var == null) {
                    a70.r("layoutIntrinsics must be called first");
                    return l1cVar;
                }
                i2 = llf.c(ufa.l(p03Var.c()), j5, i2);
            }
            p03 p03Var2 = (p03) z05Var.g;
            if (p03Var2 == null) {
                a70.r("layoutIntrinsics must be called first");
                return l1cVar;
            }
            q5bVar = q5bVar3;
            aejVar2 = aejVar;
            bejVar = d;
            aejVar3 = new aej(new zdj((q80) z05Var.b, (dfj) z05Var.c, (List) z05Var.f, Integer.MAX_VALUE, z05Var.a, 1, (kx4) z05Var.d, layoutDirection, (sf8) z05Var.e, j2), new eyc(p03Var2, pco.E(0, i2, 0, an3.g(j2)), Integer.MAX_VALUE, 1), cn3.d(j2, (ufa.l(r22.d) << 32) | (ufa.l(r22.e) & 4294967295L)));
            long j42 = aejVar3.c;
            Integer valueOf3 = Integer.valueOf((int) (j42 >> 32));
            Integer valueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
            int intValue3 = valueOf3.intValue();
            int intValue22 = valueOf22.intValue();
            if (Intrinsics.c(aejVar2, aejVar3)) {
            }
            ((eoh) q5bVar2.g).setValue(new p75(lt3Var.e.C0(lt3Var.f != 1 ? ufa.l(aejVar3.b.b(i)) : i)));
            return m1cVar.v0(intValue3, intValue22, tub.h(new Pair(mo.a, Integer.valueOf(Math.round(aejVar3.d))), new Pair(mo.b, Integer.valueOf(Math.round(aejVar3.e)))), new q73(11));
        } finally {
            bea.K(w, C, e);
        }
    }
}
