package eb;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends n2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i5, int i10, int i11) {
        super(i5, i10);
        this.f8810c = i11;
    }

    @Override // n2.b
    public final void b(t2.a db2) {
        switch (this.f8810c) {
            case 0:
                Intrinsics.checkNotNullParameter(db2, "db");
                Intrinsics.checkNotNullExpressionValue("CREATE TABLE IF NOT EXISTS `purchase_subs_table` (`sku` TEXT NOT NULL, `jsonString` TEXT NOT NULL, PRIMARY KEY(`sku`))", "toString(...)");
                db2.p("CREATE TABLE IF NOT EXISTS `purchase_subs_table` (`sku` TEXT NOT NULL, `jsonString` TEXT NOT NULL, PRIMARY KEY(`sku`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_purchase_subs_table_sku` ON `purchase_subs_table` (`sku`)");
                Intrinsics.checkNotNullExpressionValue("CREATE TABLE IF NOT EXISTS `prices_table` (`typePrice` INTEGER NOT NULL, `type` TEXT NOT NULL, `currentPrice` TEXT, `standardPrice` TEXT, `endTime` TEXT, PRIMARY KEY(`typePrice`))", "toString(...)");
                db2.p("CREATE TABLE IF NOT EXISTS `prices_table` (`typePrice` INTEGER NOT NULL, `type` TEXT NOT NULL, `currentPrice` TEXT, `standardPrice` TEXT, `endTime` TEXT, PRIMARY KEY(`typePrice`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_prices_table_typePrice` ON `prices_table` (`typePrice`)");
                Intrinsics.checkNotNullExpressionValue("CREATE TABLE IF NOT EXISTS `sku_id_content_type_table` (`id` TEXT NOT NULL, `typeSkuContent` INTEGER NOT NULL, `typeSku` INTEGER NOT NULL, PRIMARY KEY(`id`))", "toString(...)");
                db2.p("CREATE TABLE IF NOT EXISTS `sku_id_content_type_table` (`id` TEXT NOT NULL, `typeSkuContent` INTEGER NOT NULL, `typeSku` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP INDEX IF EXISTS `index_prices_table_typePrice`;");
                db2.p("DROP TABLE IF EXISTS `prices_table`;");
                Intrinsics.checkNotNullExpressionValue("CREATE TABLE IF NOT EXISTS `prices_table` (`typePrice` INTEGER NOT NULL, `type` TEXT NOT NULL, `currentPrice` TEXT, `standardPrice` TEXT, `currentPlanId` TEXT, `standardPlanId` TEXT, `currentOfferId` TEXT, `standardOfferId` TEXT, `endTime` TEXT, PRIMARY KEY(`typePrice`))", "toString(...)");
                db2.p("CREATE TABLE IF NOT EXISTS `prices_table` (`typePrice` INTEGER NOT NULL, `type` TEXT NOT NULL, `currentPrice` TEXT, `standardPrice` TEXT, `currentPlanId` TEXT, `standardPlanId` TEXT, `currentOfferId` TEXT, `standardOfferId` TEXT, `endTime` TEXT, PRIMARY KEY(`typePrice`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_prices_table_typePrice` ON `prices_table` (`typePrice`)");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP TABLE IF EXISTS `sports_table`;");
                db2.p("CREATE TABLE IF NOT EXISTS `sports_table` (`idCategory` INTEGER NOT NULL, `nameCategory` TEXT NOT NULL DEFAULT 'Undefined', `logoCategory` TEXT DEFAULT NULL, PRIMARY KEY(`idCategory`))");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP TABLE IF EXISTS `sports_table`;");
                db2.p("CREATE TABLE IF NOT EXISTS `sports_table` (`idCategory` INTEGER NOT NULL, `nameCategoryEn` TEXT NOT NULL DEFAULT 'Undefined', `nameCategoryRu` TEXT NOT NULL DEFAULT 'Undefined', `logoCategory` TEXT DEFAULT NULL, PRIMARY KEY(`idCategory`))");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `frequent_questions_table` (`id` INTEGER NOT NULL, `question` TEXT NOT NULL, `answer` TEXT NOT NULL, PRIMARY KEY(`id`))");
                db2.p("CREATE INDEX IF NOT EXISTS `index_frequent_questions_table_id` ON `frequent_questions_table` (`id`)");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(db2, "db");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `account_table_new` (`idUser` TEXT NOT NULL, `token` TEXT, `oldDeviceId` TEXT, `deviceId` TEXT, `countPremium` INTEGER NOT NULL, `countExpress` INTEGER NOT NULL, `email` TEXT, `name` TEXT, `surname` TEXT, `avatar` TEXT, `endTimeLive` INTEGER NOT NULL, `endTimePremium` INTEGER NOT NULL, `endTimeExpress` INTEGER NOT NULL, `endTimeDiamond` INTEGER NOT NULL, PRIMARY KEY(`idUser`))");
                db2.p("INSERT INTO `account_table_new` (`idUser`,`token`,`oldDeviceId`,`deviceId`,`countPremium`,`countExpress`,`email`,`name`,`surname`,`avatar`,`endTimeLive`,`endTimePremium`,`endTimeExpress`,`endTimeDiamond`) SELECT `account_table`.`idUser`,`account_table`.`token`,`account_table`.`oldDeviceId`,`account_table`.`deviceId`,`account_table`.`countPremium`,`account_table`.`countExpress`,`account_table`.`email`,`account_table`.`name`,`account_table`.`surname`,`account_table`.`avatar`, 0, 0, 0, 0 FROM `account_table`");
                db2.p("DROP TABLE IF EXISTS `account_table`;");
                db2.p("ALTER TABLE `account_table_new` RENAME TO `account_table`");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `table_prediction` (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `publication` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` TEXT, `imageBackground` TEXT, `odds` TEXT, `resultsIsViewed` INTEGER NOT NULL, `analyticsFull` TEXT, `analyticsShort` TEXT, `league` TEXT, `forecasts` TEXT, `arrayKind` TEXT, `arrayPrediction` TEXT, `oddsForecast` TEXT, `forecast` TEXT, `teamHomeId` INTEGER, `teamGuestId` INTEGER, `teamHomeFlag` TEXT, `teamGuestFlag` TEXT, `teamHomeName` TEXT, `teamGuestName` TEXT, `scoreHome` INTEGER, `scoreGuest` INTEGER, `scoreHomeExtra` INTEGER, `scoreGuestExtra` INTEGER, PRIMARY KEY(`id`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_prediction_id` ON `table_prediction` (`id`)");
                db2.p("CREATE INDEX IF NOT EXISTS `index_table_prediction_teamHomeId` ON `table_prediction` (`teamHomeId`)");
                db2.p("CREATE INDEX IF NOT EXISTS `index_table_prediction_teamGuestId` ON `table_prediction` (`teamGuestId`)");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `table_prediction_preview` (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `publication` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` TEXT, `imageBackground` TEXT, `odds` TEXT, `purchased` INTEGER NOT NULL, `forecasts` TEXT, `arrayKind` TEXT, `oddsForecast` TEXT, `forecast` TEXT, `teamHomeId` INTEGER, `teamGuestId` INTEGER, `teamHomeFlag` TEXT, `teamGuestFlag` TEXT, `teamHomeName` TEXT, `teamGuestName` TEXT, `scoreHome` INTEGER, `scoreGuest` INTEGER, `scoreHomeExtra` INTEGER, `scoreGuestExtra` INTEGER, PRIMARY KEY(`id`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_prediction_preview_id` ON `table_prediction_preview` (`id`)");
                db2.p("DELETE FROM `request_update_table`;");
                db2.p("DROP INDEX IF EXISTS `index_prediction_table_id`;");
                db2.p("DROP INDEX IF EXISTS `index_prediction_table_homeTeam`;");
                db2.p("DROP INDEX IF EXISTS `index_prediction_table_guestTeam`;");
                db2.p("DROP TABLE IF EXISTS `prediction_table`;");
                db2.p("DROP INDEX IF EXISTS `index_forecast_table_id`;");
                db2.p("DROP INDEX IF EXISTS `index_forecast_table_idPrediction`;");
                db2.p("DROP TABLE IF EXISTS `forecast_table`;");
                db2.p("DROP INDEX IF EXISTS `index_prediction_lang_table_id`;");
                db2.p("DROP INDEX IF EXISTS `index_prediction_lang_table_idPrediction`;");
                db2.p("DROP TABLE IF EXISTS `prediction_lang_table`;");
                db2.p("DROP INDEX IF EXISTS `index_team_table_id`;");
                db2.p("DROP TABLE IF EXISTS `team_table`;");
                db2.p("DROP TABLE IF EXISTS `team_lang_table`;");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("ALTER TABLE request_update_table ADD categoryId INTEGER DEFAULT 200;");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `account_table_new` (`idUser` TEXT NOT NULL, `token` TEXT, `active` INTEGER NOT NULL, `email` TEXT, `oldDeviceId` TEXT, `deviceId` TEXT, `countPremium` INTEGER NOT NULL, `countExpress` INTEGER NOT NULL, `name` TEXT, `surname` TEXT, `avatar` TEXT, `regDate` INTEGER, `timeLeft` INTEGER, PRIMARY KEY(`idUser`));");
                db2.p("INSERT INTO `account_table_new` (`idUser`,`token`,`active`,`email`,`oldDeviceId`,`deviceId`,`countPremium`,`countExpress`,`name`,`surname`,`avatar`,`regDate`,`timeLeft`) SELECT `account_table`.`idUser`,`account_table`.`token`,`account_table`.`active`,`account_table`.`email`,`account_table`.`oldDeviceId`,`account_table`.`deviceId`,`account_table`.`countPremium`,`account_table`.`countExpress`,`account_table`.`name`,`account_table`.`surname`,`account_table`.`avatar`, 0, 0 FROM `account_table`");
                db2.p("DROP TABLE IF EXISTS `account_table`;");
                db2.p("ALTER TABLE `account_table_new` RENAME TO `account_table`");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `live_prediction_table` (`id` INTEGER NOT NULL, `existRu` INTEGER NOT NULL, `existEn` INTEGER NOT NULL, `createDate` INTEGER NOT NULL, `isViewed` INTEGER, `imageUrlEn` TEXT, `imageUrlRu` TEXT, `titleEn` TEXT, `titleRu` TEXT, `messageRu` TEXT, `messageEn` TEXT, `btnTextEn` TEXT, `btnTextRu` TEXT, `btnUrlEn` TEXT, `btnUrlRu` TEXT, PRIMARY KEY(`id`))");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_live_prediction_table_id` ON `live_prediction_table` (`id`)");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP INDEX IF EXISTS `index_support_table_id`;");
                db2.p("DROP TABLE IF EXISTS `support_table`;");
                db2.p("CREATE TABLE IF NOT EXISTS `support_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `remoteId` INTEGER NOT NULL, `dateCreate` INTEGER NOT NULL, `dateUpdate` INTEGER NOT NULL, `stateRead` INTEGER NOT NULL, `readDate` INTEGER NOT NULL, `sendDate` INTEGER NOT NULL, `operatorName` TEXT, `text` TEXT, `type` INTEGER NOT NULL, `mime` TEXT, `content` TEXT)");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_support_table_id` ON `support_table` (`id`)");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `events_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `content` TEXT, `dateCreate` INTEGER NOT NULL)");
                db2.p("CREATE UNIQUE INDEX IF NOT EXISTS `index_events_table_id` ON `events_table` (`id`)");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP INDEX IF EXISTS `index_support_table_id`;");
                db2.p("DROP TABLE IF EXISTS `support_table`;");
                db2.p("DROP INDEX IF EXISTS `index_events_table_id`;");
                db2.p("DROP TABLE IF EXISTS `events_table`;");
                db2.p("DROP INDEX IF EXISTS `index_kind_table_id`;");
                db2.p("DROP TABLE IF EXISTS `kind_table`;");
                db2.p("DROP INDEX IF EXISTS `index_sku_details_table_sku`;");
                db2.p("DROP TABLE IF EXISTS `sku_details_table`;");
                db2.p("DROP TABLE IF EXISTS `prediction_op_table`;");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("CREATE TABLE IF NOT EXISTS `prediction_meeting_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idPrediction` INTEGER NOT NULL, `jsonObject` TEXT)");
                db2.p("CREATE INDEX IF NOT EXISTS `index_prediction_meeting_table_idPrediction` ON `prediction_meeting_table` (`idPrediction`)");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP INDEX IF EXISTS `index_prediction_update_table_idPrediction`;");
                db2.p("DROP TABLE IF EXISTS `prediction_update_table`;");
                db2.p("DROP TABLE IF EXISTS `prediction_last_id_table`;");
                db2.p("DROP TABLE IF EXISTS `request_update_table`;");
                db2.p("CREATE TABLE IF NOT EXISTS `request_update_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `timeRequestStart` INTEGER NOT NULL, `timeRequestEnd` INTEGER NOT NULL, `timeRequestEndDownload` INTEGER NOT NULL);");
                db2.p("DELETE FROM `favorite_table`;");
                db2.p("DELETE FROM `forecast_table`;");
                db2.p("DELETE FROM `team_lang_table`;");
                db2.p("DELETE FROM `team_table`;");
                db2.p("DELETE FROM `prediction_meeting_table`;");
                db2.p("DELETE FROM `prediction_kind_table`;");
                db2.p("DELETE FROM `prediction_lang_table`;");
                db2.p("DELETE FROM `prediction_table`;");
                break;
            default:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.p("DROP INDEX IF EXISTS `index_prediction_update_table_idPrediction`;");
                db2.p("DROP TABLE IF EXISTS `prediction_update_table`;");
                db2.p("DROP TABLE IF EXISTS `prediction_last_id_table`;");
                db2.p("DROP TABLE IF EXISTS `request_update_table`;");
                db2.p("CREATE TABLE IF NOT EXISTS `request_update_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `timeRequestStart` INTEGER NOT NULL, `timeRequestEnd` INTEGER NOT NULL, `timeRequestEndDownload` INTEGER NOT NULL);");
                db2.p("DELETE FROM `favorite_table`;");
                db2.p("DELETE FROM `forecast_table`;");
                db2.p("DELETE FROM `team_lang_table`;");
                db2.p("DELETE FROM `team_table`;");
                db2.p("DELETE FROM `prediction_meeting_table`;");
                db2.p("DELETE FROM `prediction_kind_table`;");
                db2.p("DELETE FROM `prediction_lang_table`;");
                db2.p("DELETE FROM `prediction_table`;");
                break;
        }
    }
}
