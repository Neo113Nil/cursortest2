package ru.ozon.app.android.tabbar.miniapp.fresh;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class FreshDefaultTabs_Factory implements e<FreshDefaultTabs> {
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<FreshTabConfigMapper> mapperProvider;

    public FreshDefaultTabs_Factory(a<FreshTabConfigMapper> aVar, a<FeatureChecker> aVar2) {
        this.mapperProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static FreshDefaultTabs_Factory create(a<FreshTabConfigMapper> aVar, a<FeatureChecker> aVar2) {
        return new FreshDefaultTabs_Factory(aVar, aVar2);
    }

    public static FreshDefaultTabs newInstance(FreshTabConfigMapper freshTabConfigMapper, FeatureChecker featureChecker) {
        return new FreshDefaultTabs(freshTabConfigMapper, featureChecker);
    }

    @Override // Pc.a
    public FreshDefaultTabs get() {
        return newInstance(this.mapperProvider.get(), this.featureCheckerProvider.get());
    }
}
