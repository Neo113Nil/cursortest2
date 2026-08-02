package air.com.playtika.android.common.gles;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class EglCore {
    private static final int EGL_DEPTH_SIZE_UNSPECIFIED = -1;
    private static final String TAG = "EglCore";
    private EGLConfig mEGLConfig;
    private EGLDisplay mEGLDisplay;
    private EGLContext mEGLContext = EGL14.EGL_NO_CONTEXT;
    public int glEsVersion = 0;

    public EglCore() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.mEGLDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig config = getConfig();
        if (config == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        this.mEGLConfig = config;
    }

    private void createContext() {
        int[] iArr = {12440, 2, 12344};
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        int eglGetError = EGL14.eglGetError();
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            Log.d(TAG, "ES3 context creation failed, falling back to ES2, eglError=0x" + Integer.toHexString(eglGetError));
            eglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        }
        checkEglError("eglCreateContext");
        this.mEGLContext = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.mEGLDisplay, eglCreateContext, 12440, iArr2, 0);
        this.glEsVersion = iArr2[0];
        Log.d(TAG, "EGLContext created, client version " + this.glEsVersion);
    }

    private void releaseContext() {
        EGL14.eglMakeCurrent(this.mEGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        EGL14.eglReleaseThread();
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
    }

    private EGLConfig getConfig() {
        int[] iArr = {64, 4};
        int[] iArr2 = {24, 16, -1};
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr2[i3];
                EGLConfig tryChooseConfig = tryChooseConfig(i2, i4);
                if (tryChooseConfig != null) {
                    Log.d(TAG, "EGLConfig chosen: EGL_DEPTH_SIZE=" + (i4 == -1 ? "unspecified" : String.valueOf(i4)));
                    return tryChooseConfig;
                }
            }
        }
        Log.w(TAG, "Unable to find RGB8888 EGLConfig");
        return null;
    }

    private EGLConfig tryChooseConfig(int i, int i2) {
        int[] iArr = new int[(((i2 >= 0 ? 1 : 0) + 5) * 2) + 1];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12352;
        iArr[9] = i;
        char c = '\n';
        if (i2 >= 0) {
            iArr[10] = 12325;
            iArr[11] = i2;
            c = '\f';
        }
        iArr[c] = 12344;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] >= 1) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public void release() {
        if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
            releaseContext();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
                Log.w(TAG, "WARNING: EglCore was not explicitly released -- state may be leaked");
                release();
            }
        } finally {
            super.finalize();
        }
    }

    public void releaseSurface(EGLSurface eGLSurface) {
        if (eGLSurface == null) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface);
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "eglDestroySurface", e);
        }
    }

    public EGLSurface createWindowSurface(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            return null;
        }
        try {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, new int[]{12344}, 0);
            checkEglError("eglCreateWindowSurface");
            return eglCreateWindowSurface;
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "eglCreateWindowSurface", e);
            return null;
        }
    }

    public boolean makeCurrent(EGLSurface eGLSurface) {
        boolean z;
        if (this.mEGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            createContext();
            z = false;
        } else {
            z = true;
        }
        if (EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return z;
        }
        releaseContext();
        createContext();
        if (EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return false;
        }
        throw new RuntimeException("egl::makeCurrent failed");
    }

    public void makeNothingCurrent() {
        if (!EGL14.eglMakeCurrent(this.mEGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("egl::makeNothingCurrent failed");
        }
    }

    public boolean swapBuffers(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, eGLSurface);
    }

    public int getError() {
        return EGL14.eglGetError();
    }

    public int querySurface(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    private void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }
}
