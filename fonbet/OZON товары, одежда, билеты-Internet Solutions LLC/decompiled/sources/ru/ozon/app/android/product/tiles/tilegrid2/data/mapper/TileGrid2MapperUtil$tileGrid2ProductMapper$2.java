package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2ProductMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2MapperUtil$tileGrid2ProductMapper$2 extends AbstractC7737t implements Function0<TileGrid2ProductMapper> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ SelectedProductsManager $selectedProductsManager;
    final /* synthetic */ TileGrid2MapperUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2MapperUtil$tileGrid2ProductMapper$2(TileGrid2MapperUtil tileGrid2MapperUtil, SelectedProductsManager selectedProductsManager, FeatureChecker featureChecker) {
        super(0);
        this.this$0 = tileGrid2MapperUtil;
        this.$selectedProductsManager = selectedProductsManager;
        this.$featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2ProductMapper invoke() {
        TeensModeService teensModeService;
        TileGrid2GalleryModelMapper tileGrid2GalleryModelMapper = new TileGrid2GalleryModelMapper();
        FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper = new FavoriteProductMoleculeV2Mapper();
        teensModeService = this.this$0.teensModeService;
        return new TileGrid2ProductMapper(this.$selectedProductsManager, tileGrid2GalleryModelMapper, this.$featureChecker, favoriteProductMoleculeV2Mapper, teensModeService);
    }
}
