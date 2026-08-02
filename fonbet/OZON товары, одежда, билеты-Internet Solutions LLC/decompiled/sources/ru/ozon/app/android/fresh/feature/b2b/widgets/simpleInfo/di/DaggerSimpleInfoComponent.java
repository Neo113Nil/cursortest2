package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.body.SimpleInfoBodyMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.footer.SimpleInfoFooterMapper;

/* loaded from: classes12.dex */
public final class DaggerSimpleInfoComponent {

    private static final class Factory implements SimpleInfoComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent.Factory
        public SimpleInfoComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new SimpleInfoComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SimpleInfoComponentImpl implements SimpleInfoComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final SimpleInfoComponentImpl simpleInfoComponentImpl;

        /* synthetic */ SimpleInfoComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent
        public SimpleInfoBodyMapper getSimpleInfoBodyMapper() {
            return new SimpleInfoBodyMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent
        public SimpleInfoFooterMapper getSimpleInfoFooterMapper() {
            return new SimpleInfoFooterMapper();
        }

        private SimpleInfoComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.simpleInfoComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static SimpleInfoComponent.Factory factory() {
        return new Factory(0);
    }
}
