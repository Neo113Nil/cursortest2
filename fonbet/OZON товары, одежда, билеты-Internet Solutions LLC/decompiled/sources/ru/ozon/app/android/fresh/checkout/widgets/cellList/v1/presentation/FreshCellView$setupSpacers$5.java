package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation;

import android.widget.ImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FreshCellView$setupSpacers$5 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ boolean $isCheckboxVisible;
    final /* synthetic */ FreshCellView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshCellView$setupSpacers$5(FreshCellView freshCellView, boolean z11) {
        super(1);
        this.this$0 = freshCellView;
        this.$isCheckboxVisible = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        CellView cellView;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        cellView = this.this$0.cellView;
        int id2 = cellView.getId();
        imageView = this.this$0.badgeView;
        updateConstraints.E(new int[]{id2, imageView.getId(), (this.$isCheckboxVisible ? this.this$0.checkboxView : this.this$0.iconView).getId()}, new float[]{1.0f, 0.0f, 0.0f}, 0);
    }
}
