package com.google.android.gms.internal.cast;

import java.io.IOException;
import java.util.List;
import xsna.zy60;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzzu {
    public static final /* synthetic */ int zza = 0;
    private static final zzaad zzb;

    static {
        int i = zzxb.zza;
        zzb = new zzaaf();
    }

    @Deprecated
    public static int zzA(int i, zzzi zzziVar, zzzs zzzsVar) {
        int zzv = zzxp.zzv(i << 3);
        return ((zzwz) zzziVar).zzt(zzzsVar) + zzv + zzv;
    }

    public static zzaad zzB() {
        return zzb;
    }

    public static boolean zzC(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzD(zzxs zzxsVar, Object obj, Object obj2) {
        if (((zzyb) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzE(zzaad zzaadVar, Object obj, Object obj2) {
        zzyd zzydVar = (zzyd) obj;
        zzaae zzaaeVar = zzydVar.zzc;
        zzaae zzaaeVar2 = ((zzyd) obj2).zzc;
        if (!zzaae.zza().equals(zzaaeVar2)) {
            if (zzaae.zza().equals(zzaaeVar)) {
                zzaaeVar = zzaae.zzb(zzaaeVar, zzaaeVar2);
            } else {
                zzaaeVar.zzh(zzaaeVar2);
            }
        }
        zzydVar.zzc = zzaaeVar;
    }

    public static void zza(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzA(i, list, z);
    }

    public static void zzb(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzz(i, list, z);
    }

    public static void zzc(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzw(i, list, z);
    }

    public static void zzd(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzx(i, list, z);
    }

    public static void zze(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzJ(i, list, z);
    }

    public static void zzf(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzy(i, list, z);
    }

    public static void zzg(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzH(i, list, z);
    }

    public static void zzh(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzu(i, list, z);
    }

    public static void zzi(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzF(i, list, z);
    }

    public static void zzj(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzI(i, list, z);
    }

    public static void zzk(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzv(i, list, z);
    }

    public static void zzl(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzG(i, list, z);
    }

    public static void zzm(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzB(i, list, z);
    }

    public static void zzn(int i, List list, zzaar zzaarVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaarVar.zzC(i, list, z);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyx)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.zzw(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzyx zzyxVar = (zzyx) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.zzw(zzyxVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyx)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.zzw(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzyx zzyxVar = (zzyx) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.zzw(zzyxVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzyx)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzxp.zzw((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzyx zzyxVar = (zzyx) list;
        int i3 = 0;
        while (i < size) {
            long zze = zzyxVar.zze(i);
            i3 += zzxp.zzw((zze >> 63) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzye)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.zzw(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzye zzyeVar = (zzye) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.zzw(zzyeVar.zzg(i));
            i++;
        }
        return i3;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzye)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.zzw(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzye zzyeVar = (zzye) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.zzw(zzyeVar.zzg(i));
            i++;
        }
        return i3;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzye)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzye zzyeVar = (zzye) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.zzv(zzyeVar.zzg(i));
            i++;
        }
        return i3;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzye)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzxp.zzv((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzye zzyeVar = (zzye) list;
        int i3 = 0;
        while (i < size) {
            int zzg = zzyeVar.zzg(i);
            i3 += zzxp.zzv((zzg >> 31) ^ (zzg + zzg));
            i++;
        }
        return i3;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzxp.zzv(i << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzxp.zzv(i << 3) + 8) * size;
    }

    public static int zzz(int i, Object obj, zzzs zzzsVar) {
        int i2 = i << 3;
        if (obj instanceof zzyt) {
            int zzv = zzxp.zzv(i2);
            int zzb2 = ((zzyt) obj).zzb();
            return zy60.b(zzb2, zzb2, zzv);
        }
        int zzv2 = zzxp.zzv(i2);
        int zzt = ((zzwz) obj).zzt(zzzsVar);
        return zy60.b(zzt, zzt, zzv2);
    }
}
