package r9;

import androidx.appcompat.widget.c1;
import d9.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import okio.Segment;
import okio.internal.Buffer;
import r4.k;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f22319a;

    /* renamed from: h, reason: collision with root package name */
    public long f22326h;

    /* renamed from: i, reason: collision with root package name */
    public int f22327i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f22328k;

    /* renamed from: m, reason: collision with root package name */
    public String[] f22330m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f22331n;

    /* renamed from: o, reason: collision with root package name */
    public int f22332o = 2;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f22320b = new char[Segment.SHARE_MINIMUM];

    /* renamed from: c, reason: collision with root package name */
    public int f22321c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f22322d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f22323e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f22324f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f22325g = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f22329l = 1;

    static {
        m7.b.f20428c = new m7.b(4);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f22328k = iArr;
        iArr[0] = 6;
        this.f22330m = new String[32];
        this.f22331n = new int[32];
        this.f22319a = reader;
    }

    public final boolean C() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        return (i5 == 2 || i5 == 4 || i5 == 17) ? false : true;
    }

    public final boolean J(char c2) {
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

    public final String K() {
        return " at line " + (this.f22323e + 1) + " column " + ((this.f22321c - this.f22324f) + 1) + " path " + z(false);
    }

    public final boolean N() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 5) {
            this.f22325g = 0;
            int[] iArr = this.f22331n;
            int i10 = this.f22329l - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i5 != 6) {
            throw u0("a boolean");
        }
        this.f22325g = 0;
        int[] iArr2 = this.f22331n;
        int i11 = this.f22329l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double O() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            this.f22325g = 0;
            int[] iArr = this.f22331n;
            int i10 = this.f22329l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f22326h;
        }
        if (i5 == 16) {
            this.j = new String(this.f22320b, this.f22321c, this.f22327i);
            this.f22321c += this.f22327i;
        } else if (i5 == 8 || i5 == 9) {
            this.j = d0(i5 == 8 ? '\'' : '\"');
        } else if (i5 == 10) {
            this.j = h0();
        } else if (i5 != 11) {
            throw u0("a double");
        }
        this.f22325g = 11;
        double parseDouble = Double.parseDouble(this.j);
        if (this.f22332o != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            t0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.j = null;
        this.f22325g = 0;
        int[] iArr2 = this.f22331n;
        int i11 = this.f22329l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public final int R() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            long j = this.f22326h;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f22326h + K());
            }
            this.f22325g = 0;
            int[] iArr = this.f22331n;
            int i11 = this.f22329l - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (i5 == 16) {
            this.j = new String(this.f22320b, this.f22321c, this.f22327i);
            this.f22321c += this.f22327i;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw u0("an int");
            }
            if (i5 == 10) {
                this.j = h0();
            } else {
                this.j = d0(i5 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.j);
                this.f22325g = 0;
                int[] iArr2 = this.f22331n;
                int i12 = this.f22329l - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22325g = 11;
        double parseDouble = Double.parseDouble(this.j);
        int i13 = (int) parseDouble;
        if (i13 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.j + K());
        }
        this.j = null;
        this.f22325g = 0;
        int[] iArr3 = this.f22331n;
        int i14 = this.f22329l - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public final long U() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 15) {
            this.f22325g = 0;
            int[] iArr = this.f22331n;
            int i10 = this.f22329l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f22326h;
        }
        if (i5 == 16) {
            this.j = new String(this.f22320b, this.f22321c, this.f22327i);
            this.f22321c += this.f22327i;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                throw u0("a long");
            }
            if (i5 == 10) {
                this.j = h0();
            } else {
                this.j = d0(i5 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.j);
                this.f22325g = 0;
                int[] iArr2 = this.f22331n;
                int i11 = this.f22329l - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22325g = 11;
        double parseDouble = Double.parseDouble(this.j);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.j + K());
        }
        this.j = null;
        this.f22325g = 0;
        int[] iArr3 = this.f22331n;
        int i12 = this.f22329l - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j;
    }

    public final String W() {
        String d02;
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 14) {
            d02 = h0();
        } else if (i5 == 12) {
            d02 = d0('\'');
        } else {
            if (i5 != 13) {
                throw u0("a name");
            }
            d02 = d0('\"');
        }
        this.f22325g = 0;
        this.f22330m[this.f22329l - 1] = d02;
        return d02;
    }

    public final int Y(boolean z5) {
        char c2;
        int i5 = this.f22321c;
        int i10 = this.f22322d;
        while (true) {
            if (i5 == i10) {
                this.f22321c = i5;
                if (!y(1)) {
                    if (!z5) {
                        return -1;
                    }
                    throw new EOFException("End of input" + K());
                }
                i5 = this.f22321c;
                i10 = this.f22322d;
            }
            int i11 = i5 + 1;
            char[] cArr = this.f22320b;
            c2 = cArr[i5];
            if (c2 == '\n') {
                this.f22323e++;
                this.f22324f = i11;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f22321c = i11;
                    if (i11 == i10) {
                        this.f22321c = i5;
                        boolean y5 = y(2);
                        this.f22321c++;
                        if (!y5) {
                            break;
                        }
                    }
                    n();
                    int i12 = this.f22321c;
                    char c8 = cArr[i12];
                    if (c8 == '*') {
                        this.f22321c = i12 + 1;
                        while (true) {
                            if (this.f22321c + 2 > this.f22322d && !y(2)) {
                                t0("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f22321c;
                            if (cArr[i13] != '\n') {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    if (cArr[this.f22321c + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                }
                                i5 = this.f22321c + 2;
                                i10 = this.f22322d;
                                break;
                            }
                            this.f22323e++;
                            this.f22324f = i13 + 1;
                            this.f22321c++;
                        }
                    } else {
                        if (c8 != '/') {
                            break;
                        }
                        this.f22321c = i12 + 1;
                        o0();
                        i5 = this.f22321c;
                        i10 = this.f22322d;
                    }
                } else {
                    if (c2 != '#') {
                        this.f22321c = i11;
                        return c2;
                    }
                    this.f22321c = i11;
                    n();
                    o0();
                    i5 = this.f22321c;
                    i10 = this.f22322d;
                }
            }
            i5 = i11;
        }
        return c2;
    }

    public final void c() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 3) {
            throw u0("BEGIN_ARRAY");
        }
        j0(1);
        this.f22331n[this.f22329l - 1] = 0;
        this.f22325g = 0;
    }

    public final void c0() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 7) {
            throw u0("null");
        }
        this.f22325g = 0;
        int[] iArr = this.f22331n;
        int i10 = this.f22329l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22325g = 0;
        this.f22328k[0] = 8;
        this.f22329l = 1;
        this.f22319a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.f22321c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f22321c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d0(char c2) {
        char[] cArr;
        int i5;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f22321c;
            int i11 = this.f22322d;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (true) {
                    cArr = this.f22320b;
                    if (i10 >= i12) {
                        break;
                    }
                    int i14 = i10 + 1;
                    char c8 = cArr[i10];
                    if (this.f22332o == 3 && c8 < ' ') {
                        t0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c8 == c2) {
                        this.f22321c = i14;
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
                        this.f22323e++;
                        this.f22324f = i14;
                    }
                    i10 = i14;
                }
                sb2.append(cArr, i13, i5);
                sb2.append(k0());
                i10 = this.f22321c;
                i11 = this.f22322d;
            }
        } while (y(1));
        t0("Unterminated string");
        throw null;
    }

    public final String f0() {
        String str;
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 == 10) {
            str = h0();
        } else if (i5 == 8) {
            str = d0('\'');
        } else if (i5 == 9) {
            str = d0('\"');
        } else if (i5 == 11) {
            str = this.j;
            this.j = null;
        } else if (i5 == 15) {
            str = Long.toString(this.f22326h);
        } else {
            if (i5 != 16) {
                throw u0("a string");
            }
            str = new String(this.f22320b, this.f22321c, this.f22327i);
            this.f22321c += this.f22327i;
        }
        this.f22325g = 0;
        int[] iArr = this.f22331n;
        int i10 = this.f22329l - 1;
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
    public final String h0() {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i5 = 0;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f22321c;
                int i12 = i11 + i10;
                int i13 = this.f22322d;
                cArr = this.f22320b;
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
                    sb3.append(cArr, this.f22321c, i10);
                    this.f22321c += i10;
                } else if (y(i10 + 1)) {
                }
            }
            i5 = i10;
            if (sb3 != null) {
                sb2 = new String(cArr, this.f22321c, i5);
            } else {
                sb3.append(cArr, this.f22321c, i5);
                sb2 = sb3.toString();
            }
            this.f22321c += i5;
            return sb2;
        } while (y(1));
        if (sb3 != null) {
        }
        this.f22321c += i5;
        return sb2;
    }

    public final int i0() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        switch (i5) {
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
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void j0(int i5) {
        int i10 = this.f22329l;
        if (i10 - 1 >= 255) {
            throw new c("Nesting limit 255 reached" + K());
        }
        int[] iArr = this.f22328k;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.f22328k = Arrays.copyOf(iArr, i11);
            this.f22331n = Arrays.copyOf(this.f22331n, i11);
            this.f22330m = (String[]) Arrays.copyOf(this.f22330m, i11);
        }
        int[] iArr2 = this.f22328k;
        int i12 = this.f22329l;
        this.f22329l = i12 + 1;
        iArr2[i12] = i5;
    }

    public final void k() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 1) {
            throw u0("BEGIN_OBJECT");
        }
        j0(3);
        this.f22325g = 0;
    }

    public final char k0() {
        int i5;
        if (this.f22321c == this.f22322d && !y(1)) {
            t0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f22321c;
        int i11 = i10 + 1;
        this.f22321c = i11;
        char[] cArr = this.f22320b;
        char c2 = cArr[i10];
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
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
                            t0("Invalid escape sequence");
                            throw null;
                        }
                        if (i10 + 5 > this.f22322d && !y(4)) {
                            t0("Unterminated escape sequence");
                            throw null;
                        }
                        int i12 = this.f22321c;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char c8 = cArr[i12];
                            int i15 = i14 << 4;
                            if (c8 >= '0' && c8 <= '9') {
                                i5 = c8 - '0';
                            } else if (c8 >= 'a' && c8 <= 'f') {
                                i5 = c8 - 'W';
                            } else {
                                if (c8 < 'A' || c8 > 'F') {
                                    t0("Malformed Unicode escape \\u".concat(new String(cArr, this.f22321c, 4)));
                                    throw null;
                                }
                                i5 = c8 - '7';
                            }
                            i14 = i5 + i15;
                            i12++;
                        }
                        this.f22321c += 4;
                        return (char) i14;
                    }
                }
            }
            return c2;
        }
        if (this.f22332o == 3) {
            t0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f22323e++;
        this.f22324f = i11;
        if (this.f22332o == 3) {
            t0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c2;
    }

    public final void l0(char c2) {
        do {
            int i5 = this.f22321c;
            int i10 = this.f22322d;
            while (i5 < i10) {
                int i11 = i5 + 1;
                char c8 = this.f22320b[i5];
                if (c8 == c2) {
                    this.f22321c = i11;
                    return;
                }
                if (c8 == '\\') {
                    this.f22321c = i11;
                    k0();
                    i5 = this.f22321c;
                    i10 = this.f22322d;
                } else {
                    if (c8 == '\n') {
                        this.f22323e++;
                        this.f22324f = i11;
                    }
                    i5 = i11;
                }
            }
            this.f22321c = i5;
        } while (y(1));
        t0("Unterminated string");
        throw null;
    }

    public final void n() {
        if (this.f22332o == 1) {
            return;
        }
        t0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void o0() {
        char c2;
        do {
            if (this.f22321c >= this.f22322d && !y(1)) {
                return;
            }
            int i5 = this.f22321c;
            int i10 = i5 + 1;
            this.f22321c = i10;
            c2 = this.f22320b[i5];
            if (c2 == '\n') {
                this.f22323e++;
                this.f22324f = i10;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        do {
            int i5 = 0;
            while (true) {
                int i10 = this.f22321c;
                if (i10 + i5 < this.f22322d) {
                    char c2 = this.f22320b[i10 + i5];
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
                                                    i5++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f22321c = i10 + i5;
                }
            }
            this.f22321c += i5;
            return;
        } while (y(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0218, code lost:
    
        if (J(r12) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a9, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021b, code lost:
    
        if (r5 != 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021d, code lost:
    
        if (r10 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0223, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0225, code lost:
    
        if (r17 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022c, code lost:
    
        if (r1 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022e, code lost:
    
        if (r17 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0230, code lost:
    
        if (r17 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0233, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0234, code lost:
    
        r24.f22326h = r1;
        r24.f22321c += r7;
        r9 = 15;
        r24.f22325g = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0240, code lost:
    
        if (r5 == r13) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r5 == 4) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r5 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r24.f22327i = r7;
        r9 = 16;
        r24.f22325g = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r() {
        int Y;
        int i5;
        int Y2;
        String str;
        String str2;
        int i10;
        char c2;
        int i11;
        int[] iArr = this.f22328k;
        int i12 = this.f22329l - 1;
        int i13 = iArr[i12];
        char[] cArr = this.f22320b;
        if (i13 == 1) {
            iArr[i12] = 2;
        } else if (i13 == 2) {
            int Y3 = Y(true);
            if (Y3 != 44) {
                if (Y3 != 59) {
                    if (Y3 == 93) {
                        this.f22325g = 4;
                        return 4;
                    }
                    t0("Unterminated array");
                    throw null;
                }
                n();
            }
        } else {
            if (i13 == 3 || i13 == 5) {
                iArr[i12] = 4;
                if (i13 == 5 && (Y = Y(true)) != 44) {
                    if (Y != 59) {
                        if (Y == 125) {
                            this.f22325g = 2;
                            return 2;
                        }
                        t0("Unterminated object");
                        throw null;
                    }
                    n();
                }
                int Y4 = Y(true);
                if (Y4 == 34) {
                    this.f22325g = 13;
                    return 13;
                }
                if (Y4 == 39) {
                    n();
                    this.f22325g = 12;
                    return 12;
                }
                if (Y4 == 125) {
                    if (i13 != 5) {
                        this.f22325g = 2;
                        return 2;
                    }
                    t0("Expected name");
                    throw null;
                }
                n();
                this.f22321c--;
                if (J((char) Y4)) {
                    this.f22325g = 14;
                    return 14;
                }
                t0("Expected name");
                throw null;
            }
            if (i13 == 4) {
                iArr[i12] = 5;
                int Y5 = Y(true);
                if (Y5 != 58) {
                    if (Y5 != 61) {
                        t0("Expected ':'");
                        throw null;
                    }
                    n();
                    if (this.f22321c < this.f22322d || y(1)) {
                        int i14 = this.f22321c;
                        if (cArr[i14] == '>') {
                            this.f22321c = i14 + 1;
                        }
                    }
                }
            } else {
                if (i13 != 6) {
                    if (i13 == 7) {
                        i5 = 0;
                        if (Y(false) == -1) {
                            this.f22325g = 17;
                            return 17;
                        }
                        n();
                        this.f22321c--;
                    } else {
                        i5 = 0;
                        if (i13 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    Y2 = Y(true);
                    if (Y2 != 34) {
                        this.f22325g = 9;
                        return 9;
                    }
                    if (Y2 == 39) {
                        n();
                        this.f22325g = 8;
                        return 8;
                    }
                    if (Y2 != 44 && Y2 != 59) {
                        if (Y2 == 91) {
                            this.f22325g = 3;
                            return 3;
                        }
                        if (Y2 != 93) {
                            if (Y2 == 123) {
                                this.f22325g = 1;
                                return 1;
                            }
                            int i15 = this.f22321c - 1;
                            this.f22321c = i15;
                            char c8 = cArr[i15];
                            if (c8 == 't' || c8 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i10 = 5;
                            } else if (c8 == 'f' || c8 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i10 = 6;
                            } else {
                                if (c8 == 'n' || c8 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i10 = 7;
                                }
                                i10 = i5;
                                if (i10 == 0) {
                                    return i10;
                                }
                                int i16 = this.f22321c;
                                int i17 = this.f22322d;
                                int i18 = i5;
                                int i19 = i18;
                                int i20 = i19;
                                int i21 = i16;
                                boolean z5 = true;
                                long j = 0;
                                while (true) {
                                    if (i21 + i19 == i17) {
                                        if (i19 == cArr.length) {
                                            break;
                                        }
                                        if (!y(i19 + 1)) {
                                            break;
                                        }
                                        i21 = this.f22321c;
                                        i17 = this.f22322d;
                                    }
                                    char c10 = cArr[i21 + i19];
                                    if (c10 != '+') {
                                        if (c10 == 'E' || c10 == 'e') {
                                            if (i18 != 2 && i18 != 4) {
                                                break;
                                            }
                                            i18 = 5;
                                            i19++;
                                        } else if (c10 != '-') {
                                            if (c10 == '.') {
                                                if (i18 != 2) {
                                                    break;
                                                }
                                                i18 = 3;
                                                i19++;
                                            } else {
                                                if (c10 < '0' || c10 > '9') {
                                                    break;
                                                }
                                                if (i18 == 1 || i18 == 0) {
                                                    j = -(c10 - '0');
                                                    i18 = 2;
                                                } else if (i18 == 2) {
                                                    if (j == 0) {
                                                        break;
                                                    }
                                                    long j6 = (10 * j) - (c10 - '0');
                                                    z5 &= j > Buffer.OVERFLOW_ZONE || (j == Buffer.OVERFLOW_ZONE && j6 < j);
                                                    j = j6;
                                                } else if (i18 == 3) {
                                                    i18 = 4;
                                                } else if (i18 == 5 || i18 == 6) {
                                                    i18 = 7;
                                                }
                                                i19++;
                                            }
                                        } else if (i18 == 0) {
                                            i18 = 1;
                                            i20 = 1;
                                            i19++;
                                        } else {
                                            if (i18 != 5) {
                                                break;
                                            }
                                            i18 = 6;
                                            i19++;
                                        }
                                        if (i11 == 0) {
                                            return i11;
                                        }
                                        if (!J(cArr[this.f22321c])) {
                                            t0("Expected value");
                                            throw null;
                                        }
                                        n();
                                        this.f22325g = 10;
                                        return 10;
                                    }
                                    if (i18 != 5) {
                                        break;
                                    }
                                    i18 = 6;
                                    i19++;
                                }
                                i11 = 0;
                                if (i11 == 0) {
                                }
                            }
                            int i22 = this.f22332o != 3 ? 1 : i5;
                            int length = str.length();
                            int i23 = i5;
                            while (true) {
                                if (i23 < length) {
                                    if ((this.f22321c + i23 >= this.f22322d && !y(i23 + 1)) || ((c2 = cArr[this.f22321c + i23]) != str.charAt(i23) && (i22 == 0 || c2 != str2.charAt(i23)))) {
                                        break;
                                    }
                                    i23++;
                                } else if ((this.f22321c + length >= this.f22322d && !y(length + 1)) || !J(cArr[this.f22321c + length])) {
                                    this.f22321c += length;
                                    this.f22325g = i10;
                                }
                            }
                            i10 = i5;
                            if (i10 == 0) {
                            }
                        } else if (i13 == 1) {
                            this.f22325g = 4;
                            return 4;
                        }
                    }
                    if (i13 != 1 && i13 != 2) {
                        t0("Unexpected value");
                        throw null;
                    }
                    n();
                    this.f22321c--;
                    this.f22325g = 7;
                    return 7;
                }
                if (this.f22332o == 1) {
                    Y(true);
                    int i24 = this.f22321c;
                    this.f22321c = i24 - 1;
                    if (i24 + 4 <= this.f22322d || y(5)) {
                        int i25 = this.f22321c;
                        if (cArr[i25] == ')' && cArr[i25 + 1] == ']' && cArr[i25 + 2] == '}' && cArr[i25 + 3] == '\'' && cArr[i25 + 4] == '\n') {
                            this.f22321c = i25 + 5;
                        }
                    }
                }
                this.f22328k[this.f22329l - 1] = 7;
            }
        }
        i5 = 0;
        Y2 = Y(true);
        if (Y2 != 34) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s0() {
        int i5 = 0;
        do {
            int i10 = this.f22325g;
            if (i10 == 0) {
                i10 = r();
            }
            switch (i10) {
                case 1:
                    j0(3);
                    i5++;
                    this.f22325g = 0;
                    break;
                case 2:
                    if (i5 == 0) {
                        this.f22330m[this.f22329l - 1] = null;
                    }
                    this.f22329l--;
                    i5--;
                    this.f22325g = 0;
                    break;
                case 3:
                    j0(1);
                    i5++;
                    this.f22325g = 0;
                    break;
                case 4:
                    this.f22329l--;
                    i5--;
                    this.f22325g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f22325g = 0;
                    break;
                case 8:
                    l0('\'');
                    this.f22325g = 0;
                    break;
                case 9:
                    l0('\"');
                    this.f22325g = 0;
                    break;
                case 10:
                    q0();
                    this.f22325g = 0;
                    break;
                case 12:
                    l0('\'');
                    if (i5 == 0) {
                        this.f22330m[this.f22329l - 1] = "<skipped>";
                    }
                    this.f22325g = 0;
                    break;
                case 13:
                    l0('\"');
                    if (i5 == 0) {
                        this.f22330m[this.f22329l - 1] = "<skipped>";
                    }
                    this.f22325g = 0;
                    break;
                case 14:
                    q0();
                    if (i5 == 0) {
                        this.f22330m[this.f22329l - 1] = "<skipped>";
                    }
                    this.f22325g = 0;
                    break;
                case 16:
                    this.f22321c += this.f22327i;
                    this.f22325g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i5 > 0);
        int[] iArr = this.f22331n;
        int i11 = this.f22329l - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void t() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 4) {
            throw u0("END_ARRAY");
        }
        int i10 = this.f22329l;
        this.f22329l = i10 - 1;
        int[] iArr = this.f22331n;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f22325g = 0;
    }

    public final void t0(String str) {
        StringBuilder b10 = f.b(str);
        b10.append(K());
        b10.append("\nSee ");
        b10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(b10.toString());
    }

    public final String toString() {
        return a.class.getSimpleName() + K();
    }

    public final IllegalStateException u0(String str) {
        String str2 = i0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder p10 = e.p("Expected ", str, " but was ");
        p10.append(k.u(i0()));
        p10.append(K());
        p10.append("\nSee ");
        p10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(p10.toString());
    }

    public final void w() {
        int i5 = this.f22325g;
        if (i5 == 0) {
            i5 = r();
        }
        if (i5 != 2) {
            throw u0("END_OBJECT");
        }
        int i10 = this.f22329l;
        int i11 = i10 - 1;
        this.f22329l = i11;
        this.f22330m[i11] = null;
        int[] iArr = this.f22331n;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f22325g = 0;
    }

    public final boolean y(int i5) {
        int i10;
        int i11;
        int i12 = this.f22324f;
        int i13 = this.f22321c;
        this.f22324f = i12 - i13;
        int i14 = this.f22322d;
        char[] cArr = this.f22320b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f22322d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f22322d = 0;
        }
        this.f22321c = 0;
        do {
            int i16 = this.f22322d;
            int read = this.f22319a.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f22322d + read;
            this.f22322d = i10;
            if (this.f22323e == 0 && (i11 = this.f22324f) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f22321c++;
                this.f22324f = i11 + 1;
                i5++;
            }
        } while (i10 < i5);
        return true;
    }

    public final String z(boolean z5) {
        StringBuilder sb2 = new StringBuilder("$");
        int i5 = 0;
        while (true) {
            int i10 = this.f22329l;
            if (i5 >= i10) {
                return sb2.toString();
            }
            int i11 = this.f22328k[i5];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.f22331n[i5];
                    if (z5 && i12 > 0 && i5 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f22330m[i5];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(c1.i(i11, "Unknown scope value: "));
            }
            i5++;
        }
    }
}
