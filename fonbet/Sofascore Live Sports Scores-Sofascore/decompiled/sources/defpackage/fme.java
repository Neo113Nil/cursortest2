package defpackage;

import android.view.View;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fme implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerCareerStatisticsFragment b;

    public /* synthetic */ fme(PlayerCareerStatisticsFragment playerCareerStatisticsFragment, int i) {
        this.a = i;
        this.b = playerCareerStatisticsFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PickerItem.Tournament H;
        UniqueTournament uniqueTournament;
        xtc xtcVar;
        UniqueTournament uniqueTournament2;
        int i = this.a;
        Unit unit = null;
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = this.b;
        switch (i) {
            case 0:
                otk otkVar = playerCareerStatisticsFragment.t;
                ((Integer) obj2).getClass();
                zle zleVar = (zle) obj3;
                ((View) obj).getClass();
                zleVar.getClass();
                if (zleVar instanceof ule) {
                    ule uleVar = (ule) zleVar;
                    playerCareerStatisticsFragment.C().k(uleVar.b, uleVar.c, uleVar.d.getType(), null);
                    ((dsi) otkVar.getValue()).f(zxe.d);
                } else if ((zleVar instanceof yle) && (H = playerCareerStatisticsFragment.H()) != null && (uniqueTournament = H.b) != null) {
                    ple C = playerCareerStatisticsFragment.C();
                    yle yleVar = (yle) zleVar;
                    String str = yleVar.b;
                    String type = yleVar.c.getType();
                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) playerCareerStatisticsFragment.y.getValue();
                    C.k(uniqueTournament, str, type, segmentedButtonsView != null ? segmentedButtonsView.getSelectedItem() : null);
                    ((dsi) otkVar.getValue()).f(zxe.d);
                }
                break;
            default:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    PickerItem.Tournament H2 = playerCareerStatisticsFragment.H();
                    Integer valueOf = (H2 == null || (uniqueTournament2 = H2.b) == null) ? null : Integer.valueOf(uniqueTournament2.getId());
                    if (valueOf == null) {
                        av8Var.d0(708767102);
                        av8Var.s(false);
                        xtcVar = xtcVar2;
                    } else {
                        av8Var.d0(708767103);
                        xtcVar = xtcVar2;
                        td4.y(valueOf.intValue(), (intValue << 3) & 112, 12, av8Var, xtcVar, null, false);
                        av8Var.s(false);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        av8Var.d0(709058255);
                        kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var), null, xtcVar, r13.i, av8Var, ((intValue << 6) & 896) | 3120, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(161409639);
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
