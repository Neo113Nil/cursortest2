package com.google.android.gms.measurement.internal;

import B0.A0;
import N3.C3661l;
import U7.C4056a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
final class zzam extends zzkz {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzkv zzk;

    zzam(zzll zzllVar) {
        super(zzllVar);
        this.zzk = new zzkv(this.zzs.zzav());
        this.zzs.zzf();
        this.zzj = new zzal(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
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
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzc("Database error", str, e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final long zzaa(String str, String[] strArr, long j11) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j11;
                }
                long j12 = cursor.getLong(0);
                cursor.close();
                return j12;
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzc("Database error", str, e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzfa.zzn(str), this.zzs.zzj().zzf(str2), e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0287, code lost:
    
        r22.zzs.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        r0 = zzh();
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
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0483, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0486, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r0 = r22.zzs.zzay().zzk();
        r11 = com.google.android.gms.measurement.internal.zzfa.zzn(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        if (r12.zzp() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzes) r3.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (r7.zze().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f8, code lost:
    
        r11 = r7.zzby();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
    
        if (r7.zzj() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032f, code lost:
    
        if (r7.zzk() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0331, code lost:
    
        r3 = java.lang.Boolean.valueOf(r7.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r12.put("session_scoped", r3);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034d, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034f, code lost:
    
        r22.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzfa.zzn(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036b, code lost:
    
        r22.zzs.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzfa.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c8, code lost:
    
        r0 = r22.zzs.zzay().zzk();
        r9 = com.google.android.gms.measurement.internal.zzfa.zzn(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (r7.zzj() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ef, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzes) r11.next()).zzj() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r22.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzfa.zzn(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzej) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0213, code lost:
    
        r3 = r12.zzby();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r12.zzp() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024b, code lost:
    
        if (r12.zzq() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        r22.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzfa.zzn(r23));
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
    final void zzB(String str, List list) {
        SQLiteDatabase sQLiteDatabase;
        boolean z11;
        Preconditions.checkNotNull(list);
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.android.gms.internal.measurement.zzeg zzegVar = (com.google.android.gms.internal.measurement.zzeg) ((com.google.android.gms.internal.measurement.zzeh) list.get(i11)).zzbB();
            if (zzegVar.zza() != 0) {
                for (int i12 = 0; i12 < zzegVar.zza(); i12++) {
                    com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) zzegVar.zze(i12).zzbB();
                    com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) zzeiVar.clone();
                    String zzb2 = zzhh.zzb(zzeiVar.zze());
                    if (zzb2 != null) {
                        zzeiVar2.zzb(zzb2);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i13 = 0;
                    while (i13 < zzeiVar.zza()) {
                        com.google.android.gms.internal.measurement.zzel zzd2 = zzeiVar.zzd(i13);
                        com.google.android.gms.internal.measurement.zzei zzeiVar3 = zzeiVar;
                        boolean z12 = z11;
                        String zzb3 = zziv.zzb(zzd2.zze(), zzhi.zza, zzhi.zzb);
                        if (zzb3 != null) {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) zzd2.zzbB();
                            zzekVar.zza(zzb3);
                            zzeiVar2.zzc(i13, (com.google.android.gms.internal.measurement.zzel) zzekVar.zzaE());
                            z11 = true;
                        } else {
                            z11 = z12;
                        }
                        i13++;
                        zzeiVar = zzeiVar3;
                    }
                    if (z11) {
                        zzegVar.zzc(i12, zzeiVar2);
                        list.set(i11, (com.google.android.gms.internal.measurement.zzeh) zzegVar.zzaE());
                    }
                }
            }
            if (zzegVar.zzb() != 0) {
                for (int i14 = 0; i14 < zzegVar.zzb(); i14++) {
                    com.google.android.gms.internal.measurement.zzes zzf = zzegVar.zzf(i14);
                    String zzb4 = zziv.zzb(zzf.zze(), zzhj.zza, zzhj.zzb);
                    if (zzb4 != null) {
                        com.google.android.gms.internal.measurement.zzer zzerVar = (com.google.android.gms.internal.measurement.zzer) zzf.zzbB();
                        zzerVar.zza(zzb4);
                        zzegVar.zzd(i14, zzerVar);
                        list.set(i11, (com.google.android.gms.internal.measurement.zzeh) zzegVar.zzaE());
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
                com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) it.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzehVar);
                if (zzehVar.zzk()) {
                    int zza2 = zzehVar.zza();
                    Iterator it2 = zzehVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzej) it2.next()).zzp()) {
                                this.zzs.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfa.zzn(str), Integer.valueOf(zza2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzs.zzay().zzk().zzb("Audience with no ID. appId", zzfa.zzn(str));
                }
            }
            sQLiteDatabase = zzh2;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar2 = (com.google.android.gms.internal.measurement.zzeh) it3.next();
                arrayList.add(zzehVar2.zzk() ? Integer.valueOf(zzehVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase zzh4 = zzh();
            try {
                long zzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i15 = 0;
                int max = Math.max(0, Math.min(2000, this.zzs.zzf().zze(str, zzen.zzE)));
                if (zzZ > max) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            String join = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append("(" + join + ")");
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            zzh4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i15);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i15++;
                    }
                }
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str), e11);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
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
        String zzt = zzhVar.zzt();
        Preconditions.checkNotNull(zzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzhVar.zzu());
        contentValues.put("gmp_app_id", zzhVar.zzy());
        contentValues.put("resettable_device_id_hash", zzhVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzw());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzaj()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzz());
        contentValues.put("android_id", Long.valueOf(zzhVar.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("admob_app_id", zzhVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzB());
        List zzC = zzhVar.zzC();
        if (zzC != null) {
            if (zzC.isEmpty()) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzC));
            }
        }
        zznz.zzc();
        if (this.zzs.zzf().zzs(null, zzen.zzay) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzfa.zzn(zzt));
            }
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzfa.zzn(zzt), e11);
        }
    }

    public final void zzE(zzas zzasVar) {
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzasVar.zzb);
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
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzfa.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzfa.zzn(zzasVar.zza), e11);
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

    @VisibleForTesting
    protected final boolean zzI() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l11, long j11, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l11);
        byte[] zzby = zzfsVar.zzby();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l11);
        contentValues.put("children_to_process", Long.valueOf(j11));
        contentValues.put("main_event", zzby);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzfa.zzn(str));
            return false;
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzfa.zzn(str), e11);
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
            this.zzs.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzacVar.zzc.zzb);
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzfa.zzn(str));
            return true;
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzfa.zzn(str), e11);
            return true;
        }
    }

    public final boolean zzL(zzlq zzlqVar) {
        Preconditions.checkNotNull(zzlqVar);
        zzg();
        zzW();
        if (zzp(zzlqVar.zza, zzlqVar.zzc) == null) {
            if (zzlt.zzai(zzlqVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlqVar.zza}) >= this.zzs.zzf().zzf(zzlqVar.zza, zzen.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlqVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlqVar.zza, zzlqVar.zzb});
                this.zzs.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlqVar.zza);
        contentValues.put("origin", zzlqVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzlqVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlqVar.zzd));
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzlqVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzfa.zzn(zzlqVar.zza));
            return true;
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzfa.zzn(zzlqVar.zza), e11);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzU(String str, long j11, long j12, zzli zzliVar) {
        String string;
        String str2;
        String[] strArr;
        ?? r32 = "select app_id, metadata_fingerprint from raw_events where ";
        Preconditions.checkNotNull(zzliVar);
        zzg();
        zzW();
        ?? r42 = 0;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j12 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j12 != -1 ? new String[]{String.valueOf(j12), String.valueOf(j11)} : new String[]{String.valueOf(j11)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        Cursor rawQuery2 = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j12 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j12 != -1 ? new String[]{null, String.valueOf(j12)} : new String[]{null});
                        if (!rawQuery2.moveToFirst()) {
                            rawQuery2.close();
                            return;
                        } else {
                            string = rawQuery2.getString(0);
                            rawQuery2.close();
                        }
                    }
                    Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                    if (!query.moveToFirst()) {
                        this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzfa.zzn(str3));
                        query.close();
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgb) zzln.zzl(com.google.android.gms.internal.measurement.zzgc.zzu(), query.getBlob(0))).zzaE();
                        if (query.moveToNext()) {
                            this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzfa.zzn(str3));
                        }
                        query.close();
                        Preconditions.checkNotNull(zzgcVar);
                        zzliVar.zza = zzgcVar;
                        if (j12 != -1) {
                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{str3, string, String.valueOf(j12)};
                        } else {
                            str2 = "app_id = ? and metadata_fingerprint = ?";
                            strArr = new String[]{str3, string};
                        }
                        Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                        if (!query2.moveToFirst()) {
                            this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzfa.zzn(str3));
                            query2.close();
                            return;
                        }
                        do {
                            long j13 = query2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzln.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), query2.getBlob(3));
                                zzfrVar.zzi(query2.getString(1));
                                zzfrVar.zzm(query2.getLong(2));
                                if (!zzliVar.zza(j13, (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE())) {
                                    query2.close();
                                    return;
                                }
                            } catch (IOException e11) {
                                this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzfa.zzn(str3), e11);
                            }
                        } while (query2.moveToNext());
                        query2.close();
                    } catch (IOException e12) {
                        this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzfa.zzn(str3), e12);
                        query.close();
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzfa.zzn(null), e);
                    if (r32 != 0) {
                        r32.close();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r42 = "select app_id, metadata_fingerprint from raw_events where ";
                if (r42 != 0) {
                    r42.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
            r32 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r42 != 0) {
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
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzfa.zzn(str), this.zzs.zzj().zzf(str2), e11);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkz
    protected final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    protected final long zzc(String str, String str2) {
        SQLiteException e11;
        long j11;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j11 = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j11 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzfa.zzn(str), "first_open_count");
                        return -1L;
                    }
                    j11 = 0;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e12) {
            e11 = e12;
            j11 = 0;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + j11));
            if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzfa.zzn(str), "first_open_count");
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return j11;
        } catch (SQLiteException e13) {
            e11 = e13;
            this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzfa.zzn(str), "first_open_count", e11);
            return j11;
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

    @VisibleForTesting
    final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e11) {
            this.zzs.zzay().zzk().zzb("Error opening database", e11);
            throw e11;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
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
                        this.zzs.zzay().zzj().zza("Default event parameters not found");
                        cursor.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzln.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursor.getBlob(0))).zzaE();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfw> zzi2 = zzfsVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzi2) {
                            String zzg2 = zzfwVar.zzg();
                            if (zzfwVar.zzu()) {
                                bundle.putDouble(zzg2, zzfwVar.zza());
                            } else if (zzfwVar.zzv()) {
                                bundle.putFloat(zzg2, zzfwVar.zzb());
                            } else if (zzfwVar.zzy()) {
                                bundle.putString(zzg2, zzfwVar.zzh());
                            } else if (zzfwVar.zzw()) {
                                bundle.putLong(zzg2, zzfwVar.zzd());
                            }
                        }
                        cursor.close();
                        return bundle;
                    } catch (IOException e11) {
                        this.zzs.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzfa.zzn(str), e11);
                        cursor.close();
                        return null;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    this.zzs.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
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
        } catch (SQLiteException e13) {
            e = e13;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01f3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:63:0x01f3 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzj(String str) {
        String str2;
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    str2 = str;
                    try {
                        zzh zzhVar = new zzh(this.zzf.zzq(), str2);
                        zzhVar.zzI(cursor.getString(0));
                        zzhVar.zzX(cursor.getString(1));
                        zzhVar.zzaf(cursor.getString(2));
                        zzhVar.zzab(cursor.getLong(3));
                        zzhVar.zzac(cursor.getLong(4));
                        zzhVar.zzaa(cursor.getLong(5));
                        zzhVar.zzK(cursor.getString(6));
                        zzhVar.zzJ(cursor.getString(7));
                        zzhVar.zzY(cursor.getLong(8));
                        zzhVar.zzT(cursor.getLong(9));
                        zzhVar.zzad(cursor.isNull(10) || cursor.getInt(10) != 0);
                        zzhVar.zzS(cursor.getLong(11));
                        zzhVar.zzQ(cursor.getLong(12));
                        zzhVar.zzP(cursor.getLong(13));
                        zzhVar.zzN(cursor.getLong(14));
                        zzhVar.zzM(cursor.getLong(15));
                        zzhVar.zzV(cursor.getLong(16));
                        zzhVar.zzL(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                        zzhVar.zzW(cursor.getString(18));
                        zzhVar.zzO(cursor.getLong(19));
                        zzhVar.zzR(cursor.getLong(20));
                        zzhVar.zzZ(cursor.getString(21));
                        long j11 = 0;
                        if (!this.zzs.zzf().zzs(null, zzen.zzah)) {
                            zzhVar.zzH(cursor.isNull(22) ? 0L : cursor.getLong(22));
                        }
                        zzhVar.zzG(cursor.isNull(23) || cursor.getInt(23) != 0);
                        zzhVar.zzF(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                            j11 = cursor.getLong(25);
                        }
                        zzhVar.zzU(j11);
                        if (!cursor.isNull(26)) {
                            zzhVar.zzag(Arrays.asList(cursor.getString(26).split(",", -1)));
                        }
                        zzps.zzc();
                        if (this.zzs.zzf().zzs(null, zzen.zzaH)) {
                            zzhVar.zzah(cursor.getString(28));
                        }
                        zzhVar.zzD();
                        if (cursor.moveToNext()) {
                            this.zzs.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzfa.zzn(str2));
                        }
                        cursor.close();
                        return zzhVar;
                    } catch (SQLiteException e11) {
                        e = e11;
                        this.zzs.zzay().zzd().zzc("Error querying app. appId", zzfa.zzn(str2), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    str2 = str;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str2 = str;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzk(String str, String str2) {
        String str3;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = zzh().query("conditional_properties", new String[]{"origin", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object zzq = zzq(cursor, 1);
                    boolean z11 = cursor.getInt(2) != 0;
                    String string2 = cursor.getString(3);
                    long j11 = cursor.getLong(4);
                    zzln zzu = this.zzf.zzu();
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) zzu.zzh(blob, creator);
                    long j12 = cursor.getLong(6);
                    zzaw zzawVar2 = (zzaw) this.zzf.zzu().zzh(cursor.getBlob(7), creator);
                    long j13 = cursor.getLong(8);
                    long j14 = cursor.getLong(9);
                    zzaw zzawVar3 = (zzaw) this.zzf.zzu().zzh(cursor.getBlob(10), creator);
                    str3 = str2;
                    try {
                        zzac zzacVar = new zzac(str, str4, new zzlo(str3, j13, zzq, str4), j12, z11, string2, zzawVar, j11, zzawVar2, j14, zzawVar3);
                        if (cursor.moveToNext()) {
                            this.zzs.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzfa.zzn(str), this.zzs.zzj().zzf(str3));
                        }
                        cursor.close();
                        return zzacVar;
                    } catch (SQLiteException e11) {
                        e = e11;
                        this.zzs.zzay().zzd().zzd("Error querying conditional property", zzfa.zzn(str), this.zzs.zzj().zzf(str3), e);
                        if (cursor != null) {
                            cursor.close();
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
            } catch (SQLiteException e12) {
                e = e12;
                str3 = str2;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str3 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final zzak zzl(long j11, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return zzm(j11, str, 1L, false, false, z13, false, z15);
    }

    public final zzak zzm(long j11, String str, long j12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzfa.zzn(str));
                    query.close();
                    return zzakVar;
                }
                if (query.getLong(0) == j11) {
                    zzakVar.zzb = query.getLong(1);
                    zzakVar.zza = query.getLong(2);
                    zzakVar.zzc = query.getLong(3);
                    zzakVar.zzd = query.getLong(4);
                    zzakVar.zze = query.getLong(5);
                }
                if (z11) {
                    zzakVar.zzb += j12;
                }
                if (z12) {
                    zzakVar.zza += j12;
                }
                if (z13) {
                    zzakVar.zzc += j12;
                }
                if (z14) {
                    zzakVar.zzd += j12;
                }
                if (z15) {
                    zzakVar.zze += j12;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j11));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzakVar;
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzfa.zzn(str), e11);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzas zzn(String str, String str2) {
        Cursor cursor;
        Boolean bool;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        CursorWrapper cursorWrapper = 0;
        try {
            try {
                cursor = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j11 = cursor.getLong(0);
                    long j12 = cursor.getLong(1);
                    long j13 = cursor.getLong(2);
                    long j14 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                    Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                    Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                    Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                    if (cursor.isNull(7)) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(cursor.getLong(7) == 1);
                    }
                    zzas zzasVar = new zzas(str, str2, j11, j12, cursor.isNull(8) ? 0L : cursor.getLong(8), j13, j14, valueOf, valueOf2, valueOf3, bool);
                    if (cursor.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzfa.zzn(str));
                    }
                    cursor.close();
                    return zzasVar;
                } catch (SQLiteException e11) {
                    e = e11;
                    this.zzs.zzay().zzd().zzd("Error querying events. appId", zzfa.zzn(str), this.zzs.zzj().zzd(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorWrapper = "current_bundle_count";
                if (cursorWrapper != 0) {
                    cursorWrapper.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursorWrapper != 0) {
            }
            throw th;
        }
    }

    public final zzlq zzp(String str, String str2) {
        Throwable th2;
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
            cursor = zzh().query("user_attributes", new String[]{"set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j11 = cursor.getLong(0);
                    Object zzq = zzq(cursor, 1);
                    if (zzq == null) {
                        cursor.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzlq zzlqVar = new zzlq(str3, cursor.getString(2), str4, j11, zzq);
                        if (cursor.moveToNext()) {
                            this.zzs.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzfa.zzn(str3));
                        }
                        cursor.close();
                        return zzlqVar;
                    } catch (SQLiteException e11) {
                        e = e11;
                        sQLiteException = e;
                        this.zzs.zzay().zzd().zzd("Error querying user property. appId", zzfa.zzn(str3), this.zzs.zzj().zzf(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor2 = cursor;
                if (cursor2 == null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (SQLiteException e13) {
            str3 = str;
            str4 = str2;
            sQLiteException = e13;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @VisibleForTesting
    final Object zzq(Cursor cursor, int i11) {
        int type = cursor.getType(i11);
        if (type == 0) {
            C3661l.b(this.zzs, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i11));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i11));
        }
        if (type == 3) {
            return cursor.getString(i11);
        }
        if (type != 4) {
            this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        C3661l.b(this.zzs, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzr() {
        SQLiteException e11;
        Cursor cursor;
        SQLiteDatabase zzh2 = zzh();
        ?? r12 = 0;
        try {
            try {
                cursor = zzh2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                } catch (SQLiteException e12) {
                    e11 = e12;
                    this.zzs.zzay().zzd().zzb("Database error getting next bundle app id", e11);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                r12 = zzh2;
                th = th2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e11 = e13;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
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
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2 = r27.zzs.zzay().zzd();
        r27.zzs.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                String[] strArr2 = {"app_id", "origin", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                this.zzs.zzf();
                cursor = zzh2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size >= 1000) {
                        break;
                    }
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object zzq = zzq(cursor, 3);
                    boolean z11 = cursor.getInt(4) != 0;
                    String string4 = cursor.getString(5);
                    long j11 = cursor.getLong(6);
                    zzln zzu = this.zzf.zzu();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) zzu.zzh(blob, creator);
                    arrayList.add(new zzac(string, string2, new zzlo(string3, cursor.getLong(10), zzq, string2), cursor.getLong(8), z11, string4, zzawVar, j11, (zzaw) this.zzf.zzu().zzh(cursor.getBlob(9), creator), cursor.getLong(11), (zzaw) this.zzf.zzu().zzh(cursor.getBlob(12), creator)));
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzb("Error querying conditional user property value", e11);
                List list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final List zzu(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzs.zzf();
                cursor = zzh().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j11 = cursor.getLong(2);
                        Object zzq = zzq(cursor, 3);
                        if (zzq == null) {
                            this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzfa.zzn(str));
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new zzlq(str2, str3, string, j11, zzq));
                            } catch (SQLiteException e11) {
                                e = e11;
                                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzfa.zzn(str2), e);
                                List list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return list;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            cursor.close();
                            return arrayList;
                        }
                        str = str2;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e13) {
            e = e13;
            str2 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r0 = r17.zzs.zzay().zzd();
        r17.zzs.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzv(String str, String str2, String str3) {
        String str4;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str5 = str;
                arrayList2.add(str5);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e11) {
                        e = e11;
                        this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzfa.zzn(str), str4, e);
                        List list = Collections.EMPTY_LIST;
                        if (cursor != null) {
                            cursor.close();
                        }
                        return list;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                SQLiteDatabase zzh2 = zzh();
                String[] strArr2 = {AppMeasurementSdk.ConditionalUserProperty.NAME, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, "origin"};
                String sb3 = sb2.toString();
                this.zzs.zzf();
                cursor = zzh2.query("user_attributes", strArr2, sb3, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size < 1000) {
                        String string = cursor.getString(0);
                        long j11 = cursor.getLong(1);
                        Object zzq = zzq(cursor, 2);
                        String string2 = cursor.getString(3);
                        if (zzq == null) {
                            try {
                                this.zzs.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzfa.zzn(str5), string2, str3);
                            } catch (SQLiteException e12) {
                                e = e12;
                                str4 = string2;
                                this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzfa.zzn(str), str4, e);
                                List list2 = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return list2;
                            }
                        } else {
                            arrayList.add(new zzlq(str5, string2, string, j11, zzq));
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str5 = str;
                        str4 = string2;
                    } else {
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e13) {
                e = e13;
                str4 = str2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
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

    @VisibleForTesting
    final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String b11 = A0.b("(", TextUtils.join(",", list), ")");
            if (zzZ(A0.b("SELECT COUNT(1) FROM queue WHERE rowid IN ", b11, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                C4056a.a(this.zzs, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + b11 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e11) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e11);
            }
        }
    }

    final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzs.zzf();
            if (abs > ((Long) zzen.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    String valueOf = String.valueOf(this.zzs.zzav().currentTimeMillis());
                    this.zzs.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
