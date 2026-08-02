package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hs3 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hs3(List list, Object obj, dt8 dt8Var, Object obj2, int i) {
        this.a = i;
        this.c = list;
        this.b = obj;
        this.d = dt8Var;
        this.e = obj2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        Object obj5;
        int i6;
        int i7 = this.a;
        int i8 = 3;
        Object obj6 = nf3.a;
        utc utcVar = utc.a;
        Object obj7 = this.e;
        List list = this.c;
        Object obj8 = this.d;
        Object obj9 = this.b;
        switch (i7) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Object obj10 = (vnb) obj7;
                Object obj11 = (Function1) obj8;
                Object obj12 = (Function1) obj9;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    kfk kfkVar = (kfk) list.get(intValue);
                    av8Var.d0(-1749510327);
                    boolean g = av8Var.g(obj12) | av8Var.g(kfkVar);
                    Object O = av8Var.O();
                    if (g || O == obj6) {
                        O = new pi(4, obj12, kfkVar);
                        av8Var.n0(O);
                    }
                    Function0 function0 = (Function0) O;
                    boolean g2 = av8Var.g(obj11) | av8Var.g(obj10) | av8Var.g(kfkVar);
                    Object O2 = av8Var.O();
                    if (g2 || O2 == obj6) {
                        O2 = new gi(4, obj11, obj10, kfkVar);
                        av8Var.n0(O2);
                    }
                    t62.c(kfkVar, function0, (Function0) O2, xpa.a(xpaVar, utcVar, 7), av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    o95 o95Var = (o95) ((gv9) list).get(intValue3);
                    av8Var2.d0(-468982254);
                    Integer num = (Integer) ((eoh) ((xyf) obj8).b.c).getValue();
                    xtc d0 = (num != null && num.intValue() == intValue3 && ((wyf) o95Var).d) ? l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1) : utcVar;
                    wyf wyfVar = (wyf) o95Var;
                    av8Var2.d0(1052928241);
                    EventSuggest.IncidentSuggest incidentSuggest = wyfVar.a;
                    boolean contains = ((e0a) obj7).c.contains(Integer.valueOf(incidentSuggest.getId()));
                    nq8.h(av8Var2, n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 1.0f), lz.D(R.color.surface_0, av8Var2), oyn.e));
                    if (wyfVar.b) {
                        av8Var2.d0(1053217129);
                        a0a.a(incidentSuggest, contains, oea.v(R.string.crowdsourcing_add_scorer, av8Var2), (Function1) obj9, xpa.a(xpaVar2, d0, 7), av8Var2, 0);
                        z = false;
                        av8Var2.s(false);
                    } else {
                        z = false;
                        av8Var2.d0(1053566034);
                        a0a.c(incidentSuggest, oea.v(R.string.crowdsourcing_add_scorer, av8Var2), (Function1) obj9, xpa.a(xpaVar2, d0, 7), contains, null, av8Var2, 0, 32);
                        av8Var2.s(false);
                    }
                    av8Var2.s(z);
                    av8Var2.s(z);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                xpa xpaVar3 = (xpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((av8) of3Var3).g(xpaVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((av8) of3Var3).e(intValue5) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    kxe kxeVar = (kxe) ((gv9) list).get(intValue5);
                    av8Var3.d0(1792101583);
                    xtc a = xpa.a(xpaVar3, l98.d0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var3), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 7);
                    boolean z2 = !kxeVar.e;
                    long D = lz.D(R.color.n_lv_4, av8Var3);
                    Object O3 = av8Var3.O();
                    if (O3 == obj6) {
                        O3 = mz1.e(av8Var3);
                    }
                    wzc wzcVar = (wzc) O3;
                    Object[] objArr = new Object[0];
                    Object O4 = av8Var3.O();
                    if (O4 == obj6) {
                        O4 = fi.B;
                        av8Var3.n0(O4);
                    }
                    kik.a(kxeVar, false, null, tol.y(a, z2, true, true, D, wzcVar, new b32((boh) o3a.N(objArr, (Function0) O4, av8Var3, 48), (ce8) obj9, (Function2) obj8, (m44) obj7, kxeVar, 3), av8Var3, 0), av8Var3, 432);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                xpa xpaVar4 = (xpa) obj;
                int intValue7 = ((Number) obj2).intValue();
                of3 of3Var4 = (of3) obj3;
                int intValue8 = ((Number) obj4).intValue();
                BaseActivity baseActivity = (BaseActivity) obj7;
                f06 f06Var = (f06) obj8;
                Function1 function1 = (Function1) obj9;
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((av8) of3Var4).g(xpaVar4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((av8) of3Var4).e(intValue7) ? 32 : 16;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    j9b j9bVar = (j9b) list.get(intValue7);
                    av8Var4.d0(1962267776);
                    boolean z3 = intValue7 == b.i(f06Var.b.a);
                    if (j9bVar instanceof g9b) {
                        av8Var4.d0(1962352281);
                        String a2 = ((g9b) j9bVar).a.a(av8Var4);
                        String v = oea.v(R.string.read_more, av8Var4);
                        long D2 = lz.D(R.color.surface_2, av8Var4);
                        xtc b0 = l98.b0(u0a.F(utcVar, z3 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 62), 8.0f);
                        boolean i9 = av8Var4.i(baseActivity);
                        Object O5 = av8Var4.O();
                        if (i9 || O5 == obj6) {
                            O5 = new q01(baseActivity, i8);
                            av8Var4.n0(O5);
                        }
                        x2a.e(a2, (Function0) O5, b0, null, 0L, D2, v, 0, null, 0, 0, 0, av8Var4, 0, 0, 8088);
                        av8Var4.s(false);
                    } else if (j9bVar instanceof i9b) {
                        av8Var4.d0(1963287241);
                        rha.b(((i9b) j9bVar).a.a(av8Var4), u0a.F(utcVar, z3 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 62), 0L, av8Var4, 0, 4);
                        av8Var4.s(false);
                    } else if (j9bVar instanceof h9b) {
                        av8Var4.d0(1963711941);
                        h9b h9bVar = (h9b) j9bVar;
                        boolean i10 = av8Var4.i(j9bVar) | av8Var4.g(function1);
                        Object O6 = av8Var4.O();
                        if (i10 || O6 == obj6) {
                            O6 = new d06(h9bVar, function1, 0);
                            av8Var4.n0(O6);
                        }
                        cga.f(h9bVar, (Function0) O6, u0a.F(utcVar, z3 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 62), av8Var4, 0);
                        av8Var4.s(false);
                    } else {
                        if (!(j9bVar instanceof p9b)) {
                            throw dmi.h(av8Var4, -1460719492, false);
                        }
                        av8Var4.d0(1964380735);
                        p9b p9bVar = (p9b) j9bVar;
                        r8b r8bVar = f06Var.d;
                        bnf bnfVar = f06Var.e;
                        xtc F = u0a.F(utcVar, z3 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 62);
                        boolean i11 = av8Var4.i(j9bVar) | av8Var4.g(function1);
                        Object O7 = av8Var4.O();
                        if (i11 || O7 == obj6) {
                            O7 = new uw5(function1, p9bVar, 1);
                            av8Var4.n0(O7);
                        }
                        m9b.c(p9bVar, (Function0) O7, F, r8bVar, bnfVar, av8Var4, 0, 0);
                        av8Var4.s(false);
                    }
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                xpa xpaVar5 = (xpa) obj;
                int intValue9 = ((Number) obj2).intValue();
                of3 of3Var5 = (of3) obj3;
                int intValue10 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj9;
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((av8) of3Var5).g(xpaVar5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((av8) of3Var5).e(intValue9) ? 32 : 16;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(i5 & 1, (i5 & 147) != 146)) {
                    mj7 mj7Var = (mj7) list.get(intValue9);
                    av8Var5.d0(-2088969093);
                    Iterator<E> it = ((gv9) obj8).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (((ho7) obj5).a.a == mj7Var.a) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    ho7 ho7Var = (ho7) obj5;
                    boolean z4 = mj7Var.a == ((ho7) obj7).a.a;
                    Integer num2 = ho7Var != null ? ho7Var.b : null;
                    boolean c = Intrinsics.c(ho7Var != null ? Boolean.valueOf(ho7Var.h) : null, Boolean.TRUE);
                    boolean z5 = ho7Var == null;
                    boolean g3 = av8Var5.g(ho7Var) | av8Var5.g(function12);
                    Object O8 = av8Var5.O();
                    if (g3 || O8 == obj6) {
                        O8 = new j87(12, ho7Var, function12);
                        av8Var5.n0(O8);
                    }
                    fcp.R(mj7Var, num2, c, z5, z4, (Function1) O8, null, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            default:
                xpa xpaVar6 = (xpa) obj;
                int intValue11 = ((Number) obj2).intValue();
                of3 of3Var6 = (of3) obj3;
                int intValue12 = ((Number) obj4).intValue();
                Function1 function13 = (Function1) obj9;
                bza bzaVar = (bza) obj8;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((av8) of3Var6).g(xpaVar6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((av8) of3Var6).e(intValue11) ? 32 : 16;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(i6 & 1, (i6 & 147) != 146)) {
                    u2f u2fVar = (u2f) list.get(intValue11);
                    av8Var6.d0(1160738332);
                    boolean z6 = intValue11 == b.i(bzaVar.h);
                    boolean z7 = bzaVar.j;
                    xtc e = bkh.e(xpa.a(xpaVar6, (xtc) obj7, 7), 40.0f);
                    if (z6) {
                        e = e.z(wnn.A(utcVar, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)));
                    }
                    xtc q = n9e.q(e, lz.D(R.color.surface_1, av8Var6), oyn.e);
                    boolean z8 = !u2fVar.e;
                    boolean g4 = av8Var6.g(function13) | av8Var6.g(u2fVar);
                    Object O9 = av8Var6.O();
                    if (g4 || O9 == obj6) {
                        O9 = new pi(18, function13, u2fVar);
                        av8Var6.n0(O9);
                    }
                    tz9.g(u2fVar, z7, l98.f0(tol.y(q, z8, false, false, 0L, null, (Function0) O9, av8Var6, 30), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, z6 ? 8.0f : 0.0f, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var6, 0, 56);
                    av8Var6.s(false);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ hs3(List list, Object obj, Object obj2, Function1 function1, int i) {
        this.a = i;
        this.c = list;
        this.d = obj;
        this.e = obj2;
        this.b = function1;
    }
}
