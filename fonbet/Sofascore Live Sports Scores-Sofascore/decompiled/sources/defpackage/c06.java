package defpackage;

import com.sofascore.model.TeamSelection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c06 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f06 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ c06(Function1 function1, f06 f06Var) {
        this.a = 2;
        this.c = function1;
        this.b = f06Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        f06 f06Var = this.b;
        Function1 function1 = this.c;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    c9b c9bVar = f06Var.a;
                    r8b r8bVar = f06Var.d;
                    bnf bnfVar = f06Var.e;
                    xtc F = u0a.F(utcVar, icb.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 62);
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new vi(28, function1);
                        av8Var.n0(O);
                    }
                    Function1 function12 = (Function1) O;
                    boolean g2 = av8Var.g(function1);
                    Object O2 = av8Var.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new is5(3, function1);
                        av8Var.n0(O2);
                    }
                    v9g.l(c9bVar, r8bVar, bnfVar, true, function12, (Function0) O2, F, false, av8Var, 12585984);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    e9b e9bVar = f06Var.b;
                    gv9 gv9Var = e9bVar.b.a;
                    TeamSelection teamSelection = e9bVar.c;
                    boolean g3 = av8Var2.g(function1);
                    Object O3 = av8Var2.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new vi(26, function1);
                        av8Var2.n0(O3);
                    }
                    l4a.a(gv9Var, teamSelection, (Function1) O3, u0a.F(utcVar, icb.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 62), null, false, av8Var2, 0, 48);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean g4 = av8Var3.g(function1);
                    Object O4 = av8Var3.O();
                    int i2 = 27;
                    if (g4 || O4 == a99Var) {
                        O4 = new vi(i2, function1);
                        av8Var3.n0(O4);
                    }
                    Function1 function13 = (Function1) O4;
                    boolean i3 = av8Var3.i(f06Var);
                    Object O5 = av8Var3.O();
                    if (i3 || O5 == a99Var) {
                        O5 = new kz3(f06Var, i2);
                        av8Var3.n0(O5);
                    }
                    td4.a(function13, null, (Function1) O5, av8Var3, 0, 2);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c06(int i, f06 f06Var, Function1 function1) {
        this.a = i;
        this.b = f06Var;
        this.c = function1;
    }
}
