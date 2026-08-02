package ru.ozon.app.android.travel.molecules.view.tripLeg.v3;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TripLegV3View$updateAirportsConstraints$2 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TripLegV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV3View$updateAirportsConstraints$2(TripLegV3View tripLegV3View) {
        super(1);
        this.this$0 = tripLegV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.departureAirportName;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View);
        textAtomV2View2 = this.this$0.departureAirportCode;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.arrivalAirportName;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View3);
        textAtomV2View4 = this.this$0.arrivalAirportCode;
        ConstraintLayoutExtensionsKt.clear(updateConstraints, textAtomV2View4);
        this.this$0.airportInRow(updateConstraints);
    }
}
