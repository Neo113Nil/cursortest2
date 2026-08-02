package com.sofascore.model.mvvm.model;

import com.sofascore.model.database.DbEventAll;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBaseballEvent", "Lcom/sofascore/model/mvvm/model/BaseballEvent;", "Lcom/sofascore/model/database/DbEventAll;", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballEventKt {
    @Nullable
    public static final BaseballEvent toBaseballEvent(@NotNull DbEventAll dbEventAll) {
        dbEventAll.getClass();
        if (dbEventAll.getTournament() == null || dbEventAll.getHomeTeam() == null || dbEventAll.getAwayTeam() == null || dbEventAll.getScore() == null) {
            return null;
        }
        int id = dbEventAll.getEvent().getId();
        Tournament tournament = dbEventAll.getTournament();
        Season season = dbEventAll.getEvent().getSeason();
        Status status = dbEventAll.getEvent().getStatus();
        Integer winnerCode = dbEventAll.getEvent().getWinnerCode();
        Integer aggregatedWinnerCode = dbEventAll.getEvent().getAggregatedWinnerCode();
        Team homeTeam = dbEventAll.getHomeTeam();
        Team awayTeam = dbEventAll.getAwayTeam();
        Score homeScore = dbEventAll.getScore().getHomeScore();
        Score awayScore = dbEventAll.getScore().getAwayScore();
        long startTimestamp = dbEventAll.getEvent().getStartTimestamp();
        Long endTimestamp = dbEventAll.getEvent().getEndTimestamp();
        Time time = dbEventAll.getEvent().getTime();
        EventChanges changes = dbEventAll.getEvent().getChanges();
        Integer previousLegEventId = dbEventAll.getEvent().getPreviousLegEventId();
        String lastPeriod = dbEventAll.getEvent().getLastPeriod();
        Boolean finalResultOnly = dbEventAll.getEvent().getFinalResultOnly();
        Boolean bool = Boolean.TRUE;
        return new BaseballEvent(id, tournament, "", season, null, status, winnerCode, aggregatedWinnerCode, null, null, null, homeTeam, awayTeam, homeScore, awayScore, null, null, false, null, "", startTimestamp, endTimestamp, time, changes, null, previousLegEventId, null, lastPeriod, Intrinsics.c(finalResultOnly, bool), null, false, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, Intrinsics.c(dbEventAll.getEvent().getCrowdsourcingDataDisplayEnabled(), bool), false, null, null, null, dbEventAll.getEvent().getStreamContentGeoRestrictions(), null, dbEventAll.getEvent().getEventFilters());
    }
}
