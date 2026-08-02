package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView;

import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View$checkboxOutlineProvider$2$1", "invoke", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View$checkboxOutlineProvider$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductV2View$checkboxOutlineProvider$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    public static final ProductV2View$checkboxOutlineProvider$2 INSTANCE = new ProductV2View$checkboxOutlineProvider$2();

    ProductV2View$checkboxOutlineProvider$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View$checkboxOutlineProvider$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View$checkboxOutlineProvider$2.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ProductV2View.Companion companion;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                companion = ProductV2View.Companion;
                outline.setRoundRect(0, 0, f7, height, companion.getCheckBoxRadius());
            }
        };
    }
}
