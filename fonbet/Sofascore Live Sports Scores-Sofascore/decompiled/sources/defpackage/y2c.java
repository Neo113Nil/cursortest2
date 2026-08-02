package defpackage;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y2c {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        by1.j();
        MediaCodecInfo.VideoCapabilities.PerformancePoint d2 = by1.d(i, i2, (int) d);
        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
            if (sw9.f(supportedPerformancePoints.get(i3)).covers(d2)) {
                return 2;
            }
        }
        return 1;
    }
}
