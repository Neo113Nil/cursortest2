package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFilterModal;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class myi implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamPlayerStatsFragment b;

    public /* synthetic */ myi(TeamPlayerStatsFragment teamPlayerStatsFragment, int i) {
        this.a = i;
        this.b = teamPlayerStatsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TeamPlayerStatsFragment teamPlayerStatsFragment = this.b;
        switch (i) {
            case 0:
                nk2 nk2Var = teamPlayerStatsFragment.F().n;
                if (nk2Var != null) {
                    Context requireContext = teamPlayerStatsFragment.requireContext();
                    requireContext.getClass();
                    String str = teamPlayerStatsFragment.F().d;
                    int d = nk2Var.d();
                    int d2 = nk2Var.d();
                    List<lk2> g = nk2Var.g();
                    ArrayList arrayList = new ArrayList(k13.r(g, 10));
                    for (lk2 lk2Var : g) {
                        arrayList.add(new g22((r9k) lk2Var.j().invoke(teamPlayerStatsFragment.E()), (r9k) lk2Var.h().invoke(teamPlayerStatsFragment.E())));
                    }
                    List c = a.c(new h22(arrayList, d2));
                    String string = teamPlayerStatsFragment.getString(nk2Var.d());
                    string.getClass();
                    un0.I(requireContext, str, d, c, string, "PlayerStatsTab");
                    break;
                }
                break;
            default:
                new TeamPlayerStatsFilterModal().p(teamPlayerStatsFragment.getChildFragmentManager(), "filter");
                break;
        }
    }
}
