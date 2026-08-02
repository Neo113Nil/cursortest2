package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlightOrderDetailsV4LuggageBlockView$processedActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ FlightOrderDetailsV4LuggageBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightOrderDetailsV4LuggageBlockView$processedActionHandler$1(FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView) {
        super(1);
        this.this$0 = flightOrderDetailsV4LuggageBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        boolean z11;
        boolean z12;
        TextAtomV2View titleTAV;
        boolean z13;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getId(), "showContent")) {
            FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView = this.this$0;
            z11 = flightOrderDetailsV4LuggageBlockView.isTextVisible;
            flightOrderDetailsV4LuggageBlockView.isTextVisible = !z11;
            IconButtonV3View buttonIBV = this.this$0.getButtonIBV();
            z12 = this.this$0.isTextVisible;
            buttonIBV.setRotation(z12 ? 180.0f : 0.0f);
            titleTAV = this.this$0.getTitleTAV();
            z13 = this.this$0.isTextVisible;
            titleTAV.setVisibility(z13 ? 0 : 8);
        }
    }
}
