package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.bf3;
import defpackage.bpo;
import defpackage.me4;
import defpackage.mz1;
import defpackage.wt3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzidl implements Closeable {
    public final StringReader a;
    public long h;
    public int i;
    public int[] j;
    public String[] l;
    public int[] m;
    public final char[] b = new char[1024];
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int k = 1;

    static {
        new bpo();
    }

    public zzidl(StringReader stringReader) {
        int[] iArr = new int[32];
        this.j = iArr;
        iArr[0] = 6;
        this.l = new String[32];
        this.m = new int[32];
        this.a = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0049, code lost:
    
        Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String C() {
        char[] cArr;
        String sb;
        int i = 0;
        int i2 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i3 = this.c + i2;
            int i4 = this.d;
            cArr = this.b;
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
                                                continue;
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
                sb2.append(cArr, this.c, i2);
                this.c += i2;
                if (M(1)) {
                    i2 = 0;
                }
            } else if (M(i2 + 1)) {
            }
        }
        i = i2;
        int i5 = this.c;
        if (sb2 == null) {
            sb = new String(cArr, i5, i);
        } else {
            sb2.append(cArr, i5, i);
            sb = sb2.toString();
        }
        this.c += i;
        return sb;
    }

    public final void H(int i) {
        int i2 = this.k;
        if (i2 - 1 >= 1280) {
            String m = m();
            throw new zzido(mz1.o(new StringBuilder(m.length() + 26), "Nesting limit 1280 reached", m));
        }
        int[] iArr = this.j;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.j = Arrays.copyOf(iArr, i3);
            this.m = Arrays.copyOf(this.m, i3);
            this.l = (String[]) Arrays.copyOf(this.l, i3);
        }
        int[] iArr2 = this.j;
        int i4 = this.k;
        this.k = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean M(int i) {
        int i2;
        int i3 = this.f;
        int i4 = this.c;
        this.f = i3 - i4;
        int i5 = this.d;
        char[] cArr = this.b;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.d = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.d = 0;
        }
        this.c = 0;
        do {
            int i7 = this.d;
            int read = this.a.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.d + read;
            this.d = i2;
            if (this.e == 0 && this.f == 0 && i2 > 0 && cArr[0] == 65279) {
                this.c++;
                this.f = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final int T(boolean z) {
        int i = this.c;
        int i2 = this.d;
        while (true) {
            if (i == i2) {
                this.c = i;
                if (!M(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m()));
                    }
                    return -1;
                }
                i = this.c;
                i2 = this.d;
            }
            int i3 = i + 1;
            char c = this.b[i];
            if (c == '\n') {
                this.e++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.c = i3;
                        return c;
                    }
                    this.c = i3;
                    Z();
                    throw null;
                }
                this.c = i3;
                if (i3 == i2) {
                    this.c = i;
                    boolean M = M(2);
                    this.c++;
                    if (!M) {
                        return 47;
                    }
                }
                Z();
                throw null;
            }
            i = i3;
        }
    }

    public final void Z() {
        a0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void a0(String str) {
        String m = m();
        throw new zzido(wt3.m(str, m, new StringBuilder(str.length() + m.length() + 79), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g = 0;
        this.j[0] = 8;
        this.k = 1;
        this.a.close();
    }

    public final IllegalStateException e0(String str) {
        int n = n();
        String a = zzidm.a(n());
        String m = m();
        int d = mz1.d(str.length() + 18, m.length(), a);
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(n == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + d + 5);
        bf3.v(sb, "Expected ", str, " but was ", a);
        return new IllegalStateException(wt3.m(m, "\nSee ", sb, concat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b3, code lost:
    
        if (p(r13) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b6, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b7, code lost:
    
        if (r7 != r1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        if (r8 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bf, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c1, code lost:
    
        if (r20 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cc, code lost:
    
        if (r9 != 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ce, code lost:
    
        if (r6 != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d4, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d5, code lost:
    
        r26.h = r9;
        r26.c += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01de, code lost:
    
        r26.g = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d1, code lost:
    
        if (r6 == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c8, code lost:
    
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c5, code lost:
    
        r5 = 2;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e2, code lost:
    
        if (r7 == r5) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e5, code lost:
    
        if (r7 == 4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e8, code lost:
    
        if (r7 != 7) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
    
        r26.i = r4;
        r7 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e1, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0229 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0214 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() {
        int T;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int[] iArr = this.j;
        int i5 = this.k;
        int i6 = i5 - 1;
        int i7 = iArr[i6];
        int i8 = 3;
        int i9 = 2;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else {
            if (i7 != 2) {
                if (i7 == 3 || i7 == 5) {
                    iArr[i6] = 4;
                    if (i7 != 5 || (T = T(true)) == 44) {
                        int T2 = T(true);
                        if (T2 == 34) {
                            i8 = 13;
                        } else {
                            if (T2 == 39) {
                                Z();
                                throw null;
                            }
                            if (T2 != 125) {
                                Z();
                                throw null;
                            }
                            if (i7 == 5) {
                                a0("Expected name");
                                throw null;
                            }
                        }
                    } else {
                        if (T == 59) {
                            Z();
                            throw null;
                        }
                        if (T != 125) {
                            a0("Unterminated object");
                            throw null;
                        }
                    }
                    i8 = 2;
                } else if (i7 == 4) {
                    iArr[i6] = 5;
                    int T3 = T(true);
                    if (T3 != 58) {
                        if (T3 == 61) {
                            Z();
                            throw null;
                        }
                        a0("Expected ':'");
                        throw null;
                    }
                } else if (i7 == 6) {
                    iArr[i5 - 1] = 7;
                } else if (i7 == 7) {
                    if (T(false) != -1) {
                        Z();
                        throw null;
                    }
                    i8 = 17;
                } else if (i7 == 8) {
                    a70.r("JsonReader is closed");
                    return 0;
                }
                this.g = i8;
                return i8;
            }
            int T4 = T(true);
            if (T4 != 44) {
                if (T4 == 59) {
                    Z();
                    throw null;
                }
                if (T4 != 93) {
                    a0("Unterminated array");
                    throw null;
                }
                i8 = 4;
                this.g = i8;
                return i8;
            }
        }
        int T5 = T(true);
        if (T5 != 34) {
            if (T5 == 39) {
                Z();
                throw null;
            }
            if (T5 == 44 || T5 == 59) {
                i = 1;
            } else if (T5 != 91) {
                if (T5 == 93) {
                    i = 1;
                    if (i7 == 1) {
                        i8 = 4;
                    }
                } else if (T5 != 123) {
                    int i12 = this.c - 1;
                    this.c = i12;
                    char[] cArr = this.b;
                    char c2 = cArr[i12];
                    if (c2 == 't' || c2 == 'T') {
                        str = "TRUE";
                        str2 = "true";
                        i2 = 5;
                    } else if (c2 == 'f' || c2 == 'F') {
                        str = "FALSE";
                        str2 = "false";
                        i2 = 6;
                    } else if (c2 == 'n' || c2 == 'N') {
                        str = "NULL";
                        str2 = "null";
                        i2 = 7;
                    } else {
                        i2 = 0;
                        i3 = 0;
                        if (i2 == 0) {
                            return i2;
                        }
                        int i13 = this.c;
                        int i14 = this.d;
                        int i15 = 1;
                        int i16 = i3;
                        int i17 = i16;
                        int i18 = i17;
                        long j = 0;
                        while (true) {
                            if (i13 + i16 == i14) {
                                if (i16 == 1024) {
                                    break;
                                }
                                if (!M(i16 + 1)) {
                                    int i19 = i9;
                                    break;
                                }
                                i13 = this.c;
                                i14 = this.d;
                            }
                            char c3 = cArr[i13 + i16];
                            if (c3 != '+') {
                                if (c3 == 'E' || c3 == 'e') {
                                    if (i17 != i9 && i17 != 4) {
                                        break;
                                    }
                                    i17 = 5;
                                    i16++;
                                    i9 = 2;
                                    i11 = 1;
                                } else if (c3 != '-') {
                                    if (c3 == '.') {
                                        if (i17 != i9) {
                                            break;
                                        }
                                        i17 = 3;
                                        i16++;
                                        i9 = 2;
                                        i11 = 1;
                                    } else {
                                        if (c3 < '0' || c3 > '9') {
                                            break;
                                        }
                                        if (i17 == i11 || i17 == 0) {
                                            j = -(c3 - '0');
                                            i17 = 2;
                                        } else if (i17 == i9) {
                                            if (j == 0) {
                                                break;
                                            }
                                            long j2 = (10 * j) - (c3 - '0');
                                            i15 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i3;
                                            j = j2;
                                        } else if (i17 == 3) {
                                            i17 = 4;
                                        } else if (i17 == 5 || i17 == 6) {
                                            i17 = 7;
                                        }
                                        i16++;
                                        i9 = 2;
                                        i11 = 1;
                                    }
                                } else if (i17 == 0) {
                                    i17 = 1;
                                    i18 = 1;
                                    i16++;
                                    i9 = 2;
                                    i11 = 1;
                                } else {
                                    if (i17 != 5) {
                                        break;
                                    }
                                    i17 = 6;
                                    i16++;
                                    i9 = 2;
                                    i11 = 1;
                                }
                                if (i4 == 0) {
                                    return i4;
                                }
                                if (p(cArr[this.c])) {
                                    Z();
                                    throw null;
                                }
                                a0("Expected value");
                                throw null;
                            }
                            if (i17 != 5) {
                                break;
                            }
                            i17 = 6;
                            i16++;
                            i9 = 2;
                            i11 = 1;
                        }
                        i4 = i3;
                        if (i4 == 0) {
                        }
                    }
                    int i20 = 0;
                    while (true) {
                        int length = str2.length();
                        int i21 = this.c;
                        i3 = i10;
                        int i22 = this.d;
                        if (i20 < length) {
                            if ((i21 + i20 >= i22 && !M(i20 + 1)) || ((c = cArr[this.c + i20]) != str2.charAt(i20) && c != str.charAt(i20))) {
                                break;
                            }
                            i20++;
                            i10 = i3;
                        } else if ((i21 + length >= i22 && !M(length + 1)) || !p(cArr[this.c + length])) {
                            this.c += length;
                            this.g = i2;
                        }
                    }
                    i2 = i3;
                    if (i2 == 0) {
                    }
                } else {
                    i8 = 1;
                }
            }
            if (i7 == i || i7 == 2) {
                Z();
                throw null;
            }
            a0("Unexpected value");
            throw null;
        }
        i8 = 9;
        this.g = i8;
        return i8;
    }

    public final String k() {
        String str;
        int i = this.g;
        if (i == 0) {
            i = h();
        }
        if (i == 10) {
            str = C();
        } else if (i == 8) {
            str = t('\'');
        } else if (i == 9) {
            str = t('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.h);
        } else {
            if (i != 16) {
                throw e0("a string");
            }
            str = new String(this.b, this.c, this.i);
            this.c += this.i;
        }
        this.g = 0;
        int[] iArr = this.m;
        int i2 = this.k - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final String m() {
        int i = this.e + 1;
        int i2 = this.c - this.f;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < this.k; i3++) {
            int i4 = this.j[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.m[i3];
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.l[i3];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    a70.j(me4.g(i4, "Unknown scope value: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                    return null;
            }
        }
        int i6 = i2 + 1;
        String sb2 = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i6).length();
        StringBuilder sb3 = new StringBuilder(sb2.length() + length2 + length + 17 + 6);
        me4.r(sb3, " at line ", i, " column ", i6);
        return mz1.o(sb3, " path ", sb2);
    }

    public final int n() {
        int i = this.g;
        if (i == 0) {
            i = h();
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

    public final boolean p(char c) {
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
        Z();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0122, code lost:
    
        r1.append(r7, r3, r4);
        r11.c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
    
        a0("Malformed Unicode escape \\u".concat(new java.lang.String(r7, r11.c, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String t(char c) {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i2 = this.c;
            int i3 = this.d;
            int i4 = i2;
            while (true) {
                char[] cArr = this.b;
                if (i2 >= i3) {
                    break;
                }
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    int i6 = (i5 - i4) - 1;
                    this.c = i5;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = '\n';
                if (c2 == '\\') {
                    int i7 = i5 - i4;
                    int i8 = i7 - 1;
                    this.c = i5;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i4, i8);
                    if (this.c == this.d && !M(1)) {
                        a0("Unterminated escape sequence");
                        throw null;
                    }
                    int i9 = this.c;
                    int i10 = i9 + 1;
                    this.c = i10;
                    char c4 = cArr[i9];
                    if (c4 == '\n') {
                        this.e++;
                        this.f = i10;
                    } else if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                        if (c4 == 'b') {
                            c3 = '\b';
                        } else if (c4 == 'f') {
                            c3 = '\f';
                        } else if (c4 != 'n') {
                            if (c4 == 'r') {
                                c3 = '\r';
                            } else if (c4 == 't') {
                                c3 = '\t';
                            } else {
                                if (c4 != 'u') {
                                    a0("Invalid escape sequence");
                                    throw null;
                                }
                                if (i9 + 5 > this.d && !M(4)) {
                                    a0("Unterminated escape sequence");
                                    throw null;
                                }
                                int i11 = this.c;
                                int i12 = i11 + 4;
                                int i13 = 0;
                                while (i11 < i12) {
                                    int i14 = i13 << 4;
                                    char c5 = cArr[i11];
                                    if (c5 >= '0' && c5 <= '9') {
                                        i = c5 - '0';
                                    } else if (c5 >= 'a' && c5 <= 'f') {
                                        i = c5 - 'W';
                                    } else {
                                        if (c5 < 'A' || c5 > 'F') {
                                            break loop0;
                                        }
                                        i = c5 - '7';
                                    }
                                    i13 = i + i14;
                                    i11++;
                                }
                                this.c += 4;
                                c3 = (char) i13;
                            }
                        }
                        sb.append(c3);
                        i4 = this.c;
                        i3 = this.d;
                        i2 = i4;
                    }
                    c3 = c4;
                    sb.append(c3);
                    i4 = this.c;
                    i3 = this.d;
                    i2 = i4;
                } else {
                    if (c2 == '\n') {
                        this.e++;
                        this.f = i5;
                    }
                    i2 = i5;
                }
            }
        } while (M(1));
        a0("Unterminated string");
        throw null;
    }

    public final String toString() {
        return "zzidl".concat(m());
    }
}
