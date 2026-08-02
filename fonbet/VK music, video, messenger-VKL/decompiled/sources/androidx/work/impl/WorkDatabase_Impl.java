package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.b;
import androidx.room.e;
import androidx.room.m;
import com.ironsource.C4217a2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.ayx0;
import xsna.bvx0;
import xsna.cvx0;
import xsna.cyx0;
import xsna.dvx0;
import xsna.evx0;
import xsna.fvx0;
import xsna.fyx0;
import xsna.gvx0;
import xsna.gxx0;
import xsna.hqn0;
import xsna.hvx0;
import xsna.ivx0;
import xsna.izl;
import xsna.kwx0;
import xsna.kzl;
import xsna.lqn0;
import xsna.mwx0;
import xsna.nxn0;
import xsna.owx0;
import xsna.qin0;
import xsna.sin0;
import xsna.swx0;
import xsna.sye0;
import xsna.t3j0;
import xsna.tin0;
import xsna.urk;
import xsna.uxc0;
import xsna.vr;
import xsna.wxc0;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile ayx0 m;
    public volatile kzl n;
    public volatile fyx0 o;
    public volatile lqn0 p;
    public volatile mwx0 q;
    public volatile swx0 r;
    public volatile wxc0 s;

    @Override // androidx.work.impl.WorkDatabase
    public final hqn0 A() {
        lqn0 lqn0Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new lqn0(this);
                }
                lqn0Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lqn0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final kwx0 B() {
        mwx0 mwx0Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new mwx0(this);
                }
                mwx0Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mwx0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final owx0 C() {
        swx0 swx0Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new swx0(this);
                }
                swx0Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return swx0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gxx0 D() {
        ayx0 ayx0Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new ayx0(this);
                }
                ayx0Var = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ayx0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cyx0 E() {
        fyx0 fyx0Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new fyx0(this);
                }
                fyx0Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fyx0Var;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final e e() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final tin0 g(@NonNull b bVar) {
        return bVar.c.create(new tin0.b(bVar.a, bVar.b, new m(bVar, new a(), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0"), false, false));
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final List h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bvx0(13, 14));
        arrayList.add(new cvx0(14, 15));
        arrayList.add(new dvx0(16, 17));
        arrayList.add(new evx0(17, 18));
        arrayList.add(new fvx0(18, 19));
        arrayList.add(new gvx0(19, 20));
        arrayList.add(new hvx0(20, 21));
        arrayList.add(new ivx0(22, 23));
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final Set<Class<Object>> l() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final Map<Class<?>, List<Class<?>>> n() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(gxx0.class, list);
        hashMap.put(izl.class, list);
        hashMap.put(cyx0.class, list);
        hashMap.put(hqn0.class, list);
        hashMap.put(kwx0.class, list);
        hashMap.put(owx0.class, list);
        hashMap.put(uxc0.class, list);
        hashMap.put(sye0.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final izl y() {
        kzl kzlVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new kzl(this);
                }
                kzlVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kzlVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final uxc0 z() {
        wxc0 wxc0Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new wxc0(this);
                }
                wxc0Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wxc0Var;
    }

    public class a extends m.a {
        public a() {
            super(23);
        }

        @Override // androidx.room.m.a
        public final void a(@NonNull sin0 sin0Var) {
            vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            vr.d(sin0Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sin0Var.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            sin0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sin0Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.m.a
        public final void b(@NonNull sin0 sin0Var) {
            vr.d(sin0Var, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            sin0Var.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sin0Var.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sin0Var.execSQL("DROP TABLE IF EXISTS `Preference`");
        }

        @Override // androidx.room.m.a
        public final void d(@NonNull sin0 sin0Var) {
            WorkDatabase_Impl.this.a = sin0Var;
            sin0Var.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.r(new qin0(sin0Var));
        }

        @Override // androidx.room.m.a
        public final void e(@NonNull sin0 sin0Var) {
            urk.a(new qin0(sin0Var));
        }

        @Override // androidx.room.m.a
        @NonNull
        public final m.b f(@NonNull sin0 sin0Var) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new nxn0.a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap.put("prerequisite_id", new nxn0.a(2, "prerequisite_id", "TEXT", null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new nxn0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            hashSet2.add(new nxn0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var = new nxn0("Dependency", hashMap, hashSet, hashSet2);
            nxn0 a = nxn0.a(sin0Var, "Dependency");
            if (!nxn0Var.equals(a)) {
                return new m.b(false, t3j0.a("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", nxn0Var, "\n Found:\n", a));
            }
            HashMap hashMap2 = new HashMap(32);
            hashMap2.put("id", new nxn0.a(1, "id", "TEXT", null, true, 1));
            hashMap2.put("state", new nxn0.a(0, "state", "INTEGER", null, true, 1));
            hashMap2.put("worker_class_name", new nxn0.a(0, "worker_class_name", "TEXT", null, true, 1));
            hashMap2.put("input_merger_class_name", new nxn0.a(0, "input_merger_class_name", "TEXT", null, true, 1));
            hashMap2.put("input", new nxn0.a(0, "input", "BLOB", null, true, 1));
            hashMap2.put("output", new nxn0.a(0, "output", "BLOB", null, true, 1));
            hashMap2.put("initial_delay", new nxn0.a(0, "initial_delay", "INTEGER", null, true, 1));
            hashMap2.put("interval_duration", new nxn0.a(0, "interval_duration", "INTEGER", null, true, 1));
            hashMap2.put("flex_duration", new nxn0.a(0, "flex_duration", "INTEGER", null, true, 1));
            hashMap2.put("run_attempt_count", new nxn0.a(0, "run_attempt_count", "INTEGER", null, true, 1));
            hashMap2.put("backoff_policy", new nxn0.a(0, "backoff_policy", "INTEGER", null, true, 1));
            hashMap2.put("backoff_delay_duration", new nxn0.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
            hashMap2.put("last_enqueue_time", new nxn0.a(0, "last_enqueue_time", "INTEGER", C4217a2.f, true, 1));
            hashMap2.put("minimum_retention_duration", new nxn0.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
            hashMap2.put("schedule_requested_at", new nxn0.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
            hashMap2.put("run_in_foreground", new nxn0.a(0, "run_in_foreground", "INTEGER", null, true, 1));
            hashMap2.put("out_of_quota_policy", new nxn0.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
            hashMap2.put("period_count", new nxn0.a(0, "period_count", "INTEGER", "0", true, 1));
            hashMap2.put("generation", new nxn0.a(0, "generation", "INTEGER", "0", true, 1));
            hashMap2.put("next_schedule_time_override", new nxn0.a(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", true, 1));
            hashMap2.put("next_schedule_time_override_generation", new nxn0.a(0, "next_schedule_time_override_generation", "INTEGER", "0", true, 1));
            hashMap2.put("stop_reason", new nxn0.a(0, "stop_reason", "INTEGER", "-256", true, 1));
            hashMap2.put("trace_tag", new nxn0.a(0, "trace_tag", "TEXT", null, false, 1));
            hashMap2.put("required_network_type", new nxn0.a(0, "required_network_type", "INTEGER", null, true, 1));
            hashMap2.put("required_network_request", new nxn0.a(0, "required_network_request", "BLOB", "x''", true, 1));
            hashMap2.put("requires_charging", new nxn0.a(0, "requires_charging", "INTEGER", null, true, 1));
            hashMap2.put("requires_device_idle", new nxn0.a(0, "requires_device_idle", "INTEGER", null, true, 1));
            hashMap2.put("requires_battery_not_low", new nxn0.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
            hashMap2.put("requires_storage_not_low", new nxn0.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
            hashMap2.put("trigger_content_update_delay", new nxn0.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
            hashMap2.put("trigger_max_content_delay", new nxn0.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
            hashMap2.put("content_uri_triggers", new nxn0.a(0, "content_uri_triggers", "BLOB", null, true, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new nxn0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
            hashSet4.add(new nxn0.d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var2 = new nxn0("WorkSpec", hashMap2, hashSet3, hashSet4);
            nxn0 a2 = nxn0.a(sin0Var, "WorkSpec");
            if (!nxn0Var2.equals(a2)) {
                return new m.b(false, t3j0.a("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new nxn0.a(1, "tag", "TEXT", null, true, 1));
            hashMap3.put("work_spec_id", new nxn0.a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new nxn0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var3 = new nxn0("WorkTag", hashMap3, hashSet5, hashSet6);
            nxn0 a3 = nxn0.a(sin0Var, "WorkTag");
            if (!nxn0Var3.equals(a3)) {
                return new m.b(false, t3j0.a("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", nxn0Var3, "\n Found:\n", a3));
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new nxn0.a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap4.put("generation", new nxn0.a(2, "generation", "INTEGER", "0", true, 1));
            hashMap4.put("system_id", new nxn0.a(0, "system_id", "INTEGER", null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            nxn0 nxn0Var4 = new nxn0("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            nxn0 a4 = nxn0.a(sin0Var, "SystemIdInfo");
            if (!nxn0Var4.equals(a4)) {
                return new m.b(false, t3j0.a("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", nxn0Var4, "\n Found:\n", a4));
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new nxn0.a(1, "name", "TEXT", null, true, 1));
            hashMap5.put("work_spec_id", new nxn0.a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new nxn0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            nxn0 nxn0Var5 = new nxn0("WorkName", hashMap5, hashSet8, hashSet9);
            nxn0 a5 = nxn0.a(sin0Var, "WorkName");
            if (!nxn0Var5.equals(a5)) {
                return new m.b(false, t3j0.a("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", nxn0Var5, "\n Found:\n", a5));
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new nxn0.a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new nxn0.a(0, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new nxn0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            nxn0 nxn0Var6 = new nxn0("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            nxn0 a6 = nxn0.a(sin0Var, "WorkProgress");
            if (!nxn0Var6.equals(a6)) {
                return new m.b(false, t3j0.a("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", nxn0Var6, "\n Found:\n", a6));
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new nxn0.a(1, "key", "TEXT", null, true, 1));
            hashMap7.put("long_value", new nxn0.a(0, "long_value", "INTEGER", null, false, 1));
            nxn0 nxn0Var7 = new nxn0("Preference", hashMap7, new HashSet(0), new HashSet(0));
            nxn0 a7 = nxn0.a(sin0Var, "Preference");
            return !nxn0Var7.equals(a7) ? new m.b(false, t3j0.a("Preference(androidx.work.impl.model.Preference).\n Expected:\n", nxn0Var7, "\n Found:\n", a7)) : new m.b(true, null);
        }

        @Override // androidx.room.m.a
        public final void c() {
        }
    }
}
