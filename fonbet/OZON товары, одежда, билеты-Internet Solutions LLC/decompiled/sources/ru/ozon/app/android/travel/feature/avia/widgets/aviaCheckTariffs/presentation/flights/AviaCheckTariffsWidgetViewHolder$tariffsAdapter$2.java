package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaCheckTariffsWidgetViewHolder$tariffsAdapter$2 extends AbstractC7737t implements Function2<AtomAction, Integer, Unit> {
    final /* synthetic */ AviaCheckTariffsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsWidgetViewHolder$tariffsAdapter$2(AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder) {
        super(2);
        this.this$0 = aviaCheckTariffsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, Integer num) {
        invoke(atomAction, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(AtomAction action, int i11) {
        AviaCheckTariffsViewModel aviaCheckTariffsViewModel;
        Function1 function1;
        AviaCheckTariffsViewModel aviaCheckTariffsViewModel2;
        Intrinsics.checkNotNullParameter(action, "action");
        aviaCheckTariffsViewModel = this.this$0.viewModel;
        aviaCheckTariffsViewModel.setCalculateHeight(false);
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
        aviaCheckTariffsViewModel2 = this.this$0.viewModel;
        aviaCheckTariffsViewModel2.setOfferId(null);
    }
}
