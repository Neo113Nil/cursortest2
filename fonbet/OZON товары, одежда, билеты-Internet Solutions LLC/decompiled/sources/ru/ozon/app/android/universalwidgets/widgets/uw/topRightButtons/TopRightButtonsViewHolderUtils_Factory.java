package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import Jb.e;
import Pc.a;

/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderUtils_Factory implements e<TopRightButtonsViewHolderUtils> {
    private final a<TopRightButtonsViewHolderBinder> topRightButtonsViewHolderBinderProvider;
    private final a<TopRightButtonsViewHolderFactory> vhFactoryTopRightButtonProvider;

    public TopRightButtonsViewHolderUtils_Factory(a<TopRightButtonsViewHolderFactory> aVar, a<TopRightButtonsViewHolderBinder> aVar2) {
        this.vhFactoryTopRightButtonProvider = aVar;
        this.topRightButtonsViewHolderBinderProvider = aVar2;
    }

    public static TopRightButtonsViewHolderUtils_Factory create(a<TopRightButtonsViewHolderFactory> aVar, a<TopRightButtonsViewHolderBinder> aVar2) {
        return new TopRightButtonsViewHolderUtils_Factory(aVar, aVar2);
    }

    public static TopRightButtonsViewHolderUtils newInstance(TopRightButtonsViewHolderFactory topRightButtonsViewHolderFactory, TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder) {
        return new TopRightButtonsViewHolderUtils(topRightButtonsViewHolderFactory, topRightButtonsViewHolderBinder);
    }

    @Override // Pc.a
    public TopRightButtonsViewHolderUtils get() {
        return newInstance(this.vhFactoryTopRightButtonProvider.get(), this.topRightButtonsViewHolderBinderProvider.get());
    }
}
