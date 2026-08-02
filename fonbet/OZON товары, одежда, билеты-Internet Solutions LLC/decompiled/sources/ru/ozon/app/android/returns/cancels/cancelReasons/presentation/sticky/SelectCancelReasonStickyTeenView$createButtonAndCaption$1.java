package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SelectCancelReasonStickyTeenView$createButtonAndCaption$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ButtonV3View $button;
    final /* synthetic */ TextAtomV2View $caption;
    final /* synthetic */ SelectCancelReasonStickyTeenView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectCancelReasonStickyTeenView$createButtonAndCaption$1(SelectCancelReasonStickyTeenView selectCancelReasonStickyTeenView, ButtonV3View buttonV3View, TextAtomV2View textAtomV2View) {
        super(1);
        this.this$0 = selectCancelReasonStickyTeenView;
        this.$button = buttonV3View;
        this.$caption = textAtomV2View;
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
        View view;
        View view2;
        View view3;
        View view4;
        int i15;
        IslandSeparatorView islandSeparatorView;
        IslandSeparatorView islandSeparatorView2;
        IslandSeparatorView islandSeparatorView3;
        IslandSeparatorView islandSeparatorView4;
        View view5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        int id2 = this.this$0.getCellView().getId();
        i11 = this.this$0.horizontalCellMargin;
        ConstraintSetExtKt.startToStart(updateConstraints, id2, 0, i11);
        int id3 = this.this$0.getCellView().getId();
        i12 = this.this$0.horizontalCellMargin;
        ConstraintSetExtKt.endToEnd(updateConstraints, id3, 0, i12);
        int id4 = this.this$0.getCellView().getId();
        int id5 = this.$button.getId();
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ConstraintSetExtKt.bottomToTop(updateConstraints, id4, id5, UiExtKt.toPx(20, context));
        int id6 = this.$button.getId();
        i13 = this.this$0.horizontalMargin;
        ConstraintSetExtKt.startToStart(updateConstraints, id6, 0, i13);
        int id7 = this.$button.getId();
        i14 = this.this$0.horizontalMargin;
        ConstraintSetExtKt.endToEnd(updateConstraints, id7, 0, i14);
        ConstraintSetExtKt.bottomToTop$default(updateConstraints, this.$button.getId(), this.$caption.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(updateConstraints, this.$caption.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(updateConstraints, this.$caption.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, this.$caption.getId(), 0, 0, 4, null);
        view = this.this$0.bgView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, view.getId(), 0, 0, 4, null);
        view2 = this.this$0.bgView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, view2.getId(), 0, 0, 4, null);
        view3 = this.this$0.bgView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, view3.getId(), 0, 0, 4, null);
        view4 = this.this$0.bgView;
        int id8 = view4.getId();
        int id9 = this.$button.getId();
        i15 = this.this$0.verticalMargin;
        ConstraintSetExtKt.topToTop(updateConstraints, id8, id9, i15 * (-1));
        islandSeparatorView = this.this$0.islandSeparatorView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, islandSeparatorView.getId(), 0, 0, 4, null);
        islandSeparatorView2 = this.this$0.islandSeparatorView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, islandSeparatorView2.getId(), 0, 0, 4, null);
        islandSeparatorView3 = this.this$0.islandSeparatorView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, islandSeparatorView3.getId(), 0, 0, 4, null);
        islandSeparatorView4 = this.this$0.islandSeparatorView;
        int id10 = islandSeparatorView4.getId();
        view5 = this.this$0.bgView;
        ConstraintSetExtKt.bottomToTop$default(updateConstraints, id10, view5.getId(), 0, 4, null);
    }
}
