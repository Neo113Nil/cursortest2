package o9;

import java.nio.charset.Charset;
import java.util.EnumMap;

/* renamed from: o9.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8668j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f77831a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f77832b;

    static {
        String name = Charset.defaultCharset().name();
        f77831a = name;
        f77832b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr, EnumMap enumMap) {
        boolean z11;
        byte[] bArr2 = bArr;
        if (enumMap != null) {
            h9.e eVar = h9.e.CHARACTER_SET;
            if (enumMap.containsKey(eVar)) {
                return enumMap.get(eVar).toString();
            }
        }
        int length = bArr2.length;
        boolean z12 = true;
        int i11 = 0;
        boolean z13 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z14 = true;
        boolean z15 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i13 < length && (z12 || z14 || z15)) {
            byte b11 = bArr2[i13];
            int i24 = b11 & 255;
            if (z15) {
                if (i14 <= 0) {
                    z11 = z13;
                    if ((b11 & 128) != 0) {
                        if ((b11 & 64) != 0) {
                            int i25 = i14 + 1;
                            if ((b11 & 32) == 0) {
                                i16++;
                            } else {
                                i25 = i14 + 2;
                                if ((b11 & 16) == 0) {
                                    i17++;
                                } else {
                                    i14 += 3;
                                    if ((b11 & 8) == 0) {
                                        i18++;
                                    }
                                }
                            }
                            i14 = i25;
                        }
                    }
                    if (z12) {
                        if (i24 > 127 && i24 < 160) {
                            z12 = false;
                        } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                            i21++;
                        }
                    }
                    if (z14) {
                        if (i15 > 0) {
                            if (i24 >= 64 && i24 != 127 && i24 <= 252) {
                                i15--;
                            }
                            z14 = false;
                        } else {
                            if (i24 != 128 && i24 != 160 && i24 <= 239) {
                                if (i24 <= 160 || i24 >= 224) {
                                    if (i24 > 127) {
                                        i15++;
                                        int i26 = i22 + 1;
                                        if (i26 > i11) {
                                            i11 = i26;
                                            i22 = i11;
                                        } else {
                                            i22 = i26;
                                        }
                                    } else {
                                        i22 = 0;
                                    }
                                    i23 = 0;
                                } else {
                                    i12++;
                                    int i27 = i23 + 1;
                                    if (i27 > i19) {
                                        i19 = i27;
                                        i23 = i19;
                                    } else {
                                        i23 = i27;
                                    }
                                    i22 = 0;
                                }
                            }
                            z14 = false;
                        }
                    }
                    i13++;
                    bArr2 = bArr;
                    z13 = z11;
                } else if ((b11 & 128) != 0) {
                    i14--;
                } else {
                    z11 = z13;
                }
                z15 = false;
                if (z12) {
                }
                if (z14) {
                }
                i13++;
                bArr2 = bArr;
                z13 = z11;
            }
            z11 = z13;
            if (z12) {
            }
            if (z14) {
            }
            i13++;
            bArr2 = bArr;
            z13 = z11;
        }
        boolean z16 = z13;
        if (z15 && i14 > 0) {
            z15 = false;
        }
        if (z14 && i15 > 0) {
            z14 = false;
        }
        return (!z15 || (!z16 && (i16 + i17) + i18 <= 0)) ? (!z14 || (!f77832b && i19 < 3 && i11 < 3)) ? (z12 && z14) ? (!(i19 == 2 && i12 == 2) && i21 * 10 < length) ? "ISO8859_1" : "SJIS" : z12 ? "ISO8859_1" : z14 ? "SJIS" : z15 ? "UTF8" : f77831a : "SJIS" : "UTF8";
    }
}
