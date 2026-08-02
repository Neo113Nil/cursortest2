package com.logrocket.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f6758f;

    /* renamed from: g, reason: collision with root package name */
    public final ByteBuffer f6759g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6760h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6761i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6762k;

    /* renamed from: l, reason: collision with root package name */
    public long f6763l;

    public o(ByteBuffer byteBuffer) {
        this.f6758f = byteBuffer;
        this.f6759g = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long i5 = x1.f6821c.i(x1.f6825g, byteBuffer);
        this.f6760h = i5;
        long position = byteBuffer.position() + i5;
        this.f6761i = position;
        long limit = i5 + byteBuffer.limit();
        this.j = limit;
        this.f6762k = limit - 10;
        this.f6763l = position;
    }

    @Override // com.logrocket.protobuf.p
    public final void A(int i5, int i10) {
        K(i5, 5);
        B(i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void B(int i5) {
        this.f6759g.putInt((int) (this.f6763l - this.f6760h), i5);
        this.f6763l += 4;
    }

    @Override // com.logrocket.protobuf.p
    public final void C(int i5, long j) {
        K(i5, 1);
        D(j);
    }

    @Override // com.logrocket.protobuf.p
    public final void D(long j) {
        this.f6759g.putLong((int) (this.f6763l - this.f6760h), j);
        this.f6763l += 8;
    }

    @Override // com.logrocket.protobuf.p
    public final void E(int i5, int i10) {
        K(i5, 0);
        F(i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void F(int i5) {
        if (i5 >= 0) {
            M(i5);
        } else {
            O(i5);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void G(int i5, a aVar, g1 g1Var) {
        K(i5, 2);
        M(aVar.b(g1Var));
        g1Var.g(aVar, this.f6775c);
    }

    @Override // com.logrocket.protobuf.p
    public final void H(a aVar) {
        M(((z) aVar).b(null));
        aVar.e(this);
    }

    @Override // com.logrocket.protobuf.p
    public final void I(int i5, String str) {
        K(i5, 2);
        J(str);
    }

    @Override // com.logrocket.protobuf.p
    public final void J(String str) {
        long j = this.f6760h;
        ByteBuffer byteBuffer = this.f6759g;
        long j6 = this.f6763l;
        try {
            int p10 = p.p(str.length() * 3);
            int p11 = p.p(str.length());
            if (p11 != p10) {
                int c2 = a2.c(str);
                M(c2);
                byteBuffer.position((int) (this.f6763l - j));
                a2.b(str, byteBuffer);
                this.f6763l += c2;
                return;
            }
            int i5 = ((int) (this.f6763l - j)) + p11;
            byteBuffer.position(i5);
            a2.b(str, byteBuffer);
            int position = byteBuffer.position() - i5;
            M(position);
            this.f6763l += position;
        } catch (z1 e7) {
            this.f6763l = j6;
            byteBuffer.position((int) (j6 - j));
            t(str, e7);
        } catch (IllegalArgumentException e9) {
            throw new m(e9);
        } catch (IndexOutOfBoundsException e10) {
            throw new m(e10);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void K(int i5, int i10) {
        M((i5 << 3) | i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void L(int i5, int i10) {
        K(i5, 0);
        M(i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void M(int i5) {
        if (this.f6763l <= this.f6762k) {
            while ((i5 & (-128)) != 0) {
                long j = this.f6763l;
                this.f6763l = j + 1;
                x1.k((byte) ((i5 & 127) | 128), j);
                i5 >>>= 7;
            }
            long j6 = this.f6763l;
            this.f6763l = 1 + j6;
            x1.k((byte) i5, j6);
            return;
        }
        while (true) {
            long j10 = this.f6763l;
            long j11 = this.j;
            if (j10 >= j11) {
                throw new m(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f6763l), Long.valueOf(j11), 1));
            }
            if ((i5 & (-128)) == 0) {
                this.f6763l = 1 + j10;
                x1.k((byte) i5, j10);
                return;
            } else {
                this.f6763l = j10 + 1;
                x1.k((byte) ((i5 & 127) | 128), j10);
                i5 >>>= 7;
            }
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void N(int i5, long j) {
        K(i5, 0);
        O(j);
    }

    @Override // com.logrocket.protobuf.p
    public final void O(long j) {
        if (this.f6763l <= this.f6762k) {
            while ((j & (-128)) != 0) {
                long j6 = this.f6763l;
                this.f6763l = j6 + 1;
                x1.k((byte) ((((int) j) & 127) | 128), j6);
                j >>>= 7;
            }
            long j10 = this.f6763l;
            this.f6763l = 1 + j10;
            x1.k((byte) j, j10);
            return;
        }
        while (true) {
            long j11 = this.f6763l;
            long j12 = this.j;
            if (j11 >= j12) {
                throw new m(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f6763l), Long.valueOf(j12), 1));
            }
            if ((j & (-128)) == 0) {
                this.f6763l = 1 + j11;
                x1.k((byte) j, j11);
                return;
            } else {
                this.f6763l = j11 + 1;
                x1.k((byte) ((((int) j) & 127) | 128), j11);
                j >>>= 7;
            }
        }
    }

    public final void P(byte[] bArr, int i5, int i10) {
        long j = this.j;
        if (bArr != null && i5 >= 0 && i10 >= 0 && bArr.length - i10 >= i5) {
            long j6 = i10;
            long j10 = j - j6;
            long j11 = this.f6763l;
            if (j10 >= j11) {
                x1.f6821c.c(bArr, i5, j11, j6);
                this.f6763l += j6;
                return;
            }
        }
        if (bArr != null) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f6763l), Long.valueOf(j), Integer.valueOf(i10)));
        }
        throw new NullPointerException("value");
    }

    @Override // com.logrocket.protobuf.l1
    public final void f(byte[] bArr, int i5, int i10) {
        P(bArr, i5, i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void r() {
        this.f6758f.position((int) (this.f6763l - this.f6760h));
    }

    @Override // com.logrocket.protobuf.p
    public final int s() {
        return (int) (this.f6763l - this.f6761i);
    }

    @Override // com.logrocket.protobuf.p
    public final void v(byte b10) {
        long j = this.f6763l;
        long j6 = this.j;
        if (j >= j6) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f6763l), Long.valueOf(j6), 1));
        }
        this.f6763l = 1 + j;
        x1.k(b10, j);
    }

    @Override // com.logrocket.protobuf.p
    public final void w(int i5, boolean z5) {
        K(i5, 0);
        v(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // com.logrocket.protobuf.p
    public final void x(int i5, byte[] bArr) {
        M(i5);
        P(bArr, 0, i5);
    }

    @Override // com.logrocket.protobuf.p
    public final void y(int i5, j jVar) {
        K(i5, 2);
        z(jVar);
    }

    @Override // com.logrocket.protobuf.p
    public final void z(j jVar) {
        M(jVar.size());
        jVar.p(this);
    }
}
