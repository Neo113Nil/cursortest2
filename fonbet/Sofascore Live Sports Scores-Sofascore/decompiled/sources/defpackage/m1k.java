package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m1k extends v01 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.mo0
    public final long c(long j) {
        return Math.max(0L, j - nik.Z(this.b.a, this.j + this.i));
    }

    @Override // defpackage.v01
    public final ho0 d(ho0 ho0Var) {
        if (!nik.P(ho0Var.c)) {
            throw new ko0(ho0Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? ho0.e : ho0Var;
    }

    @Override // defpackage.v01
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.v01
    public final void f() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.v01
    public final void g() {
        this.m = nik.b;
    }

    @Override // defpackage.v01, defpackage.mo0
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            h(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // defpackage.v01, defpackage.mo0
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // defpackage.mo0
    public final void queueInput(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer h = h(length);
        int j = nik.j(length, 0, this.n);
        h.put(this.m, 0, j);
        int j2 = nik.j(length - j, 0, i2);
        byteBuffer.limit(byteBuffer.position() + j2);
        h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - j2;
        int i4 = this.n - j;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, j, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        h.flip();
    }
}
