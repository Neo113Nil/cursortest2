package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xrg implements npk, di2 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final qdf c = new qdf(1);
    public final en0 d = new en0(7);
    public final eij e = new eij(1);
    public final eij f = new eij(1);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // defpackage.di2
    public final void a(long j, float[] fArr) {
        ((eij) this.d.e).a(fArr, j);
    }

    @Override // defpackage.di2
    public final void b() {
        this.e.b();
        en0 en0Var = this.d;
        ((eij) en0Var.e).b();
        en0Var.b = false;
        this.b.set(true);
    }

    @Override // defpackage.npk
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        ArrayList arrayList;
        int m;
        this.e.a(Long.valueOf(j), j2);
        byte[] bArr = bVar.C;
        int i = bVar.D;
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
        odf odfVar = null;
        if (bArr3 != null) {
            int i4 = this.l;
            j9e j9eVar = new j9e(bArr3);
            try {
                j9eVar.O(4);
                m = j9eVar.m();
                j9eVar.N(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (m == 1886547818) {
                j9eVar.O(8);
                int i5 = j9eVar.b;
                int i6 = j9eVar.c;
                while (i5 < i6) {
                    int m2 = j9eVar.m() + i5;
                    if (m2 <= i5 || m2 > i6) {
                        break;
                    }
                    int m3 = j9eVar.m();
                    if (m3 != 2037673328 && m3 != 1836279920) {
                        j9eVar.N(m2);
                        i5 = m2;
                    }
                    j9eVar.M(m2);
                    arrayList = b0a.N(j9eVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = b0a.N(j9eVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    ldf ldfVar = (ldf) arrayList.get(0);
                    odfVar = new odf(ldfVar, ldfVar, i4);
                } else if (size == 2) {
                    odfVar = new odf((ldf) arrayList.get(0), (ldf) arrayList.get(1), i4);
                }
            }
        }
        if (odfVar == null || !qdf.c(odfVar)) {
            int i7 = this.l;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i11 = i8 + 1;
                float f5 = (i11 * f) - f3;
                float f6 = radians;
                int i12 = 0;
                while (i12 < 73) {
                    float f7 = f4;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f8 = radians2;
                        float f9 = i12 * f2;
                        float f10 = f;
                        double d = (f9 + 3.1415927f) - (f8 / 2.0f);
                        double d2 = i13 == 0 ? f7 : f5;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i9 + 3;
                        int i16 = i11;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f9 / f8;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i8 + i13) * f10) / f6;
                        if ((i12 != 0 || i13 != 0) && (i12 != 72 || i13 != 1)) {
                            i14 = 2;
                            i9 = i15;
                            i10 = i17;
                            i13++;
                            radians2 = f8;
                            i11 = i16;
                            f = f10;
                        }
                        System.arraycopy(fArr, i9, fArr, i15, 3);
                        i9 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i10, fArr2, i17, 2);
                        i10 += 4;
                        i13++;
                        radians2 = f8;
                        i11 = i16;
                        f = f10;
                    }
                    i12++;
                    f4 = f7;
                    i11 = i11;
                }
                radians = f6;
                i8 = i11;
                i3 = 1;
            }
            ldf ldfVar2 = new ldf(new mdf(0, fArr, fArr2, i3, 1));
            odfVar = new odf(ldfVar2, ldfVar2, i7);
        }
        this.f.a(odfVar, j2);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            xw3.x();
            this.c.a();
            xw3.x();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            xw3.x();
            int i = iArr[0];
            xw3.u(36197, i);
            this.i = i;
        } catch (iy8 e) {
            tgj.A("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new vrg(this, 1));
        return this.j;
    }
}
