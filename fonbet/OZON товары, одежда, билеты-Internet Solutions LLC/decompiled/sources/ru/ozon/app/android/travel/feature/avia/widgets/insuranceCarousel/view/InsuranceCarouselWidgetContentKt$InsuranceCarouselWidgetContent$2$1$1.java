package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class InsuranceCarouselWidgetContentKt$InsuranceCarouselWidgetContent$2$1$1 extends C7735q implements Function1<InsuranceCarouselViewModelAction, Unit> {
    InsuranceCarouselWidgetContentKt$InsuranceCarouselWidgetContent$2$1$1(Object obj) {
        super(1, obj, InsuranceCarouselViewModel.class, "onAction", "onAction(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModelAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InsuranceCarouselViewModelAction insuranceCarouselViewModelAction) {
        invoke2(insuranceCarouselViewModelAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InsuranceCarouselViewModelAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((InsuranceCarouselViewModel) this.receiver).onAction(p02);
    }
}
