package db;

import androidx.work.impl.WorkDatabase_Impl;
import com.sports.insider.data.repository.room.accountsetting.database.AccountSettingTable;
import com.sports.insider.data.repository.room.accountsetting.database.AccountSetting_Impl;
import com.sports.insider.data.repository.room.billing.BillingDatabase_Impl;
import com.sports.insider.data.repository.room.billing.PricesTable;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.data.repository.room.billing.SkuIdContentTypeTable;
import com.sports.insider.data.repository.room.live.LiveDatabase_Impl;
import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.data.repository.room.metric.MetricsDatabase_Impl;
import com.sports.insider.data.repository.room.metric.PushMetricsTable;
import com.sports.insider.data.repository.room.news.NewsDatabase_Impl;
import com.sports.insider.data.repository.room.news.NewsTable;
import com.sports.insider.data.repository.room.sports.db.impl.SportsDatabase_Impl;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable;
import com.sports.insider.data.repository.room.support.dp.impl.SupportDatabase_Impl;
import com.sports.insider.data.room.general.AppDatabase_Impl;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.data.room.general.table.OrdersTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import f3.x;
import g6.h0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j1.f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k2.w;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import p2.h;
import p2.i;
import p2.j;
import p2.k;
import rh.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8359d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f8360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AccountSetting_Impl accountSetting_Impl) {
        super(1, "9525a6c8b345f950127adfb7d92b3410", "40ed2a3f8bf22af7dd2a292120cdeabf");
        this.f8360e = accountSetting_Impl;
    }

    private final h0 h(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new h("work_spec_id", "TEXT", true, 1, null, 1));
        LinkedHashSet r5 = d9.e.r(linkedHashMap, "prerequisite_id", new h("prerequisite_id", "TEXT", true, 2, null, 1));
        r5.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("work_spec_id"), t.c("id")));
        r5.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("prerequisite_id"), t.c("id")));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new j("index_Dependency_work_spec_id", false, t.c("work_spec_id"), t.c("ASC")));
        linkedHashSet.add(new j("index_Dependency_prerequisite_id", false, t.c("prerequisite_id"), t.c("ASC")));
        k kVar = new k("Dependency", linkedHashMap, r5, linkedHashSet);
        k G = g.G(connection, "Dependency");
        if (!kVar.equals(G)) {
            return new h0(false, d9.e.h("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", kVar, "\n Found:\n", G));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new h("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new h("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new h("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new h("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new h("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new h("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new h("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new h("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new h("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new h("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new h("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new h("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new h("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new h("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new h("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new h("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new h("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new h("period_count", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
        linkedHashMap2.put("generation", new h("generation", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
        linkedHashMap2.put("next_schedule_time_override", new h("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new h("next_schedule_time_override_generation", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
        linkedHashMap2.put("stop_reason", new h("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new h("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new h("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new h("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new h("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new h("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new h("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new h("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new h("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new h("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new h("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        LinkedHashSet r6 = d9.e.r(linkedHashMap2, "content_uri_triggers", new h("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new j("index_WorkSpec_schedule_requested_at", false, t.c("schedule_requested_at"), t.c("ASC")));
        linkedHashSet2.add(new j("index_WorkSpec_last_enqueue_time", false, t.c("last_enqueue_time"), t.c("ASC")));
        k kVar2 = new k("WorkSpec", linkedHashMap2, r6, linkedHashSet2);
        k G2 = g.G(connection, "WorkSpec");
        if (!kVar2.equals(G2)) {
            return new h0(false, d9.e.h("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", kVar2, "\n Found:\n", G2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new h("tag", "TEXT", true, 1, null, 1));
        LinkedHashSet r10 = d9.e.r(linkedHashMap3, "work_spec_id", new h("work_spec_id", "TEXT", true, 2, null, 1));
        r10.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("work_spec_id"), t.c("id")));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new j("index_WorkTag_work_spec_id", false, t.c("work_spec_id"), t.c("ASC")));
        k kVar3 = new k("WorkTag", linkedHashMap3, r10, linkedHashSet3);
        k G3 = g.G(connection, "WorkTag");
        if (!kVar3.equals(G3)) {
            return new h0(false, d9.e.h("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", kVar3, "\n Found:\n", G3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new h("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new h("generation", "INTEGER", true, 2, CommonUrlParts.Values.FALSE_INTEGER, 1));
        LinkedHashSet r11 = d9.e.r(linkedHashMap4, "system_id", new h("system_id", "INTEGER", true, 0, null, 1));
        r11.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("work_spec_id"), t.c("id")));
        k kVar4 = new k("SystemIdInfo", linkedHashMap4, r11, new LinkedHashSet());
        k G4 = g.G(connection, "SystemIdInfo");
        if (!kVar4.equals(G4)) {
            return new h0(false, d9.e.h("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", kVar4, "\n Found:\n", G4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new h("name", "TEXT", true, 1, null, 1));
        LinkedHashSet r12 = d9.e.r(linkedHashMap5, "work_spec_id", new h("work_spec_id", "TEXT", true, 2, null, 1));
        r12.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("work_spec_id"), t.c("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new j("index_WorkName_work_spec_id", false, t.c("work_spec_id"), t.c("ASC")));
        k kVar5 = new k("WorkName", linkedHashMap5, r12, linkedHashSet4);
        k G5 = g.G(connection, "WorkName");
        if (!kVar5.equals(G5)) {
            return new h0(false, d9.e.h("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", kVar5, "\n Found:\n", G5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new h("work_spec_id", "TEXT", true, 1, null, 1));
        LinkedHashSet r13 = d9.e.r(linkedHashMap6, "progress", new h("progress", "BLOB", true, 0, null, 1));
        r13.add(new i("WorkSpec", "CASCADE", "CASCADE", t.c("work_spec_id"), t.c("id")));
        k kVar6 = new k("WorkProgress", linkedHashMap6, r13, new LinkedHashSet());
        k G6 = g.G(connection, "WorkProgress");
        if (!kVar6.equals(G6)) {
            return new h0(false, d9.e.h("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", kVar6, "\n Found:\n", G6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new h("key", "TEXT", true, 1, null, 1));
        k kVar7 = new k("Preference", linkedHashMap7, d9.e.r(linkedHashMap7, "long_value", new h("long_value", "INTEGER", false, 0, null, 1)), new LinkedHashSet());
        k G7 = g.G(connection, "Preference");
        return !kVar7.equals(G7) ? new h0(false, d9.e.h("Preference(androidx.work.impl.model.Preference).\n Expected:\n", kVar7, "\n Found:\n", G7)) : new h0(true, (String) null);
    }

    private final h0 i(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put(NewsTable.DATE_TIME_COLUMN, new h(NewsTable.DATE_TIME_COLUMN, "INTEGER", true, 0, null, 1));
        linkedHashMap.put("title", new h("title", "TEXT", true, 0, null, 1));
        linkedHashMap.put(NewsTable.PICTURE_COLUMN, new h(NewsTable.PICTURE_COLUMN, "TEXT", false, 0, null, 1));
        LinkedHashSet r5 = d9.e.r(linkedHashMap, NewsTable.TEXT_COLUMN, new h(NewsTable.TEXT_COLUMN, "TEXT", false, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new j("index_news_table_dateTime", false, t.c(NewsTable.DATE_TIME_COLUMN), t.c("ASC")));
        k kVar = new k(NewsTable.TABLE_NAME, linkedHashMap, r5, linkedHashSet);
        k G = g.G(connection, NewsTable.TABLE_NAME);
        return !kVar.equals(G) ? new h0(false, d9.e.h("news_table(com.sports.insider.data.repository.room.news.NewsTable).\n Expected:\n", kVar, "\n Found:\n", G)) : new h0(true, (String) null);
    }

    private final h0 j(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(SportsTable.ID_COLUMN, new h(SportsTable.ID_COLUMN, "INTEGER", true, 1, null, 1));
        linkedHashMap.put(SportsTable.NAME_COLUMN_EN, new h(SportsTable.NAME_COLUMN_EN, "TEXT", true, 0, "'Undefined'", 1));
        linkedHashMap.put(SportsTable.NAME_COLUMN_RU, new h(SportsTable.NAME_COLUMN_RU, "TEXT", true, 0, "'Undefined'", 1));
        k kVar = new k(SportsTable.TABLE_NAME, linkedHashMap, d9.e.r(linkedHashMap, SportsTable.LOGO_COLUMN, new h(SportsTable.LOGO_COLUMN, "TEXT", false, 0, "NULL", 1)), new LinkedHashSet());
        k G = g.G(connection, SportsTable.TABLE_NAME);
        return !kVar.equals(G) ? new h0(false, d9.e.h("sports_table(com.sports.insider.data.repository.room.sports.db.impl.SportsTable).\n Expected:\n", kVar, "\n Found:\n", G)) : new h0(true, (String) null);
    }

    private final h0 k(s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("remoteId", new h("remoteId", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("dateCreate", new h("dateCreate", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("dateUpdate", new h("dateUpdate", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("stateRead", new h("stateRead", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("readDate", new h("readDate", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("sendDate", new h("sendDate", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("operatorName", new h("operatorName", "TEXT", false, 0, null, 1));
        linkedHashMap.put(NewsTable.TEXT_COLUMN, new h(NewsTable.TEXT_COLUMN, "TEXT", false, 0, null, 1));
        linkedHashMap.put("type", new h("type", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("mime", new h("mime", "TEXT", false, 0, null, 1));
        LinkedHashSet r5 = d9.e.r(linkedHashMap, EventsTable.contentColumn, new h(EventsTable.contentColumn, "TEXT", false, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new j("index_support_table_id", true, t.c("id"), t.c("ASC")));
        k kVar = new k("support_table", linkedHashMap, r5, linkedHashSet);
        k G = g.G(connection, "support_table");
        if (!kVar.equals(G)) {
            return new h0(false, d9.e.h("support_table(com.sports.insider.data.repository.room.support.dp.impl.SupportTable).\n Expected:\n", kVar, "\n Found:\n", G));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put(FrequentQuestionsTable.columnQuestion, new h(FrequentQuestionsTable.columnQuestion, "TEXT", true, 0, null, 1));
        LinkedHashSet r6 = d9.e.r(linkedHashMap2, FrequentQuestionsTable.columnAnswer, new h(FrequentQuestionsTable.columnAnswer, "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new j(FrequentQuestionsTable.columnIdIndex, false, t.c("id"), t.c("ASC")));
        k kVar2 = new k(FrequentQuestionsTable.tableName, linkedHashMap2, r6, linkedHashSet2);
        k G2 = g.G(connection, FrequentQuestionsTable.tableName);
        return !kVar2.equals(G2) ? new h0(false, d9.e.h("frequent_questions_table(com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable).\n Expected:\n", kVar2, "\n Found:\n", G2)) : new h0(true, (String) null);
    }

    @Override // j1.f
    public final void a(s2.a connection) {
        switch (this.f8359d) {
            case 0:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `account_setting_table` (`account_setting_id_name` TEXT NOT NULL, `account_setting_value_name` INTEGER NOT NULL, PRIMARY KEY(`account_setting_id_name`))");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9525a6c8b345f950127adfb7d92b3410')");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `sku_details_table` (`sku` TEXT NOT NULL, `jsonString` TEXT NOT NULL, PRIMARY KEY(`sku`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_sku_details_table_sku` ON `sku_details_table` (`sku`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `purchase_subs_table` (`sku` TEXT NOT NULL, `jsonString` TEXT NOT NULL, PRIMARY KEY(`sku`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_purchase_subs_table_sku` ON `purchase_subs_table` (`sku`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `prices_table` (`typePrice` INTEGER NOT NULL, `type` TEXT NOT NULL, `currentPrice` TEXT, `standardPrice` TEXT, `currentPlanId` TEXT, `standardPlanId` TEXT, `currentOfferId` TEXT, `standardOfferId` TEXT, `endTime` TEXT, PRIMARY KEY(`typePrice`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_prices_table_typePrice` ON `prices_table` (`typePrice`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `sku_id_content_type_table` (`id` TEXT NOT NULL, `typeSkuContent` INTEGER NOT NULL, `typeSku` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ac17f5ff3afbec23821a0b613d80cac')");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `live_table` (`id` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `isViewed` INTEGER, `imageUrl` TEXT, `title` TEXT, `message` TEXT, `btnText` TEXT, `btnUrl` TEXT, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_live_table_id` ON `live_table` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '802a31bbed2835ddee1e851632d88296')");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `events_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `content` TEXT, `dateCreate` INTEGER NOT NULL)");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_events_table_id` ON `events_table` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `push_metrics_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `pushId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `dateCreate` INTEGER NOT NULL)");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_push_metrics_table_id` ON `push_metrics_table` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e30d77139cd53f9753fd4128832beffb')");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `news_table` (`id` INTEGER NOT NULL, `dateTime` INTEGER NOT NULL, `title` TEXT NOT NULL, `picture` TEXT, `text` TEXT, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_news_table_dateTime` ON `news_table` (`dateTime`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4daa3560a546ea419cfc357ff1c5da62')");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `sports_table` (`idCategory` INTEGER NOT NULL, `nameCategoryEn` TEXT NOT NULL DEFAULT 'Undefined', `nameCategoryRu` TEXT NOT NULL DEFAULT 'Undefined', `logoCategory` TEXT DEFAULT NULL, PRIMARY KEY(`idCategory`))");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1b09f5ee1560747902d50fd9e23a6f0f')");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `support_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remoteId` INTEGER NOT NULL, `dateCreate` INTEGER NOT NULL, `dateUpdate` INTEGER NOT NULL, `stateRead` INTEGER NOT NULL, `readDate` INTEGER NOT NULL, `sendDate` INTEGER NOT NULL, `operatorName` TEXT, `text` TEXT, `type` INTEGER NOT NULL, `mime` TEXT, `content` TEXT)");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_support_table_id` ON `support_table` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `frequent_questions_table` (`id` INTEGER NOT NULL, `question` TEXT NOT NULL, `answer` TEXT NOT NULL, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_frequent_questions_table_id` ON `frequent_questions_table` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '147e934a4665ae4603ce2fbfadb1c9f0')");
                break;
            default:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `account_table` (`idUser` TEXT NOT NULL, `token` TEXT, `oldDeviceId` TEXT, `deviceId` TEXT, `countPremium` INTEGER NOT NULL, `countExpress` INTEGER NOT NULL, `email` TEXT, `name` TEXT, `surname` TEXT, `avatar` TEXT, `endTimeLive` INTEGER NOT NULL, `endTimePremium` INTEGER NOT NULL, `endTimeExpress` INTEGER NOT NULL, `endTimeDiamond` INTEGER NOT NULL, PRIMARY KEY(`idUser`))");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `order_table` (`order` TEXT NOT NULL, `productPay` TEXT NOT NULL, `id` INTEGER NOT NULL, `success` INTEGER NOT NULL, PRIMARY KEY(`order`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_order_table_order` ON `order_table` (`order`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `request_update_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `timeRequestStart` INTEGER NOT NULL, `timeRequestEnd` INTEGER NOT NULL, `timeRequestEndDownload` INTEGER NOT NULL)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `prediction_kind_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idPrediction` INTEGER NOT NULL, `idKind` INTEGER NOT NULL)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_prediction_kind_table_idPrediction` ON `prediction_kind_table` (`idPrediction`)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_prediction_kind_table_idKind` ON `prediction_kind_table` (`idKind`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `favorite_table` (`idPrediction` INTEGER NOT NULL, PRIMARY KEY(`idPrediction`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_favorite_table_idPrediction` ON `favorite_table` (`idPrediction`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `table_prediction_preview` (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `publication` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` TEXT, `imageBackground` TEXT, `odds` TEXT, `purchased` INTEGER NOT NULL, `forecasts` TEXT, `arrayKind` TEXT, `oddsForecast` TEXT, `forecast` TEXT, `teamHomeId` INTEGER, `teamGuestId` INTEGER, `teamHomeFlag` TEXT, `teamGuestFlag` TEXT, `teamHomeName` TEXT, `teamGuestName` TEXT, `scoreHome` INTEGER, `scoreGuest` INTEGER, `scoreHomeExtra` INTEGER, `scoreGuestExtra` INTEGER, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_prediction_preview_id` ON `table_prediction_preview` (`id`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `prediction_meeting_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idPrediction` INTEGER NOT NULL, `jsonObject` TEXT)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_prediction_meeting_table_idPrediction` ON `prediction_meeting_table` (`idPrediction`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS `table_prediction` (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `publication` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` TEXT, `imageBackground` TEXT, `odds` TEXT, `resultsIsViewed` INTEGER NOT NULL, `analyticsFull` TEXT, `analyticsShort` TEXT, `league` TEXT, `forecasts` TEXT, `arrayKind` TEXT, `arrayPrediction` TEXT, `oddsForecast` TEXT, `forecast` TEXT, `teamHomeId` INTEGER, `teamGuestId` INTEGER, `teamHomeFlag` TEXT, `teamGuestFlag` TEXT, `teamHomeName` TEXT, `teamGuestName` TEXT, `scoreHome` INTEGER, `scoreGuest` INTEGER, `scoreHomeExtra` INTEGER, `scoreGuestExtra` INTEGER, PRIMARY KEY(`id`))");
                h8.b.l(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_prediction_id` ON `table_prediction` (`id`)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_table_prediction_teamHomeId` ON `table_prediction` (`teamHomeId`)");
                h8.b.l(connection, "CREATE INDEX IF NOT EXISTS `index_table_prediction_teamGuestId` ON `table_prediction` (`teamGuestId`)");
                h8.b.l(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                h8.b.l(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7fe3964d5dbef6bd4e4934a088cad86c')");
                break;
        }
    }

    @Override // j1.f
    public final void b(s2.a connection) {
        switch (this.f8359d) {
            case 0:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `account_setting_table`");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `sku_details_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `purchase_subs_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `prices_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `sku_id_content_type_table`");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `Dependency`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `WorkSpec`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `WorkTag`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `WorkName`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `WorkProgress`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `Preference`");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `live_table`");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `events_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `push_metrics_table`");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `news_table`");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `sports_table`");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `support_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `frequent_questions_table`");
                break;
            default:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "DROP TABLE IF EXISTS `account_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `order_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `request_update_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `prediction_kind_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `favorite_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `table_prediction_preview`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `prediction_meeting_table`");
                h8.b.l(connection, "DROP TABLE IF EXISTS `table_prediction`");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // j1.f
    public final void c(s2.a connection) {
        switch (this.f8359d) {
        }
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // j1.f
    public final void d(s2.a connection) {
        switch (this.f8359d) {
            case 0:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((AccountSetting_Impl) this.f8360e).m(connection);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((BillingDatabase_Impl) this.f8360e).m(connection);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(connection, "connection");
                h8.b.l(connection, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f8360e).m(connection);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((LiveDatabase_Impl) this.f8360e).m(connection);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((MetricsDatabase_Impl) this.f8360e).m(connection);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((NewsDatabase_Impl) this.f8360e).m(connection);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((SportsDatabase_Impl) this.f8360e).m(connection);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((SupportDatabase_Impl) this.f8360e).m(connection);
                break;
            default:
                Intrinsics.checkNotNullParameter(connection, "connection");
                ((AppDatabase_Impl) this.f8360e).m(connection);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // j1.f
    public final void e(s2.a connection) {
        switch (this.f8359d) {
        }
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // j1.f
    public final void f(s2.a connection) {
        switch (this.f8359d) {
            case 0:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
            default:
                Intrinsics.checkNotNullParameter(connection, "connection");
                x.a0(connection);
                break;
        }
    }

    @Override // j1.f
    public final h0 g(s2.a connection) {
        switch (this.f8359d) {
            case 0:
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(AccountSettingTable.idNameSettingColumn, new h(AccountSettingTable.idNameSettingColumn, "TEXT", true, 1, null, 1));
                k kVar = new k(AccountSettingTable.tableName, linkedHashMap, d9.e.r(linkedHashMap, AccountSettingTable.valueSettingColumn, new h(AccountSettingTable.valueSettingColumn, "INTEGER", true, 0, null, 1)), new LinkedHashSet());
                k G = g.G(connection, AccountSettingTable.tableName);
                return !kVar.equals(G) ? new h0(false, d9.e.h("account_setting_table(com.sports.insider.data.repository.room.accountsetting.database.AccountSettingTable).\n Expected:\n", kVar, "\n Found:\n", G)) : new h0(true, (String) null);
            case 1:
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(PurchaseSubsTable.skuColumn, new h(PurchaseSubsTable.skuColumn, "TEXT", true, 1, null, 1));
                LinkedHashSet r5 = d9.e.r(linkedHashMap2, PurchaseSubsTable.jsonStringColumn, new h(PurchaseSubsTable.jsonStringColumn, "TEXT", true, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new j("index_sku_details_table_sku", true, t.c(PurchaseSubsTable.skuColumn), t.c("ASC")));
                k kVar2 = new k("sku_details_table", linkedHashMap2, r5, linkedHashSet);
                k G2 = g.G(connection, "sku_details_table");
                if (!kVar2.equals(G2)) {
                    return new h0(false, d9.e.h("sku_details_table(com.sports.insider.data.repository.room.billing.SkuDetailsTable).\n Expected:\n", kVar2, "\n Found:\n", G2));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put(PurchaseSubsTable.skuColumn, new h(PurchaseSubsTable.skuColumn, "TEXT", true, 1, null, 1));
                LinkedHashSet r6 = d9.e.r(linkedHashMap3, PurchaseSubsTable.jsonStringColumn, new h(PurchaseSubsTable.jsonStringColumn, "TEXT", true, 0, null, 1));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new j("index_purchase_subs_table_sku", true, t.c(PurchaseSubsTable.skuColumn), t.c("ASC")));
                k kVar3 = new k(PurchaseSubsTable.tableName, linkedHashMap3, r6, linkedHashSet2);
                k G3 = g.G(connection, PurchaseSubsTable.tableName);
                if (!kVar3.equals(G3)) {
                    return new h0(false, d9.e.h("purchase_subs_table(com.sports.insider.data.repository.room.billing.PurchaseSubsTable).\n Expected:\n", kVar3, "\n Found:\n", G3));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put(PricesTable.typePriceColumn, new h(PricesTable.typePriceColumn, "INTEGER", true, 1, null, 1));
                linkedHashMap4.put("type", new h("type", "TEXT", true, 0, null, 1));
                linkedHashMap4.put(PricesTable.currentPriceColumn, new h(PricesTable.currentPriceColumn, "TEXT", false, 0, null, 1));
                linkedHashMap4.put(PricesTable.standardPriceColumn, new h(PricesTable.standardPriceColumn, "TEXT", false, 0, null, 1));
                linkedHashMap4.put(PricesTable.currentPlanIdColumn, new h(PricesTable.currentPlanIdColumn, "TEXT", false, 0, null, 1));
                linkedHashMap4.put(PricesTable.standardPlanIdColumn, new h(PricesTable.standardPlanIdColumn, "TEXT", false, 0, null, 1));
                linkedHashMap4.put(PricesTable.currentOfferIdColumn, new h(PricesTable.currentOfferIdColumn, "TEXT", false, 0, null, 1));
                linkedHashMap4.put(PricesTable.standardOfferIdColumn, new h(PricesTable.standardOfferIdColumn, "TEXT", false, 0, null, 1));
                LinkedHashSet r10 = d9.e.r(linkedHashMap4, PricesTable.endTimeColumn, new h(PricesTable.endTimeColumn, "TEXT", false, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new j("index_prices_table_typePrice", true, t.c(PricesTable.typePriceColumn), t.c("ASC")));
                k kVar4 = new k(PricesTable.tableName, linkedHashMap4, r10, linkedHashSet3);
                k G4 = g.G(connection, PricesTable.tableName);
                if (!kVar4.equals(G4)) {
                    return new h0(false, d9.e.h("prices_table(com.sports.insider.data.repository.room.billing.PricesTable).\n Expected:\n", kVar4, "\n Found:\n", G4));
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("id", new h("id", "TEXT", true, 1, null, 1));
                linkedHashMap5.put(SkuIdContentTypeTable.typeSkuContentColumn, new h(SkuIdContentTypeTable.typeSkuContentColumn, "INTEGER", true, 0, null, 1));
                k kVar5 = new k(SkuIdContentTypeTable.tableName, linkedHashMap5, d9.e.r(linkedHashMap5, SkuIdContentTypeTable.typeSkuColumn, new h(SkuIdContentTypeTable.typeSkuColumn, "INTEGER", true, 0, null, 1)), new LinkedHashSet());
                k G5 = g.G(connection, SkuIdContentTypeTable.tableName);
                return !kVar5.equals(G5) ? new h0(false, d9.e.h("sku_id_content_type_table(com.sports.insider.data.repository.room.billing.SkuIdContentTypeTable).\n Expected:\n", kVar5, "\n Found:\n", G5)) : new h0(true, (String) null);
            case 2:
                return h(connection);
            case 3:
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap6.put(LiveTable.createDateColumn, new h(LiveTable.createDateColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap6.put(LiveTable.isViewedColumn, new h(LiveTable.isViewedColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap6.put(LiveTable.imageUrlColumn, new h(LiveTable.imageUrlColumn, "TEXT", false, 0, null, 1));
                linkedHashMap6.put("title", new h("title", "TEXT", false, 0, null, 1));
                linkedHashMap6.put(LiveTable.messageColumn, new h(LiveTable.messageColumn, "TEXT", false, 0, null, 1));
                linkedHashMap6.put(LiveTable.btnTextColumn, new h(LiveTable.btnTextColumn, "TEXT", false, 0, null, 1));
                LinkedHashSet r11 = d9.e.r(linkedHashMap6, LiveTable.btnUrlColumn, new h(LiveTable.btnUrlColumn, "TEXT", false, 0, null, 1));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new j("index_live_table_id", true, t.c("id"), t.c("ASC")));
                k kVar6 = new k(LiveTable.tableName, linkedHashMap6, r11, linkedHashSet4);
                k G6 = g.G(connection, LiveTable.tableName);
                return !kVar6.equals(G6) ? new h0(false, d9.e.h("live_table(com.sports.insider.data.repository.room.live.LiveTable).\n Expected:\n", kVar6, "\n Found:\n", G6)) : new h0(true, (String) null);
            case 4:
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap7.put("name", new h("name", "TEXT", true, 0, null, 1));
                linkedHashMap7.put(EventsTable.contentColumn, new h(EventsTable.contentColumn, "TEXT", false, 0, null, 1));
                LinkedHashSet r12 = d9.e.r(linkedHashMap7, "dateCreate", new h("dateCreate", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new j("index_events_table_id", true, t.c("id"), t.c("ASC")));
                k kVar7 = new k(EventsTable.tableName, linkedHashMap7, r12, linkedHashSet5);
                k G7 = g.G(connection, EventsTable.tableName);
                if (!kVar7.equals(G7)) {
                    return new h0(false, d9.e.h("events_table(com.sports.insider.data.repository.room.metric.EventsTable).\n Expected:\n", kVar7, "\n Found:\n", G7));
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap8.put(PushMetricsTable.pushIdColumn, new h(PushMetricsTable.pushIdColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap8.put("type", new h("type", "INTEGER", true, 0, null, 1));
                LinkedHashSet r13 = d9.e.r(linkedHashMap8, "dateCreate", new h("dateCreate", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new j("index_push_metrics_table_id", true, t.c("id"), t.c("ASC")));
                k kVar8 = new k(PushMetricsTable.tableName, linkedHashMap8, r13, linkedHashSet6);
                k G8 = g.G(connection, PushMetricsTable.tableName);
                return !kVar8.equals(G8) ? new h0(false, d9.e.h("push_metrics_table(com.sports.insider.data.repository.room.metric.PushMetricsTable).\n Expected:\n", kVar8, "\n Found:\n", G8)) : new h0(true, (String) null);
            case 5:
                return i(connection);
            case 6:
                return j(connection);
            case 7:
                return k(connection);
            default:
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put(AccountTable.idUserColumn, new h(AccountTable.idUserColumn, "TEXT", true, 1, null, 1));
                linkedHashMap9.put(AccountTable.tokenColumn, new h(AccountTable.tokenColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.oldDeviceIdColumn, new h(AccountTable.oldDeviceIdColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.deviceIdColumn, new h(AccountTable.deviceIdColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.countPremiumColumn, new h(AccountTable.countPremiumColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap9.put(AccountTable.countExpressColumn, new h(AccountTable.countExpressColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap9.put(AccountTable.emailColumn, new h(AccountTable.emailColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put("name", new h("name", "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.surnameColumn, new h(AccountTable.surnameColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.avatarColumn, new h(AccountTable.avatarColumn, "TEXT", false, 0, null, 1));
                linkedHashMap9.put(AccountTable.endTimeLiveColumn, new h(AccountTable.endTimeLiveColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap9.put(AccountTable.endTimePremiumColumn, new h(AccountTable.endTimePremiumColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap9.put(AccountTable.endTimeExpressColumn, new h(AccountTable.endTimeExpressColumn, "INTEGER", true, 0, null, 1));
                k kVar9 = new k(AccountTable.tableName, linkedHashMap9, d9.e.r(linkedHashMap9, AccountTable.endTimeDiamondColumn, new h(AccountTable.endTimeDiamondColumn, "INTEGER", true, 0, null, 1)), new LinkedHashSet());
                k G9 = g.G(connection, AccountTable.tableName);
                if (!kVar9.equals(G9)) {
                    return new h0(false, d9.e.h("account_table(com.sports.insider.data.room.general.table.AccountTable).\n Expected:\n", kVar9, "\n Found:\n", G9));
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put(OrdersTable.orderColumn, new h(OrdersTable.orderColumn, "TEXT", true, 1, null, 1));
                linkedHashMap10.put(OrdersTable.productPayColumn, new h(OrdersTable.productPayColumn, "TEXT", true, 0, null, 1));
                linkedHashMap10.put("id", new h("id", "INTEGER", true, 0, null, 1));
                LinkedHashSet r14 = d9.e.r(linkedHashMap10, "success", new h("success", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new j("index_order_table_order", true, t.c(OrdersTable.orderColumn), t.c("ASC")));
                k kVar10 = new k(OrdersTable.tableName, linkedHashMap10, r14, linkedHashSet7);
                k G10 = g.G(connection, OrdersTable.tableName);
                if (!kVar10.equals(G10)) {
                    return new h0(false, d9.e.h("order_table(com.sports.insider.data.room.general.table.OrdersTable).\n Expected:\n", kVar10, "\n Found:\n", G10));
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap11.put("categoryId", new h("categoryId", "INTEGER", true, 0, null, 1));
                linkedHashMap11.put("lang", new h("lang", "TEXT", true, 0, null, 1));
                linkedHashMap11.put("timeRequestStart", new h("timeRequestStart", "INTEGER", true, 0, null, 1));
                linkedHashMap11.put("timeRequestEnd", new h("timeRequestEnd", "INTEGER", true, 0, null, 1));
                k kVar11 = new k("request_update_table", linkedHashMap11, d9.e.r(linkedHashMap11, "timeRequestEndDownload", new h("timeRequestEndDownload", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
                k G11 = g.G(connection, "request_update_table");
                if (!kVar11.equals(G11)) {
                    return new h0(false, d9.e.h("request_update_table(com.sports.insider.data.room.general.table.RequestUpdateTable).\n Expected:\n", kVar11, "\n Found:\n", G11));
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap12.put("idPrediction", new h("idPrediction", "INTEGER", true, 0, null, 1));
                LinkedHashSet r15 = d9.e.r(linkedHashMap12, "idKind", new h("idKind", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new j("index_prediction_kind_table_idPrediction", false, t.c("idPrediction"), t.c("ASC")));
                linkedHashSet8.add(new j("index_prediction_kind_table_idKind", false, t.c("idKind"), t.c("ASC")));
                k kVar12 = new k("prediction_kind_table", linkedHashMap12, r15, linkedHashSet8);
                k G12 = g.G(connection, "prediction_kind_table");
                if (!kVar12.equals(G12)) {
                    return new h0(false, d9.e.h("prediction_kind_table(com.sports.insider.data.room.general.table.predictions.PredictionsKindTable).\n Expected:\n", kVar12, "\n Found:\n", G12));
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                LinkedHashSet r16 = d9.e.r(linkedHashMap13, "idPrediction", new h("idPrediction", "INTEGER", true, 1, null, 1));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new j("index_favorite_table_idPrediction", true, t.c("idPrediction"), t.c("ASC")));
                k kVar13 = new k("favorite_table", linkedHashMap13, r16, linkedHashSet9);
                k G13 = g.G(connection, "favorite_table");
                if (!kVar13.equals(G13)) {
                    return new h0(false, d9.e.h("favorite_table(com.sports.insider.data.room.general.table.predictions.FavoriteTable).\n Expected:\n", kVar13, "\n Found:\n", G13));
                }
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                linkedHashMap14.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap14.put(PredictionTable.startTimeColumn, new h(PredictionTable.startTimeColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap14.put(PredictionTable.publicationColumn, new h(PredictionTable.publicationColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap14.put("type", new h("type", "INTEGER", true, 0, null, 1));
                linkedHashMap14.put(PredictionTable.statusColumn, new h(PredictionTable.statusColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.imageBackgroundColumn, new h(PredictionTable.imageBackgroundColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.oddsColumn, new h(PredictionTable.oddsColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put("purchased", new h("purchased", "INTEGER", true, 0, null, 1));
                linkedHashMap14.put(PredictionTable.forecastsColumn, new h(PredictionTable.forecastsColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.arrayKindColumn, new h(PredictionTable.arrayKindColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.oddsForecastColumn, new h(PredictionTable.oddsForecastColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.forecastColumn, new h(PredictionTable.forecastColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamHomeIdColumn, new h(PredictionTable.teamHomeIdColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamGuestIdColumn, new h(PredictionTable.teamGuestIdColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamHomeFlagColumn, new h(PredictionTable.teamHomeFlagColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamGuestFlagColumn, new h(PredictionTable.teamGuestFlagColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamHomeNameColumn, new h(PredictionTable.teamHomeNameColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.teamGuestNameColumn, new h(PredictionTable.teamGuestNameColumn, "TEXT", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.scoreHomeColumn, new h(PredictionTable.scoreHomeColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.scoreGuestColumn, new h(PredictionTable.scoreGuestColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap14.put(PredictionTable.scoreHomeExtraColumn, new h(PredictionTable.scoreHomeExtraColumn, "INTEGER", false, 0, null, 1));
                LinkedHashSet r17 = d9.e.r(linkedHashMap14, PredictionTable.scoreGuestExtraColumn, new h(PredictionTable.scoreGuestExtraColumn, "INTEGER", false, 0, null, 1));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new j("index_table_prediction_preview_id", true, t.c("id"), t.c("ASC")));
                k kVar14 = new k("table_prediction_preview", linkedHashMap14, r17, linkedHashSet10);
                k G14 = g.G(connection, "table_prediction_preview");
                if (!kVar14.equals(G14)) {
                    return new h0(false, d9.e.h("table_prediction_preview(com.sports.insider.data.room.general.table.predictions.PredictionPreviewTable).\n Expected:\n", kVar14, "\n Found:\n", G14));
                }
                LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                linkedHashMap15.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap15.put("idPrediction", new h("idPrediction", "INTEGER", true, 0, null, 1));
                LinkedHashSet r18 = d9.e.r(linkedHashMap15, "jsonObject", new h("jsonObject", "TEXT", false, 0, null, 1));
                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                linkedHashSet11.add(new j("index_prediction_meeting_table_idPrediction", false, t.c("idPrediction"), t.c("ASC")));
                k kVar15 = new k("prediction_meeting_table", linkedHashMap15, r18, linkedHashSet11);
                k G15 = g.G(connection, "prediction_meeting_table");
                if (!kVar15.equals(G15)) {
                    return new h0(false, d9.e.h("prediction_meeting_table(com.sports.insider.data.room.general.table.predictions.PredictionMeeting).\n Expected:\n", kVar15, "\n Found:\n", G15));
                }
                LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                linkedHashMap16.put("id", new h("id", "INTEGER", true, 1, null, 1));
                linkedHashMap16.put(PredictionTable.startTimeColumn, new h(PredictionTable.startTimeColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap16.put(PredictionTable.publicationColumn, new h(PredictionTable.publicationColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap16.put("type", new h("type", "INTEGER", true, 0, null, 1));
                linkedHashMap16.put(PredictionTable.statusColumn, new h(PredictionTable.statusColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.imageBackgroundColumn, new h(PredictionTable.imageBackgroundColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.oddsColumn, new h(PredictionTable.oddsColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.resultsIsViewedColumn, new h(PredictionTable.resultsIsViewedColumn, "INTEGER", true, 0, null, 1));
                linkedHashMap16.put(PredictionTable.analyticsFullColumn, new h(PredictionTable.analyticsFullColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.analyticsShortColumn, new h(PredictionTable.analyticsShortColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.leagueColumn, new h(PredictionTable.leagueColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.forecastsColumn, new h(PredictionTable.forecastsColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.arrayKindColumn, new h(PredictionTable.arrayKindColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.arrayPredictionColumn, new h(PredictionTable.arrayPredictionColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.oddsForecastColumn, new h(PredictionTable.oddsForecastColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.forecastColumn, new h(PredictionTable.forecastColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamHomeIdColumn, new h(PredictionTable.teamHomeIdColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamGuestIdColumn, new h(PredictionTable.teamGuestIdColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamHomeFlagColumn, new h(PredictionTable.teamHomeFlagColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamGuestFlagColumn, new h(PredictionTable.teamGuestFlagColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamHomeNameColumn, new h(PredictionTable.teamHomeNameColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.teamGuestNameColumn, new h(PredictionTable.teamGuestNameColumn, "TEXT", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.scoreHomeColumn, new h(PredictionTable.scoreHomeColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.scoreGuestColumn, new h(PredictionTable.scoreGuestColumn, "INTEGER", false, 0, null, 1));
                linkedHashMap16.put(PredictionTable.scoreHomeExtraColumn, new h(PredictionTable.scoreHomeExtraColumn, "INTEGER", false, 0, null, 1));
                LinkedHashSet r19 = d9.e.r(linkedHashMap16, PredictionTable.scoreGuestExtraColumn, new h(PredictionTable.scoreGuestExtraColumn, "INTEGER", false, 0, null, 1));
                LinkedHashSet linkedHashSet12 = new LinkedHashSet();
                linkedHashSet12.add(new j("index_table_prediction_id", true, t.c("id"), t.c("ASC")));
                linkedHashSet12.add(new j("index_table_prediction_teamHomeId", false, t.c(PredictionTable.teamHomeIdColumn), t.c("ASC")));
                linkedHashSet12.add(new j("index_table_prediction_teamGuestId", false, t.c(PredictionTable.teamGuestIdColumn), t.c("ASC")));
                k kVar16 = new k(PredictionTable.tableName, linkedHashMap16, r19, linkedHashSet12);
                k G16 = g.G(connection, PredictionTable.tableName);
                return !kVar16.equals(G16) ? new h0(false, d9.e.h("table_prediction(com.sports.insider.data.room.general.table.predictions.PredictionTable).\n Expected:\n", kVar16, "\n Found:\n", G16)) : new h0(true, (String) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BillingDatabase_Impl billingDatabase_Impl) {
        super(3, "8ac17f5ff3afbec23821a0b613d80cac", "e319161096c456a0ee92cdddaf169599");
        this.f8360e = billingDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LiveDatabase_Impl liveDatabase_Impl) {
        super(1, "802a31bbed2835ddee1e851632d88296", "3a8e8f82f9243f567e6120a4dd23a09f");
        this.f8360e = liveDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewsDatabase_Impl newsDatabase_Impl) {
        super(1, "4daa3560a546ea419cfc357ff1c5da62", "01a4b1412f1fa1934e45f6ec2440579e");
        this.f8360e = newsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SportsDatabase_Impl sportsDatabase_Impl) {
        super(3, "1b09f5ee1560747902d50fd9e23a6f0f", "42d0ab28ad9d58fc9aa5c68de6781264");
        this.f8360e = sportsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SupportDatabase_Impl supportDatabase_Impl) {
        super(2, "147e934a4665ae4603ce2fbfadb1c9f0", "ec9dd39675f16c8cef083779c143bcb4");
        this.f8360e = supportDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MetricsDatabase_Impl metricsDatabase_Impl) {
        super(1, "e30d77139cd53f9753fd4128832beffb", "baa9552a7dd4ef634ac539899375d4b1");
        this.f8360e = metricsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppDatabase_Impl appDatabase_Impl) {
        super(14, "7fe3964d5dbef6bd4e4934a088cad86c", "d17746f0c28b38e4115c02175256be02");
        this.f8360e = appDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f8360e = workDatabase_Impl;
    }
}
