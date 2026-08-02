package ru.ozon.app.android.sellerproducts.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductCommonMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.ProductToManyMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.mapper.TextMeasurer;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductToManyMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SellerProductsComponent$Companion$create$1$mapper$2 extends AbstractC7737t implements Function0<ProductToManyMapper> {
    final /* synthetic */ SellerProductsComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerProductsComponent$Companion$create$1$mapper$2(SellerProductsComponent$Companion$create$1 sellerProductsComponent$Companion$create$1) {
        super(0);
        this.this$0 = sellerProductsComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductToManyMapper invoke() {
        StorageComponentApi storageComponentApi;
        ContextComponentDependencies contextComponentDependencies;
        FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper = new FavoriteProductMoleculeV2Mapper();
        storageComponentApi = this.this$0.storageComponentApi;
        ProductCommonMapper productCommonMapper = new ProductCommonMapper(favoriteProductMoleculeV2Mapper, storageComponentApi.getTeensModeStorage());
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new ProductToManyMapper(productCommonMapper, new TextMeasurer(contextComponentDependencies.getContext()));
    }
}
