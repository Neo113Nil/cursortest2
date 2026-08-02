package androidx.work.impl;

import A2.f;
import E2.g;
import E2.h;
import R2.L;
import R2.M;
import R2.N;
import R2.O;
import R2.P;
import R2.Q;
import R2.S;
import R2.T;
import X2.b;
import X2.e;
import X2.f;
import X2.i;
import X2.j;
import X2.k;
import X2.l;
import X2.q;
import X2.r;
import androidx.room.C2270h;
import androidx.room.w;
import androidx.room.z;
import androidx.work.impl.model.c;
import androidx.work.impl.model.d;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: e, reason: collision with root package name */
    public volatile c f23777e;

    /* renamed from: f, reason: collision with root package name */
    public volatile X2.a f23778f;

    /* renamed from: g, reason: collision with root package name */
    public volatile q f23779g;

    /* renamed from: h, reason: collision with root package name */
    public volatile e f23780h;

    /* renamed from: i, reason: collision with root package name */
    public volatile i f23781i;

    /* renamed from: j, reason: collision with root package name */
    public volatile k f23782j;

    /* renamed from: k, reason: collision with root package name */
    public volatile X2.c f23783k;

    @Override // androidx.room.w
    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.z("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.z("DELETE FROM `Dependency`");
            writableDatabase.z("DELETE FROM `WorkSpec`");
            writableDatabase.z("DELETE FROM `WorkTag`");
            writableDatabase.z("DELETE FROM `SystemIdInfo`");
            writableDatabase.z("DELETE FROM `WorkName`");
            writableDatabase.z("DELETE FROM `WorkProgress`");
            writableDatabase.z("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.p1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.F1()) {
                writableDatabase.z("VACUUM");
            }
        }
    }

    @Override // androidx.room.w
    public androidx.room.q createInvalidationTracker() {
        return new androidx.room.q(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.w
    public h createOpenHelper(C2270h c2270h) {
        return c2270h.f23359c.a(h.b.a(c2270h.f23357a).d(c2270h.f23358b).c(new z(c2270h, new a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public X2.a g() {
        X2.a aVar;
        if (this.f23778f != null) {
            return this.f23778f;
        }
        synchronized (this) {
            try {
                if (this.f23778f == null) {
                    this.f23778f = new b(this);
                }
                aVar = this.f23778f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // androidx.room.w
    public List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new L());
        arrayList.add(new M());
        arrayList.add(new N());
        arrayList.add(new O());
        arrayList.add(new P());
        arrayList.add(new Q());
        arrayList.add(new S());
        arrayList.add(new T());
        return arrayList;
    }

    @Override // androidx.room.w
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.w
    public Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.class, d.I());
        hashMap.put(X2.a.class, b.e());
        hashMap.put(q.class, r.d());
        hashMap.put(e.class, f.h());
        hashMap.put(i.class, j.c());
        hashMap.put(k.class, l.d());
        hashMap.put(X2.c.class, X2.d.c());
        hashMap.put(androidx.work.impl.model.a.class, androidx.work.impl.model.b.a());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public X2.c h() {
        X2.c cVar;
        if (this.f23783k != null) {
            return this.f23783k;
        }
        synchronized (this) {
            try {
                if (this.f23783k == null) {
                    this.f23783k = new X2.d(this);
                }
                cVar = this.f23783k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e i() {
        e eVar;
        if (this.f23780h != null) {
            return this.f23780h;
        }
        synchronized (this) {
            try {
                if (this.f23780h == null) {
                    this.f23780h = new f(this);
                }
                eVar = this.f23780h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public i j() {
        i iVar;
        if (this.f23781i != null) {
            return this.f23781i;
        }
        synchronized (this) {
            try {
                if (this.f23781i == null) {
                    this.f23781i = new j(this);
                }
                iVar = this.f23781i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k k() {
        k kVar;
        if (this.f23782j != null) {
            return this.f23782j;
        }
        synchronized (this) {
            try {
                if (this.f23782j == null) {
                    this.f23782j = new l(this);
                }
                kVar = this.f23782j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public c l() {
        c cVar;
        if (this.f23777e != null) {
            return this.f23777e;
        }
        synchronized (this) {
            try {
                if (this.f23777e == null) {
                    this.f23777e = new d(this);
                }
                cVar = this.f23777e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q m() {
        q qVar;
        if (this.f23779g != null) {
            return this.f23779g;
        }
        synchronized (this) {
            try {
                if (this.f23779g == null) {
                    this.f23779g = new r(this);
                }
                qVar = this.f23779g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public class a extends z.b {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.z.b
        public void createAllTables(g gVar) {
            gVar.z("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.z("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.z.b
        public void dropAllTables(g gVar) {
            gVar.z("DROP TABLE IF EXISTS `Dependency`");
            gVar.z("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.z("DROP TABLE IF EXISTS `WorkTag`");
            gVar.z("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.z("DROP TABLE IF EXISTS `WorkName`");
            gVar.z("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.z("DROP TABLE IF EXISTS `Preference`");
            List list = ((w) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).b(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onCreate(g gVar) {
            List list = ((w) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).a(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onOpen(g gVar) {
            ((w) WorkDatabase_Impl.this).mDatabase = gVar;
            gVar.z("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List list = ((w) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).c(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public void onPreMigrate(g gVar) {
            A2.b.b(gVar);
        }

        @Override // androidx.room.z.b
        public z.c onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            hashSet.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new f.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            A2.f fVar = new A2.f("Dependency", hashMap, hashSet, hashSet2);
            A2.f a10 = A2.f.a(gVar, "Dependency");
            if (!fVar.equals(a10)) {
                return new z.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(32);
            hashMap2.put(StackTraceHelper.ID_KEY, new f.a(StackTraceHelper.ID_KEY, "TEXT", true, 1, null, 1));
            hashMap2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new f.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new f.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new f.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new f.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new f.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new f.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("trace_tag", new f.a("trace_tag", "TEXT", false, 0, null, 1));
            hashMap2.put("required_network_type", new f.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_request", new f.a("required_network_request", "BLOB", true, 0, "x''", 1));
            hashMap2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new f.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            A2.f fVar2 = new A2.f("WorkSpec", hashMap2, hashSet3, hashSet4);
            A2.f a11 = A2.f.a(gVar, "WorkSpec");
            if (!fVar2.equals(a11)) {
                return new z.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            A2.f fVar3 = new A2.f("WorkTag", hashMap3, hashSet5, hashSet6);
            A2.f a12 = A2.f.a(gVar, "WorkTag");
            if (!fVar3.equals(a12)) {
                return new z.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new f.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            A2.f fVar4 = new A2.f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            A2.f a13 = A2.f.a(gVar, "SystemIdInfo");
            if (!fVar4.equals(a13)) {
                return new z.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            A2.f fVar5 = new A2.f("WorkName", hashMap5, hashSet8, hashSet9);
            A2.f a14 = A2.f.a(gVar, "WorkName");
            if (!fVar5.equals(a14)) {
                return new z.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new f.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY)));
            A2.f fVar6 = new A2.f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            A2.f a15 = A2.f.a(gVar, "WorkProgress");
            if (!fVar6.equals(a15)) {
                return new z.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            A2.f fVar7 = new A2.f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            A2.f a16 = A2.f.a(gVar, "Preference");
            if (fVar7.equals(a16)) {
                return new z.c(true, null);
            }
            return new z.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a16);
        }

        @Override // androidx.room.z.b
        public void onPostMigrate(g gVar) {
        }
    }
}
