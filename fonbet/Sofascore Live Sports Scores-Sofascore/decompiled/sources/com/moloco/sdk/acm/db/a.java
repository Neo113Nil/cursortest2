package com.moloco.sdk.acm.db;

import android.database.sqlite.SQLiteDatabase;
import defpackage.cni;
import defpackage.ffb;
import defpackage.fz8;
import defpackage.g6g;
import defpackage.k6g;
import defpackage.n6g;
import defpackage.psi;
import defpackage.rr8;
import defpackage.ssi;
import defpackage.w1l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends ffb {
    public final /* synthetic */ MetricsDb_Impl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MetricsDb_Impl metricsDb_Impl) {
        super(1, 6);
        this.g = metricsDb_Impl;
    }

    @Override // defpackage.ffb
    public final void d(rr8 rr8Var) {
        SQLiteDatabase sQLiteDatabase = rr8Var.a;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
    }

    @Override // defpackage.ffb
    public final void f(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        rr8Var.a.execSQL("DROP TABLE IF EXISTS `events`");
        MetricsDb_Impl metricsDb_Impl = this.g;
        list = ((k6g) metricsDb_Impl).mCallbacks;
        if (list != null) {
            list2 = ((k6g) metricsDb_Impl).mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = ((k6g) metricsDb_Impl).mCallbacks;
                ((g6g) list3.get(i)).getClass();
            }
        }
    }

    @Override // defpackage.ffb
    public final void r(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        MetricsDb_Impl metricsDb_Impl = this.g;
        list = ((k6g) metricsDb_Impl).mCallbacks;
        if (list != null) {
            list2 = ((k6g) metricsDb_Impl).mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = ((k6g) metricsDb_Impl).mCallbacks;
                ((g6g) list3.get(i)).getClass();
            }
        }
    }

    @Override // defpackage.ffb
    public final void t(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        MetricsDb_Impl metricsDb_Impl = this.g;
        ((k6g) metricsDb_Impl).mDatabase = rr8Var;
        metricsDb_Impl.internalInitInvalidationTracker(rr8Var);
        list = ((k6g) metricsDb_Impl).mCallbacks;
        if (list != null) {
            list2 = ((k6g) metricsDb_Impl).mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = ((k6g) metricsDb_Impl).mCallbacks;
                ((g6g) list3.get(i)).a(rr8Var);
            }
        }
    }

    @Override // defpackage.ffb
    public final void u(rr8 rr8Var) {
        fz8.N(new cni(rr8Var));
    }

    @Override // defpackage.ffb
    public final n6g w(rr8 rr8Var) {
        HashMap hashMap = new HashMap(6);
        hashMap.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        hashMap.put("name", new psi(0, 1, "name", "TEXT", null, true));
        hashMap.put("timestamp", new psi(0, 1, "timestamp", "INTEGER", null, true));
        hashMap.put("eventType", new psi(0, 1, "eventType", "TEXT", null, true));
        hashMap.put("data", new psi(0, 1, "data", "INTEGER", null, false));
        hashMap.put("tags", new psi(0, 1, "tags", "TEXT", null, true));
        ssi ssiVar = new ssi("events", hashMap, new HashSet(0), new HashSet(0));
        ssi a = ssi.a(rr8Var, "events");
        return !ssiVar.equals(a) ? new n6g(1, w1l.h("events(com.moloco.sdk.acm.db.EventEntity).\n Expected:\n", ssiVar, "\n Found:\n", a), false) : new n6g(1, null, true);
    }
}
