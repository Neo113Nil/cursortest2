package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v2.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class FlightSeatsLegendV2SeatTypeView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FlightSeatsLegendV2SeatTypeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsLegendV2SeatTypeView$setupConstraints$1(FlightSeatsLegendV2SeatTypeView flightSeatsLegendV2SeatTypeView) {
        super(1);
        this.this$0 = flightSeatsLegendV2SeatTypeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        TextAtomV2View seatTextView;
        View view9;
        TextAtomV2View seatTextView2;
        View view10;
        TextAtomV2View seatTextView3;
        View view11;
        TextAtomV2View seatTextView4;
        View view12;
        CellView cellView;
        CellView cellView2;
        View view13;
        int i11;
        CellView cellView3;
        CellView cellView4;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        view = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, view);
        view2 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, view2);
        view3 = this.this$0.seatBackrestView;
        view4 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, view3, view4);
        view5 = this.this$0.seatBackrestView;
        view6 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, view5, view6);
        view7 = this.this$0.seatBackrestView;
        view8 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, view7, view8);
        seatTextView = this.this$0.getSeatTextView();
        view9 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, seatTextView, view9);
        seatTextView2 = this.this$0.getSeatTextView();
        view10 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, seatTextView2, view10);
        seatTextView3 = this.this$0.getSeatTextView();
        view11 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, seatTextView3, view11);
        seatTextView4 = this.this$0.getSeatTextView();
        view12 = this.this$0.seatBgView;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, seatTextView4, view12);
        cellView = this.this$0.getCellView();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, cellView);
        cellView2 = this.this$0.getCellView();
        view13 = this.this$0.seatBgView;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, cellView2, view13, i11);
        cellView3 = this.this$0.getCellView();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, cellView3);
        cellView4 = this.this$0.getCellView();
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, cellView4);
    }
}
