package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import Tl.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPassengersCountSelectorWidgetViewHolder$actionHandler$3 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ TravelPassengersCountSelectorWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorWidgetViewHolder$actionHandler$3(TravelPassengersCountSelectorWidgetViewHolder travelPassengersCountSelectorWidgetViewHolder) {
        super(1);
        this.this$0 = travelPassengersCountSelectorWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        String link;
        TravelPassengersSelectorViewModel travelPassengersSelectorViewModel;
        if (!b.i(click, "clickAction", "select") || (link = click.getLink()) == null) {
            return;
        }
        travelPassengersSelectorViewModel = this.this$0.viewModel;
        travelPassengersSelectorViewModel.onTravelClassSelected(link);
    }
}
