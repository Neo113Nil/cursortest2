package defpackage;

import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bl7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasySubstitutionsActivity b;

    public /* synthetic */ bl7(FantasySubstitutionsActivity fantasySubstitutionsActivity, int i) {
        this.a = i;
        this.b = fantasySubstitutionsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasySubstitutionsActivity fantasySubstitutionsActivity = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = FantasySubstitutionsActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(466606196, av8Var, new bl7(fantasySubstitutionsActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = FantasySubstitutionsActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    jl7.b(fantasySubstitutionsActivity.Q(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
