package ru.ozon.app.android.storefront.widgets.profile.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.widgets.profile.presentation.ProfileCellViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileCellViewHolder$showOnboardingIfExist$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProfileCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileCellViewHolder$showOnboardingIfExist$1$1(ProfileCellViewHolder profileCellViewHolder) {
        super(0);
        this.this$0 = profileCellViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        CommonOnboardingRepository commonOnboardingRepository;
        ProfileCellViewHolder.Companion companion;
        ProfileCellViewHolder.Companion companion2;
        ProfileCellViewHolder.Companion companion3;
        onBoardingDelegate = this.this$0.onboardingDelegate;
        if (onBoardingDelegate != null) {
            ProfileCellViewHolder profileCellViewHolder = this.this$0;
            companion = ProfileCellViewHolder.Companion;
            int onboarding_horizontal_margin = companion.getONBOARDING_HORIZONTAL_MARGIN();
            companion2 = ProfileCellViewHolder.Companion;
            int onboarding_vertical_margin = companion2.getONBOARDING_VERTICAL_MARGIN();
            companion3 = ProfileCellViewHolder.Companion;
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate, profileCellViewHolder, new OnBoardingCutConfig(null, null, null, null, Integer.valueOf(onboarding_vertical_margin), Integer.valueOf(onboarding_horizontal_margin), Float.valueOf(companion3.getONBOARDING_CORNER_RADIUS()), false, 143, null), null, 4, null);
        }
        commonOnboardingRepository = this.this$0.onboardingRepository;
        commonOnboardingRepository.onStartShowOnboarding();
    }
}
