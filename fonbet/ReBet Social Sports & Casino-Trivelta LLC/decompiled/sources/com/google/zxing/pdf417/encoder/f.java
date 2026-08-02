package com.google.zxing.pdf417.encoder;

import com.google.zxing.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* loaded from: classes3.dex */
public abstract class f {
    private static final byte[] MIXED;
    private static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] PUNCTUATION = new byte[128];

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f38446a = StandardCharsets.ISO_8859_1;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        MIXED = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                MIXED[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                PUNCTUATION[b11] = (byte) i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, int i10, Charset charset) {
        int i11;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i12 = i10;
        while (i12 < length) {
            char charAt = str.charAt(i12);
            int i13 = 0;
            while (i13 < 13 && k(charAt) && (i11 = i12 + (i13 = i13 + 1)) < length) {
                charAt = str.charAt(i11);
            }
            char charAt2 = str.charAt(i12);
            if (!newEncoder.canEncode(charAt2)) {
                throw new h("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
            i12++;
        }
        return i12 - i10;
    }

    public static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char charAt = charSequence.charAt(i10);
            while (k(charAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    charAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
            if (i12 <= 0) {
                if (!n(charSequence.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return i11 - i10;
    }

    public static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + (bArr[i13 + i14] & UByte.MAX_VALUE);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & UByte.MAX_VALUE));
            i13++;
        }
    }

    public static String e(String str, c cVar, Charset charset) {
        Lb.c a10;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f38446a;
        } else if (!f38446a.equals(charset) && (a10 = Lb.c.a(charset.name())) != null) {
            h(a10.b(), sb2);
        }
        int length = str.length();
        int i10 = a.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[cVar.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int b10 = b(str, i11);
                if (b10 >= 13) {
                    sb2.append((char) 902);
                    f(str, i11, b10, sb2);
                    i11 += b10;
                    i12 = 0;
                    i13 = 2;
                } else {
                    int c10 = c(str, i11);
                    if (c10 >= 5 || b10 == length) {
                        if (i13 != 0) {
                            sb2.append((char) 900);
                            i12 = 0;
                            i13 = 0;
                        }
                        i12 = g(str, i11, c10, sb2, i12);
                        i11 += c10;
                    } else {
                        int a11 = a(str, i11, charset);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int i14 = a11 + i11;
                        byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            d(bytes2, 0, 1, 0, sb2);
                        } else {
                            d(bytes2, 0, bytes2.length, i13, sb2);
                            i13 = 1;
                            i12 = 0;
                        }
                        i11 = i14;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    public static void f(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[EDGE_INSN: B:21:0x00f4->B:22:0x00f4 BREAK  A[LOOP:0: B:2:0x000f->B:16:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(CharSequence charSequence, int i10, int i11, StringBuilder sb2, int i12) {
        StringBuilder sb3 = new StringBuilder(i11);
        int i13 = i12;
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            char charAt = charSequence.charAt(i15);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (m(charAt)) {
                            sb3.append((char) PUNCTUATION[charAt]);
                        } else {
                            sb3.append((char) 29);
                            i13 = 0;
                        }
                    } else if (l(charAt)) {
                        sb3.append((char) MIXED[charAt]);
                    } else if (j(charAt)) {
                        sb3.append((char) 28);
                        i13 = 0;
                    } else if (i(charAt)) {
                        sb3.append((char) 27);
                        i13 = 1;
                    } else {
                        int i16 = i15 + 1;
                        if (i16 >= i11 || !m(charSequence.charAt(i16))) {
                            sb3.append((char) 29);
                            sb3.append((char) PUNCTUATION[charAt]);
                        } else {
                            sb3.append((char) 25);
                            i13 = 3;
                        }
                    }
                } else if (i(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'a'));
                    }
                } else if (j(charAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (charAt - 'A'));
                } else if (l(charAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) PUNCTUATION[charAt]);
                }
                i14++;
                if (i14 < i11) {
                    break;
                }
            } else {
                if (j(charAt)) {
                    if (charAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt - 'A'));
                    }
                } else if (i(charAt)) {
                    sb3.append((char) 27);
                    i13 = 1;
                } else if (l(charAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) PUNCTUATION[charAt]);
                }
                i14++;
                if (i14 < i11) {
                }
            }
        }
        int length = sb3.length();
        char c10 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 % 2 != 0) {
                c10 = (char) ((c10 * 30) + sb3.charAt(i17));
                sb2.append(c10);
            } else {
                c10 = sb3.charAt(i17);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c10 * 30) + 29));
        }
        return i13;
    }

    public static void h(int i10, StringBuilder sb2) {
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i10);
        } else if (i10 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i10 / 900) - 1));
            sb2.append((char) (i10 % 900));
        } else {
            if (i10 >= 811800) {
                throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
            }
            sb2.append((char) 925);
            sb2.append((char) (810900 - i10));
        }
    }

    public static boolean i(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean l(char c10) {
        return MIXED[c10] != -1;
    }

    public static boolean m(char c10) {
        return PUNCTUATION[c10] != -1;
    }

    public static boolean n(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }
}
