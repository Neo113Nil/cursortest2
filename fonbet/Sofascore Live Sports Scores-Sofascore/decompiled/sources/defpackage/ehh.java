package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ehh extends v01 {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // defpackage.v01
    public final ho0 d(ho0 ho0Var) {
        if (ho0Var.c == 2) {
            return ho0Var.a == -1 ? ho0.e : ho0Var;
        }
        throw new ko0(ho0Var);
    }

    @Override // defpackage.v01
    public final void e() {
        if (isActive()) {
            int i = this.b.b * 2;
            this.i = i;
            int i2 = ((((int) ((100000 * r0.a) / 1000000)) / 2) / i) * i * 2;
            if (this.n.length != i2) {
                this.n = new byte[i2];
                this.q = new byte[i2];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // defpackage.v01
    public final void f() {
        if (this.p > 0) {
            j(true);
            this.m = 0;
        }
    }

    @Override // defpackage.v01
    public final void g() {
        this.j = false;
        byte[] bArr = nik.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final int i(int i) {
        int length = ((((int) ((2000000 * this.b.a) / 1000000)) - this.m) * this.i) - (this.n.length / 2);
        z1a.E(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (min / i2) * i2;
    }

    @Override // defpackage.v01, defpackage.mo0
    public final boolean isActive() {
        return super.isActive() && this.j;
    }

    public final void j(boolean z) {
        int length;
        int i;
        int i2 = this.p;
        byte[] bArr = this.n;
        if (i2 == bArr.length || z) {
            if (this.m == 0) {
                if (z) {
                    k(i2, 3);
                    length = i2;
                } else {
                    z1a.E(i2 >= bArr.length / 2);
                    length = this.n.length / 2;
                    k(length, 0);
                }
                i = length;
            } else if (z) {
                int length2 = i2 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int i3 = i(length2) + (this.n.length / 2);
                k(i3, 2);
                i = i3;
                length = length3;
            } else {
                length = i2 - (bArr.length / 2);
                i = i(length);
                k(i, 1);
            }
            z1a.B(length, "bytesConsumed is not aligned to frame size: %s", length % this.i == 0);
            z1a.E(i2 >= i);
            this.p -= length;
            int i4 = this.o + length;
            this.o = i4;
            this.o = i4 % this.n.length;
            this.m = (i / this.i) + this.m;
            this.l += (length - i) / r2;
        }
    }

    public final void k(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        z1a.s(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            if (i6 <= bArr.length) {
                System.arraycopy(bArr, i6 - i, this.q, 0, i);
            } else {
                int length = i5 - (bArr.length - i4);
                byte[] bArr2 = this.q;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i7 = i - length;
                    System.arraycopy(bArr, bArr.length - i7, bArr2, 0, i7);
                    System.arraycopy(this.n, 0, this.q, i7, length);
                }
            }
        } else {
            int i8 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i8 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, length3);
                System.arraycopy(this.n, 0, this.q, length3, i - length3);
            }
        }
        z1a.o(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        z1a.E(this.o < this.n.length);
        byte[] bArr5 = this.q;
        z1a.o(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr5[i10] << 8) | (bArr5[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (i2 == 0) {
                    i3 = ((((i9 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i9) / (i - 1)) / 1000);
                    }
                }
                int i12 = (i11 * i3) / 100;
                if (i12 >= 32767) {
                    bArr5[i9] = -1;
                    bArr5[i10] = Byte.MAX_VALUE;
                } else if (i12 <= -32768) {
                    bArr5[i9] = 0;
                    bArr5[i10] = Byte.MIN_VALUE;
                } else {
                    bArr5[i9] = (byte) (i12 & 255);
                    bArr5[i10] = (byte) (i12 >> 8);
                }
            }
        }
        h(i).put(bArr5, 0, i).flip();
    }

    @Override // defpackage.mo0
    public final void queueInput(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.k;
            if (i == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.n.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                        int i2 = this.i;
                        position = lnb.d(limit3, i2, i2, i2);
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    h(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i != 1) {
                    zzl.s();
                    return;
                }
                z1a.E(this.o < this.n.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                        int i3 = this.i;
                        limit = (position2 / i3) * i3;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.o;
                int i5 = this.p;
                int i6 = i4 + i5;
                byte[] bArr = this.n;
                if (i6 < bArr.length) {
                    i4 = bArr.length;
                } else {
                    i6 = i5 - (bArr.length - i4);
                }
                int i7 = i4 - i6;
                boolean z = limit < limit4;
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.n, i6, min);
                int i8 = this.p + min;
                this.p = i8;
                z1a.E(i8 <= this.n.length);
                boolean z2 = z && position3 < i7;
                j(z2);
                if (z2) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }
}
