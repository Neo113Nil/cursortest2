package ru.ozon.mapsdk.common.storage.cache;

import O4.b;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.storage.cache.CacheDatabase;

/* loaded from: classes7.dex */
final class a extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final CacheDatabase.a f97560a;

    public a() {
        super(1, 2);
        this.f97560a = new CacheDatabase.a();
    }

    @Override // K4.a
    public final void migrate(@NonNull b db2) {
        Sh.b.d(db2, "CREATE TABLE IF NOT EXISTS `_new_cached_provider` (`uniq_id` INTEGER NOT NULL, `name` TEXT, `logo` TEXT, `logo_mobile` TEXT, `max_zoom` REAL, `min_zoom` REAL, `tile_size` INTEGER, `tile_url` TEXT, `key` TEXT, `mode` TEXT, `suggest_preferred_provider` TEXT, `geocode_preferred_provider` TEXT, `rev_geocode_preferred_provider` TEXT, `allowed_locations` TEXT, `copyrights` TEXT, `features` TEXT, `suggest` TEXT, `suggest_provider` TEXT, `locale` TEXT, `sdkType` TEXT NOT NULL, PRIMARY KEY(`uniq_id`))", "INSERT INTO `_new_cached_provider` (`uniq_id`,`name`,`logo`,`logo_mobile`,`max_zoom`,`min_zoom`,`tile_size`,`tile_url`,`key`,`mode`,`suggest_preferred_provider`,`geocode_preferred_provider`,`rev_geocode_preferred_provider`,`allowed_locations`,`copyrights`,`features`,`suggest`,`suggest_provider`,`locale`,`sdkType`) SELECT `uniq_id`,`name`,`logo`,`logo_mobile`,`max_zoom`,`min_zoom`,`tile_size`,`tile_url`,`key`,`mode`,`suggest_preferred_provider`,`geocode_preferred_provider`,`rev_geocode_preferred_provider`,`allowed_locations`,`copyrights`,`features`,`suggest`,`suggest_provider`,`locale`,`sdk` FROM `cached_provider`", "DROP TABLE `cached_provider`", "ALTER TABLE `_new_cached_provider` RENAME TO `cached_provider`");
        db2.O0("CREATE UNIQUE INDEX IF NOT EXISTS `index_cached_provider_name` ON `cached_provider` (`name`)");
        this.f97560a.getClass();
        Intrinsics.checkNotNullParameter(db2, "db");
    }
}
