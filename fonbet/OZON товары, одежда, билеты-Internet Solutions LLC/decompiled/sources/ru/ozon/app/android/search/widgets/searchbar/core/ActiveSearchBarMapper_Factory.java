package ru.ozon.app.android.search.widgets.searchbar.core;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes7.dex */
public final class ActiveSearchBarMapper_Factory implements e<ActiveSearchBarMapper> {
    private final a<AppType> appTypeProvider;
    private final a<FeatureChecker> featureCheckerProvider;

    public ActiveSearchBarMapper_Factory(a<AppType> aVar, a<FeatureChecker> aVar2) {
        this.appTypeProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static ActiveSearchBarMapper_Factory create(a<AppType> aVar, a<FeatureChecker> aVar2) {
        return new ActiveSearchBarMapper_Factory(aVar, aVar2);
    }

    public static ActiveSearchBarMapper newInstance(AppType appType, FeatureChecker featureChecker) {
        return new ActiveSearchBarMapper(appType, featureChecker);
    }

    @Override // Pc.a
    public ActiveSearchBarMapper get() {
        return newInstance(this.appTypeProvider.get(), this.featureCheckerProvider.get());
    }
}
