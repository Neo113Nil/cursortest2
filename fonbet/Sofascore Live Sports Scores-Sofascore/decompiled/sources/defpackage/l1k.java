package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l1k extends u01 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.u01
    public final go0 b(go0 go0Var) {
        if (go0Var.c != 2) {
            throw new jo0(go0Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? go0.e : go0Var;
    }

    @Override // defpackage.u01
    public final void c() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.u01
    public final void d() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.u01
    public final void e() {
        this.m = lik.e;
    }

    @Override // defpackage.u01, defpackage.lo0
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            f(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // defpackage.u01, defpackage.lo0
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // defpackage.lo0
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
        ByteBuffer f = f(length);
        int h = lik.h(length, 0, this.n);
        f.put(this.m, 0, h);
        int h2 = lik.h(length - h, 0, i2);
        byteBuffer.limit(byteBuffer.position() + h2);
        f.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - h2;
        int i4 = this.n - h;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, h, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        f.flip();
    }
}
