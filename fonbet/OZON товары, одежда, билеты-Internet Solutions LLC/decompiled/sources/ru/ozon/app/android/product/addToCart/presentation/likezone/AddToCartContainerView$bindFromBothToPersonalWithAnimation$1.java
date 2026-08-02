package ru.ozon.app.android.product.addToCart.presentation.likezone;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartContainerView$bindFromBothToPersonalWithAnimation$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AddToCartContainerView.ContainerMode.Personal $personalMode;
    final /* synthetic */ AddToCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerView$bindFromBothToPersonalWithAnimation$1(AddToCartContainerView addToCartContainerView, AddToCartContainerView.ContainerMode.Personal personal) {
        super(0);
        this.this$0 = addToCartContainerView;
        this.$personalMode = personal;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        long animationDurationHalf;
        AddToCartContainerView addToCartContainerView = this.this$0;
        AddToCartContainerView.PersonalCartData personalCartData = this.$personalMode.getPersonalCartData();
        animationDurationHalf = this.this$0.getAnimationDurationHalf();
        addToCartContainerView.bindPersonalButtonWithSnapshotFadeAnimation(personalCartData, animationDurationHalf);
    }
}
