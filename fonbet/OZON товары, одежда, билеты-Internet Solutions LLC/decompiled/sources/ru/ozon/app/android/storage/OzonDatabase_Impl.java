package ru.ozon.app.android.storage;

import B90.C2616s;
import J4.h;
import J4.p;
import J4.s;
import J4.v;
import K4.a;
import L4.e;
import O4.b;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao_Impl;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao_Impl;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao;
import ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteDao_Impl;

/* loaded from: classes7.dex */
public final class OzonDatabase_Impl extends OzonDatabase {
    private volatile BundleStateDao _bundleStateDao;
    private volatile NetworkHistoryDao _networkHistoryDao;
    private volatile SellerFavoriteDao _sellerFavoriteDao;

    @Override // ru.ozon.app.android.storage.OzonDatabase
    public BundleStateDao bundleStateDao() {
        BundleStateDao bundleStateDao;
        if (this._bundleStateDao != null) {
            return this._bundleStateDao;
        }
        synchronized (this) {
            try {
                if (this._bundleStateDao == null) {
                    this._bundleStateDao = new BundleStateDao_Impl(this);
                }
                bundleStateDao = this._bundleStateDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundleStateDao;
    }

    @Override // J4.s
    @NonNull
    protected p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "network_history", "sellerFavorite", "bundle_state");
    }

    @Override // J4.s
    @NonNull
    protected c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new v.a(22) { // from class: ru.ozon.app.android.storage.OzonDatabase_Impl.1
            @Override // J4.v.a
            public void createAllTables(@NonNull b bVar) {
                Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `network_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `traceId` TEXT, `url` TEXT NOT NULL, `responseTime` REAL NOT NULL, `time` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `sellerFavorite` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `bundle_state` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `guid` TEXT NOT NULL, `bundle` BLOB NOT NULL, `blobSize` INTEGER NOT NULL, `screenGuid` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c65c163461ab0afdaf0360e28f045315')");
            }

            @Override // J4.v.a
            public void dropAllTables(@NonNull b db2) {
                db2.O0("DROP TABLE IF EXISTS `network_history`");
                db2.O0("DROP TABLE IF EXISTS `sellerFavorite`");
                db2.O0("DROP TABLE IF EXISTS `bundle_state`");
                List list = ((s) OzonDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s.b) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
            }

            @Override // J4.v.a
            public void onCreate(@NonNull b bVar) {
                List list = ((s) OzonDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s.b) it.next()).a(bVar);
                    }
                }
            }

            @Override // J4.v.a
            public void onOpen(@NonNull b bVar) {
                ((s) OzonDatabase_Impl.this).mDatabase = bVar;
                OzonDatabase_Impl.this.internalInitInvalidationTracker(bVar);
                List list = ((s) OzonDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((s.b) it.next()).b(bVar);
                    }
                }
            }

            @Override // J4.v.a
            public void onPostMigrate(@NonNull b bVar) {
            }

            @Override // J4.v.a
            public void onPreMigrate(@NonNull b bVar) {
                L4.b.a(bVar);
            }

            @Override // J4.v.a
            @NonNull
            public v.b onValidateSchema(@NonNull b bVar) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
                hashMap.put("traceId", new e.a("traceId", "TEXT", 0, 1, false, null));
                hashMap.put(ImagesContract.URL, new e.a(ImagesContract.URL, "TEXT", 0, 1, true, null));
                hashMap.put("responseTime", new e.a("responseTime", "REAL", 0, 1, true, null));
                e eVar = new e("network_history", hashMap, H3.c.b(hashMap, "time", new e.a("time", "INTEGER", 0, 1, true, null), 0), new HashSet(0));
                e a11 = e.a(bVar, "network_history");
                if (!eVar.equals(a11)) {
                    return new v.b(false, C2616s.c("network_history(ru.ozon.app.android.storage.entity.network.NetworkHistoryEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
                }
                HashMap hashMap2 = new HashMap(1);
                e eVar2 = new e("sellerFavorite", hashMap2, H3.c.b(hashMap2, "id", new e.a("id", "INTEGER", 1, 1, true, null), 0), new HashSet(0));
                e a12 = e.a(bVar, "sellerFavorite");
                if (!eVar2.equals(a12)) {
                    return new v.b(false, C2616s.c("sellerFavorite(ru.ozon.app.android.storage.entity.sellerfavorites.SellerFavoriteEntity).\n Expected:\n", eVar2, "\n Found:\n", a12));
                }
                HashMap hashMap3 = new HashMap(5);
                hashMap3.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
                hashMap3.put("guid", new e.a("guid", "TEXT", 0, 1, true, null));
                hashMap3.put("bundle", new e.a("bundle", "BLOB", 0, 1, true, null));
                hashMap3.put("blobSize", new e.a("blobSize", "INTEGER", 0, 1, true, null));
                e eVar3 = new e("bundle_state", hashMap3, H3.c.b(hashMap3, "screenGuid", new e.a("screenGuid", "TEXT", 0, 1, true, null), 0), new HashSet(0));
                e a13 = e.a(bVar, "bundle_state");
                return !eVar3.equals(a13) ? new v.b(false, C2616s.c("bundle_state(ru.ozon.app.android.storage.entity.bundle.BundleState).\n Expected:\n", eVar3, "\n Found:\n", a13)) : new v.b(true, null);
            }
        }, "c65c163461ab0afdaf0360e28f045315", "e8d750a9f2871b8f7f434695ee34421f");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // J4.s
    @NonNull
    public List<a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // J4.s
    @NonNull
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    @NonNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(NetworkHistoryDao.class, NetworkHistoryDao_Impl.getRequiredConverters());
        hashMap.put(SellerFavoriteDao.class, SellerFavoriteDao_Impl.getRequiredConverters());
        hashMap.put(BundleStateDao.class, BundleStateDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // ru.ozon.app.android.storage.OzonDatabase
    public NetworkHistoryDao networkHistoryDao() {
        NetworkHistoryDao networkHistoryDao;
        if (this._networkHistoryDao != null) {
            return this._networkHistoryDao;
        }
        synchronized (this) {
            try {
                if (this._networkHistoryDao == null) {
                    this._networkHistoryDao = new NetworkHistoryDao_Impl(this);
                }
                networkHistoryDao = this._networkHistoryDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return networkHistoryDao;
    }

    @Override // ru.ozon.app.android.storage.OzonDatabase
    public SellerFavoriteDao sellerFavoriteDao() {
        SellerFavoriteDao sellerFavoriteDao;
        if (this._sellerFavoriteDao != null) {
            return this._sellerFavoriteDao;
        }
        synchronized (this) {
            try {
                if (this._sellerFavoriteDao == null) {
                    this._sellerFavoriteDao = new SellerFavoriteDao_Impl(this);
                }
                sellerFavoriteDao = this._sellerFavoriteDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sellerFavoriteDao;
    }
}
