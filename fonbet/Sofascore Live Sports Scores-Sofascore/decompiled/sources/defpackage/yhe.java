package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.internal.ads.zzadp;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzeh;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yhe extends HandlerThread implements Handler.Callback {
    public final /* synthetic */ int a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public Object e;
    public Surface f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yhe(String str, int i) {
        super(str);
        this.a = i;
    }

    public void a(int i) {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.a) {
            case 0:
                ((tf5) this.e).getClass();
                tf5 tf5Var = (tf5) this.e;
                int[] iArr = tf5Var.c;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                ok3.h("eglGetDisplay failed", eglGetDisplay != null);
                int[] iArr2 = new int[2];
                ok3.h("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
                tf5Var.d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, tf5.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
                boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
                Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
                int i2 = lik.a;
                ok3.h(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(tf5Var.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                ok3.h("eglCreateContext failed", eglCreateContext != null);
                tf5Var.e = eglCreateContext;
                EGLDisplay eGLDisplay = tf5Var.d;
                if (i == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    ok3.h("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
                    eGLSurface = eglCreatePbufferSurface;
                }
                ok3.h("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext));
                tf5Var.f = eGLSurface;
                GLES20.glGenTextures(1, iArr, 0);
                ok3.g();
                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
                tf5Var.g = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(tf5Var);
                SurfaceTexture surfaceTexture2 = ((tf5) this.e).g;
                surfaceTexture2.getClass();
                this.f = new PlaceholderSurface(this, surfaceTexture2, i != 0);
                break;
            default:
                ((tf5) this.e).getClass();
                tf5 tf5Var2 = (tf5) this.e;
                int[] iArr4 = tf5Var2.c;
                EGLDisplay eglGetDisplay2 = EGL14.eglGetDisplay(0);
                xw3.y("eglGetDisplay failed", eglGetDisplay2 != null);
                int[] iArr5 = new int[2];
                xw3.y("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay2, iArr5, 0, iArr5, 1));
                tf5Var2.d = eglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr6 = new int[1];
                boolean eglChooseConfig2 = EGL14.eglChooseConfig(eglGetDisplay2, tf5.i, 0, eGLConfigArr2, 0, 1, iArr6, 0);
                boolean z2 = eglChooseConfig2 && iArr6[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(eglChooseConfig2), Integer.valueOf(iArr6[0]), eGLConfigArr2[0]};
                String str = nik.a;
                xw3.y(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z2);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eglCreateContext2 = EGL14.eglCreateContext(tf5Var2.d, eGLConfig2, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                xw3.y("eglCreateContext failed", eglCreateContext2 != null);
                tf5Var2.e = eglCreateContext2;
                EGLDisplay eGLDisplay2 = tf5Var2.d;
                if (i == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    xw3.y("eglCreatePbufferSurface failed", eglCreatePbufferSurface2 != null);
                    eGLSurface2 = eglCreatePbufferSurface2;
                }
                xw3.y("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eglCreateContext2));
                tf5Var2.f = eGLSurface2;
                GLES20.glGenTextures(1, iArr4, 0);
                xw3.x();
                SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr4[0]);
                tf5Var2.g = surfaceTexture3;
                surfaceTexture3.setOnFrameAvailableListener(tf5Var2);
                SurfaceTexture surfaceTexture4 = ((tf5) this.e).g;
                surfaceTexture4.getClass();
                this.f = new androidx.media3.exoplayer.video.PlaceholderSurface(this, surfaceTexture4, i != 0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        switch (this.a) {
            case 0:
                ((tf5) this.e).getClass();
                tf5 tf5Var = (tf5) this.e;
                tf5Var.b.removeCallbacks(tf5Var);
                try {
                    SurfaceTexture surfaceTexture = tf5Var.g;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, tf5Var.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = tf5Var.d;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = tf5Var.d;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = tf5Var.f;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(tf5Var.d, tf5Var.f);
                    }
                    EGLContext eGLContext = tf5Var.e;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(tf5Var.d, eGLContext);
                    }
                    if (lik.a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = tf5Var.d;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(tf5Var.d);
                    }
                    tf5Var.d = null;
                    tf5Var.e = null;
                    tf5Var.f = null;
                    tf5Var.g = null;
                }
            default:
                ((tf5) this.e).getClass();
                tf5 tf5Var2 = (tf5) this.e;
                tf5Var2.b.removeCallbacks(tf5Var2);
                try {
                    SurfaceTexture surfaceTexture2 = tf5Var2.g;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, tf5Var2.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = tf5Var2.d;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = tf5Var2.d;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = tf5Var2.f;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(tf5Var2.d, tf5Var2.f);
                    }
                    EGLContext eGLContext2 = tf5Var2.e;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(tf5Var2.d, eGLContext2);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay6 = tf5Var2.d;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(tf5Var2.d);
                    }
                    tf5Var2.d = null;
                    tf5Var2.e = null;
                    tf5Var2.f = null;
                    tf5Var2.g = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdw zzdwVar;
        switch (this.a) {
            case 0:
                int i = message.what;
                try {
                    if (i == 1) {
                        try {
                            try {
                                try {
                                    a(message.arg1);
                                    synchronized (this) {
                                        notify();
                                    }
                                } catch (hy8 e) {
                                    m6k.C("Failed to initialize placeholder surface", e);
                                    this.d = new IllegalStateException(e);
                                    synchronized (this) {
                                        notify();
                                    }
                                }
                            } catch (RuntimeException e2) {
                                m6k.C("Failed to initialize placeholder surface", e2);
                                this.d = e2;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e3) {
                            m6k.C("Failed to initialize placeholder surface", e3);
                            this.c = e3;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            case 1:
                int i2 = message.what;
                try {
                    if (i2 == 1) {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (iy8 e4) {
                                tgj.A("Failed to initialize placeholder surface", e4);
                                this.d = new IllegalStateException(e4);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e5) {
                            tgj.A("Failed to initialize placeholder surface", e5);
                            this.c = e5;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e6) {
                            tgj.A("Failed to initialize placeholder surface", e6);
                            this.d = e6;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i2 == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
            default:
                int i3 = message.what;
                try {
                    if (i3 == 1) {
                        try {
                            int i4 = message.arg1;
                            zzdw zzdwVar2 = (zzdw) this.e;
                            if (zzdwVar2 == null) {
                                throw null;
                            }
                            zzdwVar2.a(i4);
                            SurfaceTexture surfaceTexture = ((zzdw) this.e).f;
                            surfaceTexture.getClass();
                            this.f = new zzadp(this, surfaceTexture, i4 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (zzdx e7) {
                            zzeh.f("Failed to initialize placeholder surface", e7);
                            this.d = new IllegalStateException(e7);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e8) {
                            zzeh.f("Failed to initialize placeholder surface", e8);
                            this.c = e8;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e9) {
                            zzeh.f("Failed to initialize placeholder surface", e9);
                            this.d = e9;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i3 == 2) {
                        try {
                            zzdwVar = (zzdw) this.e;
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        if (zzdwVar == null) {
                            throw null;
                        }
                        zzdwVar.b();
                    }
                    return true;
                } catch (Throwable th3) {
                    synchronized (this) {
                        notify();
                        throw th3;
                    }
                }
        }
    }
}
