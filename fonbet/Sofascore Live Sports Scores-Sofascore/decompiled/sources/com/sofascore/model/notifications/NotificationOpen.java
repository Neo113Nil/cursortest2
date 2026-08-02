package com.sofascore.model.notifications;

import com.android.billingclient.api.BillingClient;
import com.ironsource.U3;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b?\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bA¨\u0006B"}, d2 = {"Lcom/sofascore/model/notifications/NotificationOpen;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS", "LOGIN", "HIGHLIGHTS", "LINEUPS", "URL", "NEWS", "TEAM", "PLAYER_DETAILS", "PLAYER_STATISTICS", "PLAYER_MATCHES", "PLAYER_CAREER", "PLAYER_DIALOG", "TOURNAMENT", "FIGHT_NIGHT", "TOURNAMENT_MEDIA", "TOURNAMENT_STANDINGS", "TOURNAMENT_POWER_RANKINGS", "TOURNAMENT_KNOCKOUT", "TOURNAMENT_MATCHES", "TOURNAMENT_TOP_PLAYERS", "TOURNAMENT_TOP_STATS", "TOURNAMENT_TOP_TEAMS", "TOURNAMENT_TRANSACTIONS", "TOURNAMENT_DRAFT", "TOURNAMENT_AWARDS", "SURVEY", "CROWDSOURCING_EVENT", "CROWDSOURCING_CONTRIBUTE", "CONTRIBUTIONS", "WEEKLY_CHALLENGE", "FANTASY_COMPETITION", "FANTASY_COMPETITION_TEAM_CREATION", "HISTORICAL_DATA", "SOFA_SEASON", "FEATURED_TOURNAMENT", "DRIVER", "DRIVER_STANDINGS", "DRIVER_RACES", "DRIVER_CAREER", "CONSTRUCTOR", "CONSTRUCTOR_STANDINGS", "CONSTRUCTOR_RACES", "CONSTRUCTOR_CAREER", "STAGE", "STAGE_RACE_CHART", "STAGE_RANKINGS", "STAGE_MEDIA", "PREFERENCES", "FEED", "RANKINGS", "AI_INSIGHTS", "FIGHTER", "MANAGER", "VENUE", "POTS_HIGHEST_RATING", "POTS_MOST_AWARDS", "POTS_TOP_LEAGUES", "SUBSCRIPTIONS", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationOpen {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ NotificationOpen[] $VALUES;

    @NotNull
    private final String value;
    public static final NotificationOpen DETAILS = new NotificationOpen("DETAILS", 0, "details");
    public static final NotificationOpen LOGIN = new NotificationOpen("LOGIN", 1, "login");
    public static final NotificationOpen HIGHLIGHTS = new NotificationOpen("HIGHLIGHTS", 2, "highlights");
    public static final NotificationOpen LINEUPS = new NotificationOpen("LINEUPS", 3, "lineups");
    public static final NotificationOpen URL = new NotificationOpen("URL", 4, "url");
    public static final NotificationOpen NEWS = new NotificationOpen("NEWS", 5, "news-post");
    public static final NotificationOpen TEAM = new NotificationOpen("TEAM", 6, "team");
    public static final NotificationOpen PLAYER_DETAILS = new NotificationOpen("PLAYER_DETAILS", 7, SearchResponseKt.PLAYER_ENTITY);
    public static final NotificationOpen PLAYER_STATISTICS = new NotificationOpen("PLAYER_STATISTICS", 8, "player-statistics");
    public static final NotificationOpen PLAYER_MATCHES = new NotificationOpen("PLAYER_MATCHES", 9, "player-matches");
    public static final NotificationOpen PLAYER_CAREER = new NotificationOpen("PLAYER_CAREER", 10, "player-career");
    public static final NotificationOpen PLAYER_DIALOG = new NotificationOpen("PLAYER_DIALOG", 11, "event-player");
    public static final NotificationOpen TOURNAMENT = new NotificationOpen("TOURNAMENT", 12, "tournament");
    public static final NotificationOpen FIGHT_NIGHT = new NotificationOpen("FIGHT_NIGHT", 13, "fight-night");
    public static final NotificationOpen TOURNAMENT_MEDIA = new NotificationOpen("TOURNAMENT_MEDIA", 14, "tournament-media");
    public static final NotificationOpen TOURNAMENT_STANDINGS = new NotificationOpen("TOURNAMENT_STANDINGS", 15, "tournament-standings");
    public static final NotificationOpen TOURNAMENT_POWER_RANKINGS = new NotificationOpen("TOURNAMENT_POWER_RANKINGS", 16, "tournament-power-rankings");
    public static final NotificationOpen TOURNAMENT_KNOCKOUT = new NotificationOpen("TOURNAMENT_KNOCKOUT", 17, "tournament-knockout");
    public static final NotificationOpen TOURNAMENT_MATCHES = new NotificationOpen("TOURNAMENT_MATCHES", 18, "tournament-matches");
    public static final NotificationOpen TOURNAMENT_TOP_PLAYERS = new NotificationOpen("TOURNAMENT_TOP_PLAYERS", 19, "tournament-top-players");
    public static final NotificationOpen TOURNAMENT_TOP_STATS = new NotificationOpen("TOURNAMENT_TOP_STATS", 20, "tournament-top-stats");
    public static final NotificationOpen TOURNAMENT_TOP_TEAMS = new NotificationOpen("TOURNAMENT_TOP_TEAMS", 21, "tournament-top-teams");
    public static final NotificationOpen TOURNAMENT_TRANSACTIONS = new NotificationOpen("TOURNAMENT_TRANSACTIONS", 22, "tournament-transactions");
    public static final NotificationOpen TOURNAMENT_DRAFT = new NotificationOpen("TOURNAMENT_DRAFT", 23, "tournament-draft");
    public static final NotificationOpen TOURNAMENT_AWARDS = new NotificationOpen("TOURNAMENT_AWARDS", 24, "tournament-awards");
    public static final NotificationOpen SURVEY = new NotificationOpen("SURVEY", 25, "survey");
    public static final NotificationOpen CROWDSOURCING_EVENT = new NotificationOpen("CROWDSOURCING_EVENT", 26, "crowdsourcing-suggest-final-result");
    public static final NotificationOpen CROWDSOURCING_CONTRIBUTE = new NotificationOpen("CROWDSOURCING_CONTRIBUTE", 27, "contribute");
    public static final NotificationOpen CONTRIBUTIONS = new NotificationOpen("CONTRIBUTIONS", 28, "contribution-tracker");
    public static final NotificationOpen WEEKLY_CHALLENGE = new NotificationOpen("WEEKLY_CHALLENGE", 29, "weekly-challenge-leaderboard");
    public static final NotificationOpen FANTASY_COMPETITION = new NotificationOpen("FANTASY_COMPETITION", 30, "fantasy-competition");
    public static final NotificationOpen FANTASY_COMPETITION_TEAM_CREATION = new NotificationOpen("FANTASY_COMPETITION_TEAM_CREATION", 31, "fantasy-competition-create");
    public static final NotificationOpen HISTORICAL_DATA = new NotificationOpen("HISTORICAL_DATA", 32, "historical-season");
    public static final NotificationOpen SOFA_SEASON = new NotificationOpen("SOFA_SEASON", 33, "sofascore-season");
    public static final NotificationOpen FEATURED_TOURNAMENT = new NotificationOpen("FEATURED_TOURNAMENT", 34, "featured-tournament");
    public static final NotificationOpen DRIVER = new NotificationOpen("DRIVER", 35, "driver");
    public static final NotificationOpen DRIVER_STANDINGS = new NotificationOpen("DRIVER_STANDINGS", 36, "driver-standings");
    public static final NotificationOpen DRIVER_RACES = new NotificationOpen("DRIVER_RACES", 37, "driver-races");
    public static final NotificationOpen DRIVER_CAREER = new NotificationOpen("DRIVER_CAREER", 38, "driver-career");
    public static final NotificationOpen CONSTRUCTOR = new NotificationOpen("CONSTRUCTOR", 39, "constructor");
    public static final NotificationOpen CONSTRUCTOR_STANDINGS = new NotificationOpen("CONSTRUCTOR_STANDINGS", 40, "constructor-standings");
    public static final NotificationOpen CONSTRUCTOR_RACES = new NotificationOpen("CONSTRUCTOR_RACES", 41, "constructor-races");
    public static final NotificationOpen CONSTRUCTOR_CAREER = new NotificationOpen("CONSTRUCTOR_CAREER", 42, "constructor-career");
    public static final NotificationOpen STAGE = new NotificationOpen("STAGE", 43, "stage");
    public static final NotificationOpen STAGE_RACE_CHART = new NotificationOpen("STAGE_RACE_CHART", 44, "stage-race-chart");
    public static final NotificationOpen STAGE_RANKINGS = new NotificationOpen("STAGE_RANKINGS", 45, "stage-rankings");
    public static final NotificationOpen STAGE_MEDIA = new NotificationOpen("STAGE_MEDIA", 46, "stage-media");
    public static final NotificationOpen PREFERENCES = new NotificationOpen("PREFERENCES", 47, "preferences");
    public static final NotificationOpen FEED = new NotificationOpen("FEED", 48, "feed");
    public static final NotificationOpen RANKINGS = new NotificationOpen("RANKINGS", 49, "ranking");
    public static final NotificationOpen AI_INSIGHTS = new NotificationOpen("AI_INSIGHTS", 50, "ai-insights");
    public static final NotificationOpen FIGHTER = new NotificationOpen("FIGHTER", 51, "fighter");
    public static final NotificationOpen MANAGER = new NotificationOpen("MANAGER", 52, SearchResponseKt.MANAGER_ENTITY);
    public static final NotificationOpen VENUE = new NotificationOpen("VENUE", 53, "venue");
    public static final NotificationOpen POTS_HIGHEST_RATING = new NotificationOpen("POTS_HIGHEST_RATING", 54, "pots-highest-rating");
    public static final NotificationOpen POTS_MOST_AWARDS = new NotificationOpen("POTS_MOST_AWARDS", 55, "pots-most-awards");
    public static final NotificationOpen POTS_TOP_LEAGUES = new NotificationOpen("POTS_TOP_LEAGUES", 56, "pots-top-leagues");
    public static final NotificationOpen SUBSCRIPTIONS = new NotificationOpen("SUBSCRIPTIONS", 57, BillingClient.FeatureType.SUBSCRIPTIONS);

    private static final /* synthetic */ NotificationOpen[] $values() {
        return new NotificationOpen[]{DETAILS, LOGIN, HIGHLIGHTS, LINEUPS, URL, NEWS, TEAM, PLAYER_DETAILS, PLAYER_STATISTICS, PLAYER_MATCHES, PLAYER_CAREER, PLAYER_DIALOG, TOURNAMENT, FIGHT_NIGHT, TOURNAMENT_MEDIA, TOURNAMENT_STANDINGS, TOURNAMENT_POWER_RANKINGS, TOURNAMENT_KNOCKOUT, TOURNAMENT_MATCHES, TOURNAMENT_TOP_PLAYERS, TOURNAMENT_TOP_STATS, TOURNAMENT_TOP_TEAMS, TOURNAMENT_TRANSACTIONS, TOURNAMENT_DRAFT, TOURNAMENT_AWARDS, SURVEY, CROWDSOURCING_EVENT, CROWDSOURCING_CONTRIBUTE, CONTRIBUTIONS, WEEKLY_CHALLENGE, FANTASY_COMPETITION, FANTASY_COMPETITION_TEAM_CREATION, HISTORICAL_DATA, SOFA_SEASON, FEATURED_TOURNAMENT, DRIVER, DRIVER_STANDINGS, DRIVER_RACES, DRIVER_CAREER, CONSTRUCTOR, CONSTRUCTOR_STANDINGS, CONSTRUCTOR_RACES, CONSTRUCTOR_CAREER, STAGE, STAGE_RACE_CHART, STAGE_RANKINGS, STAGE_MEDIA, PREFERENCES, FEED, RANKINGS, AI_INSIGHTS, FIGHTER, MANAGER, VENUE, POTS_HIGHEST_RATING, POTS_MOST_AWARDS, POTS_TOP_LEAGUES, SUBSCRIPTIONS};
    }

    static {
        NotificationOpen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private NotificationOpen(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static NotificationOpen valueOf(String str) {
        return (NotificationOpen) Enum.valueOf(NotificationOpen.class, str);
    }

    public static NotificationOpen[] values() {
        return (NotificationOpen[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
