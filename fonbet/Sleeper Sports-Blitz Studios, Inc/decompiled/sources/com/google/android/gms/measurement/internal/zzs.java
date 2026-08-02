package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zznz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
final class zzs extends zznb {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzu> zzc;
    private Long zzd;
    private Long zze;

    private final zzu zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznb
    protected final boolean zzc() {
        return false;
    }

    final List<zzfn.zzc> zza(String str, List<zzfn.zze> list, List<zzfn.zzn> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    final List<zzfn.zzc> zza(String str, List<zzfn.zze> list, List<zzfn.zzn> list2, Long l, Long l2, boolean z) {
        boolean z2;
        boolean z3;
        HashSet hashSet;
        Map<Integer, zzfn.zzl> map;
        List<zzff.zzb> list3;
        boolean z4;
        Map<Integer, zzfn.zzl> map2;
        Iterator it;
        zzfn.zzl zzlVar;
        Iterator<zzfn.zzd> it2;
        Long l3;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator<zzfn.zze> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(it4.next().zzg())) {
                z2 = true;
                break;
            }
        }
        boolean z5 = zznz.zza() && zze().zzf(this.zza, zzbh.zzbj);
        boolean z6 = zznz.zza() && zze().zzf(this.zza, zzbh.zzbi);
        if (z2) {
            zzan zzh = zzh();
            String str2 = this.zza;
            zzh.zzak();
            zzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzh.e_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzfw.zza(str2), e);
            }
        }
        Map<Integer, List<zzff.zzb>> map4 = Collections.EMPTY_MAP;
        if (z6 && z5) {
            map4 = zzh().zzm(this.zza);
        }
        Map<Integer, zzfn.zzl> zzl = zzh().zzl(this.zza);
        if (zzl.isEmpty()) {
            z3 = true;
        } else {
            HashSet hashSet3 = new HashSet(zzl.keySet());
            if (z2) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzn = zzh().zzn(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzl);
                ArrayMap arrayMap = new ArrayMap();
                if (!zzl.isEmpty()) {
                    Iterator<Integer> it5 = zzl.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer next = it5.next();
                        next.intValue();
                        zzfn.zzl zzlVar2 = zzl.get(next);
                        List<Integer> list4 = zzn.get(next);
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            map3 = zzn;
                            it3 = it5;
                            arrayMap.put(next, zzlVar2);
                        } else {
                            hashSet2 = hashSet3;
                            List<Long> zza = g_().zza(zzlVar2.zzi(), list4);
                            if (zza.isEmpty()) {
                                hashSet3 = hashSet2;
                            } else {
                                zzfn.zzl.zza zzb = zzlVar2.zzca().zzb().zzb(zza);
                                zzb.zzd().zzd(g_().zza(zzlVar2.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfn.zzd zzdVar : zzlVar2.zzh()) {
                                    Map<Integer, List<Integer>> map5 = zzn;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzdVar.zza()))) {
                                        arrayList.add(zzdVar);
                                    }
                                    zzn = map5;
                                    it5 = it6;
                                }
                                map3 = zzn;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfn.zzm zzmVar : zzlVar2.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zzmVar.zzb()))) {
                                        arrayList2.add(zzmVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                arrayMap.put(next, (zzfn.zzl) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzag()));
                            }
                        }
                        hashSet3 = hashSet2;
                        zzn = map3;
                        it5 = it3;
                    }
                }
                hashSet = hashSet3;
                z3 = true;
                map = arrayMap;
            } else {
                hashSet = hashSet3;
                z3 = true;
                map = zzl;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num = (Integer) it7.next();
                num.intValue();
                zzfn.zzl zzlVar3 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                zzfn.zzl zzlVar4 = zzlVar3;
                ArrayMap arrayMap2 = new ArrayMap();
                if (zzlVar4 != null && zzlVar4.zza() != 0) {
                    Iterator<zzfn.zzd> it8 = zzlVar4.zzh().iterator();
                    while (it8.hasNext()) {
                        zzfn.zzd next2 = it8.next();
                        if (next2.zzf()) {
                            zzlVar = zzlVar4;
                            Integer valueOf = Integer.valueOf(next2.zza());
                            if (next2.zze()) {
                                Long valueOf2 = Long.valueOf(next2.zzb());
                                it2 = it8;
                                l3 = valueOf2;
                            } else {
                                it2 = it8;
                                l3 = null;
                            }
                            arrayMap2.put(valueOf, l3);
                        } else {
                            zzlVar = zzlVar4;
                            it2 = it8;
                        }
                        it8 = it2;
                        zzlVar4 = zzlVar;
                    }
                }
                zzfn.zzl zzlVar5 = zzlVar4;
                ArrayMap arrayMap3 = new ArrayMap();
                if (zzlVar5 != null && zzlVar5.zzc() != 0) {
                    Iterator<zzfn.zzm> it9 = zzlVar5.zzj().iterator();
                    while (it9.hasNext()) {
                        Iterator<zzfn.zzm> it10 = it9;
                        zzfn.zzm next3 = it9.next();
                        if (!next3.zzf() || next3.zza() <= 0) {
                            map2 = map;
                            it = it7;
                        } else {
                            map2 = map;
                            it = it7;
                            arrayMap3.put(Integer.valueOf(next3.zzb()), Long.valueOf(next3.zza(next3.zza() - 1)));
                        }
                        it9 = it10;
                        map = map2;
                        it7 = it;
                    }
                }
                Map<Integer, zzfn.zzl> map6 = map;
                Iterator it11 = it7;
                if (zzlVar5 != null) {
                    int i = 0;
                    while (i < (zzlVar5.zzd() << 6)) {
                        if (zznp.zza(zzlVar5.zzk(), i)) {
                            z4 = z5;
                            zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (zznp.zza(zzlVar5.zzi(), i)) {
                                bitSet.set(i);
                                i++;
                                z5 = z4;
                            }
                        } else {
                            z4 = z5;
                        }
                        arrayMap2.remove(Integer.valueOf(i));
                        i++;
                        z5 = z4;
                    }
                }
                boolean z7 = z5;
                zzfn.zzl zzlVar6 = zzl.get(num);
                if (z6 && z7 && (list3 = map4.get(num)) != null && this.zze != null && this.zzd != null) {
                    for (zzff.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        Map<Integer, List<zzff.zzb>> map7 = map4;
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (arrayMap2.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        map4 = map7;
                    }
                }
                this.zzc.put(num, new zzu(this, this.zza, zzlVar6, bitSet, bitSet2, arrayMap2, arrayMap3));
                zzl = zzl;
                z5 = z7;
                map4 = map4;
                map = map6;
                it7 = it11;
            }
        }
        if (com.google.android.gms.internal.measurement.zznh.zza() && zze().zzf(null, zzbh.zzdc)) {
            zza(list, z);
            if (z) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, z3);
        zza(list2);
        return zzu();
    }

    private final List<zzfn.zzc> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            zzu zzuVar = this.zzc.get(num);
            Preconditions.checkNotNull(zzuVar);
            zzfn.zzc zza = zzuVar.zza(intValue);
            arrayList.add(zza);
            zzan zzh = zzh();
            String str = this.zza;
            zzfn.zzl zzd = zza.zzd();
            zzh.zzak();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzbx = zzd.zzbx();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", zzbx);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfw.zza(str));
                }
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzfw.zza(str), e);
            }
        }
        return arrayList;
    }

    zzs(zznc zzncVar) {
        super(zzncVar);
    }

    private final void zza(List<zzfn.zze> list, boolean z) {
        ArrayMap arrayMap;
        zzw zzwVar;
        zzbb zzbbVar;
        zzz zzzVar;
        if (list.isEmpty()) {
            return;
        }
        zzz zzzVar2 = null;
        zzw zzwVar2 = new zzw(this);
        ArrayMap arrayMap2 = new ArrayMap();
        for (zzfn.zze zzeVar : list) {
            zzfn.zze zza = zzwVar2.zza(this.zza, zzeVar);
            if (zza != null) {
                zzan zzh = zzh();
                String str = this.zza;
                String zzg = zza.zzg();
                zzbb zzd = zzh.zzd(str, zzeVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzfw.zza(str), zzh.zzi().zza(zzg));
                    zzwVar = zzwVar2;
                    arrayMap = arrayMap2;
                    zzbbVar = new zzbb(str, zzeVar.zzg(), 1L, 1L, 1L, zzeVar.zzd(), 0L, null, null, null, null);
                } else {
                    arrayMap = arrayMap2;
                    zzwVar = zzwVar2;
                    zzbbVar = new zzbb(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzh().zza(zzbbVar);
                if (com.google.android.gms.internal.measurement.zznh.zza()) {
                    zzzVar = null;
                    if (zze().zzf(null, zzbh.zzdc) && z) {
                        zzzVar2 = null;
                        arrayMap2 = arrayMap;
                        zzwVar2 = zzwVar;
                    }
                } else {
                    zzzVar = null;
                }
                long j = zzbbVar.zzc;
                String zzg2 = zza.zzg();
                ArrayMap arrayMap3 = arrayMap;
                Map<Integer, List<zzff.zzb>> map = (Map) arrayMap3.get(zzg2);
                if (map == null) {
                    map = zzh().zzf(this.zza, zzg2);
                    arrayMap3.put(zzg2, map);
                }
                for (Integer num : map.keySet()) {
                    int intValue = num.intValue();
                    if (this.zzb.contains(num)) {
                        zzj().zzp().zza("Skipping failed audience ID", num);
                    } else {
                        Iterator<zzff.zzb> it = map.get(num).iterator();
                        boolean z2 = true;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            zzff.zzb next = it.next();
                            zzy zzyVar = new zzy(this, this.zza, intValue, next);
                            boolean zza2 = zzyVar.zza(this.zzd, this.zze, zza, j, zzbbVar, zza(intValue, next.zzb()));
                            if (zza2) {
                                zza(num).zza(zzyVar);
                                z2 = zza2;
                            } else {
                                this.zzb.add(num);
                                z2 = zza2;
                                break;
                            }
                        }
                        if (!z2) {
                            this.zzb.add(num);
                        }
                    }
                }
                zzz zzzVar3 = zzzVar;
                arrayMap2 = arrayMap3;
                zzzVar2 = zzzVar3;
                zzwVar2 = zzwVar;
            } else {
                arrayMap2 = arrayMap2;
                zzzVar2 = zzzVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        r5 = zzj().zzu();
        r6 = com.google.android.gms.measurement.internal.zzfw.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (r7.zzi() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r9 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r5.zza("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(List<zzfn.zzn> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (zzfn.zzn zznVar : list) {
            String zzg = zznVar.zzg();
            Map<Integer, List<zzff.zze>> map = (Map) arrayMap.get(zzg);
            if (map == null) {
                map = zzh().zzg(this.zza, zzg);
                arrayMap.put(zzg, map);
            }
            Iterator<Integer> it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer next = it.next();
                    int intValue = next.intValue();
                    if (this.zzb.contains(next)) {
                        zzj().zzp().zza("Skipping failed audience ID", next);
                        break;
                    }
                    Iterator<zzff.zze> it2 = map.get(next).iterator();
                    boolean z = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        zzff.zze next2 = it2.next();
                        Integer num = null;
                        if (zzj().zza(2)) {
                            zzj().zzp().zza("Evaluating filter. audience, filter, property", next, next2.zzi() ? Integer.valueOf(next2.zza()) : null, zzi().zzc(next2.zze()));
                            zzj().zzp().zza("Filter definition", g_().zza(next2));
                        }
                        if (!next2.zzi() || next2.zza() > 256) {
                            break;
                        }
                        zzaa zzaaVar = new zzaa(this, this.zza, intValue, next2);
                        z = zzaaVar.zza(this.zzd, this.zze, zznVar, zza(intValue, next2.zza()));
                        if (z) {
                            zza(next).zza(zzaaVar);
                        } else {
                            this.zzb.add(next);
                            break;
                        }
                    }
                    if (!z) {
                        this.zzb.add(next);
                    }
                }
            }
        }
    }

    private final boolean zza(int i, int i2) {
        BitSet bitSet;
        zzu zzuVar = this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zzd;
        return bitSet.get(i2);
    }
}
