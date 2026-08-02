package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import WZ.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.analytics.SwitchModeTracking;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2AnalyticsListenerImpl;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2AnalyticsSender;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import u3.InterfaceC9928b;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J%\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u001fJ\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020<088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerAnalyticsDelegate;", "", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "pixelApiRepository", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;", "advVideoBannerTrackerAnalyticsDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;LWZ/l;)V", "Lxe/M;", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "", "trackPixel", "(Lxe/M;Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;)V", "", "id", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;", "itemTokenizedEvents", "Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "switchModeTracking", "", "coroutineScope", "initAdvVideoBannerAnalytics", "(JLru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO$TokenizedEvents;Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;Ljava/util/List;Lxe/M;)V", "duration", "setVideoDuration", "(JJ)V", "onVideoView", "(J)V", "onVideoClick", "onProductClick", "Lu3/b;", "getAnalyticsListenerById", "(J)Lu3/b;", "", "state", "blockSoundEventSending", "(JZ)V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;", "eventType", "Lkotlin/Function0;", "action", "trackOneTimeEvent", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate$EventType;Lkotlin/jvm/functions/Function0;)V", "resetDataById", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "trackPackshotView", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "trackProductPreviewView", "Lru/ozon/app/android/ads/data/pixel/PixelApiRepository;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2TrackerAnalyticsDelegate;", "LWZ/l;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsSender;", "analyticsSenderMap", "Ljava/util/Map;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/analytics/AdvVideoBannerV2AnalyticsListenerImpl;", "analyticsListenerMap", "", "viewedVideos", "Ljava/util/Set;", "viewedPreviews", "viewedPackshots", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerAnalyticsDelegate {

    @NotNull
    private final AdvVideoBannerV2TrackerAnalyticsDelegate advVideoBannerTrackerAnalyticsDelegate;

    @NotNull
    private final Map<Long, AdvVideoBannerV2AnalyticsListenerImpl> analyticsListenerMap;

    @NotNull
    private final Map<Long, AdvVideoBannerV2AnalyticsSender> analyticsSenderMap;

    @NotNull
    private final PixelApiRepository pixelApiRepository;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Set<Long> viewedPackshots;

    @NotNull
    private final Set<Long> viewedPreviews;

    @NotNull
    private final Set<Long> viewedVideos;

    public AdvVideoBannerAnalyticsDelegate(@NotNull PixelApiRepository pixelApiRepository, @NotNull AdvVideoBannerV2TrackerAnalyticsDelegate advVideoBannerTrackerAnalyticsDelegate, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(pixelApiRepository, "pixelApiRepository");
        Intrinsics.checkNotNullParameter(advVideoBannerTrackerAnalyticsDelegate, "advVideoBannerTrackerAnalyticsDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.pixelApiRepository = pixelApiRepository;
        this.advVideoBannerTrackerAnalyticsDelegate = advVideoBannerTrackerAnalyticsDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.analyticsSenderMap = new LinkedHashMap();
        this.analyticsListenerMap = new LinkedHashMap();
        this.viewedVideos = new LinkedHashSet();
        this.viewedPreviews = new LinkedHashSet();
        this.viewedPackshots = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPixel(M m11, Pixel pixel) {
        C10727i.c(m11, null, null, new AdvVideoBannerAnalyticsDelegate$trackPixel$1(this, pixel, null), 3);
    }

    public void blockSoundEventSending(long id2, boolean state) {
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.setNeedDropEvent$ads_prodGoogleAllVendorsRelease(state);
        }
    }

    public InterfaceC9928b getAnalyticsListenerById(long id2) {
        return this.analyticsListenerMap.get(Long.valueOf(id2));
    }

    public void initAdvVideoBannerAnalytics(long id2, @NotNull AdvBannerVideoV2VO.TokenizedEvents itemTokenizedEvents, @NotNull SwitchModeTracking switchModeTracking, List<Pixel> pixel, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(itemTokenizedEvents, "itemTokenizedEvents");
        Intrinsics.checkNotNullParameter(switchModeTracking, "switchModeTracking");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        if (this.analyticsSenderMap.get(Long.valueOf(id2)) == null) {
            AdvVideoBannerV2AnalyticsSender advVideoBannerV2AnalyticsSender = new AdvVideoBannerV2AnalyticsSender(this.tokenizedAnalytics);
            this.analyticsSenderMap.put(Long.valueOf(id2), advVideoBannerV2AnalyticsSender);
            this.analyticsListenerMap.put(Long.valueOf(id2), new AdvVideoBannerV2AnalyticsListenerImpl(advVideoBannerV2AnalyticsSender));
        }
        AdvVideoBannerV2AnalyticsSender advVideoBannerV2AnalyticsSender2 = this.analyticsSenderMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsSender2 != null) {
            advVideoBannerV2AnalyticsSender2.setVideoEvents(itemTokenizedEvents);
            advVideoBannerV2AnalyticsSender2.setSwitchVolumeEvents(switchModeTracking);
            advVideoBannerV2AnalyticsSender2.setPixelItem(pixel);
            advVideoBannerV2AnalyticsSender2.setTrackPixel(new AdvVideoBannerAnalyticsDelegate$initAdvVideoBannerAnalytics$1$1(this, coroutineScope));
        }
    }

    public void onProductClick(long id2) {
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.onClick();
        }
    }

    public void onVideoClick(long id2) {
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.onVideoClick();
        }
    }

    public void onVideoView(long id2) {
        if (this.viewedVideos.contains(Long.valueOf(id2))) {
            return;
        }
        this.viewedVideos.add(Long.valueOf(id2));
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.onVideoView();
        }
    }

    public void resetDataById(long id2) {
        this.advVideoBannerTrackerAnalyticsDelegate.resetData();
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.disposePlayer();
        }
        this.analyticsListenerMap.remove(Long.valueOf(id2));
        AdvVideoBannerV2AnalyticsSender advVideoBannerV2AnalyticsSender = this.analyticsSenderMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsSender != null) {
            this.analyticsListenerMap.put(Long.valueOf(id2), new AdvVideoBannerV2AnalyticsListenerImpl(advVideoBannerV2AnalyticsSender));
        }
        this.viewedVideos.remove(Long.valueOf(id2));
        this.viewedPreviews.remove(Long.valueOf(id2));
        this.viewedPackshots.remove(Long.valueOf(id2));
    }

    public void setVideoDuration(long id2, long duration) {
        AdvVideoBannerV2AnalyticsListenerImpl advVideoBannerV2AnalyticsListenerImpl = this.analyticsListenerMap.get(Long.valueOf(id2));
        if (advVideoBannerV2AnalyticsListenerImpl != null) {
            advVideoBannerV2AnalyticsListenerImpl.setVideoDuration(duration);
        }
    }

    public void trackOneTimeEvent(@NotNull AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.advVideoBannerTrackerAnalyticsDelegate.trackOneTimeEvent(eventType, action);
    }

    public void trackPackshotView(@NotNull AdvBannerVideoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.viewedPackshots.contains(Long.valueOf(item.getId()))) {
            return;
        }
        AdvBannerVideoV2VO.PackShotVO packshotVO = item.getPackshotVO();
        if ((packshotVO != null ? packshotVO.getTokenizedEvent() : null) == null) {
            return;
        }
        this.viewedPackshots.add(Long.valueOf(item.getId()));
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, item.getPackshotVO().getTokenizedEvent(), null, 2, null);
    }

    public void trackProductPreviewView(@NotNull AdvBannerVideoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.viewedPreviews.contains(Long.valueOf(item.getId()))) {
            return;
        }
        AdvBannerVideoV2VO.SmallPreviewProduct previewProduct = item.getPreviewProduct();
        if ((previewProduct != null ? previewProduct.getTokenizedEvent() : null) == null) {
            return;
        }
        this.viewedPreviews.add(Long.valueOf(item.getId()));
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, item.getPreviewProduct().getTokenizedEvent(), null, 2, null);
    }
}
