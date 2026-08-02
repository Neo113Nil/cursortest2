package ru.ozon.app.android.abtool.data.local;

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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.data.local.dao.ExperimentDao;
import ru.ozon.app.android.abtool.data.local.dao.ExperimentDao_Impl;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao;
import ru.ozon.app.android.abtool.data.local.dao.FeatureDao_Impl;

/* loaded from: classes6.dex */
public final class LocalDatabase_Impl extends LocalDatabase {
    private volatile ExperimentDao _experimentDao;
    private volatile FeatureDao _featureDao;

    @Override // J4.s
    protected p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "feature_entity", "experiment_entity");
    }

    @Override // J4.s
    protected c createOpenHelper(h hVar) {
        v vVar = new v(hVar, new v.a(2) { // from class: ru.ozon.app.android.abtool.data.local.LocalDatabase_Impl.1
            @Override // J4.v.a
            public void createAllTables(b bVar) {
                Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `feature_entity` (`id` TEXT NOT NULL, `service_name` TEXT NOT NULL, `displayed_name` TEXT, `name` TEXT NOT NULL, `value_type` TEXT NOT NULL, `value` TEXT NOT NULL, `localValue` TEXT, `update_strategy` INTEGER NOT NULL, `override_value` TEXT, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `experiment_entity` (`id` INTEGER NOT NULL, `variantId` INTEGER NOT NULL, `alias` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a5b3a1b42a645b961760afe65cecf3e')");
            }

            @Override // J4.v.a
            public void dropAllTables(b db2) {
                db2.O0("DROP TABLE IF EXISTS `feature_entity`");
                db2.O0("DROP TABLE IF EXISTS `experiment_entity`");
                if (((s) LocalDatabase_Impl.this).mCallbacks != null) {
                    int size = ((s) LocalDatabase_Impl.this).mCallbacks.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((s.b) ((s) LocalDatabase_Impl.this).mCallbacks.get(i11)).getClass();
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.v.a
            public void onCreate(b bVar) {
                if (((s) LocalDatabase_Impl.this).mCallbacks != null) {
                    int size = ((s) LocalDatabase_Impl.this).mCallbacks.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((s.b) ((s) LocalDatabase_Impl.this).mCallbacks.get(i11)).a(bVar);
                    }
                }
            }

            @Override // J4.v.a
            public void onOpen(b bVar) {
                ((s) LocalDatabase_Impl.this).mDatabase = bVar;
                LocalDatabase_Impl.this.internalInitInvalidationTracker(bVar);
                if (((s) LocalDatabase_Impl.this).mCallbacks != null) {
                    int size = ((s) LocalDatabase_Impl.this).mCallbacks.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((s.b) ((s) LocalDatabase_Impl.this).mCallbacks.get(i11)).b(bVar);
                    }
                }
            }

            @Override // J4.v.a
            public void onPostMigrate(b bVar) {
            }

            @Override // J4.v.a
            public void onPreMigrate(b bVar) {
                L4.b.a(bVar);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // J4.v.a
            public v.b onValidateSchema(b bVar) {
                HashMap hashMap = new HashMap(9);
                hashMap.put("id", new e.a("id", "TEXT", 1, 1, true, null));
                hashMap.put("service_name", new e.a("service_name", "TEXT", 0, 1, true, null));
                hashMap.put("displayed_name", new e.a("displayed_name", "TEXT", 0, 1, false, null));
                hashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new e.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", 0, 1, true, null));
                hashMap.put("value_type", new e.a("value_type", "TEXT", 0, 1, true, null));
                hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, new e.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "TEXT", 0, 1, true, null));
                hashMap.put("localValue", new e.a("localValue", "TEXT", 0, 1, false, null));
                hashMap.put("update_strategy", new e.a("update_strategy", "INTEGER", 0, 1, true, null));
                e eVar = new e("feature_entity", hashMap, H3.c.b(hashMap, "override_value", new e.a("override_value", "TEXT", 0, 1, false, null), 0), new HashSet(0));
                e a11 = e.a(bVar, "feature_entity");
                if (!eVar.equals(a11)) {
                    return new v.b(false, C2616s.c("feature_entity(ru.ozon.app.android.abtool.data.local.entity.FeatureEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
                hashMap2.put("variantId", new e.a("variantId", "INTEGER", 0, 1, true, null));
                e eVar2 = new e("experiment_entity", hashMap2, H3.c.b(hashMap2, "alias", new e.a("alias", "TEXT", 0, 1, true, null), 0), new HashSet(0));
                e a12 = e.a(bVar, "experiment_entity");
                return !eVar2.equals(a12) ? new v.b(false, C2616s.c("experiment_entity(ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity).\n Expected:\n", eVar2, "\n Found:\n", a12)) : new v.b(true, null);
            }
        }, "8a5b3a1b42a645b961760afe65cecf3e", "0def5f19ae9aafb82bfa15c216cc9483");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // ru.ozon.app.android.abtool.data.local.LocalDatabase
    public ExperimentDao experimentDao() {
        ExperimentDao experimentDao;
        if (this._experimentDao != null) {
            return this._experimentDao;
        }
        synchronized (this) {
            try {
                if (this._experimentDao == null) {
                    this._experimentDao = new ExperimentDao_Impl(this);
                }
                experimentDao = this._experimentDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return experimentDao;
    }

    @Override // ru.ozon.app.android.abtool.data.local.LocalDatabase
    public FeatureDao featureDao() {
        FeatureDao featureDao;
        if (this._featureDao != null) {
            return this._featureDao;
        }
        synchronized (this) {
            try {
                if (this._featureDao == null) {
                    this._featureDao = new FeatureDao_Impl(this);
                }
                featureDao = this._featureDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return featureDao;
    }

    @Override // J4.s
    public List<a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return Arrays.asList(new a[0]);
    }

    @Override // J4.s
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(FeatureDao.class, FeatureDao_Impl.getRequiredConverters());
        hashMap.put(ExperimentDao.class, ExperimentDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
