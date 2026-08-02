package com.vk.libvideo.autoplay;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.awp;
import xsna.bj80;
import xsna.d3b0;
import xsna.gpt0;
import xsna.ieq;
import xsna.m7q;
import xsna.mv70;
import xsna.nza0;
import xsna.o1b0;
import xsna.oyk0;
import xsna.qu5;
import xsna.sht0;
import xsna.un80;
import xsna.yft0;
import xsna.zva0;

/* compiled from: VideoAutoPlay.kt */
/* loaded from: classes2.dex */
public final class h {
    public final /* synthetic */ VideoAutoPlay a;

    public h(VideoAutoPlay videoAutoPlay) {
        this.a = videoAutoPlay;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yft0.b bVar) {
        boolean z;
        OneVideoPlayer a;
        d3b0 d3b0Var;
        nza0 h;
        OneVideoPlayer a2;
        OneVideoPlaybackException oneVideoPlaybackException = bVar.a;
        ieq ieqVar = bVar.c;
        VideoAutoPlay videoAutoPlay = this.a;
        if (ieqVar != null) {
            if (ieqVar instanceof ieq.a) {
                videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.STOP);
                d3b0 d3b0Var2 = videoAutoPlay.p0;
                boolean z2 = (d3b0Var2 == null || (a = d3b0Var2.a()) == null || !a.f0()) ? false : true;
                sht0 sht0Var = videoAutoPlay.l0;
                if (sht0Var != null) {
                    o1b0 c = qu5.c();
                    o1b0.a aVar = o1b0.a;
                    c.f(sht0Var, true);
                }
                if (z2) {
                    videoAutoPlay.v1(false);
                } else {
                    m7q m7qVar = videoAutoPlay.k0;
                    videoAutoPlay.G0(m7qVar != null && m7qVar.q);
                }
            } else {
                if (!(ieqVar instanceof ieq.b)) {
                    if (!(ieqVar instanceof ieq.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.STOP);
                    ieq.c cVar = (ieq.c) ieqVar;
                    OneVideoPlaybackException oneVideoPlaybackException2 = cVar.a;
                    L.i(oneVideoPlaybackException2);
                    OneVideoPlaybackException.ErrorCode d = oneVideoPlaybackException2.d();
                    videoAutoPlay.D = d;
                    videoAutoPlay.E = oneVideoPlaybackException2;
                    zva0 p = gpt0.p(d, videoAutoPlay.l0 instanceof mv70);
                    videoAutoPlay.y.J3(videoAutoPlay, p.a, p.b, videoAutoPlay.D, cVar.a);
                    videoAutoPlay.k1();
                    videoAutoPlay.H1();
                    z = true;
                    if (videoAutoPlay.o && (d3b0Var = videoAutoPlay.p0) != null && d3b0Var.a() != null && (h = d3b0Var.h()) != null) {
                        a2 = d3b0Var.a();
                        bj80 bj80Var = h.g;
                        if (a2 != null && oneVideoPlaybackException != null) {
                            if (z) {
                                oyk0.a aVar2 = bj80Var.g;
                                if (aVar2 != null) {
                                    aVar2.a(oneVideoPlaybackException, a2, new awp(false));
                                }
                            } else {
                                oyk0.a aVar3 = bj80Var.g;
                                if (aVar3 != null) {
                                    aVar3.a(oneVideoPlaybackException, a2, new awp(true));
                                }
                            }
                        }
                    }
                    new un80(oneVideoPlaybackException, bVar.b, z).q();
                }
                videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.STOP);
                videoAutoPlay.v1(true);
            }
        }
        z = false;
        if (videoAutoPlay.o) {
            a2 = d3b0Var.a();
            bj80 bj80Var2 = h.g;
            if (a2 != null) {
                if (z) {
                }
            }
        }
        new un80(oneVideoPlaybackException, bVar.b, z).q();
    }
}
