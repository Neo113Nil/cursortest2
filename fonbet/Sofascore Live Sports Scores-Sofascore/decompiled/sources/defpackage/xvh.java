package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xvh implements mo0 {
    public float b;
    public float c;
    public ho0 d;
    public ho0 e;
    public ho0 f;
    public ho0 g;
    public boolean h;
    public vvh i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // defpackage.mo0
    public final void a(io0 io0Var) {
        if (isActive()) {
            ho0 ho0Var = this.d;
            this.f = ho0Var;
            ho0 ho0Var2 = this.e;
            this.g = ho0Var2;
            if (this.h) {
                this.i = new vvh(ho0Var.a, ho0Var.b, this.b, this.c, ho0Var2.a, ho0Var.c == 4, 0);
            } else {
                vvh vvhVar = this.i;
                if (vvhVar != null) {
                    vvhVar.i = 0;
                    vvhVar.j = 0;
                    vvhVar.k = 0;
                    vvhVar.l = 0;
                    vvhVar.m = 0;
                    vvhVar.n = 0;
                    vvhVar.o = 0;
                    vvhVar.p = 0.0d;
                    ((tvh) vvhVar.q).flush();
                }
            }
        }
        this.k = mo0.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // defpackage.mo0
    public final ho0 b(ho0 ho0Var) {
        int i = ho0Var.c;
        if (i != 2 && i != 4) {
            throw new ko0(ho0Var);
        }
        int i2 = ho0Var.a;
        this.d = ho0Var;
        ho0 ho0Var2 = new ho0(i2, ho0Var.b, i);
        this.e = ho0Var2;
        this.h = true;
        return ho0Var2;
    }

    @Override // defpackage.mo0
    public final long c(long j) {
        if (this.m < 1024) {
            return (long) (j / this.b);
        }
        long j2 = this.l;
        this.i.getClass();
        long y = j2 - (((tvh) r2.q).y() * (r2.i * r2.b));
        int i = this.g.a;
        int i2 = this.f.a;
        long j3 = this.m;
        return i == i2 ? nik.b0(j, j3, y, RoundingMode.DOWN) : nik.b0(j, j3 * i2, y * i, RoundingMode.DOWN);
    }

    @Override // defpackage.mo0
    public final ByteBuffer getOutput() {
        vvh vvhVar = this.i;
        if (vvhVar != null) {
            tvh tvhVar = (tvh) vvhVar.q;
            int i = vvhVar.b;
            z1a.E(vvhVar.j >= 0);
            int y = tvhVar.y() * vvhVar.j * i;
            if (y > 0) {
                if (this.j.capacity() < y) {
                    this.j = ByteBuffer.allocateDirect(y).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                z1a.E(vvhVar.j >= 0);
                int min = Math.min(byteBuffer.remaining() / (tvhVar.y() * i), vvhVar.j);
                tvhVar.b(min, byteBuffer);
                vvhVar.j -= min;
                System.arraycopy(tvhVar.t(), min * i, tvhVar.t(), 0, vvhVar.j * i);
                this.j.flip();
                this.m += y;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = mo0.a;
        return byteBuffer2;
    }

    @Override // defpackage.mo0
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // defpackage.mo0
    public final boolean isEnded() {
        if (this.n) {
            vvh vvhVar = this.i;
            if (vvhVar != null) {
                z1a.E(vvhVar.j >= 0);
                if (((tvh) vvhVar.q).y() * vvhVar.j * vvhVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mo0
    public final void queueEndOfStream() {
        vvh vvhVar = this.i;
        if (vvhVar != null) {
            int i = vvhVar.i;
            float f = vvhVar.c;
            float f2 = vvhVar.d;
            double d = f / f2;
            int i2 = vvhVar.j + ((int) (((((((i - r6) / d) + vvhVar.n) + vvhVar.p) + vvhVar.k) / (vvhVar.e * f2)) + 0.5d));
            vvhVar.p = 0.0d;
            tvh tvhVar = (tvh) vvhVar.q;
            int i3 = vvhVar.h * 2;
            tvhVar.k(i3 + i);
            tvhVar.c(i * vvhVar.b, i3);
            vvhVar.i = i3 + vvhVar.i;
            vvhVar.b();
            if (vvhVar.j > i2) {
                vvhVar.j = Math.max(i2, 0);
            }
            vvhVar.i = 0;
            vvhVar.n = 0;
            vvhVar.k = 0;
        }
        this.n = true;
    }

    @Override // defpackage.mo0
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            vvh vvhVar = this.i;
            vvhVar.getClass();
            this.l += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = vvhVar.b;
            tvh tvhVar = (tvh) vvhVar.q;
            int y = remaining / (tvhVar.y() * i);
            tvhVar.k(y);
            tvhVar.a(remaining, byteBuffer);
            vvhVar.i += y;
            vvhVar.b();
        }
    }

    @Override // defpackage.mo0
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        ho0 ho0Var = ho0.e;
        this.d = ho0Var;
        this.e = ho0Var;
        this.f = ho0Var;
        this.g = ho0Var;
        ByteBuffer byteBuffer = mo0.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
