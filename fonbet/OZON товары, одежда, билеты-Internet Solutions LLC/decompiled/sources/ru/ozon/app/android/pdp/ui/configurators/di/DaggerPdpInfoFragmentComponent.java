package ru.ozon.app.android.pdp.ui.configurators.di;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.di.PdpInfoFragmentComponent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.info.PdpInfoFragment;
import ru.ozon.app.android.pdp.ui.configurators.ugc.info.PdpInfoFragment_MembersInjector;

/* loaded from: classes13.dex */
public final class DaggerPdpInfoFragmentComponent {

    private static final class Factory implements PdpInfoFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.di.PdpInfoFragmentComponent.Factory
        public PdpInfoFragmentComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new PdpInfoFragmentComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PdpInfoFragmentComponentImpl implements PdpInfoFragmentComponent {
        private final NavigationComponentApi navigationComponentApi;
        private final PdpInfoFragmentComponentImpl pdpInfoFragmentComponentImpl;

        /* synthetic */ PdpInfoFragmentComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        private PdpInfoFragment injectPdpInfoFragment(PdpInfoFragment pdpInfoFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            PdpInfoFragment_MembersInjector.injectScreenRouter(pdpInfoFragment, ozonRouter);
            return pdpInfoFragment;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.di.PdpInfoFragmentComponent
        public void inject(PdpInfoFragment pdpInfoFragment) {
            injectPdpInfoFragment(pdpInfoFragment);
        }

        private PdpInfoFragmentComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.pdpInfoFragmentComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    public static PdpInfoFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
