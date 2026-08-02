package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import java.util.List;
import xsna.g32;
import xsna.h32;
import xsna.hq10;
import xsna.io20;
import xsna.sl;

/* compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* loaded from: classes12.dex */
public final class d {
    public static Boolean a;

    /* compiled from: MediaCodecPerformancePointCoverageProvider.java */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            r2 = r2.getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int a(boolean z) {
            List supportedPerformancePoints;
            boolean covers;
            try {
                a.C0043a c0043a = new a.C0043a();
                c0043a.m = io20.q("video/avc");
                androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                String str = aVar.n;
                if (str != null) {
                    List<hq10> e = MediaCodecUtil.e(str, z, false);
                    String c = MediaCodecUtil.c(aVar);
                    Iterable e2 = c == null ? g.f : MediaCodecUtil.e(c, z, false);
                    ImmutableList.a aVar2 = new ImmutableList.a();
                    aVar2.e(e);
                    aVar2.e(e2);
                    g g = aVar2.g();
                    for (int i = 0; i < g.e; i++) {
                        if (((hq10) g.get(i)).d != null && (r2 = ((hq10) g.get(i)).d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                            h32.d();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint d = g32.d();
                            for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                                covers = sl.b(supportedPerformancePoints.get(i2)).covers(d);
                                if (covers) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }
}
