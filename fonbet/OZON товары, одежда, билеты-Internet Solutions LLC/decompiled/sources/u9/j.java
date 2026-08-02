package u9;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class j {
    public static String a(String str, l lVar, h9.f fVar, h9.f fVar2) {
        int i11 = 0;
        g[] gVarArr = {new C9986a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.m(lVar);
        hVar.k(fVar, fVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.q((char) 236);
            hVar.l();
            hVar.f100410f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.q((char) 237);
            hVar.l();
            hVar.f100410f += 7;
        }
        while (hVar.h()) {
            gVarArr[i11].a(hVar);
            if (hVar.e() >= 0) {
                i11 = hVar.e();
                hVar.i();
            }
        }
        int a11 = hVar.a();
        hVar.o();
        int a12 = hVar.g().a();
        if (a11 < a12 && i11 != 0 && i11 != 5 && i11 != 4) {
            hVar.q((char) 254);
        }
        StringBuilder b11 = hVar.b();
        if (b11.length() < a12) {
            b11.append((char) 129);
        }
        while (b11.length() < a12) {
            int length = ((b11.length() + 1) * 149) % 253;
            int i12 = length + 130;
            if (i12 > 254) {
                i12 = length - 124;
            }
            b11.append((char) i12);
        }
        return hVar.b().toString();
    }

    private static int b(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < 6; i12++) {
            int ceil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = ceil;
            if (i11 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = ceil;
            }
            if (i11 == ceil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    static void c(char c11) {
        String hexString = Integer.toHexString(c11);
        throw new IllegalArgumentException("Illegal character: " + c11 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean d(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    static boolean e(char c11) {
        return c11 >= 128 && c11 <= 255;
    }

    private static boolean f(char c11) {
        if (c11 == '\r' || c11 == '*' || c11 == '>' || c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01af, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int g(int i11, int i12, String str) {
        float[] fArr;
        float f7;
        if (i11 >= str.length()) {
            return i12;
        }
        int i13 = 0;
        float f11 = 2.0f;
        int i14 = 5;
        float f12 = 1.0f;
        if (i12 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i12] = 0.0f;
        }
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            if (i16 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int b11 = b(fArr, iArr, bArr);
                int i17 = i13;
                int i18 = i17;
                while (i17 < 6) {
                    i18 += bArr[i17];
                    i17++;
                }
                if (iArr[i13] == b11) {
                    return i13;
                }
                if (i18 == 1 && bArr[i14] > 0) {
                    return i14;
                }
                if (i18 != 1 || bArr[4] <= 0) {
                    if (i18 != 1 || bArr[2] <= 0) {
                        if (i18 != 1 || bArr[3] <= 0) {
                            break;
                        }
                    }
                }
            } else {
                char charAt = str.charAt(i16);
                i15++;
                if (d(charAt)) {
                    fArr[i13] = fArr[i13] + 0.5f;
                } else if (e(charAt)) {
                    float ceil = (float) Math.ceil(fArr[i13]);
                    fArr[i13] = ceil;
                    fArr[i13] = ceil + f11;
                } else {
                    float ceil2 = (float) Math.ceil(fArr[i13]);
                    fArr[i13] = ceil2;
                    fArr[i13] = ceil2 + f12;
                }
                int i19 = i13;
                int i21 = i14;
                if (charAt == ' ' || (charAt >= '0' && charAt <= '9')) {
                    f7 = f12;
                } else {
                    f7 = f12;
                    if (charAt < 'A' || charAt > 'Z') {
                        if (e(charAt)) {
                            fArr[1] = fArr[1] + 2.6666667f;
                        } else {
                            fArr[1] = fArr[1] + 1.3333334f;
                        }
                        if (charAt != ' ' || ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z'))) {
                            fArr[2] = fArr[2] + 0.6666667f;
                        } else if (e(charAt)) {
                            fArr[2] = fArr[2] + 2.6666667f;
                        } else {
                            fArr[2] = fArr[2] + 1.3333334f;
                        }
                        if (!f(charAt)) {
                            fArr[3] = fArr[3] + 0.6666667f;
                        } else if (e(charAt)) {
                            fArr[3] = fArr[3] + 4.3333335f;
                        } else {
                            fArr[3] = fArr[3] + 3.3333333f;
                        }
                        if (charAt < ' ' && charAt <= '^') {
                            fArr[4] = fArr[4] + 0.75f;
                        } else if (e(charAt)) {
                            fArr[4] = fArr[4] + 3.25f;
                        } else {
                            fArr[4] = fArr[4] + 4.25f;
                        }
                        fArr[i21] = fArr[i21] + f7;
                        if (i15 < 4) {
                            int[] iArr2 = new int[6];
                            byte[] bArr2 = new byte[6];
                            b(fArr, iArr2, bArr2);
                            int i22 = i19;
                            int i23 = i22;
                            while (i22 < 6) {
                                i23 += bArr2[i22];
                                i22++;
                            }
                            int i24 = iArr2[i19];
                            int i25 = iArr2[i21];
                            if (i24 < i25 && i24 < iArr2[1] && i24 < iArr2[2] && i24 < iArr2[3] && i24 < iArr2[4]) {
                                return i19;
                            }
                            if (i25 < i24) {
                                return i21;
                            }
                            byte b12 = bArr2[1];
                            byte b13 = bArr2[2];
                            byte b14 = bArr2[3];
                            byte b15 = bArr2[4];
                            if (b12 + b13 + b14 + b15 == 0) {
                                return i21;
                            }
                            if (i23 == 1 && b15 > 0) {
                                break;
                            }
                            if (i23 == 1 && b13 > 0) {
                                break;
                            }
                            if (i23 == 1 && b14 > 0) {
                                break;
                            }
                            int i26 = iArr2[1];
                            int i27 = i26 + 1;
                            if (i27 < i24 && i27 < i25 && i27 < iArr2[4] && i27 < iArr2[2]) {
                                int i28 = iArr2[3];
                                if (i26 < i28) {
                                    break;
                                }
                                if (i26 == i28) {
                                    for (int i29 = i11 + i15 + 1; i29 < str.length(); i29++) {
                                        char charAt2 = str.charAt(i29);
                                        if (charAt2 == '\r' || charAt2 == '*' || charAt2 == '>') {
                                            return 3;
                                        }
                                        if (!f(charAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i19;
                        i14 = i21;
                        f12 = f7;
                        f11 = 2.0f;
                    }
                }
                fArr[1] = fArr[1] + 0.6666667f;
                if (charAt != ' ') {
                }
                fArr[2] = fArr[2] + 0.6666667f;
                if (!f(charAt)) {
                }
                if (charAt < ' ') {
                }
                if (e(charAt)) {
                }
                fArr[i21] = fArr[i21] + f7;
                if (i15 < 4) {
                }
                i13 = i19;
                i14 = i21;
                f12 = f7;
                f11 = 2.0f;
            }
        }
        return 1;
    }
}
