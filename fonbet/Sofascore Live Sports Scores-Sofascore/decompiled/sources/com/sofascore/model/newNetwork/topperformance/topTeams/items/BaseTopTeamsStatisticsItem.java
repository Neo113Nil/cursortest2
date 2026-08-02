package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import com.sofascore.model.network.response.TeamAverageRatingVersion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BaseTopTeamsStatisticsItem;", "", "<init>", "()V", "id", "", "getId", "()I", "matches", "getMatches", "avgRatingVersion", "Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "getAvgRatingVersion", "()Lcom/sofascore/model/network/response/TeamAverageRatingVersion;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseTopTeamsStatisticsItem {

    @NotNull
    private final TeamAverageRatingVersion avgRatingVersion = TeamAverageRatingVersion.ORIGINAL;

    @NotNull
    public TeamAverageRatingVersion getAvgRatingVersion() {
        return this.avgRatingVersion;
    }

    public abstract int getId();

    public abstract int getMatches();
}
