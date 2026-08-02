package v3;

import java.nio.ByteBuffer;
import k3.e;

/* loaded from: classes.dex */
public final class L extends k3.g {

    /* renamed from: n, reason: collision with root package name */
    private int f101858n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f101859o;

    /* renamed from: p, reason: collision with root package name */
    private int f101860p;

    /* renamed from: q, reason: collision with root package name */
    private long f101861q;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f101863s;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f101866v;

    /* renamed from: r, reason: collision with root package name */
    private int f101862r = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f101864t = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f101865u = 0;

    /* renamed from: l, reason: collision with root package name */
    private final long f101856l = 100000;

    /* renamed from: i, reason: collision with root package name */
    private final float f101853i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    private final long f101857m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    private final int f101855k = 10;

    /* renamed from: j, reason: collision with root package name */
    private final short f101854j = 1024;

    public L() {
        byte[] bArr = m3.N.f74291c;
        this.f101863s = bArr;
        this.f101866v = bArr;
    }

    private int l(int i11) {
        int length = ((((int) ((this.f101857m * this.f70388b.f70384a) / 1000000)) - this.f101862r) * this.f101858n) - (this.f101863s.length / 2);
        G10.a.h(length >= 0);
        int min = (int) Math.min((i11 * this.f101853i) + 0.5f, length);
        int i12 = this.f101858n;
        return (min / i12) * i12;
    }

    private void n(boolean z11) {
        int length;
        int l11;
        int i11 = this.f101865u;
        byte[] bArr = this.f101863s;
        if (i11 == bArr.length || z11) {
            if (this.f101862r == 0) {
                if (z11) {
                    o(i11, 3);
                    length = i11;
                } else {
                    G10.a.h(i11 >= bArr.length / 2);
                    length = this.f101863s.length / 2;
                    o(length, 0);
                }
                l11 = length;
            } else if (z11) {
                int length2 = i11 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int l12 = l(length2) + (this.f101863s.length / 2);
                o(l12, 2);
                l11 = l12;
                length = length3;
            } else {
                length = i11 - (bArr.length / 2);
                l11 = l(length);
                o(l11, 1);
            }
            G10.a.g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f101858n == 0);
            G10.a.h(i11 >= l11);
            this.f101865u -= length;
            int i12 = this.f101864t + length;
            this.f101864t = i12;
            this.f101864t = i12 % this.f101863s.length;
            this.f101862r = (l11 / this.f101858n) + this.f101862r;
            this.f101861q += (length - l11) / r2;
        }
    }

    private void o(int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        G10.a.c(this.f101865u >= i11);
        if (i12 == 2) {
            int i13 = this.f101864t;
            int i14 = this.f101865u;
            int i15 = i13 + i14;
            byte[] bArr = this.f101863s;
            if (i15 <= bArr.length) {
                System.arraycopy(bArr, i15 - i11, this.f101866v, 0, i11);
            } else {
                int length = i14 - (bArr.length - i13);
                if (length >= i11) {
                    System.arraycopy(bArr, length - i11, this.f101866v, 0, i11);
                } else {
                    int i16 = i11 - length;
                    System.arraycopy(bArr, bArr.length - i16, this.f101866v, 0, i16);
                    System.arraycopy(this.f101863s, 0, this.f101866v, i16, length);
                }
            }
        } else {
            int i17 = this.f101864t;
            int i18 = i17 + i11;
            byte[] bArr2 = this.f101863s;
            if (i18 <= bArr2.length) {
                System.arraycopy(bArr2, i17, this.f101866v, 0, i11);
            } else {
                int length2 = bArr2.length - i17;
                System.arraycopy(bArr2, i17, this.f101866v, 0, length2);
                System.arraycopy(this.f101863s, 0, this.f101866v, length2, i11 - length2);
            }
        }
        G10.a.b("sizeToOutput is not aligned to frame size: " + i11, i11 % this.f101858n == 0);
        G10.a.h(this.f101864t < this.f101863s.length);
        byte[] bArr3 = this.f101866v;
        G10.a.b("byteOutput size is not aligned to frame size " + i11, i11 % this.f101858n == 0);
        if (i12 != 3) {
            for (int i19 = 0; i19 < i11; i19 += 2) {
                int i21 = i19 + 1;
                int i22 = (bArr3[i21] << 8) | (bArr3[i19] & 255);
                int i23 = this.f101855k;
                if (i12 == 0) {
                    i23 = ((((i19 * 1000) / (i11 - 1)) * (i23 - 100)) / 1000) + 100;
                } else if (i12 == 2) {
                    i23 += (((i19 * 1000) * (100 - i23)) / (i11 - 1)) / 1000;
                }
                int i24 = (i22 * i23) / 100;
                if (i24 >= 32767) {
                    bArr3[i19] = -1;
                    bArr3[i21] = Byte.MAX_VALUE;
                } else if (i24 <= -32768) {
                    bArr3[i19] = 0;
                    bArr3[i21] = Byte.MIN_VALUE;
                } else {
                    bArr3[i19] = (byte) (i24 & 255);
                    bArr3[i21] = (byte) (i24 >> 8);
                }
            }
        }
        k(i11).put(bArr3, 0, i11).flip();
    }

    @Override // k3.e
    public final void b(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !f()) {
            int i11 = this.f101860p;
            short s11 = this.f101854j;
            if (i11 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f101863s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s11) {
                        int i12 = this.f101858n;
                        position = I1.w.a(limit3, i12, i12, i12);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f101860p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException();
                }
                G10.a.h(this.f101864t < this.f101863s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s11) {
                        int i13 = this.f101858n;
                        limit = (position2 / i13) * i13;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i14 = this.f101864t;
                int i15 = this.f101865u;
                int i16 = i14 + i15;
                byte[] bArr = this.f101863s;
                if (i16 < bArr.length) {
                    i14 = bArr.length;
                } else {
                    i16 = i15 - (bArr.length - i14);
                }
                int i17 = i14 - i16;
                boolean z11 = limit < limit4;
                int min = Math.min(position3, i17);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f101863s, i16, min);
                int i18 = this.f101865u + min;
                this.f101865u = i18;
                G10.a.h(i18 <= this.f101863s.length);
                boolean z12 = z11 && position3 < i17;
                n(z12);
                if (z12) {
                    this.f101860p = 0;
                    this.f101862r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // k3.g
    protected final e.a g(e.a aVar) throws e.b {
        if (aVar.f70386c == 2) {
            return aVar.f70384a == -1 ? e.a.f70383e : aVar;
        }
        throw new e.b(aVar);
    }

    @Override // k3.g
    public final void h() {
        if (isActive()) {
            int i11 = this.f70388b.f70385b * 2;
            this.f101858n = i11;
            int i12 = ((((int) ((this.f101856l * r0.f70384a) / 1000000)) / 2) / i11) * i11 * 2;
            if (this.f101863s.length != i12) {
                this.f101863s = new byte[i12];
                this.f101866v = new byte[i12];
            }
        }
        this.f101860p = 0;
        this.f101861q = 0L;
        this.f101862r = 0;
        this.f101864t = 0;
        this.f101865u = 0;
    }

    @Override // k3.g
    public final void i() {
        if (this.f101865u > 0) {
            n(true);
            this.f101862r = 0;
        }
    }

    @Override // k3.g, k3.e
    public final boolean isActive() {
        return super.isActive() && this.f101859o;
    }

    @Override // k3.g
    public final void j() {
        this.f101859o = false;
        byte[] bArr = m3.N.f74291c;
        this.f101863s = bArr;
        this.f101866v = bArr;
    }

    public final long m() {
        return this.f101861q;
    }

    public final void p(boolean z11) {
        this.f101859o = z11;
    }
}
