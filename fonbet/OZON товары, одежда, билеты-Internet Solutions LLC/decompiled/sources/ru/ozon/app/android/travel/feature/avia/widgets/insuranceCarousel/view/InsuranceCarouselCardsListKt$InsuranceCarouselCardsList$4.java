package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;", "item", "", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$4 extends AbstractC7737t implements InterfaceC6511n<InsuranceCarouselVI.InsuranceCarouselCardVI, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$4(Function1<? super AtomAction, Unit> function1) {
        super(3);
        this.$actionHandler = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InsuranceCarouselVI.InsuranceCarouselCardVI insuranceCarouselCardVI, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(insuranceCarouselCardVI, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InsuranceCarouselVI.InsuranceCarouselCardVI item, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        InsuranceCarouselCardKt.InsuranceCarouselCard(null, item, this.$actionHandler, interfaceC3967k, (i11 << 3) & 112, 1);
    }
}
