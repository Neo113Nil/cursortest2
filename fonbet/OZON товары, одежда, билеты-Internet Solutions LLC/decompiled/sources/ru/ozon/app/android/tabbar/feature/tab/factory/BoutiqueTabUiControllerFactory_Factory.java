package ru.ozon.app.android.tabbar.feature.tab.factory;

import Jb.e;

/* loaded from: classes7.dex */
public final class BoutiqueTabUiControllerFactory_Factory implements e<BoutiqueTabUiControllerFactory> {

    private static final class InstanceHolder {
        private static final BoutiqueTabUiControllerFactory_Factory INSTANCE = new BoutiqueTabUiControllerFactory_Factory();
    }

    public static BoutiqueTabUiControllerFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BoutiqueTabUiControllerFactory newInstance() {
        return new BoutiqueTabUiControllerFactory();
    }

    @Override // Pc.a
    public BoutiqueTabUiControllerFactory get() {
        return newInstance();
    }
}
