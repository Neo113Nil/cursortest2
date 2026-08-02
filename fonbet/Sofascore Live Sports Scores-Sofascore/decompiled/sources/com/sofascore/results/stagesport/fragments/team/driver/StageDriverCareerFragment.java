package com.sofascore.results.stagesport.fragments.team.driver;

import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageSportDriverTeamData;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment;
import defpackage.a70;
import defpackage.k13;
import defpackage.v6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/driver/StageDriverCareerFragment;", "Lcom/sofascore/results/stagesport/fragments/team/AbstractStageTeamCareerFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StageDriverCareerFragment extends AbstractStageTeamCareerFragment {
    @Override // com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment
    public final List A(StageTeamHistoryResponse stageTeamHistoryResponse) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (stageTeamHistoryResponse != null) {
            List<StageSportDriverSeasonData> bySeason = stageTeamHistoryResponse.getBySeason();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : bySeason) {
                if (((StageSportDriverSeasonData) obj).getParentTeam() != null) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                boolean z = true;
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    StageSportDriverSeasonData stageSportDriverSeasonData = (StageSportDriverSeasonData) arrayList3.get(size);
                    Team parentTeam = stageSportDriverSeasonData.getParentTeam();
                    Integer valueOf = parentTeam != null ? Integer.valueOf(parentTeam.getId()) : null;
                    ArrayList arrayList4 = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (size >= 0) {
                        StageSportDriverSeasonData stageSportDriverSeasonData2 = (StageSportDriverSeasonData) arrayList3.get(size);
                        Team parentTeam2 = stageSportDriverSeasonData2.getParentTeam();
                        if (!Intrinsics.c(parentTeam2 != null ? Integer.valueOf(parentTeam2.getId()) : null, valueOf)) {
                            break;
                        }
                        arrayList4.add(stageSportDriverSeasonData2);
                        Integer racesStarted = stageSportDriverSeasonData2.getRacesStarted();
                        i2 += racesStarted != null ? racesStarted.intValue() : 0;
                        Integer podiums = stageSportDriverSeasonData2.getPodiums();
                        i3 += podiums != null ? podiums.intValue() : 0;
                        Integer victories = stageSportDriverSeasonData2.getVictories();
                        i += victories != null ? victories.intValue() : 0;
                        Integer polePositions = stageSportDriverSeasonData2.getPolePositions();
                        i4 += polePositions != null ? polePositions.intValue() : 0;
                        size--;
                    }
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        String description = ((StageSportDriverSeasonData) it.next()).getStage().getDescription();
                        arrayList5.add(description.substring(StringsKt.T(" ", description, 6) + 1));
                        z = z;
                    }
                    boolean z2 = z;
                    StageSeason stage = stageSportDriverSeasonData.getStage();
                    Team parentTeam3 = stageSportDriverSeasonData.getParentTeam();
                    if (parentTeam3 == null) {
                        a70.r("Required value was null.");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    List B0 = CollectionsKt.B0(arrayList5);
                    v6a it2 = b.h(arrayList5).iterator();
                    boolean z3 = z2;
                    while (it2.c) {
                        int nextInt = it2.nextInt();
                        int i5 = size;
                        if (nextInt == b.i(B0)) {
                            sb.append((String) B0.get(nextInt));
                            arrayList = arrayList3;
                        } else {
                            if (z3) {
                                sb.append((String) B0.get(nextInt));
                            }
                            int parseInt = Integer.parseInt((String) B0.get(nextInt));
                            arrayList = arrayList3;
                            if (Integer.parseInt((String) B0.get(nextInt + 1)) == parseInt + 1) {
                                if (z3) {
                                    sb.append(" - ");
                                }
                                z3 = false;
                            } else {
                                if (!StringsKt.J(sb.toString(), String.valueOf(parseInt), false)) {
                                    sb.append(parseInt);
                                }
                                sb.append(", ");
                                z3 = z2;
                                size = i5;
                                arrayList3 = arrayList;
                            }
                        }
                        size = i5;
                        arrayList3 = arrayList;
                    }
                    arrayList2.add(new StageSportDriverTeamData(stage, parentTeam3, i, i2, i3, i4, sb.toString()));
                    arrayList2.addAll(arrayList4);
                    z = z2;
                }
            }
        }
        return arrayList2;
    }
}
