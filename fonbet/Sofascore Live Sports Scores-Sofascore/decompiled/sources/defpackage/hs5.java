package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hs5 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hs5(Function1 function1, boolean z) {
        this.a = 1;
        this.b = function1;
        this.c = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ksa ksaVar;
        int i = this.a;
        utc utcVar = utc.a;
        boolean z = this.c;
        Function1 function1 = this.b;
        Object obj4 = nf3.a;
        int i2 = 8;
        switch (i) {
            case 0:
                os5 os5Var = (os5) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                os5Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(os5Var) : ((av8) of3Var).i(os5Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    u6h.f(z && (os5Var instanceof ms5), null, av8Var, 0);
                    Object O = av8Var.O();
                    if (O == obj4) {
                        O = new qz4(26);
                        av8Var.n0(O);
                    }
                    wkn.a(os5Var, null, null, (Function1) O, yqo.H(-51550990, av8Var, new hs5(z, function1, 4)), av8Var, (intValue & 14) | 27648, 6);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                qpb qpbVar = (qpb) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                qpbVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(qpbVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (!av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    av8Var2.W();
                } else if (qpbVar.equals(opb.a)) {
                    av8Var2.d0(174825122);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var2, bkh.c);
                    av8Var2.s(false);
                } else {
                    boolean equals = qpbVar.equals(npb.a);
                    Function1 function12 = this.b;
                    if (equals) {
                        av8Var2.d0(174961057);
                        boolean g = av8Var2.g(function12);
                        Object O2 = av8Var2.O();
                        if (g || O2 == obj4) {
                            O2 = new is5(11, function12);
                            av8Var2.n0(O2);
                        }
                        yqo.f((Function0) O2, l98.d0(hkg.J(), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, av8Var2, 0, 4);
                        av8Var2.s(false);
                    } else {
                        if (!(qpbVar instanceof ppb)) {
                            throw dmi.h(av8Var2, 5641075, false);
                        }
                        av8Var2.d0(175401567);
                        kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
                        Object O3 = av8Var2.O();
                        if (O3 == obj4) {
                            O3 = e.f(new p75(48.0f));
                            av8Var2.n0(O3);
                        }
                        e1d e1dVar = (e1d) O3;
                        ksa a2 = msa.a(0, 0, av8Var2, 0, 3);
                        qpa a3 = tpa.a(0, 3, av8Var2);
                        float f = ((p75) e1dVar.getValue()).a - 8.0f;
                        boolean g2 = av8Var2.g(function12);
                        Object O4 = av8Var2.O();
                        if (g2 || O4 == obj4) {
                            O4 = new is5(12, function12);
                            av8Var2.n0(O4);
                        }
                        b0a.s(this.c, (Function0) O4, utc.a, null, f, yqo.H(-1111097046, av8Var2, new s64(qpbVar, kx4Var, function12, e1dVar, a2, a3)), av8Var2, 196608, 8);
                        av8Var2.s(false);
                    }
                }
                return Unit.a;
            case 2:
                bza bzaVar = (bza) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bzaVar.getClass();
                gv9<PowerRankingRound> gv9Var = bzaVar.f;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(bzaVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Context context = (Context) av8Var3.k(nz.b);
                    String str = bzaVar.e;
                    boolean g3 = av8Var3.g(gv9Var) | av8Var3.g(str);
                    Object O5 = av8Var3.O();
                    if (g3 || O5 == obj4) {
                        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                        for (PowerRankingRound powerRankingRound : gv9Var) {
                            Regex regex = d7g.a;
                            arrayList.add(new oxh(powerRankingRound, d7g.b(context, powerRankingRound.getRound(), false, str), null, null, null, false, 252));
                        }
                        O5 = l6g.W(arrayList);
                        av8Var3.n0(O5);
                    }
                    gv9 gv9Var2 = (gv9) O5;
                    xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    ksa a4 = msa.a(0, 0, av8Var3, 0, 3);
                    Object O6 = av8Var3.O();
                    if (O6 == obj4) {
                        O6 = hz8.G(g.a, av8Var3);
                        av8Var3.n0(O6);
                    }
                    ku3 ku3Var = (ku3) O6;
                    g28 g28Var = bkh.c;
                    t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    int i3 = intValue3;
                    boolean z2 = this.c;
                    boolean h = av8Var3.h(z2) | av8Var3.g(gv9Var2);
                    boolean z3 = (i3 & 14) == 4;
                    Function1 function13 = this.b;
                    boolean g4 = av8Var3.g(function13) | h | z3 | av8Var3.i(ku3Var) | av8Var3.g(a4);
                    Object O7 = av8Var3.O();
                    if (g4 || O7 == obj4) {
                        Object ij6Var = new ij6(bzaVar, z2, gv9Var2, function13, d0, ku3Var, a4, 1);
                        ksaVar = a4;
                        av8Var3.n0(ij6Var);
                        O7 = ij6Var;
                    } else {
                        ksaVar = a4;
                    }
                    v8a.a(g28Var, ksaVar, C2, null, null, null, false, null, (Function1) O7, av8Var3, 390, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                vnb vnbVar = (vnb) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                vnbVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(vnbVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    av8Var4.W();
                } else if (vnbVar.equals(tnb.a) || (vnbVar instanceof snb)) {
                    av8Var4.d0(1285915132);
                    t6a.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 6, 14);
                    av8Var4.s(false);
                } else {
                    if (!(vnbVar instanceof unb)) {
                        throw dmi.h(av8Var4, 1285917409, false);
                    }
                    av8Var4.d0(1208903680);
                    hhd hhdVar = (hhd) ((unb) vnbVar).a;
                    xtc q = n9e.q(bkh.c, lz.D(R.color.surface_0, av8Var4), oyn.e);
                    t3e t3eVar = new t3e(8.0f, 4.0f, 8.0f, 48.0f);
                    boolean g5 = av8Var4.g(hhdVar) | av8Var4.g(function1) | av8Var4.h(z);
                    Object O8 = av8Var4.O();
                    if (g5 || O8 == obj4) {
                        O8 = new gk(hhdVar, z, function1, i2);
                        av8Var4.n0(O8);
                    }
                    v8a.a(q, null, t3eVar, null, null, null, false, null, (Function1) O8, av8Var4, 0, 506);
                    av8Var4.s(false);
                }
                return Unit.a;
            case 4:
                os5 os5Var2 = (os5) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                os5Var2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= (intValue5 & 8) == 0 ? ((av8) of3Var5).g(os5Var2) : ((av8) of3Var5).i(os5Var2) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (!av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    av8Var5.W();
                } else if (os5Var2.equals(ls5.a)) {
                    av8Var5.d0(1842898610);
                    v7a.e(5000L, b.j(oea.v(R.string.loading_animation_fetching_data, av8Var5), oea.v(R.string.loading_animation_generating_forecasts, av8Var5), oea.v(R.string.loading_animation_checking_accuracy, av8Var5)), l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var5, 390, 0);
                    av8Var5.s(false);
                } else if (os5Var2 instanceof ms5) {
                    av8Var5.d0(1999130987);
                    ms5 ms5Var = (ms5) os5Var2;
                    im imVar = ms5Var.a;
                    em emVar = ms5Var.b;
                    boolean g6 = av8Var5.g(function1) | ((intValue5 & 14) == 4 || ((intValue5 & 8) != 0 && av8Var5.i(os5Var2)));
                    Object O9 = av8Var5.O();
                    if (g6 || O9 == obj4) {
                        O9 = new h84(12, function1, os5Var2);
                        av8Var5.n0(O9);
                    }
                    v9g.g(imVar, emVar, this.c, (Function0) O9, null, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    if (!(os5Var2 instanceof ns5)) {
                        throw dmi.h(av8Var5, 1999109116, false);
                    }
                    av8Var5.d0(1844043347);
                    mm mmVar = ((ns5) os5Var2).a;
                    if (mmVar instanceof km) {
                        av8Var5.d0(1999151062);
                        km kmVar = (km) mmVar;
                        boolean g7 = av8Var5.g(function1);
                        Object O10 = av8Var5.O();
                        if (g7 || O10 == obj4) {
                            O10 = new is5(0, function1);
                            av8Var5.n0(O10);
                        }
                        fqj.e(kmVar, (Function0) O10, null, av8Var5, 0);
                        av8Var5.s(false);
                    } else {
                        if (!(mmVar instanceof lm)) {
                            throw dmi.h(av8Var5, 1999147919, false);
                        }
                        av8Var5.d0(1999162184);
                        s9a.e((lm) mmVar, null, av8Var5, 0);
                        av8Var5.s(false);
                    }
                    av8Var5.s(false);
                }
                return Unit.a;
            default:
                of3 of3Var6 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc x = gz8.x(utcVar, null, null, 3);
                u23 a5 = t23.a(ww9.d, uxf.o, of3Var6, 0);
                av8 av8Var6 = (av8) of3Var6;
                int hashCode2 = Long.hashCode(av8Var6.T);
                aee m2 = av8Var6.m();
                xtc C3 = fqj.C(of3Var6, x);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var7 = (av8) of3Var6;
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var2);
                } else {
                    av8Var7.q0();
                }
                waa.K(of3Var6, a5, hf3.g);
                waa.K(of3Var6, m2, hf3.f);
                waa.K(of3Var6, Integer.valueOf(hashCode2), hf3.j);
                waa.J(of3Var6, hf3.k);
                waa.K(of3Var6, C3, hf3.d);
                xtc d = bkh.d(utcVar, 1.0f);
                String v = oea.v(R.string.get_started, of3Var6);
                boolean g8 = av8Var7.g(function1);
                Object O11 = av8Var7.O();
                if (g8 || O11 == obj4) {
                    O11 = new l77(16, function1);
                    av8Var7.n0(O11);
                }
                mha.h(v, (Function0) O11, d, pqh.a, null, false, false, false, 0L, 0, 0, of3Var6, 3456, 0, 2032);
                if (z) {
                    av8Var7.d0(-38264820);
                    av8Var7.s(false);
                } else {
                    av8Var7.d0(-38659791);
                    nq8.h(of3Var6, bkh.e(utcVar, 8.0f));
                    xtc d2 = bkh.d(utcVar, 1.0f);
                    long D = lz.D(R.color.on_color_primary, of3Var6);
                    boolean g9 = av8Var7.g(function1);
                    Object O12 = av8Var7.O();
                    if (g9 || O12 == obj4) {
                        O12 = new l77(17, function1);
                        av8Var7.n0(O12);
                    }
                    o6a.f((Function0) O12, d2, D, of3Var6, 48, 0);
                    av8Var7.s(false);
                }
                nq8.h(of3Var6, bkh.e(utcVar, 8.0f));
                String v2 = oea.v(R.string.what_is_fantasy, of3Var6);
                yf8 yf8Var = xth.a;
                dfj g10 = xth.g();
                long D2 = lz.D(R.color.on_color_primary, of3Var6);
                long c = r13.c(lz.D(R.color.on_color_primary, of3Var6), 0.8f);
                xtc b0 = l98.b0(new we9(uxf.p), 8.0f);
                boolean g11 = av8Var7.g(function1);
                Object O13 = av8Var7.O();
                if (g11 || O13 == obj4) {
                    O13 = new l77(18, function1);
                    av8Var7.n0(O13);
                }
                ktm.c(v2, g10, (Function0) O13, b0, v8j.c, D2, c, of3Var6, 24576, 0);
                nq8.h(of3Var6, bkh.e(utcVar, 16.0f));
                av8Var7.s(true);
                return Unit.a;
        }
    }

    public /* synthetic */ hs5(Function1 function1, boolean z, int i) {
        this.a = i;
        this.b = function1;
        this.c = z;
    }

    public /* synthetic */ hs5(boolean z, Function1 function1, int i) {
        this.a = i;
        this.c = z;
        this.b = function1;
    }
}
