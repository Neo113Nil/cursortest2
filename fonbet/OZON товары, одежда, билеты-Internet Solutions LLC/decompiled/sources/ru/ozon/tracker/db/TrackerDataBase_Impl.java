package ru.ozon.tracker.db;

import B90.C2616s;
import H3.c;
import J4.h;
import J4.s;
import J4.v;
import L4.e;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ki0.InterfaceC7684a;
import ki0.b;
import kotlin.jvm.internal.Intrinsics;
import li0.InterfaceC7963a;
import li0.e;
import li0.m;
import li0.p;
import ru.ozon.tracker.db.entities.PerfEventEntity;
import ru.ozon.tracker.db.entities.UserData;

/* loaded from: classes7.dex */
public final class TrackerDataBase_Impl extends TrackerDataBase {

    /* renamed from: a, reason: collision with root package name */
    private volatile e f97731a;

    /* renamed from: b, reason: collision with root package name */
    private volatile p f97732b;

    /* renamed from: c, reason: collision with root package name */
    private volatile b f97733c;

    final class a extends v.a {
        a() {
            super(26);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull O4.b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `user` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `accessToken` TEXT, `token` TEXT, `abGroup` INTEGER, `regionId` INTEGER)", "CREATE TABLE IF NOT EXISTS `event` (`uuid` TEXT NOT NULL, `eventUuid` TEXT NOT NULL, `version` TEXT NOT NULL, `eventBody` TEXT NOT NULL, `type` INTEGER NOT NULL, `markEventToSend` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`uuid`))", "CREATE TABLE IF NOT EXISTS `user_data` (`ab_group` INTEGER NOT NULL, `region_id` INTEGER NOT NULL, `user_id` TEXT NOT NULL, `company_id` INTEGER, `user_roles` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `performance_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uuid` TEXT, `requestId` TEXT, `timestamp` INTEGER NOT NULL, `testingToolName` TEXT, `attributes` TEXT, `user` TEXT, `page` TEXT, `obj` TEXT, `props` TEXT, `widget` TEXT, `metrics` TEXT, `map` TEXT, `customMetrics` TEXT, `videoMetrics` TEXT, `serverTimings` TEXT, `pclpage` TEXT)");
            bVar.O0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '645ba7fac28f1bef346e9b82dcb60afe')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull O4.b db2) {
            Sh.b.d(db2, "DROP TABLE IF EXISTS `user`", "DROP TABLE IF EXISTS `event`", "DROP TABLE IF EXISTS `user_data`", "DROP TABLE IF EXISTS `performance_event`");
            List list = ((s) TrackerDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        }

        @Override // J4.v.a
        public final void onCreate(@NonNull O4.b bVar) {
            List list = ((s) TrackerDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull O4.b bVar) {
            TrackerDataBase_Impl trackerDataBase_Impl = TrackerDataBase_Impl.this;
            ((s) trackerDataBase_Impl).mDatabase = bVar;
            trackerDataBase_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) trackerDataBase_Impl).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onPostMigrate(@NonNull O4.b bVar) {
        }

        @Override // J4.v.a
        public final void onPreMigrate(@NonNull O4.b bVar) {
            L4.b.a(bVar);
        }

        @Override // J4.v.a
        @NonNull
        public final v.b onValidateSchema(@NonNull O4.b bVar) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap.put("accessToken", new e.a("accessToken", "TEXT", 0, 1, false, null));
            hashMap.put("token", new e.a("token", "TEXT", 0, 1, false, null));
            hashMap.put("abGroup", new e.a("abGroup", "INTEGER", 0, 1, false, null));
            L4.e eVar = new L4.e("user", hashMap, c.b(hashMap, "regionId", new e.a("regionId", "INTEGER", 0, 1, false, null), 0), new HashSet(0));
            L4.e a11 = L4.e.a(bVar, "user");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("user(ru.ozon.tracker.db.entities.UserEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("uuid", new e.a("uuid", "TEXT", 1, 1, true, null));
            hashMap2.put("eventUuid", new e.a("eventUuid", "TEXT", 0, 1, true, null));
            hashMap2.put("version", new e.a("version", "TEXT", 0, 1, true, null));
            hashMap2.put("eventBody", new e.a("eventBody", "TEXT", 0, 1, true, null));
            hashMap2.put("type", new e.a("type", "INTEGER", 0, 1, true, null));
            hashMap2.put("markEventToSend", new e.a("markEventToSend", "INTEGER", 0, 1, true, null));
            L4.e eVar2 = new L4.e("event", hashMap2, c.b(hashMap2, "timestamp", new e.a("timestamp", "INTEGER", 0, 1, true, null), 0), new HashSet(0));
            L4.e a12 = L4.e.a(bVar, "event");
            if (!eVar2.equals(a12)) {
                return new v.b(false, C2616s.c("event(ru.ozon.tracker.db.entities.DbEvent).\n Expected:\n", eVar2, "\n Found:\n", a12));
            }
            HashMap hashMap3 = new HashMap(6);
            hashMap3.put("ab_group", new e.a("ab_group", "INTEGER", 0, 1, true, null));
            hashMap3.put("region_id", new e.a("region_id", "INTEGER", 0, 1, true, null));
            hashMap3.put("user_id", new e.a("user_id", "TEXT", 0, 1, true, null));
            hashMap3.put("company_id", new e.a("company_id", "INTEGER", 0, 1, false, null));
            hashMap3.put("user_roles", new e.a("user_roles", "TEXT", 0, 1, true, null));
            L4.e eVar3 = new L4.e(UserData.TABLE_NAME, hashMap3, c.b(hashMap3, "id", new e.a("id", "INTEGER", 1, 1, true, null), 0), new HashSet(0));
            L4.e a13 = L4.e.a(bVar, UserData.TABLE_NAME);
            if (!eVar3.equals(a13)) {
                return new v.b(false, C2616s.c("user_data(ru.ozon.tracker.db.entities.UserData).\n Expected:\n", eVar3, "\n Found:\n", a13));
            }
            HashMap hashMap4 = new HashMap(17);
            hashMap4.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap4.put("uuid", new e.a("uuid", "TEXT", 0, 1, false, null));
            hashMap4.put("requestId", new e.a("requestId", "TEXT", 0, 1, false, null));
            hashMap4.put("timestamp", new e.a("timestamp", "INTEGER", 0, 1, true, null));
            hashMap4.put("testingToolName", new e.a("testingToolName", "TEXT", 0, 1, false, null));
            hashMap4.put("attributes", new e.a("attributes", "TEXT", 0, 1, false, null));
            hashMap4.put("user", new e.a("user", "TEXT", 0, 1, false, null));
            hashMap4.put("page", new e.a("page", "TEXT", 0, 1, false, null));
            hashMap4.put("obj", new e.a("obj", "TEXT", 0, 1, false, null));
            hashMap4.put("props", new e.a("props", "TEXT", 0, 1, false, null));
            hashMap4.put("widget", new e.a("widget", "TEXT", 0, 1, false, null));
            hashMap4.put("metrics", new e.a("metrics", "TEXT", 0, 1, false, null));
            hashMap4.put("map", new e.a("map", "TEXT", 0, 1, false, null));
            hashMap4.put("customMetrics", new e.a("customMetrics", "TEXT", 0, 1, false, null));
            hashMap4.put("videoMetrics", new e.a("videoMetrics", "TEXT", 0, 1, false, null));
            hashMap4.put("serverTimings", new e.a("serverTimings", "TEXT", 0, 1, false, null));
            L4.e eVar4 = new L4.e(PerfEventEntity.TABLE_NAME, hashMap4, c.b(hashMap4, "pclpage", new e.a("pclpage", "TEXT", 0, 1, false, null), 0), new HashSet(0));
            L4.e a14 = L4.e.a(bVar, PerfEventEntity.TABLE_NAME);
            return !eVar4.equals(a14) ? new v.b(false, C2616s.c("performance_event(ru.ozon.tracker.db.entities.PerfEventEntity).\n Expected:\n", eVar4, "\n Found:\n", a14)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.tracker.db.TrackerDataBase
    public final InterfaceC7963a a() {
        li0.e eVar;
        if (this.f97731a != null) {
            return this.f97731a;
        }
        synchronized (this) {
            try {
                if (this.f97731a == null) {
                    this.f97731a = new li0.e(this);
                }
                eVar = this.f97731a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // ru.ozon.tracker.db.TrackerDataBase
    public final InterfaceC7684a b() {
        b bVar;
        if (this.f97733c != null) {
            return this.f97733c;
        }
        synchronized (this) {
            try {
                if (this.f97733c == null) {
                    this.f97733c = new b(this);
                }
                bVar = this.f97733c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // ru.ozon.tracker.db.TrackerDataBase
    public final m c() {
        p pVar;
        if (this.f97732b != null) {
            return this.f97732b;
        }
        synchronized (this) {
            try {
                if (this.f97732b == null) {
                    this.f97732b = new p(this);
                }
                pVar = this.f97732b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // J4.s
    @NonNull
    protected final J4.p createInvalidationTracker() {
        return new J4.p(this, new HashMap(0), new HashMap(0), "user", "event", UserData.TABLE_NAME, PerfEventEntity.TABLE_NAME);
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new a(), "645ba7fac28f1bef346e9b82dcb60afe", "e3286ea76ff3699c6e36f066d51e5a67");
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
        return new ArrayList();
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
        hashMap.put(InterfaceC7963a.class, list);
        hashMap.put(m.class, list);
        hashMap.put(InterfaceC7684a.class, list);
        return hashMap;
    }
}
