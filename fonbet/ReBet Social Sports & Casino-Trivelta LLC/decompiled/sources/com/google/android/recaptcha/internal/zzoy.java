package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i10 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i10, list, z10);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzln.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzne zzneVar = (zzne) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzln.zzB(zzneVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i10 << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i10 << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzln.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzne zzneVar = (zzne) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzln.zzB(zzneVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzln.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zznx zznxVar = (zznx) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzln.zzB(zznxVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzh(int i10, Object obj, zzow zzowVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzA(i11) + zzln.zzy((zzoi) obj, zzowVar);
        }
        int zzA = zzln.zzA(i11);
        int zza2 = ((zznt) obj).zza();
        return zzA + zzln.zzA(zza2) + zza2;
    }

    public static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        zzne zzneVar = (zzne) list;
        int i12 = 0;
        while (i10 < size) {
            int zze = zzneVar.zze(i10);
            i12 += zzln.zzA((zze >> 31) ^ (zze + zze));
            i10++;
        }
        return i12;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        zznx zznxVar = (zznx) list;
        int i12 = 0;
        while (i10 < size) {
            long zze = zznxVar.zze(i10);
            i12 += zzln.zzB((zze >> 63) ^ (zze + zze));
            i10++;
        }
        return i12;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzln.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzne zzneVar = (zzne) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzln.zzA(zzneVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzln.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zznx zznxVar = (zznx) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzln.zzB(zznxVar.zze(i10));
            i10++;
        }
        return i12;
    }

    public static zzpl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(intValue)) {
                    obj2 = zzo(obj, i10, intValue, obj2, zzplVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int intValue2 = num.intValue();
            if (zznhVar.zza(intValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzo(obj, i10, intValue2, obj2, zzplVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i10, i11);
        return obj2;
    }

    public static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    public static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        zzpm zzpmVar2 = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar2)) {
            if (zzpm.zzc().equals(zzpmVar)) {
                zzpmVar = zzpm.zze(zzpmVar, zzpmVar2);
            } else {
                zzpmVar.zzd(zzpmVar2);
            }
        }
        zzndVar.zzc = zzpmVar;
    }

    public static void zzr(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzpy zzpyVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i10, list, z10);
    }
}
