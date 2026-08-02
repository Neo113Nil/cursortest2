package defpackage;

import com.sofascore.model.notifications.NotificationOpen;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class puh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NotificationOpen.values().length];
        try {
            iArr[NotificationOpen.DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NotificationOpen.HIGHLIGHTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NotificationOpen.LINEUPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NotificationOpen.LOGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NotificationOpen.URL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[NotificationOpen.TEAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[NotificationOpen.NEWS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[NotificationOpen.PLAYER_DETAILS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[NotificationOpen.PLAYER_STATISTICS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[NotificationOpen.PLAYER_MATCHES.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[NotificationOpen.PLAYER_CAREER.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[NotificationOpen.PLAYER_DIALOG.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_MEDIA.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_STANDINGS.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_POWER_RANKINGS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_KNOCKOUT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_MATCHES.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_TOP_PLAYERS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_TOP_STATS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_TOP_TEAMS.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_TRANSACTIONS.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_DRAFT.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[NotificationOpen.TOURNAMENT_AWARDS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[NotificationOpen.FIGHT_NIGHT.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[NotificationOpen.FIGHTER.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[NotificationOpen.STAGE.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[NotificationOpen.STAGE_MEDIA.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[NotificationOpen.STAGE_RACE_CHART.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[NotificationOpen.STAGE_RANKINGS.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[NotificationOpen.DRIVER.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[NotificationOpen.DRIVER_RACES.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[NotificationOpen.DRIVER_STANDINGS.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[NotificationOpen.DRIVER_CAREER.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[NotificationOpen.CONSTRUCTOR.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[NotificationOpen.CONSTRUCTOR_RACES.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[NotificationOpen.CONSTRUCTOR_STANDINGS.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[NotificationOpen.CONSTRUCTOR_CAREER.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[NotificationOpen.SURVEY.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[NotificationOpen.CROWDSOURCING_EVENT.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[NotificationOpen.CROWDSOURCING_CONTRIBUTE.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[NotificationOpen.CONTRIBUTIONS.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[NotificationOpen.WEEKLY_CHALLENGE.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[NotificationOpen.FANTASY_COMPETITION.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[NotificationOpen.FANTASY_COMPETITION_TEAM_CREATION.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[NotificationOpen.HISTORICAL_DATA.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[NotificationOpen.SOFA_SEASON.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[NotificationOpen.FEATURED_TOURNAMENT.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[NotificationOpen.PREFERENCES.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[NotificationOpen.FEED.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[NotificationOpen.RANKINGS.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[NotificationOpen.AI_INSIGHTS.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[NotificationOpen.MANAGER.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[NotificationOpen.VENUE.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[NotificationOpen.POTS_HIGHEST_RATING.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[NotificationOpen.POTS_MOST_AWARDS.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[NotificationOpen.POTS_TOP_LEAGUES.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[NotificationOpen.SUBSCRIPTIONS.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        a = iArr;
    }
}
