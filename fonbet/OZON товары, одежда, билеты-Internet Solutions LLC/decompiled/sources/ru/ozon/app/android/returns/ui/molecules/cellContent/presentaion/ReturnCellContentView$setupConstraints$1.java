package ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ReturnCellContentView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ ReturnCellContentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCellContentView$setupConstraints$1(ReturnCellContentView returnCellContentView) {
        super(1);
        this.this$0 = returnCellContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        View view;
        int i11;
        View view2;
        View view3;
        View view4;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, this.this$0.getTitleTextAtomView());
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.this$0.getTitleTextAtomView());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.this$0.getTitleTextAtomView());
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, this.this$0.getRowsRecyclerView().getId(), this.this$0.getTitleTextAtomView().getId());
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.this$0.getRowsRecyclerView());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.this$0.getRowsRecyclerView());
        view = this.this$0.separatorView;
        int id2 = view.getId();
        int id3 = this.this$0.getRowsRecyclerView().getId();
        i11 = this.this$0.marginTopSeparator;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, id2, id3, i11);
        view2 = this.this$0.separatorView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, view2);
        view3 = this.this$0.separatorView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, view3);
        int id4 = this.this$0.getTotalTextAtomView().getId();
        view4 = this.this$0.separatorView;
        int id5 = view4.getId();
        i12 = this.this$0.marginTopTotals;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, id4, id5, i12);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.this$0.getTotalTextAtomView());
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, this.this$0.getTotalTextAtomView(), this.this$0.getTotalPriceAtomView());
        ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, this.this$0.getTotalPriceAtomView(), this.this$0.getTotalTextAtomView());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.this$0.getTotalPriceAtomView());
        int id6 = this.this$0.getDescriptionTextAtomView().getId();
        int id7 = this.this$0.getTotalTextAtomView().getId();
        i13 = this.this$0.marginTopDescription;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, id6, id7, i13);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.this$0.getDescriptionTextAtomView());
        ConstraintSetExtKt.layoutConstraintEndToEndOf(updateConstraints, this.this$0.getDescriptionTextAtomView(), this.this$0.getTotalTextAtomView());
        int id8 = this.this$0.getButtonsVAL().getId();
        int id9 = this.this$0.getDescriptionTextAtomView().getId();
        i14 = this.this$0.marginTopButtons;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, id8, id9, i14);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, this.this$0.getButtonsVAL());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, this.this$0.getButtonsVAL());
    }
}
