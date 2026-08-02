package com.fyber.inneractive.sdk.protobuf;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.yhk;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 extends b0 {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public a0(OutputStream outputStream, int i) {
        if (i < 0) {
            a70.p("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        if (outputStream != null) {
            this.g = outputStream;
        } else {
            yhk.s("out");
            throw null;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, d2 d2Var, t2 t2Var) {
        c(i, 2);
        int serializedSize = ((b) d2Var).getSerializedSize(t2Var);
        j(5);
        i(serializedSize);
        t2Var.a((Object) d2Var, this.a);
    }

    public final void b(String str) {
        try {
            int length = str.length() * 3;
            int c = b0.c(length);
            int i = c + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int a = d4.a.a(str, bArr, 0, length);
                j(5);
                i(a);
                b(bArr, 0, a);
                return;
            }
            if (i > i2 - this.f) {
                a();
            }
            int c2 = b0.c(str.length());
            int i3 = this.f;
            try {
                if (c2 != c) {
                    int a2 = d4.a(str);
                    i(a2);
                    this.f = d4.a.a(str, this.d, this.f, a2);
                    return;
                }
                int i4 = i3 + c2;
                this.f = i4;
                int a3 = d4.a.a(str, this.d, i4, this.e - i4);
                this.f = i3;
                i((a3 - i3) - c2);
                this.f = a3;
            } catch (b4 e) {
                this.f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new z(e2);
            }
        } catch (b4 e3) {
            a(str, e3);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i, int i2) {
        j(5);
        i((i << 3) | i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i, int i2) {
        j(20);
        e(i, 0);
        i(i2);
    }

    public final void e(long j) {
        byte[] bArr = this.d;
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
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
    }

    public final void f(long j) {
        if (b0.c) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.d;
                if (j2 == 0) {
                    int i = this.f;
                    this.f = i + 1;
                    x3.c.a((Object) bArr, x3.f + i, (byte) j);
                    return;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                x3.c.a((Object) bArr, x3.f + i2, (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                byte[] bArr2 = this.d;
                if (j3 == 0) {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr2[i3] = (byte) j;
                    return;
                } else {
                    int i4 = this.f;
                    this.f = i4 + 1;
                    bArr2[i4] = (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i) {
        j(5);
        i(i);
    }

    public final void h(int i) {
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
    }

    public final void i(int i) {
        if (b0.c) {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.d;
                if (i2 == 0) {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    x3.c.a((Object) bArr, x3.f + i3, (byte) i);
                    return;
                }
                int i4 = this.f;
                this.f = i4 + 1;
                x3.c.a((Object) bArr, x3.f + i4, (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i5 = i & (-128);
                byte[] bArr2 = this.d;
                if (i5 == 0) {
                    int i6 = this.f;
                    this.f = i6 + 1;
                    bArr2[i6] = (byte) i;
                    return;
                } else {
                    int i7 = this.f;
                    this.f = i7 + 1;
                    bArr2[i7] = (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void j(int i) {
        if (this.e - this.f < i) {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j) {
        j(8);
        e(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j) {
        j(10);
        f(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, long j) {
        j(18);
        e(i, 1);
        e(j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, boolean z) {
        j(11);
        e(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.d;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i) {
        c(i, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, s sVar) {
        c(i, 2);
        b(sVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, int i2) {
        j(14);
        e(i, 5);
        h(i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i, d2 d2Var) {
        c(1, 3);
        d(2, i);
        c(3, 2);
        a(d2Var);
        c(1, 4);
    }

    public final void a(d2 d2Var) {
        int serializedSize = d2Var.getSerializedSize();
        j(5);
        i(serializedSize);
        d2Var.writeTo(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b) {
        if (this.f == this.e) {
            a();
        }
        byte[] bArr = this.d;
        int i = this.f;
        this.f = i + 1;
        bArr[i] = b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
    }

    public final void a() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i) {
        if (i >= 0) {
            j(5);
            i(i);
        } else {
            j(10);
            f(i);
        }
    }

    public final void e(int i, int i2) {
        i((i << 3) | i2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i) {
        j(4);
        h(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, long j) {
        j(20);
        e(i, 0);
        f(j);
    }

    public final void b(s sVar) {
        int size = sVar.size();
        j(5);
        i(size);
        sVar.a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, s sVar) {
        c(1, 3);
        d(2, i);
        c(3, 2);
        b(sVar);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i, int i2) {
        j(20);
        e(i, 0);
        if (i2 >= 0) {
            i(i2);
        } else {
            f(i2);
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.f;
        int i5 = i3 - i4;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = this.e;
        a();
        if (i7 <= this.e) {
            System.arraycopy(bArr, i6, this.d, 0, i7);
            this.f = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
    }
}
