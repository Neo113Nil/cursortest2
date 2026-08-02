package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnboardingDialogComponent;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog_MembersInjector;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;

/* loaded from: classes11.dex */
public final class DaggerOnboardingDialogComponent {

    private static final class Factory implements OnboardingDialogComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnboardingDialogComponent.Factory
        public OnboardingDialogComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new OnboardingDialogComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class OnboardingDialogComponentImpl implements OnboardingDialogComponent {
        private final NetworkComponentApi networkComponentApi;
        private final OnboardingDialogComponentImpl onboardingDialogComponentImpl;

        /* synthetic */ OnboardingDialogComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private OnBoardingDialog injectOnBoardingDialog(OnBoardingDialog onBoardingDialog) {
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            OnBoardingDialog_MembersInjector.injectAppVersionService(onBoardingDialog, appVersionService);
            return onBoardingDialog;
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnboardingDialogComponent
        public void inject(OnBoardingDialog onBoardingDialog) {
            injectOnBoardingDialog(onBoardingDialog);
        }

        private OnboardingDialogComponentImpl(NetworkComponentApi networkComponentApi) {
            this.onboardingDialogComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    public static OnboardingDialogComponent.Factory factory() {
        return new Factory(0);
    }
}
