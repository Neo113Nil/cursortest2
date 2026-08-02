package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AddToFavoritesButtonWidgetViewHolder$bind$2 extends C7735q implements Function1<OnBoardingDTO, Unit> {
    AddToFavoritesButtonWidgetViewHolder$bind$2(Object obj) {
        super(1, obj, AddToFavoritesButtonWidgetViewHolder.class, "bindOnBoarding", "bindOnBoarding(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnBoardingDTO onBoardingDTO) {
        invoke2(onBoardingDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnBoardingDTO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddToFavoritesButtonWidgetViewHolder) this.receiver).bindOnBoarding(p02);
    }
}
