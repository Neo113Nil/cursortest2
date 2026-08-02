package ru.ozon.app.android.product.common.footer.di;

import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.common.footer.di.FooterComponent;

/* loaded from: classes13.dex */
public final class DaggerFooterComponent {

    private static final class Factory implements FooterComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.product.common.footer.di.FooterComponent.Factory
        public FooterComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new FooterComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FooterComponentImpl implements FooterComponent {
        private final FooterComponentImpl footerComponentImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ FooterComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private FooterComponentImpl(NetworkComponentApi networkComponentApi) {
            this.footerComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static FooterComponent.Factory factory() {
        return new Factory(0);
    }
}
