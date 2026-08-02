package ru.ozon.app.android.product.addToCart.presentation.likezone;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartContainerView$addToCartBtn$2 extends AbstractC7737t implements Function0<AddToCartButtonView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AddToCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerView$addToCartBtn$2(Context context, AddToCartContainerView addToCartContainerView) {
        super(0);
        this.$context = context;
        this.this$0 = addToCartContainerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddToCartButtonView invoke() {
        AddToCartButtonView addToCartButtonView = new AddToCartButtonView(this.$context, null, 0, 6, null);
        final AddToCartContainerView addToCartContainerView = this.this$0;
        addToCartButtonView.setId(R$id.addToCartButton);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = TileGrid2Constants.INSTANCE.getContainerPadding();
        addToCartButtonView.setLayoutParams(layoutParams);
        addToCartButtonView.setClickListener(new AddToCartButtonView.AddToCartClickListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView$addToCartBtn$2$1$2
            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onAction(CommonControlSettings commonControlSettings) {
                boolean z11;
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                z11 = AddToCartContainerView.this.isAnimationRunning;
                if (z11) {
                    return;
                }
                AddToCartContainerView.this.rememberClickTime();
                AddToCartContainerView.PersonalCartListener personalCartListener = AddToCartContainerView.this.getPersonalCartListener();
                if (personalCartListener != null) {
                    personalCartListener.onAction(commonControlSettings);
                }
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                boolean z11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                z11 = AddToCartContainerView.this.isAnimationRunning;
                if (z11) {
                    return;
                }
                AddToCartContainerView.this.rememberClickTime();
                AddToCartContainerView.PersonalCartListener personalCartListener = AddToCartContainerView.this.getPersonalCartListener();
                if (personalCartListener != null) {
                    personalCartListener.onMinusButtonClicked(updateCartAction);
                }
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                boolean z11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                z11 = AddToCartContainerView.this.isAnimationRunning;
                if (z11) {
                    return;
                }
                AddToCartContainerView.this.rememberClickTime();
                AddToCartContainerView.PersonalCartListener personalCartListener = AddToCartContainerView.this.getPersonalCartListener();
                if (personalCartListener != null) {
                    personalCartListener.onPlusButtonClicked(updateCartAction);
                }
            }
        });
        return addToCartButtonView;
    }
}
