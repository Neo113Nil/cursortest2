package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.blaze.blazesdk.database.BlazeDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ibm extends ffb {
    public final /* synthetic */ BlazeDatabase_Impl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibm(BlazeDatabase_Impl blazeDatabase_Impl) {
        super(10, 6);
        this.g = blazeDatabase_Impl;
    }

    @Override // defpackage.ffb
    public final void d(rr8 rr8Var) {
        SQLiteDatabase sQLiteDatabase = rr8Var.a;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `stories_pages_status` (`page_id` TEXT NOT NULL, `story_id` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, PRIMARY KEY(`page_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `moments_liked_status` (`moment_id` TEXT NOT NULL, `is_liked` INTEGER NOT NULL, PRIMARY KEY(`moment_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `moments_viewed` (`moment_id` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, PRIMARY KEY(`moment_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `analytics_track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `request` TEXT NOT NULL, `response` TEXT, `type` TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `analytics_do_not_track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `request` TEXT NOT NULL, `response` TEXT, `type` TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `interactions_status` (`interaction_id` TEXT NOT NULL, `interacted_value` TEXT NOT NULL, PRIMARY KEY(`interaction_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `videos_liked_status` (`video_id` TEXT NOT NULL, `is_liked` INTEGER NOT NULL, PRIMARY KEY(`video_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `videos_viewed` (`video_id` TEXT NOT NULL, `is_synced` INTEGER NOT NULL, `last_viewed_ms` REAL NOT NULL, `is_read` INTEGER NOT NULL, PRIMARY KEY(`video_id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `blaze_logs` (`id` TEXT NOT NULL, `request` TEXT NOT NULL, `level` TEXT NOT NULL, `reporting_timestamp` TEXT, `is_immediate` INTEGER NOT NULL, `api_scheme_version` TEXT NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9c93aa15293f2d4a88bc6eeb7e384940')");
    }

    @Override // defpackage.ffb
    public final void f(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        SQLiteDatabase sQLiteDatabase = rr8Var.a;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `stories_pages_status`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `moments_liked_status`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `moments_viewed`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `analytics_track`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `analytics_do_not_track`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `interactions_status`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `videos_liked_status`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `videos_viewed`");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `blaze_logs`");
        BlazeDatabase_Impl blazeDatabase_Impl = this.g;
        list = blazeDatabase_Impl.mCallbacks;
        if (list != null) {
            list2 = blazeDatabase_Impl.mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = blazeDatabase_Impl.mCallbacks;
                ((g6g) list3.get(i)).getClass();
            }
        }
    }

    @Override // defpackage.ffb
    public final void r(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        BlazeDatabase_Impl blazeDatabase_Impl = this.g;
        list = blazeDatabase_Impl.mCallbacks;
        if (list != null) {
            list2 = blazeDatabase_Impl.mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = blazeDatabase_Impl.mCallbacks;
                ((g6g) list3.get(i)).getClass();
            }
        }
    }

    @Override // defpackage.ffb
    public final void t(rr8 rr8Var) {
        List list;
        List list2;
        List list3;
        BlazeDatabase_Impl blazeDatabase_Impl = this.g;
        blazeDatabase_Impl.mDatabase = rr8Var;
        blazeDatabase_Impl.internalInitInvalidationTracker(rr8Var);
        list = blazeDatabase_Impl.mCallbacks;
        if (list != null) {
            list2 = blazeDatabase_Impl.mCallbacks;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list3 = blazeDatabase_Impl.mCallbacks;
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
        HashMap hashMap = new HashMap(3);
        hashMap.put("page_id", new psi(1, 1, "page_id", "TEXT", null, true));
        hashMap.put("story_id", new psi(0, 1, "story_id", "TEXT", null, true));
        hashMap.put("is_synced", new psi(0, 1, "is_synced", "INTEGER", null, true));
        ssi ssiVar = new ssi("stories_pages_status", hashMap, new HashSet(0), new HashSet(0));
        ssi a = ssi.a(rr8Var, "stories_pages_status");
        if (!ssiVar.equals(a)) {
            return new n6g(1, w1l.h("stories_pages_status(com.blaze.blazesdk.features.stories.models.local.StoryPageStatus).\n Expected:\n", ssiVar, "\n Found:\n", a), false);
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("moment_id", new psi(1, 1, "moment_id", "TEXT", null, true));
        hashMap2.put("is_liked", new psi(0, 1, "is_liked", "INTEGER", null, true));
        ssi ssiVar2 = new ssi("moments_liked_status", hashMap2, new HashSet(0), new HashSet(0));
        ssi a2 = ssi.a(rr8Var, "moments_liked_status");
        if (!ssiVar2.equals(a2)) {
            return new n6g(1, w1l.h("moments_liked_status(com.blaze.blazesdk.features.moments.models.local.MomentLikedStatus).\n Expected:\n", ssiVar2, "\n Found:\n", a2), false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("moment_id", new psi(1, 1, "moment_id", "TEXT", null, true));
        hashMap3.put("is_synced", new psi(0, 1, "is_synced", "INTEGER", null, true));
        ssi ssiVar3 = new ssi("moments_viewed", hashMap3, new HashSet(0), new HashSet(0));
        ssi a3 = ssi.a(rr8Var, "moments_viewed");
        if (!ssiVar3.equals(a3)) {
            return new n6g(1, w1l.h("moments_viewed(com.blaze.blazesdk.features.moments.models.local.MomentViewed).\n Expected:\n", ssiVar3, "\n Found:\n", a3), false);
        }
        HashMap hashMap4 = new HashMap(4);
        hashMap4.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        hashMap4.put("request", new psi(0, 1, "request", "TEXT", null, true));
        hashMap4.put("response", new psi(0, 1, "response", "TEXT", null, false));
        hashMap4.put("type", new psi(0, 1, "type", "TEXT", null, true));
        ssi ssiVar4 = new ssi("analytics_track", hashMap4, new HashSet(0), new HashSet(0));
        ssi a4 = ssi.a(rr8Var, "analytics_track");
        if (!ssiVar4.equals(a4)) {
            return new n6g(1, w1l.h("analytics_track(com.blaze.blazesdk.analytics.AnalyticsTrackLocal).\n Expected:\n", ssiVar4, "\n Found:\n", a4), false);
        }
        HashMap hashMap5 = new HashMap(4);
        hashMap5.put("id", new psi(1, 1, "id", "INTEGER", null, true));
        hashMap5.put("request", new psi(0, 1, "request", "TEXT", null, true));
        hashMap5.put("response", new psi(0, 1, "response", "TEXT", null, false));
        hashMap5.put("type", new psi(0, 1, "type", "TEXT", null, true));
        ssi ssiVar5 = new ssi("analytics_do_not_track", hashMap5, new HashSet(0), new HashSet(0));
        ssi a5 = ssi.a(rr8Var, "analytics_do_not_track");
        if (!ssiVar5.equals(a5)) {
            return new n6g(1, w1l.h("analytics_do_not_track(com.blaze.blazesdk.analytics.AnalyticsDoNotTrackLocal).\n Expected:\n", ssiVar5, "\n Found:\n", a5), false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("interaction_id", new psi(1, 1, "interaction_id", "TEXT", null, true));
        hashMap6.put("interacted_value", new psi(0, 1, "interacted_value", "TEXT", null, true));
        ssi ssiVar6 = new ssi("interactions_status", hashMap6, new HashSet(0), new HashSet(0));
        ssi a6 = ssi.a(rr8Var, "interactions_status");
        if (!ssiVar6.equals(a6)) {
            return new n6g(1, w1l.h("interactions_status(com.blaze.blazesdk.interactions.models.local.InteractionStatus).\n Expected:\n", ssiVar6, "\n Found:\n", a6), false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("video_id", new psi(1, 1, "video_id", "TEXT", null, true));
        hashMap7.put("is_liked", new psi(0, 1, "is_liked", "INTEGER", null, true));
        ssi ssiVar7 = new ssi("videos_liked_status", hashMap7, new HashSet(0), new HashSet(0));
        ssi a7 = ssi.a(rr8Var, "videos_liked_status");
        if (!ssiVar7.equals(a7)) {
            return new n6g(1, w1l.h("videos_liked_status(com.blaze.blazesdk.features.videos.models.local.VideoLikedStatus).\n Expected:\n", ssiVar7, "\n Found:\n", a7), false);
        }
        HashMap hashMap8 = new HashMap(4);
        hashMap8.put("video_id", new psi(1, 1, "video_id", "TEXT", null, true));
        hashMap8.put("is_synced", new psi(0, 1, "is_synced", "INTEGER", null, true));
        hashMap8.put("last_viewed_ms", new psi(0, 1, "last_viewed_ms", "REAL", null, true));
        hashMap8.put("is_read", new psi(0, 1, "is_read", "INTEGER", null, true));
        ssi ssiVar8 = new ssi("videos_viewed", hashMap8, new HashSet(0), new HashSet(0));
        ssi a8 = ssi.a(rr8Var, "videos_viewed");
        if (!ssiVar8.equals(a8)) {
            return new n6g(1, w1l.h("videos_viewed(com.blaze.blazesdk.features.videos.models.local.VideoViewed).\n Expected:\n", ssiVar8, "\n Found:\n", a8), false);
        }
        HashMap hashMap9 = new HashMap(6);
        hashMap9.put("id", new psi(1, 1, "id", "TEXT", null, true));
        hashMap9.put("request", new psi(0, 1, "request", "TEXT", null, true));
        hashMap9.put("level", new psi(0, 1, "level", "TEXT", null, true));
        hashMap9.put("reporting_timestamp", new psi(0, 1, "reporting_timestamp", "TEXT", null, false));
        hashMap9.put("is_immediate", new psi(0, 1, "is_immediate", "INTEGER", null, true));
        hashMap9.put("api_scheme_version", new psi(0, 1, "api_scheme_version", "TEXT", null, true));
        ssi ssiVar9 = new ssi("blaze_logs", hashMap9, new HashSet(0), new HashSet(0));
        ssi a9 = ssi.a(rr8Var, "blaze_logs");
        return !ssiVar9.equals(a9) ? new n6g(1, w1l.h("blaze_logs(com.blaze.blazesdk.logger.local.BlazeLogLocal).\n Expected:\n", ssiVar9, "\n Found:\n", a9), false) : new n6g(1, null, true);
    }
}
