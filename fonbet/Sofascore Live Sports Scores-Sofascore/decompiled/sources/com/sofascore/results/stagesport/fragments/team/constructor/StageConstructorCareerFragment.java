package com.sofascore.results.stagesport.fragments.team.constructor;

import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/constructor/StageConstructorCareerFragment;", "Lcom/sofascore/results/stagesport/fragments/team/AbstractStageTeamCareerFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageConstructorCareerFragment extends AbstractStageTeamCareerFragment {
    @Override // com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment
    public final List A(StageTeamHistoryResponse stageTeamHistoryResponse) {
        List<StageSportDriverSeasonData> bySeason;
        List B0;
        return (stageTeamHistoryResponse == null || (bySeason = stageTeamHistoryResponse.getBySeason()) == null || (B0 = CollectionsKt.B0(bySeason)) == null) ? km5.a : B0;
    }
}
