package org.jsoup.parser;

import B0.A0;

/* loaded from: classes10.dex */
public final class G implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f79440b = {'*', '|', '_', '-'};

    /* renamed from: a, reason: collision with root package name */
    private final C8817f f79441a;

    public G(String str) {
        this.f79441a = new C8817f(str);
    }

    public static String I(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder b11 = Of.k.b();
        char c11 = 0;
        for (char c12 : str.toCharArray()) {
            if (c12 != '\\') {
                b11.append(c12);
            } else if (c11 == '\\') {
                b11.append(c12);
                c11 = 0;
            }
            c11 = c12;
        }
        return Of.k.l(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(char c11) {
        return c11 == '-' || Of.k.g(c11) || c11 == '_' || Of.k.e(c11) || c11 >= 128;
    }

    public final String B() {
        return this.f79441a.B();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f79441a.close();
    }

    public final void d() {
        C8817f c8817f = this.f79441a;
        if (c8817f.O()) {
            return;
        }
        c8817f.c();
    }

    public final String j(char c11, char c12) {
        StringBuilder b11 = Of.k.b();
        C8817f c8817f = this.f79441a;
        c8817f.W();
        char c13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        boolean z13 = false;
        while (!c8817f.O()) {
            char m11 = c8817f.m();
            if (c13 == '\\') {
                if (m11 == 'Q') {
                    z13 = true;
                } else if (m11 == 'E') {
                    z13 = false;
                }
                b11.append(m11);
            } else {
                if (m11 == '\'' && m11 != c11 && !z11) {
                    z12 = !z12;
                } else if (m11 == '\"' && m11 != c11 && !z12) {
                    z11 = !z11;
                }
                if (z12 || z11 || z13) {
                    b11.append(m11);
                } else if (m11 == c11) {
                    i11++;
                    if (i11 > 1) {
                        b11.append(m11);
                    }
                } else if (m11 == c12) {
                    i11--;
                    if (i11 > 0) {
                        b11.append(m11);
                    }
                } else {
                    b11.append(m11);
                }
            }
            if (i11 <= 0) {
                break;
            }
            c13 = m11;
        }
        String l11 = Of.k.l(b11);
        if (i11 <= 0) {
            return l11;
        }
        c8817f.K0();
        throw new Nf.c(A0.b("Did not find balanced marker at '", l11, "'"));
    }

    public final char k() {
        return this.f79441a.m();
    }

    public final String m() {
        char L11;
        C8817f c8817f = this.f79441a;
        if (c8817f.O()) {
            throw new IllegalArgumentException("CSS identifier expected, but end of input found");
        }
        String t2 = c8817f.t(new E(), -1);
        char L12 = c8817f.L();
        if (L12 != '\\' && L12 != 0) {
            return t2;
        }
        StringBuilder b11 = Of.k.b();
        if (!t2.isEmpty()) {
            b11.append(t2);
        }
        while (!c8817f.O()) {
            char L13 = c8817f.L();
            if (!s(L13)) {
                if (L13 != 0) {
                    if (L13 != '\\') {
                        break;
                    }
                    d();
                    if (!c8817f.O() && ((L11 = c8817f.L()) == '\n' || L11 == '\r' || L11 == '\f')) {
                        c8817f.T0();
                        break;
                    }
                    if (c8817f.O()) {
                        b11.append((char) 65533);
                    } else {
                        char m11 = c8817f.m();
                        if (Of.k.h(m11)) {
                            c8817f.T0();
                            String t11 = c8817f.t(new F(), 6);
                            try {
                                int parseInt = Integer.parseInt(t11, 16);
                                if (parseInt == 0 || !Character.isValidCodePoint(parseInt) || Character.isSurrogate((char) parseInt)) {
                                    b11.append((char) 65533);
                                } else {
                                    b11.appendCodePoint(parseInt);
                                }
                                if (!c8817f.O()) {
                                    char L14 = c8817f.L();
                                    if (L14 == '\r') {
                                        d();
                                        if (!c8817f.O() && c8817f.L() == '\n') {
                                            d();
                                        }
                                    } else if (L14 == ' ' || L14 == '\t' || L14 == '\n' || L14 == '\r' || L14 == '\f') {
                                        d();
                                    }
                                }
                            } catch (NumberFormatException e11) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(t11), e11);
                            }
                        } else {
                            b11.append(m11);
                        }
                    }
                } else {
                    d();
                    b11.append((char) 65533);
                }
            } else {
                b11.append(c8817f.m());
            }
        }
        return Of.k.l(b11);
    }

    public final String o() {
        char[] cArr = f79440b;
        StringBuilder b11 = Of.k.b();
        while (true) {
            C8817f c8817f = this.f79441a;
            if (!c8817f.O()) {
                char L11 = c8817f.L();
                if (L11 != '\\') {
                    if (!z() && !c8817f.d0(cArr)) {
                        break;
                    }
                    b11.append(L11);
                    d();
                } else {
                    d();
                    if (c8817f.O()) {
                        break;
                    }
                    b11.append(c8817f.m());
                }
            } else {
                break;
            }
        }
        return Of.k.l(b11);
    }

    public final String p(String... strArr) {
        StringBuilder b11 = Of.k.b();
        loop0: while (true) {
            C8817f c8817f = this.f79441a;
            if (c8817f.O()) {
                break;
            }
            for (String str : strArr) {
                if (c8817f.s0(str)) {
                    break loop0;
                }
            }
            b11.append(c8817f.m());
        }
        return Of.k.l(b11);
    }

    public final boolean q() {
        boolean z11 = false;
        while (Of.k.i(this.f79441a.L())) {
            d();
            z11 = true;
        }
        return z11;
    }

    public final boolean r() {
        return this.f79441a.O();
    }

    public final boolean t(char c11) {
        if (!this.f79441a.b0(c11)) {
            return false;
        }
        k();
        return true;
    }

    public final String toString() {
        return this.f79441a.toString();
    }

    public final boolean v(String str) {
        return this.f79441a.Z(str);
    }

    public final boolean w() {
        return this.f79441a.s0("*|");
    }

    public final boolean x() {
        return this.f79441a.b0('[');
    }

    public final boolean y(char... cArr) {
        return this.f79441a.d0(cArr);
    }

    public final boolean z() {
        return Character.isLetterOrDigit(this.f79441a.L());
    }
}
