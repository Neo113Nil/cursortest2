package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper.BorderlessButtonMapper;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonViewFactory;

/* loaded from: classes11.dex */
public final class DaggerBorderlessButtonComponent {

    private static final class BorderlessButtonComponentImpl implements BorderlessButtonComponent {
        private final BorderlessButtonComponentImpl borderlessButtonComponentImpl;
        private a<BorderlessButtonMapper> borderlessButtonMapperProvider;
        private a<BorderlessButtonViewFactory> borderlessButtonViewFactoryProvider;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final BorderlessButtonComponentImpl borderlessButtonComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92446id;

            SwitchingProvider(BorderlessButtonComponentImpl borderlessButtonComponentImpl, int i11) {
                this.borderlessButtonComponentImpl = borderlessButtonComponentImpl;
                this.f92446id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92446id;
                if (i11 == 0) {
                    return (T) new BorderlessButtonMapper();
                }
                if (i11 == 1) {
                    return (T) new BorderlessButtonViewFactory();
                }
                throw new AssertionError(this.f92446id);
            }
        }

        /* synthetic */ BorderlessButtonComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        private void initialize(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.borderlessButtonMapperProvider = d.b(new SwitchingProvider(this.borderlessButtonComponentImpl, 0));
            this.borderlessButtonViewFactoryProvider = d.b(new SwitchingProvider(this.borderlessButtonComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent
        public BorderlessButtonMapper getMapper() {
            return this.borderlessButtonMapperProvider.get();
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent
        public BorderlessButtonViewFactory getViewFactory() {
            return this.borderlessButtonViewFactoryProvider.get();
        }

        private BorderlessButtonComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.borderlessButtonComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(customActionHandlersComponentApi);
        }
    }

    private static final class Factory implements BorderlessButtonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent.Factory
        public BorderlessButtonComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new BorderlessButtonComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static BorderlessButtonComponent.Factory factory() {
        return new Factory(0);
    }
}
