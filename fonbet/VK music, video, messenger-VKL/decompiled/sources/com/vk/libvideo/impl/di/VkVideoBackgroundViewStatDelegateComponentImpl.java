package com.vk.libvideo.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.promo.stats.VkVideoBackgroundViewStatDelegateComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.m0t0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wrl0;

/* compiled from: VkVideoBackgroundViewStatDelegateComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VkVideoBackgroundViewStatDelegateComponentImpl implements VkVideoBackgroundViewStatDelegateComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(VkVideoBackgroundViewStatDelegateComponentImpl.class, "videoGrowthStatsTracker", "getVideoGrowthStatsTracker()Lcom/vk/video/growth/api/VideoGrowthStatsTracker;", 0), fp.c(0, VkVideoBackgroundViewStatDelegateComponentImpl.class, "backgroundViewStatDelegate", "getBackgroundViewStatDelegate()Lcom/vk/libvideo/api/promo/stats/VkVideoBackgroundViewStatDelegate;", fpf0.a)};
    public final VideoGrowthComponent a;
    public final nwy b = new nwy(new m0t0(this, 5));
    public final nwy c = new nwy(new wrl0(this, 26));

    /* compiled from: VkVideoBackgroundViewStatDelegateComponentImpl.kt */
    public static final class a implements c8m<VkVideoBackgroundViewStatDelegateComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkVideoBackgroundViewStatDelegateComponentImpl((VideoGrowthComponent) g8mVar.a(fpf0.a(VideoGrowthComponent.class)));
        }
    }

    public VkVideoBackgroundViewStatDelegateComponentImpl(VideoGrowthComponent videoGrowthComponent) {
        this.a = videoGrowthComponent;
    }

    @Override // com.vk.libvideo.api.promo.stats.VkVideoBackgroundViewStatDelegateComponent
    public final com.vk.libvideo.api.promo.stats.a b5() {
        qcy<Object> qcyVar = d[1];
        return (com.vk.libvideo.api.promo.stats.a) this.c.c();
    }
}
