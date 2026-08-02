package ru.ozon.app.android.common.header.di;

import Jb.j;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderMapper;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.header.di.HeaderComponent;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;

/* loaded from: classes6.dex */
public final class DaggerHeaderComponent {

    private static final class Factory implements HeaderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.header.di.HeaderComponent.Factory
        public HeaderComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi) {
            customActionHandlersComponentApi.getClass();
            commonActionHandlersFactoryComponentApi.getClass();
            return new HeaderComponentImpl(customActionHandlersComponentApi, commonActionHandlersFactoryComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class HeaderComponentImpl implements HeaderComponent {
        private final CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final HeaderComponentImpl headerComponentImpl;

        /* synthetic */ HeaderComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, int i11) {
            this(customActionHandlersComponentApi, commonActionHandlersFactoryComponentApi);
        }

        @Override // ru.ozon.app.android.common.header.di.HeaderComponent
        public ActionHandlersFactory getActionHandlersFactory() {
            ActionHandlersFactory actionHandlersFactory = this.commonActionHandlersFactoryComponentApi.getActionHandlersFactory();
            j.c(actionHandlersFactory);
            return actionHandlersFactory;
        }

        @Override // ru.ozon.app.android.common.header.di.HeaderComponent
        public HeaderMapper getMapper() {
            return new HeaderMapper();
        }

        private HeaderComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi) {
            this.headerComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.commonActionHandlersFactoryComponentApi = commonActionHandlersFactoryComponentApi;
        }
    }

    public static HeaderComponent.Factory factory() {
        return new Factory(0);
    }
}
