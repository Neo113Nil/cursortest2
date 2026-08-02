package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dhh extends u01 {
    public int i;
    public boolean j;
    public byte[] k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    @Override // defpackage.u01
    public final go0 b(go0 go0Var) {
        if (go0Var.c == 2) {
            return this.j ? go0Var : go0.e;
        }
        throw new jo0(go0Var);
    }

    @Override // defpackage.u01
    public final void c() {
        if (this.j) {
            go0 go0Var = this.b;
            int i = go0Var.d;
            this.i = i;
            int i2 = go0Var.a;
            int i3 = ((int) ((150000 * i2) / 1000000)) * i;
            if (this.k.length != i3) {
                this.k = new byte[i3];
            }
            int i4 = ((int) ((20000 * i2) / 1000000)) * i;
            this.o = i4;
            if (this.l.length != i4) {
                this.l = new byte[i4];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // defpackage.u01
    public final void d() {
        int i = this.n;
        if (i > 0) {
            h(this.k, i);
        }
        if (this.p) {
            return;
        }
        this.q += this.o / this.i;
    }

    @Override // defpackage.u01
    public final void e() {
        this.j = false;
        this.o = 0;
        byte[] bArr = lik.e;
        this.k = bArr;
        this.l = bArr;
    }

    public final int g(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.i;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void h(byte[] bArr, int i) {
        f(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.p = true;
        }
    }

    public final void i(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.o);
        int i2 = this.o - min;
        System.arraycopy(bArr, i - i2, this.l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.l, i2, min);
    }

    @Override // defpackage.u01, defpackage.lo0
    public final boolean isActive() {
        return this.j;
    }

    @Override // defpackage.lo0
    public final void queueInput(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.k.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.i;
                            position = lnb.d(limit2, i2, i2, i2);
                            break;
                        }
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    f(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int g = g(byteBuffer);
                int position2 = g - byteBuffer.position();
                byte[] bArr = this.k;
                int length = bArr.length;
                int i3 = this.n;
                int i4 = length - i3;
                if (g >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.k, this.n, min);
                    int i5 = this.n + min;
                    this.n = i5;
                    byte[] bArr2 = this.k;
                    if (i5 == bArr2.length) {
                        if (this.p) {
                            h(bArr2, this.o);
                            long j = this.q;
                            int i6 = this.n;
                            this.q = j + ((i6 - (this.o * 2)) / this.i);
                            i5 = i6;
                        } else {
                            this.q += (i5 - this.o) / this.i;
                        }
                        i(byteBuffer, this.k, i5);
                        this.n = 0;
                        this.m = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    h(bArr, i3);
                    this.n = 0;
                    this.m = 0;
                }
            } else {
                if (i != 2) {
                    zzl.s();
                    return;
                }
                int limit4 = byteBuffer.limit();
                int g2 = g(byteBuffer);
                byteBuffer.limit(g2);
                this.q += byteBuffer.remaining() / this.i;
                i(byteBuffer, this.l, this.o);
                if (g2 < limit4) {
                    h(this.l, this.o);
                    this.m = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }
}
