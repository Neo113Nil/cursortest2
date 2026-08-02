package com.vk.video.ui.discovery.minimizable.player;

import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.bpn0;
import xsna.e5o;
import xsna.epx;
import xsna.hnt0;
import xsna.je0;
import xsna.nyk0;
import xsna.qh0;
import xsna.rcx;
import xsna.x2s0;
import xsna.ye0;
import xsna.yg5;

/* compiled from: VideoPlayerStateProvider.kt */
/* loaded from: classes7.dex */
public final class a implements hnt0, rcx.b {
    public final com.vk.video.ui.discovery.minimizable.player.controllers.b b;
    public final boolean c;
    public final b d = new b();
    public final C1993a e = new C1993a();
    public final bpn0 f = new bpn0(new nyk0(4));
    public VideoPlayerState g = new VideoPlayerState(new VideoPlayerStatus.Paused(false, 1, null), new VideoPlayerProgress.Vod(0, 0), null, null, 12, null);
    public c h;

    /* compiled from: VideoPlayerStateProvider.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.player.a$a, reason: collision with other inner class name */
    public final class C1993a implements rcx.b {
        public C1993a() {
        }

        @Override // xsna.rcx.b
        public final void b(rcx.c cVar) {
            a.this.c(new c.C1994a(cVar));
        }
    }

    /* compiled from: VideoPlayerStateProvider.kt */
    public interface c {

        /* compiled from: VideoPlayerStateProvider.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.player.a$c$a, reason: collision with other inner class name */
        public static final class C1994a implements c {
            public final rcx.c a;

            public C1994a(rcx.c cVar) {
                this.a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1994a) && epx.f(this.a, ((C1994a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Interactive(interactiveViewState=" + this.a + ')';
            }
        }

        /* compiled from: VideoPlayerStateProvider.kt */
        public static final class b implements c {
            public final yg5 a;

            public b(yg5 yg5Var) {
                this.a = yg5Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Linear(autoPlay=" + this.a + ')';
            }
        }
    }

    public a(com.vk.video.ui.discovery.minimizable.player.controllers.b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        this.d.T0(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        this.d.V3(yg5Var);
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        this.d.X1(videoAutoPlay, j, j2);
    }

    @Override // xsna.rcx.b
    public final void b(rcx.c cVar) {
        this.e.b(cVar);
    }

    public final void c(c cVar) {
        this.h = cVar;
        d();
    }

    public final void d() {
        VideoPlayerProgress vod;
        c cVar = this.h;
        boolean z = cVar instanceof c.b;
        com.vk.video.ui.discovery.minimizable.player.controllers.b bVar = this.b;
        if (!z) {
            if (!(cVar instanceof c.C1994a)) {
                if (cVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.g = new VideoPlayerState(new VideoPlayerStatus.Paused(false, 1, null), new VideoPlayerProgress.Vod(0L, 0L), null, null, 12, null);
                return;
            }
            rcx.c cVar2 = ((c.C1994a) cVar).a;
            rcx.a aVar = cVar2.c;
            VideoPlayerStatus paused = aVar instanceof rcx.a.b ? VideoPlayerStatus.Loading.b : aVar instanceof rcx.a.d ? VideoPlayerStatus.Playing.b : aVar instanceof rcx.a.c ? new VideoPlayerStatus.Paused(false, 1, null) : aVar instanceof rcx.a.C3604a ? new VideoPlayerStatus.Paused(false, 1, null) : new VideoPlayerStatus.Paused(false, 1, null);
            if (epx.f(paused, this.g.b)) {
                return;
            }
            VideoPlayerState a = VideoPlayerState.a(this.g, paused, VideoPlayerProgress.Empty.b, new VideoPlayerStatInfo(cVar2.d, cVar2.e), null, 8);
            this.g = a;
            bVar.invoke(a);
            return;
        }
        yg5 yg5Var = ((c.b) cVar).a;
        VideoPlayerStatus adPaused = yg5Var.w0() ? VideoPlayerStatus.AdPlaying.b : yg5Var.P0() ? new VideoPlayerStatus.AdPaused(yg5Var.M()) : yg5Var.B() ? VideoPlayerStatus.Restricted.b : (e5o.a(yg5Var.A()) && this.c) ? new VideoPlayerStatus.Paused(false, 1, null) : yg5Var.J() ? VideoPlayerStatus.Error.b : yg5Var.d() ? VideoPlayerStatus.Loading.b : yg5Var.isPlaying() ? VideoPlayerStatus.Playing.b : yg5Var.a() ? VideoPlayerStatus.Completed.b : (yg5Var.M() || yg5Var.isPaused()) ? new VideoPlayerStatus.Paused(yg5Var.M()) : new VideoPlayerStatus.Paused(false, 1, null);
        if (yg5Var.P0()) {
            AdProgressState adProgressState = this.g.e;
            vod = adProgressState != null ? new VideoPlayerProgress.Ad(adProgressState.b, adProgressState.c) : new VideoPlayerProgress.Ad(yg5Var.getPosition(), yg5Var.getDuration());
        } else {
            vod = yg5Var.v() ? VideoPlayerProgress.Empty.b : new VideoPlayerProgress.Vod(TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(yg5Var.getPosition())), yg5Var.getDuration());
        }
        VideoPlayerProgress videoPlayerProgress = vod;
        VideoPlayerState videoPlayerState = this.g;
        VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
        VideoPlayerState a2 = VideoPlayerState.a(videoPlayerState, adPaused, videoPlayerProgress, new VideoPlayerStatInfo(videoAutoPlay != null ? videoAutoPlay.K : null, yg5Var.A().a1()), null, 8);
        if (epx.f(this.g, a2)) {
            return;
        }
        this.g = a2;
        bVar.invoke(a2);
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        this.d.h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void j() {
        this.d.j();
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        this.d.m(je0Var, aVar);
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        this.d.m4(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        this.d.r1(yg5Var);
    }

    /* compiled from: VideoPlayerStateProvider.kt */
    public final class b implements hnt0 {
        public b() {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            h3(yg5Var, i, i2);
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
            a.this.d();
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            a.this.d();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
        @Override // xsna.hnt0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            VideoPlayerProgress vod;
            VideoPlayerProgress videoPlayerProgress;
            VideoPlayerProgress videoPlayerProgress2;
            boolean P0 = videoAutoPlay.P0();
            a aVar = a.this;
            if (P0) {
                AdProgressState adProgressState = aVar.g.e;
                if (adProgressState != null) {
                    videoPlayerProgress = new VideoPlayerProgress.Ad(adProgressState.b, adProgressState.c);
                    videoPlayerProgress2 = videoPlayerProgress;
                    if (epx.f(videoPlayerProgress2, aVar.g.c)) {
                        VideoPlayerState a = VideoPlayerState.a(aVar.g, null, videoPlayerProgress2, null, null, 13);
                        aVar.g = a;
                        aVar.b.invoke(a);
                        return;
                    }
                    return;
                }
                vod = new VideoPlayerProgress.Ad(j, j2);
            } else {
                vod = videoAutoPlay.v() ? VideoPlayerProgress.Empty.b : new VideoPlayerProgress.Vod(TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)), j2);
            }
            videoPlayerProgress = vod;
            videoPlayerProgress2 = videoPlayerProgress;
            if (epx.f(videoPlayerProgress2, aVar.g.c)) {
            }
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            a.this.d();
        }

        @Override // xsna.hnt0
        public final void j() {
            a aVar = a.this;
            aVar.d();
            if (((Boolean) aVar.f.getValue()).booleanValue()) {
                VideoPlayerState videoPlayerState = aVar.g;
                if (videoPlayerState.e != null) {
                    VideoPlayerState a = VideoPlayerState.a(videoPlayerState, null, null, null, null, 7);
                    aVar.g = a;
                    aVar.b.invoke(a);
                }
            }
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            AdProgressState adProgressState;
            a aVar2 = a.this;
            aVar2.d();
            if (((Boolean) aVar2.f.getValue()).booleanValue()) {
                if (aVar instanceof a.AbstractC1195a.C1196a) {
                    throw null;
                }
                if (aVar instanceof a.AbstractC1195a.b) {
                    a.AbstractC1195a.b bVar = (a.AbstractC1195a.b) aVar;
                    long j = (long) bVar.d.e;
                    qh0 qh0Var = bVar.e;
                    adProgressState = new AdProgressState(qh0Var != null ? (long) qh0Var.a : 0L, j);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    adProgressState = null;
                }
                if (adProgressState == null || epx.f(aVar2.g.e, adProgressState)) {
                    return;
                }
                VideoPlayerState a = VideoPlayerState.a(aVar2.g, null, new VideoPlayerProgress.Ad(adProgressState.b, adProgressState.c), null, adProgressState, 5);
                aVar2.g = a;
                aVar2.b.invoke(a);
            }
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            a.this.d();
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            a.this.d();
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }
    }

    @Override // xsna.hnt0
    public final void E() {
    }

    @Override // xsna.hnt0
    public final void c2() {
    }

    @Override // xsna.hnt0
    public final void h() {
    }

    @Override // xsna.hnt0
    public final void t2() {
    }

    @Override // xsna.hnt0
    public final void u() {
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
    }

    @Override // xsna.hnt0
    public final void a(boolean z) {
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void j4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
    }

    @Override // xsna.hnt0
    public final void x0(boolean z) {
    }

    @Override // xsna.hnt0
    public final void H(long j, long j2) {
    }

    @Override // xsna.hnt0
    public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
    }

    @Override // xsna.hnt0
    public final void N3(VideoAutoPlay videoAutoPlay, long j) {
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
    }

    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
    }

    @Override // xsna.hnt0
    public final void z0(VideoAutoPlay videoAutoPlay, int i) {
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
    }
}
