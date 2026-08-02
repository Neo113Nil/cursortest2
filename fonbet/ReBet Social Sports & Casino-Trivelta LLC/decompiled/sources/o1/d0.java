package o1;

import c1.p;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class d0 extends c1.r {
    private byte[] contiguousOutputBuffer;

    /* renamed from: i, reason: collision with root package name */
    public final float f58801i;

    /* renamed from: j, reason: collision with root package name */
    public final short f58802j;

    /* renamed from: k, reason: collision with root package name */
    public final int f58803k;

    /* renamed from: l, reason: collision with root package name */
    public final long f58804l;

    /* renamed from: m, reason: collision with root package name */
    public final long f58805m;
    private byte[] maybeSilenceBuffer;

    /* renamed from: n, reason: collision with root package name */
    public int f58806n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f58807o;

    /* renamed from: p, reason: collision with root package name */
    public int f58808p;

    /* renamed from: q, reason: collision with root package name */
    public long f58809q;

    /* renamed from: r, reason: collision with root package name */
    public int f58810r;

    /* renamed from: s, reason: collision with root package name */
    public int f58811s;

    /* renamed from: t, reason: collision with root package name */
    public int f58812t;

    public d0() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = ByteCompanionObject.MAX_VALUE;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = ByteCompanionObject.MIN_VALUE;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    public static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & UByte.MAX_VALUE);
    }

    public final void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC4134a.a(this.f58812t >= i10);
        if (i11 == 2) {
            int i12 = this.f58811s;
            int i13 = this.f58812t;
            int i14 = i12 + i13;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.contiguousOutputBuffer, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.contiguousOutputBuffer, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.contiguousOutputBuffer, 0, i15);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i15, length);
                }
            }
        } else {
            int i16 = this.f58811s;
            int i17 = i16 + i10;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.contiguousOutputBuffer, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.contiguousOutputBuffer, 0, length2);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i10 - length2);
            }
        }
        AbstractC4134a.b(i10 % this.f58806n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        AbstractC4134a.g(this.f58811s < this.maybeSilenceBuffer.length);
        y(this.contiguousOutputBuffer, i10, i11);
    }

    public final void B(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int s10 = s(byteBuffer);
        if (s10 == byteBuffer.position()) {
            this.f58808p = 1;
        } else {
            byteBuffer.limit(Math.min(s10, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public void D(boolean z10) {
        this.f58807o = z10;
    }

    public final void E(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        AbstractC4134a.g(this.f58811s < this.maybeSilenceBuffer.length);
        int limit = byteBuffer.limit();
        int t10 = t(byteBuffer);
        int position = t10 - byteBuffer.position();
        int i12 = this.f58811s;
        int i13 = this.f58812t;
        int i14 = i12 + i13;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i14 < bArr.length) {
            i10 = bArr.length - (i13 + i12);
            i11 = i12 + i13;
        } else {
            int length = i13 - (bArr.length - i12);
            i10 = i12 - length;
            i11 = length;
        }
        boolean z10 = t10 < limit;
        int min = Math.min(position, i10);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.maybeSilenceBuffer, i11, min);
        int i15 = this.f58812t + min;
        this.f58812t = i15;
        AbstractC4134a.g(i15 <= this.maybeSilenceBuffer.length);
        boolean z11 = z10 && position < i10;
        z(z11);
        if (z11) {
            this.f58808p = 0;
            this.f58810r = 0;
        }
        byteBuffer.limit(limit);
    }

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f58808p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        if (aVar.f26782c == 2) {
            return aVar.f26780a == -1 ? p.a.f26779e : aVar;
        }
        throw new p.b(aVar);
    }

    @Override // c1.r
    public void i() {
        if (isActive()) {
            this.f58806n = this.f26785b.f26781b * 2;
            int n10 = n(r(this.f58804l) / 2) * 2;
            if (this.maybeSilenceBuffer.length != n10) {
                this.maybeSilenceBuffer = new byte[n10];
                this.contiguousOutputBuffer = new byte[n10];
            }
        }
        this.f58808p = 0;
        this.f58809q = 0L;
        this.f58810r = 0;
        this.f58811s = 0;
        this.f58812t = 0;
    }

    @Override // c1.r, c1.p
    public boolean isActive() {
        return super.isActive() && this.f58807o;
    }

    @Override // c1.r
    public void j() {
        if (this.f58812t > 0) {
            z(true);
            this.f58810r = 0;
        }
    }

    @Override // c1.r
    public void k() {
        this.f58807o = false;
        byte[] bArr = e1.Z.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    public final int m(float f10) {
        return n((int) f10);
    }

    public final int n(int i10) {
        int i11 = this.f58806n;
        return (i10 / i11) * i11;
    }

    public final int o(int i10, int i11) {
        int i12 = this.f58803k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    public final int p(int i10, int i11) {
        return (((this.f58803k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    public final int q(int i10) {
        int r10 = ((r(this.f58805m) - this.f58810r) * this.f58806n) - (this.maybeSilenceBuffer.length / 2);
        AbstractC4134a.g(r10 >= 0);
        return m(Math.min((i10 * this.f58801i) + 0.5f, r10));
    }

    public final int r(long j10) {
        return (int) ((j10 * this.f26785b.f26780a) / 1000000);
    }

    public final int s(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (v(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i10 = this.f58806n;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    public final int t(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (v(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i10 = this.f58806n;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long u() {
        return this.f58809q;
    }

    public final boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f58802j;
    }

    public final void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f58803k)) / 100);
        }
    }

    public final void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final void y(byte[] bArr, int i10, int i11) {
        AbstractC4134a.b(i10 % this.f58806n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    public final void z(boolean z10) {
        int length;
        int q10;
        int i10 = this.f58812t;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i10 == bArr.length || z10) {
            if (this.f58810r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    AbstractC4134a.g(i10 >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    A(length, 0);
                }
                q10 = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int q11 = q(length2) + (this.maybeSilenceBuffer.length / 2);
                A(q11, 2);
                q10 = q11;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                q10 = q(length);
                A(q10, 1);
            }
            AbstractC4134a.h(length % this.f58806n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC4134a.g(i10 >= q10);
            this.f58812t -= length;
            int i11 = this.f58811s + length;
            this.f58811s = i11;
            this.f58811s = i11 % this.maybeSilenceBuffer.length;
            this.f58810r = this.f58810r + (q10 / this.f58806n);
            this.f58809q += (length - q10) / r2;
        }
    }

    public d0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f58810r = 0;
        this.f58811s = 0;
        this.f58812t = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC4134a.a(z10);
        this.f58804l = j10;
        this.f58801i = f10;
        this.f58805m = j11;
        this.f58803k = i10;
        this.f58802j = s10;
        byte[] bArr = e1.Z.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }
}
