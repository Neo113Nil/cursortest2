package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.iub0;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
final class zzlz {
    private static final Class zza;
    private static final zzmo zzb;
    private static final zzmo zzc;
    private static final zzmo zzd;

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
        zzd = new zzmq();
    }

    public static zzmo zzA() {
        return zzc;
    }

    public static zzmo zzB() {
        return zzd;
    }

    public static Object zzC(Object obj, int i, List list, zzkj zzkjVar, Object obj2, zzmo zzmoVar) {
        Object obj3 = null;
        if (zzkjVar == null) {
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzkjVar.zza(intValue)) {
                    obj3 = zzD(obj, i, intValue, obj3, zzmoVar);
                    it.remove();
                }
            }
            return obj3;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int intValue2 = num.intValue();
            if (zzkjVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj3 = zzD(obj, i, intValue2, obj3, zzmoVar);
            }
        }
        if (i2 == size) {
            return obj3;
        }
        list.subList(i2, size).clear();
        return obj3;
    }

    public static Object zzD(Object obj, int i, int i2, Object obj2, zzmo zzmoVar) {
        if (obj2 == null) {
            obj2 = zzmoVar.zzc(obj);
        }
        zzmoVar.zzf(obj2, i, i2);
        return obj2;
    }

    public static void zzE(zzjs zzjsVar, Object obj, Object obj2) {
        zzjsVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmo zzmoVar, Object obj, Object obj2) {
        zzmoVar.zzh(obj, zzmoVar.zze(zzmoVar.zzd(obj), zzmoVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkf.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzc(i, list, z);
    }

    public static void zzI(int i, List list, zzng zzngVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zze(i, list);
    }

    public static void zzJ(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzg(i, list, z);
    }

    public static void zzK(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzj(i, list, z);
    }

    public static void zzL(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzl(i, list, z);
    }

    public static void zzM(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzn(i, list, z);
    }

    public static void zzN(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzp(i, list, z);
    }

    public static void zzO(int i, List list, zzng zzngVar, zzlx zzlxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjn) zzngVar).zzq(i, list.get(i2), zzlxVar);
        }
    }

    public static void zzP(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzs(i, list, z);
    }

    public static void zzQ(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzu(i, list, z);
    }

    public static void zzR(int i, List list, zzng zzngVar, zzlx zzlxVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjn) zzngVar).zzv(i, list.get(i2), zzlxVar);
        }
    }

    public static void zzS(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzx(i, list, z);
    }

    public static void zzT(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzz(i, list, z);
    }

    public static void zzU(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzB(i, list, z);
    }

    public static void zzV(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzD(i, list, z);
    }

    public static void zzW(int i, List list, zzng zzngVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzG(i, list);
    }

    public static void zzX(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzI(i, list, z);
    }

    public static void zzY(int i, List list, zzng zzngVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzK(i, list, z);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 1) * size;
    }

    public static void zzaa(zzlh zzlhVar, Object obj, Object obj2, long j) {
        zzmy.zzs(obj, j, zzlh.zzb(zzmy.zzf(obj, j), zzmy.zzf(obj2, j)));
    }

    private static zzmo zzab(boolean z) {
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
            return (zzmo) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjm.zzz(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzjm.zzt((zzje) list.get(i2));
        }
        return zzz;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjm.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkg zzkgVar = (zzkg) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjm.zzv(zzkgVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzlx zzlxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjm.zzu(i, (zzlm) list.get(i3), zzlxVar);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjm.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkg zzkgVar = (zzkg) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjm.zzv(zzkgVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjm.zzB(zzlbVar.zza(i));
            i++;
        }
        return i3;
    }

    public static int zzo(int i, Object obj, zzlx zzlxVar) {
        if (!(obj instanceof zzks)) {
            return zzjm.zzx((zzlm) obj, zzlxVar) + zzjm.zzA(i << 3);
        }
        int zzA = zzjm.zzA(i << 3);
        int zza2 = ((zzks) obj).zza();
        return iub0.a(zza2, zza2, zzA);
    }

    public static int zzp(int i, List list, zzlx zzlxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjm.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            zzz = (obj instanceof zzks ? zzjm.zzw((zzks) obj) : zzjm.zzx((zzlm) obj, zzlxVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzjm.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzkg zzkgVar = (zzkg) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzkgVar.zze(i);
            i3 += zzjm.zzA((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzjm.zzB((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            long zza2 = zzlbVar.zza(i);
            i3 += zzjm.zzB((zza2 >> 63) ^ (zza2 + zza2));
            i++;
        }
        return i3;
    }

    public static int zzu(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjm.zzz(i) * size;
        if (!(list instanceof zzku)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                zzz = (obj instanceof zzje ? zzjm.zzt((zzje) obj) : zzjm.zzy((String) obj)) + zzz;
                i2++;
            }
            return zzz;
        }
        zzku zzkuVar = (zzku) list;
        while (i2 < size) {
            Object zzf = zzkuVar.zzf(i2);
            zzz = (zzf instanceof zzje ? zzjm.zzt((zzje) zzf) : zzjm.zzy((String) zzf)) + zzz;
            i2++;
        }
        return zzz;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkg)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkg zzkgVar = (zzkg) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjm.zzA(zzkgVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjm.zzB(zzlbVar.zza(i));
            i++;
        }
        return i3;
    }

    public static zzmo zzz() {
        return zzb;
    }
}
