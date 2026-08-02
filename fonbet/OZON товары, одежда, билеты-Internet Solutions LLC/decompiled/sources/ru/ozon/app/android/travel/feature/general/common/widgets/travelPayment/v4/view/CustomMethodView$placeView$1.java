package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

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
/* loaded from: classes4.dex */
final class CustomMethodView$placeView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ CustomMethodView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomMethodView$placeView$1(CustomMethodView customMethodView) {
        super(1);
        this.this$0 = customMethodView;
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
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        IconView iconView4;
        TextAtomV2View textAtomV2View5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconView = this.this$0.icon;
        ConstraintSetExtKt.startToStart$default(updateConstraints, iconView.getId(), 0, 0, 4, null);
        iconView2 = this.this$0.icon;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, iconView2.getId(), 0, 0, 4, null);
        iconView3 = this.this$0.icon;
        ConstraintSetExtKt.topToTop(updateConstraints, iconView3.getId(), 0, this.this$0.getDp14());
        textAtomV2View = this.this$0.title;
        ConstraintSetExtKt.startToStart$default(updateConstraints, textAtomV2View.getId(), 0, 0, 4, null);
        textAtomV2View2 = this.this$0.title;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, textAtomV2View2.getId(), 0, 0, 4, null);
        textAtomV2View3 = this.this$0.title;
        ConstraintSetExtKt.topToTop$default(updateConstraints, textAtomV2View3.getId(), 0, 0, 4, null);
        textAtomV2View4 = this.this$0.title;
        int id2 = textAtomV2View4.getId();
        iconView4 = this.this$0.icon;
        ConstraintSetExtKt.topToBottom(updateConstraints, id2, iconView4.getId(), this.this$0.getDp6());
        textAtomV2View5 = this.this$0.title;
        updateConstraints.C(textAtomV2View5.getId(), true);
    }
}
