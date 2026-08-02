package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes5.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i, list, z);
    }

    public static void zzB(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i, list, z);
    }

    public static void zzC(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i, list, z);
    }

    public static void zzD(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i, list, z);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i, zzrq zzrqVar, zzsa zzsaVar) {
        int zzC = zzpv.zzC(i << 3);
        return zzC + zzC + ((zzpa) zzrqVar).zzj(zzsaVar);
    }

    static int zzb(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzqn zzqnVar = (zzqn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.zzD(zzqnVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 4);
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 8);
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzqn zzqnVar = (zzqn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.zzD(zzqnVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzh(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzre zzreVar = (zzre) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.zzD(zzreVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzi(int i, Object obj, zzsa zzsaVar) {
        int zzC;
        int zzj;
        int zzC2;
        int i2 = i << 3;
        if (obj instanceof zzra) {
            zzC = zzpv.zzC(i2);
            zzj = ((zzra) obj).zza();
            zzC2 = zzpv.zzC(zzj);
        } else {
            zzC = zzpv.zzC(i2);
            zzj = ((zzpa) obj).zzj(zzsaVar);
            zzC2 = zzpv.zzC(zzj);
        }
        return zzC + zzC2 + zzj;
    }

    static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzqn zzqnVar = (zzqn) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzqnVar.zze(i);
            i3 += zzpv.zzC((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzre zzreVar = (zzre) list;
        int i3 = 0;
        while (i < size) {
            long zze = zzreVar.zze(i);
            i3 += zzpv.zzD((zze >> 63) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.zzC(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzqn zzqnVar = (zzqn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.zzC(zzqnVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzm(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzpv.zzD(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzre zzreVar = (zzre) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzpv.zzD(zzreVar.zze(i));
            i++;
        }
        return i3;
    }

    public static zzsp zzn() {
        return zzb;
    }

    static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVar = zzqmVar.zzc;
        zzsq zzsqVar2 = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar2)) {
            if (zzsq.zzc().equals(zzsqVar)) {
                zzsqVar = zzsq.zze(zzsqVar, zzsqVar2);
            } else {
                zzsqVar.zzd(zzsqVar2);
            }
        }
        zzqmVar.zzc = zzsqVar;
    }

    public static void zzq(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i, list, z);
    }

    public static void zzt(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i, list, z);
    }

    public static void zzu(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i, list, z);
    }

    public static void zzv(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i, list, z);
    }

    public static void zzw(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i, list, z);
    }

    public static void zzx(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i, list, z);
    }

    public static void zzy(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i, list, z);
    }

    public static void zzz(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i, list, z);
    }
}
