package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e8n extends d8n {
    public final byte[] c;

    public e8n(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.d8n
    public final boolean A(g8n g8nVar, int i, int i2) {
        int d = g8nVar.d();
        byte[] bArr = this.c;
        if (i2 > d) {
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            hbo.f(length + 18 + String.valueOf(length2).length(), i2, length2);
            return false;
        }
        int i3 = i + i2;
        if (i3 <= g8nVar.d()) {
            if (g8nVar instanceof e8n) {
                return g8n.z(bArr, 0, i, ((e8n) g8nVar).c, i2);
            }
            if (!(g8nVar instanceof y7n)) {
                return g8nVar.e(i, i3).equals(e(0, i2));
            }
            y7n y7nVar = (y7n) g8nVar;
            return g8n.z(bArr, 0, y7nVar.d + i, y7nVar.c, i2);
        }
        int d2 = g8nVar.d();
        int length3 = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(d2).length());
        me4.r(sb, "Ran off end of other: ", i, ", ", i2);
        a70.p(me4.g(d2, ", ", sb));
        return false;
    }

    @Override // defpackage.g8n
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // defpackage.g8n
    public final int d() {
        return this.c.length;
    }

    @Override // defpackage.g8n
    public final g8n e(int i, int i2) {
        byte[] bArr = this.c;
        int y = g8n.y(i, i2, bArr.length);
        return y == 0 ? g8n.b : new y7n(bArr, i, y);
    }

    @Override // defpackage.g8n
    public final void m(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // defpackage.g8n
    public final void n(n8n n8nVar) {
        byte[] bArr = this.c;
        n8nVar.t(0, bArr.length, bArr);
    }

    @Override // defpackage.g8n
    public final boolean o(g8n g8nVar) {
        boolean z = g8nVar instanceof e8n;
        byte[] bArr = this.c;
        return z ? Arrays.equals(bArr, ((e8n) g8nVar).c) : g8nVar instanceof y7n ? A(g8nVar, 0, bArr.length) : g8nVar.o(this);
    }

    @Override // defpackage.g8n
    public final int q(int i, int i2, int i3) {
        return jan.a(i, i2, i3, this.c);
    }

    @Override // defpackage.g8n
    public final m8n r() {
        byte[] bArr = this.c;
        int length = bArr.length;
        k8n k8nVar = new k8n(bArr, length);
        try {
            k8nVar.a(length);
            return k8nVar;
        } catch (lan e) {
            ilg.k(e);
            return null;
        }
    }
}
