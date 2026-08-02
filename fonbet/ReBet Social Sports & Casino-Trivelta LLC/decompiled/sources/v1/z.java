package v1;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.a;
import java.util.List;
import v1.AbstractC6610O;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f67001a;

    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            w.a();
            int c10 = c(supportedPerformancePoints, v.a(i10, i11, (int) d10));
            if (c10 == 1 && z.f67001a == null) {
                Boolean unused = z.f67001a = Boolean.valueOf(d());
                if (z.f67001a.booleanValue()) {
                    return 0;
                }
            }
            return c10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            r2 = r2.getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int b(boolean z10) {
            List supportedPerformancePoints;
            try {
                androidx.media3.common.a P10 = new a.b().y0("video/avc").P();
                if (P10.f20543o != null) {
                    List n10 = AbstractC6610O.n(InterfaceC6600E.f66903a, P10, z10, false);
                    for (int i10 = 0; i10 < n10.size(); i10++) {
                        if (((t) n10.get(i10)).f66989d != null && (r2 = ((t) n10.get(i10)).f66989d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                            w.a();
                            return c(supportedPerformancePoints, v.a(1280, 720, 60));
                        }
                    }
                }
            } catch (AbstractC6610O.c unused) {
            }
            return 0;
        }

        public static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i10 = 0; i10 < list.size(); i10++) {
                covers = x.a(list.get(i10)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        public static boolean d() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int b10 = b(false);
            int b11 = b(true);
            if (b10 == 0) {
                return true;
            }
            return b11 == 0 ? b10 != 2 : (b10 == 2 && b11 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f67001a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
