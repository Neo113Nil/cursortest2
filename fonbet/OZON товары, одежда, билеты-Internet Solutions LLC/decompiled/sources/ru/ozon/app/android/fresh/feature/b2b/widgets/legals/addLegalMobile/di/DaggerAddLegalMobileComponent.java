package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.di;

import GZ.g;
import Jb.j;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.di.AddLegalMobileComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

/* loaded from: classes12.dex */
public final class DaggerAddLegalMobileComponent {

    private static final class AddLegalMobileComponentImpl implements AddLegalMobileComponent {
        private final AddLegalMobileComponentImpl addLegalMobileComponentImpl;
        private final NavigationComponentApi navigationComponentApi;

        /* synthetic */ AddLegalMobileComponentImpl(NavigationComponentApi navigationComponentApi, int i11) {
            this(navigationComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.di.AddLegalMobileComponent
        public g getOzonRouter() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return ozonRouter;
        }

        private AddLegalMobileComponentImpl(NavigationComponentApi navigationComponentApi) {
            this.addLegalMobileComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
        }
    }

    private static final class Factory implements AddLegalMobileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.di.AddLegalMobileComponent.Factory
        public AddLegalMobileComponent create(NavigationComponentApi navigationComponentApi) {
            navigationComponentApi.getClass();
            return new AddLegalMobileComponentImpl(navigationComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AddLegalMobileComponent.Factory factory() {
        return new Factory(0);
    }
}
