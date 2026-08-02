package ru.ozon.fintech.analytic.db;

import B90.C2616s;
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
import d30.l;
import d30.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MobileHealthDatabase_Impl extends MobileHealthDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile m f94913a;

    final class a extends v.a {
        a() {
            super(1);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `mobile_health_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event_json` TEXT NOT NULL, `created_at` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `user_id` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '793d398459de0f1a4fcea571b0ae9c1b')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull b db2) {
            db2.O0("DROP TABLE IF EXISTS `mobile_health_events`");
            db2.O0("DROP TABLE IF EXISTS `user_id`");
            List list = ((s) MobileHealthDatabase_Impl.this).mCallbacks;
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
            List list = ((s) MobileHealthDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull b bVar) {
            MobileHealthDatabase_Impl mobileHealthDatabase_Impl = MobileHealthDatabase_Impl.this;
            ((s) mobileHealthDatabase_Impl).mDatabase = bVar;
            mobileHealthDatabase_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) mobileHealthDatabase_Impl).mCallbacks;
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
            HashMap hashMap = new HashMap(3);
            hashMap.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap.put("event_json", new e.a("event_json", "TEXT", 0, 1, true, null));
            e eVar = new e("mobile_health_events", hashMap, c.b(hashMap, "created_at", new e.a("created_at", "INTEGER", 0, 1, true, null), 0), new HashSet(0));
            e a11 = e.a(bVar, "mobile_health_events");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("mobile_health_events(ru.ozon.fintech.analytic.db.entity.MobileHealthEventEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            e eVar2 = new e("user_id", hashMap2, c.b(hashMap2, "userId", new e.a("userId", "TEXT", 0, 1, true, null), 0), new HashSet(0));
            e a12 = e.a(bVar, "user_id");
            return !eVar2.equals(a12) ? new v.b(false, C2616s.c("user_id(ru.ozon.fintech.analytic.db.entity.UserIdEventEntity).\n Expected:\n", eVar2, "\n Found:\n", a12)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.fintech.analytic.db.MobileHealthDatabase
    public final l a() {
        m mVar;
        if (this.f94913a != null) {
            return this.f94913a;
        }
        synchronized (this) {
            try {
                if (this.f94913a == null) {
                    this.f94913a = new m(this);
                }
                mVar = this.f94913a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // J4.s
    @NonNull
    protected final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "mobile_health_events", "user_id");
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new a(), "793d398459de0f1a4fcea571b0ae9c1b", "2a7b3fed4e19a86de61c7c02389a1646");
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
        hashMap.put(l.class, Collections.EMPTY_LIST);
        return hashMap;
    }
}
