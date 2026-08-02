package ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary.InteractiveSummaryView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class InteractiveSummaryView$addSubtitleView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ InteractiveSummaryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InteractiveSummaryView$addSubtitleView$1(InteractiveSummaryView interactiveSummaryView) {
        super(1);
        this.this$0 = interactiveSummaryView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        InteractiveSummaryView.Companion companion;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintSetExtKt.startToStart$default(updateConstraints, this.this$0.getSubtitleView().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(updateConstraints, this.this$0.getSubtitleView().getId(), this.this$0.getTitleIconView().getId(), 0, 4, null);
        int id2 = this.this$0.getSubtitleView().getId();
        int id3 = this.this$0.getInfoView().getId();
        companion = InteractiveSummaryView.Companion;
        ConstraintSetExtKt.endToStart(updateConstraints, id2, id3, companion.getDP_4());
    }
}
