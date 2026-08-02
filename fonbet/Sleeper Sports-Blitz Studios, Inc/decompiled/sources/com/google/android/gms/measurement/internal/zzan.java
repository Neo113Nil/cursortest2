package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.collection.SieveCacheKt;
import androidx.room.util.CursorUtil$wrapMappedColumns$2;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzin;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzan extends zznb {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {App.JsonKeys.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", MetricsUnit.Duration.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzat zzl;
    private final zzmv zzm;

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzfw.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznb
    protected final boolean zzc() {
        return false;
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzfw.zza(str), e);
            return 0L;
        }
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzfn.zzj zzjVar) throws IOException {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzy());
        byte[] zzbx = zzjVar.zzbx();
        long zza2 = g_().zza(zzbx);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.zzy());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzbx);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzfw.zza(zzjVar.zzy()), e);
            throw e;
        }
    }

    protected final long zzb(String str, String str2) {
        long zza2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j = 0;
        try {
            try {
                zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzfw.zza(str), str2);
                        return -1L;
                    }
                    zza2 = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + zza2));
                if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzj().zzg().zza("Failed to update column (got 0). appId", zzfw.zza(str), str2);
                    return -1L;
                }
                e_.setTransactionSuccessful();
                return zza2;
            } catch (SQLiteException e2) {
                long j2 = zza2;
                e = e2;
                j = j2;
                zzj().zzg().zza("Error inserting column. appId", zzfw.zza(str), str2, e);
                return j;
            }
        } finally {
            e_.endTransaction();
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0088: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:33:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzd(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzt();
        zzak();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        zzfn.zze zzeVar = (zzfn.zze) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zze.zza) zznp.zza(zzfn.zze.zze(), cursor.getBlob(0))).zzag());
                        g_();
                        Bundle zza2 = zznp.zza(zzeVar.zzh());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zza2;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzfw.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:33:0x008e */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzfn.zze, Long> zza(String str, Long l) {
        Cursor cursor;
        Cursor cursor2;
        zzt();
        zzak();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("Main event not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        Pair<zzfn.zze, Long> create = Pair.create((zzfn.zze) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zze.zza) zznp.zza(zzfn.zze.zze(), cursor.getBlob(0))).zzag()), Long.valueOf(cursor.getLong(1)));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return create;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge main event. appId, eventId", zzfw.zza(str), l, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting main event", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x039a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:131:0x039a */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0336 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0365 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TRY_LEAVE, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02eb A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d0 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0253 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029d A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c1 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0311 A[Catch: SQLiteException -> 0x037c, all -> 0x0399, TryCatch #1 {all -> 0x0399, blocks: (B:5:0x007b, B:11:0x0087, B:13:0x0099, B:15:0x00a5, B:17:0x00ba, B:19:0x00c8, B:21:0x00d4, B:23:0x00ea, B:25:0x012c, B:29:0x0136, B:32:0x0180, B:34:0x01af, B:38:0x01b9, B:41:0x01d4, B:43:0x01df, B:44:0x01f1, B:46:0x01f7, B:48:0x0203, B:50:0x020f, B:52:0x0215, B:54:0x0221, B:56:0x022f, B:57:0x0238, B:59:0x023e, B:61:0x024a, B:63:0x0253, B:65:0x025b, B:68:0x0264, B:70:0x027c, B:72:0x0285, B:74:0x029d, B:76:0x02a9, B:77:0x02bb, B:79:0x02c1, B:81:0x02cd, B:83:0x02d5, B:86:0x02de, B:88:0x02e1, B:91:0x02f6, B:93:0x0311, B:95:0x031d, B:98:0x0327, B:99:0x032a, B:101:0x0336, B:103:0x033e, B:104:0x0349, B:106:0x0351, B:107:0x035c, B:109:0x0365, B:114:0x02eb, B:117:0x02f2, B:118:0x01d0, B:120:0x017b, B:122:0x00e2, B:123:0x00b3, B:125:0x0382), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzf zze(String str) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        boolean z2;
        Boolean valueOf;
        String string;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", App.JsonKeys.APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", MetricsUnit.Duration.DAY, "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzf zzfVar = new zzf(this.zzf.zzk(), str);
                    if (!com.google.android.gms.internal.measurement.zznh.zza() || !zze().zza(zzbh.zzdc) || this.zzf.zzb(str).zza(zzin.zza.ANALYTICS_STORAGE)) {
                        zzfVar.zzb(cursor.getString(0));
                    }
                    zzfVar.zzf(cursor.getString(1));
                    if (!com.google.android.gms.internal.measurement.zznh.zza() || !zze().zza(zzbh.zzdc) || this.zzf.zzb(str).zza(zzin.zza.AD_STORAGE)) {
                        zzfVar.zzh(cursor.getString(2));
                    }
                    zzfVar.zzq(cursor.getLong(3));
                    zzfVar.zzr(cursor.getLong(4));
                    zzfVar.zzp(cursor.getLong(5));
                    zzfVar.zzd(cursor.getString(6));
                    zzfVar.zzc(cursor.getString(7));
                    zzfVar.zzn(cursor.getLong(8));
                    zzfVar.zzk(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z = false;
                        zzfVar.zzb(z);
                        zzfVar.zzj(cursor.getLong(11));
                        zzfVar.zzh(cursor.getLong(12));
                        zzfVar.zzg(cursor.getLong(13));
                        zzfVar.zze(cursor.getLong(14));
                        zzfVar.zzd(cursor.getLong(15));
                        zzfVar.zzm(cursor.getLong(16));
                        zzfVar.zzb(!cursor.isNull(17) ? SieveCacheKt.NodeMetaAndPreviousMask : cursor.getInt(17));
                        zzfVar.zze(cursor.getString(18));
                        zzfVar.zzf(cursor.getLong(19));
                        zzfVar.zzi(cursor.getLong(20));
                        zzfVar.zzg(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z2 = false;
                            zzfVar.zza(z2);
                            zzfVar.zza(cursor.getString(24));
                            zzfVar.zzl(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                            if (!cursor.isNull(26)) {
                                zzfVar.zza(Arrays.asList(cursor.getString(26).split(",", -1)));
                            }
                            if (zzpi.zza() && ((zze().zze(str, zzbh.zzbt) || zze().zza(zzbh.zzbs)) && (!com.google.android.gms.internal.measurement.zznh.zza() || !zze().zza(zzbh.zzdc) || this.zzf.zzb(str).zza(zzin.zza.ANALYTICS_STORAGE)))) {
                                zzfVar.zzj(cursor.getString(28));
                            }
                            if (zzpo.zza() && zze().zza(zzbh.zzbu)) {
                                zzq();
                                if (zznt.zzf(str)) {
                                    zzfVar.zzc((cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true);
                                    zzfVar.zzo(cursor.getLong(39));
                                    if (zze().zza(zzbh.zzbv)) {
                                        zzfVar.zzk(cursor.getString(36));
                                    }
                                }
                            }
                            zzfVar.zzt(cursor.getLong(30));
                            zzfVar.zzs(cursor.getLong(31));
                            if (zzpd.zza() && zze().zze(str, zzbh.zzcb)) {
                                zzfVar.zza(cursor.getInt(32));
                                zzfVar.zzc(cursor.getLong(35));
                            }
                            if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zze(str, zzbh.zzcn)) {
                                zzfVar.zzd(cursor.isNull(33) && cursor.getInt(33) != 0);
                            }
                            if (cursor.isNull(34)) {
                                valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
                            } else {
                                valueOf = null;
                            }
                            zzfVar.zza(valueOf);
                            zzfVar.zzc(cursor.getInt(37));
                            zzfVar.zzb(cursor.getInt(38));
                            if (com.google.android.gms.internal.measurement.zznb.zza() && zze().zze(str, zzbh.zzcw)) {
                                string = cursor.getString(40);
                                if (string == null) {
                                    string = "";
                                }
                                zzfVar.zzi(string);
                            }
                            if (zze().zza(zzbh.zzcz)) {
                                if (!cursor.isNull(41)) {
                                    zzfVar.zza(Long.valueOf(cursor.getLong(41)));
                                }
                                if (!cursor.isNull(42)) {
                                    zzfVar.zzb(Long.valueOf(cursor.getLong(42)));
                                }
                            }
                            zzfVar.zzao();
                            if (cursor.moveToNext()) {
                                zzj().zzg().zza("Got multiple records for app, expected one. appId", zzfw.zza(str));
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return zzfVar;
                        }
                        z2 = true;
                        zzfVar.zza(z2);
                        zzfVar.zza(cursor.getString(24));
                        zzfVar.zzl(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                        }
                        if (zzpi.zza()) {
                            zzfVar.zzj(cursor.getString(28));
                        }
                        if (zzpo.zza()) {
                            zzq();
                            if (zznt.zzf(str)) {
                            }
                        }
                        zzfVar.zzt(cursor.getLong(30));
                        zzfVar.zzs(cursor.getLong(31));
                        if (zzpd.zza()) {
                            zzfVar.zza(cursor.getInt(32));
                            zzfVar.zzc(cursor.getLong(35));
                        }
                        if (com.google.android.gms.internal.measurement.zznm.zza()) {
                            zzfVar.zzd(cursor.isNull(33) && cursor.getInt(33) != 0);
                        }
                        if (cursor.isNull(34)) {
                        }
                        zzfVar.zza(valueOf);
                        zzfVar.zzc(cursor.getInt(37));
                        zzfVar.zzb(cursor.getInt(38));
                        if (com.google.android.gms.internal.measurement.zznb.zza()) {
                            string = cursor.getString(40);
                            if (string == null) {
                            }
                            zzfVar.zzi(string);
                        }
                        if (zze().zza(zzbh.zzcz)) {
                        }
                        zzfVar.zzao();
                        if (cursor.moveToNext()) {
                        }
                        if (cursor != null) {
                        }
                        return zzfVar;
                    }
                    z = true;
                    zzfVar.zzb(z);
                    zzfVar.zzj(cursor.getLong(11));
                    zzfVar.zzh(cursor.getLong(12));
                    zzfVar.zzg(cursor.getLong(13));
                    zzfVar.zze(cursor.getLong(14));
                    zzfVar.zzd(cursor.getLong(15));
                    zzfVar.zzm(cursor.getLong(16));
                    zzfVar.zzb(!cursor.isNull(17) ? SieveCacheKt.NodeMetaAndPreviousMask : cursor.getInt(17));
                    zzfVar.zze(cursor.getString(18));
                    zzfVar.zzf(cursor.getLong(19));
                    zzfVar.zzi(cursor.getLong(20));
                    zzfVar.zzg(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z2 = false;
                        zzfVar.zza(z2);
                        zzfVar.zza(cursor.getString(24));
                        zzfVar.zzl(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                        }
                        if (zzpi.zza()) {
                        }
                        if (zzpo.zza()) {
                        }
                        zzfVar.zzt(cursor.getLong(30));
                        zzfVar.zzs(cursor.getLong(31));
                        if (zzpd.zza()) {
                        }
                        if (com.google.android.gms.internal.measurement.zznm.zza()) {
                        }
                        if (cursor.isNull(34)) {
                        }
                        zzfVar.zza(valueOf);
                        zzfVar.zzc(cursor.getInt(37));
                        zzfVar.zzb(cursor.getInt(38));
                        if (com.google.android.gms.internal.measurement.zznb.zza()) {
                        }
                        if (zze().zza(zzbh.zzcz)) {
                        }
                        zzfVar.zzao();
                        if (cursor.moveToNext()) {
                        }
                        if (cursor != null) {
                        }
                        return zzfVar;
                    }
                    z2 = true;
                    zzfVar.zza(z2);
                    zzfVar.zza(cursor.getString(24));
                    zzfVar.zzl(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                    if (!cursor.isNull(26)) {
                    }
                    if (zzpi.zza()) {
                    }
                    if (zzpo.zza()) {
                    }
                    zzfVar.zzt(cursor.getLong(30));
                    zzfVar.zzs(cursor.getLong(31));
                    if (zzpd.zza()) {
                    }
                    if (com.google.android.gms.internal.measurement.zznm.zza()) {
                    }
                    if (cursor.isNull(34)) {
                    }
                    zzfVar.zza(valueOf);
                    zzfVar.zzc(cursor.getInt(37));
                    zzfVar.zzb(cursor.getInt(38));
                    if (com.google.android.gms.internal.measurement.zznb.zza()) {
                    }
                    if (zze().zza(zzbh.zzcz)) {
                    }
                    zzfVar.zzao();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return zzfVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying app. appId", zzfw.zza(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
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
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0117: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:39:0x0117 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzc(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().query("conditional_properties", new String[]{"origin", "value", "active", AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
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
                    Object zza2 = zza(cursor, 1);
                    boolean z = cursor.getInt(2) != 0;
                    String string2 = cursor.getString(3);
                    long j = cursor.getLong(4);
                    str3 = str2;
                    try {
                        zzac zzacVar = new zzac(str, str4, new zzno(str3, cursor.getLong(8), zza2, str4), cursor.getLong(6), z, string2, (zzbf) g_().zza(cursor.getBlob(5), zzbf.CREATOR), j, (zzbf) g_().zza(cursor.getBlob(7), zzbf.CREATOR), cursor.getLong(9), (zzbf) g_().zza(cursor.getBlob(10), zzbf.CREATOR));
                        if (cursor.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for conditional property, expected one", zzfw.zza(str), zzi().zzc(str3));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzacVar;
                    } catch (SQLiteException e) {
                        e = e;
                        zzj().zzg().zza("Error querying conditional property", zzfw.zza(str), zzi().zzc(str3), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
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
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x008c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zzf(String str) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    byte[] blob = cursor.getBlob(0);
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(2);
                    if (cursor.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzfw.zza(str));
                    }
                    if (blob == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzap zzapVar = new zzap(blob, string, string2);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzapVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying remote config. appId", zzfw.zza(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 == null) {
                    cursor3.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 == null) {
            }
        }
    }

    public final zzao zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6);
    }

    public final zzao zza(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        String[] strArr = {str};
        zzao zzaoVar = new zzao();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase e_ = e_();
                Cursor query = e_.query("apps", new String[]{MetricsUnit.Duration.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzfw.zza(str));
                    if (query != null) {
                        query.close();
                        return zzaoVar;
                    }
                } else {
                    if (query.getLong(0) == j) {
                        zzaoVar.zzb = query.getLong(1);
                        zzaoVar.zza = query.getLong(2);
                        zzaoVar.zzc = query.getLong(3);
                        zzaoVar.zzd = query.getLong(4);
                        zzaoVar.zze = query.getLong(5);
                        zzaoVar.zzf = query.getLong(6);
                    }
                    if (z) {
                        zzaoVar.zzb += j2;
                    }
                    if (z2) {
                        zzaoVar.zza += j2;
                    }
                    if (z3) {
                        zzaoVar.zzc += j2;
                    }
                    if (z4) {
                        zzaoVar.zzd += j2;
                    }
                    if (z5) {
                        zzaoVar.zze += j2;
                    }
                    if (z6) {
                        zzaoVar.zzf += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzaoVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzaoVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzaoVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzaoVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzaoVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaoVar.zzf));
                    e_.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                        return zzaoVar;
                    }
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error updating daily counts. appId", zzfw.zza(str), e);
                if (0 != 0) {
                    cursor.close();
                }
            }
            return zzaoVar;
        } finally {
        }
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzbb zzc(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzt();
        zzak();
        CursorUtil$wrapMappedColumns$2 cursorUtil$wrapMappedColumns$2 = 0;
        try {
            try {
                cursor = e_().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    long j2 = cursor.getLong(1);
                    long j3 = cursor.getLong(2);
                    long j4 = 0;
                    long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                    Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                    Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                    Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                    if (cursor.isNull(7)) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(cursor.getLong(7) == 1);
                    }
                    if (!cursor.isNull(8)) {
                        j4 = cursor.getLong(8);
                    }
                    zzbb zzbbVar = new zzbb(str2, str3, j, j2, j4, j3, j5, valueOf, valueOf2, valueOf3, bool);
                    if (cursor.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzfw.zza(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzbbVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying events. appId", zzfw.zza(str2), zzi().zza(str3), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursorUtil$wrapMappedColumns$2 = "current_bundle_count";
                if (cursorUtil$wrapMappedColumns$2 != 0) {
                    cursorUtil$wrapMappedColumns$2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursorUtil$wrapMappedColumns$2 != 0) {
            }
            throw th;
        }
    }

    public final zzin zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        return zzin.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzin zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        zzin zzinVar = (zzin) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzaq() { // from class: com.google.android.gms.measurement.internal.zzam
            @Override // com.google.android.gms.measurement.internal.zzaq
            public final Object zza(Cursor cursor) {
                zzin zza2;
                zza2 = zzin.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zzinVar == null ? zzin.zza : zzinVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zznq zze(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        Cursor cursor2 = null;
        try {
            cursor = e_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zza2 = zza(cursor, 1);
                    if (zza2 == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zznq zznqVar = new zznq(str3, cursor.getString(2), str4, j, zza2);
                        if (cursor.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzfw.zza(str3));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zznqVar;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        zzj().zzg().zza("Error querying user property. appId", zzfw.zza(str3), zzi().zzc(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T zza(String str, String[] strArr, zzaq<T> zzaqVar) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("No data found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    T zza2 = zzaqVar.zza(cursor);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zza2;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying database.", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(long j) {
        Cursor cursor;
        zzt();
        zzak();
        Cursor cursor2 = null;
        try {
            try {
                cursor = e_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("No expired configs for apps with pending events");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error selecting expired configs", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = j;
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
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f_() {
        Throwable th;
        Cursor cursor;
        try {
            cursor = e_().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x016c, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<zzfn.zzj, Long>> zza(String str, int i, int i2) {
        byte[] zzc2;
        long j;
        long j2;
        zzt();
        zzak();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzfn.zzj, Long>> list = Collections.EMPTY_LIST;
                    if (query != null) {
                        query.close();
                    }
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (true) {
                    long j3 = query.getLong(0);
                    try {
                        zzc2 = g_().zzc(query.getBlob(i3));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzfw.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzc2.length + i4 > i2) {
                        break;
                    }
                    try {
                        zzfn.zzj.zza zzaVar = (zzfn.zzj.zza) zznp.zza(zzfn.zzj.zzv(), zzc2);
                        if (!arrayList.isEmpty()) {
                            zzfn.zzj zzjVar = (zzfn.zzj) ((Pair) arrayList.get(0)).first;
                            zzfn.zzj zzjVar2 = (zzfn.zzj) ((com.google.android.gms.internal.measurement.zzjk) zzaVar.zzag());
                            if (!zzjVar.zzad().equals(zzjVar2.zzad()) || !zzjVar.zzac().equals(zzjVar2.zzac()) || zzjVar.zzat() != zzjVar2.zzat() || !zzjVar.zzae().equals(zzjVar2.zzae())) {
                                break;
                            }
                            Iterator<zzfn.zzn> it = zzjVar.zzar().iterator();
                            while (true) {
                                j = -1;
                                if (!it.hasNext()) {
                                    j2 = -1;
                                    break;
                                }
                                zzfn.zzn next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    j2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfn.zzn> it2 = zzjVar2.zzar().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfn.zzn next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    j = next2.zzc();
                                    break;
                                }
                            }
                            if (j2 != j) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i4 += zzc2.length;
                        arrayList.add(Pair.create((zzfn.zzj) ((com.google.android.gms.internal.measurement.zzjk) zzaVar.zzag()), Long.valueOf(j3)));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzfw.zza(str), e2);
                    }
                    if (!query.moveToNext() || i4 > i2) {
                        break;
                    }
                    i3 = 1;
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying bundles. appId", zzfw.zza(str), e3);
                List<Pair<zzfn.zzj, Long>> list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzac> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0052, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0063, code lost:
    
        r22 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzac> zza(String str, String[] strArr) {
        Cursor cursor;
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            try {
                cursor2 = e_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
                try {
                    if (cursor2.moveToFirst()) {
                        while (true) {
                            if (arrayList.size() >= 1000) {
                                break;
                            }
                            String string = cursor2.getString(0);
                            String string2 = cursor2.getString(1);
                            String string3 = cursor2.getString(2);
                            Object zza2 = zza(cursor2, 3);
                            boolean z = cursor2.getInt(4) != 0;
                            String string4 = cursor2.getString(5);
                            long j = cursor2.getLong(6);
                            zzbf zzbfVar = (zzbf) g_().zza(cursor2.getBlob(7), zzbf.CREATOR);
                            long j2 = cursor2.getLong(8);
                            zzbf zzbfVar2 = (zzbf) g_().zza(cursor2.getBlob(9), zzbf.CREATOR);
                            long j3 = cursor2.getLong(10);
                            cursor = cursor2;
                            try {
                                arrayList.add(new zzac(string, string2, new zzno(string3, j3, zza2, string2), j2, z, string4, zzbfVar, j, zzbfVar2, cursor2.getLong(11), (zzbf) g_().zza(cursor2.getBlob(12), zzbf.CREATOR)));
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                                cursor2 = cursor;
                            } catch (SQLiteException e) {
                                e = e;
                                cursor2 = cursor;
                                zzj().zzg().zza("Error querying conditional user property value", e);
                                List<zzac> list = Collections.EMPTY_LIST;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                return list;
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else if (cursor2 != null) {
                        cursor2.close();
                        return arrayList;
                    }
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final List<zzmu> zzj(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzmu(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzfw.zza(str), e);
                List<zzmu> list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } finally {
        }
    }

    public final List<zznq> zzk(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursor.getLong(2);
                        Object zza2 = zza(cursor, 3);
                        if (zza2 == null) {
                            zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzfw.zza(str));
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new zznq(str2, str3, string, j, zza2));
                            } catch (SQLiteException e) {
                                e = e;
                                zzj().zzg().zza("Error querying user properties. appId", zzfw.zza(str2), e);
                                List<zznq> list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return list;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str = str2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                str2 = str;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zznq> zzb(String str, String str2, String str3) {
        zzan zzanVar;
        String str4;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                try {
                    ArrayList arrayList2 = new ArrayList(3);
                    String str5 = str;
                    arrayList2.add(str5);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            zzanVar = this;
                            zzanVar.zzj().zzg().zza("(2)Error querying user properties", zzfw.zza(str), str4, e);
                            List<zznq> list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    cursor = e_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                    if (cursor.moveToFirst()) {
                        while (true) {
                            if (arrayList.size() >= 1000) {
                                break;
                            }
                            String string = cursor.getString(0);
                            long j = cursor.getLong(1);
                            zzanVar = this;
                            try {
                                Object zza2 = zzanVar.zza(cursor, 2);
                                str4 = cursor.getString(3);
                                if (zza2 == null) {
                                    zzanVar.zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzfw.zza(str5), str4, str3);
                                } else {
                                    arrayList.add(new zznq(str5, str4, string, j, zza2));
                                }
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                                str5 = str;
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzanVar.zzj().zzg().zza("(2)Error querying user properties", zzfw.zza(str), str4, e);
                                List<zznq> list2 = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return list2;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else if (cursor != null) {
                        cursor.close();
                        return arrayList;
                    }
                    return arrayList;
                } catch (SQLiteException e3) {
                    e = e3;
                    zzanVar = this;
                    str4 = str2;
                }
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    final Map<Integer, zzfn.zzl> zzl(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfn.zzl> map = Collections.EMPTY_MAP;
                    if (query != null) {
                        query.close();
                    }
                    return map;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzfn.zzl) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zzl.zza) zznp.zza(zzfn.zzl.zze(), query.getBlob(1))).zzag()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfw.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzfw.zza(str), e2);
                Map<Integer, zzfn.zzl> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzff.zzb>> zzm(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zzb>> map = Collections.EMPTY_MAP;
                    if (query != null) {
                        query.close();
                    }
                    return map;
                }
                do {
                    try {
                        zzff.zzb zzbVar = (zzff.zzb) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zzb.zza) zznp.zza(zzff.zzb.zzc(), query.getBlob(1))).zzag());
                        if (zzbVar.zzk()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
                Map<Integer, List<zzff.zzb>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzff.zzb>> zzf(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zzb>> map = Collections.EMPTY_MAP;
                    if (query != null) {
                        query.close();
                    }
                    return map;
                }
                do {
                    try {
                        zzff.zzb zzbVar = (zzff.zzb) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zzb.zza) zznp.zza(zzff.zzb.zzc(), query.getBlob(1))).zzag());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } finally {
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
            Map<Integer, List<zzff.zzb>> map2 = Collections.EMPTY_MAP;
            if (0 != 0) {
                cursor.close();
            }
            return map2;
        }
    }

    final Map<Integer, List<zzff.zze>> zzg(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zze>> map = Collections.EMPTY_MAP;
                    if (query != null) {
                        query.close();
                    }
                    return map;
                }
                do {
                    try {
                        zzff.zze zzeVar = (zzff.zze) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zze.zza) zznp.zza(zzff.zze.zzc(), query.getBlob(1))).zzag());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } finally {
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
            Map<Integer, List<zzff.zze>> map2 = Collections.EMPTY_MAP;
            if (0 != 0) {
                cursor.close();
            }
            return map2;
        }
    }

    final Map<Integer, List<Integer>> zzn(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return map;
                }
                do {
                    int i = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzfw.zza(str), e);
                Map<Integer, List<Integer>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    zzan(zznc zzncVar) {
        super(zzncVar);
        this.zzm = new zzmv(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
    }

    public final void zzp() {
        zzak();
        e_().beginTransaction();
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzfw.zza(str2), e);
        }
    }

    public final void zzo(String str) {
        zzbb zzd2;
        zzi("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzfw.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } finally {
        }
    }

    public final void zzu() {
        zzak();
        e_().endTransaction();
    }

    final void zza(List<Long> list) {
        zzt();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzan()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzv() {
        int delete;
        zzt();
        zzak();
        if (zzan()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzbh.zzy.zza(null).longValue()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzak();
                if (!zzan() || (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzae.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzfw.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp(String str) {
        boolean z;
        zzbb zzc2;
        List singletonList = Collections.singletonList("name");
        zzbb zzd2 = zzd(str, "_f");
        zzbb zzd3 = zzd(str, "_v");
        zzi("events", str);
        boolean z2 = false;
        Cursor cursor = null;
        try {
            cursor = e_().query("events_snapshot", (String[]) singletonList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                if (zzd2 != null) {
                    zza("events", zzd2);
                } else if (zzd3 != null) {
                    zza("events", zzd3);
                }
                zzi("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursor.getString(0);
                    if ("_f".equals(string)) {
                        z3 = true;
                    } else if ("_v".equals(string)) {
                        z = true;
                    }
                    if (string != null && (zzc2 = zzc("events_snapshot", str, string)) != null) {
                        zza("events", zzc2);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().zzg().zza("Error querying snapshot. appId", zzfw.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (!z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzi("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzi("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    if (cursor != null) {
                    }
                    if (z2) {
                    }
                    if (!z) {
                        zza("events", zzd3);
                    }
                    zzi("events_snapshot", str);
                    throw th;
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            if (!z3 && zzd2 != null) {
                zza("events", zzd2);
            } else if (!z && zzd3 != null) {
                zza("events", zzd3);
            }
            zzi("events_snapshot", str);
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    final void zza(String str, List<zzff.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzff.zza.C0056zza zzca = list.get(i).zzca();
            if (zzca.zza() != 0) {
                for (int i2 = 0; i2 < zzca.zza(); i2++) {
                    zzff.zzb.zza zzca2 = zzca.zza(i2).zzca();
                    zzff.zzb.zza zzaVar = (zzff.zzb.zza) ((zzjk.zza) zzca2.clone());
                    String zzb2 = zzir.zzb(zzca2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzca2.zza(); i3++) {
                        zzff.zzc zza2 = zzca2.zza(i3);
                        String zza3 = zzit.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzff.zzc) ((com.google.android.gms.internal.measurement.zzjk) zza2.zzca().zza(zza3).zzag()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzca = zzca.zza(i2, zzaVar);
                        list.set(i, (zzff.zza) ((com.google.android.gms.internal.measurement.zzjk) zzca.zzag()));
                    }
                }
            }
            if (zzca.zzb() != 0) {
                for (int i4 = 0; i4 < zzca.zzb(); i4++) {
                    zzff.zze zzb3 = zzca.zzb(i4);
                    String zza4 = zzis.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzca = zzca.zza(i4, zzb3.zzca().zza(zza4));
                        list.set(i, (zzff.zza) ((com.google.android.gms.internal.measurement.zzjk) zzca.zzag()));
                    }
                }
            }
        }
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzak();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str});
            e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzff.zza zzaVar2 : list) {
                zzak();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzfw.zza(str));
                } else {
                    int zza5 = zzaVar2.zza();
                    Iterator<zzff.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfw.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzff.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfw.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzff.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzff.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzff.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
        } finally {
            e_.endTransaction();
        }
    }

    public final void zzw() {
        zzak();
        e_().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0043, code lost:
    
        if (r7.zzf.zzb(r0).zza(com.google.android.gms.measurement.internal.zzin.zza.ANALYTICS_STORAGE) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzf zzfVar, boolean z, boolean z2) {
        List<String> zzan;
        SQLiteDatabase e_;
        Preconditions.checkNotNull(zzfVar);
        zzt();
        zzak();
        String zzac = zzfVar.zzac();
        Preconditions.checkNotNull(zzac);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzac);
        try {
            if (com.google.android.gms.internal.measurement.zznh.zza() && zze().zza(zzbh.zzdc)) {
                if (z) {
                    contentValues.put("app_instance_id", (String) null);
                }
                contentValues.put("gmp_app_id", zzfVar.zzah());
                if (com.google.android.gms.internal.measurement.zznh.zza() || !zze().zza(zzbh.zzdc) || this.zzf.zzb(zzac).zza(zzin.zza.AD_STORAGE)) {
                    contentValues.put("resettable_device_id_hash", zzfVar.zzaj());
                }
                contentValues.put("last_bundle_index", Long.valueOf(zzfVar.zzt()));
                contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzfVar.zzu()));
                contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzfVar.zzs()));
                contentValues.put(App.JsonKeys.APP_VERSION, zzfVar.zzaf());
                contentValues.put("app_store", zzfVar.zzae());
                contentValues.put("gmp_version", Long.valueOf(zzfVar.zzq()));
                contentValues.put("dev_cert_hash", Long.valueOf(zzfVar.zzn()));
                contentValues.put("measurement_enabled", Boolean.valueOf(zzfVar.zzar()));
                contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(zzfVar.zzm()));
                contentValues.put("daily_public_events_count", Long.valueOf(zzfVar.zzk()));
                contentValues.put("daily_events_count", Long.valueOf(zzfVar.zzj()));
                contentValues.put("daily_conversions_count", Long.valueOf(zzfVar.zzh()));
                contentValues.put("config_fetched_time", Long.valueOf(zzfVar.zzg()));
                contentValues.put("failed_config_fetch_time", Long.valueOf(zzfVar.zzp()));
                contentValues.put("app_version_int", Long.valueOf(zzfVar.zze()));
                contentValues.put("firebase_instance_id", zzfVar.zzag());
                contentValues.put("daily_error_events_count", Long.valueOf(zzfVar.zzi()));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzfVar.zzl()));
                contentValues.put("health_monitor_sample", zzfVar.zzai());
                contentValues.put("android_id", Long.valueOf(zzfVar.zzd()));
                contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzfVar.zzaq()));
                contentValues.put("admob_app_id", zzfVar.zzaa());
                contentValues.put("dynamite_version", Long.valueOf(zzfVar.zzo()));
                if (com.google.android.gms.internal.measurement.zznh.zza() || !zze().zza(zzbh.zzdc) || this.zzf.zzb(zzac).zza(zzin.zza.ANALYTICS_STORAGE)) {
                    contentValues.put("session_stitching_token", zzfVar.zzal());
                }
                contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzfVar.zzat()));
                contentValues.put("target_os_version", Long.valueOf(zzfVar.zzw()));
                contentValues.put("session_stitching_token_hash", Long.valueOf(zzfVar.zzv()));
                if (zzpd.zza() && zze().zze(zzac, zzbh.zzcb)) {
                    contentValues.put("ad_services_version", Integer.valueOf(zzfVar.zza()));
                    contentValues.put("attribution_eligibility_status", Long.valueOf(zzfVar.zzf()));
                }
                if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zze(zzac, zzbh.zzcn)) {
                    contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzfVar.zzau()));
                }
                contentValues.put("npa_metadata_value", zzfVar.zzx());
                if (zzpo.zza() && zze().zze(zzac, zzbh.zzbu)) {
                    zzq();
                    if (zznt.zzf(zzac)) {
                        contentValues.put("bundle_delivery_index", Long.valueOf(zzfVar.zzr()));
                    }
                }
                if (zzpo.zza() && zze().zze(zzac, zzbh.zzbv)) {
                    contentValues.put("sgtm_preview_key", zzfVar.zzam());
                }
                contentValues.put("dma_consent_state", Integer.valueOf(zzfVar.zzc()));
                contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzfVar.zzb()));
                if (com.google.android.gms.internal.measurement.zznb.zza() && zze().zze(zzac, zzbh.zzcw)) {
                    contentValues.put("serialized_npa_metadata", zzfVar.zzak());
                }
                zzan = zzfVar.zzan();
                if (zzan != null) {
                    if (zzan.isEmpty()) {
                        zzj().zzu().zza("Safelisted events should not be an empty list. appId", zzac);
                    } else {
                        contentValues.put("safelisted_events", TextUtils.join(",", zzan));
                    }
                }
                if (com.google.android.gms.internal.measurement.zznt.zza() && zze().zza(zzbh.zzbq) && !contentValues.containsKey("safelisted_events")) {
                    contentValues.put("safelisted_events", (String) null);
                }
                if (zze().zza(zzbh.zzcz)) {
                    contentValues.put("unmatched_pfo", zzfVar.zzy());
                    contentValues.put("unmatched_uwa", zzfVar.zzz());
                }
                e_ = e_();
                if (e_.update("apps", contentValues, "app_id = ?", new String[]{zzac}) == 0 || e_.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                    return;
                }
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzfw.zza(zzac));
                return;
            }
            e_ = e_();
            if (e_.update("apps", contentValues, "app_id = ?", new String[]{zzac}) == 0) {
                return;
            } else {
                return;
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing app. appId", zzfw.zza(zzac), e);
            return;
        }
        contentValues.put("app_instance_id", zzfVar.zzad());
        contentValues.put("gmp_app_id", zzfVar.zzah());
        if (com.google.android.gms.internal.measurement.zznh.zza()) {
        }
        contentValues.put("resettable_device_id_hash", zzfVar.zzaj());
        contentValues.put("last_bundle_index", Long.valueOf(zzfVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzfVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzfVar.zzs()));
        contentValues.put(App.JsonKeys.APP_VERSION, zzfVar.zzaf());
        contentValues.put("app_store", zzfVar.zzae());
        contentValues.put("gmp_version", Long.valueOf(zzfVar.zzq()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzfVar.zzn()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzfVar.zzar()));
        contentValues.put(MetricsUnit.Duration.DAY, Long.valueOf(zzfVar.zzm()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzfVar.zzk()));
        contentValues.put("daily_events_count", Long.valueOf(zzfVar.zzj()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzfVar.zzh()));
        contentValues.put("config_fetched_time", Long.valueOf(zzfVar.zzg()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzfVar.zzp()));
        contentValues.put("app_version_int", Long.valueOf(zzfVar.zze()));
        contentValues.put("firebase_instance_id", zzfVar.zzag());
        contentValues.put("daily_error_events_count", Long.valueOf(zzfVar.zzi()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzfVar.zzl()));
        contentValues.put("health_monitor_sample", zzfVar.zzai());
        contentValues.put("android_id", Long.valueOf(zzfVar.zzd()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzfVar.zzaq()));
        contentValues.put("admob_app_id", zzfVar.zzaa());
        contentValues.put("dynamite_version", Long.valueOf(zzfVar.zzo()));
        if (com.google.android.gms.internal.measurement.zznh.zza()) {
        }
        contentValues.put("session_stitching_token", zzfVar.zzal());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzfVar.zzat()));
        contentValues.put("target_os_version", Long.valueOf(zzfVar.zzw()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzfVar.zzv()));
        if (zzpd.zza()) {
            contentValues.put("ad_services_version", Integer.valueOf(zzfVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzfVar.zzf()));
        }
        if (com.google.android.gms.internal.measurement.zznm.zza()) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzfVar.zzau()));
        }
        contentValues.put("npa_metadata_value", zzfVar.zzx());
        if (zzpo.zza()) {
            zzq();
            if (zznt.zzf(zzac)) {
            }
        }
        if (zzpo.zza()) {
            contentValues.put("sgtm_preview_key", zzfVar.zzam());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(zzfVar.zzc()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzfVar.zzb()));
        if (com.google.android.gms.internal.measurement.zznb.zza()) {
            contentValues.put("serialized_npa_metadata", zzfVar.zzak());
        }
        zzan = zzfVar.zzan();
        if (zzan != null) {
        }
        if (com.google.android.gms.internal.measurement.zznt.zza()) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zze().zza(zzbh.zzcz)) {
        }
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzak();
        if (zze().zza(zzbh.zzck) && zzi(str) == zzin.zza) {
            zzb(str, zzin.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzbb zzbbVar) {
        zza("events", zzbbVar);
    }

    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbbVar.zza);
        contentValues.put("name", zzbbVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbbVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbbVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbbVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbbVar.zzg));
        contentValues.put("last_bundled_day", zzbbVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbbVar.zzi);
        contentValues.put("last_sampling_rate", zzbbVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbbVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzbbVar.zzk == null || !zzbbVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfw.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzfw.zza(zzbbVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzh().zza("Value of the primary key is not set.", zzfw.zza(str2));
                return;
            }
            if (e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfw.zza(str), zzfw.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzfw.zza(str), zzfw.zza(str2), e);
        }
    }

    public final void zza(String str, zzin zzinVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzinVar);
        zzt();
        zzak();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzinVar.zzh());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zzb(String str, zzin zzinVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzinVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzinVar.zzh());
        contentValues.put("consent_source", Integer.valueOf(zzinVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzaf)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return e_.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean zza(zzfn.zzj zzjVar, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzy());
        Preconditions.checkState(zzjVar.zzbg());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzjVar.zzm() < currentTimeMillis - zzae.zzm() || zzjVar.zzm() > zzae.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfw.zza(zzjVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzjVar.zzm()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzjVar.zzbx());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.zzy());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzm()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzjVar.zzbn()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfw.zza(zzjVar.zzy()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzfw.zza(zzjVar.zzy()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfw.zza(zzjVar.zzy()), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzff.zzb zzbVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfw.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbx = zzbVar.zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzbx);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzfw.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzfw.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzff.zze zzeVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfw.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbx = zzeVar.zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzbx);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzay zzayVar, long j, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzayVar);
        Preconditions.checkNotEmpty(zzayVar.zza);
        byte[] zzbx = g_().zza(zzayVar).zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzayVar.zza);
        contentValues.put("name", zzayVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzayVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzbx);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfw.zza(zzayVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzfw.zza(zzayVar.zza), e);
            return false;
        }
    }

    public final boolean zza(String str, zzmu zzmuVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzmuVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzmuVar.zzb < currentTimeMillis - zzae.zzm() || zzmuVar.zzb > zzae.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfw.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzmuVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmuVar.zza);
        contentValues.put("source", Integer.valueOf(zzmuVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzmuVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzfw.zza(str), e);
            return false;
        }
    }

    private final boolean zzan() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzfn.zze zzeVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzeVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbx = zzeVar.zzbx();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbx);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzt();
        zzak();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzacVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put("active", Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zznt.zza((Parcelable) zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        zzq();
        contentValues.put("triggered_event", zznt.zza((Parcelable) zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        zzq();
        contentValues.put("expired_event", zznt.zza((Parcelable) zzacVar.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfw.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzfw.zza(str), e);
            return true;
        }
    }

    final boolean zza(String str, Bundle bundle) {
        zzt();
        zzak();
        byte[] zzbx = g_().zza(new zzay(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzbx();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbx);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zznq zznqVar) {
        Preconditions.checkNotNull(zznqVar);
        zzt();
        zzak();
        if (zze(zznqVar.zza, zznqVar.zzc) == null) {
            if (zznt.zzh(zznqVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zznqVar.zza}) >= zze().zza(zznqVar.zza, zzbh.zzag, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zznqVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zznqVar.zza, zznqVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zznqVar.zza);
        contentValues.put("origin", zznqVar.zzb);
        contentValues.put("name", zznqVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zznqVar.zzd));
        zza(contentValues, "value", zznqVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfw.zza(zznqVar.zza));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzfw.zza(zznqVar.zza), e);
            return true;
        }
    }
}
