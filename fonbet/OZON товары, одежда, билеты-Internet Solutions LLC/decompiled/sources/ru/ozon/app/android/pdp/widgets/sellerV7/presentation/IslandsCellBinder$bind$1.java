package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class IslandsCellBinder$bind$1 extends C7735q implements Function2<OnBoardingDTO, View, Unit> {
    IslandsCellBinder$bind$1(Object obj) {
        super(2, obj, IslandsCellBinder.class, "bindOnboarding", "bindOnboarding(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OnBoardingDTO onBoardingDTO, View view) {
        invoke2(onBoardingDTO, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnBoardingDTO p02, View p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((IslandsCellBinder) this.receiver).bindOnboarding(p02, p12);
    }
}
