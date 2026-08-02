package s9;

import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h9.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import o9.C8661c;
import o9.C8663e;

/* renamed from: s9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9630c {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f98367b;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f98369d;

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f98366a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f98368c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f98370e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: s9.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f98371a;

        static {
            int[] iArr = new int[b.values().length];
            f98371a = iArr;
            try {
                iArr[b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98371a[b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98371a[b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98371a[b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98371a[b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: s9.c$b */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ANSIX12_ENCODE;
        public static final b ASCII_ENCODE;
        public static final b BASE256_ENCODE;
        public static final b C40_ENCODE;
        public static final b EDIFACT_ENCODE;
        public static final b PAD_ENCODE;
        public static final b TEXT_ENCODE;

        static {
            b bVar = new b("PAD_ENCODE", 0);
            PAD_ENCODE = bVar;
            b bVar2 = new b("ASCII_ENCODE", 1);
            ASCII_ENCODE = bVar2;
            b bVar3 = new b("C40_ENCODE", 2);
            C40_ENCODE = bVar3;
            b bVar4 = new b("TEXT_ENCODE", 3);
            TEXT_ENCODE = bVar4;
            b bVar5 = new b("ANSIX12_ENCODE", 4);
            ANSIX12_ENCODE = bVar5;
            b bVar6 = new b("EDIFACT_ENCODE", 5);
            EDIFACT_ENCODE = bVar6;
            b bVar7 = new b("BASE256_ENCODE", 6);
            BASE256_ENCODE = bVar7;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
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

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f98367b = cArr;
        f98369d = cArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x035a, code lost:
    
        if (r3.length() <= 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x035c, code lost:
    
        r2.append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x035f, code lost:
    
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x036a, code lost:
    
        if (r5.isEmpty() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x036c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0370, code lost:
    
        return new o9.C8663e(r19, r2, r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        throw h9.h.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C8663e a(byte[] bArr) throws h {
        int d11;
        char c11;
        int d12;
        int d13;
        C8661c c8661c = new C8661c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        int i11 = 0;
        StringBuilder sb3 = new StringBuilder(0);
        int i12 = 1;
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        while (true) {
            int i13 = 254;
            if (bVar == b.ASCII_ENCODE) {
                int i14 = i11;
                while (true) {
                    int d14 = c8661c.d(8);
                    if (d14 == 0) {
                        throw h.a();
                    }
                    if (d14 <= 128) {
                        if (i14 != 0) {
                            d14 += UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        sb2.append((char) (d14 - i12));
                        bVar = b.ASCII_ENCODE;
                    } else if (d14 == 129) {
                        bVar = b.PAD_ENCODE;
                    } else {
                        if (d14 > 229) {
                            switch (d14) {
                                case 230:
                                    bVar = b.C40_ENCODE;
                                    break;
                                case 231:
                                    bVar = b.BASE256_ENCODE;
                                    break;
                                case 232:
                                    sb2.append((char) 29);
                                    break;
                                case 233:
                                case 234:
                                case 241:
                                    break;
                                case 235:
                                    i14 = i12;
                                    break;
                                case 236:
                                    sb2.append("[)>\u001e05\u001d");
                                    sb3.insert(i11, "\u001e\u0004");
                                    break;
                                case 237:
                                    sb2.append("[)>\u001e06\u001d");
                                    sb3.insert(i11, "\u001e\u0004");
                                    break;
                                case 238:
                                    bVar = b.ANSIX12_ENCODE;
                                    break;
                                case 239:
                                    bVar = b.TEXT_ENCODE;
                                    break;
                                case 240:
                                    bVar = b.EDIFACT_ENCODE;
                                    break;
                                default:
                                    if (d14 != 254 || c8661c.a() != 0) {
                                    }
                                    break;
                            }
                        } else {
                            int i15 = d14 - 130;
                            if (i15 < 10) {
                                sb2.append('0');
                            }
                            sb2.append(i15);
                        }
                        if (c8661c.a() <= 0) {
                            bVar = b.ASCII_ENCODE;
                        }
                    }
                }
            } else {
                int i16 = a.f98371a[bVar.ordinal()];
                if (i16 != i12) {
                    int i17 = 32;
                    if (i16 == 2) {
                        int[] iArr = new int[3];
                        int i18 = 0;
                        int i19 = 0;
                        for (int i21 = 8; c8661c.a() != i21 && (d12 = c8661c.d(i21)) != i13; i21 = 8) {
                            b(d12, c8661c.d(i21), iArr);
                            int i22 = i19;
                            int i23 = 0;
                            while (i23 < 3) {
                                int i24 = iArr[i23];
                                if (i22 != 0) {
                                    if (i22 != i12) {
                                        if (i22 == 2) {
                                            if (i24 < 27) {
                                                char c12 = f98369d[i24];
                                                if (i18 != 0) {
                                                    sb2.append((char) (c12 + 128));
                                                    i18 = 0;
                                                } else {
                                                    sb2.append(c12);
                                                }
                                            } else if (i24 == 27) {
                                                sb2.append((char) 29);
                                            } else {
                                                if (i24 != 30) {
                                                    throw h.a();
                                                }
                                                i18 = i12;
                                            }
                                            i22 = 0;
                                        } else {
                                            if (i22 != 3) {
                                                throw h.a();
                                            }
                                            if (i24 >= i17) {
                                                throw h.a();
                                            }
                                            char c13 = f98370e[i24];
                                            if (i18 != 0) {
                                                sb2.append((char) (c13 + 128));
                                                i18 = 0;
                                                i22 = 0;
                                            } else {
                                                sb2.append(c13);
                                                i22 = 0;
                                            }
                                        }
                                    } else if (i18 != 0) {
                                        sb2.append((char) (i24 + UserVerificationMethods.USER_VERIFY_PATTERN));
                                        i18 = 0;
                                        i22 = 0;
                                    } else {
                                        sb2.append((char) i24);
                                        i22 = 0;
                                    }
                                } else if (i24 < 3) {
                                    i22 = i24 + 1;
                                } else {
                                    if (i24 >= 40) {
                                        throw h.a();
                                    }
                                    char c14 = f98368c[i24];
                                    if (i18 != 0) {
                                        sb2.append((char) (c14 + 128));
                                        i18 = 0;
                                    } else {
                                        sb2.append(c14);
                                    }
                                }
                                i23++;
                                i17 = 32;
                            }
                            if (c8661c.a() > 0) {
                                i19 = i22;
                                i17 = 32;
                                i13 = 254;
                            }
                        }
                    } else if (i16 == 3) {
                        int[] iArr2 = new int[3];
                        while (c8661c.a() != 8 && (d13 = c8661c.d(8)) != 254) {
                            b(d13, c8661c.d(8), iArr2);
                            for (int i25 = 0; i25 < 3; i25++) {
                                int i26 = iArr2[i25];
                                if (i26 == 0) {
                                    sb2.append('\r');
                                } else if (i26 == i12) {
                                    sb2.append('*');
                                } else if (i26 == 2) {
                                    sb2.append('>');
                                } else if (i26 == 3) {
                                    sb2.append(' ');
                                } else if (i26 < 14) {
                                    sb2.append((char) (i26 + 44));
                                } else {
                                    if (i26 >= 40) {
                                        throw h.a();
                                    }
                                    sb2.append((char) (i26 + 51));
                                }
                            }
                            if (c8661c.a() <= 0) {
                            }
                        }
                    } else if (i16 == 4) {
                        while (true) {
                            if (c8661c.a() > 16) {
                                int i27 = 0;
                                while (true) {
                                    if (i27 < 4) {
                                        int d15 = c8661c.d(6);
                                        if (d15 == 31) {
                                            int b11 = 8 - c8661c.b();
                                            if (b11 != 8) {
                                                c8661c.d(b11);
                                            }
                                        } else {
                                            if ((d15 & 32) == 0) {
                                                d15 |= 64;
                                            }
                                            sb2.append((char) d15);
                                            i27++;
                                        }
                                    } else if (c8661c.a() <= 0) {
                                    }
                                }
                            }
                        }
                    } else {
                        if (i16 != 5) {
                            throw h.a();
                        }
                        int c15 = c8661c.c();
                        int i28 = c15 + 2;
                        int c16 = c(c8661c.d(8), c15 + 1);
                        if (c16 == 0) {
                            c16 = c8661c.a() / 8;
                        } else if (c16 >= 250) {
                            c16 = ((c16 - 249) * m.e.DEFAULT_SWIPE_ANIMATION_DURATION) + c(c8661c.d(8), i28);
                            i28 = c15 + 3;
                        }
                        if (c16 < 0) {
                            throw h.a();
                        }
                        byte[] bArr2 = new byte[c16];
                        int i29 = 0;
                        while (i29 < c16) {
                            if (c8661c.a() < 8) {
                                throw h.a();
                            }
                            bArr2[i29] = (byte) c(c8661c.d(8), i28);
                            i29++;
                            i28++;
                        }
                        arrayList.add(bArr2);
                        try {
                            sb2.append(new String(bArr2, "ISO8859_1"));
                        } catch (UnsupportedEncodingException e11) {
                            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e11)));
                        }
                    }
                } else {
                    int[] iArr3 = new int[3];
                    int i31 = 0;
                    int i32 = 0;
                    while (c8661c.a() != 8 && (d11 = c8661c.d(8)) != 254) {
                        b(d11, c8661c.d(8), iArr3);
                        int i33 = 0;
                        while (i33 < 3) {
                            int i34 = iArr3[i33];
                            if (i32 != 0) {
                                if (i32 == i12) {
                                    c11 = 29;
                                    if (i31 != 0) {
                                        sb2.append((char) (i34 + UserVerificationMethods.USER_VERIFY_PATTERN));
                                        i31 = 0;
                                    } else {
                                        sb2.append((char) i34);
                                    }
                                } else if (i32 == 2) {
                                    if (i34 < 27) {
                                        char c17 = f98367b[i34];
                                        if (i31 != 0) {
                                            sb2.append((char) (c17 + 128));
                                            i31 = 0;
                                        } else {
                                            sb2.append(c17);
                                        }
                                    } else if (i34 == 27) {
                                        c11 = 29;
                                        sb2.append((char) 29);
                                    } else {
                                        if (i34 != 30) {
                                            throw h.a();
                                        }
                                        i31 = i12;
                                    }
                                    c11 = 29;
                                } else {
                                    if (i32 != 3) {
                                        throw h.a();
                                    }
                                    if (i31 != 0) {
                                        sb2.append((char) (i34 + 224));
                                        i31 = 0;
                                    } else {
                                        sb2.append((char) (i34 + 96));
                                    }
                                    i32 = 0;
                                }
                                i32 = 0;
                            } else if (i34 < 3) {
                                i32 = i34 + 1;
                            } else {
                                if (i34 >= 40) {
                                    throw h.a();
                                }
                                char c18 = f98366a[i34];
                                if (i31 != 0) {
                                    sb2.append((char) (c18 + 128));
                                    i31 = 0;
                                } else {
                                    sb2.append(c18);
                                }
                            }
                            i33++;
                            i12 = 1;
                        }
                        if (c8661c.a() > 0) {
                            i12 = 1;
                        }
                    }
                }
                bVar = b.ASCII_ENCODE;
            }
            if (bVar != b.PAD_ENCODE && c8661c.a() > 0) {
                i11 = 0;
                i12 = 1;
            }
        }
    }

    private static void b(int i11, int i12, int[] iArr) {
        int i13 = ((i11 << 8) + i12) - 1;
        int i14 = i13 / 1600;
        iArr[0] = i14;
        int i15 = i13 - (i14 * 1600);
        int i16 = i15 / 40;
        iArr[1] = i16;
        iArr[2] = i15 - (i16 * 40);
    }

    private static int c(int i11, int i12) {
        int i13 = i11 - (((i12 * 149) % 255) + 1);
        return i13 >= 0 ? i13 : i13 + 256;
    }
}
