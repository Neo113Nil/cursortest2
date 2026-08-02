package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzw {
    private zzfn.zze zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzs zzd;

    final zzfn.zze zza(String str, zzfn.zze zzeVar) {
        String zzg = zzeVar.zzg();
        List<zzfn.zzg> zzh = zzeVar.zzh();
        this.zzd.g_();
        Long l = (Long) zznp.zzb(zzeVar, "_eid");
        boolean z = l != null;
        if (z && zzg.equals("_ep")) {
            Preconditions.checkNotNull(l);
            this.zzd.g_();
            zzg = (String) zznp.zzb(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzm().zza("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                Pair<zzfn.zze, Long> zza = this.zzd.zzh().zza(str, l);
                if (zza == null || zza.first == null) {
                    this.zzd.zzj().zzm().zza("Extra parameter without existing main event. eventName, eventId", zzg, l);
                    return null;
                }
                this.zza = (zzfn.zze) zza.first;
                this.zzc = ((Long) zza.second).longValue();
                this.zzd.g_();
                this.zzb = (Long) zznp.zzb(this.zza, "_eid");
            }
            long j = this.zzc - 1;
            this.zzc = j;
            if (j <= 0) {
                zzan zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzh2.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    zzh2.zzj().zzg().zza("Error clearing complex main event", e);
                }
            } else {
                this.zzd.zzh().zza(str, l, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfn.zzg zzgVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zznp.zza(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (arrayList.isEmpty()) {
                this.zzd.zzj().zzm().zza("No unique parameters in main event. eventName", zzg);
            } else {
                arrayList.addAll(zzh);
                zzh = arrayList;
            }
        } else if (z) {
            this.zzb = l;
            this.zza = zzeVar;
            this.zzd.g_();
            Object zzb = zznp.zzb(zzeVar, "_epc");
            long longValue = ((Long) (zzb != null ? zzb : 0L)).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzm().zza("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l), this.zzc, zzeVar);
            }
        }
        return (zzfn.zze) ((com.google.android.gms.internal.measurement.zzjk) zzeVar.zzca().zza(zzg).zzd().zza(zzh).zzag());
    }

    private zzw(zzs zzsVar) {
        this.zzd = zzsVar;
    }
}
