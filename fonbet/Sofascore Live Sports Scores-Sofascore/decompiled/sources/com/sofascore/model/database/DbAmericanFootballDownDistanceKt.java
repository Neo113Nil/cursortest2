package com.sofascore.model.database;

import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.TeamSides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toAmericanFootballDownDistance", "Lcom/sofascore/model/mvvm/model/AmericanFootballDownDistance;", "Lcom/sofascore/model/database/DbAmericanFootballDownDistance;", "toDbAmericanFootballDownDistance", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbAmericanFootballDownDistanceKt {
    @NotNull
    public static final AmericanFootballDownDistance toAmericanFootballDownDistance(@NotNull DbAmericanFootballDownDistance dbAmericanFootballDownDistance) {
        dbAmericanFootballDownDistance.getClass();
        return new AmericanFootballDownDistance(dbAmericanFootballDownDistance.getCurrentYardsToFirstDown(), dbAmericanFootballDownDistance.getCurrentDown(), dbAmericanFootballDownDistance.getCurrentYardline(), dbAmericanFootballDownDistance.isGoalPossession(), dbAmericanFootballDownDistance.getCurrentPossession(), dbAmericanFootballDownDistance.getCurrentTeamHalf());
    }

    @NotNull
    public static final DbAmericanFootballDownDistance toDbAmericanFootballDownDistance(@NotNull AmericanFootballDownDistance americanFootballDownDistance) {
        americanFootballDownDistance.getClass();
        Integer currentYardsToFirstDown = americanFootballDownDistance.getCurrentYardsToFirstDown();
        Integer currentDown = americanFootballDownDistance.getCurrentDown();
        Integer currentYardline = americanFootballDownDistance.getCurrentYardline();
        Boolean isGoalPossession = americanFootballDownDistance.isGoalPossession();
        TeamSides teamSides = TeamSides.ORIGINAL;
        return new DbAmericanFootballDownDistance(currentYardsToFirstDown, currentDown, currentYardline, isGoalPossession, americanFootballDownDistance.getCurrentPossession(false, teamSides), americanFootballDownDistance.getCurrentTeamHalf(false, teamSides));
    }
}
