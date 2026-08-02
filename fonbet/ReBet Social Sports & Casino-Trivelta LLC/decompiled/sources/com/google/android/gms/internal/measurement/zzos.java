package com.google.android.gms.internal.measurement;

import com.plaid.internal.EnumC3631g;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes2.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzop.zza() && zzop.zzb()) {
            int i10 = zzkv.zza;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return true;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            int i13 = bArr[i10];
            if (i13 >= 0) {
                i10 = i12;
            } else if (i13 < -32) {
                if (i12 >= i11) {
                    return i13 == 0;
                }
                if (i13 < -62) {
                    return false;
                }
                i10 += 2;
                if (bArr[i12] > 65471) {
                    return false;
                }
            } else if (i13 < -16) {
                if (i12 >= i11 - 1) {
                    i13 = zzd(bArr, i12, i11);
                    if (i13 == 0) {
                    }
                } else {
                    int i14 = i10 + 2;
                    char c10 = bArr[i12];
                    if (c10 > 65471) {
                        return false;
                    }
                    if (i13 == -32 && c10 < 65440) {
                        return false;
                    }
                    if (i13 == -19 && c10 >= 65440) {
                        return false;
                    }
                    i10 += 3;
                    if (bArr[i14] > 65471) {
                        return false;
                    }
                }
            } else if (i12 >= i11 - 2) {
                i13 = zzd(bArr, i12, i11);
                if (i13 == 0) {
                }
            } else {
                int i15 = i10 + 2;
                int i16 = bArr[i12];
                if (i16 > -65 || (((i13 << 28) + (i16 + 112)) >> 30) != 0) {
                    return false;
                }
                int i17 = i10 + 3;
                if (bArr[i15] > 65471) {
                    return false;
                }
                i10 += 4;
                if (bArr[i17] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzb(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzor(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = i12 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (charAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) charAt;
            i15++;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char charAt2 = str.charAt(i15);
            if (charAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) charAt2;
                i16++;
            } else if (charAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                            throw new zzor(i15, length);
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(charAt2).length() + 25 + String.valueOf(i16).length());
                        sb2.append("Failed writing ");
                        sb2.append(charAt2);
                        sb2.append(" at index ");
                        sb2.append(i16);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i17 = i15 + 1;
                    if (i17 != str.length()) {
                        char charAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i18 = i16 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i15 = i17;
                        } else {
                            i15 = i17;
                        }
                    }
                    throw new zzor(i15 - 1, length);
                }
                bArr[i16] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    public static /* synthetic */ int zzd(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << Tnaf.POW_2_WIDTH) ^ ((b12 << 8) ^ b10);
    }
}
