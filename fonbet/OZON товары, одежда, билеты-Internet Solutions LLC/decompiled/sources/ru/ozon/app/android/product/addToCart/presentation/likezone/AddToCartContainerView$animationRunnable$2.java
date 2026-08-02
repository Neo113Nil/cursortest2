package ru.ozon.app.android.product.addToCart.presentation.likezone;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Runnable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartContainerView$animationRunnable$2 extends AbstractC7737t implements Function0<Runnable> {
    final /* synthetic */ AddToCartContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartContainerView$animationRunnable$2(AddToCartContainerView addToCartContainerView) {
        super(0);
        this.this$0 = addToCartContainerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AddToCartContainerView addToCartContainerView) {
        AddToCartContainerView.PendingBindData pendingBindData;
        addToCartContainerView.isAnimationRunning = false;
        pendingBindData = addToCartContainerView.pendingBindData;
        if (pendingBindData != null) {
            addToCartContainerView.bind(pendingBindData.getPersonalCartData(), pendingBindData.getFamilyCartData(), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        final AddToCartContainerView addToCartContainerView = this.this$0;
        return new Runnable() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.d
            @Override // java.lang.Runnable
            public final void run() {
                AddToCartContainerView$animationRunnable$2.invoke$lambda$1(AddToCartContainerView.this);
            }
        };
    }
}
