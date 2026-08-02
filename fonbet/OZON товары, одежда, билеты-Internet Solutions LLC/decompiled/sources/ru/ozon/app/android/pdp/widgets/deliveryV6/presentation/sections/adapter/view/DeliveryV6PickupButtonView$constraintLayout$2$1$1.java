package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import android.widget.ImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class DeliveryV6PickupButtonView$constraintLayout$2$1$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ DeliveryV6PickupButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryV6PickupButtonView$constraintLayout$2$1$1(DeliveryV6PickupButtonView deliveryV6PickupButtonView) {
        super(1);
        this.this$0 = deliveryV6PickupButtonView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View pickupButtonTitle;
        ImageView pickupButtonIcon;
        TextAtomV2View pickupButtonTitle2;
        TextAtomV2View pickupButtonTitle3;
        TextAtomV2View pickupButtonSubtitle;
        TextAtomV2View pickupButtonSubtitle2;
        ImageView pickupButtonIcon2;
        TextAtomV2View pickupButtonSubtitle3;
        TextAtomV2View pickupButtonSubtitle4;
        TextAtomV2View pickupButtonTitle4;
        TextAtomV2View pickupButtonBadge;
        TextAtomV2View pickupButtonBadge2;
        ImageView pickupButtonIcon3;
        TextAtomV2View pickupButtonBadge3;
        ImageView pickupButtonIcon4;
        ImageView pickupButtonIcon5;
        ImageView pickupButtonIcon6;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        pickupButtonTitle = this.this$0.getPickupButtonTitle();
        pickupButtonIcon = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, pickupButtonTitle, pickupButtonIcon);
        pickupButtonTitle2 = this.this$0.getPickupButtonTitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, pickupButtonTitle2);
        pickupButtonTitle3 = this.this$0.getPickupButtonTitle();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, pickupButtonTitle3);
        pickupButtonSubtitle = this.this$0.getPickupButtonSubtitle();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, pickupButtonSubtitle);
        pickupButtonSubtitle2 = this.this$0.getPickupButtonSubtitle();
        pickupButtonIcon2 = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, pickupButtonSubtitle2, pickupButtonIcon2);
        pickupButtonSubtitle3 = this.this$0.getPickupButtonSubtitle();
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, pickupButtonSubtitle3);
        pickupButtonSubtitle4 = this.this$0.getPickupButtonSubtitle();
        pickupButtonTitle4 = this.this$0.getPickupButtonTitle();
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, pickupButtonSubtitle4, pickupButtonTitle4);
        pickupButtonBadge = this.this$0.getPickupButtonBadge();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, pickupButtonBadge);
        pickupButtonBadge2 = this.this$0.getPickupButtonBadge();
        pickupButtonIcon3 = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintEndToStartOf(updateConstraints, pickupButtonBadge2, pickupButtonIcon3);
        pickupButtonBadge3 = this.this$0.getPickupButtonBadge();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, pickupButtonBadge3);
        pickupButtonIcon4 = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, pickupButtonIcon4);
        pickupButtonIcon5 = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, pickupButtonIcon5);
        pickupButtonIcon6 = this.this$0.getPickupButtonIcon();
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, pickupButtonIcon6);
    }
}
