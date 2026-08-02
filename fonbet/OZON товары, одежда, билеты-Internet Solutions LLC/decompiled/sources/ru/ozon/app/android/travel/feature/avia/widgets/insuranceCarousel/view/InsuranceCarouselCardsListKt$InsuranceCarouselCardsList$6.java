package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselScrollState;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function1<InsuranceCarouselViewModelAction, Unit> $onAction;
    final /* synthetic */ InsuranceCarouselScrollState $scrollState;
    final /* synthetic */ InsuranceCarouselVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$6(InsuranceCarouselVI insuranceCarouselVI, InsuranceCarouselScrollState insuranceCarouselScrollState, Function1<? super AtomAction, Unit> function1, Function1<? super InsuranceCarouselViewModelAction, Unit> function12, int i11) {
        super(2);
        this.$state = insuranceCarouselVI;
        this.$scrollState = insuranceCarouselScrollState;
        this.$actionHandler = function1;
        this.$onAction = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        InsuranceCarouselCardsListKt.InsuranceCarouselCardsList(this.$state, this.$scrollState, this.$actionHandler, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
