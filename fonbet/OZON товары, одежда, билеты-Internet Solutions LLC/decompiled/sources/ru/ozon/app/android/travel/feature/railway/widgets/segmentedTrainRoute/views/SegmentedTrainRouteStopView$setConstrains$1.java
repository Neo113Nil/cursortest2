package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views;

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
/* loaded from: classes4.dex */
final class SegmentedTrainRouteStopView$setConstrains$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SegmentedTrainRouteStopView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedTrainRouteStopView$setConstrains$1(SegmentedTrainRouteStopView segmentedTrainRouteStopView) {
        super(1);
        this.this$0 = segmentedTrainRouteStopView;
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
        TextAtomV2View textAtomV2View10;
        Guideline guideline3;
        int i14;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        int i15;
        TextAtomV2View textAtomV2View13;
        TextAtomV2View textAtomV2View14;
        Guideline guideline4;
        int i16;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.arrivalTimeTAV;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View);
        textAtomV2View2 = this.this$0.arrivalTimeTAV;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.arrivalTimeTAV;
        guideline = this.this$0.guidelineG;
        i11 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View3, guideline, i11);
        textAtomV2View4 = this.this$0.departureTimeTAV;
        textAtomV2View5 = this.this$0.arrivalTimeTAV;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View4, textAtomV2View5, i12);
        textAtomV2View6 = this.this$0.arrivalTimeTAV;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View6);
        textAtomV2View7 = this.this$0.arrivalTimeTAV;
        guideline2 = this.this$0.guidelineG;
        i13 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View7, guideline2, i13);
        textAtomV2View8 = this.this$0.cityTAV;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View8);
        textAtomV2View9 = this.this$0.cityTAV;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View9);
        textAtomV2View10 = this.this$0.cityTAV;
        guideline3 = this.this$0.guidelineG;
        i14 = this.this$0.dp40;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View10, guideline3, i14);
        textAtomV2View11 = this.this$0.stationTAV;
        textAtomV2View12 = this.this$0.cityTAV;
        i15 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View11, textAtomV2View12, i15);
        textAtomV2View13 = this.this$0.stationTAV;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View13);
        textAtomV2View14 = this.this$0.stationTAV;
        guideline4 = this.this$0.guidelineG;
        i16 = this.this$0.dp40;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View14, guideline4, i16);
    }
}
