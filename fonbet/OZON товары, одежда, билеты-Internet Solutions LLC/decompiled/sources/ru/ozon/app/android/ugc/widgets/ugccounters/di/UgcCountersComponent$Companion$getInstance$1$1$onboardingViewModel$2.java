package ru.ozon.app.android.ugc.widgets.ugccounters.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersComponent$Companion$getInstance$1$1$onboardingViewModel$2 extends AbstractC7737t implements Function0<UgcCountersOnboardingViewModel> {
    final /* synthetic */ UgcCountersComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersComponent$Companion$getInstance$1$1$onboardingViewModel$2(UgcCountersComponent$Companion$getInstance$1$1 ugcCountersComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = ugcCountersComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UgcCountersOnboardingViewModel invoke() {
        OnBoardingComponentApi onBoardingComponentApi;
        OnBoardingComponentApi onBoardingComponentApi2;
        OnBoardingComponentApi onBoardingComponentApi3;
        onBoardingComponentApi = this.this$0.getOnBoardingComponentApi();
        OnBoardingDisplayRepository defaultOnBoardingDisplayRepository = onBoardingComponentApi.getDefaultOnBoardingDisplayRepository();
        onBoardingComponentApi2 = this.this$0.getOnBoardingComponentApi();
        OnBoardingDisplayOnPageRepository defaultOnBoardingDisplayOnPageRepository = onBoardingComponentApi2.getDefaultOnBoardingDisplayOnPageRepository();
        onBoardingComponentApi3 = this.this$0.getOnBoardingComponentApi();
        return new UgcCountersOnboardingViewModel(defaultOnBoardingDisplayRepository, defaultOnBoardingDisplayOnPageRepository, onBoardingComponentApi3.getDefaultOnBoardingDisplayDisableRepository());
    }
}
