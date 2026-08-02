package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class TariffLuggageView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TariffLuggageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TariffLuggageView$setConstraints$1(TariffLuggageView tariffLuggageView) {
        super(1);
        this.this$0 = tariffLuggageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        AspectView aspectView;
        AspectView aspectView2;
        AspectView aspectView3;
        AspectView aspectView4;
        TextAtomV2View textAtomV2View;
        int i11;
        TextAtomV2View textAtomV2View2;
        int i12;
        TextAtomV2View textAtomV2View3;
        int i13;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        int i14;
        TextAtomV2View textAtomV2View8;
        int i15;
        TextAtomV2View textAtomV2View9;
        int i16;
        TextAtomV2View textAtomV2View10;
        int i17;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        aspectView = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, aspectView);
        aspectView2 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, aspectView2);
        aspectView3 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, aspectView3);
        aspectView4 = this.this$0.aspectAV;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, aspectView4);
        textAtomV2View = this.this$0.titleTV;
        i11 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View, i11);
        textAtomV2View2 = this.this$0.titleTV;
        i12 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View2, i12);
        textAtomV2View3 = this.this$0.titleTV;
        i13 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View3, i13);
        textAtomV2View4 = this.this$0.titleTV;
        textAtomV2View5 = this.this$0.subtitleTV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View4, textAtomV2View5);
        textAtomV2View6 = this.this$0.subtitleTV;
        textAtomV2View7 = this.this$0.titleTV;
        i14 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, textAtomV2View6, textAtomV2View7, i14);
        textAtomV2View8 = this.this$0.subtitleTV;
        i15 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, textAtomV2View8, i15);
        textAtomV2View9 = this.this$0.subtitleTV;
        i16 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, textAtomV2View9, i16);
        textAtomV2View10 = this.this$0.subtitleTV;
        i17 = this.this$0.dp6;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, textAtomV2View10, i17);
    }
}
