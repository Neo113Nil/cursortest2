package com.vk.media.player.pool;

import com.vk.core.apps.BuildInfo;
import com.vk.metrics.eventtracking.b;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.VideoFeatures;
import kotlin.time.DurationUnit;
import ru.ok.android.utils.Logger;
import xsna.eoo;
import xsna.fxc0;
import xsna.j100;
import xsna.jft0;
import xsna.o1s0;
import xsna.ru5;
import xsna.wn80;
import xsna.xok;
import xsna.zjq;
import xsna.zno;

/* compiled from: OneVideoPlayerConfigInitializer.kt */
/* loaded from: classes3.dex */
public final class OneVideoPlayerConfigInitializer {
    public static final a a = new a();
    public static final long b;

    /* compiled from: OneVideoPlayerConfigInitializer.kt */
    public static final class OneVideoException extends Exception {
    }

    /* compiled from: OneVideoPlayerConfigInitializer.kt */
    public static final class a implements j100 {
        @Override // xsna.j100
        public final void logError(Exception exc) {
            b.a.a(new OneVideoException(exc));
        }
    }

    static {
        zno.a aVar = zno.c;
        b = eoo.e(2, DurationUnit.HOURS);
    }

    public static void a() {
        boolean z;
        Integer b2;
        Integer b3;
        int i = wn80.a;
        wn80.q = fxc0.B().i().g();
        wn80.a = 50;
        BuildInfo.s();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        b.d i2 = bVar.i(VideoFeatures.WC_HEARTBEAT);
        wn80.b = (i2 == null || (b3 = i2.b()) == null) ? (int) zno.e(b) : b3.intValue();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ALLOCATOR_PARAMS;
        videoFeatures.getClass();
        if (bVar.a(videoFeatures)) {
            o1s0 b4 = d.z.b();
            if (b4 == null) {
                o1s0.c.getClass();
                b4 = o1s0.d;
            }
            int i3 = b4.a;
        }
        zjq.g = a;
        wn80.c = true;
        wn80.e = false;
        VideoFeatures videoFeatures2 = VideoFeatures.FIX_COMPRESSION;
        videoFeatures2.getClass();
        wn80.f = bVar.a(videoFeatures2);
        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_REPORT_VFPO_TO_THIN_EVENTS;
        videoFeatures3.getClass();
        wn80.s = bVar.a(videoFeatures3);
        VideoFeatures videoFeatures4 = VideoFeatures.VIDEO_NEW_CONTROLS;
        videoFeatures4.getClass();
        if (bVar.a(videoFeatures4)) {
            VideoFeatures videoFeatures5 = VideoFeatures.VIDEO_NEW_SEEKBAR;
            videoFeatures5.getClass();
            z = bVar.a(videoFeatures5);
        } else {
            VideoFeatures videoFeatures6 = VideoFeatures.VIDEO_NEW_SEEKBAR;
            videoFeatures6.getClass();
            if (bVar.a(videoFeatures6)) {
                VideoFeatures videoFeatures7 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                videoFeatures7.getClass();
                if (bVar.a(videoFeatures7)) {
                    z = true;
                }
            }
            z = false;
        }
        wn80.r = z;
        b.d i4 = bVar.i(VideoFeatures.VIDEO_FIXED_INITIAL_BANDWIDTH_ESTIMATE);
        wn80.t = i4 != null ? i4.c() : null;
        wn80.h = fxc0.B().J().a();
        wn80.g = !fxc0.B().J().a();
        ru5 b5 = d.u.b();
        if (b5 != null) {
            wn80.i = true;
            wn80.j = b5.a;
            wn80.k = b5.b;
            wn80.l = b5.c;
        }
        xok b6 = d.v.b();
        if (b6 != null) {
            wn80.m = true;
            wn80.n = b6.a;
            Long l = b6.b;
            if (l != null) {
                wn80.o = l.longValue();
            }
            wn80.p = true;
        }
        wn80.d = true;
        Logger.setLoggingEnabled(wn80.q);
        VideoFeatures videoFeatures8 = VideoFeatures.VIDEO_OFFLINE_LOAD_ERROR_HANDLING_POLICY;
        videoFeatures8.getClass();
        wn80.u = bVar.a(videoFeatures8);
        wn80.v = true;
        VideoFeatures videoFeatures9 = VideoFeatures.VIDEO_SEND_EXTENDED_INFO_IN_STATS;
        videoFeatures9.getClass();
        boolean a2 = bVar.a(videoFeatures9);
        wn80.w = a2;
        if (a2) {
            jft0 b7 = d.k.b();
            if (b7 == null) {
                jft0.c.getClass();
                b7 = jft0.d;
            }
            wn80.x = b7.b;
            wn80.y = b7.a;
        }
        VideoFeatures videoFeatures10 = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
        videoFeatures10.getClass();
        bVar.a(videoFeatures10);
        VideoFeatures videoFeatures11 = VideoFeatures.VIDEO_NEW_OFFLINE_CACHE_KEYS;
        videoFeatures11.getClass();
        wn80.z = bVar.a(videoFeatures11);
        b.d j = bVar.j(videoFeatures11.getKey(), false);
        wn80.A = (j == null || (b2 = j.b()) == null || b2.intValue() != 1) ? false : true;
        VideoFeatures videoFeatures12 = VideoFeatures.VIDEO_UPLOAD_CONTENT_LENGTH_SKIP_FIX;
        videoFeatures12.getClass();
        wn80.B = bVar.a(videoFeatures12);
        VideoFeatures videoFeatures13 = VideoFeatures.VIDEO_PTZ_REDESIGN;
        videoFeatures13.getClass();
        wn80.C = bVar.a(videoFeatures13);
    }
}
