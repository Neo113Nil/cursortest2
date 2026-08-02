package com.fyber.inneractive.sdk.protobuf;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.sw9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y extends b0 {
    public final byte[] d;
    public final int e;
    public int f;

    public y(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            sw9.n("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.d = bArr;
        this.f = 0;
        this.e = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    public final void b(String str) {
        int i = this.f;
        try {
            int c = b0.c(str.length() * 3);
            int c2 = b0.c(str.length());
            if (c2 != c) {
                g(d4.a(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = d4.a.a(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + c2;
            this.f = i3;
            int a = d4.a.a(str, this.d, i3, this.e - i3);
            this.f = i;
            g((a - i) - c2);
            this.f = a;
        } catch (b4 e) {
            this.f = i;
            a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new z(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j) {
        if (!b0.c || this.e - this.f < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.d;
                if (j2 == 0) {
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.f;
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            byte[] bArr2 = this.d;
            if (j3 == 0) {
                int i3 = this.f;
                this.f = i3 + 1;
                x3.c.a((Object) bArr2, x3.f + i3, (byte) j);
                return;
            }
            int i4 = this.f;
            this.f = i4 + 1;
            x3.c.a((Object) bArr2, x3.f + i4, (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
            j >>>= 7;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i) {
        if (i >= 0) {
            g(i);
        } else {
            d(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i) {
        if (b0.c && !d.a()) {
            int i2 = this.e;
            int i3 = this.f;
            if (i2 - i3 >= 5) {
                int i4 = i & (-128);
                byte[] bArr = this.d;
                if (i4 == 0) {
                    this.f = i3 + 1;
                    x3.c.a((Object) bArr, x3.f + i3, (byte) i);
                    return;
                }
                this.f = i3 + 1;
                w3 w3Var = x3.c;
                long j = x3.f;
                w3Var.a((Object) bArr, i3 + j, (byte) (i | 128));
                int i5 = i >>> 7;
                int i6 = i5 & (-128);
                byte[] bArr2 = this.d;
                if (i6 == 0) {
                    int i7 = this.f;
                    this.f = i7 + 1;
                    w3Var.a((Object) bArr2, j + i7, (byte) i5);
                    return;
                }
                int i8 = this.f;
                this.f = i8 + 1;
                w3Var.a((Object) bArr2, i8 + j, (byte) (i5 | 128));
                int i9 = i >>> 14;
                int i10 = i9 & (-128);
                byte[] bArr3 = this.d;
                if (i10 == 0) {
                    int i11 = this.f;
                    this.f = i11 + 1;
                    w3Var.a((Object) bArr3, j + i11, (byte) i9);
                    return;
                }
                int i12 = this.f;
                this.f = i12 + 1;
                w3Var.a((Object) bArr3, i12 + j, (byte) (i9 | 128));
                int i13 = i >>> 21;
                int i14 = i13 & (-128);
                byte[] bArr4 = this.d;
                if (i14 == 0) {
                    int i15 = this.f;
                    this.f = i15 + 1;
                    w3Var.a((Object) bArr4, j + i15, (byte) i13);
                    return;
                }
                int i16 = this.f;
                this.f = i16 + 1;
                w3Var.a((Object) bArr4, i16 + j, (byte) (i13 | 128));
                byte[] bArr5 = this.d;
                int i17 = this.f;
                this.f = i17 + 1;
                w3Var.a((Object) bArr5, j + i17, (byte) (i >>> 28));
                return;
            }
        }
        while (true) {
            int i18 = i & (-128);
            byte[] bArr6 = this.d;
            if (i18 == 0) {
                int i19 = this.f;
                this.f = i19 + 1;
                bArr6[i19] = (byte) i;
                return;
            } else {
                try {
                    int i20 = this.f;
                    this.f = i20 + 1;
                    bArr6[i20] = (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, long j) {
        c(i, 1);
        c(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, boolean z) {
        c(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i) {
        c(i, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, s sVar) {
        c(i, 2);
        g(sVar.size());
        sVar.a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, d2 d2Var, t2 t2Var) {
        c(i, 2);
        g(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a((Object) d2Var, this.a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, d2 d2Var) {
        c(1, 3);
        c(2, 0);
        g(i);
        c(3, 2);
        g(d2Var.getSerializedSize());
        d2Var.writeTo(this);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, int i2) {
        c(i, 5);
        e(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    public final int a() {
        return this.e - this.f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, long j) {
        c(i, 0);
        d(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, s sVar) {
        c(1, 3);
        c(2, 0);
        g(i);
        a(3, sVar);
        c(1, 4);
    }

    public final void b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, int i2) {
        c(i, 0);
        f(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i, int i2) {
        c(i, 0);
        g(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i, int i2) {
        g((i << 3) | i2);
    }
}
