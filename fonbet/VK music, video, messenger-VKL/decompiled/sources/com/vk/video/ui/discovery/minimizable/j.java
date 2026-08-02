package com.vk.video.ui.discovery.minimizable;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import java.util.HashSet;
import java.util.Optional;
import xsna.bsf0;
import xsna.ffs0;
import xsna.fnj;
import xsna.fpe0;
import xsna.iah0;
import xsna.nnj0;
import xsna.vts0;
import xsna.xn50;
import xsna.znj0;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
/* loaded from: classes7.dex */
public final class j implements MiniPlayerControllersWrapper.a {
    public final /* synthetic */ VideoMinimizableDiscoveryFragment a;
    public final /* synthetic */ FragmentActivity b;

    public j(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, FragmentActivity fragmentActivity) {
        this.a = videoMinimizableDiscoveryFragment;
        this.b = fragmentActivity;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper.a
    public final void a(String str, boolean z) {
        c.p pVar = new c.p(z, str);
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, pVar);
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper.a
    public final void b(String str, boolean z) {
        c.y0 y0Var = new c.y0(z, str);
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, y0Var);
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper.a
    public final void c() {
        HashSet hashSet = iah0.a;
        xn50.a.c(this.a, new c.n.a(fnj.d(this.b)));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper.a
    public final void d(VideoPlayerState videoPlayerState) {
        znj0 znj0Var;
        c.o0.l lVar = new c.o0.l(videoPlayerState);
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        xn50.a.c(videoMinimizableDiscoveryFragment, lVar);
        VideoPlayerStatus videoPlayerStatus = videoPlayerState.b;
        if (com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerStatus)) {
            videoMinimizableDiscoveryFragment.ko().Hf().getClass();
        } else if (com.vk.video.ui.discovery.minimizable.player.b.b(videoPlayerStatus) || videoPlayerStatus.equals(VideoPlayerStatus.Error.b)) {
            videoMinimizableDiscoveryFragment.ko().Hf().getClass();
        }
        if (videoPlayerStatus.equals(VideoPlayerStatus.Completed.b)) {
            bsf0 bsf0Var = videoMinimizableDiscoveryFragment.j0;
            if (bsf0Var != null) {
                bsf0Var.close();
            }
            bsf0 bsf0Var2 = videoMinimizableDiscoveryFragment.k0;
            if (bsf0Var2 != null) {
                bsf0Var2.close();
            }
        }
        if (com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus) && (znj0Var = videoMinimizableDiscoveryFragment.B0) != null && znj0Var.m == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar) {
            znj0Var.j(nnj0.a.a);
        }
        m mVar = videoMinimizableDiscoveryFragment.J0;
        if (mVar != null) {
            mVar.m = com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        Context mo2getContext;
        c.C1974c c1974c = new c.C1974c(false);
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        xn50.a.c(videoMinimizableDiscoveryFragment, c1974c);
        if (videoMinimizableDiscoveryFragment.b3().P0() instanceof VideoMinimizableState.Expanded) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d() || (mo2getContext = videoMinimizableDiscoveryFragment.mo2getContext()) == null) {
                return;
            }
            ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).E2().a(VideoAdFreeTrapEventTrigger.AD_END, mo2getContext);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(boolean z) {
        Context mo2getContext;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        if ((videoMinimizableDiscoveryFragment.b3().P0() instanceof VideoMinimizableState.Expanded) && z) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d() || (mo2getContext = videoMinimizableDiscoveryFragment.mo2getContext()) == null) {
                return;
            }
            ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).E2().a(VideoAdFreeTrapEventTrigger.AD_SKIP, mo2getContext);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        Context mo2getContext;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        if (videoMinimizableDiscoveryFragment.b3().P0() instanceof VideoMinimizableState.Collapsed) {
            xn50.a.c(videoMinimizableDiscoveryFragment, new c.C1974c(true));
        }
        if (videoMinimizableDiscoveryFragment.b3().P0() instanceof VideoMinimizableState.Expanded) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d() || (mo2getContext = videoMinimizableDiscoveryFragment.mo2getContext()) == null) {
                return;
            }
            ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).E2().a(VideoAdFreeTrapEventTrigger.AD_START, mo2getContext);
        }
    }

    public final void h() {
        c.o0.a aVar = c.o0.a.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, aVar);
    }

    public final void i(vts0 vts0Var) {
        xn50.a.c(this.a, new c.o0.h(vts0Var));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void j() {
        int i = VideoMinimizableDiscoveryFragment.p1;
        ((ffs0) this.a.V0.getValue()).a.getClass();
    }

    public final void k() {
        c.o0.d dVar = c.o0.d.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, dVar);
    }

    public final void l(boolean z, DiscoveryAction.EventSource eventSource) {
        xn50.a.c(this.a, new c.n0(z, eventSource));
    }

    public final void m() {
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        Optional<VideoFile> P0 = videoMinimizableDiscoveryFragment.r5().P0();
        if (P0 != null && P0.orElse(null) != null) {
            videoMinimizableDiscoveryFragment.ko().Hf().getClass();
        }
        xn50.a.c(videoMinimizableDiscoveryFragment, c.o0.k.b);
        xn50.a.c(videoMinimizableDiscoveryFragment, new c.d(6, Boolean.TRUE, null, null));
    }

    public final void n() {
        c.o0.C1977c c1977c = c.o0.C1977c.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, c1977c);
    }

    public final void o() {
        c.o0.e eVar = c.o0.e.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, eVar);
    }

    public final void p(fpe0 fpe0Var) {
        xn50.a.c(this.a, new c.p0(fpe0Var));
    }

    public final void q(QualitySettingsType qualitySettingsType) {
        xn50.a.c(this.a, new c.q0(qualitySettingsType));
    }

    public final void r() {
        c.o0.n nVar = c.o0.n.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, nVar);
    }

    public final void s(boolean z) {
        xn50.a.c(this.a, new c.o0.o(z));
    }

    public final void t() {
        c.o0.p pVar = c.o0.p.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, pVar);
    }

    public final void u() {
        c.o0.q qVar = c.o0.q.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, qVar);
    }

    public final void v() {
        c.o0.s sVar = c.o0.s.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.a;
        videoMinimizableDiscoveryFragment.getClass();
        xn50.a.c(videoMinimizableDiscoveryFragment, sVar);
    }
}
