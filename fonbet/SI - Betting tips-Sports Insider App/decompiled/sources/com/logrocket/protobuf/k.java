package com.logrocket.protobuf;

import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class k extends p {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f6740f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6741g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6742h;

    /* renamed from: i, reason: collision with root package name */
    public int f6743i;

    public k(byte[] bArr, int i5, int i10) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i11 = i5 + i10;
        if ((i5 | i10 | (bArr.length - i11)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        this.f6740f = bArr;
        this.f6741g = i5;
        this.f6743i = i5;
        this.f6742h = i11;
    }

    @Override // com.logrocket.protobuf.p
    public final void A(int i5, int i10) {
        K(i5, 5);
        B(i10);
    }

    @Override // com.logrocket.protobuf.p
    public final void B(int i5) {
        try {
            byte[] bArr = this.f6740f;
            int i10 = this.f6743i;
            int i11 = i10 + 1;
            this.f6743i = i11;
            bArr[i10] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i10 + 2;
            this.f6743i = i12;
            bArr[i11] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i10 + 3;
            this.f6743i = i13;
            bArr[i12] = (byte) ((i5 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f6743i = i10 + 4;
            bArr[i13] = (byte) ((i5 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e7) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
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
            byte[] bArr = this.f6740f;
            int i5 = this.f6743i;
            int i10 = i5 + 1;
            this.f6743i = i10;
            bArr[i5] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i11 = i5 + 2;
            this.f6743i = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i5 + 3;
            this.f6743i = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i5 + 4;
            this.f6743i = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i14 = i5 + 5;
            this.f6743i = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i5 + 6;
            this.f6743i = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i5 + 7;
            this.f6743i = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f6743i = i5 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e7) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
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
        int i5 = this.f6743i;
        try {
            int p10 = p.p(str.length() * 3);
            int p11 = p.p(str.length());
            byte[] bArr = this.f6740f;
            if (p11 != p10) {
                M(a2.c(str));
                this.f6743i = a2.f6667a.a(str, bArr, this.f6743i, P());
                return;
            }
            int i10 = i5 + p11;
            this.f6743i = i10;
            int a7 = a2.f6667a.a(str, bArr, i10, P());
            this.f6743i = i5;
            M((a7 - i5) - p11);
            this.f6743i = a7;
        } catch (z1 e7) {
            this.f6743i = i5;
            t(str, e7);
        } catch (IndexOutOfBoundsException e9) {
            throw new m(e9);
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
            byte[] bArr = this.f6740f;
            if (i10 == 0) {
                int i11 = this.f6743i;
                this.f6743i = i11 + 1;
                bArr[i11] = (byte) i5;
                return;
            } else {
                try {
                    int i12 = this.f6743i;
                    this.f6743i = i12 + 1;
                    bArr[i12] = (byte) ((i5 & 127) | 128);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
                }
            }
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
        }
    }

    @Override // com.logrocket.protobuf.p
    public final void N(int i5, long j) {
        K(i5, 0);
        O(j);
    }

    @Override // com.logrocket.protobuf.p
    public final void O(long j) {
        boolean z5 = p.f6774e;
        byte[] bArr = this.f6740f;
        if (z5 && P() >= 10) {
            while ((j & (-128)) != 0) {
                int i5 = this.f6743i;
                this.f6743i = i5 + 1;
                x1.l(bArr, i5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i10 = this.f6743i;
            this.f6743i = i10 + 1;
            x1.l(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i11 = this.f6743i;
                this.f6743i = i11 + 1;
                bArr[i11] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
            }
        }
        int i12 = this.f6743i;
        this.f6743i = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final int P() {
        return this.f6742h - this.f6743i;
    }

    public final void Q(byte[] bArr, int i5, int i10) {
        try {
            System.arraycopy(bArr, i5, this.f6740f, this.f6743i, i10);
            this.f6743i += i10;
        } catch (IndexOutOfBoundsException e7) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), Integer.valueOf(i10)), e7);
        }
    }

    @Override // com.logrocket.protobuf.l1
    public final void f(byte[] bArr, int i5, int i10) {
        Q(bArr, i5, i10);
    }

    @Override // com.logrocket.protobuf.p
    public final int s() {
        return this.f6743i - this.f6741g;
    }

    @Override // com.logrocket.protobuf.p
    public final void v(byte b10) {
        try {
            byte[] bArr = this.f6740f;
            int i5 = this.f6743i;
            this.f6743i = i5 + 1;
            bArr[i5] = b10;
        } catch (IndexOutOfBoundsException e7) {
            throw new m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6743i), Integer.valueOf(this.f6742h), 1), e7);
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
        Q(bArr, 0, i5);
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

    @Override // com.logrocket.protobuf.p
    public void r() {
    }
}
