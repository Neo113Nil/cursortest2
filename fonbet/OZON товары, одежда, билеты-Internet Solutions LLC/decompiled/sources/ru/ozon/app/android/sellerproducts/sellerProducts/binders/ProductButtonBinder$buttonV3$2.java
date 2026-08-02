package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.sellerproducts.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductButtonBinder$buttonV3$2 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ ProductButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductButtonBinder$buttonV3$2(ProductButtonBinder productButtonBinder) {
        super(0);
        this.this$0 = productButtonBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        return (ButtonV3View) this.this$0.findViewById(R$id.buttonV3);
    }
}
