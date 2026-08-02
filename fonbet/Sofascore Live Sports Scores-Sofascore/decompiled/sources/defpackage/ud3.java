package defpackage;

import androidx.compose.runtime.e;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ud3 implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ ud3(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        Object obj4;
        int i = this.a;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                boolean z = false;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, z)) {
                    String v = oea.v(R.string.most_viewed_matches, av8Var2);
                    long D = lz.D(R.color.n_lv_1, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, l98.f0(n9e.q(bkh.d(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 130040);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    e12.a(0, av8Var3, bkh.e(bkh.d(n9e.q(wnn.A(utcVar, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), lz.D(R.color.surface_1, av8Var3), oyn.e), 1.0f), 16.0f));
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    d2a.g(6, av8Var4, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 3:
                Function2 function2 = (Function2) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).i(function2) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    function2.invoke(av8Var5, Integer.valueOf(intValue4 & 14));
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                of3 of3Var5 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(R.drawable.ic_plus, 6, of3Var5), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_primary, of3Var5), of3Var5, 432, 0);
                return Unit.a;
            case 5:
                of3 of3Var6 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                l8g a = k8g.a(ww9.b, uxf.m, of3Var6, 48);
                av8 av8Var6 = (av8) of3Var6;
                int hashCode = Long.hashCode(av8Var6.T);
                aee m = av8Var6.m();
                xtc C = fqj.C(of3Var6, utcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var7 = (av8) of3Var6;
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var);
                } else {
                    av8Var7.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(of3Var6, a, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(of3Var6, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(of3Var6, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(of3Var6, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(of3Var6, C, f50Var3);
                xtc q = n9e.q(bkh.l(utcVar, 24.0f), lz.D(R.color.surface_2, of3Var6), o7g.a(4.0f));
                k1c c = e12.c(uxf.g, false);
                int hashCode2 = Long.hashCode(av8Var7.T);
                aee m2 = av8Var7.m();
                xtc C2 = fqj.C(of3Var6, q);
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var);
                } else {
                    av8Var7.q0();
                }
                waa.K(of3Var6, c, f50Var);
                waa.K(of3Var6, m2, ff3Var);
                waa.K(of3Var6, Integer.valueOf(hashCode2), f50Var2);
                waa.J(of3Var6, ryVar);
                waa.K(of3Var6, C2, f50Var3);
                kq9.b(s6a.N(R.drawable.ic_arrow_drop_down_16, 6, of3Var6), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, of3Var6), of3Var6, 432, 0);
                av8Var7.s(true);
                nq8.h(of3Var6, bkh.p(utcVar, 4.0f));
                av8Var7.s(true);
                return Unit.a;
            case 6:
                of3 of3Var7 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    fz8.m(R.string.get_more_insights, 0L, av8Var8, 0, 2);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 7:
                of3 of3Var8 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    tz9.d(1.0f, 390, 8, lz.D(R.color.n_lv_4, av8Var9), 0L, av8Var9, l98.c0(utcVar, 16.0f, 8.0f));
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 8:
                ukf ukfVar = (ukf) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ukfVar.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var9).g(ukfVar) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    s6a.j(ukfVar, null, av8Var10, intValue7 & 14);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 9:
                ukf ukfVar2 = (ukf) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ukfVar2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var10).g(ukfVar2) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    s6a.i(ukfVar2, null, av8Var11, intValue8 & 14);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 10:
                of3 of3Var11 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var12 = (av8) of3Var11;
                if (av8Var12.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    xtc c0 = l98.c0(utcVar, 16.0f, 12.0f);
                    l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.l, av8Var12, 6);
                    int hashCode3 = Long.hashCode(av8Var12.T);
                    aee m3 = av8Var12.m();
                    xtc C3 = fqj.C(av8Var12, c0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var12.h0();
                    if (av8Var12.S) {
                        av8Var12.l(zg3Var2);
                    } else {
                        av8Var12.q0();
                    }
                    waa.K(av8Var12, a2, hf3.g);
                    waa.K(av8Var12, m3, hf3.f);
                    waa.K(av8Var12, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var12, hf3.k);
                    waa.K(av8Var12, C3, hf3.d);
                    wkn.l(s6a.N(R.drawable.eeep_logo, 6, av8Var12), bkh.l(utcVar, 24.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.n_lv_3, av8Var12), 5), av8Var12, 432, 56);
                    yf8 yf8Var2 = xth.a;
                    udj.c(oea.v(R.string.greek_betting_regulations_text, av8Var12), null, lz.D(R.color.n_lv_3, av8Var12), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var12, 0, 0, 131066);
                    av8Var12.s(true);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 11:
                of3 of3Var12 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    xtc d = bkh.d(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                    String v2 = oea.v(R.string.germany_betting_regulations_text, av8Var13);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v2, d, lz.D(R.color.n_lv_3, av8Var13), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.c(), av8Var13, 48, 24960, 109560);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 12:
                of3 of3Var13 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var14 = (av8) of3Var13;
                if (av8Var14.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    xtc c02 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                    String i2 = wv8.i(oea.v(R.string.responsible_gambling_argentina_title, av8Var14), " ", oea.v(R.string.responsible_gambling_argentina_text, av8Var14));
                    yf8 yf8Var4 = xth.a;
                    udj.c(i2, c02, lz.D(R.color.n_lv_3, av8Var14), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var14, 48, 0, 130040);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 13:
                of3 of3Var14 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var15 = (av8) of3Var14;
                if (!av8Var15.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    av8Var15.W();
                }
                return Unit.a;
            case 14:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var15 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((av8) of3Var15).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var16 = (av8) of3Var15;
                if (!av8Var16.T(intValue13 & 1, (intValue13 & 19) != 18)) {
                    av8Var16.W();
                } else if (booleanValue) {
                    av8Var16.d0(-1041389125);
                    gz8.j(null, 0L, 0L, 4.0f, 2, av8Var16, 3072, 7);
                    av8Var16.s(false);
                } else {
                    av8Var16.d0(-1041223678);
                    w1l.s(utcVar, 4.0f, av8Var16, false);
                }
                return Unit.a;
            case 15:
                of3 of3Var16 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var17 = (av8) of3Var16;
                if (av8Var17.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var17, l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7));
                } else {
                    av8Var17.W();
                }
                return Unit.a;
            case 16:
                of3 of3Var17 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var18 = (av8) of3Var17;
                if (av8Var18.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    kq9.b(s6a.N(R.drawable.ic_external_link_16, 6, av8Var18), null, bkh.l(l98.f0(utc.a, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f), lz.D(R.color.primary_default, av8Var18), av8Var18, 432, 0);
                } else {
                    av8Var18.W();
                }
                return Unit.a;
            case 17:
                of3 of3Var18 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var19 = (av8) of3Var18;
                if (av8Var19.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    j72.h(null, Integer.valueOf(R.drawable.no_statistics), Integer.valueOf(R.string.no_statistics), Integer.valueOf(R.string.no_statistics_text), false, null, 0, 0L, av8Var19, 0, 241);
                } else {
                    av8Var19.W();
                }
                return Unit.a;
            case 18:
                of3 of3Var19 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var20 = (av8) of3Var19;
                if (av8Var20.T(intValue17 & 1, (intValue17 & 17) != 16)) {
                    xtc e0 = l98.e0(utcVar, 16.0f, 4.0f, 16.0f, 24.0f);
                    String v3 = oea.v(R.string.weekly_challenge_every_vote_counts_description, av8Var20);
                    yf8 yf8Var5 = xth.a;
                    udj.c(v3, e0, lz.D(R.color.n_lv_2, av8Var20), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var20, 0, 0, 131064);
                } else {
                    av8Var20.W();
                }
                return Unit.a;
            case 19:
                of3 of3Var20 = (of3) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var21 = (av8) of3Var20;
                if (av8Var21.T(intValue18 & 1, (intValue18 & 17) != 16)) {
                    mha.j(0, av8Var21, null);
                } else {
                    av8Var21.W();
                }
                return Unit.a;
            case 20:
                of3 of3Var21 = (of3) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var22 = (av8) of3Var21;
                if (!av8Var22.T(intValue19 & 1, (intValue19 & 17) != 16)) {
                    av8Var22.W();
                }
                return Unit.a;
            case 21:
                of3 of3Var22 = (of3) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var23 = (av8) of3Var22;
                if (av8Var23.T(intValue20 & 1, (intValue20 & 17) != 16)) {
                    fz8.m(R.string.stadium_info, lz.D(R.color.on_color_primary, av8Var23), av8Var23, 0, 0);
                } else {
                    av8Var23.W();
                }
                return Unit.a;
            case 22:
                of3 of3Var23 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                String v4 = oea.v(R.string.team_spotlight_collapsed_unselected, of3Var23);
                yf8 yf8Var6 = xth.a;
                udj.c(v4, null, lz.D(R.color.on_color_secondary, of3Var23), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), of3Var23, 0, 0, 131066);
                return Unit.a;
            case 23:
                of3 of3Var24 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                kq9.b(s6a.N(R.drawable.ic_info, 6, of3Var24), null, bkh.l(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 14.0f), lz.D(R.color.on_color_primary, of3Var24), of3Var24, 432, 0);
                return Unit.a;
            case 24:
                of3 of3Var25 = (of3) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                av8 av8Var24 = (av8) of3Var25;
                if (av8Var24.T(intValue21 & 1, (intValue21 & 17) != 16)) {
                    c5n.a(16.0f, 384, 27, 0L, 0L, av8Var24, null);
                } else {
                    av8Var24.W();
                }
                return Unit.a;
            case 25:
                of3 of3Var26 = (of3) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var25 = (av8) of3Var26;
                if (av8Var25.T(intValue22 & 1, (intValue22 & 17) != 16)) {
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode4 = Long.hashCode(av8Var25.T);
                    aee m4 = av8Var25.m();
                    xtc C4 = fqj.C(av8Var25, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var25.h0();
                    if (av8Var25.S) {
                        av8Var25.l(zg3Var3);
                    } else {
                        av8Var25.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var25, c2, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var25, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var25, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var25, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var25, C4, f50Var6);
                    lv1 lv1Var = uxf.m;
                    xtc Y = fz8.Y(l98.b0(bkh.d(utcVar, 1.0f), 16.0f), n9a.b);
                    wxf wxfVar = ww9.b;
                    l8g a3 = k8g.a(wxfVar, lv1Var, av8Var25, 48);
                    int hashCode5 = Long.hashCode(av8Var25.T);
                    aee m5 = av8Var25.m();
                    xtc C5 = fqj.C(av8Var25, Y);
                    av8Var25.h0();
                    if (av8Var25.S) {
                        av8Var25.l(zg3Var3);
                    } else {
                        av8Var25.q0();
                    }
                    waa.K(av8Var25, a3, f50Var4);
                    waa.K(av8Var25, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var25, f50Var5, av8Var25, ryVar2);
                    waa.K(av8Var25, C5, f50Var6);
                    wkn.k(haa.t(2131231472, 0, av8Var25), null, wnn.A(bkh.l(utcVar, 72.0f), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 3)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var25, 56, 120);
                    nq8.h(av8Var25, bkh.p(utcVar, 16.0f));
                    xtc g = bkh.g(utcVar, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var25, 0);
                    int hashCode6 = Long.hashCode(av8Var25.T);
                    aee m6 = av8Var25.m();
                    xtc C6 = fqj.C(av8Var25, g);
                    av8Var25.h0();
                    if (av8Var25.S) {
                        av8Var25.l(zg3Var3);
                    } else {
                        av8Var25.q0();
                    }
                    waa.K(av8Var25, a4, f50Var4);
                    waa.K(av8Var25, m6, ff3Var2);
                    bf3.s(hashCode6, av8Var25, f50Var5, av8Var25, ryVar2);
                    waa.K(av8Var25, C6, f50Var6);
                    String v5 = oea.v(R.string.sofascore_fantasy, av8Var25);
                    yf8 yf8Var7 = xth.a;
                    udj.c(v5, null, lz.D(R.color.n_lv_1, av8Var25), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var25, 0, 24960, 110586);
                    udj.c(bf3.g(4.0f, R.string.fantasy_banner_entry_point_text, av8Var25, av8Var25, utcVar), null, lz.D(R.color.n_lv_3, av8Var25), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var25, 0, 0, 131066);
                    nq8.h(av8Var25, new goa(1.0f, true));
                    nq8.h(av8Var25, bkh.e(utcVar, 16.0f));
                    l8g a5 = k8g.a(wxfVar, lv1Var, av8Var25, 48);
                    int hashCode7 = Long.hashCode(av8Var25.T);
                    aee m7 = av8Var25.m();
                    xtc C7 = fqj.C(av8Var25, utcVar);
                    av8Var25.h0();
                    if (av8Var25.S) {
                        av8Var25.l(zg3Var3);
                    } else {
                        av8Var25.q0();
                    }
                    waa.K(av8Var25, a5, f50Var4);
                    waa.K(av8Var25, m7, ff3Var2);
                    bf3.s(hashCode7, av8Var25, f50Var5, av8Var25, ryVar2);
                    waa.K(av8Var25, C7, f50Var6);
                    udj.c(oea.v(R.string.fantasy_play_now_button, av8Var25), null, lz.D(R.color.primary_default, av8Var25), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var25, 0, 24960, 110586);
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var25), null, ljg.i(utcVar, 4.0f, av8Var25, utcVar, 16.0f), lz.D(R.color.primary_default, av8Var25), av8Var25, 432, 0);
                    av8Var25.s(true);
                    av8Var25.s(true);
                    av8Var25.s(true);
                    av8Var25.d0(-236346913);
                    av8Var25.s(false);
                    av8Var25.s(true);
                } else {
                    av8Var25.W();
                }
                return Unit.a;
            case 26:
                aq4 aq4Var = (aq4) obj3;
                ((pk9) obj).getClass();
                ((xj9) obj2).getClass();
                aq4Var.getClass();
                int i3 = aq4Var.d().a;
                if (500 <= i3 && i3 < 600) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 27:
                xsi xsiVar = (xsi) obj;
                of3 of3Var27 = (of3) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                xsiVar.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((av8) of3Var27).g(xsiVar) ? 4 : 2;
                }
                av8 av8Var26 = (av8) of3Var27;
                if (av8Var26.T(intValue23 & 1, (intValue23 & 19) != 18)) {
                    String str = xsiVar.b;
                    yf8 yf8Var8 = xth.a;
                    udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_3, av8Var26), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.m(), av8Var26, 0, 24576, 113656);
                } else {
                    av8Var26.W();
                }
                return Unit.a;
            case 28:
                b20 b20Var = (b20) obj;
                njh njhVar = (njh) obj2;
                b20Var.getClass();
                ((ema) obj3).getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (njhVar.a >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (njhVar.a & 4294967295L));
                float f = 0.5f * intBitsToFloat;
                b20Var.g(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f2 = intBitsToFloat2 * 0.15f;
                b20Var.f(0.98f * intBitsToFloat, f2);
                float f3 = 0.75f * intBitsToFloat2;
                b20Var.f(0.9f * intBitsToFloat, f3);
                float f4 = 0.8f * intBitsToFloat2;
                b20Var.f(0.85f * intBitsToFloat, f4);
                b20Var.f(f, intBitsToFloat2 * 1.0f);
                b20Var.f(0.15f * intBitsToFloat, f4);
                b20Var.f(0.1f * intBitsToFloat, f3);
                b20Var.f(intBitsToFloat * 0.02f, f2);
                b20Var.d();
                return Unit.a;
            default:
                xtc xtcVar = (xtc) obj;
                ((Integer) obj3).getClass();
                xtcVar.getClass();
                av8 av8Var27 = (av8) ((of3) obj2);
                av8Var27.d0(290386059);
                Object O = av8Var27.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = e.f(new c7a(0L));
                    av8Var27.n0(O);
                }
                e1d e1dVar = (e1d) O;
                h2a F = i2a.F(null, av8Var27, 1);
                List j = b.j(new r13(lz.D(R.color.n_lv_5, av8Var27)), new r13(lz.D(R.color.n_lv_4, av8Var27)), new r13(lz.D(R.color.n_lv_5, av8Var27)));
                if (((e6b) sea.l(((u6b) av8Var27.k(mhb.a)).getLifecycle().c(), av8Var27, 0).getValue()).compareTo(e6b.e) < 0 || c7a.a(((c7a) e1dVar.getValue()).a, 0L)) {
                    av8Var = av8Var27;
                    av8Var.d0(827598915);
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        av8Var.n0(O2);
                    }
                    obj4 = (xnh) O2;
                    av8Var.s(false);
                } else {
                    av8Var27.d0(827312661);
                    obj4 = i2a.q(F, (-2.0f) * ((int) (((c7a) e1dVar.getValue()).a >> 32)), 2.0f * ((int) (((c7a) e1dVar.getValue()).a >> 32)), s02.P(s02.h0(TTAdConstant.STYLE_SIZE_RADIO_3_2, 0, jg5.b, 2), null, 0L, 6), null, av8Var27, 4104, 8);
                    av8Var = av8Var27;
                    av8Var.s(false);
                }
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = new fw6(18, e1dVar);
                    av8Var.n0(O3);
                }
                xtc A = un0.A(xtcVar, (Function1) O3);
                boolean g2 = av8Var.g(j) | av8Var.g(obj4);
                Object O4 = av8Var.O();
                if (g2 || O4 == a99Var) {
                    O4 = new vsc(1, j, obj4, e1dVar);
                    av8Var.n0(O4);
                }
                xtc Y2 = td4.Y(A, (Function1) O4);
                av8Var.s(false);
                return Y2;
        }
    }
}
