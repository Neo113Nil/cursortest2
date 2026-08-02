package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.room.C2266d;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3357t extends D6 {

    /* renamed from: d, reason: collision with root package name */
    public final C3349s f34286d;

    /* renamed from: e, reason: collision with root package name */
    public final C3380v6 f34287e;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {PublisherMetadata.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C3357t(S6 s62) {
        super(s62);
        this.f34287e = new C3380v6(this.f33578a.e());
        this.f33578a.w();
        this.f34286d = new C3349s(this, this.f33578a.d(), "google_app_measurement.db");
    }

    public static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    public static final void o0(ContentValues contentValues, String str, Object obj) {
        AbstractC3191o.g(EventKeys.VALUE_KEY);
        AbstractC3191o.m(obj);
        if (obj instanceof String) {
            contentValues.put(EventKeys.VALUE_KEY, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(EventKeys.VALUE_KEY, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(EventKeys.VALUE_KEY, (Double) obj);
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(Z6 z62) {
        AbstractC3191o.m(z62);
        h();
        j();
        String str = z62.f33790a;
        String str2 = z62.f33792c;
        if (B0(str, str2) == null) {
            if (b7.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f33578a.w().F(str, AbstractC3209a2.f33844W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long p02 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, z62.f33791b});
                this.f33578a.w();
                if (p02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("origin", z62.f33791b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(z62.f33793d));
        o0(contentValues, EventKeys.VALUE_KEY, z62.f33794e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f33578a.a().o().b("Failed to insert/update user property (got -1). appId", C3392x2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing user property. appId", C3392x2.x(z62.f33790a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z6 B0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("user_attributes", new String[]{"set_timestamp", EventKeys.VALUE_KEY, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j10 = cursor.getLong(0);
                        Object x10 = x(cursor, 1);
                        if (x10 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                Z6 z62 = new Z6(str3, cursor.getString(2), str4, j10, x10);
                                if (cursor.moveToNext()) {
                                    this.f33578a.a().o().b("Got multiple records for user property, expected one. appId", C3392x2.x(str3));
                                }
                                cursor.close();
                                return z62;
                            } catch (SQLiteException e10) {
                                e = e10;
                                sQLiteException = e;
                                C3298l3 c3298l3 = this.f33578a;
                                c3298l3.a().o().d("Error querying user property. appId", C3392x2.x(str3), c3298l3.D().c(str4), sQLiteException);
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
            } catch (SQLiteException e11) {
                e = e11;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
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

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List C0(String str) {
        String str2;
        AbstractC3191o.g(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                C3298l3 c3298l3 = this.f33578a;
                c3298l3.w();
                cursor = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", EventKeys.VALUE_KEY}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursor.getLong(2);
                            Object x10 = x(cursor, 3);
                            if (x10 == null) {
                                c3298l3.a().o().b("Read invalid user property value, ignoring it. appId", C3392x2.x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new Z6(str2, str3, string, j10, x10));
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    this.f33578a.a().o().c("Error querying user properties. appId", C3392x2.x(str2), e);
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
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } catch (SQLiteException e12) {
                e = e12;
                str2 = str;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } finally {
        }
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r0 = r8.a().o();
        r8.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List D0(String str, String str2, String str3) {
        String str4;
        Cursor cursor;
        Cursor cursor2;
        String str5;
        C3298l3 c3298l3;
        String str6;
        AbstractC3191o.g(str);
        h();
        j();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                str5 = str;
                arrayList2.add(str5);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = null;
                        try {
                            this.f33578a.a().o().d("(2)Error querying user properties", C3392x2.x(str), str4, e);
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
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb3.append(str3);
                    sb3.append("*");
                    arrayList2.add(sb3.toString());
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                SQLiteDatabase u02 = u0();
                String[] strArr2 = {"name", "set_timestamp", EventKeys.VALUE_KEY, "origin"};
                String sb4 = sb2.toString();
                c3298l3 = this.f33578a;
                c3298l3.w();
                cursor2 = u02.query("user_attributes", strArr2, sb4, strArr, null, null, "rowid", "1001");
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        while (true) {
                            int size = arrayList.size();
                            c3298l3.w();
                            if (size >= 1000) {
                                break;
                            }
                            String string = cursor2.getString(0);
                            long j10 = cursor2.getLong(1);
                            Object x10 = x(cursor2, 2);
                            String string2 = cursor2.getString(3);
                            if (x10 == null) {
                                try {
                                    c3298l3.a().o().d("(2)Read invalid user property value, ignoring it", C3392x2.x(str5), string2, str3);
                                    str6 = string2;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    str6 = string2;
                                    cursor = cursor2;
                                    str4 = str6;
                                    this.f33578a.a().o().d("(2)Error querying user properties", C3392x2.x(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    return arrayList;
                                }
                            } else {
                                str6 = string2;
                                try {
                                    arrayList.add(new Z6(str5, str6, string, j10, x10));
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor = cursor2;
                                    str4 = str6;
                                    this.f33578a.a().o().d("(2)Error querying user properties", C3392x2.x(str), str4, e);
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
                            str5 = str;
                            str4 = str6;
                        }
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    cursor = cursor2;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
            str4 = str2;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final long E(String str) {
        AbstractC3191o.g(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(zzah zzahVar) {
        AbstractC3191o.m(zzahVar);
        h();
        j();
        String str = zzahVar.f34422a;
        AbstractC3191o.m(str);
        if (B0(str, zzahVar.f34424c.f34451b) == null) {
            long p02 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f33578a.w();
            if (p02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("origin", zzahVar.f34423b);
        contentValues.put("name", zzahVar.f34424c.f34451b);
        o0(contentValues, EventKeys.VALUE_KEY, AbstractC3191o.m(zzahVar.f34424c.g()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(zzahVar.f34426e));
        contentValues.put("trigger_event_name", zzahVar.f34427f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.f34429h));
        C3298l3 c3298l3 = this.f33578a;
        contentValues.put("timed_out_event", c3298l3.C().T(zzahVar.f34428g));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f34425d));
        contentValues.put("triggered_event", c3298l3.C().T(zzahVar.f34430i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f34424c.f34452c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.f34431j));
        contentValues.put("expired_event", c3298l3.C().T(zzahVar.f34432k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c3298l3.a().o().b("Failed to insert/update conditional user property (got -1)", C3392x2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing conditional user property", C3392x2.x(str), e10);
            return true;
        }
    }

    public final boolean F(String str, Long l10, long j10, zzhs zzhsVar) {
        h();
        j();
        AbstractC3191o.m(zzhsVar);
        AbstractC3191o.g(str);
        AbstractC3191o.m(l10);
        C3298l3 c3298l3 = this.f33578a;
        byte[] zzcc = zzhsVar.zzcc();
        c3298l3.a().w().c("Saving complex main event, appId, data size", c3298l3.D().a(str), Integer.valueOf(zzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzcc);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c3298l3.a().o().b("Failed to insert complex main event (got -1). appId", C3392x2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing complex main event. appId", C3392x2.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah F0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        h();
        j();
        Cursor cursor3 = null;
        try {
            try {
                cursor = u0().query("conditional_properties", new String[]{"origin", EventKeys.VALUE_KEY, AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e10) {
                    e = e10;
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
        } catch (SQLiteException e11) {
            e = e11;
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
        Object x10 = x(cursor, 1);
        boolean z10 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j10 = cursor.getLong(4);
        S6 s62 = this.f34418b;
        X6 K02 = s62.K0();
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
        zzbg zzbgVar = (zzbg) K02.N(blob, creator);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpl(str3, cursor.getLong(8), x10, str4), cursor.getLong(6), z10, string2, zzbgVar, j10, (zzbg) s62.K0().N(cursor.getBlob(7), creator), cursor.getLong(9), (zzbg) s62.K0().N(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                C3298l3 c3298l3 = this.f33578a;
                c3298l3.a().o().c("Got multiple records for conditional property, expected one", C3392x2.x(str), c3298l3.D().c(str3));
            }
            cursor.close();
            return zzahVar;
        } catch (SQLiteException e12) {
            e = e12;
            C3298l3 c3298l32 = this.f33578a;
            c3298l32.a().o().d("Error querying conditional property", C3392x2.x(str), c3298l32.D().c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle G(String str) {
        Cursor cursor;
        Cursor cursor2;
        h();
        j();
        Cursor cursor3 = null;
        try {
            try {
                cursor = u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursor.moveToFirst()) {
                        try {
                            zzhs zzhsVar = (zzhs) ((zzhr) X6.W(zzhs.zzk(), cursor.getBlob(0))).zzbc();
                            this.f34418b.K0();
                            Bundle q10 = X6.q(zzhsVar.zza());
                            cursor.close();
                            return q10;
                        } catch (IOException e10) {
                            this.f33578a.a().o().c("Failed to retrieve default event parameters. appId", C3392x2.x(str), e10);
                        }
                    } else {
                        this.f33578a.a().w().a("Default event parameters not found");
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.f33578a.a().o().b("Error selecting default event parameters", e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final int G0(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().o().d("Error deleting conditional property", C3392x2.x(str), c3298l3.D().c(str2), e10);
            return 0;
        }
    }

    public final boolean H(String str, long j10) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f33578a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        AbstractC3191o.g(str);
        h();
        j();
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
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:78:0x028c, B:80:0x02a7), top: B:77:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str, Long l10, String str2, Bundle bundle) {
        String string;
        String str3;
        Bundle bundle2;
        long update;
        zzid zzidVar;
        Cursor query;
        String str4 = str;
        AbstractC3191o.m(bundle);
        h();
        j();
        r rVar = l10 != null ? new r(this, str4, l10.longValue()) : new r(this, str4);
        List<C3334q> a10 = rVar.a();
        while (!a10.isEmpty()) {
            for (C3334q c3334q : a10) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    zzid zzidVar2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c3334q.f34237b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                zzidVar = null;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            zzidVar = null;
                        }
                        if (query.moveToFirst()) {
                            try {
                                zzidVar = (zzid) ((zzic) X6.W(zzid.zzaE(), query.getBlob(0))).zzbc();
                                try {
                                    if (query.moveToNext()) {
                                        this.f33578a.a().r().b("Get multiple raw event metadata records, expected one. appId", C3392x2.x(str4));
                                    }
                                    query.close();
                                    query.close();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor2 = query;
                                    this.f33578a.a().o().c("Data loss. Error selecting raw event. appId", C3392x2.x(str4), e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    zzidVar2 = zzidVar;
                                    if (zzidVar2 != null) {
                                    }
                                    S6 s62 = this.f34418b;
                                    X6 K02 = s62.K0();
                                    zzhs zzhsVar = c3334q.f34239d;
                                    Bundle bundle3 = new Bundle();
                                    while (r4.hasNext()) {
                                    }
                                    string = bundle3.getString("_o");
                                    bundle3.remove("_o");
                                    String zzd2 = zzhsVar.zzd();
                                    if (string == null) {
                                    }
                                    C3400y2 c3400y2 = new C3400y2(zzd2, string, bundle3, zzhsVar.zzf());
                                    C3298l3 c3298l3 = this.f33578a;
                                    Bundle bundle4 = c3400y2.f34397d;
                                    str3 = c3400y2.f34394a;
                                    b7 C10 = c3298l3.C();
                                    if (str3.equals("_cmp")) {
                                    }
                                    S6 s63 = s62;
                                    C10.w(bundle4, bundle2);
                                    A a11 = new A(this.f33578a, c3400y2.f34395b, str4, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle4);
                                    long j10 = c3334q.f34236a;
                                    long j11 = c3334q.f34237b;
                                    boolean z10 = c3334q.f34238c;
                                    h();
                                    j();
                                    AbstractC3191o.m(a11);
                                    String str5 = a11.f33261a;
                                    AbstractC3191o.g(str5);
                                    byte[] zzcc = s63.K0().J(a11).zzcc();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(PublisherMetadata.APP_ID, str5);
                                    contentValues.put("name", a11.f33262b);
                                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(a11.f33264d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                                    contentValues.put(EventKeys.DATA, zzcc);
                                    contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                                    update = u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                                    if (update != 1) {
                                    }
                                    str4 = str;
                                }
                                zzidVar2 = zzidVar;
                            } catch (IOException e13) {
                                this.f33578a.a().o().c("Data loss. Failed to merge raw event metadata. appId", C3392x2.x(str4), e13);
                            }
                            if (zzidVar2 != null) {
                                Iterator it = zzidVar2.zzf().iterator();
                                while (it.hasNext()) {
                                    if (((zziu) it.next()).zzc().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.f33578a.a().o().b("Raw event metadata record is missing. appId", C3392x2.x(str4));
                        }
                        query.close();
                        if (zzidVar2 != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                S6 s622 = this.f34418b;
                X6 K022 = s622.K0();
                zzhs zzhsVar2 = c3334q.f34239d;
                Bundle bundle32 = new Bundle();
                for (zzhw zzhwVar : zzhsVar2.zza()) {
                    if (zzhwVar.zzi()) {
                        bundle32.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                    } else if (zzhwVar.zzg()) {
                        bundle32.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                    } else if (zzhwVar.zze()) {
                        bundle32.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle32.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzk().isEmpty()) {
                        K022.f33578a.a().o().b("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle32.putParcelableArray(zzhwVar.zzb(), X6.Y(zzhwVar.zzk()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                String zzd22 = zzhsVar2.zzd();
                if (string == null) {
                    string = "";
                }
                C3400y2 c3400y22 = new C3400y2(zzd22, string, bundle32, zzhsVar2.zzf());
                C3298l3 c3298l32 = this.f33578a;
                Bundle bundle42 = c3400y22.f34397d;
                str3 = c3400y22.f34394a;
                b7 C102 = c3298l32.C();
                if (str3.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        S6 s64 = s622;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        s622 = s64;
                    }
                }
                S6 s632 = s622;
                C102.w(bundle42, bundle2);
                A a112 = new A(this.f33578a, c3400y22.f34395b, str4, zzhsVar2.zzd(), zzhsVar2.zzf(), zzhsVar2.zzh(), bundle42);
                long j102 = c3334q.f34236a;
                long j112 = c3334q.f34237b;
                boolean z102 = c3334q.f34238c;
                h();
                j();
                AbstractC3191o.m(a112);
                String str52 = a112.f33261a;
                AbstractC3191o.g(str52);
                byte[] zzcc2 = s632.K0().J(a112).zzcc();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(PublisherMetadata.APP_ID, str52);
                contentValues2.put("name", a112.f33262b);
                contentValues2.put(EventKeys.TIMESTAMP, Long.valueOf(a112.f33264d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j112));
                contentValues2.put(EventKeys.DATA, zzcc2);
                contentValues2.put("realtime", Integer.valueOf(z102 ? 1 : 0));
                try {
                    update = u0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j102)});
                    if (update != 1) {
                        c3298l32.a().o().c("Failed to update raw event. appId, updatedRows", C3392x2.x(str52), Long.valueOf(update));
                    }
                } catch (SQLiteException e14) {
                    this.f33578a.a().o().c("Error updating raw event. appId", C3392x2.x(a112.f33261a), e14);
                }
                str4 = str;
            }
            a10 = rVar.a();
            str4 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List I0(String str, String[] strArr) {
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u02 = u0();
                String[] strArr2 = {PublisherMetadata.APP_ID, "origin", "name", EventKeys.VALUE_KEY, AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                C3298l3 c3298l3 = this.f33578a;
                c3298l3.w();
                cursor = u02.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        c3298l3.w();
                        if (size >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object x10 = x(cursor, 3);
                        boolean z10 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j10 = cursor.getLong(6);
                        S6 s62 = this.f34418b;
                        X6 K02 = s62.K0();
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) K02.N(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, cursor.getLong(10), x10, string2), cursor.getLong(8), z10, string4, zzbgVar, j10, (zzbg) s62.K0().N(cursor.getBlob(9), creator), cursor.getLong(11), (zzbg) s62.K0().N(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e10) {
                this.f33578a.a().o().b("Error querying conditional user property value", e10);
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V3 J(String str) {
        Throwable th2;
        SQLiteException e10;
        AbstractC3191o.m(str);
        h();
        j();
        ?? r52 = {str};
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        V3 v32 = null;
        try {
            try {
                r52 = u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r52);
                try {
                    if (r52.moveToFirst()) {
                        v32 = V3.f(r52.getString(0), r52.getInt(1));
                    } else {
                        this.f33578a.a().w().a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f33578a.a().o().b("Error querying database.", e10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = r52;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            r52 = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
            }
            throw th2;
        }
        r52.close();
        return v32 == null ? V3.f33699c : v32;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D2 J0(String str) {
        Cursor cursor;
        Boolean valueOf;
        AbstractC3191o.g(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", PublisherMetadata.APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f33578a.a().o().c("Error querying app. appId", C3392x2.x(str), e);
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
        } catch (SQLiteException e11) {
            e = e11;
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
        S6 s62 = this.f34418b;
        D2 d22 = new D2(s62.g0(), str);
        V3 g10 = s62.g(str);
        U3 u32 = U3.ANALYTICS_STORAGE;
        if (g10.o(u32)) {
            d22.q0(cursor.getString(0));
        }
        d22.s0(cursor.getString(1));
        if (s62.g(str).o(U3.AD_STORAGE)) {
            d22.w0(cursor.getString(2));
        }
        d22.f(cursor.getLong(3));
        d22.A0(cursor.getLong(4));
        d22.C0(cursor.getLong(5));
        d22.E0(cursor.getString(6));
        d22.I0(cursor.getString(7));
        d22.K0(cursor.getLong(8));
        d22.a(cursor.getLong(9));
        d22.e(cursor.isNull(10) || cursor.getInt(10) != 0);
        d22.o(cursor.getLong(11));
        d22.q(cursor.getLong(12));
        d22.s(cursor.getLong(13));
        d22.u(cursor.getLong(14));
        d22.i(cursor.getLong(15));
        d22.k(cursor.getLong(16));
        d22.G0(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        d22.y0(cursor.getString(18));
        d22.y(cursor.getLong(19));
        d22.w(cursor.getLong(20));
        d22.O(cursor.getString(21));
        d22.Q(cursor.isNull(23) || cursor.getInt(23) != 0);
        d22.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            d22.U(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (s62.g(str).o(u32)) {
            d22.u0(cursor.getString(28));
        }
        d22.W((cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true);
        d22.F(cursor.getLong(39));
        d22.m0(cursor.getString(36));
        d22.Y(cursor.getLong(30));
        d22.a0(cursor.getLong(31));
        zzqp.zza();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.w().H(str, AbstractC3209a2.f33833Q0)) {
            d22.c0(cursor.getInt(32));
            d22.k0(cursor.getLong(35));
        }
        d22.e0((cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true);
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        d22.S(valueOf);
        d22.C(cursor.getInt(37));
        d22.E(cursor.getInt(38));
        d22.H(cursor.isNull(40) ? "" : (String) AbstractC3191o.m(cursor.getString(40)));
        if (!cursor.isNull(41)) {
            d22.g0(Long.valueOf(cursor.getLong(41)));
        }
        if (!cursor.isNull(42)) {
            d22.i0(Long.valueOf(cursor.getLong(42)));
        }
        d22.J(cursor.getBlob(43));
        if (!cursor.isNull(44)) {
            d22.L(cursor.getInt(44));
        }
        d22.n0();
        if (cursor.moveToNext()) {
            c3298l3.a().o().b("Got multiple records for app, expected one. appId", C3392x2.x(str));
        }
        cursor.close();
        return d22;
    }

    public final boolean K(String str, zzoh zzohVar) {
        h();
        j();
        AbstractC3191o.m(zzohVar);
        AbstractC3191o.g(str);
        C3298l3 c3298l3 = this.f33578a;
        long a10 = c3298l3.e().a();
        Z1 z12 = AbstractC3209a2.f33909w0;
        long longValue = a10 - ((Long) z12.b(null)).longValue();
        long j10 = zzohVar.f34440b;
        if (j10 < longValue || j10 > ((Long) z12.b(null)).longValue() + a10) {
            c3298l3.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C3392x2.x(str), Long.valueOf(a10), Long.valueOf(j10));
        }
        c3298l3.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.f34439a);
        contentValues.put("source", Integer.valueOf(zzohVar.f34441c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c3298l3.a().o().b("Failed to insert trigger URI (got -1). appId", C3392x2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing trigger URI. appId", C3392x2.x(str), e10);
            return false;
        }
    }

    public final void K0(D2 d22, boolean z10, boolean z11) {
        AbstractC3191o.m(d22);
        h();
        j();
        String o02 = d22.o0();
        AbstractC3191o.m(o02);
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, o02);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f34418b.g(o02).o(U3.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", d22.p0());
        }
        contentValues.put("gmp_app_id", d22.r0());
        S6 s62 = this.f34418b;
        if (s62.g(o02).o(U3.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", d22.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(d22.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d22.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d22.B0()));
        contentValues.put(PublisherMetadata.APP_VERSION, d22.D0());
        contentValues.put("app_store", d22.H0());
        contentValues.put("gmp_version", Long.valueOf(d22.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(d22.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(d22.d()));
        contentValues.put("day", Long.valueOf(d22.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(d22.p()));
        contentValues.put("daily_events_count", Long.valueOf(d22.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(d22.t()));
        contentValues.put("config_fetched_time", Long.valueOf(d22.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(d22.j()));
        contentValues.put("app_version_int", Long.valueOf(d22.F0()));
        contentValues.put("firebase_instance_id", d22.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(d22.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(d22.v()));
        contentValues.put("health_monitor_sample", d22.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d22.P()));
        contentValues.put("dynamite_version", Long.valueOf(d22.b()));
        if (s62.g(o02).o(U3.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", d22.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(d22.V()));
        contentValues.put("target_os_version", Long.valueOf(d22.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(d22.Z()));
        zzqp.zza();
        C3298l3 c3298l3 = this.f33578a;
        if (c3298l3.w().H(o02, AbstractC3209a2.f33833Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(d22.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(d22.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(d22.d0()));
        contentValues.put("npa_metadata_value", d22.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(d22.G()));
        contentValues.put("sgtm_preview_key", d22.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(d22.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(d22.D()));
        contentValues.put("serialized_npa_metadata", d22.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(d22.M()));
        List T10 = d22.T();
        if (T10 != null) {
            if (T10.isEmpty()) {
                c3298l3.a().r().b("Safelisted events should not be an empty list. appId", o02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", T10));
            }
        }
        zzpr.zza();
        if (c3298l3.w().H(null, AbstractC3209a2.f33823L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", d22.f0());
        contentValues.put("unmatched_uwa", d22.h0());
        contentValues.put("ad_campaign_info", d22.K());
        try {
            SQLiteDatabase u02 = u0();
            if (u02.update("apps", contentValues, "app_id = ?", new String[]{o02}) == 0 && u02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c3298l3.a().o().b("Failed to insert/update app (got -1). appId", C3392x2.x(o02));
            }
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing app. appId", C3392x2.x(o02), e10);
        }
    }

    public final void L(String str, V3 v32) {
        AbstractC3191o.m(str);
        AbstractC3191o.m(v32);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("consent_state", v32.l());
        contentValues.put("consent_source", Integer.valueOf(v32.b()));
        N("consent_settings", PublisherMetadata.APP_ID, contentValues);
    }

    public final C3326p L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final String M(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final C3326p M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC3191o.g(str);
        h();
        j();
        String[] strArr = {str};
        C3326p c3326p = new C3326p();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u02 = u0();
                cursor = u02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j10) {
                        c3326p.f34207b = cursor.getLong(1);
                        c3326p.f34206a = cursor.getLong(2);
                        c3326p.f34208c = cursor.getLong(3);
                        c3326p.f34209d = cursor.getLong(4);
                        c3326p.f34210e = cursor.getLong(5);
                        c3326p.f34211f = cursor.getLong(6);
                        c3326p.f34212g = cursor.getLong(7);
                    }
                    if (z10) {
                        c3326p.f34207b += j11;
                    }
                    if (z11) {
                        c3326p.f34206a += j11;
                    }
                    if (z12) {
                        c3326p.f34208c += j11;
                    }
                    if (z13) {
                        c3326p.f34209d += j11;
                    }
                    if (z14) {
                        c3326p.f34210e += j11;
                    }
                    if (z15) {
                        c3326p.f34211f += j11;
                    }
                    if (z16) {
                        c3326p.f34212g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c3326p.f34206a));
                    contentValues.put("daily_events_count", Long.valueOf(c3326p.f34207b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c3326p.f34208c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c3326p.f34209d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c3326p.f34210e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c3326p.f34211f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c3326p.f34212g));
                    u02.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f33578a.a().r().b("Not updating daily counts, app is not known. appId", C3392x2.x(str));
                }
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Error updating daily counts. appId", C3392x2.x(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
            return c3326p;
        } finally {
        }
    }

    public final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase u02 = u0();
            if (contentValues.getAsString(PublisherMetadata.APP_ID) == null) {
                this.f33578a.a().q().b("Value of the primary key is not set.", C3392x2.x(PublisherMetadata.APP_ID));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append(PublisherMetadata.APP_ID);
            sb2.append(" = ?");
            if (u02.update("consent_settings", contentValues, sb2.toString(), new String[]{r2}) == 0 && u02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f33578a.a().o().c("Failed to insert/update table (got -1). key", C3392x2.x("consent_settings"), C3392x2.x(PublisherMetadata.APP_ID));
            }
        } catch (SQLiteException e10) {
            this.f33578a.a().o().d("Error storing into table. key", C3392x2.x("consent_settings"), C3392x2.x(PublisherMetadata.APP_ID), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3318o N0(String str) {
        Throwable th2;
        Cursor cursor;
        AbstractC3191o.g(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            this.f33578a.a().o().b("Got multiple records for app config, expected one. appId", C3392x2.x(str));
                        }
                        if (blob != null) {
                            C3318o c3318o = new C3318o(blob, string, string2);
                            cursor.close();
                            return c3318o;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f33578a.a().o().c("Error querying remote config. appId", C3392x2.x(str), e);
                    if (cursor != null) {
                    }
                    return null;
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
        } catch (SQLiteException e11) {
            e = e11;
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

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B O(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        AbstractC3191o.g(str2);
        AbstractC3191o.g(str3);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    C3298l3 c3298l3 = this.f33578a;
                    c3298l3.a().o().d("Error querying events. appId", C3392x2.x(str2), c3298l3.D().a(str3), e);
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
        } catch (SQLiteException e11) {
            e = e11;
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
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        long j12 = cursor.getLong(2);
        long j13 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        B b10 = new B(str2, str3, j10, j11, cursor.isNull(8) ? 0L : cursor.getLong(8), j12, j13, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            this.f33578a.a().o().b("Got multiple records for event aggregates, expected one. appId", C3392x2.x(str2));
        }
        cursor.close();
        return b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r3 > (com.google.android.gms.measurement.internal.C3286k.q() + r1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O0(zzid zzidVar, boolean z10) {
        h();
        j();
        AbstractC3191o.m(zzidVar);
        AbstractC3191o.g(zzidVar.zzA());
        AbstractC3191o.p(zzidVar.zzn());
        u();
        C3298l3 c3298l3 = this.f33578a;
        long a10 = c3298l3.e().a();
        long zzo = zzidVar.zzo();
        c3298l3.w();
        if (zzo >= a10 - C3286k.q()) {
            long zzo2 = zzidVar.zzo();
            c3298l3.w();
        }
        c3298l3.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C3392x2.x(zzidVar.zzA()), Long.valueOf(a10), Long.valueOf(zzidVar.zzo()));
        try {
            byte[] V10 = this.f34418b.K0().V(zzidVar.zzcc());
            C3298l3 c3298l32 = this.f33578a;
            c3298l32.a().w().b("Saving bundle, size", Integer.valueOf(V10.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(PublisherMetadata.APP_ID, zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put(EventKeys.DATA, V10);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                c3298l32.a().o().b("Failed to insert bundle (got -1). appId", C3392x2.x(zzidVar.zzA()));
                return false;
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Error storing bundle. appId", C3392x2.x(zzidVar.zzA()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.f33578a.a().o().c("Data loss. Failed to serialize bundle. appId", C3392x2.x(zzidVar.zzA()), e11);
            return false;
        }
    }

    public final void P(String str, B b10) {
        AbstractC3191o.m(b10);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = b10.f33283a;
        contentValues.put(PublisherMetadata.APP_ID, str2);
        contentValues.put("name", b10.f33284b);
        contentValues.put("lifetime_count", Long.valueOf(b10.f33285c));
        contentValues.put("current_bundle_count", Long.valueOf(b10.f33286d));
        contentValues.put("last_fire_timestamp", Long.valueOf(b10.f33288f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(b10.f33289g));
        contentValues.put("last_bundled_day", b10.f33290h);
        contentValues.put("last_sampled_complex_event_id", b10.f33291i);
        contentValues.put("last_sampling_rate", b10.f33292j);
        contentValues.put("current_session_count", Long.valueOf(b10.f33287e));
        Boolean bool = b10.f33293k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f33578a.a().o().b("Failed to insert/update event aggregates (got -1). appId", C3392x2.x(str2));
            }
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error storing event aggregates. appId", C3392x2.x(b10.f33283a), e10);
        }
    }

    public final void Q(String str, String str2) {
        AbstractC3191o.g(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f33578a.a().o().c("Error deleting snapshot. appId", C3392x2.x(str2), e10);
        }
    }

    public final V6 R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f33578a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzhz zzhzVar = (zzhz) X6.W(zzib.zzh(), bArr);
            EnumC3252f5 a10 = EnumC3252f5.a(i10);
            if (a10 != EnumC3252f5.GOOGLE_SIGNAL && a10 != EnumC3252f5.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    zzic zzicVar = (zzic) ((zzid) it.next()).zzcl();
                    zzicVar.zzao(i11);
                    arrayList.add((zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.f33578a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            U6 u62 = new U6();
            u62.b(j10);
            u62.c((zzib) zzhzVar.zzbc());
            u62.d(str2);
            u62.e(hashMap);
            u62.f(a10);
            u62.g(j11);
            u62.h(j12);
            u62.i(j13);
            u62.j(i11);
            return u62.a();
        } catch (IOException e10) {
            this.f33578a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    public final String S() {
        C3298l3 c3298l3 = this.f33578a;
        long a10 = c3298l3.e().a();
        Locale locale = Locale.US;
        EnumC3252f5 enumC3252f5 = EnumC3252f5.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(enumC3252f5.zza());
        Long valueOf2 = Long.valueOf(a10);
        c3298l3.w();
        Long l10 = (Long) AbstractC3209a2.f33838T.b(null);
        l10.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l10);
        Integer valueOf3 = Integer.valueOf(enumC3252f5.zza());
        c3298l3.w();
        String format2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, Long.valueOf(C3286k.q()));
        StringBuilder sb2 = new StringBuilder(format.length() + 5 + format2.length() + 1);
        sb2.append("(");
        sb2.append(format);
        sb2.append(" OR ");
        sb2.append(format2);
        sb2.append(")");
        return sb2.toString();
    }

    public final C3389x U(String str) {
        AbstractC3191o.m(str);
        h();
        j();
        return C3389x.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, C3389x c3389x) {
        AbstractC3191o.m(str);
        AbstractC3191o.m(c3389x);
        h();
        j();
        V3 J10 = J(str);
        V3 v32 = V3.f33699c;
        if (J10 == v32) {
            L(str, v32);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("dma_consent_settings", c3389x.e());
        N("consent_settings", PublisherMetadata.APP_ID, contentValues);
    }

    public final void W(String str, V3 v32) {
        AbstractC3191o.m(str);
        AbstractC3191o.m(v32);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", v32.l());
        N("consent_settings", PublisherMetadata.APP_ID, contentValues);
    }

    public final V3 X(String str) {
        AbstractC3191o.m(str);
        h();
        j();
        return V3.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0287, code lost:
    
        r22.f33578a.a().o().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C3392x2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        j();
        h();
        com.google.android.gms.common.internal.AbstractC3191o.g(r23);
        r0 = u0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r0 = r22.f33578a.a().r();
        r11 = com.google.android.gms.measurement.internal.C3392x2.x(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        if (r12.zza() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzfn) r3.next();
        j();
        h();
        com.google.android.gms.common.internal.AbstractC3191o.g(r23);
        com.google.android.gms.common.internal.AbstractC3191o.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (r7.zzc().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f8, code lost:
    
        r11 = r7.zzcc();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
    
        if (r7.zza() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032f, code lost:
    
        if (r7.zzg() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put(com.twilio.voice.EventKeys.DATA, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034d, code lost:
    
        if (u0().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034f, code lost:
    
        r22.f33578a.a().o().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C3392x2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036b, code lost:
    
        r22.f33578a.a().o().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C3392x2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c8, code lost:
    
        r0 = r22.f33578a.a().r();
        r9 = com.google.android.gms.measurement.internal.C3392x2.x(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (r7.zza() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r11.next()).zza() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r22.f33578a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C3392x2.x(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r11 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b1, code lost:
    
        r12 = r11.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r19 = r0;
        r0 = com.twilio.voice.PublisherMetadata.APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r12 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzff) r11.next();
        j();
        h();
        com.google.android.gms.common.internal.AbstractC3191o.g(r23);
        com.google.android.gms.common.internal.AbstractC3191o.m(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r12.zzc().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0213, code lost:
    
        r3 = r12.zzcc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put(com.twilio.voice.PublisherMetadata.APP_ID, r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r12.zza() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024b, code lost:
    
        if (r12.zzk() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put(com.twilio.voice.EventKeys.DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        r22.f33578a.a().o().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C3392x2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0286, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(String str, List list) {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        AbstractC3191o.m(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfc zzfcVar = (zzfc) ((zzfd) list.get(i10)).zzcl();
            if (zzfcVar.zzd() != 0) {
                for (int i11 = 0; i11 < zzfcVar.zzd(); i11++) {
                    zzfe zzfeVar = (zzfe) zzfcVar.zze(i11).zzcl();
                    zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
                    String b10 = W3.b(zzfeVar.zza());
                    if (b10 != null) {
                        zzfeVar2.zzb(b10);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < zzfeVar.zzc()) {
                        zzfh zzd2 = zzfeVar.zzd(i12);
                        zzfe zzfeVar3 = zzfeVar;
                        boolean z11 = z10;
                        String b11 = AbstractC3260g5.b(zzd2.zzh(), X3.zza, X3.zzb);
                        if (b11 != null) {
                            zzfg zzfgVar = (zzfg) zzd2.zzcl();
                            zzfgVar.zza(b11);
                            zzfeVar2.zze(i12, (zzfh) zzfgVar.zzbc());
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i12++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z10) {
                        zzfcVar.zzf(i11, zzfeVar2);
                        list.set(i10, (zzfd) zzfcVar.zzbc());
                    }
                }
            }
            if (zzfcVar.zza() != 0) {
                for (int i13 = 0; i13 < zzfcVar.zza(); i13++) {
                    zzfn zzb2 = zzfcVar.zzb(i13);
                    String b12 = AbstractC3260g5.b(zzb2.zzc(), Y3.zza, Y3.zzb);
                    if (b12 != null) {
                        zzfm zzfmVar = (zzfm) zzb2.zzcl();
                        zzfmVar.zza(b12);
                        zzfcVar.zzc(i13, zzfmVar);
                        list.set(i10, (zzfd) zzfcVar.zzbc());
                    }
                }
            }
        }
        j();
        h();
        AbstractC3191o.g(str);
        AbstractC3191o.m(list);
        SQLiteDatabase u02 = u0();
        u02.beginTransaction();
        try {
            j();
            h();
            AbstractC3191o.g(str);
            SQLiteDatabase u03 = u0();
            u03.delete("property_filters", "app_id=?", new String[]{str});
            u03.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfd zzfdVar = (zzfd) it.next();
                j();
                h();
                AbstractC3191o.g(str);
                AbstractC3191o.m(zzfdVar);
                if (zzfdVar.zza()) {
                    int zzb3 = zzfdVar.zzb();
                    Iterator it2 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((zzff) it2.next()).zza()) {
                                this.f33578a.a().r().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C3392x2.x(str), Integer.valueOf(zzb3));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.f33578a.a().r().b("Audience with no ID. appId", C3392x2.x(str));
                }
            }
            sQLiteDatabase = u02;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                zzfd zzfdVar2 = (zzfd) it3.next();
                arrayList.add(zzfdVar2.zza() ? Integer.valueOf(zzfdVar2.zzb()) : null);
            }
            AbstractC3191o.g(str);
            j();
            h();
            SQLiteDatabase u04 = u0();
            try {
                long p02 = p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i14 = 0;
                int max = Math.max(0, Math.min(2000, this.f33578a.w().E(str, AbstractC3209a2.f33842V)));
                if (p02 > max) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String join = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                            sb2.append("(");
                            sb2.append(join);
                            sb2.append(")");
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder(sb3.length() + EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                            sb4.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb4.append(sb3);
                            sb4.append(" order by rowid desc limit -1 offset ?)");
                            u04.delete("audience_filter_values", sb4.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str), e10);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = u02;
        }
    }

    public final B Z(String str, zzhs zzhsVar, String str2) {
        B O10 = O("events", str, zzhsVar.zzd());
        if (O10 == null) {
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", C3392x2.x(str), c3298l3.D().a(str2));
            return new B(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j10 = O10.f33287e + 1;
        long j11 = O10.f33286d + 1;
        return new B(O10.f33283a, O10.f33284b, O10.f33285c + 1, j11, j10, O10.f33288f, O10.f33289g, O10.f33290h, O10.f33291i, O10.f33292j, O10.f33293k);
    }

    public final boolean a0() {
        C3298l3 c3298l3 = this.f33578a;
        Context d10 = c3298l3.d();
        c3298l3.w();
        return d10.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    public final long m(String str, zzib zzibVar, String str2, Map map, EnumC3252f5 enumC3252f5, Long l10) {
        int delete;
        h();
        j();
        AbstractC3191o.m(zzibVar);
        AbstractC3191o.g(str);
        h();
        j();
        if (a0()) {
            S6 s62 = this.f34418b;
            long a10 = s62.L0().f33937f.a();
            C3298l3 c3298l3 = this.f33578a;
            long b10 = c3298l3.e().b();
            long abs = Math.abs(b10 - a10);
            c3298l3.w();
            if (abs > C3286k.r()) {
                s62.L0().f33937f.b(b10);
                h();
                j();
                if (a0() && (delete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    c3298l3.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                AbstractC3191o.g(str);
                h();
                j();
                try {
                    int E10 = c3298l3.w().E(str, AbstractC3209a2.f33800A);
                    if (E10 > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(E10)});
                    }
                } catch (SQLiteException e10) {
                    this.f33578a.a().o().c("Error deleting over the limit queued batches. appId", C3392x2.x(str), e10);
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
        byte[] zzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("measurement_batch", zzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", s1.h.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC3252f5.zza()));
        C3298l3 c3298l32 = this.f33578a;
        contentValues.put("creation_timestamp", Long.valueOf(c3298l32.e().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = u0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            c3298l32.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f33578a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    public final /* synthetic */ C3380v6 m0() {
        return this.f34287e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V6 n(long j10) {
        Cursor cursor;
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("upload_queue", new String[]{"rowId", PublisherMetadata.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
            try {
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    this.f33578a.a().o().c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            V6 R10 = R((String) AbstractC3191o.m(cursor.getString(1)), j10, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
            cursor.close();
            return R10;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(String str, long j10, long j11, O6 o62) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase u02;
        ?? isEmpty;
        String[] strArr;
        String str4;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        C3298l3 c3298l3;
        long j12;
        AbstractC3191o.m(o62);
        h();
        j();
        C2266d.c cVar = 0;
        r6 = null;
        Cursor cursor2 = null;
        try {
            try {
                u02 = u0();
                isEmpty = TextUtils.isEmpty(str);
            } catch (SQLiteException e10) {
                e = e10;
                str2 = str;
            }
            try {
                if (isEmpty != 0) {
                    String[] strArr5 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                    str4 = j11 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb2 = new StringBuilder(str4.length() + EnumC3631g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
                    sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb2.append(str4);
                    sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursor = u02.rawQuery(sb2.toString(), strArr5);
                    try {
                    } catch (SQLiteException e11) {
                        e = e11;
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
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursor2 = cursor;
                        this.f33578a.a().o().c("Data loss. Error selecting raw event. appId", C3392x2.x(str3), e);
                        cursor = cursor2;
                        if (cursor == null) {
                        }
                    }
                } else {
                    try {
                        if (j11 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j11)};
                            isEmpty = str5;
                        } else {
                            String str6 = str;
                            strArr = new String[]{str6};
                            isEmpty = str6;
                        }
                        str4 = j11 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str4);
                        sb3.append(" order by rowid limit 1;");
                        cursor = u02.rawQuery(sb3.toString(), strArr);
                        try {
                        } catch (SQLiteException e13) {
                            e = e13;
                            cursor2 = cursor;
                            str2 = isEmpty;
                            str3 = str2;
                            this.f33578a.a().o().c("Data loss. Error selecting raw event. appId", C3392x2.x(str3), e);
                            cursor = cursor2;
                            if (cursor == null) {
                            }
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        str2 = isEmpty;
                    }
                    if (cursor.moveToFirst()) {
                        string = cursor.getString(0);
                        cursor.close();
                        str3 = isEmpty;
                    } else if (cursor == null) {
                    }
                }
                cursor = u02.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                if (cursor.moveToFirst()) {
                    try {
                        zzid zzidVar = (zzid) ((zzic) X6.W(zzid.zzaE(), cursor.getBlob(0))).zzbc();
                        if (cursor.moveToNext()) {
                            this.f33578a.a().r().b("Get multiple raw event metadata records, expected one. appId", C3392x2.x(str3));
                        }
                        cursor.close();
                        AbstractC3191o.m(zzidVar);
                        o62.f33582a = zzidVar;
                        C3298l3 c3298l32 = this.f33578a;
                        String str7 = "app_id = ? and metadata_fingerprint = ?";
                        if (c3298l32.w().H(null, AbstractC3209a2.f33887l1)) {
                            long q02 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string}, -1L);
                            if (j11 != -1) {
                                j12 = j11;
                            } else if (q02 != -1) {
                                j12 = -1;
                            } else {
                                strArr2 = new String[]{str3, string};
                                strArr4 = strArr2;
                                c3298l3 = c3298l32;
                            }
                            if (j12 != -1 && q02 != -1) {
                                q02 = Math.min(j12, q02);
                            } else if (j12 != -1) {
                                q02 = j12;
                            }
                            strArr3 = new String[]{str3, string, String.valueOf(q02)};
                            strArr4 = strArr3;
                            c3298l3 = c3298l32;
                            str7 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        } else if (j11 != -1) {
                            strArr3 = new String[]{str3, string, String.valueOf(j11)};
                            strArr4 = strArr3;
                            c3298l3 = c3298l32;
                            str7 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            c3298l3 = c3298l32;
                        }
                        cursor2 = u02.query("raw_events", new String[]{"rowid", "name", EventKeys.TIMESTAMP, EventKeys.DATA}, str7, strArr4, null, null, "rowid", null);
                        try {
                            if (cursor2.moveToFirst()) {
                                do {
                                    long j13 = cursor2.getLong(0);
                                    try {
                                        zzhr zzhrVar = (zzhr) X6.W(zzhs.zzk(), cursor2.getBlob(3));
                                        zzhrVar.zzl(cursor2.getString(1));
                                        zzhrVar.zzo(cursor2.getLong(2));
                                        if (!o62.a(j13, (zzhs) zzhrVar.zzbc())) {
                                            break;
                                        }
                                    } catch (IOException e15) {
                                        this.f33578a.a().o().c("Data loss. Failed to merge raw event. appId", C3392x2.x(str3), e15);
                                    }
                                } while (cursor2.moveToNext());
                            } else {
                                c3298l3.a().r().b("Raw event data disappeared while in transaction. appId", C3392x2.x(str3));
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            this.f33578a.a().o().c("Data loss. Error selecting raw event. appId", C3392x2.x(str3), e);
                            cursor = cursor2;
                            if (cursor == null) {
                            }
                        }
                        cursor = cursor2;
                    } catch (IOException e17) {
                        this.f33578a.a().o().c("Data loss. Failed to merge raw event metadata. appId", C3392x2.x(str3), e17);
                    }
                } else {
                    this.f33578a.a().o().b("Raw event metadata record is missing. appId", C3392x2.x(str3));
                }
                if (cursor == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = "select metadata_fingerprint from raw_events where app_id = ?";
                if (cVar != 0) {
                    cVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o(String str, zzoo zzooVar, int i10) {
        List list;
        AbstractC3191o.g(str);
        h();
        j();
        Cursor cursor = null;
        try {
            SQLiteDatabase u02 = u0();
            String[] strArr = {"rowId", PublisherMetadata.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String T10 = T(zzooVar.f34448a);
            String S10 = S();
            StringBuilder sb2 = new StringBuilder(String.valueOf(T10).length() + 17 + S10.length());
            sb2.append("app_id=?");
            sb2.append(T10);
            sb2.append(" AND NOT ");
            sb2.append(S10);
            cursor = u02.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            list = new ArrayList();
            while (cursor.moveToNext()) {
                V6 R10 = R(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (R10 != null) {
                    list.add(R10);
                }
            }
        } catch (SQLiteException e10) {
            try {
                this.f33578a.a().o().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
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

    public final boolean p(String str) {
        EnumC3252f5[] enumC3252f5Arr = {EnumC3252f5.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC3252f5Arr[0].zza()));
        String T10 = T(arrayList);
        String S10 = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(T10).length() + 61 + S10.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(T10);
        sb2.append(" AND NOT ");
        sb2.append(S10);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    public final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = u0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void q(Long l10) {
        h();
        j();
        AbstractC3191o.m(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f33578a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f33578a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    public final long q0(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j10 = cursor.getLong(0);
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String r() {
        SQLiteException e10;
        Cursor cursor;
        SQLiteDatabase u02 = u0();
        ?? r12 = 0;
        try {
            try {
                cursor = u02.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f33578a.a().o().b("Database error getting next bundle app id", e10);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                r12 = u02;
                th = th2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
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

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f33578a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    public final void u() {
        h();
        j();
        if (a0()) {
            S6 s62 = this.f34418b;
            long a10 = s62.L0().f33936e.a();
            C3298l3 c3298l3 = this.f33578a;
            long b10 = c3298l3.e().b();
            long abs = Math.abs(b10 - a10);
            c3298l3.w();
            if (abs > C3286k.r()) {
                s62.L0().f33936e.b(b10);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase u02 = u0();
                    String valueOf = String.valueOf(c3298l3.e().a());
                    c3298l3.w();
                    int delete = u02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C3286k.q())});
                    if (delete > 0) {
                        c3298l3.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final SQLiteDatabase u0() {
        h();
        try {
            return this.f34286d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f33578a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    public final void v(List list) {
        h();
        j();
        AbstractC3191o.m(list);
        AbstractC3191o.o(list.size());
        if (a0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb4.toString(), null) > 0) {
                this.f33578a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                u02.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f33578a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final B v0(String str, String str2) {
        return O("events", str, str2);
    }

    public final void w(Long l10) {
        h();
        j();
        AbstractC3191o.m(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f33578a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                long a10 = this.f33578a.e().a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(a10).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(a10);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l10.toString().length() + 29);
                sb5.append("UPDATE upload_queue");
                sb5.append(sb4);
                sb5.append(" WHERE rowid = ");
                sb5.append(l10);
                sb5.append(" AND retry_count < 2147483647");
                u02.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f33578a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void w0(B b10) {
        P("events", b10);
    }

    public final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f33578a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f33578a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f33578a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        B O10;
        Q("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (O10 = O("events", str, string)) != null) {
                            P("events_snapshot", O10);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f33578a.a().o().c("Error creating snapshot. appId", C3392x2.x(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        P("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(String str) {
        boolean z10;
        B O10;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        B O11 = O("events", str, "_f");
        B O12 = O("events", str, "_v");
        Q("events", str);
        Cursor cursor = null;
        boolean z11 = false;
        try {
            cursor = u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e10) {
            e = e10;
            z10 = false;
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (O11 == null) {
            }
            P("events", O11);
            Q("events_snapshot", str);
        }
        boolean z12 = false;
        z10 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z12 = true;
                    } else if ("_v".equals(string)) {
                        z10 = true;
                    }
                }
                if (string != null && (O10 = O("events_snapshot", str, string)) != null) {
                    P("events", O10);
                }
            } catch (SQLiteException e11) {
                e = e11;
                z11 = z12;
                try {
                    this.f33578a.a().o().c("Error querying snapshot. appId", C3392x2.x(str), e);
                    z12 = z11;
                    if (cursor != null) {
                    }
                    if (!z12) {
                    }
                    if (!z10) {
                    }
                    Q("events_snapshot", str);
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z11 && O11 != null) {
                        P("events", O11);
                    } else if (!z10 && O12 != null) {
                        P("events", O12);
                    }
                    Q("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z11 = z12;
                if (cursor != null) {
                }
                if (z11) {
                }
                if (!z10) {
                    P("events", O12);
                }
                Q("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z12 || O11 == null) {
            if (!z10) {
            }
            Q("events_snapshot", str);
        }
        P("events", O11);
        Q("events_snapshot", str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(3:17|9|10)(4:18|19|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        r13.f33578a.a().o().d("Error inserting column. appId", com.google.android.gms.measurement.internal.C3392x2.x(r14), "first_open_count", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z(String str, String str2) {
        long j10;
        long j11;
        AbstractC3191o.g(str);
        AbstractC3191o.g("first_open_count");
        h();
        j();
        SQLiteDatabase u02 = u0();
        u02.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j11 = -1;
                j10 = q0(sb2.toString(), new String[]{str}, -1L);
            } finally {
                u02.endTransaction();
            }
        } catch (SQLiteException e10) {
            SQLiteException e11 = e10;
            j10 = 0;
        }
        if (j10 == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PublisherMetadata.APP_ID, str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (u02.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.f33578a.a().o().c("Failed to insert column (got -1). appId", C3392x2.x(str), "first_open_count");
                return j11;
            }
            j10 = 0;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(PublisherMetadata.APP_ID, str);
        contentValues2.put("first_open_count", Long.valueOf(1 + j10));
        if (u02.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
            this.f33578a.a().o().c("Failed to update column (got 0). appId", C3392x2.x(str), "first_open_count");
            return j11;
        }
        u02.setTransactionSuccessful();
        j11 = j10;
        return j11;
    }

    public final void z0(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().o().d("Error deleting user property. appId", C3392x2.x(str), c3298l3.D().c(str2), e10);
        }
    }
}
