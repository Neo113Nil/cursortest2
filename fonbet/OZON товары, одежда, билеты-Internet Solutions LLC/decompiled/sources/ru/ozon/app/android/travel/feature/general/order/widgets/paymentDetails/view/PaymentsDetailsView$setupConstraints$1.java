package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PaymentsDetailsView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ PaymentsDetailsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentsDetailsView$setupConstraints$1(PaymentsDetailsView paymentsDetailsView) {
        super(1);
        this.this$0 = paymentsDetailsView;
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
        AppCompatImageView iconAciv;
        View view3;
        AppCompatImageView iconAciv2;
        View view4;
        AppCompatImageView iconAciv3;
        View view5;
        AppCompatImageView iconAciv4;
        View view6;
        TextAtomView titleTav;
        int i11;
        TextAtomView titleTav2;
        AppCompatImageView iconAciv5;
        int i12;
        TextAtomView titleTav3;
        TextAtomView errorTav;
        TextAtomView titleTav4;
        TextAtomView errorTav2;
        TextAtomView titleTav5;
        int i13;
        TextAtomView errorTav3;
        TextAtomView titleTav6;
        SmallButtonView payButton;
        TextAtomView titleTav7;
        SmallButtonView payButton2;
        TextAtomView errorTav4;
        int i14;
        SmallButtonView payButton3;
        SmallButtonView payButton4;
        SmallButtonView payButton5;
        View view7;
        View view8;
        SmallButtonView payButton6;
        int i15;
        View view9;
        View view10;
        int i16;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        View view11;
        int i17;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        view = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view);
        view2 = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, view2);
        iconAciv = this.this$0.getIconAciv();
        view3 = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, iconAciv, view3);
        iconAciv2 = this.this$0.getIconAciv();
        view4 = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, iconAciv2, view4);
        iconAciv3 = this.this$0.getIconAciv();
        view5 = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, iconAciv3, view5);
        iconAciv4 = this.this$0.getIconAciv();
        view6 = this.this$0.iconBackgroundView;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, iconAciv4, view6);
        titleTav = this.this$0.getTitleTav();
        i11 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, titleTav, i11);
        titleTav2 = this.this$0.getTitleTav();
        iconAciv5 = this.this$0.getIconAciv();
        i12 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, titleTav2, iconAciv5, i12);
        titleTav3 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, titleTav3);
        errorTav = this.this$0.getErrorTav();
        titleTav4 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, errorTav, titleTav4);
        errorTav2 = this.this$0.getErrorTav();
        titleTav5 = this.this$0.getTitleTav();
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, errorTav2, titleTav5, i13);
        errorTav3 = this.this$0.getErrorTav();
        titleTav6 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, errorTav3, titleTav6);
        payButton = this.this$0.getPayButton();
        titleTav7 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, payButton, titleTav7);
        payButton2 = this.this$0.getPayButton();
        errorTav4 = this.this$0.getErrorTav();
        i14 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, payButton2, errorTav4, i14);
        payButton3 = this.this$0.getPayButton();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, payButton3);
        payButton4 = this.this$0.getPayButton();
        updateConstraints.C(payButton4.getId(), true);
        payButton5 = this.this$0.getPayButton();
        updateConstraints.c0(0.0f, payButton5.getId());
        view7 = this.this$0.separatorView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view7);
        view8 = this.this$0.separatorView;
        payButton6 = this.this$0.getPayButton();
        i15 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, view8, payButton6, i15);
        view9 = this.this$0.separatorView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, view9);
        view10 = this.this$0.separatorView;
        int id2 = view10.getId();
        i16 = this.this$0.dp16;
        updateConstraints.Z(id2, 3, i16);
        recyclerView = this.this$0.detailsRv;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, recyclerView);
        recyclerView2 = this.this$0.detailsRv;
        view11 = this.this$0.separatorView;
        i17 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, recyclerView2, view11, i17);
        recyclerView3 = this.this$0.detailsRv;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, recyclerView3);
    }
}
