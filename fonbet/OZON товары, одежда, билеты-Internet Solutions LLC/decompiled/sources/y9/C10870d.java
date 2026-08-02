package y9;

import h9.EnumC6876a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: y9.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10870d extends s {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: y9.d$a */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FNC_1;
        public static final a ONE_DIGIT;
        public static final a TWO_DIGITS;
        public static final a UNCODABLE;

        static {
            a aVar = new a("UNCODABLE", 0);
            UNCODABLE = aVar;
            a aVar2 = new a("ONE_DIGIT", 1);
            ONE_DIGIT = aVar2;
            a aVar3 = new a("TWO_DIGITS", 2);
            TWO_DIGITS = aVar3;
            a aVar4 = new a("FNC_1", 3);
            FNC_1 = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private static a g(int i11, String str) {
        int length = str.length();
        if (i11 >= length) {
            return a.UNCODABLE;
        }
        char charAt = str.charAt(i11);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i12 = i11 + 1;
        if (i12 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = str.charAt(i12);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ce, code lost:
    
        if (r11 == y9.C10870d.a.TWO_DIGITS) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ab, code lost:
    
        if (g(r5 + 3, r19) == y9.C10870d.a.TWO_DIGITS) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ad, code lost:
    
        r13 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00bf, code lost:
    
        if (r11 == y9.C10870d.a.ONE_DIGIT) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    @Override // y9.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean[] d(String str) {
        int i11;
        int i12;
        a g10;
        char charAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i13 = 0; i13 < length; i13++) {
            char charAt2 = str.charAt(i13);
            switch (charAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt2)));
                    }
                    break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[][] iArr = C10869c.f106317a;
            if (i15 >= length) {
                arrayList.add(iArr[i16 % 103]);
                arrayList.add(iArr[106]);
                Iterator it = arrayList.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    for (int i19 : (int[]) it.next()) {
                        i18 += i19;
                    }
                }
                boolean[] zArr = new boolean[i18];
                Iterator it2 = arrayList.iterator();
                int i21 = 0;
                while (it2.hasNext()) {
                    i21 += s.b(zArr, i21, (int[]) it2.next(), true);
                }
                return zArr;
            }
            a g11 = g(i15, str);
            a aVar = a.ONE_DIGIT;
            int i22 = 96;
            if (g11 != aVar) {
                i11 = 103;
                a aVar2 = a.UNCODABLE;
                if (g11 == aVar2) {
                    i12 = (i15 >= str.length() || ((charAt = str.charAt(i15)) >= ' ' && (i17 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
                } else if (i17 != 101 || g11 != a.FNC_1) {
                    i12 = 99;
                    if (i17 != 99) {
                        if (i17 == 100) {
                            a aVar3 = a.FNC_1;
                            if (g11 != aVar3 && (g10 = g(i15 + 2, str)) != aVar2 && g10 != aVar) {
                                if (g10 != aVar3) {
                                    int i23 = i15 + 4;
                                    while (true) {
                                        a g12 = g(i23, str);
                                        if (g12 == a.TWO_DIGITS) {
                                            i23 += 2;
                                        }
                                    }
                                }
                            }
                        } else if (g11 == a.FNC_1) {
                            g11 = g(i15 + 1, str);
                        }
                    }
                }
                if (i12 == i17) {
                }
                arrayList.add(iArr[i22]);
                i16 += i22 * i14;
                if (i15 != 0) {
                }
            } else if (i17 == 101) {
                i11 = 103;
                if (i12 == i17) {
                    switch (str.charAt(i15)) {
                        case 241:
                            i22 = 102;
                            break;
                        case 242:
                            i22 = 97;
                            break;
                        case 243:
                            break;
                        case 244:
                            if (i17 == 101) {
                                i22 = 101;
                                break;
                            } else {
                                i22 = 100;
                                break;
                            }
                        default:
                            if (i17 != 100) {
                                if (i17 != 101) {
                                    i22 = Integer.parseInt(str.substring(i15, i15 + 2));
                                    i15++;
                                    break;
                                } else {
                                    char charAt3 = str.charAt(i15);
                                    i22 = charAt3 - ' ';
                                    if (i22 < 0) {
                                        i22 = charAt3 + '@';
                                        break;
                                    }
                                }
                            } else {
                                i22 = str.charAt(i15) - ' ';
                                break;
                            }
                            break;
                    }
                    i15++;
                } else {
                    i22 = i17 == 0 ? i12 != 100 ? i12 != 101 ? 105 : i11 : 104 : i12;
                    i17 = i12;
                }
                arrayList.add(iArr[i22]);
                i16 += i22 * i14;
                if (i15 != 0) {
                    i14++;
                }
            } else {
                i12 = 100;
                i11 = 103;
                if (i12 == i17) {
                }
                arrayList.add(iArr[i22]);
                i16 += i22 * i14;
                if (i15 != 0) {
                }
            }
        }
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.CODE_128);
    }
}
