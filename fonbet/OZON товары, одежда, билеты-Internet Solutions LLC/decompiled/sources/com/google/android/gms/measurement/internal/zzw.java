package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzfs zzb;
    private Long zzc;
    private long zzd;

    /* synthetic */ zzw(zzaa zzaaVar, zzv zzvVar) {
        this.zza = zzaaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e4: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:70:0x00e4 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.zzfs zza(String str, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        Cursor cursor;
        Cursor cursor2;
        Pair pair;
        Object obj;
        String zzh = zzfsVar.zzh();
        List zzi = zzfsVar.zzi();
        this.zza.zzf.zzu();
        Long l11 = (Long) zzln.zzC(zzfsVar, "_eid");
        if (l11 != null) {
            if (zzh.equals("_ep")) {
                Preconditions.checkNotNull(l11);
                this.zza.zzf.zzu();
                String str2 = (String) zzln.zzC(zzfsVar, "_en");
                Cursor cursor3 = null;
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzs.zzay().zzh().zzb("Extra parameter without an event name. eventId", l11);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l11.longValue() != this.zzc.longValue()) {
                    zzam zzi2 = this.zza.zzf.zzi();
                    zzi2.zzg();
                    zzi2.zzW();
                    try {
                        try {
                            cursor = zzi2.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l11.toString()});
                            try {
                            } catch (SQLiteException e11) {
                                e = e11;
                                zzi2.zzs.zzay().zzd().zzb("Error selecting main event", e);
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
                    if (cursor.moveToFirst()) {
                        try {
                            pair = Pair.create((com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzln.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursor.getBlob(0))).zzaE(), Long.valueOf(cursor.getLong(1)));
                            cursor.close();
                        } catch (IOException e13) {
                            zzi2.zzs.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzfa.zzn(str), l11, e13);
                        }
                        if (pair != null || (obj = pair.first) == null) {
                            this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l11);
                            return null;
                        }
                        this.zzb = (com.google.android.gms.internal.measurement.zzfs) obj;
                        this.zzd = ((Long) pair.second).longValue();
                        this.zza.zzf.zzu();
                        this.zzc = (Long) zzln.zzC(this.zzb, "_eid");
                    } else {
                        zzi2.zzs.zzay().zzj().zza("Main event not found");
                    }
                    cursor.close();
                    pair = null;
                    if (pair != null) {
                    }
                    this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l11);
                    return null;
                }
                long j11 = this.zzd - 1;
                this.zzd = j11;
                if (j11 <= 0) {
                    zzam zzi3 = this.zza.zzf.zzi();
                    zzi3.zzg();
                    zzi3.zzs.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzi3.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e14) {
                        zzi3.zzs.zzay().zzd().zzb("Error clearing complex main event", e14);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l11, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzln.zzB(zzfsVar, zzfwVar.zzg()) == null) {
                        arrayList.add(zzfwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzs.zzay().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zzi);
                    zzi = arrayList;
                }
                zzh = str2;
            } else {
                this.zzc = l11;
                this.zzb = zzfsVar;
                this.zza.zzf.zzu();
                Object zzC = zzln.zzC(zzfsVar, "_epc");
                long longValue = ((Long) (zzC != null ? zzC : 0L)).longValue();
                this.zzd = longValue;
                if (longValue <= 0) {
                    this.zza.zzs.zzay().zzh().zzb("Complex event with zero extra param count. eventName", zzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l11), this.zzd, zzfsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzfsVar.zzbB();
        zzfrVar.zzi(zzh);
        zzfrVar.zzg();
        zzfrVar.zzd(zzi);
        return (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE();
    }
}
