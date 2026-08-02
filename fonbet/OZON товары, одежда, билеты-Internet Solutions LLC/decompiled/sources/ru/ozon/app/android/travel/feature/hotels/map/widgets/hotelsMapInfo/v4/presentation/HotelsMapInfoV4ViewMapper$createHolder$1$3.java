package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.di.HotelsMapInfoComponent;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewMapper$createHolder$1$3 extends AbstractC7737t implements Function0<TravelOnboardingViewModel> {
    final /* synthetic */ HotelsMapInfoComponent $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewMapper$createHolder$1$3(HotelsMapInfoComponent hotelsMapInfoComponent) {
        super(0);
        this.$this_with = hotelsMapInfoComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TravelOnboardingViewModel invoke() {
        return this.$this_with.getOnBoardingViewModel();
    }
}
