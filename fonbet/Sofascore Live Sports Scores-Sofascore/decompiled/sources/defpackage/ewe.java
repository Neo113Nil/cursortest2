package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.dialog.StatisticsCategoryModal;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ewe implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerSeasonStatisticsFragment b;

    public /* synthetic */ ewe(PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment, int i) {
        this.a = i;
        this.b = playerSeasonStatisticsFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = this.b;
        switch (i) {
            case 0:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof iei) {
                    FragmentActivity requireActivity = playerSeasonStatisticsFragment.requireActivity();
                    requireActivity.getClass();
                    iei ieiVar = (iei) obj3;
                    Team team = ((Player) playerSeasonStatisticsFragment.v.getValue()).getTeam();
                    Gender gender = team != null ? team.getGender() : null;
                    StatisticsCategoryModal statisticsCategoryModal = new StatisticsCategoryModal();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("STATISTICS_CATEGORY", ieiVar);
                    bundle.putSerializable("GENDER", gender);
                    statisticsCategoryModal.setArguments(bundle);
                    AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(statisticsCategoryModal, appCompatActivity, null, 3));
                    }
                }
                break;
            default:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    Integer num = (Integer) ((eoh) playerSeasonStatisticsFragment.T).getValue();
                    td4.G(num != null ? num.intValue() : -1, xtcVar, false, 0L, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}
