package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaCheckTariffsView$bindContent$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onItemClick;
    final /* synthetic */ AviaCheckTariffsVO.TariffItem.TariffVO $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaCheckTariffsView$bindContent$1$1$1(AviaCheckTariffsVO.TariffItem.TariffVO tariffVO, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$this_with = tariffVO;
        this.$onItemClick = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction clickAction = this.$this_with.getClickAction();
        if (clickAction != null) {
            this.$onItemClick.invoke(clickAction);
        }
    }
}
