package ru.ozon.app.android.storefront.onboardingscreen.onboardingv2;

import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnboardingActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "onboardingInteractor", "Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;", "<init>", "(Lru/ozon/app/android/storefront/onboardingscreen/domain/OnboardingInteractor;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnboardingActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final OnboardingInteractor onboardingInteractor;

    public OnboardingActionHandler(@NotNull OnboardingInteractor onboardingInteractor) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.onboardingInteractor = onboardingInteractor;
        this.actionId = "onboardingAction";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (Intrinsics.d(click.getId(), getActionId())) {
                if (((AndroidPlatformComponentApi) handlerRefs.getRefs().getComponent(AndroidPlatformComponentApi.class)).getAppType() != AppType.SELECT) {
                    this.onboardingInteractor.setFlowAction(click);
                    return;
                }
                r a11 = handlerRefs.getRefs().getContainer().a();
                AppOnboardingViewModel appOnboardingViewModel = a11 != null ? (AppOnboardingViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingActionHandler$processAction$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        AppOnboardingViewModel appOnboardingViewModel2 = ((AppOnboardingComponentApi) CustomActionHandler.HandlerReferences.this.getRefs().getComponent(AppOnboardingComponentApi.class)).appOnboardingViewModel();
                        Intrinsics.g(appOnboardingViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return appOnboardingViewModel2;
                    }
                }).a(AppOnboardingViewModel.class) : null;
                if (appOnboardingViewModel != null) {
                    appOnboardingViewModel.handle(click);
                }
            }
        }
    }
}
