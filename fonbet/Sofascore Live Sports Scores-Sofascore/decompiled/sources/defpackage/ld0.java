package defpackage;

import android.content.ContentValues;
import com.sofascore.model.Sports;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ld0 extends njc {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(wj9 wj9Var, int i) {
        super(101, 102);
        this.c = i;
        switch (i) {
            case 20:
                super(102, 103);
                break;
            case 21:
                super(103, 104);
                break;
            case 22:
            case 24:
            case 25:
            case 26:
            default:
                break;
            case 23:
                super(89, 90);
                break;
            case 27:
                super(94, 95);
                break;
            case 28:
                super(95, 96);
                break;
        }
    }

    @Override // defpackage.njc
    public void a(glg glgVar) {
        switch (this.c) {
            case 0:
                w1l.t(glgVar, glgVar, "ALTER TABLE `players` ADD COLUMN `team_national` INTEGER DEFAULT 0", glgVar, "ALTER TABLE `teams` ADD COLUMN `national` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period8` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period9` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period10` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period11` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period12` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `home_score_period13` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period8` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period9` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period10` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period11` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period12` INTEGER DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_score` ADD COLUMN `away_score_period13` INTEGER DEFAULT NULL");
                break;
            case 2:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `bestOfSets` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `bestOfLegs` INTEGER DEFAULT NULL");
                break;
            case 3:
                glgVar.getClass();
                b0a.F(glgVar, "ALTER TABLE `my_channels_table` ADD COLUMN `link` TEXT DEFAULT NULL");
                break;
            case 4:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `feed_post_feedback` (`postId` INTEGER NOT NULL, `feedbackTimestamp` INTEGER NOT NULL, PRIMARY KEY(`postId`))");
                break;
            case 5:
                glgVar.getClass();
                b0a.F(glgVar, "ALTER TABLE `pinned_tournaments_table` ADD COLUMN `orderIndex` INTEGER NOT NULL DEFAULT 0");
                break;
            case 6:
                w1l.t(glgVar, glgVar, "ALTER TABLE `tournament` ADD COLUMN `unique_tournament_gender` TEXT DEFAULT NULL", glgVar, "ALTER TABLE `leagues` ADD COLUMN `gender` TEXT DEFAULT NULL");
                break;
            case 7:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `var_homeTeam` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `var_awayTeam` INTEGER DEFAULT NULL");
                break;
            case 8:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `homescreen_filter` (`sportName` TEXT NOT NULL, `selectedFilters` TEXT NOT NULL, PRIMARY KEY(`sportName`))");
                break;
            case 9:
                glgVar.getClass();
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `crowdsourcingEnabled` INTEGER DEFAULT NULL");
                break;
            case 10:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `notification_settings` (`group` TEXT NOT NULL, `name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `channelId` TEXT NOT NULL, `groupInSettingsScreen` TEXT NOT NULL, PRIMARY KEY(`group`, `name`))");
                break;
            case 11:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `user_segmentation` (`type` INTEGER NOT NULL, PRIMARY KEY(`type`))");
                break;
            case 12:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `eventFilters` TEXT DEFAULT NULL", glgVar, "ALTER TABLE `homescreen_filter` ADD COLUMN `displayType` TEXT NOT NULL DEFAULT 'default'");
                break;
            case 13:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `finalRound` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `winType` TEXT DEFAULT NULL");
                break;
            case 14:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `homeTeamSeed` TEXT DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `awayTeamSeed` TEXT DEFAULT NULL");
                break;
            case 15:
                glgVar.getClass();
                b0a.F(glgVar, "ALTER TABLE `my_stage_table` ADD COLUMN `isHidden` INTEGER NOT NULL DEFAULT 0");
                break;
            case 16:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `player_of_the_match_vote_table` (`eventId` INTEGER NOT NULL, `playerId` INTEGER NOT NULL, `eventTimestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`))");
                break;
            default:
                super.a(glgVar);
                break;
        }
    }

    @Override // defpackage.njc
    public void b(dni dniVar) {
        int i = this.c;
        y9f y9fVar = ugj.a;
        switch (i) {
            case 17:
                dniVar.getClass();
                dniVar.E("ALTER TABLE my_teams ADD COLUMN notificationsEnabled INTEGER NOT NULL DEFAULT 1");
                dniVar.E("CREATE TABLE IF NOT EXISTS my_players (\n                playerId INTEGER NOT NULL,\n                notificationsEnabled INTEGER NOT NULL DEFAULT 1,\n                PRIMARY KEY(playerId))");
                dniVar.E("INSERT OR IGNORE INTO my_players (playerId, notificationsEnabled) SELECT id, 1 FROM my_players_table");
                dniVar.E("ALTER TABLE my_players_table RENAME TO players");
                dniVar.E("CREATE TABLE IF NOT EXISTS my_leagues (\n                uniqueTournamentId INTEGER NOT NULL,\n                notificationsEnabled INTEGER NOT NULL DEFAULT 1,\n                PRIMARY KEY(uniqueTournamentId))");
                dniVar.E("INSERT OR IGNORE INTO my_leagues (uniqueTournamentId, notificationsEnabled) SELECT id, 1 FROM my_leagues_table");
                dniVar.E("ALTER TABLE my_leagues_table RENAME TO leagues");
                dniVar.E("UPDATE events_table SET mute = -1 WHERE mute <> 1 AND (\n                EXISTS (SELECT * FROM leagues WHERE leagues.id = events_table.uniqueTournamentId) OR \n                EXISTS (SELECT * FROM my_teams WHERE my_teams.teamId = events_table.homeTeamId OR \n                my_teams.teamId = events_table.awayTeamId OR my_teams.teamId = events_table.homeSubTeam1Id OR \n                my_teams.teamId = events_table.awaySubTeam1Id OR my_teams.teamId = events_table.homeSubTeam2Id OR \n                my_teams.teamId = events_table.awaySubTeam2Id))");
                dniVar.E("DELETE FROM saved_searches_table WHERE entity = 'event'");
                return;
            case 18:
                dniVar.getClass();
                dniVar.E("CREATE TABLE IF NOT EXISTS my_teams (\n            teamId INTEGER NOT NULL,\n            PRIMARY KEY(teamId))");
                dniVar.E("INSERT OR IGNORE INTO my_teams (teamId) SELECT id FROM my_team_table");
                dniVar.E("ALTER TABLE my_team_table RENAME TO teams");
                dniVar.E("INSERT OR IGNORE INTO teams\n            (id, name, slug, userCount, type, nameCode, shortName, gender, ranking, disabled, sub_team_one_id, sub_team_one_name, sub_team_two_id, sub_team_two_name, sport_id, sport_slug, country_name, country_alpha2)\n            SELECT home_team_id, home_team_name, home_team_slug, home_team_userCount, home_team_type, home_team_nameCode, home_team_shortName, home_team_gender, home_team_ranking, home_team_disabled, home_team_sub_team_one_id, home_team_sub_team_one_name, home_team_sub_team_two_id, home_team_sub_team_two_name, home_team_sport_id, home_team_sport_slug, home_team_country_name, home_team_country_alpha2 FROM events_table");
                dniVar.E("INSERT OR IGNORE INTO teams\n            (id, name, slug, userCount, type, nameCode, shortName, gender, ranking, disabled, sub_team_one_id, sub_team_one_name, sub_team_two_id, sub_team_two_name, sport_id, sport_slug, country_name, country_alpha2)\n            SELECT away_team_id, away_team_name, away_team_slug, away_team_userCount, away_team_type, away_team_nameCode, away_team_shortName, away_team_gender, away_team_ranking, away_team_disabled, away_team_sub_team_one_id, away_team_sub_team_one_name, away_team_sub_team_two_id, away_team_sub_team_two_name, away_team_sport_id, away_team_sport_slug, away_team_country_name, away_team_country_alpha2 FROM events_table");
                dniVar.E("CREATE TABLE IF NOT EXISTS tournament (\n                id INTEGER NOT NULL,\n                name TEXT NOT NULL,\n                nameTranslation TEXT,\n                shortNameTranslation TEXT,\n                category_id INTEGER NOT NULL,\n                category_name TEXT NOT NULL,\n                category_flag TEXT NOT NULL,\n                category_sport_id INTEGER NOT NULL,\n                category_sport_slug TEXT NOT NULL,\n                category_nameTranslation TEXT,\n                category_shortNameTranslation TEXT, \n                unique_tournament_id INTEGER,\n                unique_tournament_name TEXT,\n                unique_tournament_userCount INTEGER,\n                unique_tournament_hasEventPlayerStatistics INTEGER,\n                unique_tournament_hasBoxScore INTEGER,\n                unique_tournament_displayInverseHomeAwayTeams INTEGER,\n                unique_tournament_groundType TEXT,\n                unique_tournament_tennisPoints INTEGER,\n                unique_tournament_category_id INTEGER,\n                unique_tournament_category_name TEXT,\n                unique_tournament_category_flag TEXT,\n                unique_tournament_category_sport_id INTEGER,\n                unique_tournament_category_sport_slug TEXT,\n                unique_tournament_category_nameTranslation TEXT,\n                unique_tournament_category_shortNameTranslation TEXT,\n                unique_tournament_nameTranslation TEXT, \n                unique_tournament_shortNameTranslation TEXT, \n                PRIMARY KEY(id))");
                dniVar.E("INSERT OR IGNORE INTO tournament\n                (id, name, category_id, category_name, category_flag, category_sport_id, category_sport_slug, unique_tournament_id, unique_tournament_name, unique_tournament_userCount, unique_tournament_hasEventPlayerStatistics, unique_tournament_displayInverseHomeAwayTeams, unique_tournament_groundType, unique_tournament_tennisPoints, unique_tournament_category_id, unique_tournament_category_name, unique_tournament_category_flag, unique_tournament_category_sport_id, unique_tournament_category_sport_slug) \n                SELECT tournament_id, tournament_name, tournament_category_id, tournament_category_name, tournament_category_flag, tournament_category_sport_id, tournament_category_sport_slug, tournament_unique_tournament_id, tournament_unique_tournament_name, tournament_unique_tournament_userCount, tournament_unique_tournament_hasEventPlayerStatistics, tournament_unique_tournament_displayInverseHomeAwayTeams, tournament_unique_tournament_groundType, tournament_unique_tournament_tennisPoints, tournament_unique_tournament_category_id, tournament_unique_tournament_category_name, tournament_unique_tournament_category_flag, tournament_unique_tournament_category_sport_id, tournament_unique_tournament_category_sport_slug FROM events_table");
                dniVar.E("CREATE TABLE IF NOT EXISTS events_score (eventId INTEGER NOT NULL,\n            home_score_display INTEGER,\n            home_score_period1 INTEGER,\n            home_score_period2 INTEGER,\n            home_score_period3 INTEGER,\n            home_score_period4 INTEGER,\n            home_score_period5 INTEGER,\n            home_score_period6 INTEGER,\n            home_score_period7 INTEGER,\n            home_score_period1TieBreak INTEGER,\n            home_score_period2TieBreak INTEGER,\n            home_score_period3TieBreak INTEGER,\n            home_score_period4TieBreak INTEGER,\n            home_score_period5TieBreak INTEGER,\n            home_score_point TEXT,\n            home_score_overtime INTEGER,\n            home_score_penalties INTEGER,\n            home_score_aggregated INTEGER,\n            home_score_series INTEGER,\n            home_score_currentCricketDisplay TEXT,\n            away_score_display INTEGER,\n            away_score_period1 INTEGER,\n            away_score_period2 INTEGER,\n            away_score_period3 INTEGER,\n            away_score_period4 INTEGER,\n            away_score_period5 INTEGER,\n            away_score_period6 INTEGER,\n            away_score_period7 INTEGER,\n            away_score_period1TieBreak INTEGER,\n            away_score_period2TieBreak INTEGER,\n            away_score_period3TieBreak INTEGER,\n            away_score_period4TieBreak INTEGER,\n            away_score_period5TieBreak INTEGER,\n            away_score_point TEXT,\n            away_score_overtime INTEGER,\n            away_score_penalties INTEGER,\n            away_score_aggregated INTEGER,\n            away_score_series INTEGER,\n            away_score_currentCricketDisplay TEXT,\n            PRIMARY KEY(eventId),\n            FOREIGN KEY(eventId) REFERENCES events_table(id) ON UPDATE NO ACTION ON DELETE CASCADE )");
                dniVar.E("INSERT INTO events_score \n                (eventId, home_score_display, home_score_period1, home_score_period2, home_score_period3, home_score_period4, home_score_period5, home_score_period6, home_score_period7, home_score_period1TieBreak, home_score_period2TieBreak, home_score_period3TieBreak, home_score_period4TieBreak, home_score_period5TieBreak, home_score_point, home_score_overtime, home_score_penalties, home_score_aggregated, home_score_series, home_score_currentCricketDisplay, away_score_display, away_score_period1, away_score_period2, away_score_period3, away_score_period4, away_score_period5, away_score_period6, away_score_period7, away_score_period1TieBreak, away_score_period2TieBreak, away_score_period3TieBreak, away_score_period4TieBreak, away_score_period5TieBreak, away_score_point, away_score_overtime, away_score_penalties, away_score_aggregated, away_score_series, away_score_currentCricketDisplay) \n                SELECT id, home_score_display, home_score_period1, home_score_period2, home_score_period3, home_score_period4, home_score_period5, home_score_period6, home_score_period7, home_score_period1TieBreak, home_score_period2TieBreak, home_score_period3TieBreak, home_score_period4TieBreak, home_score_period5TieBreak, home_score_point, home_score_overtime, home_score_penalties, home_score_aggregated, home_score_series, home_score_currentCricketDisplay, away_score_display, away_score_period1, away_score_period2, away_score_period3, away_score_period4, away_score_period5, away_score_period6, away_score_period7, away_score_period1TieBreak, away_score_period2TieBreak, away_score_period3TieBreak, away_score_period4TieBreak, away_score_period5TieBreak, away_score_point, away_score_overtime, away_score_penalties, away_score_aggregated, away_score_series, away_score_currentCricketDisplay FROM events_table");
                dniVar.E("CREATE TABLE IF NOT EXISTS new_events_table (\n                winnerCode INTEGER,\n                aggregatedWinnerCode INTEGER,\n                hasGlobalHighlights INTEGER NOT NULL DEFAULT 0,\n                hasEventPlayerStatistics INTEGER,\n                hasEventPlayerHeatMap INTEGER NOT NULL,\n                startTimestamp INTEGER NOT NULL,\n                endTimestamp INTEGER,\n                id INTEGER NOT NULL,\n                previousLegEventId INTEGER,\n                lastPeriod TEXT,\n                homeRedCards INTEGER,\n                awayRedCards INTEGER,\n                currentBattingTeamId INTEGER,\n                firstToServe INTEGER,\n                hide INTEGER NOT NULL,\n                mute INTEGER NOT NULL,\n                lastUpdate INTEGER NOT NULL,\n                tournamentId INTEGER NOT NULL,\n                uniqueTournamentId INTEGER,\n                season_id INTEGER,\n                status_code INTEGER NOT NULL,\n                status_description TEXT,\n                status_type TEXT NOT NULL,\n                homeTeamId INTEGER NOT NULL,\n                homeSubTeam1Id INTEGER,\n                homeSubTeam2Id INTEGER,\n                awayTeamId INTEGER NOT NULL,\n                awaySubTeam1Id INTEGER,\n                awaySubTeam2Id INTEGER,\n                time_played INTEGER,\n                time_periodLength INTEGER,\n                time_overtimeLength INTEGER,\n                time_totalPeriodCount INTEGER,\n                time_initial INTEGER,\n                time_max INTEGER,\n                time_currentPeriodStartTimestamp INTEGER,\n                time_extra INTEGER,\n                changes_changes TEXT,\n                changes_changeTimestamp INTEGER,\n                am_football_currentYardsToFirstDown INTEGER,\n                am_football_currentDown INTEGER,\n                am_football_currentYardline INTEGER,\n                am_football_isGoalPossession INTEGER,\n                am_football_currentPossession INTEGER,\n                am_football_currentTeamHalf INTEGER,\n                PRIMARY KEY(id)\n                )");
                try {
                    dniVar.E("INSERT INTO new_events_table \n                    (winnerCode, aggregatedWinnerCode, hasGlobalHighlights, hasEventPlayerStatistics, hasEventPlayerHeatMap, startTimestamp, endTimestamp, id, previousLegEventId, lastPeriod, homeRedCards, awayRedCards, currentBattingTeamId, firstToServe, hide, mute, lastUpdate, tournamentId, uniqueTournamentId, season_id, status_code, status_description, status_type, homeTeamId, awayTeamId, time_played, time_periodLength, time_overtimeLength, time_totalPeriodCount, time_initial, time_max, time_currentPeriodStartTimestamp, time_extra, changes_changes, changes_changeTimestamp, am_football_currentYardsToFirstDown, am_football_currentDown, am_football_currentYardline, am_football_isGoalPossession, am_football_currentPossession, am_football_currentTeamHalf) \n                    SELECT winnerCode, aggregatedWinnerCode, hasGlobalHighlights, hasEventPlayerStatistics, hasEventPlayerHeatMap, startTimestamp, endTimestamp, id, previousLegEventId, lastPeriod, homeRedCards, awayRedCards, currentBattingTeamId, firstToServe, hide, mute, lastUpdate, tournament_id, tournament_unique_tournament_id, season_id, status_code, status_description, status_type, home_team_id, away_team_id, time_played, time_periodLength, time_overtimeLength, time_totalPeriodCount, time_initial, time_max, time_currentPeriodStartTimestamp, time_extra, changes_changes, changes_changeTimestamp, am_football_currentYardsToFirstDown, am_football_currentDown, am_football_currentYardline, am_football_isGoalPossession, am_football_currentPossession, am_football_currentTeamHalf FROM events_table");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
                dniVar.E("DROP TABLE events_table");
                dniVar.E("ALTER TABLE new_events_table RENAME TO events_table");
                return;
            case 19:
                dniVar.getClass();
                wj9.D(dniVar, "EventsTable", "HOME_TEAM_TYPE", "INTEGER");
                wj9.D(dniVar, "EventsTable", "AWAY_TEAM_TYPE", "INTEGER");
                wj9.D(dniVar, "EventsTable", "HOME_TEAM_COUNTRY_ISO", "TEXT");
                wj9.D(dniVar, "EventsTable", "AWAY_TEAM_COUNTRY_ISO", "TEXT");
                return;
            case 20:
                dniVar.getClass();
                wj9.F(dniVar, Sports.MOTORSPORT, "highlights");
                y9fVar.getClass();
                return;
            case 21:
                dniVar.getClass();
                wj9.D(dniVar, "EventsTable", "HOME_TEAM_NAMECODE", "TEXT");
                wj9.D(dniVar, "EventsTable", "AWAY_TEAM_NAMECODE", "TEXT");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_YARDS_TO_FIRST_DOWN", "INTEGER");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_CURRENT_DOWN", "INTEGER");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_CURRENT_YARDLINE", "INTEGER");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_IS_GOAL_POSSESSION", "BOOLEAN");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_CURRENT_POSSESSION", "INTEGER");
                wj9.D(dniVar, "EventsTable", "AM_FOOTBALL_CURRENT_TEAM_HALF", "INTEGER");
                y9fVar.getClass();
                return;
            case 22:
                dniVar.getClass();
                dniVar.E("CREATE TABLE IF NOT EXISTS vote_table_new (id INTEGER NOT NULL, userChoice TEXT NOT NULL, eventTimestamp INTEGER NOT NULL, success INTEGER NOT NULL, voteType TEXT DEFAULT 'Full time' NOT NULL, PRIMARY KEY(id, voteType))");
                dniVar.E("INSERT INTO vote_table_new (id, userChoice, eventTimestamp, success) SELECT id, userChoice, eventTimestamp, success FROM vote_table");
                dniVar.E("DROP TABLE vote_table");
                dniVar.E("ALTER TABLE vote_table_new RENAME TO vote_table");
                y9fVar.getClass();
                return;
            case 23:
                dniVar.getClass();
                wj9.F(dniVar, Sports.ICE_HOCKEY, "period_score");
                return;
            case 24:
                dniVar.getClass();
                dniVar.E("DROP TABLE IF EXISTS LeaguesFilter");
                return;
            case 25:
                dniVar.getClass();
                dniVar.E("CREATE TABLE IF NOT EXISTS BattleDraftMatchesTable ( TEAM_ID TEXT, MATCH_CODE TEXT, MATCH_TIMESTAMP LONG, TEAM_NAME TEXT, PRIMARY KEY (TEAM_ID));");
                return;
            case 26:
                dniVar.getClass();
                dniVar.E("CREATE TABLE IF NOT EXISTS MarketValueUserVotesTable ( PLAYER_ID INTEGER, MARKET_VALUE LONG, CURRENCY TEXT, VOTE_TYPE TEXT, PRIMARY KEY (PLAYER_ID));");
                return;
            case 27:
                dniVar.getClass();
                wj9.D(dniVar, "MarketValueUserVotesTable", "CURRENCY", "TEXT");
                ContentValues contentValues = new ContentValues();
                contentValues.put("CURRENCY", "EUR");
                dniVar.x0("MarketValueUserVotesTable", 4, contentValues, null, null);
                return;
            case 28:
                dniVar.getClass();
                wj9.D(dniVar, "PendingNotifications", "UpdateableNotificationID", "TEXT");
                return;
            case 29:
                dniVar.getClass();
                dniVar.E("CREATE TABLE IF NOT EXISTS SavedSearchesTable (_id INTEGER, ENTITY TEXT, JSON TEXT, TIMESTAMP LONG, PRIMARY KEY (_id, ENTITY));");
                dniVar.E("DROP TABLE IF EXISTS SearchHistoryTable");
                return;
            default:
                super.b(dniVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }
}
