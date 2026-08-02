package ru.ozon.app.android.offline.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataImpl;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponent;

/* loaded from: classes6.dex */
public final class DaggerPdpOfflineScreenComponent {

    private static final class Factory implements PdpOfflineScreenComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.offline.di.PdpOfflineScreenComponent.Factory
        public PdpOfflineScreenComponent create() {
            return new PdpOfflineScreenComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class PdpOfflineScreenComponentImpl implements PdpOfflineScreenComponent {
        private a<PdpOfflineScreenWidgetsData> bindPdpEmptyScreenServiceProvider;
        private final PdpOfflineScreenComponentImpl pdpOfflineScreenComponentImpl;
        private a<PdpOfflineScreenWidgetsDataImpl> pdpOfflineScreenWidgetsDataImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92942id;
            private final PdpOfflineScreenComponentImpl pdpOfflineScreenComponentImpl;

            SwitchingProvider(PdpOfflineScreenComponentImpl pdpOfflineScreenComponentImpl, int i11) {
                this.pdpOfflineScreenComponentImpl = pdpOfflineScreenComponentImpl;
                this.f92942id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92942id == 0) {
                    return (T) new PdpOfflineScreenWidgetsDataImpl();
                }
                throw new AssertionError(this.f92942id);
            }
        }

        /* synthetic */ PdpOfflineScreenComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.pdpOfflineScreenComponentImpl, 0);
            this.pdpOfflineScreenWidgetsDataImplProvider = switchingProvider;
            this.bindPdpEmptyScreenServiceProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi
        public PdpOfflineScreenWidgetsData pdpEmptyScreenService() {
            return this.bindPdpEmptyScreenServiceProvider.get();
        }

        private PdpOfflineScreenComponentImpl() {
            this.pdpOfflineScreenComponentImpl = this;
            initialize();
        }
    }

    public static PdpOfflineScreenComponent.Factory factory() {
        return new Factory(0);
    }
}
