package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import GZ.e;
import java.io.IOException;
import java.util.List;

/* loaded from: classes9.dex */
final class zzgg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgs zzb;

    static {
        int i11 = zzfu.zza;
        zzb = new zzgu();
    }

    public static void zzA(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzC(i11, list, z11);
    }

    public static void zzB(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzE(i11, list, z11);
    }

    public static void zzC(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzJ(i11, list, z11);
    }

    public static void zzD(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzL(i11, list, z11);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzdn.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzei zzeiVar = (zzei) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzdn.zzB(zzeiVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzb(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i11 << 3) + 4) * size;
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzdn.zzA(i11 << 3) + 8) * size;
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzdn.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzei zzeiVar = (zzei) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzdn.zzB(zzeiVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzg(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzdn.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zzfb zzfbVar = (zzfb) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzdn.zzB(zzfbVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzh(int i11, Object obj, zzge zzgeVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zzex)) {
            return zzdn.zzA(i12) + zzdn.zzy((zzfm) obj, zzgeVar);
        }
        int zzA = zzdn.zzA(i12);
        int zza2 = ((zzex) obj).zza();
        return e.b(zza2, zza2, zzA);
    }

    static int zzi(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 += zzdn.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return i12;
        }
        zzei zzeiVar = (zzei) list;
        int i13 = 0;
        while (i11 < size) {
            int zze = zzeiVar.zze(i11);
            i13 += zzdn.zzA((zze >> 31) ^ (zze + zze));
            i11++;
        }
        return i13;
    }

    static int zzj(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 += zzdn.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return i12;
        }
        zzfb zzfbVar = (zzfb) list;
        int i13 = 0;
        while (i11 < size) {
            long zze = zzfbVar.zze(i11);
            i13 += zzdn.zzB((zze >> 63) ^ (zze + zze));
            i11++;
        }
        return i13;
    }

    static int zzk(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzei)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzdn.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzei zzeiVar = (zzei) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzdn.zzA(zzeiVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfb)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzdn.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zzfb zzfbVar = (zzfb) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzdn.zzB(zzfbVar.zze(i11));
            i11++;
        }
        return i13;
    }

    public static zzgs zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i11, int i12, Object obj2, zzgs zzgsVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzeh zzehVar = (zzeh) obj;
            zzgt zzgtVar = zzehVar.zzc;
            obj3 = zzgtVar;
            if (zzgtVar == zzgt.zzc()) {
                zzgt zzf = zzgt.zzf();
                zzehVar.zzc = zzf;
                obj3 = zzf;
            }
        }
        ((zzgt) obj3).zzj(i11 << 3, Long.valueOf(i12));
        return obj3;
    }

    static void zzo(zzdt zzdtVar, Object obj, Object obj2) {
        zzdx zzdxVar = ((zzed) obj2).zzb;
        if (zzdxVar.zza.isEmpty()) {
            return;
        }
        ((zzed) obj).zzc().zzh(zzdxVar);
    }

    static void zzp(zzgs zzgsVar, Object obj, Object obj2) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        zzgt zzgtVar2 = ((zzeh) obj2).zzc;
        if (!zzgt.zzc().equals(zzgtVar2)) {
            if (zzgt.zzc().equals(zzgtVar)) {
                zzgtVar = zzgt.zze(zzgtVar, zzgtVar2);
            } else {
                zzgtVar.zzd(zzgtVar2);
            }
        }
        zzehVar.zzc = zzgtVar;
    }

    public static void zzq(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzc(i11, list, z11);
    }

    public static void zzr(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzg(i11, list, z11);
    }

    public static void zzs(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzj(i11, list, z11);
    }

    public static void zzt(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzl(i11, list, z11);
    }

    public static void zzu(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzn(i11, list, z11);
    }

    public static void zzv(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzp(i11, list, z11);
    }

    public static void zzw(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzs(i11, list, z11);
    }

    public static void zzx(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzu(i11, list, z11);
    }

    public static void zzy(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzy(i11, list, z11);
    }

    public static void zzz(int i11, List list, zzhh zzhhVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhhVar.zzA(i11, list, z11);
    }
}
