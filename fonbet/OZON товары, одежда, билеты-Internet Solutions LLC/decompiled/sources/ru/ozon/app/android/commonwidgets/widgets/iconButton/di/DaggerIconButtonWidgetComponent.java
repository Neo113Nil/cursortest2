package ru.ozon.app.android.commonwidgets.widgets.iconButton.di;

import Jb.j;
import Jb.m;
import Pc.a;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.di.IconButtonWidgetComponent;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

/* loaded from: classes11.dex */
public final class DaggerIconButtonWidgetComponent {

    private static final class Factory implements IconButtonWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.iconButton.di.IconButtonWidgetComponent.Factory
        public IconButtonWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new IconButtonWidgetComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class IconButtonWidgetComponentImpl implements IconButtonWidgetComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private final IconButtonWidgetComponentImpl iconButtonWidgetComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {
            private final IconButtonWidgetComponentImpl iconButtonWidgetComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92458id;

            SwitchingProvider(IconButtonWidgetComponentImpl iconButtonWidgetComponentImpl, int i11) {
                this.iconButtonWidgetComponentImpl = iconButtonWidgetComponentImpl;
                this.f92458id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92458id == 0) {
                    return (T) new HandlersInhibitor();
                }
                throw new AssertionError(this.f92458id);
            }
        }

        /* synthetic */ IconButtonWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        private void initialize(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.iconButtonWidgetComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.iconButton.di.IconButtonWidgetComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.iconButton.di.IconButtonWidgetComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        private IconButtonWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.iconButtonWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            initialize(customActionHandlersComponentApi);
        }
    }

    public static IconButtonWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
