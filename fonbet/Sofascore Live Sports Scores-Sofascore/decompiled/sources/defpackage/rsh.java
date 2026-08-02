package defpackage;

import com.sofascore.model.TeamSelection;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rsh implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rsh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0422  */
    @Override // defpackage.et8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        int i;
        Object O;
        Object O2;
        boolean z4;
        int i2 = this.a;
        int i3 = R.color.neutral_default;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i2) {
            case 0:
                hth hthVar = (hth) obj6;
                final vfi vfiVar = (vfi) obj5;
                of3 of3Var = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 129) != 128)) {
                    for (Object obj7 : hthVar.a) {
                        if (((tfi) obj7) instanceof hvc) {
                            obj7.getClass();
                            n2k n2kVar = (n2k) obj7;
                            q50 q50Var = vfiVar.a;
                            final float floatValue = ((Number) q50Var.d()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Number) vfiVar.h.d()).floatValue() / ((Number) q50Var.d()).floatValue();
                            final float floatValue2 = ((Number) q50Var.d()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : ((Number) vfiVar.i.d()).floatValue() / ((Number) q50Var.d()).floatValue();
                            g28 g28Var = bkh.c;
                            boolean d = av8Var.d(floatValue) | av8Var.d(floatValue2) | av8Var.g(vfiVar);
                            Object O3 = av8Var.O();
                            if (d || O3 == a99Var) {
                                O3 = new Function1() { // from class: qsh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj8) {
                                        f4g f4gVar = (f4g) obj8;
                                        f4gVar.getClass();
                                        f4gVar.k(floatValue);
                                        f4gVar.l(floatValue2);
                                        f4gVar.b(((Number) vfiVar.c.d()).floatValue());
                                        return Unit.a;
                                    }
                                };
                                av8Var.n0(O3);
                            }
                            xtc M = s02.M(g28Var, (Function1) O3);
                            k1c c = e12.c(uxf.c, false);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m = av8Var.m();
                            xtc C = fqj.C(av8Var, M);
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
                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C, hf3.d);
                            if (hthVar.f) {
                                av8Var.d0(39280488);
                                t2k.c(n2kVar.f(), n2kVar.c(), n2kVar.b(), Math.max(floatValue, floatValue2), null, av8Var, 0);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(39643467);
                                av8Var.s(false);
                            }
                            av8Var.s(true);
                        }
                    }
                    ogj.m("Collection contains no element matching the predicate.");
                    break;
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                fk1 fk1Var = (fk1) obj6;
                Function1 function1 = (Function1) obj5;
                ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 129) != 128)) {
                    ek1.c(fk1Var, function1, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                fv5 fv5Var = (fv5) obj6;
                Function1 function12 = (Function1) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var3 = (of3) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 129) != 128)) {
                    gv9 gv9Var = fv5Var.b;
                    TeamSelection teamSelection = fv5Var.a;
                    boolean g = av8Var3.g(function12);
                    Object O4 = av8Var3.O();
                    if (g || O4 == a99Var) {
                        O4 = new vi(23, function12);
                        av8Var3.n0(O4);
                    }
                    l4a.a(gv9Var, teamSelection, (Function1) O4, n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var3), oyn.e), null, false, av8Var3, 0, 48);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                hu6 hu6Var = (hu6) obj6;
                Function1 function13 = (Function1) obj5;
                u77 u77Var = (u77) obj2;
                of3 of3Var4 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                u77Var.getClass();
                k1c c2 = e12.c(uxf.g, false);
                av8 av8Var4 = (av8) of3Var4;
                int hashCode2 = Long.hashCode(av8Var4.T);
                aee m2 = av8Var4.m();
                xtc C2 = fqj.C(of3Var4, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8 av8Var5 = (av8) of3Var4;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var2);
                } else {
                    av8Var5.q0();
                }
                waa.K(of3Var4, c2, hf3.g);
                waa.K(of3Var4, m2, hf3.f);
                waa.K(of3Var4, Integer.valueOf(hashCode2), hf3.j);
                waa.J(of3Var4, hf3.k);
                waa.K(of3Var4, C2, hf3.d);
                do7 do7Var = hu6Var.b;
                ho7 ho7Var = hu6Var.c;
                if (do7Var != null) {
                    av8Var5.d0(2001228902);
                    int ordinal = u77Var.ordinal();
                    if (ordinal == 0) {
                        av8Var5.d0(2001307115);
                        xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean z5 = hu6Var.k;
                        boolean z6 = hu6Var.j;
                        boolean g2 = av8Var5.g(function13);
                        Object O5 = av8Var5.O();
                        if (g2 || O5 == a99Var) {
                            O5 = new rt6(7, function13);
                            av8Var5.n0(O5);
                        }
                        Function0 function0 = (Function0) O5;
                        boolean g3 = av8Var5.g(function13);
                        Object O6 = av8Var5.O();
                        if (g3 || O6 == a99Var) {
                            O6 = new rt6(8, function13);
                            av8Var5.n0(O6);
                        }
                        iz8.f(function0, (Function0) O6, z5, z6, d0, of3Var4, 24576);
                        z = false;
                        av8Var5.s(false);
                    } else if (ordinal != 1) {
                        av8Var5.d0(2002849334);
                        yf8 yf8Var = xth.a;
                        udj.c(oea.v(R.string.fantasy_highlights_not_available, of3Var4), l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, of3Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.b(), of3Var4, 48, 384, 126968);
                        z = false;
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(2001961122);
                        if (ho7Var != null) {
                            av8Var5.d0(2002063887);
                            xtc d02 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            ev6 ev6Var = hu6Var.b.c;
                            mj7 mj7Var = ho7Var.a;
                            rd0.k(ev6Var, mj7Var.a, mj7Var.b, mj7Var.c, d02, mj7Var.d(), false, of3Var4, 1597440);
                            z = false;
                            av8Var5.s(false);
                        } else {
                            z = false;
                            av8Var5.d0(2002734758);
                            av8Var5.s(false);
                        }
                        av8Var5.s(z);
                    }
                    av8Var5.s(z);
                } else {
                    av8Var5.d0(2003341862);
                    av8Var5.s(false);
                }
                av8Var5.s(true);
                break;
            case 4:
                ll7 ll7Var = (ll7) obj6;
                Function1 function14 = (Function1) obj5;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                of3 of3Var5 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                if (booleanValue) {
                    av8 av8Var6 = (av8) of3Var5;
                    av8Var6.d0(1837130004);
                    if (ll7Var.f) {
                        str = ljg.k(av8Var6, -79283109, R.string.cancel, av8Var6, false);
                    } else {
                        av8Var6.d0(1837236395);
                        av8Var6.s(false);
                        str = null;
                    }
                    String v = oea.v(R.string.confirm, av8Var6);
                    boolean z7 = ll7Var.g;
                    boolean z8 = ll7Var.i;
                    xtc f0 = ml4.f0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var6), oyn.e));
                    boolean g4 = av8Var6.g(function14);
                    Object O7 = av8Var6.O();
                    if (g4 || O7 == a99Var) {
                        O7 = new l77(11, function14);
                        av8Var6.n0(O7);
                    }
                    Function0 function02 = (Function0) O7;
                    boolean g5 = av8Var6.g(function14);
                    Object O8 = av8Var6.O();
                    if (g5 || O8 == a99Var) {
                        O8 = new l77(12, function14);
                        av8Var6.n0(O8);
                    }
                    o1j.b(str, v, function02, (Function0) O8, f0, false, z7, z8, av8Var6, 0, 32);
                    av8Var6.s(false);
                } else {
                    av8 av8Var7 = (av8) of3Var5;
                    av8Var7.d0(1837921217);
                    e12.a(6, av8Var7, bkh.d(utcVar, 1.0f));
                    av8Var7.s(false);
                }
                break;
            case 5:
                q1e q1eVar = (q1e) obj6;
                Function1 function15 = (Function1) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var6 = (of3) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var8 = (av8) of3Var6;
                if (av8Var8.T(intValue4 & 1, (intValue4 & 129) != 128)) {
                    boolean g6 = av8Var8.g(function15);
                    Object O9 = av8Var8.O();
                    if (g6 || O9 == a99Var) {
                        O9 = new k1e(0, function15);
                        av8Var8.n0(O9);
                    }
                    Function1 function16 = (Function1) O9;
                    boolean g7 = av8Var8.g(function15);
                    Object O10 = av8Var8.O();
                    if (g7 || O10 == a99Var) {
                        O10 = new vbc(12, function15);
                        av8Var8.n0(O10);
                    }
                    xw3.h(q1eVar, function16, (Function0) O10, av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                break;
            case 6:
                gv9 gv9Var2 = (gv9) obj6;
                f6i f6iVar = (f6i) obj5;
                int intValue5 = ((Integer) obj2).intValue();
                of3 of3Var7 = (of3) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((av8) of3Var7).e(intValue5) ? 32 : 16;
                }
                av8 av8Var9 = (av8) of3Var7;
                if (av8Var9.T(intValue6 & 1, (intValue6 & 145) != 144)) {
                    un0.a(l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(8.0f), rd0.t(lz.D(R.color.surface_1, av8Var9), av8Var9, 0), null, null, yqo.H(1159406955, av8Var9, new w54(gv9Var2, intValue5, f6iVar, 4)), av8Var9, 196614, 24);
                } else {
                    av8Var9.W();
                }
                break;
            case 7:
                gui guiVar = (gui) obj6;
                Function1 function17 = (Function1) obj5;
                r1k r1kVar = (r1k) obj2;
                of3 of3Var8 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                r1kVar.getClass();
                utc utcVar2 = utc.a;
                xtc d2 = bkh.d(utcVar2, 1.0f);
                u23 a = t23.a(ww9.d, uxf.p, of3Var8, 48);
                av8 av8Var10 = (av8) of3Var8;
                int hashCode3 = Long.hashCode(av8Var10.T);
                aee m3 = av8Var10.m();
                xtc C3 = fqj.C(of3Var8, d2);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8 av8Var11 = (av8) of3Var8;
                av8Var11.h0();
                if (av8Var11.S) {
                    av8Var11.l(zg3Var3);
                } else {
                    av8Var11.q0();
                }
                waa.K(of3Var8, a, hf3.g);
                waa.K(of3Var8, m3, hf3.f);
                waa.K(of3Var8, Integer.valueOf(hashCode3), hf3.j);
                waa.J(of3Var8, hf3.k);
                waa.K(of3Var8, C3, hf3.d);
                gv9 gv9Var3 = guiVar.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : gv9Var3) {
                    if (((Boolean) r1kVar.b.invoke((fui) obj8)).booleanValue()) {
                        arrayList.add(obj8);
                    }
                }
                if (arrayList.isEmpty()) {
                    av8Var11.d0(1804470702);
                    kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, of3Var8), null, bkh.l(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 96.0f), lz.D(R.color.neutral_default, of3Var8), of3Var8, 432, 0);
                    String v2 = oea.v(R.string.major_trophies_empty_state_text, of3Var8);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v2, l98.f0(l98.d0(utcVar2, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 7), lz.D(R.color.n_lv_3, of3Var8), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), of3Var8, 48, 0, 130040);
                    av8Var11.s(false);
                } else {
                    av8Var11.d0(1804279804);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        gvd.q((fui) it.next(), function17, of3Var8, 0);
                    }
                    av8Var11.s(false);
                }
                av8Var11.s(true);
                break;
            case 8:
                Function0 function03 = (Function0) obj6;
                gv9 gv9Var4 = (gv9) obj5;
                mh mhVar = (mh) obj2;
                of3 of3Var9 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                mhVar.getClass();
                int ordinal2 = mhVar.ordinal();
                utc utcVar3 = utc.a;
                if (ordinal2 == 1) {
                    av8 av8Var12 = (av8) of3Var9;
                    av8Var12.d0(-1836938456);
                    mha.h(oea.v(R.string.compare, av8Var12), function03, bkh.q(l98.f0(utcVar3, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oqh.a, null, false, false, false, 0L, 0, 0, av8Var12, 3456, 0, 2032);
                    av8Var12.s(false);
                } else if (ordinal2 != 2) {
                    av8 av8Var13 = (av8) of3Var9;
                    av8Var13.d0(1326257617);
                    av8Var13.s(false);
                } else {
                    av8 av8Var14 = (av8) of3Var9;
                    av8Var14.d0(-1836504580);
                    if (gv9Var4 == null || !gv9Var4.isEmpty()) {
                        Iterator<E> it2 = gv9Var4.iterator();
                        while (it2.hasNext()) {
                            if (((k0j) it2.next()).a.a == 241802) {
                                z2 = false;
                                xtc l = bkh.l(l98.f0(utcVar3, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 32.0f);
                                if (z2) {
                                    z3 = false;
                                    i = 1326242112;
                                } else {
                                    i = 1326241312;
                                    i3 = R.color.primary_default;
                                    z3 = false;
                                }
                                xtc b0 = l98.b0(n9e.q(l, ljg.f(av8Var14, i, i3, av8Var14, z3), o7g.a), 8.0f);
                                long D = lz.D(R.color.n_lv_4, av8Var14);
                                O = av8Var14.O();
                                if (O == a99Var) {
                                    O = mz1.e(av8Var14);
                                }
                                wzc wzcVar = (wzc) O;
                                Object[] objArr = new Object[0];
                                O2 = av8Var14.O();
                                if (O2 == a99Var) {
                                    O2 = nuh.D;
                                    av8Var14.n0(O2);
                                }
                                kq9.b(s6a.N(R.drawable.ic_plus_16, 6, av8Var14), null, tol.y(b0, z2, true, true, D, wzcVar, new cyg(function03, (boh) o3a.N(objArr, (Function0) O2, av8Var14, 48), 20), av8Var14, 0), lz.D(R.color.surface_1, av8Var14), av8Var14, 48, 0);
                                av8Var14.s(false);
                            }
                        }
                    }
                    z2 = true;
                    xtc l2 = bkh.l(l98.f0(utcVar3, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 32.0f);
                    if (z2) {
                    }
                    xtc b02 = l98.b0(n9e.q(l2, ljg.f(av8Var14, i, i3, av8Var14, z3), o7g.a), 8.0f);
                    long D2 = lz.D(R.color.n_lv_4, av8Var14);
                    O = av8Var14.O();
                    if (O == a99Var) {
                    }
                    wzc wzcVar2 = (wzc) O;
                    Object[] objArr2 = new Object[0];
                    O2 = av8Var14.O();
                    if (O2 == a99Var) {
                    }
                    kq9.b(s6a.N(R.drawable.ic_plus_16, 6, av8Var14), null, tol.y(b02, z2, true, true, D2, wzcVar2, new cyg(function03, (boh) o3a.N(objArr2, (Function0) O2, av8Var14, 48), 20), av8Var14, 0), lz.D(R.color.surface_1, av8Var14), av8Var14, 48, 0);
                    av8Var14.s(false);
                }
                break;
            case 9:
                int intValue7 = ((Integer) obj2).intValue();
                of3 of3Var10 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                gv9 gv9Var5 = (gv9) ((tee) obj6).get(((gv9) obj5).get(intValue7));
                if (gv9Var5 == null) {
                    av8 av8Var15 = (av8) of3Var10;
                    av8Var15.d0(-1030120209);
                    av8Var15.s(false);
                } else {
                    av8 av8Var16 = (av8) of3Var10;
                    av8Var16.d0(-1030120208);
                    xtc d3 = bkh.d(utcVar, 1.0f);
                    u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var16, 6);
                    int hashCode4 = Long.hashCode(av8Var16.T);
                    aee m4 = av8Var16.m();
                    xtc C4 = fqj.C(av8Var16, d3);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var16.h0();
                    if (av8Var16.S) {
                        av8Var16.l(zg3Var4);
                    } else {
                        av8Var16.q0();
                    }
                    waa.K(av8Var16, a2, hf3.g);
                    waa.K(av8Var16, m4, hf3.f);
                    waa.K(av8Var16, Integer.valueOf(hashCode4), hf3.j);
                    waa.J(av8Var16, hf3.k);
                    waa.K(av8Var16, C4, hf3.d);
                    if (gv9Var5.size() <= 3) {
                        av8Var16.d0(946776153);
                        Iterator<E> it3 = gv9Var5.iterator();
                        while (it3.hasNext()) {
                            i2a.b((xel) it3.next(), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var16, 0, 6);
                        }
                        z4 = false;
                        av8Var16.s(false);
                    } else {
                        av8Var16.d0(946963548);
                        boolean g8 = av8Var16.g(gv9Var5);
                        Object O11 = av8Var16.O();
                        if (g8 || O11 == a99Var) {
                            O11 = CollectionsKt.Q(2, gv9Var5);
                            av8Var16.n0(O11);
                        }
                        for (List list : (List) O11) {
                            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var16, 6);
                            int hashCode5 = Long.hashCode(av8Var16.T);
                            aee m5 = av8Var16.m();
                            xtc C5 = fqj.C(av8Var16, utcVar);
                            if3.k7.getClass();
                            zg3 zg3Var5 = hf3.b;
                            av8Var16.h0();
                            if (av8Var16.S) {
                                av8Var16.l(zg3Var5);
                            } else {
                                av8Var16.q0();
                            }
                            waa.K(av8Var16, a3, hf3.g);
                            waa.K(av8Var16, m5, hf3.f);
                            waa.K(av8Var16, Integer.valueOf(hashCode5), hf3.j);
                            waa.J(av8Var16, hf3.k);
                            waa.K(av8Var16, C5, hf3.d);
                            i2a.c((xel) list.get(0), av8Var16, 6);
                            if (list.size() > 1) {
                                av8Var16.d0(247376887);
                                i2a.c((xel) list.get(1), av8Var16, 6);
                                av8Var16.s(false);
                            } else {
                                av8Var16.d0(247489076);
                                if (1.0f <= 0.0d) {
                                    p3a.a("invalid weight; must be greater than zero");
                                }
                                nq8.h(av8Var16, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                                av8Var16.s(false);
                            }
                            av8Var16.s(true);
                        }
                        z4 = false;
                        av8Var16.s(false);
                    }
                    av8Var16.s(true);
                    av8Var16.s(z4);
                }
                break;
            default:
                Integer num = (Integer) obj6;
                Function1 function18 = (Function1) obj5;
                gv9 gv9Var6 = (gv9) obj2;
                of3 of3Var11 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                if (gv9Var6 == null) {
                    av8 av8Var17 = (av8) of3Var11;
                    av8Var17.d0(883177319);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, lz.D(R.color.on_color_highlight_2, av8Var17), lz.D(R.color.on_color_secondary, av8Var17), av8Var17, bkh.e(bkh.d(utcVar, 1.0f), 274.0f));
                    av8Var17.s(false);
                } else if (gv9Var6.isEmpty()) {
                    av8 av8Var18 = (av8) of3Var11;
                    av8Var18.d0(883517761);
                    xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_highlight_2, av8Var18), o7g.a(8.0f)), 24.0f, 84.0f);
                    u23 a4 = t23.a(ww9.d, uxf.p, av8Var18, 48);
                    int hashCode6 = Long.hashCode(av8Var18.T);
                    aee m6 = av8Var18.m();
                    xtc C6 = fqj.C(av8Var18, c0);
                    if3.k7.getClass();
                    zg3 zg3Var6 = hf3.b;
                    av8Var18.h0();
                    if (av8Var18.S) {
                        av8Var18.l(zg3Var6);
                    } else {
                        av8Var18.q0();
                    }
                    waa.K(av8Var18, a4, hf3.g);
                    waa.K(av8Var18, m6, hf3.f);
                    waa.K(av8Var18, Integer.valueOf(hashCode6), hf3.j);
                    waa.J(av8Var18, hf3.k);
                    waa.K(av8Var18, C6, hf3.d);
                    kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var18), null, bkh.l(utcVar, 48.0f), lz.D(R.color.on_color_primary, av8Var18), av8Var18, 432, 0);
                    xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String v3 = oea.v(R.string.coming_soon, av8Var18);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v3, f02, lz.D(R.color.on_color_primary, av8Var18), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var18, 48, 0, 130040);
                    udj.c(oea.v(R.string.empty_state_videos_first_match, av8Var18), l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.on_color_secondary, av8Var18), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var18, 48, 0, 130040);
                    av8Var18.s(true);
                    av8Var18.s(false);
                } else {
                    av8 av8Var19 = (av8) of3Var11;
                    av8Var19.d0(885091569);
                    xtc d4 = bkh.d(utcVar, 1.0f);
                    u23 a5 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var19, 6);
                    int hashCode7 = Long.hashCode(av8Var19.T);
                    aee m7 = av8Var19.m();
                    xtc C7 = fqj.C(av8Var19, d4);
                    if3.k7.getClass();
                    zg3 zg3Var7 = hf3.b;
                    av8Var19.h0();
                    if (av8Var19.S) {
                        av8Var19.l(zg3Var7);
                    } else {
                        av8Var19.q0();
                    }
                    waa.K(av8Var19, a5, hf3.g);
                    waa.K(av8Var19, m7, hf3.f);
                    waa.K(av8Var19, Integer.valueOf(hashCode7), hf3.j);
                    waa.J(av8Var19, hf3.k);
                    waa.K(av8Var19, C7, hf3.d);
                    av8Var19.d0(-1801917318);
                    Iterator it4 = CollectionsKt.L0(gv9Var6, 3).iterator();
                    while (it4.hasNext()) {
                        q5a.j((jqk) it4.next(), num, function18, av8Var19, 0);
                    }
                    ljg.t(av8Var19, false, true, false);
                }
                break;
        }
        return Unit.a;
    }
}
