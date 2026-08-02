package ru.ozon.app.android.tileselector.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.tileselector.di.TileSelectorComponent;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProvider;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProviderImpl;

/* loaded from: classes7.dex */
public final class DaggerTileSelectorComponent {

    private static final class Factory implements TileSelectorComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.tileselector.di.TileSelectorComponent.Factory
        public TileSelectorComponent create() {
            return new TileSelectorComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class TileSelectorComponentImpl implements TileSelectorComponent {
        private a<SelectedProductsManagerProvider> bindSelectedProductsManagerProvider;
        private a<SelectedProductsManagerProviderImpl> selectedProductsManagerProviderImplProvider;
        private final TileSelectorComponentImpl tileSelectorComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93611id;
            private final TileSelectorComponentImpl tileSelectorComponentImpl;

            SwitchingProvider(TileSelectorComponentImpl tileSelectorComponentImpl, int i11) {
                this.tileSelectorComponentImpl = tileSelectorComponentImpl;
                this.f93611id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93611id == 0) {
                    return (T) new SelectedProductsManagerProviderImpl();
                }
                throw new AssertionError(this.f93611id);
            }
        }

        /* synthetic */ TileSelectorComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.tileSelectorComponentImpl, 0);
            this.selectedProductsManagerProviderImplProvider = switchingProvider;
            this.bindSelectedProductsManagerProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.tileselector.di.TileSelectorComponentApi
        public SelectedProductsManagerProvider getSelectedProductsManagerProvider() {
            return this.bindSelectedProductsManagerProvider.get();
        }

        private TileSelectorComponentImpl() {
            this.tileSelectorComponentImpl = this;
            initialize();
        }
    }

    public static TileSelectorComponent.Factory factory() {
        return new Factory(0);
    }
}
