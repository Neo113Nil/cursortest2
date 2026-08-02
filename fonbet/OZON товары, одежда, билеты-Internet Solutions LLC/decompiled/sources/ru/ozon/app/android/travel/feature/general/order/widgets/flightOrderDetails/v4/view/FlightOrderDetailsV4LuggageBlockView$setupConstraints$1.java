package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FlightOrderDetailsV4LuggageBlockView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FlightOrderDetailsV4LuggageBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightOrderDetailsV4LuggageBlockView$setupConstraints$1(FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView) {
        super(1);
        this.this$0 = flightOrderDetailsV4LuggageBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView2;
        int i11;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView3;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView4;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView5;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView6;
        TextAtomV2View titleTAV;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView7;
        int i12;
        TextAtomV2View titleTAV2;
        TextAtomV2View titleTAV3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        this.this$0.basicLuggageInRow(applyConstraint);
        flightOrderDetailsV4LuggageView = this.this$0.extraLuggageLV;
        flightOrderDetailsV4LuggageView2 = this.this$0.luggageLV;
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, flightOrderDetailsV4LuggageView, flightOrderDetailsV4LuggageView2, i11);
        flightOrderDetailsV4LuggageView3 = this.this$0.extraLuggageLV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, flightOrderDetailsV4LuggageView3);
        flightOrderDetailsV4LuggageView4 = this.this$0.extraLuggageLV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, flightOrderDetailsV4LuggageView4, this.this$0.getButtonIBV(), this.this$0.dp10);
        IconButtonV3View buttonIBV = this.this$0.getButtonIBV();
        flightOrderDetailsV4LuggageView5 = this.this$0.handCarryLV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, buttonIBV, flightOrderDetailsV4LuggageView5);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getButtonIBV());
        IconButtonV3View buttonIBV2 = this.this$0.getButtonIBV();
        flightOrderDetailsV4LuggageView6 = this.this$0.extraLuggageLV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, buttonIBV2, flightOrderDetailsV4LuggageView6);
        titleTAV = this.this$0.getTitleTAV();
        flightOrderDetailsV4LuggageView7 = this.this$0.extraLuggageLV;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, titleTAV, flightOrderDetailsV4LuggageView7, i12);
        titleTAV2 = this.this$0.getTitleTAV();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, titleTAV2);
        titleTAV3 = this.this$0.getTitleTAV();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, titleTAV3);
    }
}
