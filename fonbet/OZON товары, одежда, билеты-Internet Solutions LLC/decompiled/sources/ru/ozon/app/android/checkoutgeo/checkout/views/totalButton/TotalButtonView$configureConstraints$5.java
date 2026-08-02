package ru.ozon.app.android.checkoutgeo.checkout.views.totalButton;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TotalButtonView$configureConstraints$5 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TotalButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalButtonView$configureConstraints$5(TotalButtonView totalButtonView) {
        super(1);
        this.this$0 = totalButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        TotalBadgeView totalBadgeView;
        TotalButtonView.Companion companion;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.subtitleView;
        int id2 = textAtomV2View.getId();
        totalBadgeView = this.this$0.badgeView;
        int id3 = totalBadgeView.getId();
        companion = TotalButtonView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, id2, id3, companion.getDP_6());
    }
}
