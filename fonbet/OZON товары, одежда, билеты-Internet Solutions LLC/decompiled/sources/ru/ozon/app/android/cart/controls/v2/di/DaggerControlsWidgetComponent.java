package ru.ozon.app.android.cart.controls.v2.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsMapper;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

/* loaded from: classes11.dex */
public final class DaggerControlsWidgetComponent {

    private static final class ControlsWidgetComponentImpl implements ControlsWidgetComponent {
        private a<ControlsMapper> controlsMapperProvider;
        private final ControlsWidgetComponentImpl controlsWidgetComponentImpl;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<HandlersInhibitor> handlersInhibitorProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ControlsWidgetComponentImpl controlsWidgetComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92257id;

            SwitchingProvider(ControlsWidgetComponentImpl controlsWidgetComponentImpl, int i11) {
                this.controlsWidgetComponentImpl = controlsWidgetComponentImpl;
                this.f92257id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92257id;
                if (i11 == 0) {
                    return (T) new ControlsMapper();
                }
                if (i11 == 1) {
                    return (T) new HandlersInhibitor();
                }
                throw new AssertionError(this.f92257id);
            }
        }

        /* synthetic */ ControlsWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, ComposerComponentApi composerComponentApi, int i11) {
            this(customActionHandlersComponentApi, composerComponentApi);
        }

        private void initialize(CustomActionHandlersComponentApi customActionHandlersComponentApi, ComposerComponentApi composerComponentApi) {
            this.controlsMapperProvider = d.b(new SwitchingProvider(this.controlsWidgetComponentImpl, 0));
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.controlsWidgetComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent
        public ControlsMapper getMapper() {
            return this.controlsMapperProvider.get();
        }

        private ControlsWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, ComposerComponentApi composerComponentApi) {
            this.controlsWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(customActionHandlersComponentApi, composerComponentApi);
        }
    }

    private static final class Factory implements ControlsWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent.Factory
        public ControlsWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi, ComposerComponentApi composerComponentApi) {
            customActionHandlersComponentApi.getClass();
            composerComponentApi.getClass();
            return new ControlsWidgetComponentImpl(customActionHandlersComponentApi, composerComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ControlsWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
