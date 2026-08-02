package ru.ozon.app.android.storefront.widgets.profile.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileCellComponent$Companion$create$1$1$onBoardingViewModel$2 extends AbstractC7737t implements Function0<BaseOnBoardingViewModel.Default> {
    final /* synthetic */ ProfileCellComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileCellComponent$Companion$create$1$1$onBoardingViewModel$2(ProfileCellComponent$Companion$create$1$1 profileCellComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = profileCellComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseOnBoardingViewModel.Default invoke() {
        OnBoardingComponentApi onBoardingComponentApi;
        OnBoardingComponentApi onBoardingComponentApi2;
        OnBoardingDisplayRepository.Default r12 = new OnBoardingDisplayRepository.Default(this.this$0.getSharedPrefs());
        onBoardingComponentApi = this.this$0.commonOnboardingComponentApi;
        OnBoardingDisplayOnPageRepository defaultOnBoardingDisplayOnPageRepository = onBoardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository();
        onBoardingComponentApi2 = this.this$0.commonOnboardingComponentApi;
        return new BaseOnBoardingViewModel.Default(r12, defaultOnBoardingDisplayOnPageRepository, onBoardingComponentApi2.getDefaultOnBoardingDisplayDisableRepository());
    }
}
