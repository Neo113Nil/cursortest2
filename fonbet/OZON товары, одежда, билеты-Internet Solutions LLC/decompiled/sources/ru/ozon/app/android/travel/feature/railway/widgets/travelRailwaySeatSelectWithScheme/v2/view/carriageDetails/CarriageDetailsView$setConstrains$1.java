package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.carriageDetails;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class CarriageDetailsView$setConstrains$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ CarriageDetailsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarriageDetailsView$setConstrains$1(CarriageDetailsView carriageDetailsView) {
        super(1);
        this.this$0 = carriageDetailsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ShiftedPreviewIconsView shiftedPreviewIconsView;
        RecyclerView recyclerView3;
        int i11;
        ShiftedPreviewIconsView shiftedPreviewIconsView2;
        ShiftedPreviewIconsView shiftedPreviewIconsView3;
        BadgeView badgeView;
        Barrier barrier;
        BadgeView badgeView2;
        BadgeView badgeView3;
        BadgeView badgeView4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        recyclerView = this.this$0.iconsRV;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, recyclerView);
        recyclerView2 = this.this$0.iconsRV;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, recyclerView2);
        shiftedPreviewIconsView = this.this$0.shiftedPreviewIcons;
        recyclerView3 = this.this$0.iconsRV;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, shiftedPreviewIconsView, recyclerView3, i11);
        shiftedPreviewIconsView2 = this.this$0.shiftedPreviewIcons;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, shiftedPreviewIconsView2);
        shiftedPreviewIconsView3 = this.this$0.shiftedPreviewIcons;
        updateConstraints.Z(shiftedPreviewIconsView3.getId(), 6, 0);
        badgeView = this.this$0.badgeView;
        barrier = this.this$0.barrier;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, badgeView, barrier);
        badgeView2 = this.this$0.badgeView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, badgeView2);
        badgeView3 = this.this$0.badgeView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, badgeView3);
        badgeView4 = this.this$0.badgeView;
        updateConstraints.c0(1.0f, badgeView4.getId());
    }
}
