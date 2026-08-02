package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaSearchResultV4TripRouteView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AviaSearchResultV4TripRouteView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4TripRouteView$setConstraints$1(AviaSearchResultV4TripRouteView aviaSearchResultV4TripRouteView) {
        super(1);
        this.this$0 = aviaSearchResultV4TripRouteView;
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
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        Barrier barrier;
        int i11;
        TextAtomV2View textAtomV2View8;
        TextAtomV2View textAtomV2View9;
        int i12;
        TextAtomV2View textAtomV2View10;
        TextAtomV2View textAtomV2View11;
        TextAtomV2View textAtomV2View12;
        TextAtomV2View textAtomV2View13;
        TextAtomV2View textAtomV2View14;
        TextAtomV2View textAtomV2View15;
        TextAtomV2View textAtomV2View16;
        int i13;
        RecyclerView recyclerView;
        TextAtomV2View textAtomV2View17;
        int i14;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Barrier barrier2;
        int i15;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.tripTimeTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View);
        textAtomV2View2 = this.this$0.tripTimeTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.tripTimeTAV;
        textAtomV2View4 = this.this$0.timeDifferenceTAV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, textAtomV2View4);
        textAtomV2View5 = this.this$0.tripDurationTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View5);
        textAtomV2View6 = this.this$0.tripDurationTAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View6);
        textAtomV2View7 = this.this$0.tripDurationTAV;
        barrier = this.this$0.barrierB;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View7, barrier, i11);
        textAtomV2View8 = this.this$0.timeDifferenceTAV;
        textAtomV2View9 = this.this$0.tripTimeTAV;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View8, textAtomV2View9, i12);
        textAtomV2View10 = this.this$0.timeDifferenceTAV;
        textAtomV2View11 = this.this$0.tripTimeTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, textAtomV2View10, textAtomV2View11);
        textAtomV2View12 = this.this$0.timeDifferenceTAV;
        textAtomV2View13 = this.this$0.tripDurationTAV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View12, textAtomV2View13);
        textAtomV2View14 = this.this$0.routeInfoTAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View14);
        textAtomV2View15 = this.this$0.routeInfoTAV;
        textAtomV2View16 = this.this$0.tripTimeTAV;
        i13 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View15, textAtomV2View16, i13);
        recyclerView = this.this$0.transfersRV;
        textAtomV2View17 = this.this$0.tripDurationTAV;
        i14 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView, textAtomV2View17, i14);
        recyclerView2 = this.this$0.transfersRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.transfersRV;
        barrier2 = this.this$0.barrierB;
        i15 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, recyclerView3, barrier2, i15);
    }
}
