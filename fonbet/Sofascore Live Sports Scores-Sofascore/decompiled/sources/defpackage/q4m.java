package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q4m implements ct8 {
    public final /* synthetic */ ksa a;
    public final /* synthetic */ xtc b;

    public q4m(ksa ksaVar, xtc xtcVar) {
        this.a = ksaVar;
        this.b = xtcVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-2122872729);
        Object O = av8Var.O();
        final ksa ksaVar = this.a;
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = goh.b(new ni4(ksaVar, 15));
            av8Var.n0(O);
        }
        cdi cdiVar = (cdi) O;
        av8Var.s(false);
        final int i = ((csa) cdiVar.getValue()).n;
        int size = ((csa) cdiVar.getValue()).k.size();
        if (i > 0 && size < i) {
            final int e = (int) (((csa) cdiVar.getValue()).e() & 4294967295L);
            dsa dsaVar = (dsa) CollectionsKt.firstOrNull(ksaVar.j().k);
            final int i2 = (dsaVar != null ? dsaVar.p : 1) * i;
            float f = e;
            float b = llf.b(f / i2, 0.1f, 1.0f);
            av8Var.d0(-2122854762);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = goh.b(new Function0() { // from class: p2m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ksa ksaVar2 = ksa.this;
                        int h = ksaVar2.h();
                        int i3 = ksaVar2.i();
                        int i4 = i2 - e;
                        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (i4 > 0) {
                            f2 = llf.b(lnb.d(r2, i, h, i3) / i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return Float.valueOf(f2);
                    }
                });
                av8Var.n0(O2);
            }
            cdi cdiVar2 = (cdi) O2;
            av8Var.s(false);
            xtc A = wnn.A(bkh.c(bkh.p(this.b, 4.0f), 1.0f), o7g.a(8.0f));
            long j = r13.h;
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, j, jf9Var);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            e12.a(0, av8Var, n9e.q(wnn.A(rd0.O(bkh.c(bkh.p(utc.a, 4.0f), b), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((kx4) av8Var.k(dh3.h)).D0((1.0f - b) * ((Number) cdiVar2.getValue()).floatValue() * f), 1), o7g.a(8.0f)), kam.h, jf9Var));
            av8Var.s(true);
        }
        return Unit.a;
    }
}
