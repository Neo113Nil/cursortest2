package ru.ozon.app.android.storage;

import J4.s;
import K4.a;
import O4.b;
import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storage/OzonDatabase;", "LJ4/s;", "<init>", "()V", "Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "networkHistoryDao", "()Lru/ozon/app/android/storage/entity/network/NetworkHistoryDao;", "Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "sellerFavoriteDao", "()Lru/ozon/app/android/storage/entity/sellerfavorites/SellerFavoriteDao;", "Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "bundleStateDao", "()Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OzonDatabase extends s {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final a MIGRATION_1_2 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_1_2$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `scanned_product` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `productId` TEXT NOT NULL, `name` TEXT, `itemTypeId` INTEGER, `count` INTEGER, `coverImage` TEXT, `availAbilityId` INTEGER, `availability` TEXT, `freeQty` INTEGER NOT NULL, `price` REAL, `discountPrice` REAL, `discount` REAL, `itemType` TEXT, `author` TEXT, `timestamp` INTEGER, `fresh` INTEGER)");
            database.O0("CREATE UNIQUE INDEX IF NOT EXISTS index_scanned_product_productId on scanned_product (productId);");
        }
    };

    @NotNull
    public static final a MIGRATION_2_3 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_2_3$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user` ADD COLUMN `isLoggedIn` INTEGER NOT NULL DEFAULT 0");
            Cursor N12 = database.N1("SELECT * FROM `user` ORDER BY id DESC LIMIT 1");
            N12.moveToFirst();
            database.O0("UPDATE `user` SET isLoggedIn = " + (((N12.getCount() > 0 ? N12.getString(N12.getColumnIndex("login")) : "").length() == 0 ? 1 : 0) ^ 1));
            database.O0("CREATE TABLE `user_temp`(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `isLoggedIn` INTEGER NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `middleName` TEXT NOT NULL, `sex` INTEGER NOT NULL, `email` TEXT NOT NULL, `dateOfBirth` TEXT NOT NULL, `userType` TEXT NOT NULL, `points` REAL NOT NULL, `balance` REAL NOT NULL, `loyaltyStatus` INTEGER NOT NULL, `registrationDate` TEXT NOT NULL, `isEmployee` INTEGER NOT NULL, `areaId` INTEGER NOT NULL, `fullName` TEXT, `name` TEXT, `country` TEXT, `zipCode` TEXT, `groupAreaId` INTEGER NOT NULL, `areaType` INTEGER NOT NULL )");
            database.O0("INSERT INTO `user_temp` SELECT id,isLoggedIn,firstName,lastName,middleName,sex,email,dateOfBirth,userType,points,balance,loyaltyStatus,registrationDate,isEmployee,areaId,fullName,name,country,zipCode,groupAreaId,areaType FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
            database.O0("ALTER TABLE `recent_product` ADD COLUMN `viewedTime` INTEGER NOT NULL DEFAULT 0");
        }
    };

    @NotNull
    public static final a MIGRATION_3_4 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_3_4$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user` ADD COLUMN `accountPhone` TEXT NOT NULL DEFAULT ''");
        }
    };

    @NotNull
    public static final a MIGRATION_4_5 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_4_5$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `network_history`(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `traceId` TEXT, `url` TEXT NOT NULL, `responseTime` REAL NOT NULL, `time` INTEGER NOT NULL )");
        }
    };

    @NotNull
    public static final a MIGRATION_5_6 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_5_6$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user` ADD COLUMN `fias` TEXT NOT NULL DEFAULT ''");
            database.O0("ALTER TABLE `user` ADD COLUMN `latitude` DOUBLE");
            database.O0("ALTER TABLE `user` ADD COLUMN `longitude` DOUBLE");
        }
    };

    @NotNull
    public static final a MIGRATION_6_7 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_6_7$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user` ADD COLUMN `region` TEXT");
            database.O0("ALTER TABLE `user` ADD COLUMN `city` TEXT");
            database.O0("ALTER TABLE `user` ADD COLUMN `countryCode` TEXT");
        }
    };

    @NotNull
    public static final a MIGRATION_7_8 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_7_8$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE `scanned_product`");
        }
    };

    @NotNull
    public static final a MIGRATION_8_9 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_8_9$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS ozon_string_cache (`key` TEXT PRIMARY KEY NOT NULL, `value` TEXT NOT NULL )");
        }
    };

    @NotNull
    public static final a MIGRATION_9_10 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_9_10$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            database.O0("CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `isLoggedIn` INTEGER NOT NULL,\n                                    `firstName` TEXT NOT NULL,\n                                    `lastName` TEXT NOT NULL,\n                                    `middleName` TEXT NOT NULL,\n                                    `sex` INTEGER NOT NULL,\n                                    `email` TEXT NOT NULL,\n                                    `dateOfBirth` TEXT NOT NULL,\n                                    `userType` TEXT NOT NULL,\n                                    `points` REAL NOT NULL,\n                                    `balance` REAL NOT NULL,\n                                    `registrationDate` TEXT NOT NULL,\n                                    `isEmployee` INTEGER NOT NULL,\n                                    `areaId` INTEGER NOT NULL,\n                                    `fullName` TEXT,\n                                    `name` TEXT,\n                                    `country` TEXT,\n                                    `zipCode` TEXT,\n                                    `groupAreaId` INTEGER NOT NULL,\n                                    `areaType` INTEGER NOT NULL,\n                                    `accountPhone` TEXT NOT NULL DEFAULT '',\n                                    `fias` TEXT NOT NULL DEFAULT '',\n                                    `latitude` REAL,\n                                    `longitude` REAL,\n                                    `region` TEXT,\n                                    `city` TEXT,\n                                    `countryCode` TEXT\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id,isLoggedIn,firstName,lastName,middleName,sex,email,dateOfBirth,userType,points,balance,\n                                        registrationDate,isEmployee,areaId,fullName,name,country,\n                                        zipCode,groupAreaId,areaType,accountPhone,fias,latitude,longitude,region,city,countryCode\n                                FROM `user`");
            Sh.b.d(database, "DROP TABLE `user`", "ALTER TABLE `user_temp` RENAME TO `user`", "ALTER TABLE `user` ADD COLUMN `has_loyalty_status` INTEGER NOT NULL DEFAULT 0", "ALTER TABLE `user` ADD COLUMN `loyalty_status_id` INTEGER NOT NULL DEFAULT -1");
        }
    };

    @NotNull
    private static final a MIGRATION_10_11 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_10_11$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `sellerFavorite`(`id` INTEGER PRIMARY KEY NOT NULL)");
        }
    };

    @NotNull
    private static final a MIGRATION_11_12 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_11_12$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE ozon_string_cache");
            database.O0("DROP TABLE recent_product");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            Sh.b.d(database, "CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `isLoggedIn` INTEGER NOT NULL,\n                                    `firstName` TEXT NOT NULL,\n                                    `lastName` TEXT NOT NULL,\n                                    `middleName` TEXT NOT NULL,\n                                    `sex` INTEGER NOT NULL,\n                                    `email` TEXT NOT NULL,\n                                    `dateOfBirth` TEXT NOT NULL,\n                                    `has_loyalty_status` INTEGER NOT NULL DEFAULT 0,\n                                    `loyalty_status_id` INTEGER NOT NULL DEFAULT -1,\n                                    `isEmployee` INTEGER NOT NULL,\n                                    `accountPhone` TEXT NOT NULL DEFAULT '',\n                                    `areaId` INTEGER NOT NULL,\n                                    `fullName` TEXT,\n                                    `name` TEXT,\n                                    `region` TEXT,\n                                    `city` TEXT,\n                                    `country` TEXT,\n                                    `countryCode` TEXT,\n                                    `zipCode` TEXT,\n                                    `groupAreaId` INTEGER NOT NULL,\n                                    `areaType` INTEGER NOT NULL,\n                                    `latitude` REAL,\n                                    `longitude` REAL,\n                                    `fias` TEXT NOT NULL DEFAULT ''\n                             )", "INSERT INTO `user_temp`\n                                SELECT id,isLoggedIn,firstName,lastName,middleName,sex,email,dateOfBirth,has_loyalty_status,\n                                        loyalty_status_id,isEmployee,accountPhone,\n                                        areaId,fullName,name,region,city,country,countryCode,zipCode,groupAreaId,areaType,\n                                        latitude,longitude,fias\n                                FROM `user`", "DROP TABLE `user`", "ALTER TABLE `user_temp` RENAME TO `user`");
        }
    };

    @NotNull
    private static final a MIGRATION_12_13 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_12_13$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            database.O0("CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `isLoggedIn` INTEGER NOT NULL,\n                                    `firstName` TEXT NOT NULL,\n                                    `lastName` TEXT NOT NULL,\n                                    `middleName` TEXT NOT NULL,\n                                    `sex` INTEGER NOT NULL,\n                                    `email` TEXT NOT NULL,\n                                    `dateOfBirth` TEXT NOT NULL,\n                                    `has_loyalty_status` INTEGER NOT NULL DEFAULT 0,\n                                    `loyalty_status_id` INTEGER NOT NULL DEFAULT -1,\n                                    `isEmployee` INTEGER NOT NULL,\n                                    `accountPhone` TEXT NOT NULL DEFAULT ''\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id,isLoggedIn,firstName,lastName,middleName,sex,email,dateOfBirth,has_loyalty_status,\n                                        loyalty_status_id,isEmployee,accountPhone\n                                FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
        }
    };

    @NotNull
    private static final a MIGRATION_13_14 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_13_14$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("ALTER TABLE `user` ADD COLUMN `type` TEXT NOT NULL DEFAULT ''");
        }
    };

    @NotNull
    private static final a MIGRATION_14_15 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_14_15$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            database.O0("CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `isLoggedIn` INTEGER NOT NULL,\n                                    `firstName` TEXT NOT NULL,\n                                    `lastName` TEXT NOT NULL,\n                                    `middleName` TEXT NOT NULL,\n                                    `sex` INTEGER NOT NULL,\n                                    `email` TEXT NOT NULL,\n                                    `dateOfBirth` TEXT NOT NULL,\n                                    `isEmployee` INTEGER NOT NULL,\n                                    `accountPhone` TEXT NOT NULL DEFAULT '',\n                                    `type` TEXT NOT NULL DEFAULT ''\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id,isLoggedIn,firstName,lastName,middleName,sex,email,dateOfBirth,isEmployee,accountPhone,type\n                                FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
        }
    };

    @NotNull
    private static final a MIGRATION_15_16 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_15_16$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user_temp`");
            database.O0("CREATE TABLE `user_temp`(\n                                    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                                    `firstName` TEXT NOT NULL,\n                                    `lastName` TEXT NOT NULL,\n                                    `middleName` TEXT NOT NULL,\n                                    `sex` INTEGER NOT NULL,\n                                    `email` TEXT NOT NULL,\n                                    `dateOfBirth` TEXT NOT NULL,\n                                    `accountPhone` TEXT NOT NULL DEFAULT ''\n                             )");
            database.O0("INSERT INTO `user_temp`\n                                SELECT id,firstName,lastName,middleName,sex,email,dateOfBirth,accountPhone\n                                FROM `user`");
            database.O0("DROP TABLE `user`");
            database.O0("ALTER TABLE `user_temp` RENAME TO `user`");
        }
    };

    @NotNull
    private static final a MIGRATION_16_17 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_16_17$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `tracking_event_info`(`uuid` TEXT PRIMARY KEY NOT NULL, `widgetName` TEXT, `actionType` TEXT NOT NULL, `composerEventState` INTEGER DEFAULT 0 NOT NULL, `trinityEventState` INTEGER DEFAULT 0 NOT NULL, `notFoundInDatabase` INTEGER DEFAULT 0 NOT NULL,`responsesWithoutEvent` INTEGER DEFAULT 0 NOT NULL)");
        }
    };

    @NotNull
    private static final a MIGRATION_17_18 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_17_18$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `tracking_event_info`");
        }
    };

    @NotNull
    private static final a MIGRATION_18_19 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_18_19$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `network_responses`");
            database.O0("CREATE TABLE IF NOT EXISTS `network_responses` (\n                 `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                 `httpVersion` TEXT NOT NULL,\n                 `method` TEXT NOT NULL,\n                 `responseCode` INTEGER NOT NULL,\n                 `responseMessage` TEXT NOT NULL,\n                 `url` TEXT NOT NULL,\n                 `requestHeaders` TEXT NOT NULL,\n                 `responseHeaders` TEXT NOT NULL,\n                 `requestBody` BLOB,\n                 `responseBody` BLOB,\n                 `time` INTEGER NOT NULL,\n                 `responseTime` REAL NOT NULL\n                )");
        }
    };

    @NotNull
    private static final a MIGRATION_19_20 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_19_20$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `user`");
        }
    };

    @NotNull
    private static final a MIGRATION_20_21 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_20_21$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("CREATE TABLE IF NOT EXISTS `bundle_state`\n                        (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                        `bundle` BLOB NOT NULL,\n                        `guid` TEXT NOT NULL,\n                        `blobSize` INTEGER NOT NULL,\n                        `screenGuid` TEXT NOT NULL\n                        )");
        }
    };

    @NotNull
    private static final a MIGRATION_21_22 = new a() { // from class: ru.ozon.app.android.storage.OzonDatabase$Companion$MIGRATION_21_22$1
        @Override // K4.a
        public void migrate(b database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.O0("DROP TABLE IF EXISTS `network_responses`");
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0014\u0010 \u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0006¨\u0006+"}, d2 = {"Lru/ozon/app/android/storage/OzonDatabase$Companion;", "", "<init>", "()V", "LK4/a;", "MIGRATION_10_11", "LK4/a;", "getMIGRATION_10_11", "()LK4/a;", "MIGRATION_11_12", "getMIGRATION_11_12", "MIGRATION_12_13", "getMIGRATION_12_13", "MIGRATION_13_14", "getMIGRATION_13_14", "MIGRATION_14_15", "getMIGRATION_14_15", "MIGRATION_15_16", "getMIGRATION_15_16", "MIGRATION_16_17", "getMIGRATION_16_17", "MIGRATION_17_18", "getMIGRATION_17_18", "MIGRATION_18_19", "getMIGRATION_18_19", "MIGRATION_19_20", "getMIGRATION_19_20", "MIGRATION_20_21", "getMIGRATION_20_21", "MIGRATION_21_22", "getMIGRATION_21_22", "", "DB_NAME", "Ljava/lang/String;", "MIGRATION_1_2", "MIGRATION_2_3", "MIGRATION_3_4", "MIGRATION_4_5", "MIGRATION_5_6", "MIGRATION_6_7", "MIGRATION_7_8", "MIGRATION_8_9", "MIGRATION_9_10", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a getMIGRATION_10_11() {
            return OzonDatabase.MIGRATION_10_11;
        }

        @NotNull
        public final a getMIGRATION_11_12() {
            return OzonDatabase.MIGRATION_11_12;
        }

        @NotNull
        public final a getMIGRATION_12_13() {
            return OzonDatabase.MIGRATION_12_13;
        }

        @NotNull
        public final a getMIGRATION_13_14() {
            return OzonDatabase.MIGRATION_13_14;
        }

        @NotNull
        public final a getMIGRATION_14_15() {
            return OzonDatabase.MIGRATION_14_15;
        }

        @NotNull
        public final a getMIGRATION_15_16() {
            return OzonDatabase.MIGRATION_15_16;
        }

        @NotNull
        public final a getMIGRATION_16_17() {
            return OzonDatabase.MIGRATION_16_17;
        }

        @NotNull
        public final a getMIGRATION_17_18() {
            return OzonDatabase.MIGRATION_17_18;
        }

        @NotNull
        public final a getMIGRATION_18_19() {
            return OzonDatabase.MIGRATION_18_19;
        }

        @NotNull
        public final a getMIGRATION_19_20() {
            return OzonDatabase.MIGRATION_19_20;
        }

        @NotNull
        public final a getMIGRATION_20_21() {
            return OzonDatabase.MIGRATION_20_21;
        }

        @NotNull
        public final a getMIGRATION_21_22() {
            return OzonDatabase.MIGRATION_21_22;
        }

        private Companion() {
        }
    }

    @NotNull
    public abstract BundleStateDao bundleStateDao();

    @NotNull
    public abstract NetworkHistoryDao networkHistoryDao();

    @NotNull
    public abstract SellerFavoriteDao sellerFavoriteDao();
}
