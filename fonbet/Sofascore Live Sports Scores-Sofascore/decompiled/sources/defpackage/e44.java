package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.local_persistance.Brand;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.onboarding.steps.f;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class e44 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e44(hth hthVar, kth kthVar, e1d e1dVar, Context context, Function0 function0, Function1 function1) {
        this.a = 10;
        this.c = hthVar;
        this.d = kthVar;
        this.f = e1dVar;
        this.e = context;
        this.b = function0;
        this.g = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        int i = this.a;
        int i2 = 18;
        Object[] objArr = 0;
        final int i3 = 2;
        final int i4 = 1;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                n44 n44Var = (n44) obj8;
                Function0 function02 = (Function0) obj7;
                Function0 function03 = (Function0) obj6;
                e1d e1dVar = (e1d) obj4;
                r54 r54Var = (r54) obj3;
                Function0 function04 = (Function0) obj5;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = n44Var instanceof l44;
                    if (!z) {
                        if (!(n44Var instanceof m44)) {
                            zzl.b();
                            break;
                        } else {
                            function0 = function03;
                        }
                    } else {
                        function0 = function02;
                    }
                    xtc xtcVar = utc.a;
                    if (!z) {
                        if (!(n44Var instanceof m44)) {
                            zzl.b();
                            break;
                        }
                    } else if (((Boolean) e1dVar.getValue()).booleanValue()) {
                        xtcVar = d2a.E(xtcVar, 1.0f, null, false, 0L, 30);
                    }
                    k44.f(function0, xtcVar, null, null, yqo.H(377717494, av8Var, new cyb(i2, n44Var, r54Var, function04)), av8Var, 24576);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                k53.G((svb) obj8, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Function0) obj7, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v9g.r((gv9) obj8, (Integer) obj6, (Long) obj5, (Function1) obj4, (Function0) obj7, (xtc) obj3, (of3) obj, aba.K(3073));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wnn.k((y97) obj8, (ct8) obj6, (Function2) obj5, (Function1) obj4, (Function0) obj7, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q97.b((wb7) obj8, (t97) obj7, (Function1) obj6, (et8) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lz.i((ta7) obj8, (wb7) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                f.a((k7d) obj8, (FantasyOnboardingStepsNavigation) obj7, (et8) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(24577));
                break;
            case 7:
                ((Integer) obj2).getClass();
                yso.l((vp7) obj8, (Function2) obj5, (Function1) obj4, (Function1) obj3, (Function0) obj7, (Function0) obj6, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                sha.b((mwb) obj8, (Brand) obj7, (fwb) obj6, (qwb) obj5, (xtc) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                o6a.e((RaceFlowModels$RaceTeam) obj8, (gv9) obj5, (Function1) obj4, (Function0) obj7, (Function0) obj6, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                hth hthVar = (hth) obj8;
                final kth kthVar = (kth) obj6;
                e1d e1dVar2 = (e1d) obj4;
                Context context = (Context) obj5;
                Function0 function05 = (Function0) obj7;
                Function1 function1 = (Function1) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = SofaSeasonActivity.L;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean i6 = av8Var2.i(kthVar);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i6 || O == a99Var) {
                        O = new Function0() { // from class: lsh
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                int i7 = i3;
                                kth kthVar2 = kthVar;
                                switch (i7) {
                                    case 0:
                                        int i8 = SofaSeasonActivity.L;
                                        fdi fdiVar = kthVar2.h;
                                        if (((hth) fdiVar.getValue()).b > 0) {
                                            do {
                                                value2 = fdiVar.getValue();
                                            } while (!fdiVar.k(value2, hth.a((hth) value2, null, r2.b - 1, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 25)));
                                        } else {
                                            do {
                                                value = fdiVar.getValue();
                                            } while (!fdiVar.k(value, hth.a((hth) value, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 27)));
                                        }
                                        break;
                                    case 1:
                                        int i9 = SofaSeasonActivity.L;
                                        fdi fdiVar2 = kthVar2.h;
                                        do {
                                            value3 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value3, hth.a((hth) value3, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 31)));
                                    default:
                                        int i10 = SofaSeasonActivity.L;
                                        kthVar2.l(true);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O);
                    }
                    Function0 function06 = (Function0) O;
                    boolean i7 = av8Var2.i(kthVar);
                    Object O2 = av8Var2.O();
                    if (i7 || O2 == a99Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        O2 = new Function0() { // from class: lsh
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                int i72 = objArr2;
                                kth kthVar2 = kthVar;
                                switch (i72) {
                                    case 0:
                                        int i8 = SofaSeasonActivity.L;
                                        fdi fdiVar = kthVar2.h;
                                        if (((hth) fdiVar.getValue()).b > 0) {
                                            do {
                                                value2 = fdiVar.getValue();
                                            } while (!fdiVar.k(value2, hth.a((hth) value2, null, r2.b - 1, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 25)));
                                        } else {
                                            do {
                                                value = fdiVar.getValue();
                                            } while (!fdiVar.k(value, hth.a((hth) value, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 27)));
                                        }
                                        break;
                                    case 1:
                                        int i9 = SofaSeasonActivity.L;
                                        fdi fdiVar2 = kthVar2.h;
                                        do {
                                            value3 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value3, hth.a((hth) value3, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 31)));
                                    default:
                                        int i10 = SofaSeasonActivity.L;
                                        kthVar2.l(true);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O2);
                    }
                    Function0 function07 = (Function0) O2;
                    boolean i8 = av8Var2.i(kthVar);
                    Object O3 = av8Var2.O();
                    if (i8 || O3 == a99Var) {
                        O3 = new qfg(kthVar, 22);
                        av8Var2.n0(O3);
                    }
                    Function1 function12 = (Function1) O3;
                    boolean g = av8Var2.g(e1dVar2) | av8Var2.i(context) | av8Var2.g(function05);
                    Object O4 = av8Var2.O();
                    if (g || O4 == a99Var) {
                        O4 = new l97(29, function05, e1dVar2, context);
                        av8Var2.n0(O4);
                    }
                    Function0 function08 = (Function0) O4;
                    boolean g2 = av8Var2.g(e1dVar2) | av8Var2.i(context) | av8Var2.g(function1);
                    Object O5 = av8Var2.O();
                    if (g2 || O5 == a99Var) {
                        O5 = new vsc(i2, function1, e1dVar2, context);
                        av8Var2.n0(O5);
                    }
                    Function1 function13 = (Function1) O5;
                    boolean i9 = av8Var2.i(kthVar);
                    Object O6 = av8Var2.O();
                    if (i9 || O6 == a99Var) {
                        O6 = new Function0() { // from class: lsh
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object value;
                                Object value2;
                                Object value3;
                                int i72 = i4;
                                kth kthVar2 = kthVar;
                                switch (i72) {
                                    case 0:
                                        int i82 = SofaSeasonActivity.L;
                                        fdi fdiVar = kthVar2.h;
                                        if (((hth) fdiVar.getValue()).b > 0) {
                                            do {
                                                value2 = fdiVar.getValue();
                                            } while (!fdiVar.k(value2, hth.a((hth) value2, null, r2.b - 1, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 25)));
                                        } else {
                                            do {
                                                value = fdiVar.getValue();
                                            } while (!fdiVar.k(value, hth.a((hth) value, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 27)));
                                        }
                                        break;
                                    case 1:
                                        int i92 = SofaSeasonActivity.L;
                                        fdi fdiVar2 = kthVar2.h;
                                        do {
                                            value3 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value3, hth.a((hth) value3, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 31)));
                                    default:
                                        int i10 = SofaSeasonActivity.L;
                                        kthVar2.l(true);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O6);
                    }
                    l98.H(hthVar, function06, function07, function12, function08, function13, (Function0) O6, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                oea.e((String) obj8, (Function1) obj6, (Function0) obj7, (xtc) obj5, (w8l) obj4, (ImageVector) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                szj.d((u8g) obj8, (tee) obj7, (h4d) obj6, (wla) obj5, (Function1) obj4, (Function2) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                szj.c((t8g) obj8, (tee) obj7, (h4d) obj6, (wla) obj5, (Function1) obj4, (Function2) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                szj.a((s8g) obj8, (tee) obj7, (h4d) obj6, (wla) obj5, (Function1) obj4, (Function2) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e44(vp7 vp7Var, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i) {
        this.a = 7;
        this.c = vp7Var;
        this.e = function2;
        this.f = function1;
        this.g = function12;
        this.b = function0;
        this.d = function02;
    }

    public /* synthetic */ e44(svb svbVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i) {
        this.a = 1;
        this.c = svbVar;
        this.d = function1;
        this.e = function12;
        this.f = function13;
        this.g = function14;
        this.b = function0;
    }

    public /* synthetic */ e44(n44 n44Var, Function0 function0, Function0 function02, e1d e1dVar, r54 r54Var, Function0 function03) {
        this.a = 0;
        this.c = n44Var;
        this.b = function0;
        this.d = function02;
        this.f = e1dVar;
        this.g = r54Var;
        this.e = function03;
    }

    public /* synthetic */ e44(RaceFlowModels$RaceTeam raceFlowModels$RaceTeam, gv9 gv9Var, Function1 function1, Function0 function0, Function0 function02, xtc xtcVar, int i) {
        this.a = 9;
        this.c = raceFlowModels$RaceTeam;
        this.e = gv9Var;
        this.f = function1;
        this.b = function0;
        this.d = function02;
        this.g = xtcVar;
    }

    public /* synthetic */ e44(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ e44(Object obj, Object obj2, Object obj3, Function1 function1, Function0 function0, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = function1;
        this.b = function0;
        this.g = xtcVar;
    }

    public /* synthetic */ e44(String str, Function1 function1, Function0 function0, xtc xtcVar, w8l w8lVar, ImageVector imageVector, int i) {
        this.a = 11;
        this.c = str;
        this.d = function1;
        this.b = function0;
        this.e = xtcVar;
        this.f = w8lVar;
        this.g = imageVector;
    }
}
