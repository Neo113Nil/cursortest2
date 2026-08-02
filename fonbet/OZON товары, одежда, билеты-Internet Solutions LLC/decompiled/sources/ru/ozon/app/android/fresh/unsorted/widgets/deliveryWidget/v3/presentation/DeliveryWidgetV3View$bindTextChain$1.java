package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class DeliveryWidgetV3View$bindTextChain$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $eclipseMargin;
    final /* synthetic */ DeliveryWidgetV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3View$bindTextChain$1(DeliveryWidgetV3View deliveryWidgetV3View, int i11) {
        super(1);
        this.this$0 = deliveryWidgetV3View;
        this.$eclipseMargin = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        int i12;
        TextAtomV2View textAtomV2View4;
        int i13;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        TextAtomV2View textAtomV2View7;
        int i21;
        int i22;
        TextAtomV2View textAtomV2View8;
        View view2;
        TextAtomV2View textAtomV2View9;
        int i23;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        textAtomV2View = this.this$0.firstTextView;
        int id2 = textAtomV2View.getId();
        i11 = this.this$0.eclipseViewId;
        ConstraintSetExtKt.topToTop$default(updateConstraints, id2, i11, 0, 4, null);
        textAtomV2View2 = this.this$0.firstTextView;
        ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, textAtomV2View2.getId());
        textAtomV2View3 = this.this$0.firstTextView;
        int id3 = textAtomV2View3.getId();
        i12 = this.this$0.eclipseViewId;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, id3, i12, 0, 4, null);
        textAtomV2View4 = this.this$0.firstTextView;
        int id4 = textAtomV2View4.getId();
        i13 = this.this$0.eclipseViewId;
        ConstraintSetExtKt.endToStart$default(updateConstraints, id4, i13, 0, 4, null);
        textAtomV2View5 = this.this$0.firstTextView;
        updateConstraints.d0(textAtomV2View5.getId(), 2);
        textAtomV2View6 = this.this$0.firstTextView;
        updateConstraints.f0(0.5f, textAtomV2View6.getId());
        i14 = this.this$0.eclipseViewId;
        i15 = this.this$0.secondTextViewId;
        ConstraintSetExtKt.topToTop$default(updateConstraints, i14, i15, 0, 4, null);
        i16 = this.this$0.eclipseViewId;
        i17 = this.this$0.secondTextViewId;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, i16, i17, 0, 4, null);
        i18 = this.this$0.eclipseViewId;
        i19 = this.this$0.secondTextViewId;
        ConstraintSetExtKt.endToStart(updateConstraints, i18, i19, this.$eclipseMargin);
        view = this.this$0.eclipseView;
        int id5 = view.getId();
        textAtomV2View7 = this.this$0.firstTextView;
        ConstraintSetExtKt.startToEnd(updateConstraints, id5, textAtomV2View7.getId(), this.$eclipseMargin);
        i21 = this.this$0.eclipseViewId;
        updateConstraints.c0(0.5f, i21);
        i22 = this.this$0.eclipseViewId;
        updateConstraints.f0(0.5f, i22);
        textAtomV2View8 = this.this$0.secondTextView;
        int id6 = textAtomV2View8.getId();
        view2 = this.this$0.eclipseView;
        ConstraintSetExtKt.startToEnd$default(updateConstraints, id6, view2.getId(), 0, 4, null);
        textAtomV2View9 = this.this$0.secondTextView;
        int id7 = textAtomV2View9.getId();
        i23 = this.this$0.trailingIconId;
        ConstraintSetExtKt.endToStart$default(updateConstraints, id7, i23, 0, 4, null);
    }
}
