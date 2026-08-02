package ru.ozon.app.android.common.ui.actionCards.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.common.ui.actionCards.ButtonMeasurer;
import ru.ozon.app.android.common.ui.actionCards.ButtonMeasurer_Factory;
import ru.ozon.app.android.common.ui.actionCards.core.ActionCardsMapper;
import ru.ozon.app.android.common.ui.actionCards.core.ActionCardsMapper_Factory;
import ru.ozon.app.android.common.ui.actionCards.di.ActionCardsComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes11.dex */
public final class DaggerActionCardsComponent {

    private static final class ActionCardsComponentImpl implements ActionCardsComponent {
        private final ActionCardsComponentImpl actionCardsComponentImpl;
        private a<ActionCardsMapper> actionCardsMapperProvider;
        private a<ButtonMeasurer> buttonMeasurerProvider;
        private a<Context> getContextProvider;

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        /* synthetic */ ActionCardsComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            ButtonMeasurer_Factory create = ButtonMeasurer_Factory.create(getContextProvider);
            this.buttonMeasurerProvider = create;
            this.actionCardsMapperProvider = d.b(ActionCardsMapper_Factory.create(create));
        }

        @Override // ru.ozon.app.android.common.ui.actionCards.di.ActionCardsComponent
        public ActionCardsMapper getMapper() {
            return this.actionCardsMapperProvider.get();
        }

        private ActionCardsComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.actionCardsComponentImpl = this;
            initialize(contextComponentDependencies);
        }
    }

    private static final class Factory implements ActionCardsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.ui.actionCards.di.ActionCardsComponent.Factory
        public ActionCardsComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new ActionCardsComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static ActionCardsComponent.Factory factory() {
        return new Factory(0);
    }
}
