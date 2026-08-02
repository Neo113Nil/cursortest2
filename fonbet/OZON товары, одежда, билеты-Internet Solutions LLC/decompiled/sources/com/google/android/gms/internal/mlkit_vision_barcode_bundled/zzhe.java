package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes9.dex */
final class zzhe {
    public static final /* synthetic */ int zza = 0;
    private static final zzhb zzb;

    static {
        if (zzgz.zzx() && zzgz.zzy()) {
            int i11 = zzct.zza;
        }
        zzb = new zzhc();
    }

    static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
        }
        if (i13 == 1) {
            return zzh(b11, bArr[i11]);
        }
        if (i13 == 2) {
            return zzi(b11, bArr[i11], bArr[i11 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzd(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char charAt;
        int length = str.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length || (i15 = i16 + i11) >= i13 || (charAt = str.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) charAt;
            i16++;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char charAt2 = str.charAt(i16);
            if (charAt2 < 128 && i17 < i13) {
                bArr[i17] = (byte) charAt2;
                i17++;
            } else if (charAt2 < 2048 && i17 <= i13 - 2) {
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i17 + 1] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                i17 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i17 > i13 - 3) {
                    if (i17 > i13 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i14 = i16 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i14)))) {
                            throw new zzhd(i16, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                    }
                    int i18 = i16 + 1;
                    if (i18 != str.length()) {
                        char charAt3 = str.charAt(i18);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i19 = i17 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i17 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i16 = i18;
                        } else {
                            i16 = i18;
                        }
                    }
                    throw new zzhd(i16 - 1, length);
                }
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                bArr[i17 + 2] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                i17 += 3;
            }
            i16++;
        }
        return i17;
    }

    static int zze(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && str.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = str.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = str.length();
                while (i12 < length2) {
                    char charAt2 = str.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new zzhd(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i13 + 4294967296L));
    }

    static int zzf(int i11, byte[] bArr, int i12, int i13) {
        return zzb.zza(i11, bArr, i12, i13);
    }

    static boolean zzg(byte[] bArr, int i11, int i12) {
        return zzb.zza(0, bArr, i11, i12) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzh(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }
}
