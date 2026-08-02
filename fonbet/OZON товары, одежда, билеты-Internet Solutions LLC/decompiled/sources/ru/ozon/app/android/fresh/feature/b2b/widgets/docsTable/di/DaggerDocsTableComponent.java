package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.data.DocsTableMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di.DocsTableComponent;

/* loaded from: classes12.dex */
public final class DaggerDocsTableComponent {

    private static final class DocsTableComponentImpl implements DocsTableComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final DocsTableComponentImpl docsTableComponentImpl;

        /* synthetic */ DocsTableComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di.DocsTableComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di.DocsTableComponent
        public DocsTableMapper getDocsTableMapper() {
            return new DocsTableMapper();
        }

        private DocsTableComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.docsTableComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    private static final class Factory implements DocsTableComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di.DocsTableComponent.Factory
        public DocsTableComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new DocsTableComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static DocsTableComponent.Factory factory() {
        return new Factory(0);
    }
}
