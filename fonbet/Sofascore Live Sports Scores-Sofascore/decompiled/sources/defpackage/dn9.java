package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dn9 extends waa {
    public static final int[] e = {1, 1, 1, 1};
    public static final int[] f = {3, 1, 1};
    public static final int[][] g = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    public final /* synthetic */ int d;

    public /* synthetic */ dn9(int i) {
        this.d = i;
    }

    public static void R(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
    }

    public static int S(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    public static int T(CharSequence charSequence, int i) {
        char charAt;
        int length = charSequence.length();
        if (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 == 241) {
                return 4;
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                int i2 = i + 1;
                return (i2 < length && (charAt = charSequence.charAt(i2)) >= '0' && charAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void U(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static void V(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // defpackage.waa, defpackage.gml
    public final lw1 k(String str, int i, EnumMap enumMap) {
        switch (this.d) {
            case 0:
                if (i != 9) {
                    a70.p("Can only encode ITF, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
            case 1:
                if (i != 5) {
                    a70.p("Can only encode CODE_128, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
            case 2:
                if (i != 3) {
                    a70.p("Can only encode CODE_39, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
            default:
                if (i != 4) {
                    a70.p("Can only encode CODE_93, but got ".concat(fn0.C(i)));
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x026d, code lost:
    
        if (r10 < '`') goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02a6, code lost:
    
        if (T(r1, r7 + 3) == 3) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a8, code lost:
    
        r10 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02b6, code lost:
    
        if (r12 == 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02c1, code lost:
    
        if (r12 == 3) goto L133;
     */
    @Override // defpackage.waa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean[] x(String str) {
        int i;
        int i2;
        int i3;
        char c;
        int T;
        int i4;
        String str2 = str;
        char c2 = '`';
        char c3 = ' ';
        int i5 = 9;
        int i6 = 0;
        switch (this.d) {
            case 0:
                int length = str2.length();
                if (length % 2 != 0) {
                    a70.p("The length of the input should be even");
                } else {
                    if (length <= 80) {
                        boolean[] zArr = new boolean[(length * 9) + 9];
                        int q = waa.q(zArr, 0, e, true);
                        for (int i7 = 0; i7 < length; i7 += 2) {
                            int digit = Character.digit(str2.charAt(i7), 10);
                            int digit2 = Character.digit(str2.charAt(i7 + 1), 10);
                            int[] iArr = new int[10];
                            for (int i8 = 0; i8 < 5; i8++) {
                                int i9 = i8 * 2;
                                int[][] iArr2 = g;
                                iArr[i9] = iArr2[digit][i8];
                                iArr[i9 + 1] = iArr2[digit2][i8];
                            }
                            q += waa.q(zArr, q, iArr, true);
                        }
                        waa.q(zArr, q, f, true);
                        return zArr;
                    }
                    a70.p("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                return null;
            case 1:
                int[][] iArr3 = rz2.g;
                int length2 = str2.length();
                if (length2 > 0 && length2 <= 80) {
                    for (int i10 = 0; i10 < length2; i10++) {
                        char charAt = str2.charAt(i10);
                        switch (charAt) {
                            case 241:
                            case 242:
                            case 243:
                            case 244:
                            default:
                                if (charAt > 127) {
                                    a70.p("Bad character in input: ".concat(String.valueOf(charAt)));
                                    break;
                                }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 1;
                    while (i11 < length2) {
                        int T2 = T(str2, i11);
                        int i15 = 100;
                        if (T2 != 2) {
                            i = 103;
                            if (T2 != 1) {
                                i2 = 96;
                                i3 = 99;
                                if (i13 != 99) {
                                    c = c3;
                                    if (i13 == 100) {
                                        if (T2 != 4 && (T = T(str2, i11 + 2)) != 1 && T != 2) {
                                            if (T == 4) {
                                                break;
                                            } else {
                                                int i16 = i11 + 4;
                                                while (true) {
                                                    int T3 = T(str2, i16);
                                                    if (T3 != 3) {
                                                        break;
                                                    } else {
                                                        i16 += 2;
                                                    }
                                                }
                                            }
                                        }
                                        i3 = 100;
                                    } else if (T2 == 4) {
                                        T2 = T(str2, i11 + 1);
                                        break;
                                    }
                                } else {
                                    c = c3;
                                }
                            } else {
                                if (i11 < str2.length()) {
                                    char charAt2 = str2.charAt(i11);
                                    if (charAt2 >= c3) {
                                        if (i13 == 101) {
                                            i4 = 96;
                                            break;
                                        }
                                    } else {
                                        i4 = 96;
                                    }
                                    c = c3;
                                    i2 = i4;
                                    i3 = 101;
                                }
                                i4 = 96;
                                c = c3;
                                i2 = i4;
                                i3 = 100;
                            }
                        } else {
                            c = c3;
                            i3 = 100;
                            i = 103;
                            i2 = 96;
                        }
                        if (i3 == i13) {
                            switch (str2.charAt(i11)) {
                                case 241:
                                    i15 = 102;
                                    break;
                                case 242:
                                    i15 = 97;
                                    break;
                                case 243:
                                    i15 = i2;
                                    break;
                                case 244:
                                    if (i13 == 101) {
                                        i15 = 101;
                                        break;
                                    }
                                    break;
                                default:
                                    if (i13 != 100) {
                                        if (i13 != 101) {
                                            i15 = Integer.parseInt(str2.substring(i11, i11 + 2));
                                            i11++;
                                            break;
                                        } else {
                                            char charAt3 = str2.charAt(i11);
                                            i15 = charAt3 - ' ';
                                            if (i15 < 0) {
                                                i15 = charAt3 + '@';
                                                break;
                                            }
                                        }
                                    } else {
                                        i15 = str2.charAt(i11) - ' ';
                                        break;
                                    }
                                    break;
                            }
                            i11++;
                        } else {
                            i15 = i13 == 0 ? i3 != 100 ? i3 != 101 ? 105 : i : 104 : i3;
                            i13 = i3;
                        }
                        arrayList.add(iArr3[i15]);
                        i12 += i15 * i14;
                        if (i11 != 0) {
                            i14++;
                        }
                        c3 = c;
                    }
                    arrayList.add(iArr3[i12 % 103]);
                    arrayList.add(iArr3[106]);
                    Iterator it = arrayList.iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        for (int i18 : (int[]) it.next()) {
                            i17 += i18;
                        }
                    }
                    boolean[] zArr2 = new boolean[i17];
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        i6 += waa.q(zArr2, i6, (int[]) it2.next(), true);
                    }
                    return zArr2;
                }
                a70.p("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                return null;
            case 2:
                int[] iArr4 = rz2.h;
                int length3 = str2.length();
                if (length3 <= 80) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < length3) {
                            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i19)) < 0) {
                                int length4 = str2.length();
                                StringBuilder sb = new StringBuilder();
                                int i20 = 0;
                                while (i20 < length4) {
                                    char charAt4 = str2.charAt(i20);
                                    if (charAt4 != 0) {
                                        if (charAt4 != ' ') {
                                            if (charAt4 == '@') {
                                                sb.append("%V");
                                            } else if (charAt4 == c2) {
                                                sb.append("%W");
                                            } else if (charAt4 != '-' && charAt4 != '.') {
                                                if (charAt4 <= 26) {
                                                    sb.append('$');
                                                    sb.append((char) (charAt4 + '@'));
                                                } else if (charAt4 < ' ') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 + '&'));
                                                } else if (charAt4 <= ',' || charAt4 == '/' || charAt4 == ':') {
                                                    sb.append('/');
                                                    sb.append((char) (charAt4 + ' '));
                                                } else if (charAt4 <= '9') {
                                                    sb.append(charAt4);
                                                } else if (charAt4 <= '?') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 + 11));
                                                } else if (charAt4 <= 'Z') {
                                                    sb.append(charAt4);
                                                } else if (charAt4 <= '_') {
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 - 16));
                                                } else if (charAt4 <= 'z') {
                                                    sb.append('+');
                                                    sb.append((char) (charAt4 - ' '));
                                                } else {
                                                    if (charAt4 > 127) {
                                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str2.charAt(i20) + "'");
                                                    }
                                                    sb.append('%');
                                                    sb.append((char) (charAt4 - '+'));
                                                }
                                            }
                                        }
                                        sb.append(charAt4);
                                    } else {
                                        sb.append("%U");
                                    }
                                    i20++;
                                    c2 = '`';
                                }
                                str2 = sb.toString();
                                length3 = str2.length();
                                if (length3 > 80) {
                                    a70.p(lnb.k(length3, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                                }
                            } else {
                                i19++;
                                c2 = '`';
                            }
                        }
                    }
                    int[] iArr5 = new int[9];
                    int i21 = length3 + 25;
                    for (int i22 = 0; i22 < length3; i22++) {
                        U(iArr4["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i22))], iArr5);
                        for (int i23 = 0; i23 < 9; i23++) {
                            i21 += iArr5[i23];
                        }
                    }
                    boolean[] zArr3 = new boolean[i21];
                    U(148, iArr5);
                    int q2 = waa.q(zArr3, 0, iArr5, true);
                    int[] iArr6 = {1};
                    int q3 = waa.q(zArr3, q2, iArr6, false) + q2;
                    for (int i24 = 0; i24 < length3; i24++) {
                        U(iArr4["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str2.charAt(i24))], iArr5);
                        int q4 = waa.q(zArr3, q3, iArr5, true) + q3;
                        q3 = waa.q(zArr3, q4, iArr6, false) + q4;
                    }
                    U(148, iArr5);
                    waa.q(zArr3, q3, iArr5, true);
                    return zArr3;
                }
                a70.p("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                return null;
            default:
                int[] iArr7 = rz2.i;
                int length5 = str2.length();
                if (length5 > 80) {
                    a70.p("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                    return null;
                }
                int[] iArr8 = new int[9];
                int length6 = ((str2.length() + 4) * 9) + 1;
                V(iArr7[47], iArr8);
                boolean[] zArr4 = new boolean[length6];
                R(zArr4, 0, iArr8);
                while (i6 < length5) {
                    V(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str2.charAt(i6))], iArr8);
                    R(zArr4, i5, iArr8);
                    i5 += 9;
                    i6++;
                }
                int S = S(20, str2);
                V(iArr7[S], iArr8);
                R(zArr4, i5, iArr8);
                V(iArr7[S(15, str2 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(S))], iArr8);
                R(zArr4, i5 + 9, iArr8);
                V(iArr7[47], iArr8);
                R(zArr4, i5 + 18, iArr8);
                zArr4[i5 + 27] = true;
                return zArr4;
        }
    }
}
