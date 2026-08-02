package io.agora.base.internal.video;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.hardware.display.DisplayManager;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;
import io.agora.base.ColorSpace;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
public class HdrUtil {
    private static final String EGL_EXT_GL_COLORSPACE_DISPLAY_P3 = "EGL_EXT_gl_colorspace_display_p3";
    private static final String EGL_EXT_SURFACE_SMPTE2086_METADATA = "EGL_EXT_surface_SMPTE2086_metadata";
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final int HDR_TRANSFORM_SDR = 1;
    private static final int SDR_TRANSFORM_HDR = 2;
    private static final String TAG = "HdrUtil";
    private static final boolean isScreenSupportHdrVision;

    public enum LumaBitDepth {
        Invalid(0),
        LUMA8BIT(8),
        LUMA10BIT(10);

        private final int depth;

        LumaBitDepth(int i10) {
            this.depth = i10;
        }

        public int depth() {
            return this.depth;
        }
    }

    static {
        isScreenSupportHdrVision = isBt2020PqExtensionSupported() && isScreenSupportHdrVision();
    }

    public static boolean CheckIs10bitTexture(int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        int i14;
        boolean z10;
        boolean z11 = false;
        try {
            iArr = new int[1];
            GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr));
            iArr2 = new int[1];
            GLES20.glGenFramebuffers(1, iArr2, 0);
            i14 = iArr2[0];
            GLES20.glBindFramebuffer(36160, i14);
            int[] iArr3 = new int[1];
            GLES20.glGenRenderbuffers(1, iArr3, 0);
            int i15 = iArr3[0];
            GLES20.glBindRenderbuffer(36161, i15);
            GLES20.glRenderbufferStorage(36161, 33189, i11, i12);
            GLES20.glFramebufferTexture2D(36160, 36064, i13, i10, 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i15);
            z10 = GLES20.glCheckFramebufferStatus(36160) != 36053;
        } catch (Exception e10) {
            e = e10;
        }
        try {
            GLES20.glDeleteRenderbuffers(1, IntBuffer.wrap(iArr2));
            GLES20.glDeleteFramebuffers(1, IntBuffer.allocate(i14));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            return z10;
        } catch (Exception e11) {
            e = e11;
            z11 = z10;
            Logging.e(TAG, e.toString());
            return z11;
        }
    }

    public static boolean getSupportHDR() {
        return isScreenSupportHdrVision;
    }

    public static boolean is10BitLumaDepth(int i10) {
        return i10 == ColorSpace.Transfer.SMPTEST2084.getTransfer() || i10 == ColorSpace.Transfer.ARIB_STD_B67.getTransfer();
    }

    public static boolean isBt2020PqExtensionSupported() {
        boolean z10 = false;
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString != null && eglQueryString.contains(EGL_EXT_GL_COLORSPACE_DISPLAY_P3) && eglQueryString.contains(EXTENSION_COLORSPACE_BT2020_PQ) && eglQueryString.contains(EGL_EXT_SURFACE_SMPTE2086_METADATA)) {
            z10 = true;
        }
        Logging.i(TAG, "supportedBt2020PqExtension: " + z10);
        return z10;
    }

    public static boolean isDirectHdrVision(int i10) {
        return isScreenSupportHdrVision && is10BitLumaDepth(i10);
    }

    public static boolean isDisplayHdrVision(int i10) {
        return isNeedTransToHdrVision(i10) || isDirectHdrVision(i10);
    }

    public static boolean isHDRConfig(boolean z10, int i10) {
        return z10 ? (isDirectHdrVision(i10) && 1 != nativeHdrSdrTransform()) || isNeedTransToHdrVision(i10) : isDirectHdrVision(i10);
    }

    public static boolean isNeedHdrSdrTrans(int i10) {
        return isNeedTransToSdrVision(i10) || isNeedTransToHdrVision(i10);
    }

    public static boolean isNeedTransToHdrVision(int i10) {
        return isScreenSupportHdrVision && !is10BitLumaDepth(i10) && nativeHdrSdrTransform() == 2;
    }

    public static boolean isNeedTransToSdrVision(int i10) {
        if (is10BitLumaDepth(i10)) {
            return !isDisplayHdrVision(i10) || 1 == nativeHdrSdrTransform();
        }
        return false;
    }

    public static boolean isScreenSupportHdrVision() {
        boolean isHdr;
        Context applicationContext = ContextUtils.getApplicationContext();
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (applicationContext == null) {
            return true;
        }
        DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService(ViewProps.DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (i10 >= 26 && display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 1) {
                        break;
                    }
                }
            }
        }
        z10 = false;
        Logging.i(TAG, "supportedDolbyVision: " + z10);
        return z10;
    }

    public static boolean isSupportedEGL3() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || (activityManager = (ActivityManager) applicationContext.getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null || deviceConfigurationInfo.reqGlEsVersion >= 196608;
    }

    public static native byte[] nativeGetLut10Buffer(int i10, boolean z10);

    public static native int nativeHdrSdrTransform();
}
