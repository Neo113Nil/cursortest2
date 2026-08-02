package com.vk.video.growth.impl.di;

import com.vk.asset.manager.api.di.VkAssetManagerComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b6f0;
import xsna.bos0;
import xsna.c8m;
import xsna.dos0;
import xsna.e3c0;
import xsna.eos0;
import xsna.ep;
import xsna.f0s0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gos0;
import xsna.hit0;
import xsna.hos0;
import xsna.hpf0;
import xsna.i6m0;
import xsna.irc0;
import xsna.iud0;
import xsna.kld0;
import xsna.mos0;
import xsna.msy;
import xsna.nid0;
import xsna.nos0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qbc0;
import xsna.qcy;
import xsna.ros0;
import xsna.sos0;
import xsna.uos0;
import xsna.vcs0;
import xsna.wos0;
import xsna.yos0;
import xsna.z0h0;

/* compiled from: VideoGrowthComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthComponentImpl implements VideoGrowthComponent {
    public static final /* synthetic */ qcy<Object>[] k;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final nwy e = new nwy(new gos0(0));
    public final nwy f = new nwy(new iud0(10));
    public final nwy g = new nwy(new irc0(this, 28));
    public final nwy h = new nwy(new z0h0(9));
    public final nwy i = new nwy(new e3c0(10));
    public final nwy j = new nwy(new qbc0(this, 28));

    /* compiled from: VideoGrowthComponentImpl.kt */
    public static final class a implements c8m<VideoGrowthComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            b6f0 b6f0Var = new b6f0(g8mVar, 16);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new VideoGrowthComponentImpl(msy.a(lazyThreadSafetyMode, b6f0Var), msy.a(lazyThreadSafetyMode, new kld0(g8mVar, 24)), msy.a(lazyThreadSafetyMode, new i6m0(g8mVar, 12)), msy.a(lazyThreadSafetyMode, new nid0(g8mVar, 23)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoGrowthComponentImpl.class, "videoGrowthStatsTracker", "getVideoGrowthStatsTracker()Lcom/vk/video/growth/api/VideoGrowthStatsTracker;", 0);
        hpf0 hpf0Var = fpf0.a;
        k = new qcy[]{propertyReference1Impl, fp.c(0, VideoGrowthComponentImpl.class, "videoGrowthConfigResolver", "getVideoGrowthConfigResolver()Lcom/vk/video/growth/api/VideoGrowthConfigResolver;", hpf0Var), ep.a(0, VideoGrowthComponentImpl.class, "videoStandaloneAppLauncher", "getVideoStandaloneAppLauncher()Lcom/vk/video/growth/api/VideoStandaloneAppLauncher;", hpf0Var), ep.a(0, VideoGrowthComponentImpl.class, "videoGrowthTrapLauncher", "getVideoGrowthTrapLauncher()Lcom/vk/video/growth/api/VideoGrowthTrapLauncher;", hpf0Var), ep.a(0, VideoGrowthComponentImpl.class, "videoGrowthType", "getVideoGrowthType()Lcom/vk/video/growth/api/data/VideoGrowthType;", hpf0Var), ep.a(0, VideoGrowthComponentImpl.class, "videoAdsSuspendManager", "getVideoAdsSuspendManager()Lcom/vk/video/growth/api/VideoAdsSuspendManager;", hpf0Var)};
    }

    public VideoGrowthComponentImpl(Lazy<? extends LinksBridgeComponent> lazy, Lazy<? extends InfoBridgeComponent> lazy2, Lazy<? extends AuthBridgeComponent> lazy3, Lazy<? extends VkAssetManagerComponent> lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final hos0 Af() {
        qcy<Object> qcyVar = k[1];
        return (hos0) this.f.c();
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final mos0 B3() {
        return new nos0(Af(), Z7(), N8());
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final wos0 B6() {
        f0s0 Z9 = Z9();
        bos0 Df = Df();
        qcy<Object> qcyVar = k[3];
        return new yos0(Z9, Df, (uos0) this.h.c(), new ros0(Af(), N8(), Df(), Z7()), (nos0) B3(), new vcs0(Af(), Z7(), N8()));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final bos0 Df() {
        return new bos0(Af(), ((VkAssetManagerComponent) this.d.getValue()).Se());
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final hit0 N8() {
        qcy<Object> qcyVar = k[2];
        return (hit0) this.g.c();
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final sos0 Z7() {
        qcy<Object> qcyVar = k[0];
        return (sos0) this.e.c();
    }

    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final f0s0 Z9() {
        qcy<Object> qcyVar = k[5];
        return (f0s0) this.j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.video.growth.api.di.VideoGrowthComponent
    public final dos0 z6() {
        hit0 N8 = N8();
        hos0 Af = Af();
        bos0 Df = Df();
        qcy<Object> qcyVar = k[4];
        return new eos0(Af, N8, Df, (VideoGrowthType) this.i.c(), Z7());
    }
}
