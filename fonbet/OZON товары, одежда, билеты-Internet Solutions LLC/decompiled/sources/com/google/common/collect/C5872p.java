package com.google.common.collect;

/* renamed from: com.google.common.collect.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5872p {
    static Object a(int i11) {
        if (i11 < 2 || i11 > 1073741824 || Integer.highestOneBit(i11) != i11) {
            throw new IllegalArgumentException(Ej.b.a(i11, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i11 <= 256 ? new byte[i11] : i11 <= 65536 ? new short[i11] : new int[i11];
    }

    static int b(int i11, int i12, int i13) {
        return (i11 & (~i13)) | (i12 & i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        e(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = b(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int c(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int b11 = C5877v.b(obj);
        int i12 = b11 & i11;
        int d11 = d(i12, obj3);
        if (d11 != 0) {
            int i13 = ~i11;
            int i14 = b11 & i13;
            int i15 = -1;
            while (true) {
                int i16 = d11 - 1;
                int i17 = iArr[i16];
                if ((i17 & i13) != i14 || !O7.h.b(obj, objArr[i16]) || (objArr2 != null && !O7.h.b(obj2, objArr2[i16]))) {
                    int i18 = i17 & i11;
                    if (i18 == 0) {
                        break;
                    }
                    i15 = i16;
                    d11 = i18;
                }
            }
        }
        return -1;
    }

    static int d(int i11, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i11] & 255 : obj instanceof short[] ? ((short[]) obj)[i11] & 65535 : ((int[]) obj)[i11];
    }

    static void e(int i11, int i12, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}
