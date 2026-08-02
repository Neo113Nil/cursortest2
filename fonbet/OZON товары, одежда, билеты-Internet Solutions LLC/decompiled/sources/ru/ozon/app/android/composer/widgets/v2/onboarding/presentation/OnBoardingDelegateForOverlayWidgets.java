package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgets;", "", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "bind", "(Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;)V", "unbind", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OnBoardingDelegateForOverlayWidgets {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(OnBoardingDelegateForOverlayWidgets onBoardingDelegateForOverlayWidgets, View view, OnBoardingCutConfig onBoardingCutConfig, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i11 & 2) != 0) {
                onBoardingCutConfig = new OnBoardingCutConfig(null, null, null, null, null, null, null, false, 255, null);
            }
            if ((i11 & 4) != 0) {
                function0 = null;
            }
            onBoardingDelegateForOverlayWidgets.bind(view, onBoardingCutConfig, function0);
        }
    }

    void bind(@NotNull View view, @NotNull OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> onCropAreaClick);

    void unbind();
}
