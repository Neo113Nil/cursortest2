package com.google.zxing.datamatrix.encoder;

import com.plaid.internal.EnumC3631g;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class j {
    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char charAt = charSequence.charAt(i10);
            while (f(charAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    charAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static String b(String str, l lVar, com.google.zxing.b bVar, com.google.zxing.b bVar2) {
        int i10 = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(lVar);
        hVar.l(bVar, bVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 236);
            hVar.m(2);
            hVar.f38399d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 237);
            hVar.m(2);
            hVar.f38399d += 7;
        }
        while (hVar.i()) {
            gVarArr[i10].a(hVar);
            if (hVar.e() >= 0) {
                i10 = hVar.e();
                hVar.j();
            }
        }
        int a10 = hVar.a();
        hVar.p();
        int a11 = hVar.g().a();
        if (a10 < a11 && i10 != 0 && i10 != 5 && i10 != 4) {
            hVar.r((char) 254);
        }
        StringBuilder b10 = hVar.b();
        if (b10.length() < a11) {
            b10.append((char) 129);
        }
        while (b10.length() < a11) {
            b10.append(o((char) 129, b10.length() + 1));
        }
        return hVar.b().toString();
    }

    public static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    public static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean h(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    public static boolean j(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean k(char c10) {
        if (m(c10) || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean l(char c10) {
        return false;
    }

    public static boolean m(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    public static int n(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        float f10;
        int i12;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        float f11 = 2.0f;
        float f12 = 1.0f;
        int i13 = 5;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i11] = 0.0f;
        }
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            if (i15 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c10 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d10 = d(bArr);
                if (iArr[0] == c10) {
                    return 0;
                }
                if (d10 == 1 && bArr[i13] > 0) {
                    return i13;
                }
                if (d10 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d10 != 1 || bArr[2] <= 0) {
                    return (d10 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i15);
            i14++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f10 = f12;
                i12 = i13;
            } else if (g(charAt)) {
                f10 = f12;
                i12 = i13;
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f11;
            } else {
                f10 = f12;
                i12 = i13;
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + f10;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                fArr[i12] = fArr[i12] + 4.0f;
            } else {
                fArr[i12] = fArr[i12] + f10;
            }
            if (i14 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d11 = d(bArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[i12];
                if (i16 < i17 && i16 < iArr2[1] && i16 < iArr2[2] && i16 < iArr2[3] && i16 < iArr2[4]) {
                    return 0;
                }
                if (i17 < i16) {
                    break;
                }
                byte b10 = bArr2[1];
                byte b11 = bArr2[2];
                byte b12 = bArr2[3];
                byte b13 = bArr2[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    break;
                }
                if (d11 == 1 && b13 > 0) {
                    return 4;
                }
                if (d11 == 1 && b11 > 0) {
                    return 2;
                }
                if (d11 == 1 && b12 > 0) {
                    return 3;
                }
                int i18 = iArr2[1];
                if (i18 + 1 < i16 && i18 + 1 < i17 && i18 + 1 < iArr2[4] && i18 + 1 < iArr2[2]) {
                    int i19 = iArr2[3];
                    if (i18 < i19) {
                        return 1;
                    }
                    if (i18 == i19) {
                        for (int i20 = i10 + i14 + 1; i20 < charSequence.length(); i20++) {
                            char charAt2 = charSequence.charAt(i20);
                            if (m(charAt2)) {
                                return 3;
                            }
                            if (!k(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            f12 = f10;
            i13 = i12;
            f11 = 2.0f;
        }
        return i12;
    }

    public static char o(char c10, int i10) {
        int i11 = c10 + ((i10 * EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE) % 253) + 1;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
