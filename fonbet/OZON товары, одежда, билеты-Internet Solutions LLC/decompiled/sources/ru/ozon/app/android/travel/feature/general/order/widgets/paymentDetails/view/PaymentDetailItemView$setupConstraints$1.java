package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PaymentDetailItemView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PaymentDetailItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentDetailItemView$setupConstraints$1(PaymentDetailItemView paymentDetailItemView) {
        super(1);
        this.this$0 = paymentDetailItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        AppCompatImageView iconAciv;
        AppCompatImageView iconAciv2;
        TextAtomView titleTav;
        AppCompatImageView iconAciv3;
        int i11;
        TextAtomView titleTav2;
        int i12;
        TextAtomView titleTav3;
        TextAtomView descriptionTav;
        TextAtomView titleTav4;
        TextAtomView descriptionTav2;
        TextAtomView titleTav5;
        int i13;
        TextAtomView descriptionTav3;
        IconButtonV3View iconButton;
        TextAtomView descriptionTav4;
        TextAtomView descriptionTav5;
        TextAtomView descriptionTav6;
        IconButtonV3View iconButton2;
        TextAtomView descriptionTav7;
        int i14;
        IconButtonV3View iconButton3;
        TextAtomView descriptionTav8;
        IconButtonV3View iconButton4;
        TextAtomView descriptionTav9;
        IconButtonV3View iconButton5;
        DisclaimerContainer informerDV;
        DisclaimerContainer informerDV2;
        DisclaimerContainer informerDV3;
        TextAtomView descriptionTav10;
        int i15;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        iconAciv = this.this$0.getIconAciv();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, iconAciv);
        iconAciv2 = this.this$0.getIconAciv();
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, iconAciv2);
        titleTav = this.this$0.getTitleTav();
        iconAciv3 = this.this$0.getIconAciv();
        i11 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, titleTav, iconAciv3, i11);
        titleTav2 = this.this$0.getTitleTav();
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, titleTav2, i12);
        titleTav3 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, titleTav3);
        descriptionTav = this.this$0.getDescriptionTav();
        titleTav4 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, descriptionTav, titleTav4);
        descriptionTav2 = this.this$0.getDescriptionTav();
        titleTav5 = this.this$0.getTitleTav();
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, descriptionTav2, titleTav5, i13);
        descriptionTav3 = this.this$0.getDescriptionTav();
        iconButton = this.this$0.getIconButton();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, descriptionTav3, iconButton);
        descriptionTav4 = this.this$0.getDescriptionTav();
        updateConstraints.C(descriptionTav4.getId(), true);
        descriptionTav5 = this.this$0.getDescriptionTav();
        updateConstraints.c0(0.0f, descriptionTav5.getId());
        descriptionTav6 = this.this$0.getDescriptionTav();
        updateConstraints.d0(descriptionTav6.getId(), 2);
        iconButton2 = this.this$0.getIconButton();
        descriptionTav7 = this.this$0.getDescriptionTav();
        i14 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, iconButton2, descriptionTav7, i14);
        iconButton3 = this.this$0.getIconButton();
        descriptionTav8 = this.this$0.getDescriptionTav();
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, iconButton3, descriptionTav8);
        iconButton4 = this.this$0.getIconButton();
        descriptionTav9 = this.this$0.getDescriptionTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconButton4, descriptionTav9);
        iconButton5 = this.this$0.getIconButton();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, iconButton5);
        informerDV = this.this$0.getInformerDV();
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, informerDV);
        informerDV2 = this.this$0.getInformerDV();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, informerDV2);
        informerDV3 = this.this$0.getInformerDV();
        descriptionTav10 = this.this$0.getDescriptionTav();
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, informerDV3, descriptionTav10, i15);
    }
}
