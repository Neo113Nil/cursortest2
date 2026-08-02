package ru.ozon.uni.android.controls.buttonV3;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class ButtonV3View$layoutData$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $dataViewId;
    final /* synthetic */ ButtonV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonV3View$layoutData$1(int i11, ButtonV3View buttonV3View) {
        super(1);
        this.$dataViewId = i11;
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
        int dataMinWidth;
        ButtonTextView buttonTextView2;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        updateConstraints.C(this.$dataViewId, true);
        updateConstraints.m(this.$dataViewId);
        updateConstraints.e0(this.$dataViewId, 7, UiExtKt.toPx(this.this$0.getSize().getDataMargin()));
        buttonTextView = this.this$0.titleView;
        updateConstraints.e0(buttonTextView.getId(), 7, UiExtKt.toPx(8));
        int i11 = this.$dataViewId;
        dataMinWidth = this.this$0.getDataMinWidth();
        updateConstraints.y(i11, dataMinWidth);
        buttonTextView2 = this.this$0.titleView;
        updateConstraints.E(new int[]{buttonTextView2.getId(), this.$dataViewId}, null, 1);
    }
}
