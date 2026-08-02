package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wvh implements lo0 {
    public int b;
    public float c;
    public float d;
    public go0 e;
    public go0 f;
    public go0 g;
    public go0 h;
    public boolean i;
    public uvh j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.lo0
    public final go0 a(go0 go0Var) {
        if (go0Var.c != 2) {
            throw new jo0(go0Var);
        }
        int i = this.b;
        if (i == -1) {
            i = go0Var.a;
        }
        this.e = go0Var;
        go0 go0Var2 = new go0(i, go0Var.b, 2);
        this.f = go0Var2;
        this.i = true;
        return go0Var2;
    }

    @Override // defpackage.lo0
    public final void flush() {
        if (isActive()) {
            go0 go0Var = this.e;
            this.g = go0Var;
            go0 go0Var2 = this.f;
            this.h = go0Var2;
            if (this.i) {
                this.j = new uvh(go0Var.a, go0Var.b, this.c, this.d, go0Var2.a);
            } else {
                uvh uvhVar = this.j;
                if (uvhVar != null) {
                    uvhVar.k = 0;
                    uvhVar.m = 0;
                    uvhVar.o = 0;
                    uvhVar.p = 0;
                    uvhVar.q = 0;
                    uvhVar.r = 0;
                    uvhVar.s = 0;
                    uvhVar.t = 0;
                    uvhVar.u = 0;
                    uvhVar.v = 0;
                }
            }
        }
        this.m = lo0.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.lo0
    public final ByteBuffer getOutput() {
        uvh uvhVar = this.j;
        if (uvhVar != null) {
            int i = uvhVar.b;
            int i2 = uvhVar.m * i * 2;
            if (i2 > 0) {
                if (this.k.capacity() < i2) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i, uvhVar.m);
                int i3 = min * i;
                shortBuffer.put(uvhVar.l, 0, i3);
                int i4 = uvhVar.m - min;
                uvhVar.m = i4;
                short[] sArr = uvhVar.l;
                System.arraycopy(sArr, i3, sArr, 0, i4 * i);
                this.o += i2;
                this.k.limit(i2);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = lo0.a;
        return byteBuffer;
    }

    @Override // defpackage.lo0
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.lo0
    public final boolean isEnded() {
        if (!this.p) {
            return false;
        }
        uvh uvhVar = this.j;
        return uvhVar == null || (uvhVar.m * uvhVar.b) * 2 == 0;
    }

    @Override // defpackage.lo0
    public final void queueEndOfStream() {
        uvh uvhVar = this.j;
        if (uvhVar != null) {
            int i = uvhVar.k;
            float f = uvhVar.c;
            float f2 = uvhVar.d;
            int i2 = uvhVar.m + ((int) ((((i / (f / f2)) + uvhVar.o) / (uvhVar.e * f2)) + 0.5f));
            short[] sArr = uvhVar.j;
            int i3 = uvhVar.h * 2;
            uvhVar.j = uvhVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = uvhVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                uvhVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            uvhVar.k = i3 + uvhVar.k;
            uvhVar.f();
            if (uvhVar.m > i2) {
                uvhVar.m = i2;
            }
            uvhVar.k = 0;
            uvhVar.r = 0;
            uvhVar.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.lo0
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            uvh uvhVar = this.j;
            uvhVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = uvhVar.b;
            int i2 = remaining2 / i;
            short[] c = uvhVar.c(uvhVar.j, uvhVar.k, i2);
            uvhVar.j = c;
            asShortBuffer.get(c, uvhVar.k * i, ((i2 * i) * 2) / 2);
            uvhVar.k += i2;
            uvhVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // defpackage.lo0
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        go0 go0Var = go0.e;
        this.e = go0Var;
        this.f = go0Var;
        this.g = go0Var;
        this.h = go0Var;
        ByteBuffer byteBuffer = lo0.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
