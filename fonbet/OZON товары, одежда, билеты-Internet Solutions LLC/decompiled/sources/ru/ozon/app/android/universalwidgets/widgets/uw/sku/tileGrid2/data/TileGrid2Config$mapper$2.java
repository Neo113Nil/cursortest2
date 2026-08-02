package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2Config$mapper$2 extends AbstractC7737t implements Function0<TileGrid2Mapper> {
    final /* synthetic */ TileGrid2Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2Config$mapper$2(TileGrid2Config tileGrid2Config) {
        super(0);
        this.this$0 = tileGrid2Config;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2Mapper invoke() {
        Context context;
        FeatureChecker featureChecker;
        Context context2;
        context = this.this$0.context;
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, FavoriteCoreComponentApi.class).getDependencyStorage();
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        SelectedProductsManager selectedProductsManager = ((FavoriteCoreComponentApi) dependencyStorage.b(FavoriteCoreComponentApi.class)).getSelectedProductsManager();
        featureChecker = this.this$0.getFeatureChecker();
        context2 = this.this$0.context;
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context2, StorefrontCommonComponentApi.class).getDependencyStorage();
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        return new TileGrid2Mapper(selectedProductsManager, featureChecker, ((StorefrontCommonComponentApi) dependencyStorage2.b(StorefrontCommonComponentApi.class)).getTeensModeService());
    }
}
