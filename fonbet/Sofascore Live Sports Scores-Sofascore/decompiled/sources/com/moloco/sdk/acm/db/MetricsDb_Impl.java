package com.moloco.sdk.acm.db;

import android.content.Context;
import defpackage.dni;
import defpackage.fni;
import defpackage.ge6;
import defpackage.hg4;
import defpackage.njc;
import defpackage.q6g;
import defpackage.taa;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class MetricsDb_Impl extends MetricsDb {
    public volatile j c;

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public final j b() {
        j jVar;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new j(this);
                }
                jVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // defpackage.k6g
    public final void clearAllTables() {
        super.assertNotMainThread();
        dni writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.E("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.A0("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.y()) {
                writableDatabase.E("VACUUM");
            }
        }
    }

    @Override // defpackage.k6g
    public final taa createInvalidationTracker() {
        return new taa(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // defpackage.k6g
    public final fni createOpenHelper(hg4 hg4Var) {
        q6g q6gVar = new q6g(hg4Var, new a(this), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693");
        Context context = hg4Var.a;
        context.getClass();
        return hg4Var.c.a(new ge6(context, hg4Var.b, q6gVar, false, false));
    }

    @Override // defpackage.k6g
    public final List getAutoMigrations(Map map) {
        return Arrays.asList(new njc[0]);
    }

    @Override // defpackage.k6g
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // defpackage.k6g
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(j.class, Collections.EMPTY_LIST);
        return hashMap;
    }
}
