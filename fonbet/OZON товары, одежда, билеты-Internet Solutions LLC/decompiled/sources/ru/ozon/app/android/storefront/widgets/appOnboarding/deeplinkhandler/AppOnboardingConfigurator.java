package ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/deeplinkhandler/AppOnboardingConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;", "appOnboardingViewModel", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "references", "", "closeFlowAndMarkAsNotWizard", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingViewModel;Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppOnboardingConfigurator extends ComposerScreenConfig.PageConfigurator {
    /* JADX INFO: Access modifiers changed from: private */
    public final void closeFlowAndMarkAsNotWizard(AppOnboardingViewModel appOnboardingViewModel, ConfiguratorReferences references) {
        if (appOnboardingViewModel != null) {
            appOnboardingViewModel.markAsNotWizard();
        }
        ComposerExtKt.closeFlow(references.getOwnerContainer());
        if (appOnboardingViewModel != null) {
            appOnboardingViewModel.onFinished();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        r a11 = references.getOwnerContainer().a();
        C2399j.C(new C2408n0(references.getController().getEventsFlow(), new AppOnboardingConfigurator$onCreate$1(this, a11 != null ? (AppOnboardingViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler.AppOnboardingConfigurator$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AppOnboardingViewModel appOnboardingViewModel = ((AppOnboardingComponentApi) ConfiguratorReferences.this.getComposerWidgetComponentStorage().getComponent(AppOnboardingComponentApi.class)).appOnboardingViewModel();
                Intrinsics.g(appOnboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return appOnboardingViewModel;
            }
        }).a(AppOnboardingViewModel.class) : null, references, null)), K.a(references.getOwnerContainer().f()));
    }
}
