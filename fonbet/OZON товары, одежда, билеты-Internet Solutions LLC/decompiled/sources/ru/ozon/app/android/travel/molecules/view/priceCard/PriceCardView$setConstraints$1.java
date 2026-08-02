package ru.ozon.app.android.travel.molecules.view.priceCard;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class PriceCardView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PriceCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCardView$setConstraints$1(PriceCardView priceCardView) {
        super(1);
        this.this$0 = priceCardView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        PriceAtomView priceAtomView;
        PriceAtomView priceAtomView2;
        PriceAtomView priceAtomView3;
        IconView iconView;
        int i11;
        PriceAtomView priceAtomView4;
        TextAtomV2View textAtomV2View;
        PriceAtomView priceAtomView5;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        IconView iconView2;
        int i12;
        TextAtomV2View textAtomV2View4;
        IconView iconView3;
        IconView iconView4;
        IconView iconView5;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        priceAtomView = this.this$0.price;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, priceAtomView);
        priceAtomView2 = this.this$0.price;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, priceAtomView2);
        priceAtomView3 = this.this$0.price;
        iconView = this.this$0.icon;
        i11 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, priceAtomView3, iconView, i11);
        priceAtomView4 = this.this$0.price;
        applyConstraint.c0(0.0f, priceAtomView4.getId());
        textAtomV2View = this.this$0.subtitle;
        priceAtomView5 = this.this$0.price;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, textAtomV2View, priceAtomView5);
        textAtomV2View2 = this.this$0.subtitle;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, textAtomV2View2);
        textAtomV2View3 = this.this$0.subtitle;
        iconView2 = this.this$0.icon;
        i12 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, textAtomV2View3, iconView2, i12);
        textAtomV2View4 = this.this$0.subtitle;
        applyConstraint.c0(0.0f, textAtomV2View4.getId());
        iconView3 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, iconView3);
        iconView4 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.bottomToParent(applyConstraint, iconView4);
        iconView5 = this.this$0.icon;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, iconView5);
    }
}
