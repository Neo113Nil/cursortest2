package ru.ozon.app.android.product.common.header.di;

import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.common.header.di.HeaderComponent;

/* loaded from: classes13.dex */
public final class DaggerHeaderComponent {

    private static final class Factory implements HeaderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.product.common.header.di.HeaderComponent.Factory
        public HeaderComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new HeaderComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class HeaderComponentImpl implements HeaderComponent {
        private final HeaderComponentImpl headerComponentImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ HeaderComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private HeaderComponentImpl(NetworkComponentApi networkComponentApi) {
            this.headerComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static HeaderComponent.Factory factory() {
        return new Factory(0);
    }
}
