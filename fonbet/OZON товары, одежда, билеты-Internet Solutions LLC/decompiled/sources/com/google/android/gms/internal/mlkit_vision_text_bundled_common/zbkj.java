package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import Ej.b;

/* loaded from: classes9.dex */
public final class zbkj {
    public static int zba(int i11, int i12, String str) {
        String zba;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            zba = zbkp.zba("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                throw new IllegalArgumentException(b.a(i12, "negative size: "));
            }
            zba = zbkp.zba("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(zba);
    }

    public static int zbb(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(zbe(i11, i12, "index"));
        }
        return i11;
    }

    public static void zbc(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void zbd(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? zbe(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? zbe(i12, i13, "end index") : zbkp.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    private static String zbe(int i11, int i12, String str) {
        if (i11 < 0) {
            return zbkp.zba("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return zbkp.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(b.a(i12, "negative size: "));
    }
}
