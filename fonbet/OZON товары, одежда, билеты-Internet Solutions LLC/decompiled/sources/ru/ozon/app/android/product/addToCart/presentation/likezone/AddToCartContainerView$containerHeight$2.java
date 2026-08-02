package ru.ozon.app.android.product.addToCart.presentation.likezone;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartContainerView$containerHeight$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ AddToCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerView$containerHeight$2(AddToCartContainerView addToCartContainerView) {
        super(0);
        this.this$0 = addToCartContainerView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        AddToCartButtonView addToCartBtn;
        AddToFamilyCartButtonView addToFamilyCartBtn;
        addToCartBtn = this.this$0.getAddToCartBtn();
        int buttonHeight = addToCartBtn.getButtonHeight();
        addToFamilyCartBtn = this.this$0.getAddToFamilyCartBtn();
        return Integer.valueOf(Math.max(buttonHeight, addToFamilyCartBtn.getButtonHeight()));
    }
}
