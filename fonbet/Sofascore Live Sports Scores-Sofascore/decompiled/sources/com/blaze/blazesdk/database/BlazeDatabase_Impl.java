package com.blaze.blazesdk.database;

import android.content.Context;
import defpackage.bam;
import defpackage.bcm;
import defpackage.bsl;
import defpackage.dni;
import defpackage.dnm;
import defpackage.fni;
import defpackage.frl;
import defpackage.ge6;
import defpackage.hg4;
import defpackage.i9m;
import defpackage.ibm;
import defpackage.j6m;
import defpackage.jx0;
import defpackage.kmm;
import defpackage.lsm;
import defpackage.lxm;
import defpackage.m4m;
import defpackage.njc;
import defpackage.nom;
import defpackage.psl;
import defpackage.q6g;
import defpackage.s9m;
import defpackage.taa;
import defpackage.tlm;
import defpackage.trl;
import defpackage.z6m;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class BlazeDatabase_Impl extends BlazeDatabase {
    public volatile bcm a;
    public volatile j6m b;
    public volatile kmm c;
    public volatile jx0 d;
    public volatile lsm e;
    public volatile dnm f;
    public volatile z6m g;
    public volatile nom h;
    public volatile bam i;

    @Override // defpackage.k6g
    public final void clearAllTables() {
        assertNotMainThread();
        dni writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.E("DELETE FROM `stories_pages_status`");
            writableDatabase.E("DELETE FROM `moments_liked_status`");
            writableDatabase.E("DELETE FROM `moments_viewed`");
            writableDatabase.E("DELETE FROM `analytics_track`");
            writableDatabase.E("DELETE FROM `analytics_do_not_track`");
            writableDatabase.E("DELETE FROM `interactions_status`");
            writableDatabase.E("DELETE FROM `videos_liked_status`");
            writableDatabase.E("DELETE FROM `videos_viewed`");
            writableDatabase.E("DELETE FROM `blaze_logs`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            writableDatabase.A0("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.y()) {
                writableDatabase.E("VACUUM");
            }
        }
    }

    @Override // defpackage.k6g
    public final taa createInvalidationTracker() {
        return new taa(this, new HashMap(0), new HashMap(0), "stories_pages_status", "moments_liked_status", "moments_viewed", "analytics_track", "analytics_do_not_track", "interactions_status", "videos_liked_status", "videos_viewed", "blaze_logs");
    }

    @Override // defpackage.k6g
    public final fni createOpenHelper(hg4 hg4Var) {
        q6g q6gVar = new q6g(hg4Var, new ibm(this), "9c93aa15293f2d4a88bc6eeb7e384940", "68ef7ab4c32df676217145cc944734ef");
        Context context = hg4Var.a;
        context.getClass();
        return hg4Var.c.a(new ge6(context, hg4Var.b, q6gVar, false, false));
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final m4m getAnalyticsDoNotTrackDao() {
        dnm dnmVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new dnm(this);
                }
                dnmVar = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dnmVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final lxm getAnalyticsTrackDao() {
        jx0 jx0Var;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new jx0(this);
                }
                jx0Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jx0Var;
    }

    @Override // defpackage.k6g
    public final List getAutoMigrations(Map map) {
        return Arrays.asList(new njc[0]);
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final tlm getInteractionStatusDao() {
        lsm lsmVar;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = new lsm(this);
                }
                lsmVar = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lsmVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final psl getLoggerDao() {
        bam bamVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    this.i = new bam(this);
                }
                bamVar = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bamVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final frl getMomentsLikedDao() {
        j6m j6mVar;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new j6m(this);
                }
                j6mVar = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6mVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final i9m getMomentsViewedDao() {
        kmm kmmVar;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new kmm(this);
                }
                kmmVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kmmVar;
    }

    @Override // defpackage.k6g
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // defpackage.k6g
    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(trl.class, list);
        hashMap.put(frl.class, list);
        hashMap.put(i9m.class, list);
        hashMap.put(lxm.class, list);
        hashMap.put(tlm.class, list);
        hashMap.put(m4m.class, list);
        hashMap.put(bsl.class, list);
        hashMap.put(s9m.class, list);
        hashMap.put(psl.class, list);
        return hashMap;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final trl getStoryPageDao() {
        bcm bcmVar;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new bcm(this);
                }
                bcmVar = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bcmVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final bsl getVideosLikedDao() {
        z6m z6mVar;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new z6m(this);
                }
                z6mVar = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6mVar;
    }

    @Override // com.blaze.blazesdk.database.BlazeDatabase
    public final s9m getVideosViewedDao() {
        nom nomVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new nom(this);
                }
                nomVar = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nomVar;
    }
}
