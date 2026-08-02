package ru.ozon.uni.atoms.v3.holders.productMedia;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/v3/holders/productMedia/ProductMediaHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ProductMediaHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<ProductMediaHolder> {
    final /* synthetic */ ProductMediaView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductMediaHolderKt$bind$provider$1(ProductMediaView productMediaView) {
        super(0);
        this.$this_bind = productMediaView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductMediaHolder invoke() {
        return new ProductMediaHolder(this.$this_bind, (String) null);
    }
}
