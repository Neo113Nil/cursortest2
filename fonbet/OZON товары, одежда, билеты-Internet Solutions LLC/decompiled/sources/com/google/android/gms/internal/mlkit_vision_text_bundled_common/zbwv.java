package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes9.dex */
final class zbwv {
    public static final /* synthetic */ int zba = 0;

    static {
        if (zbws.zbx() && zbws.zby()) {
            int i11 = zbsm.zba;
        }
    }

    static /* bridge */ /* synthetic */ int zba(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b11 <= -12) {
                return b11;
            }
            return -1;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zbb(String str, byte[] bArr, int i11, int i12) {
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
                            throw new zbwu(i16, length);
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
                    throw new zbwu(i16 - 1, length);
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

    static int zbc(String str) {
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
                                throw new zbwu(i12, length2);
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean zbd(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return true;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            int i14 = bArr[i11];
            if (i14 >= 0) {
                i11 = i13;
            } else if (i14 < -32) {
                if (i13 >= i12) {
                    return i14 == 0;
                }
                if (i14 < -62) {
                    return false;
                }
                i11 += 2;
                if (bArr[i13] > 65471) {
                    return false;
                }
            } else if (i14 < -16) {
                if (i13 >= i12 - 1) {
                    i14 = zba(bArr, i13, i12);
                    if (i14 == 0) {
                    }
                } else {
                    int i15 = i11 + 2;
                    char c11 = bArr[i13];
                    if (c11 > 65471) {
                        return false;
                    }
                    if (i14 == -32 && c11 < 65440) {
                        return false;
                    }
                    if (i14 == -19 && c11 >= 65440) {
                        return false;
                    }
                    i11 += 3;
                    if (bArr[i15] > 65471) {
                        return false;
                    }
                }
            } else if (i13 >= i12 - 2) {
                i14 = zba(bArr, i13, i12);
                if (i14 == 0) {
                }
            } else {
                int i16 = i11 + 2;
                int i17 = bArr[i13];
                if (i17 > -65) {
                    return false;
                }
                if ((((i17 + 112) + (i14 << 28)) >> 30) != 0) {
                    return false;
                }
                int i18 = i11 + 3;
                if (bArr[i16] > 65471) {
                    return false;
                }
                i11 += 4;
                if (bArr[i18] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
