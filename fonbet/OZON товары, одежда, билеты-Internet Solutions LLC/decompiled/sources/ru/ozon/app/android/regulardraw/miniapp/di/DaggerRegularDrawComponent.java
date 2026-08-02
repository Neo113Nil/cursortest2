package ru.ozon.app.android.regulardraw.miniapp.di;

import EZ.h;
import GZ.g;
import Jb.j;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.regulardraw.miniapp.RegularDrawRootFragment;
import ru.ozon.app.android.regulardraw.miniapp.RegularDrawRootFragment_MembersInjector;
import ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawComponent;

/* loaded from: classes13.dex */
public final class DaggerRegularDrawComponent {

    private static final class Factory implements RegularDrawComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawComponent.Factory
        public RegularDrawComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new RegularDrawComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class RegularDrawComponentImpl implements RegularDrawComponent {
        private final NavigationComponentApi navigationComponentApi;
        private final RegularDrawComponentImpl regularDrawComponentImpl;

        /* synthetic */ RegularDrawComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        private RegularDrawRootFragment injectRegularDrawRootFragment(RegularDrawRootFragment regularDrawRootFragment) {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            RegularDrawRootFragment_MembersInjector.injectRouter(regularDrawRootFragment, ozonRouter);
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            RegularDrawRootFragment_MembersInjector.injectNavigatorHolder(regularDrawRootFragment, navigatorHolder);
            return regularDrawRootFragment;
        }

        @Override // ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawComponent
        public void inject(RegularDrawRootFragment regularDrawRootFragment) {
            injectRegularDrawRootFragment(regularDrawRootFragment);
        }

        private RegularDrawComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.regularDrawComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    public static RegularDrawComponent.Factory factory() {
        return new Factory(0);
    }
}
