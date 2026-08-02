package io.agora.base.internal.video;

import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;

/* loaded from: classes2.dex */
public class VideoRenderUtils {
    private static final String TAG = "VideoRenderUtils";

    public static class ColorSpaceNamed {
        public static final int BT2020 = 5;
        public static final int BT709 = 4;
        public static final int DCI_P3 = 6;
        public static final int DISPLAY_P3 = 7;
        public static final int SRGB = 0;
    }

    public static class HDRType {
        public static final int HDR_TYPE_DOLBY_VISION = 1;
        public static final int HDR_TYPE_HDR10 = 2;
        public static final int HDR_TYPE_HDR10_PLUS = 4;
        public static final int HDR_TYPE_HLG = 3;
    }

    @CalledByNative
    public static boolean IsSupportHDRRender() {
        return HdrUtil.getSupportHDR();
    }

    public static float getDesiredMaxAverageLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxAverageLuminance = hdrCapabilities.getDesiredMaxAverageLuminance();
        Logging.i(TAG, "hdrcap:average luma:" + desiredMaxAverageLuminance);
        return desiredMaxAverageLuminance;
    }

    public static float getDesiredMaxLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMaxLuminance = hdrCapabilities.getDesiredMaxLuminance();
        Logging.i(TAG, "hdrcap:max luma:" + desiredMaxLuminance);
        return desiredMaxLuminance;
    }

    public static float getDesiredMinLuminance() {
        WindowManager windowManager;
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null || (hdrCapabilities = defaultDisplay.getHdrCapabilities()) == null) {
            return -1.0f;
        }
        float desiredMinLuminance = hdrCapabilities.getDesiredMinLuminance();
        Logging.i(TAG, "hdrcap:min luma:" + desiredMinLuminance);
        return desiredMinLuminance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r0 = r0.getPreferredWideGamutColorSpace();
     */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getPreferredWideGamutColorSpaceId() {
        WindowManager windowManager;
        ColorSpace preferredWideGamutColorSpace;
        int id2;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (Build.VERSION.SDK_INT < 29 || applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (r0 = windowManager.getDefaultDisplay()) == null || preferredWideGamutColorSpace == null) {
            return -1;
        }
        id2 = preferredWideGamutColorSpace.getId();
        Logging.i(TAG, "hdrcap:color space id:" + id2);
        return id2;
    }

    @CalledByNative
    public static boolean isSupportedHDRByType(int i10) {
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        WindowManager windowManager;
        Display defaultDisplay2;
        boolean isHdr;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26 && (windowManager = (WindowManager) applicationContext.getSystemService("window")) != null && (defaultDisplay2 = windowManager.getDefaultDisplay()) != null) {
            isHdr = defaultDisplay2.isHdr();
            if (!isHdr) {
                Logging.i(TAG, "hdrcap:ishdr:false");
                return false;
            }
        }
        WindowManager windowManager2 = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager2 != null && (defaultDisplay = windowManager2.getDefaultDisplay()) != null && (hdrCapabilities = defaultDisplay.getHdrCapabilities()) != null) {
            for (int i11 = 0; i11 < hdrCapabilities.getSupportedHdrTypes().length; i11++) {
                Logging.i(TAG, "hdrcap:" + hdrCapabilities.getSupportedHdrTypes()[i11]);
                if (hdrCapabilities.getSupportedHdrTypes()[i11] == i10) {
                    Logging.i(TAG, "hdrcap: got:" + hdrCapabilities.getSupportedHdrTypes()[i11]);
                    return true;
                }
            }
        }
        return false;
    }

    @CalledByNative
    public static boolean isWideColorGamut() {
        WindowManager windowManager;
        Display defaultDisplay;
        boolean isWideColorGamut;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (Build.VERSION.SDK_INT < 26 || applicationContext == null || (windowManager = (WindowManager) applicationContext.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return false;
        }
        isWideColorGamut = defaultDisplay.isWideColorGamut();
        Logging.i(TAG, "hdrcap:is wide:" + isWideColorGamut);
        return isWideColorGamut;
    }
}
