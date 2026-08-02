package ru.ozon.app.android.storefront.onboardingscreen.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponent;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractorImpl;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractorImpl_Factory;

/* loaded from: classes7.dex */
public final class DaggerOnboardingCheckerComponent {

    private static final class Factory implements OnboardingCheckerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponent.Factory
        public OnboardingCheckerComponent create(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            return new OnboardingCheckerComponentImpl(actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OnboardingCheckerComponentImpl implements OnboardingCheckerComponent {
        private a<OnboardingInteractor> bindOnBoardingCheckerInteractorProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private final OnboardingCheckerComponentImpl onboardingCheckerComponentImpl;
        private a<OnboardingInteractorImpl> onboardingInteractorImplProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        /* synthetic */ OnboardingCheckerComponentImpl(ActionComponentApi actionComponentApi, int i11) {
            this(actionComponentApi);
        }

        private void initialize(ActionComponentApi actionComponentApi) {
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            OnboardingInteractorImpl_Factory create = OnboardingInteractorImpl_Factory.create(getActionRepositoryProvider);
            this.onboardingInteractorImplProvider = create;
            this.bindOnBoardingCheckerInteractorProvider = d.b(create);
        }

        @Override // ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi
        public OnboardingInteractor getOnboardingCheckerInteractor() {
            return this.bindOnBoardingCheckerInteractorProvider.get();
        }

        private OnboardingCheckerComponentImpl(ActionComponentApi actionComponentApi) {
            this.onboardingCheckerComponentImpl = this;
            initialize(actionComponentApi);
        }
    }

    public static OnboardingCheckerComponent.Factory factory() {
        return new Factory(0);
    }
}
