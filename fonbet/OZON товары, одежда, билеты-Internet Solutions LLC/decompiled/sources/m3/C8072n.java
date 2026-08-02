package m3;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: m3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8072n {

    /* renamed from: m3.n$a */
    public static final class a extends Exception {
    }

    public static void a(int i11, int i12) throws a {
        GLES20.glBindTexture(i11, i12);
        b();
        GLES20.glTexParameteri(i11, 10240, 9729);
        b();
        GLES20.glTexParameteri(i11, 10241, 9729);
        b();
        GLES20.glTexParameteri(i11, 10242, 33071);
        b();
        GLES20.glTexParameteri(i11, 10243, 33071);
        b();
    }

    public static void b() throws a {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z11 = true;
        }
        if (z11) {
            throw new a(sb2.toString());
        }
    }

    public static void c(String str, boolean z11) throws a {
        if (!z11) {
            throw new a(str);
        }
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static boolean e() throws a {
        return Build.VERSION.SDK_INT >= 33 && g("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean f(int i11) throws a {
        if (i11 == 6) {
            return e();
        }
        if (i11 == 7) {
            return g("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    private static boolean g(String str) throws a {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean h() throws a {
        return g("EGL_EXT_protected_content");
    }

    public static boolean i() throws a {
        return g("EGL_KHR_surfaceless_context");
    }
}
