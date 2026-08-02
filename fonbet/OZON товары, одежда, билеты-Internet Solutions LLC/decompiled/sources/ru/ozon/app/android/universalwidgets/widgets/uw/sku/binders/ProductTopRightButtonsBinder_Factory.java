package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils;

/* loaded from: classes2.dex */
public final class ProductTopRightButtonsBinder_Factory implements e<ProductTopRightButtonsBinder> {
    private final a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtilsProvider;

    public ProductTopRightButtonsBinder_Factory(a<TopRightButtonsViewHolderUtils> aVar) {
        this.topRightButtonsViewHolderUtilsProvider = aVar;
    }

    public static ProductTopRightButtonsBinder_Factory create(a<TopRightButtonsViewHolderUtils> aVar) {
        return new ProductTopRightButtonsBinder_Factory(aVar);
    }

    public static ProductTopRightButtonsBinder newInstance(TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils) {
        return new ProductTopRightButtonsBinder(topRightButtonsViewHolderUtils);
    }

    @Override // Pc.a
    public ProductTopRightButtonsBinder get() {
        return newInstance(this.topRightButtonsViewHolderUtilsProvider.get());
    }
}
