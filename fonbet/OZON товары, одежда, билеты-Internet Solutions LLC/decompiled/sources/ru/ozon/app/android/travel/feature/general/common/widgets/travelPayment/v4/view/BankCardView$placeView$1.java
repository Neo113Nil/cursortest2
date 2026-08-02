package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class BankCardView$placeView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ BankCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankCardView$placeView$1(BankCardView bankCardView) {
        super(1);
        this.this$0 = bankCardView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        Image image;
        TextAtomV2View textAtomV2View3;
        Image image2;
        TextAtomV2View textAtomV2View4;
        Image image3;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        Image image4;
        Image image5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        appCompatImageView = this.this$0.bankImageAciv;
        ConstraintSetExtKt.topToTop(updateConstraints, appCompatImageView.getId(), 0, this.this$0.getDp12());
        appCompatImageView2 = this.this$0.bankImageAciv;
        ConstraintSetExtKt.startToStart$default(updateConstraints, appCompatImageView2.getId(), 0, 0, 4, null);
        textAtomV2View = this.this$0.numberTav;
        ConstraintSetExtKt.startToStart$default(updateConstraints, textAtomV2View.getId(), 0, 0, 4, null);
        textAtomV2View2 = this.this$0.numberTav;
        int id2 = textAtomV2View2.getId();
        image = this.this$0.paymentSystemImage;
        ConstraintSetExtKt.endToStart(updateConstraints, id2, image.getId(), this.this$0.getDp8());
        textAtomV2View3 = this.this$0.numberTav;
        int id3 = textAtomV2View3.getId();
        image2 = this.this$0.paymentSystemImage;
        ConstraintSetExtKt.topToTop$default(updateConstraints, id3, image2.getId(), 0, 4, null);
        textAtomV2View4 = this.this$0.numberTav;
        int id4 = textAtomV2View4.getId();
        image3 = this.this$0.paymentSystemImage;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, id4, image3.getId(), 0, 4, null);
        textAtomV2View5 = this.this$0.numberTav;
        updateConstraints.c0(0.0f, textAtomV2View5.getId());
        textAtomV2View6 = this.this$0.numberTav;
        updateConstraints.C(textAtomV2View6.getId(), true);
        image4 = this.this$0.paymentSystemImage;
        ConstraintSetExtKt.endToEnd$default(updateConstraints, image4.getId(), 0, 0, 4, null);
        image5 = this.this$0.paymentSystemImage;
        ConstraintSetExtKt.bottomToBottom$default(updateConstraints, image5.getId(), 0, 0, 4, null);
    }
}
