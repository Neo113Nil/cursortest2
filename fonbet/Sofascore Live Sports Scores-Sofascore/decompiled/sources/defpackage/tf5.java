package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tf5 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public static final int[] i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final /* synthetic */ int a;
    public final Handler b;
    public final int[] c;
    public EGLDisplay d;
    public EGLContext e;
    public EGLSurface f;
    public SurfaceTexture g;

    public tf5(Handler handler, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = handler;
                this.c = new int[1];
                break;
            default:
                this.b = handler;
                this.c = new int[1];
                break;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        int i2 = this.a;
        Handler handler = this.b;
        switch (i2) {
            case 0:
                handler.post(this);
                break;
            default:
                handler.post(this);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SurfaceTexture surfaceTexture = this.g;
                if (surfaceTexture != null) {
                    try {
                        surfaceTexture.updateTexImage();
                        break;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                break;
            default:
                SurfaceTexture surfaceTexture2 = this.g;
                if (surfaceTexture2 != null) {
                    try {
                        surfaceTexture2.updateTexImage();
                        break;
                    } catch (RuntimeException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
