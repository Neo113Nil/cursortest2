package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.appsflyer.internal.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class f70 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f70(gv9 gv9Var, huj hujVar, boolean z, xtc xtcVar, Function1 function1, int i) {
        this.a = 18;
        this.e = gv9Var;
        this.f = hujVar;
        this.c = z;
        this.b = xtcVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int g;
        int i2 = this.a;
        utc utcVar = utc.a;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                o02.a((gv9) obj6, (oxh) obj5, (Function1) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                xtc xtcVar = (xtc) obj3;
                Function1 function1 = (Function1) obj4;
                q80 q80Var = (q80) obj6;
                dfj dfjVar = (dfj) obj5;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc d = bkh.d(xtcVar, 1.0f);
                    l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, d);
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
                    l6g.d(this.c, function1, null, false, bt2.b(fkf.z(av8Var), lz.D(R.color.surface_1, av8Var), lz.D(R.color.primary_default, av8Var), 0L, lz.D(R.color.primary_default, av8Var), lz.D(R.color.primary_default, av8Var), 0L, 0L, 3706), av8Var, 0, 44);
                    nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                    udj.d(q80Var, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, dfjVar, av8Var, 0, 0, 262138);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                v9g.g((im) obj6, (em) obj5, this.c, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                qug qugVar = (qug) obj5;
                View view = (View) obj4;
                e1d e1dVar = (e1d) obj3;
                gv9 gv9Var = (gv9) obj6;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    xtc d0 = l98.d0(hkg.Z(bkh.d(utcVar, 1.0f), qugVar, ((Boolean) e1dVar.getValue()).booleanValue(), 12), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    Object O = av8Var2.O();
                    if (O == nf3.a) {
                        O = new fw6(1, e1dVar);
                        av8Var2.n0(O);
                    }
                    xtc u = i9a.u(d0, view, qugVar, (Function1) O, av8Var2, 3072);
                    l8g a2 = k8g.a(ng0Var, uxf.l, av8Var2, 6);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, u);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    Iterator p = ljg.p(av8Var2, C2, hf3.d, 609719653, gv9Var);
                    while (p.hasNext()) {
                        e47 e47Var = (e47) p.next();
                        i2a.e(e47Var.a, e47Var.b, e47Var.c, this.c, null, true, av8Var2, 196608, 16);
                    }
                    av8Var2.s(false);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                xw3.g((f57) obj6, this.c, (Function2) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                z8e.h((a07) obj6, (FantasyCompetitionType) obj5, (Function1) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 6:
                ((Integer) obj2).getClass();
                s9a.g((gv9) obj6, (gv9) obj5, (Function1) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 7:
                ((Integer) obj2).getClass();
                fcp.T((ua9) obj6, (String) obj5, this.c, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                nz9.c((h0a) obj6, this.c, (Gender) obj5, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                a0a.a((EventSuggest.IncidentSuggest) obj6, this.c, (String) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                l6g.q((osa) obj6, (vnb) obj5, (Function1) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(9));
                break;
            case 11:
                Function0 function0 = (Function0) obj6;
                p2h p2hVar = (p2h) obj5;
                Function1 function12 = (Function1) obj4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    pea.k(oea.v(R.string.select_sport, av8Var3), function0, null, lz.D(R.color.surface_1, av8Var3), lz.D(R.color.n_lv_1, av8Var3), s6a.N(R.drawable.ic_close, 6, av8Var3), yqo.H(-1397622604, av8Var3, new a93(p2hVar, this.c, function12, snapshotStateList, 10)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 1572864, 388);
                } else {
                    av8Var3.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                fz8.w((sz1) obj6, this.c, (Integer) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                hz8.v((List) obj6, (Function2) obj5, (Function1) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                xtc xtcVar2 = (xtc) obj3;
                Function1 function13 = (Function1) obj4;
                String str = (String) obj6;
                String str2 = (String) obj5;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    xtc d2 = bkh.d(xtcVar2, 1.0f);
                    l8g a3 = k8g.a(ww9.b, uxf.m, av8Var4, 48);
                    int hashCode3 = Long.hashCode(av8Var4.T);
                    aee m3 = av8Var4.m();
                    xtc C3 = fqj.C(av8Var4, d2);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var3);
                    } else {
                        av8Var4.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var4, a3, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var4, m3, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var4, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var4, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var4, C3, f50Var3);
                    goa goaVar = new goa(1.0f, true);
                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                    int hashCode4 = Long.hashCode(av8Var4.T);
                    aee m4 = av8Var4.m();
                    xtc C4 = fqj.C(av8Var4, goaVar);
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var3);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a4, f50Var);
                    waa.K(av8Var4, m4, ff3Var);
                    bf3.s(hashCode4, av8Var4, f50Var2, av8Var4, ryVar);
                    waa.K(av8Var4, C4, f50Var3);
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var4, 0, 0, 131066);
                    utc utcVar2 = utc.a;
                    if (str2 == null) {
                        av8Var4.d0(1556703697);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(1556703698);
                        udj.c(str2, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var4, 48, 0, 131064);
                        av8Var4.s(false);
                    }
                    i.o(av8Var4, true, utcVar2, 16.0f, av8Var4);
                    h5a.v(0, 12, 0L, av8Var4, null, function13, this.c);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                i2a.k((b2j) obj6, this.c, (n1j) obj5, (String) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 16:
                esf esfVar = (esf) obj6;
                lcj lcjVar = (lcj) obj5;
                k69 k69Var = (k69) obj4;
                esf esfVar2 = (esf) obj3;
                esfVar.a = dnd.i(esfVar.a, ((dnd) obj2).a);
                cej cejVar = lcjVar.b;
                jwj jwjVar = lcjVar.a;
                aej c = cejVar.c();
                if (c != null) {
                    eyc eycVar = c.b;
                    lcjVar.A(k69Var, dnd.i(esfVar2.a, esfVar.a));
                    boolean z = this.c;
                    if (z) {
                        i = eycVar.g(lcjVar.n());
                    } else {
                        long j = jwjVar.d().d;
                        int i3 = pej.c;
                        i = (int) (j >> 32);
                    }
                    int i4 = i;
                    if (z) {
                        long j2 = jwjVar.d().d;
                        int i5 = pej.c;
                        g = (int) (j2 & 4294967295L);
                    } else {
                        g = eycVar.g(lcjVar.n());
                    }
                    int i6 = g;
                    long j3 = jwjVar.d().d;
                    long B = lcjVar.B(jwjVar.d(), i4, i6, z, k03.j, false, false, new a79(9));
                    if (pej.d(j3) || !pej.d(B)) {
                        jwjVar.j(B);
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                oyn.q((plj) obj6, this.c, (xtc) obj3, (Function1) obj4, (Function0) obj5, (of3) obj, aba.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                guj.a((gv9) obj6, (huj) obj5, this.c, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                szj.f((vnb) obj6, this.c, (tee) obj5, (Function1) obj4, (Function2) obj3, (of3) obj, aba.K(385));
                break;
            case 20:
                ((Integer) obj2).getClass();
                x2a.r((n4k) obj6, (xtc) obj3, this.c, (ct8) obj5, (Function0) obj4, (of3) obj, aba.K(49));
                break;
            case 21:
                ((Integer) obj2).getClass();
                nq8.c((Bitmap) obj6, (jfj) obj5, (jfj) obj4, this.c, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                f1.m((ddi) obj6, (Function0) obj5, (Function1) obj4, (os8) obj3, this.c, (of3) obj, 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f70(xtc xtcVar, boolean z, Function1 function1, CharSequence charSequence, Object obj, int i) {
        this.a = i;
        this.b = xtcVar;
        this.c = z;
        this.d = function1;
        this.e = charSequence;
        this.f = obj;
    }

    public /* synthetic */ f70(esf esfVar, lcj lcjVar, k69 k69Var, esf esfVar2, boolean z) {
        this.a = 16;
        this.e = esfVar;
        this.f = lcjVar;
        this.d = k69Var;
        this.b = esfVar2;
        this.c = z;
    }

    public /* synthetic */ f70(qug qugVar, View view, e1d e1dVar, gv9 gv9Var, boolean z) {
        this.a = 3;
        this.f = qugVar;
        this.d = view;
        this.b = e1dVar;
        this.e = gv9Var;
        this.c = z;
    }

    public /* synthetic */ f70(ddi ddiVar, Function0 function0, Function1 function1, os8 os8Var, boolean z, int i) {
        this.a = 22;
        this.e = ddiVar;
        this.f = function0;
        this.d = function1;
        this.b = os8Var;
        this.c = z;
    }

    public /* synthetic */ f70(plj pljVar, boolean z, xtc xtcVar, Function1 function1, Function0 function0, int i) {
        this.a = 17;
        this.e = pljVar;
        this.c = z;
        this.b = xtcVar;
        this.d = function1;
        this.f = function0;
    }

    public /* synthetic */ f70(n4k n4kVar, xtc xtcVar, boolean z, ct8 ct8Var, Function0 function0, int i) {
        this.a = 20;
        this.e = n4kVar;
        this.b = xtcVar;
        this.c = z;
        this.f = ct8Var;
        this.d = function0;
    }

    public /* synthetic */ f70(Object obj, Object obj2, Object obj3, boolean z, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.f = obj2;
        this.d = obj3;
        this.c = z;
        this.b = xtcVar;
    }

    public /* synthetic */ f70(Object obj, Object obj2, boolean z, dt8 dt8Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.f = obj2;
        this.c = z;
        this.d = dt8Var;
        this.b = xtcVar;
    }

    public /* synthetic */ f70(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.c = z;
        this.f = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public /* synthetic */ f70(Function0 function0, p2h p2hVar, boolean z, Function1 function1, SnapshotStateList snapshotStateList) {
        this.a = 11;
        this.e = function0;
        this.f = p2hVar;
        this.c = z;
        this.d = function1;
        this.b = snapshotStateList;
    }
}
