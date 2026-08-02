package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ServicePackageSelectionButtonView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ServicePackageSelectionButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServicePackageSelectionButtonView$setupConstraints$1(ServicePackageSelectionButtonView servicePackageSelectionButtonView) {
        super(1);
        this.this$0 = servicePackageSelectionButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        ButtonV3View buttonV3View;
        ButtonV3View buttonV3View2;
        ButtonV3View buttonV3View3;
        BadgeView badgeView;
        ButtonV3View buttonV3View4;
        BadgeView badgeView2;
        ButtonV3View buttonV3View5;
        BadgeView badgeView3;
        ButtonV3View buttonV3View6;
        int i11;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        buttonV3View = this.this$0.button;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, buttonV3View);
        buttonV3View2 = this.this$0.button;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, buttonV3View2);
        buttonV3View3 = this.this$0.button;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, buttonV3View3);
        badgeView = this.this$0.badge;
        buttonV3View4 = this.this$0.button;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, badgeView, buttonV3View4);
        badgeView2 = this.this$0.badge;
        buttonV3View5 = this.this$0.button;
        ConstraintLayoutExtensionsKt.bottomToTop(updateConstraints, badgeView2, buttonV3View5);
        badgeView3 = this.this$0.badge;
        buttonV3View6 = this.this$0.button;
        i11 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, badgeView3, buttonV3View6, i11);
    }
}
