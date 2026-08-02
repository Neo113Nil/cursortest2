package ru.ozon.app.android.travel.ui.tabs.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.travel.ui.tabs.di.StorageComponent;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorageImpl;

/* loaded from: classes2.dex */
public final class DaggerStorageComponent {

    private static final class Factory implements StorageComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.ui.tabs.di.StorageComponent.Factory
        public StorageComponent create() {
            return new StorageComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class StorageComponentImpl implements StorageComponent {
        private final StorageComponentImpl storageComponentImpl;
        private a<TravelUnpaidOrderCountStorageImpl> travelUnpaidOrderCountStorageImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94344id;
            private final StorageComponentImpl storageComponentImpl;

            SwitchingProvider(StorageComponentImpl storageComponentImpl, int i11) {
                this.storageComponentImpl = storageComponentImpl;
                this.f94344id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94344id == 0) {
                    return (T) new TravelUnpaidOrderCountStorageImpl();
                }
                throw new AssertionError(this.f94344id);
            }
        }

        /* synthetic */ StorageComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.travelUnpaidOrderCountStorageImplProvider = d.b(new SwitchingProvider(this.storageComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi
        public TravelUnpaidOrderCountStorage unpaidOrderCountStorage() {
            return this.travelUnpaidOrderCountStorageImplProvider.get();
        }

        private StorageComponentImpl() {
            this.storageComponentImpl = this;
            initialize();
        }
    }

    public static StorageComponent.Factory factory() {
        return new Factory(0);
    }
}
