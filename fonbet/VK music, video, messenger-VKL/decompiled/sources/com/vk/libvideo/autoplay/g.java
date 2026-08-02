package com.vk.libvideo.autoplay;

import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import xsna.a6q;
import xsna.ad0;
import xsna.bpn0;
import xsna.d3b0;
import xsna.ye0;

/* compiled from: VideoAutoPlay.kt */
/* loaded from: classes2.dex */
public final class g {
    public final /* synthetic */ VideoAutoPlay a;

    public g(VideoAutoPlay videoAutoPlay) {
        this.a = videoAutoPlay;
    }

    public final void a(a.AbstractC1195a.b bVar) {
        d3b0 d3b0Var;
        com.vk.core.telemetry.b bVar2;
        VideoAutoPlay videoAutoPlay = this.a;
        d3b0 d3b0Var2 = videoAutoPlay.p0;
        a6q a6qVar = d3b0Var2 instanceof a6q ? (a6q) d3b0Var2 : null;
        if (a6qVar != null && (bVar2 = a6qVar.v) != null) {
            bVar2.a(VideoAutoPlay.T0(bVar), videoAutoPlay.u.w9().Cb());
        }
        bpn0 bpn0Var = b.B;
        if (!b.C1208b.a().h(videoAutoPlay)) {
            videoAutoPlay.C(false);
            return;
        }
        if (videoAutoPlay.u.q0() && (d3b0Var = videoAutoPlay.p0) != null) {
            d3b0Var.C(false);
            d3b0Var.j(null);
        }
        videoAutoPlay.U.getClass();
        if (ad0.w()) {
            videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PLAY);
            videoAutoPlay.l0();
            videoAutoPlay.O1(false);
        }
        ye0 ye0Var = videoAutoPlay.N;
        if (ye0Var == null) {
            return;
        }
        videoAutoPlay.y.m(ye0Var.z, bVar);
        ye0Var.h(videoAutoPlay.getVolume(), false);
        videoAutoPlay.i1();
        videoAutoPlay.W.b();
    }
}
