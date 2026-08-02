package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class eth {
    public static final h74 a = new h74(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f);

    public static final void a(final float f, final ArrayList arrayList, final float f2, of3 of3Var, final int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-688440213);
        int i2 = (av8Var.d(f) ? 4 : 2) | i | (av8Var.i(arrayList) ? 32 : 16) | (av8Var.d(f2) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            final d7e t = haa.t(R.drawable.season_logomark, 0, av8Var);
            g28 g28Var = bkh.c;
            boolean i3 = ((i2 & 896) == 256) | av8Var.i(t) | ((i2 & 14) == 4) | av8Var.i(arrayList);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new Function1() { // from class: ath
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j;
                        ath athVar = this;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        d7e d7eVar = d7e.this;
                        long i4 = d7eVar.i();
                        long n = ha5Var.n();
                        int i5 = (int) (n >> 32);
                        long j2 = 4294967295L;
                        int i6 = (int) (n & 4294967295L);
                        float max = Math.max(Float.intBitsToFloat(i5) / Float.intBitsToFloat((int) (i4 >> 32)), Float.intBitsToFloat(i6) / Float.intBitsToFloat((int) (i4 & 4294967295L)));
                        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                        int i7 = mrg.a;
                        int i8 = (int) (floatToRawIntBits >> 32);
                        long h = njh.h(i4, Float.intBitsToFloat(i8));
                        float intBitsToFloat = Float.intBitsToFloat(i5) - Float.intBitsToFloat((int) (h >> 32));
                        float f3 = 2.0f;
                        float intBitsToFloat2 = (Float.intBitsToFloat(i6) - Float.intBitsToFloat((int) (h & 4294967295L))) / 2.0f;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat / 2.0f) << 32);
                        int i9 = 0;
                        while (i9 < 14) {
                            float f4 = i9 / 13.0f;
                            long j3 = j2;
                            float pow = 1.5f - ((1.5f - f2) * ((float) Math.pow(f4, 0.6000000238418579d)));
                            float f5 = f;
                            float t2 = b6a.t(f3, 1.0f, f5) * pow;
                            float t3 = b6a.t(b6a.t(283.0f, 10.0f, f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
                            float floatValue = ((Number) arrayList.get(i9)).floatValue();
                            sx2 L0 = ha5Var.L0();
                            int i10 = i9;
                            long D = L0.D();
                            L0.t().o();
                            try {
                                hpo hpoVar = (hpo) L0.a;
                                sx2 sx2Var = (sx2) hpoVar.a;
                                d7e d7eVar2 = d7eVar;
                                ha5 ha5Var2 = ha5Var;
                                hpoVar.I(Float.intBitsToFloat((int) (yaa.u(sx2Var.D()) >> 32)), Float.intBitsToFloat((int) (yaa.u(sx2Var.D()) & j3)));
                                hpoVar.G(t2, t2, 0L);
                                hpoVar.F(0L, t3);
                                hpoVar.I(-Float.intBitsToFloat((int) (yaa.u(sx2Var.D()) >> 32)), -Float.intBitsToFloat((int) (yaa.u(sx2Var.D()) & j3)));
                                sx2 L02 = ha5Var2.L0();
                                long D2 = L02.D();
                                L02.t().o();
                                try {
                                    hpo hpoVar2 = (hpo) L02.a;
                                    long j4 = i4;
                                    hpoVar2.I(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & j3)));
                                    hpoVar2.G(Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (floatToRawIntBits & j3)), 0L);
                                    long j5 = floatToRawIntBits;
                                    i4 = j4;
                                    j = D2;
                                    d7eVar = d7eVar2;
                                    ha5Var = ha5Var2;
                                    try {
                                        d7e.h(d7eVar, ha5Var, i4, floatValue, null, 4);
                                        L02.t().h();
                                        L02.N(j);
                                        L0.t().h();
                                        L0.N(D);
                                        i9 = i10 + 1;
                                        athVar = this;
                                        j2 = j3;
                                        floatToRawIntBits = j5;
                                        f3 = 2.0f;
                                    } catch (Throwable th) {
                                        th = th;
                                        L02.t().h();
                                        L02.N(j);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j = D2;
                                }
                            } catch (Throwable th3) {
                                mz1.v(L0, D);
                                throw th3;
                            }
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            lz.d(6, av8Var, g28Var, (Function1) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(f, arrayList, f2, i) { // from class: bth
                public final /* synthetic */ float a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    eth.a(this.a, this.b, this.c, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(boolean z, final float f, final tc3 tc3Var, of3 of3Var, int i) {
        boolean z2;
        av8 av8Var;
        Object dthVar;
        final q50 q50Var;
        final List list;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1228713925);
        int i2 = (av8Var2.h(z) ? 4 : 2) | i | (av8Var2.d(f) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O);
            }
            q50 q50Var2 = (q50) O;
            Object O2 = av8Var2.O();
            Object obj = O2;
            if (O2 == a99Var) {
                ArrayList arrayList = new ArrayList(14);
                for (int i3 = 0; i3 < 14; i3++) {
                    arrayList.add(ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                av8Var2.n0(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = e.f(Boolean.FALSE);
                av8Var2.n0(O3);
            }
            e1d e1dVar = (e1d) O3;
            Boolean valueOf = Boolean.valueOf(z);
            boolean i4 = av8Var2.i(q50Var2) | ((i2 & 14) == 4) | av8Var2.i(list2);
            Object O4 = av8Var2.O();
            if (i4 || O4 == a99Var) {
                q50Var = q50Var2;
                list = list2;
                dthVar = new dth(z, q50Var, list, e1dVar, null);
                z2 = z;
                av8Var2.n0(dthVar);
            } else {
                z2 = z;
                dthVar = O4;
                q50Var = q50Var2;
                list = list2;
            }
            hz8.o(av8Var2, valueOf, (Function2) dthVar);
            mv1 mv1Var = uxf.g;
            g28 g28Var = bkh.c;
            tc3 H = yqo.H(122764305, av8Var2, new ct8() { // from class: zsh
                @Override // defpackage.ct8
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    s22 s22Var = (s22) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        p75 p75Var = new p75(s22Var.c());
                        p75 p75Var2 = new p75(s22Var.b());
                        if (p75Var.compareTo(p75Var2) > 0) {
                            p75Var = p75Var2;
                        }
                        float f2 = 120.0f / p75Var.a;
                        float f3 = f;
                        boolean d = av8Var3.d(f3);
                        Object O5 = av8Var3.O();
                        if (d || O5 == nf3.a) {
                            O5 = new s81(f3, 8);
                            av8Var3.n0(O5);
                        }
                        xtc z3 = s02.M(utc.a, (Function1) O5).z(bkh.c);
                        k1c c = e12.c(uxf.g, false);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m = av8Var3.m();
                        xtc C = fqj.C(av8Var3, z3);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, c, hf3.g);
                        waa.K(av8Var3, m, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C, hf3.d);
                        tc3Var.invoke(new p75(s22Var.c()), new p75(s22Var.b()), av8Var3, 0);
                        float floatValue = ((Number) q50Var.d()).floatValue();
                        List list3 = list;
                        ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Float.valueOf(((Number) ((q50) it.next()).d()).floatValue()));
                        }
                        eth.a(floatValue, arrayList2, f2, av8Var3, 0);
                        av8Var3.s(true);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            });
            av8Var = av8Var2;
            dy0.b(g28Var, mv1Var, H, av8Var, 3126, 4);
        } else {
            z2 = z;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qkh(z2, f, tc3Var, i);
        }
    }
}
