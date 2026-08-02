package ru.ozon.app.android.pdp.di.components;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.di.components.CrossSaleListFragmentComponent;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListFragment;
import ru.ozon.app.android.pdp.view.crosssale.CrossSaleListFragment_MembersInjector;

/* loaded from: classes13.dex */
public final class DaggerCrossSaleListFragmentComponent {

    private static final class CrossSaleListFragmentComponentImpl implements CrossSaleListFragmentComponent {
        private final CrossSaleListFragmentComponentImpl crossSaleListFragmentComponentImpl;
        private final NavigationComponentApi navigationComponentApi;

        /* synthetic */ CrossSaleListFragmentComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        private CrossSaleListFragment injectCrossSaleListFragment(CrossSaleListFragment crossSaleListFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            CrossSaleListFragment_MembersInjector.injectRouter(crossSaleListFragment, ozonRouter);
            return crossSaleListFragment;
        }

        @Override // ru.ozon.app.android.pdp.di.components.CrossSaleListFragmentComponent
        public void inject(CrossSaleListFragment crossSaleListFragment) {
            injectCrossSaleListFragment(crossSaleListFragment);
        }

        private CrossSaleListFragmentComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.crossSaleListFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    private static final class Factory implements CrossSaleListFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.di.components.CrossSaleListFragmentComponent.Factory
        public CrossSaleListFragmentComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new CrossSaleListFragmentComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CrossSaleListFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
