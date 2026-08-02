package com.vk.video.ui.discovery.minimizable;

import com.vk.core.fragments.FragmentImpl;
import com.vk.libvideo.tracker.VideoSimilarAnalytics;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import xsna.bb30;
import xsna.coj0;
import xsna.j5g;
import xsna.mws0;
import xsna.nb30;
import xsna.tts0;
import xsna.xn50;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
/* loaded from: classes7.dex */
public final class k implements bb30 {
    public final /* synthetic */ VideoMinimizableDiscoveryFragment b;

    public k(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment) {
        this.b = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.bb30
    public final void a(nb30 nb30Var) {
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.b;
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.J2();
        }
        tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
        if (tts0Var == null) {
            tts0Var = null;
        }
        tts0Var.a.b.setInteractionEnabled((nb30Var == DiscoveryScreenMotionStates$Portrait.Miniplayer || nb30Var == DiscoveryScreenMotionStates$Landscape.Miniplayer) ? false : true);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bb30
    public final void b(nb30 nb30Var, nb30 nb30Var2) {
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape = DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.b;
        if (nb30Var2 == discoveryScreenMotionStates$Landscape) {
            int i = VideoMinimizableDiscoveryFragment.p1;
            coj0 coj0Var = (coj0) videoMinimizableDiscoveryFragment.l0.getValue();
            if (coj0Var.d == null && !coj0Var.e) {
                coj0Var.d = VideoSimilarAnalytics.EventSource.SWIPE;
            }
        }
        xn50.a.c(videoMinimizableDiscoveryFragment, new c.t(nb30Var2));
        MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
        if (miniPlayerControllersWrapper != null) {
            miniPlayerControllersWrapper.Y2();
        }
        mws0 mws0Var = videoMinimizableDiscoveryFragment.K0;
        if (mws0Var != null) {
            Object k0 = j5g.k0(mws0Var.e.b());
            FragmentImpl fragmentImpl = k0 instanceof FragmentImpl ? (FragmentImpl) k0 : null;
            if (fragmentImpl != null) {
                fragmentImpl.Hn();
            }
        }
    }

    @Override // xsna.bb30
    public final void d(nb30 nb30Var, nb30 nb30Var2) {
    }

    @Override // xsna.bb30
    public final void c(nb30 nb30Var, nb30 nb30Var2, float f) {
    }
}
