package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n8n extends r8n {
    public final byte[] c;
    public final int d;
    public int e;

    public n8n(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            a70.p(dmi.k(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // defpackage.r8n
    public final void a(int i, int i2) {
        n((i << 3) | i2);
    }

    @Override // defpackage.r8n
    public final void b(int i, int i2) {
        n(i << 3);
        m(i2);
    }

    @Override // defpackage.r8n
    public final void c(int i, int i2) {
        n(i << 3);
        n(i2);
    }

    @Override // defpackage.r8n
    public final void d(int i, int i2) {
        n((i << 3) | 5);
        o(i2);
    }

    @Override // defpackage.r8n
    public final void e(int i, long j) {
        n(i << 3);
        p(j);
    }

    @Override // defpackage.r8n
    public final void f(int i, long j) {
        n((i << 3) | 1);
        q(j);
    }

    @Override // defpackage.r8n
    public final void g(int i, boolean z) {
        n(i << 3);
        l(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.r8n
    public final void h(int i, String str) {
        n((i << 3) | 2);
        int i2 = this.e;
        try {
            int r = r8n.r(str.length() * 3);
            int r2 = r8n.r(str.length());
            byte[] bArr = this.c;
            if (r2 != r) {
                n(vdn.b(str));
                int i3 = this.e;
                this.e = vdn.c(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + r2;
                this.e = i4;
                int c = vdn.c(str, bArr, i4, bArr.length - i4);
                this.e = i2;
                n((c - i2) - r2);
                this.e = c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new p8n("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    @Override // defpackage.r8n
    public final void i(int i, g8n g8nVar) {
        n((i << 3) | 2);
        n(g8nVar.d());
        g8nVar.n(this);
    }

    @Override // defpackage.r8n
    public final void j(int i, k7n k7nVar) {
        n(11);
        c(2, i);
        n(26);
        y9n y9nVar = (y9n) k7nVar;
        n(y9nVar.e());
        y9nVar.d(this);
        n(12);
    }

    @Override // defpackage.r8n
    public final void k(int i, g8n g8nVar) {
        n(11);
        c(2, i);
        i(3, g8nVar);
        n(12);
    }

    @Override // defpackage.r8n
    public final void l(byte b) {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new p8n(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.r8n
    public final void m(int i) {
        if (i >= 0) {
            n(i);
        } else {
            p(i);
        }
    }

    @Override // defpackage.r8n
    public final void n(int i) {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new p8n(i2, this.d, 1, e);
                }
            }
            throw new p8n(i2, this.d, 1, e);
        }
    }

    @Override // defpackage.r8n
    public final void o(int i) {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new p8n(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.r8n
    public final void p(long j) {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!r8n.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new p8n(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new p8n(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                qdn.c.o(bArr, qdn.f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            qdn.c.o(bArr, qdn.f + i2, (byte) j);
        }
        this.e = i;
    }

    @Override // defpackage.r8n
    public final void q(long j) {
        int i = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new p8n(i, this.d, 8, e);
        }
    }

    public final void t(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new p8n(this.e, this.d, i2, e);
        }
    }

    public final int u() {
        return this.d - this.e;
    }
}
