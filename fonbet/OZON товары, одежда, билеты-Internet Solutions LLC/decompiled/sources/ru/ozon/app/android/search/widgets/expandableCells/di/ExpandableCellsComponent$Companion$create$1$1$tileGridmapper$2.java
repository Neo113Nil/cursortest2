package ru.ozon.app.android.search.widgets.expandableCells.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ExpandableCellsComponent$Companion$create$1$1$tileGridmapper$2 extends AbstractC7737t implements Function0<TileGrid2Mapper> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ ExpandableCellsComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpandableCellsComponent$Companion$create$1$1$tileGridmapper$2(C7475g c7475g, ExpandableCellsComponent$Companion$create$1$1 expandableCellsComponent$Companion$create$1$1) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = expandableCellsComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2Mapper invoke() {
        NetworkComponentApi networkComponentApi;
        StorefrontCommonComponentApi storefrontCommonComponentApi;
        SelectedProductsManager selectedProductsManager = ((FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class)).getSelectedProductsManager();
        networkComponentApi = this.this$0.networkComponentApi;
        FeatureChecker featureChecker = networkComponentApi.getFeatureChecker();
        storefrontCommonComponentApi = this.this$0.storefrontCommonComponentApi;
        return new TileGrid2Mapper(selectedProductsManager, featureChecker, storefrontCommonComponentApi.getTeensModeService());
    }
}
