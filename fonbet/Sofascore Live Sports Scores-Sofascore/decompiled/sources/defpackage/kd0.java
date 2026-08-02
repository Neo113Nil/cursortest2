package defpackage;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kd0 extends njc {
    public final /* synthetic */ int c;
    public final jr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(int i) {
        super(104, 105);
        this.c = i;
        switch (i) {
            case 1:
                super(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                this.d = new xw4();
                break;
            case 2:
                super(128, 129);
                this.d = new xw4();
                break;
            case 3:
                super(134, 135);
                this.d = new xw4();
                break;
            case 4:
                super(135, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                this.d = new xw4();
                break;
            case 5:
                super(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
                this.d = new xw4();
                break;
            case 6:
                super(138, 139);
                this.d = new p4h(21);
                break;
            case 7:
                super(144, 145);
                this.d = new xw4();
                break;
            case 8:
                super(146, 147);
                this.d = new xw4();
                break;
            case 9:
                super(14, 15);
                this.d = new wib(16);
                break;
            case 10:
                super(19, 20);
                this.d = new ccd();
                break;
            default:
                this.d = new wje(4);
                break;
        }
    }

    @Override // defpackage.njc
    public final void a(glg glgVar) {
        int i = this.c;
        jr0 jr0Var = this.d;
        switch (i) {
            case 0:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `battle_draft_match_table` (`teamId` TEXT NOT NULL, `matchCode` TEXT NOT NULL, `matchTimestamp` INTEGER NOT NULL, `teamName` TEXT NOT NULL, PRIMARY KEY(`teamId`))", glgVar, "CREATE TABLE IF NOT EXISTS `pinned_tournaments_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_players_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `userCount` INTEGER NOT NULL, `team_id` INTEGER, `team_name` TEXT, `team_slug` TEXT, `team_userCount` INTEGER, `team_type` INTEGER, `team_nameCode` TEXT, `team_shortName` TEXT, `team_gender` TEXT, `team_ranking` INTEGER, `team_disabled` INTEGER, `team_sub_team_one_id` INTEGER, `team_sub_team_one_name` TEXT, `team_sub_team_two_id` INTEGER, `team_sub_team_two_name` TEXT, `team_sport_id` INTEGER, `team_sport_slug` TEXT, `team_country_name` TEXT, `team_country_alpha2` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_stage_table` (`description` TEXT NOT NULL, `type` TEXT, `id` INTEGER NOT NULL, `startDateTimestamp` INTEGER, `flag` TEXT, `lastUpdate` INTEGER NOT NULL, `status_code` INTEGER, `status_description` TEXT, `status_type` TEXT, `winner_id` INTEGER, `winner_name` TEXT, `parent_event_id` INTEGER, `parent_event_description` TEXT, `parent_event_startTimestamp` INTEGER, `parent_event_flag` TEXT, `stage_season_description` TEXT, `stage_season_year` TEXT, `stage_season_id` INTEGER, `stage_season_unique_stage_id` INTEGER, `stage_season_unique_stage_name` TEXT, `stage_season_unique_stage_primaryColorHex` TEXT, `stage_season_unique_stage_secondaryColorHex` TEXT, `stage_season_unique_stage_category_id` INTEGER, `stage_season_unique_stage_category_name` TEXT, `stage_season_unique_stage_category_flag` TEXT, `stage_season_unique_stage_category_sport_id` INTEGER, `stage_season_unique_stage_category_sport_slug` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_team_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `slug` TEXT NOT NULL, `userCount` INTEGER NOT NULL, `type` INTEGER NOT NULL, `nameCode` TEXT, `shortName` TEXT, `gender` TEXT, `ranking` INTEGER, `disabled` INTEGER NOT NULL, `sub_team_one_id` INTEGER, `sub_team_one_name` TEXT, `sub_team_two_id` INTEGER, `sub_team_two_name` TEXT, `sport_id` INTEGER, `sport_slug` TEXT, `country_name` TEXT, `country_alpha2` TEXT, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_channels_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `countryCode` TEXT NOT NULL, PRIMARY KEY(`id`, `countryCode`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `tv_channel_vote_table` (`eventId` INTEGER NOT NULL, `channelId` INTEGER NOT NULL, `isConfirmed` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`, `channelId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `my_leagues_table` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `userCount` INTEGER NOT NULL, `hasEventPlayerStatistics` INTEGER NOT NULL, `displayInverseHomeAwayTeams` INTEGER NOT NULL, `groundType` TEXT, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `market_value_user_votes_table` (`playerId` INTEGER NOT NULL, `playerValue` INTEGER NOT NULL, `currency` TEXT NOT NULL, `voteType` TEXT NOT NULL, PRIMARY KEY(`playerId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `events_table` (`winnerCode` INTEGER, `aggregatedWinnerCode` INTEGER, `hasEventPlayerStatistics` INTEGER, `hasEventPlayerHeatMap` INTEGER NOT NULL, `startTimestamp` INTEGER NOT NULL, `endTimestamp` INTEGER, `id` INTEGER NOT NULL, `previousLegEventId` INTEGER, `lastPeriod` TEXT, `currentBattingTeamId` INTEGER, `firstToServe` INTEGER, `hide` INTEGER NOT NULL, `mute` INTEGER NOT NULL, `lastUpdate` INTEGER NOT NULL, `tournament_id` INTEGER NOT NULL, `tournament_name` TEXT NOT NULL, `tournament_category_id` INTEGER NOT NULL, `tournament_category_name` TEXT NOT NULL, `tournament_category_flag` TEXT NOT NULL, `tournament_category_sport_id` INTEGER NOT NULL, `tournament_category_sport_slug` TEXT NOT NULL, `tournament_unique_tournament_id` INTEGER, `tournament_unique_tournament_name` TEXT, `tournament_unique_tournament_userCount` INTEGER, `tournament_unique_tournament_hasEventPlayerStatistics` INTEGER, `tournament_unique_tournament_displayInverseHomeAwayTeams` INTEGER, `tournament_unique_tournament_groundType` TEXT, `tournament_unique_tournament_category_id` INTEGER, `tournament_unique_tournament_category_name` TEXT, `tournament_unique_tournament_category_flag` TEXT, `tournament_unique_tournament_category_sport_id` INTEGER, `tournament_unique_tournament_category_sport_slug` TEXT, `season_id` INTEGER, `status_code` INTEGER NOT NULL, `status_description` TEXT, `status_type` TEXT NOT NULL, `home_team_id` INTEGER NOT NULL, `home_team_name` TEXT NOT NULL, `home_team_slug` TEXT NOT NULL, `home_team_userCount` INTEGER NOT NULL, `home_team_type` INTEGER NOT NULL, `home_team_nameCode` TEXT, `home_team_shortName` TEXT, `home_team_gender` TEXT, `home_team_ranking` INTEGER, `home_team_disabled` INTEGER NOT NULL, `home_team_sub_team_one_id` INTEGER, `home_team_sub_team_one_name` TEXT, `home_team_sub_team_two_id` INTEGER, `home_team_sub_team_two_name` TEXT, `home_team_sport_id` INTEGER, `home_team_sport_slug` TEXT, `home_team_country_name` TEXT, `home_team_country_alpha2` TEXT, `away_team_id` INTEGER NOT NULL, `away_team_name` TEXT NOT NULL, `away_team_slug` TEXT NOT NULL, `away_team_userCount` INTEGER NOT NULL, `away_team_type` INTEGER NOT NULL, `away_team_nameCode` TEXT, `away_team_shortName` TEXT, `away_team_gender` TEXT, `away_team_ranking` INTEGER, `away_team_disabled` INTEGER NOT NULL, `away_team_sub_team_one_id` INTEGER, `away_team_sub_team_one_name` TEXT, `away_team_sub_team_two_id` INTEGER, `away_team_sub_team_two_name` TEXT, `away_team_sport_id` INTEGER, `away_team_sport_slug` TEXT, `away_team_country_name` TEXT, `away_team_country_alpha2` TEXT, `home_score_display` INTEGER, `home_score_period1` INTEGER, `home_score_period2` INTEGER, `home_score_period3` INTEGER, `home_score_period4` INTEGER, `home_score_period5` INTEGER, `home_score_period6` INTEGER, `home_score_period7` INTEGER, `home_score_period1TieBreak` INTEGER, `home_score_period2TieBreak` INTEGER, `home_score_period3TieBreak` INTEGER, `home_score_period4TieBreak` INTEGER, `home_score_period5TieBreak` INTEGER, `home_score_point` TEXT, `home_score_overtime` INTEGER, `home_score_penalties` INTEGER, `home_score_aggregated` INTEGER, `home_score_series` INTEGER, `home_score_currentCricketDisplay` TEXT, `away_score_display` INTEGER, `away_score_period1` INTEGER, `away_score_period2` INTEGER, `away_score_period3` INTEGER, `away_score_period4` INTEGER, `away_score_period5` INTEGER, `away_score_period6` INTEGER, `away_score_period7` INTEGER, `away_score_period1TieBreak` INTEGER, `away_score_period2TieBreak` INTEGER, `away_score_period3TieBreak` INTEGER, `away_score_period4TieBreak` INTEGER, `away_score_period5TieBreak` INTEGER, `away_score_point` TEXT, `away_score_overtime` INTEGER, `away_score_penalties` INTEGER, `away_score_aggregated` INTEGER, `away_score_series` INTEGER, `away_score_currentCricketDisplay` TEXT, `time_played` INTEGER, `time_periodLength` INTEGER, `time_overtimeLength` INTEGER, `time_totalPeriodCount` INTEGER, `time_initial` INTEGER, `time_max` INTEGER, `time_currentPeriodStartTimestamp` INTEGER, `time_extra` INTEGER, `changes_changes` TEXT, `changes_changeTimestamp` INTEGER, `am_football_currentYardsToFirstDown` INTEGER, `am_football_currentDown` INTEGER, `am_football_currentYardline` INTEGER, `am_football_isGoalPossession` INTEGER, `am_football_currentPossession` INTEGER, `am_football_currentTeamHalf` INTEGER, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `sport_order` (`sportName` TEXT NOT NULL, `sportOrder` INTEGER NOT NULL, PRIMARY KEY(`sportName`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `notification_settings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sportName` TEXT NOT NULL, `notificationName` TEXT NOT NULL, `notificationValue` INTEGER NOT NULL)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `pending_notifications` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `notificationId` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `updatableNotificationId` TEXT)");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `popular_categories` (`sportName` TEXT NOT NULL, `categoryId` INTEGER NOT NULL, `orderIndex` INTEGER NOT NULL, PRIMARY KEY(`sportName`, `categoryId`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `chat_message_table` (`eventId` INTEGER NOT NULL, `messageTimestamp` INTEGER NOT NULL, `voteTimestamp` INTEGER NOT NULL, `reportTimestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`, `messageTimestamp`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `saved_searches_table` (`id` INTEGER NOT NULL, `entity` TEXT NOT NULL, `json` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`, `entity`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `video_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `news_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `vote_table` (`id` INTEGER NOT NULL, `userChoice` TEXT NOT NULL, `eventTimestamp` INTEGER NOT NULL, `success` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                ((wje) jr0Var).i(glgVar);
                break;
            case 1:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `event_predictions`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 2:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `notification_settings`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 3:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `streamContentId` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `streamContentGeoRestrictions` TEXT DEFAULT NULL");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `_new_events_table` (`winnerCode` INTEGER, `aggregatedWinnerCode` INTEGER, `homeTeamId` INTEGER NOT NULL, `homeSubTeam1Id` INTEGER, `homeSubTeam2Id` INTEGER, `awayTeamId` INTEGER NOT NULL, `awaySubTeam1Id` INTEGER, `awaySubTeam2Id` INTEGER, `hasEventPlayerHeatMap` INTEGER NOT NULL, `startTimestamp` INTEGER NOT NULL, `endTimestamp` INTEGER, `id` INTEGER NOT NULL, `tournamentId` INTEGER NOT NULL, `uniqueTournamentId` INTEGER, `previousLegEventId` INTEGER, `lastPeriod` TEXT, `homeRedCards` INTEGER, `awayRedCards` INTEGER, `currentBattingTeamId` INTEGER, `firstToServe` INTEGER, `bestOfSets` INTEGER, `bestOfLegs` INTEGER, `crowdsourcingDataDisplayEnabled` INTEGER, `finalResultOnly` INTEGER, `streamContentId` INTEGER DEFAULT NULL, `streamContentGeoRestrictions` TEXT DEFAULT NULL, `hide` INTEGER NOT NULL, `mute` INTEGER NOT NULL, `lastUpdate` INTEGER NOT NULL, `season_id` INTEGER, `status_code` INTEGER NOT NULL, `status_description` TEXT, `status_type` TEXT NOT NULL, `time_played` INTEGER, `time_periodLength` INTEGER, `time_overtimeLength` INTEGER, `time_totalPeriodCount` INTEGER, `time_initial` INTEGER, `time_max` INTEGER, `time_currentPeriodStartTimestamp` INTEGER, `time_extra` INTEGER, `changes_changes` TEXT, `changes_changeTimestamp` INTEGER, `am_football_currentYardsToFirstDown` INTEGER, `am_football_currentDown` INTEGER, `am_football_currentYardline` INTEGER, `am_football_isGoalPossession` INTEGER, `am_football_currentPossession` INTEGER, `am_football_currentTeamHalf` INTEGER, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "INSERT INTO `_new_events_table` (`winnerCode`,`aggregatedWinnerCode`,`homeTeamId`,`homeSubTeam1Id`,`homeSubTeam2Id`,`awayTeamId`,`awaySubTeam1Id`,`awaySubTeam2Id`,`hasEventPlayerHeatMap`,`startTimestamp`,`endTimestamp`,`id`,`tournamentId`,`uniqueTournamentId`,`previousLegEventId`,`lastPeriod`,`homeRedCards`,`awayRedCards`,`currentBattingTeamId`,`firstToServe`,`bestOfSets`,`bestOfLegs`,`crowdsourcingDataDisplayEnabled`,`finalResultOnly`,`hide`,`mute`,`lastUpdate`,`season_id`,`status_code`,`status_description`,`status_type`,`time_played`,`time_periodLength`,`time_overtimeLength`,`time_totalPeriodCount`,`time_initial`,`time_max`,`time_currentPeriodStartTimestamp`,`time_extra`,`changes_changes`,`changes_changeTimestamp`,`am_football_currentYardsToFirstDown`,`am_football_currentDown`,`am_football_currentYardline`,`am_football_isGoalPossession`,`am_football_currentPossession`,`am_football_currentTeamHalf`) SELECT `winnerCode`,`aggregatedWinnerCode`,`homeTeamId`,`homeSubTeam1Id`,`homeSubTeam2Id`,`awayTeamId`,`awaySubTeam1Id`,`awaySubTeam2Id`,`hasEventPlayerHeatMap`,`startTimestamp`,`endTimestamp`,`id`,`tournamentId`,`uniqueTournamentId`,`previousLegEventId`,`lastPeriod`,`homeRedCards`,`awayRedCards`,`currentBattingTeamId`,`firstToServe`,`bestOfSets`,`bestOfLegs`,`crowdsourcingDataDisplayEnabled`,`finalResultOnly`,`hide`,`mute`,`lastUpdate`,`season_id`,`status_code`,`status_description`,`status_type`,`time_played`,`time_periodLength`,`time_overtimeLength`,`time_totalPeriodCount`,`time_initial`,`time_max`,`time_currentPeriodStartTimestamp`,`time_extra`,`changes_changes`,`changes_changeTimestamp`,`am_football_currentYardsToFirstDown`,`am_football_currentDown`,`am_football_currentYardline`,`am_football_isGoalPossession`,`am_football_currentPossession`,`am_football_currentTeamHalf` FROM `events_table`");
                b0a.F(glgVar, "DROP TABLE `events_table`");
                b0a.F(glgVar, "ALTER TABLE `_new_events_table` RENAME TO `events_table`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 4:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `battle_draft_match_table`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 5:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `user_segmentation_analytics`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 6:
                w1l.t(glgVar, glgVar, "DROP TABLE `read_messages_table`", glgVar, "ALTER TABLE `media_reaction_table` ADD COLUMN `shareCount` INTEGER NOT NULL DEFAULT 0");
                ((p4h) jr0Var).i(glgVar);
                break;
            case 7:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `story_view_table`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 8:
                glgVar.getClass();
                b0a.F(glgVar, "DROP TABLE `ad_seen_table`");
                ((xw4) jr0Var).i(glgVar);
                break;
            case 9:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", glgVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                b0a.F(glgVar, "DROP TABLE `WorkSpec`");
                b0a.F(glgVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((wib) jr0Var).i(glgVar);
                break;
            default:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", glgVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                b0a.F(glgVar, "DROP TABLE `WorkSpec`");
                b0a.F(glgVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                b0a.F(glgVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((ccd) jr0Var).i(glgVar);
                break;
        }
    }
}
