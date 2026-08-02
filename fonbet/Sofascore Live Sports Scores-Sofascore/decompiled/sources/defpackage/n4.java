package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class n4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public n4(gfa gfaVar) {
        this.a = 0;
        this.d = gfaVar;
        this.e = new mbd(gfaVar);
        this.f = new StringBuilder();
    }

    public static /* synthetic */ void s(n4 n4Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = n4Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        n4Var.r(i, str, str2);
        throw null;
    }

    public static boolean v(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract int A();

    public String B(int i, int i2) {
        return u().subSequence(i, i2).toString();
    }

    public boolean C() {
        int A = A();
        CharSequence u = u();
        if (A >= u.length() || A == -1 || u.charAt(A) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean D(boolean z) {
        int z2 = z(A());
        int length = u().length() - z2;
        if (length >= 4 && z2 != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != u().charAt(z2 + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || lz.C(u().charAt(z2 + 4)) != 0) {
                    if (z) {
                        this.b = z2 + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void E(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String n = n();
                this.b = i;
                if (Intrinsics.c(n, "null")) {
                    r(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String R = lz.R(lz.C(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        s(this, bf3.k("Expected ", R, ", but had '", (i2 == u().length() || i3 < 0) ? "EOF" : String.valueOf(u().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public void a() {
        this.c = (Map.Entry) this.f;
        Iterator it = (Iterator) this.e;
        this.f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public int c(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (t(charSequence, i + 3) + (t(charSequence, i) << 12) + (t(charSequence, i + 1) << 8) + (t(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        p();
        if (this.b + 4 < charSequence.length()) {
            return c(charSequence, this.b);
        }
        s(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void d(int i, int i2) {
        ((StringBuilder) this.f).append(u(), i, i2);
    }

    public abstract boolean e();

    public void f(int i, String str) {
        if (u().length() - i < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (u().charAt(i + i2) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + n() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String g();

    public abstract byte h();

    public boolean hasNext() {
        return ((Map.Entry) this.f) != null;
    }

    public byte i(byte b) {
        byte h = h();
        if (h == b) {
            return h;
        }
        String R = lz.R(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        s(this, bf3.k("Expected ", R, ", but had '", (i == u().length() || i2 < 0) ? "EOF" : String.valueOf(u().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void j(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x013b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (r21 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if (u().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        s(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0163, code lost:
    
        s(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r22.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        if (r8 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        s(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        if (r8 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        defpackage.zzl.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r21 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c9, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        s(r22, "Expected numeric literal", r11, null, 4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char charAt;
        int z5 = z(A());
        if (z5 >= u().length() || z5 == -1) {
            s(this, "EOF", 0, null, 6);
            throw null;
        }
        if (u().charAt(z5) == '\"') {
            z5++;
            if (z5 == u().length()) {
                s(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = z5;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == u().length()) {
                z2 = z;
                z3 = z7;
                z4 = z8;
                break;
            }
            charAt = u().charAt(i);
            z2 = z;
            if ((charAt != 'e' && charAt != 'E') || z7) {
                z3 = z7;
                if (charAt == '-' && z3) {
                    if (i == z5) {
                        s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z7 = z3;
                    z6 = false;
                } else if (charAt != '+' || !z3) {
                    z4 = z8;
                    if (charAt != '-') {
                        if (lz.C(charAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = charAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            break;
                        }
                        if (z3) {
                            j = (j * 10) + i3;
                        } else {
                            j2 = (j2 * 10) - i3;
                            if (j2 > 0) {
                                s(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z7 = z3;
                        z8 = z4;
                    } else {
                        if (i != z5) {
                            s(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z7 = z3;
                        z8 = true;
                    }
                } else {
                    if (i == z5) {
                        s(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z7 = z3;
                    z6 = true;
                }
            } else {
                if (i == z5) {
                    s(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z = z2;
                z6 = true;
                z7 = true;
            }
        }
        s(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
        throw null;
    }

    public String l() {
        String str = (String) this.c;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.c = null;
        return str;
    }

    public String m(int i, int i2, CharSequence charSequence) {
        String sb;
        StringBuilder sb2 = (StringBuilder) this.f;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                d(i, i2);
                int z2 = z(i2 + 1);
                if (z2 == -1) {
                    s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int i3 = z2 + 1;
                char charAt2 = u().charAt(z2);
                if (charAt2 == 'u') {
                    i3 = c(u(), i3);
                } else {
                    char c = charAt2 < 'u' ? yo2.a[charAt2] : (char) 0;
                    if (c == 0) {
                        s(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb2.append(c);
                }
                i = z(i3);
                if (i == -1) {
                    s(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    d(i, i2);
                    i = z(i2);
                    if (i == -1) {
                        s(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (z) {
            d(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        } else {
            sb = B(i, i2);
        }
        this.b = i2 + 1;
        return sb;
    }

    public String n() {
        String str;
        StringBuilder sb = (StringBuilder) this.f;
        String str2 = (String) this.c;
        if (str2 != null) {
            str2.getClass();
            this.c = null;
            return str2;
        }
        int A = A();
        if (A >= u().length() || A == -1) {
            s(this, "EOF", A, null, 4);
            throw null;
        }
        byte C = lz.C(u().charAt(A));
        if (C == 1) {
            return l();
        }
        if (C != 0) {
            s(this, "Expected beginning of the string, but got " + u().charAt(A), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (lz.C(u().charAt(A)) == 0) {
            A++;
            if (A >= u().length()) {
                d(this.b, A);
                int z2 = z(A);
                if (z2 == -1) {
                    this.b = A;
                    d(0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                A = z2;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            d(i, A);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = B(i, A);
        }
        this.b = A;
        return str;
    }

    public String o() {
        String n = n();
        if (!Intrinsics.c(n, "null") || u().charAt(this.b - 1) == '\"') {
            return n;
        }
        s(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void q() {
        if (h() == 10) {
            return;
        }
        s(this, "Expected EOF after parsing, but had " + u().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void r(int i, String str, String str2) {
        String d = ((mbd) this.e).d();
        CharSequence u = u();
        u.getClass();
        throw new ofa(yfa.m(i, str, d, str2, ((gfa) this.d).l ? yfa.u(u, i).toString() : null));
    }

    public void remove() {
        koh kohVar = (koh) this.d;
        if (kohVar.e().d != this.b) {
            a70.o();
            return;
        }
        Map.Entry entry = (Map.Entry) this.c;
        if (entry == null) {
            zzl.s();
            return;
        }
        kohVar.remove(entry.getKey());
        this.c = null;
        Unit unit = Unit.a;
        this.b = kohVar.e().d;
    }

    public int t(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        s(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) u());
                sb.append("', currentPosition=");
                return wv8.j(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public abstract CharSequence u();

    public abstract String w(String str, boolean z);

    public byte x() {
        CharSequence u = u();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return (byte) 10;
            }
            char charAt = u.charAt(z);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.b = z;
                return lz.C(charAt);
            }
            i = z + 1;
        }
    }

    public String y(boolean z) {
        String l;
        byte x = x();
        if (z) {
            if (x != 1 && x != 0) {
                return null;
            }
            l = n();
        } else {
            if (x != 1) {
                return null;
            }
            l = l();
        }
        this.c = l;
        return l;
    }

    public abstract int z(int i);

    public n4(int i, String str, String str2, String str3, String str4) {
        this.a = 1;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public n4(koh kohVar, Iterator it) {
        this.a = 2;
        this.d = kohVar;
        this.e = it;
        this.b = kohVar.e().d;
        a();
    }

    public void p() {
    }
}
