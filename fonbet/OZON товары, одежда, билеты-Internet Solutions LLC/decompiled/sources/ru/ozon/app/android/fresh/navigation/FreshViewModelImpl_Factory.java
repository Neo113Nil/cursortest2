package ru.ozon.app.android.fresh.navigation;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;

/* loaded from: classes12.dex */
public final class FreshViewModelImpl_Factory implements e<FreshViewModelImpl> {
    private final a<MiniAppAnalytics> analyticsProvider;
    private final a<Sg.a> analyticsScreenStorageProvider;
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<FreshTabConfigRepository> freshTabConfigRepoProvider;

    public FreshViewModelImpl_Factory(a<FreshTabConfigRepository> aVar, a<FeatureChecker> aVar2, a<MiniAppAnalytics> aVar3, a<Sg.a> aVar4) {
        this.freshTabConfigRepoProvider = aVar;
        this.featureCheckerProvider = aVar2;
        this.analyticsProvider = aVar3;
        this.analyticsScreenStorageProvider = aVar4;
    }

    public static FreshViewModelImpl_Factory create(a<FreshTabConfigRepository> aVar, a<FeatureChecker> aVar2, a<MiniAppAnalytics> aVar3, a<Sg.a> aVar4) {
        return new FreshViewModelImpl_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static FreshViewModelImpl newInstance(FreshTabConfigRepository freshTabConfigRepository, FeatureChecker featureChecker, MiniAppAnalytics miniAppAnalytics, Sg.a aVar) {
        return new FreshViewModelImpl(freshTabConfigRepository, featureChecker, miniAppAnalytics, aVar);
    }

    @Override // Pc.a
    public FreshViewModelImpl get() {
        return newInstance(this.freshTabConfigRepoProvider.get(), this.featureCheckerProvider.get(), this.analyticsProvider.get(), this.analyticsScreenStorageProvider.get());
    }
}
