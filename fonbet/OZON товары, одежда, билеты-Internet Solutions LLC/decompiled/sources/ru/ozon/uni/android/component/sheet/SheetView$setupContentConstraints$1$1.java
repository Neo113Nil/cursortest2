package ru.ozon.uni.android.component.sheet;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class SheetView$setupContentConstraints$1$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetView$setupContentConstraints$1$1(View view) {
        super(1);
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, this.$view);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.$view);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.$view);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, this.$view);
        updateConstraints.B(this.$view.getId());
    }
}
