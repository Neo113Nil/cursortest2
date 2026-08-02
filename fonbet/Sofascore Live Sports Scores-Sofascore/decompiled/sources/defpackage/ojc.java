package defpackage;

import androidx.work.OverwritingInputMerger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ojc extends njc {
    public static final ojc d = new ojc(11, 12, 0);
    public static final ojc e = new ojc(12, 13, 1);
    public static final ojc f = new ojc(15, 16, 2);
    public static final ojc g = new ojc(16, 17, 3);
    public static final ojc h = new ojc(1, 2, 4);
    public static final ojc i = new ojc(3, 4, 5);
    public static final ojc j = new ojc(4, 5, 6);
    public static final ojc k = new ojc(6, 7, 7);
    public static final ojc l = new ojc(7, 8, 8);
    public static final ojc m = new ojc(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ojc(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    @Override // defpackage.njc
    public void a(glg glgVar) {
        switch (this.c) {
            case 10:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `homeRedCards` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `awayRedCards` INTEGER DEFAULT NULL");
                break;
            case 11:
                glgVar.getClass();
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `hasGlobalHighlights` INTEGER NOT NULL DEFAULT 0");
                break;
            case 12:
                w1l.t(glgVar, glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `tennisPoints` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_tennisPoints` INTEGER DEFAULT NULL");
                break;
            case 13:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `crowdscourcing_scorer_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventId` INTEGER NOT NULL, `eventTimestamp` INTEGER NOT NULL, `isHomeTeamIncident` INTEGER NOT NULL, `homeScoreSuggest` INTEGER NOT NULL, `awayScoreSuggest` INTEGER NOT NULL, `scoreType` TEXT, `eventStatusType` TEXT, `scorerId` INTEGER, `assistId` INTEGER, `group` INTEGER NOT NULL)");
                break;
            case 14:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `buzzer_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 15:
                w1l.t(glgVar, glgVar, "CREATE TABLE IF NOT EXISTS `_new_pinned_tournaments_table` (`id` INTEGER NOT NULL, `name` TEXT, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, PRIMARY KEY(`id`))", glgVar, "INSERT INTO `_new_pinned_tournaments_table` (`id`,`name`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`) SELECT `id`,`name`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug` FROM `pinned_tournaments_table`");
                b0a.F(glgVar, "DROP TABLE `pinned_tournaments_table`");
                b0a.F(glgVar, "ALTER TABLE `_new_pinned_tournaments_table` RENAME TO `pinned_tournaments_table`");
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `_new_my_leagues_table` (`id` INTEGER NOT NULL, `name` TEXT, `userCount` INTEGER NOT NULL, `hasEventPlayerStatistics` INTEGER NOT NULL, `displayInverseHomeAwayTeams` INTEGER NOT NULL, `groundType` TEXT, `tennisPoints` INTEGER, `category_id` INTEGER NOT NULL, `category_name` TEXT NOT NULL, `category_flag` TEXT NOT NULL, `category_sport_id` INTEGER NOT NULL, `category_sport_slug` TEXT NOT NULL, PRIMARY KEY(`id`))");
                b0a.F(glgVar, "INSERT INTO `_new_my_leagues_table` (`id`,`name`,`userCount`,`hasEventPlayerStatistics`,`displayInverseHomeAwayTeams`,`groundType`,`tennisPoints`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`) SELECT `id`,`name`,`userCount`,`hasEventPlayerStatistics`,`displayInverseHomeAwayTeams`,`groundType`,`tennisPoints`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug` FROM `my_leagues_table`");
                b0a.F(glgVar, "DROP TABLE `my_leagues_table`");
                b0a.F(glgVar, "ALTER TABLE `_new_my_leagues_table` RENAME TO `my_leagues_table`");
                break;
            case 16:
                w1l.t(glgVar, glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `hasBoxScore` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_hasBoxScore` INTEGER DEFAULT NULL");
                break;
            case 17:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `story_view_table` (`storyGroupId` INTEGER NOT NULL, `storyId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`storyGroupId`, `storyId`))");
                break;
            case 18:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `ad_seen_table` (`id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 19:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `read_messages_table` (`id` INTEGER NOT NULL, `readMessageCount` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 20:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `event_predictions` (`eventId` INTEGER NOT NULL, `startTimestamp` INTEGER NOT NULL, PRIMARY KEY(`eventId`))");
                break;
            case 21:
                w1l.t(glgVar, glgVar, "ALTER TABLE `pinned_tournaments_table` ADD COLUMN `category_nameTranslation` TEXT DEFAULT NULL", glgVar, "ALTER TABLE `pinned_tournaments_table` ADD COLUMN `category_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `pinned_tournaments_table` ADD COLUMN `nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `pinned_tournaments_table` ADD COLUMN `shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_sub_team_one_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_sub_team_one_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_sub_team_two_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_sub_team_two_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `team_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_players_table` ADD COLUMN `shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_stage_table` ADD COLUMN `stage_season_unique_stage_category_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_stage_table` ADD COLUMN `stage_season_unique_stage_category_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `sub_team_one_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `sub_team_one_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `sub_team_two_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `sub_team_two_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_team_table` ADD COLUMN `shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `category_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `category_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `my_leagues_table` ADD COLUMN `shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_category_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_category_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_category_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_category_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_unique_tournament_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `tournament_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_sub_team_one_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_sub_team_one_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_sub_team_two_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_sub_team_two_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `home_team_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_sub_team_one_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_sub_team_one_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_sub_team_two_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_sub_team_two_shortNameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_nameTranslation` TEXT DEFAULT NULL");
                b0a.F(glgVar, "ALTER TABLE `events_table` ADD COLUMN `away_team_shortNameTranslation` TEXT DEFAULT NULL");
                break;
            case 22:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `mma_organization_view_table` (`id` INTEGER NOT NULL, `viewCount` INTEGER NOT NULL, `ignored` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 23:
                w1l.t(glgVar, glgVar, "ALTER TABLE `my_stage_table` ADD COLUMN `isMuted` INTEGER NOT NULL DEFAULT 0", glgVar, "CREATE TABLE IF NOT EXISTS `my_unique_stage` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 24:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `media_reaction_table` (`mediaPostId` INTEGER NOT NULL, `reaction` TEXT, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`mediaPostId`))");
                break;
            case 25:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `nats_event_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `topic` TEXT NOT NULL, `message` TEXT NOT NULL)");
                break;
            case 26:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `user_weekly_leaderboard` (`userId` TEXT NOT NULL, `leaderboardId` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
                break;
            case 27:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `user_segmentation_analytics` (`timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
                break;
            case 28:
                glgVar.getClass();
                b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS `fantasy_competition_table` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 29:
                w1l.t(glgVar, glgVar, "ALTER TABLE `events_table` ADD COLUMN `crowdsourcingDataDisplayEnabled` INTEGER DEFAULT NULL", glgVar, "ALTER TABLE `events_table` ADD COLUMN `finalResultOnly` INTEGER DEFAULT NULL");
                break;
            default:
                super.a(glgVar);
                break;
        }
    }

    @Override // defpackage.njc
    public void b(dni dniVar) {
        switch (this.c) {
            case 0:
                dniVar.getClass();
                dniVar.E("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                dniVar.getClass();
                dniVar.E("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                dniVar.E("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                dniVar.getClass();
                dniVar.E("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                dniVar.E("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                dniVar.E("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                dniVar.E("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                dniVar.E("DROP TABLE `SystemIdInfo`");
                dniVar.E("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case 3:
                dniVar.getClass();
                dniVar.E(dii.c("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                dniVar.E("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                dniVar.E("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                dniVar.E("DROP TABLE `WorkSpec`");
                dniVar.E("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                dniVar.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                dniVar.E("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                dniVar.getClass();
                dniVar.E("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                dniVar.E("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                dniVar.E("DROP TABLE IF EXISTS alarmInfo");
                dniVar.E("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                dniVar.getClass();
                dniVar.E("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                dniVar.getClass();
                dniVar.E("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                dniVar.E("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                dniVar.getClass();
                dniVar.E("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                dniVar.getClass();
                dniVar.E("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                dniVar.getClass();
                dniVar.E("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                super.b(dniVar);
                break;
        }
    }
}
