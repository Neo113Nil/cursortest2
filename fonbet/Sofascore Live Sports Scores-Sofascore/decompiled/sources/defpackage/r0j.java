package defpackage;

import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r0j implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UniqueTournamentSeasonsSpinnerData b;

    public /* synthetic */ r0j(UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData, int i) {
        this.a = i;
        this.b = uniqueTournamentSeasonsSpinnerData;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = this.b;
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
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getId() == -1000) {
                    av8Var.d0(865737387);
                    kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var), null, xtcVar, lz.D(R.color.value, av8Var), av8Var, ((intValue << 6) & 896) | 48, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(866133505);
                    td4.y(uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getId(), (intValue << 3) & 112, 12, av8Var, xtcVar, null, false);
                    av8Var.s(false);
                }
                break;
            default:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    td4.y(uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getId(), (intValue2 << 3) & 112, 12, av8Var2, xtcVar2, null, false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
