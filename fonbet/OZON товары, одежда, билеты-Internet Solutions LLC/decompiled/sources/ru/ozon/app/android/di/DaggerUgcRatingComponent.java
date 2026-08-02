package ru.ozon.app.android.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.di.UgcRatingComponent;
import ru.ozon.app.android.ugcratingmolecule.presentation.factory.UgcRatingDelegateFactory;
import ru.ozon.app.android.ugcratingmolecule.presentation.factory.UgcRatingDelegateFactoryImpl;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;
import ru.ozon.app.android.ugcratingservice.UgcRatingServiceImpl;

/* loaded from: classes6.dex */
public final class DaggerUgcRatingComponent {

    private static final class Factory implements UgcRatingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.di.UgcRatingComponent.Factory
        public UgcRatingComponent create() {
            return new UgcRatingComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class UgcRatingComponentImpl implements UgcRatingComponent {
        private a<UgcRatingDelegateFactory> bindUgcRatingDelegateFactoryProvider;
        private a<UgcRatingService> bindUgcRatingServiceProvider;
        private final UgcRatingComponentImpl ugcRatingComponentImpl;
        private a<UgcRatingDelegateFactoryImpl> ugcRatingDelegateFactoryImplProvider;
        private a<UgcRatingServiceImpl> ugcRatingServiceImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92519id;
            private final UgcRatingComponentImpl ugcRatingComponentImpl;

            SwitchingProvider(UgcRatingComponentImpl ugcRatingComponentImpl, int i11) {
                this.ugcRatingComponentImpl = ugcRatingComponentImpl;
                this.f92519id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92519id;
                if (i11 == 0) {
                    return (T) new UgcRatingServiceImpl();
                }
                if (i11 == 1) {
                    return (T) new UgcRatingDelegateFactoryImpl((UgcRatingService) this.ugcRatingComponentImpl.bindUgcRatingServiceProvider.get());
                }
                throw new AssertionError(this.f92519id);
            }
        }

        /* synthetic */ UgcRatingComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.ugcRatingComponentImpl, 0);
            this.ugcRatingServiceImplProvider = switchingProvider;
            this.bindUgcRatingServiceProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.ugcRatingComponentImpl, 1);
            this.ugcRatingDelegateFactoryImplProvider = switchingProvider2;
            this.bindUgcRatingDelegateFactoryProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.di.UgcRatingComponentApi
        public UgcRatingDelegateFactory getUgcRatingDelegateFactory() {
            return this.bindUgcRatingDelegateFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.di.UgcRatingComponentApi
        public UgcRatingService getUgcRatingService() {
            return this.bindUgcRatingServiceProvider.get();
        }

        private UgcRatingComponentImpl() {
            this.ugcRatingComponentImpl = this;
            initialize();
        }
    }

    public static UgcRatingComponent.Factory factory() {
        return new Factory(0);
    }
}
