package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.view;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelSortingV2View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TravelSortingV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelSortingV2View$setConstraints$1(TravelSortingV2View travelSortingV2View) {
        super(1);
        this.this$0 = travelSortingV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        BadgeView badgeView;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        BadgeView badgeView2;
        int i12;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View6;
        BadgeView badgeView4;
        TextAtomV2View textAtomV2View7;
        RecyclerView recyclerView;
        Barrier barrier;
        int i13;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        TravelSortingV2SkeletonView travelSortingV2SkeletonView;
        Barrier barrier2;
        int i14;
        TravelSortingV2SkeletonView travelSortingV2SkeletonView2;
        TravelSortingV2SkeletonView travelSortingV2SkeletonView3;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.trainOptionTAV;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.trainOptionTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.trainOptionTAV;
        badgeView = this.this$0.sortingButton;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, badgeView);
        textAtomV2View4 = this.this$0.trainOptionTAV;
        applyConstraint.y(textAtomV2View4.getId(), this.this$0.getResources().getDisplayMetrics().widthPixels / 4);
        textAtomV2View5 = this.this$0.trainOptionTAV;
        applyConstraint.c0(0.0f, textAtomV2View5.getId());
        badgeView2 = this.this$0.sortingButton;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView2, i12);
        badgeView3 = this.this$0.sortingButton;
        textAtomV2View6 = this.this$0.trainOptionTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badgeView3, textAtomV2View6);
        badgeView4 = this.this$0.sortingButton;
        textAtomV2View7 = this.this$0.trainOptionTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badgeView4, textAtomV2View7);
        recyclerView = this.this$0.fastSortingButtonsRV;
        barrier = this.this$0.verticalBarrier;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView, barrier, i13);
        recyclerView2 = this.this$0.fastSortingButtonsRV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.fastSortingButtonsRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView3);
        travelSortingV2SkeletonView = this.this$0.skeletonTSV;
        barrier2 = this.this$0.verticalBarrier;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, travelSortingV2SkeletonView, barrier2, i14);
        travelSortingV2SkeletonView2 = this.this$0.skeletonTSV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, travelSortingV2SkeletonView2);
        travelSortingV2SkeletonView3 = this.this$0.skeletonTSV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, travelSortingV2SkeletonView3);
    }
}
