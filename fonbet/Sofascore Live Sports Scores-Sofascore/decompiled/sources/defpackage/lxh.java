package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lxh implements GLSurfaceView.Renderer, hwd, iwd {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final Object k;
    public final /* synthetic */ GLSurfaceView l;

    public lxh(nxh nxhVar, xrg xrgVar) {
        this.a = 1;
        this.l = nxhVar;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = xrgVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    private final void b(GL10 gl10) {
        Object d;
        Object d2;
        Object d3;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        wrg wrgVar = (wrg) this.k;
        float[] fArr = this.c;
        GLES20.glClear(16384);
        try {
            ok3.g();
        } catch (hy8 e) {
            m6k.C("Failed to draw a frame", e);
        }
        if (wrgVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = wrgVar.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                ok3.g();
            } catch (hy8 e2) {
                m6k.C("Failed to draw a frame", e2);
            }
            if (wrgVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(wrgVar.g, 0);
            }
            long timestamp = wrgVar.j.getTimestamp();
            eij eijVar = wrgVar.e;
            synchronized (eijVar) {
                d = eijVar.d(timestamp, false);
            }
            Long l = (Long) d;
            if (l != null) {
                en0 en0Var = wrgVar.d;
                float[] fArr2 = wrgVar.g;
                long longValue = l.longValue();
                eij eijVar2 = (eij) en0Var.e;
                synchronized (eijVar2) {
                    d3 = eijVar2.d(longValue, true);
                }
                float[] fArr3 = (float[]) d3;
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) en0Var.d;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!en0Var.b) {
                        en0.k((float[]) en0Var.c, (float[]) en0Var.d);
                        en0Var.b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) en0Var.c, 0, (float[]) en0Var.d, 0);
                }
            }
            eij eijVar3 = wrgVar.f;
            synchronized (eijVar3) {
                d2 = eijVar3.d(timestamp, true);
            }
            ndf ndfVar = (ndf) d2;
            if (ndfVar != null) {
                qdf qdfVar = wrgVar.c;
                if (qdf.b(ndfVar)) {
                    qdfVar.b = ndfVar.c;
                    qdfVar.h = new pdf(ndfVar.a.a[0]);
                    if (!ndfVar.d) {
                        mdf mdfVar = ndfVar.b.a[0];
                        ok3.m(mdfVar.c);
                        ok3.m(mdfVar.d);
                    }
                }
            }
        }
        Matrix.multiplyMM(wrgVar.h, 0, fArr, 0, wrgVar.g, 0);
        qdf qdfVar2 = wrgVar.c;
        int i = wrgVar.i;
        float[] fArr5 = wrgVar.h;
        pdf pdfVar = (pdf) qdfVar2.h;
        if (pdfVar == null) {
            return;
        }
        int i2 = qdfVar2.b;
        GLES20.glUniformMatrix3fv(qdfVar2.d, 1, false, i2 == 1 ? qdf.k : i2 == 2 ? qdf.l : qdf.j, 0);
        GLES20.glUniformMatrix4fv(qdfVar2.c, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(qdfVar2.g, 0);
        try {
            ok3.g();
        } catch (hy8 unused) {
        }
        GLES20.glVertexAttribPointer(qdfVar2.e, 3, 5126, false, 12, (Buffer) pdfVar.b);
        try {
            ok3.g();
        } catch (hy8 unused2) {
        }
        GLES20.glVertexAttribPointer(qdfVar2.f, 2, 5126, false, 8, (Buffer) pdfVar.c);
        try {
            ok3.g();
        } catch (hy8 unused3) {
        }
        GLES20.glDrawArrays(pdfVar.d, 0, pdfVar.a);
        try {
            ok3.g();
        } catch (hy8 unused4) {
        }
    }

    @Override // defpackage.hwd, defpackage.iwd
    public final synchronized void a(float[] fArr, float f) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    float[] fArr2 = this.d;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                    float f2 = -f;
                    this.h = f2;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                default:
                    float[] fArr3 = this.d;
                    System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
                    float f3 = -f;
                    this.h = f3;
                    Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f3), (float) Math.sin(this.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object d;
        switch (this.a) {
            case 0:
                b(gl10);
                return;
            default:
                synchronized (this) {
                    Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                    Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
                }
                Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
                xrg xrgVar = (xrg) this.k;
                float[] fArr = this.c;
                GLES20.glClear(16384);
                try {
                    xw3.x();
                } catch (iy8 e) {
                    tgj.A("Failed to draw a frame", e);
                }
                if (xrgVar.a.compareAndSet(true, false)) {
                    SurfaceTexture surfaceTexture = xrgVar.j;
                    surfaceTexture.getClass();
                    surfaceTexture.updateTexImage();
                    try {
                        xw3.x();
                    } catch (iy8 e2) {
                        tgj.A("Failed to draw a frame", e2);
                    }
                    if (xrgVar.b.compareAndSet(true, false)) {
                        Matrix.setIdentityM(xrgVar.g, 0);
                    }
                    long timestamp = xrgVar.j.getTimestamp();
                    eij eijVar = xrgVar.e;
                    synchronized (eijVar) {
                        d = eijVar.d(timestamp, false);
                    }
                    Long l = (Long) d;
                    if (l != null) {
                        en0 en0Var = xrgVar.d;
                        float[] fArr2 = xrgVar.g;
                        float[] fArr3 = (float[]) ((eij) en0Var.e).f(l.longValue());
                        if (fArr3 != null) {
                            float[] fArr4 = (float[]) en0Var.d;
                            float f = fArr3[0];
                            float f2 = -fArr3[1];
                            float f3 = -fArr3[2];
                            float length = Matrix.length(f, f2, f3);
                            if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                            } else {
                                Matrix.setIdentityM(fArr4, 0);
                            }
                            if (!en0Var.b) {
                                en0.l((float[]) en0Var.c, (float[]) en0Var.d);
                                en0Var.b = true;
                            }
                            Matrix.multiplyMM(fArr2, 0, (float[]) en0Var.c, 0, (float[]) en0Var.d, 0);
                        }
                    }
                    odf odfVar = (odf) xrgVar.f.f(timestamp);
                    if (odfVar != null) {
                        qdf qdfVar = xrgVar.c;
                        if (qdf.c(odfVar)) {
                            qdfVar.b = odfVar.c;
                            qdfVar.h = new pdf(odfVar.a.a[0], false);
                            if (!odfVar.d) {
                                mdf mdfVar = odfVar.b.a[0];
                                xw3.E(mdfVar.c);
                                xw3.E(mdfVar.d);
                            }
                        }
                    }
                }
                Matrix.multiplyMM(xrgVar.h, 0, fArr, 0, xrgVar.g, 0);
                qdf qdfVar2 = xrgVar.c;
                int i = xrgVar.i;
                float[] fArr5 = xrgVar.h;
                pdf pdfVar = (pdf) qdfVar2.h;
                if (pdfVar == null) {
                    return;
                }
                int i2 = qdfVar2.b;
                GLES20.glUniformMatrix3fv(qdfVar2.d, 1, false, i2 == 1 ? qdf.n : i2 == 2 ? qdf.o : qdf.m, 0);
                GLES20.glUniformMatrix4fv(qdfVar2.c, 1, false, fArr5, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i);
                GLES20.glUniform1i(qdfVar2.g, 0);
                try {
                    xw3.x();
                } catch (iy8 e3) {
                    tgj.A("Failed to bind uniforms", e3);
                }
                GLES20.glVertexAttribPointer(qdfVar2.e, 3, 5126, false, 12, (Buffer) pdfVar.b);
                try {
                    xw3.x();
                } catch (iy8 e4) {
                    tgj.A("Failed to load position data", e4);
                }
                GLES20.glVertexAttribPointer(qdfVar2.f, 2, 5126, false, 8, (Buffer) pdfVar.c);
                try {
                    xw3.x();
                } catch (iy8 e5) {
                    tgj.A("Failed to load texture data", e5);
                }
                GLES20.glDrawArrays(pdfVar.d, 0, pdfVar.a);
                try {
                    xw3.x();
                    return;
                } catch (iy8 e6) {
                    tgj.A("Failed to render", e6);
                    return;
                }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        switch (this.a) {
            case 0:
                GLES20.glViewport(0, 0, i, i2);
                float f = i / i2;
                Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
                break;
            default:
                GLES20.glViewport(0, 0, i, i2);
                float f2 = i / i2;
                Matrix.perspectiveM(this.b, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
                break;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    mxh mxhVar = (mxh) this.l;
                    SurfaceTexture d = ((wrg) this.k).d();
                    int i2 = mxh.l;
                    mxhVar.e.post(new ecg(6, mxhVar, d));
                    return;
                default:
                    nxh nxhVar = (nxh) this.l;
                    SurfaceTexture d2 = ((xrg) this.k).d();
                    int i3 = nxh.l;
                    nxhVar.e.post(new ecg(7, nxhVar, d2));
                    return;
            }
        }
    }

    public lxh(mxh mxhVar, wrg wrgVar) {
        this.a = 0;
        this.l = mxhVar;
        this.b = new float[16];
        this.c = new float[16];
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.i = new float[16];
        this.j = new float[16];
        this.k = wrgVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }
}
