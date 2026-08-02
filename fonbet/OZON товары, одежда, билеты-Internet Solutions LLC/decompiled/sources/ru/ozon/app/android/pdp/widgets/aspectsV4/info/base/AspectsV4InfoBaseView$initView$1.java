package ru.ozon.app.android.pdp.widgets.aspectsV4.info.base;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class AspectsV4InfoBaseView$initView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AspectsV4InfoBaseView<VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4InfoBaseView$initView$1(AspectsV4InfoBaseView<VO> aspectsV4InfoBaseView) {
        super(1);
        this.this$0 = aspectsV4InfoBaseView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        BadgeView badgeView;
        BadgeView badgeView2;
        BadgeView badgeView3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintSetExtKt.startToStart$default(updateConstraints, this.this$0.getTextView().getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(updateConstraints, this.this$0.getTextView().getId(), 0, 0, 4, null);
        int id2 = this.this$0.getTextView().getId();
        badgeView = ((AspectsV4InfoBaseView) this.this$0).badgeView;
        ConstraintSetExtKt.endToStart(updateConstraints, id2, badgeView.getId(), Dimens.INSTANCE.getDP_4());
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, this.this$0.getTextView().getId(), 0, 0, 4, null);
        badgeView2 = ((AspectsV4InfoBaseView) this.this$0).badgeView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, badgeView2.getId(), 0, 0, 4, null);
        badgeView3 = ((AspectsV4InfoBaseView) this.this$0).badgeView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, badgeView3.getId(), 0, 0, 4, null);
    }
}
