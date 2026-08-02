package androidx.media3.common.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import ru.ok.gpu.SharedEglContext;
import xsna.et;
import xsna.fxc0;
import xsna.ho8;
import xsna.lhg;

/* loaded from: classes12.dex */
public final class GlUtil {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12445, 13120, 12344, 12344};
    public static final int[] d = {12445, 13632, 12344, 12344};
    public static final int[] e = {12344};

    public static void a(int i, int i2) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        fxc0.A(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlException(lhg.a(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void b(int i, int i2, int i3) throws GlException {
        GLES20.glBindTexture(i, i2);
        d();
        GLES20.glTexParameteri(i, 10240, i3);
        d();
        GLES20.glTexParameteri(i, 10241, i3);
        d();
        GLES20.glTexParameteri(i, 10242, 33071);
        d();
        GLES20.glTexParameteri(i, 10243, 33071);
        d();
    }

    public static void c(String str) throws GlException {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new GlException(et.a(eglGetError, ho8.b(str, ", error code: 0x")), ImmutableList.p(Integer.valueOf(eglGetError)));
        }
    }

    public static void d() throws GlException {
        StringBuilder sb = new StringBuilder();
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = et.a(glGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            aVar.c(Integer.valueOf(glGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString(), aVar.g());
        }
    }

    public static void e(String str, boolean z) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static void f() throws GlException {
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        d();
    }

    public static float[] g() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer h(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static EGLContext i(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlException {
        boolean z = true;
        fxc0.p(Arrays.equals(iArr, a) || Arrays.equals(iArr, b));
        if (i != 2 && i != 3) {
            z = false;
        }
        fxc0.p(z);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, q(eGLDisplay, iArr), eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, i, 12344}, 0);
        if (eglCreateContext == null || eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException(lhg.a(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        d();
        return eglCreateContext;
    }

    public static EGLSurface j(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        EGLSurface eglCreatePbufferSurface;
        if (s("EGL_KHR_surfaceless_context")) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, q(eGLDisplay, a), new int[]{12375, 1, 12374, 1, 12344}, 0);
            c("Error creating a new EGL Pbuffer surface");
        }
        n(eGLDisplay, eGLContext, eglCreatePbufferSurface, 1, 1);
        return eglCreatePbufferSurface;
    }

    public static long k() throws GlException {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
        d();
        if (r0[0] < 3) {
            return 0L;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        d();
        GLES20.glFlush();
        d();
        return glFenceSync;
    }

    public static void l(@Nullable EGLContext eGLContext, @Nullable EGLDisplay eGLDisplay) throws GlException {
        if (eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        c("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        c("Error destroying context");
    }

    public static void m(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        c("Error destroying surface");
    }

    public static void n(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlException {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        c("Error making context current");
        o(0, i, i2);
    }

    public static void o(int i, int i2, int i3) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        d();
        GLES20.glViewport(0, 0, i2, i3);
        d();
    }

    public static EGLDisplay p() throws GlException {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        e("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        e("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        d();
        return eglGetDisplay;
    }

    public static EGLConfig q(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlException("eglChooseConfig failed.");
    }

    public static boolean r() throws GlException {
        return Build.VERSION.SDK_INT >= 33 && s("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean s(String str) throws GlException {
        String eglQueryString = EGL14.eglQueryString(p(), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static final class GlException extends Exception {
        public final ImmutableList<Integer> errorCodes;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GlException(String str) {
            this(str, g.f);
            ImmutableList.b bVar = ImmutableList.c;
        }

        public GlException(String str, g gVar) {
            super(str);
            this.errorCodes = ImmutableList.m(gVar);
        }
    }
}
