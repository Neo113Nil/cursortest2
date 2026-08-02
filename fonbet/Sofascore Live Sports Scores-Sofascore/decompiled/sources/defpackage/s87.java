package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class s87 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku3 b;
    public final /* synthetic */ dfh c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ s87(ku3 ku3Var, dfh dfhVar, Function0 function0, int i) {
        this.a = i;
        this.b = ku3Var;
        this.c = dfhVar;
        this.d = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        Function0 function0 = this.d;
        dfh dfhVar = this.c;
        ku3 ku3Var = this.b;
        int i2 = 1;
        int i3 = 0;
        v23 v23Var = (v23) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                v23Var.getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String v = oea.v(R.string.fantasy_create_a_private_league_title, av8Var);
                    boolean i4 = av8Var.i(ku3Var) | av8Var.g(dfhVar) | av8Var.g(function0);
                    Object O = av8Var.O();
                    if (i4 || O == a99Var) {
                        O = new t87(ku3Var, dfhVar, function0, i3);
                        av8Var.n0(O);
                    }
                    tz9.n(v, (Function0) O, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                v23Var.getClass();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                    String v2 = oea.v(R.string.fantasy_join_private_league_title, av8Var2);
                    boolean i5 = av8Var2.i(ku3Var) | av8Var2.g(dfhVar) | av8Var2.g(function0);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new t87(ku3Var, dfhVar, function0, i2);
                        av8Var2.n0(O2);
                    }
                    tz9.n(v2, (Function0) O2, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
