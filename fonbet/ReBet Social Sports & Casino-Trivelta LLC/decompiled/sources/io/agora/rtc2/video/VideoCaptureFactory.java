package io.agora.rtc2.video;

import android.content.Intent;
import android.os.Build;
import android.util.SparseIntArray;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import io.agora.rtc2.video.VideoCaptureCameraFallbackWrapper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
class VideoCaptureFactory {
    private static final String TAG = "VideoCaptureFactory";
    private static boolean enableCamera2BlackList = true;
    private static final List<String> TEXTURE_EXCEPTION_MODELS = Arrays.asList("LG-H848", "Pixel 4a", "SM-A7000", "MI MAX");
    private static final List<String> TEMPLATETYPE_EXCEPTION_MODELS = Arrays.asList("PRA-AL00X");

    public @interface CAMERA_MODULE_SELECTED {
        public static final int ANDROID_CAMERA1 = 0;
        public static final int ANDROID_CAMERA2 = 1;
        public static final int ANDROID_CAMERA_AUTO = -1;
    }

    public static class ChromiumCameraInfo {
        private static boolean enableCameraCacheNumbers = true;
        private static int sNumberOfSystemCameras = -1;

        public static boolean getCameraCacheNumbers() {
            return enableCameraCacheNumbers;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getNumberOfCameras() {
            if (sNumberOfSystemCameras <= 0 || !enableCameraCacheNumbers) {
                if (ContextUtils.getApplicationContext() == null) {
                    Logging.e(VideoCaptureFactory.TAG, "getNumberOfCameras error, context null");
                    return sNumberOfSystemCameras;
                }
                try {
                    if (VideoCaptureFactory.isLReleaseOrLater()) {
                        sNumberOfSystemCameras = VideoCaptureCamera2.getNumberOfCameras();
                    } else {
                        sNumberOfSystemCameras = VideoCaptureCamera1.getNumberOfCameras();
                    }
                    Logging.i(VideoCaptureFactory.TAG, "getMaxNumberOfCameras: " + sNumberOfSystemCameras);
                } catch (Exception e10) {
                    Logging.e(VideoCaptureFactory.TAG, "getNumberOfCameras Exception: " + e10);
                }
            }
            return sNumberOfSystemCameras;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setCacheCameraNumbers(boolean z10) {
            Logging.w(VideoCaptureFactory.TAG, "setCacheCameraNumbers: " + z10);
            enableCameraCacheNumbers = z10;
        }
    }

    private static void applyDeviceSpecificAdjustments(VideoCaptureParameter videoCaptureParameter) {
        String str = Build.MODEL;
        if (str.toLowerCase().contains("sony")) {
            Logging.i(TAG, "sony equipment, must use old mode.");
            videoCaptureParameter.setPqFirstCaptureMode(0);
        }
        if (TEXTURE_EXCEPTION_MODELS.contains(str)) {
            Logging.w(TAG, "Not support for " + str);
            videoCaptureParameter.setCaptureToTexture(false);
        }
        if (TEMPLATETYPE_EXCEPTION_MODELS.contains(str)) {
            Logging.w(TAG, "templateType use preview, model: " + str);
            videoCaptureParameter.setTemplateType(0);
        }
        if (str.toLowerCase().contains("cph1853") && videoCaptureParameter.getLowCameraSelected() == -1) {
            Logging.i(TAG, "cph1853 use camera2");
            videoCaptureParameter.setLowCameraSelected(1);
        }
    }

    @CalledByNative
    public static IVideoCapture createCameraCapture(int i10, long j10, boolean z10, boolean z11, int i11, boolean z12, int i12, EglBase.Context context, VideoCaptureParameter videoCaptureParameter) {
        String camera2SupportedLevel = getCamera2SupportedLevel(i10);
        String str = Build.MODEL;
        boolean z13 = "RMX3231".equalsIgnoreCase(str) && getDeviceName(i10).contains("front");
        if (z13) {
            Logging.w(TAG, "Not support for " + str);
        }
        videoCaptureParameter.setCaptureToTexture(z10);
        Logging.w(TAG, "createVideoCapture() " + i10 + ", captureToTexture: " + videoCaptureParameter.captureToTexture + ", camera_selected: " + videoCaptureParameter.lowCameraSelected + ", camera_selected_level: " + videoCaptureParameter.hardwareLevelSelected + ", enableTextureCopy: " + z11 + ", captureTextureBufferCount: " + i11 + ", pqFirst: " + z12 + ", templateType: " + videoCaptureParameter.templateType + ", noiseReduction: " + videoCaptureParameter.noiseReduce + ", autoFaceDetect: " + videoCaptureParameter.faceFocusing + ", extraSurface: " + videoCaptureParameter.extraSurface + ", autoWhiteBalance: " + videoCaptureParameter.autoWhiteBalance + ", hardware level: " + camera2SupportedLevel + " focalLengthType: " + videoCaptureParameter.focalLengthType + " physicalId: " + videoCaptureParameter.physicalId + " pqFirstCaptureMode: " + videoCaptureParameter.pqFirstCaptureMode + " pqFirstDiff: " + videoCaptureParameter.pqFirstDiff + " cameraTimeout: " + videoCaptureParameter.cameraTimeout + " customMinFps: " + videoCaptureParameter.customMinFps + " customMaxFps: " + videoCaptureParameter.customMaxFps + " enableTargetFps: " + videoCaptureParameter.enableTargetFps + " customStrictMode: " + videoCaptureParameter.customStrictMode + " lowFpsLimit: " + videoCaptureParameter.lowFpsLimit);
        applyDeviceSpecificAdjustments(videoCaptureParameter);
        return (videoCaptureParameter.lowCameraSelected == 0 || isLessSelectedLevel(i10, videoCaptureParameter.hardwareLevelSelected) || (-1 == videoCaptureParameter.lowCameraSelected && -1 == videoCaptureParameter.hardwareLevelSelected && (isLegacyOrDeprecatedDevice(i10) || z13))) ? new VideoCaptureCamera1(i10, j10, videoCaptureParameter.captureToTexture, z11, i11, z12, i12, context, videoCaptureParameter.templateType, videoCaptureParameter) : createFallbackWrapper(new VideoCaptureCamera2(i10, j10, videoCaptureParameter.captureToTexture, z11, i11, z12, i12, context, videoCaptureParameter.templateType, videoCaptureParameter), i10, j10, z11, i11, z12, i12, context, videoCaptureParameter);
    }

    public static IVideoCaptureCamera createFallbackWrapper(IVideoCaptureCamera iVideoCaptureCamera, final int i10, final long j10, final boolean z10, final int i11, final boolean z11, final int i12, final EglBase.Context context, final VideoCaptureParameter videoCaptureParameter) {
        return new VideoCaptureCameraFallbackWrapper(iVideoCaptureCamera, new VideoCaptureCameraFallbackWrapper.OnCameraFallbackListener() { // from class: io.agora.rtc2.video.VideoCaptureFactory.1
            @Override // io.agora.rtc2.video.VideoCaptureCameraFallbackWrapper.OnCameraFallbackListener
            public IVideoCaptureCamera createFallbackCamera() {
                VideoCaptureParameter.this.setPhysicalId(-1);
                int i13 = i10;
                long j11 = j10;
                VideoCaptureParameter videoCaptureParameter2 = VideoCaptureParameter.this;
                return new VideoCaptureCamera1(i13, j11, videoCaptureParameter2.captureToTexture, z10, i11, z11, i12, context, videoCaptureParameter2.templateType, videoCaptureParameter2);
            }
        });
    }

    @CalledByNative
    public static VideoCapture createScreenCapture(long j10, EglBase.Context context, Intent intent) {
        return new VideoCaptureScreen(j10, context, intent);
    }

    @CalledByNative
    public static void enableCamera2BlackList(boolean z10) {
        enableCamera2BlackList = z10;
        Logging.w(TAG, "enableCamera2BlackList: " + z10);
    }

    @CalledByNative
    public static void enableCameraCaptureRequestActiveDetect(boolean z10) {
        VideoCaptureCamera.enableCameraCaptureRequestActiveDetect(z10);
        Logging.w(TAG, "enableCameraCaptureRequestActiveDetect: " + z10);
    }

    @CalledByNative
    public static String getCamera2SupportedLevel(int i10) {
        if (isLegacyOrDeprecatedDevice(i10)) {
            return "legacy";
        }
        int camera2SupportedLevel = VideoCaptureCamera2.getCamera2SupportedLevel(i10);
        return camera2SupportedLevel == 0 ? "limited" : camera2SupportedLevel == 1 ? "full" : camera2SupportedLevel == 3 ? "level_3" : camera2SupportedLevel == 4 ? "external" : "legacy";
    }

    @CalledByNative
    public static int getCaptureApiType(int i10) {
        return isLegacyOrDeprecatedDevice(i10) ? VideoCaptureCamera1.getCaptureApiType(i10) : VideoCaptureCamera2.getCaptureApiType(i10);
    }

    @CalledByNative
    public static String getDeviceId(int i10) {
        return isLegacyOrDeprecatedDevice(i10) ? VideoCaptureCamera1.getDeviceId(i10) : VideoCaptureCamera2.getDeviceId(i10);
    }

    @CalledByNative
    public static String getDeviceName(int i10) {
        return isLegacyOrDeprecatedDevice(i10) ? VideoCaptureCamera1.getName(i10) : VideoCaptureCamera2.getName(i10);
    }

    @CalledByNative
    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i10) {
        return isLegacyOrDeprecatedDevice(i10) ? VideoCaptureCamera1.getDeviceSupportedFormats(i10) : VideoCaptureCamera2.getDeviceSupportedFormats(i10);
    }

    @CalledByNative
    public static int getFacingMode(int i10) {
        return isLegacyOrDeprecatedDevice(i10) ? VideoCaptureCamera1.getFacingMode(i10) : VideoCaptureCamera2.getFacingMode(i10);
    }

    @CalledByNative
    public static int getNumberOfCameras() {
        return ChromiumCameraInfo.getNumberOfCameras();
    }

    public static boolean isInCamera2BlackList() {
        if (!enableCamera2BlackList) {
            return false;
        }
        String str = Build.DEVICE;
        if ("ocean".equalsIgnoreCase(str) && "oe106".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("trident".equalsIgnoreCase(str) && "de106".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if (("shark".equalsIgnoreCase(str) && "skr-a0".equalsIgnoreCase(Build.MODEL)) || "hnnem-h".equalsIgnoreCase(str)) {
            return true;
        }
        if ((!"on7xelte".equals(str) || !"SM-G610F".equals(Build.MODEL)) && !"m2c".equals(str)) {
            String str2 = Build.MODEL;
            if (!"M578CA".equals(str2)) {
                String str3 = Build.MANUFACTURER;
                return ("samsung".equalsIgnoreCase(str3) && str2 != null && (str2.contains("SM-G930") || str2.contains("SM-G935") || str2.contains("SM-G950") || str2.contains("SM-G955") || "SC-02H".equals(str2) || "SCV33".equals(str2) || "SC-02J".equals(str2) || "SCV36".equals(str2) || "SM-G892A".equals(str2) || "SM-G892U".equals(str2) || "SC-03J".equals(str2) || "SCV35".equals(str2))) || "oneplus".equalsIgnoreCase(str3) || "PCAM00".equalsIgnoreCase(str2) || "h8296".equalsIgnoreCase(str2);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLReleaseOrLater() {
        return true;
    }

    @CalledByNative
    public static boolean isLegacyOrDeprecatedDevice(int i10) {
        return !isLReleaseOrLater() || VideoCaptureCamera2.isLegacyDevice(i10) || isInCamera2BlackList();
    }

    public static boolean isLessSelectedLevel(int i10, int i11) {
        if (-1 == i11) {
            return false;
        }
        int camera2SupportedLevel = VideoCaptureCamera2.getCamera2SupportedLevel(i10);
        if (camera2SupportedLevel == Integer.MIN_VALUE) {
            return true;
        }
        SparseIntArray sparseIntArray = VideoCaptureCamera2.ANDROID_CAMERA_HARDWARE_LEVEL_MAP;
        return sparseIntArray.get(camera2SupportedLevel) <= sparseIntArray.get(i11, 1);
    }

    @CalledByNative
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability(int i10, boolean z10) {
        return (!isLReleaseOrLater() || isInCamera2BlackList() || i10 == 0) ? VideoCaptureCamera1.queryCameraFocalLengthCapability() : VideoCaptureCamera2.queryCameraFocalLengthCapability(z10);
    }

    @CalledByNative
    public static void setCacheCameraNumbers(boolean z10) {
        ChromiumCameraInfo.setCacheCameraNumbers(z10);
    }

    @CalledByNative
    public static void setCameraSkipCaptureHeight(int i10) {
        VideoCaptureCamera.setCameraSkipCapturHeight(i10);
    }

    @CalledByNative
    public static void setCameraSkipCaptureWidth(int i10) {
        VideoCaptureCamera.setCameraSkipCaptureWidth(i10);
    }
}
