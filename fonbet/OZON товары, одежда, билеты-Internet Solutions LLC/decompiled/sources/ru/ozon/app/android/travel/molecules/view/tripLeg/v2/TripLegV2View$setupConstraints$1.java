package ru.ozon.app.android.travel.molecules.view.tripLeg.v2;

import android.view.View;
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
final class TripLegV2View$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TripLegV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV2View$setupConstraints$1(TripLegV2View tripLegV2View) {
        super(1);
        this.this$0 = tripLegV2View;
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
        int i11;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        int i12;
        TextAtomV2View textAtomV2View13;
        TextAtomV2View textAtomV2View14;
        TextAtomV2View textAtomV2View15;
        TextAtomV2View textAtomV2View16;
        int i13;
        TextAtomV2View textAtomV2View17;
        TextAtomV2View textAtomV2View18;
        TextAtomV2View textAtomV2View19;
        TextAtomV2View textAtomV2View20;
        TextAtomV2View textAtomV2View21;
        TextAtomV2View textAtomV2View22;
        TextAtomV2View textAtomV2View23;
        TextAtomV2View textAtomV2View24;
        int i14;
        TextAtomV2View textAtomV2View25;
        TextAtomV2View textAtomV2View26;
        TextAtomV2View textAtomV2View27;
        TextAtomV2View textAtomV2View28;
        TextAtomV2View textAtomV2View29;
        TextAtomV2View textAtomV2View30;
        TextAtomV2View textAtomV2View31;
        TextAtomV2View textAtomV2View32;
        View view;
        TextAtomV2View textAtomV2View33;
        View view2;
        TextAtomV2View textAtomV2View34;
        View view3;
        TextAtomV2View textAtomV2View35;
        int i15;
        View view4;
        TextAtomV2View textAtomV2View36;
        int i16;
        View view5;
        TextAtomV2View textAtomV2View37;
        View view6;
        TextAtomV2View textAtomV2View38;
        View view7;
        TextAtomV2View textAtomV2View39;
        int i17;
        View view8;
        TextAtomV2View textAtomV2View40;
        int i18;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View);
        textAtomV2View2 = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.departureDate;
        textAtomV2View4 = this.this$0.arrivalDate;
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View3, textAtomV2View4, i11);
        textAtomV2View5 = this.this$0.departureTime;
        textAtomV2View6 = this.this$0.departureDate;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View5, textAtomV2View6);
        textAtomV2View7 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View7);
        textAtomV2View8 = this.this$0.departureCity;
        textAtomV2View9 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View8, textAtomV2View9);
        textAtomV2View10 = this.this$0.departureCity;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, textAtomV2View10);
        textAtomV2View11 = this.this$0.departureCity;
        textAtomV2View12 = this.this$0.arrivalCity;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View11, textAtomV2View12, i12);
        textAtomV2View13 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View13);
        textAtomV2View14 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View14);
        textAtomV2View15 = this.this$0.arrivalDate;
        textAtomV2View16 = this.this$0.departureDate;
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View15, textAtomV2View16, i13);
        textAtomV2View17 = this.this$0.arrivalTime;
        textAtomV2View18 = this.this$0.arrivalDate;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View17, textAtomV2View18);
        textAtomV2View19 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View19);
        textAtomV2View20 = this.this$0.arrivalCity;
        textAtomV2View21 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, textAtomV2View20, textAtomV2View21);
        textAtomV2View22 = this.this$0.arrivalCity;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View22);
        textAtomV2View23 = this.this$0.arrivalCity;
        textAtomV2View24 = this.this$0.departureCity;
        i14 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View23, textAtomV2View24, i14);
        this.this$0.airportInRow(updateConstraints);
        textAtomV2View25 = this.this$0.duration;
        textAtomV2View26 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, textAtomV2View25, textAtomV2View26);
        textAtomV2View27 = this.this$0.duration;
        textAtomV2View28 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, textAtomV2View27, textAtomV2View28);
        textAtomV2View29 = this.this$0.duration;
        textAtomV2View30 = this.this$0.departureTime;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View29, textAtomV2View30);
        textAtomV2View31 = this.this$0.duration;
        textAtomV2View32 = this.this$0.arrivalTime;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, textAtomV2View31, textAtomV2View32);
        view = this.this$0.durationLeftSeparator;
        textAtomV2View33 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view, textAtomV2View33);
        view2 = this.this$0.durationLeftSeparator;
        textAtomV2View34 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view2, textAtomV2View34);
        view3 = this.this$0.durationLeftSeparator;
        textAtomV2View35 = this.this$0.departureTime;
        i15 = this.this$0.dp20;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, view3, textAtomV2View35, i15);
        view4 = this.this$0.durationLeftSeparator;
        textAtomV2View36 = this.this$0.duration;
        i16 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, view4, textAtomV2View36, i16);
        view5 = this.this$0.durationRightSeparator;
        textAtomV2View37 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, view5, textAtomV2View37);
        view6 = this.this$0.durationRightSeparator;
        textAtomV2View38 = this.this$0.duration;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, view6, textAtomV2View38);
        view7 = this.this$0.durationRightSeparator;
        textAtomV2View39 = this.this$0.duration;
        i17 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, view7, textAtomV2View39, i17);
        view8 = this.this$0.durationRightSeparator;
        textAtomV2View40 = this.this$0.arrivalTime;
        i18 = this.this$0.dp20;
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, view8, textAtomV2View40, i18);
    }
}
