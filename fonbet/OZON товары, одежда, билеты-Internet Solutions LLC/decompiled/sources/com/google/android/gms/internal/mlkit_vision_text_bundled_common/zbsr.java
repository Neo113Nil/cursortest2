package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

/* loaded from: classes9.dex */
final class zbsr {
    public static final /* synthetic */ int zba = 0;
    private static volatile int zbb = 100;

    static int zba(byte[] bArr, int i11, zbsq zbsqVar) throws zbuq {
        int zbk = zbk(bArr, i11, zbsqVar);
        int i12 = zbsqVar.zba;
        if (i12 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - zbk) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            zbsqVar.zbc = zbtc.zbb;
            return zbk;
        }
        zbsqVar.zbc = zbtc.zbj(bArr, zbk, i12);
        return zbk + i12;
    }

    static int zbb(int i11, byte[] bArr, int i12, int i13, zbub zbubVar, zbud zbudVar, zbwl zbwlVar, zbsq zbsqVar) throws IOException {
        zbtu zbtuVar = zbubVar.zbb;
        zbww zbwwVar = zbudVar.zbb.zbb;
        Object obj = null;
        if (zbwwVar == zbww.zbn) {
            zbk(bArr, i12, zbsqVar);
            throw null;
        }
        switch (zbwwVar.ordinal()) {
            case 0:
                i12 += 8;
                obj = Double.valueOf(Double.longBitsToDouble(zbr(bArr, i12)));
                break;
            case 1:
                i12 += 4;
                obj = Float.valueOf(Float.intBitsToFloat(zbc(bArr, i12)));
                break;
            case 2:
            case 3:
                i12 = zbn(bArr, i12, zbsqVar);
                obj = Long.valueOf(zbsqVar.zbb);
                break;
            case 4:
            case 12:
                i12 = zbk(bArr, i12, zbsqVar);
                obj = Integer.valueOf(zbsqVar.zba);
                break;
            case 5:
            case 15:
                i12 += 8;
                obj = Long.valueOf(zbr(bArr, i12));
                break;
            case 6:
            case 14:
                i12 += 4;
                obj = Integer.valueOf(zbc(bArr, i12));
                break;
            case 7:
                i12 = zbn(bArr, i12, zbsqVar);
                obj = Boolean.valueOf(zbsqVar.zbb != 0);
                break;
            case 8:
                i12 = zbh(bArr, i12, zbsqVar);
                obj = zbsqVar.zbc;
                break;
            case 9:
                int i14 = ((i11 >>> 3) << 3) | 4;
                zbvx zbb2 = zbvu.zba().zbb(zbudVar.zba.getClass());
                Object zbf = zbtuVar.zbf(zbudVar.zbb);
                if (zbf == null) {
                    zbf = zbb2.zbe();
                    zbtuVar.zbj(zbudVar.zbb, zbf);
                }
                return zbo(zbf, zbb2, bArr, i12, i13, i14, zbsqVar);
            case 10:
                zbvx zbb3 = zbvu.zba().zbb(zbudVar.zba.getClass());
                Object zbf2 = zbtuVar.zbf(zbudVar.zbb);
                if (zbf2 == null) {
                    zbf2 = zbb3.zbe();
                    zbtuVar.zbj(zbudVar.zbb, zbf2);
                }
                return zbp(zbf2, zbb3, bArr, i12, i13, zbsqVar);
            case 11:
                i12 = zba(bArr, i12, zbsqVar);
                obj = zbsqVar.zbc;
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i12 = zbk(bArr, i12, zbsqVar);
                obj = Integer.valueOf(zbtg.zbb(zbsqVar.zba));
                break;
            case 17:
                i12 = zbn(bArr, i12, zbsqVar);
                obj = Long.valueOf(zbtg.zbc(zbsqVar.zbb));
                break;
        }
        zbtuVar.zbj(zbudVar.zbb, obj);
        return i12;
    }

    static int zbc(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    static int zbd(zbvx zbvxVar, byte[] bArr, int i11, int i12, int i13, zbsq zbsqVar) throws IOException {
        Object zbe = zbvxVar.zbe();
        int zbo = zbo(zbe, zbvxVar, bArr, i11, i12, i13, zbsqVar);
        zbvxVar.zbf(zbe);
        zbsqVar.zbc = zbe;
        return zbo;
    }

    static int zbe(zbvx zbvxVar, byte[] bArr, int i11, int i12, zbsq zbsqVar) throws IOException {
        Object zbe = zbvxVar.zbe();
        int zbp = zbp(zbe, zbvxVar, bArr, i11, i12, zbsqVar);
        zbvxVar.zbf(zbe);
        zbsqVar.zbc = zbe;
        return zbp;
    }

    static int zbf(zbvx zbvxVar, int i11, byte[] bArr, int i12, int i13, zbun zbunVar, zbsq zbsqVar) throws IOException {
        int zbe = zbe(zbvxVar, bArr, i12, i13, zbsqVar);
        zbunVar.add(zbsqVar.zbc);
        while (zbe < i13) {
            int zbk = zbk(bArr, zbe, zbsqVar);
            if (i11 != zbsqVar.zba) {
                break;
            }
            zbe = zbe(zbvxVar, bArr, zbk, i13, zbsqVar);
            zbunVar.add(zbsqVar.zbc);
        }
        return zbe;
    }

    static int zbg(byte[] bArr, int i11, zbun zbunVar, zbsq zbsqVar) throws IOException {
        zbug zbugVar = (zbug) zbunVar;
        int zbk = zbk(bArr, i11, zbsqVar);
        int i12 = zbsqVar.zba + zbk;
        while (zbk < i12) {
            zbk = zbk(bArr, zbk, zbsqVar);
            zbugVar.zbg(zbsqVar.zba);
        }
        if (zbk == i12) {
            return zbk;
        }
        throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zbh(byte[] bArr, int i11, zbsq zbsqVar) throws zbuq {
        int zbk = zbk(bArr, i11, zbsqVar);
        int i12 = zbsqVar.zba;
        if (i12 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zbsqVar.zbc = "";
            return zbk;
        }
        zbsqVar.zbc = new String(bArr, zbk, i12, zbuo.zba);
        return zbk + i12;
    }

    static int zbi(byte[] bArr, int i11, zbsq zbsqVar) throws zbuq {
        int i12;
        int zbk = zbk(bArr, i11, zbsqVar);
        int i13 = zbsqVar.zba;
        if (i13 < 0) {
            throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            zbsqVar.zbc = "";
            return zbk;
        }
        int i14 = zbwv.zba;
        int length = bArr.length;
        if ((((length - zbk) - i13) | zbk | i13) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zbk), Integer.valueOf(i13)));
        }
        int i15 = zbk + i13;
        char[] cArr = new char[i13];
        int i16 = 0;
        while (zbk < i15) {
            byte b11 = bArr[zbk];
            if (!zbwt.zbd(b11)) {
                break;
            }
            zbk++;
            cArr[i16] = (char) b11;
            i16++;
        }
        int i17 = i16;
        while (zbk < i15) {
            int i18 = zbk + 1;
            byte b12 = bArr[zbk];
            if (zbwt.zbd(b12)) {
                cArr[i17] = (char) b12;
                i17++;
                zbk = i18;
                while (zbk < i15) {
                    byte b13 = bArr[zbk];
                    if (zbwt.zbd(b13)) {
                        zbk++;
                        cArr[i17] = (char) b13;
                        i17++;
                    }
                }
            } else {
                if (b12 < -32) {
                    if (i18 >= i15) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    i12 = i17 + 1;
                    zbk += 2;
                    zbwt.zbc(b12, bArr[i18], cArr, i17);
                } else if (b12 < -16) {
                    if (i18 >= i15 - 1) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    i12 = i17 + 1;
                    int i19 = zbk + 2;
                    zbk += 3;
                    zbwt.zbb(b12, bArr[i18], bArr[i19], cArr, i17);
                } else {
                    if (i18 >= i15 - 2) {
                        throw new zbuq("Protocol message had invalid UTF-8.");
                    }
                    byte b14 = bArr[i18];
                    int i21 = zbk + 3;
                    byte b15 = bArr[zbk + 2];
                    zbk += 4;
                    zbwt.zba(b12, b14, b15, bArr[i21], cArr, i17);
                    i17 += 2;
                }
                i17 = i12;
            }
        }
        zbsqVar.zbc = new String(cArr, 0, i17);
        return i15;
    }

    static int zbj(int i11, byte[] bArr, int i12, int i13, zbwm zbwmVar, zbsq zbsqVar) throws zbuq {
        if ((i11 >>> 3) == 0) {
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int zbn = zbn(bArr, i12, zbsqVar);
            zbwmVar.zbj(i11, Long.valueOf(zbsqVar.zbb));
            return zbn;
        }
        if (i14 == 1) {
            zbwmVar.zbj(i11, Long.valueOf(zbr(bArr, i12)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int zbk = zbk(bArr, i12, zbsqVar);
            int i15 = zbsqVar.zba;
            if (i15 < 0) {
                throw new zbuq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - zbk) {
                throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                zbwmVar.zbj(i11, zbtc.zbb);
            } else {
                zbwmVar.zbj(i11, zbtc.zbj(bArr, zbk, i15));
            }
            return zbk + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw new zbuq("Protocol message contained an invalid tag (zero).");
            }
            zbwmVar.zbj(i11, Integer.valueOf(zbc(bArr, i12)));
            return i12 + 4;
        }
        int i16 = (i11 & (-8)) | 4;
        zbwm zbf = zbwm.zbf();
        int i17 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i17;
        zbs(i17);
        int i18 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int zbk2 = zbk(bArr, i12, zbsqVar);
            int i19 = zbsqVar.zba;
            if (i19 == i16) {
                i18 = i19;
                i12 = zbk2;
                break;
            }
            i12 = zbj(i19, bArr, zbk2, i13, zbf, zbsqVar);
            i18 = i19;
        }
        zbsqVar.zbe--;
        if (i12 > i13 || i18 != i16) {
            throw new zbuq("Failed to parse the message.");
        }
        zbwmVar.zbj(i11, zbf);
        return i12;
    }

    static int zbk(byte[] bArr, int i11, zbsq zbsqVar) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return zbl(b11, bArr, i12, zbsqVar);
        }
        zbsqVar.zba = b11;
        return i12;
    }

    static int zbl(int i11, byte[] bArr, int i12, zbsq zbsqVar) {
        byte b11 = bArr[i12];
        int i13 = i12 + 1;
        int i14 = i11 & 127;
        if (b11 >= 0) {
            zbsqVar.zba = i14 | (b11 << 7);
            return i13;
        }
        int i15 = i14 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zbsqVar.zba = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zbsqVar.zba = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            zbsqVar.zba = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                zbsqVar.zba = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int zbm(int i11, byte[] bArr, int i12, int i13, zbun zbunVar, zbsq zbsqVar) {
        zbug zbugVar = (zbug) zbunVar;
        int zbk = zbk(bArr, i12, zbsqVar);
        zbugVar.zbg(zbsqVar.zba);
        while (zbk < i13) {
            int zbk2 = zbk(bArr, zbk, zbsqVar);
            if (i11 != zbsqVar.zba) {
                break;
            }
            zbk = zbk(bArr, zbk2, zbsqVar);
            zbugVar.zbg(zbsqVar.zba);
        }
        return zbk;
    }

    static int zbn(byte[] bArr, int i11, zbsq zbsqVar) {
        long j11 = bArr[i11];
        int i12 = i11 + 1;
        if (j11 >= 0) {
            zbsqVar.zbb = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        zbsqVar.zbb = j12;
        return i13;
    }

    static int zbo(Object obj, zbvx zbvxVar, byte[] bArr, int i11, int i12, int i13, zbsq zbsqVar) throws IOException {
        int i14 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i14;
        zbs(i14);
        int zbc = ((zbvp) zbvxVar).zbc(obj, bArr, i11, i12, i13, zbsqVar);
        zbsqVar.zbe--;
        zbsqVar.zbc = obj;
        return zbc;
    }

    static int zbp(Object obj, zbvx zbvxVar, byte[] bArr, int i11, int i12, zbsq zbsqVar) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = zbl(i14, bArr, i13, zbsqVar);
            i14 = zbsqVar.zba;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i16 = zbsqVar.zbe + 1;
        zbsqVar.zbe = i16;
        zbs(i16);
        int i17 = i15 + i14;
        zbvxVar.zbh(obj, bArr, i15, i17, zbsqVar);
        zbsqVar.zbe--;
        zbsqVar.zbc = obj;
        return i17;
    }

    static int zbq(int i11, byte[] bArr, int i12, int i13, zbsq zbsqVar) throws zbuq {
        if ((i11 >>> 3) == 0) {
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return zbn(bArr, i12, zbsqVar);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return zbk(bArr, i12, zbsqVar) + zbsqVar.zba;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw new zbuq("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = zbk(bArr, i12, zbsqVar);
            i16 = zbsqVar.zba;
            if (i16 == i15) {
                break;
            }
            i12 = zbq(i16, bArr, i12, i13, zbsqVar);
        }
        if (i12 > i13 || i16 != i15) {
            throw new zbuq("Failed to parse the message.");
        }
        return i12;
    }

    static long zbr(byte[] bArr, int i11) {
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | ((bArr[i11 + 7] & 255) << 56);
    }

    private static void zbs(int i11) throws zbuq {
        if (i11 >= zbb) {
            throw new zbuq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
