package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "Lru/ozon/composer/ui/widget/k;", "viewHolder", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "bind", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;)V", "unbind", "()V", "Lkotlin/Function1;", "", "getOnShownListener", "()Lkotlin/jvm/functions/Function1;", "setOnShownListener", "(Lkotlin/jvm/functions/Function1;)V", "onShownListener", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OnBoardingDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(OnBoardingDelegate onBoardingDelegate, k kVar, OnBoardingCutConfig onBoardingCutConfig, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i11 & 2) != 0) {
                onBoardingCutConfig = new OnBoardingCutConfig(null, null, null, null, null, null, null, false, 255, null);
            }
            if ((i11 & 4) != 0) {
                function0 = null;
            }
            onBoardingDelegate.bind(kVar, onBoardingCutConfig, function0);
        }
    }

    void bind(@NotNull k<?> viewHolder, @NotNull OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> onCropAreaClick);

    void setOnShownListener(Function1<? super Boolean, Unit> function1);

    void unbind();
}
