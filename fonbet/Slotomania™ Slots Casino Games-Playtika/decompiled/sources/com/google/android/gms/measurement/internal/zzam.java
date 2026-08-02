package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.protocol.App;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzam extends zzkt {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {App.JsonKeys.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzkp zzk;

    zzam(zzlg zzlgVar) {
        super(zzlgVar);
        this.zzk = new zzkp(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzal(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
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

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzeu.zzn(str), this.zzt.zzj().zzf(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x039f, code lost:
    
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0232, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x048c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0491, code lost:
    
        r22.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0494, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01df, code lost:
    
        r0 = r24.zzt.zzaA().zzk();
        r10 = com.google.android.gms.measurement.internal.zzeu.zzn(r25);
        r12 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f7, code lost:
    
        if (r13.zzp() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f9, code lost:
    
        r13 = java.lang.Integer.valueOf(r13.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0203, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r13));
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0202, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0294, code lost:
    
        r22 = r7;
        r3 = r21.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a2, code lost:
    
        if (r3.hasNext() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a4, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzet) r3.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02be, code lost:
    
        if (r7.zze().isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f0, code lost:
    
        r12 = r7.zzbx();
        r13 = new android.content.ContentValues();
        r13.put(r0, r25);
        r21 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0309, code lost:
    
        if (r7.zzj() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x030b, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0315, code lost:
    
        r13.put("filter_id", r0);
        r23 = r3;
        r13.put("property_name", r7.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0327, code lost:
    
        if (r7.zzk() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0329, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0333, code lost:
    
        r13.put("session_scoped", r0);
        r13.put("data", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0345, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r13, 5) != (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x035b, code lost:
    
        r0 = r21;
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0347, code lost:
    
        r24.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeu.zzn(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0362, code lost:
    
        r24.zzt.zzaA().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r25), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0332, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0314, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c0, code lost:
    
        r0 = r24.zzt.zzaA().zzk();
        r9 = com.google.android.gms.measurement.internal.zzeu.zzn(r25);
        r10 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d8, code lost:
    
        if (r7.zzj() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02da, code lost:
    
        r20 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e7, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r10, java.lang.String.valueOf(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e5, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0174, code lost:
    
        r12 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        if (r12.hasNext() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r12.next()).zzj() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        r24.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeu.zzn(r25), java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a7, code lost:
    
        r12 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        r21 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c1, code lost:
    
        if (r12.hasNext() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        r13 = (com.google.android.gms.internal.measurement.zzek) r12.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01dd, code lost:
    
        if (r13.zzg().isEmpty() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020e, code lost:
    
        r3 = r13.zzbx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0212, code lost:
    
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0214, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r25);
        r7.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0227, code lost:
    
        if (r13.zzp() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0229, code lost:
    
        r0 = java.lang.Integer.valueOf(r13.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0233, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r13.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0243, code lost:
    
        if (r13.zzq() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0245, code lost:
    
        r0 = java.lang.Boolean.valueOf(r13.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024f, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0261, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0263, code lost:
    
        r24.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeu.zzn(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0276, code lost:
    
        r0 = r21;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x027e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027f, code lost:
    
        r24.zzt.zzaA().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeu.zzn(r25), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0375, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25);
        r0 = zzh();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r25, java.lang.String.valueOf(r11)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r25, java.lang.String.valueOf(r11)});
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzB(String str, List list) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) list.get(i)).zzbB();
            if (zzehVar.zza() != 0) {
                for (int i2 = 0; i2 < zzehVar.zza(); i2++) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzbB();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.clone();
                    String zzb2 = zzhb.zzb(zzejVar.zze());
                    if (zzb2 != null) {
                        zzejVar2.zzb(zzb2);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzd2 = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        String zzb3 = zzip.zzb(zzd2.zze(), zzhc.zza, zzhc.zzb);
                        if (zzb3 != null) {
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) zzd2.zzbB();
                            zzelVar.zza(zzb3);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaD());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                    }
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                }
            }
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzf = zzehVar.zzf(i4);
                    String zzb4 = zzip.zzb(zzf.zze(), zzhd.zza, zzhd.zzb);
                    if (zzb4 != null) {
                        com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) zzf.zzbB();
                        zzesVar.zza(zzb4);
                        zzehVar.zzd(i4, zzesVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                }
            }
        }
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase zzh3 = zzh();
            zzh3.delete("property_filters", "app_id=?", new String[]{str});
            zzh3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (zzeiVar.zzk()) {
                    int zza2 = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it2.next()).zzp()) {
                                this.zzt.zzaA().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeu.zzn(str), Integer.valueOf(zza2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzt.zzaA().zzk().zzb("Audience with no ID. appId", zzeu.zzn(str));
                }
            }
            sQLiteDatabase = zzh2;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) it3.next();
                arrayList.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase zzh4 = zzh();
            try {
                long zzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, this.zzt.zzf().zze(str, zzeh.zzF)));
                if (zzZ > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            zzh4.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzeu.zzn(str), e);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = zzh2;
        }
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzu = zzhVar.zzu();
        Preconditions.checkNotNull(zzu);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzu);
        contentValues.put("app_instance_id", zzhVar.zzv());
        contentValues.put("gmp_app_id", zzhVar.zzz());
        contentValues.put("resettable_device_id_hash", zzhVar.zzB());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put(App.JsonKeys.APP_VERSION, zzhVar.zzx());
        contentValues.put("app_store", zzhVar.zzw());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzal()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzy());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzA());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzak()));
        contentValues.put("admob_app_id", zzhVar.zzs());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzC());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzq()));
        List zzD = zzhVar.zzD();
        if (zzD != null) {
            if (zzD.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzu);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzD));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeh.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzu}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzeu.zzn(zzu));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzeu.zzn(zzu), e);
        }
    }

    public final void zzE(zzas zzasVar) {
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put("name", zzasVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzasVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzasVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzasVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzasVar.zzg));
        contentValues.put("last_bundled_day", zzasVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzasVar.zzi);
        contentValues.put("last_sampling_rate", zzasVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzasVar.zze));
        Boolean bool = zzasVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeu.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzeu.zzn(zzasVar.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeu.zzn(str));
            return false;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzeu.zzn(str), e);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeu.zzn(str));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzeu.zzn(str), e);
        }
        return true;
    }

    public final boolean zzL(zzll zzllVar) {
        Preconditions.checkNotNull(zzllVar);
        zzg();
        zzW();
        if (zzp(zzllVar.zza, zzllVar.zzc) == null) {
            if (zzlo.zzak(zzllVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzllVar.zza}) >= this.zzt.zzf().zzf(zzllVar.zza, zzeh.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzllVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzllVar.zza, zzllVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzllVar.zza);
        contentValues.put("origin", zzllVar.zzb);
        contentValues.put("name", zzllVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzllVar.zzd));
        zzV(contentValues, "value", zzllVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeu.zzn(zzllVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzeu.zzn(zzllVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzU(String str, long j, long j2, zzld zzldVar) {
        String string;
        String str2;
        String[] strArr;
        int i;
        ?? r3 = "select metadata_fingerprint from raw_events where app_id = ?";
        Preconditions.checkNotNull(zzldVar);
        zzg();
        zzW();
        ?? r4 = 0;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery != null) {
                                rawQuery.close();
                                return;
                            }
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        Cursor rawQuery2 = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!rawQuery2.moveToFirst()) {
                            if (rawQuery2 != null) {
                                rawQuery2.close();
                                return;
                            }
                            return;
                        }
                        string = rawQuery2.getString(0);
                        rawQuery2.close();
                    }
                    int i2 = 1;
                    Cursor query = zzh2.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                    if (!query.moveToFirst()) {
                        this.zzt.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzeu.zzn(str3));
                        if (query != null) {
                            query.close();
                            return;
                        }
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzli.zzl(com.google.android.gms.internal.measurement.zzgd.zzu(), query.getBlob(0))).zzaD();
                        if (query.moveToNext()) {
                            this.zzt.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeu.zzn(str3));
                        }
                        query.close();
                        Preconditions.checkNotNull(zzgdVar);
                        zzldVar.zza = zzgdVar;
                        if (j2 != -1) {
                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{str3, string, String.valueOf(j2)};
                        } else {
                            str2 = "app_id = ? and metadata_fingerprint = ?";
                            strArr = new String[]{str3, string};
                        }
                        Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                        if (!query2.moveToFirst()) {
                            this.zzt.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeu.zzn(str3));
                            if (query2 != null) {
                                query2.close();
                                return;
                            }
                            return;
                        }
                        while (true) {
                            long j3 = query2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzli.zzl(com.google.android.gms.internal.measurement.zzft.zze(), query2.getBlob(3));
                                i = i2;
                                zzfsVar.zzi(query2.getString(i));
                                zzfsVar.zzm(query2.getLong(2));
                                if (!zzldVar.zza(j3, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD())) {
                                    if (query2 != null) {
                                        query2.close();
                                        return;
                                    }
                                    return;
                                }
                            } catch (IOException e) {
                                i = i2;
                                this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeu.zzn(str3), e);
                            }
                            if (!query2.moveToNext()) {
                                if (query2 != null) {
                                    query2.close();
                                    return;
                                }
                                return;
                            }
                            i2 = i;
                        }
                    } catch (IOException e2) {
                        this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeu.zzn(str3), e2);
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzt.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzeu.zzn(null), e);
                    if (r3 != 0) {
                        r3.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r4 = "select metadata_fingerprint from raw_events where app_id = ?";
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            r3 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
            }
            throw th;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzeu.zzn(str), this.zzt.zzj().zzf(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    protected final boolean zzb() {
        return false;
    }

    protected final long zzc(String str, String str2) {
        long j;
        SQLiteException e;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzeu.zzn(str), "first_open_count");
                        return -1L;
                    }
                    j = 0;
                }
            } catch (SQLiteException e2) {
                j = 0;
                e = e2;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzeu.zzn(str), "first_open_count");
                    return -1L;
                }
                zzh2.setTransactionSuccessful();
                return j;
            } catch (SQLiteException e3) {
                e = e3;
                this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzeu.zzn(str), "first_open_count", e);
                return j;
            }
        } finally {
            zzh2.endTransaction();
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00dc: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:60:0x00dc */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzi(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        this.zzt.zzaA().zzj().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzli.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursor.getBlob(0))).zzaD();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfx> zzi2 = zzftVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi2) {
                            String zzg2 = zzfxVar.zzg();
                            if (zzfxVar.zzu()) {
                                bundle.putDouble(zzg2, zzfxVar.zza());
                            } else if (zzfxVar.zzv()) {
                                bundle.putFloat(zzg2, zzfxVar.zzb());
                            } else if (zzfxVar.zzy()) {
                                bundle.putString(zzg2, zzfxVar.zzh());
                            } else if (zzfxVar.zzw()) {
                                bundle.putLong(zzg2, zzfxVar.zzd());
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return bundle;
                    } catch (IOException e) {
                        this.zzt.zzaA().zzd().zzc("Failed to retrieve default event parameters. appId", zzeu.zzn(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Error selecting default event parameters", e);
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

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02c1: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:67:0x02c1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0201 A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0224 A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024f A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0273 A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0285 A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TRY_LEAVE, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f2 A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d A[Catch: SQLiteException -> 0x029e, all -> 0x02c0, TryCatch #0 {all -> 0x02c0, blocks: (B:5:0x00e3, B:11:0x00ef, B:13:0x014e, B:17:0x0158, B:20:0x01a2, B:22:0x01d1, B:26:0x01db, B:29:0x01f6, B:31:0x0201, B:32:0x0213, B:34:0x0224, B:36:0x023d, B:38:0x024f, B:40:0x0257, B:43:0x025e, B:44:0x0261, B:46:0x0273, B:47:0x027c, B:49:0x0285, B:54:0x0234, B:55:0x01f2, B:57:0x019d, B:60:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzj(String str) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        boolean z;
        boolean z2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        try {
            try {
                boolean z3 = false;
                cursor2 = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", App.JsonKeys.APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor2.moveToFirst()) {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzq(), str);
                    zzhVar.zzI(cursor2.getString(0));
                    zzhVar.zzX(cursor2.getString(1));
                    zzhVar.zzaf(cursor2.getString(2));
                    zzhVar.zzab(cursor2.getLong(3));
                    zzhVar.zzac(cursor2.getLong(4));
                    zzhVar.zzaa(cursor2.getLong(5));
                    zzhVar.zzK(cursor2.getString(6));
                    zzhVar.zzJ(cursor2.getString(7));
                    zzhVar.zzY(cursor2.getLong(8));
                    zzhVar.zzT(cursor2.getLong(9));
                    if (!cursor2.isNull(10) && cursor2.getInt(10) == 0) {
                        z = false;
                        zzhVar.zzad(z);
                        zzhVar.zzS(cursor2.getLong(11));
                        zzhVar.zzQ(cursor2.getLong(12));
                        zzhVar.zzP(cursor2.getLong(13));
                        zzhVar.zzN(cursor2.getLong(14));
                        zzhVar.zzM(cursor2.getLong(15));
                        zzhVar.zzV(cursor2.getLong(16));
                        zzhVar.zzL(!cursor2.isNull(17) ? -2147483648L : cursor2.getInt(17));
                        zzhVar.zzW(cursor2.getString(18));
                        zzhVar.zzO(cursor2.getLong(19));
                        zzhVar.zzR(cursor2.getLong(20));
                        zzhVar.zzZ(cursor2.getString(21));
                        if (!cursor2.isNull(23) && cursor2.getInt(23) == 0) {
                            z2 = false;
                            zzhVar.zzH(z2);
                            zzhVar.zzG(cursor2.getString(24));
                            zzhVar.zzU(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
                            if (!cursor2.isNull(26)) {
                                zzhVar.zzag(Arrays.asList(cursor2.getString(26).split(",", -1)));
                            }
                            zzqr.zzc();
                            if (!this.zzt.zzf().zzs(str, zzeh.zzao) || this.zzt.zzf().zzs(null, zzeh.zzam)) {
                                zzhVar.zzah(cursor2.getString(28));
                            }
                            zzra.zzc();
                            if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
                                if (!cursor2.isNull(29) && cursor2.getInt(29) != 0) {
                                    z3 = true;
                                }
                                zzhVar.zzai(z3);
                            }
                            zzpw.zzc();
                            if (this.zzt.zzf().zzs(null, zzeh.zzaE)) {
                                zzhVar.zzaj(cursor2.getLong(30));
                            }
                            zzhVar.zzE();
                            if (cursor2.moveToNext()) {
                                this.zzt.zzaA().zzd().zzb("Got multiple records for app, expected one. appId", zzeu.zzn(str));
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            return zzhVar;
                        }
                        z2 = true;
                        zzhVar.zzH(z2);
                        zzhVar.zzG(cursor2.getString(24));
                        zzhVar.zzU(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
                        if (!cursor2.isNull(26)) {
                        }
                        zzqr.zzc();
                        if (!this.zzt.zzf().zzs(str, zzeh.zzao)) {
                        }
                        zzhVar.zzah(cursor2.getString(28));
                        zzra.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
                        }
                        zzpw.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzaE)) {
                        }
                        zzhVar.zzE();
                        if (cursor2.moveToNext()) {
                        }
                        if (cursor2 != null) {
                        }
                        return zzhVar;
                    }
                    z = true;
                    zzhVar.zzad(z);
                    zzhVar.zzS(cursor2.getLong(11));
                    zzhVar.zzQ(cursor2.getLong(12));
                    zzhVar.zzP(cursor2.getLong(13));
                    zzhVar.zzN(cursor2.getLong(14));
                    zzhVar.zzM(cursor2.getLong(15));
                    zzhVar.zzV(cursor2.getLong(16));
                    zzhVar.zzL(!cursor2.isNull(17) ? -2147483648L : cursor2.getInt(17));
                    zzhVar.zzW(cursor2.getString(18));
                    zzhVar.zzO(cursor2.getLong(19));
                    zzhVar.zzR(cursor2.getLong(20));
                    zzhVar.zzZ(cursor2.getString(21));
                    if (!cursor2.isNull(23)) {
                        z2 = false;
                        zzhVar.zzH(z2);
                        zzhVar.zzG(cursor2.getString(24));
                        zzhVar.zzU(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
                        if (!cursor2.isNull(26)) {
                        }
                        zzqr.zzc();
                        if (!this.zzt.zzf().zzs(str, zzeh.zzao)) {
                        }
                        zzhVar.zzah(cursor2.getString(28));
                        zzra.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
                        }
                        zzpw.zzc();
                        if (this.zzt.zzf().zzs(null, zzeh.zzaE)) {
                        }
                        zzhVar.zzE();
                        if (cursor2.moveToNext()) {
                        }
                        if (cursor2 != null) {
                        }
                        return zzhVar;
                    }
                    z2 = true;
                    zzhVar.zzH(z2);
                    zzhVar.zzG(cursor2.getString(24));
                    zzhVar.zzU(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
                    if (!cursor2.isNull(26)) {
                    }
                    zzqr.zzc();
                    if (!this.zzt.zzf().zzs(str, zzeh.zzao)) {
                    }
                    zzhVar.zzah(cursor2.getString(28));
                    zzra.zzc();
                    if (this.zzt.zzf().zzs(null, zzeh.zzaq)) {
                    }
                    zzpw.zzc();
                    if (this.zzt.zzf().zzs(null, zzeh.zzaE)) {
                    }
                    zzhVar.zzE();
                    if (cursor2.moveToNext()) {
                    }
                    if (cursor2 != null) {
                    }
                    return zzhVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzc("Error querying app. appId", zzeu.zzn(str), e);
                    if (cursor2 == null) {
                        return null;
                    }
                    cursor2.close();
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [com.google.android.gms.measurement.internal.zzac] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzk(String str, String str2) {
        Cursor cursor;
        String str3;
        ?? r17;
        Cursor cursor2;
        Cursor cursor3;
        SQLiteDatabase zzh2;
        String[] strArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh2 = zzh();
            strArr = new String[11];
            strArr[0] = "origin";
            strArr[1] = "value";
            strArr[2] = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            strArr[3] = AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME;
            strArr[4] = AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT;
            strArr[5] = "timed_out_event";
            strArr[6] = AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP;
            strArr[7] = "triggered_event";
            strArr[8] = AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP;
            strArr[9] = AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE;
            cursor = null;
            r17 = 0;
            r17 = 0;
            r17 = 0;
        } catch (SQLiteException e) {
            e = e;
            str3 = str2;
            r17 = 0;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            strArr[10] = "expired_event";
            cursor3 = zzh2.query("conditional_properties", strArr, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor3.moveToFirst()) {
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return null;
                    }
                    String string = cursor3.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    Object zzq = zzq(cursor3, 1);
                    boolean z = cursor3.getInt(2) != 0;
                    String string2 = cursor3.getString(3);
                    long j = cursor3.getLong(4);
                    str3 = str2;
                    String str4 = string;
                    try {
                        zzac zzacVar = new zzac(str, str4, new zzlj(str3, cursor3.getLong(8), zzq, str4), cursor3.getLong(6), z, string2, (zzaw) this.zzf.zzu().zzh(cursor3.getBlob(5), zzaw.CREATOR), j, (zzaw) this.zzf.zzu().zzh(cursor3.getBlob(7), zzaw.CREATOR), cursor3.getLong(9), (zzaw) this.zzf.zzu().zzh(cursor3.getBlob(10), zzaw.CREATOR));
                        if (cursor3.moveToNext()) {
                            this.zzt.zzaA().zzd().zzc("Got multiple records for conditional property, expected one", zzeu.zzn(str), this.zzt.zzj().zzf(str3));
                        }
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return zzacVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        this.zzt.zzaA().zzd().zzd("Error querying conditional property", zzeu.zzn(str), this.zzt.zzj().zzf(str3), e);
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return r17;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor3;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str3 = str2;
            cursor3 = r17;
            this.zzt.zzaA().zzd().zzd("Error querying conditional property", zzeu.zzn(str), this.zzt.zzj().zzf(str3), e);
            if (cursor3 != null) {
            }
            return r17;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final zzak zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzak zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        try {
            SQLiteDatabase zzh2 = zzh();
            Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        zzakVar.zzb = query.getLong(1);
                        zzakVar.zza = query.getLong(2);
                        zzakVar.zzc = query.getLong(3);
                        zzakVar.zzd = query.getLong(4);
                        zzakVar.zze = query.getLong(5);
                    }
                    if (z) {
                        zzakVar.zzb += j2;
                    }
                    if (z2) {
                        zzakVar.zza += j2;
                    }
                    if (z3) {
                        zzakVar.zzc += j2;
                    }
                    if (z4) {
                        zzakVar.zzd += j2;
                    }
                    if (z5) {
                        zzakVar.zze += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzakVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.zze));
                    zzh2.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                        return zzakVar;
                    }
                } else {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzeu.zzn(str));
                    if (query != null) {
                        query.close();
                        return zzakVar;
                    }
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzeu.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzakVar;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return zzakVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzas zzn(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        Boolean bool;
        Long l;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            Cursor query = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                long j = query.getLong(0);
                long j2 = query.getLong(1);
                long j3 = query.getLong(2);
                long j4 = query.isNull(3) ? 0L : query.getLong(3);
                Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                Long valueOf3 = query.isNull(6) ? null : Long.valueOf(query.getLong(6));
                if (query.isNull(7)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(query.getLong(7) == 1);
                }
                try {
                    cursor2 = query;
                    l = valueOf2;
                    str3 = str2;
                } catch (SQLiteException e) {
                    e = e;
                    str3 = str2;
                    cursor2 = query;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = query;
                }
                try {
                    zzas zzasVar = new zzas(str, str3, j, j2, query.isNull(8) ? 0L : query.getLong(8), j3, j4, valueOf, l, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeu.zzn(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzasVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursor2;
                    try {
                        this.zzt.zzaA().zzd().zzd("Error querying events. appId", zzeu.zzn(str), this.zzt.zzj().zzd(str3), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursor2 = query;
            } catch (Throwable th4) {
                th = th4;
                cursor2 = query;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str3 = str2;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzll zzp(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zzq = zzq(cursor, 1);
                    if (zzq == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzll zzllVar = new zzll(str3, cursor.getString(2), str4, j, zzq);
                        if (cursor.moveToNext()) {
                            this.zzt.zzaA().zzd().zzb("Got multiple records for user property, expected one. appId", zzeu.zzn(str3));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzllVar;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        this.zzt.zzaA().zzd().zzd("Error querying user property. appId", zzeu.zzn(str3), this.zzt.zzj().zzf(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
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
    }

    final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzt.zzaA().zzd().zza("Loaded invalid null value from database");
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
        if (type != 4) {
            this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.zzt.zzaA().zzd().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzr() {
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = zzh().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
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
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                cursor2 = cursor;
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
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
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        r3 = r33.zzt.zzaA().zzd();
        r33.zzt.zzf();
        r3.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        Cursor cursor;
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase zzh2 = zzh();
            int i = 0;
            String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzt.zzf();
            int i2 = 4;
            Cursor query = zzh2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        this.zzt.zzf();
                        if (size >= 1000) {
                            break;
                        }
                        String string = query.getString(i);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object zzq = zzq(query, 3);
                        int i3 = query.getInt(i2) != 0 ? 1 : i;
                        arrayList.add(new zzac(string, string2, new zzlj(string3, query.getLong(10), zzq, string2), query.getLong(8), i3, query.getString(5), (zzaw) this.zzf.zzu().zzh(query.getBlob(7), zzaw.CREATOR), query.getLong(6), (zzaw) this.zzf.zzu().zzh(query.getBlob(9), zzaw.CREATOR), query.getLong(11), (zzaw) this.zzf.zzu().zzh(query.getBlob(12), zzaw.CREATOR)));
                        if (!query.moveToNext()) {
                            break;
                        }
                        i2 = 4;
                        i = 0;
                    }
                    if (query != null) {
                        query.close();
                        return arrayList;
                    }
                } else if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    this.zzt.zzaA().zzd().zzb("Error querying conditional user property value", e);
                    List emptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzt.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = cursor.getLong(2);
                        Object zzq = zzq(cursor, 3);
                        if (zzq == null) {
                            this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeu.zzn(str));
                        } else {
                            arrayList.add(new zzll(str, str2, string, j, zzq));
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                        return arrayList;
                    }
                } else if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzeu.zzn(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r0 = r18.zzt.zzaA().zzd();
        r18.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzv(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
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
                        cursor = null;
                        try {
                            this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzeu.zzn(str), str4, e);
                            List emptyList = Collections.emptyList();
                            if (cursor != null) {
                            }
                            return emptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String sb2 = sb.toString();
                this.zzt.zzf();
                Cursor query = zzh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (query.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                this.zzt.zzf();
                                if (size >= 1000) {
                                    break;
                                }
                                String string = query.getString(0);
                                long j = query.getLong(1);
                                Object zzq = zzq(query, 2);
                                String string2 = query.getString(3);
                                if (zzq == null) {
                                    try {
                                        this.zzt.zzaA().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeu.zzn(str5), string2, str3);
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = query;
                                        str4 = string2;
                                        this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzeu.zzn(str), str4, e);
                                        List emptyList2 = Collections.emptyList();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return emptyList2;
                                    }
                                } else {
                                    arrayList.add(new zzll(str5, string2, string, j, zzq));
                                }
                                if (!query.moveToNext()) {
                                    break;
                                }
                                str5 = str;
                                str4 = string2;
                            }
                            if (query != null) {
                                query.close();
                            }
                        } else if (query != null) {
                            query.close();
                            return arrayList;
                        }
                        return arrayList;
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursor = query;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzt.zzaA().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeh.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzt.zzax().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
