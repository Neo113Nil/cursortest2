package j9;

import h9.h;
import i9.C7022a;
import java.util.Arrays;
import o9.C8660b;
import o9.C8663e;
import q9.C8999a;
import q9.c;
import q9.e;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7309a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f69513b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f69514c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f69515d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f69516e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ProductContainerDTO.RATIO_DELIMITER, ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f69517f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    private C7022a f69518a;

    /* renamed from: j9.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1132a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69519a;

        static {
            int[] iArr = new int[b.values().length];
            f69519a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69519a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69519a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69519a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69519a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: j9.a$b */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BINARY;
        public static final b DIGIT;
        public static final b LOWER;
        public static final b MIXED;
        public static final b PUNCT;
        public static final b UPPER;

        static {
            b bVar = new b("UPPER", 0);
            UPPER = bVar;
            b bVar2 = new b("LOWER", 1);
            LOWER = bVar2;
            b bVar3 = new b("MIXED", 2);
            MIXED = bVar3;
            b bVar4 = new b("DIGIT", 3);
            DIGIT = bVar4;
            b bVar5 = new b("PUNCT", 4);
            PUNCT = bVar5;
            b bVar6 = new b("BINARY", 5);
            BINARY = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    private static int b(boolean[] zArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            i13 <<= 1;
            if (zArr[i14]) {
                i13 |= 1;
            }
        }
        return i13;
    }

    public final C8663e a(C7022a c7022a) throws h {
        int i11;
        C8999a c8999a;
        String str;
        this.f69518a = c7022a;
        C8660b a11 = c7022a.a();
        boolean e11 = this.f69518a.e();
        int d11 = this.f69518a.d();
        int i12 = (e11 ? 11 : 14) + (d11 << 2);
        int[] iArr = new int[i12];
        int i13 = ((e11 ? 88 : 112) + (d11 << 4)) * d11;
        boolean[] zArr = new boolean[i13];
        int i14 = 2;
        int i15 = 1;
        if (e11) {
            for (int i16 = 0; i16 < i12; i16++) {
                iArr[i16] = i16;
            }
        } else {
            int i17 = i12 / 2;
            int i18 = ((((i17 - 1) / 15) * 2) + (i12 + 1)) / 2;
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[(i17 - i19) - 1] = (i18 - r15) - 1;
                iArr[i17 + i19] = (i19 / 15) + i19 + i18 + 1;
            }
        }
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i21 >= d11) {
                break;
            }
            int i23 = ((d11 - i21) << i14) + (e11 ? 9 : 12);
            int i24 = i21 << 1;
            int i25 = (i12 - 1) - i24;
            int i26 = 0;
            while (i26 < i23) {
                int i27 = i26 << 1;
                int i28 = 0;
                while (i28 < i14) {
                    int i29 = i24 + i28;
                    int i31 = i15;
                    int i32 = i24 + i26;
                    zArr[i22 + i27 + i28] = a11.d(iArr[i29], iArr[i32]);
                    int i33 = i25 - i28;
                    zArr[(i23 * 2) + i22 + i27 + i28] = a11.d(iArr[i32], iArr[i33]);
                    int i34 = i25 - i26;
                    zArr[(i23 * 4) + i22 + i27 + i28] = a11.d(iArr[i33], iArr[i34]);
                    zArr[(i23 * 6) + i22 + i27 + i28] = a11.d(iArr[i34], iArr[i29]);
                    i28++;
                    i15 = i31;
                    e11 = e11;
                    i14 = 2;
                }
                i26++;
                i14 = 2;
            }
            i22 += i23 << 3;
            i21++;
            e11 = e11;
            i14 = 2;
        }
        int i35 = i15;
        int i36 = 8;
        if (this.f69518a.d() <= 2) {
            c8999a = C8999a.f81743j;
            i11 = 6;
        } else if (this.f69518a.d() <= 8) {
            c8999a = C8999a.f81747n;
            i11 = 8;
        } else if (this.f69518a.d() <= 22) {
            c8999a = C8999a.f81742i;
            i11 = 10;
        } else {
            c8999a = C8999a.f81741h;
        }
        int c11 = this.f69518a.c();
        int i37 = i13 / i11;
        if (i37 < c11) {
            throw h.a();
        }
        int i38 = i13 % i11;
        int[] iArr2 = new int[i37];
        int i39 = 0;
        while (i39 < i37) {
            iArr2[i39] = b(zArr, i38, i11);
            i39++;
            i38 += i11;
        }
        try {
            new c(c8999a).a(iArr2, i37 - c11);
            int i41 = i35 << i11;
            int i42 = i41 - 1;
            int i43 = 0;
            int i44 = 0;
            while (i43 < c11) {
                int i45 = iArr2[i43];
                if (i45 == 0 || i45 == i42) {
                    throw h.a();
                }
                if (i45 == i35 || i45 == i41 - 2) {
                    i44++;
                }
                i43++;
                i35 = 1;
            }
            int i46 = (c11 * i11) - i44;
            boolean[] zArr2 = new boolean[i46];
            int i47 = 0;
            for (int i48 = 0; i48 < c11; i48++) {
                int i49 = iArr2[i48];
                int i51 = 1;
                if (i49 == 1 || i49 == i41 - 2) {
                    Arrays.fill(zArr2, i47, (i47 + i11) - 1, i49 > 1);
                    i47 = (i11 - 1) + i47;
                } else {
                    int i52 = i11 - 1;
                    while (i52 >= 0) {
                        int i53 = i47 + 1;
                        zArr2[i47] = (i49 & (i51 << i52)) != 0;
                        i52--;
                        i47 = i53;
                        i51 = 1;
                    }
                }
            }
            int i54 = (i46 + 7) / 8;
            byte[] bArr = new byte[i54];
            for (int i55 = 0; i55 < i54; i55++) {
                int i56 = i55 << 3;
                int i57 = i46 - i56;
                bArr[i55] = (byte) (i57 >= 8 ? b(zArr2, i56, 8) : b(zArr2, i56, i57) << (8 - i57));
            }
            b bVar = b.UPPER;
            StringBuilder sb2 = new StringBuilder(20);
            b bVar2 = bVar;
            int i58 = 0;
            while (i58 < i46) {
                b bVar3 = b.BINARY;
                if (bVar != bVar3) {
                    b bVar4 = b.DIGIT;
                    int i59 = bVar == bVar4 ? 4 : 5;
                    if (i46 - i58 < i59) {
                        break;
                    }
                    int b11 = b(zArr2, i58, i59);
                    i58 += i59;
                    int i61 = C1132a.f69519a[bVar.ordinal()];
                    if (i61 == 1) {
                        str = f69513b[b11];
                    } else if (i61 == 2) {
                        str = f69514c[b11];
                    } else if (i61 == 3) {
                        str = f69515d[b11];
                    } else if (i61 == 4) {
                        str = f69516e[b11];
                    } else {
                        if (i61 != 5) {
                            throw new IllegalStateException("Bad table");
                        }
                        str = f69517f[b11];
                    }
                    if (str.startsWith("CTRL_")) {
                        char charAt = str.charAt(5);
                        bVar2 = charAt != 'B' ? charAt != 'D' ? charAt != 'P' ? charAt != 'L' ? charAt != 'M' ? b.UPPER : b.MIXED : b.LOWER : b.PUNCT : bVar4 : bVar3;
                        if (str.charAt(6) != 'L') {
                            b bVar5 = bVar2;
                            bVar2 = bVar;
                            bVar = bVar5;
                            i36 = 8;
                        }
                    } else {
                        sb2.append(str);
                    }
                    bVar = bVar2;
                    i36 = 8;
                } else {
                    if (i46 - i58 < 5) {
                        break;
                    }
                    int b12 = b(zArr2, i58, 5);
                    int i62 = i58 + 5;
                    if (b12 == 0) {
                        if (i46 - i62 < 11) {
                            break;
                        }
                        b12 = b(zArr2, i62, 11) + 31;
                        i62 = i58 + 16;
                    }
                    int i63 = 0;
                    while (true) {
                        if (i63 >= b12) {
                            i58 = i62;
                            break;
                        }
                        if (i46 - i62 < i36) {
                            i58 = i46;
                            break;
                        }
                        sb2.append((char) b(zArr2, i62, i36));
                        i62 += 8;
                        i63++;
                    }
                    bVar = bVar2;
                }
            }
            return new C8663e(bArr, sb2.toString(), null, null);
        } catch (e e12) {
            throw h.b(e12);
        }
    }
}
