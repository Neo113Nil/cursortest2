package air.com.playtika.android.common.gles;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes8.dex */
public class WindowSurface {
    protected static final String TAG = "EglSurface";
    protected EglCore mEglCore;
    private EGLSurface mEGLSurface = null;
    private boolean badSurface = false;
    private boolean lostSurface = false;

    public WindowSurface(EglCore eglCore) {
        this.mEglCore = eglCore;
    }

    public boolean makeCurrent(Surface surface) {
        EGLSurface createWindowSurface = this.mEglCore.createWindowSurface(surface);
        this.mEGLSurface = createWindowSurface;
        if (createWindowSurface == null || createWindowSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return true;
        }
        return this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public boolean isValid() {
        EGLSurface eGLSurface = this.mEGLSurface;
        return (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE) || this.badSurface || this.lostSurface) ? false : true;
    }

    public void swapBuffers() {
        int error;
        if (!isValid() || this.mEglCore.swapBuffers(this.mEGLSurface) || (error = this.mEglCore.getError()) == 12288) {
            return;
        }
        if (error == 12299 || error == 12301) {
            this.badSurface = true;
            Log.w(TAG, "egl bad surface");
        } else if (error != 12302) {
            Log.w(TAG, "eglSwapBuffers error: " + error);
        } else {
            this.lostSurface = true;
            Log.w(TAG, "egl context lost");
        }
    }

    public void release() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
    }
}
