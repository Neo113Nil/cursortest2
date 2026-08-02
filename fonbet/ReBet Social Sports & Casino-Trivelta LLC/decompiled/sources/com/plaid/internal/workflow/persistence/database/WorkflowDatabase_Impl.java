package com.plaid.internal.workflow.persistence.database;

import A2.b;
import A2.f;
import E2.g;
import E2.h;
import androidx.annotation.NonNull;
import androidx.room.C2270h;
import androidx.room.q;
import androidx.room.w;
import androidx.room.z;
import com.facebook.react.devsupport.StackTraceHelper;
import com.plaid.internal.C4;
import com.plaid.internal.H4;
import com.plaid.internal.I3;
import com.plaid.internal.P3;
import com.plaid.internal.Y7;
import com.plaid.internal.g8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z2.AbstractC6912b;
import z2.InterfaceC6911a;

/* loaded from: classes4.dex */
public final class WorkflowDatabase_Impl extends WorkflowDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile H4 f41177a;

    /* renamed from: b, reason: collision with root package name */
    public volatile P3 f41178b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g8 f41179c;

    @Override // androidx.room.w
    public final void clearAllTables() {
        assertNotMainThread();
        g writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.z("DELETE FROM `workflow_pane`");
            writableDatabase.z("DELETE FROM `workflow_local_key_values`");
            writableDatabase.z("DELETE FROM `workflow_analytics`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            writableDatabase.p1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.F1()) {
                writableDatabase.z("VACUUM");
            }
        }
    }

    @Override // androidx.room.w
    @NonNull
    public final q createInvalidationTracker() {
        return new q(this, new HashMap(0), new HashMap(0), "workflow_pane", "workflow_local_key_values", "workflow_analytics");
    }

    @Override // androidx.room.w
    @NonNull
    public final h createOpenHelper(@NonNull C2270h c2270h) {
        return c2270h.f23359c.a(h.b.a(c2270h.f23357a).d(c2270h.f23358b).c(new z(c2270h, new a(), "bbbb42d6a8058409381c7dda80a54606", "b05e367cc67e6caaadf5a14d5c557670")).b());
    }

    @Override // androidx.room.w
    @NonNull
    public final List<AbstractC6912b> getAutoMigrations(@NonNull Map<Class<? extends InterfaceC6911a>, InterfaceC6911a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.w
    @NonNull
    public final Set<Class<? extends InterfaceC6911a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.w
    @NonNull
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(C4.class, list);
        hashMap.put(I3.class, list);
        hashMap.put(Y7.class, list);
        return hashMap;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final Y7 c() {
        g8 g8Var;
        if (this.f41179c != null) {
            return this.f41179c;
        }
        synchronized (this) {
            try {
                if (this.f41179c == null) {
                    this.f41179c = new g8(this);
                }
                g8Var = this.f41179c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g8Var;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final I3 a() {
        P3 p32;
        if (this.f41178b != null) {
            return this.f41178b;
        }
        synchronized (this) {
            try {
                if (this.f41178b == null) {
                    this.f41178b = new P3(this);
                }
                p32 = this.f41178b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p32;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final C4 b() {
        H4 h42;
        if (this.f41177a != null) {
            return this.f41177a;
        }
        synchronized (this) {
            try {
                if (this.f41177a == null) {
                    this.f41177a = new H4(this);
                }
                h42 = this.f41177a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h42;
    }

    public class a extends z.b {
        public a() {
            super(3);
        }

        @Override // androidx.room.z.b
        public final void createAllTables(@NonNull g gVar) {
            gVar.z("CREATE TABLE IF NOT EXISTS `workflow_pane` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            gVar.z("CREATE TABLE IF NOT EXISTS `workflow_local_key_values` (`pane_id` TEXT NOT NULL, `key` TEXT NOT NULL, `string` TEXT, `byte_array` BLOB, PRIMARY KEY(`pane_id`, `key`))");
            gVar.z("CREATE TABLE IF NOT EXISTS `workflow_analytics` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `analytics_model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            gVar.z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbbb42d6a8058409381c7dda80a54606')");
        }

        @Override // androidx.room.z.b
        public final void dropAllTables(@NonNull g gVar) {
            gVar.z("DROP TABLE IF EXISTS `workflow_pane`");
            gVar.z("DROP TABLE IF EXISTS `workflow_local_key_values`");
            gVar.z("DROP TABLE IF EXISTS `workflow_analytics`");
            List list = ((w) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).b(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public final void onCreate(@NonNull g gVar) {
            List list = ((w) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).a(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public final void onOpen(@NonNull g gVar) {
            ((w) WorkflowDatabase_Impl.this).mDatabase = gVar;
            WorkflowDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List list = ((w) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((w.b) it.next()).c(gVar);
                }
            }
        }

        @Override // androidx.room.z.b
        public final void onPreMigrate(@NonNull g gVar) {
            b.b(gVar);
        }

        @Override // androidx.room.z.b
        @NonNull
        public final z.c onValidateSchema(@NonNull g gVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("workflow_id", new f.a("workflow_id", "TEXT", true, 1, null, 1));
            hashMap.put(StackTraceHelper.ID_KEY, new f.a(StackTraceHelper.ID_KEY, "TEXT", true, 2, null, 1));
            hashMap.put("model", new f.a("model", "BLOB", true, 0, null, 1));
            f fVar = new f("workflow_pane", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "workflow_pane");
            if (!fVar.equals(a10)) {
                return new z.c(false, "workflow_pane(com.plaid.internal.workflow.persistence.database.model.PaneEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("pane_id", new f.a("pane_id", "TEXT", true, 1, null, 1));
            hashMap2.put("key", new f.a("key", "TEXT", true, 2, null, 1));
            hashMap2.put("string", new f.a("string", "TEXT", false, 0, null, 1));
            hashMap2.put("byte_array", new f.a("byte_array", "BLOB", false, 0, null, 1));
            f fVar2 = new f("workflow_local_key_values", hashMap2, new HashSet(0), new HashSet(0));
            f a11 = f.a(gVar, "workflow_local_key_values");
            if (!fVar2.equals(a11)) {
                return new z.c(false, "workflow_local_key_values(com.plaid.internal.workflow.persistence.database.model.LocalKeyValuesEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("workflow_id", new f.a("workflow_id", "TEXT", true, 1, null, 1));
            hashMap3.put(StackTraceHelper.ID_KEY, new f.a(StackTraceHelper.ID_KEY, "TEXT", true, 2, null, 1));
            hashMap3.put("analytics_model", new f.a("analytics_model", "BLOB", true, 0, null, 1));
            f fVar3 = new f("workflow_analytics", hashMap3, new HashSet(0), new HashSet(0));
            f a12 = f.a(gVar, "workflow_analytics");
            if (fVar3.equals(a12)) {
                return new z.c(true, null);
            }
            return new z.c(false, "workflow_analytics(com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
        }

        @Override // androidx.room.z.b
        public final void onPostMigrate(@NonNull g gVar) {
        }
    }
}
