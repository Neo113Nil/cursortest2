package com.vk.libvideo.adfree.impl.di;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b5o;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.fzr0;
import xsna.g8m;
import xsna.hbl;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.tkj;
import xsna.tyr0;
import xsna.ug9;
import xsna.vg9;
import xsna.vyr0;
import xsna.wyr0;
import xsna.xyr0;

/* compiled from: VideoAdFreeSubscriptionComponentImpl.kt */
/* loaded from: classes.dex */
public final class VideoAdFreeSubscriptionComponentImpl implements VideoAdFreeSubscriptionComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final LinksBridgeComponent a;
    public final nwy b = new nwy(new hbl(this, 4));
    public final nwy c = new nwy(new tkj(this, 5));
    public final nwy d = new nwy(new b5o(this, 7));
    public final nwy e = new nwy(new ug9(11));
    public final nwy f = new nwy(new vg9(7));

    /* compiled from: VideoAdFreeSubscriptionComponentImpl.kt */
    public static final class a implements c8m<VideoAdFreeSubscriptionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoAdFreeSubscriptionComponentImpl((LinksBridgeComponent) g8mVar.a(fpf0.a(LinksBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoAdFreeSubscriptionComponentImpl.class, "videoAdFreeSubscriptionInteractor", "getVideoAdFreeSubscriptionInteractor()Lcom/vk/libvideo/adfree/impl/domain/VideoAdFreeSubscriptionInteractorImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, VideoAdFreeSubscriptionComponentImpl.class, "videoAdFreeSubscriptionLauncher", "getVideoAdFreeSubscriptionLauncher()Lcom/vk/libvideo/adfree/impl/di/VideoAdFreeSubscriptionLauncherImpl;", hpf0Var), ep.a(0, VideoAdFreeSubscriptionComponentImpl.class, "videoAdFreeTrapManager", "getVideoAdFreeTrapManager()Lcom/vk/libvideo/adfree/api/domain/VideoAdFreeTrapManager;", hpf0Var), ep.a(0, VideoAdFreeSubscriptionComponentImpl.class, "videoAdFreeSubscriptionRepository", "getVideoAdFreeSubscriptionRepository()Lcom/vk/libvideo/adfree/impl/data/VideoAdFreeSubscriptionRepositoryImpl;", hpf0Var), ep.a(0, VideoAdFreeSubscriptionComponentImpl.class, "videoAdFreeStatsTracker", "getVideoAdFreeStatsTracker()Lcom/vk/libvideo/adfree/api/VideoAdFreeStatsTracker;", hpf0Var)};
    }

    public VideoAdFreeSubscriptionComponentImpl(LinksBridgeComponent linksBridgeComponent) {
        this.a = linksBridgeComponent;
    }

    @Override // com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent
    public final fzr0 E2() {
        qcy<Object> qcyVar = g[2];
        return (fzr0) this.d.c();
    }

    @Override // com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent
    public final tyr0 G1() {
        qcy<Object> qcyVar = g[4];
        return (tyr0) this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent
    public final com.vk.libvideo.adfree.api.di.a h1() {
        qcy<Object> qcyVar = g[1];
        return (xyr0) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent
    public final vyr0 t6() {
        qcy<Object> qcyVar = g[0];
        return (wyr0) this.b.c();
    }
}
