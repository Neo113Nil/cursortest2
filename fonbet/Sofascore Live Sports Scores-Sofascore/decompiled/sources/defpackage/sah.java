package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sah implements tvh, uvn {
    public static final int[] i = new int[3];
    public static final float[] j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    public sah() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        this.d = new Paint();
        E(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint2);
    }

    @Override // defpackage.uvn
    public void A(int i2, int i3) {
        for (int i4 = 0; i4 < ((vvh) this.h).b * i3; i4++) {
            ((short[]) this.e)[i2 + i4] = 0;
        }
    }

    @Override // defpackage.uvn
    public void B(int i2, ByteBuffer byteBuffer) {
        int i3 = ((vvh) this.h).b;
        byteBuffer.asShortBuffer().put((short[]) this.f, 0, i2 * i3);
        byteBuffer.position(((i2 + i2) * i3) + byteBuffer.position());
    }

    public short[] C(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = ((vvh) this.h).b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public int D(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * ((vvh) this.h).b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i7 * i3) {
                i8 = i3;
                i7 = i10;
            }
            if (i10 * i6 > i9 * i3) {
                i6 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.a = i7 / i8;
        this.b = i9 / i6;
        return i8;
    }

    public void E(int i2) {
        this.a = o23.k(i2, 68);
        this.b = o23.k(i2, 20);
        this.c = o23.k(i2, 0);
        ((Paint) this.d).setColor(this.a);
    }

    public int F(short[] sArr, int i2, int i3, int i4) {
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i3 <= i4) {
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                int i11 = ((vvh) this.h).b * i2;
                i9 += Math.abs(sArr[i11 + i10] - sArr[(i11 + i3) + i10]);
            }
            int i12 = i9 * i7;
            int i13 = i5 * i3;
            if (i12 < i13) {
                i5 = i9;
            }
            if (i12 < i13) {
                i7 = i3;
            }
            int i14 = i9 * i6;
            int i15 = i8 * i3;
            if (i14 > i15) {
                i8 = i9;
            }
            if (i14 > i15) {
                i6 = i3;
            }
            i3++;
        }
        this.a = i5 / i7;
        this.b = i8 / i6;
        return i7;
    }

    public short[] G(short[] sArr, int i2, int i3) {
        vvh vvhVar = (vvh) this.h;
        int length = sArr.length;
        int i4 = vvhVar.b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    @Override // defpackage.tvh
    public void a(int i2, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        vvh vvhVar = (vvh) this.h;
        asShortBuffer.get(sArr, vvhVar.i * vvhVar.b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // defpackage.tvh
    public void b(int i2, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        int i3 = ((vvh) this.h).b;
        asShortBuffer.put(sArr, 0, i2 * i3);
        byteBuffer.position((i2 * 2 * i3) + byteBuffer.position());
    }

    @Override // defpackage.tvh
    public void c(int i2, int i3) {
        for (int i4 = 0; i4 < ((vvh) this.h).b * i3; i4++) {
            ((short[]) this.e)[i2 + i4] = 0;
        }
    }

    @Override // defpackage.uvn
    public void d(int i2) {
        this.f = G((short[]) this.f, ((vvh) this.h).j, i2);
    }

    @Override // defpackage.tvh
    public void e(int i2, int i3) {
        short[] sArr = (short[]) this.e;
        vvh vvhVar = (vvh) this.h;
        int i4 = vvhVar.h / i3;
        int i5 = vvhVar.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[bf3.c(i8, i6, i7, i10)];
            }
            ((short[]) this.d)[i8] = (short) (i9 / i6);
        }
    }

    @Override // defpackage.tvh
    public int f(int i2, int i3, int i4) {
        return D((short[]) this.e, i2, i3, i4);
    }

    @Override // defpackage.tvh
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.tvh
    public void g(int i2) {
        this.f = C((short[]) this.f, ((vvh) this.h).j, i2);
    }

    @Override // defpackage.tvh
    public boolean h() {
        int i2 = this.a;
        return i2 != 0 && ((vvh) this.h).o != 0 && this.b <= i2 * 3 && i2 * 2 > this.c * 3;
    }

    @Override // defpackage.tvh
    public void i(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    @Override // defpackage.uvn
    public void j(int i2, int i3) {
        int i4;
        short[] sArr = (short[]) this.e;
        int i5 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            if (i5 >= vvhVar.h / i3) {
                return;
            }
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = vvhVar.b;
                i4 = i8 * i3;
                if (i6 < i4) {
                    i7 += sArr[bf3.c(i5, i4, i8 * i2, i6)];
                    i6++;
                }
            }
            ((short[]) this.d)[i5] = (short) (i7 / i4);
            i5++;
        }
    }

    @Override // defpackage.tvh
    public void k(int i2) {
        this.e = C((short[]) this.e, ((vvh) this.h).i, i2);
    }

    @Override // defpackage.uvn
    public int l(int i2, int i3) {
        return F((short[]) this.d, 0, i2, i3);
    }

    @Override // defpackage.tvh
    public int m(int i2, int i3) {
        return D((short[]) this.d, 0, i2, i3);
    }

    @Override // defpackage.uvn
    public int n(int i2, int i3, int i4) {
        return F((short[]) this.e, i2, i3, i4);
    }

    @Override // defpackage.tvh
    public void o(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            int i4 = vvhVar.b;
            if (i3 >= i4) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i5 = (vvhVar.j * i4) + i3;
            short[] sArr2 = (short[]) this.g;
            int i6 = (i2 * i4) + i3;
            short s = sArr2[i6];
            short s2 = sArr2[i6 + i4];
            long j4 = vvhVar.m * j2;
            long j5 = (r1 + 1) * j3;
            long j6 = j5 - j4;
            long j7 = j5 - (vvhVar.l * j3);
            sArr[i5] = (short) ((((j7 - j6) * s2) + (s * j6)) / j7);
            i3++;
        }
    }

    @Override // defpackage.uvn
    public void p(int i2) {
        this.e = G((short[]) this.e, ((vvh) this.h).i, i2);
    }

    @Override // defpackage.uvn
    public void q(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            vvh vvhVar = (vvh) this.h;
            int i4 = vvhVar.b;
            if (i3 >= i4) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i5 = vvhVar.j;
            short[] sArr2 = (short[]) this.g;
            int i6 = (i2 * i4) + i3;
            short s = sArr2[i6];
            short s2 = sArr2[i6 + i4];
            long j4 = vvhVar.m * j2;
            long j5 = vvhVar.l * j3;
            long j6 = (r2 + 1) * j3;
            int i7 = i3;
            long j7 = j6 - j5;
            long j8 = j6 - j4;
            sArr[(i5 * i4) + i7] = (short) ((((j7 - j8) * s2) + (j8 * s)) / j7);
            i3 = i7 + 1;
        }
    }

    @Override // defpackage.tvh
    public void r() {
        this.c = this.a;
    }

    @Override // defpackage.tvh
    public Object s() {
        return (short[]) this.e;
    }

    @Override // defpackage.tvh
    public Object t() {
        return (short[]) this.f;
    }

    @Override // defpackage.uvn
    public void u(int i2) {
        this.g = G((short[]) this.g, ((vvh) this.h).k, i2);
    }

    @Override // defpackage.uvn
    public void v(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i8])) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    @Override // defpackage.tvh
    public Object w() {
        return (short[]) this.g;
    }

    @Override // defpackage.tvh
    public void x(int i2) {
        this.g = C((short[]) this.g, ((vvh) this.h).k, i2);
    }

    @Override // defpackage.tvh
    public int y() {
        return 2;
    }

    @Override // defpackage.uvn
    public void z(int i2, ByteBuffer byteBuffer) {
        vvh vvhVar = (vvh) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.e, vvhVar.i * vvhVar.b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // defpackage.uvn
    public int zza() {
        return 2;
    }

    @Override // defpackage.uvn
    public boolean zzc() {
        int i2 = this.a;
        return i2 != 0 && ((vvh) this.h).o != 0 && this.b <= i2 * 3 && i2 + i2 > this.c * 3;
    }

    @Override // defpackage.uvn
    public void zzg() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.uvn
    public void zzi() {
        this.c = this.a;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzp() {
        return (short[]) this.g;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzq() {
        return (short[]) this.f;
    }

    @Override // defpackage.uvn
    public /* synthetic */ Object zzr() {
        return (short[]) this.e;
    }

    public sah(vvh vvhVar, boolean z) {
        this.h = vvhVar;
        int i2 = vvhVar.h;
        this.d = new short[i2];
        int i3 = i2 * vvhVar.b;
        this.e = new short[i3];
        this.f = new short[i3];
        this.g = new short[i3];
    }

    public sah(vvh vvhVar) {
        this.h = vvhVar;
        int i2 = vvhVar.h;
        this.d = new short[i2];
        int i3 = i2 * vvhVar.b;
        this.e = new short[i3];
        this.f = new short[i3];
        this.g = new short[i3];
    }
}
