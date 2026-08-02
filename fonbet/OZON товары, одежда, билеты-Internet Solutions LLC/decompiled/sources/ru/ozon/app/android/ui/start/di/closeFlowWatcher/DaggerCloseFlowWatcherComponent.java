package ru.ozon.app.android.ui.start.di.closeFlowWatcher;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.storefront.onboardingscreen.closeFlowWatcher.OnboardingCloseFlowWatcher;
import ru.ozon.app.android.ui.start.OnboardingCloseFlowWatcherImpl;
import ru.ozon.app.android.ui.start.di.closeFlowWatcher.CloseFlowWatcherComponent;

/* loaded from: classes7.dex */
public final class DaggerCloseFlowWatcherComponent {

    private static final class CloseFlowWatcherComponentImpl implements CloseFlowWatcherComponent {
        private a<OnboardingCloseFlowWatcher> bindCloseFlowWatcherProvider;
        private final CloseFlowWatcherComponentImpl closeFlowWatcherComponentImpl;
        private a<OnboardingCloseFlowWatcherImpl> onboardingCloseFlowWatcherImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CloseFlowWatcherComponentImpl closeFlowWatcherComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f94542id;

            SwitchingProvider(CloseFlowWatcherComponentImpl closeFlowWatcherComponentImpl, int i11) {
                this.closeFlowWatcherComponentImpl = closeFlowWatcherComponentImpl;
                this.f94542id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94542id == 0) {
                    return (T) new OnboardingCloseFlowWatcherImpl();
                }
                throw new AssertionError(this.f94542id);
            }
        }

        /* synthetic */ CloseFlowWatcherComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.closeFlowWatcherComponentImpl, 0);
            this.onboardingCloseFlowWatcherImplProvider = switchingProvider;
            this.bindCloseFlowWatcherProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi
        public OnboardingCloseFlowWatcher getCloseFlowWatcher() {
            return this.bindCloseFlowWatcherProvider.get();
        }

        private CloseFlowWatcherComponentImpl() {
            this.closeFlowWatcherComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements CloseFlowWatcherComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ui.start.di.closeFlowWatcher.CloseFlowWatcherComponent.Factory
        public CloseFlowWatcherComponent create() {
            return new CloseFlowWatcherComponentImpl(0);
        }

        private Factory() {
        }
    }

    public static CloseFlowWatcherComponent.Factory factory() {
        return new Factory(0);
    }
}
