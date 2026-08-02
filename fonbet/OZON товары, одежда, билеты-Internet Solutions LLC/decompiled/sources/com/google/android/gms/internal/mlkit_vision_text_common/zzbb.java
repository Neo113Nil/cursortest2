package com.google.android.gms.internal.mlkit_vision_text_common;

import Ej.b;

/* loaded from: classes9.dex */
final class zzbb {
    static int zza(int i11) {
        return (i11 + 1) * (i11 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zze(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzb(Object obj, Object obj2, int i11, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zza = zzbc.zza(obj);
        int i12 = zza & i11;
        int zzc = zzc(obj3, i12);
        if (zzc != 0) {
            int i13 = ~i11;
            int i14 = zza & i13;
            int i15 = -1;
            while (true) {
                int i16 = zzc - 1;
                int i17 = iArr[i16];
                int i18 = i17 & i11;
                if ((i17 & i13) != i14 || !zzw.zza(obj, objArr[i16]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i16]))) {
                    if (i18 == 0) {
                        break;
                    }
                    i15 = i16;
                    zzc = i18;
                }
            }
        }
        return -1;
    }

    static int zzc(Object obj, int i11) {
        return obj instanceof byte[] ? ((byte[]) obj)[i11] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i11] : ((int[]) obj)[i11];
    }

    static Object zzd(int i11) {
        if (i11 < 2 || i11 > 1073741824 || Integer.highestOneBit(i11) != i11) {
            throw new IllegalArgumentException(b.a(i11, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i11 <= 256 ? new byte[i11] : i11 <= 65536 ? new short[i11] : new int[i11];
    }

    static void zze(Object obj, int i11, int i12) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i11] = (byte) i12;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i11] = (short) i12;
        } else {
            ((int[]) obj)[i11] = i12;
        }
    }
}
