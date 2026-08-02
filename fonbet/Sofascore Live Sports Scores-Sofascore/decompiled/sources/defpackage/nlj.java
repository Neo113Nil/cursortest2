package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.media.news.TopNewsActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nlj implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nlj(int i, Object obj, Object obj2, Object obj3, Function1 function1) {
        this.a = i;
        this.b = obj;
        this.c = function1;
        this.e = obj2;
        this.d = obj3;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        Object obj5;
        Function0 function0;
        String valueOf;
        boolean z4;
        boolean z5;
        xtc r;
        xtc r2;
        int i = this.a;
        utc utcVar = utc.a;
        Object obj6 = null;
        Object obj7 = nf3.a;
        final int i2 = 1;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                p3e p3eVar = (p3e) obj11;
                TopNewsActivity topNewsActivity = (TopNewsActivity) obj10;
                Context context = (Context) obj9;
                cdi cdiVar = (cdi) obj8;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                of3 of3Var = (of3) obj3;
                ((Integer) obj4).getClass();
                int i3 = TopNewsActivity.O;
                ((k60) obj).getClass();
                if (booleanValue) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(105353668);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(105533189);
                    if (((plj) cdiVar.getValue()).a.isEmpty()) {
                        av8Var2.d0(107370776);
                        j72.h(bkh.c, Integer.valueOf(R.drawable.no_data), Integer.valueOf(R.string.no_data_available), null, false, null, 0, 0L, av8Var2, 6, 248);
                        z = false;
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(105617695);
                        xtc U = td4.U(p3eVar);
                        plj pljVar = (plj) cdiVar.getValue();
                        boolean c = Intrinsics.c((Boolean) topNewsActivity.M.getValue(), Boolean.TRUE);
                        boolean i4 = av8Var2.i(topNewsActivity) | av8Var2.i(context) | av8Var2.g(cdiVar);
                        Object O = av8Var2.O();
                        if (i4 || O == obj7) {
                            O = new ncj(topNewsActivity, context, cdiVar);
                            av8Var2.n0(O);
                        }
                        Function1 function1 = (Function1) O;
                        boolean i5 = av8Var2.i(topNewsActivity);
                        Object O2 = av8Var2.O();
                        if (i5 || O2 == obj7) {
                            O2 = new llj(topNewsActivity, 1);
                            av8Var2.n0(O2);
                        }
                        oyn.q(pljVar, c, U, function1, (Function0) O2, av8Var2, 0);
                        z = false;
                        av8Var2.s(false);
                    }
                    av8Var2.s(z);
                }
                return Unit.a;
            case 1:
                osa osaVar = (osa) obj11;
                String str2 = (String) obj10;
                Function1 function12 = (Function1) obj9;
                Function1 function13 = (Function1) obj8;
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((av8) of3Var2).e(intValue) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 145) != 144)) {
                    w83 w83Var = (w83) osaVar.b(intValue);
                    if (w83Var instanceof u83) {
                        av8Var3.d0(2112467716);
                        j72.r(0, av8Var3, null, ((u83) w83Var).a);
                        av8Var3.s(false);
                    } else if (w83Var instanceof q83) {
                        av8Var3.d0(2112470703);
                        j72.p(0, av8Var3, null);
                        av8Var3.s(false);
                    } else if (w83Var instanceof t83) {
                        av8Var3.d0(2112473286);
                        j72.c((t83) w83Var, str2, function12, function13, null, av8Var3, 0);
                        av8Var3.s(false);
                    } else {
                        if (!(w83Var instanceof v83) && w83Var != null) {
                            throw dmi.h(av8Var3, 2112465144, false);
                        }
                        av8Var3.d0(2112481281);
                        av8Var3.s(false);
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 2:
                Function1 function14 = (Function1) obj11;
                Function1 function15 = (Function1) obj10;
                Function0 function02 = (Function0) obj9;
                Function1 function16 = (Function1) obj8;
                h38 h38Var = (h38) obj2;
                of3 of3Var3 = (of3) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                h38Var.getClass();
                if (h38Var instanceof f38) {
                    av8 av8Var4 = (av8) of3Var3;
                    av8Var4.d0(-722929509);
                    f38 f38Var = (f38) h38Var;
                    if (f38Var.a) {
                        av8Var4.d0(-935965587);
                        pco.l(f38Var, function14, function15, function02, function16, av8Var4, (intValue3 >> 3) & 14);
                        z2 = false;
                        av8Var4.s(false);
                    } else {
                        z2 = false;
                        av8Var4.d0(-935613551);
                        pco.m(f38Var, function16, function14, function15, function02, null, av8Var4, (intValue3 >> 3) & 14);
                        av8Var4 = av8Var4;
                        av8Var4.s(false);
                    }
                    av8Var4.s(z2);
                } else {
                    if (!(h38Var instanceof g38)) {
                        throw dmi.h((av8) of3Var3, -722931286, false);
                    }
                    av8 av8Var5 = (av8) of3Var3;
                    av8Var5.d0(-722906217);
                    pco.n((g38) h38Var, n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var5), o7g.a(16.0f)), av8Var5, (intValue3 >> 3) & 14);
                    av8Var5.s(false);
                }
                return Unit.a;
            case 3:
                gv9 gv9Var = (gv9) obj11;
                Function1 function17 = (Function1) obj10;
                String str3 = (String) obj8;
                Context context2 = (Context) obj9;
                ho7 ho7Var = (ho7) obj2;
                of3 of3Var4 = (of3) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                ho7Var.getClass();
                k1c c2 = e12.c(uxf.g, false);
                av8 av8Var6 = (av8) of3Var4;
                int hashCode = Long.hashCode(av8Var6.T);
                aee m = av8Var6.m();
                xtc C = fqj.C(of3Var4, utcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var7 = (av8) of3Var4;
                av8Var7.h0();
                if (av8Var7.S) {
                    av8Var7.l(zg3Var);
                } else {
                    av8Var7.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(of3Var4, c2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(of3Var4, m, ff3Var);
                Integer valueOf2 = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(of3Var4, valueOf2, f50Var2);
                ry ryVar = hf3.k;
                waa.J(of3Var4, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(of3Var4, C, f50Var3);
                mj7 mj7Var = ho7Var.a;
                if (mj7Var.h() || gv9Var == null || gv9Var.isEmpty()) {
                    av8Var7.d0(963184042);
                    xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    Float f = mj7Var.g;
                    String str4 = "-";
                    String format = f != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f.floatValue())}, 1)) : "-";
                    Integer num = ho7Var.b;
                    if (num == null || (str = String.valueOf(num.intValue())) == null) {
                        str = "-";
                    }
                    Integer num2 = mj7Var.i;
                    if (num2 != null && (valueOf = String.valueOf(num2.intValue())) != null) {
                        str4 = valueOf;
                    }
                    boolean z6 = ho7Var.h;
                    String str5 = mj7Var.k;
                    if (Intrinsics.c(str5, str3)) {
                        str5 = null;
                    }
                    if (str5 == null) {
                        av8Var7.d0(963728246);
                        av8Var7.s(false);
                        z3 = false;
                        function0 = null;
                    } else {
                        av8Var7.d0(963728247);
                        boolean i6 = av8Var7.i(context2) | ((((intValue4 & 112) ^ 48) > 32 && av8Var7.g(ho7Var)) || (intValue4 & 48) == 32) | av8Var7.g(str5);
                        Object O3 = av8Var7.O();
                        if (i6 || O3 == obj7) {
                            z3 = false;
                            Object z77Var = new z77(context2, ho7Var, str5, 0);
                            av8Var7.n0(z77Var);
                            obj5 = z77Var;
                        } else {
                            z3 = false;
                            obj5 = O3;
                        }
                        av8Var7.s(z3);
                        function0 = (Function0) obj5;
                    }
                    z8e.g(format, str, str4, z6, function0, d0, of3Var4, 196608);
                    av8Var7.s(z3);
                } else {
                    av8Var7.d0(962096128);
                    ng0 ng0Var = new ng0(8.0f, true, new l1(uxf.p, 5));
                    xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a = k8g.a(ng0Var, uxf.l, of3Var4, 6);
                    int hashCode2 = Long.hashCode(av8Var7.T);
                    aee m2 = av8Var7.m();
                    xtc C2 = fqj.C(of3Var4, d02);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(of3Var4, a, f50Var);
                    waa.K(of3Var4, m2, ff3Var);
                    waa.K(of3Var4, Integer.valueOf(hashCode2), f50Var2);
                    waa.J(of3Var4, ryVar);
                    waa.K(of3Var4, C2, f50Var3);
                    if (gv9Var.size() == 1) {
                        av8Var7.d0(-1258853814);
                        rz8.m((vl7) gv9Var.get(0), function17, bkh.q(utcVar, 168.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), of3Var4, 384);
                        av8Var7.s(false);
                        z4 = false;
                        z5 = true;
                    } else {
                        av8Var7.d0(-1258587183);
                        Iterator<E> it = gv9Var.iterator();
                        while (it.hasNext()) {
                            rz8.m((vl7) it.next(), function17, new goa(1.0f, true), of3Var4, 0);
                        }
                        z4 = false;
                        z5 = true;
                        av8Var7.s(false);
                    }
                    av8Var7.s(z5);
                    av8Var7.s(z4);
                }
                av8Var7.s(true);
                return Unit.a;
            case 4:
                ComponentActivity componentActivity = (ComponentActivity) obj11;
                Function1 function18 = (Function1) obj10;
                et8 et8Var = (et8) obj9;
                final k7d k7dVar = (k7d) obj8;
                of3 of3Var5 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                r = m6k.r(utc.a, "CreateTeamTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                ttk a2 = cib.a(of3Var5);
                if (a2 == null) {
                    a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                qtk V = kik.V(ufa.s(a2), of3Var5);
                ly3 r3 = ufa.r(a2);
                fuf fufVar = duf.a;
                t97 t97Var = (t97) sea.A(fufVar.getOrCreateKotlinClass(t97.class), a2, V, r3, of3Var5);
                wb7 wb7Var = (wb7) sea.A(fufVar.getOrCreateKotlinClass(wb7.class), componentActivity, kik.V(ufa.s(componentActivity), of3Var5), ufa.r(componentActivity), of3Var5);
                av8 av8Var8 = (av8) of3Var5;
                boolean i7 = av8Var8.i(k7dVar);
                Object O4 = av8Var8.O();
                if (i7 || O4 == obj7) {
                    O4 = new Function1() { // from class: rb7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            int i8 = i2;
                            k7d k7dVar2 = k7dVar;
                            int intValue5 = ((Integer) obj12).intValue();
                            switch (i8) {
                                case 0:
                                    FantasyOnboardingStepsNavigation.JoinLeague joinLeague = new FantasyOnboardingStepsNavigation.JoinLeague(intValue5);
                                    k6d k6dVar = k7dVar2.b;
                                    k6dVar.getClass();
                                    v7d v7dVar = new v7d();
                                    v7dVar.b = k6dVar.g().g.b;
                                    v7dVar.c = false;
                                    Unit unit = Unit.a;
                                    v7dVar.c = true;
                                    v7dVar.d = false;
                                    Unit unit2 = Unit.a;
                                    t7d t7dVar = v7dVar.a;
                                    t7dVar.a = false;
                                    t7dVar.b = false;
                                    int i9 = v7dVar.b;
                                    boolean z7 = v7dVar.c;
                                    boolean z8 = v7dVar.d;
                                    t7dVar.c = i9;
                                    t7dVar.d = z7;
                                    t7dVar.e = z8;
                                    k6dVar.l(joinLeague, t7dVar.a());
                                    break;
                                default:
                                    k7d.c(k7dVar2, new FantasyOnboardingStepsNavigation.NameTeam(intValue5));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var8.n0(O4);
                }
                q97.b(wb7Var, t97Var, function18, et8Var, (Function1) O4, r, av8Var8, 0);
                return Unit.a;
            case 5:
                ComponentActivity componentActivity2 = (ComponentActivity) obj11;
                Function1 function19 = (Function1) obj10;
                final k7d k7dVar2 = (k7d) obj9;
                Function1 function110 = (Function1) obj8;
                of3 of3Var6 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                r2 = m6k.r(utc.a, "EditTeamInfoTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                ttk a3 = cib.a(of3Var6);
                if (a3 == null) {
                    a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                qtk V2 = kik.V(ufa.s(a3), of3Var6);
                ly3 r4 = ufa.r(a3);
                fuf fufVar2 = duf.a;
                ta7 ta7Var = (ta7) sea.A(fufVar2.getOrCreateKotlinClass(ta7.class), a3, V2, r4, of3Var6);
                wb7 wb7Var2 = (wb7) sea.A(fufVar2.getOrCreateKotlinClass(wb7.class), componentActivity2, kik.V(ufa.s(componentActivity2), of3Var6), ufa.r(componentActivity2), of3Var6);
                av8 av8Var9 = (av8) of3Var6;
                boolean i8 = av8Var9.i(k7dVar2);
                Object O5 = av8Var9.O();
                if (i8 || O5 == obj7) {
                    final int i9 = r13 ? 1 : 0;
                    O5 = new Function1() { // from class: rb7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            int i82 = i9;
                            k7d k7dVar22 = k7dVar2;
                            int intValue5 = ((Integer) obj12).intValue();
                            switch (i82) {
                                case 0:
                                    FantasyOnboardingStepsNavigation.JoinLeague joinLeague = new FantasyOnboardingStepsNavigation.JoinLeague(intValue5);
                                    k6d k6dVar = k7dVar22.b;
                                    k6dVar.getClass();
                                    v7d v7dVar = new v7d();
                                    v7dVar.b = k6dVar.g().g.b;
                                    v7dVar.c = false;
                                    Unit unit = Unit.a;
                                    v7dVar.c = true;
                                    v7dVar.d = false;
                                    Unit unit2 = Unit.a;
                                    t7d t7dVar = v7dVar.a;
                                    t7dVar.a = false;
                                    t7dVar.b = false;
                                    int i92 = v7dVar.b;
                                    boolean z7 = v7dVar.c;
                                    boolean z8 = v7dVar.d;
                                    t7dVar.c = i92;
                                    t7dVar.d = z7;
                                    t7dVar.e = z8;
                                    k6dVar.l(joinLeague, t7dVar.a());
                                    break;
                                default:
                                    k7d.c(k7dVar22, new FantasyOnboardingStepsNavigation.NameTeam(intValue5));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var9.n0(O5);
                }
                lz.i(ta7Var, wb7Var2, function19, (Function1) O5, function110, r2, av8Var9, 0);
                return Unit.a;
            case 6:
                axj axjVar = (axj) obj11;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj10;
                fsf fsfVar = (fsf) obj9;
                Map map = (Map) obj8;
                Object obj12 = (k60) obj;
                trg trgVar = (trg) obj2;
                of3 of3Var7 = (of3) obj3;
                ((Integer) obj4).getClass();
                ge3 H = i2a.H((Intrinsics.c(axjVar.a.w(), ((eoh) axjVar.d).getValue()) && snapshotStateList.isEmpty()) ? e6b.e : e6b.d, of3Var7);
                av8 av8Var10 = (av8) of3Var7;
                Object O6 = av8Var10.O();
                if (O6 == obj7) {
                    av8Var10.n0(obj12);
                } else {
                    obj12 = O6;
                }
                fsfVar.a = (k60) obj12;
                gb0 a4 = mhb.a.a(H);
                ff5 ff5Var = nhb.a;
                Object obj13 = fsfVar.a;
                if (obj13 != null) {
                    tol.c(new gb0[]{a4, ff5Var.a((k60) obj13), wdh.a.a(trgVar), zrg.a.a(tub.e(new e70(trgVar), map))}, yqo.H(-1734941436, av8Var10, new t1d(trgVar, i2)), av8Var10, 56);
                    return Unit.a;
                }
                Intrinsics.i("animatedContentScope");
                throw null;
            case 7:
                hre hreVar = (hre) obj11;
                Function1 function111 = (Function1) obj10;
                cdi cdiVar2 = (cdi) obj8;
                tn6 tn6Var = (tn6) obj9;
                ((Integer) obj2).getClass();
                of3 of3Var8 = (of3) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var11 = (av8) of3Var8;
                if (av8Var11.T(intValue5 & 1, (intValue5 & 129) != 128)) {
                    gv9<tn6> gv9Var2 = hreVar.a;
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
                    for (tn6 tn6Var2 : gv9Var2) {
                        arrayList.add(new oxh(tn6Var2, tn6Var2.b, null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList);
                    boolean booleanValue2 = ((Boolean) cdiVar2.getValue()).booleanValue();
                    Iterator<E> it2 = W.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (Intrinsics.c(((oxh) next).a, tn6Var)) {
                                obj6 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) obj6;
                    boolean g = av8Var11.g(function111);
                    Object O7 = av8Var11.O();
                    if (g || O7 == obj7) {
                        O7 = new k1e(2, function111);
                        av8Var11.n0(O7);
                    }
                    o02.a(W, oxhVar, (Function1) O7, booleanValue2, null, av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            default:
                xtc xtcVar = (xtc) obj11;
                dfj dfjVar = (dfj) obj10;
                List list = (List) obj9;
                znh znhVar = (znh) obj8;
                int intValue6 = ((Integer) obj2).intValue();
                of3 of3Var9 = (of3) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((av8) of3Var9).e(intValue6) ? 32 : 16;
                }
                av8 av8Var12 = (av8) of3Var9;
                if (av8Var12.T(intValue7 & 1, (intValue7 & 145) != 144)) {
                    String str6 = (String) list.get(intValue6 % list.size());
                    long D = lz.D(R.color.n_lv_1, av8Var12);
                    Object O8 = av8Var12.O();
                    if (O8 == obj7) {
                        O8 = new t07(znhVar, 2);
                        av8Var12.n0(O8);
                    }
                    udj.c(str6, o02.h0(utcVar, (Function1) O8).z(xtcVar), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar, av8Var12, 0, 24960, 110584);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ nlj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
