package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes2.dex */
public final class ProductStateRecyclerViewBinder_Factory implements e<ProductStateRecyclerViewBinder> {
    private final a<FeatureChecker> featureCheckerProvider;

    public ProductStateRecyclerViewBinder_Factory(a<FeatureChecker> aVar) {
        this.featureCheckerProvider = aVar;
    }

    public static ProductStateRecyclerViewBinder_Factory create(a<FeatureChecker> aVar) {
        return new ProductStateRecyclerViewBinder_Factory(aVar);
    }

    public static ProductStateRecyclerViewBinder newInstance(FeatureChecker featureChecker) {
        return new ProductStateRecyclerViewBinder(featureChecker);
    }

    @Override // Pc.a
    public ProductStateRecyclerViewBinder get() {
        return newInstance(this.featureCheckerProvider.get());
    }
}
