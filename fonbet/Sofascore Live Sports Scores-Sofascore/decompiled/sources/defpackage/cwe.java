package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cwe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerSeasonStatisticsFragment b;

    public /* synthetic */ cwe(PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment, int i) {
        this.a = i;
        this.b = playerSeasonStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = playerSeasonStatisticsFragment.requireArguments();
                requireArguments.getClass();
                return (Integer) gz8.M(requireArguments, "TOURNAMENT_UNIQUE_ID", Integer.class);
            case 1:
                Bundle requireArguments2 = playerSeasonStatisticsFragment.requireArguments();
                requireArguments2.getClass();
                return (Integer) gz8.M(requireArguments2, "SEASON_ID", Integer.class);
            case 2:
                Bundle requireArguments3 = playerSeasonStatisticsFragment.requireArguments();
                requireArguments3.getClass();
                return (StatisticsSeasonsResponse) gz8.M(requireArguments3, "PLAYER_STATISTICS_SEASONS", StatisticsSeasonsResponse.class);
            case 3:
                LayoutInflater layoutInflater = playerSeasonStatisticsFragment.getLayoutInflater();
                krk krkVar = playerSeasonStatisticsFragment.l;
                krkVar.getClass();
                return vxc.a(layoutInflater.inflate(R.layout.multi_dropdown_layout, (ViewGroup) ((yq8) krkVar).c, false));
            case 4:
                Context requireContext = playerSeasonStatisticsFragment.requireContext();
                requireContext.getClass();
                return new xve(requireContext);
            case 5:
                Context requireContext2 = playerSeasonStatisticsFragment.requireContext();
                requireContext2.getClass();
                return new hse(requireContext2, false);
            case 6:
                Context requireContext3 = playerSeasonStatisticsFragment.requireContext();
                requireContext3.getClass();
                SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                Boolean bool = Boolean.FALSE;
                Pair pair = new Pair(bool, bool);
                jie jieVar = new jie(15);
                segmentedButtonsView.k = new dwe(playerSeasonStatisticsFragment, 2);
                segmentedButtonsView.g = false;
                segmentedButtonsView.h = pair;
                segmentedButtonsView.j = v1h.f;
                segmentedButtonsView.i = jieVar;
                rlh rlhVar = rlh.b;
                if (!rlhVar.isEmpty()) {
                    SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                }
                return segmentedButtonsView;
            case 7:
                Context requireContext4 = playerSeasonStatisticsFragment.requireContext();
                requireContext4.getClass();
                return new vr1(requireContext4);
            case 8:
                ((dsi) playerSeasonStatisticsFragment.t.getValue()).f(zxe.e);
                return Unit.a;
            case 9:
                Context requireContext5 = playerSeasonStatisticsFragment.requireContext();
                requireContext5.getClass();
                Team team = ((Player) playerSeasonStatisticsFragment.v.getValue()).getTeam();
                return new vwe(requireContext5, false, team != null ? team.getGender() : null);
            case 10:
                Context requireContext6 = playerSeasonStatisticsFragment.requireContext();
                requireContext6.getClass();
                return new vp9(requireContext6);
            case 11:
                Context requireContext7 = playerSeasonStatisticsFragment.requireContext();
                requireContext7.getClass();
                tue tueVar = new tue(requireContext7, new bwe(playerSeasonStatisticsFragment, 1));
                o8.d(tueVar, 0, 7);
                return tueVar;
            case 12:
                return Boolean.valueOf(CollectionsKt.R(ph0.a0(new String[]{Sports.BASKETBALL, Sports.RUGBY, Sports.VOLLEYBALL}), playerSeasonStatisticsFragment.H()));
            case 13:
                Context requireContext8 = playerSeasonStatisticsFragment.requireContext();
                requireContext8.getClass();
                return new xre(requireContext8);
            case 14:
                return new gwe(playerSeasonStatisticsFragment.requireContext());
            default:
                Bundle requireArguments4 = playerSeasonStatisticsFragment.requireArguments();
                requireArguments4.getClass();
                Serializable M = gz8.M(requireArguments4, "PLAYER", Player.class);
                if (M != null) {
                    return (Player) M;
                }
                a70.p("Serializable PLAYER not found");
                return null;
        }
    }
}
