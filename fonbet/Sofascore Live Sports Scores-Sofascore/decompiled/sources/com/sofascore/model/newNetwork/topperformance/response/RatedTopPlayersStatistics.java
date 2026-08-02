package com.sofascore.model.newNetwork.topperformance.response;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\"\u0010\u0002\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/RatedTopPlayersStatistics;", "", CampaignEx.JSON_KEY_STAR, "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "getRating", "()Ljava/util/List;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RatedTopPlayersStatistics {
    @Nullable
    List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> getRating();
}
