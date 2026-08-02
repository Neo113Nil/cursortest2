package com.vk.video.ui.discovery.minimizable;

import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.api.di.VideoDownloadsComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.di.VideoPlaylistVideosComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.api.di.VkVideoLiveSDKComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.libvideo.api.di.WarmupComponent;
import com.vk.libvideo.api.promo.DownloadRedirectionDelegateComponent;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.recast.di.RecastDiComponent;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vk.video.ui.discovery.minimizable.di.VideoAsyncInflaterComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import kotlin.Lazy;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a0w0;
import xsna.egs0;
import xsna.fp;
import xsna.fpf0;
import xsna.h7v;
import xsna.nwy;
import xsna.qcy;
import xsna.srq0;
import xsna.svs0;
import xsna.tvs0;
import xsna.uaj0;
import xsna.wc0;

/* compiled from: VideoMinimizableDiscoveryInternalComponent.kt */
/* loaded from: classes7.dex */
public final class VideoMinimizableDiscoveryInternalComponent implements DiScopedComponent<a.C1969a> {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final nwy L = new nwy(new tvs0(this, 0));
    public final nwy M = new nwy(new srq0(this, 6));
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;
    public static final /* synthetic */ qcy<Object>[] O = {new PropertyReference1Impl(VideoMinimizableDiscoveryInternalComponent.class, "itemAsyncInflater", "getItemAsyncInflater()Lcom/vk/video/ui/discovery/minimizable/async_inflater/VideoDiscoveryItemAsyncInflater;", 0), fp.c(0, VideoMinimizableDiscoveryInternalComponent.class, "d2dOnboardingDelegate", "getD2dOnboardingDelegate()Lcom/vk/video/ui/discovery/minimizable/doc2doc/onboarding/D2DOnboardingDelegate;", fpf0.a)};
    public static final a N = new a();

    /* compiled from: VideoMinimizableDiscoveryInternalComponent.kt */
    public static final class a {

        /* compiled from: VideoMinimizableDiscoveryInternalComponent.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryInternalComponent$a$a, reason: collision with other inner class name */
        public static final class C1969a extends uaj0 {
            public static final C1969a a = new C1969a();
        }
    }

    public VideoMinimizableDiscoveryInternalComponent(Lazy<? extends VideoMinimizablePlayerComponent> lazy, Lazy<? extends VideoPip2Component> lazy2, Lazy<? extends VideoShareComponent> lazy3, Lazy<? extends VideoQueueComponent> lazy4, Lazy<? extends CastComponent> lazy5, Lazy<? extends VideoGrowthComponent> lazy6, Lazy<? extends BridgeComponent> lazy7, Lazy<? extends VideoAdFreeSubscriptionComponent> lazy8, Lazy<? extends AdPixelStatsComponent> lazy9, Lazy<? extends MusicInVideoComponent> lazy10, Lazy<? extends MusicInVideoDialogComponent> lazy11, Lazy<? extends VideoPlaylistVideosComponent> lazy12, Lazy<? extends RecastDiComponent> lazy13, Lazy<? extends VideoPlaylistReversionComponent> lazy14, Lazy<? extends NotificationsSettingsComponent> lazy15, Lazy<? extends UxPollsComponent> lazy16, Lazy<? extends WarmupComponent> lazy17, Lazy<? extends VideoAppStabilityComponent> lazy18, Lazy<? extends VideoAutologinComponent> lazy19, Lazy<? extends MarketComponent> lazy20, Lazy<? extends VideoAsyncInflaterComponent> lazy21, Lazy<? extends VideoKidsComponent> lazy22, Lazy<? extends VideoNotificationsPermissionComponent> lazy23, Lazy<? extends SearchUiComponent> lazy24, Lazy<? extends VideoSubscriptionComponent> lazy25, Lazy<? extends VideoPlaybackSpeedComponent> lazy26, Lazy<? extends VideoDownloadsComponent> lazy27, Lazy<? extends VideoRestrictedUserActionsComponent> lazy28, Lazy<? extends VideoPromoComponent> lazy29, Lazy<? extends VkVideoPromoComponent> lazy30, Lazy<? extends VideoAdvertisementsComponent> lazy31, Lazy<? extends DownloadRedirectionDelegateComponent> lazy32, Lazy<? extends VideoTechBugreportComponent> lazy33, Lazy<? extends VideoSeekComponent> lazy34, Lazy<? extends VkVideoLiveSDKComponent> lazy35, Lazy<? extends DonutVideoComponent> lazy36, Lazy<? extends OnboardingComponent> lazy37) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy9;
        this.j = lazy10;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
        this.r = lazy18;
        this.s = lazy19;
        this.t = lazy20;
        this.u = lazy21;
        this.v = lazy22;
        this.w = lazy23;
        this.x = lazy24;
        this.y = lazy25;
        this.z = lazy26;
        this.A = lazy27;
        this.B = lazy28;
        this.C = lazy29;
        this.D = lazy30;
        this.E = lazy31;
        this.F = lazy32;
        this.G = lazy33;
        this.H = lazy34;
        this.I = lazy35;
        this.J = lazy36;
        this.K = lazy37;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final svs0 Df() {
        return ((VideoAsyncInflaterComponent) this.u.getValue()).N1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v Ef() {
        return ((BridgeComponent) this.g.getValue()).t().b();
    }

    public final egs0 Ff() {
        qcy<Object> qcyVar = O[0];
        return (egs0) this.L.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wc0 Gf() {
        return ((VideoAdvertisementsComponent) this.E.getValue()).Z3(VideoAdvertisementsComponent.AdType.VIDEO);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a0w0 Hf() {
        return ((VkVideoLiveSDKComponent) this.I.getValue()).F0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NotificationsPermission V() {
        return ((VideoNotificationsPermissionComponent) this.w.getValue()).V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.video.kidsprofile.restricteduseractions.a e2() {
        return ((VideoRestrictedUserActionsComponent) this.B.getValue()).e2();
    }
}
