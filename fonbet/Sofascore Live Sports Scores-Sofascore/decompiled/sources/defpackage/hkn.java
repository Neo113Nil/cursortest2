package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzbc;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hkn extends p0p {
    public static final String[] g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final dkn e;
    public final am0 f;

    public hkn(zzpg zzpgVar) {
        super(zzpgVar);
        this.f = new am0(((zzic) this.b).k);
        zzal zzalVar = ((zzic) this.b).d;
        this.e = new dkn(this, ((zzic) this.b).a);
    }

    public static final void D0(ContentValues contentValues, Object obj) {
        Preconditions.f(U3.i.X);
        if (obj instanceof String) {
            contentValues.put(U3.i.X, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(U3.i.X, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(U3.i.X, (Double) obj);
        } else {
            a70.p("Invalid value type");
        }
    }

    public static final String v0(List list) {
        return list.isEmpty() ? "" : lnb.o(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public final emn A0(String str, zzhs zzhsVar, String str2) {
        emn q0 = q0("events", str, zzhsVar.D());
        if (q0 != null) {
            long j2 = q0.e + 1;
            long j3 = q0.d + 1;
            return new emn(q0.a, q0.b, q0.c + 1, j3, j2, q0.f, q0.g, q0.h, q0.i, q0.j, q0.k);
        }
        zzic zzicVar = (zzic) this.b;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.j.c(zzgu.U(str), zzicVar.j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new emn(str, zzhsVar.D(), 1L, 1L, 1L, zzhsVar.F(), 0L, null, null, null, null);
    }

    public final boolean B0() {
        return ((zzic) this.b).a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:48:0x018c->B:57:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:11:0x0049, B:13:0x0065, B:21:0x006d, B:24:0x0071, B:25:0x00c9, B:27:0x00ef, B:28:0x0101, B:30:0x0105, B:31:0x0115, B:33:0x011b, B:34:0x012b, B:43:0x0159, B:44:0x0161, B:46:0x016c, B:48:0x018c, B:50:0x019a, B:51:0x01a4, B:53:0x01e2, B:62:0x01d2, B:63:0x01e9, B:66:0x0146, B:70:0x01fb, B:72:0x020e, B:75:0x003d, B:79:0x0088, B:81:0x008e, B:84:0x009d, B:87:0x00c1, B:90:0x0093), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:11:0x0049, B:13:0x0065, B:21:0x006d, B:24:0x0071, B:25:0x00c9, B:27:0x00ef, B:28:0x0101, B:30:0x0105, B:31:0x0115, B:33:0x011b, B:34:0x012b, B:43:0x0159, B:44:0x0161, B:46:0x016c, B:48:0x018c, B:50:0x019a, B:51:0x01a4, B:53:0x01e2, B:62:0x01d2, B:63:0x01e9, B:66:0x0146, B:70:0x01fb, B:72:0x020e, B:75:0x003d, B:79:0x0088, B:81:0x008e, B:84:0x009d, B:87:0x00c1, B:90:0x0093), top: B:2:0x0017 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(String str, long j2, long j3, pq7 pq7Var) {
        ?? r9;
        String str2;
        SQLiteDatabase H0;
        String[] strArr;
        String str3;
        String string;
        long j4;
        String[] strArr2;
        String str4;
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        Cursor cursor = null;
        try {
            try {
                H0 = H0();
                r9 = TextUtils.isEmpty(str);
            } catch (SQLiteException e) {
                e = e;
                r9 = str;
            }
            if (r9 != 0) {
                String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                str3 = j3 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb = new StringBuilder(str3.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str3);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = H0.rawQuery(sb.toString(), strArr3);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.c(zzgu.U(str2), e, "Data loss. Error selecting raw event. appId");
                }
            } else {
                try {
                    if (j3 != -1) {
                        String str5 = str;
                        strArr = new String[]{str5, String.valueOf(j3)};
                        r9 = str5;
                    } else {
                        String str6 = str;
                        strArr = new String[]{str6};
                        r9 = str6;
                    }
                    str3 = j3 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb2 = new StringBuilder(str3.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str3);
                    sb2.append(" order by rowid limit 1;");
                    cursor = H0.rawQuery(sb2.toString(), strArr);
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = r9;
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.c(zzgu.U(str2), e, "Data loss. Error selecting raw event. appId");
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str2 = r9;
                }
            }
            cursor = H0.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    zzid zzidVar = (zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.B0(zzid.e0(), cursor.getBlob(0))).m();
                    if (cursor.moveToNext()) {
                        zzgu zzguVar3 = zzicVar.f;
                        zzic.m(zzguVar3);
                        zzguVar3.j.b(zzgu.U(str2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    pq7Var.b = zzidVar;
                    long n0 = n0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str2, string}, -1L);
                    if (j3 != -1) {
                        j4 = j3;
                    } else if (n0 != -1) {
                        j4 = -1;
                    } else {
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str2, string};
                        cursor = H0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                        if (cursor.moveToFirst()) {
                            zzgu zzguVar4 = zzicVar.f;
                            zzic.m(zzguVar4);
                            zzguVar4.j.b(zzgu.U(str2), "Raw event data disappeared while in transaction. appId");
                        } else {
                            do {
                                long j5 = cursor.getLong(0);
                                byte[] blob = cursor.getBlob(3);
                                long j6 = cursor.getLong(4);
                                try {
                                    zzhr zzhrVar = (zzhr) zzpk.B0(zzhs.O(), blob);
                                    zzhrVar.w(cursor.getString(1));
                                    long j7 = cursor.getLong(2);
                                    zzhrVar.k();
                                    ((zzhs) zzhrVar.b).V(j7);
                                    zzhrVar.k();
                                    ((zzhs) zzhrVar.b).y(j6);
                                    if (!pq7Var.e(j5, (zzhs) zzhrVar.m())) {
                                        break;
                                    }
                                } catch (IOException e5) {
                                    zzgu zzguVar5 = zzicVar.f;
                                    zzic.m(zzguVar5);
                                    zzguVar5.g.c(zzgu.U(str2), e5, "Data loss. Failed to merge raw event. appId");
                                }
                            } while (cursor.moveToNext());
                        }
                    }
                    if (j4 != -1 && n0 != -1) {
                        n0 = Math.min(j4, n0);
                    } else if (j4 != -1) {
                        n0 = j4;
                    }
                    str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    strArr2 = new String[]{str2, string, String.valueOf(n0)};
                    cursor = H0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                    }
                } catch (IOException e6) {
                    zzgu zzguVar6 = zzicVar.f;
                    zzic.m(zzguVar6);
                    zzguVar6.g.c(zzgu.U(str2), e6, "Data loss. Failed to merge raw event metadata. appId");
                }
            } else {
                zzgu zzguVar7 = zzicVar.f;
                zzic.m(zzguVar7);
                zzguVar7.g.b(zzgu.U(str2), "Raw event metadata record is missing. appId");
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public final void E0() {
        R();
        H0().beginTransaction();
    }

    public final void F0() {
        R();
        H0().setTransactionSuccessful();
    }

    public final void G0() {
        R();
        H0().endTransaction();
    }

    public final SQLiteDatabase H0() {
        Q();
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error opening database");
            throw e;
        }
    }

    public final void I0(String str) {
        emn q0;
        s0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = H0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (q0 = q0("events", str, string)) != null) {
                            r0("events_snapshot", q0);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.c(zzgu.U(str), e, "Error creating snapshot. appId");
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
    
        r0("events", r8);
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
    public final void J0(String str) {
        boolean z;
        emn q0;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        emn q02 = q0("events", str, "_f");
        emn q03 = q0("events", str, "_v");
        s0("events", str);
        Cursor cursor = null;
        boolean z2 = false;
        try {
            cursor = H0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            z = false;
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (q02 == null) {
            }
            r0("events", q02);
            s0("events_snapshot", str);
        }
        boolean z3 = false;
        z = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z3 = true;
                    } else if ("_v".equals(string)) {
                        z = true;
                    }
                }
                if (string != null && (q0 = q0("events_snapshot", str, string)) != null) {
                    r0("events", q0);
                }
            } catch (SQLiteException e2) {
                e = e2;
                z2 = z3;
                try {
                    zzgu zzguVar = ((zzic) this.b).f;
                    zzic.m(zzguVar);
                    zzguVar.g.c(zzgu.U(str), e, "Error querying snapshot. appId");
                    z3 = z2;
                    if (cursor != null) {
                    }
                    if (!z3) {
                    }
                    if (!z) {
                    }
                    s0("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z2 && q02 != null) {
                        r0("events", q02);
                    } else if (!z && q03 != null) {
                        r0("events", q03);
                    }
                    s0("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = z3;
                if (cursor != null) {
                }
                if (z2) {
                }
                if (!z) {
                    r0("events", q03);
                }
                s0("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z3 || q02 == null) {
            if (!z) {
            }
            s0("events_snapshot", str);
        }
        r0("events", q02);
        s0("events_snapshot", str);
    }

    public final void K0(String str, String str2) {
        Preconditions.f(str);
        Preconditions.f(str2);
        Q();
        R();
        try {
            H0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = (zzic) this.b;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.d("Error deleting user property. appId", zzgu.U(str), zzicVar.j.c(str2), e);
        }
    }

    public final boolean L0(z1p z1pVar) {
        zzic zzicVar = (zzic) this.b;
        String str = z1pVar.b;
        Q();
        R();
        String str2 = z1pVar.a;
        String str3 = z1pVar.c;
        if (M0(str2, str3) == null) {
            if (zzpp.Q0(str3)) {
                if (m0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(zzicVar.d.Z(str2, zzfy.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long m0 = m0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                zzal zzalVar = zzicVar.d;
                if (m0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(z1pVar.d));
        D0(contentValues, z1pVar.e);
        try {
            if (H0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.b(zzgu.U(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgu.U(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z1p M0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Preconditions.f(str2);
        Q();
        R();
        Cursor cursor2 = null;
        try {
            cursor = H0().query("user_attributes", new String[]{"set_timestamp", U3.i.X, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j2 = cursor.getLong(0);
                        Object d0 = d0(cursor, 1);
                        if (d0 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                z1p z1pVar = new z1p(str3, cursor.getString(2), str4, j2, d0);
                                if (cursor.moveToNext()) {
                                    zzgu zzguVar = zzicVar.f;
                                    zzic.m(zzguVar);
                                    zzguVar.g.b(zzgu.U(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return z1pVar;
                            } catch (SQLiteException e) {
                                e = e;
                                sQLiteException = e;
                                zzgu zzguVar2 = zzicVar.f;
                                zzic.m(zzguVar2);
                                zzguVar2.g.d("Error querying user property. appId", zzgu.U(str3), zzicVar.j.c(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th;
                    }
                    cursor2.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List N0(String str) {
        String str2;
        SQLiteException sQLiteException;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Q();
        R();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                zzal zzalVar = zzicVar.d;
                cursor = H0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", U3.i.X}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursor.getLong(2);
                        Object d0 = d0(cursor, 3);
                        if (d0 == null) {
                            try {
                                zzgu zzguVar = zzicVar.f;
                                zzic.m(zzguVar);
                                zzguVar.g.b(zzgu.U(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                zzgu zzguVar2 = zzicVar.f;
                                zzic.m(zzguVar2);
                                zzguVar2.g.c(zzgu.U(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new z1p(str2, str3, string, j2, d0));
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                zzgu zzguVar22 = zzicVar.f;
                                zzic.m(zzguVar22);
                                zzguVar22.g.c(zzgu.U(str2), sQLiteException, "Error querying user properties. appId");
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
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        com.google.android.gms.measurement.internal.zzic.m(r13);
        r13.g.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List O0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Q();
        R();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            SQLiteDatabase H0 = H0();
            String[] strArr2 = {"name", "set_timestamp", U3.i.X, "origin"};
            String sb3 = sb.toString();
            zzal zzalVar = zzicVar.d;
            zzgu zzguVar = zzicVar.f;
            cursor2 = H0.query("user_attributes", strArr2, sb3, strArr, null, null, "rowid", "1001");
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
                                long j2 = cursor2.getLong(1);
                                Object d0 = d0(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (d0 == null) {
                                    try {
                                        zzic.m(zzguVar);
                                        zzguVar.g.d("(2)Read invalid user property value, ignoring it", zzgu.U(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            zzgu zzguVar2 = zzicVar.f;
                                            zzic.m(zzguVar2);
                                            zzguVar2.g.d("(2)Error querying user properties", zzgu.U(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new z1p(str, str5, string, j2, d0));
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        zzgu zzguVar22 = zzicVar.f;
                                        zzic.m(zzguVar22);
                                        zzguVar22.g.d("(2)Error querying user properties", zzgu.U(str), str4, e);
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
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursor2;
                                zzgu zzguVar222 = zzicVar.f;
                                zzic.m(zzguVar222);
                                zzguVar222.g.d("(2)Error querying user properties", zzgu.U(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean P0(zzah zzahVar) {
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        String str = zzahVar.a;
        Preconditions.i(str);
        if (M0(str, zzahVar.c.b) == null) {
            long m0 = m0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            zzal zzalVar = zzicVar.d;
            if (m0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("origin", zzahVar.b);
        contentValues.put("name", zzahVar.c.b);
        Object zza = zzahVar.c.zza();
        Preconditions.i(zza);
        D0(contentValues, zza);
        contentValues.put("active", Boolean.valueOf(zzahVar.e));
        contentValues.put("trigger_event_name", zzahVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.h));
        zzbh zzbhVar = zzahVar.g;
        zzpp zzppVar = zzicVar.i;
        zzgu zzguVar = zzicVar.f;
        zzic.k(zzppVar);
        contentValues.put("timed_out_event", zzpp.z0(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.d));
        zzic.k(zzppVar);
        contentValues.put("triggered_event", zzpp.z0(zzahVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.j));
        contentValues.put("expired_event", zzpp.z0(zzahVar.k));
        try {
            if (H0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzic.m(zzguVar);
            zzguVar.g.b(zzgu.U(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:37:0x00f0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah Q0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Preconditions.f(str2);
        Q();
        R();
        Cursor cursor3 = null;
        try {
            try {
                cursor = H0().query("conditional_properties", new String[]{"origin", U3.i.X, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
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
        Object d0 = d0(cursor, 1);
        boolean z = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j2 = cursor.getLong(4);
        zzpk zzpkVar = this.c.g;
        zzpg.U(zzpkVar);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
        zzbh zzbhVar = (zzbh) zzpkVar.t0(blob, creator);
        long j3 = cursor.getLong(6);
        zzpg.U(zzpkVar);
        zzbh zzbhVar2 = (zzbh) zzpkVar.t0(cursor.getBlob(7), creator);
        long j4 = cursor.getLong(8);
        long j5 = cursor.getLong(9);
        zzpg.U(zzpkVar);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpl(j4, d0, str3, str4), j3, z, string2, zzbhVar, j2, zzbhVar2, j5, (zzbh) zzpkVar.t0(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.g.c(zzgu.U(str), zzicVar.j.c(str3), "Got multiple records for conditional property, expected one");
            }
            cursor.close();
            return zzahVar;
        } catch (SQLiteException e3) {
            e = e3;
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.d("Error querying conditional property", zzgu.U(str), zzicVar.j.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void R0(String str, String str2) {
        Preconditions.f(str);
        Preconditions.f(str2);
        Q();
        R();
        try {
            H0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = (zzic) this.b;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.d("Error deleting conditional property", zzgu.U(str), zzicVar.j.c(str2), e);
        }
    }

    public final List S0(String str, String str2, String str3) {
        Preconditions.f(str);
        Q();
        R();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return T0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.p0p
    public final void T() {
        zzic zzicVar = (zzic) this.b;
        if (zzicVar.d.b0(null, zzfy.e1)) {
            zzhz zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new f2n(this, 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r0 = r1.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0.g.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List T0(String str, String[] strArr) {
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase H0 = H0();
                String[] strArr2 = {MBridgeConstans.APP_ID, "origin", "name", U3.i.X, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                zzal zzalVar = zzicVar.d;
                cursor = H0.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object d0 = d0(cursor, 3);
                        boolean z = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j2 = cursor.getLong(6);
                        zzpk zzpkVar = this.c.g;
                        zzpg.U(zzpkVar);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzpkVar.t0(blob, creator);
                        long j3 = cursor.getLong(8);
                        zzpg.U(zzpkVar);
                        zzbh zzbhVar2 = (zzbh) zzpkVar.t0(cursor.getBlob(9), creator);
                        long j4 = cursor.getLong(10);
                        long j5 = cursor.getLong(11);
                        zzpg.U(zzpkVar);
                        arrayList.add(new zzah(string, string2, new zzpl(j4, d0, string3, string2), j3, z, string4, zzbhVar, j2, zzbhVar2, j5, (zzbh) zzpkVar.t0(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.g.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long U(String str, zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l2) {
        int delete;
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        Preconditions.i(zzibVar);
        Preconditions.f(str);
        Q();
        R();
        if (B0()) {
            zzpg zzpgVar = this.c;
            long a = zzpgVar.i.g.a();
            DefaultClock defaultClock = zzicVar.k;
            zzgu zzguVar = zzicVar.f;
            defaultClock.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) zzfy.M.a(null)).longValue()) {
                zzpgVar.i.g.b(elapsedRealtime);
                Q();
                R();
                if (B0() && (delete = H0().delete("upload_queue", u0(), new String[0])) > 0) {
                    zzic.m(zzguVar);
                    zzguVar.o.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                Preconditions.f(str);
                Q();
                R();
                try {
                    int Z = zzicVar.d.Z(str, zzfy.A);
                    if (Z > 0) {
                        H0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(Z)});
                    }
                } catch (SQLiteException e) {
                    zzic.m(zzguVar);
                    zzguVar.g.c(zzgu.U(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(fn0.c(1, str3) + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(U3.j.b);
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] h2 = zzibVar.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("measurement_batch", h2);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.a));
        DefaultClock defaultClock2 = zzicVar.k;
        zzgu zzguVar2 = zzicVar.f;
        defaultClock2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long insert = H0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            zzic.m(zzguVar2);
            zzguVar2.g.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0401  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xjo U0(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Q();
        R();
        Cursor cursor2 = null;
        try {
            cursor = H0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.c(zzgu.U(str), e, "Error querying app. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
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
        zzpg zzpgVar = this.c;
        xjo xjoVar = new xjo(zzpgVar.l, str);
        zzic zzicVar2 = xjoVar.a;
        zzjl c = zzpgVar.c(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (c.i(zzjkVar)) {
            xjoVar.G(cursor.getString(0));
        }
        boolean z = true;
        xjoVar.I(cursor.getString(1));
        if (zzpgVar.c(str).i(zzjk.AD_STORAGE)) {
            xjoVar.J(cursor.getString(2));
        }
        xjoVar.e(cursor.getLong(3));
        xjoVar.M(cursor.getLong(4));
        xjoVar.N(cursor.getLong(5));
        xjoVar.P(cursor.getString(6));
        xjoVar.S(cursor.getString(7));
        xjoVar.T(cursor.getLong(8));
        xjoVar.a(cursor.getLong(9));
        xjoVar.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        xjoVar.i(cursor.getLong(11));
        xjoVar.j(cursor.getLong(12));
        xjoVar.k(cursor.getLong(13));
        xjoVar.l(cursor.getLong(14));
        xjoVar.f(cursor.getLong(15));
        xjoVar.g(cursor.getLong(16));
        xjoVar.R(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        xjoVar.L(cursor.getString(18));
        xjoVar.n(cursor.getLong(19));
        xjoVar.m(cursor.getLong(20));
        xjoVar.w(cursor.getString(21));
        boolean z2 = cursor.isNull(23) || cursor.getInt(23) != 0;
        zzhz zzhzVar = zzicVar2.g;
        zzic.m(zzhzVar);
        zzhzVar.Q();
        xjoVar.R |= xjoVar.p != z2;
        xjoVar.p = z2;
        xjoVar.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            xjoVar.y(Arrays.asList(cursor.getString(26).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1)));
        }
        if (zzpgVar.c(str).i(zzjkVar)) {
            String string2 = cursor.getString(28);
            zzhz zzhzVar2 = zzicVar2.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Q();
            xjoVar.R |= !Objects.equals(xjoVar.t, string2);
            xjoVar.t = string2;
        }
        boolean z3 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        zzhz zzhzVar3 = zzicVar2.g;
        zzic.m(zzhzVar3);
        zzhzVar3.Q();
        xjoVar.R |= xjoVar.u != z3;
        xjoVar.u = z3;
        xjoVar.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        zzhz zzhzVar4 = zzicVar2.g;
        zzic.m(zzhzVar4);
        zzhzVar4.Q();
        xjoVar.R |= xjoVar.C != string3;
        xjoVar.C = string3;
        xjoVar.A(cursor.getLong(30));
        xjoVar.B(cursor.getLong(31));
        zzaif.a();
        if (zzicVar.d.b0(str, zzfy.O0)) {
            int i2 = cursor.getInt(32);
            zzhz zzhzVar5 = zzicVar2.g;
            zzic.m(zzhzVar5);
            zzhzVar5.Q();
            xjoVar.R |= xjoVar.x != i2;
            xjoVar.x = i2;
            xjoVar.C(cursor.getLong(35));
        }
        boolean z4 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        zzhz zzhzVar6 = zzicVar2.g;
        zzic.m(zzhzVar6);
        zzhzVar6.Q();
        xjoVar.R |= xjoVar.y != z4;
        xjoVar.y = z4;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        zzhz zzhzVar7 = zzicVar2.g;
        zzic.m(zzhzVar7);
        zzhzVar7.Q();
        xjoVar.R |= !Objects.equals(xjoVar.q, valueOf);
        xjoVar.q = valueOf;
        xjoVar.p(cursor.getInt(37));
        xjoVar.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            Preconditions.i(string);
        }
        zzhz zzhzVar8 = zzicVar2.g;
        zzic.m(zzhzVar8);
        zzhzVar8.Q();
        xjoVar.R |= xjoVar.G != string;
        xjoVar.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            zzhz zzhzVar9 = zzicVar2.g;
            zzic.m(zzhzVar9);
            zzhzVar9.Q();
            xjoVar.R |= !Objects.equals(xjoVar.z, valueOf2);
            xjoVar.z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            zzhz zzhzVar10 = zzicVar2.g;
            zzic.m(zzhzVar10);
            zzhzVar10.Q();
            xjoVar.R |= !Objects.equals(xjoVar.A, valueOf3);
            xjoVar.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        zzhz zzhzVar11 = zzicVar2.g;
        zzic.m(zzhzVar11);
        zzhzVar11.Q();
        xjoVar.R |= xjoVar.H != blob;
        xjoVar.H = blob;
        if (!cursor.isNull(44)) {
            int i3 = cursor.getInt(44);
            zzhz zzhzVar12 = zzicVar2.g;
            zzic.m(zzhzVar12);
            zzhzVar12.Q();
            boolean z5 = xjoVar.R;
            if (xjoVar.I == i3) {
                z = false;
            }
            xjoVar.R = z | z5;
            xjoVar.I = i3;
        }
        if (zzicVar.d.b0(str, zzfy.j1) && !cursor.isNull(45)) {
            xjoVar.u(cursor.getLong(45));
        }
        zzhz zzhzVar13 = zzicVar2.g;
        zzic.m(zzhzVar13);
        zzhzVar13.Q();
        xjoVar.R = false;
        if (cursor.moveToNext()) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(zzgu.U(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return xjoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List V(String str, zzoo zzooVar, int i2) {
        ?? r0;
        Preconditions.f(str);
        Q();
        R();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase H0 = H0();
                String[] strArr = {"rowId", MBridgeConstans.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String v0 = v0(zzooVar.a);
                String u0 = u0();
                StringBuilder sb = new StringBuilder(v0.length() + 17 + u0.length());
                sb.append("app_id=?");
                sb.append(v0);
                sb.append(" AND NOT ");
                sb.append(u0);
                cursor = H0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    zzpj t0 = t0(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (t0 != null) {
                        r0.add(t0);
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void V0(xjo xjoVar, boolean z) {
        zzic zzicVar = (zzic) this.b;
        zzic zzicVar2 = xjoVar.a;
        Q();
        R();
        String E = xjoVar.E();
        Preconditions.i(E);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, E);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        zzpg zzpgVar = this.c;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (zzpgVar.c(E).i(zzjkVar)) {
            contentValues.put("app_instance_id", xjoVar.F());
        }
        contentValues.put("gmp_app_id", xjoVar.H());
        if (zzpgVar.c(E).i(zzjk.AD_STORAGE)) {
            zzhz zzhzVar = zzicVar2.g;
            zzic.m(zzhzVar);
            zzhzVar.Q();
            contentValues.put("resettable_device_id_hash", xjoVar.e);
        }
        zzhz zzhzVar2 = zzicVar2.g;
        zzic.m(zzhzVar2);
        zzhzVar2.Q();
        contentValues.put("last_bundle_index", Long.valueOf(xjoVar.g));
        zzhz zzhzVar3 = zzicVar2.g;
        zzic.m(zzhzVar3);
        zzhzVar3.Q();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(xjoVar.h));
        zzhz zzhzVar4 = zzicVar2.g;
        zzic.m(zzhzVar4);
        zzhzVar4.Q();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(xjoVar.i));
        contentValues.put("app_version", xjoVar.O());
        zzhz zzhzVar5 = zzicVar2.g;
        zzic.m(zzhzVar5);
        zzhzVar5.Q();
        contentValues.put("app_store", xjoVar.l);
        zzhz zzhzVar6 = zzicVar2.g;
        zzic.m(zzhzVar6);
        zzhzVar6.Q();
        contentValues.put("gmp_version", Long.valueOf(xjoVar.m));
        zzhz zzhzVar7 = zzicVar2.g;
        zzic.m(zzhzVar7);
        zzhzVar7.Q();
        contentValues.put("dev_cert_hash", Long.valueOf(xjoVar.n));
        zzhz zzhzVar8 = zzicVar2.g;
        zzic.m(zzhzVar8);
        zzhzVar8.Q();
        contentValues.put("measurement_enabled", Boolean.valueOf(xjoVar.o));
        zzhz zzhzVar9 = zzicVar2.g;
        zzhz zzhzVar10 = zzicVar2.g;
        zzic.m(zzhzVar9);
        zzhzVar9.Q();
        contentValues.put("day", Long.valueOf(xjoVar.K));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_public_events_count", Long.valueOf(xjoVar.L));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_events_count", Long.valueOf(xjoVar.M));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_conversions_count", Long.valueOf(xjoVar.N));
        zzhz zzhzVar11 = zzicVar2.g;
        zzic.m(zzhzVar11);
        zzhzVar11.Q();
        contentValues.put("config_fetched_time", Long.valueOf(xjoVar.S));
        zzhz zzhzVar12 = zzicVar2.g;
        zzic.m(zzhzVar12);
        zzhzVar12.Q();
        contentValues.put("failed_config_fetch_time", Long.valueOf(xjoVar.T));
        contentValues.put("app_version_int", Long.valueOf(xjoVar.Q()));
        contentValues.put("firebase_instance_id", xjoVar.K());
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_error_events_count", Long.valueOf(xjoVar.O));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_realtime_events_count", Long.valueOf(xjoVar.P));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("health_monitor_sample", xjoVar.Q);
        contentValues.put("android_id", (Long) 0L);
        zzhz zzhzVar13 = zzicVar2.g;
        zzic.m(zzhzVar13);
        zzhzVar13.Q();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(xjoVar.p));
        contentValues.put("dynamite_version", Long.valueOf(xjoVar.b()));
        if (zzpgVar.c(E).i(zzjkVar)) {
            zzhz zzhzVar14 = zzicVar2.g;
            zzic.m(zzhzVar14);
            zzhzVar14.Q();
            contentValues.put("session_stitching_token", xjoVar.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(xjoVar.z()));
        zzhz zzhzVar15 = zzicVar2.g;
        zzic.m(zzhzVar15);
        zzhzVar15.Q();
        contentValues.put("target_os_version", Long.valueOf(xjoVar.v));
        zzhz zzhzVar16 = zzicVar2.g;
        zzic.m(zzhzVar16);
        zzhzVar16.Q();
        contentValues.put("session_stitching_token_hash", Long.valueOf(xjoVar.w));
        zzaif.a();
        zzal zzalVar = zzicVar.d;
        zzgu zzguVar = zzicVar.f;
        if (zzalVar.b0(E, zzfy.O0)) {
            zzhz zzhzVar17 = zzicVar2.g;
            zzic.m(zzhzVar17);
            zzhzVar17.Q();
            contentValues.put("ad_services_version", Integer.valueOf(xjoVar.x));
            zzhz zzhzVar18 = zzicVar2.g;
            zzic.m(zzhzVar18);
            zzhzVar18.Q();
            contentValues.put("attribution_eligibility_status", Long.valueOf(xjoVar.B));
        }
        zzhz zzhzVar19 = zzicVar2.g;
        zzic.m(zzhzVar19);
        zzhzVar19.Q();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(xjoVar.y));
        contentValues.put("npa_metadata_value", xjoVar.x());
        zzhz zzhzVar20 = zzicVar2.g;
        zzic.m(zzhzVar20);
        zzhzVar20.Q();
        contentValues.put("bundle_delivery_index", Long.valueOf(xjoVar.F));
        contentValues.put("sgtm_preview_key", xjoVar.D());
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("dma_consent_state", Integer.valueOf(xjoVar.D));
        zzic.m(zzhzVar10);
        zzhzVar10.Q();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(xjoVar.E));
        contentValues.put("serialized_npa_metadata", xjoVar.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(xjoVar.t()));
        zzhz zzhzVar21 = zzicVar2.g;
        zzic.m(zzhzVar21);
        zzhzVar21.Q();
        ArrayList arrayList = xjoVar.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzic.m(zzguVar);
                zzguVar.j.b(E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList));
            }
        }
        if (zzalVar.b0(null, zzfy.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        zzhz zzhzVar22 = zzicVar2.g;
        zzic.m(zzhzVar22);
        zzhzVar22.Q();
        contentValues.put("unmatched_pfo", xjoVar.z);
        zzhz zzhzVar23 = zzicVar2.g;
        zzic.m(zzhzVar23);
        zzhzVar23.Q();
        contentValues.put("unmatched_uwa", xjoVar.A);
        zzhz zzhzVar24 = zzicVar2.g;
        zzic.m(zzhzVar24);
        zzhzVar24.Q();
        contentValues.put("ad_campaign_info", xjoVar.H);
        if (zzalVar.b0(E, zzfy.j1)) {
            zzhz zzhzVar25 = zzicVar2.g;
            zzic.m(zzhzVar25);
            zzhzVar25.Q();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(xjoVar.J));
        }
        try {
            SQLiteDatabase H0 = H0();
            if (H0.update("apps", contentValues, "app_id = ?", new String[]{E}) == 0 && H0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzic.m(zzguVar);
                zzguVar.g.b(zzgu.U(E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(E), e, "Error storing app. appId");
        }
    }

    public final boolean W(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].a));
        String v0 = v0(arrayList);
        String u0 = u0();
        return m0(fc6.o(new StringBuilder((v0.length() + 61) + u0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", v0, " AND NOT ", u0), new String[]{str}) != 0;
    }

    public final zzar W0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return X0(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final void X(Long l2) {
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        try {
            if (H0().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final zzar X0(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Q();
        R();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase H0 = H0();
                cursor = H0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j2) {
                        zzarVar.b = cursor.getLong(1);
                        zzarVar.a = cursor.getLong(2);
                        zzarVar.c = cursor.getLong(3);
                        zzarVar.d = cursor.getLong(4);
                        zzarVar.e = cursor.getLong(5);
                        zzarVar.f = cursor.getLong(6);
                        zzarVar.g = cursor.getLong(7);
                    }
                    if (z) {
                        zzarVar.b += j3;
                    }
                    if (z2) {
                        zzarVar.a += j3;
                    }
                    if (z3) {
                        zzarVar.c += j3;
                    }
                    if (z4) {
                        zzarVar.d += j3;
                    }
                    if (z5) {
                        zzarVar.e += j3;
                    }
                    if (z6) {
                        zzarVar.f += j3;
                    }
                    if (z7) {
                        zzarVar.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.g));
                    H0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.j.b(zzgu.U(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.c(zzgu.U(str), e, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return zzarVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Y() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase H0 = H0();
        ?? r1 = 0;
        try {
            try {
                cursor = H0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzgu zzguVar = ((zzic) this.b).f;
                    zzic.m(zzguVar);
                    zzguVar.g.b(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = H0;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sx2 Y0(String str) {
        Throwable th;
        Cursor cursor;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Q();
        R();
        ?? r2 = 0;
        try {
            try {
                cursor = H0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.g.b(zzgu.U(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            sx2 sx2Var = new sx2(blob, string, string2);
                            cursor.close();
                            return sx2Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.c(zzgu.U(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void Z(long j2) {
        Q();
        R();
        try {
            if (H0().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void Z0(zzid zzidVar, boolean z) {
        Q();
        R();
        Preconditions.f(zzidVar.y());
        Preconditions.l(zzidVar.m2());
        a0();
        zzic zzicVar = (zzic) this.b;
        DefaultClock defaultClock = zzicVar.k;
        zzgu zzguVar = zzicVar.f;
        defaultClock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long n2 = zzidVar.n2();
        zzfx zzfxVar = zzfy.R;
        if (n2 < currentTimeMillis - ((Long) zzfxVar.a(null)).longValue() || zzidVar.n2() > ((Long) zzfxVar.a(null)).longValue() + currentTimeMillis) {
            zzic.m(zzguVar);
            zzguVar.j.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.U(zzidVar.y()), Long.valueOf(currentTimeMillis), Long.valueOf(zzidVar.n2()));
        }
        byte[] h2 = zzidVar.h();
        try {
            zzpk zzpkVar = this.c.g;
            zzpg.U(zzpkVar);
            byte[] A0 = zzpkVar.A0(h2);
            zzic.m(zzguVar);
            zzguVar.o.b(Integer.valueOf(A0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, zzidVar.y());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.n2()));
            contentValues.put("data", A0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzidVar.z0()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.A0()));
            }
            try {
                if (H0().insert("queue", null, contentValues) == -1) {
                    zzic.m(zzguVar);
                    zzguVar.g.b(zzgu.U(zzidVar.y()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                zzic.m(zzguVar);
                zzguVar.g.c(zzgu.U(zzidVar.y()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(zzidVar.y()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void a0() {
        Q();
        R();
        if (B0()) {
            zzpg zzpgVar = this.c;
            long a = zzpgVar.i.f.a();
            zzic zzicVar = (zzic) this.b;
            zzicVar.k.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) zzfy.M.a(null)).longValue()) {
                zzpgVar.i.f.b(elapsedRealtime);
                Q();
                R();
                if (B0()) {
                    SQLiteDatabase H0 = H0();
                    zzicVar.k.getClass();
                    int delete = H0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) zzfy.R.a(null)).longValue())});
                    if (delete > 0) {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.o.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void b0(ArrayList arrayList) {
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        Preconditions.i(arrayList);
        if (arrayList.size() == 0) {
            a70.p("Given Integer is zero");
            return;
        }
        if (B0()) {
            String join = TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList);
            String m2 = wt3.m("(", join, new StringBuilder(String.valueOf(join).length() + 2), ")");
            if (m0(wt3.m("SELECT COUNT(1) FROM queue WHERE rowid IN ", m2, new StringBuilder(m2.length() + 80), " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase H0 = H0();
                StringBuilder sb = new StringBuilder(m2.length() + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(m2);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                H0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void c0(Long l2) {
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        if (B0()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m0(sb.toString(), null) > 0) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase H0 = H0();
                zzicVar.k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l2.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l2);
                sb4.append(" AND retry_count < 2147483647");
                H0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object d0(Cursor cursor, int i2) {
        zzic zzicVar = (zzic) this.b;
        int type = cursor.getType(i2);
        if (type == 0) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        zzgu zzguVar3 = zzicVar.f;
        zzic.m(zzguVar3);
        zzguVar3.g.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0.g.d("Error inserting column. appId", com.google.android.gms.measurement.internal.zzgu.U(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e0(String str) {
        long j2;
        long n0;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str);
        Preconditions.f("first_open_count");
        Q();
        R();
        SQLiteDatabase H0 = H0();
        H0.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j2 = -1;
                n0 = n0(sb.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e) {
                e = e;
            }
            if (n0 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(MBridgeConstans.APP_ID, str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (H0.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.c(zzgu.U(str), "first_open_count", "Failed to insert column (got -1). appId");
                    return j2;
                }
                n0 = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(MBridgeConstans.APP_ID, str);
            contentValues2.put("first_open_count", Long.valueOf(1 + n0));
            if (H0.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.c(zzgu.U(str), "first_open_count", "Failed to update column (got 0). appId");
            } else {
                H0.setTransactionSuccessful();
                j2 = n0;
            }
            return j2;
        } finally {
            H0.endTransaction();
        }
    }

    public final boolean f0(String str, String str2) {
        return m0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void g0(List list) {
        Preconditions.i(list);
        Q();
        R();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int delete = H0().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.c(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long h0(String str) {
        Preconditions.f(str);
        return n0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void i0(String str, Long l2, long j2, zzhs zzhsVar) {
        Q();
        R();
        Preconditions.i(zzhsVar);
        Preconditions.f(str);
        zzic zzicVar = (zzic) this.b;
        byte[] h2 = zzhsVar.h();
        zzgu zzguVar = zzicVar.f;
        zzgu zzguVar2 = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.o.c(zzicVar.j.a(str), Integer.valueOf(h2.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", h2);
        try {
            if (H0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzic.m(zzguVar2);
                zzguVar2.g.b(zzgu.U(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgu.U(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2 A[Catch: SQLiteException -> 0x02ce, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02ce, blocks: (B:77:0x0297, B:79:0x02b2), top: B:76:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(String str, Long l2, String str2, Bundle bundle) {
        String string;
        String D;
        Bundle bundle2;
        zzgu zzguVar;
        long update;
        zzid zzidVar;
        Cursor query;
        hkn hknVar = this;
        String str3 = str;
        Object obj = hknVar.b;
        zzic zzicVar = (zzic) obj;
        Preconditions.i(bundle);
        hknVar.Q();
        hknVar.R();
        zzau zzauVar = l2 != null ? new zzau(hknVar, str3, l2.longValue()) : new zzau(hknVar, str3);
        List<tjn> a = zzauVar.a();
        while (!a.isEmpty()) {
            for (tjn tjnVar : a) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    zzid zzidVar2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = hknVar.H0().query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(tjnVar.b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    zzidVar = null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        zzidVar = null;
                    }
                    if (query.moveToFirst()) {
                        try {
                            zzidVar = (zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.B0(zzid.e0(), query.getBlob(0))).m();
                            try {
                                if (query.moveToNext()) {
                                    zzgu zzguVar2 = zzicVar.f;
                                    zzic.m(zzguVar2);
                                    zzguVar2.j.b(zzgu.U(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = query;
                                zzgu zzguVar3 = zzicVar.f;
                                zzic.m(zzguVar3);
                                zzguVar3.g.c(zzgu.U(str3), e, "Data loss. Error selecting raw event. appId");
                                if (cursor != null) {
                                    cursor.close();
                                }
                                zzidVar2 = zzidVar;
                                if (zzidVar2 != null) {
                                }
                                zzpk zzpkVar = hknVar.c.g;
                                zzpg.U(zzpkVar);
                                zzhs zzhsVar = tjnVar.d;
                                Bundle bundle3 = new Bundle();
                                while (r6.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                D = zzhsVar.D();
                                if (string == null) {
                                }
                                zzgv zzgvVar = new zzgv(zzhsVar.F(), zzhsVar.N(), bundle3, D, string);
                                zzpp zzppVar = zzicVar.i;
                                zzgu zzguVar4 = zzicVar.f;
                                zzic.k(zzppVar);
                                if (D.equals("_cmp")) {
                                }
                                zzppVar.d0(bundle3, bundle2);
                                zzbc zzbcVar = new zzbc((zzic) obj, zzgvVar.b, str3, zzhsVar.D(), zzhsVar.F(), zzhsVar.N(), zzhsVar.H(), bundle3);
                                long j2 = tjnVar.a;
                                long j3 = tjnVar.b;
                                boolean z = tjnVar.c;
                                Q();
                                R();
                                String str4 = zzbcVar.a;
                                Preconditions.f(str4);
                                zzpg.U(zzpkVar);
                                byte[] h2 = zzpkVar.q0(zzbcVar).h();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(MBridgeConstans.APP_ID, str4);
                                contentValues.put("name", zzbcVar.b);
                                contentValues.put("timestamp", Long.valueOf(zzbcVar.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                                contentValues.put("data", h2);
                                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.e));
                                update = H0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                                if (update != 1) {
                                }
                                hknVar = this;
                                str3 = str;
                            }
                            zzidVar2 = zzidVar;
                        } catch (IOException e4) {
                            zzgu zzguVar5 = zzicVar.f;
                            zzic.m(zzguVar5);
                            zzguVar5.g.c(zzgu.U(str3), e4, "Data loss. Failed to merge raw event metadata. appId");
                        }
                        if (zzidVar2 != null) {
                            Iterator<E> it = zzidVar2.f2().iterator();
                            while (it.hasNext()) {
                                if (((zziu) it.next()).A().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        zzgu zzguVar6 = zzicVar.f;
                        zzic.m(zzguVar6);
                        zzguVar6.g.b(zzgu.U(str3), "Raw event metadata record is missing. appId");
                    }
                    query.close();
                    if (zzidVar2 != null) {
                    }
                }
                zzpk zzpkVar2 = hknVar.c.g;
                zzpg.U(zzpkVar2);
                zzhs zzhsVar2 = tjnVar.d;
                Bundle bundle32 = new Bundle();
                for (zzhw zzhwVar : zzhsVar2.A()) {
                    if (zzhwVar.G()) {
                        bundle32.putDouble(zzhwVar.z(), zzhwVar.H());
                    } else if (zzhwVar.E()) {
                        bundle32.putFloat(zzhwVar.z(), zzhwVar.F());
                    } else if (zzhwVar.C()) {
                        bundle32.putLong(zzhwVar.z(), zzhwVar.D());
                    } else if (zzhwVar.A()) {
                        bundle32.putString(zzhwVar.z(), zzhwVar.B());
                    } else if (zzhwVar.I().isEmpty()) {
                        zzgu zzguVar7 = ((zzic) zzpkVar2.b).f;
                        zzic.m(zzguVar7);
                        zzguVar7.g.b(zzhwVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(zzhwVar.z(), zzpk.D0(zzhwVar.I()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                D = zzhsVar2.D();
                if (string == null) {
                    string = "";
                }
                zzgv zzgvVar2 = new zzgv(zzhsVar2.F(), zzhsVar2.N(), bundle32, D, string);
                zzpp zzppVar2 = zzicVar.i;
                zzgu zzguVar42 = zzicVar.f;
                zzic.k(zzppVar2);
                if (D.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                    }
                }
                zzppVar2.d0(bundle32, bundle2);
                zzbc zzbcVar2 = new zzbc((zzic) obj, zzgvVar2.b, str3, zzhsVar2.D(), zzhsVar2.F(), zzhsVar2.N(), zzhsVar2.H(), bundle32);
                long j22 = tjnVar.a;
                long j32 = tjnVar.b;
                boolean z2 = tjnVar.c;
                Q();
                R();
                String str42 = zzbcVar2.a;
                Preconditions.f(str42);
                zzpg.U(zzpkVar2);
                byte[] h22 = zzpkVar2.q0(zzbcVar2).h();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(MBridgeConstans.APP_ID, str42);
                contentValues2.put("name", zzbcVar2.b);
                contentValues2.put("timestamp", Long.valueOf(zzbcVar2.d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j32));
                contentValues2.put("data", h22);
                contentValues2.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                contentValues2.put("elapsed_time", Long.valueOf(zzbcVar2.e));
                try {
                    update = H0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j22)});
                    if (update != 1) {
                        zzic.m(zzguVar42);
                        zzguVar = zzguVar42;
                        try {
                            zzguVar.g.c(zzgu.U(str42), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            zzic.m(zzguVar);
                            zzguVar.g.c(zzgu.U(str42), e, "Error updating raw event. appId");
                            hknVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    zzguVar = zzguVar42;
                }
                hknVar = this;
                str3 = str;
            }
            a = zzauVar.a();
            hknVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [hkn, p0p, t01] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjl k0(String str) {
        Throwable th;
        SQLiteException e;
        zzic zzicVar = (zzic) this.b;
        Preconditions.i(str);
        Q();
        R();
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        zzjl zzjlVar = null;
        try {
            try {
                this = H0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        zzjlVar = zzjl.c(this.getInt(1), this.getString(0));
                    } else {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.o.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.b(e, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = this;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        this.close();
        return zzjlVar == null ? zzjl.c : zzjlVar;
    }

    public final void l0(String str, zzoh zzohVar) {
        Q();
        R();
        Preconditions.f(str);
        zzic zzicVar = (zzic) this.b;
        DefaultClock defaultClock = zzicVar.k;
        zzgu zzguVar = zzicVar.f;
        defaultClock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        zzfx zzfxVar = zzfy.u0;
        long longValue = currentTimeMillis - ((Long) zzfxVar.a(null)).longValue();
        long j2 = zzohVar.b;
        if (j2 < longValue || j2 > ((Long) zzfxVar.a(null)).longValue() + currentTimeMillis) {
            zzic.m(zzguVar);
            zzguVar.j.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.U(str), Long.valueOf(currentTimeMillis), Long.valueOf(j2));
        }
        zzic.m(zzguVar);
        zzguVar.o.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.a);
        contentValues.put("source", Integer.valueOf(zzohVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (H0().insert("trigger_uris", null, contentValues) == -1) {
                zzic.m(zzguVar);
                zzguVar.g.b(zzgu.U(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long m0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = H0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long n0(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = H0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String o0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = H0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                zzgu zzguVar = ((zzic) this.b).f;
                zzic.m(zzguVar);
                zzguVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void p0(ContentValues contentValues) {
        zzic zzicVar = (zzic) this.b;
        try {
            SQLiteDatabase H0 = H0();
            if (contentValues.getAsString(MBridgeConstans.APP_ID) == null) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.i.b(zzgu.U(MBridgeConstans.APP_ID), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (H0.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && H0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.c(zzgu.U("consent_settings"), zzgu.U(MBridgeConstans.APP_ID), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.g.d("Error storing into table. key", zzgu.U("consent_settings"), zzgu.U(MBridgeConstans.APP_ID), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final emn q0(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        zzic zzicVar = (zzic) this.b;
        Preconditions.f(str2);
        Preconditions.f(str3);
        Q();
        R();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursor = H0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.d("Error querying events. appId", zzgu.U(str2), zzicVar.j.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j2 = cursor.getLong(0);
        long j3 = cursor.getLong(1);
        long j4 = cursor.getLong(2);
        long j5 = 0;
        long j6 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        if (!cursor.isNull(8)) {
            j5 = cursor.getLong(8);
        }
        emn emnVar = new emn(str2, str3, j2, j3, j5, j4, j6, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(zzgu.U(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return emnVar;
    }

    public final void r0(String str, emn emnVar) {
        zzic zzicVar = (zzic) this.b;
        Preconditions.i(emnVar);
        Q();
        R();
        ContentValues contentValues = new ContentValues();
        String str2 = emnVar.a;
        contentValues.put(MBridgeConstans.APP_ID, str2);
        contentValues.put("name", emnVar.b);
        contentValues.put("lifetime_count", Long.valueOf(emnVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(emnVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(emnVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(emnVar.g));
        contentValues.put("last_bundled_day", emnVar.h);
        contentValues.put("last_sampled_complex_event_id", emnVar.i);
        contentValues.put("last_sampling_rate", emnVar.j);
        contentValues.put("current_session_count", Long.valueOf(emnVar.e));
        Boolean bool = emnVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (H0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.g.b(zzgu.U(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.c(zzgu.U(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void s0(String str, String str2) {
        Preconditions.f(str2);
        Q();
        R();
        try {
            H0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final zzpj t0(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        zzls zzlsVar;
        zzic zzicVar = (zzic) this.b;
        if (TextUtils.isEmpty(str2)) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.n.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.B0(zzib.F(), bArr);
            zzls[] values = zzls.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    zzlsVar = zzls.UNKNOWN;
                    break;
                }
                zzlsVar = values[i4];
                if (zzlsVar.a == i2) {
                    break;
                }
                i4++;
            }
            if (zzlsVar != zzls.GOOGLE_SIGNAL && zzlsVar != zzls.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((zzib) zzhzVar.b).y()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((zzid) it.next()).q();
                    zzicVar2.k();
                    ((zzid) zzicVar2.b).d1(i3);
                    arrayList.add((zzid) zzicVar2.m());
                }
                zzhzVar.k();
                ((zzib) zzhzVar.b).K();
                zzhzVar.k();
                ((zzib) zzhzVar.b).J(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    String str4 = split[i5];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split(U3.j.b, 2);
                    if (split2.length != 2) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i5++;
                }
            }
            return new zzpj(j2, (zzib) zzhzVar.m(), str2, hashMap, zzlsVar, j3, j4, j5, i3);
        } catch (IOException e) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.g.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String u0() {
        ((zzic) this.b).k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l2 = (Long) zzfy.S.a(null);
        l2.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l2 + ")";
        String l3 = lnb.l(((Long) zzfy.R.a(null)).longValue(), ")", ljg.o("(upload_type != 1 AND ABS(creation_timestamp - ", currentTimeMillis, ") > "));
        StringBuilder sb = new StringBuilder(wt3.B(str.length(), 5, l3.length(), 1));
        bf3.v(sb, "(", str, " OR ", l3);
        sb.append(")");
        return sb.toString();
    }

    public final void w0(String str, zzjl zzjlVar) {
        Preconditions.i(str);
        Preconditions.i(zzjlVar);
        Q();
        R();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("consent_state", zzjlVar.g());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.b));
        p0(contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List x0(String str) {
        ArrayList arrayList;
        String string;
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase H0 = H0();
            H0.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = H0.query("diagnostic_signals", new String[]{"signal_name", TtmlNode.TAG_METADATA, "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string2 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string = "";
                            } else {
                                string = cursor.getString(1);
                                Preconditions.i(string);
                            }
                            if (string2 == null) {
                                zzgu zzguVar = zzicVar.f;
                                zzic.m(zzguVar);
                                zzguVar.g.b(zzgu.U(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j2 = cursor.getLong(2);
                                zzfa y = zzfb.y();
                                y.k();
                                ((zzfb) y.b).z(string2);
                                y.k();
                                ((zzfb) y.b).C(j2);
                                y.k();
                                ((zzfb) y.b).B(string);
                                if (isEmpty) {
                                    y.k();
                                    ((zzfb) y.b).A();
                                }
                                arrayList2.add((zzfb) y.m());
                            }
                        } while (cursor.moveToNext());
                        H0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        H0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        H0.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.c(zzgu.U(str), e, "Error querying or deleting diagnostic signals. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                H0.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                H0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.g.c(zzgu.U(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void y0(String str, zzjl zzjlVar) {
        Preconditions.i(str);
        Q();
        R();
        w0(str, k0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.g());
        p0(contentValues);
    }

    public final zzjl z0(String str) {
        Preconditions.i(str);
        Q();
        R();
        return zzjl.c(100, o0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }
}
