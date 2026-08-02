package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di.EdoProvidersComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersMapper;

/* loaded from: classes12.dex */
public final class DaggerEdoProvidersComponent {

    private static final class EdoProvidersComponentImpl implements EdoProvidersComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final EdoProvidersComponentImpl edoProvidersComponentImpl;

        /* synthetic */ EdoProvidersComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di.EdoProvidersComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di.EdoProvidersComponent
        public EdoProvidersMapper getMapper() {
            return new EdoProvidersMapper();
        }

        private EdoProvidersComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.edoProvidersComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    private static final class Factory implements EdoProvidersComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di.EdoProvidersComponent.Factory
        public EdoProvidersComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new EdoProvidersComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static EdoProvidersComponent.Factory factory() {
        return new Factory(0);
    }
}
