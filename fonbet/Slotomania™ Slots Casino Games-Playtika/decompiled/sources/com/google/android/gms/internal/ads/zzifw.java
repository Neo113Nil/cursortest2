package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzifw {
    public static final /* synthetic */ int zza = 0;
    private static final zzigh zzb;

    static {
        int i = zzica.zza;
        zzb = new zzigj();
    }

    static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzicw.zzF(i << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzicw.zzF(i << 3) + 8);
    }

    static int zzD(int i, Object obj, zzifu zzifuVar) {
        int zzF;
        int zzaT;
        int zzF2;
        int i2 = i << 3;
        if (obj instanceof zziem) {
            zzF = zzicw.zzF(i2);
            zzaT = ((zziem) obj).zzb();
            zzF2 = zzicw.zzF(zzaT);
        } else {
            zzF = zzicw.zzF(i2);
            zzaT = ((zzibw) obj).zzaT(zzifuVar);
            zzF2 = zzicw.zzF(zzaT);
        }
        return zzF + zzF2 + zzaT;
    }

    @Deprecated
    static int zzE(int i, zzifc zzifcVar, zzifu zzifuVar) {
        int zzF = zzicw.zzF(i << 3);
        return zzF + zzF + ((zzibw) zzifcVar).zzaT(zzifuVar);
    }

    public static zzigh zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzidc zzidcVar, Object obj, Object obj2) {
        if (((zzidn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzigh zzighVar, Object obj, Object obj2) {
        zzidr zzidrVar = (zzidr) obj;
        zzigi zzigiVar = zzidrVar.zzt;
        zzigi zzigiVar2 = ((zzidr) obj2).zzt;
        if (!zzigi.zza().equals(zzigiVar2)) {
            if (zzigi.zza().equals(zzigiVar)) {
                zzigiVar = zzigi.zzc(zzigiVar, zzigiVar2);
            } else {
                zzigiVar.zzm(zzigiVar2);
            }
        }
        zzidrVar.zzt = zzigiVar;
    }

    static Object zzJ(Object obj, int i, List list, zzidx zzidxVar, Object obj2, zzigh zzighVar) {
        if (zzidxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzidxVar.zza(intValue)) {
                    obj2 = zzK(obj, i, intValue, obj2, zzighVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue2 = ((Integer) list.get(i3)).intValue();
            if (zzidxVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue2));
                }
                i2++;
            } else {
                obj2 = zzK(obj, i, intValue2, obj2, zzighVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i, int i2, Object obj2, zzigh zzighVar) {
        if (obj2 == null) {
            obj2 = zzighVar.zzh(obj);
        }
        zzighVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzigw zzigwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzigw zzigwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzigw zzigwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzigwVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzigw zzigwVar, zzifu zzifuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzicx) zzigwVar).zzr(i, list.get(i2), zzifuVar);
        }
    }

    public static void zzr(int i, List list, zzigw zzigwVar, zzifu zzifuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzicx) zzigwVar).zzs(i, list.get(i2), zzifuVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzicw.zzG(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzieq zzieqVar = (zzieq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzicw.zzG(zzieqVar.zzc(i));
            i++;
        }
        return i3;
    }

    static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzicw.zzG(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzieq zzieqVar = (zzieq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzicw.zzG(zzieqVar.zzc(i));
            i++;
        }
        return i3;
    }

    static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzicw.zzG((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzieq zzieqVar = (zzieq) list;
        int i3 = 0;
        while (i < size) {
            long zzc = zzieqVar.zzc(i);
            i3 += zzicw.zzG((zzc >> 63) ^ (zzc + zzc));
            i++;
        }
        return i3;
    }

    static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzids)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzicw.zzG(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzids zzidsVar = (zzids) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzicw.zzG(zzidsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzids)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzicw.zzG(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzids zzidsVar = (zzids) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzicw.zzG(zzidsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzids)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzicw.zzF(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzids zzidsVar = (zzids) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzicw.zzF(zzidsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzids)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzicw.zzF((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzids zzidsVar = (zzids) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzidsVar.zzf(i);
            i3 += zzicw.zzF((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
