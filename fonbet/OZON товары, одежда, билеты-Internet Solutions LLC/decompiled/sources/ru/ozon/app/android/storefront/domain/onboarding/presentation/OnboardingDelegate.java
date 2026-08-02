package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "", "Landroid/view/View;", "view", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;", "onboardingCutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboardingModel", "bind", "(Landroid/view/View;Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;)V", "unbind", "()V", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OnboardingDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(OnboardingDelegate onboardingDelegate, View view, OnboardingCutConfig onboardingCutConfig, Function0 function0, OnboardingModel onboardingModel, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i11 & 2) != 0) {
                onboardingCutConfig = new OnboardingCutConfig(0, 0.0f, 0.0f, 7, null);
            }
            if ((i11 & 4) != 0) {
                function0 = null;
            }
            if ((i11 & 8) != 0) {
                onboardingModel = null;
            }
            onboardingDelegate.bind(view, onboardingCutConfig, function0, onboardingModel);
        }
    }

    void bind(@NotNull View view, @NotNull OnboardingCutConfig onboardingCutConfig, Function0<Unit> onCropAreaClick, OnboardingModel onboardingModel);

    void unbind();
}
