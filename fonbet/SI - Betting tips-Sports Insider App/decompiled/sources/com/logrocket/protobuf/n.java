package com.logrocket.protobuf;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f6753f;

    /* renamed from: g, reason: collision with root package name */
    public final ByteBuffer f6754g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6755h;

    public n(ByteBuffer byteBuffer) {
        this.f6753f = byteBuffer;
        this.f6754g = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f6755h = byteBuffer.position();
    }

    @Override // com.logrocket.protobuf.p
    public final void A(int i5, int i10) {
        K(i5, 5);
        B(i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void B(int i5) {
        try {
            this.f6754g.putInt(i5);
        } catch (BufferOverflowException e7) {
            throw new m(e7);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void C(int i5, long j) {
        K(i5, 1);
        D(j);
    }

    @Override // com.logrocket.protobuf.p
    public final void D(long j) {
        try {
            this.f6754g.putLong(j);
        } catch (BufferOverflowException e7) {
            throw new m(e7);
        }
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
        ByteBuffer byteBuffer = this.f6754g;
        int position = byteBuffer.position();
        try {
            int p10 = p.p(str.length() * 3);
            int p11 = p.p(str.length());
            if (p11 != p10) {
                M(a2.c(str));
                try {
                    a2.b(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    throw new m(e7);
                }
            }
            int position2 = byteBuffer.position() + p11;
            byteBuffer.position(position2);
            try {
                a2.b(str, byteBuffer);
                int position3 = byteBuffer.position();
                byteBuffer.position(position);
                M(position3 - position2);
                byteBuffer.position(position3);
            } catch (IndexOutOfBoundsException e9) {
                throw new m(e9);
            }
        } catch (z1 e10) {
            byteBuffer.position(position);
            t(str, e10);
        } catch (IllegalArgumentException e11) {
            throw new m(e11);
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
        while (true) {
            int i10 = i5 & (-128);
            ByteBuffer byteBuffer = this.f6754g;
            if (i10 == 0) {
                byteBuffer.put((byte) i5);
                return;
            }
            try {
                byteBuffer.put((byte) ((i5 & 127) | 128));
                i5 >>>= 7;
            } catch (BufferOverflowException e7) {
                throw new m(e7);
            }
            throw new m(e7);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void N(int i5, long j) {
        K(i5, 0);
        O(j);
    }

    @Override // com.logrocket.protobuf.p
    public final void O(long j) {
        while (true) {
            long j6 = (-128) & j;
            ByteBuffer byteBuffer = this.f6754g;
            if (j6 == 0) {
                byteBuffer.put((byte) j);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e7) {
                throw new m(e7);
            }
            throw new m(e7);
        }
    }

    @Override // com.logrocket.protobuf.l1
    public final void f(byte[] bArr, int i5, int i10) {
        try {
            this.f6754g.put(bArr, i5, i10);
        } catch (IndexOutOfBoundsException e7) {
            throw new m(e7);
        } catch (BufferOverflowException e9) {
            throw new m(e9);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void r() {
        this.f6753f.position(this.f6754g.position());
    }

    @Override // com.logrocket.protobuf.p
    public final int s() {
        return this.f6754g.position() - this.f6755h;
    }

    @Override // com.logrocket.protobuf.p
    public final void v(byte b10) {
        try {
            this.f6754g.put(b10);
        } catch (BufferOverflowException e7) {
            throw new m(e7);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void w(int i5, boolean z5) {
        K(i5, 0);
        v(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // com.logrocket.protobuf.p
    public final void x(int i5, byte[] bArr) {
        M(i5);
        try {
            this.f6754g.put(bArr, 0, i5);
        } catch (IndexOutOfBoundsException e7) {
            throw new m(e7);
        } catch (BufferOverflowException e9) {
            throw new m(e9);
        }
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
