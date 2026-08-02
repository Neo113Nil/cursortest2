package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes9.dex */
final class zzhc extends zzhb {
    zzhc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(int i11, byte[] bArr, int i12, int i13) {
        int i14;
        int i15;
        int zzi;
        int zzh;
        int zzh2;
        if (i11 != 0) {
            if (i12 >= i13) {
                return i11;
            }
            byte b11 = (byte) i11;
            if (b11 < -32) {
                if (b11 >= -62) {
                    i15 = i12 + 1;
                }
                return -1;
            }
            int i16 = ~(i11 >> 8);
            if (b11 < -16) {
                byte b12 = (byte) i16;
                if (b12 == 0) {
                    int i17 = i12 + 1;
                    byte b13 = bArr[i12];
                    if (i17 >= i13) {
                        zzh2 = zzhe.zzh(b11, b13);
                        return zzh2;
                    }
                    i12 = i17;
                    b12 = b13;
                }
                if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                    i15 = i12 + 1;
                }
                return -1;
            }
            byte b14 = (byte) i16;
            if (b14 == 0) {
                int i18 = i12 + 1;
                b14 = bArr[i12];
                if (i18 >= i13) {
                    zzh = zzhe.zzh(b11, b14);
                    return zzh;
                }
                i12 = i18;
                i14 = 0;
            } else {
                i14 = i11 >> 16;
            }
            if (i14 == 0) {
                int i19 = i12 + 1;
                byte b15 = bArr[i12];
                if (i19 >= i13) {
                    zzi = zzhe.zzi(b11, b14, b15);
                    return zzi;
                }
                i12 = i19;
                i14 = b15;
            }
            if (b14 <= -65) {
                if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && i14 <= -65) {
                    i15 = i12 + 1;
                }
            }
            return -1;
            i12 = i15;
        }
        while (i12 < i13 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i13) {
            return 0;
        }
        while (i12 < i13) {
            int i21 = i12 + 1;
            byte b16 = bArr[i12];
            if (b16 >= 0) {
                i12 = i21;
            } else {
                if (b16 < -32) {
                    if (i21 >= i13) {
                        return b16;
                    }
                    if (b16 >= -62) {
                        i12 += 2;
                        if (bArr[i21] > -65) {
                        }
                    }
                    return -1;
                }
                if (b16 >= -16) {
                    if (i21 >= i13 - 2) {
                        return zzhe.zzc(bArr, i21, i13);
                    }
                    int i22 = i12 + 2;
                    byte b17 = bArr[i21];
                    if (b17 <= -65) {
                        if ((((b17 + 112) + (b16 << 28)) >> 30) == 0) {
                            int i23 = i12 + 3;
                            if (bArr[i22] <= -65) {
                                i12 += 4;
                                if (bArr[i23] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i21 >= i13 - 1) {
                    return zzhe.zzc(bArr, i21, i13);
                }
                int i24 = i12 + 2;
                byte b18 = bArr[i21];
                if (b18 > -65 || (b16 == -32 && b18 < -96)) {
                    return -1;
                }
                if (b16 == -19 && b18 >= -96) {
                    return -1;
                }
                i12 += 3;
                if (bArr[i24] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
