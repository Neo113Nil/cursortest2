package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y7n extends d8n {
    public final byte[] c;
    public final int d;
    public final int e;

    public y7n(byte[] bArr, int i, int i2) {
        g8n.y(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.d8n
    public final boolean A(g8n g8nVar, int i, int i2) {
        if (i2 > g8nVar.d()) {
            int length = String.valueOf(i2).length();
            int i3 = this.e;
            hbo.f(length + 18 + String.valueOf(i3).length(), i2, i3);
            return false;
        }
        int i4 = i + i2;
        if (i4 > g8nVar.d()) {
            int d = g8nVar.d();
            int length2 = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length2 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(d).length());
            me4.r(sb, "Ran off end of other: ", i, ", ", i2);
            a70.p(me4.g(d, ", ", sb));
            return false;
        }
        boolean z = g8nVar instanceof e8n;
        byte[] bArr = this.c;
        int i5 = this.d;
        if (z) {
            return g8n.z(bArr, i5, i, ((e8n) g8nVar).c, i2);
        }
        if (!(g8nVar instanceof y7n)) {
            return g8nVar.e(i, i4).equals(e(i5, i2 + i5));
        }
        y7n y7nVar = (y7n) g8nVar;
        return g8n.z(bArr, i5, y7nVar.d + i, y7nVar.c, i2);
    }

    @Override // defpackage.g8n
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.g8n
    public final int d() {
        return this.e;
    }

    @Override // defpackage.g8n
    public final g8n e(int i, int i2) {
        int y = g8n.y(i, i2, this.e);
        if (y == 0) {
            return g8n.b;
        }
        return new y7n(this.c, this.d + i, y);
    }

    @Override // defpackage.g8n
    public final void m(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.c, this.d + i, bArr, i2, i3);
    }

    @Override // defpackage.g8n
    public final void n(n8n n8nVar) {
        n8nVar.t(this.d, this.e, this.c);
    }

    @Override // defpackage.g8n
    public final boolean o(g8n g8nVar) {
        return ((g8nVar instanceof e8n) || (g8nVar instanceof y7n)) ? A(g8nVar, 0, this.e) : g8nVar.o(this);
    }

    @Override // defpackage.g8n
    public final int q(int i, int i2, int i3) {
        return jan.a(i, this.d + i2, i3, this.c);
    }

    @Override // defpackage.g8n
    public final m8n r() {
        throw null;
    }
}
