package defpackage;

import android.content.Context;
import androidx.compose.ui.tooling.PreviewActivity;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wbc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wbc(gyg gygVar, Function1 function1, Function0 function0) {
        this.a = 26;
        this.b = gygVar;
        this.d = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        FieldTranslations fieldTranslations;
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ybc.b((w41) obj5, (tee) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                x2a.g((d6d) obj5, (mpg) obj3, (tc3) obj4, (of3) obj, aba.K(385));
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                xw3.L((ku3) obj5, null, null, new pv2(floatValue, (o0h) obj3, (d6d) obj4, null), 3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ufd.b((vfd) obj5, (Function1) obj4, (String) obj3, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                krd.d((OnboardingItemUiModel) obj5, (Function0) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 5:
                e1d e1dVar = (e1d) obj5;
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(av8Var, utcVar);
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
                    xtc O = kda.O(bkh.d(utcVar, 1.0f), "get_started_button", av8Var);
                    String v = oea.v(R.string.button_get_started, av8Var);
                    boolean g = av8Var.g(e1dVar) | av8Var.g(function0);
                    Object O2 = av8Var.O();
                    if (g || O2 == a99Var) {
                        O2 = new u54(3, e1dVar, function0);
                        av8Var.n0(O2);
                    }
                    mha.h(v, tol.u((Function0) O2, av8Var), O, pqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2032);
                    o6a.f(function02, kda.O(vxd.f(utcVar, 16.0f, av8Var, utcVar, 1.0f), "sign_in_button", av8Var), 0L, av8Var, 0, 4);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                cga.h((Double) obj5, (gv9) obj3, (Gender) obj4, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                aik.k((gv9) obj5, (mzd) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                aik.l((gv9) obj5, (pzd) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                xw3.h((q1e) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                hda.c((hth) obj5, (xtc) obj3, (tc3) obj4, (of3) obj, aba.K(433));
                break;
            case 11:
                String str3 = (String) obj5;
                String str4 = (String) obj3;
                Object[] objArr = (Object[]) obj4;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.b;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gvd.D(str3, str4, av8Var2, Arrays.copyOf(objArr, 0));
                } else {
                    av8Var2.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                l6g.s((WeeklyChallengeViewModel) obj5, (Function0) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                u6h.x((si5) obj5, (Function0) obj3, (xtc) obj4, (of3) obj, aba.K(385));
                break;
            case 14:
                ((Integer) obj2).getClass();
                kda.g((gta) obj5, (gv9) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                m6k.n((sbf) obj5, (gta) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                bea.e((gta) obj5, (qbf) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                b6a.a((gv9) obj5, (xtc) obj3, (tc3) obj4, (of3) obj, aba.K(3121));
                break;
            case 18:
                ((Integer) obj2).getClass();
                xpf.a((ypf) obj5, (old) obj3, (xtc) obj4, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                xtf.a((ReferralResponse) obj5, (vnb) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                jaa.h((c3f) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 21:
                e49 e49Var = (e49) obj5;
                wla wlaVar = (wla) obj3;
                ct8 ct8Var = (ct8) obj4;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    d7a.m(e49Var.n.size(), bkh.d(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), 1.0f), l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 8.0f, null, yqo.H(787106022, av8Var3, new zya(5, wlaVar, e49Var, ct8Var)), av8Var3, 200112, 16);
                } else {
                    av8Var3.W();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                tba.d((a6c) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                pgg pggVar = (pgg) obj3;
                tgg tggVar = (tgg) obj4;
                jag jagVar = (jag) obj;
                Exception exc = (Exception) obj2;
                jagVar.getClass();
                exc.getClass();
                ((ArrayList) obj5).add(new Pair(jagVar.d, exc));
                jeg jegVar = jeg.d;
                String.valueOf(exc);
                jegVar.f(1);
                boolean z = exc instanceof qeg;
                bkg bkgVar = bkg.ERROR;
                if (z) {
                    qgg qggVar = (qgg) pggVar;
                    qggVar.getClass();
                    ngg nggVar = qggVar.b;
                    String obj6 = exc.toString();
                    String str5 = qggVar.g;
                    String str6 = qggVar.h;
                    Map map = qggVar.i;
                    ckg a2 = nggVar.a("Ad mediation error", bkgVar, "ad_mediation_error", qggVar.d, qggVar.c(new meg(obj6, str5, str6, map != null ? yfa.O(map) : null)));
                    if (a2 != null) {
                        nggVar.e(a2, qggVar.e, qggVar.f, qggVar.a, qggVar.q, qggVar.p, qggVar.r, qggVar.t, false);
                    }
                } else if (!(exc instanceof ueg)) {
                    qgg qggVar2 = (qgg) pggVar;
                    qggVar2.getClass();
                    ngg nggVar2 = qggVar2.b;
                    String obj7 = exc.toString();
                    String str7 = qggVar2.g;
                    String str8 = qggVar2.h;
                    Map map2 = qggVar2.i;
                    ckg a3 = nggVar2.a("Ad response invalid ad adapter error", bkgVar, "ad_response_invalid_ad_adapter_error", qggVar2.d, qggVar2.c(new meg(obj7, str7, str8, map2 != null ? yfa.O(map2) : null)));
                    if (a3 != null) {
                        nggVar2.e(a3, qggVar2.e, qggVar2.f, qggVar2.a, qggVar2.q, qggVar2.p, qggVar2.r, qggVar2.t, false);
                    }
                }
                String str9 = jagVar.x;
                if (str9 != null) {
                    tggVar.a(qkg.r, jagVar.y, str9);
                }
                break;
            case 24:
                csf csfVar = (csf) obj5;
                svg svgVar = (svg) obj3;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h = svgVar.h(svgVar.d(floatValue2 - csfVar.a));
                svg svgVar2 = ((qvg) obj4).a;
                csfVar.a += svgVar.d(svgVar.g(svgVar2.c(svgVar2.k, h, 1)));
                break;
            case 25:
                ((Integer) obj2).getClass();
                fyg.f((vnb) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                gyg gygVar = (gyg) obj5;
                Function1 function1 = (Function1) obj4;
                Function0 function03 = (Function0) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    utc utcVar2 = utc.a;
                    xtc q0 = ml4.q0(utcVar2);
                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C2 = fqj.C(av8Var4, q0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var4, a4, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var4, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var4, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var4, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var4, C2, f50Var3);
                    xtc e = bkh.e(bkh.d(utcVar2, 1.0f), 48.0f);
                    l8g a5 = k8g.a(ww9.b, uxf.m, av8Var4, 48);
                    int hashCode3 = Long.hashCode(av8Var4.T);
                    aee m3 = av8Var4.m();
                    xtc C3 = fqj.C(av8Var4, e);
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a5, f50Var);
                    waa.K(av8Var4, m3, ff3Var);
                    bf3.s(hashCode3, av8Var4, f50Var2, av8Var4, ryVar);
                    waa.K(av8Var4, C3, f50Var3);
                    boolean g2 = av8Var4.g(function1);
                    Object O3 = av8Var4.O();
                    if (g2 || O3 == a99Var) {
                        O3 = new vbc(15, function1);
                        av8Var4.n0(O3);
                    }
                    ao2.g((Function0) O3, null, false, null, null, s9a.d, av8Var4, 1572864, 62);
                    w1l.o(1.0f, true, av8Var4);
                    if (gygVar.c) {
                        av8Var4.d0(-1104207814);
                        e73 e73Var = gygVar.a;
                        String str10 = gygVar.b;
                        int size = gygVar.d.size();
                        boolean g3 = av8Var4.g(function1);
                        Object O4 = av8Var4.O();
                        if (g3 || O4 == a99Var) {
                            O4 = new vbc(16, function1);
                            av8Var4.n0(O4);
                        }
                        fyg.a(e73Var, str10, size, (Function0) O4, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), av8Var4, 24576);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-1103773442);
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                    fyg.b(gygVar, function1, null, function03, av8Var4, 3072);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 27:
                Player player = (Player) obj5;
                Team team = (Team) obj3;
                Context context = (Context) obj4;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (player == null || (fieldTranslations = player.getFieldTranslations()) == null || (str2 = tba.r(fieldTranslations)) == null) {
                        if (player != null) {
                            str2 = player.getName();
                        } else {
                            String A = team != null ? tba.A(context, team) : null;
                            if (A == null) {
                                str2 = "";
                            } else {
                                str = A;
                                yf8 yf8Var = xth.a;
                                udj.c(str, null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var5, 0, 24960, 109562);
                            }
                        }
                    }
                    str = str2;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str, null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var5, 0, 24960, 109562);
                } else {
                    av8Var5.W();
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                wca.g((a0i) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wca.f((vnb) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wbc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ wbc(int i, int i2, Object obj, Object obj2, Function1 function1) {
        this.a = i2;
        this.b = obj;
        this.d = function1;
        this.c = obj2;
    }

    public /* synthetic */ wbc(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
