package ru.ozon.app.android.search.widgets.searchbar.core;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class SearchBarMapper_Factory implements e<SearchBarMapper> {
    private final a<AppType> appTypeProvider;
    private final a<FeatureChecker> featureCheckerProvider;

    public SearchBarMapper_Factory(a<AppType> aVar, a<FeatureChecker> aVar2) {
        this.appTypeProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static SearchBarMapper_Factory create(a<AppType> aVar, a<FeatureChecker> aVar2) {
        return new SearchBarMapper_Factory(aVar, aVar2);
    }

    public static SearchBarMapper newInstance(AppType appType, FeatureChecker featureChecker) {
        return new SearchBarMapper(appType, featureChecker);
    }

    @Override // Pc.a
    public SearchBarMapper get() {
        return newInstance(this.appTypeProvider.get(), this.featureCheckerProvider.get());
    }
}
