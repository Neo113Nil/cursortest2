package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes9.dex */
final class FlightDetailsSegmentInfoView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FlightDetailsSegmentInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightDetailsSegmentInfoView$setConstraints$1(FlightDetailsSegmentInfoView flightDetailsSegmentInfoView) {
        super(1);
        this.this$0 = flightDetailsSegmentInfoView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        Guideline guideline;
        int i11;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        int i12;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        Guideline guideline2;
        int i13;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        Guideline guideline3;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        int i14;
        TextAtomV2View textAtomV2View13;
        Guideline guideline4;
        TextAtomV2View textAtomV2View14;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.timeTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.timeTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.timeTAV;
        guideline = this.this$0.guidelineG;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, guideline, i11);
        textAtomV2View4 = this.this$0.dateTAV;
        textAtomV2View5 = this.this$0.timeTAV;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View4, textAtomV2View5, i12);
        textAtomV2View6 = this.this$0.dateTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View6);
        textAtomV2View7 = this.this$0.timeTAV;
        guideline2 = this.this$0.guidelineG;
        i13 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View7, guideline2, i13);
        textAtomV2View8 = this.this$0.cityTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View8);
        textAtomV2View9 = this.this$0.cityTAV;
        guideline3 = this.this$0.guidelineG;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View9, guideline3);
        textAtomV2View10 = this.this$0.cityTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View10);
        textAtomV2View11 = this.this$0.airportTAV;
        textAtomV2View12 = this.this$0.cityTAV;
        i14 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View11, textAtomV2View12, i14);
        textAtomV2View13 = this.this$0.airportTAV;
        guideline4 = this.this$0.guidelineG;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View13, guideline4);
        textAtomV2View14 = this.this$0.airportTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View14);
    }
}
