package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.steps.h;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ere implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ere(ksa ksaVar, cz6 cz6Var, Context context, rse rseVar, koh kohVar) {
        this.a = 11;
        this.c = ksaVar;
        this.d = cz6Var;
        this.e = context;
        this.b = rseVar;
        this.f = kohVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ksa ksaVar = (ksa) obj7;
                hre hreVar = (hre) obj6;
                Function1 function1 = (Function1) obj5;
                Context context = (Context) obj4;
                cdi cdiVar = (cdi) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    g28 g28Var = bkh.c;
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                    boolean g = av8Var.g(hreVar) | av8Var.g(function1) | av8Var.i(context);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new lwc(hreVar, function1, cdiVar, context, 6);
                        av8Var.n0(O);
                    }
                    v8a.a(g28Var, ksaVar, C, null, null, null, false, null, (Function1) O, av8Var, 390, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                j72.c((t83) obj7, (String) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fz8.h((osa) obj7, (String) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(9));
                break;
            case 3:
                ((Integer) obj2).getClass();
                pco.c((h38) obj7, (Function1) obj5, (Function1) obj6, (Function0) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                k44.f((Function0) obj7, (xtc) obj6, (w8l) obj5, (ImageVector) obj4, (tc3) obj3, (of3) obj, aba.K(24577));
                break;
            case 5:
                ((Integer) obj2).getClass();
                m77.d((r77) obj7, (g9a) obj6, (Function0) obj4, (Function1) obj5, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                yso.h((z97) obj7, (Function1) obj5, (Function1) obj6, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(3073));
                break;
            case 7:
                ((Integer) obj2).getClass();
                lb7.a((ob7) obj7, (wb7) obj6, (Function1) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                h.a((et8) obj7, (Function1) obj5, (Function1) obj6, (xtc) obj4, (k7d) obj3, (of3) obj, aba.K(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ao2.f((gc7) obj7, (pu6) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                n9e.h((gv9) obj7, (ev6) obj6, (Function1) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 11:
                ksa ksaVar2 = (ksa) obj7;
                cz6 cz6Var = (cz6) obj6;
                Context context2 = (Context) obj4;
                rse rseVar = (rse) obj5;
                koh kohVar = (koh) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                    goa goaVar = new goa(1.0f, true);
                    boolean g2 = av8Var2.g(cz6Var) | av8Var2.i(context2) | av8Var2.g(rseVar);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new l50(cz6Var, rseVar, context2, kohVar, 20);
                        av8Var2.n0(O2);
                    }
                    v8a.a(goaVar, ksaVar2, C2, null, null, null, false, null, (Function1) O2, av8Var2, 384, PglCryptUtils.BASE64_FAILED);
                } else {
                    av8Var2.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                fcp.Q((ho7) obj7, (Function1) obj5, (gv9) obj6, (gv9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jl7.a((ll7) obj7, (imh) obj6, (il8) obj4, (Function1) obj5, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 14:
                ((Integer) obj2).getClass();
                fz8.l((ev6) obj7, (nl7) obj6, (Function1) obj5, (ct8) obj4, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 15:
                qug qugVar = (qug) obj7;
                View view = (View) obj6;
                e1d e1dVar = (e1d) obj5;
                gv9 gv9Var = (gv9) obj4;
                ev6 ev6Var = (ev6) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    xtc d0 = l98.d0(hkg.Z(bkh.d(utcVar, 1.0f), qugVar, ((Boolean) e1dVar.getValue()).booleanValue(), 12), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    Object O3 = av8Var3.O();
                    if (O3 == a99Var) {
                        O3 = new fw6(10, e1dVar);
                        av8Var3.n0(O3);
                    }
                    xtc u = i9a.u(d0, view, qugVar, (Function1) O3, av8Var3, 3072);
                    l8g a = k8g.a(ng0Var, uxf.l, av8Var3, 6);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, u);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    Iterator p = ljg.p(av8Var3, C3, hf3.d, -763702250, gv9Var);
                    while (p.hasNext()) {
                        e47 e47Var = (e47) p.next();
                        i2a.e(e47Var.a, e47Var.b, e47Var.c, ev6Var.A, null, true, av8Var3, 196608, 16);
                    }
                    av8Var3.s(false);
                    av8Var3.s(true);
                    nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                } else {
                    av8Var3.W();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                tn7.a((ao7) obj7, (Function0) obj6, (Function1) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                mo7.a((ro7) obj7, (String) obj6, (il8) obj4, (Function1) obj5, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                cy7.a((osa) obj7, (koh) obj6, (dy7) obj5, (ct8) obj4, (tc3) obj3, (of3) obj, aba.K(24585));
                break;
            case 19:
                ((Integer) obj2).getClass();
                m6k.f((uk4) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                t6a.a((v2f) obj7, (Function0) obj6, (Function0) obj4, (Function1) obj5, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 21:
                ((Integer) obj2).getClass();
                jca.h((xtc) obj7, (w31) obj6, (Function1) obj5, (ct8) obj4, (wla) obj3, (of3) obj, aba.K(1));
                break;
            case 22:
                xtc xtcVar = (xtc) obj7;
                e1d e1dVar2 = (e1d) obj6;
                tc3 tc3Var = (tc3) obj5;
                ko1 ko1Var = (ko1) obj4;
                Function0 function0 = (Function0) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object O4 = av8Var4.O();
                    if (O4 == a99Var) {
                        O4 = new fw6(23, e1dVar2);
                        av8Var4.n0(O4);
                    }
                    xtc A = un0.A(xtcVar, (Function1) O4);
                    k1c c = e12.c(uxf.c, true);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C4 = fqj.C(av8Var4, A);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, c, hf3.g);
                    waa.K(av8Var4, m2, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C4, hf3.d);
                    tc3Var.invoke(av8Var4, 0);
                    ko1Var.b(function0, av8Var4, 6);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 23:
                w8l w8lVar = (w8l) obj7;
                Function0 function02 = (Function0) obj6;
                ImageVector imageVector = (ImageVector) obj4;
                String str = (String) obj3;
                Function1 function12 = (Function1) obj5;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    lv1 lv1Var = uxf.m;
                    xtc c0 = l98.c0(bkh.g(wnn.B(td4.A0(utcVar, w8lVar)), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 4.0f);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var5, 48);
                    int hashCode3 = Long.hashCode(av8Var5.T);
                    aee m3 = av8Var5.m();
                    xtc C5 = fqj.C(av8Var5, c0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a2, hf3.g);
                    waa.K(av8Var5, m3, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C5, hf3.d);
                    long D = lz.D(R.color.on_color_primary, av8Var5);
                    xtc l = bkh.l(utcVar, 24.0f);
                    boolean g3 = av8Var5.g(function02);
                    Object O5 = av8Var5.O();
                    if (g3 || O5 == a99Var) {
                        O5 = new rsd(17, function02);
                        av8Var5.n0(O5);
                    }
                    kq9.b(imageVector, null, tol.y(l, false, false, false, 0L, null, (Function0) O5, av8Var5, 29), D, av8Var5, 48, 0);
                    nq8.h(av8Var5, bkh.p(utcVar, 24.0f));
                    oea.d(str, function12, null, false, 0, 0L, av8Var5, 0, 60);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                guj.b((gv9) obj7, (gv9) obj6, (Function0) obj5, (Function0) obj4, (Function2) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ere(w8l w8lVar, Function0 function0, ImageVector imageVector, String str, Function1 function1) {
        this.a = 23;
        this.c = w8lVar;
        this.d = function0;
        this.e = imageVector;
        this.f = str;
        this.b = function1;
    }

    public /* synthetic */ ere(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ere(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ere(Object obj, Object obj2, Object obj3, Function1 function1, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = function1;
        this.f = obj4;
    }

    public /* synthetic */ ere(Object obj, Function1 function1, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = function1;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
