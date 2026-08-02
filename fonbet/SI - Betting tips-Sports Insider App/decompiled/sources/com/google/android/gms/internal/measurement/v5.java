package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public final t f5284a;

    public v5(t6 t6Var, t6 t6Var2) {
        this.f5284a = new t(t6Var, t6Var2);
    }

    public static void a(x4 x4Var, t tVar, Object obj, Object obj2) {
        b5.b(x4Var, (t6) tVar.f5243a, 1, obj);
        b5.b(x4Var, (t6) tVar.f5244b, 2, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(t tVar, Object obj, Object obj2) {
        int K;
        int c2;
        int b02;
        int c8;
        int b03;
        t6 t6Var = (t6) tVar.f5243a;
        t6 t6Var2 = (t6) tVar.f5244b;
        int i5 = b5.f4932c;
        int i10 = 8;
        int b04 = x4.b0(8);
        t6 t6Var3 = t6.f5254d;
        if (t6Var == t6Var3) {
            Charset charset = n5.f5148a;
            b04 += b04;
        }
        u6 u6Var = u6.f5268a;
        switch (t6Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                K = 8;
                int i11 = K + b04;
                int b05 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                    Charset charset2 = n5.f5148a;
                    b05 += b05;
                }
                switch (t6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return i10 + b05 + i11;
                    case 1:
                        ((Float) obj2).getClass();
                        i10 = 4;
                        return i10 + b05 + i11;
                    case 2:
                        i10 = x4.K(((Long) obj2).longValue());
                        return i10 + b05 + i11;
                    case 3:
                        i10 = x4.K(((Long) obj2).longValue());
                        return i10 + b05 + i11;
                    case 4:
                        i10 = x4.K(((Integer) obj2).intValue());
                        return i10 + b05 + i11;
                    case 5:
                        ((Long) obj2).getClass();
                        return i10 + b05 + i11;
                    case 6:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + b05 + i11;
                    case 7:
                        ((Boolean) obj2).getClass();
                        i10 = 1;
                        return i10 + b05 + i11;
                    case 8:
                        if (!(obj2 instanceof w4)) {
                            i10 = x4.L((String) obj2);
                            return i10 + b05 + i11;
                        }
                        c8 = ((w4) obj2).c();
                        b03 = x4.b0(c8);
                        i10 = b03 + c8;
                        return i10 + b05 + i11;
                    case 9:
                        i10 = ((g5) ((q4) obj2)).k();
                        return i10 + b05 + i11;
                    case 10:
                        c8 = ((g5) ((q4) obj2)).k();
                        b03 = x4.b0(c8);
                        i10 = b03 + c8;
                        return i10 + b05 + i11;
                    case 11:
                        if (obj2 instanceof w4) {
                            c8 = ((w4) obj2).c();
                            b03 = x4.b0(c8);
                        } else {
                            c8 = ((byte[]) obj2).length;
                            b03 = x4.b0(c8);
                        }
                        i10 = b03 + c8;
                        return i10 + b05 + i11;
                    case 12:
                        i10 = x4.b0(((Integer) obj2).intValue());
                        return i10 + b05 + i11;
                    case 13:
                        i10 = obj2 instanceof i5 ? x4.K(((i5) obj2).a()) : x4.K(((Integer) obj2).intValue());
                        return i10 + b05 + i11;
                    case 14:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + b05 + i11;
                    case 15:
                        ((Long) obj2).getClass();
                        return i10 + b05 + i11;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i10 = x4.b0((intValue >> 31) ^ (intValue + intValue));
                        return i10 + b05 + i11;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i10 = x4.K((longValue >> 63) ^ (longValue + longValue));
                        return i10 + b05 + i11;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                K = 4;
                int i112 = K + b04;
                int b052 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 2:
                K = x4.K(((Long) obj).longValue());
                int i1122 = K + b04;
                int b0522 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 3:
                K = x4.K(((Long) obj).longValue());
                int i11222 = K + b04;
                int b05222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 4:
                K = x4.K(((Integer) obj).intValue());
                int i112222 = K + b04;
                int b052222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                K = 8;
                int i1122222 = K + b04;
                int b0522222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                K = 4;
                int i11222222 = K + b04;
                int b05222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                K = 1;
                int i112222222 = K + b04;
                int b052222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 8:
                if (obj instanceof w4) {
                    c2 = ((w4) obj).c();
                    b02 = x4.b0(c2);
                    K = c2 + b02;
                    int i1122222222 = K + b04;
                    int b0522222222 = x4.b0(16);
                    if (t6Var2 == t6Var3) {
                    }
                    switch (t6Var2.ordinal()) {
                    }
                } else {
                    K = x4.L((String) obj);
                    int i11222222222 = K + b04;
                    int b05222222222 = x4.b0(16);
                    if (t6Var2 == t6Var3) {
                    }
                    switch (t6Var2.ordinal()) {
                    }
                }
            case 9:
                K = ((g5) ((q4) obj)).k();
                int i112222222222 = K + b04;
                int b052222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 10:
                c2 = ((g5) ((q4) obj)).k();
                b02 = x4.b0(c2);
                K = c2 + b02;
                int i1122222222222 = K + b04;
                int b0522222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 11:
                if (obj instanceof w4) {
                    c2 = ((w4) obj).c();
                    b02 = x4.b0(c2);
                } else {
                    c2 = ((byte[]) obj).length;
                    b02 = x4.b0(c2);
                }
                K = c2 + b02;
                int i11222222222222 = K + b04;
                int b05222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 12:
                K = x4.b0(((Integer) obj).intValue());
                int i112222222222222 = K + b04;
                int b052222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 13:
                K = obj instanceof i5 ? x4.K(((i5) obj).a()) : x4.K(((Integer) obj).intValue());
                int i1122222222222222 = K + b04;
                int b0522222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                K = 4;
                int i11222222222222222 = K + b04;
                int b05222222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                K = 8;
                int i112222222222222222 = K + b04;
                int b052222222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                K = x4.b0((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i1122222222222222222 = K + b04;
                int b0522222222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                K = x4.K((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i11222222222222222222 = K + b04;
                int b05222222222222222222 = x4.b0(16);
                if (t6Var2 == t6Var3) {
                }
                switch (t6Var2.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
