package s7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends l3 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f22812f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f22813g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f22814h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f22815i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f22816k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f22817l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f22818m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f22819n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f22820o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f22821p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final i f22822d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.j f22823e;

    public j(r3 r3Var) {
        super(r3Var);
        this.f22823e = new androidx.recyclerview.widget.j(((f1) this.f3328a).f22749k);
        ((f1) this.f3328a).getClass();
        this.f22822d = new i(this, ((f1) this.f3328a).f22740a);
    }

    public static final String M(List list) {
        return list.isEmpty() ? "" : androidx.appcompat.widget.c1.n(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void S(ContentValues contentValues, Object obj) {
        g6.v.e("value");
        g6.v.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final void A(String str, Long l6, long j6, com.google.android.gms.internal.measurement.a3 a3Var) {
        j();
        k();
        g6.v.h(a3Var);
        g6.v.e(str);
        f1 f1Var = (f1) this.f3328a;
        byte[] a7 = a3Var.a();
        n0 n0Var = f1Var.f22745f;
        n0 n0Var2 = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22910n.c(f1Var.j.a(str), Integer.valueOf(a7.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", Long.valueOf(j6));
        contentValues.put("main_event", a7);
        try {
            if (Y().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                f1.m(n0Var2);
                n0Var2.f22903f.b(n0.r(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e7) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(n0.r(str), e7, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:78:0x0281, B:80:0x029c), top: B:77:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(String str, Long l6, String str2, Bundle bundle) {
        String string;
        String s8;
        Bundle bundle2;
        n0 n0Var;
        long update;
        com.google.android.gms.internal.measurement.i3 i3Var;
        Cursor query;
        j jVar = this;
        String str3 = str;
        f1 f1Var = (f1) jVar.f3328a;
        g6.v.h(bundle);
        jVar.j();
        jVar.k();
        l4.e eVar = l6 != null ? new l4.e(jVar, str3, l6.longValue()) : new l4.e(jVar, str3);
        List<h> b10 = eVar.b();
        while (!b10.isEmpty()) {
            for (h hVar : b10) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    com.google.android.gms.internal.measurement.i3 i3Var2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = jVar.Y().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(hVar.f22784b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    i3Var = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        i3Var = null;
                    }
                    if (query.moveToFirst()) {
                        try {
                            i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.h3) r0.W(com.google.android.gms.internal.measurement.i3.U(), query.getBlob(0))).f();
                            try {
                                if (query.moveToNext()) {
                                    n0 n0Var2 = f1Var.f22745f;
                                    f1.m(n0Var2);
                                    n0Var2.f22906i.b(n0.r(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e10) {
                                e = e10;
                                cursor = query;
                                n0 n0Var3 = f1Var.f22745f;
                                f1.m(n0Var3);
                                n0Var3.f22903f.c(n0.r(str3), e, "Data loss. Error selecting raw event. appId");
                                if (cursor != null) {
                                    cursor.close();
                                }
                                i3Var2 = i3Var;
                                if (i3Var2 != null) {
                                }
                                r3 r3Var = jVar.f22859b;
                                r0 r0Var = r3Var.f22993g;
                                r3.U(r0Var);
                                com.google.android.gms.internal.measurement.a3 a3Var = hVar.f22786d;
                                Bundle bundle3 = new Bundle();
                                while (r6.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                s8 = a3Var.s();
                                if (string == null) {
                                }
                                v3 v3Var = f1Var.f22748i;
                                n0 n0Var4 = f1Var.f22745f;
                                f1.k(v3Var);
                                if (s8.equals("_cmp")) {
                                }
                                com.google.android.gms.internal.measurement.a3 a3Var2 = a3Var;
                                v3Var.u(bundle3, bundle2);
                                kh.l lVar = new kh.l((f1) jVar.f3328a, string, str3, a3Var2.s(), a3Var2.u(), a3Var2.w(), bundle3);
                                String str4 = (String) lVar.f19129d;
                                long j6 = hVar.f22783a;
                                long j10 = hVar.f22784b;
                                boolean z5 = hVar.f22785c;
                                jVar.j();
                                jVar.k();
                                g6.v.e(str4);
                                r0 r0Var2 = r3Var.f22993g;
                                r3.U(r0Var2);
                                byte[] a7 = r0Var2.L(lVar).a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(CommonUrlParts.APP_ID, str4);
                                contentValues.put("name", (String) lVar.f19130e);
                                contentValues.put("timestamp", Long.valueOf(lVar.f19127b));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j10));
                                contentValues.put("data", a7);
                                contentValues.put("realtime", Integer.valueOf(z5 ? 1 : 0));
                                update = Y().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j6)});
                                if (update != 1) {
                                }
                                jVar = this;
                                str3 = str;
                            }
                            i3Var2 = i3Var;
                        } catch (IOException e11) {
                            n0 n0Var5 = f1Var.f22745f;
                            f1.m(n0Var5);
                            n0Var5.f22903f.c(n0.r(str3), e11, "Data loss. Failed to merge raw event metadata. appId");
                        }
                        if (i3Var2 != null) {
                            Iterator it = i3Var2.U1().iterator();
                            while (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.r3) it.next()).r().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        n0 n0Var6 = f1Var.f22745f;
                        f1.m(n0Var6);
                        n0Var6.f22903f.b(n0.r(str3), "Raw event metadata record is missing. appId");
                    }
                    query.close();
                    if (i3Var2 != null) {
                    }
                }
                r3 r3Var2 = jVar.f22859b;
                r0 r0Var3 = r3Var2.f22993g;
                r3.U(r0Var3);
                com.google.android.gms.internal.measurement.a3 a3Var3 = hVar.f22786d;
                Bundle bundle32 = new Bundle();
                for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var3.p()) {
                    if (d3Var.x()) {
                        bundle32.putDouble(d3Var.q(), d3Var.y());
                    } else if (d3Var.v()) {
                        bundle32.putFloat(d3Var.q(), d3Var.w());
                    } else if (d3Var.t()) {
                        bundle32.putLong(d3Var.q(), d3Var.u());
                    } else if (d3Var.r()) {
                        bundle32.putString(d3Var.q(), d3Var.s());
                    } else if (d3Var.z().isEmpty()) {
                        n0 n0Var7 = ((f1) r0Var3.f3328a).f22745f;
                        f1.m(n0Var7);
                        n0Var7.f22903f.b(d3Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(d3Var.q(), r0.Y((m5) d3Var.z()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                s8 = a3Var3.s();
                if (string == null) {
                    string = "";
                }
                v3 v3Var2 = f1Var.f22748i;
                n0 n0Var42 = f1Var.f22745f;
                f1.k(v3Var2);
                if (s8.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.a3 a3Var4 = a3Var3;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        a3Var3 = a3Var4;
                    }
                }
                com.google.android.gms.internal.measurement.a3 a3Var22 = a3Var3;
                v3Var2.u(bundle32, bundle2);
                kh.l lVar2 = new kh.l((f1) jVar.f3328a, string, str3, a3Var22.s(), a3Var22.u(), a3Var22.w(), bundle32);
                String str42 = (String) lVar2.f19129d;
                long j62 = hVar.f22783a;
                long j102 = hVar.f22784b;
                boolean z52 = hVar.f22785c;
                jVar.j();
                jVar.k();
                g6.v.e(str42);
                r0 r0Var22 = r3Var2.f22993g;
                r3.U(r0Var22);
                byte[] a72 = r0Var22.L(lVar2).a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(CommonUrlParts.APP_ID, str42);
                contentValues2.put("name", (String) lVar2.f19130e);
                contentValues2.put("timestamp", Long.valueOf(lVar2.f19127b));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j102));
                contentValues2.put("data", a72);
                contentValues2.put("realtime", Integer.valueOf(z52 ? 1 : 0));
                try {
                    update = Y().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j62)});
                    if (update != 1) {
                        f1.m(n0Var42);
                        n0Var = n0Var42;
                        try {
                            n0Var.f22903f.c(n0.r(str42), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e12) {
                            e = e12;
                            f1.m(n0Var);
                            n0Var.f22903f.c(n0.r(str42), e, "Error updating raw event. appId");
                            jVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    n0Var = n0Var42;
                }
                jVar = this;
                str3 = str;
            }
            b10 = eVar.b();
            jVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1 C(String str) {
        Throwable th2;
        SQLiteException e7;
        f1 f1Var = (f1) this.f3328a;
        g6.v.h(str);
        j();
        k();
        ?? r5 = {str};
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        q1 q1Var = null;
        try {
            try {
                r5 = Y().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r5);
                try {
                    if (r5.moveToFirst()) {
                        q1Var = q1.c(r5.getInt(1), r5.getString(0));
                    } else {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        n0Var.f22910n.a("No data found");
                    }
                } catch (SQLiteException e9) {
                    e7 = e9;
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.b(e7, "Error querying database.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = r5;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e10) {
            e7 = e10;
            r5 = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
            }
            throw th2;
        }
        r5.close();
        return q1Var == null ? q1.f22964c : q1Var;
    }

    public final void D(String str, zzoh zzohVar) {
        j();
        k();
        g6.v.e(str);
        f1 f1Var = (f1) this.f3328a;
        q6.a aVar = f1Var.f22749k;
        n0 n0Var = f1Var.f22745f;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        w wVar = x.f23224w0;
        long longValue = currentTimeMillis - ((Long) wVar.a(null)).longValue();
        long j6 = zzohVar.f5802b;
        if (j6 < longValue || j6 > ((Long) wVar.a(null)).longValue() + currentTimeMillis) {
            f1.m(n0Var);
            n0Var.f22906i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", n0.r(str), Long.valueOf(currentTimeMillis), Long.valueOf(j6));
        }
        f1.m(n0Var);
        n0Var.f22910n.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.f5801a);
        contentValues.put(AdRevenueConstants.SOURCE_KEY, Integer.valueOf(zzohVar.f5803c));
        contentValues.put("timestamp_millis", Long.valueOf(j6));
        try {
            if (Y().insert("trigger_uris", null, contentValues) == -1) {
                f1.m(n0Var);
                n0Var.f22903f.b(n0.r(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e7) {
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(str), e7, "Error storing trigger URI. appId");
        }
    }

    public final void E(String str, q1 q1Var) {
        g6.v.h(str);
        g6.v.h(q1Var);
        j();
        k();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("consent_state", q1Var.g());
        contentValues.put("consent_source", Integer.valueOf(q1Var.f22966b));
        G(contentValues);
    }

    public final String F(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = Y().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e7) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void G(ContentValues contentValues) {
        f1 f1Var = (f1) this.f3328a;
        try {
            SQLiteDatabase Y = Y();
            if (contentValues.getAsString(CommonUrlParts.APP_ID) == null) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22905h.b(n0.r(CommonUrlParts.APP_ID), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (Y.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && Y.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.c(n0.r("consent_settings"), n0.r(CommonUrlParts.APP_ID), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e7) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22903f.d("Error storing into table. key", n0.r("consent_settings"), n0.r(CommonUrlParts.APP_ID), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n H(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str2);
        g6.v.e(str3);
        j();
        k();
        Cursor cursor2 = null;
        try {
            cursor = Y().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e7) {
                    e = e7;
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.d("Error querying events. appId", n0.r(str2), f1Var.j.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j6 = cursor.getLong(0);
        long j10 = cursor.getLong(1);
        long j11 = cursor.getLong(2);
        long j12 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        n nVar = new n(str2, str3, j6, j10, cursor.isNull(8) ? 0L : cursor.getLong(8), j11, j12, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(n0.r(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return nVar;
    }

    public final void I(String str, n nVar) {
        f1 f1Var = (f1) this.f3328a;
        g6.v.h(nVar);
        j();
        k();
        ContentValues contentValues = new ContentValues();
        String str2 = nVar.f22890a;
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("name", nVar.f22891b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f22892c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f22893d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f22895f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f22896g));
        contentValues.put("last_bundled_day", nVar.f22897h);
        contentValues.put("last_sampled_complex_event_id", nVar.f22898i);
        contentValues.put("last_sampling_rate", nVar.j);
        contentValues.put("current_session_count", Long.valueOf(nVar.f22894e));
        Boolean bool = nVar.f22899k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (Y().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22903f.b(n0.r(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.c(n0.r(str2), e7, "Error storing event aggregates. appId");
        }
    }

    public final void J(String str, String str2) {
        g6.v.e(str2);
        j();
        k();
        try {
            Y().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(str2), e7, "Error deleting snapshot. appId");
        }
    }

    public final s3 K(String str, long j6, byte[] bArr, String str2, String str3, int i5, int i10, long j10, long j11, long j12) {
        k2 k2Var;
        f1 f1Var = (f1) this.f3328a;
        if (TextUtils.isEmpty(str2)) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22909m.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) r0.W(com.google.android.gms.internal.measurement.g3.w(), bArr);
            k2[] values = k2.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    k2Var = k2.UNKNOWN;
                    break;
                }
                k2Var = values[i11];
                if (k2Var.f22858a == i5) {
                    break;
                }
                i11++;
            }
            if (k2Var != k2.GOOGLE_SIGNAL && k2Var != k2.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.g3) f3Var.f5041b).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) it.next()).i();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.f5041b).T0(i10);
                    arrayList.add((com.google.android.gms.internal.measurement.i3) h3Var.f());
                }
                f3Var.b();
                ((com.google.android.gms.internal.measurement.g3) f3Var.f5041b).B();
                f3Var.b();
                ((com.google.android.gms.internal.measurement.g3) f3Var.f5041b).A(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            return new s3(j6, (com.google.android.gms.internal.measurement.g3) f3Var.f(), str2, hashMap, k2Var, j10, j11, j12, i10);
        } catch (IOException e7) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22903f.c(str, e7, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String L() {
        ((f1) this.f3328a).f22749k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l6 = (Long) x.T.a(null);
        l6.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l6 + ")";
        long longValue = ((Long) x.S.a(null)).longValue();
        StringBuilder p10 = r4.k.p(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > ");
        p10.append(longValue);
        p10.append(")");
        String sb2 = p10.toString();
        StringBuilder sb3 = new StringBuilder(str.length() + 5 + sb2.length() + 1);
        r4.k.s(sb3, "(", str, " OR ", sb2);
        sb3.append(")");
        return sb3.toString();
    }

    public final void N(String str, q1 q1Var) {
        g6.v.h(str);
        j();
        k();
        E(str, C(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", q1Var.g());
        G(contentValues);
    }

    public final q1 O(String str) {
        g6.v.h(str);
        j();
        k();
        return q1.c(100, F("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final n P(String str, com.google.android.gms.internal.measurement.a3 a3Var, String str2) {
        n H = H("events", str, a3Var.s());
        if (H != null) {
            long j6 = H.f22894e + 1;
            long j10 = H.f22893d + 1;
            return new n(H.f22890a, H.f22891b, H.f22892c + 1, j10, j6, H.f22895f, H.f22896g, H.f22897h, H.f22898i, H.j, H.f22899k);
        }
        f1 f1Var = (f1) this.f3328a;
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22906i.c(n0.r(str), f1Var.j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new n(str, a3Var.s(), 1L, 1L, 1L, a3Var.u(), 0L, null, null, null, null);
    }

    public final boolean Q() {
        return ((f1) this.f3328a).f22740a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(String str, long j6, long j10, g3.d dVar) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase Y;
        ?? isEmpty;
        String[] strArr;
        String str4;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str5;
        long j11;
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        Cursor cursor2 = null;
        cursor2 = null;
        io.sentry.android.sqlite.c cVar = 0;
        try {
            try {
                Y = Y();
                isEmpty = TextUtils.isEmpty(str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e7) {
            e = e7;
            str2 = str;
        }
        try {
            if (isEmpty != 0) {
                String[] strArr5 = j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j6)} : new String[]{String.valueOf(j6)};
                str4 = j10 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                sb2.append(str4);
                sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = Y.rawQuery(sb2.toString(), strArr5);
                try {
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor == null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                str3 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor2 = cursor;
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.c(n0.r(str3), e, "Data loss. Error selecting raw event. appId");
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
            } else {
                try {
                    if (j10 != -1) {
                        String str6 = str;
                        strArr = new String[]{str6, String.valueOf(j10)};
                        isEmpty = str6;
                    } else {
                        String str7 = str;
                        strArr = new String[]{str7};
                        isEmpty = str7;
                    }
                    str4 = j10 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str4);
                    sb3.append(" order by rowid limit 1;");
                    cursor = Y.rawQuery(sb3.toString(), strArr);
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = isEmpty;
                }
                try {
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor2 = cursor;
                    str2 = isEmpty;
                    str3 = str2;
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.c(n0.r(str3), e, "Data loss. Error selecting raw event. appId");
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = isEmpty;
                } else if (cursor == null) {
                }
            }
            cursor = Y.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.h3) r0.W(com.google.android.gms.internal.measurement.i3.U(), cursor.getBlob(0))).f();
                    if (cursor.moveToNext()) {
                        n0 n0Var3 = f1Var.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22906i.b(n0.r(str3), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    dVar.f9735b = i3Var;
                    if (f1Var.f22743d.t(null, x.f23203l1)) {
                        long U = U("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string}, -1L);
                        if (j10 != -1) {
                            j11 = j10;
                        } else if (U != -1) {
                            j11 = -1;
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            str5 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        if (j11 != -1 && U != -1) {
                            U = Math.min(j11, U);
                        } else if (j11 != -1) {
                            U = j11;
                        }
                        strArr3 = new String[]{str3, string, String.valueOf(U)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else if (j10 != -1) {
                        strArr3 = new String[]{str3, string, String.valueOf(j10)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else {
                        strArr2 = new String[]{str3, string};
                        strArr4 = strArr2;
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    cursor2 = Y.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str5, strArr4, null, null, "rowid", null);
                    try {
                        if (cursor2.moveToFirst()) {
                            do {
                                long j12 = cursor2.getLong(0);
                                try {
                                    com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) r0.W(com.google.android.gms.internal.measurement.a3.z(), cursor2.getBlob(3));
                                    String string2 = cursor2.getString(1);
                                    z2Var.b();
                                    ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).F(string2);
                                    long j13 = cursor2.getLong(2);
                                    z2Var.b();
                                    ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).G(j13);
                                    if (!dVar.c(j12, (com.google.android.gms.internal.measurement.a3) z2Var.f())) {
                                        break;
                                    }
                                } catch (IOException e13) {
                                    n0 n0Var4 = f1Var.f22745f;
                                    f1.m(n0Var4);
                                    n0Var4.f22903f.c(n0.r(str3), e13, "Data loss. Failed to merge raw event. appId");
                                }
                            } while (cursor2.moveToNext());
                        } else {
                            n0 n0Var5 = f1Var.f22745f;
                            f1.m(n0Var5);
                            n0Var5.f22906i.b(n0.r(str3), "Raw event data disappeared while in transaction. appId");
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        n0 n0Var22 = f1Var.f22745f;
                        f1.m(n0Var22);
                        n0Var22.f22903f.c(n0.r(str3), e, "Data loss. Error selecting raw event. appId");
                        cursor = cursor2;
                        if (cursor == null) {
                        }
                    }
                    cursor = cursor2;
                } catch (IOException e15) {
                    n0 n0Var6 = f1Var.f22745f;
                    f1.m(n0Var6);
                    n0Var6.f22903f.c(n0.r(str3), e15, "Data loss. Failed to merge raw event metadata. appId");
                }
            } else {
                n0 n0Var7 = f1Var.f22745f;
                f1.m(n0Var7);
                n0Var7.f22903f.b(n0.r(str3), "Raw event metadata record is missing. appId");
            }
            if (cursor == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = "select metadata_fingerprint from raw_events where app_id = ?";
            if (cVar != 0) {
                cVar.close();
            }
            throw th;
        }
    }

    public final long T(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = Y().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j6 = rawQuery.getLong(0);
                rawQuery.close();
                return j6;
            } catch (SQLiteException e7) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long U(String str, String[] strArr, long j6) {
        Cursor cursor = null;
        try {
            try {
                cursor = Y().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j6 = cursor.getLong(0);
                }
                cursor.close();
                return j6;
            } catch (SQLiteException e7) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void V() {
        k();
        Y().beginTransaction();
    }

    public final void W() {
        k();
        Y().setTransactionSuccessful();
    }

    public final void X() {
        k();
        Y().endTransaction();
    }

    public final SQLiteDatabase Y() {
        j();
        try {
            return this.f22822d.getWritableDatabase();
        } catch (SQLiteException e7) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22906i.b(e7, "Error opening database");
            throw e7;
        }
    }

    public final void Z(String str) {
        n H;
        J("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = Y().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (H = H("events", str, string)) != null) {
                            I("events_snapshot", H);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e7) {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(n0.r(str), e7, "Error creating snapshot. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        I("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(String str) {
        boolean z5;
        n H;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        n H2 = H("events", str, "_f");
        n H3 = H("events", str, "_v");
        J("events", str);
        Cursor cursor = null;
        boolean z7 = false;
        try {
            cursor = Y().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e7) {
            e = e7;
            z5 = false;
        } catch (Throwable th2) {
            th = th2;
            z5 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (H2 == null) {
            }
            I("events", H2);
            J("events_snapshot", str);
        }
        boolean z10 = false;
        z5 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z10 = true;
                    } else if ("_v".equals(string)) {
                        z5 = true;
                    }
                }
                if (string != null && (H = H("events_snapshot", str, string)) != null) {
                    I("events", H);
                }
            } catch (SQLiteException e9) {
                e = e9;
                z7 = z10;
                try {
                    n0 n0Var = ((f1) this.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.c(n0.r(str), e, "Error querying snapshot. appId");
                    z10 = z7;
                    if (cursor != null) {
                    }
                    if (!z10) {
                    }
                    if (!z5) {
                    }
                    J("events_snapshot", str);
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z7 && H2 != null) {
                        I("events", H2);
                    } else if (!z5 && H3 != null) {
                        I("events", H3);
                    }
                    J("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z7 = z10;
                if (cursor != null) {
                }
                if (z7) {
                }
                if (!z5) {
                    I("events", H3);
                }
                J("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z10 || H2 == null) {
            if (!z5) {
            }
            J("events_snapshot", str);
        }
        I("events", H2);
        J("events_snapshot", str);
    }

    public final void b0(String str, String str2) {
        g6.v.e(str);
        g6.v.e(str2);
        j();
        k();
        try {
            Y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            f1 f1Var = (f1) this.f3328a;
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.d("Error deleting user property. appId", n0.r(str), f1Var.j.c(str2), e7);
        }
    }

    public final boolean c0(t3 t3Var) {
        f1 f1Var = (f1) this.f3328a;
        String str = t3Var.f23095b;
        j();
        k();
        String str2 = t3Var.f23094a;
        String str3 = t3Var.f23096c;
        if (d0(str2, str3) == null) {
            if (v3.j0(str3)) {
                if (T("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(f1Var.f22743d.r(str2, x.W), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long T = T("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                f1Var.getClass();
                if (T >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(t3Var.f23097d));
        S(contentValues, t3Var.f23098e);
        try {
            if (Y().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(n0.r(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.c(n0.r(str2), e7, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t3 d0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        g6.v.e(str2);
        j();
        k();
        Cursor cursor2 = null;
        try {
            cursor = Y().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j6 = cursor.getLong(0);
                        Object w10 = w(cursor, 1);
                        if (w10 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                t3 t3Var = new t3(str3, cursor.getString(2), str4, j6, w10);
                                if (cursor.moveToNext()) {
                                    n0 n0Var = f1Var.f22745f;
                                    f1.m(n0Var);
                                    n0Var.f22903f.b(n0.r(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return t3Var;
                            } catch (SQLiteException e7) {
                                e = e7;
                                sQLiteException = e;
                                n0 n0Var2 = f1Var.f22745f;
                                f1.m(n0Var2);
                                n0Var2.f22903f.d("Error querying user property. appId", n0.r(str3), f1Var.j.c(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th2;
                    }
                    cursor2.close();
                    throw th2;
                }
            } catch (SQLiteException e9) {
                e = e9;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e10) {
            str3 = str;
            str4 = str2;
            sQLiteException = e10;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e0(String str) {
        String str2;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        j();
        k();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                f1Var.getClass();
                cursor = Y().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j6 = cursor.getLong(2);
                            Object w10 = w(cursor, 3);
                            if (w10 == null) {
                                n0 n0Var = f1Var.f22745f;
                                f1.m(n0Var);
                                n0Var.f22903f.b(n0.r(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new t3(str2, str3, string, j6, w10));
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    n0 n0Var2 = f1Var.f22745f;
                                    f1.m(n0Var2);
                                    n0Var2.f22903f.c(n0.r(str2), e, "Error querying user properties. appId");
                                    arrayList = Collections.EMPTY_LIST;
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e10) {
            e = e10;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        s7.f1.m(r13);
        r13.f22903f.b(java.lang.Integer.valueOf(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List f0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        j();
        k();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb4 = sb2.toString();
            f1Var.getClass();
            n0 n0Var = f1Var.f22745f;
            cursor2 = Y().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb4, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string = cursor2.getString(0);
                                long j6 = cursor2.getLong(1);
                                Object w10 = w(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (w10 == null) {
                                    try {
                                        f1.m(n0Var);
                                        n0Var.f22903f.d("(2)Read invalid user property value, ignoring it", n0.r(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            n0 n0Var2 = f1Var.f22745f;
                                            f1.m(n0Var2);
                                            n0Var2.f22903f.d("(2)Error querying user properties", n0.r(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new t3(str, str5, string, j6, w10));
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        cursor = cursor2;
                                        str4 = str5;
                                        n0 n0Var22 = f1Var.f22745f;
                                        f1.m(n0Var22);
                                        n0Var22.f22903f.d("(2)Error querying user properties", n0.r(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e10) {
                                e = e10;
                                cursor = cursor2;
                                n0 n0Var222 = f1Var.f22745f;
                                f1.m(n0Var222);
                                n0Var222.f22903f.d("(2)Error querying user properties", n0.r(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str4 = str2;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean g0(zzah zzahVar) {
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        String str = zzahVar.f5785a;
        g6.v.h(str);
        if (d0(str, zzahVar.f5787c.f5814b) == null) {
            long T = T("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            f1Var.getClass();
            if (T >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("origin", zzahVar.f5786b);
        contentValues.put("name", zzahVar.f5787c.f5814b);
        Object c2 = zzahVar.f5787c.c();
        g6.v.h(c2);
        S(contentValues, c2);
        contentValues.put("active", Boolean.valueOf(zzahVar.f5789e));
        contentValues.put("trigger_event_name", zzahVar.f5790f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.f5792h));
        zzbg zzbgVar = zzahVar.f5791g;
        v3 v3Var = f1Var.f22748i;
        n0 n0Var = f1Var.f22745f;
        f1.k(v3Var);
        contentValues.put("timed_out_event", v3.P(zzbgVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f5788d));
        f1.k(v3Var);
        contentValues.put("triggered_event", v3.P(zzahVar.f5793i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f5787c.f5815c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.j));
        contentValues.put("expired_event", v3.P(zzahVar.f5794k));
        try {
            if (Y().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            f1.m(n0Var);
            n0Var.f22903f.b(n0.r(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e7) {
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(str), e7, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah h0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        g6.v.e(str2);
        j();
        k();
        Cursor cursor3 = null;
        try {
            try {
                cursor = Y().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e7) {
                    e = e7;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            str3 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string = cursor.getString(0);
        if (string == null) {
            string = "";
        }
        String str4 = string;
        Object w10 = w(cursor, 1);
        boolean z5 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j6 = cursor.getLong(4);
        r0 r0Var = this.f22859b.f22993g;
        r3.U(r0Var);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
        zzbg zzbgVar = (zzbg) r0Var.O(blob, creator);
        long j10 = cursor.getLong(6);
        r3.U(r0Var);
        zzbg zzbgVar2 = (zzbg) r0Var.O(cursor.getBlob(7), creator);
        long j11 = cursor.getLong(8);
        long j12 = cursor.getLong(9);
        r3.U(r0Var);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpl(j11, w10, str3, str4), j10, z5, string2, zzbgVar, j6, zzbgVar2, j12, (zzbg) r0Var.O(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(n0.r(str), f1Var.j.c(str3), "Got multiple records for conditional property, expected one");
            }
            cursor.close();
            return zzahVar;
        } catch (SQLiteException e10) {
            e = e10;
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.d("Error querying conditional property", n0.r(str), f1Var.j.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void i0(String str, String str2) {
        g6.v.e(str);
        g6.v.e(str2);
        j();
        k();
        try {
            Y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            f1 f1Var = (f1) this.f3328a;
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.d("Error deleting conditional property", n0.r(str), f1Var.j.c(str2), e7);
        }
    }

    public final List j0(String str, String str2, String str3) {
        g6.v.e(str);
        j();
        k();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return k0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f22745f;
        s7.f1.m(r3);
        r3.f22903f.b(java.lang.Integer.valueOf(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k0(String str, String[] strArr) {
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase Y = Y();
                String[] strArr2 = {CommonUrlParts.APP_ID, "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                f1Var.getClass();
                cursor = Y.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object w10 = w(cursor, 3);
                        boolean z5 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j6 = cursor.getLong(6);
                        r0 r0Var = this.f22859b.f22993g;
                        r3.U(r0Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) r0Var.O(blob, creator);
                        long j10 = cursor.getLong(8);
                        r3.U(r0Var);
                        zzbg zzbgVar2 = (zzbg) r0Var.O(cursor.getBlob(9), creator);
                        long j11 = cursor.getLong(10);
                        long j12 = cursor.getLong(11);
                        r3.U(r0Var);
                        arrayList.add(new zzah(string, string2, new zzpl(j11, w10, string3, string2), j10, z5, string4, zzbgVar, j6, zzbgVar2, j12, (zzbg) r0Var.O(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e7) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22903f.b(e7, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 l0(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        j();
        k();
        Cursor cursor2 = null;
        try {
            cursor = Y().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e7) {
                    e = e7;
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.c(n0.r(str), e, "Error querying app. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        r3 r3Var = this.f22859b;
        s0 s0Var = new s0(r3Var.f22997l, str);
        f1 f1Var2 = s0Var.f23026a;
        q1 d10 = r3Var.d(str);
        p1 p1Var = p1.ANALYTICS_STORAGE;
        if (d10.i(p1Var)) {
            s0Var.F(cursor.getString(0));
        }
        boolean z5 = true;
        s0Var.H(cursor.getString(1));
        if (r3Var.d(str).i(p1.AD_STORAGE)) {
            s0Var.I(cursor.getString(2));
        }
        s0Var.e(cursor.getLong(3));
        s0Var.L(cursor.getLong(4));
        s0Var.M(cursor.getLong(5));
        s0Var.O(cursor.getString(6));
        s0Var.R(cursor.getString(7));
        s0Var.S(cursor.getLong(8));
        s0Var.a(cursor.getLong(9));
        s0Var.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        s0Var.i(cursor.getLong(11));
        s0Var.j(cursor.getLong(12));
        s0Var.k(cursor.getLong(13));
        s0Var.l(cursor.getLong(14));
        s0Var.f(cursor.getLong(15));
        s0Var.g(cursor.getLong(16));
        s0Var.Q(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        s0Var.K(cursor.getString(18));
        s0Var.n(cursor.getLong(19));
        s0Var.m(cursor.getLong(20));
        s0Var.v(cursor.getString(21));
        boolean z7 = cursor.isNull(23) || cursor.getInt(23) != 0;
        d1 d1Var = f1Var2.f22746g;
        f1.m(d1Var);
        d1Var.j();
        s0Var.Q |= s0Var.f23040p != z7;
        s0Var.f23040p = z7;
        s0Var.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            s0Var.x(Arrays.asList(cursor.getString(26).split(StringUtils.COMMA, -1)));
        }
        if (r3Var.d(str).i(p1Var)) {
            String string2 = cursor.getString(28);
            d1 d1Var2 = f1Var2.f22746g;
            f1.m(d1Var2);
            d1Var2.j();
            s0Var.Q |= !Objects.equals(s0Var.f23043t, string2);
            s0Var.f23043t = string2;
        }
        boolean z10 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        d1 d1Var3 = f1Var2.f22746g;
        f1.m(d1Var3);
        d1Var3.j();
        s0Var.Q |= s0Var.f23044u != z10;
        s0Var.f23044u = z10;
        s0Var.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        d1 d1Var4 = f1Var2.f22746g;
        f1.m(d1Var4);
        d1Var4.j();
        s0Var.Q |= s0Var.C != string3;
        s0Var.C = string3;
        s0Var.z(cursor.getLong(30));
        s0Var.A(cursor.getLong(31));
        o8.a();
        if (f1Var.f22743d.t(str, x.Q0)) {
            int i5 = cursor.getInt(32);
            d1 d1Var5 = f1Var2.f22746g;
            f1.m(d1Var5);
            d1Var5.j();
            s0Var.Q |= s0Var.f23047x != i5;
            s0Var.f23047x = i5;
            s0Var.B(cursor.getLong(35));
        }
        boolean z11 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        d1 d1Var6 = f1Var2.f22746g;
        f1.m(d1Var6);
        d1Var6.j();
        s0Var.Q |= s0Var.f23048y != z11;
        s0Var.f23048y = z11;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        d1 d1Var7 = f1Var2.f22746g;
        f1.m(d1Var7);
        d1Var7.j();
        s0Var.Q |= !Objects.equals(s0Var.q, valueOf);
        s0Var.q = valueOf;
        s0Var.p(cursor.getInt(37));
        s0Var.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            g6.v.h(string);
        }
        d1 d1Var8 = f1Var2.f22746g;
        f1.m(d1Var8);
        d1Var8.j();
        s0Var.Q |= s0Var.G != string;
        s0Var.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            d1 d1Var9 = f1Var2.f22746g;
            f1.m(d1Var9);
            d1Var9.j();
            s0Var.Q |= !Objects.equals(s0Var.f23049z, valueOf2);
            s0Var.f23049z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            d1 d1Var10 = f1Var2.f22746g;
            f1.m(d1Var10);
            d1Var10.j();
            s0Var.Q |= !Objects.equals(s0Var.A, valueOf3);
            s0Var.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        d1 d1Var11 = f1Var2.f22746g;
        f1.m(d1Var11);
        d1Var11.j();
        s0Var.Q |= s0Var.H != blob;
        s0Var.H = blob;
        if (!cursor.isNull(44)) {
            int i10 = cursor.getInt(44);
            d1 d1Var12 = f1Var2.f22746g;
            f1.m(d1Var12);
            d1Var12.j();
            boolean z12 = s0Var.Q;
            if (s0Var.I == i10) {
                z5 = false;
            }
            s0Var.Q = z5 | z12;
            s0Var.I = i10;
        }
        d1 d1Var13 = f1Var2.f22746g;
        f1.m(d1Var13);
        d1Var13.j();
        s0Var.Q = false;
        if (cursor.moveToNext()) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(n0.r(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return s0Var;
    }

    public final void m0(s0 s0Var, boolean z5) {
        f1 f1Var = (f1) this.f3328a;
        f1 f1Var2 = s0Var.f23026a;
        j();
        k();
        String D = s0Var.D();
        g6.v.h(D);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, D);
        p1 p1Var = p1.ANALYTICS_STORAGE;
        r3 r3Var = this.f22859b;
        if (z5) {
            contentValues.put("app_instance_id", (String) null);
        } else if (r3Var.d(D).i(p1Var)) {
            contentValues.put("app_instance_id", s0Var.E());
        }
        contentValues.put("gmp_app_id", s0Var.G());
        if (r3Var.d(D).i(p1.AD_STORAGE)) {
            d1 d1Var = f1Var2.f22746g;
            f1.m(d1Var);
            d1Var.j();
            contentValues.put("resettable_device_id_hash", s0Var.f23030e);
        }
        d1 d1Var2 = f1Var2.f22746g;
        f1.m(d1Var2);
        d1Var2.j();
        contentValues.put("last_bundle_index", Long.valueOf(s0Var.f23032g));
        d1 d1Var3 = f1Var2.f22746g;
        f1.m(d1Var3);
        d1Var3.j();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(s0Var.f23033h));
        d1 d1Var4 = f1Var2.f22746g;
        f1.m(d1Var4);
        d1Var4.j();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(s0Var.f23034i));
        contentValues.put("app_version", s0Var.N());
        d1 d1Var5 = f1Var2.f22746g;
        f1.m(d1Var5);
        d1Var5.j();
        contentValues.put("app_store", s0Var.f23036l);
        d1 d1Var6 = f1Var2.f22746g;
        f1.m(d1Var6);
        d1Var6.j();
        contentValues.put("gmp_version", Long.valueOf(s0Var.f23037m));
        d1 d1Var7 = f1Var2.f22746g;
        f1.m(d1Var7);
        d1Var7.j();
        contentValues.put("dev_cert_hash", Long.valueOf(s0Var.f23038n));
        d1 d1Var8 = f1Var2.f22746g;
        f1.m(d1Var8);
        d1Var8.j();
        contentValues.put("measurement_enabled", Boolean.valueOf(s0Var.f23039o));
        d1 d1Var9 = f1Var2.f22746g;
        d1 d1Var10 = f1Var2.f22746g;
        f1.m(d1Var9);
        d1Var9.j();
        contentValues.put("day", Long.valueOf(s0Var.J));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_public_events_count", Long.valueOf(s0Var.K));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_events_count", Long.valueOf(s0Var.L));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_conversions_count", Long.valueOf(s0Var.M));
        d1 d1Var11 = f1Var2.f22746g;
        f1.m(d1Var11);
        d1Var11.j();
        contentValues.put("config_fetched_time", Long.valueOf(s0Var.R));
        d1 d1Var12 = f1Var2.f22746g;
        f1.m(d1Var12);
        d1Var12.j();
        contentValues.put("failed_config_fetch_time", Long.valueOf(s0Var.S));
        contentValues.put("app_version_int", Long.valueOf(s0Var.P()));
        contentValues.put("firebase_instance_id", s0Var.J());
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_error_events_count", Long.valueOf(s0Var.N));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_realtime_events_count", Long.valueOf(s0Var.O));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("health_monitor_sample", s0Var.P);
        contentValues.put("android_id", (Long) 0L);
        d1 d1Var13 = f1Var2.f22746g;
        f1.m(d1Var13);
        d1Var13.j();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(s0Var.f23040p));
        contentValues.put("dynamite_version", Long.valueOf(s0Var.b()));
        if (r3Var.d(D).i(p1Var)) {
            d1 d1Var14 = f1Var2.f22746g;
            f1.m(d1Var14);
            d1Var14.j();
            contentValues.put("session_stitching_token", s0Var.f23043t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(s0Var.y()));
        d1 d1Var15 = f1Var2.f22746g;
        f1.m(d1Var15);
        d1Var15.j();
        contentValues.put("target_os_version", Long.valueOf(s0Var.f23045v));
        d1 d1Var16 = f1Var2.f22746g;
        f1.m(d1Var16);
        d1Var16.j();
        contentValues.put("session_stitching_token_hash", Long.valueOf(s0Var.f23046w));
        o8.a();
        e eVar = f1Var.f22743d;
        n0 n0Var = f1Var.f22745f;
        if (eVar.t(D, x.Q0)) {
            d1 d1Var17 = f1Var2.f22746g;
            f1.m(d1Var17);
            d1Var17.j();
            contentValues.put("ad_services_version", Integer.valueOf(s0Var.f23047x));
            d1 d1Var18 = f1Var2.f22746g;
            f1.m(d1Var18);
            d1Var18.j();
            contentValues.put("attribution_eligibility_status", Long.valueOf(s0Var.B));
        }
        d1 d1Var19 = f1Var2.f22746g;
        f1.m(d1Var19);
        d1Var19.j();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(s0Var.f23048y));
        contentValues.put("npa_metadata_value", s0Var.w());
        d1 d1Var20 = f1Var2.f22746g;
        f1.m(d1Var20);
        d1Var20.j();
        contentValues.put("bundle_delivery_index", Long.valueOf(s0Var.F));
        contentValues.put("sgtm_preview_key", s0Var.C());
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("dma_consent_state", Integer.valueOf(s0Var.D));
        f1.m(d1Var10);
        d1Var10.j();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(s0Var.E));
        contentValues.put("serialized_npa_metadata", s0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(s0Var.t()));
        d1 d1Var21 = f1Var2.f22746g;
        f1.m(d1Var21);
        d1Var21.j();
        ArrayList arrayList = s0Var.f23042s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                f1.m(n0Var);
                n0Var.f22906i.b(D, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, arrayList));
            }
        }
        if (f1Var.f22743d.t(null, x.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        d1 d1Var22 = f1Var2.f22746g;
        f1.m(d1Var22);
        d1Var22.j();
        contentValues.put("unmatched_pfo", s0Var.f23049z);
        d1 d1Var23 = f1Var2.f22746g;
        f1.m(d1Var23);
        d1Var23.j();
        contentValues.put("unmatched_uwa", s0Var.A);
        d1 d1Var24 = f1Var2.f22746g;
        f1.m(d1Var24);
        d1Var24.j();
        contentValues.put("ad_campaign_info", s0Var.H);
        try {
            SQLiteDatabase Y = Y();
            if (Y.update("apps", contentValues, "app_id = ?", new String[]{D}) == 0 && Y.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                f1.m(n0Var);
                n0Var.f22903f.b(n0.r(D), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e7) {
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(D), e7, "Error storing app. appId");
        }
    }

    public final long n(String str, com.google.android.gms.internal.measurement.g3 g3Var, String str2, Map map, k2 k2Var, Long l6) {
        int delete;
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        g6.v.h(g3Var);
        g6.v.e(str);
        j();
        k();
        if (Q()) {
            r3 r3Var = this.f22859b;
            long a7 = r3Var.f22995i.f22645f.a();
            q6.a aVar = f1Var.f22749k;
            n0 n0Var = f1Var.f22745f;
            aVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a7) > ((Long) x.N.a(null)).longValue()) {
                r3Var.f22995i.f22645f.b(elapsedRealtime);
                j();
                k();
                if (Q() && (delete = Y().delete("upload_queue", L(), new String[0])) > 0) {
                    f1.m(n0Var);
                    n0Var.f22910n.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                g6.v.e(str);
                j();
                k();
                try {
                    int r5 = f1Var.f22743d.r(str, x.A);
                    if (r5 > 0) {
                        Y().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(r5)});
                    }
                } catch (SQLiteException e7) {
                    f1.m(n0Var);
                    n0Var.f22903f.c(n0.r(str), e7, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] a10 = g3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("measurement_batch", a10);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(k2Var.f22858a));
        q6.a aVar2 = f1Var.f22749k;
        n0 n0Var2 = f1Var.f22745f;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l6 != null) {
            contentValues.put("associated_row_id", l6);
        }
        try {
            long insert = Y().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            f1.m(n0Var2);
            n0Var2.f22903f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e9) {
            f1.m(n0Var2);
            n0Var2.f22903f.c(str, e9, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final g n0(long j6, String str, boolean z5, boolean z7, boolean z10, boolean z11) {
        return o0(j6, str, 1L, false, false, z5, false, z7, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o(String str, zzoo zzooVar, int i5) {
        List list;
        g6.v.e(str);
        j();
        k();
        Cursor cursor = null;
        try {
            SQLiteDatabase Y = Y();
            String[] strArr = {"rowId", CommonUrlParts.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String M = M(zzooVar.f5811a);
            String L = L();
            StringBuilder sb2 = new StringBuilder(M.length() + 17 + L.length());
            sb2.append("app_id=?");
            sb2.append(M);
            sb2.append(" AND NOT ");
            sb2.append(L);
            cursor = Y.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i5 > 0 ? String.valueOf(i5) : null);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                s3 K = K(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (K != null) {
                    arrayList.add(K);
                }
            }
            list = arrayList;
        } catch (SQLiteException e7) {
            try {
                n0 n0Var = ((f1) this.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.c(str, e7, "Error to querying MeasurementBatch from upload_queue. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final g o0(long j6, String str, long j10, boolean z5, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        j();
        k();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase Y = Y();
                cursor = Y.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j6) {
                        gVar.f22770b = cursor.getLong(1);
                        gVar.f22769a = cursor.getLong(2);
                        gVar.f22771c = cursor.getLong(3);
                        gVar.f22772d = cursor.getLong(4);
                        gVar.f22773e = cursor.getLong(5);
                        gVar.f22774f = cursor.getLong(6);
                        gVar.f22775g = cursor.getLong(7);
                    }
                    if (z5) {
                        gVar.f22770b += j10;
                    }
                    if (z7) {
                        gVar.f22769a += j10;
                    }
                    if (z10) {
                        gVar.f22771c += j10;
                    }
                    if (z11) {
                        gVar.f22772d += j10;
                    }
                    if (z12) {
                        gVar.f22773e += j10;
                    }
                    if (z13) {
                        gVar.f22774f += j10;
                    }
                    if (z14) {
                        gVar.f22775g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j6));
                    contentValues.put("daily_public_events_count", Long.valueOf(gVar.f22769a));
                    contentValues.put("daily_events_count", Long.valueOf(gVar.f22770b));
                    contentValues.put("daily_conversions_count", Long.valueOf(gVar.f22771c));
                    contentValues.put("daily_error_events_count", Long.valueOf(gVar.f22772d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f22773e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(gVar.f22774f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(gVar.f22775g));
                    Y.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22906i.b(n0.r(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e7) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.c(n0.r(str), e7, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean p(String str) {
        k2[] k2VarArr = {k2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k2VarArr[0].f22858a));
        String M = M(arrayList);
        String L = L();
        return T(d9.e.n(new StringBuilder((M.length() + 61) + L.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", M, " AND NOT ", L), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:27:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kh.g p0(String str) {
        Throwable th2;
        Cursor cursor;
        Cursor cursor2;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        j();
        k();
        Cursor cursor3 = null;
        try {
            try {
                cursor = Y().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            n0Var.f22903f.b(n0.r(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            kh.g gVar = new kh.g(blob, string, string2, 2);
                            cursor.close();
                            return gVar;
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.c(n0.r(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th2;
                }
                cursor3.close();
                throw th2;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor3 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void q(Long l6) {
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        try {
            if (Y().delete("upload_queue", "rowid=?", new String[]{l6.toString()}) != 1) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22906i.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(e7, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e7;
        }
    }

    public final void q0(com.google.android.gms.internal.measurement.i3 i3Var, boolean z5) {
        j();
        k();
        g6.v.e(i3Var.p());
        if (!i3Var.b2()) {
            throw new IllegalStateException();
        }
        t();
        f1 f1Var = (f1) this.f3328a;
        q6.a aVar = f1Var.f22749k;
        n0 n0Var = f1Var.f22745f;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = i3Var.c2();
        w wVar = x.S;
        if (c2 < currentTimeMillis - ((Long) wVar.a(null)).longValue() || i3Var.c2() > ((Long) wVar.a(null)).longValue() + currentTimeMillis) {
            f1.m(n0Var);
            n0Var.f22906i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", n0.r(i3Var.p()), Long.valueOf(currentTimeMillis), Long.valueOf(i3Var.c2()));
        }
        byte[] a7 = i3Var.a();
        try {
            r0 r0Var = this.f22859b.f22993g;
            r3.U(r0Var);
            byte[] V = r0Var.V(a7);
            f1.m(n0Var);
            n0Var.f22910n.b(Integer.valueOf(V.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(CommonUrlParts.APP_ID, i3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(i3Var.c2()));
            contentValues.put("data", V);
            contentValues.put("has_realtime", Integer.valueOf(z5 ? 1 : 0));
            if (i3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(i3Var.q0()));
            }
            try {
                if (Y().insert("queue", null, contentValues) == -1) {
                    f1.m(n0Var);
                    n0Var.f22903f.b(n0.r(i3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e7) {
                f1.m(n0Var);
                n0Var.f22903f.c(n0.r(i3Var.p()), e7, "Error storing bundle. appId");
            }
        } catch (IOException e9) {
            f1.m(n0Var);
            n0Var.f22903f.c(n0.r(i3Var.p()), e9, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String r() {
        SQLiteException e7;
        Cursor cursor;
        SQLiteDatabase Y = Y();
        ?? r12 = 0;
        try {
            try {
                cursor = Y.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e9) {
                    e7 = e9;
                    n0 n0Var = ((f1) this.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.b(e7, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                r12 = Y;
                th = th2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e7 = e10;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void s(long j6) {
        j();
        k();
        try {
            if (Y().delete("queue", "rowid=?", new String[]{String.valueOf(j6)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e7) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(e7, "Failed to delete a bundle in a queue table");
            throw e7;
        }
    }

    public final void t() {
        j();
        k();
        if (Q()) {
            r3 r3Var = this.f22859b;
            long a7 = r3Var.f22995i.f22644e.a();
            f1 f1Var = (f1) this.f3328a;
            f1Var.f22749k.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a7) > ((Long) x.N.a(null)).longValue()) {
                r3Var.f22995i.f22644e.b(elapsedRealtime);
                j();
                k();
                if (Q()) {
                    SQLiteDatabase Y = Y();
                    f1Var.f22749k.getClass();
                    int delete = Y.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) x.S.a(null)).longValue())});
                    if (delete > 0) {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        n0Var.f22910n.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void u(ArrayList arrayList) {
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        g6.v.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Q()) {
            String join = TextUtils.join(StringUtils.COMMA, arrayList);
            String m6 = d9.e.m(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (T(d9.e.m(new StringBuilder(m6.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", m6, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22906i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase Y = Y();
                StringBuilder sb2 = new StringBuilder(m6.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(m6);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                Y.execSQL(sb2.toString());
            } catch (SQLiteException e7) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.b(e7, "Error incrementing retry count. error");
            }
        }
    }

    public final void v(Long l6) {
        f1 f1Var = (f1) this.f3328a;
        j();
        k();
        if (Q()) {
            StringBuilder sb2 = new StringBuilder(l6.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l6);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (T(sb2.toString(), null) > 0) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22906i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase Y = Y();
                f1Var.f22749k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(currentTimeMillis);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l6.toString().length() + 29);
                sb5.append("UPDATE upload_queue");
                sb5.append(sb4);
                sb5.append(" WHERE rowid = ");
                sb5.append(l6);
                sb5.append(" AND retry_count < 2147483647");
                Y.execSQL(sb5.toString());
            } catch (SQLiteException e7) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.b(e7, "Error incrementing retry count. error");
            }
        }
    }

    public final Object w(Cursor cursor, int i5) {
        f1 f1Var = (f1) this.f3328a;
        int type = cursor.getType(i5);
        if (type == 0) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i5));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i5));
        }
        if (type == 3) {
            return cursor.getString(i5);
        }
        if (type != 4) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        n0 n0Var3 = f1Var.f22745f;
        f1.m(n0Var3);
        n0Var3.f22903f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.f22745f;
        s7.f1.m(r0);
        r0.f22903f.d("Error inserting column. appId", s7.n0.r(r14), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x(String str) {
        long j6;
        long U;
        f1 f1Var = (f1) this.f3328a;
        g6.v.e(str);
        g6.v.e("first_open_count");
        j();
        k();
        SQLiteDatabase Y = Y();
        Y.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j6 = -1;
                U = U(sb2.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e7) {
                e = e7;
            }
            if (U == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(CommonUrlParts.APP_ID, str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (Y.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.c(n0.r(str), "first_open_count", "Failed to insert column (got -1). appId");
                    return j6;
                }
                U = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(CommonUrlParts.APP_ID, str);
            contentValues2.put("first_open_count", Long.valueOf(1 + U));
            if (Y.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.c(n0.r(str), "first_open_count", "Failed to update column (got 0). appId");
            } else {
                Y.setTransactionSuccessful();
                j6 = U;
            }
            return j6;
        } finally {
            Y.endTransaction();
        }
    }

    public final boolean y(String str, String str2) {
        return T("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long z(String str) {
        g6.v.e(str);
        return U("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @Override // s7.l3
    public final void m() {
    }
}
