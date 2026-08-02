package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class DeliveryWidgetV3View$bindSingleText$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DeliveryWidgetV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3View$bindSingleText$1(DeliveryWidgetV3View deliveryWidgetV3View) {
        super(1);
        this.this$0 = deliveryWidgetV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        i11 = this.this$0.secondTextViewId;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, i11);
        i12 = this.this$0.secondTextViewId;
        i13 = this.this$0.trailingIconId;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart$default(updateConstraints, i12, i13, 0, 4, null);
        i14 = this.this$0.secondTextViewId;
        updateConstraints.d0(i14, 2);
    }
}
