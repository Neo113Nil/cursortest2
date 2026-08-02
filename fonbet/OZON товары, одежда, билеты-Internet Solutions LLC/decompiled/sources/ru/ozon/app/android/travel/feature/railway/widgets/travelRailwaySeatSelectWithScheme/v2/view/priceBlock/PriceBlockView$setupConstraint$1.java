package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.priceBlock;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PriceBlockView$setupConstraint$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PriceBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceBlockView$setupConstraint$1(PriceBlockView priceBlockView) {
        super(1);
        this.this$0 = priceBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomView titleTav;
        TextAtomView titleTav2;
        TextAtomView titleTav3;
        TextAtomView descriptionTav;
        TextAtomView titleTav4;
        int i11;
        TextAtomView titleTav5;
        TextAtomView titleTav6;
        TextAtomView descriptionTav2;
        TextAtomView titleTav7;
        TextAtomView descriptionTav3;
        TextAtomView descriptionTav4;
        TextAtomView priceTav;
        TextAtomView descriptionTav5;
        TextAtomView titleTav8;
        TextAtomView priceTav2;
        TextAtomView titleTav9;
        TextAtomView priceTav3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        titleTav = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, titleTav);
        titleTav2 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, titleTav2);
        titleTav3 = this.this$0.getTitleTav();
        descriptionTav = this.this$0.getDescriptionTav();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, titleTav3, descriptionTav);
        titleTav4 = this.this$0.getTitleTav();
        int id2 = titleTav4.getId();
        i11 = this.this$0.dp8;
        updateConstraints.Z(id2, 7, i11);
        titleTav5 = this.this$0.getTitleTav();
        updateConstraints.c0(0.0f, titleTav5.getId());
        titleTav6 = this.this$0.getTitleTav();
        updateConstraints.d0(titleTav6.getId(), 2);
        descriptionTav2 = this.this$0.getDescriptionTav();
        int id3 = descriptionTav2.getId();
        titleTav7 = this.this$0.getTitleTav();
        ConstraintSetExtKt.baselineToBaseline$default(updateConstraints, id3, titleTav7.getId(), 0, 4, null);
        descriptionTav3 = this.this$0.getDescriptionTav();
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, descriptionTav3);
        descriptionTav4 = this.this$0.getDescriptionTav();
        priceTav = this.this$0.getPriceTav();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, descriptionTav4, priceTav);
        descriptionTav5 = this.this$0.getDescriptionTav();
        titleTav8 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, descriptionTav5, titleTav8);
        priceTav2 = this.this$0.getPriceTav();
        titleTav9 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.baselineToBaseline(updateConstraints, priceTav2, titleTav9);
        priceTav3 = this.this$0.getPriceTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, priceTav3);
    }
}
