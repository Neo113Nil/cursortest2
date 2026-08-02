package ru.ozon.app.android.composer.widgets.v2.onboarding.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnboardingDialogComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "view", "", "inject", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;)V", "Factory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OnboardingDialogComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnboardingDialogComponent$Factory;", "", "create", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnboardingDialogComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        OnboardingDialogComponent create(@NotNull NetworkComponentApi networkComponentApi);
    }

    void inject(@NotNull OnBoardingDialog view);
}
