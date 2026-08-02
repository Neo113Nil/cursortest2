package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q10 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ q10(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue(new xvj(pea.p((x6a) obj, (x6a) obj2)));
                break;
            case 1:
                e1dVar.setValue(new xvj(pea.p((x6a) obj, (x6a) obj2)));
                break;
            default:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ev6 ev6Var = ((pb7) e1dVar.getValue()).f;
                    if ((ev6Var != null ? ev6Var.d : null) == FantasyCompetitionType.SEASON) {
                        av8Var.d0(-418210442);
                        o1j.m(((pb7) e1dVar.getValue()).l, null, null, av8Var, 48);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-417991334);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}
