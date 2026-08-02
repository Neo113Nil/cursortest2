package ru.ozon.push.sdk.internal.status.data.repository.database;

import B90.C2616s;
import Fh0.c;
import Fh0.d;
import Fh0.h;
import Fh0.i;
import Fh0.k;
import J4.p;
import J4.s;
import J4.v;
import L4.e;
import O4.b;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
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
public final class PushDataBase_Impl extends PushDataBase {

    /* renamed from: a, reason: collision with root package name */
    private volatile h f97707a;

    /* renamed from: b, reason: collision with root package name */
    private volatile c f97708b;

    /* renamed from: c, reason: collision with root package name */
    private volatile k f97709c;

    final class a extends v.a {
        a() {
            super(7);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `device_stats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `net` TEXT NOT NULL, `cellular_operator` TEXT NOT NULL, `net_provider` TEXT NOT NULL, `battery_charge` INTEGER NOT NULL, `energy_saving_mode` INTEGER NOT NULL, `energy_saving_mode_android` TEXT NOT NULL, `vpn_enabled` INTEGER, `proxy_enabled` INTEGER)", "CREATE TABLE IF NOT EXISTS `push_status` (`id` TEXT NOT NULL, `status` INTEGER NOT NULL, `createTimestamp` INTEGER, `sendingAttemptNumber` INTEGER, `device_stats_id` INTEGER, `pushServiceStartupTime` INTEGER, `delivery_status` TEXT, `is_teens_mode` INTEGER, `priority` TEXT, `original_priority` TEXT, `first_message_id` TEXT, PRIMARY KEY(`id`, `status`), FOREIGN KEY(`device_stats_id`) REFERENCES `device_stats`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c803ebd0e74e383b741c8b2c41bae5ae')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull b db2) {
            db2.O0("DROP TABLE IF EXISTS `device_stats`");
            db2.O0("DROP TABLE IF EXISTS `push_status`");
            List list = ((s) PushDataBase_Impl.this).mCallbacks;
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
            List list = ((s) PushDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull b bVar) {
            PushDataBase_Impl pushDataBase_Impl = PushDataBase_Impl.this;
            ((s) pushDataBase_Impl).mDatabase = bVar;
            bVar.O0("PRAGMA foreign_keys = ON");
            pushDataBase_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) pushDataBase_Impl).mCallbacks;
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
            HashMap hashMap = new HashMap(9);
            hashMap.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap.put("net", new e.a("net", "TEXT", 0, 1, true, null));
            hashMap.put("cellular_operator", new e.a("cellular_operator", "TEXT", 0, 1, true, null));
            hashMap.put("net_provider", new e.a("net_provider", "TEXT", 0, 1, true, null));
            hashMap.put("battery_charge", new e.a("battery_charge", "INTEGER", 0, 1, true, null));
            hashMap.put("energy_saving_mode", new e.a("energy_saving_mode", "INTEGER", 0, 1, true, null));
            hashMap.put("energy_saving_mode_android", new e.a("energy_saving_mode_android", "TEXT", 0, 1, true, null));
            hashMap.put("vpn_enabled", new e.a("vpn_enabled", "INTEGER", 0, 1, false, null));
            e eVar = new e("device_stats", hashMap, H3.c.b(hashMap, "proxy_enabled", new e.a("proxy_enabled", "INTEGER", 0, 1, false, null), 0), new HashSet(0));
            e a11 = e.a(bVar, "device_stats");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("device_stats(ru.ozon.push.sdk.internal.status.data.repository.database.entity.DeviceStatsEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(11);
            hashMap2.put("id", new e.a("id", "TEXT", 1, 1, true, null));
            hashMap2.put("status", new e.a("status", "INTEGER", 2, 1, true, null));
            hashMap2.put("createTimestamp", new e.a("createTimestamp", "INTEGER", 0, 1, false, null));
            hashMap2.put("sendingAttemptNumber", new e.a("sendingAttemptNumber", "INTEGER", 0, 1, false, null));
            hashMap2.put("device_stats_id", new e.a("device_stats_id", "INTEGER", 0, 1, false, null));
            hashMap2.put("pushServiceStartupTime", new e.a("pushServiceStartupTime", "INTEGER", 0, 1, false, null));
            hashMap2.put("delivery_status", new e.a("delivery_status", "TEXT", 0, 1, false, null));
            hashMap2.put("is_teens_mode", new e.a("is_teens_mode", "INTEGER", 0, 1, false, null));
            hashMap2.put("priority", new e.a("priority", "TEXT", 0, 1, false, null));
            hashMap2.put("original_priority", new e.a("original_priority", "TEXT", 0, 1, false, null));
            HashSet b11 = H3.c.b(hashMap2, "first_message_id", new e.a("first_message_id", "TEXT", 0, 1, false, null), 1);
            b11.add(new e.b("device_stats", Arrays.asList("device_stats_id"), "CASCADE", "NO ACTION", Arrays.asList("id")));
            e eVar2 = new e("push_status", hashMap2, b11, new HashSet(0));
            e a12 = e.a(bVar, "push_status");
            return !eVar2.equals(a12) ? new v.b(false, C2616s.c("push_status(ru.ozon.push.sdk.internal.status.data.repository.database.entity.PushEntity).\n Expected:\n", eVar2, "\n Found:\n", a12)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase
    public final d a() {
        h hVar;
        if (this.f97707a != null) {
            return this.f97707a;
        }
        synchronized (this) {
            try {
                if (this.f97707a == null) {
                    this.f97707a = new h(this);
                }
                hVar = this.f97707a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // ru.ozon.push.sdk.internal.status.data.repository.database.PushDataBase
    public final i b() {
        k kVar;
        if (this.f97709c != null) {
            return this.f97709c;
        }
        synchronized (this) {
            try {
                if (this.f97709c == null) {
                    this.f97709c = new k(this);
                }
                kVar = this.f97709c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // J4.s
    @NonNull
    protected final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "device_stats", "push_status");
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull J4.h hVar) {
        v vVar = new v(hVar, new a(), "c803ebd0e74e383b741c8b2c41bae5ae", "e743bf4d98a163e36f552e30ce32336b");
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
        hashMap.put(d.class, list);
        hashMap.put(Fh0.a.class, list);
        hashMap.put(i.class, list);
        return hashMap;
    }

    public final Fh0.a h() {
        Fh0.c cVar;
        if (this.f97708b != null) {
            return this.f97708b;
        }
        synchronized (this) {
            try {
                if (this.f97708b == null) {
                    this.f97708b = new Fh0.c(this);
                }
                cVar = this.f97708b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
