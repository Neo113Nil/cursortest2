package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultV4LoadingWidgetViewHolder$loadAdapter$1 extends C7735q implements InterfaceC6511n<View, View, OnBoardingDTO, Unit> {
    AviaSearchResultV4LoadingWidgetViewHolder$loadAdapter$1(Object obj) {
        super(3, obj, AviaSearchResultV4LoadingWidgetViewHolder.class, "bindOnBoarding", "bindOnBoarding(Landroid/view/View;Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(View view, View view2, OnBoardingDTO onBoardingDTO) {
        invoke2(view, view2, onBoardingDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View p02, View p12, OnBoardingDTO p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((AviaSearchResultV4LoadingWidgetViewHolder) this.receiver).bindOnBoarding(p02, p12, p22);
    }
}
