package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import TY.a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes9.dex */
final class zbvz {
    public static final /* synthetic */ int zba = 0;
    private static final zbwl zbb;

    static {
        int i11 = zbvu.zba;
        zbb = new zbwn();
    }

    public static void zbA(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbD(i11, list, z11);
    }

    public static void zbB(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbF(i11, list, z11);
    }

    public static void zbC(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbK(i11, list, z11);
    }

    public static void zbD(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbM(i11, list, z11);
    }

    static boolean zbE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zba(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbug)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zbtk.zbE(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zbug zbugVar = (zbug) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zbtk.zbE(zbugVar.zbe(i11));
            i11++;
        }
        return i13;
    }

    static int zbb(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zbtk.zbD(i11 << 3) + 4) * size;
    }

    static int zbc(List list) {
        return list.size() * 4;
    }

    static int zbd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zbtk.zbD(i11 << 3) + 8) * size;
    }

    static int zbe(List list) {
        return list.size() * 8;
    }

    static int zbf(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbug)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zbtk.zbE(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zbug zbugVar = (zbug) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zbtk.zbE(zbugVar.zbe(i11));
            i11++;
        }
        return i13;
    }

    static int zbg(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbva)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zbtk.zbE(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zbva zbvaVar = (zbva) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zbtk.zbE(zbvaVar.zbe(i11));
            i11++;
        }
        return i13;
    }

    static int zbh(int i11, Object obj, zbvx zbvxVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zbuw)) {
            return zbtk.zbD(i12) + zbtk.zbB((zbvm) obj, zbvxVar);
        }
        int zbD = zbtk.zbD(i12);
        int zba2 = ((zbuw) obj).zba();
        return a.a(zba2, zba2, zbD);
    }

    static int zbi(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbug)) {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 += zbtk.zbD((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return i12;
        }
        zbug zbugVar = (zbug) list;
        int i13 = 0;
        while (i11 < size) {
            int zbe = zbugVar.zbe(i11);
            i13 += zbtk.zbD((zbe >> 31) ^ (zbe + zbe));
            i11++;
        }
        return i13;
    }

    static int zbj(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbva)) {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 += zbtk.zbE((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return i12;
        }
        zbva zbvaVar = (zbva) list;
        int i13 = 0;
        while (i11 < size) {
            long zbe = zbvaVar.zbe(i11);
            i13 += zbtk.zbE((zbe >> 63) ^ (zbe + zbe));
            i11++;
        }
        return i13;
    }

    static int zbk(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbug)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zbtk.zbD(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return i12;
        }
        zbug zbugVar = (zbug) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zbtk.zbD(zbugVar.zbe(i11));
            i11++;
        }
        return i13;
    }

    static int zbl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zbva)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += zbtk.zbE(((Long) list.get(i11)).longValue());
                i11++;
            }
            return i12;
        }
        zbva zbvaVar = (zbva) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += zbtk.zbE(zbvaVar.zbe(i11));
            i11++;
        }
        return i13;
    }

    public static zbwl zbm() {
        return zbb;
    }

    static Object zbn(Object obj, int i11, int i12, Object obj2, zbwl zbwlVar) {
        if (obj2 == null) {
            obj2 = zbwlVar.zba(obj);
        }
        ((zbwm) obj2).zbj(i11 << 3, Long.valueOf(i12));
        return obj2;
    }

    static void zbo(zbtq zbtqVar, Object obj, Object obj2) {
        zbtu zbtuVar = ((zbub) obj2).zbb;
        if (zbtuVar.zba.isEmpty()) {
            return;
        }
        ((zbub) obj).zbg().zbi(zbtuVar);
    }

    static void zbp(zbwl zbwlVar, Object obj, Object obj2) {
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        zbwm zbwmVar2 = ((zbuf) obj2).zbc;
        if (!zbwm.zbc().equals(zbwmVar2)) {
            if (zbwm.zbc().equals(zbwmVar)) {
                zbwmVar = zbwm.zbe(zbwmVar, zbwmVar2);
            } else {
                zbwmVar.zbd(zbwmVar2);
            }
        }
        zbufVar.zbc = zbwmVar;
    }

    public static void zbq(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbc(i11, list, z11);
    }

    public static void zbr(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbg(i11, list, z11);
    }

    public static void zbs(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbj(i11, list, z11);
    }

    public static void zbt(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbl(i11, list, z11);
    }

    public static void zbu(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbn(i11, list, z11);
    }

    public static void zbv(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbp(i11, list, z11);
    }

    public static void zbw(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbs(i11, list, z11);
    }

    public static void zbx(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbu(i11, list, z11);
    }

    public static void zby(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbz(i11, list, z11);
    }

    public static void zbz(int i11, List list, zbwy zbwyVar, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zbwyVar.zbB(i11, list, z11);
    }
}
