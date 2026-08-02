package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ocn extends g8n {
    public static final int[] h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int c;
    public final g8n d;
    public final g8n e;
    public final int f;
    public final int g;

    public ocn(g8n g8nVar, g8n g8nVar2) {
        this.d = g8nVar;
        this.e = g8nVar2;
        int d = g8nVar.d();
        this.f = d;
        this.c = g8nVar2.d() + d;
        this.g = Math.max(g8nVar.s(), g8nVar2.s()) + 1;
    }

    public static int A(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return h[i];
    }

    public static e8n B(g8n g8nVar, g8n g8nVar2) {
        int d = g8nVar.d();
        int d2 = g8nVar2.d();
        int i = d + d2;
        byte[] bArr = new byte[i];
        g8n.y(0, d, g8nVar.d());
        g8n.y(0, d, i);
        if (d > 0) {
            g8nVar.m(0, 0, d, bArr);
        }
        g8n.y(0, d2, g8nVar2.d());
        g8n.y(d, i, i);
        if (d2 > 0) {
            g8nVar2.m(0, d, d2, bArr);
        }
        try {
            return i == 0 ? g8n.b : new e8n(bArr);
        } catch (lan e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // defpackage.g8n
    public final byte c(int i) {
        int i2 = this.f;
        return i < i2 ? this.d.c(i) : this.e.c(i - i2);
    }

    @Override // defpackage.g8n
    public final int d() {
        return this.c;
    }

    @Override // defpackage.g8n
    public final g8n e(int i, int i2) {
        int i3 = this.c;
        int y = g8n.y(i, i2, i3);
        if (y == 0) {
            return g8n.b;
        }
        if (y == i3) {
            return this;
        }
        g8n g8nVar = this.d;
        int i4 = this.f;
        if (i2 <= i4) {
            return g8nVar.e(i, i2);
        }
        int i5 = i2 - i4;
        g8n g8nVar2 = this.e;
        return i >= i4 ? g8nVar2.e(i - i4, i5) : new ocn(g8nVar.e(i, g8nVar.d()), g8nVar2.e(0, i5));
    }

    @Override // defpackage.g8n, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new mcn(this);
    }

    @Override // defpackage.g8n
    public final void m(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        g8n g8nVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            g8nVar.m(i, i2, i3, bArr);
            return;
        }
        g8n g8nVar2 = this.e;
        if (i >= i5) {
            g8nVar2.m(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        g8nVar.m(i, i2, i6, bArr);
        g8nVar2.m(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // defpackage.g8n
    public final void n(n8n n8nVar) {
        this.d.n(n8nVar);
        this.e.n(n8nVar);
    }

    @Override // defpackage.g8n
    public final boolean o(g8n g8nVar) {
        v6g v6gVar = new v6g(this);
        d8n b = v6gVar.b();
        v6g v6gVar2 = new v6g(g8nVar);
        d8n b2 = v6gVar2.b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int d = b.d() - i;
            int d2 = b2.d() - i2;
            int min = Math.min(d, d2);
            if (!(i == 0 ? b.A(b2, i2, min) : b2.A(b, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.c;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                zzl.s();
                return false;
            }
            if (min == d) {
                i = 0;
                b = v6gVar.b();
            } else {
                i += min;
                b = b;
            }
            if (min == d2) {
                b2 = v6gVar2.b();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // defpackage.g8n
    public final int q(int i, int i2, int i3) {
        int i4 = i2 + i3;
        g8n g8nVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return g8nVar.q(i, i2, i3);
        }
        g8n g8nVar2 = this.e;
        if (i2 >= i5) {
            return g8nVar2.q(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return g8nVar2.q(g8nVar.q(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.g8n
    public final m8n r() {
        throw null;
    }

    @Override // defpackage.g8n
    public final int s() {
        return this.g;
    }

    @Override // defpackage.g8n
    public final boolean t() {
        return this.c >= A(this.g);
    }

    @Override // defpackage.g8n
    /* renamed from: u */
    public final x7n iterator() {
        return new mcn(this);
    }
}
