package defpackage;

import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.stagesport.fragments.team.StageTeamRankingsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p8i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageTeamRankingsFragment b;

    public /* synthetic */ p8i(StageTeamRankingsFragment stageTeamRankingsFragment, int i) {
        this.a = i;
        this.b = stageTeamRankingsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Team team;
        int i = this.a;
        rq3 rq3Var = null;
        StageTeamRankingsFragment stageTeamRankingsFragment = this.b;
        switch (i) {
            case 0:
                e8i e8iVar = (e8i) obj;
                if (e8iVar != null && (team = e8iVar.a) != null) {
                    q3i D = stageTeamRankingsFragment.D();
                    j5i j5iVar = team.getType() == 0 ? j5i.c : j5i.b;
                    D.i = j5iVar;
                    D.j = j5iVar;
                    stageTeamRankingsFragment.C().v = Integer.valueOf(team.getId());
                    q3i D2 = stageTeamRankingsFragment.D();
                    xw3.L(un0.z(D2), null, null, new anc(D2, team.getId(), rq3Var, 11), 3);
                }
                break;
            case 1:
                List list = (List) obj;
                e1d e1dVar = stageTeamRankingsFragment.A;
                if (((List) ((eoh) e1dVar).getValue()).isEmpty() && list != null && !list.isEmpty()) {
                    ((eoh) e1dVar).setValue(list);
                    StageSeason stageSeason = (StageSeason) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue());
                    if (stageSeason != 0) {
                        stageTeamRankingsFragment.E(stageSeason);
                        rq3Var = stageSeason;
                    }
                    ((eoh) stageTeamRankingsFragment.B).setValue(rq3Var);
                }
                break;
            default:
                StageSeason stageSeason2 = (StageSeason) obj;
                stageSeason2.getClass();
                ((eoh) stageTeamRankingsFragment.B).setValue(stageSeason2);
                stageTeamRankingsFragment.E(stageSeason2);
                break;
        }
        return Unit.a;
    }
}
