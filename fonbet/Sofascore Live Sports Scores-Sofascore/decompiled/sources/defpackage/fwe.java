package defpackage;

import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fwe implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UniqueTournament b;

    public /* synthetic */ fwe(UniqueTournament uniqueTournament, int i) {
        this.a = i;
        this.b = uniqueTournament;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        UniqueTournament uniqueTournament = this.b;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    td4.y(uniqueTournament.getId(), (intValue << 3) & 112, 12, av8Var, xtcVar, null, false);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    td4.y(uniqueTournament.getId(), (intValue2 << 3) & 112, 12, av8Var2, xtcVar2, null, false);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xtc xtcVar3 = (xtc) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xtcVar3.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xtcVar3) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    td4.y(uniqueTournament.getId(), (intValue3 << 3) & 112, 12, av8Var3, xtcVar3, null, false);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
