package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Spinner;
import androidx.activity.ComponentActivity;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.steps.h;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c61 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c61(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Boolean] */
    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        xtc r;
        FantasyCompetitionType fantasyCompetitionType;
        xtc r2;
        int i = this.a;
        int i2 = 5;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i3 = 1;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj6;
                tc3 tc3Var = (tc3) obj5;
                Integer num = (Integer) obj2;
                int intValue = num.intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                Object obj8 = ((gv9) obj7).get(intValue);
                n29 a = r29.a(of3Var);
                av8 av8Var = (av8) of3Var;
                boolean i4 = ((((intValue2 & 112) ^ 48) > 32 && av8Var.e(intValue)) || (intValue2 & 48) == 32) | av8Var.i(map) | av8Var.i(a);
                Object O = av8Var.O();
                if (i4 || O == a99Var) {
                    O = new y51(map, intValue, a, 0);
                    av8Var.n0(O);
                }
                pla plaVar = n29.y;
                hz8.b(num, a, (Function1) O, av8Var);
                long D = lz.D(R.color.surface_1, av8Var);
                float H0 = ((kx4) av8Var.k(dh3.h)).H0(16.0f);
                xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
                boolean i5 = av8Var.i(a) | av8Var.f(D) | av8Var.d(H0);
                Object O2 = av8Var.O();
                if (i5 || O2 == a99Var) {
                    O2 = new z51(H0, D, a);
                    av8Var.n0(O2);
                }
                xtc Z = td4.Z(d0, (Function1) O2);
                k1c c = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, Z);
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
                tc3Var.invoke(obj8, av8Var, 0);
                av8Var.s(true);
                return Unit.a;
            case 1:
                Function1 function1 = (Function1) obj7;
                Function1 function12 = (Function1) obj6;
                Function0 function0 = (Function0) obj5;
                fci fciVar = (fci) obj2;
                of3 of3Var2 = (of3) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                fciVar.getClass();
                if (fciVar instanceof dci) {
                    av8 av8Var2 = (av8) of3Var2;
                    av8Var2.d0(1813268780);
                    o02.z((dci) fciVar, function1, function12, function0, av8Var2, (intValue3 >> 3) & 14);
                    av8Var2.s(false);
                } else {
                    if (!(fciVar instanceof eci)) {
                        throw dmi.h((av8) of3Var2, 1813266690, false);
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(1813278987);
                    o02.A((eci) fciVar, n9e.q(utcVar, lz.D(R.color.surface_1, av8Var3), o7g.a(16.0f)), av8Var3, (intValue3 >> 3) & 14);
                    av8Var3.s(false);
                }
                return Unit.a;
            case 2:
                wla wlaVar = (wla) obj7;
                z39 z39Var = (z39) obj6;
                ct8 ct8Var = (ct8) obj5;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                av8 av8Var4 = (av8) ((of3) obj3);
                Context context = (Context) av8Var4.k(nz.b);
                int i6 = (intValue5 & 112) ^ 48;
                boolean i7 = av8Var4.i(context) | av8Var4.g(z39Var) | ((i6 > 32 && av8Var4.e(intValue4)) || (intValue5 & 48) == 32);
                Object O3 = av8Var4.O();
                if (i7 || O3 == a99Var) {
                    O3 = new y51(context, z39Var, intValue4, 1);
                    av8Var4.n0(O3);
                }
                xtc P = tgj.P(wlaVar, (Function1) O3, av8Var4);
                il6 il6Var = (il6) z39Var.m.get(intValue4);
                boolean g = av8Var4.g(ct8Var) | av8Var4.g(z39Var) | ((i6 > 32 && av8Var4.e(intValue4)) || (intValue5 & 48) == 32);
                Object O4 = av8Var4.O();
                if (g || O4 == a99Var) {
                    O4 = new gl6(ct8Var, z39Var, intValue4);
                    av8Var4.n0(O4);
                }
                Function1 function13 = (Function1) O4;
                int i8 = (av8Var4.g(ct8Var) ? 1 : 0) | (((i6 > 32 && av8Var4.e(intValue4)) || (intValue5 & 48) == 32) ? 1 : 0) | (av8Var4.g(z39Var) ? 1 : 0);
                Object O5 = av8Var4.O();
                if (i8 != 0 || O5 == a99Var) {
                    O5 = new gl6(ct8Var, intValue4, z39Var);
                    av8Var4.n0(O5);
                }
                v9g.i(il6Var, function13, (Function1) O5, P, av8Var4, 0);
                return Unit.a;
            case 3:
                osa osaVar = (osa) obj7;
                e67 e67Var = (e67) obj6;
                Function1 function14 = (Function1) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((av8) of3Var3).e(intValue6) ? 32 : 16;
                }
                int i9 = intValue7;
                av8 av8Var5 = (av8) of3Var3;
                if (av8Var5.T(i9 & 1, (i9 & 145) != 144)) {
                    Object b = osaVar.b(intValue6);
                    if (b == null) {
                        a70.r("Required value was null.");
                        return null;
                    }
                    f57 f57Var = (f57) b;
                    boolean z = !Intrinsics.c(f57Var.a, e67Var.a) && e67Var.b;
                    boolean g2 = av8Var5.g(function14);
                    Object O6 = av8Var5.O();
                    if (g2 || O6 == a99Var) {
                        O6 = new o34(i2, function14);
                        av8Var5.n0(O6);
                    }
                    Function2 function2 = (Function2) O6;
                    boolean g3 = av8Var5.g(function14);
                    Object O7 = av8Var5.O();
                    if (g3 || O7 == a99Var) {
                        O7 = new k46(14, function14);
                        av8Var5.n0(O7);
                    }
                    xw3.g(f57Var, z, function2, (Function1) O7, null, av8Var5, 0);
                    if (intValue6 == osaVar.c() - 1) {
                        av8Var5.d0(1758802025);
                        e12.a(0, av8Var5, bkh.e(bkh.d(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var5), oyn.e), 1.0f), 8.0f));
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(1759043236);
                        av8Var5.s(false);
                    }
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 4:
                k7d k7dVar = (k7d) obj7;
                Context context2 = (Context) obj6;
                Function1 function15 = (Function1) obj5;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                av8 av8Var6 = (av8) ((of3) obj3);
                boolean i10 = av8Var6.i(k7dVar);
                Object O8 = av8Var6.O();
                if (i10 || O8 == a99Var) {
                    O8 = new jw5(k7dVar, 5);
                    av8Var6.n0(O8);
                }
                et8 et8Var = (et8) O8;
                boolean i11 = av8Var6.i(context2) | av8Var6.i(k7dVar);
                Object O9 = av8Var6.O();
                if (i11 || O9 == a99Var) {
                    O9 = new dr6(context2, k7dVar, function15, 11);
                    av8Var6.n0(O9);
                }
                h.a(et8Var, (Function1) O9, function15, null, null, av8Var6, 384);
                return Unit.a;
            case 5:
                ComponentActivity componentActivity = (ComponentActivity) obj7;
                Context context3 = (Context) obj6;
                k7d k7dVar2 = (k7d) obj5;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                av8 av8Var7 = (av8) ((of3) obj3);
                View view = (View) av8Var7.k(nz.f);
                ttk a2 = cib.a(av8Var7);
                if (a2 == null) {
                    a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                qtk V = kik.V(ufa.s(a2), av8Var7);
                ly3 r3 = ufa.r(a2);
                fuf fufVar = duf.a;
                gk7 gk7Var = (gk7) sea.A(fufVar.getOrCreateKotlinClass(gk7.class), a2, V, r3, av8Var7);
                wb7 wb7Var = (wb7) sea.A(fufVar.getOrCreateKotlinClass(wb7.class), componentActivity, kik.V(ufa.s(componentActivity), av8Var7), ufa.r(componentActivity), av8Var7);
                e1d x = rfo.x(wb7Var.k, av8Var7, 0);
                Unit unit = Unit.a;
                boolean i12 = av8Var7.i(gk7Var);
                Object O10 = av8Var7.O();
                Object obj9 = O10;
                if (i12 || O10 == a99Var) {
                    ip1 ip1Var = new ip1(gk7Var, r13, 17);
                    av8Var7.n0(ip1Var);
                    obj9 = ip1Var;
                }
                hz8.o(av8Var7, unit, (Function2) obj9);
                Window window = componentActivity.getWindow();
                if (window == null) {
                    av8Var7.d0(-379411279);
                    av8Var7.s(false);
                } else {
                    av8Var7.d0(-379411278);
                    boolean i13 = av8Var7.i(window) | av8Var7.i(view);
                    Object O11 = av8Var7.O();
                    Object obj10 = O11;
                    if (i13 || O11 == a99Var) {
                        w47 w47Var = new w47(6, window, view);
                        av8Var7.n0(w47Var);
                        obj10 = w47Var;
                    }
                    hz8.d(unit, (Function1) obj10, av8Var7);
                    av8Var7.s(false);
                }
                r = m6k.r(utc.a, "SelectReplacementTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                ev6 ev6Var = ((pb7) x.getValue()).f;
                if (ev6Var == null || (fantasyCompetitionType = ev6Var.d) == null) {
                    fantasyCompetitionType = FantasyCompetitionType.SEASON;
                }
                FantasyCompetitionType fantasyCompetitionType2 = fantasyCompetitionType;
                ev6 ev6Var2 = ((pb7) x.getValue()).f;
                boolean c2 = Intrinsics.c(ev6Var2 != null ? Boolean.valueOf(ev6Var2.A) : null, Boolean.TRUE);
                gv9 gv9Var = ((pb7) x.getValue()).j;
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator it = gv9Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((oz6) it.next()).getE()));
                }
                gv9 W = l6g.W(arrayList);
                boolean i14 = av8Var7.i(wb7Var);
                Object O12 = av8Var7.O();
                Object obj11 = O12;
                if (i14 || O12 == a99Var) {
                    o97 o97Var = new o97(wb7Var, i3);
                    av8Var7.n0(o97Var);
                    obj11 = o97Var;
                }
                Function1 function16 = (Function1) obj11;
                boolean g4 = av8Var7.g(x) | av8Var7.i(context3);
                Object O13 = av8Var7.O();
                Object obj12 = O13;
                if (g4 || O13 == a99Var) {
                    d44 d44Var = new d44(i3, x, context3);
                    av8Var7.n0(d44Var);
                    obj12 = d44Var;
                }
                Function1 function17 = (Function1) obj12;
                boolean i15 = av8Var7.i(k7dVar2);
                Object O14 = av8Var7.O();
                Object obj13 = O14;
                if (i15 || O14 == a99Var) {
                    bb7 bb7Var = new bb7(k7dVar2, r15);
                    av8Var7.n0(bb7Var);
                    obj13 = bb7Var;
                }
                un0.o(gk7Var, fantasyCompetitionType2, W, function16, function17, (Function0) obj13, c2, r, yqo.H(1729016296, av8Var7, new q10(2, x)), av8Var7, 100663296, 0);
                return Unit.a;
            case 6:
                ComponentActivity componentActivity2 = (ComponentActivity) obj7;
                Function1 function18 = (Function1) obj6;
                k7d k7dVar3 = (k7d) obj5;
                of3 of3Var4 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                r2 = m6k.r(utc.a, "SelectCompetitionTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                ttk a3 = cib.a(of3Var4);
                if (a3 == null) {
                    a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                qtk V2 = kik.V(ufa.s(a3), of3Var4);
                ly3 r4 = ufa.r(a3);
                fuf fufVar2 = duf.a;
                ob7 ob7Var = (ob7) sea.A(fufVar2.getOrCreateKotlinClass(ob7.class), a3, V2, r4, of3Var4);
                wb7 wb7Var2 = (wb7) sea.A(fufVar2.getOrCreateKotlinClass(wb7.class), componentActivity2, kik.V(ufa.s(componentActivity2), of3Var4), ufa.r(componentActivity2), of3Var4);
                av8 av8Var8 = (av8) of3Var4;
                boolean i16 = av8Var8.i(k7dVar3);
                Object O15 = av8Var8.O();
                if (i16 || O15 == a99Var) {
                    O15 = new bb7(k7dVar3, i3);
                    av8Var8.n0(O15);
                }
                lb7.a(ob7Var, wb7Var2, function18, (Function0) O15, r2, av8Var8, 0);
                return Unit.a;
            case 7:
                gf7 gf7Var = (gf7) obj7;
                Function1 function19 = (Function1) obj6;
                cdi cdiVar = (cdi) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var5 = (of3) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var9 = (av8) of3Var5;
                if (av8Var9.T(intValue8 & 1, (intValue8 & 129) != 128)) {
                    xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_P, av8Var9), oyn.e);
                    u23 a4 = t23.a(ww9.d, uxf.o, av8Var9, 0);
                    int hashCode2 = Long.hashCode(av8Var9.T);
                    aee m2 = av8Var9.m();
                    xtc C2 = fqj.C(av8Var9, q);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a4, hf3.g);
                    waa.K(av8Var9, m2, hf3.f);
                    waa.K(av8Var9, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var9, hf3.k);
                    waa.K(av8Var9, C2, hf3.d);
                    av8Var9.d0(935773718);
                    gv9<ef7> gv9Var2 = gf7Var.c;
                    ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, 10));
                    for (ef7 ef7Var : gv9Var2) {
                        arrayList2.add(new vt2(ef7Var, ef7Var.a.a(av8Var9), false, null, null, null, null, 252));
                    }
                    av8Var9.s(false);
                    gv9 W2 = l6g.W(arrayList2);
                    ef7 ef7Var2 = gf7Var.b;
                    boolean g5 = av8Var9.g(function19);
                    Object O16 = av8Var9.O();
                    if (g5 || O16 == a99Var) {
                        O16 = new k46(24, function19);
                        av8Var9.n0(O16);
                    }
                    trh.a(W2, ef7Var2, (Function1) O16, null, null, new t3e(16.0f, 8.0f, 16.0f, 8.0f), null, false, false, false, null, null, av8Var9, 196608, 4056);
                    if (((Boolean) cdiVar.getValue()).booleanValue()) {
                        av8Var9.d0(-1055399831);
                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var9, null);
                        av8Var9.s(false);
                    } else {
                        av8Var9.d0(-1055327756);
                        av8Var9.s(false);
                    }
                    av8Var9.s(true);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 8:
                wla wlaVar2 = (wla) obj7;
                v39 v39Var = (v39) obj6;
                ct8 ct8Var2 = (ct8) obj5;
                int intValue9 = ((Integer) obj2).intValue();
                int intValue10 = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                av8 av8Var10 = (av8) ((of3) obj3);
                Context context4 = (Context) av8Var10.k(nz.b);
                int i17 = (intValue10 & 112) ^ 48;
                boolean i18 = av8Var10.i(context4) | av8Var10.g(v39Var) | ((i17 > 32 && av8Var10.e(intValue9)) || (intValue10 & 48) == 32);
                Object O17 = av8Var10.O();
                if (i18 || O17 == a99Var) {
                    O17 = new y51(context4, v39Var, intValue9, 3);
                    av8Var10.n0(O17);
                }
                xtc P2 = tgj.P(wlaVar2, (Function1) O17, av8Var10);
                w31 w31Var = (w31) v39Var.n.get(intValue9);
                boolean g6 = av8Var10.g(ct8Var2);
                if ((i17 <= 32 || !av8Var10.e(intValue9)) && (intValue10 & 48) != 32) {
                    i3 = 0;
                }
                int i19 = (g6 ? 1 : 0) | i3 | (av8Var10.g(v39Var) ? 1 : 0);
                Object O18 = av8Var10.O();
                if (i19 != 0 || O18 == a99Var) {
                    O18 = new y51(ct8Var2, intValue9, v39Var, 4);
                    av8Var10.n0(O18);
                }
                ufa.f(0, w31Var, av8Var10, P2, (Function1) O18);
                return Unit.a;
            case 9:
                wla wlaVar3 = (wla) obj7;
                b49 b49Var = (b49) obj6;
                gv9 gv9Var3 = b49Var.n;
                ct8 ct8Var3 = (ct8) obj5;
                int intValue11 = ((Integer) obj2).intValue();
                int intValue12 = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                av8 av8Var11 = (av8) ((of3) obj3);
                Context context5 = (Context) av8Var11.k(nz.b);
                int i20 = (av8Var11.i(context5) ? 1 : 0) | (av8Var11.i(b49Var) ? 1 : 0) | (((((intValue12 & 112) ^ 48) > 32 && av8Var11.e(intValue11)) || (intValue12 & 48) == 32) ? 1 : 0);
                Object O19 = av8Var11.O();
                if (i20 != 0 || O19 == a99Var) {
                    O19 = new y51(context5, b49Var, intValue11, 5);
                    av8Var11.n0(O19);
                }
                xtc P3 = tgj.P(wlaVar3, (Function1) O19, av8Var11);
                cqk cqkVar = (cqk) gv9Var3.get(intValue11);
                ArrayList arrayList3 = new ArrayList(k13.r(gv9Var3, 10));
                Iterator it2 = gv9Var3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((cqk) it2.next()).g));
                }
                s9a.i(cqkVar, arrayList3, intValue11, ct8Var3, P3, av8Var11, (intValue12 << 3) & 896);
                return Unit.a;
            case 10:
                lza lzaVar = (lza) obj7;
                rd4 rd4Var = (rd4) obj6;
                lza lzaVar2 = (lza) obj5;
                int intValue13 = ((Integer) obj3).intValue();
                ((Long) obj4).getClass();
                String str = (String) lzaVar.b.get(intValue13);
                lzaVar.f = str;
                lzaVar.notifyDataSetChanged();
                HashMap hashMap = (HashMap) rd4Var.g;
                ez0 ez0Var = (ez0) rd4Var.e;
                Object obj14 = hashMap.get(str);
                Object obj15 = obj14;
                if (obj14 == null) {
                    obj15 = km5.a;
                }
                List list = (List) obj15;
                list.getClass();
                lzaVar2.f = null;
                lzaVar2.notifyDataSetChanged();
                lzaVar2.b = list;
                lzaVar2.notifyDataSetChanged();
                Spinner spinner = (Spinner) ez0Var.d;
                spinner.setVisibility(list.size() > 1 ? 0 : 8);
                if (rd4Var.a) {
                    rd4Var.a = false;
                    int size = list.size();
                    while (r15 < size) {
                        if (((Season) list.get(r15)).getId() == ((Season) rd4Var.c).getId()) {
                            spinner.setSelection(r15);
                        }
                        r15++;
                    }
                } else {
                    spinner.setSelection(0);
                    lzaVar2.f = lzaVar2.b.get(0);
                    lzaVar2.notifyDataSetChanged();
                }
                return Unit.a;
            case 11:
                osa osaVar2 = (osa) obj7;
                ysd ysdVar = (ysd) obj6;
                Function1 function110 = (Function1) obj5;
                int intValue14 = ((Integer) obj2).intValue();
                of3 of3Var6 = (of3) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                ((bpa) obj).getClass();
                if ((intValue15 & 48) == 0) {
                    intValue15 |= ((av8) of3Var6).e(intValue14) ? 32 : 16;
                }
                av8 av8Var12 = (av8) of3Var6;
                if (av8Var12.T(intValue15 & 1, (intValue15 & 145) != 144)) {
                    Object b2 = osaVar2.b(intValue14);
                    lsd lsdVar = b2 instanceof lsd ? (lsd) b2 : null;
                    OnboardingItemUiModel onboardingItemUiModel = lsdVar != null ? lsdVar.a : null;
                    if (onboardingItemUiModel == null) {
                        av8Var12.d0(-591530757);
                        av8Var12.s(false);
                    } else {
                        av8Var12.d0(-591530756);
                        xtc d = bkh.d(utcVar, 1.0f);
                        boolean contains = ysdVar.d.contains(onboardingItemUiModel);
                        boolean g7 = av8Var12.g(function110) | av8Var12.i(onboardingItemUiModel);
                        Object O20 = av8Var12.O();
                        Object obj16 = O20;
                        if (g7 || O20 == a99Var) {
                            ixa ixaVar = new ixa(26, function110, onboardingItemUiModel);
                            av8Var12.n0(ixaVar);
                            obj16 = ixaVar;
                        }
                        nrd.a(onboardingItemUiModel, contains, (Function0) obj16, d, av8Var12, 3072);
                        av8Var12.s(false);
                    }
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 12:
                osa osaVar3 = (osa) obj7;
                e1d e1dVar = (e1d) obj6;
                Context context6 = (Context) obj5;
                int intValue16 = ((Integer) obj2).intValue();
                of3 of3Var7 = (of3) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                if ((intValue17 & 48) == 0) {
                    intValue17 |= ((av8) of3Var7).e(intValue16) ? 32 : 16;
                }
                av8 av8Var13 = (av8) of3Var7;
                if (!av8Var13.T(intValue17 & 1, (intValue17 & 145) != 144)) {
                    av8Var13.W();
                } else {
                    if (Intrinsics.c((Boolean) e1dVar.getValue(), Boolean.TRUE) && intValue16 < 3) {
                        return Unit.a;
                    }
                    d2e d2eVar = (d2e) osaVar3.b(intValue16);
                    if (d2eVar == null) {
                        av8Var13.d0(411847132);
                        av8Var13.s(false);
                    } else {
                        av8Var13.d0(411847133);
                        boolean i21 = av8Var13.i(context6) | av8Var13.g(d2eVar);
                        Object O21 = av8Var13.O();
                        Object obj17 = O21;
                        if (i21 || O21 == a99Var) {
                            ixa ixaVar2 = new ixa(29, context6, d2eVar);
                            av8Var13.n0(ixaVar2);
                            obj17 = ixaVar2;
                        }
                        td4.E(d2eVar, (Function0) obj17, av8Var13, 0);
                        av8Var13.s(false);
                    }
                }
                return Unit.a;
            default:
                d2j d2jVar = (d2j) obj7;
                n52 n52Var = (n52) obj6;
                Function1 function111 = (Function1) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var8 = (of3) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var14 = (av8) of3Var8;
                if (av8Var14.T(intValue18 & 1, (intValue18 & 129) != 128)) {
                    gv9 gv9Var4 = d2jVar.a;
                    n1j n1jVar = d2jVar.b;
                    lrh lrhVar = n52Var != null ? frh.m : hrh.m;
                    xtc E = d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30);
                    if (n52Var == null) {
                        av8Var14.d0(-45402928);
                        n52Var = new pvh(lz.D(R.color.surface_1, av8Var14));
                    } else {
                        av8Var14.d0(-45403610);
                    }
                    av8Var14.s(false);
                    xtc p = n9e.p(E, n52Var, null, 6);
                    boolean g8 = av8Var14.g(function111);
                    Object O22 = av8Var14.O();
                    if (g8 || O22 == a99Var) {
                        O22 = new k1e(19, function111);
                        av8Var14.n0(O22);
                    }
                    trh.a(gv9Var4, n1jVar, (Function1) O22, p, null, null, lrhVar, false, false, false, null, null, av8Var14, 0, 4016);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
        }
    }
}
