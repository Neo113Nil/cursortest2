package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.view;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
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
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PassengersLuggageSelectionView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PassengersLuggageSelectionView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassengersLuggageSelectionView$setConstraints$1(PassengersLuggageSelectionView passengersLuggageSelectionView) {
        super(1);
        this.this$0 = passengersLuggageSelectionView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        CellView cellCV;
        CellView cellCV2;
        CellView cellCV3;
        TextAtomV2View titleTV;
        RecyclerView recyclerView;
        TextAtomV2View titleTV2;
        RecyclerView recyclerView2;
        TextAtomV2View titleTV3;
        int i11;
        TextAtomV2View subtitleTV;
        RecyclerView recyclerView3;
        TextAtomV2View subtitleTV2;
        RecyclerView recyclerView4;
        TextAtomV2View subtitleTV3;
        int i12;
        RecyclerView recyclerView5;
        CellView cellCV4;
        int i13;
        RecyclerView recyclerView6;
        Barrier barrier;
        RecyclerView recyclerView7;
        RecyclerView recyclerView8;
        RecyclerView recyclerView9;
        int i14;
        RecyclerView recyclerView10;
        RecyclerView recyclerView11;
        RecyclerView recyclerView12;
        Barrier barrier2;
        RecyclerView recyclerView13;
        RecyclerView recyclerView14;
        BadgeView bonusCardBadgeBV;
        int i15;
        BadgeView bonusCardBadgeBV2;
        RecyclerView recyclerView15;
        BadgeView bonusCardBadgeBV3;
        int i16;
        BadgeView bonusCardBadgeBV4;
        int i17;
        BadgeView bonusCardBadgeBV5;
        Guideline guideline;
        int i18;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        cellCV = this.this$0.getCellCV();
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, cellCV);
        cellCV2 = this.this$0.getCellCV();
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, cellCV2);
        cellCV3 = this.this$0.getCellCV();
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, cellCV3);
        titleTV = this.this$0.getTitleTV();
        recyclerView = this.this$0.tariffsThereRV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, titleTV, recyclerView);
        titleTV2 = this.this$0.getTitleTV();
        recyclerView2 = this.this$0.tariffsThereRV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, titleTV2, recyclerView2);
        titleTV3 = this.this$0.getTitleTV();
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, titleTV3, i11);
        subtitleTV = this.this$0.getSubtitleTV();
        recyclerView3 = this.this$0.tariffsBackRV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, subtitleTV, recyclerView3);
        subtitleTV2 = this.this$0.getSubtitleTV();
        recyclerView4 = this.this$0.tariffsBackRV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, subtitleTV2, recyclerView4);
        subtitleTV3 = this.this$0.getSubtitleTV();
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, subtitleTV3, i12);
        recyclerView5 = this.this$0.tariffsThereRV;
        cellCV4 = this.this$0.getCellCV();
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView5, cellCV4, i13);
        recyclerView6 = this.this$0.tariffsThereRV;
        barrier = this.this$0.barrierBV;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, recyclerView6, barrier);
        recyclerView7 = this.this$0.tariffsThereRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView7);
        recyclerView8 = this.this$0.tariffsThereRV;
        recyclerView9 = this.this$0.tariffsBackRV;
        i14 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, recyclerView8, recyclerView9, i14);
        recyclerView10 = this.this$0.tariffsBackRV;
        recyclerView11 = this.this$0.tariffsThereRV;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView10, recyclerView11);
        recyclerView12 = this.this$0.tariffsBackRV;
        barrier2 = this.this$0.barrierBV;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, recyclerView12, barrier2);
        recyclerView13 = this.this$0.tariffsBackRV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView13);
        recyclerView14 = this.this$0.tariffsBackRV;
        bonusCardBadgeBV = this.this$0.getBonusCardBadgeBV();
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, recyclerView14, bonusCardBadgeBV, i15);
        bonusCardBadgeBV2 = this.this$0.getBonusCardBadgeBV();
        recyclerView15 = this.this$0.tariffsBackRV;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, bonusCardBadgeBV2, recyclerView15);
        bonusCardBadgeBV3 = this.this$0.getBonusCardBadgeBV();
        i16 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, bonusCardBadgeBV3, i16);
        bonusCardBadgeBV4 = this.this$0.getBonusCardBadgeBV();
        i17 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, bonusCardBadgeBV4, i17);
        bonusCardBadgeBV5 = this.this$0.getBonusCardBadgeBV();
        guideline = this.this$0.guidelineG;
        i18 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.bottomToTop(applyConstraint, bonusCardBadgeBV5, guideline, i18);
    }
}
