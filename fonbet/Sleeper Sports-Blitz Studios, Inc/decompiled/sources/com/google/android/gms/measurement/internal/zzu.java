package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zznz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzu {
    private String zza;
    private boolean zzb;
    private zzfn.zzl zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzs zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzfn$zzc$zza, com.google.android.gms.internal.measurement.zzjk$zza] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.zzfn$zzl$zza] */
    final zzfn.zzc zza(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfn.zzc.zzb();
        zzb.zza(i);
        zzb.zza(this.zzb);
        zzfn.zzl zzlVar = this.zzc;
        if (zzlVar != null) {
            zzb.zza(zzlVar);
        }
        ?? zzd = zzfn.zzl.zze().zzb(zznp.zza(this.zzd)).zzd(zznp.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            for (Integer num : this.zzf.keySet()) {
                int intValue = num.intValue();
                Long l = this.zzf.get(num);
                if (l != null) {
                    arrayList.add((zzfn.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzfn.zzd.zzc().zza(intValue).zza(l.longValue()).zzag()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.zzg == null) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num2 : this.zzg.keySet()) {
                zzfn.zzm.zza zza = zzfn.zzm.zzc().zza(num2.intValue());
                List<Long> list = this.zzg.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfn.zzm) ((com.google.android.gms.internal.measurement.zzjk) zza.zzag()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfn.zzc) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzag());
    }

    private zzu(zzs zzsVar, String str) {
        this.zzh = zzsVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzu(zzs zzsVar, String str, zzfn.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzsVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzlVar;
    }

    final void zza(zzab zzabVar) {
        int zza = zzabVar.zza();
        if (zzabVar.zzc != null) {
            this.zze.set(zza, zzabVar.zzc.booleanValue());
        }
        if (zzabVar.zzd != null) {
            this.zzd.set(zza, zzabVar.zzd.booleanValue());
        }
        if (zzabVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzabVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzabVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzabVar.zzc()) {
                list.clear();
            }
            if (zznz.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbj) && zzabVar.zzb()) {
                list.clear();
            }
            if (zznz.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbj)) {
                long longValue2 = zzabVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzabVar.zzf.longValue() / 1000));
        }
    }
}
