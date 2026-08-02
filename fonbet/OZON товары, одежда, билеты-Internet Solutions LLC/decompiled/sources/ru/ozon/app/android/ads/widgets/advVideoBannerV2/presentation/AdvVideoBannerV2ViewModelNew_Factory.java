package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Jb.e;
import WZ.l;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;

/* loaded from: classes6.dex */
public final class AdvVideoBannerV2ViewModelNew_Factory implements e<AdvVideoBannerV2ViewModelNew> {
    private final Pc.a<AdvVideoBannerV2TrackerAnalyticsDelegate> advVideoBannerTrackerAnalyticsDelegateProvider;
    private final Pc.a<InterfaceC7851b> composerControllerProvider;
    private final Pc.a<PixelApiRepository> pixelApiRepositoryProvider;
    private final Pc.a<l> tokenizedAnalyticsProvider;

    public AdvVideoBannerV2ViewModelNew_Factory(Pc.a<PixelApiRepository> aVar, Pc.a<AdvVideoBannerV2TrackerAnalyticsDelegate> aVar2, Pc.a<l> aVar3, Pc.a<InterfaceC7851b> aVar4) {
        this.pixelApiRepositoryProvider = aVar;
        this.advVideoBannerTrackerAnalyticsDelegateProvider = aVar2;
        this.tokenizedAnalyticsProvider = aVar3;
        this.composerControllerProvider = aVar4;
    }

    public static AdvVideoBannerV2ViewModelNew_Factory create(Pc.a<PixelApiRepository> aVar, Pc.a<AdvVideoBannerV2TrackerAnalyticsDelegate> aVar2, Pc.a<l> aVar3, Pc.a<InterfaceC7851b> aVar4) {
        return new AdvVideoBannerV2ViewModelNew_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static AdvVideoBannerV2ViewModelNew newInstance(PixelApiRepository pixelApiRepository, AdvVideoBannerV2TrackerAnalyticsDelegate advVideoBannerV2TrackerAnalyticsDelegate, l lVar, InterfaceC7851b interfaceC7851b) {
        return new AdvVideoBannerV2ViewModelNew(pixelApiRepository, advVideoBannerV2TrackerAnalyticsDelegate, lVar, interfaceC7851b);
    }

    @Override // Pc.a
    public AdvVideoBannerV2ViewModelNew get() {
        return newInstance(this.pixelApiRepositoryProvider.get(), this.advVideoBannerTrackerAnalyticsDelegateProvider.get(), this.tokenizedAnalyticsProvider.get(), this.composerControllerProvider.get());
    }
}
