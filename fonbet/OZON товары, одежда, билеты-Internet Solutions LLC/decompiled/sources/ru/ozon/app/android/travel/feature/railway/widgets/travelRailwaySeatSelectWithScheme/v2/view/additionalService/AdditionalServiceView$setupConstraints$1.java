package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.additionalService;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class AdditionalServiceView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ AdditionalServiceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServiceView$setupConstraints$1(AdditionalServiceView additionalServiceView) {
        super(1);
        this.this$0 = additionalServiceView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        View view;
        View view2;
        TextAtomView additionalServiceTitleTav;
        View view3;
        TextAtomView additionalServiceTitleTav2;
        View view4;
        TextAtomView additionalServiceTitleTav3;
        View view5;
        TextAtomView additionalServiceDescriptionTav;
        TextAtomView additionalServiceTitleTav4;
        TextAtomView additionalServiceDescriptionTav2;
        TextAtomView additionalServicePriceTav;
        TextAtomView additionalServiceDescriptionTav3;
        TextAtomView additionalServiceDescriptionTav4;
        TextAtomView additionalServiceTitleTav5;
        TextAtomView additionalServicePriceTav2;
        TextAtomView additionalServiceTitleTav6;
        TextAtomView additionalServicePriceTav3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        view = this.this$0.additionalServiceCheckboxButtonView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, view);
        view2 = this.this$0.additionalServiceCheckboxButtonView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view2);
        additionalServiceTitleTav = this.this$0.getAdditionalServiceTitleTav();
        view3 = this.this$0.additionalServiceCheckboxButtonView;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, additionalServiceTitleTav, view3);
        additionalServiceTitleTav2 = this.this$0.getAdditionalServiceTitleTav();
        view4 = this.this$0.additionalServiceCheckboxButtonView;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, additionalServiceTitleTav2, view4);
        additionalServiceTitleTav3 = this.this$0.getAdditionalServiceTitleTav();
        view5 = this.this$0.additionalServiceCheckboxButtonView;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, additionalServiceTitleTav3, view5);
        additionalServiceDescriptionTav = this.this$0.getAdditionalServiceDescriptionTav();
        additionalServiceTitleTav4 = this.this$0.getAdditionalServiceTitleTav();
        ConstraintLayoutExtensionsKt.baselineToBaseline(updateConstraints, additionalServiceDescriptionTav, additionalServiceTitleTav4);
        additionalServiceDescriptionTav2 = this.this$0.getAdditionalServiceDescriptionTav();
        additionalServicePriceTav = this.this$0.getAdditionalServicePriceTav();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, additionalServiceDescriptionTav2, additionalServicePriceTav);
        additionalServiceDescriptionTav3 = this.this$0.getAdditionalServiceDescriptionTav();
        updateConstraints.c0(0.0f, additionalServiceDescriptionTav3.getId());
        additionalServiceDescriptionTav4 = this.this$0.getAdditionalServiceDescriptionTav();
        additionalServiceTitleTav5 = this.this$0.getAdditionalServiceTitleTav();
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, additionalServiceDescriptionTav4, additionalServiceTitleTav5);
        additionalServicePriceTav2 = this.this$0.getAdditionalServicePriceTav();
        additionalServiceTitleTav6 = this.this$0.getAdditionalServiceTitleTav();
        ConstraintLayoutExtensionsKt.baselineToBaseline(updateConstraints, additionalServicePriceTav2, additionalServiceTitleTav6);
        additionalServicePriceTav3 = this.this$0.getAdditionalServicePriceTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, additionalServicePriceTav3);
    }
}
