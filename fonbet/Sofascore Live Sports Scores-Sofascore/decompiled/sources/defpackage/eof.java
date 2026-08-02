package defpackage;

import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class eof extends n4 {
    public final by9 g;
    public final char[] h;
    public int i;
    public final rg0 j;

    public eof(by9 by9Var, char[] cArr, gfa gfaVar) {
        super(gfaVar);
        this.g = by9Var;
        this.h = cArr;
        this.i = 128;
        this.j = new rg0(cArr);
        F(0);
    }

    @Override // defpackage.n4
    public int A() {
        int z;
        char c;
        int i = this.b;
        while (true) {
            z = z(i);
            if (z == -1 || !((c = this.j.a[z]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = z + 1;
        }
        this.b = z;
        return z;
    }

    @Override // defpackage.n4
    public final String B(int i, int i2) {
        rg0 rg0Var = this.j;
        return c.i(rg0Var.a, i, Math.min(i2, rg0Var.b));
    }

    public final void F(int i) {
        rg0 rg0Var = this.j;
        char[] cArr = rg0Var.a;
        if (i != 0) {
            int i2 = this.b;
            mh0.g(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = rg0Var.b;
        while (true) {
            if (i == i3) {
                break;
            }
            by9 by9Var = this.g;
            by9Var.getClass();
            int a = ((wp2) by9Var.a).a(cArr, i, i3 - i);
            if (a == -1) {
                rg0Var.b = Math.min(rg0Var.a.length, i);
                this.i = -1;
                break;
            }
            i += a;
        }
        this.b = 0;
    }

    public final void G() {
        ro2 ro2Var = ro2.c;
        ro2Var.getClass();
        char[] cArr = this.h;
        cArr.getClass();
        if (cArr.length == 16384) {
            ro2Var.C(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // defpackage.n4
    public final void d(int i, int i2) {
        ((StringBuilder) this.f).append(this.j.a, i, i2 - i);
    }

    @Override // defpackage.n4
    public boolean e() {
        p();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return false;
            }
            char c = this.j.a[z];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = z;
                return n4.v(c);
            }
            i = z + 1;
        }
    }

    @Override // defpackage.n4
    public final String g() {
        j('\"');
        int i = this.b;
        rg0 rg0Var = this.j;
        int i2 = rg0Var.b;
        char[] cArr = rg0Var.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int z = z(i);
            int i4 = this.b;
            if (z != -1) {
                return m(i4, z, rg0Var);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            n4.s(this, lnb.o("Expected quotation mark '\"', but had '", (i4 == rg0Var.b || i5 < 0) ? "EOF" : String.valueOf(rg0Var.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return m(this.b, i6, rg0Var);
            }
        }
        this.b = i3 + 1;
        return c.i(cArr, i, Math.min(i3, rg0Var.b));
    }

    @Override // defpackage.n4
    public byte h() {
        p();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return (byte) 10;
            }
            int i2 = z + 1;
            byte C = lz.C(this.j.a[z]);
            if (C != 3) {
                this.b = i2;
                return C;
            }
            i = i2;
        }
    }

    @Override // defpackage.n4
    public void j(char c) {
        p();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                E(c);
                throw null;
            }
            int i2 = z + 1;
            char c2 = this.j.a[z];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.n4
    public final void p() {
        int i = this.j.b - this.b;
        if (i > this.i) {
            return;
        }
        F(i);
    }

    @Override // defpackage.n4
    public final CharSequence u() {
        return this.j;
    }

    @Override // defpackage.n4
    public final String w(String str, boolean z) {
        str.getClass();
        return null;
    }

    @Override // defpackage.n4
    public final int z(int i) {
        rg0 rg0Var = this.j;
        if (i < rg0Var.b) {
            return i;
        }
        this.b = i;
        p();
        return (this.b != 0 || rg0Var.length() == 0) ? -1 : 0;
    }
}
