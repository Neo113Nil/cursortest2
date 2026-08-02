package io.sentry.vendor.gson.stream;

import com.facebook.hermes.intl.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f52844a;

    /* renamed from: h, reason: collision with root package name */
    public long f52851h;

    /* renamed from: i, reason: collision with root package name */
    public int f52852i;

    /* renamed from: j, reason: collision with root package name */
    public String f52853j;
    private int[] pathIndices;
    private String[] pathNames;
    private int[] stack;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52845b = false;
    private final char[] buffer = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f52846c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f52847d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f52848e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f52849f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f52850g = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f52854k = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f52844a = reader;
    }

    public void A0() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 7) {
            this.f52850g = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f52854k - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + U());
    }

    public final boolean B(int i10) {
        int i11;
        int i12;
        char[] cArr = this.buffer;
        int i13 = this.f52849f;
        int i14 = this.f52846c;
        this.f52849f = i13 - i14;
        int i15 = this.f52847d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f52847d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f52847d = 0;
        }
        this.f52846c = 0;
        do {
            Reader reader = this.f52844a;
            int i17 = this.f52847d;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f52847d + read;
            this.f52847d = i11;
            if (this.f52848e == 0 && (i12 = this.f52849f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f52846c++;
                this.f52849f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public void C() {
        int i10 = 0;
        do {
            int i11 = this.f52850g;
            if (i11 == 0) {
                i11 = r();
            }
            if (i11 == 3) {
                T1(1);
            } else if (i11 == 1) {
                T1(3);
            } else {
                if (i11 == 4) {
                    this.f52854k--;
                } else if (i11 == 2) {
                    this.f52854k--;
                } else {
                    if (i11 == 14 || i11 == 10) {
                        c2();
                    } else if (i11 == 8 || i11 == 12) {
                        Z1('\'');
                    } else if (i11 == 9 || i11 == 13) {
                        Z1(Typography.quote);
                    } else if (i11 == 16) {
                        this.f52846c += this.f52852i;
                    }
                    this.f52850g = 0;
                }
                i10--;
                this.f52850g = 0;
            }
            i10++;
            this.f52850g = 0;
        } while (i10 != 0);
        int[] iArr = this.pathIndices;
        int i12 = this.f52854k;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.pathNames[i12 - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f52846c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String D0(char c10) {
        char[] cArr = this.buffer;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f52846c;
            int i11 = this.f52847d;
            while (true) {
                int i12 = i11;
                int i13 = i10;
                while (i10 < i12) {
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f52846c = i14;
                        int i15 = (i14 - i13) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f52846c = i14;
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                        }
                        sb2.append(cArr, i13, i17);
                        sb2.append(Y1());
                        i10 = this.f52846c;
                        i11 = this.f52847d;
                    } else {
                        if (c11 == '\n') {
                            this.f52848e++;
                            this.f52849f = i14;
                        }
                        i10 = i14;
                    }
                }
                break;
            }
        } while (B(1));
        throw d2("Unterminated string");
    }

    public final boolean J(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
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
        d();
        return false;
    }

    public String M0() {
        String str;
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 10) {
            str = m1();
        } else if (i10 == 8) {
            str = D0('\'');
        } else if (i10 == 9) {
            str = D0(Typography.quote);
        } else if (i10 == 11) {
            str = this.f52853j;
            this.f52853j = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f52851h);
        } else {
            if (i10 != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + U());
            }
            str = new String(this.buffer, this.f52846c, this.f52852i);
            this.f52846c += this.f52852i;
        }
        this.f52850g = 0;
        int[] iArr = this.pathIndices;
        int i11 = this.f52854k - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final void T1(int i10) {
        int i11 = this.f52854k;
        int[] iArr = this.stack;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.stack = Arrays.copyOf(iArr, i12);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i12);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i12);
        }
        int[] iArr2 = this.stack;
        int i13 = this.f52854k;
        this.f52854k = i13 + 1;
        iArr2[i13] = i10;
    }

    public String U() {
        return " at line " + (this.f52848e + 1) + " column " + ((this.f52846c - this.f52849f) + 1) + " path " + l();
    }

    public final char Y1() {
        int i10;
        if (this.f52846c == this.f52847d && !B(1)) {
            throw d2("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i11 = this.f52846c;
        int i12 = i11 + 1;
        this.f52846c = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f52848e++;
            this.f52849f = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw d2("Invalid escape sequence");
        }
        if (i11 + 5 > this.f52847d && !B(4)) {
            throw d2("Unterminated escape sequence");
        }
        int i13 = this.f52846c;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.buffer[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.buffer, this.f52846c, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f52846c += 4;
        return c11;
    }

    public final void Z1(char c10) {
        char[] cArr = this.buffer;
        do {
            int i10 = this.f52846c;
            int i11 = this.f52847d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f52846c = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f52846c = i12;
                    Y1();
                    i10 = this.f52846c;
                    i11 = this.f52847d;
                } else {
                    if (c11 == '\n') {
                        this.f52848e++;
                        this.f52849f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f52846c = i10;
        } while (B(1));
        throw d2("Unterminated string");
    }

    public final boolean a2(String str) {
        int length = str.length();
        while (true) {
            if (this.f52846c + length > this.f52847d && !B(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i10 = this.f52846c;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.buffer[this.f52846c + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f52848e++;
            this.f52849f = i10 + 1;
            this.f52846c++;
        }
    }

    public final void b2() {
        char c10;
        do {
            if (this.f52846c >= this.f52847d && !B(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i10 = this.f52846c;
            int i11 = i10 + 1;
            this.f52846c = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f52848e++;
                this.f52849f = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c2() {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f52846c;
                if (i11 + i10 < this.f52847d) {
                    char c10 = this.buffer[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f52846c = i11 + i10;
                }
            }
            this.f52846c += i10;
            return;
        } while (B(1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52850g = 0;
        this.stack[0] = 8;
        this.f52854k = 1;
        this.f52844a.close();
    }

    public final void d() {
        if (!this.f52845b) {
            throw d2("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final IOException d2(String str) {
        throw new d(str + U());
    }

    public String f0() {
        String D02;
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 14) {
            D02 = m1();
        } else if (i10 == 12) {
            D02 = D0('\'');
        } else {
            if (i10 != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + U());
            }
            D02 = D0(Typography.quote);
        }
        this.f52850g = 0;
        this.pathNames[this.f52854k - 1] = D02;
        return D02;
    }

    public boolean hasNext() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final void k() {
        z0(true);
        int i10 = this.f52846c;
        int i11 = i10 - 1;
        this.f52846c = i11;
        if (i10 + 4 <= this.f52847d || B(5)) {
            char[] cArr = this.buffer;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f52846c += 5;
            }
        }
    }

    public String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Typography.dollar);
        int i10 = this.f52854k;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.stack[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.pathIndices[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.pathNames[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void m() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 1) {
            T1(3);
            this.f52850g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + U());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1() {
        String sb2;
        StringBuilder sb3 = null;
        int i10 = 0;
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f52846c;
                if (i12 + i11 < this.f52847d) {
                    char c10 = this.buffer[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i11 >= this.buffer.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb3.append(this.buffer, this.f52846c, i11);
                    this.f52846c += i11;
                } else if (B(i11 + 1)) {
                }
            }
            i10 = i11;
            if (sb3 != null) {
                sb2 = new String(this.buffer, this.f52846c, i10);
            } else {
                sb3.append(this.buffer, this.f52846c, i10);
                sb2 = sb3.toString();
            }
            this.f52846c += i10;
            return sb2;
        } while (B(1));
        if (sb3 != null) {
        }
        this.f52846c += i10;
        return sb2;
    }

    public void n() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + U());
        }
        int i11 = this.f52854k;
        this.f52854k = i11 - 1;
        int[] iArr = this.pathIndices;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f52850g = 0;
    }

    public final int n1() {
        String str;
        String str2;
        int i10;
        char c10 = this.buffer[this.f52846c];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = Constants.CASEFIRST_FALSE;
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f52846c + i11 >= this.f52847d && !B(i11 + 1)) {
                return 0;
            }
            char c11 = this.buffer[this.f52846c + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f52846c + length < this.f52847d || B(length + 1)) && J(this.buffer[this.f52846c + length])) {
            return 0;
        }
        this.f52846c += length;
        this.f52850g = i10;
        return i10;
    }

    public double nextDouble() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 15) {
            this.f52850g = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f52854k - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f52851h;
        }
        if (i10 == 16) {
            this.f52853j = new String(this.buffer, this.f52846c, this.f52852i);
            this.f52846c += this.f52852i;
        } else if (i10 == 8 || i10 == 9) {
            this.f52853j = D0(i10 == 8 ? '\'' : Typography.quote);
        } else if (i10 == 10) {
            this.f52853j = m1();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + U());
        }
        this.f52850g = 11;
        double parseDouble = Double.parseDouble(this.f52853j);
        if (!this.f52845b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + U());
        }
        this.f52853j = null;
        this.f52850g = 0;
        int[] iArr2 = this.pathIndices;
        int i12 = this.f52854k - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int nextInt() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 15) {
            long j10 = this.f52851h;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f52850g = 0;
                int[] iArr = this.pathIndices;
                int i12 = this.f52854k - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f52851h + U());
        }
        if (i10 == 16) {
            this.f52853j = new String(this.buffer, this.f52846c, this.f52852i);
            this.f52846c += this.f52852i;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + U());
            }
            if (i10 == 10) {
                this.f52853j = m1();
            } else {
                this.f52853j = D0(i10 == 8 ? '\'' : Typography.quote);
            }
            try {
                int parseInt = Integer.parseInt(this.f52853j);
                this.f52850g = 0;
                int[] iArr2 = this.pathIndices;
                int i13 = this.f52854k - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f52850g = 11;
        double parseDouble = Double.parseDouble(this.f52853j);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f52853j + U());
        }
        this.f52853j = null;
        this.f52850g = 0;
        int[] iArr3 = this.pathIndices;
        int i15 = this.f52854k - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 15) {
            this.f52850g = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f52854k - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f52851h;
        }
        if (i10 == 16) {
            this.f52853j = new String(this.buffer, this.f52846c, this.f52852i);
            this.f52846c += this.f52852i;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + U());
            }
            if (i10 == 10) {
                this.f52853j = m1();
            } else {
                this.f52853j = D0(i10 == 8 ? '\'' : Typography.quote);
            }
            try {
                long parseLong = Long.parseLong(this.f52853j);
                this.f52850g = 0;
                int[] iArr2 = this.pathIndices;
                int i12 = this.f52854k - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f52850g = 11;
        double parseDouble = Double.parseDouble(this.f52853j);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f52853j + U());
        }
        this.f52853j = null;
        this.f52850g = 0;
        int[] iArr3 = this.pathIndices;
        int i13 = this.f52854k - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public void p() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 3) {
            T1(1);
            this.pathIndices[this.f52854k - 1] = 0;
            this.f52850g = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + U());
        }
    }

    public b peek() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        switch (i10) {
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

    public final void q(boolean z10) {
        this.f52845b = z10;
    }

    public int r() {
        int z02;
        int[] iArr = this.stack;
        int i10 = this.f52854k;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int z03 = z0(true);
            if (z03 != 44) {
                if (z03 != 59) {
                    if (z03 != 93) {
                        throw d2("Unterminated array");
                    }
                    this.f52850g = 4;
                    return 4;
                }
                d();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (z02 = z0(true)) != 44) {
                    if (z02 != 59) {
                        if (z02 != 125) {
                            throw d2("Unterminated object");
                        }
                        this.f52850g = 2;
                        return 2;
                    }
                    d();
                }
                int z04 = z0(true);
                if (z04 == 34) {
                    this.f52850g = 13;
                    return 13;
                }
                if (z04 == 39) {
                    d();
                    this.f52850g = 12;
                    return 12;
                }
                if (z04 == 125) {
                    if (i11 == 5) {
                        throw d2("Expected name");
                    }
                    this.f52850g = 2;
                    return 2;
                }
                d();
                this.f52846c--;
                if (!J((char) z04)) {
                    throw d2("Expected name");
                }
                this.f52850g = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int z05 = z0(true);
                if (z05 != 58) {
                    if (z05 != 61) {
                        throw d2("Expected ':'");
                    }
                    d();
                    if (this.f52846c < this.f52847d || B(1)) {
                        char[] cArr = this.buffer;
                        int i12 = this.f52846c;
                        if (cArr[i12] == '>') {
                            this.f52846c = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f52845b) {
                    k();
                }
                this.stack[this.f52854k - 1] = 7;
            } else if (i11 == 7) {
                if (z0(false) == -1) {
                    this.f52850g = 17;
                    return 17;
                }
                d();
                this.f52846c--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int z06 = z0(true);
        if (z06 == 34) {
            this.f52850g = 9;
            return 9;
        }
        if (z06 == 39) {
            d();
            this.f52850g = 8;
            return 8;
        }
        if (z06 != 44 && z06 != 59) {
            if (z06 == 91) {
                this.f52850g = 3;
                return 3;
            }
            if (z06 != 93) {
                if (z06 == 123) {
                    this.f52850g = 1;
                    return 1;
                }
                this.f52846c--;
                int n12 = n1();
                if (n12 != 0) {
                    return n12;
                }
                int y12 = y1();
                if (y12 != 0) {
                    return y12;
                }
                if (!J(this.buffer[this.f52846c])) {
                    throw d2("Expected value");
                }
                d();
                this.f52850g = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f52850g = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw d2("Unexpected value");
        }
        d();
        this.f52846c--;
        this.f52850g = 7;
        return 7;
    }

    public void t() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + U());
        }
        int i11 = this.f52854k;
        int i12 = i11 - 1;
        this.f52854k = i12;
        this.pathNames[i12] = null;
        int[] iArr = this.pathIndices;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f52850g = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + U();
    }

    public boolean w0() {
        int i10 = this.f52850g;
        if (i10 == 0) {
            i10 = r();
        }
        if (i10 == 5) {
            this.f52850g = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.f52854k - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f52850g = 0;
            int[] iArr2 = this.pathIndices;
            int i12 = this.f52854k - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + U());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.f52851h = r11;
        r19.f52846c += r8;
        r19.f52850g = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.f52852i = r8;
        r19.f52850g = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (J(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int y1() {
        int i10;
        char[] cArr = this.buffer;
        int i11 = this.f52846c;
        int i12 = this.f52847d;
        int i13 = 0;
        int i14 = 0;
        char c10 = 0;
        boolean z10 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c11 = 2;
            if (i11 + i14 == i12) {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!B(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f52846c;
                i12 = this.f52847d;
            }
            char c12 = cArr[i11 + i14];
            i10 = i13;
            if (c12 != '+') {
                if (c12 == 'E' || c12 == 'e') {
                    if (c10 != 2 && c10 != 4) {
                        return i10;
                    }
                    c10 = 5;
                } else if (c12 == '-') {
                    c11 = 6;
                    if (c10 == 0) {
                        c10 = 1;
                        z10 = true;
                    } else if (c10 != 5) {
                        return i10;
                    }
                } else if (c12 != '.') {
                    if (c12 < '0' || c12 > '9') {
                        break;
                    }
                    if (c10 == 1 || c10 == 0) {
                        j10 = -(c12 - '0');
                    } else if (c10 == 2) {
                        if (j10 == 0) {
                            return i10;
                        }
                        long j11 = (10 * j10) - (c12 - '0');
                        i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                        j10 = j11;
                    } else if (c10 == 3) {
                        c10 = 4;
                    } else if (c10 == 5 || c10 == 6) {
                        c10 = 7;
                    }
                } else {
                    if (c10 != 2) {
                        return i10;
                    }
                    c10 = 3;
                }
                i14++;
                i13 = i10;
            } else {
                c11 = 6;
                if (c10 != 5) {
                    return i10;
                }
            }
            c10 = c11;
            i14++;
            i13 = i10;
        }
    }

    public final int z0(boolean z10) {
        char c10;
        char[] cArr = this.buffer;
        int i10 = this.f52846c;
        int i11 = this.f52847d;
        while (true) {
            if (i10 == i11) {
                this.f52846c = i10;
                if (!B(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + U());
                }
                i10 = this.f52846c;
                i11 = this.f52847d;
            }
            int i12 = i10 + 1;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f52848e++;
                this.f52849f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f52846c = i12;
                    if (i12 == i11) {
                        this.f52846c = i10;
                        boolean B10 = B(2);
                        this.f52846c++;
                        if (!B10) {
                            break;
                        }
                    }
                    d();
                    int i13 = this.f52846c;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f52846c = i13 + 1;
                        if (!a2("*/")) {
                            throw d2("Unterminated comment");
                        }
                        i10 = this.f52846c + 2;
                        i11 = this.f52847d;
                    } else {
                        if (c11 != '/') {
                            break;
                        }
                        this.f52846c = i13 + 1;
                        b2();
                        i10 = this.f52846c;
                        i11 = this.f52847d;
                    }
                } else {
                    if (c10 != '#') {
                        this.f52846c = i12;
                        return c10;
                    }
                    this.f52846c = i12;
                    d();
                    b2();
                    i10 = this.f52846c;
                    i11 = this.f52847d;
                }
            }
            i10 = i12;
        }
        return c10;
    }
}
