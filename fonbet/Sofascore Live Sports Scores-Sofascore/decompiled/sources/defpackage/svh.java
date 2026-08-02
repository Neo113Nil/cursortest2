package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class svh implements tvh, uvn {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final /* synthetic */ Object h;

    public svh(vvh vvhVar, boolean z) {
        this.h = vvhVar;
        int i = vvhVar.h;
        this.a = new float[i];
        int i2 = i * vvhVar.b;
        this.b = new float[i2];
        this.c = new float[i2];
        this.d = new float[i2];
    }

    @Override // defpackage.uvn
    public void A(int i, int i2) {
        for (int i3 = 0; i3 < ((vvh) this.h).b * i2; i3++) {
            this.b[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.uvn
    public void B(int i, ByteBuffer byteBuffer) {
        int i2 = ((vvh) this.h).b;
        byteBuffer.asFloatBuffer().put(this.c, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    public float[] C(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = ((vvh) this.h).b;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public int D(int i, int i2, int i3, float[] fArr) {
        int i4 = ((vvh) this.h).b * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double d3 = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                d3 += Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d4 = i7;
            if (i5 * d3 < d * d4) {
                i5 = i7;
                d = d3;
            }
            if (i6 * d3 > d4 * d2) {
                i6 = i7;
                d2 = d3;
            }
            i7++;
            i4 = i9;
        }
        this.e = d / i5;
        this.f = d2 / i6;
        return i5;
    }

    public int E(int i, int i2, int i3, float[] fArr) {
        int i4 = 255;
        int i5 = 0;
        double d = 0.0d;
        double d2 = 1.0d;
        int i6 = i2;
        while (true) {
            double d3 = i4;
            double d4 = i5;
            if (i6 > i3) {
                this.e = d2 / d4;
                this.f = d / d3;
                return i5;
            }
            int i7 = 0;
            double d5 = 0.0d;
            while (i7 < i6) {
                int i8 = ((vvh) this.h).b * i;
                d5 += Math.abs(fArr[i8 + i7] - fArr[(i8 + i6) + i7]);
                i7++;
                i4 = i4;
            }
            int i9 = i4;
            double d6 = d4 * d5;
            double d7 = i6;
            double d8 = d2 * d7;
            if (d6 < d8) {
                d2 = d5;
            }
            if (d6 < d8) {
                i5 = i6;
            }
            double d9 = d3 * d5;
            double d10 = d7 * d;
            if (d9 > d10) {
                d = d5;
            }
            i4 = d9 > d10 ? i6 : i9;
            i6++;
        }
    }

    public float[] F(int i, int i2, float[] fArr) {
        vvh vvhVar = (vvh) this.h;
        int length = fArr.length;
        int i3 = vvhVar.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.tvh
    public void a(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        vvh vvhVar = (vvh) this.h;
        asFloatBuffer.get(fArr, vvhVar.i * vvhVar.b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.tvh
    public void b(int i, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        int i2 = ((vvh) this.h).b;
        asFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    @Override // defpackage.tvh
    public void c(int i, int i2) {
        for (int i3 = 0; i3 < ((vvh) this.h).b * i2; i3++) {
            this.b[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.uvn
    public void d(int i) {
        vvh vvhVar = (vvh) this.h;
        this.c = F(vvhVar.j, i, this.c);
    }

    @Override // defpackage.tvh
    public void e(int i, int i2) {
        vvh vvhVar = (vvh) this.h;
        int i3 = vvhVar.h / i2;
        int i4 = vvhVar.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += this.b[bf3.c(i7, i5, i6, i8)];
            }
            this.a[i7] = (float) (d / i5);
        }
    }

    @Override // defpackage.tvh
    public int f(int i, int i2, int i3) {
        return D(i, i2, i3, this.b);
    }

    @Override // defpackage.tvh
    public void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // defpackage.tvh
    public void g(int i) {
        this.c = C(((vvh) this.h).j, i, this.c);
    }

    @Override // defpackage.tvh
    public boolean h() {
        double d = this.e;
        return d != 0.0d && ((vvh) this.h).o != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
    }

    @Override // defpackage.tvh
    public void i(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.uvn
    public void j(int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            if (i4 >= vvhVar.h / i2) {
                return;
            }
            double d = 0.0d;
            int i5 = 0;
            while (true) {
                i3 = vvhVar.b * i2;
                if (i5 < i3) {
                    d += this.b[bf3.c(i4, i3, r6 * i, i5)];
                    i5++;
                }
            }
            this.a[i4] = (float) (d / i3);
            i4++;
        }
    }

    @Override // defpackage.tvh
    public void k(int i) {
        this.b = C(((vvh) this.h).i, i, this.b);
    }

    @Override // defpackage.uvn
    public int l(int i, int i2) {
        return E(0, i, i2, this.a);
    }

    @Override // defpackage.tvh
    public int m(int i, int i2) {
        return D(0, i, i2, this.a);
    }

    @Override // defpackage.uvn
    public int n(int i, int i2, int i3) {
        return E(i, i2, i3, this.b);
    }

    @Override // defpackage.tvh
    public void o(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            int i3 = vvhVar.b;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.c;
            int i4 = (vvhVar.j * i3) + i2;
            float[] fArr2 = this.d;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = vvhVar.m * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            fArr[i4] = (((r10 - j5) * f2) + (j5 * f)) / (j4 - (vvhVar.l * j2));
            i2++;
        }
    }

    @Override // defpackage.uvn
    public void p(int i) {
        vvh vvhVar = (vvh) this.h;
        this.b = F(vvhVar.i, i, this.b);
    }

    @Override // defpackage.uvn
    public void q(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            int i3 = vvhVar.b;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.c;
            int i4 = vvhVar.j;
            float[] fArr2 = this.d;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = vvhVar.m * j;
            long j4 = (r1 + 1) * j2;
            long j5 = j4 - j3;
            fArr[(i4 * i3) + i2] = ((j5 * f) + ((r12 - j5) * f2)) / (j4 - (vvhVar.l * j2));
            i2++;
        }
    }

    @Override // defpackage.tvh
    public void r() {
        this.g = this.e;
    }

    @Override // defpackage.tvh
    public Object s() {
        return this.b;
    }

    @Override // defpackage.tvh
    public Object t() {
        return this.c;
    }

    @Override // defpackage.uvn
    public void u(int i) {
        vvh vvhVar = (vvh) this.h;
        this.d = F(vvhVar.k, i, this.d);
    }

    @Override // defpackage.uvn
    public void v(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i9] = ((fArr2[i8] * i10) + (fArr2[i7] * (i - i10))) / i;
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.tvh
    public Object w() {
        return this.d;
    }

    @Override // defpackage.tvh
    public void x(int i) {
        this.d = C(((vvh) this.h).k, i, this.d);
    }

    @Override // defpackage.tvh
    public int y() {
        return 4;
    }

    @Override // defpackage.uvn
    public void z(int i, ByteBuffer byteBuffer) {
        vvh vvhVar = (vvh) this.h;
        byteBuffer.asFloatBuffer().get(this.b, vvhVar.i * vvhVar.b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.uvn
    public int zza() {
        return 4;
    }

    @Override // defpackage.uvn
    public boolean zzc() {
        double d = this.e;
        return d != 0.0d && ((vvh) this.h).o != 0 && this.f <= d * 3.0d && d + d > this.g * 3.0d;
    }

    @Override // defpackage.uvn
    public void zzg() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // defpackage.uvn
    public void zzi() {
        this.g = this.e;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzp() {
        return this.d;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzq() {
        return this.c;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzr() {
        return this.b;
    }

    public svh(vvh vvhVar) {
        this.h = vvhVar;
        int i = vvhVar.h;
        this.a = new float[i];
        int i2 = i * vvhVar.b;
        this.b = new float[i2];
        this.c = new float[i2];
        this.d = new float[i2];
    }
}
