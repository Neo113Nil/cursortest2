package ru.ozon.app.android.travel.molecules.view.tripLeg.v3;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TripLegV3View$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TripLegV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV3View$setupConstraints$1(TripLegV3View tripLegV3View) {
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
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        PriceAtomView priceAtomView4;
        int i11;
        PriceAtomView priceAtomView5;
        PriceAtomView priceAtomView6;
        PriceAtomView priceAtomView7;
        TextAtomV2View textAtomV2View;
        PriceAtomView priceAtomView8;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        int i12;
        PriceAtomView priceAtomView9;
        PriceAtomView priceAtomView10;
        PriceAtomView priceAtomView11;
        PriceAtomView priceAtomView12;
        int i13;
        PriceAtomView priceAtomView13;
        PriceAtomView priceAtomView14;
        PriceAtomView priceAtomView15;
        TextAtomV2View textAtomV2View5;
        PriceAtomView priceAtomView16;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        int i14;
        TextAtomV2View textAtomV2View9;
        PriceAtomView priceAtomView17;
        TextAtomV2View textAtomV2View10;
        PriceAtomView priceAtomView18;
        TextAtomV2View textAtomV2View11;
        PriceAtomView priceAtomView19;
        TextAtomV2View textAtomV2View12;
        PriceAtomView priceAtomView20;
        View view;
        TextAtomV2View textAtomV2View13;
        View view2;
        TextAtomV2View textAtomV2View14;
        View view3;
        PriceAtomView priceAtomView21;
        int i15;
        View view4;
        TextAtomV2View textAtomV2View15;
        int i16;
        View view5;
        TextAtomV2View textAtomV2View16;
        View view6;
        TextAtomV2View textAtomV2View17;
        View view7;
        TextAtomV2View textAtomV2View18;
        int i17;
        View view8;
        PriceAtomView priceAtomView22;
        int i18;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        priceAtomView = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, priceAtomView);
        priceAtomView2 = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, priceAtomView2);
        priceAtomView3 = this.this$0.departureDate;
        priceAtomView4 = this.this$0.arrivalDate;
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, priceAtomView3, priceAtomView4, i11);
        priceAtomView5 = this.this$0.departureTime;
        priceAtomView6 = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, priceAtomView5, priceAtomView6);
        priceAtomView7 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, priceAtomView7);
        textAtomV2View = this.this$0.departureCity;
        priceAtomView8 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View, priceAtomView8);
        textAtomV2View2 = this.this$0.departureCity;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.departureCity;
        textAtomV2View4 = this.this$0.arrivalCity;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View3, textAtomV2View4, i12);
        priceAtomView9 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, priceAtomView9);
        priceAtomView10 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, priceAtomView10);
        priceAtomView11 = this.this$0.arrivalDate;
        priceAtomView12 = this.this$0.departureDate;
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, priceAtomView11, priceAtomView12, i13);
        priceAtomView13 = this.this$0.arrivalTime;
        priceAtomView14 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, priceAtomView13, priceAtomView14);
        priceAtomView15 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, priceAtomView15);
        textAtomV2View5 = this.this$0.arrivalCity;
        priceAtomView16 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View5, priceAtomView16);
        textAtomV2View6 = this.this$0.arrivalCity;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View6);
        textAtomV2View7 = this.this$0.arrivalCity;
        textAtomV2View8 = this.this$0.departureCity;
        i14 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View7, textAtomV2View8, i14);
        this.this$0.airportInRow(updateConstraints);
        textAtomV2View9 = this.this$0.duration;
        priceAtomView17 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View9, priceAtomView17);
        textAtomV2View10 = this.this$0.duration;
        priceAtomView18 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View10, priceAtomView18);
        textAtomV2View11 = this.this$0.duration;
        priceAtomView19 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View11, priceAtomView19);
        textAtomV2View12 = this.this$0.duration;
        priceAtomView20 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View12, priceAtomView20);
        view = this.this$0.durationLeftSeparator;
        textAtomV2View13 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view, textAtomV2View13);
        view2 = this.this$0.durationLeftSeparator;
        textAtomV2View14 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view2, textAtomV2View14);
        view3 = this.this$0.durationLeftSeparator;
        priceAtomView21 = this.this$0.departureTime;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, view3, priceAtomView21, i15);
        view4 = this.this$0.durationLeftSeparator;
        textAtomV2View15 = this.this$0.duration;
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, view4, textAtomV2View15, i16);
        view5 = this.this$0.durationRightSeparator;
        textAtomV2View16 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view5, textAtomV2View16);
        view6 = this.this$0.durationRightSeparator;
        textAtomV2View17 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view6, textAtomV2View17);
        view7 = this.this$0.durationRightSeparator;
        textAtomV2View18 = this.this$0.duration;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, view7, textAtomV2View18, i17);
        view8 = this.this$0.durationRightSeparator;
        priceAtomView22 = this.this$0.arrivalTime;
        i18 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, view8, priceAtomView22, i18);
    }
}
