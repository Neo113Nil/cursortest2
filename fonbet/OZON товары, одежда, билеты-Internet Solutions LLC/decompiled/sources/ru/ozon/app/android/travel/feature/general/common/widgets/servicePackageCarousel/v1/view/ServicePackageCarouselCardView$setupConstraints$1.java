package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import android.view.View;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class ServicePackageCarouselCardView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ServicePackageCarouselCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageCarouselCardView$setupConstraints$1(ServicePackageCarouselCardView servicePackageCarouselCardView) {
        super(1);
        this.this$0 = servicePackageCarouselCardView;
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
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        CellView cellView;
        int i11;
        RecyclerView recyclerView5;
        ButtonV3View buttonV3View;
        int i12;
        ButtonV3View buttonV3View2;
        int i13;
        ButtonV3View buttonV3View3;
        int i14;
        CellView cellView2;
        ButtonV3View buttonV3View4;
        int i15;
        CellView cellView3;
        CellView cellView4;
        View view;
        View view2;
        View view3;
        View view4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        recyclerView = this.this$0.recyclerView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, recyclerView);
        recyclerView2 = this.this$0.recyclerView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, recyclerView2);
        recyclerView3 = this.this$0.recyclerView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, recyclerView3);
        recyclerView4 = this.this$0.recyclerView;
        cellView = this.this$0.smsCell;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, recyclerView4, cellView, i11);
        recyclerView5 = this.this$0.recyclerView;
        updateConstraints.f0(0.0f, recyclerView5.getId());
        buttonV3View = this.this$0.button;
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, buttonV3View, i12);
        buttonV3View2 = this.this$0.button;
        i13 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, buttonV3View2, i13);
        buttonV3View3 = this.this$0.button;
        i14 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, buttonV3View3, i14);
        cellView2 = this.this$0.smsCell;
        buttonV3View4 = this.this$0.button;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, cellView2, buttonV3View4, i15);
        cellView3 = this.this$0.smsCell;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, cellView3);
        cellView4 = this.this$0.smsCell;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, cellView4);
        view = this.this$0.onClickOverlay;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, view);
        view2 = this.this$0.onClickOverlay;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, view2);
        view3 = this.this$0.onClickOverlay;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view3);
        view4 = this.this$0.onClickOverlay;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, view4);
    }
}
