package ru.ozon.uni.android.component.sheet;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SheetView$addCloseButton$1$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ IconButtonView $closeButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetView$addCloseButton$1$1(IconButtonView iconButtonView) {
        super(1);
        this.$closeButton = iconButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, this.$closeButton);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.$closeButton);
        updateConstraints.e0(this.$closeButton.getId(), 3, UiExtKt.toPx(16));
        updateConstraints.e0(this.$closeButton.getId(), 7, UiExtKt.toPx(16));
    }
}
