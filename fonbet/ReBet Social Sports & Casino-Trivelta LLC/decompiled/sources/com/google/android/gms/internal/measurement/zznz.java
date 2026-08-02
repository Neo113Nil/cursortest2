package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i10 = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        zzoj zzojVar2 = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar2)) {
            if (zzoj.zza().equals(zzojVar)) {
                zzojVar = zzoj.zzc(zzojVar, zzojVar2);
            } else {
                zzojVar.zzl(zzojVar2);
            }
        }
        zzmfVar.zzc = zzojVar;
    }

    public static Object zzE(Object obj, int i10, int i11, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void zza(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzov zzovVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i10, list, z10);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzlm.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zzna zznaVar = (zzna) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzlm.zzA(zznaVar.zzc(i10));
            i10++;
        }
        return i12;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzlm.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        zzna zznaVar = (zzna) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzlm.zzA(zznaVar.zzc(i10));
            i10++;
        }
        return i12;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += zzlm.zzA((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        zzna zznaVar = (zzna) list;
        int i12 = 0;
        while (i10 < size) {
            long zzc = zznaVar.zzc(i10);
            i12 += zzlm.zzA((zzc >> 63) ^ (zzc + zzc));
            i10++;
        }
        return i12;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzlm.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzmg zzmgVar = (zzmg) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzlm.zzA(zzmgVar.zzf(i10));
            i10++;
        }
        return i12;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzlm.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzmg zzmgVar = (zzmg) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzlm.zzA(zzmgVar.zzf(i10));
            i10++;
        }
        return i12;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zzlm.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        zzmg zzmgVar = (zzmg) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += zzlm.zzz(zzmgVar.zzf(i10));
            i10++;
        }
        return i12;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += zzlm.zzz((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        zzmg zzmgVar = (zzmg) list;
        int i12 = 0;
        while (i10 < size) {
            int zzf = zzmgVar.zzf(i10);
            i12 += zzlm.zzz((zzf >> 31) ^ (zzf + zzf));
            i10++;
        }
        return i12;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i10 << 3) + 4);
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlm.zzz(i10 << 3) + 8);
    }

    public static int zzz(int i10, Object obj, zznx zznxVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzz(i11) + zzlm.zzD((zznm) obj, zznxVar);
        }
        int zzz = zzlm.zzz(i11);
        int zzb2 = ((zzmw) obj).zzb();
        return zzz + zzlm.zzz(zzb2) + zzb2;
    }
}
