package ru.ozon.uni.android.controls.buttonV3;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ButtonV3View$layoutTitle$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ButtonV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonV3View$layoutTitle$1(ButtonV3View buttonV3View) {
        super(1);
        this.this$0 = buttonV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        ButtonTextView buttonTextView;
        ButtonTextView buttonTextView2;
        ButtonTextView buttonTextView3;
        ButtonTextView buttonTextView4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        buttonTextView = this.this$0.titleView;
        ConstraintSetExtKt.centerInParent(updateConstraints, buttonTextView);
        buttonTextView2 = this.this$0.titleView;
        updateConstraints.C(buttonTextView2.getId(), true);
        int px = UiExtKt.toPx(this.this$0.getSize().getHorizontalMargin());
        buttonTextView3 = this.this$0.titleView;
        updateConstraints.e0(buttonTextView3.getId(), 6, px);
        buttonTextView4 = this.this$0.titleView;
        updateConstraints.e0(buttonTextView4.getId(), 7, px);
    }
}
