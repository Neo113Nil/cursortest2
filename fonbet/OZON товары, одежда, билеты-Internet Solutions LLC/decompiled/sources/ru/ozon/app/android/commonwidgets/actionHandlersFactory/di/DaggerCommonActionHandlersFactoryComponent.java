package ru.ozon.app.android.commonwidgets.actionHandlersFactory.di;

import Jb.j;
import android.content.Context;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.ActionHandlersFactoryImpl;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.CommonActionHandlersStore;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerCommonActionHandlersFactoryComponent {

    private static final class CommonActionHandlersFactoryComponentImpl implements CommonActionHandlersFactoryComponent {
        private final CommonActionHandlersFactoryComponentImpl commonActionHandlersFactoryComponentImpl;
        private final ContextComponentDependencies contextComponentDependencies;

        /* synthetic */ CommonActionHandlersFactoryComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(customActionHandlersComponentApi, contextComponentDependencies);
        }

        private ActionHandlersFactoryImpl actionHandlersFactoryImpl() {
            return new ActionHandlersFactoryImpl(getCommonActionHandlersStore());
        }

        @Override // ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi
        public ActionHandlersFactory getActionHandlersFactory() {
            return actionHandlersFactoryImpl();
        }

        @Override // ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent
        public CommonActionHandlersStore getCommonActionHandlersStore() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return CommonActionHandlersFactoryModule_Companion_ProvideCommonHandlersStoreFactory.provideCommonHandlersStore(context);
        }

        private CommonActionHandlersFactoryComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.commonActionHandlersFactoryComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
        }
    }

    private static final class Factory implements CommonActionHandlersFactoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent.Factory
        public CommonActionHandlersFactoryComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi, ContextComponentDependencies contextComponentDependencies) {
            customActionHandlersComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new CommonActionHandlersFactoryComponentImpl(customActionHandlersComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static CommonActionHandlersFactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
