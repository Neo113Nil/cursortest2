package com.sofascore.model.newNetwork.commentary;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"AMERICAN_FOOTBALL_PLAY_TYPE_RUN", "", "isValid", "", "", "Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;", "(Ljava/util/List;)Z", "isOwnGoal", "(Lcom/sofascore/model/newNetwork/commentary/FootballPassingNetworkSegment;)Z", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommentKt {

    @NotNull
    public static final String AMERICAN_FOOTBALL_PLAY_TYPE_RUN = "run";

    public static final boolean isOwnGoal(@NotNull FootballPassingNetworkSegment footballPassingNetworkSegment) {
        footballPassingNetworkSegment.getClass();
        return footballPassingNetworkSegment.getGoalType() == AnimatedGoalType.OWN_GOAL;
    }

    public static final boolean isValid(@NotNull List<FootballPassingNetworkSegment> list) {
        list.getClass();
        FootballPassingNetworkSegment footballPassingNetworkSegment = (FootballPassingNetworkSegment) CollectionsKt.j0(list);
        return (footballPassingNetworkSegment == null || footballPassingNetworkSegment.getGoalShotCoordinates() == null || footballPassingNetworkSegment.getGoalMouthCoordinates() == null) ? false : true;
    }
}
