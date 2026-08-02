package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaBookedTicketInfoView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AviaBookedTicketInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaBookedTicketInfoView$setConstraints$1(AviaBookedTicketInfoView aviaBookedTicketInfoView) {
        super(1);
        this.this$0 = aviaBookedTicketInfoView;
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
        int i12;
        BadgeView badgeView2;
        int i13;
        BadgeView badgeView3;
        TextAtomV2View textAtomV2View4;
        BadgeView badgeView4;
        TextAtomV2View textAtomV2View5;
        CellView cellView;
        CellView cellView2;
        CellView cellView3;
        TextAtomV2View textAtomV2View6;
        int i14;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout;
        int i15;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout2;
        int i16;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout3;
        CellView cellView4;
        RoundedShimmerView roundedShimmerView;
        TextAtomV2View textAtomV2View7;
        RoundedShimmerView roundedShimmerView2;
        int i17;
        RoundedShimmerView roundedShimmerView3;
        TextAtomV2View textAtomV2View8;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        textAtomV2View = this.this$0.aviaBookedTicketInfoTitleTAV;
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.aviaBookedTicketInfoTitleTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.aviaBookedTicketInfoTitleTAV;
        badgeView = this.this$0.aviaBookedTicketInfoPayUntilBadgeBV;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, badgeView, i12);
        badgeView2 = this.this$0.aviaBookedTicketInfoPayUntilBadgeBV;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, badgeView2, i13);
        badgeView3 = this.this$0.aviaBookedTicketInfoPayUntilBadgeBV;
        textAtomV2View4 = this.this$0.aviaBookedTicketInfoTitleTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, badgeView3, textAtomV2View4);
        badgeView4 = this.this$0.aviaBookedTicketInfoPayUntilBadgeBV;
        textAtomV2View5 = this.this$0.aviaBookedTicketInfoTitleTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, badgeView4, textAtomV2View5);
        cellView = this.this$0.aviaBookedTicketInfoCellCV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, cellView);
        cellView2 = this.this$0.aviaBookedTicketInfoCellCV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, cellView2);
        cellView3 = this.this$0.aviaBookedTicketInfoCellCV;
        textAtomV2View6 = this.this$0.aviaBookedTicketInfoTitleTAV;
        i14 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, cellView3, textAtomV2View6, i14);
        horizontalFlexAtomsLayout = this.this$0.aviaBookedTicketInfoBadgeHFAL;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, horizontalFlexAtomsLayout, i15);
        horizontalFlexAtomsLayout2 = this.this$0.aviaBookedTicketInfoBadgeHFAL;
        i16 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, horizontalFlexAtomsLayout2, i16);
        horizontalFlexAtomsLayout3 = this.this$0.aviaBookedTicketInfoBadgeHFAL;
        cellView4 = this.this$0.aviaBookedTicketInfoCellCV;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, horizontalFlexAtomsLayout3, cellView4);
        roundedShimmerView = this.this$0.payUntilBadgeShimmerView;
        textAtomV2View7 = this.this$0.aviaBookedTicketInfoTitleTAV;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView, textAtomV2View7);
        roundedShimmerView2 = this.this$0.payUntilBadgeShimmerView;
        i17 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView2, i17);
        roundedShimmerView3 = this.this$0.payUntilBadgeShimmerView;
        textAtomV2View8 = this.this$0.aviaBookedTicketInfoTitleTAV;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView3, textAtomV2View8);
    }
}
