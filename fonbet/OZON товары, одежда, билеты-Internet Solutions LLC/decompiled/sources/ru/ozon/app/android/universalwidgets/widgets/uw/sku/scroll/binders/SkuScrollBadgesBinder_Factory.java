package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes2.dex */
public final class SkuScrollBadgesBinder_Factory implements e<SkuScrollBadgesBinder> {
    private final a<AdultHandler> adultHandlerProvider;
    private final a<FeatureChecker> featureCheckerProvider;

    public SkuScrollBadgesBinder_Factory(a<AdultHandler> aVar, a<FeatureChecker> aVar2) {
        this.adultHandlerProvider = aVar;
        this.featureCheckerProvider = aVar2;
    }

    public static SkuScrollBadgesBinder_Factory create(a<AdultHandler> aVar, a<FeatureChecker> aVar2) {
        return new SkuScrollBadgesBinder_Factory(aVar, aVar2);
    }

    public static SkuScrollBadgesBinder newInstance(AdultHandler adultHandler, FeatureChecker featureChecker) {
        return new SkuScrollBadgesBinder(adultHandler, featureChecker);
    }

    @Override // Pc.a
    public SkuScrollBadgesBinder get() {
        return newInstance(this.adultHandlerProvider.get(), this.featureCheckerProvider.get());
    }
}
