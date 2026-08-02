package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class e7n implements Closeable {
    public final Reader a;
    public long i;
    public int j;
    public String k;
    public int[] l;
    public String[] n;
    public int[] o;
    public int b = 2;
    public final char[] c = new char[1024];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int m = 1;

    static {
        vbp.a = new c7n();
    }

    public e7n(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    public final boolean B0(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m();
        return false;
    }

    public final void C(String str) {
        String Y0 = Y0();
        throw new g7n(wt3.m(str, Y0, new StringBuilder(str.length() + Y0.length() + 79), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void E0() {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = X0();
            }
            switch (i2) {
                case 1:
                    i(3);
                    i++;
                    this.h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.n[this.m - 1] = null;
                        i = 0;
                    }
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 3:
                    i(1);
                    i++;
                    this.h = 0;
                    break;
                case 4:
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    a1('\'');
                    this.h = 0;
                    break;
                case 9:
                    a1('\"');
                    this.h = 0;
                    break;
                case 10:
                    h();
                    this.h = 0;
                    break;
                case 12:
                    a1('\'');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i = 0;
                    }
                    this.h = 0;
                    break;
                case 13:
                    a1('\"');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i = 0;
                    }
                    this.h = 0;
                    break;
                case 14:
                    h();
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i = 0;
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.d += this.j;
                    this.h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final IllegalStateException H(String str) {
        int Q0 = Q0();
        String T = b0a.T(Q0());
        String Y0 = Y0();
        int d = mz1.d(str.length() + 18, Y0.length(), T);
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(Q0 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + d + 5);
        bf3.v(sb, "Expected ", str, " but was ", T);
        return new IllegalStateException(wt3.m(Y0, "\nSee ", sb, concat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.append(r7, r3, r4);
        r11.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H0(char c) {
        StringBuilder sb = null;
        do {
            int i = this.d;
            int i2 = this.e;
            int i3 = i;
            while (true) {
                char[] cArr = this.c;
                if (i >= i2) {
                    break;
                }
                int i4 = i + 1;
                char c2 = cArr[i];
                if (this.b == 3 && c2 < ' ') {
                    C("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    throw null;
                }
                if (c2 == c) {
                    int i5 = (i4 - i3) - 1;
                    this.d = i4;
                    if (sb == null) {
                        return new String(cArr, i3, i5);
                    }
                    sb.append(cArr, i3, i5);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    int i6 = i4 - i3;
                    int i7 = i6 - 1;
                    this.d = i4;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i6 + i6, 16));
                    }
                    sb.append(cArr, i3, i7);
                    sb.append(t());
                    i3 = this.d;
                    i2 = this.e;
                    i = i3;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i4;
                    }
                    i = i4;
                }
            }
        } while (j(1));
        C("Unterminated string");
        throw null;
    }

    public String I0() {
        return p(false);
    }

    public void M() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i != 4) {
            throw H("END_ARRAY");
        }
        int i2 = this.m;
        this.m = i2 - 1;
        int[] iArr = this.o;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public String P0() {
        return p(true);
    }

    public int Q0() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public void T() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i != 1) {
            throw H("BEGIN_OBJECT");
        }
        i(3);
        this.h = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0225, code lost:
    
        if (B0(r3) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a7, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0229, code lost:
    
        if (r6 != 2) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022b, code lost:
    
        if (r17 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0231, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0233, code lost:
    
        if (r26 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x023d, code lost:
    
        if (r12 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x023f, code lost:
    
        if (r5 != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0245, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0246, code lost:
    
        r27.i = r12;
        r27.d += r2;
        r5 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024f, code lost:
    
        r27.h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0242, code lost:
    
        if (r5 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0239, code lost:
    
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0236, code lost:
    
        r4 = 2;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0252, code lost:
    
        if (r6 == r4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0255, code lost:
    
        if (r6 == 4) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0258, code lost:
    
        if (r6 != 7) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x025a, code lost:
    
        r27.j = r2;
        r5 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int X0() {
        int i;
        int k;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        boolean z;
        int i4;
        int[] iArr = this.l;
        int i5 = this.m - 1;
        int i6 = iArr[i5];
        char[] cArr = this.c;
        int i7 = 3;
        int i8 = 4;
        boolean z2 = true;
        if (i6 != 1) {
            if (i6 == 2) {
                int k2 = k(true);
                if (k2 != 44) {
                    if (k2 != 59) {
                        if (k2 != 93) {
                            C("Unterminated array");
                            throw null;
                        }
                        i7 = i8;
                    } else {
                        m();
                    }
                }
            } else {
                if (i6 == 3) {
                    i = 4;
                } else if (i6 == 5) {
                    i = 4;
                } else if (i6 == 4) {
                    iArr[i5] = 5;
                    int k3 = k(true);
                    if (k3 != 58) {
                        if (k3 != 61) {
                            C("Expected ':'");
                            throw null;
                        }
                        m();
                        if (this.d < this.e || j(1)) {
                            int i9 = this.d;
                            if (cArr[i9] == '>') {
                                this.d = i9 + 1;
                            }
                        }
                    }
                } else if (i6 == 6) {
                    if (this.b == 1) {
                        k(true);
                        int i10 = this.d;
                        this.d = i10 - 1;
                        if (i10 + 4 <= this.e || j(5)) {
                            int i11 = this.d;
                            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                                this.d = i11 + 5;
                            }
                        }
                    }
                    this.l[this.m - 1] = 7;
                } else if (i6 == 7) {
                    if (k(false) == -1) {
                        i7 = 17;
                    } else {
                        m();
                        this.d--;
                    }
                } else if (i6 == 8) {
                    a70.r("JsonReader is closed");
                    return 0;
                }
                i8 = 2;
                iArr[i5] = i;
                if (i6 == 5 && (k = k(true)) != 44) {
                    if (k != 59) {
                        if (k != 125) {
                            C("Unterminated object");
                            throw null;
                        }
                        i7 = i8;
                    } else {
                        m();
                    }
                }
                int k4 = k(true);
                if (k4 == 34) {
                    i7 = 13;
                } else {
                    if (k4 == 39) {
                        m();
                        this.h = 12;
                        return 12;
                    }
                    if (k4 != 125) {
                        m();
                        this.d--;
                        if (!B0((char) k4)) {
                            C("Expected name");
                            throw null;
                        }
                        i7 = 14;
                    } else {
                        if (i6 == 5) {
                            C("Expected name");
                            throw null;
                        }
                        i7 = i8;
                    }
                }
            }
            this.h = i7;
            return i7;
        }
        iArr[i5] = 2;
        int k5 = k(true);
        if (k5 != 34) {
            if (k5 == 39) {
                m();
                this.h = 8;
                return 8;
            }
            if (k5 != 44 && k5 != 59) {
                if (k5 != 91) {
                    if (k5 != 93) {
                        if (k5 != 123) {
                            int i12 = this.d - 1;
                            this.d = i12;
                            char c2 = cArr[i12];
                            if (c2 == 't' || c2 == 'T') {
                                str = "TRUE";
                                str2 = "true";
                                i2 = 5;
                            } else if (c2 == 'f' || c2 == 'F') {
                                str = "FALSE";
                                str2 = "false";
                                i2 = 6;
                            } else {
                                if (c2 == 'n' || c2 == 'N') {
                                    str = "NULL";
                                    str2 = "null";
                                    i2 = 7;
                                }
                                i3 = 0;
                                if (i3 == 0) {
                                    return i3;
                                }
                                int i13 = this.d;
                                int i14 = this.e;
                                boolean z3 = true;
                                int i15 = 0;
                                char c3 = 0;
                                boolean z4 = false;
                                long j = 0;
                                while (true) {
                                    if (i13 + i15 == i14) {
                                        if (i15 == 1024) {
                                            break;
                                        }
                                        if (!j(i15 + 1)) {
                                            boolean z5 = z4;
                                            break;
                                        }
                                        i13 = this.d;
                                        i14 = this.e;
                                    }
                                    char c4 = cArr[i13 + i15];
                                    if (c4 == '+') {
                                        z = z4;
                                        if (c3 != 5) {
                                            break;
                                        }
                                        c3 = 6;
                                        z4 = z;
                                    } else {
                                        if (c4 != 'E' && c4 != 'e') {
                                            if (c4 == '-') {
                                                z = z4;
                                                if (c3 == 0) {
                                                    c3 = 1;
                                                    z4 = true;
                                                } else {
                                                    if (c3 != 5) {
                                                        break;
                                                    }
                                                    c3 = 6;
                                                    z4 = z;
                                                }
                                            } else if (c4 == '.') {
                                                z = z4;
                                                if (c3 != 2) {
                                                    break;
                                                }
                                                c3 = 3;
                                                z4 = z;
                                            } else {
                                                if (c4 < '0' || c4 > '9') {
                                                    break;
                                                }
                                                if (c3 == 1 || c3 == 0) {
                                                    j = -(c4 - '0');
                                                    z4 = z4;
                                                    c3 = 2;
                                                } else {
                                                    if (c3 != 2) {
                                                        z = z4;
                                                        if (c3 == 3) {
                                                            z4 = z;
                                                            c3 = 4;
                                                        } else if (c3 == 5 || c3 == 6) {
                                                            z4 = z;
                                                            c3 = 7;
                                                        }
                                                    } else {
                                                        if (j == 0) {
                                                            break;
                                                        }
                                                        z = z4;
                                                        long j2 = (10 * j) - (c4 - '0');
                                                        z3 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                        j = j2;
                                                    }
                                                    z4 = z;
                                                }
                                            }
                                            if (i4 == 0) {
                                                return i4;
                                            }
                                            if (!B0(cArr[this.d])) {
                                                C("Expected value");
                                                throw null;
                                            }
                                            m();
                                            this.h = 10;
                                            return 10;
                                        }
                                        z = z4;
                                        if (c3 != 2 && c3 != 4) {
                                            break;
                                        }
                                        c3 = 5;
                                        z4 = z;
                                    }
                                    i15++;
                                }
                                i4 = 0;
                                if (i4 == 0) {
                                }
                            }
                            int i16 = this.b;
                            int i17 = 0;
                            while (true) {
                                int length = str2.length();
                                int i18 = this.d;
                                int i19 = this.e;
                                if (i17 < length) {
                                    if ((i18 + i17 >= i19 && !j(i17 + 1)) || ((c = cArr[this.d + i17]) != str2.charAt(i17) && (i16 == 3 || c != str.charAt(i17)))) {
                                        break;
                                    }
                                    i17++;
                                } else if ((i18 + length >= i19 && !j(length + 1)) || !B0(cArr[this.d + length])) {
                                    this.d += length;
                                    this.h = i2;
                                    i3 = i2;
                                }
                            }
                            if (i3 == 0) {
                            }
                        } else {
                            i7 = 1;
                        }
                    } else if (i6 == 1) {
                        i7 = 4;
                    }
                }
            }
            if (i6 != 1 && i6 != 2) {
                C("Unexpected value");
                throw null;
            }
            m();
            this.d--;
            this.h = 7;
            return 7;
        }
        i7 = 9;
        this.h = i7;
        return i7;
    }

    public final String Y0() {
        int i = this.f + 1;
        int i2 = this.d - this.g;
        String I0 = I0();
        int length = String.valueOf(i).length();
        int i3 = i2 + 1;
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(i3).length() + 6 + I0.length());
        me4.r(sb, " at line ", i, " column ", i3);
        return mz1.o(sb, " path ", I0);
    }

    public void Z() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i != 2) {
            throw H("END_OBJECT");
        }
        int i2 = this.m;
        int i3 = i2 - 1;
        this.m = i3;
        this.n[i3] = null;
        int[] iArr = this.o;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.h = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        m();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Z0() {
        char[] cArr;
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.d + i2;
                int i4 = this.e;
                cArr = this.c;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.d, i2);
                    this.d += i2;
                } else if (j(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.d;
            if (sb2 != null) {
                sb = new String(cArr, i5, i);
            } else {
                sb2.append(cArr, i5, i);
                sb = sb2.toString();
            }
            this.d += i;
            return sb;
        } while (j(1));
        int i52 = this.d;
        if (sb2 != null) {
        }
        this.d += i;
        return sb;
    }

    public boolean a0() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final void a1(char c) {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    t();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (j(1));
        C("Unterminated string");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public String e0() {
        String H0;
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 14) {
            H0 = Z0();
        } else if (i == 12) {
            H0 = H0('\'');
        } else {
            if (i != 13) {
                throw H("a name");
            }
            H0 = H0('\"');
        }
        this.h = 0;
        this.n[this.m - 1] = H0;
        return H0;
    }

    public String f0() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 10) {
            str = Z0();
        } else if (i == 8) {
            str = H0('\'');
        } else if (i == 9) {
            str = H0('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else {
            if (i != 16) {
                throw H("a string");
            }
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean g0() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw H("a boolean");
        }
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void h() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.d + i;
                if (i2 < this.e) {
                    char c = this.c[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.d = i2;
                }
            }
            m();
            this.d += i;
            return;
        } while (j(1));
    }

    public final void i(int i) {
        int i2 = this.m;
        if (i2 - 1 >= 1280) {
            String Y0 = Y0();
            throw new g7n(mz1.o(new StringBuilder(Y0.length() + 26), "Nesting limit 1280 reached", Y0));
        }
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean j(int i) {
        int i2;
        int i3 = this.g;
        int i4 = this.d;
        this.g = i3 - i4;
        int i5 = this.e;
        char[] cArr = this.c;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.e = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i7 = this.e;
            int read = this.a.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.e + read;
            this.e = i2;
            if (this.f == 0 && this.g == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public void j0() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i != 7) {
            throw H("null");
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final int k(boolean z) {
        int i;
        int i2 = this.d;
        int i3 = this.e;
        while (true) {
            if (i2 == i3) {
                this.d = i2;
                if (!j(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(Y0()));
                    }
                    return -1;
                }
                i2 = this.d;
                i3 = this.e;
            }
            int i4 = i2 + 1;
            char[] cArr = this.c;
            char c = cArr[i2];
            if (c == '\n') {
                this.f++;
                this.g = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i4;
                    if (i4 == i3) {
                        this.d = i2;
                        boolean j = j(2);
                        this.d++;
                        if (!j) {
                            break;
                        }
                    }
                    m();
                    int i5 = this.d;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.d = i5 + 1;
                        while (true) {
                            if (this.d + 2 > this.e && !j(2)) {
                                C("Unterminated comment");
                                throw null;
                            }
                            int i6 = this.d;
                            if (cArr[i6] != '\n') {
                                while (true) {
                                    int i7 = this.d;
                                    if (i >= 2) {
                                        i2 = i7 + 2;
                                        i3 = this.e;
                                        break;
                                    }
                                    i = cArr[i7 + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                            } else {
                                this.f++;
                                this.g = i6 + 1;
                            }
                            this.d++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.d = i5 + 1;
                        n();
                        i2 = this.d;
                        i3 = this.e;
                    }
                } else {
                    if (c != '#') {
                        this.d = i4;
                        return c;
                    }
                    this.d = i4;
                    m();
                    n();
                    i2 = this.d;
                    i3 = this.e;
                }
            }
            i2 = i4;
        }
        return 47;
    }

    public final void m() {
        if (this.b == 1) {
            return;
        }
        C("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void n() {
        char c;
        do {
            if (this.d >= this.e && !j(1)) {
                return;
            }
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = this.c[i];
            if (c == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c != '\r');
    }

    public double n0() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            int i3 = this.d;
            int i4 = this.j;
            this.k = new String(this.c, i3, i4);
            this.d = i3 + i4;
        } else if (i == 8 || i == 9) {
            this.k = H0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.k = Z0();
        } else if (i != 11) {
            throw H("a double");
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (this.b != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            StringBuilder sb = new StringBuilder(String.valueOf(parseDouble).length() + 33);
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(parseDouble);
            C(sb.toString());
            throw null;
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i5 = this.m - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    public final String p(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.l[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.o[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.n[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    a70.j(me4.g(i3, "Unknown scope value: ", new StringBuilder(String.valueOf(i3).length() + 21)));
                    return null;
            }
            i++;
        }
    }

    public long r0() {
        String H0;
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            int i3 = this.d;
            int i4 = this.j;
            this.k = new String(this.c, i3, i4);
            this.d = i3 + i4;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw H("a long");
            }
            if (i == 10) {
                H0 = Z0();
                this.k = H0;
            } else {
                H0 = H0(i == 8 ? '\'' : '\"');
                this.k = H0;
            }
            try {
                long parseLong = Long.parseLong(H0);
                this.h = 0;
                int[] iArr2 = this.o;
                int i5 = this.m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            String str = this.k;
            String Y0 = Y0();
            throw new NumberFormatException(wt3.m("Expected a long but was ", str, new StringBuilder(fn0.c(24, str) + Y0.length()), Y0));
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return j;
    }

    public final char t() {
        int i;
        if (this.d == this.e && !j(1)) {
            C("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            C("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.e && !j(4)) {
                            C("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.d;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            int i7 = i6 << 4;
                            char c2 = cArr[i4];
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    C("Malformed Unicode escape \\u".concat(new String(cArr, this.d, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.d += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.b == 3) {
            C("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f++;
        this.g = i3;
        if (this.b == 3) {
            C("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public String toString() {
        return getClass().getSimpleName().concat(Y0());
    }

    public int u0() {
        String H0;
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j != i2) {
                String Y0 = Y0();
                throw new NumberFormatException(fn0.l(j, "Expected an int but was ", Y0, new StringBuilder(x5n.f(24, j) + Y0.length())));
            }
            this.h = 0;
            int[] iArr = this.o;
            int i3 = this.m - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            int i4 = this.d;
            int i5 = this.j;
            this.k = new String(this.c, i4, i5);
            this.d = i4 + i5;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw H("an int");
            }
            if (i == 10) {
                H0 = Z0();
                this.k = H0;
            } else {
                H0 = H0(i == 8 ? '\'' : '\"');
                this.k = H0;
            }
            try {
                int parseInt = Integer.parseInt(H0);
                this.h = 0;
                int[] iArr2 = this.o;
                int i6 = this.m - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i7 = (int) parseDouble;
        if (i7 != parseDouble) {
            String str = this.k;
            String Y02 = Y0();
            throw new NumberFormatException(wt3.m("Expected an int but was ", str, new StringBuilder(fn0.c(24, str) + Y02.length()), Y02));
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i8 = this.m - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return i7;
    }

    public void zza() {
        int i = this.h;
        if (i == 0) {
            i = X0();
        }
        if (i != 3) {
            throw H("BEGIN_ARRAY");
        }
        i(1);
        this.o[this.m - 1] = 0;
        this.h = 0;
    }
}
