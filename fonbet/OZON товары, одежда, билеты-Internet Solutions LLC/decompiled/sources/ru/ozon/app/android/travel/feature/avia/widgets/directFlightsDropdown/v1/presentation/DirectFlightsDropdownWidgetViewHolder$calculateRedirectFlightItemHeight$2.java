package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$2 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DirectFlightsDropdownWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$2(DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder) {
        super(1);
        this.this$0 = directFlightsDropdownWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        DirectFlightsDropdownItemView tempViewForMeasure;
        DirectFlightsDropdownItemView tempViewForMeasure2;
        DirectFlightsDropdownItemView tempViewForMeasure3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        tempViewForMeasure = this.this$0.getTempViewForMeasure();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, tempViewForMeasure);
        tempViewForMeasure2 = this.this$0.getTempViewForMeasure();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, tempViewForMeasure2);
        tempViewForMeasure3 = this.this$0.getTempViewForMeasure();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, tempViewForMeasure3);
    }
}
