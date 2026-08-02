package defpackage;

import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyShareSquadBottomSheet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ik7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyShareSquadBottomSheet b;

    public /* synthetic */ ik7(FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet, int i) {
        this.a = i;
        this.b = fantasyShareSquadBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(838424021, av8Var, new ik7(fantasyShareSquadBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc J = lz.J(utc.a, jaa.L(av8Var2), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    s02.i((do7) fantasyShareSquadBottomSheet.w.getValue(), (ho7) fantasyShareSquadBottomSheet.x.getValue(), l6g.W((List) fantasyShareSquadBottomSheet.y.getValue()), av8Var2, 0);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
