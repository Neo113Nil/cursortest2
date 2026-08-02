package e1;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import io.agora.base.internal.video.EglBase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: e1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4151s {
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    /* renamed from: e1.s$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void A(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        c("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            c("Error destroying context");
        }
        EGL14.eglReleaseThread();
        c("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        c("Error terminating display");
    }

    public static void B(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        c("Error destroying surface");
    }

    public static void C(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) {
        E(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    public static void D(int i10, int i11, int i12) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        d();
        GLES20.glViewport(0, 0, i11, i12);
        d();
    }

    public static void E(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        c("Error making context current");
        D(i10, i11, i12);
    }

    public static int F() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        d();
        return iArr[0];
    }

    public static long G() {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        d();
        return r0[0];
    }

    public static EGLContext H() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay I() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        e(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        e(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        d();
        return eglGetDisplay;
    }

    public static EGLConfig J(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new a("eglChooseConfig failed.");
    }

    public static float[] K() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean L() {
        return O("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean M() {
        return Build.VERSION.SDK_INT >= 33 && O("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean N(int i10) {
        if (i10 == 6) {
            return M();
        }
        if (i10 == 7) {
            return L();
        }
        return true;
    }

    public static boolean O(String str) {
        String eglQueryString = EGL14.eglQueryString(I(), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean P(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return O("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean Q() {
        return O("EGL_KHR_surfaceless_context");
    }

    public static boolean R() {
        String glGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay I10 = I();
                EGLContext k10 = k(I10);
                o(k10, I10);
                glGetString = GLES20.glGetString(7939);
                A(I10, k10);
            } catch (a unused) {
                return false;
            }
        } else {
            glGetString = GLES20.glGetString(7939);
        }
        return glGetString != null && glGetString.contains("GL_EXT_YUV_target");
    }

    public static void S(int i10, Bitmap bitmap) {
        a(bitmap.getWidth(), bitmap.getHeight());
        b(3553, i10, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        d();
    }

    public static void T(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(int i10, int i11) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        AbstractC4134a.h(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new a("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new a("width or height is greater than GL_MAX_TEXTURE_SIZE " + i12);
        }
    }

    public static void b(int i10, int i11, int i12) {
        GLES20.glBindTexture(i10, i11);
        d();
        GLES20.glTexParameteri(i10, 10240, i12);
        d();
        GLES20.glTexParameteri(i10, 10241, i12);
        d();
        GLES20.glTexParameteri(i10, 10242, 33071);
        d();
        GLES20.glTexParameteri(i10, 10243, 33071);
        d();
    }

    public static void c(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new a(str + ", error code: 0x" + Integer.toHexString(eglGetError));
    }

    public static void d() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    public static void e(boolean z10, String str) {
        if (!z10) {
            throw new a(str);
        }
    }

    public static void f() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        d();
    }

    public static float[] g() {
        float[] fArr = new float[16];
        T(fArr);
        return fArr;
    }

    public static FloatBuffer h(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) h(fArr.length).put(fArr).flip();
    }

    public static EGLContext j(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) {
        boolean z10 = true;
        AbstractC4134a.a(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        AbstractC4134a.a(z10);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, J(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eglCreateContext != null && !eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            d();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new a("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
    }

    public static EGLContext k(EGLDisplay eGLDisplay) {
        return j(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static EGLSurface l(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) {
        int[] iArr;
        int[] iArr2;
        if (i10 == 3 || i10 == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else {
            if (i10 != 7 && i10 != 6) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i10);
            }
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z10) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i10 == 6) {
                if (!M()) {
                    throw new a("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!L()) {
                    throw new a("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, J(eGLDisplay, iArr), obj, iArr2, 0);
        c("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static int m() {
        int F10 = F();
        b(36197, F10, 9729);
        return F10;
    }

    public static int n(int i10) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        d();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        d();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        d();
        return iArr[0];
    }

    public static EGLSurface o(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface q10 = Q() ? EGL14.EGL_NO_SURFACE : q(eGLDisplay, 1, 1, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        C(eGLDisplay, eGLContext, q10, 1, 1);
        return q10;
    }

    public static long p() {
        if (G() < 3) {
            return 0L;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        d();
        GLES20.glFlush();
        d();
        return glFenceSync;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, int i10, int i11, int[] iArr) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, J(eGLDisplay, iArr), new int[]{12375, i10, 12374, i11, 12344}, 0);
        c("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static int r(int i10, int i11, boolean z10) {
        return z10 ? t(i10, i11, 34842, 5131) : t(i10, i11, 6408, 5121);
    }

    public static int s(Bitmap bitmap) {
        int F10 = F();
        S(F10, bitmap);
        return F10;
    }

    public static int t(int i10, int i11, int i12, int i13) {
        a(i10, i11);
        int F10 = F();
        b(3553, F10, 9729);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, null);
        d();
        return F10;
    }

    public static float[] u(List list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void v(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        d();
    }

    public static void w(int i10) {
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        d();
    }

    public static void x(long j10) {
        y(j10);
        d();
    }

    public static void y(long j10) {
        GLES30.glDeleteSync(j10);
    }

    public static void z(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        d();
    }
}
