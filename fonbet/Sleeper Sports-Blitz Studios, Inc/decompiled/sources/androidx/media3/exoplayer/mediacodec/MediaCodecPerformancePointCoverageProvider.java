package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticApiModelOutline0;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.List;

/* loaded from: classes5.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    private static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m9799m();
            int evaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m(i, i2, (int) d));
            if (evaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return evaluatePerformancePointCoverage;
        }

        private static boolean shouldIgnorePerformancePoints() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int evaluateH264RequiredSupport = evaluateH264RequiredSupport(false);
            int evaluateH264RequiredSupport2 = evaluateH264RequiredSupport(true);
            if (evaluateH264RequiredSupport == 0) {
                return true;
            }
            return evaluateH264RequiredSupport2 == 0 ? evaluateH264RequiredSupport != 2 : (evaluateH264RequiredSupport == 2 && evaluateH264RequiredSupport2 == 2) ? false : true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            r2 = r2.getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int evaluateH264RequiredSupport(boolean z) {
            List supportedPerformancePoints;
            try {
                Format build = new Format.Builder().setSampleMimeType(MimeTypes.VIDEO_H264).build();
                if (build.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, build, z, false);
                    for (int i = 0; i < decoderInfosSoftMatch.size(); i++) {
                        if (decoderInfosSoftMatch.get(i).capabilities != null && (r2 = decoderInfosSoftMatch.get(i).capabilities.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                            DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m9799m();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i = 0; i < list.size(); i++) {
                covers = DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m9789m((Object) list.get(i)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }
    }
}
