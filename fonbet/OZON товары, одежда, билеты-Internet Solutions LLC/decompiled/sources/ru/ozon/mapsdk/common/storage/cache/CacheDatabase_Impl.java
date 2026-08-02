package ru.ozon.mapsdk.common.storage.cache;

import B90.C2616s;
import Ce0.d;
import Ce0.i;
import H3.c;
import J4.h;
import J4.p;
import J4.s;
import J4.v;
import L4.e;
import O4.b;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CacheDatabase_Impl extends CacheDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile i f97557a;

    /* renamed from: b, reason: collision with root package name */
    private volatile d f97558b;

    final class a extends v.a {
        a() {
            super(3);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `cached_style_file` (`url` TEXT NOT NULL, `file` BLOB NOT NULL, `last_use_unix_time` INTEGER NOT NULL, `is_fallback` INTEGER NOT NULL, PRIMARY KEY(`url`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_cached_style_file_url` ON `cached_style_file` (`url`)", "CREATE TABLE IF NOT EXISTS `cached_provider` (`uniq_id` INTEGER NOT NULL, `name` TEXT, `logo` TEXT, `logo_mobile` TEXT, `max_zoom` REAL, `min_zoom` REAL, `tile_size` INTEGER, `tile_url` TEXT, `key` TEXT, `mode` TEXT, `suggest_preferred_provider` TEXT, `geocode_preferred_provider` TEXT, `rev_geocode_preferred_provider` TEXT, `allowed_locations` TEXT, `copyrights` TEXT, `features` TEXT, `suggest` TEXT, `suggest_provider` TEXT, `locale` TEXT, `sdkType` TEXT NOT NULL, PRIMARY KEY(`uniq_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_cached_provider_name` ON `cached_provider` (`name`)");
            bVar.O0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b5c9937432e88365aa8e1f60d5b1082f')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull b db2) {
            db2.O0("DROP TABLE IF EXISTS `cached_style_file`");
            db2.O0("DROP TABLE IF EXISTS `cached_provider`");
            List list = ((s) CacheDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        }

        @Override // J4.v.a
        public final void onCreate(@NonNull b bVar) {
            List list = ((s) CacheDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull b bVar) {
            CacheDatabase_Impl cacheDatabase_Impl = CacheDatabase_Impl.this;
            ((s) cacheDatabase_Impl).mDatabase = bVar;
            cacheDatabase_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) cacheDatabase_Impl).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onPostMigrate(@NonNull b bVar) {
        }

        @Override // J4.v.a
        public final void onPreMigrate(@NonNull b bVar) {
            L4.b.a(bVar);
        }

        @Override // J4.v.a
        @NonNull
        public final v.b onValidateSchema(@NonNull b bVar) {
            HashMap hashMap = new HashMap(4);
            hashMap.put(ImagesContract.URL, new e.a(ImagesContract.URL, "TEXT", 1, 1, true, null));
            hashMap.put("file", new e.a("file", "BLOB", 0, 1, true, null));
            hashMap.put("last_use_unix_time", new e.a("last_use_unix_time", "INTEGER", 0, 1, true, null));
            HashSet b11 = c.b(hashMap, "is_fallback", new e.a("is_fallback", "INTEGER", 0, 1, true, null), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new e.d(Arrays.asList(ImagesContract.URL), true, "index_cached_style_file_url", Arrays.asList("ASC")));
            e eVar = new e("cached_style_file", hashMap, b11, hashSet);
            e a11 = e.a(bVar, "cached_style_file");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("cached_style_file(ru.ozon.mapsdk.common.storage.cache.impl.data.CachedStyleFile).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(20);
            hashMap2.put("uniq_id", new e.a("uniq_id", "INTEGER", 1, 1, true, null));
            hashMap2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new e.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", 0, 1, false, null));
            hashMap2.put("logo", new e.a("logo", "TEXT", 0, 1, false, null));
            hashMap2.put("logo_mobile", new e.a("logo_mobile", "TEXT", 0, 1, false, null));
            hashMap2.put("max_zoom", new e.a("max_zoom", "REAL", 0, 1, false, null));
            hashMap2.put("min_zoom", new e.a("min_zoom", "REAL", 0, 1, false, null));
            hashMap2.put("tile_size", new e.a("tile_size", "INTEGER", 0, 1, false, null));
            hashMap2.put("tile_url", new e.a("tile_url", "TEXT", 0, 1, false, null));
            hashMap2.put("key", new e.a("key", "TEXT", 0, 1, false, null));
            hashMap2.put("mode", new e.a("mode", "TEXT", 0, 1, false, null));
            hashMap2.put("suggest_preferred_provider", new e.a("suggest_preferred_provider", "TEXT", 0, 1, false, null));
            hashMap2.put("geocode_preferred_provider", new e.a("geocode_preferred_provider", "TEXT", 0, 1, false, null));
            hashMap2.put("rev_geocode_preferred_provider", new e.a("rev_geocode_preferred_provider", "TEXT", 0, 1, false, null));
            hashMap2.put("allowed_locations", new e.a("allowed_locations", "TEXT", 0, 1, false, null));
            hashMap2.put("copyrights", new e.a("copyrights", "TEXT", 0, 1, false, null));
            hashMap2.put("features", new e.a("features", "TEXT", 0, 1, false, null));
            hashMap2.put("suggest", new e.a("suggest", "TEXT", 0, 1, false, null));
            hashMap2.put("suggest_provider", new e.a("suggest_provider", "TEXT", 0, 1, false, null));
            hashMap2.put("locale", new e.a("locale", "TEXT", 0, 1, false, null));
            HashSet b12 = c.b(hashMap2, "sdkType", new e.a("sdkType", "TEXT", 0, 1, true, null), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new e.d(Arrays.asList(AppMeasurementSdk.ConditionalUserProperty.NAME), true, "index_cached_provider_name", Arrays.asList("ASC")));
            e eVar2 = new e("cached_provider", hashMap2, b12, hashSet2);
            e a12 = e.a(bVar, "cached_provider");
            return !eVar2.equals(a12) ? new v.b(false, C2616s.c("cached_provider(ru.ozon.mapsdk.common.storage.cache.impl.data.CachedProvider).\n Expected:\n", eVar2, "\n Found:\n", a12)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.mapsdk.common.storage.cache.CacheDatabase
    public final Ce0.a a() {
        d dVar;
        if (this.f97558b != null) {
            return this.f97558b;
        }
        synchronized (this) {
            try {
                if (this.f97558b == null) {
                    this.f97558b = new d(this);
                }
                dVar = this.f97558b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // ru.ozon.mapsdk.common.storage.cache.CacheDatabase
    public final Ce0.e b() {
        i iVar;
        if (this.f97557a != null) {
            return this.f97557a;
        }
        synchronized (this) {
            try {
                if (this.f97557a == null) {
                    this.f97557a = new i(this);
                }
                iVar = this.f97557a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // J4.s
    @NonNull
    protected final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "cached_style_file", "cached_provider");
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new a(), "b5c9937432e88365aa8e1f60d5b1082f", "d5d848d042d3d077ad0cb3903797a083");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // J4.s
    @NonNull
    public final List<K4.a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ru.ozon.mapsdk.common.storage.cache.a());
        return arrayList;
    }

    @Override // J4.s
    @NonNull
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    @NonNull
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(Ce0.e.class, list);
        hashMap.put(Ce0.a.class, list);
        return hashMap;
    }
}
