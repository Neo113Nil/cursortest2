package io.sentry.vendor.gson.stream;

import Am.C2438a;
import Ij.C3261b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f68626a;

    /* renamed from: i, reason: collision with root package name */
    private long f68634i;

    /* renamed from: j, reason: collision with root package name */
    private int f68635j;

    /* renamed from: k, reason: collision with root package name */
    private String f68636k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f68637l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f68639n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f68640o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68627b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f68628c = new char[UserVerificationMethods.USER_VERIFY_ALL];

    /* renamed from: d, reason: collision with root package name */
    private int f68629d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f68630e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f68631f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f68632g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f68633h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f68638m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f68637l = iArr;
        iArr[0] = 6;
        this.f68639n = new String[32];
        this.f68640o = new int[32];
        this.f68626a = reader;
    }

    private void c() throws IOException {
        if (this.f68627b) {
            return;
        }
        y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private boolean j(int i11) throws IOException {
        int i12;
        int i13;
        int i14 = this.f68632g;
        int i15 = this.f68629d;
        this.f68632g = i14 - i15;
        int i16 = this.f68630e;
        char[] cArr = this.f68628c;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f68630e = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f68630e = 0;
        }
        this.f68629d = 0;
        do {
            int i18 = this.f68630e;
            int read = this.f68626a.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.f68630e + read;
            this.f68630e = i12;
            if (this.f68631f == 0 && (i13 = this.f68632g) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f68629d++;
                this.f68632g = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private boolean k(char c11) throws IOException {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
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
        c();
        return false;
    }

    private int p(boolean z11) throws IOException {
        char c11;
        int i11 = this.f68629d;
        int i12 = this.f68630e;
        while (true) {
            if (i11 == i12) {
                this.f68629d = i11;
                if (!j(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i11 = this.f68629d;
                i12 = this.f68630e;
            }
            int i13 = i11 + 1;
            char[] cArr = this.f68628c;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f68631f++;
                this.f68632g = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f68629d = i13;
                    if (i13 == i12) {
                        this.f68629d = i11;
                        boolean j11 = j(2);
                        this.f68629d++;
                        if (!j11) {
                            break;
                        }
                    }
                    c();
                    int i14 = this.f68629d;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f68629d = i14 + 1;
                        while (true) {
                            if (this.f68629d + 2 > this.f68630e && !j(2)) {
                                y("Unterminated comment");
                                throw null;
                            }
                            int i15 = this.f68629d;
                            if (cArr[i15] != '\n') {
                                for (int i16 = 0; i16 < 2; i16++) {
                                    if (cArr[this.f68629d + i16] != "*/".charAt(i16)) {
                                        break;
                                    }
                                }
                                i11 = this.f68629d + 2;
                                i12 = this.f68630e;
                                break;
                            }
                            this.f68631f++;
                            this.f68632g = i15 + 1;
                            this.f68629d++;
                        }
                    } else {
                        if (c12 != '/') {
                            break;
                        }
                        this.f68629d = i14 + 1;
                        x();
                        i11 = this.f68629d;
                        i12 = this.f68630e;
                    }
                } else {
                    if (c11 != '#') {
                        this.f68629d = i13;
                        return c11;
                    }
                    this.f68629d = i13;
                    c();
                    x();
                    i11 = this.f68629d;
                    i12 = this.f68630e;
                }
            }
            i11 = i13;
        }
        return c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f68629d = r8;
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
    
        r1.append(r5, r3, r2 - r3);
        r10.f68629d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String r(char c11) throws IOException {
        char[] cArr;
        int i11;
        StringBuilder sb2 = null;
        do {
            int i12 = this.f68629d;
            int i13 = this.f68630e;
            while (true) {
                int i14 = i13;
                int i15 = i12;
                while (true) {
                    cArr = this.f68628c;
                    if (i12 >= i14) {
                        break;
                    }
                    int i16 = i12 + 1;
                    char c12 = cArr[i12];
                    if (c12 == c11) {
                        this.f68629d = i16;
                        int i17 = (i16 - i15) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i15, i17);
                        }
                        sb2.append(cArr, i15, i17);
                        return sb2.toString();
                    }
                    if (c12 == '\\') {
                        break;
                    }
                    if (c12 == '\n') {
                        this.f68631f++;
                        this.f68632g = i16;
                    }
                    i12 = i16;
                }
                sb2.append(cArr, i15, i11);
                sb2.append(v());
                i12 = this.f68629d;
                i13 = this.f68630e;
            }
        } while (j(1));
        y("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String s() throws IOException {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i11 = 0;
        do {
            int i12 = 0;
            while (true) {
                int i13 = this.f68629d;
                int i14 = i13 + i12;
                int i15 = this.f68630e;
                cArr = this.f68628c;
                if (i14 < i15) {
                    char c11 = cArr[i13 + i12];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i12++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i12 >= cArr.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i12, 16));
                    }
                    sb3.append(cArr, this.f68629d, i12);
                    this.f68629d += i12;
                } else if (j(i12 + 1)) {
                }
            }
            i11 = i12;
            if (sb3 != null) {
                sb2 = new String(cArr, this.f68629d, i11);
            } else {
                sb3.append(cArr, this.f68629d, i11);
                sb2 = sb3.toString();
            }
            this.f68629d += i11;
            return sb2;
        } while (j(1));
        if (sb3 != null) {
        }
        this.f68629d += i11;
        return sb2;
    }

    private void t(int i11) {
        int i12 = this.f68638m;
        int[] iArr = this.f68637l;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f68637l = Arrays.copyOf(iArr, i13);
            this.f68640o = Arrays.copyOf(this.f68640o, i13);
            this.f68639n = (String[]) Arrays.copyOf(this.f68639n, i13);
        }
        int[] iArr2 = this.f68637l;
        int i14 = this.f68638m;
        this.f68638m = i14 + 1;
        iArr2[i14] = i11;
    }

    private char v() throws IOException {
        int i11;
        if (this.f68629d == this.f68630e && !j(1)) {
            y("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f68629d;
        int i13 = i12 + 1;
        this.f68629d = i13;
        char[] cArr = this.f68628c;
        char c11 = cArr[i12];
        if (c11 == '\n') {
            this.f68631f++;
            this.f68632g = i13;
            return c11;
        }
        if (c11 == '\"' || c11 == '\'' || c11 == '/' || c11 == '\\') {
            return c11;
        }
        if (c11 == 'b') {
            return '\b';
        }
        if (c11 == 'f') {
            return '\f';
        }
        if (c11 == 'n') {
            return '\n';
        }
        if (c11 == 'r') {
            return '\r';
        }
        if (c11 == 't') {
            return '\t';
        }
        if (c11 != 'u') {
            y("Invalid escape sequence");
            throw null;
        }
        if (i12 + 5 > this.f68630e && !j(4)) {
            y("Unterminated escape sequence");
            throw null;
        }
        int i14 = this.f68629d;
        int i15 = i14 + 4;
        char c12 = 0;
        while (i14 < i15) {
            char c13 = cArr[i14];
            char c14 = (char) (c12 << 4);
            if (c13 >= '0' && c13 <= '9') {
                i11 = c13 - '0';
            } else if (c13 >= 'a' && c13 <= 'f') {
                i11 = c13 - 'W';
            } else {
                if (c13 < 'A' || c13 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f68629d, 4)));
                }
                i11 = c13 - '7';
            }
            c12 = (char) (i11 + c14);
            i14++;
        }
        this.f68629d += 4;
        return c12;
    }

    private void w(char c11) throws IOException {
        do {
            int i11 = this.f68629d;
            int i12 = this.f68630e;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = this.f68628c[i11];
                if (c12 == c11) {
                    this.f68629d = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f68629d = i13;
                    v();
                    i11 = this.f68629d;
                    i12 = this.f68630e;
                } else {
                    if (c12 == '\n') {
                        this.f68631f++;
                        this.f68632g = i13;
                    }
                    i11 = i13;
                }
            }
            this.f68629d = i11;
        } while (j(1));
        y("Unterminated string");
        throw null;
    }

    private void x() throws IOException {
        char c11;
        do {
            if (this.f68629d >= this.f68630e && !j(1)) {
                return;
            }
            int i11 = this.f68629d;
            int i12 = i11 + 1;
            this.f68629d = i12;
            c11 = this.f68628c[i11];
            if (c11 == '\n') {
                this.f68631f++;
                this.f68632g = i12;
                return;
            }
        } while (c11 != '\r');
    }

    private void y(String str) throws IOException {
        StringBuilder e11 = C3261b.e(str);
        e11.append(m());
        throw new d(e11.toString());
    }

    public final void beginArray() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 3) {
            t(1);
            this.f68640o[this.f68638m - 1] = 0;
            this.f68633h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + m());
        }
    }

    public final void beginObject() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 1) {
            t(3);
            this.f68633h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + m());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68633h = 0;
        this.f68637l[0] = 8;
        this.f68638m = 1;
        this.f68626a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0215, code lost:
    
        if (k(r1) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019d, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0218, code lost:
    
        if (r6 != 2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021a, code lost:
    
        if (r12 == false) goto L176;
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
    
        r23.f68634i = r14;
        r23.f68629d += r8;
        r10 = 15;
        r23.f68633h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0225, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023d, code lost:
    
        if (r6 == r10) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0240, code lost:
    
        if (r6 == 4) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0243, code lost:
    
        if (r6 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0245, code lost:
    
        r23.f68635j = r8;
        r10 = 16;
        r23.f68633h = 16;
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
    final int d() throws IOException {
        int p11;
        int i11;
        int p12;
        int i12;
        String str;
        String str2;
        int i13;
        char c11;
        long j11;
        int i14;
        int i15;
        int i16;
        int[] iArr = this.f68637l;
        int i17 = 1;
        int i18 = this.f68638m - 1;
        int i19 = iArr[i18];
        char[] cArr = this.f68628c;
        if (i19 == 1) {
            iArr[i18] = 2;
        } else if (i19 == 2) {
            int p13 = p(true);
            if (p13 != 44) {
                if (p13 != 59) {
                    if (p13 == 93) {
                        this.f68633h = 4;
                        return 4;
                    }
                    y("Unterminated array");
                    throw null;
                }
                c();
            }
        } else {
            if (i19 == 3 || i19 == 5) {
                iArr[i18] = 4;
                if (i19 == 5 && (p11 = p(true)) != 44) {
                    if (p11 != 59) {
                        if (p11 == 125) {
                            this.f68633h = 2;
                            return 2;
                        }
                        y("Unterminated object");
                        throw null;
                    }
                    c();
                }
                int p14 = p(true);
                if (p14 == 34) {
                    this.f68633h = 13;
                    return 13;
                }
                if (p14 == 39) {
                    c();
                    this.f68633h = 12;
                    return 12;
                }
                if (p14 == 125) {
                    if (i19 != 5) {
                        this.f68633h = 2;
                        return 2;
                    }
                    y("Expected name");
                    throw null;
                }
                c();
                this.f68629d--;
                if (k((char) p14)) {
                    this.f68633h = 14;
                    return 14;
                }
                y("Expected name");
                throw null;
            }
            if (i19 == 4) {
                iArr[i18] = 5;
                int p15 = p(true);
                if (p15 != 58) {
                    if (p15 != 61) {
                        y("Expected ':'");
                        throw null;
                    }
                    c();
                    if (this.f68629d < this.f68630e || j(1)) {
                        int i21 = this.f68629d;
                        if (cArr[i21] == '>') {
                            this.f68629d = i21 + 1;
                        }
                    }
                }
            } else {
                if (i19 != 6) {
                    if (i19 == 7) {
                        i11 = 0;
                        if (p(false) == -1) {
                            this.f68633h = 17;
                            return 17;
                        }
                        c();
                        this.f68629d--;
                    } else {
                        i11 = 0;
                        if (i19 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    p12 = p(true);
                    if (p12 != 34) {
                        this.f68633h = 9;
                        return 9;
                    }
                    if (p12 == 39) {
                        c();
                        this.f68633h = 8;
                        return 8;
                    }
                    if (p12 == 44 || p12 == 59) {
                        i12 = 1;
                    } else {
                        if (p12 == 91) {
                            this.f68633h = 3;
                            return 3;
                        }
                        if (p12 == 93) {
                            i12 = 1;
                            if (i19 == 1) {
                                this.f68633h = 4;
                                return 4;
                            }
                        } else {
                            if (p12 == 123) {
                                this.f68633h = 1;
                                return 1;
                            }
                            int i22 = this.f68629d - 1;
                            this.f68629d = i22;
                            char c12 = cArr[i22];
                            if (c12 == 't' || c12 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i13 = 5;
                            } else if (c12 == 'f' || c12 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i13 = 6;
                            } else {
                                if (c12 == 'n' || c12 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i13 = 7;
                                }
                                i13 = i11;
                                if (i13 == 0) {
                                    return i13;
                                }
                                int i23 = this.f68629d;
                                int i24 = this.f68630e;
                                int i25 = i11;
                                int i26 = i25;
                                int i27 = i26;
                                boolean z11 = true;
                                long j12 = 0;
                                while (true) {
                                    if (i23 + i26 == i24) {
                                        if (i26 == cArr.length) {
                                            break;
                                        }
                                        if (!j(i26 + 1)) {
                                            j11 = 0;
                                            break;
                                        }
                                        int i28 = this.f68629d;
                                        i24 = this.f68630e;
                                        i23 = i28;
                                    }
                                    char c13 = cArr[i23 + i26];
                                    j11 = 0;
                                    if (c13 != '+') {
                                        if (c13 == 'E' || c13 == 'e') {
                                            i14 = i24;
                                            if (i25 != 2 && i25 != 4) {
                                                break;
                                            }
                                            i25 = 5;
                                            i26++;
                                            i24 = i14;
                                            i17 = 1;
                                        } else if (c13 == '-') {
                                            i14 = i24;
                                            i15 = 6;
                                            if (i25 == 0) {
                                                i25 = 1;
                                                i27 = 1;
                                                i26++;
                                                i24 = i14;
                                                i17 = 1;
                                            } else {
                                                if (i25 != 5) {
                                                    break;
                                                }
                                                i25 = i15;
                                                i26++;
                                                i24 = i14;
                                                i17 = 1;
                                            }
                                        } else if (c13 == '.') {
                                            i14 = i24;
                                            if (i25 != 2) {
                                                break;
                                            }
                                            i25 = 3;
                                            i26++;
                                            i24 = i14;
                                            i17 = 1;
                                        } else {
                                            if (c13 < '0' || c13 > '9') {
                                                break;
                                            }
                                            if (i25 == i17 || i25 == 0) {
                                                i14 = i24;
                                                j12 = -(c13 - '0');
                                                i25 = 2;
                                            } else if (i25 != 2) {
                                                i14 = i24;
                                                if (i25 == 3) {
                                                    i25 = 4;
                                                } else if (i25 == 5 || i25 == 6) {
                                                    i25 = 7;
                                                }
                                            } else {
                                                if (j12 == 0) {
                                                    break;
                                                }
                                                i14 = i24;
                                                long j13 = (10 * j12) - (c13 - '0');
                                                z11 &= j12 > -922337203685477580L || (j12 == -922337203685477580L && j13 < j12);
                                                j12 = j13;
                                            }
                                            i26++;
                                            i24 = i14;
                                            i17 = 1;
                                        }
                                        if (i16 == 0) {
                                            return i16;
                                        }
                                        if (!k(cArr[this.f68629d])) {
                                            y("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.f68633h = 10;
                                        return 10;
                                    }
                                    i14 = i24;
                                    i15 = 6;
                                    if (i25 != 5) {
                                        break;
                                    }
                                    i25 = i15;
                                    i26++;
                                    i24 = i14;
                                    i17 = 1;
                                }
                                i16 = 0;
                                if (i16 == 0) {
                                }
                            }
                            int length = str.length();
                            int i29 = 1;
                            while (true) {
                                if (i29 < length) {
                                    if ((this.f68629d + i29 >= this.f68630e && !j(i29 + 1)) || ((c11 = cArr[this.f68629d + i29]) != str.charAt(i29) && c11 != str2.charAt(i29))) {
                                        break;
                                    }
                                    i29++;
                                } else if ((this.f68629d + length >= this.f68630e && !j(length + 1)) || !k(cArr[this.f68629d + length])) {
                                    this.f68629d += length;
                                    this.f68633h = i13;
                                }
                            }
                            i13 = i11;
                            if (i13 == 0) {
                            }
                        }
                    }
                    if (i19 != i12 && i19 != 2) {
                        y("Unexpected value");
                        throw null;
                    }
                    c();
                    this.f68629d -= i12;
                    this.f68633h = 7;
                    return 7;
                }
                if (this.f68627b) {
                    p(true);
                    int i31 = this.f68629d;
                    int i32 = i31 - 1;
                    this.f68629d = i32;
                    if ((i31 + 4 <= this.f68630e || j(5)) && cArr[i32] == ')' && cArr[i31] == ']' && cArr[i31 + 1] == '}' && cArr[i31 + 2] == '\'' && cArr[i31 + 3] == '\n') {
                        this.f68629d += 5;
                    }
                }
                this.f68637l[this.f68638m - 1] = 7;
            }
        }
        i11 = 0;
        p12 = p(true);
        if (p12 != 34) {
        }
    }

    public final void endArray() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + m());
        }
        int i12 = this.f68638m;
        this.f68638m = i12 - 1;
        int[] iArr = this.f68640o;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f68633h = 0;
    }

    public final void endObject() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + m());
        }
        int i12 = this.f68638m;
        int i13 = i12 - 1;
        this.f68638m = i13;
        this.f68639n[i13] = null;
        int[] iArr = this.f68640o;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f68633h = 0;
    }

    public final boolean hasNext() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        return (i11 == 2 || i11 == 4) ? false : true;
    }

    final String m() {
        StringBuilder a11 = C2438a.a(" at line ", this.f68631f + 1, " column ", " path ", (this.f68629d - this.f68632g) + 1);
        StringBuilder sb2 = new StringBuilder("$");
        int i11 = this.f68638m;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f68637l[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(this.f68640o[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = this.f68639n[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        a11.append(sb2.toString());
        return a11.toString();
    }

    public final double nextDouble() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 15) {
            this.f68633h = 0;
            int[] iArr = this.f68640o;
            int i12 = this.f68638m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f68634i;
        }
        if (i11 == 16) {
            this.f68636k = new String(this.f68628c, this.f68629d, this.f68635j);
            this.f68629d += this.f68635j;
        } else if (i11 == 8 || i11 == 9) {
            this.f68636k = r(i11 == 8 ? '\'' : '\"');
        } else if (i11 == 10) {
            this.f68636k = s();
        } else if (i11 != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + m());
        }
        this.f68633h = 11;
        double parseDouble = Double.parseDouble(this.f68636k);
        if (!this.f68627b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + m());
        }
        this.f68636k = null;
        this.f68633h = 0;
        int[] iArr2 = this.f68640o;
        int i13 = this.f68638m - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    public final int nextInt() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 15) {
            long j11 = this.f68634i;
            int i12 = (int) j11;
            if (j11 != i12) {
                throw new NumberFormatException("Expected an int but was " + this.f68634i + m());
            }
            this.f68633h = 0;
            int[] iArr = this.f68640o;
            int i13 = this.f68638m - 1;
            iArr[i13] = iArr[i13] + 1;
            return i12;
        }
        if (i11 == 16) {
            this.f68636k = new String(this.f68628c, this.f68629d, this.f68635j);
            this.f68629d += this.f68635j;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + m());
            }
            if (i11 == 10) {
                this.f68636k = s();
            } else {
                this.f68636k = r(i11 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f68636k);
                this.f68633h = 0;
                int[] iArr2 = this.f68640o;
                int i14 = this.f68638m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f68633h = 11;
        double parseDouble = Double.parseDouble(this.f68636k);
        int i15 = (int) parseDouble;
        if (i15 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f68636k + m());
        }
        this.f68636k = null;
        this.f68633h = 0;
        int[] iArr3 = this.f68640o;
        int i16 = this.f68638m - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public final long nextLong() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 15) {
            this.f68633h = 0;
            int[] iArr = this.f68640o;
            int i12 = this.f68638m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f68634i;
        }
        if (i11 == 16) {
            this.f68636k = new String(this.f68628c, this.f68629d, this.f68635j);
            this.f68629d += this.f68635j;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + m());
            }
            if (i11 == 10) {
                this.f68636k = s();
            } else {
                this.f68636k = r(i11 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f68636k);
                this.f68633h = 0;
                int[] iArr2 = this.f68640o;
                int i13 = this.f68638m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f68633h = 11;
        double parseDouble = Double.parseDouble(this.f68636k);
        long j11 = (long) parseDouble;
        if (j11 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f68636k + m());
        }
        this.f68636k = null;
        this.f68633h = 0;
        int[] iArr3 = this.f68640o;
        int i14 = this.f68638m - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j11;
    }

    public final String nextName() throws IOException {
        String r11;
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 14) {
            r11 = s();
        } else if (i11 == 12) {
            r11 = r('\'');
        } else {
            if (i11 != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + m());
            }
            r11 = r('\"');
        }
        this.f68633h = 0;
        this.f68639n[this.f68638m - 1] = r11;
        return r11;
    }

    public final String nextString() throws IOException {
        String str;
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 10) {
            str = s();
        } else if (i11 == 8) {
            str = r('\'');
        } else if (i11 == 9) {
            str = r('\"');
        } else if (i11 == 11) {
            str = this.f68636k;
            this.f68636k = null;
        } else if (i11 == 15) {
            str = Long.toString(this.f68634i);
        } else {
            if (i11 != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + m());
            }
            str = new String(this.f68628c, this.f68629d, this.f68635j);
            this.f68629d += this.f68635j;
        }
        this.f68633h = 0;
        int[] iArr = this.f68640o;
        int i12 = this.f68638m - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    public final boolean o() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 == 5) {
            this.f68633h = 0;
            int[] iArr = this.f68640o;
            int i12 = this.f68638m - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + m());
        }
        this.f68633h = 0;
        int[] iArr2 = this.f68640o;
        int i13 = this.f68638m - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return false;
    }

    public final b peek() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        switch (i11) {
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

    public final void q() throws IOException {
        int i11 = this.f68633h;
        if (i11 == 0) {
            i11 = d();
        }
        if (i11 != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + m());
        }
        this.f68633h = 0;
        int[] iArr = this.f68640o;
        int i12 = this.f68638m - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void setLenient(boolean z11) {
        this.f68627b = z11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009b. Please report as an issue. */
    public final void skipValue() throws IOException {
        int i11 = 0;
        do {
            int i12 = this.f68633h;
            if (i12 == 0) {
                i12 = d();
            }
            if (i12 == 3) {
                t(1);
            } else if (i12 == 1) {
                t(3);
            } else {
                if (i12 == 4) {
                    this.f68638m--;
                } else if (i12 == 2) {
                    this.f68638m--;
                } else {
                    if (i12 == 14 || i12 == 10) {
                        do {
                            int i13 = 0;
                            while (true) {
                                int i14 = this.f68629d + i13;
                                if (i14 < this.f68630e) {
                                    char c11 = this.f68628c[i14];
                                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                                        if (c11 != '#') {
                                            if (c11 != ',') {
                                                if (c11 != '/' && c11 != '=') {
                                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                                        if (c11 != ';') {
                                                            switch (c11) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i13++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f68629d = i14;
                                }
                            }
                            c();
                            this.f68629d += i13;
                        } while (j(1));
                    } else if (i12 == 8 || i12 == 12) {
                        w('\'');
                    } else if (i12 == 9 || i12 == 13) {
                        w('\"');
                    } else if (i12 == 16) {
                        this.f68629d += this.f68635j;
                    }
                    this.f68633h = 0;
                }
                i11--;
                this.f68633h = 0;
            }
            i11++;
            this.f68633h = 0;
        } while (i11 != 0);
        int[] iArr = this.f68640o;
        int i15 = this.f68638m - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f68639n[i15] = "null";
    }

    public final String toString() {
        return a.class.getSimpleName() + m();
    }
}
