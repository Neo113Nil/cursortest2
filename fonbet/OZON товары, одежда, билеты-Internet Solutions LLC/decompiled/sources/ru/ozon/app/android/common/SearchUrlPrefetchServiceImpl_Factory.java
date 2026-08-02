package ru.ozon.app.android.common;

import Jb.e;
import L00.d;
import ru.ozon.app.android.composer.network.prefetch.ComposerPrefetchService;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.UrlPrefetchedEventHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class SearchUrlPrefetchServiceImpl_Factory implements e<SearchUrlPrefetchServiceImpl> {
    private final Pc.a<d> callFactoryProvider;
    private final Pc.a<ComposerPrefetchService> composerPrefetchServiceProvider;
    private final Pc.a<ComposerRunningPrefetchedRequestUrlsHolder> composerRunningPrefetchedRequestUrlsHolderProvider;
    private final Pc.a<FeatureChecker> featureCheckerProvider;
    private final Pc.a<UrlPrefetchedEventHolder> urlPrefetchedEventHolderProvider;

    public SearchUrlPrefetchServiceImpl_Factory(Pc.a<FeatureChecker> aVar, Pc.a<ComposerPrefetchService> aVar2, Pc.a<d> aVar3, Pc.a<ComposerRunningPrefetchedRequestUrlsHolder> aVar4, Pc.a<UrlPrefetchedEventHolder> aVar5) {
        this.featureCheckerProvider = aVar;
        this.composerPrefetchServiceProvider = aVar2;
        this.callFactoryProvider = aVar3;
        this.composerRunningPrefetchedRequestUrlsHolderProvider = aVar4;
        this.urlPrefetchedEventHolderProvider = aVar5;
    }

    public static SearchUrlPrefetchServiceImpl_Factory create(Pc.a<FeatureChecker> aVar, Pc.a<ComposerPrefetchService> aVar2, Pc.a<d> aVar3, Pc.a<ComposerRunningPrefetchedRequestUrlsHolder> aVar4, Pc.a<UrlPrefetchedEventHolder> aVar5) {
        return new SearchUrlPrefetchServiceImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SearchUrlPrefetchServiceImpl newInstance(FeatureChecker featureChecker, ComposerPrefetchService composerPrefetchService, d dVar, ComposerRunningPrefetchedRequestUrlsHolder composerRunningPrefetchedRequestUrlsHolder, UrlPrefetchedEventHolder urlPrefetchedEventHolder) {
        return new SearchUrlPrefetchServiceImpl(featureChecker, composerPrefetchService, dVar, composerRunningPrefetchedRequestUrlsHolder, urlPrefetchedEventHolder);
    }

    @Override // Pc.a
    public SearchUrlPrefetchServiceImpl get() {
        return newInstance(this.featureCheckerProvider.get(), this.composerPrefetchServiceProvider.get(), this.callFactoryProvider.get(), this.composerRunningPrefetchedRequestUrlsHolderProvider.get(), this.urlPrefetchedEventHolderProvider.get());
    }
}
