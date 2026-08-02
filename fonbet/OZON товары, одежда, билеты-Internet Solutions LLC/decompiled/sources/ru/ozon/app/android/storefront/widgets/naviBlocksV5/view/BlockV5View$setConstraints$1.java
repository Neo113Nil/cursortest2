package ru.ozon.app.android.storefront.widgets.naviBlocksV5.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class BlockV5View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ BlockV5View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockV5View$setConstraints$1(BlockV5View blockV5View) {
        super(1);
        this.this$0 = blockV5View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        IconView iconView;
        IconView iconView2;
        IconView iconView3;
        IconView iconView4;
        TextAtomV2View textAtomV2View;
        IconView iconView5;
        int i11;
        TextAtomV2View textAtomV2View2;
        int i12;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        TextAtomV2View textAtomV2View8;
        int i13;
        TextAtomV2View textAtomV2View9;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconView = this.this$0.iconView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, iconView.getId(), 0, 0, 4, null);
        iconView2 = this.this$0.iconView;
        ConstraintSetExtKt.topToTop$default(updateConstraints, iconView2.getId(), 0, 0, 4, null);
        iconView3 = this.this$0.iconView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, iconView3.getId(), 0, 0, 4, null);
        iconView4 = this.this$0.iconView;
        updateConstraints.f0(0.0f, iconView4.getId());
        textAtomV2View = this.this$0.titleTextView;
        int id2 = textAtomV2View.getId();
        iconView5 = this.this$0.iconView;
        int id3 = iconView5.getId();
        i11 = this.this$0.dp4;
        ConstraintSetExtKt.startToEnd(updateConstraints, id2, id3, i11);
        textAtomV2View2 = this.this$0.titleTextView;
        int id4 = textAtomV2View2.getId();
        i12 = this.this$0.dp2;
        ConstraintSetExtKt.topToTop(updateConstraints, id4, 0, i12);
        textAtomV2View3 = this.this$0.titleTextView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, textAtomV2View3.getId(), 0, 0, 4, null);
        textAtomV2View4 = this.this$0.subtitleTextView;
        int id5 = textAtomV2View4.getId();
        textAtomV2View5 = this.this$0.titleTextView;
        ConstraintSetExtKt.startToStart$default(updateConstraints, id5, textAtomV2View5.getId(), 0, 4, null);
        textAtomV2View6 = this.this$0.subtitleTextView;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, textAtomV2View6.getId(), 0, 0, 4, null);
        textAtomV2View7 = this.this$0.subtitleTextView;
        int id6 = textAtomV2View7.getId();
        textAtomV2View8 = this.this$0.titleTextView;
        int id7 = textAtomV2View8.getId();
        i13 = this.this$0.dp2;
        ConstraintSetExtKt.topToBottom(updateConstraints, id6, id7, i13);
        textAtomV2View9 = this.this$0.subtitleTextView;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, textAtomV2View9.getId(), 0, 0, 4, null);
    }
}
