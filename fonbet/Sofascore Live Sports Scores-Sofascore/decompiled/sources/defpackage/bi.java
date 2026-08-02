package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bi(int i, Function2 function2, tc3 tc3Var, Function2 function22, Function2 function23, w8l w8lVar, Function2 function24, int i2) {
        this.a = 8;
        this.g = i;
        this.b = function2;
        this.c = tc3Var;
        this.h = function22;
        this.d = function23;
        this.e = w8lVar;
        this.f = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.h;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hi.g((r9k) obj8, (old) obj7, (fgf) obj6, (OddsEventUIModel) obj3, (vmd) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hi.d((r9k) obj8, (old) obj7, (gv9) obj6, (OddsEventUIModel) obj3, (vmd) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hi.b((gv9) obj8, (gv9) obj6, (old) obj7, (OddsEventUIModel) obj3, (vmd) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                pco.m((f38) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj3, (Function0) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rd0.c((scj) obj8, (scj) obj7, (Function1) obj6, (Function1) obj3, (Function0) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                jj6 jj6Var = (jj6) obj8;
                final e1d e1dVar = (e1d) obj7;
                final gv9 gv9Var = (gv9) obj6;
                final Function1 function1 = (Function1) obj5;
                final tc3 tc3Var = (tc3) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 2;
                boolean z = false;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                    long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L);
                    xtc q = n9e.q(s9a.A(utc.a, new l4b(z, jj6Var.j, jj6Var.k, i3)), lz.D(R.color.surface_P, av8Var), o7g.a(8.0f));
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new v30(25, e1dVar);
                        av8Var.n0(O);
                    }
                    final Object obj9 = this.d;
                    final int i4 = this.g;
                    u10.a(booleanValue, (Function0) O, q, floatToRawIntBits, null, null, null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(-1231047027, av8Var, new ct8() { // from class: nq9
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            int i5;
                            int i6;
                            of3 of3Var2 = (of3) obj11;
                            int intValue2 = ((Integer) obj12).intValue();
                            ((v23) obj10).getClass();
                            av8 av8Var2 = (av8) of3Var2;
                            if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                for (Object obj13 : gv9.this) {
                                    boolean c = Intrinsics.c(obj13, obj9);
                                    if (c) {
                                        i5 = 991308983;
                                        i6 = R.color.surface_2;
                                    } else {
                                        i5 = 991309591;
                                        i6 = R.color.surface_P;
                                    }
                                    xtc q2 = n9e.q(utc.a, ljg.f(av8Var2, i5, i6, av8Var2, false), oyn.e);
                                    t3e t3eVar = new t3e(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    tc3 H = yqo.H(-1501715718, av8Var2, new pc3(tc3Var, obj13, i4, 1));
                                    boolean h = av8Var2.h(c) | av8Var2.h(false);
                                    Function1 function12 = function1;
                                    boolean g = h | av8Var2.g(function12) | av8Var2.i(obj13);
                                    Object O2 = av8Var2.O();
                                    if (g || O2 == nf3.a) {
                                        O2 = new b93(c, function12, obj13, e1dVar);
                                        av8Var2.n0(O2);
                                    }
                                    u10.b(H, (Function0) O2, q2, null, false, null, t3eVar, null, av8Var2, 6, 376);
                                }
                            } else {
                                av8Var2.W();
                            }
                            return Unit.a;
                        }
                    }), av8Var, 48, 2032);
                } else {
                    av8Var.W();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                wnn.q((byb) obj8, (ksa) obj7, (Function2) obj6, (Function1) obj3, (Function0) obj5, (Function0) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                n4o.l((String) obj8, (String) obj7, (tc3) obj6, (Function0) obj3, (Function0) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                q5a.q(this.g, (Function2) obj8, (tc3) obj7, (Function2) obj6, (Function2) obj3, (w8l) obj5, (Function2) obj4, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                kda.i((lwi) obj8, (Function0) obj7, (Function0) obj6, (Function1) obj3, (Function1) obj5, (Function0) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                waa.o((String) obj8, (Function1) obj7, (Function1) obj6, (Function0) obj3, (Function0) obj5, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bi(gv9 gv9Var, gv9 gv9Var2, old oldVar, OddsEventUIModel oddsEventUIModel, vmd vmdVar, xtc xtcVar, int i) {
        this.a = 2;
        this.b = gv9Var;
        this.h = gv9Var2;
        this.c = oldVar;
        this.d = oddsEventUIModel;
        this.e = vmdVar;
        this.f = xtcVar;
        this.g = i;
    }

    public /* synthetic */ bi(lwi lwiVar, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, int i) {
        this.a = 9;
        this.b = lwiVar;
        this.c = function0;
        this.h = function02;
        this.d = function1;
        this.e = function12;
        this.f = function03;
        this.g = i;
    }

    public /* synthetic */ bi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.h = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = i;
    }
}
