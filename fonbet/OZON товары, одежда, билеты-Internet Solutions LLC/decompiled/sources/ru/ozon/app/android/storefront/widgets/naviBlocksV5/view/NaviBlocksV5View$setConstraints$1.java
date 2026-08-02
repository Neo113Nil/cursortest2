package ru.ozon.app.android.storefront.widgets.naviBlocksV5.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NaviBlocksV5View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ NaviBlocksV5View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV5View$setConstraints$1(NaviBlocksV5View naviBlocksV5View) {
        super(1);
        this.this$0 = naviBlocksV5View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        BlockV5View blockV5View;
        BlockV5View blockV5View2;
        BlockV5View blockV5View3;
        BlockV5View blockV5View4;
        BlockV5View blockV5View5;
        BlockV5View blockV5View6;
        BlockV5View blockV5View7;
        BlockV5View blockV5View8;
        BlockV5View blockV5View9;
        BlockV5View blockV5View10;
        BlockV5View blockV5View11;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        blockV5View = this.this$0.leftBlockView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, blockV5View.getId(), 0, 0, 4, null);
        blockV5View2 = this.this$0.leftBlockView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, blockV5View2.getId(), 0, 0, 4, null);
        blockV5View3 = this.this$0.leftBlockView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, blockV5View3.getId(), 0, 0, 4, null);
        blockV5View4 = this.this$0.leftBlockView;
        int id2 = blockV5View4.getId();
        blockV5View5 = this.this$0.rightBlockView;
        ConstraintSetExtKt.endToStart$default(updateConstraints, id2, blockV5View5.getId(), 0, 4, null);
        blockV5View6 = this.this$0.leftBlockView;
        updateConstraints.d0(blockV5View6.getId(), 0);
        blockV5View7 = this.this$0.rightBlockView;
        int id3 = blockV5View7.getId();
        blockV5View8 = this.this$0.leftBlockView;
        ConstraintSetExtKt.startToEnd$default(updateConstraints, id3, blockV5View8.getId(), 0, 4, null);
        blockV5View9 = this.this$0.rightBlockView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, blockV5View9.getId(), 0, 0, 4, null);
        blockV5View10 = this.this$0.rightBlockView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, blockV5View10.getId(), 0, 0, 4, null);
        blockV5View11 = this.this$0.rightBlockView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, blockV5View11.getId(), 0, 0, 4, null);
    }
}
