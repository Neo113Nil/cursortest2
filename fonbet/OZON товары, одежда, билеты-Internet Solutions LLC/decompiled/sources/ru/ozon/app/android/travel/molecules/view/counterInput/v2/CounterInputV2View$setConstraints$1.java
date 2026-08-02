package ru.ozon.app.android.travel.molecules.view.counterInput.v2;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CounterInputV2View$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ CounterInputV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CounterInputV2View$setConstraints$1(CounterInputV2View counterInputV2View) {
        super(1);
        this.this$0 = counterInputV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, this.this$0.getDecrementButtonIBV());
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.this$0.getDecrementButtonIBV());
        textAtomV2View = this.this$0.currentValueTAV;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View, this.this$0.getDecrementButtonIBV());
        textAtomV2View2 = this.this$0.currentValueTAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.currentValueTAV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, this.this$0.getIncrementButtonIBV());
        textAtomV2View4 = this.this$0.currentValueTAV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View4);
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, this.this$0.getIncrementButtonIBV());
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.this$0.getIncrementButtonIBV());
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, this.this$0.getDecrementLoaderViewLV(), this.this$0.getDecrementButtonIBV());
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, this.this$0.getDecrementLoaderViewLV(), this.this$0.getDecrementButtonIBV());
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, this.this$0.getDecrementLoaderViewLV(), this.this$0.getDecrementButtonIBV());
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, this.this$0.getDecrementLoaderViewLV(), this.this$0.getDecrementButtonIBV());
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, this.this$0.getIncrementLoaderViewLV(), this.this$0.getIncrementButtonIBV());
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, this.this$0.getIncrementLoaderViewLV(), this.this$0.getIncrementButtonIBV());
        ConstraintLayoutExtensionsKt.endToEnd(applyConstraint, this.this$0.getIncrementLoaderViewLV(), this.this$0.getIncrementButtonIBV());
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, this.this$0.getIncrementLoaderViewLV(), this.this$0.getIncrementButtonIBV());
    }
}
