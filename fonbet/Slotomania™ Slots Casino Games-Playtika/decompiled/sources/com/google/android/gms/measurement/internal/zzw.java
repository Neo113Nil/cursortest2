package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        if (r14 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011e, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        if (r14 == null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        Cursor cursor;
        com.google.android.gms.internal.measurement.zzft zzftVar2;
        long j;
        Cursor cursor2;
        Pair pair;
        Pair pair2;
        String zzh = zzftVar.zzh();
        List zzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzli.zzC(zzftVar, "_eid");
        if (l != null) {
            if (zzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                String str2 = (String) zzli.zzC(zzftVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzt.zzaA().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l.longValue() != this.zzc.longValue()) {
                    zzam zzi2 = this.zza.zzf.zzi();
                    zzi2.zzg();
                    zzi2.zzW();
                    try {
                        cursor2 = zzi2.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    zzftVar2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzli.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursor2.getBlob(0))).zzaD(), Long.valueOf(cursor2.getLong(1)));
                                            pair2 = create;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                                pair2 = create;
                                            }
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            zzi2.zzt.zzaA().zzd().zzb("Error selecting main event", e);
                                        }
                                    } catch (IOException e2) {
                                        j = 0;
                                        try {
                                            zzi2.zzt.zzaA().zzd().zzd("Failed to merge main event. appId, eventId", zzeu.zzn(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzi2.zzt.zzaA().zzd().zzb("Error selecting main event", e);
                                        }
                                    }
                                } else {
                                    zzi2.zzt.zzaA().zzj().zza("Main event not found");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    pair2 = null;
                                    zzftVar2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                zzftVar2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        zzftVar2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair == 0 || pair.first == null) {
                        this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return zzftVar2;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzft) pair.first;
                    this.zzd = ((Long) pair.second).longValue();
                    this.zza.zzf.zzu();
                    this.zzc = (Long) zzli.zzC(this.zzb, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.zzd - 1;
                this.zzd = j2;
                if (j2 <= j) {
                    zzam zzi3 = this.zza.zzf.zzi();
                    zzi3.zzg();
                    zzi3.zzt.zzaA().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzi3.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        zzi3.zzt.zzaA().zzd().zzb("Error clearing complex main event", e6);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzli.zzB(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzt.zzaA().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zzi);
                    zzi = arrayList;
                }
                zzh = str2;
            } else {
                this.zzc = l;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object zzC = zzli.zzC(zzftVar, "_epc");
                long longValue = ((Long) (zzC != null ? zzC : 0L)).longValue();
                this.zzd = longValue;
                if (longValue <= 0) {
                    this.zza.zzt.zzaA().zzh().zzb("Complex event with zero extra param count. eventName", zzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzbB();
        zzfsVar.zzi(zzh);
        zzfsVar.zzg();
        zzfsVar.zzd(zzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD();
    }
}
