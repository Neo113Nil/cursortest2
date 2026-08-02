package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaFavoriteListTripRouteView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AviaFavoriteListTripRouteView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaFavoriteListTripRouteView$setConstraints$1(AviaFavoriteListTripRouteView aviaFavoriteListTripRouteView) {
        super(1);
        this.this$0 = aviaFavoriteListTripRouteView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View tripTimeTAV;
        TextAtomV2View tripTimeTAV2;
        TextAtomV2View tripTimeTAV3;
        TextAtomV2View timeDifferenceTAV;
        TextAtomV2View tripDurationTAV;
        TextAtomV2View tripDurationTAV2;
        TextAtomV2View tripDurationTAV3;
        Barrier barrier;
        DesignSystemDimensProvider designSystemDimensProvider;
        TextAtomV2View timeDifferenceTAV2;
        TextAtomV2View tripTimeTAV4;
        DesignSystemDimensProvider designSystemDimensProvider2;
        TextAtomV2View timeDifferenceTAV3;
        TextAtomV2View tripTimeTAV5;
        TextAtomV2View timeDifferenceTAV4;
        TextAtomV2View tripDurationTAV4;
        TextAtomV2View routeInfoTAV;
        TextAtomV2View routeInfoTAV2;
        TextAtomV2View tripTimeTAV6;
        DesignSystemDimensProvider designSystemDimensProvider3;
        RecyclerView recyclerView;
        TextAtomV2View tripDurationTAV5;
        DesignSystemDimensProvider designSystemDimensProvider4;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Barrier barrier2;
        DesignSystemDimensProvider designSystemDimensProvider5;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        tripTimeTAV = this.this$0.getTripTimeTAV();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, tripTimeTAV);
        tripTimeTAV2 = this.this$0.getTripTimeTAV();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, tripTimeTAV2);
        tripTimeTAV3 = this.this$0.getTripTimeTAV();
        timeDifferenceTAV = this.this$0.getTimeDifferenceTAV();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, tripTimeTAV3, timeDifferenceTAV);
        tripDurationTAV = this.this$0.getTripDurationTAV();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, tripDurationTAV);
        tripDurationTAV2 = this.this$0.getTripDurationTAV();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, tripDurationTAV2);
        tripDurationTAV3 = this.this$0.getTripDurationTAV();
        barrier = this.this$0.barrierB;
        designSystemDimensProvider = this.this$0.dsProvider;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, tripDurationTAV3, barrier, designSystemDimensProvider.getMargin8());
        timeDifferenceTAV2 = this.this$0.getTimeDifferenceTAV();
        tripTimeTAV4 = this.this$0.getTripTimeTAV();
        designSystemDimensProvider2 = this.this$0.dsProvider;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, timeDifferenceTAV2, tripTimeTAV4, designSystemDimensProvider2.getMargin4());
        timeDifferenceTAV3 = this.this$0.getTimeDifferenceTAV();
        tripTimeTAV5 = this.this$0.getTripTimeTAV();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, timeDifferenceTAV3, tripTimeTAV5);
        timeDifferenceTAV4 = this.this$0.getTimeDifferenceTAV();
        tripDurationTAV4 = this.this$0.getTripDurationTAV();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, timeDifferenceTAV4, tripDurationTAV4);
        routeInfoTAV = this.this$0.getRouteInfoTAV();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, routeInfoTAV);
        routeInfoTAV2 = this.this$0.getRouteInfoTAV();
        tripTimeTAV6 = this.this$0.getTripTimeTAV();
        designSystemDimensProvider3 = this.this$0.dsProvider;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, routeInfoTAV2, tripTimeTAV6, designSystemDimensProvider3.getMargin2());
        recyclerView = this.this$0.transfersRV;
        tripDurationTAV5 = this.this$0.getTripDurationTAV();
        designSystemDimensProvider4 = this.this$0.dsProvider;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView, tripDurationTAV5, designSystemDimensProvider4.getMargin2());
        recyclerView2 = this.this$0.transfersRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.transfersRV;
        barrier2 = this.this$0.barrierB;
        designSystemDimensProvider5 = this.this$0.dsProvider;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, recyclerView3, barrier2, designSystemDimensProvider5.getMargin8());
    }
}
