package net.time4j.format.expert;

import java.util.Locale;
import java.util.Set;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class m implements h {

    /* renamed from: a, reason: collision with root package name */
    public final char f58002a;

    /* renamed from: b, reason: collision with root package name */
    public final char f58003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58004c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5907c f58005d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58006e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58007f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58008g;

    public m(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing literal.");
        }
        char charAt = str.charAt(0);
        this.f58002a = charAt;
        this.f58003b = charAt;
        this.f58005d = null;
        this.f58004c = str;
        if (charAt < ' ') {
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        this.f58006e = true;
        this.f58007f = str.length() == 1 && j(charAt);
        this.f58008g = false;
    }

    public static boolean g(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    public static boolean i(char c10) {
        return c10 == 8206 || c10 == 8207 || c10 == 1564;
    }

    public static boolean j(char c10) {
        return (Character.isLetter(c10) || Character.isDigit(c10) || i(c10)) ? false : true;
    }

    public static int n(CharSequence charSequence, int i10, CharSequence charSequence2, boolean z10, boolean z11) {
        char charAt;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length2; i12++) {
            char charAt2 = charSequence2.charAt(i12);
            if (!i(charAt2)) {
                if (z11) {
                    charAt = 0;
                    while (true) {
                        int i13 = i11 + i10;
                        if (i13 >= length) {
                            break;
                        }
                        charAt = charSequence.charAt(i13);
                        if (!i(charAt)) {
                            break;
                        }
                        i11++;
                    }
                } else {
                    int i14 = i11 + i10;
                    charAt = i14 < length ? charSequence.charAt(i14) : (char) 0;
                }
                if (i11 + i10 >= length) {
                    return -1;
                }
                i11++;
                if (z10) {
                    if (!g(charAt, charAt2)) {
                        return -1;
                    }
                } else if (charAt != charAt2) {
                    return -1;
                }
            }
        }
        if (z11) {
            while (true) {
                int i15 = i11 + i10;
                if (i15 >= length || !i(charSequence.charAt(i15))) {
                    break;
                }
                i11++;
            }
        }
        return i11;
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        InterfaceC5907c interfaceC5907c = this.f58005d;
        if (interfaceC5907c != null) {
            appendable.append(((Character) interfaceC5908d.b(interfaceC5907c, null)).charValue());
            return 1;
        }
        String str = this.f58004c;
        if (str == null) {
            appendable.append(this.f58002a);
            return 1;
        }
        appendable.append(str);
        return this.f58004c.length();
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return null;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        if (!z10 || !this.f58007f) {
            if (this.f58004c == null) {
                l(charSequence, sVar, interfaceC5908d, z10);
                return;
            } else {
                m(charSequence, sVar, interfaceC5908d, z10);
                return;
            }
        }
        int f10 = sVar.f();
        if (f10 < charSequence.length() && charSequence.charAt(f10) == this.f58002a) {
            sVar.l(f10 + 1);
        } else {
            if (this.f58002a == '.' && ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
                return;
            }
            k(charSequence, sVar);
        }
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        boolean q10 = net.time4j.format.b.q((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT));
        return new m(this.f58002a, this.f58003b, this.f58004c, this.f58005d, ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue(), this.f58007f && !q10, q10);
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return this.f58004c != null && h() == this.f58004c.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            InterfaceC5907c interfaceC5907c = this.f58005d;
            if (interfaceC5907c != null) {
                return interfaceC5907c.equals(mVar.f58005d);
            }
            String str = this.f58004c;
            if (str == null) {
                return mVar.f58004c == null && this.f58002a == mVar.f58002a && this.f58003b == mVar.f58003b;
            }
            if (str.equals(mVar.f58004c) && this.f58007f == mVar.f58007f) {
                return true;
            }
        }
        return false;
    }

    public int h() {
        String str = this.f58004c;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length && Character.isDigit(this.f58004c.charAt(i11)); i11++) {
            i10++;
        }
        return i10;
    }

    public int hashCode() {
        String name;
        InterfaceC5907c interfaceC5907c = this.f58005d;
        if (interfaceC5907c == null) {
            name = this.f58004c;
            if (name == null) {
                name = "";
            }
        } else {
            name = interfaceC5907c.name();
        }
        return name.hashCode() ^ this.f58002a;
    }

    public final void k(CharSequence charSequence, s sVar) {
        int f10 = sVar.f();
        sVar.k(f10, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.f58004c + "], found: [" + charSequence.subSequence(f10, Math.min(this.f58004c.length() + f10, charSequence.length())) + "])");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (g(r2, r5) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, boolean z10) {
        char c10;
        int f10 = sVar.f();
        char c11 = this.f58002a;
        InterfaceC5907c interfaceC5907c = this.f58005d;
        boolean z11 = false;
        if (interfaceC5907c != null) {
            c11 = ((Character) interfaceC5908d.b(interfaceC5907c, (char) 0)).charValue();
        }
        if (f10 >= charSequence.length() || c11 == 0 || Character.isDigit(c11)) {
            c10 = 0;
            z11 = true;
        } else {
            c10 = charSequence.charAt(f10);
            char c12 = this.f58003b;
            if (this.f58005d != null && net.time4j.format.a.f57816o.name().equals(this.f58005d.name())) {
                Locale locale = Locale.ROOT;
                if (locale.equals(interfaceC5908d.b(net.time4j.format.a.f57804c, locale))) {
                    c12 = '.';
                    if (c11 != ',') {
                        c12 = c11 == '.' ? ',' : c11;
                    }
                }
            }
            boolean z12 = (c10 == c11 || c10 == c12) ? false : true;
            if (z12) {
                if (z10 ? this.f58006e : ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue()) {
                    if (!g(c10, c11)) {
                    }
                }
            }
            z11 = z12;
        }
        if (!z11) {
            sVar.l(f10 + 1);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot parse: \"");
        sb2.append(charSequence);
        sb2.append("\" (expected: [");
        sb2.append(c11);
        sb2.append("], found: [");
        if (c10 != 0) {
            sb2.append(c10);
        }
        sb2.append("])");
        sVar.k(f10, sb2.toString());
    }

    public final void m(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, boolean z10) {
        int f10 = sVar.f();
        int n10 = n(charSequence, f10, this.f58004c, z10 ? this.f58006e : ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue(), z10 ? this.f58008g : net.time4j.format.b.q((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)));
        if (n10 == -1) {
            k(charSequence, sVar);
        } else {
            sVar.l(f10 + n10);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getName());
        sb2.append("[literal=");
        if (this.f58005d != null) {
            sb2.append('{');
            sb2.append(this.f58005d);
            sb2.append('}');
        } else {
            String str = this.f58004c;
            if (str == null) {
                sb2.append(this.f58002a);
                if (this.f58003b != this.f58002a) {
                    sb2.append(", alternative=");
                    sb2.append(this.f58003b);
                }
            } else {
                sb2.append(str);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public m(char c10, char c11) {
        this.f58002a = c10;
        this.f58003b = c11;
        this.f58005d = null;
        this.f58004c = null;
        if (c10 >= ' ' && c11 >= ' ') {
            if (!Character.isDigit(c10) && !Character.isDigit(c11)) {
                this.f58006e = true;
                this.f58007f = false;
                this.f58008g = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        }
        throw new IllegalArgumentException("Literal must not start with non-printable char.");
    }

    public m(InterfaceC5907c interfaceC5907c) {
        if (interfaceC5907c != null) {
            this.f58002a = (char) 0;
            this.f58003b = (char) 0;
            this.f58005d = interfaceC5907c;
            this.f58004c = null;
            this.f58006e = true;
            this.f58007f = false;
            this.f58008g = false;
            return;
        }
        throw new NullPointerException("Missing format attribute.");
    }

    public m(char c10, char c11, String str, InterfaceC5907c interfaceC5907c, boolean z10, boolean z11, boolean z12) {
        this.f58002a = c10;
        this.f58003b = c11;
        this.f58004c = str;
        this.f58005d = interfaceC5907c;
        this.f58006e = z10;
        this.f58007f = z11;
        this.f58008g = z12;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }
}
