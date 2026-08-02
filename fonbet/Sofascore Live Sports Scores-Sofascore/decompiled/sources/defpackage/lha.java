package defpackage;

import java.io.EOFException;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lha extends wga {
    public static final gc2 l;
    public static final gc2 m;
    public static final gc2 n;
    public final lof f;
    public final x52 g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        gc2 gc2Var = gc2.d;
        l = q1f.o("'\\");
        m = q1f.o("\"\\");
        n = q1f.o("{}[]:, \n\t\r\f/\\;#=");
        q1f.o("\n\r");
        q1f.o("*/");
    }

    public lha(lof lofVar) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = lofVar;
        this.g = lofVar.b;
        a0(6);
    }

    public final boolean B0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        n0();
        throw null;
    }

    @Override // defpackage.wga
    public final boolean C() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            sw9.h(wv8.y(Z()), p(), "Expected a boolean but was ");
            return false;
        }
        this.h = 0;
        int[] iArr2 = this.d;
        int i3 = this.a - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final String E0() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 14) {
            str = P0();
        } else if (i == 13) {
            str = I0(m);
        } else if (i == 12) {
            str = I0(l);
        } else {
            if (i != 15) {
                sw9.h(wv8.y(Z()), p(), "Expected a name but was ");
                return null;
            }
            str = this.k;
        }
        this.h = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // defpackage.wga
    public final double H() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 17) {
            long j = this.j;
            x52 x52Var = this.g;
            x52Var.getClass();
            this.k = x52Var.B0(j, Charsets.UTF_8);
        } else if (i == 9) {
            this.k = I0(m);
        } else if (i == 8) {
            this.k = I0(l);
        } else if (i == 10) {
            this.k = P0();
        } else if (i != 11) {
            sw9.h(wv8.y(Z()), p(), "Expected a double but was ");
            return 0.0d;
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new jz2("JSON forbids NaN and infinities: " + parseDouble + " at path " + p());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            sw9.h(this.k, p(), "Expected a double but was ");
            return 0.0d;
        }
    }

    public final int H0(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            lof lofVar = this.f;
            if (!lofVar.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            x52 x52Var = this.g;
            byte t = x52Var.t(j);
            if (t != 10 && t != 32 && t != 13 && t != 9) {
                x52Var.skip(j);
                if (t == 47) {
                    if (lofVar.request(2L)) {
                        n0();
                        throw null;
                    }
                } else if (t == 35) {
                    n0();
                    throw null;
                }
                return t;
            }
            i = i2;
        }
    }

    public final String I0(gc2 gc2Var) {
        StringBuilder sb = null;
        while (true) {
            long f = this.f.f(gc2Var);
            if (f == -1) {
                j0("Unterminated string");
                throw null;
            }
            x52 x52Var = this.g;
            if (x52Var.t(f) != 92) {
                if (sb == null) {
                    String B0 = x52Var.B0(f, Charsets.UTF_8);
                    x52Var.readByte();
                    return B0;
                }
                sb.append(x52Var.B0(f, Charsets.UTF_8));
                x52Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(x52Var.B0(f, Charsets.UTF_8));
            x52Var.readByte();
            sb.append(Q0());
        }
    }

    @Override // defpackage.wga
    public final int M() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 16) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new fb3("Expected an int but was " + this.i + " at path " + p(), 9);
        }
        if (i == 17) {
            long j2 = this.j;
            x52 x52Var = this.g;
            x52Var.getClass();
            this.k = x52Var.B0(j2, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String I0 = i == 9 ? I0(m) : I0(l);
            this.k = I0;
            try {
                int parseInt = Integer.parseInt(I0);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            sw9.h(wv8.y(Z()), p(), "Expected an int but was ");
            return 0;
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                sw9.h(this.k, p(), "Expected an int but was ");
                return 0;
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            sw9.h(this.k, p(), "Expected an int but was ");
            return 0;
        }
    }

    public final String P0() {
        long f = this.f.f(n);
        x52 x52Var = this.g;
        if (f == -1) {
            return x52Var.E0();
        }
        x52Var.getClass();
        return x52Var.B0(f, Charsets.UTF_8);
    }

    public final char Q0() {
        int i;
        lof lofVar = this.f;
        if (!lofVar.request(1L)) {
            j0("Unterminated escape sequence");
            throw null;
        }
        x52 x52Var = this.g;
        byte readByte = x52Var.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            j0("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!lofVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(p()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte t = x52Var.t(i2);
            char c2 = (char) (c << 4);
            if (t >= 48 && t <= 57) {
                i = t - 48;
            } else if (t >= 97 && t <= 102) {
                i = t - 87;
            } else {
                if (t < 65 || t > 70) {
                    j0("\\u".concat(x52Var.B0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = t - 55;
            }
            c = (char) (i + c2);
        }
        x52Var.skip(4L);
        return c;
    }

    @Override // defpackage.wga
    public final String T() {
        String B0;
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 10) {
            B0 = P0();
        } else if (i == 9) {
            B0 = I0(m);
        } else if (i == 8) {
            B0 = I0(l);
        } else if (i == 11) {
            B0 = this.k;
            this.k = null;
        } else if (i == 16) {
            B0 = Long.toString(this.i);
        } else {
            if (i != 17) {
                sw9.h(wv8.y(Z()), p(), "Expected a string but was ");
                return null;
            }
            long j = this.j;
            x52 x52Var = this.g;
            x52Var.getClass();
            B0 = x52Var.B0(j, Charsets.UTF_8);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return B0;
    }

    public final void X0(gc2 gc2Var) {
        while (true) {
            long f = this.f.f(gc2Var);
            if (f == -1) {
                j0("Unterminated string");
                throw null;
            }
            x52 x52Var = this.g;
            if (x52Var.t(f) != 92) {
                x52Var.skip(f + 1);
                return;
            } else {
                x52Var.skip(f + 1);
                Q0();
            }
        }
    }

    @Override // defpackage.wga
    public final int Z() {
        int i = this.h;
        if (i == 0) {
            i = r0();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                ogj.b();
                return 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.k();
        this.f.close();
    }

    @Override // defpackage.wga
    public final int e0(wj9 wj9Var) {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return u0(this.k, wj9Var);
        }
        int c0 = this.f.c0((wvd) wj9Var.c);
        if (c0 != -1) {
            this.h = 0;
            this.c[this.a - 1] = ((String[]) wj9Var.b)[c0];
            return c0;
        }
        String str = this.c[this.a - 1];
        String E0 = E0();
        int u0 = u0(E0, wj9Var);
        if (u0 == -1) {
            this.h = 15;
            this.k = E0;
            this.c[this.a - 1] = str;
        }
        return u0;
    }

    @Override // defpackage.wga
    public final void f0() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i == 14) {
            long f = this.f.f(n);
            x52 x52Var = this.g;
            if (f == -1) {
                f = x52Var.b;
            }
            x52Var.skip(f);
        } else if (i == 13) {
            X0(m);
        } else if (i == 12) {
            X0(l);
        } else if (i != 15) {
            sw9.h(wv8.y(Z()), p(), "Expected a name but was ");
            return;
        }
        this.h = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // defpackage.wga
    public final void g0() {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = r0();
            }
            if (i2 == 3) {
                a0(1);
            } else if (i2 == 1) {
                a0(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        sw9.h(wv8.y(Z()), p(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        sw9.h(wv8.y(Z()), p(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else {
                    x52 x52Var = this.g;
                    if (i2 == 14 || i2 == 10) {
                        long f = this.f.f(n);
                        if (f == -1) {
                            f = x52Var.b;
                        }
                        x52Var.skip(f);
                    } else if (i2 == 9 || i2 == 13) {
                        X0(m);
                    } else if (i2 == 8 || i2 == 12) {
                        X0(l);
                    } else if (i2 == 17) {
                        x52Var.skip(this.j);
                    } else if (i2 == 18) {
                        sw9.h(wv8.y(Z()), p(), "Expected a value but was ");
                        return;
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i3] = "null";
    }

    @Override // defpackage.wga
    public final void h() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i != 3) {
            sw9.h(wv8.y(Z()), p(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        a0(1);
        this.d[this.a - 1] = 0;
        this.h = 0;
    }

    @Override // defpackage.wga
    public final void k() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i != 1) {
            sw9.h(wv8.y(Z()), p(), "Expected BEGIN_OBJECT but was ");
        } else {
            a0(3);
            this.h = 0;
        }
    }

    @Override // defpackage.wga
    public final void m() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i != 4) {
            sw9.h(wv8.y(Z()), p(), "Expected END_ARRAY but was ");
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        int[] iArr = this.d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // defpackage.wga
    public final void n() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        if (i != 2) {
            sw9.h(wv8.y(Z()), p(), "Expected END_OBJECT but was ");
            return;
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.h = 0;
    }

    public final void n0() {
        j0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cb, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cd, code lost:
    
        r23.j = r2;
        r9 = 17;
        r23.h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        if (B0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        if (r4 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ac, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ae, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b2, code lost:
    
        if (r8 != r18) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b4, code lost:
    
        if (r13 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        if (r13 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
    
        r23.i = r8;
        r7.skip(r2);
        r9 = 16;
        r23.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c5, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r0() {
        int i;
        int i2;
        String str;
        String str2;
        long j;
        char t;
        int i3;
        int i4;
        int[] iArr = this.b;
        int i5 = this.a - 1;
        int i6 = iArr[i5];
        x52 x52Var = this.g;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int H0 = H0(true);
            x52Var.readByte();
            if (H0 != 44) {
                if (H0 == 59) {
                    n0();
                    throw null;
                }
                if (H0 == 93) {
                    this.h = 4;
                    return 4;
                }
                j0("Unterminated array");
                throw null;
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int H02 = H0(true);
                    x52Var.readByte();
                    if (H02 != 44) {
                        if (H02 == 59) {
                            n0();
                            throw null;
                        }
                        if (H02 == 125) {
                            this.h = 2;
                            return 2;
                        }
                        j0("Unterminated object");
                        throw null;
                    }
                }
                int H03 = H0(true);
                if (H03 == 34) {
                    x52Var.readByte();
                    this.h = 13;
                    return 13;
                }
                if (H03 == 39) {
                    x52Var.readByte();
                    n0();
                    throw null;
                }
                if (H03 != 125) {
                    n0();
                    throw null;
                }
                if (i6 == 5) {
                    j0("Expected name");
                    throw null;
                }
                x52Var.readByte();
                this.h = 2;
                return 2;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int H04 = H0(true);
                x52Var.readByte();
                if (H04 != 58) {
                    if (H04 != 61) {
                        j0("Expected ':'");
                        throw null;
                    }
                    n0();
                    throw null;
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else {
                if (i6 == 7) {
                    if (H0(false) == -1) {
                        this.h = 18;
                        return 18;
                    }
                    n0();
                    throw null;
                }
                if (i6 == 8) {
                    a70.r("JsonReader is closed");
                    return 0;
                }
            }
        }
        int H05 = H0(true);
        if (H05 == 34) {
            x52Var.readByte();
            this.h = 9;
            return 9;
        }
        if (H05 == 39) {
            n0();
            throw null;
        }
        if (H05 != 44 && H05 != 59) {
            if (H05 == 91) {
                x52Var.readByte();
                this.h = 3;
                return 3;
            }
            if (H05 != 93) {
                if (H05 == 123) {
                    x52Var.readByte();
                    this.h = 1;
                    return 1;
                }
                byte t2 = x52Var.t(0L);
                lof lofVar = this.f;
                if (t2 == 116 || t2 == 84) {
                    i = 5;
                    i2 = 0;
                    str2 = "true";
                    str = "TRUE";
                } else if (t2 == 102 || t2 == 70) {
                    i2 = 0;
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (t2 == 110 || t2 == 78) {
                    i2 = 0;
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j = 0;
                    i = 0;
                    i2 = 0;
                    if (i == 0) {
                        return i;
                    }
                    int i7 = 1;
                    int i8 = i2;
                    int i9 = i8;
                    int i10 = i9;
                    long j2 = j;
                    while (true) {
                        int i11 = i9 + 1;
                        if (!lofVar.request(i11)) {
                            break;
                        }
                        byte t3 = x52Var.t(i9);
                        if (t3 != 43) {
                            if (t3 == 69 || t3 == 101) {
                                i4 = 6;
                                if (i8 != 2 && i8 != 4) {
                                    break;
                                }
                                i8 = 5;
                                i9 = i11;
                            } else if (t3 == 45) {
                                i4 = 6;
                                if (i8 == 0) {
                                    i8 = 1;
                                    i10 = 1;
                                    i9 = i11;
                                } else {
                                    if (i8 != 5) {
                                        break;
                                    }
                                    i8 = i4;
                                    i9 = i11;
                                }
                            } else if (t3 == 46) {
                                i4 = 6;
                                if (i8 != 2) {
                                    break;
                                }
                                i8 = 3;
                                i9 = i11;
                            } else {
                                if (t3 < 48 || t3 > 57) {
                                    break;
                                }
                                if (i8 == 1 || i8 == 0) {
                                    i4 = 6;
                                    j2 = -(t3 - 48);
                                    i8 = 2;
                                } else {
                                    if (i8 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - (t3 - 48);
                                        i7 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i2;
                                        j2 = j3;
                                    } else if (i8 == 3) {
                                        i8 = 4;
                                    } else {
                                        i4 = 6;
                                        if (i8 == 5 || i8 == 6) {
                                            i8 = 7;
                                        }
                                    }
                                    i4 = 6;
                                    i9 = i11;
                                }
                                i9 = i11;
                            }
                            if (i3 == 0) {
                                return i3;
                            }
                            if (B0(x52Var.t(j))) {
                                n0();
                                throw null;
                            }
                            j0("Expected value");
                            throw null;
                        }
                        i4 = 6;
                        if (i8 != 5) {
                            break;
                        }
                        i8 = i4;
                        i9 = i11;
                    }
                    i3 = i2;
                    if (i3 == 0) {
                    }
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 < length) {
                        int i13 = i12 + 1;
                        if (!lofVar.request(i13) || ((t = x52Var.t(i12)) != str2.charAt(i12) && t != str.charAt(i12))) {
                            break;
                        }
                        i12 = i13;
                    } else if (!lofVar.request(length + 1) || !B0(x52Var.t(length))) {
                        x52Var.skip(length);
                        this.h = i;
                    }
                }
                i = i2;
                if (i == 0) {
                }
            } else if (i6 == 1) {
                x52Var.readByte();
                this.h = 4;
                return 4;
            }
        }
        if (i6 == 1 || i6 == 2) {
            n0();
            throw null;
        }
        j0("Unexpected value");
        throw null;
    }

    @Override // defpackage.wga
    public final boolean t() {
        int i = this.h;
        if (i == 0) {
            i = r0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    public final int u0(String str, wj9 wj9Var) {
        int length = ((String[]) wj9Var.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) wj9Var.b)[i])) {
                this.h = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }
}
