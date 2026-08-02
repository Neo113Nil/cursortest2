package com.sofascore.model.database;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.AmericanFootballEventKt;
import com.sofascore.model.mvvm.model.BaseballEventKt;
import com.sofascore.model.mvvm.model.BasketballEventKt;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.CricketEventKt;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.DartsEventKt;
import com.sofascore.model.mvvm.model.ESportsEventKt;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.FootballEventKt;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.MmaEventKt;
import com.sofascore.model.mvvm.model.OtherEventKt;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.TennisEventKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.VarInProgress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toDbEvent", "Lcom/sofascore/model/database/DbEventAll;", "Lcom/sofascore/model/mvvm/model/Event;", "toEvent", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbEventKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final DbEventAll toDbEvent(@NotNull Event event) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String winType;
        DbAmericanFootballDownDistance dbAmericanFootballDownDistance;
        Integer num5;
        Integer num6;
        VarInProgress varInProgress;
        Integer num7;
        Object dbAmericanFootballDownDistance2;
        Integer num8;
        event.getClass();
        if (event instanceof FootballEvent) {
            FootballEvent footballEvent = (FootballEvent) event;
            Integer homeRedCards = footballEvent.getHomeRedCards();
            Integer awayRedCards = footballEvent.getAwayRedCards();
            varInProgress = footballEvent.getVarInProgress();
            num3 = null;
            num4 = null;
            dbAmericanFootballDownDistance = 0;
            num5 = null;
            num6 = null;
            num7 = null;
            winType = null;
            num = homeRedCards;
            num2 = awayRedCards;
        } else if (event instanceof DartsEvent) {
            Integer firstToServe$default = ServableEvent.getFirstToServe$default((ServableEvent) event, null, 1, null);
            DartsEvent dartsEvent = (DartsEvent) event;
            Integer bestOfSets = dartsEvent.getBestOfSets();
            num4 = firstToServe$default;
            num = null;
            num2 = null;
            num3 = null;
            dbAmericanFootballDownDistance = 0;
            num7 = null;
            winType = null;
            varInProgress = 0;
            num6 = dartsEvent.getBestOfLegs();
            num5 = bestOfSets;
        } else {
            if (event instanceof CricketEvent) {
                num3 = ((CricketEvent) event).getCurrentBattingTeamId();
                num = null;
                num2 = null;
                num4 = null;
            } else if (event instanceof TennisEvent) {
                num4 = ServableEvent.getFirstToServe$default((ServableEvent) event, null, 1, null);
                num = null;
                num2 = null;
                num3 = null;
                num8 = null;
                num5 = num8;
                dbAmericanFootballDownDistance2 = num8;
                num6 = num5;
                num7 = num6;
                winType = num7;
                varInProgress = winType;
                dbAmericanFootballDownDistance = dbAmericanFootballDownDistance2;
            } else if (event instanceof AmericanFootballEvent) {
                AmericanFootballDownDistance yardDistance = ((AmericanFootballEvent) event).getYardDistance();
                dbAmericanFootballDownDistance2 = yardDistance != null ? DbAmericanFootballDownDistanceKt.toDbAmericanFootballDownDistance(yardDistance) : null;
                num = null;
                num2 = null;
                num3 = null;
                num4 = null;
                num5 = null;
                num6 = num5;
                num7 = num6;
                winType = num7;
                varInProgress = winType;
                dbAmericanFootballDownDistance = dbAmericanFootballDownDistance2;
            } else if (event instanceof MmaEvent) {
                MmaEvent mmaEvent = (MmaEvent) event;
                Integer finalRound = mmaEvent.getFinalRound();
                winType = mmaEvent.getWinType();
                num = null;
                num2 = null;
                num3 = null;
                num4 = null;
                dbAmericanFootballDownDistance = 0;
                num5 = null;
                num6 = null;
                varInProgress = 0;
                num7 = finalRound;
            } else {
                num = null;
                num2 = null;
                num3 = null;
                num4 = null;
            }
            num8 = num4;
            num5 = num8;
            dbAmericanFootballDownDistance2 = num8;
            num6 = num5;
            num7 = num6;
            winType = num7;
            varInProgress = winType;
            dbAmericanFootballDownDistance = dbAmericanFootballDownDistance2;
        }
        Season season = event.getSeason();
        Status status = event.getStatus();
        TeamSides teamSides = TeamSides.ORIGINAL;
        Integer winnerCode = event.getWinnerCode(teamSides);
        Integer aggregatedWinnerCode = event.getAggregatedWinnerCode(teamSides);
        int id = event.getHomeTeam(teamSides).getId();
        SubTeam subTeam1 = event.getHomeTeam(teamSides).getSubTeam1();
        Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
        SubTeam subTeam2 = event.getHomeTeam(teamSides).getSubTeam2();
        Integer valueOf2 = subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null;
        int id2 = event.getAwayTeam(teamSides).getId();
        SubTeam subTeam12 = event.getAwayTeam(teamSides).getSubTeam1();
        Integer valueOf3 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
        SubTeam subTeam22 = event.getAwayTeam(teamSides).getSubTeam2();
        Integer valueOf4 = subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null;
        boolean hasEventPlayerHeatMap = event.getHasEventPlayerHeatMap();
        long startTimestamp = event.getStartTimestamp();
        Long endTimestamp = event.getEndTimestamp();
        int id3 = event.getId();
        int id4 = event.getTournament().getId();
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        return new DbEventAll(new DbEvent(season, status, winnerCode, aggregatedWinnerCode, id, valueOf, valueOf2, id2, valueOf3, valueOf4, hasEventPlayerHeatMap, startTimestamp, endTimestamp, id3, id4, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, event.getTime(), event.getChanges(), event.getPreviousLegEventId(), event.getLastPeriod(), num, num2, num3, num4, dbAmericanFootballDownDistance, num5, num6, num7, winType, Boolean.valueOf(event.getCrowdsourcingDataDisplayEnabled()), Boolean.valueOf(event.getCrowdsourcingEnabled()), Boolean.valueOf(event.getFinalResultOnly()), event.getStreamContentId(), event.getStreamContentGeoRestrictions(), varInProgress, event.getEventFilters(), event.getHomeTeamSeed(teamSides), event.getAwayTeamSeed(teamSides)), event.getHomeTeam(teamSides), event.getAwayTeam(teamSides), event.getTournament(), new DbEventScore(event.getId(), event.getHomeScore(teamSides), event.getAwayScore(teamSides)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Nullable
    public static final Event toEvent(@NotNull DbEventAll dbEventAll) {
        dbEventAll.getClass();
        if (dbEventAll.getTournament() == null || dbEventAll.getHomeTeam() == null || dbEventAll.getAwayTeam() == null || dbEventAll.getScore() == null) {
            return null;
        }
        String slug = dbEventAll.getTournament().getCategory().getSport().getSlug();
        switch (slug.hashCode()) {
            case -1721090992:
                if (slug.equals(Sports.BASEBALL)) {
                    return BaseballEventKt.toBaseballEvent(dbEventAll);
                }
                break;
            case -1452201948:
                if (slug.equals(Sports.E_SPORTS)) {
                    return ESportsEventKt.toESportsEvent(dbEventAll);
                }
                break;
            case -877324069:
                if (slug.equals(Sports.TENNIS)) {
                    return TennisEventKt.toTennisEvent(dbEventAll);
                }
                break;
            case -83759494:
                if (slug.equals(Sports.AMERICAN_FOOTBALL)) {
                    return AmericanFootballEventKt.toAmericanFootballEvent(dbEventAll);
                }
                break;
            case 108225:
                if (slug.equals(Sports.MMA)) {
                    return MmaEventKt.toMmaEvent(dbEventAll);
                }
                break;
            case 95355092:
                if (slug.equals(Sports.DARTS)) {
                    return DartsEventKt.toDartsEvent(dbEventAll);
                }
                break;
            case 394668909:
                if (slug.equals(Sports.FOOTBALL)) {
                    return FootballEventKt.toFootballEvent(dbEventAll);
                }
                break;
            case 727149765:
                if (slug.equals(Sports.BASKETBALL)) {
                    return BasketballEventKt.toBasketballEvent(dbEventAll);
                }
                break;
            case 1032299505:
                if (slug.equals(Sports.CRICKET)) {
                    return CricketEventKt.toCricketEvent(dbEventAll);
                }
                break;
        }
        return OtherEventKt.toOtherEvent(dbEventAll);
    }
}
