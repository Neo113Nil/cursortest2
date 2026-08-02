package ii0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.EventStatus;

/* renamed from: ii0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7083b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final q f66482a = new q(9, 10);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f66483b = new a(10, 11);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C1100b f66484c = new C1100b(11, 12);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f66485d = new c(12, 13);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final d f66486e = new d(13, 14);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final e f66487f = new e(14, 15);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final f f66488g = new f(15, 16);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final g f66489h = new g(16, 17);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final h f66490i = new h(17, 18);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final i f66491j = new i(18, 19);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final j f66492k = new j(19, 20);

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final k f66493l = new k(20, 21);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final l f66494m = new l(21, 22);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final m f66495n = new m(22, 23);

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final n f66496o = new n(23, 24);

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final o f66497p = new o(24, 25);

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final p f66498q = new p(25, 26);

    /* renamed from: ii0.b$a */
    public static final class a extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE event ADD COLUMN `isTechnical` INTEGER DEFAULT 0 NOT NULL");
        }
    }

    /* renamed from: ii0.b$b, reason: collision with other inner class name */
    public static final class C1100b extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `traces` (\n`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n`body` TEXT NOT NULL,\n`status` TEXT NOT NULL,\n`timestamp` INTEGER NOT NULL\n)");
            database.O0("CREATE INDEX `index_traces_status` ON `traces` (`status`)");
            database.O0("ALTER TABLE user ADD COLUMN abGroup INTEGER");
            database.O0("ALTER TABLE user ADD COLUMN regionId INTEGER");
        }
    }

    /* renamed from: ii0.b$c */
    public static final class c extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0(" CREATE TABLE IF NOT EXISTS `user_data` (\n`id` INTEGER PRIMARY KEY NOT NULL,\n`ab_group` INTEGER NOT NULL,\n`region_id` INTEGER NOT NULL)");
            database.O0("INSERT OR IGNORE INTO user_data VALUES(1, 0, 0)");
        }
    }

    /* renamed from: ii0.b$d */
    public static final class d extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE user_data ADD COLUMN user_id TEXT DEFAULT '' NOT NULL");
            database.O0("INSERT OR IGNORE INTO user_data VALUES(1, 0, 0,'')");
        }
    }

    /* renamed from: ii0.b$e */
    public static final class e extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `event_temp`");
            database.O0("CREATE TABLE `event_temp`(\n                                    `uuid` TEXT PRIMARY KEY NOT NULL,\n                                    `version` TEXT NOT NULL,\n                                    `eventBody` TEXT NOT NULL,\n                                    `type` INTEGER NOT NULL,\n                                    `markEventToSend` INTEGER NOT NULL,\n                                    `timestamp` INTEGER NOT NULL\n                             )");
            database.O0("INSERT INTO `event_temp`\n                                SELECT uuid, version, eventBody, isComposerEvent, markEventToSend, timestamp\n                                FROM `event`\n                                WHERE \n                                    uuid IS NOT NULL AND\n                                    version IS NOT NULL AND\n                                    eventBody IS NOT NULL AND\n                                    isComposerEvent IS NOT NULL AND\n                                    markEventToSend IS NOT NULL AND\n                                    timestamp IS NOT NULL");
            Sh.b.d(database, "DROP TABLE `event`", "ALTER TABLE `event_temp` RENAME TO `event`", "DROP TABLE IF EXISTS `user_temp`", "CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `accessToken` TEXT,\n                                    `token` TEXT,\n                                    `abGroup` INTEGER,\n                                    `regionId` INTEGER\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id, accessToken, token, abGroup, regionId\n                                FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
        }
    }

    /* renamed from: ii0.b$f */
    public static final class f extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            database.O0("CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `accessToken` TEXT,\n                                    `token` TEXT,\n                                    `abGroup` INTEGER,\n                                    `regionId` INTEGER\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id, accessToken, token, abGroup, regionId\n                                FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
        }
    }

    /* renamed from: ii0.b$g */
    public static final class g extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE event ADD COLUMN `eventUuid` TEXT DEFAULT '' NOT NULL");
        }
    }

    /* renamed from: ii0.b$h */
    public static final class h extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE `traces`");
        }
    }

    /* renamed from: ii0.b$i */
    public static final class i extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user_data` ADD COLUMN `company_id` TEXT NOT NULL DEFAULT ''");
        }
    }

    /* renamed from: ii0.b$j */
    public static final class j extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE `user_data_temp` (\n    `id` INTEGER PRIMARY KEY NOT NULL,\n    `ab_group` INTEGER NOT NULL,\n    `region_id` INTEGER NOT NULL,\n    `user_id` TEXT DEFAULT '' NOT NULL,\n    `company_id` INTEGER)");
            database.O0("INSERT INTO `user_data_temp`\nSELECT id, ab_group, region_id, user_id, CASE \nWHEN company_id GLOB '*[^0-9]*' OR company_id = \"\" THEN NULL \nELSE CAST(company_id as INTEGER) \nEND\nFROM `user_data`");
            database.O0("DROP TABLE `user_data`");
            database.O0("ALTER TABLE `user_data_temp` RENAME TO `user_data`");
        }
    }

    /* renamed from: ii0.b$k */
    public static final class k extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DELETE FROM event WHERE type = 1");
        }
    }

    /* renamed from: ii0.b$l */
    public static final class l extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user_data` ADD COLUMN `user_roles` TEXT NOT NULL DEFAULT ''");
        }
    }

    /* renamed from: ii0.b$m */
    public static final class m extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("CREATE TABLE IF NOT EXISTS `performance_event`\n(\n    `id`              INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `uuid`            TEXT NULL,\n    `requestId`       TEXT NULL,\n    `timestamp`       INTEGER NOT NULL,\n    `testingToolName` TEXT NULL,\n    `attributes`      TEXT NULL,\n    `user`            TEXT NULL,\n    `page`            TEXT NULL,\n    `obj`             TEXT NULL,\n    `props`           TEXT NULL,\n    `widget`          TEXT NULL,\n    `metrics`         TEXT NULL,\n    `customMetrics`   TEXT NULL,\n    `videoMetrics`    TEXT NULL\n)");
        }
    }

    /* renamed from: ii0.b$n */
    public static final class n extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `performance_event` ADD COLUMN `serverTimings` TEXT DEFAULT NULL");
        }
    }

    /* renamed from: ii0.b$o */
    public static final class o extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `performance_event` ADD COLUMN `pclpage` TEXT DEFAULT NULL");
        }
    }

    /* renamed from: ii0.b$p */
    public static final class p extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `performance_event` ADD COLUMN `map` TEXT DEFAULT NULL");
        }
    }

    /* renamed from: ii0.b$q */
    public static final class q extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE event ADD COLUMN `markEventToSend` INTEGER DEFAULT " + EventStatus.NEW.getStatus() + " NOT NULL");
        }
    }

    @NotNull
    public static final a a() {
        return f66483b;
    }

    @NotNull
    public static final C1100b b() {
        return f66484c;
    }

    @NotNull
    public static final c c() {
        return f66485d;
    }

    @NotNull
    public static final d d() {
        return f66486e;
    }

    @NotNull
    public static final e e() {
        return f66487f;
    }

    @NotNull
    public static final f f() {
        return f66488g;
    }

    @NotNull
    public static final g g() {
        return f66489h;
    }

    @NotNull
    public static final h h() {
        return f66490i;
    }

    @NotNull
    public static final i i() {
        return f66491j;
    }

    @NotNull
    public static final j j() {
        return f66492k;
    }

    @NotNull
    public static final k k() {
        return f66493l;
    }

    @NotNull
    public static final l l() {
        return f66494m;
    }

    @NotNull
    public static final m m() {
        return f66495n;
    }

    @NotNull
    public static final n n() {
        return f66496o;
    }

    @NotNull
    public static final o o() {
        return f66497p;
    }

    @NotNull
    public static final p p() {
        return f66498q;
    }

    @NotNull
    public static final q q() {
        return f66482a;
    }
}
