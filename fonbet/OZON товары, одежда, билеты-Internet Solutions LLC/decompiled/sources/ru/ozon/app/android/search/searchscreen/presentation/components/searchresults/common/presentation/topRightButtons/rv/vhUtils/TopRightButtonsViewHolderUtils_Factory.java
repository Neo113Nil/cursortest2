package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils;

import Jb.e;
import Pc.a;

/* loaded from: classes13.dex */
public final class TopRightButtonsViewHolderUtils_Factory implements e<TopRightButtonsViewHolderUtils> {
    private final a<TopRightButtonsViewHolderBinder> topRightButtonsViewHolderBinderProvider;
    private final a<TopRightButtonViewHolderFactory> vhFactoryTopRightButtonProvider;

    public TopRightButtonsViewHolderUtils_Factory(a<TopRightButtonViewHolderFactory> aVar, a<TopRightButtonsViewHolderBinder> aVar2) {
        this.vhFactoryTopRightButtonProvider = aVar;
        this.topRightButtonsViewHolderBinderProvider = aVar2;
    }

    public static TopRightButtonsViewHolderUtils_Factory create(a<TopRightButtonViewHolderFactory> aVar, a<TopRightButtonsViewHolderBinder> aVar2) {
        return new TopRightButtonsViewHolderUtils_Factory(aVar, aVar2);
    }

    public static TopRightButtonsViewHolderUtils newInstance(TopRightButtonViewHolderFactory topRightButtonViewHolderFactory, TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder) {
        return new TopRightButtonsViewHolderUtils(topRightButtonViewHolderFactory, topRightButtonsViewHolderBinder);
    }

    @Override // Pc.a
    public TopRightButtonsViewHolderUtils get() {
        return newInstance(this.vhFactoryTopRightButtonProvider.get(), this.topRightButtonsViewHolderBinderProvider.get());
    }
}
