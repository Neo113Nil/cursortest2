package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import okio.Segment;
import okio.internal.Buffer;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f17203a;

    /* renamed from: i, reason: collision with root package name */
    public long f17211i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f17212k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f17213l;

    /* renamed from: n, reason: collision with root package name */
    public String[] f17215n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f17216o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17204b = false;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f17205c = new char[Segment.SHARE_MINIMUM];

    /* renamed from: d, reason: collision with root package name */
    public int f17206d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f17207e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f17208f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f17209g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f17210h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f17214m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f17213l = iArr;
        iArr[0] = 6;
        this.f17215n = new String[32];
        this.f17216o = new int[32];
        this.f17203a = reader;
    }

    public final boolean C(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
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
        n();
        return false;
    }

    public final String J() {
        int i5 = this.f17208f + 1;
        int i10 = (this.f17206d - this.f17209g) + 1;
        StringBuilder sb2 = new StringBuilder(" at line ");
        sb2.append(i5);
        sb2.append(" column ");
        sb2.append(i10);
        sb2.append(" path ");
        StringBuilder sb3 = new StringBuilder("$");
        int i11 = this.f17214m;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f17213l[i12];
            if (i13 == 1 || i13 == 2) {
                sb3.append('[');
                sb3.append(this.f17216o[i12]);
                sb3.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb3.append('.');
                String str = this.f17215n[i12];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public final boolean K() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 5) {
            this.f17210h = 0;
            int[] iArr = this.f17216o;
            int i10 = this.f17214m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i5 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + h0() + J());
        }
        this.f17210h = 0;
        int[] iArr2 = this.f17216o;
        int i11 = this.f17214m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double N() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            this.f17210h = 0;
            int[] iArr = this.f17216o;
            int i10 = this.f17214m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f17211i;
        }
        if (i5 == 16) {
            this.f17212k = new String(this.f17205c, this.f17206d, this.j);
            this.f17206d += this.j;
        } else if (i5 == 8 || i5 == 9) {
            this.f17212k = c0(i5 == 8 ? '\'' : '\"');
        } else if (i5 == 10) {
            this.f17212k = f0();
        } else if (i5 != 11) {
            throw new IllegalStateException("Expected a double but was " + h0() + J());
        }
        this.f17210h = 11;
        double parseDouble = Double.parseDouble(this.f17212k);
        if (!this.f17204b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + J());
        }
        this.f17212k = null;
        this.f17210h = 0;
        int[] iArr2 = this.f17216o;
        int i11 = this.f17214m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public final int O() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            long j = this.f17211i;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f17211i + J());
            }
            this.f17210h = 0;
            int[] iArr = this.f17216o;
            int i11 = this.f17214m - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (i5 == 16) {
            this.f17212k = new String(this.f17205c, this.f17206d, this.j);
            this.f17206d += this.j;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw new IllegalStateException("Expected an int but was " + h0() + J());
            }
            if (i5 == 10) {
                this.f17212k = f0();
            } else {
                this.f17212k = c0(i5 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f17212k);
                this.f17210h = 0;
                int[] iArr2 = this.f17216o;
                int i12 = this.f17214m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f17210h = 11;
        double parseDouble = Double.parseDouble(this.f17212k);
        int i13 = (int) parseDouble;
        if (i13 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f17212k + J());
        }
        this.f17212k = null;
        this.f17210h = 0;
        int[] iArr3 = this.f17216o;
        int i14 = this.f17214m - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public final long R() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            this.f17210h = 0;
            int[] iArr = this.f17216o;
            int i10 = this.f17214m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f17211i;
        }
        if (i5 == 16) {
            this.f17212k = new String(this.f17205c, this.f17206d, this.j);
            this.f17206d += this.j;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw new IllegalStateException("Expected a long but was " + h0() + J());
            }
            if (i5 == 10) {
                this.f17212k = f0();
            } else {
                this.f17212k = c0(i5 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f17212k);
                this.f17210h = 0;
                int[] iArr2 = this.f17216o;
                int i11 = this.f17214m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f17210h = 11;
        double parseDouble = Double.parseDouble(this.f17212k);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f17212k + J());
        }
        this.f17212k = null;
        this.f17210h = 0;
        int[] iArr3 = this.f17216o;
        int i12 = this.f17214m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j;
    }

    public final String U() {
        String c02;
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 14) {
            c02 = f0();
        } else if (i5 == 12) {
            c02 = c0('\'');
        } else {
            if (i5 != 13) {
                throw new IllegalStateException("Expected a name but was " + h0() + J());
            }
            c02 = c0('\"');
        }
        this.f17210h = 0;
        this.f17215n[this.f17214m - 1] = c02;
        return c02;
    }

    public final int W(boolean z5) {
        char c2;
        int i5 = this.f17206d;
        int i10 = this.f17207e;
        while (true) {
            if (i5 == i10) {
                this.f17206d = i5;
                if (!y(1)) {
                    if (!z5) {
                        return -1;
                    }
                    throw new EOFException("End of input" + J());
                }
                i5 = this.f17206d;
                i10 = this.f17207e;
            }
            int i11 = i5 + 1;
            char[] cArr = this.f17205c;
            c2 = cArr[i5];
            if (c2 == '\n') {
                this.f17208f++;
                this.f17209g = i11;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f17206d = i11;
                    if (i11 == i10) {
                        this.f17206d = i5;
                        boolean y5 = y(2);
                        this.f17206d++;
                        if (!y5) {
                            break;
                        }
                    }
                    n();
                    int i12 = this.f17206d;
                    char c8 = cArr[i12];
                    if (c8 == '*') {
                        this.f17206d = i12 + 1;
                        while (true) {
                            if (this.f17206d + 2 > this.f17207e && !y(2)) {
                                o0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f17206d;
                            if (cArr[i13] != '\n') {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    if (cArr[this.f17206d + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                }
                                i5 = this.f17206d + 2;
                                i10 = this.f17207e;
                                break;
                            }
                            this.f17208f++;
                            this.f17209g = i13 + 1;
                            this.f17206d++;
                        }
                    } else {
                        if (c8 != '/') {
                            break;
                        }
                        this.f17206d = i12 + 1;
                        l0();
                        i5 = this.f17206d;
                        i10 = this.f17207e;
                    }
                } else {
                    if (c2 != '#') {
                        this.f17206d = i11;
                        return c2;
                    }
                    this.f17206d = i11;
                    n();
                    l0();
                    i5 = this.f17206d;
                    i10 = this.f17207e;
                }
            }
            i5 = i11;
        }
        return c2;
    }

    public final void Y() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 7) {
            throw new IllegalStateException("Expected null but was " + h0() + J());
        }
        this.f17210h = 0;
        int[] iArr = this.f17216o;
        int i10 = this.f17214m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void c() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 3) {
            i0(1);
            this.f17216o[this.f17214m - 1] = 0;
            this.f17210h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + h0() + J());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f17206d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f17206d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c0(char c2) {
        char[] cArr;
        int i5;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f17206d;
            int i11 = this.f17207e;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (true) {
                    cArr = this.f17205c;
                    if (i10 >= i12) {
                        break;
                    }
                    int i14 = i10 + 1;
                    char c8 = cArr[i10];
                    if (c8 == c2) {
                        this.f17206d = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    if (c8 == '\\') {
                        break;
                    }
                    if (c8 == '\n') {
                        this.f17208f++;
                        this.f17209g = i14;
                    }
                    i10 = i14;
                }
                sb2.append(cArr, i13, i5);
                sb2.append(j0());
                i10 = this.f17206d;
                i11 = this.f17207e;
            }
        } while (y(1));
        o0("Unterminated string");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17210h = 0;
        this.f17213l[0] = 8;
        this.f17214m = 1;
        this.f17203a.close();
    }

    public final String d0() {
        String str;
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 10) {
            str = f0();
        } else if (i5 == 8) {
            str = c0('\'');
        } else if (i5 == 9) {
            str = c0('\"');
        } else if (i5 == 11) {
            str = this.f17212k;
            this.f17212k = null;
        } else if (i5 == 15) {
            str = Long.toString(this.f17211i);
        } else {
            if (i5 != 16) {
                throw new IllegalStateException("Expected a string but was " + h0() + J());
            }
            str = new String(this.f17205c, this.f17206d, this.j);
            this.f17206d += this.j;
        }
        this.f17210h = 0;
        int[] iArr = this.f17216o;
        int i10 = this.f17214m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        n();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f0() {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i5 = 0;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f17206d;
                int i12 = i11 + i10;
                int i13 = this.f17207e;
                cArr = this.f17205c;
                if (i12 < i13) {
                    char c2 = cArr[i11 + i10];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i10 >= cArr.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb3.append(cArr, this.f17206d, i10);
                    this.f17206d += i10;
                } else if (y(i10 + 1)) {
                }
            }
            i5 = i10;
            if (sb3 != null) {
                sb2 = new String(cArr, this.f17206d, i5);
            } else {
                sb3.append(cArr, this.f17206d, i5);
                sb2 = sb3.toString();
            }
            this.f17206d += i5;
            return sb2;
        } while (y(1));
        if (sb3 != null) {
        }
        this.f17206d += i5;
        return sb2;
    }

    public final b h0() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        switch (i5) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void i0(int i5) {
        int i10 = this.f17214m;
        int[] iArr = this.f17213l;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.f17213l = Arrays.copyOf(iArr, i11);
            this.f17216o = Arrays.copyOf(this.f17216o, i11);
            this.f17215n = (String[]) Arrays.copyOf(this.f17215n, i11);
        }
        int[] iArr2 = this.f17213l;
        int i12 = this.f17214m;
        this.f17214m = i12 + 1;
        iArr2[i12] = i5;
    }

    public final char j0() {
        int i5;
        if (this.f17206d == this.f17207e && !y(1)) {
            o0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f17206d;
        int i11 = i10 + 1;
        this.f17206d = i11;
        char[] cArr = this.f17205c;
        char c2 = cArr[i10];
        if (c2 == '\n') {
            this.f17208f++;
            this.f17209g = i11;
            return c2;
        }
        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            o0("Invalid escape sequence");
            throw null;
        }
        if (i10 + 5 > this.f17207e && !y(4)) {
            o0("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f17206d;
        int i13 = i12 + 4;
        char c8 = 0;
        while (i12 < i13) {
            char c10 = cArr[i12];
            char c11 = (char) (c8 << 4);
            if (c10 >= '0' && c10 <= '9') {
                i5 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i5 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f17206d, 4)));
                }
                i5 = c10 - '7';
            }
            c8 = (char) (i5 + c11);
            i12++;
        }
        this.f17206d += 4;
        return c8;
    }

    public final void k() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 1) {
            i0(3);
            this.f17210h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + h0() + J());
        }
    }

    public final void k0(char c2) {
        do {
            int i5 = this.f17206d;
            int i10 = this.f17207e;
            while (i5 < i10) {
                int i11 = i5 + 1;
                char c8 = this.f17205c[i5];
                if (c8 == c2) {
                    this.f17206d = i11;
                    return;
                }
                if (c8 == '\\') {
                    this.f17206d = i11;
                    j0();
                    i5 = this.f17206d;
                    i10 = this.f17207e;
                } else {
                    if (c8 == '\n') {
                        this.f17208f++;
                        this.f17209g = i11;
                    }
                    i5 = i11;
                }
            }
            this.f17206d = i5;
        } while (y(1));
        o0("Unterminated string");
        throw null;
    }

    public final void l0() {
        char c2;
        do {
            if (this.f17206d >= this.f17207e && !y(1)) {
                return;
            }
            int i5 = this.f17206d;
            int i10 = i5 + 1;
            this.f17206d = i10;
            c2 = this.f17205c[i5];
            if (c2 == '\n') {
                this.f17208f++;
                this.f17209g = i10;
                return;
            }
        } while (c2 != '\r');
    }

    public final void n() {
        if (this.f17204b) {
            return;
        }
        o0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void o0(String str) {
        StringBuilder b10 = f.b(str);
        b10.append(J());
        throw new d(b10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0215, code lost:
    
        if (C(r1) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019d, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0218, code lost:
    
        if (r7 != 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021a, code lost:
    
        if (r13 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0220, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0222, code lost:
    
        if (r17 == 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0229, code lost:
    
        if (r14 != r21) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022b, code lost:
    
        if (r17 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022d, code lost:
    
        if (r17 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0230, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0231, code lost:
    
        r23.f17211i = r14;
        r23.f17206d += r11;
        r9 = 15;
        r23.f17210h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0225, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023d, code lost:
    
        if (r7 == r9) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0240, code lost:
    
        if (r7 == 4) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0243, code lost:
    
        if (r7 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0245, code lost:
    
        r23.j = r11;
        r9 = 16;
        r23.f17210h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r() {
        int W;
        int i5;
        int W2;
        int i10;
        String str;
        String str2;
        int i11;
        char c2;
        long j;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f17213l;
        int i15 = 1;
        int i16 = this.f17214m - 1;
        int i17 = iArr[i16];
        char[] cArr = this.f17205c;
        if (i17 == 1) {
            iArr[i16] = 2;
        } else if (i17 == 2) {
            int W3 = W(true);
            if (W3 != 44) {
                if (W3 != 59) {
                    if (W3 == 93) {
                        this.f17210h = 4;
                        return 4;
                    }
                    o0("Unterminated array");
                    throw null;
                }
                n();
            }
        } else {
            if (i17 == 3 || i17 == 5) {
                iArr[i16] = 4;
                if (i17 == 5 && (W = W(true)) != 44) {
                    if (W != 59) {
                        if (W == 125) {
                            this.f17210h = 2;
                            return 2;
                        }
                        o0("Unterminated object");
                        throw null;
                    }
                    n();
                }
                int W4 = W(true);
                if (W4 == 34) {
                    this.f17210h = 13;
                    return 13;
                }
                if (W4 == 39) {
                    n();
                    this.f17210h = 12;
                    return 12;
                }
                if (W4 == 125) {
                    if (i17 != 5) {
                        this.f17210h = 2;
                        return 2;
                    }
                    o0("Expected name");
                    throw null;
                }
                n();
                this.f17206d--;
                if (C((char) W4)) {
                    this.f17210h = 14;
                    return 14;
                }
                o0("Expected name");
                throw null;
            }
            if (i17 == 4) {
                iArr[i16] = 5;
                int W5 = W(true);
                if (W5 != 58) {
                    if (W5 != 61) {
                        o0("Expected ':'");
                        throw null;
                    }
                    n();
                    if (this.f17206d < this.f17207e || y(1)) {
                        int i18 = this.f17206d;
                        if (cArr[i18] == '>') {
                            this.f17206d = i18 + 1;
                        }
                    }
                }
            } else {
                if (i17 != 6) {
                    if (i17 == 7) {
                        i5 = 0;
                        if (W(false) == -1) {
                            this.f17210h = 17;
                            return 17;
                        }
                        n();
                        this.f17206d--;
                    } else {
                        i5 = 0;
                        if (i17 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    W2 = W(true);
                    if (W2 != 34) {
                        this.f17210h = 9;
                        return 9;
                    }
                    if (W2 == 39) {
                        n();
                        this.f17210h = 8;
                        return 8;
                    }
                    if (W2 == 44 || W2 == 59) {
                        i10 = 1;
                    } else {
                        if (W2 == 91) {
                            this.f17210h = 3;
                            return 3;
                        }
                        if (W2 == 93) {
                            i10 = 1;
                            if (i17 == 1) {
                                this.f17210h = 4;
                                return 4;
                            }
                        } else {
                            if (W2 == 123) {
                                this.f17210h = 1;
                                return 1;
                            }
                            int i19 = this.f17206d - 1;
                            this.f17206d = i19;
                            char c8 = cArr[i19];
                            if (c8 == 't' || c8 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i11 = 5;
                            } else if (c8 == 'f' || c8 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i11 = 6;
                            } else {
                                if (c8 == 'n' || c8 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i11 = 7;
                                }
                                i11 = i5;
                                if (i11 == 0) {
                                    return i11;
                                }
                                int i20 = this.f17206d;
                                int i21 = this.f17207e;
                                int i22 = i5;
                                int i23 = i22;
                                int i24 = i23;
                                boolean z5 = true;
                                long j6 = 0;
                                while (true) {
                                    if (i20 + i23 == i21) {
                                        if (i23 == cArr.length) {
                                            break;
                                        }
                                        if (!y(i23 + 1)) {
                                            j = 0;
                                            break;
                                        }
                                        int i25 = this.f17206d;
                                        i21 = this.f17207e;
                                        i20 = i25;
                                    }
                                    char c10 = cArr[i20 + i23];
                                    j = 0;
                                    if (c10 != '+') {
                                        if (c10 == 'E' || c10 == 'e') {
                                            i12 = i21;
                                            if (i22 != 2 && i22 != 4) {
                                                break;
                                            }
                                            i22 = 5;
                                            i23++;
                                            i21 = i12;
                                            i15 = 1;
                                        } else if (c10 == '-') {
                                            i12 = i21;
                                            i13 = 6;
                                            if (i22 == 0) {
                                                i22 = 1;
                                                i24 = 1;
                                                i23++;
                                                i21 = i12;
                                                i15 = 1;
                                            } else {
                                                if (i22 != 5) {
                                                    break;
                                                }
                                                i22 = i13;
                                                i23++;
                                                i21 = i12;
                                                i15 = 1;
                                            }
                                        } else if (c10 == '.') {
                                            i12 = i21;
                                            if (i22 != 2) {
                                                break;
                                            }
                                            i22 = 3;
                                            i23++;
                                            i21 = i12;
                                            i15 = 1;
                                        } else {
                                            if (c10 < '0' || c10 > '9') {
                                                break;
                                            }
                                            if (i22 == i15 || i22 == 0) {
                                                i12 = i21;
                                                j6 = -(c10 - '0');
                                                i22 = 2;
                                            } else if (i22 != 2) {
                                                i12 = i21;
                                                if (i22 == 3) {
                                                    i22 = 4;
                                                } else if (i22 == 5 || i22 == 6) {
                                                    i22 = 7;
                                                }
                                            } else {
                                                if (j6 == 0) {
                                                    break;
                                                }
                                                i12 = i21;
                                                long j10 = (10 * j6) - (c10 - '0');
                                                z5 &= j6 > Buffer.OVERFLOW_ZONE || (j6 == Buffer.OVERFLOW_ZONE && j10 < j6);
                                                j6 = j10;
                                            }
                                            i23++;
                                            i21 = i12;
                                            i15 = 1;
                                        }
                                        if (i14 == 0) {
                                            return i14;
                                        }
                                        if (!C(cArr[this.f17206d])) {
                                            o0("Expected value");
                                            throw null;
                                        }
                                        n();
                                        this.f17210h = 10;
                                        return 10;
                                    }
                                    i12 = i21;
                                    i13 = 6;
                                    if (i22 != 5) {
                                        break;
                                    }
                                    i22 = i13;
                                    i23++;
                                    i21 = i12;
                                    i15 = 1;
                                }
                                i14 = 0;
                                if (i14 == 0) {
                                }
                            }
                            int length = str.length();
                            int i26 = 1;
                            while (true) {
                                if (i26 < length) {
                                    if ((this.f17206d + i26 >= this.f17207e && !y(i26 + 1)) || ((c2 = cArr[this.f17206d + i26]) != str.charAt(i26) && c2 != str2.charAt(i26))) {
                                        break;
                                    }
                                    i26++;
                                } else if ((this.f17206d + length >= this.f17207e && !y(length + 1)) || !C(cArr[this.f17206d + length])) {
                                    this.f17206d += length;
                                    this.f17210h = i11;
                                }
                            }
                            i11 = i5;
                            if (i11 == 0) {
                            }
                        }
                    }
                    if (i17 != i10 && i17 != 2) {
                        o0("Unexpected value");
                        throw null;
                    }
                    n();
                    this.f17206d -= i10;
                    this.f17210h = 7;
                    return 7;
                }
                if (this.f17204b) {
                    W(true);
                    int i27 = this.f17206d;
                    int i28 = i27 - 1;
                    this.f17206d = i28;
                    if ((i27 + 4 <= this.f17207e || y(5)) && cArr[i28] == ')' && cArr[i27] == ']' && cArr[i27 + 1] == '}' && cArr[i27 + 2] == '\'' && cArr[i27 + 3] == '\n') {
                        this.f17206d += 5;
                    }
                }
                this.f17213l[this.f17214m - 1] = 7;
            }
        }
        i5 = 0;
        W2 = W(true);
        if (W2 != 34) {
        }
    }

    public final void t() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + h0() + J());
        }
        int i10 = this.f17214m;
        this.f17214m = i10 - 1;
        int[] iArr = this.f17216o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f17210h = 0;
    }

    public final String toString() {
        return a.class.getSimpleName() + J();
    }

    public final void w() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + h0() + J());
        }
        int i10 = this.f17214m;
        int i11 = i10 - 1;
        this.f17214m = i11;
        this.f17215n[i11] = null;
        int[] iArr = this.f17216o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f17210h = 0;
    }

    public final boolean y(int i5) {
        int i10;
        int i11;
        int i12 = this.f17209g;
        int i13 = this.f17206d;
        this.f17209g = i12 - i13;
        int i14 = this.f17207e;
        char[] cArr = this.f17205c;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f17207e = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f17207e = 0;
        }
        this.f17206d = 0;
        do {
            int i16 = this.f17207e;
            int read = this.f17203a.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f17207e + read;
            this.f17207e = i10;
            if (this.f17208f == 0 && (i11 = this.f17209g) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f17206d++;
                this.f17209g = i11 + 1;
                i5++;
            }
        } while (i10 < i5);
        return true;
    }

    public final boolean z() {
        int i5 = this.f17210h;
        if (i5 == 0) {
            i5 = r();
        }
        return (i5 == 2 || i5 == 4) ? false : true;
    }
}
