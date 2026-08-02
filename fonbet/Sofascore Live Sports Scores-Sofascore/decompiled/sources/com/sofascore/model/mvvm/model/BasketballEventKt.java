package com.sofascore.model.mvvm.model;

import com.sofascore.model.database.DbEventAll;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBasketballEvent", "Lcom/sofascore/model/mvvm/model/BasketballEvent;", "Lcom/sofascore/model/database/DbEventAll;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BasketballEventKt {
    @Nullable
    public static final BasketballEvent toBasketballEvent(@NotNull DbEventAll dbEventAll) {
        dbEventAll.getClass();
        if (dbEventAll.getTournament() == null || dbEventAll.getHomeTeam() == null || dbEventAll.getAwayTeam() == null || dbEventAll.getScore() == null) {
            return null;
        }
        Tournament tournament = dbEventAll.getTournament();
        Season season = dbEventAll.getEvent().getSeason();
        Status status = dbEventAll.getEvent().getStatus();
        Integer winnerCode = dbEventAll.getEvent().getWinnerCode();
        Integer aggregatedWinnerCode = dbEventAll.getEvent().getAggregatedWinnerCode();
        Team homeTeam = dbEventAll.getHomeTeam();
        Team awayTeam = dbEventAll.getAwayTeam();
        Score homeScore = dbEventAll.getScore().getHomeScore();
        Score awayScore = dbEventAll.getScore().getAwayScore();
        boolean hasEventPlayerHeatMap = dbEventAll.getEvent().getHasEventPlayerHeatMap();
        long startTimestamp = dbEventAll.getEvent().getStartTimestamp();
        Long endTimestamp = dbEventAll.getEvent().getEndTimestamp();
        int id = dbEventAll.getEvent().getId();
        Time time = dbEventAll.getEvent().getTime();
        EventChanges changes = dbEventAll.getEvent().getChanges();
        Integer previousLegEventId = dbEventAll.getEvent().getPreviousLegEventId();
        String lastPeriod = dbEventAll.getEvent().getLastPeriod();
        Boolean finalResultOnly = dbEventAll.getEvent().getFinalResultOnly();
        Boolean bool = Boolean.TRUE;
        return new BasketballEvent(tournament, "", season, (Round) null, status, winnerCode, aggregatedWinnerCode, (Integer) null, (Venue) null, (Referee) null, homeTeam, awayTeam, homeScore, awayScore, Boolean.FALSE, (Boolean) null, hasEventPlayerHeatMap, (Boolean) null, "", startTimestamp, endTimestamp, id, time, changes, (Integer) null, previousLegEventId, (Integer) null, lastPeriod, Intrinsics.c(finalResultOnly, bool), (Boolean) null, false, (Player) null, (Long) null, (Map) null, (Integer) null, (TimeoutsInfo) null, false, (List) null, 0, (String) null, (String) null, (EventEditor) null, (String) null, (String) null, (Integer) null, (Integer) null, (TeamSeasonForm) null, (TeamSeasonForm) null, false, Intrinsics.c(dbEventAll.getEvent().getCrowdsourcingDataDisplayEnabled(), bool), false, (Integer) null, (List) dbEventAll.getEvent().getStreamContentGeoRestrictions(), (Map) dbEventAll.getEvent().getEventFilters(), (BonusInfo) null, dbEventAll.getEvent().getHomeTeamSeed(), dbEventAll.getEvent().getAwayTeamSeed(), 0, 262144, (DefaultConstructorMarker) null);
    }
}
