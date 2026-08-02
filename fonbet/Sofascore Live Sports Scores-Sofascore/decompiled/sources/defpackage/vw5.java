package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vw5 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vw5(List list, Function1 function1, int i) {
        this.a = i;
        this.b = list;
        this.c = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        av8 av8Var;
        int i7;
        int i8 = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        List list = this.b;
        Function1 function1 = this.c;
        int i9 = 1;
        switch (i8) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(i & 1, (i & 147) != 146)) {
                    j9b j9bVar = (j9b) list.get(intValue);
                    av8Var2.d0(-1615947427);
                    if (j9bVar instanceof i9b) {
                        av8Var2.d0(-1615908957);
                        rha.b(((i9b) j9bVar).a.a(av8Var2), u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), 0L, av8Var2, 0, 4);
                        av8Var2.s(false);
                    } else if (j9bVar instanceof h9b) {
                        av8Var2.d0(-1615509584);
                        h9b h9bVar = (h9b) j9bVar;
                        Object O = av8Var2.O();
                        if (O == a99Var) {
                            O = b74.m;
                            av8Var2.n0(O);
                        }
                        cga.f(h9bVar, (Function0) O, u0a.F(utcVar, h9bVar.f ? icb.b : icb.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), av8Var2, 48);
                        av8Var2.s(false);
                    } else if (j9bVar instanceof p9b) {
                        av8Var2.d0(-1615050474);
                        p9b p9bVar = (p9b) j9bVar;
                        boolean i10 = av8Var2.i(j9bVar) | av8Var2.g(function1);
                        Object O2 = av8Var2.O();
                        if (i10 || O2 == a99Var) {
                            O2 = new uw5(function1, p9bVar, 0);
                            av8Var2.n0(O2);
                        }
                        m9b.c(p9bVar, (Function0) O2, u0a.F(utcVar, p9bVar.l ? icb.b : icb.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), null, null, av8Var2, 0, 24);
                        av8Var2.s(false);
                    } else {
                        if (!(j9bVar instanceof g9b)) {
                            throw dmi.h(av8Var2, -1714695322, false);
                        }
                        av8Var2.d0(-1714648096);
                        av8Var2.s(false);
                    }
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                bpa bpaVar = (bpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(bpaVar) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(i2 & 1, (i2 & 147) != 146)) {
                    mp6 mp6Var = (mp6) list.get(intValue3);
                    av8Var3.d0(-1520123003);
                    boolean g = av8Var3.g(function1);
                    Object O3 = av8Var3.O();
                    if (g || O3 == a99Var) {
                        O3 = new zn6(0, function1);
                        av8Var3.n0(O3);
                    }
                    n9e.f(mp6Var, (Function1) O3, bkh.d(utcVar, 1.0f), 0L, av8Var3, 384, 8);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                bpa bpaVar2 = (bpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((av8) of3Var3).g(bpaVar2) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((av8) of3Var3).e(intValue5) ? 32 : 16;
                }
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(i3 & 1, (i3 & 147) != 146)) {
                    mp6 mp6Var2 = (mp6) list.get(intValue5);
                    av8Var4.d0(675336046);
                    boolean g2 = av8Var4.g(function1);
                    Object O4 = av8Var4.O();
                    if (g2 || O4 == a99Var) {
                        O4 = new zn6(1, function1);
                        av8Var4.n0(O4);
                    }
                    n9e.f(mp6Var2, (Function1) O4, bkh.d(utcVar, 1.0f), 0L, av8Var4, 384, 8);
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                xpa xpaVar2 = (xpa) obj;
                int intValue7 = ((Number) obj2).intValue();
                of3 of3Var4 = (of3) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((av8) of3Var4).g(xpaVar2) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((av8) of3Var4).e(intValue7) ? 32 : 16;
                }
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(i4 & 1, (i4 & 147) != 146)) {
                    bfc bfcVar = (bfc) list.get(intValue7);
                    av8Var5.d0(-54287448);
                    i9a.a(bfcVar, function1, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                xpa xpaVar3 = (xpa) obj;
                int intValue9 = ((Number) obj2).intValue();
                of3 of3Var5 = (of3) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((av8) of3Var5).g(xpaVar3) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((av8) of3Var5).e(intValue9) ? 32 : 16;
                }
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(i5 & 1, (i5 & 147) != 146)) {
                    OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) list.get(intValue9);
                    av8Var6.d0(-1457223006);
                    boolean g3 = av8Var6.g(function1) | av8Var6.i(onboardingItemUiModel);
                    Object O5 = av8Var6.O();
                    if (g3 || O5 == a99Var) {
                        O5 = new usd(function1, onboardingItemUiModel, 1);
                        av8Var6.n0(O5);
                    }
                    krd.d(onboardingItemUiModel, (Function0) O5, xpa.a(xpaVar3, utcVar, 7), av8Var6, 0);
                    av8Var6.s(false);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 5:
                xpa xpaVar4 = (xpa) obj;
                int intValue11 = ((Number) obj2).intValue();
                of3 of3Var6 = (of3) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((av8) of3Var6).g(xpaVar4) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((av8) of3Var6).e(intValue11) ? 32 : 16;
                }
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(i6 & 1, (i6 & 147) != 146)) {
                    b3e b3eVar = (b3e) list.get(intValue11);
                    av8Var7.d0(1982640493);
                    if (b3eVar instanceof z2e) {
                        av8Var7.d0(1310883488);
                        z2e z2eVar = (z2e) b3eVar;
                        o3a.e(z2eVar, u0a.F(utcVar, z2eVar.i ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 62), av8Var7, 0, 0);
                        av8Var7.s(false);
                        av8Var = av8Var7;
                    } else {
                        if (!(b3eVar instanceof a3e)) {
                            throw dmi.h(av8Var7, 1310882134, false);
                        }
                        av8Var7.d0(1983021575);
                        a3e a3eVar = (a3e) b3eVar;
                        String str = a3eVar.b;
                        xtc F = u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 62);
                        t3e t3eVar = new t3e(16.0f, 16.0f, 16.0f, 16.0f);
                        String v = oea.v(R.string.see_all, av8Var7);
                        tc3 H = yqo.H(902732830, av8Var7, new os4(a3eVar, i9));
                        boolean i11 = av8Var7.i(b3eVar) | av8Var7.g(function1);
                        Object O6 = av8Var7.O();
                        if (i11 || O6 == a99Var) {
                            O6 = new pi(26, function1, a3eVar);
                            av8Var7.n0(O6);
                        }
                        vha.a(str, F, H, v, null, t3eVar, (Function0) O6, av8Var7, 196992, 16);
                        av8Var = av8Var7;
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            default:
                xpa xpaVar5 = (xpa) obj;
                int intValue13 = ((Number) obj2).intValue();
                of3 of3Var7 = (of3) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((av8) of3Var7).g(xpaVar5) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((av8) of3Var7).e(intValue13) ? 32 : 16;
                }
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(i7 & 1, (i7 & 147) != 146)) {
                    r5c r5cVar = (r5c) list.get(intValue13);
                    av8Var8.d0(1398573525);
                    xtc p = qx9.p(xpa.b(xpaVar5), 1.7777778f);
                    boolean g4 = av8Var8.g(function1);
                    Object O7 = av8Var8.O();
                    if (g4 || O7 == a99Var) {
                        O7 = new zn6(8, function1);
                        av8Var8.n0(O7);
                    }
                    aba.e(r5cVar, (Function1) O7, p, av8Var8, 0, 0);
                    av8Var8.s(false);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
        }
    }
}
