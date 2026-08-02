package com.google.android.gms.internal.gtm;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes9.dex */
final class zzyd {
    private static final zzya zza;

    static {
        if (zzxy.zzx() && zzxy.zzy()) {
            int i11 = zzsk.zza;
        }
        zza = new zzyb();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
        }
        if (i13 == 1) {
            byte b12 = bArr[i11];
            if (b11 > -12 || b12 > -65) {
                return -1;
            }
            return (b12 << 8) ^ b11;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b13 = bArr[i11];
        byte b14 = bArr[i11 + 1];
        if (b11 > -12 || b13 > -65 || b14 > -65) {
            return -1;
        }
        return (b14 << 16) ^ ((b13 << 8) ^ b11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzb(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i12 + i11;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i11) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                bArr[i17] = (byte) charAt2;
                i17++;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i17 > i15 - 3) {
                    if (i17 > i15 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                            throw new zzyc(i16, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(charAt2);
                        sb2.append(" at index ");
                        sb2.append(i17);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i19 = i16 + 1;
                    if (i19 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i19);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            int i21 = i17 + 3;
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i17 += 4;
                            bArr[i21] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i16 = i19;
                        } else {
                            i16 = i19;
                        }
                    }
                    throw new zzyc(i16 - 1, length);
                }
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                int i22 = i17 + 2;
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                i17 += 3;
                bArr[i22] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            i16++;
        }
        return i17;
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new zzyc(i12, length2);
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i13 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    static String zzd(byte[] bArr, int i11, int i12) throws zzvk {
        int length = bArr.length;
        if ((i11 | i12 | ((length - i11) - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        int i13 = i11 + i12;
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i11 < i13) {
            byte b11 = bArr[i11];
            if (!zzxz.zzd(b11)) {
                break;
            }
            i11++;
            cArr[i14] = (char) b11;
            i14++;
        }
        int i15 = i14;
        while (i11 < i13) {
            int i16 = i11 + 1;
            byte b12 = bArr[i11];
            if (zzxz.zzd(b12)) {
                cArr[i15] = (char) b12;
                i15++;
                i11 = i16;
                while (i11 < i13) {
                    byte b13 = bArr[i11];
                    if (!zzxz.zzd(b13)) {
                        break;
                    }
                    i11++;
                    cArr[i15] = (char) b13;
                    i15++;
                }
            } else if (b12 < -32) {
                if (i16 >= i13) {
                    throw zzvk.zzd();
                }
                i11 += 2;
                zzxz.zzc(b12, bArr[i16], cArr, i15);
                i15++;
            } else if (b12 < -16) {
                if (i16 >= i13 - 1) {
                    throw zzvk.zzd();
                }
                int i17 = i11 + 2;
                i11 += 3;
                zzxz.zzb(b12, bArr[i16], bArr[i17], cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw zzvk.zzd();
                }
                int i18 = i11 + 2;
                int i19 = i11 + 3;
                i11 += 4;
                zzxz.zza(b12, bArr[i16], bArr[i18], bArr[i19], cArr, i15);
                i15 += 2;
            }
        }
        return new String(cArr, 0, i15);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i11, int i12) {
        return zza.zzb(bArr, i11, i12);
    }
}
