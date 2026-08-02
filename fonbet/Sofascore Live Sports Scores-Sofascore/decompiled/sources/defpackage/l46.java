package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l46 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public l46(List list, Function1 function1, gf7 gf7Var) {
        this.a = 2;
        this.b = list;
        this.c = function1;
        this.d = gf7Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Function1 function1 = (Function1) this.c;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            z1j z1jVar = (z1j) this.b.get(intValue);
            av8Var.d0(960555756);
            boolean z = z1jVar instanceof t1j;
            utc utcVar = utc.a;
            a99 a99Var = nf3.a;
            if (z) {
                av8Var.d0(960437490);
                t1j t1jVar = (t1j) z1jVar;
                a2j a2jVar = t1jVar.a;
                xtc F = u0a.F(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), icb.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54);
                boolean z2 = a2jVar.a != null;
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = nuh.o;
                    av8Var.n0(O2);
                }
                xtc y = tol.y(F, z2, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), (Object) t1jVar, function1, 5), av8Var, 0);
                av8Var = av8Var;
                d2a.f(a2jVar, y, av8Var, 0);
                av8Var.s(false);
            } else if (z1jVar instanceof y1j) {
                av8Var.d0(961196897);
                xtc b0 = l98.b0(u0a.F(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), icb.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54), 16.0f);
                l8g a = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
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
                y1j y1jVar = (y1j) z1jVar;
                String a2 = y1jVar.a.a(av8Var);
                long D2 = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(a2, new goa(1.0f, true), D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
                udj.c(y1jVar.b, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            } else if (z1jVar instanceof v1j) {
                av8Var.d0(962327777);
                String str = ((v1j) z1jVar).b;
                long D3 = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(str, l98.e0(u0a.F(bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54), 16.0f, 14.0f, 16.0f, 8.0f), D3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                int i2 = 6;
                if (z1jVar instanceof u1j) {
                    av8Var.d0(963065019);
                    u1j u1jVar = (u1j) z1jVar;
                    b2j b2jVar = u1jVar.a;
                    boolean z3 = u1jVar.c;
                    boolean z4 = u1jVar.b;
                    icb icbVar = (!z4 || z3) ? z4 ? icb.a : !z3 ? icb.c : icb.b : icb.d;
                    n1j n1jVar = ((d2j) this.d).b;
                    String str2 = b2jVar.t;
                    xtc F2 = u0a.F(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z4 ? 8.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), icbVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54);
                    boolean e = dti.e(b2jVar.t);
                    long D4 = lz.D(R.color.n_lv_4, av8Var);
                    Object O3 = av8Var.O();
                    if (O3 == a99Var) {
                        O3 = mz1.e(av8Var);
                    }
                    wzc wzcVar2 = (wzc) O3;
                    Object[] objArr2 = new Object[0];
                    Object O4 = av8Var.O();
                    if (O4 == a99Var) {
                        O4 = nuh.p;
                        av8Var.n0(O4);
                    }
                    i2a.k(b2jVar, z3, n1jVar, str2, tol.y(F2, e, true, true, D4, wzcVar2, new eui((boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), function1, u1jVar, i2), av8Var, 0), av8Var, 0);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else if (z1jVar instanceof x1j) {
                    av8Var.d0(964390207);
                    String v = oea.v(R.string.support_staff, av8Var);
                    long D5 = lz.D(R.color.n_lv_1, av8Var);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v, l98.e0(u0a.F(bkh.d(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54), 16.0f, 14.0f, 16.0f, 8.0f), D5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else if (z1jVar instanceof w1j) {
                    av8Var.d0(965136036);
                    w1j w1jVar = (w1j) z1jVar;
                    boolean z5 = w1jVar.b;
                    o3a.h(w1jVar.a, z5, u0a.F(utcVar, z5 ? icb.b : icb.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 54), av8Var, 0);
                    av8Var.s(false);
                } else if (z1jVar instanceof q1j) {
                    av8Var.d0(965707800);
                    gr1.a(((q1j) z1jVar).a, l98.f0(utcVar, 8.0f, 4.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, 0);
                    av8Var.s(false);
                } else if (z1jVar instanceof r1j) {
                    av8Var.d0(966051714);
                    r1j r1jVar = (r1j) z1jVar;
                    fz8.n(r1jVar.b, r1jVar.c, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue == 0 ? 8.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5), r1jVar.d, av8Var, 0);
                    av8Var.s(false);
                } else {
                    if (!(z1jVar instanceof s1j)) {
                        throw dmi.h(av8Var, 1693553655, false);
                    }
                    av8Var.d0(966652742);
                    fz8.s(6, av8Var, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                    av8Var.s(false);
                }
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x054e, code lost:
    
        if (defpackage.ehd.g(r4 != null ? r4.a : null) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0578, code lost:
    
        if (defpackage.ehd.g(r1 != null ? r1.a : null) == false) goto L294;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0582 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0592  */
    /* JADX WARN: Type inference failed for: r2v12, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r4v89, types: [xtc] */
    /* JADX WARN: Type inference failed for: r4v91, types: [xtc] */
    @Override // defpackage.et8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        gv9 gv9Var;
        int i5;
        gv9 gv9Var2;
        int i6;
        boolean z2;
        boolean z3;
        boolean g;
        Object O;
        int i7;
        boolean z4;
        int i8;
        int i9;
        utc utcVar;
        xtc xtcVar;
        int i10;
        int i11;
        int i12 = this.a;
        xtc xtcVar2 = utc.a;
        Object obj5 = nf3.a;
        List list = this.b;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i12) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj7;
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
                    j9b j9bVar = (j9b) list.get(intValue);
                    av8Var.d0(-2050669862);
                    boolean z5 = intValue == b.i(((m46) obj6).a.a);
                    if (j9bVar instanceof h9b) {
                        av8Var.d0(-2050571066);
                        h9b h9bVar = (h9b) j9bVar;
                        boolean i13 = av8Var.i(j9bVar) | av8Var.g(function1);
                        Object O2 = av8Var.O();
                        if (i13 || O2 == obj5) {
                            O2 = new d06(h9bVar, function1, 1);
                            av8Var.n0(O2);
                        }
                        cga.f(h9bVar, (Function0) O2, u0a.F(xtcVar2, z5 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62), av8Var, 0);
                        av8Var.s(false);
                        z = false;
                    } else if (j9bVar instanceof p9b) {
                        av8Var.d0(-2049927816);
                        p9b p9bVar = (p9b) j9bVar;
                        boolean i14 = av8Var.i(j9bVar) | av8Var.g(function1);
                        Object O3 = av8Var.O();
                        if (i14 || O3 == obj5) {
                            O3 = new uw5(function1, p9bVar, 2);
                            av8Var.n0(O3);
                        }
                        m9b.c(p9bVar, (Function0) O3, u0a.F(xtcVar2, z5 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62), null, null, av8Var, 0, 24);
                        z = false;
                        av8Var.s(false);
                    } else if (j9bVar instanceof i9b) {
                        av8Var.d0(-2049378899);
                        rha.b(((i9b) j9bVar).a.a(av8Var), u0a.F(xtcVar2, z5 ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62), 0L, av8Var, 0, 4);
                        z = false;
                        av8Var.s(false);
                    } else {
                        z = false;
                        if (!(j9bVar instanceof g9b)) {
                            throw dmi.h(av8Var, 1873514210, false);
                        }
                        av8Var.d0(1873566954);
                        av8Var.s(false);
                    }
                    av8Var.s(z);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj7;
                z47 z47Var = (z47) obj6;
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
                    t77 t77Var = (t77) list.get(intValue3);
                    av8Var2.d0(838611983);
                    boolean z6 = z47Var.b.o;
                    boolean g2 = av8Var2.g(function12) | av8Var2.g(z47Var);
                    Object O4 = av8Var2.O();
                    if (g2 || O4 == obj5) {
                        O4 = new zi(27, function12, z47Var);
                        av8Var2.n0(O4);
                    }
                    j72.i(t77Var, z6, (Function1) O4, u0a.F(xpa.a(xpaVar2, xtcVar2, 7), intValue3 == b.i(z47Var.d) ? icb.c : icb.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 38), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                xpa xpaVar3 = (xpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                Function1 function13 = (Function1) obj7;
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
                    FantasyPlayerPriceChanges fantasyPlayerPriceChanges = (FantasyPlayerPriceChanges) list.get(intValue5);
                    av8Var3.d0(-1335863467);
                    boolean g3 = av8Var3.g(function13);
                    Object O5 = av8Var3.O();
                    if (g3 || O5 == obj5) {
                        O5 = new zn6(5, function13);
                        av8Var3.n0(O5);
                    }
                    fkf.i(fantasyPlayerPriceChanges, (Function1) O5, ((gf7) obj6).f, xpa.a(xpaVar3, bkh.d(l98.f0(l98.d0(xtcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), 1.0f), 7), av8Var3, 0);
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
                Context context = (Context) obj7;
                gv9 gv9Var3 = (gv9) obj6;
                if ((intValue8 & 6) == 0) {
                    i4 = (((av8) of3Var4).g(xpaVar4) ? 4 : 2) | intValue8;
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((av8) of3Var4).e(intValue7) ? 32 : 16;
                }
                ?? r2 = (av8) of3Var4;
                if (r2.T(i4 & 1, (i4 & 147) != 146)) {
                    Object obj8 = ((gv9) list).get(intValue7);
                    int i15 = i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    w75 w75Var = (w75) obj8;
                    r2.d0(951892521);
                    r2.d0(-246369254);
                    r2.d0(-246379262);
                    xtc a = xpa.a(xpaVar4, l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7);
                    if (b.i(gv9Var3) == intValue7) {
                        gv9Var = gv9Var3;
                        a = a.z(l98.f0(n9e.q(xtcVar2, lz.D(R.color.surface_1, r2), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                    } else {
                        gv9Var = gv9Var3;
                    }
                    r2.s(false);
                    if (gv9Var.size() - 1 != intValue7) {
                        a = a.z(n9e.q(xtcVar2, lz.D(R.color.surface_1, r2), oyn.e));
                    }
                    xtc xtcVar3 = a;
                    r2.s(false);
                    boolean z7 = w75Var.a != null;
                    boolean i16 = r2.i(context) | r2.g(w75Var);
                    Object O6 = r2.O();
                    if (i16 || O6 == obj5) {
                        O6 = new pi(17, context, w75Var);
                        r2.n0(O6);
                    }
                    ww9.b(intValue7, w75Var, tol.y(xtcVar3, z7, false, false, 0L, null, (Function0) O6, r2, 30), r2, (i15 >> 3) & 14);
                    r2.s(false);
                } else {
                    r2.W();
                }
                return Unit.a;
            case 4:
                xpa xpaVar5 = (xpa) obj;
                int intValue9 = ((Number) obj2).intValue();
                of3 of3Var5 = (of3) obj3;
                int intValue10 = ((Number) obj4).intValue();
                Context context2 = (Context) obj7;
                gv9 gv9Var4 = (gv9) obj6;
                if ((intValue10 & 6) == 0) {
                    i5 = (((av8) of3Var5).g(xpaVar5) ? 4 : 2) | intValue10;
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((av8) of3Var5).e(intValue9) ? 32 : 16;
                }
                av8 av8Var4 = (av8) of3Var5;
                if (av8Var4.T(i5 & 1, (i5 & 147) != 146)) {
                    Object obj9 = list.get(intValue9);
                    int i17 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    v75 v75Var = (v75) obj9;
                    av8Var4.d0(2016521431);
                    av8Var4.d0(1866186109);
                    av8Var4.d0(1866175653);
                    xtc a2 = xpa.a(xpaVar5, l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7);
                    if (b.i(gv9Var4) == intValue9) {
                        gv9Var2 = gv9Var4;
                        a2 = a2.z(l98.f0(n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var4), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                    } else {
                        gv9Var2 = gv9Var4;
                    }
                    av8Var4.s(false);
                    if (gv9Var2.size() - 1 != intValue9) {
                        a2 = a2.z(n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var4), oyn.e));
                    }
                    xtc xtcVar4 = a2;
                    av8Var4.s(false);
                    boolean i18 = av8Var4.i(context2) | av8Var4.g(v75Var);
                    Object O7 = av8Var4.O();
                    if (i18 || O7 == obj5) {
                        O7 = new vva(context2, v75Var, 1);
                        av8Var4.n0(O7);
                    }
                    rz8.h(intValue9, v75Var, true, tol.y(xtcVar4, false, false, false, 0L, null, (Function0) O7, av8Var4, 31), av8Var4, ((i17 >> 3) & 14) | 384);
                    av8Var4.s(false);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 5:
                xpa xpaVar6 = (xpa) obj;
                int intValue11 = ((Number) obj2).intValue();
                of3 of3Var6 = (of3) obj3;
                int intValue12 = ((Number) obj4).intValue();
                Function1 function14 = (Function1) obj7;
                hhd hhdVar = (hhd) obj6;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((av8) of3Var6).g(xpaVar6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((av8) of3Var6).e(intValue11) ? 32 : 16;
                }
                av8 av8Var5 = (av8) of3Var6;
                if (av8Var5.T(i6 & 1, (i6 & 147) != 146)) {
                    fhd fhdVar = (fhd) list.get(intValue11);
                    av8Var5.d0(965280117);
                    if (intValue11 != 0) {
                        if (!ehd.g(fhdVar.a)) {
                            fhd fhdVar2 = (fhd) CollectionsKt.a0(intValue11 - 1, hhdVar.c);
                            break;
                        }
                        z2 = false;
                        if (intValue11 != b.i(hhdVar.c)) {
                            if (ehd.g(fhdVar.a)) {
                                fhd fhdVar3 = (fhd) CollectionsKt.a0(intValue11 + 1, hhdVar.c);
                                break;
                            }
                            z3 = false;
                            n7g c = (z2 || !z3) ? z2 ? o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12) : z3 ? o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3) : o7g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : o7g.a(16.0f);
                            int i19 = fhdVar.e;
                            q9k q9kVar = fhdVar.b;
                            r9k r9kVar = fhdVar.c;
                            m9k m9kVar = fhdVar.d;
                            xtc A = wnn.A(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 4.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z3 ? 4.0f : 0.0f, 5), c);
                            g = av8Var5.g(function14) | av8Var5.g(fhdVar);
                            O = av8Var5.O();
                            if (!g || O == obj5) {
                                O = new pi(22, function14, fhdVar);
                                av8Var5.n0(O);
                            }
                            ehd.f(i19, q9kVar, (Function0) O, A, r9kVar, 0L, m9kVar, z2, z3, av8Var5, 0, 32);
                            av8Var5.s(false);
                        }
                        z3 = true;
                        if (z2) {
                        }
                        int i192 = fhdVar.e;
                        q9k q9kVar2 = fhdVar.b;
                        r9k r9kVar2 = fhdVar.c;
                        m9k m9kVar2 = fhdVar.d;
                        xtc A2 = wnn.A(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 4.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z3 ? 4.0f : 0.0f, 5), c);
                        g = av8Var5.g(function14) | av8Var5.g(fhdVar);
                        O = av8Var5.O();
                        if (!g) {
                        }
                        O = new pi(22, function14, fhdVar);
                        av8Var5.n0(O);
                        ehd.f(i192, q9kVar2, (Function0) O, A2, r9kVar2, 0L, m9kVar2, z2, z3, av8Var5, 0, 32);
                        av8Var5.s(false);
                    }
                    z2 = true;
                    if (intValue11 != b.i(hhdVar.c)) {
                    }
                    z3 = true;
                    if (z2) {
                    }
                    int i1922 = fhdVar.e;
                    q9k q9kVar22 = fhdVar.b;
                    r9k r9kVar22 = fhdVar.c;
                    m9k m9kVar22 = fhdVar.d;
                    xtc A22 = wnn.A(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z2 ? 4.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z3 ? 4.0f : 0.0f, 5), c);
                    g = av8Var5.g(function14) | av8Var5.g(fhdVar);
                    O = av8Var5.O();
                    if (!g) {
                    }
                    O = new pi(22, function14, fhdVar);
                    av8Var5.n0(O);
                    ehd.f(i1922, q9kVar22, (Function0) O, A22, r9kVar22, 0L, m9kVar22, z2, z3, av8Var5, 0, 32);
                    av8Var5.s(false);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 6:
                bpa bpaVar = (bpa) obj;
                int intValue13 = ((Number) obj2).intValue();
                of3 of3Var7 = (of3) obj3;
                int intValue14 = ((Number) obj4).intValue();
                Function1 function15 = (Function1) obj7;
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((av8) of3Var7).g(bpaVar) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((av8) of3Var7).e(intValue13) ? 32 : 16;
                }
                av8 av8Var6 = (av8) of3Var7;
                if (av8Var6.T(i7 & 1, (i7 & 147) != 146)) {
                    OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) list.get(intValue13);
                    av8Var6.d0(1698879290);
                    xtc d = bkh.d(xtcVar2, 1.0f);
                    boolean contains = ((ysd) obj6).d.contains(onboardingItemUiModel);
                    boolean g4 = av8Var6.g(function15) | av8Var6.i(onboardingItemUiModel);
                    Object O8 = av8Var6.O();
                    if (g4 || O8 == obj5) {
                        O8 = new usd(function15, onboardingItemUiModel, 0);
                        av8Var6.n0(O8);
                    }
                    nrd.a(onboardingItemUiModel, contains, (Function0) O8, d, av8Var6, 3072);
                    av8Var6.s(false);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 7:
                xpa xpaVar7 = (xpa) obj;
                int intValue15 = ((Number) obj2).intValue();
                of3 of3Var8 = (of3) obj3;
                int intValue16 = ((Number) obj4).intValue();
                Context context3 = (Context) obj7;
                pi5 pi5Var = (pi5) obj6;
                if ((intValue16 & 6) == 0) {
                    z4 = true;
                    i8 = intValue16 | (((av8) of3Var8).g(xpaVar7) ? 4 : 2);
                } else {
                    z4 = true;
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= ((av8) of3Var8).e(intValue15) ? 32 : 16;
                }
                av8 av8Var7 = (av8) of3Var8;
                if (av8Var7.T(i8 & 1, (i8 & 147) != 146 ? z4 : false)) {
                    ri5 ri5Var = (ri5) list.get(intValue15);
                    av8Var7.d0(2117163667);
                    boolean z8 = (intValue15 != b.i(pi5Var.b) || pi5Var.b.size() > 5) ? false : z4;
                    if (z8) {
                        xtcVar2 = wnn.A(xtcVar2, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3));
                    }
                    xtc d2 = bkh.d(n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var7), oyn.e), 1.0f);
                    boolean i20 = av8Var7.i(context3) | av8Var7.g(ri5Var);
                    Object O9 = av8Var7.O();
                    if (i20 || O9 == obj5) {
                        O9 = new pi(27, context3, ri5Var);
                        av8Var7.n0(O9);
                    }
                    yaa.e(ri5Var, l98.e0(tol.y(d2, false, false, false, 0L, null, (Function0) O9, av8Var7, 31), 16.0f, 12.0f, 8.0f, z8 ? 20 : 12), av8Var7, 0);
                    av8Var7.s(false);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 8:
                xpa xpaVar8 = (xpa) obj;
                int intValue17 = ((Number) obj2).intValue();
                of3 of3Var9 = (of3) obj3;
                int intValue18 = ((Number) obj4).intValue();
                gv9 gv9Var5 = (gv9) obj6;
                if ((intValue18 & 6) == 0) {
                    i9 = intValue18 | (((av8) of3Var9).g(xpaVar8) ? 4 : 2);
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= ((av8) of3Var9).e(intValue17) ? 32 : 16;
                }
                av8 av8Var8 = (av8) of3Var9;
                if (av8Var8.T(i9 & 1, (i9 & 147) != 146)) {
                    l83 l83Var = (l83) list.get(intValue17);
                    av8Var8.d0(-2132053703);
                    boolean z9 = fyg.j(l83Var) || intValue17 == 0;
                    boolean z10 = intValue17 == b.i(gv9Var5) || fyg.j((l83) gv9Var5.get(intValue17 + 1));
                    boolean z11 = l83Var instanceof c83;
                    utc utcVar2 = utc.a;
                    if (z11 || (l83Var instanceof g83)) {
                        av8Var8.d0(-2130825422);
                        av8Var8.s(false);
                    } else {
                        av8Var8.d0(-2131854653);
                        if (z9) {
                            xtcVar = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            utcVar = utcVar2;
                        } else {
                            utcVar = utcVar2;
                            xtcVar = utcVar;
                        }
                        xtc d0 = l98.d0(xtcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        if (z9 || z10) {
                            d0 = d0.z(wnn.A(utcVar, o7g.b(z9 ? 16.0f : 0.0f, z9 ? 16.0f : 0.0f, z10 ? 16.0f : 0.0f, z10 ? 16.0f : 0.0f)));
                        }
                        ?? q = n9e.q(d0, lz.D(R.color.surface_1, av8Var8), oyn.e);
                        utc utcVar3 = q;
                        if (z10) {
                            utcVar3 = q;
                            if (!(l83Var instanceof a83)) {
                                utcVar3 = q;
                                if (!(l83Var instanceof f83)) {
                                    utcVar3 = q.z(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
                                }
                            }
                        }
                        utcVar2 = utcVar3;
                        av8Var8.s(false);
                    }
                    utc utcVar4 = utcVar2;
                    l83 l83Var2 = (l83) CollectionsKt.a0(intValue17 + 1, gv9Var5);
                    ml4.k(l83Var, (Function1) obj7, utcVar4, (z10 || (l83Var instanceof d83) || (l83Var instanceof a83) || (l83Var instanceof f83) || (l83Var2 != null && ((l83Var2 instanceof d83) || (l83Var2 instanceof a83) || (l83Var2 instanceof f83)))) ? false : true, av8Var8, 0);
                    av8Var8.s(false);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 9:
                return a(obj, obj2, obj3, obj4);
            case 10:
                xpa xpaVar9 = (xpa) obj;
                int intValue19 = ((Number) obj2).intValue();
                of3 of3Var10 = (of3) obj3;
                int intValue20 = ((Number) obj4).intValue();
                Function1 function16 = (Function1) obj7;
                if ((intValue20 & 6) == 0) {
                    i10 = intValue20 | (((av8) of3Var10).g(xpaVar9) ? 4 : 2);
                } else {
                    i10 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i10 |= ((av8) of3Var10).e(intValue19) ? 32 : 16;
                }
                av8 av8Var9 = (av8) of3Var10;
                if (av8Var9.T(i10 & 1, (i10 & 147) != 146)) {
                    TopStatsCategory topStatsCategory = (TopStatsCategory) ((ArrayList) list).get(intValue19);
                    av8Var9.d0(1223395498);
                    xtc f0 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    String str = (String) obj6;
                    boolean g5 = av8Var9.g(function16) | av8Var9.i(topStatsCategory);
                    Object O10 = av8Var9.O();
                    if (g5 || O10 == obj5) {
                        O10 = new j3j(function16, topStatsCategory, 2);
                        av8Var9.n0(O10);
                    }
                    Function0 function0 = (Function0) O10;
                    boolean g6 = av8Var9.g(function16) | av8Var9.i(topStatsCategory);
                    Object O11 = av8Var9.O();
                    if (g6 || O11 == obj5) {
                        O11 = new j3j(function16, topStatsCategory, 3);
                        av8Var9.n0(O11);
                    }
                    mha.k(str, topStatsCategory, function0, true, (Function0) O11, f0, 0L, false, 0, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, av8Var9, 3072, 0, 16320);
                    av8Var9.s(false);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            default:
                xpa xpaVar10 = (xpa) obj;
                int intValue21 = ((Number) obj2).intValue();
                of3 of3Var11 = (of3) obj3;
                int intValue22 = ((Number) obj4).intValue();
                Function1 function17 = (Function1) obj7;
                gll gllVar = (gll) obj6;
                if ((intValue22 & 6) == 0) {
                    i11 = intValue22 | (((av8) of3Var11).g(xpaVar10) ? 4 : 2);
                } else {
                    i11 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i11 |= ((av8) of3Var11).e(intValue21) ? 32 : 16;
                }
                av8 av8Var10 = (av8) of3Var11;
                if (av8Var10.T(i11 & 1, (i11 & 147) != 146)) {
                    uv3 uv3Var = (uv3) list.get(intValue21);
                    av8Var10.d0(493734939);
                    if (intValue21 == 0 && uv3Var.c) {
                        av8Var10.d0(493756700);
                        gz8.p(0, av8Var10, null, oea.v(R.string.favourites, av8Var10));
                        av8Var10.s(false);
                    } else {
                        av8Var10.d0(493859527);
                        av8Var10.s(false);
                    }
                    uv3 uv3Var2 = gllVar.b;
                    boolean c2 = Intrinsics.c(uv3Var2 != null ? uv3Var2.b : null, uv3Var.b);
                    boolean g7 = av8Var10.g(function17) | av8Var10.g(uv3Var);
                    Object O12 = av8Var10.O();
                    if (g7 || O12 == obj5) {
                        O12 = new kmj(3, function17, uv3Var);
                        av8Var10.n0(O12);
                    }
                    gz8.c(uv3Var, c2, (Function0) O12, null, av8Var10, 0);
                    if (uv3Var.c) {
                        uv3 uv3Var3 = (uv3) CollectionsKt.a0(intValue21 + 1, gllVar.a);
                        if (uv3Var3 != null && !uv3Var3.c) {
                            av8Var10.d0(494233697);
                            gz8.p(0, av8Var10, null, oea.v(R.string.other, av8Var10));
                            av8Var10.s(false);
                            av8Var10.s(false);
                        }
                    }
                    av8Var10.d0(494331719);
                    av8Var10.s(false);
                    av8Var10.s(false);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ l46(List list, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = list;
        this.d = obj;
        this.c = obj2;
    }
}
