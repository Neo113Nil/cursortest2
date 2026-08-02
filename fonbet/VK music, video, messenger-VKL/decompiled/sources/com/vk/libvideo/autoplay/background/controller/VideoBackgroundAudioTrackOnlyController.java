package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.background.controller.c;
import com.vk.libvideo.autoplay.background.controller.d;
import com.vk.libvideo.autoplay.background.controller.j;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.VideoFeatures;
import java.util.Set;
import one.video.player.OneVideoPlayer;
import xsna.asp;
import xsna.c63;
import xsna.d3b0;
import xsna.etu;
import xsna.izi0;
import xsna.n44;
import xsna.pa;
import xsna.q4s0;
import xsna.yg5;
import xsna.zrp;

/* compiled from: VideoBackgroundAudioTrackOnlyController.kt */
/* loaded from: classes2.dex */
public final class VideoBackgroundAudioTrackOnlyController extends c63.b implements c.a, j {
    public final pa b;
    public final q4s0 c;
    public final d d;
    public final Set<ReasonForVideo> e;
    public final Handler f;
    public final n44 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoBackgroundAudioTrackOnlyController.kt */
    public static final class ReasonForVideo {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReasonForVideo[] $VALUES;
        public static final ReasonForVideo FOREGROUND;
        public static final ReasonForVideo PIP;

        static {
            ReasonForVideo reasonForVideo = new ReasonForVideo("PIP", 0);
            PIP = reasonForVideo;
            ReasonForVideo reasonForVideo2 = new ReasonForVideo("FOREGROUND", 1);
            FOREGROUND = reasonForVideo2;
            ReasonForVideo[] reasonForVideoArr = {reasonForVideo, reasonForVideo2};
            $VALUES = reasonForVideoArr;
            $ENTRIES = new asp(reasonForVideoArr);
        }

        public ReasonForVideo() {
            throw null;
        }

        public static ReasonForVideo valueOf(String str) {
            return (ReasonForVideo) Enum.valueOf(ReasonForVideo.class, str);
        }

        public static ReasonForVideo[] values() {
            return (ReasonForVideo[]) $VALUES.clone();
        }
    }

    public VideoBackgroundAudioTrackOnlyController(pa paVar, d dVar) {
        q4s0 q4s0Var = q4s0.a;
        this.b = paVar;
        this.c = q4s0Var;
        this.d = dVar;
        this.e = izi0.i(ReasonForVideo.FOREGROUND);
        this.f = new Handler(Looper.getMainLooper());
        this.g = new n44(this, 9);
    }

    public final void D(ReasonForVideo reasonForVideo) {
        d3b0 d3b0Var;
        OneVideoPlayer a;
        Set<ReasonForVideo> set = this.e;
        boolean isEmpty = set.isEmpty();
        set.add(reasonForVideo);
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.v, new Object[]{"VideoBackgroundAudioTrackOnly reasonAdded=" + reasonForVideo + " reasonsForVideo=" + set});
        }
        if (set.isEmpty() || !isEmpty) {
            return;
        }
        VideoFeatures videoFeatures = VideoFeatures.STOP_VIDEO_IF_BACKGROUND;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            this.f.removeCallbacks(this.g);
            yg5 b = this.b.b();
            VideoAutoPlay videoAutoPlay = b instanceof VideoAutoPlay ? (VideoAutoPlay) b : null;
            if (videoAutoPlay == null || (d3b0Var = videoAutoPlay.p0) == null || (a = d3b0Var.a()) == null) {
                return;
            }
            videoAutoPlay.N1(a);
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.i, new Object[]{"VideoBackgroundAudioTrackOnly videoTrack enabled for " + a.N()});
        }
    }

    public final void E(ReasonForVideo reasonForVideo) {
        Set<ReasonForVideo> set = this.e;
        boolean isEmpty = set.isEmpty();
        set.remove(reasonForVideo);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.v, new Object[]{"VideoBackgroundAudioTrackOnly reasonRemoved=" + reasonForVideo + " reasonsForVideo=" + set});
        }
        if (!set.isEmpty() || isEmpty) {
            return;
        }
        VideoFeatures videoFeatures = VideoFeatures.STOP_VIDEO_IF_BACKGROUND;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            Handler handler = this.f;
            n44 n44Var = this.g;
            handler.removeCallbacks(n44Var);
            handler.postDelayed(n44Var, 5000L);
        }
    }

    @Override // com.vk.libvideo.autoplay.background.controller.c.a
    public final void f() {
        D(ReasonForVideo.PIP);
    }

    @Override // com.vk.libvideo.autoplay.background.controller.c.a
    public final void g() {
        E(ReasonForVideo.PIP);
    }

    @Override // com.vk.libvideo.autoplay.background.controller.j
    public final boolean k(j.a aVar) {
        boolean isEmpty;
        VideoFeatures videoFeatures = VideoFeatures.STOP_VIDEO_IF_BACKGROUND;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (isEmpty = this.e.isEmpty()) && !etu.a(this.f, this.g) && isEmpty) {
            if (this.d.a(new d.a(aVar.b, aVar.c, aVar.d, aVar.e, aVar.i, aVar.f, aVar.g)) && ((aVar.h || aVar.j == OneVideoPlayer.State.PLAYING) && !aVar.a && this.c.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.c63.b
    public final void q(Activity activity, boolean z) {
        if (activity.isInPictureInPictureMode()) {
            D(ReasonForVideo.PIP);
        }
    }

    @Override // xsna.c63.b
    public final void r(Activity activity, boolean z) {
        if (activity.isInPictureInPictureMode()) {
            E(ReasonForVideo.PIP);
        }
    }

    @Override // xsna.c63.b
    public final void u() {
        E(ReasonForVideo.FOREGROUND);
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        D(ReasonForVideo.FOREGROUND);
    }
}
