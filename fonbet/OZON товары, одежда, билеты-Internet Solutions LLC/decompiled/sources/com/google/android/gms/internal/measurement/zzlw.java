package com.google.android.gms.internal.measurement;

import B3.p;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

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
        zzd = new zzmn();
    }

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    static Object zzC(int i11, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzkgVar.zza(intValue)) {
                    obj = zzD(i11, intValue, obj, zzmlVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) list.get(i13);
            int intValue2 = num.intValue();
            if (zzkgVar.zza(intValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                obj = zzD(i11, intValue2, obj, zzmlVar);
            }
        }
        if (i12 == size) {
            return obj;
        }
        list.subList(i12, size).clear();
        return obj;
    }

    static Object zzD(int i11, int i12, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i11, i12);
        return obj;
    }

    static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i11, list, z11);
    }

    public static void zzI(int i11, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i11, list);
    }

    public static void zzJ(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i11, list, z11);
    }

    public static void zzK(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i11, list, z11);
    }

    public static void zzL(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i11, list, z11);
    }

    public static void zzM(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i11, list, z11);
    }

    public static void zzN(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i11, list, z11);
    }

    public static void zzO(int i11, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzjk) zzndVar).zzq(i11, list.get(i12), zzluVar);
        }
    }

    public static void zzP(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i11, list, z11);
    }

    public static void zzQ(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i11, list, z11);
    }

    public static void zzR(int i11, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((zzjk) zzndVar).zzv(i11, list.get(i12), zzluVar);
        }
    }

    public static void zzS(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i11, list, z11);
    }

    public static void zzT(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i11, list, z11);
    }

    public static void zzU(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i11, list, z11);
    }

    public static void zzV(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i11, list, z11);
    }

    public static void zzW(int i11, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i11, list);
    }

    public static void zzX(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i11, list, z11);
    }

    public static void zzY(int i11, List list, zznd zzndVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i11, list, z11);
    }

    static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i11 << 3) + 1) * size;
    }

    static void zzaa(zzle zzleVar, Object obj, Object obj2, long j11) {
        zzmv.zzs(obj, j11, zzle.zzb(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11)));
    }

    private static zzml zzab(boolean z11) {
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
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i11) * size;
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzz += zzjj.zzt((zzjb) list.get(i12));
        }
        return zzz;
    }

    static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zze(list);
    }

    static int zze(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzjj.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzkd zzkdVar = (zzkd) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzjj.zzv(zzkdVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzf(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i11 << 3) + 4) * size;
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i11 << 3) + 8) * size;
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i11, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += zzjj.zzu(i11, (zzlj) list.get(i13), zzluVar);
        }
        return i12;
    }

    static int zzk(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zzl(list);
    }

    static int zzl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzjj.zzv(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzkd zzkdVar = (zzkd) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzjj.zzv(zzkdVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzm(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * list.size()) + zzn(list);
    }

    static int zzn(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzjj.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zzky zzkyVar = (zzky) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzjj.zzB(zzkyVar.zza(i11));
            i11++;
        }
        return i13;
    }

    static int zzo(int i11, Object obj, zzlu zzluVar) {
        if (!(obj instanceof zzkp)) {
            return zzjj.zzA(i11 << 3) + zzjj.zzx((zzlj) obj, zzluVar);
        }
        int zzA = zzjj.zzA(i11 << 3);
        int zza2 = ((zzkp) obj).zza();
        return p.a(zza2, zza2, zzA);
    }

    static int zzp(int i11, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            zzz = obj instanceof zzkp ? zzjj.zzw((zzkp) obj) + zzz : zzz + zzjj.zzx((zzlj) obj, zzluVar);
        }
        return zzz;
    }

    static int zzq(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zzr(list);
    }

    static int zzr(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return i12;
        }
        zzkd zzkdVar = (zzkd) list;
        int i13 = 0;
        while (i11 < size) {
            int zze = zzkdVar.zze(i11);
            i13 += zzjj.zzA((zze >> 31) ^ (zze + zze));
            i11++;
        }
        return i13;
    }

    static int zzs(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zzt(list);
    }

    static int zzt(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return i12;
        }
        zzky zzkyVar = (zzky) list;
        int i13 = 0;
        while (i11 < size) {
            long zza2 = zzkyVar.zza(i11);
            i13 += zzjj.zzB((zza2 >> 63) ^ (zza2 + zza2));
            i11++;
        }
        return i13;
    }

    static int zzu(int i11, List list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i11) * size;
        if (!(list instanceof zzkr)) {
            while (i12 < size) {
                Object obj = list.get(i12);
                zzz = (obj instanceof zzjb ? zzjj.zzt((zzjb) obj) : zzjj.zzy((String) obj)) + zzz;
                i12++;
            }
            return zzz;
        }
        zzkr zzkrVar = (zzkr) list;
        while (i12 < size) {
            Object zzf = zzkrVar.zzf(i12);
            zzz = (zzf instanceof zzjb ? zzjj.zzt((zzjb) zzf) : zzjj.zzy((String) zzf)) + zzz;
            i12++;
        }
        return zzz;
    }

    static int zzv(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zzw(list);
    }

    static int zzw(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzjj.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zzkd zzkdVar = (zzkd) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzjj.zzA(zzkdVar.zze(i11));
            i11++;
        }
        return i13;
    }

    static int zzx(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i11) * size) + zzy(list);
    }

    static int zzy(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zzjj.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zzky zzkyVar = (zzky) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zzjj.zzB(zzkyVar.zza(i11));
            i11++;
        }
        return i13;
    }

    public static zzml zzz() {
        return zzb;
    }
}
