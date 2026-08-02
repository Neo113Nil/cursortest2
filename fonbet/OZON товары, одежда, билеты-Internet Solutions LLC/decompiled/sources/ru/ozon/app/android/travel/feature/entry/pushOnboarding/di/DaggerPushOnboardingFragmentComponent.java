package ru.ozon.app.android.travel.feature.entry.pushOnboarding.di;

import GZ.g;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingDataRepository;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.PushOnboardingFragmentComponent;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment_MembersInjector;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingViewModel;

/* loaded from: classes3.dex */
public final class DaggerPushOnboardingFragmentComponent {

    private static final class Factory implements PushOnboardingFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.PushOnboardingFragmentComponent.Factory
        public PushOnboardingFragmentComponent create(NavigationComponentApi navigationComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            navigationComponentApi.getClass();
            travelPushOnboardingComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            return new PushOnboardingFragmentComponentImpl(navigationComponentApi, travelPushOnboardingComponentApi, androidPlatformComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class PushOnboardingFragmentComponentImpl implements PushOnboardingFragmentComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final NavigationComponentApi navigationComponentApi;
        private final PushOnboardingFragmentComponentImpl pushOnboardingFragmentComponentImpl;
        private a<PushOnboardingViewModel> pushOnboardingViewModelProvider;
        private final TravelPushOnboardingComponentApi travelPushOnboardingComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93797id;
            private final PushOnboardingFragmentComponentImpl pushOnboardingFragmentComponentImpl;

            SwitchingProvider(PushOnboardingFragmentComponentImpl pushOnboardingFragmentComponentImpl, int i11) {
                this.pushOnboardingFragmentComponentImpl = pushOnboardingFragmentComponentImpl;
                this.f93797id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93797id != 0) {
                    throw new AssertionError(this.f93797id);
                }
                PushOnboardingDataRepository pushOnboardingRepository = this.pushOnboardingFragmentComponentImpl.travelPushOnboardingComponentApi.getPushOnboardingRepository();
                j.c(pushOnboardingRepository);
                EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler = this.pushOnboardingFragmentComponentImpl.androidPlatformComponentApi.getEnableNotificationsSuggestingHandler();
                j.c(enableNotificationsSuggestingHandler);
                return (T) new PushOnboardingViewModel(pushOnboardingRepository, enableNotificationsSuggestingHandler);
            }
        }

        /* synthetic */ PushOnboardingFragmentComponentImpl(NavigationComponentApi navigationComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(navigationComponentApi, travelPushOnboardingComponentApi, androidPlatformComponentApi);
        }

        private void initialize(NavigationComponentApi navigationComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.pushOnboardingViewModelProvider = new SwitchingProvider(this.pushOnboardingFragmentComponentImpl, 0);
        }

        private PushOnboardingFragment injectPushOnboardingFragment(PushOnboardingFragment pushOnboardingFragment) {
            PushOnboardingFragment_MembersInjector.injectViewModelProvider(pushOnboardingFragment, this.pushOnboardingViewModelProvider);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            PushOnboardingFragment_MembersInjector.injectRouter(pushOnboardingFragment, ozonRouter);
            return pushOnboardingFragment;
        }

        @Override // ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.PushOnboardingFragmentComponent
        public void inject(PushOnboardingFragment pushOnboardingFragment) {
            injectPushOnboardingFragment(pushOnboardingFragment);
        }

        private PushOnboardingFragmentComponentImpl(NavigationComponentApi navigationComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.pushOnboardingFragmentComponentImpl = this;
            this.travelPushOnboardingComponentApi = travelPushOnboardingComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            initialize(navigationComponentApi, travelPushOnboardingComponentApi, androidPlatformComponentApi);
        }
    }

    public static PushOnboardingFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
