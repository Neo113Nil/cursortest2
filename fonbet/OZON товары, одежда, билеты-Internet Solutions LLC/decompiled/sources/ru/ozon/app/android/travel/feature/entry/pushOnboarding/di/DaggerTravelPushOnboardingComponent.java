package ru.ozon.app.android.travel.feature.entry.pushOnboarding.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingDataRepository;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingDataRepositoryImpl;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponent;

/* loaded from: classes7.dex */
public final class DaggerTravelPushOnboardingComponent {

    private static final class Factory implements TravelPushOnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponent.Factory
        public TravelPushOnboardingComponent create() {
            return new TravelPushOnboardingComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class TravelPushOnboardingComponentImpl implements TravelPushOnboardingComponent {
        private a<PushOnboardingDataRepository> bindRepositoryProvider;
        private a<PushOnboardingDataRepositoryImpl> pushOnboardingDataRepositoryImplProvider;
        private final TravelPushOnboardingComponentImpl travelPushOnboardingComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93798id;
            private final TravelPushOnboardingComponentImpl travelPushOnboardingComponentImpl;

            SwitchingProvider(TravelPushOnboardingComponentImpl travelPushOnboardingComponentImpl, int i11) {
                this.travelPushOnboardingComponentImpl = travelPushOnboardingComponentImpl;
                this.f93798id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93798id == 0) {
                    return (T) new PushOnboardingDataRepositoryImpl();
                }
                throw new AssertionError(this.f93798id);
            }
        }

        /* synthetic */ TravelPushOnboardingComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.travelPushOnboardingComponentImpl, 0);
            this.pushOnboardingDataRepositoryImplProvider = switchingProvider;
            this.bindRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentApi
        public PushOnboardingDataRepository getPushOnboardingRepository() {
            return this.bindRepositoryProvider.get();
        }

        private TravelPushOnboardingComponentImpl() {
            this.travelPushOnboardingComponentImpl = this;
            initialize();
        }
    }

    public static TravelPushOnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
