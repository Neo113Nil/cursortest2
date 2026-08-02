package com.vk.libvideo.autoplay;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.videofile.VideoFilePlaybackDo;
import com.vk.libvideo.models.videofile.VideoTypeDo;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.bpn0;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g620;
import xsna.swe0;
import xsna.t5t0;

/* compiled from: VideoAutoPlayUtil.kt */
/* loaded from: classes2.dex */
public final class j {

    /* compiled from: VideoAutoPlayUtil.kt */
    public static final class a {
    }

    public static boolean a(VideoFile videoFile) {
        Integer t9;
        if (!fkq0.c(videoFile.I0()) || videoFile.o0() == 0 || g620.f().c(videoFile) || videoFile.p0() || videoFile.Sa() || videoFile.getDuration() < TimeUnit.MILLISECONDS.toSeconds(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS)) {
            return false;
        }
        Integer t92 = videoFile.t9();
        return ((t92 == null || t92.intValue() != -1002) && ((t9 = videoFile.t9()) == null || t9.intValue() != -1003)) || !fxc0.B().J().P1() || ((long) videoFile.getDuration()) >= TimeUnit.MINUTES.toSeconds(8L);
    }

    public static long b(VideoFile videoFile) {
        if (!videoFile.q0() && !g620.f().d(videoFile) && a(videoFile)) {
            long millis = TimeUnit.SECONDS.toMillis(videoFile.getDuration());
            bpn0 bpn0Var = t5t0.e;
            Pair<Long, Long> pair = t5t0.a.a().c.get(videoFile.r1());
            long longValue = pair != null ? pair.i().longValue() : 0L;
            if (fxc0.B().J().k0()) {
                return ((long) 1000) + longValue >= millis ? millis : swe0.i(longValue - 5000, 0L, millis);
            }
            Long valueOf = Long.valueOf(longValue);
            if (longValue >= millis) {
                valueOf = null;
            }
            if (valueOf != null) {
                return swe0.i(valueOf.longValue() - 5000, 0L, millis);
            }
        }
        return 0L;
    }

    public static long c(VideoFilePlaybackDo videoFilePlaybackDo) {
        VideoTypeDo videoTypeDo;
        VideoTypeDo videoTypeDo2 = videoFilePlaybackDo.b;
        if (videoTypeDo2 != VideoTypeDo.LIVE && videoTypeDo2 != (videoTypeDo = VideoTypeDo.CLIP) && videoFilePlaybackDo.n != 0 && videoFilePlaybackDo.o != 0 && videoTypeDo2 != videoTypeDo && !videoFilePlaybackDo.t && !videoFilePlaybackDo.h) {
            long j = videoFilePlaybackDo.j;
            if (j >= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                long millis = TimeUnit.SECONDS.toMillis(j);
                bpn0 bpn0Var = t5t0.e;
                Pair<Long, Long> pair = t5t0.a.a().c.get(videoFilePlaybackDo.e);
                long longValue = pair != null ? pair.i().longValue() : 0L;
                if (fxc0.B().J().k0()) {
                    return ((long) 1000) + longValue >= millis ? millis : swe0.i(longValue - 5000, 0L, millis);
                }
                Long valueOf = Long.valueOf(longValue);
                if (longValue >= millis) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    return swe0.i(valueOf.longValue() - 5000, 0L, millis);
                }
            }
        }
        return 0L;
    }
}
