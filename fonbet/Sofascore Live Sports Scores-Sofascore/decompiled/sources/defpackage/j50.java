package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j50 implements w8l {
    public final int a;
    public final String b;
    public final e1d c = e.f(u4a.e);
    public final e1d d = e.f(Boolean.TRUE);

    public j50(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.w8l
    public final int a(kx4 kx4Var) {
        return e().b;
    }

    @Override // defpackage.w8l
    public final int b(kx4 kx4Var, ema emaVar) {
        return e().c;
    }

    @Override // defpackage.w8l
    public final int c(kx4 kx4Var) {
        return e().d;
    }

    @Override // defpackage.w8l
    public final int d(kx4 kx4Var, ema emaVar) {
        return e().a;
    }

    public final u4a e() {
        return (u4a) ((eoh) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j50) {
            return this.a == ((j50) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        ((eoh) this.d).setValue(Boolean.valueOf(z));
    }

    public final void g(x9l x9lVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            ((eoh) this.c).setValue(x9lVar.a.i(i2));
            f(x9lVar.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return wv8.j(sb, e().d, ')');
    }
}
