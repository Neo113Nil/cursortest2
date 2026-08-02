package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.inn;
import defpackage.xsn;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzcid extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public volatile boolean A;
    public final xsn a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public SurfaceTexture n;
    public SurfaceTexture o;
    public int p;
    public int q;
    public int r;
    public final FloatBuffer s;
    public final CountDownLatch t;
    public final Object u;
    public EGL10 v;
    public EGLDisplay w;
    public EGLContext x;
    public EGLSurface y;
    public volatile boolean z;

    public zzcid(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.s = asFloatBuffer;
        asFloatBuffer.put(B).position(0);
        this.b = new float[9];
        this.c = new float[9];
        this.d = new float[9];
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[9];
        this.i = Float.NaN;
        xsn xsnVar = new xsn(context);
        this.a = xsnVar;
        xsnVar.h = this;
        this.t = new CountDownLatch(1);
        this.u = new Object();
    }

    public static final void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        float f26 = f9 * f24;
        fArr[7] = f26 + (f22 * fArr3[4]) + (f19 * f25);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    public static final void g(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void h(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                new StringBuilder(String.valueOf(i).length() + 26);
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(int i, int i2) {
        Object obj = this.u;
        synchronized (obj) {
            this.m = i;
            this.l = i2;
            this.z = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.u;
        synchronized (obj) {
            this.A = true;
            this.o = null;
            obj.notifyAll();
        }
    }

    public final void c(float f, float f2) {
        int i = this.m;
        int i2 = this.l;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.j -= (f * 1.7453293f) / f3;
        float f4 = this.k - ((f2 * 1.7453293f) / f3);
        this.k = f4;
        if (f4 < -1.5707964f) {
            this.k = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.k = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.y;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.v.eglMakeCurrent(this.w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.v.eglDestroySurface(this.w, this.y);
            this.y = null;
        }
        EGLContext eGLContext = this.x;
        if (eGLContext != null) {
            this.v.eglDestroyContext(this.w, eGLContext);
            this.x = null;
        }
        EGLDisplay eGLDisplay = this.w;
        if (eGLDisplay != null) {
            this.v.eglTerminate(eGLDisplay);
            this.w = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.r++;
        Object obj = this.u;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a8  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object[] objArr;
        int i;
        int glCreateProgram;
        if (this.o == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("SphericalVideoProcessor started with no output texture.");
            this.t.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.w = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.v.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.v.eglChooseConfig(this.w, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig != null) {
                EGL10 egl102 = this.v;
                EGLDisplay eGLDisplay = this.w;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.x = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != eGLContext) {
                    EGLSurface eglCreateWindowSurface = this.v.eglCreateWindowSurface(this.w, eGLConfig, this.o, null);
                    this.y = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.v.eglMakeCurrent(this.w, eglCreateWindowSurface, eglCreateWindowSurface, this.x)) {
                        objArr = true;
                        inn innVar = zzbjg.a2;
                        i = i(35633, ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).equals(innVar.e()) ? (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                        if (i != 0) {
                            inn innVar2 = zzbjg.b2;
                            int i3 = i(35632, !((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2)).equals(innVar2.e()) ? (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                            if (i3 != 0) {
                                glCreateProgram = GLES20.glCreateProgram();
                                e("createProgram");
                                if (glCreateProgram != 0) {
                                    GLES20.glAttachShader(glCreateProgram, i);
                                    e("attachShader");
                                    GLES20.glAttachShader(glCreateProgram, i3);
                                    e("attachShader");
                                    GLES20.glLinkProgram(glCreateProgram);
                                    e("linkProgram");
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                    e("getProgramiv");
                                    if (iArr2[0] != 1) {
                                        GLES20.glGetProgramInfoLog(glCreateProgram);
                                        GLES20.glDeleteProgram(glCreateProgram);
                                        e("deleteProgram");
                                    } else {
                                        GLES20.glValidateProgram(glCreateProgram);
                                        e("validateProgram");
                                    }
                                }
                                this.p = glCreateProgram;
                                GLES20.glUseProgram(glCreateProgram);
                                e("useProgram");
                                int glGetAttribLocation = GLES20.glGetAttribLocation(this.p, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.s);
                                e("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                e("enableVertexAttribArray");
                                int[] iArr3 = new int[1];
                                GLES20.glGenTextures(1, iArr3, 0);
                                e("genTextures");
                                int i4 = iArr3[0];
                                GLES20.glBindTexture(36197, i4);
                                e("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                e("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                e("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                e("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                e("texParameteri");
                                int glGetUniformLocation = GLES20.glGetUniformLocation(this.p, "uVMat");
                                this.q = glGetUniformLocation;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, 0);
                                int i5 = this.p;
                                if (objArr == true || i5 == 0) {
                                    String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.v.eglGetError()));
                                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                                    String concat = "EGL initialization failed: ".concat(valueOf);
                                    zzo.zzf(concat);
                                    com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.1", new Throwable(concat));
                                    d();
                                    this.t.countDown();
                                }
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i4);
                                this.n = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                this.t.countDown();
                                xsn xsnVar = this.a;
                                if (xsnVar.g == null) {
                                    SensorManager sensorManager = xsnVar.a;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(11);
                                    if (defaultSensor == null) {
                                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
                                    } else {
                                        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                        handlerThread.start();
                                        zzgbp zzgbpVar = new zzgbp(handlerThread.getLooper());
                                        xsnVar.g = zzgbpVar;
                                        if (!sensorManager.registerListener(xsnVar, defaultSensor, 0, zzgbpVar)) {
                                            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                                            zzo.zzf("SensorManager.registerListener failed.");
                                            xsnVar.b();
                                        }
                                    }
                                }
                                try {
                                    try {
                                        this.z = true;
                                        while (!this.A) {
                                            while (this.r > 0) {
                                                this.n.updateTexImage();
                                                this.r--;
                                            }
                                            float[] fArr = this.b;
                                            if (xsnVar.c(fArr)) {
                                                if (Float.isNaN(this.i)) {
                                                    float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                                                    float f = fArr[0];
                                                    float f2 = fArr2[0];
                                                    float f3 = fArr[1];
                                                    float f4 = fArr2[1];
                                                    float[] fArr3 = {(fArr[2] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (f3 * f4) + (f * f2), (fArr[5] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[4] * f4) + (fArr[3] * f2), (fArr[8] * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (fArr[7] * f4) + (fArr[6] * f2)};
                                                    this.i = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                }
                                                h(this.g, this.i + this.j);
                                            } else {
                                                g(fArr, -1.5707964f);
                                                h(this.g, this.j);
                                            }
                                            float[] fArr4 = this.c;
                                            g(fArr4, 1.5707964f);
                                            float[] fArr5 = this.d;
                                            f(fArr5, this.g, fArr4);
                                            float[] fArr6 = this.e;
                                            f(fArr6, fArr, fArr5);
                                            float[] fArr7 = this.f;
                                            g(fArr7, this.k);
                                            float[] fArr8 = this.h;
                                            f(fArr8, fArr7, fArr6);
                                            GLES20.glUniformMatrix3fv(this.q, 1, false, fArr8, 0);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            e("drawArrays");
                                            GLES20.glFinish();
                                            this.v.eglSwapBuffers(this.w, this.y);
                                            if (this.z) {
                                                GLES20.glViewport(0, 0, this.m, this.l);
                                                e("viewport");
                                                int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.p, "uFOVx");
                                                int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.p, "uFOVy");
                                                int i9 = this.m;
                                                int i10 = this.l;
                                                if (i9 > i10) {
                                                    GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                    GLES20.glUniform1f(glGetUniformLocation3, (this.l * 0.87266463f) / this.m);
                                                } else {
                                                    GLES20.glUniform1f(glGetUniformLocation2, (i9 * 0.87266463f) / i10);
                                                    GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                }
                                                this.z = false;
                                            }
                                            try {
                                                Object obj = this.u;
                                                synchronized (obj) {
                                                    try {
                                                        if (!this.A && !this.z && this.r == 0) {
                                                            obj.wait();
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            } catch (InterruptedException unused) {
                                            }
                                        }
                                    } finally {
                                        this.a.b();
                                        this.n.setOnFrameAvailableListener(null);
                                        this.n = null;
                                        d();
                                    }
                                } catch (IllegalStateException unused2) {
                                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzi("SphericalVideoProcessor halted unexpectedly.");
                                    return;
                                } catch (Throwable th2) {
                                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzg("SphericalVideoProcessor died.", th2);
                                    com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.2", th2);
                                    return;
                                }
                                return;
                            }
                        }
                        glCreateProgram = 0;
                        this.p = glCreateProgram;
                        GLES20.glUseProgram(glCreateProgram);
                        e("useProgram");
                        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.p, "aPosition");
                        GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.s);
                        e("vertexAttribPointer");
                        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        e("enableVertexAttribArray");
                        int[] iArr32 = new int[1];
                        GLES20.glGenTextures(1, iArr32, 0);
                        e("genTextures");
                        int i42 = iArr32[0];
                        GLES20.glBindTexture(36197, i42);
                        e("bindTextures");
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        e("texParameteri");
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        e("texParameteri");
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        e("texParameteri");
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        e("texParameteri");
                        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.p, "uVMat");
                        this.q = glGetUniformLocation4;
                        GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, 0);
                        int i52 = this.p;
                        if (objArr == true) {
                        }
                        String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.v.eglGetError()));
                        int i62 = com.google.android.gms.ads.internal.util.zze.zza;
                        String concat2 = "EGL initialization failed: ".concat(valueOf2);
                        zzo.zzf(concat2);
                        com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.1", new Throwable(concat2));
                        d();
                        this.t.countDown();
                    }
                }
            }
        }
        objArr = false;
        inn innVar3 = zzbjg.a2;
        i = i(35633, ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar3)).equals(innVar3.e()) ? (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i != 0) {
        }
        glCreateProgram = 0;
        this.p = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        e("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.p, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.s);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        e("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        e("genTextures");
        int i422 = iArr322[0];
        GLES20.glBindTexture(36197, i422);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.p, "uVMat");
        this.q = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, 0);
        int i522 = this.p;
        if (objArr == true) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.v.eglGetError()));
        int i622 = com.google.android.gms.ads.internal.util.zze.zza;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        zzo.zzf(concat22);
        com.google.android.gms.ads.internal.zzt.zzh().d("SphericalVideoProcessor.run.1", new Throwable(concat22));
        d();
        this.t.countDown();
    }
}
