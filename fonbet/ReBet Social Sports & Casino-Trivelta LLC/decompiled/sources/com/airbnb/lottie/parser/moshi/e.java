package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.c;
import com.facebook.hermes.intl.Constants;
import java.io.EOFException;
import ti.C6478h;
import ti.InterfaceC6480j;
import ti.k;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: j, reason: collision with root package name */
    public static final k f29057j = k.e("'\\");

    /* renamed from: k, reason: collision with root package name */
    public static final k f29058k = k.e("\"\\");

    /* renamed from: l, reason: collision with root package name */
    public static final k f29059l = k.e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: m, reason: collision with root package name */
    public static final k f29060m = k.e("\n\r");

    /* renamed from: n, reason: collision with root package name */
    public static final k f29061n = k.e("*/");

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6480j f29062d;

    /* renamed from: e, reason: collision with root package name */
    public final C6478h f29063e;

    /* renamed from: f, reason: collision with root package name */
    public int f29064f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f29065g;

    /* renamed from: h, reason: collision with root package name */
    public int f29066h;

    /* renamed from: i, reason: collision with root package name */
    public String f29067i;

    public e(InterfaceC6480j interfaceC6480j) {
        if (interfaceC6480j == null) {
            throw new NullPointerException("source == null");
        }
        this.f29062d = interfaceC6480j;
        this.f29063e = interfaceC6480j.y();
        J(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public c.b B() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void C() {
        if (this.f29045c) {
            throw new a("Cannot skip unexpected " + B() + " at " + l());
        }
        int i10 = 0;
        do {
            int i11 = this.f29064f;
            if (i11 == 0) {
                i11 = m1();
            }
            if (i11 == 3) {
                J(1);
            } else if (i11 == 1) {
                J(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + B() + " at path " + l());
                    }
                    this.f29043a--;
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + B() + " at path " + l());
                    }
                    this.f29043a--;
                } else if (i11 == 14 || i11 == 10) {
                    g2();
                } else if (i11 == 9 || i11 == 13) {
                    d2(f29058k);
                } else if (i11 == 8 || i11 == 12) {
                    d2(f29057j);
                } else if (i11 == 17) {
                    this.f29063e.skip(this.f29066h);
                } else if (i11 == 18) {
                    throw new a("Expected a value but was " + B() + " at path " + l());
                }
                this.f29064f = 0;
            }
            i10++;
            this.f29064f = 0;
        } while (i10 != 0);
        int[] iArr = this.pathIndices;
        int i12 = this.f29043a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.pathNames[i12 - 1] = "null";
    }

    public final void D0() {
        if (!this.f29044b) {
            throw A0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String M0() {
        String c22;
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 10) {
            c22 = Z1();
        } else if (i10 == 9) {
            c22 = Y1(f29058k);
        } else if (i10 == 8) {
            c22 = Y1(f29057j);
        } else if (i10 == 11) {
            c22 = this.f29067i;
            this.f29067i = null;
        } else if (i10 == 16) {
            c22 = Long.toString(this.f29065g);
        } else {
            if (i10 != 17) {
                throw new a("Expected a string but was " + B() + " at path " + l());
            }
            c22 = this.f29063e.c2(this.f29066h);
        }
        this.f29064f = 0;
        int[] iArr = this.pathIndices;
        int i11 = this.f29043a - 1;
        iArr[i11] = iArr[i11] + 1;
        return c22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f29063e.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        D0();
        f2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f29062d.v0(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        D0();
        r3 = r6.f29063e.A0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f29063e.readByte();
        r6.f29063e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (e2() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw A0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f29063e.readByte();
        r6.f29063e.readByte();
        f2();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int T1(boolean z10) {
        byte A02;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f29062d.v0(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                A02 = this.f29063e.A0(i10);
                if (A02 != 10 && A02 != 32 && A02 != 13 && A02 != 9) {
                    break;
                }
                i10 = i11;
            }
        }
        return A02;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int U(c.a aVar) {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return n1(this.f29067i, aVar);
        }
        int d02 = this.f29062d.d0(aVar.f29046a);
        if (d02 != -1) {
            this.f29064f = 0;
            this.pathNames[this.f29043a - 1] = aVar.strings[d02];
            return d02;
        }
        String str = this.pathNames[this.f29043a - 1];
        String f02 = f0();
        int n12 = n1(f02, aVar);
        if (n12 == -1) {
            this.f29064f = 15;
            this.f29067i = f02;
            this.pathNames[this.f29043a - 1] = str;
        }
        return n12;
    }

    public final String Y1(k kVar) {
        StringBuilder sb2 = null;
        while (true) {
            long f12 = this.f29062d.f1(kVar);
            if (f12 == -1) {
                throw A0("Unterminated string");
            }
            if (this.f29063e.A0(f12) != 92) {
                if (sb2 == null) {
                    String c22 = this.f29063e.c2(f12);
                    this.f29063e.readByte();
                    return c22;
                }
                sb2.append(this.f29063e.c2(f12));
                this.f29063e.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f29063e.c2(f12));
            this.f29063e.readByte();
            sb2.append(c2());
        }
    }

    public final String Z1() {
        long f12 = this.f29062d.f1(f29059l);
        return f12 != -1 ? this.f29063e.c2(f12) : this.f29063e.G1();
    }

    public final int a2() {
        String str;
        String str2;
        int i10;
        byte A02 = this.f29063e.A0(0L);
        if (A02 == 116 || A02 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (A02 == 102 || A02 == 70) {
            str = Constants.CASEFIRST_FALSE;
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (A02 != 110 && A02 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f29062d.v0(i12)) {
                return 0;
            }
            byte A03 = this.f29063e.A0(i11);
            if (A03 != str.charAt(i11) && A03 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f29062d.v0(length + 1) && y1(this.f29063e.A0(length))) {
            return 0;
        }
        this.f29063e.skip(length);
        this.f29064f = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (y1(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r19.f29065g = r8;
        r19.f29063e.skip(r5);
        r19.f29064f = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r19.f29066h = r5;
        r19.f29064f = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b2() {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f29062d.v0(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte A02 = this.f29063e.A0(i11);
            i10 = 0;
            if (A02 != 43) {
                if (A02 == 69 || A02 == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (A02 != 45) {
                    if (A02 != 46) {
                        if (A02 < 48 || A02 > 57) {
                            break;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(A02 - 48);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - (A02 - 48);
                            z10 &= j11 > -922337203685477580L || (j11 == -922337203685477580L && j12 < j11);
                            j11 = j12;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return 0;
                        }
                        c10 = 3;
                    }
                } else if (c10 == 0) {
                    c10 = 1;
                    z11 = true;
                } else if (c10 != 5) {
                    return 0;
                }
                i11 = i12;
            } else if (c10 != 5) {
                return 0;
            }
            c10 = 6;
            i11 = i12;
        }
    }

    public final char c2() {
        int i10;
        if (!this.f29062d.v0(1L)) {
            throw A0("Unterminated escape sequence");
        }
        byte readByte = this.f29063e.readByte();
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
            if (this.f29044b) {
                return (char) readByte;
            }
            throw A0("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f29062d.v0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + l());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte A02 = this.f29063e.A0(i11);
            char c11 = (char) (c10 << 4);
            if (A02 >= 48 && A02 <= 57) {
                i10 = A02 - 48;
            } else if (A02 >= 97 && A02 <= 102) {
                i10 = A02 - 87;
            } else {
                if (A02 < 65 || A02 > 70) {
                    throw A0("\\u" + this.f29063e.c2(4L));
                }
                i10 = A02 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f29063e.skip(4L);
        return c10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29064f = 0;
        this.scopes[0] = 8;
        this.f29043a = 1;
        this.f29063e.k();
        this.f29062d.close();
    }

    public final void d2(k kVar) {
        while (true) {
            long f12 = this.f29062d.f1(kVar);
            if (f12 == -1) {
                throw A0("Unterminated string");
            }
            if (this.f29063e.A0(f12) != 92) {
                this.f29063e.skip(f12 + 1);
                return;
            } else {
                this.f29063e.skip(f12 + 1);
                c2();
            }
        }
    }

    public final boolean e2() {
        long N02 = this.f29062d.N0(f29061n);
        boolean z10 = N02 != -1;
        C6478h c6478h = this.f29063e;
        c6478h.skip(z10 ? N02 + r1.u() : c6478h.size());
        return z10;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String f0() {
        String str;
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 14) {
            str = Z1();
        } else if (i10 == 13) {
            str = Y1(f29058k);
        } else if (i10 == 12) {
            str = Y1(f29057j);
        } else {
            if (i10 != 15) {
                throw new a("Expected a name but was " + B() + " at path " + l());
            }
            str = this.f29067i;
        }
        this.f29064f = 0;
        this.pathNames[this.f29043a - 1] = str;
        return str;
    }

    public final void f2() {
        long f12 = this.f29062d.f1(f29060m);
        C6478h c6478h = this.f29063e;
        c6478h.skip(f12 != -1 ? f12 + 1 : c6478h.size());
    }

    public final void g2() {
        long f12 = this.f29062d.f1(f29059l);
        C6478h c6478h = this.f29063e;
        if (f12 == -1) {
            f12 = c6478h.size();
        }
        c6478h.skip(f12);
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean hasNext() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean k() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 5) {
            this.f29064f = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f29043a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f29064f = 0;
            int[] iArr2 = this.pathIndices;
            int i12 = this.f29043a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + B() + " at path " + l());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void m() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 1) {
            J(3);
            this.f29064f = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + B() + " at path " + l());
    }

    public final int m1() {
        int[] iArr = this.scopes;
        int i10 = this.f29043a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int T12 = T1(true);
            this.f29063e.readByte();
            if (T12 != 44) {
                if (T12 != 59) {
                    if (T12 != 93) {
                        throw A0("Unterminated array");
                    }
                    this.f29064f = 4;
                    return 4;
                }
                D0();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int T13 = T1(true);
                    this.f29063e.readByte();
                    if (T13 != 44) {
                        if (T13 != 59) {
                            if (T13 != 125) {
                                throw A0("Unterminated object");
                            }
                            this.f29064f = 2;
                            return 2;
                        }
                        D0();
                    }
                }
                int T14 = T1(true);
                if (T14 == 34) {
                    this.f29063e.readByte();
                    this.f29064f = 13;
                    return 13;
                }
                if (T14 == 39) {
                    this.f29063e.readByte();
                    D0();
                    this.f29064f = 12;
                    return 12;
                }
                if (T14 != 125) {
                    D0();
                    if (!y1((char) T14)) {
                        throw A0("Expected name");
                    }
                    this.f29064f = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw A0("Expected name");
                }
                this.f29063e.readByte();
                this.f29064f = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int T15 = T1(true);
                this.f29063e.readByte();
                if (T15 != 58) {
                    if (T15 != 61) {
                        throw A0("Expected ':'");
                    }
                    D0();
                    if (this.f29062d.v0(1L) && this.f29063e.A0(0L) == 62) {
                        this.f29063e.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (T1(false) == -1) {
                    this.f29064f = 18;
                    return 18;
                }
                D0();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int T16 = T1(true);
        if (T16 == 34) {
            this.f29063e.readByte();
            this.f29064f = 9;
            return 9;
        }
        if (T16 == 39) {
            D0();
            this.f29063e.readByte();
            this.f29064f = 8;
            return 8;
        }
        if (T16 != 44 && T16 != 59) {
            if (T16 == 91) {
                this.f29063e.readByte();
                this.f29064f = 3;
                return 3;
            }
            if (T16 != 93) {
                if (T16 == 123) {
                    this.f29063e.readByte();
                    this.f29064f = 1;
                    return 1;
                }
                int a22 = a2();
                if (a22 != 0) {
                    return a22;
                }
                int b22 = b2();
                if (b22 != 0) {
                    return b22;
                }
                if (!y1(this.f29063e.A0(0L))) {
                    throw A0("Expected value");
                }
                D0();
                this.f29064f = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f29063e.readByte();
                this.f29064f = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw A0("Unexpected value");
        }
        D0();
        this.f29064f = 7;
        return 7;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void n() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 != 4) {
            throw new a("Expected END_ARRAY but was " + B() + " at path " + l());
        }
        int i11 = this.f29043a;
        this.f29043a = i11 - 1;
        int[] iArr = this.pathIndices;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f29064f = 0;
    }

    public final int n1(String str, c.a aVar) {
        int length = aVar.strings.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.strings[i10])) {
                this.f29064f = 0;
                this.pathNames[this.f29043a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public double nextDouble() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 16) {
            this.f29064f = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f29043a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f29065g;
        }
        if (i10 == 17) {
            this.f29067i = this.f29063e.c2(this.f29066h);
        } else if (i10 == 9) {
            this.f29067i = Y1(f29058k);
        } else if (i10 == 8) {
            this.f29067i = Y1(f29057j);
        } else if (i10 == 10) {
            this.f29067i = Z1();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + B() + " at path " + l());
        }
        this.f29064f = 11;
        try {
            double parseDouble = Double.parseDouble(this.f29067i);
            if (this.f29044b || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.f29067i = null;
                this.f29064f = 0;
                int[] iArr2 = this.pathIndices;
                int i12 = this.f29043a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + l());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f29067i + " at path " + l());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int nextInt() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 16) {
            long j10 = this.f29065g;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f29064f = 0;
                int[] iArr = this.pathIndices;
                int i12 = this.f29043a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f29065g + " at path " + l());
        }
        if (i10 == 17) {
            this.f29067i = this.f29063e.c2(this.f29066h);
        } else if (i10 == 9 || i10 == 8) {
            String Y12 = i10 == 9 ? Y1(f29058k) : Y1(f29057j);
            this.f29067i = Y12;
            try {
                int parseInt = Integer.parseInt(Y12);
                this.f29064f = 0;
                int[] iArr2 = this.pathIndices;
                int i13 = this.f29043a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + B() + " at path " + l());
        }
        this.f29064f = 11;
        try {
            double parseDouble = Double.parseDouble(this.f29067i);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f29067i = null;
                this.f29064f = 0;
                int[] iArr3 = this.pathIndices;
                int i15 = this.f29043a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f29067i + " at path " + l());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f29067i + " at path " + l());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void p() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 3) {
            J(1);
            this.pathIndices[this.f29043a - 1] = 0;
            this.f29064f = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + B() + " at path " + l());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void t() {
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 != 2) {
            throw new a("Expected END_OBJECT but was " + B() + " at path " + l());
        }
        int i11 = this.f29043a;
        int i12 = i11 - 1;
        this.f29043a = i12;
        this.pathNames[i12] = null;
        int[] iArr = this.pathIndices;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f29064f = 0;
    }

    public String toString() {
        return "JsonReader(" + this.f29062d + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void w0() {
        if (this.f29045c) {
            throw new a("Cannot skip unexpected " + B() + " at " + l());
        }
        int i10 = this.f29064f;
        if (i10 == 0) {
            i10 = m1();
        }
        if (i10 == 14) {
            g2();
        } else if (i10 == 13) {
            d2(f29058k);
        } else if (i10 == 12) {
            d2(f29057j);
        } else if (i10 != 15) {
            throw new a("Expected a name but was " + B() + " at path " + l());
        }
        this.f29064f = 0;
        this.pathNames[this.f29043a - 1] = "null";
    }

    public final boolean y1(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
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
        D0();
        return false;
    }
}
