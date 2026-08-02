package ug;

import androidx.appcompat.widget.c1;
import androidx.transition.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public int f24316a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f24317b;

    /* renamed from: c, reason: collision with root package name */
    public String f24318c;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f24319d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24320e;

    public u(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        n0 n0Var = new n0((byte) 0, 9);
        n0Var.f2734c = new Object[8];
        int[] iArr = new int[8];
        for (int i5 = 0; i5 < 8; i5++) {
            iArr[i5] = -1;
        }
        n0Var.f2735d = iArr;
        n0Var.f2733b = -1;
        this.f24317b = n0Var;
        this.f24319d = new StringBuilder();
        this.f24320e = source;
    }

    public static /* synthetic */ void m(u uVar, String str, int i5, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i5 = uVar.f24316a;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        uVar.l(i5, str, str2);
        throw null;
    }

    public final int a(int i5, CharSequence charSequence) {
        int i10 = i5 + 4;
        if (i10 < charSequence.length()) {
            this.f24319d.append((char) (n(i5 + 3, charSequence) + (n(i5, charSequence) << 12) + (n(i5 + 1, charSequence) << 8) + (n(i5 + 2, charSequence) << 4)));
            return i10;
        }
        this.f24316a = i5;
        if (i10 < charSequence.length()) {
            return a(this.f24316a, charSequence);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i5 = this.f24316a;
        if (i5 == -1) {
            return false;
        }
        while (true) {
            String str = this.f24320e;
            if (i5 >= str.length()) {
                this.f24316a = i5;
                return false;
            }
            char charAt = str.charAt(i5);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f24316a = i5;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i5++;
        }
    }

    public final void c(int i5, String str) {
        String str2 = this.f24320e;
        if (str2.length() - i5 < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (str2.charAt(i5 + i10) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f24316a = str.length() + i5;
    }

    public final String d() {
        g('\"');
        int i5 = this.f24316a;
        String source = this.f24320e;
        int F = StringsKt.F(source, '\"', i5, false, 4);
        if (F == -1) {
            j();
            int i10 = this.f24316a;
            m(this, c1.n("Expected quotation mark '\"', but had '", (i10 == source.length() || i10 < 0) ? "EOF" : String.valueOf(source.charAt(i10)), "' instead"), i10, null, 4);
            throw null;
        }
        int i11 = i5;
        while (i11 < F) {
            if (source.charAt(i11) == '\\') {
                int i12 = this.f24316a;
                Intrinsics.checkNotNullParameter(source, "source");
                char charAt = source.charAt(i11);
                boolean z5 = false;
                while (charAt != '\"') {
                    StringBuilder sb2 = this.f24319d;
                    if (charAt == '\\') {
                        sb2.append((CharSequence) source, i12, i11);
                        int r5 = r(i11 + 1);
                        if (r5 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i13 = r5 + 1;
                        char charAt2 = source.charAt(r5);
                        if (charAt2 == 'u') {
                            i13 = a(i13, source);
                        } else {
                            char c2 = charAt2 < 'u' ? d.f24267a[charAt2] : (char) 0;
                            if (c2 == 0) {
                                m(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c2);
                        }
                        i12 = r(i13);
                        if (i12 == -1) {
                            m(this, "Unexpected EOF", i12, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= source.length()) {
                            sb2.append((CharSequence) source, i12, i11);
                            i12 = r(i11);
                            if (i12 == -1) {
                                m(this, "Unexpected EOF", i12, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = source.charAt(i11);
                        }
                    }
                    i11 = i12;
                    z5 = true;
                    charAt = source.charAt(i11);
                }
                String obj = !z5 ? source.subSequence(i12, i11).toString() : k(i12, i11);
                this.f24316a = i11 + 1;
                return obj;
            }
            i11++;
        }
        this.f24316a = F + 1;
        String substring = source.substring(i5, F);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        String str;
        int i5 = this.f24316a;
        while (true) {
            str = this.f24320e;
            if (i5 == -1 || i5 >= str.length()) {
                break;
            }
            int i10 = i5 + 1;
            char charAt = str.charAt(i5);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f24316a = i10;
                return j.h(charAt);
            }
            i5 = i10;
        }
        this.f24316a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b10) {
        byte e7 = e();
        if (e7 == b10) {
            return e7;
        }
        String t3 = j.t(b10);
        int i5 = this.f24316a;
        int i10 = i5 - 1;
        String str = this.f24320e;
        m(this, "Expected " + t3 + ", but had '" + ((i5 == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10))) + "' instead", i10, null, 4);
        throw null;
    }

    public void g(char c2) {
        int i5 = this.f24316a;
        if (i5 == -1) {
            u(c2);
            throw null;
        }
        while (true) {
            String str = this.f24320e;
            if (i5 >= str.length()) {
                this.f24316a = -1;
                u(c2);
                throw null;
            }
            int i10 = i5 + 1;
            char charAt = str.charAt(i5);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f24316a = i10;
                if (charAt == c2) {
                    return;
                }
                u(c2);
                throw null;
            }
            i5 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0192, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0193, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0198, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0162, code lost:
    
        m(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017b, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0180, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0144, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0146, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0186, code lost:
    
        throw new gf.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0187, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0199, code lost:
    
        m(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0106, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e7, code lost:
    
        m(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0109, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010d, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011e, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0120, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0123, code lost:
    
        m(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012b, code lost:
    
        m(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0131, code lost:
    
        r21.f24316a = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0135, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0137, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013a, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013c, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014b, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0150, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0156, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015e, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0160, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018a, code lost:
    
        return r10;
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h() {
        boolean z5;
        boolean z7;
        int r5 = r(s());
        String str = this.f24320e;
        ?? r6 = 0;
        if (r5 < str.length() && r5 != -1) {
            if (str.charAt(r5) == '\"') {
                r5++;
                if (r5 == str.length()) {
                    m(this, "EOF", 0, null, 6);
                    throw null;
                }
                z5 = true;
            } else {
                z5 = false;
            }
            int i5 = r5;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            long j = 0;
            long j6 = 0;
            while (true) {
                if (i5 == str.length()) {
                    z7 = z5;
                    break;
                }
                char charAt = str.charAt(i5);
                if ((charAt != 'e' && charAt != 'E') || z11) {
                    if (charAt == '-' && z11) {
                        if (i5 == r5) {
                            m(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i5++;
                        z10 = false;
                    } else if (charAt != '+' || !z11) {
                        z7 = z5;
                        if (charAt != '-') {
                            if (j.h(charAt) != 0) {
                                break;
                            }
                            i5++;
                            int i10 = charAt - '0';
                            if (i10 < 0 || i10 >= 10) {
                                break;
                            }
                            if (z11) {
                                j = (j * 10) + i10;
                            } else {
                                j6 = (j6 * 10) - i10;
                                if (j6 > 0) {
                                    m(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            z5 = z7;
                        } else {
                            if (i5 != r5) {
                                m(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                            i5++;
                            z5 = z7;
                            r6 = 0;
                            z12 = true;
                        }
                    } else {
                        if (i5 == r5) {
                            m(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i5++;
                        r6 = 0;
                        z10 = true;
                    }
                    r6 = 0;
                } else {
                    if (i5 == r5) {
                        m(this, "Unexpected symbol " + charAt + " in numeric literal", 0, r6, 6);
                        throw r6;
                    }
                    i5++;
                    z10 = true;
                    z11 = true;
                }
            }
        } else {
            m(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String i() {
        String str = this.f24318c;
        if (str == null) {
            return d();
        }
        Intrinsics.checkNotNull(str);
        this.f24318c = null;
        return str;
    }

    public final String j() {
        String str = this.f24318c;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            this.f24318c = null;
            return str;
        }
        int s8 = s();
        String str2 = this.f24320e;
        if (s8 >= str2.length() || s8 == -1) {
            m(this, "EOF", s8, null, 4);
            throw null;
        }
        byte h10 = j.h(str2.charAt(s8));
        if (h10 == 1) {
            return i();
        }
        if (h10 != 0) {
            m(this, "Expected beginning of the string, but got " + str2.charAt(s8), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (j.h(str2.charAt(s8)) == 0) {
            s8++;
            if (s8 >= str2.length()) {
                this.f24319d.append((CharSequence) str2, this.f24316a, s8);
                int r5 = r(s8);
                if (r5 == -1) {
                    this.f24316a = s8;
                    return k(0, 0);
                }
                s8 = r5;
                z5 = true;
            }
        }
        String obj = !z5 ? str2.subSequence(this.f24316a, s8).toString() : k(this.f24316a, s8);
        this.f24316a = s8;
        return obj;
    }

    public final String k(int i5, int i10) {
        String str = this.f24320e;
        StringBuilder sb2 = this.f24319d;
        sb2.append((CharSequence) str, i5, i10);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        sb2.setLength(0);
        return sb3;
    }

    public final void l(int i5, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder c2 = v.f.c(message, " at path: ");
        c2.append(this.f24317b.d());
        c2.append(concat);
        throw j.e(i5, c2.toString(), this.f24320e);
    }

    public final int n(int i5, CharSequence charSequence) {
        char charAt = charSequence.charAt(i5);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        m(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String o(String keyToMatch) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i5 = this.f24316a;
        try {
            if (e() == 6 && Intrinsics.areEqual(q(), keyToMatch)) {
                this.f24318c = null;
                if (e() == 5) {
                    return q();
                }
            }
            return null;
        } finally {
            this.f24316a = i5;
            this.f24318c = null;
        }
    }

    public byte p() {
        int i5 = this.f24316a;
        while (true) {
            int r5 = r(i5);
            if (r5 == -1) {
                this.f24316a = r5;
                return (byte) 10;
            }
            char charAt = this.f24320e.charAt(r5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f24316a = r5;
                return j.h(charAt);
            }
            i5 = r5 + 1;
        }
    }

    public final String q() {
        if (p() != 1) {
            return null;
        }
        String i5 = i();
        this.f24318c = i5;
        return i5;
    }

    public final int r(int i5) {
        if (i5 < this.f24320e.length()) {
            return i5;
        }
        return -1;
    }

    public int s() {
        char charAt;
        int i5 = this.f24316a;
        if (i5 == -1) {
            return i5;
        }
        while (true) {
            String str = this.f24320e;
            if (i5 >= str.length() || !((charAt = str.charAt(i5)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i5++;
        }
        this.f24316a = i5;
        return i5;
    }

    public final boolean t() {
        int s8 = s();
        String str = this.f24320e;
        if (s8 >= str.length() || s8 == -1 || str.charAt(s8) != ',') {
            return false;
        }
        this.f24316a++;
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) this.f24320e);
        sb2.append("', currentPosition=");
        return d9.e.i(sb2, this.f24316a, ')');
    }

    public final void u(char c2) {
        int i5 = this.f24316a;
        if (i5 > 0 && c2 == '\"') {
            try {
                this.f24316a = i5 - 1;
                String j = j();
                this.f24316a = i5;
                if (Intrinsics.areEqual(j, "null")) {
                    l(this.f24316a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f24316a = i5;
                throw th2;
            }
        }
        String t3 = j.t(j.h(c2));
        int i10 = this.f24316a;
        int i11 = i10 - 1;
        String str = this.f24320e;
        m(this, "Expected " + t3 + ", but had '" + ((i10 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11))) + "' instead", i11, null, 4);
        throw null;
    }
}
