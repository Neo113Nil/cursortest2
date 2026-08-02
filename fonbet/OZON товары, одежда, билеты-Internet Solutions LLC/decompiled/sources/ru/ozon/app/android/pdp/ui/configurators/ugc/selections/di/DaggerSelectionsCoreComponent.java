package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManagerImpl;

/* loaded from: classes6.dex */
public final class DaggerSelectionsCoreComponent {

    private static final class Factory implements SelectionsCoreComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponent.Factory
        public SelectionsCoreComponent create() {
            return new SelectionsCoreComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class SelectionsCoreComponentImpl implements SelectionsCoreComponent {
        private a<SelectionProductsEventManager> bindSelectionProductsEventManagerProvider;
        private a<SelectionProductsEventManagerImpl> selectionProductsEventManagerImplProvider;
        private final SelectionsCoreComponentImpl selectionsCoreComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93045id;
            private final SelectionsCoreComponentImpl selectionsCoreComponentImpl;

            SwitchingProvider(SelectionsCoreComponentImpl selectionsCoreComponentImpl, int i11) {
                this.selectionsCoreComponentImpl = selectionsCoreComponentImpl;
                this.f93045id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93045id == 0) {
                    return (T) new SelectionProductsEventManagerImpl();
                }
                throw new AssertionError(this.f93045id);
            }
        }

        /* synthetic */ SelectionsCoreComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.selectionsCoreComponentImpl, 0);
            this.selectionProductsEventManagerImplProvider = switchingProvider;
            this.bindSelectionProductsEventManagerProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentApi
        public SelectionProductsEventManager getSelectionProductsEventManager() {
            return this.bindSelectionProductsEventManagerProvider.get();
        }

        private SelectionsCoreComponentImpl() {
            this.selectionsCoreComponentImpl = this;
            initialize();
        }
    }

    public static SelectionsCoreComponent.Factory factory() {
        return new Factory(0);
    }
}
