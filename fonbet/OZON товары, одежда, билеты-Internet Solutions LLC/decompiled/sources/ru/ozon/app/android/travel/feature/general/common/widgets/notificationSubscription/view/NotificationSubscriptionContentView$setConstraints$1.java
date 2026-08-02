package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NotificationSubscriptionContentView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ NotificationSubscriptionContentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionContentView$setConstraints$1(NotificationSubscriptionContentView notificationSubscriptionContentView) {
        super(1);
        this.this$0 = notificationSubscriptionContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        CheckBoxView checkBoxView;
        CheckBoxView checkBoxView2;
        CheckBoxView checkBoxView3;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        CheckBoxView checkBoxView4;
        int i11;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        checkBoxView = this.this$0.checkboxView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, checkBoxView);
        checkBoxView2 = this.this$0.checkboxView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, checkBoxView2);
        checkBoxView3 = this.this$0.checkboxView;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, checkBoxView3);
        textAtomV2View = this.this$0.textView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, textAtomV2View);
        textAtomV2View2 = this.this$0.textView;
        checkBoxView4 = this.this$0.checkboxView;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, textAtomV2View2, checkBoxView4, i11);
        textAtomV2View3 = this.this$0.textView;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, textAtomV2View3);
        textAtomV2View4 = this.this$0.textView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, textAtomV2View4);
    }
}
