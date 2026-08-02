package com.google.android.gms.internal.gtm;

import Nh.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zzwz {
    private static final Class<?> zza;
    private static final zzxo<?, ?> zzb;
    private static final zzxo<?, ?> zzc;
    private static final zzxo<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzxq();
    }

    public static zzxo<?, ?> zzA() {
        return zzc;
    }

    public static zzxo<?, ?> zzB() {
        return zzd;
    }

    static <UT, UB> UB zzC(int i11, List<Integer> list, zzvd zzvdVar, UB ub2, zzxo<UT, UB> zzxoVar) {
        if (zzvdVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!zzvdVar.zza(intValue)) {
                    ub2 = (UB) zzD(i11, intValue, ub2, zzxoVar);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int intValue2 = num.intValue();
            if (zzvdVar.zza(intValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) zzD(i11, intValue2, ub2, zzxoVar);
            }
        }
        if (i12 == size) {
            return ub2;
        }
        list.subList(i12, size).clear();
        return ub2;
    }

    static <UT, UB> UB zzD(int i11, int i12, UB ub2, zzxo<UT, UB> zzxoVar) {
        if (ub2 == null) {
            ub2 = zzxoVar.zzf();
        }
        zzxoVar.zzl(ub2, i11, i12);
        return ub2;
    }

    static <T, FT extends zzun<FT>> void zzE(zzuk<FT> zzukVar, T t2, T t11) {
        zzuo<FT> zzb2 = zzukVar.zzb(t11);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzukVar.zzc(t2).zzh(zzb2);
    }

    static <T, UT, UB> void zzF(zzxo<UT, UB> zzxoVar, T t2, T t11) {
        zzxoVar.zzo(t2, zzxoVar.zze(zzxoVar.zzd(t2), zzxoVar.zzd(t11)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzuz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zzI(zzwf zzwfVar, T t2, T t11, long j11) {
        zzxy.zzs(t2, j11, zzwf.zzc(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11)));
    }

    public static void zzJ(int i11, List<Boolean> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzc(i11, list, z11);
    }

    public static void zzK(int i11, List<zztd> list, zztp zztpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zze(i11, list);
    }

    public static void zzL(int i11, List<Double> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzg(i11, list, z11);
    }

    public static void zzM(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzj(i11, list, z11);
    }

    public static void zzN(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzl(i11, list, z11);
    }

    public static void zzO(int i11, List<Long> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzn(i11, list, z11);
    }

    public static void zzP(int i11, List<Float> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzp(i11, list, z11);
    }

    public static void zzQ(int i11, List<?> list, zztp zztpVar, zzwx zzwxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            zztpVar.zzq(i11, list.get(i12), zzwxVar);
        }
    }

    public static void zzR(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzs(i11, list, z11);
    }

    public static void zzS(int i11, List<Long> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzu(i11, list, z11);
    }

    public static void zzT(int i11, List<?> list, zztp zztpVar, zzwx zzwxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            zztpVar.zzv(i11, list.get(i12), zzwxVar);
        }
    }

    public static void zzU(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzy(i11, list, z11);
    }

    public static void zzV(int i11, List<Long> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzA(i11, list, z11);
    }

    public static void zzW(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzC(i11, list, z11);
    }

    public static void zzX(int i11, List<Long> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzE(i11, list, z11);
    }

    public static void zzY(int i11, List<String> list, zztp zztpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzH(i11, list);
    }

    public static void zzZ(int i11, List<Integer> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzJ(i11, list, z11);
    }

    static int zza(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i11 << 3) + 1) * size;
    }

    public static void zzaa(int i11, List<Long> list, zztp zztpVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztpVar.zzL(i11, list, z11);
    }

    private static zzxo<?, ?> zzab(boolean z11) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzxo) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List<?> list) {
        return list.size();
    }

    static int zzc(int i11, List<zztd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i11) * size;
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzC += zzto.zzu(list.get(i12));
        }
        return zzC;
    }

    static int zzd(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zze(list);
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzva)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzto.zzx(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        zzva zzvaVar = (zzva) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzto.zzx(zzvaVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzf(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i11 << 3) + 4) * size;
    }

    static int zzg(List<?> list) {
        return list.size() * 4;
    }

    static int zzh(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzD(i11 << 3) + 8) * size;
    }

    static int zzi(List<?> list) {
        return list.size() * 8;
    }

    static int zzj(int i11, List<zzwk> list, zzwx zzwxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += zzto.zzv(i11, list.get(i13), zzwxVar);
        }
        return i12;
    }

    static int zzk(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zzl(list);
    }

    static int zzl(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzva)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzto.zzx(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        zzva zzvaVar = (zzva) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzto.zzx(zzvaVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzm(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * list.size()) + zzn(list);
    }

    static int zzn(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvz)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzto.zzE(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        zzvz zzvzVar = (zzvz) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzto.zzE(zzvzVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzo(int i11, Object obj, zzwx zzwxVar) {
        if (!(obj instanceof zzvq)) {
            return zzto.zzD(i11 << 3) + zzto.zzA((zzwk) obj, zzwxVar);
        }
        int zzD = zzto.zzD(i11 << 3);
        int zza2 = ((zzvq) obj).zza();
        return b.a(zza2, zza2, zzD);
    }

    static int zzp(int i11, List<?> list, zzwx zzwxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            zzC = obj instanceof zzvq ? zzto.zzy((zzvq) obj) + zzC : zzC + zzto.zzA((zzwk) obj, zzwxVar);
        }
        return zzC;
    }

    static int zzq(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zzr(list);
    }

    static int zzr(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzva)) {
            int i12 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i12 += zzto.zzD((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return i12;
        }
        zzva zzvaVar = (zzva) list;
        int i13 = 0;
        while (i11 < size) {
            int zze = zzvaVar.zze(i11);
            i13 += zzto.zzD((zze >> 31) ^ (zze + zze));
            i11++;
        }
        return i13;
    }

    static int zzs(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zzt(list);
    }

    static int zzt(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvz)) {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 += zzto.zzE((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return i12;
        }
        zzvz zzvzVar = (zzvz) list;
        int i13 = 0;
        while (i11 < size) {
            long zze = zzvzVar.zze(i11);
            i13 += zzto.zzE((zze >> 63) ^ (zze + zze));
            i11++;
        }
        return i13;
    }

    static int zzu(int i11, List<?> list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int zzC = zzto.zzC(i11) * size;
        if (!(list instanceof zzvs)) {
            while (i12 < size) {
                Object obj = list.get(i12);
                zzC = (obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzB((String) obj)) + zzC;
                i12++;
            }
            return zzC;
        }
        zzvs zzvsVar = (zzvs) list;
        while (i12 < size) {
            Object zzf = zzvsVar.zzf(i12);
            zzC = (zzf instanceof zztd ? zzto.zzu((zztd) zzf) : zzto.zzB((String) zzf)) + zzC;
            i12++;
        }
        return zzC;
    }

    static int zzv(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zzw(list);
    }

    static int zzw(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzva)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzto.zzD(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        zzva zzvaVar = (zzva) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzto.zzD(zzvaVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzx(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzto.zzC(i11) * size) + zzy(list);
    }

    static int zzy(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvz)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzto.zzE(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        zzvz zzvzVar = (zzvz) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzto.zzE(zzvzVar.zze(i11));
            i11++;
        }
        return i13;
    }

    public static zzxo<?, ?> zzz() {
        return zzb;
    }
}
