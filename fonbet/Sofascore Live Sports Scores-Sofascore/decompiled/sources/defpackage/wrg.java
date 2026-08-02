package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wrg implements mpk, ci2 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final qdf c = new qdf(0);
    public final en0 d = new en0(6);
    public final eij e = new eij(0);
    public final eij f = new eij(0);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // defpackage.ci2
    public final void a(long j, float[] fArr) {
        ((eij) this.d.e).a(fArr, j);
    }

    @Override // defpackage.ci2
    public final void b() {
        this.e.b();
        en0 en0Var = this.d;
        ((eij) en0Var.e).b();
        en0Var.b = false;
        this.b.set(true);
    }

    @Override // defpackage.mpk
    public final void c(long j, long j2, sm8 sm8Var, MediaFormat mediaFormat) {
        ArrayList arrayList;
        int f;
        this.e.a(Long.valueOf(j), j2);
        byte[] bArr = sm8Var.v;
        int i = sm8Var.w;
        byte[] bArr2 = this.m;
        int i2 = this.l;
        this.m = bArr;
        if (i == -1) {
            i = this.k;
        }
        this.l = i;
        if (i2 == i && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        int i3 = 1;
        ndf ndfVar = null;
        if (bArr3 != null) {
            int i4 = this.l;
            nkk nkkVar = new nkk(bArr3);
            try {
                nkkVar.F(4);
                f = nkkVar.f();
                nkkVar.E(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (f == 1886547818) {
                nkkVar.F(8);
                int i5 = nkkVar.b;
                int i6 = nkkVar.c;
                while (i5 < i6) {
                    int f2 = nkkVar.f() + i5;
                    if (f2 <= i5 || f2 > i6) {
                        break;
                    }
                    int f3 = nkkVar.f();
                    if (f3 != 2037673328 && f3 != 1836279920) {
                        nkkVar.E(f2);
                        i5 = f2;
                    }
                    nkkVar.D(f2);
                    arrayList = tz9.J(nkkVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = tz9.J(nkkVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    kdf kdfVar = (kdf) arrayList.get(0);
                    ndfVar = new ndf(kdfVar, kdfVar, i4);
                } else if (size == 2) {
                    ndfVar = new ndf((kdf) arrayList.get(0), (kdf) arrayList.get(1), i4);
                }
            }
        }
        if (ndfVar == null || !qdf.b(ndfVar)) {
            int i7 = this.l;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f4 = radians / 36.0f;
            float f5 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < 36) {
                float f6 = radians / 2.0f;
                float f7 = (i8 * f4) - f6;
                int i11 = i8 + 1;
                float f8 = (i11 * f4) - f6;
                float f9 = radians;
                int i12 = 0;
                while (i12 < 73) {
                    float f10 = f7;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f11 = radians2;
                        float f12 = i12 * f5;
                        float f13 = f4;
                        double d = (f12 + 3.1415927f) - (f11 / 2.0f);
                        double d2 = i13 == 0 ? f10 : f8;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i9 + 3;
                        int i16 = i11;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f12 / f11;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i8 + i13) * f13) / f9;
                        if ((i12 != 0 || i13 != 0) && (i12 != 72 || i13 != 1)) {
                            i14 = 2;
                            i9 = i15;
                            i10 = i17;
                            i13++;
                            radians2 = f11;
                            i11 = i16;
                            f4 = f13;
                        }
                        System.arraycopy(fArr, i9, fArr, i15, 3);
                        i9 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i10, fArr2, i17, 2);
                        i10 += 4;
                        i13++;
                        radians2 = f11;
                        i11 = i16;
                        f4 = f13;
                    }
                    i12++;
                    f7 = f10;
                    i11 = i11;
                }
                radians = f9;
                i8 = i11;
                i3 = 1;
            }
            kdf kdfVar2 = new kdf(new mdf(0, fArr, fArr2, i3, 0));
            ndfVar = new ndf(kdfVar2, kdfVar2, i7);
        }
        this.f.a(ndfVar, j2);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            ok3.g();
            this.c.a();
            ok3.g();
            ok3.h("No current context", !lik.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            ok3.g();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            ok3.g();
            GLES20.glTexParameteri(36197, 10240, 9729);
            ok3.g();
            GLES20.glTexParameteri(36197, 10241, 9729);
            ok3.g();
            GLES20.glTexParameteri(36197, 10242, 33071);
            ok3.g();
            GLES20.glTexParameteri(36197, 10243, 33071);
            ok3.g();
            this.i = i;
        } catch (hy8 e) {
            m6k.C("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new vrg(this, 0));
        return this.j;
    }
}
