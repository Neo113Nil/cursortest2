package ru.ozon.app.android.action.custom.di;

import Jb.j;
import Pc.a;
import Vg.d;
import android.content.Context;
import ru.ozon.app.android.action.custom.CustomActionHandlersStoreFactoryImpl;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerCustomActionHandlersComponent {

    private static final class CustomActionHandlersComponentImpl implements CustomActionHandlersComponent {
        private a<d> bindCustomActionHandlerFactoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final CustomActionHandlersComponentImpl customActionHandlersComponentImpl;
        private a<CustomActionHandlersStoreFactoryImpl> customActionHandlersStoreFactoryImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CustomActionHandlersComponentImpl customActionHandlersComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92134id;

            SwitchingProvider(CustomActionHandlersComponentImpl customActionHandlersComponentImpl, int i11) {
                this.customActionHandlersComponentImpl = customActionHandlersComponentImpl;
                this.f92134id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92134id != 0) {
                    throw new AssertionError(this.f92134id);
                }
                Context context = this.customActionHandlersComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                return (T) new CustomActionHandlersStoreFactoryImpl(context);
            }
        }

        /* synthetic */ CustomActionHandlersComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.customActionHandlersComponentImpl, 0);
            this.customActionHandlersStoreFactoryImplProvider = switchingProvider;
            this.bindCustomActionHandlerFactoryProvider = Jb.d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi
        public d getCustomActionHandlersStoreFactory() {
            return this.bindCustomActionHandlerFactoryProvider.get();
        }

        private CustomActionHandlersComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.customActionHandlersComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies);
        }
    }

    private static final class Factory implements CustomActionHandlersComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.action.custom.di.CustomActionHandlersComponent.Factory
        public CustomActionHandlersComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new CustomActionHandlersComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static CustomActionHandlersComponent.Factory factory() {
        return new Factory(0);
    }
}
