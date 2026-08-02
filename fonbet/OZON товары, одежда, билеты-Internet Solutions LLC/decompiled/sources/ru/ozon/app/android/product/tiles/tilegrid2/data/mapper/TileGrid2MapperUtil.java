package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import Sc.InterfaceC4008j;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.multibutton.CartButtonMapper;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2EmptyButtonVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileItemDTO;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0016\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2MapperUtil;", "", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;", "item", "", "index", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "state", "map", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;ILru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;)Ljava/lang/Object;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "mapSeparatedButton", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;ILru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/product/common/TileThemeConfigVO;)Ljava/lang/Object;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2ProductMapper;", "tileGrid2ProductMapper$delegate", "LSc/j;", "getTileGrid2ProductMapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2ProductMapper;", "tileGrid2ProductMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerMapper;", "tileGrid2BannerMapper$delegate", "getTileGrid2BannerMapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerMapper;", "tileGrid2BannerMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/multibutton/CartButtonMapper;", "cartButtonMapper$delegate", "getCartButtonMapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/multibutton/CartButtonMapper;", "cartButtonMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerSeparatedButtonMapper;", "bannerButtonMapper$delegate", "getBannerButtonMapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerSeparatedButtonMapper;", "bannerButtonMapper", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2MapperUtil {

    /* renamed from: bannerButtonMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bannerButtonMapper;

    /* renamed from: cartButtonMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartButtonMapper;

    @NotNull
    private final TeensModeService teensModeService;

    /* renamed from: tileGrid2BannerMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tileGrid2BannerMapper;

    /* renamed from: tileGrid2ProductMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tileGrid2ProductMapper;

    public TileGrid2MapperUtil(@NotNull SelectedProductsManager selectedProductsManager, @NotNull FeatureChecker featureChecker, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.teensModeService = teensModeService;
        this.tileGrid2ProductMapper = LazyUtilsKt.unsafeLazy(new TileGrid2MapperUtil$tileGrid2ProductMapper$2(this, selectedProductsManager, featureChecker));
        this.tileGrid2BannerMapper = LazyUtilsKt.unsafeLazy(TileGrid2MapperUtil$tileGrid2BannerMapper$2.INSTANCE);
        this.cartButtonMapper = LazyUtilsKt.unsafeLazy(TileGrid2MapperUtil$cartButtonMapper$2.INSTANCE);
        this.bannerButtonMapper = LazyUtilsKt.unsafeLazy(TileGrid2MapperUtil$bannerButtonMapper$2.INSTANCE);
    }

    private final TileGrid2BannerSeparatedButtonMapper getBannerButtonMapper() {
        return (TileGrid2BannerSeparatedButtonMapper) this.bannerButtonMapper.getValue();
    }

    private final CartButtonMapper getCartButtonMapper() {
        return (CartButtonMapper) this.cartButtonMapper.getValue();
    }

    private final TileGrid2BannerMapper getTileGrid2BannerMapper() {
        return (TileGrid2BannerMapper) this.tileGrid2BannerMapper.getValue();
    }

    private final TileGrid2ProductMapper getTileGrid2ProductMapper() {
        return (TileGrid2ProductMapper) this.tileGrid2ProductMapper.getValue();
    }

    @NotNull
    public final Object map(@NotNull TileItemDTO item, int index, @NotNull TileGrid2DTO state) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(state, "state");
        if (item instanceof TileItemDTO.TileGrid2BannerDTO) {
            return getTileGrid2BannerMapper().map((TileItemDTO.TileGrid2BannerDTO) item, index, state);
        }
        if (item instanceof TileGrid2ItemDTO) {
            return getTileGrid2ProductMapper().toVo((TileGrid2ItemDTO) item, index, state);
        }
        throw new o();
    }

    @NotNull
    public final Object mapSeparatedButton(TileItemDTO item, int index, TileGrid2DTO.OverlayItem overlayItem, @NotNull TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (item instanceof TileItemDTO.TileGrid2BannerDTO) {
            return getBannerButtonMapper().map((TileItemDTO.TileGrid2BannerDTO) item, index);
        }
        if (item instanceof TileGrid2ItemDTO) {
            return getCartButtonMapper().toCartButtonVO((TileGrid2ItemDTO) item, index, overlayItem, theme);
        }
        if (item == null) {
            return TileGrid2EmptyButtonVO.Companion.getInstance$default(TileGrid2EmptyButtonVO.INSTANCE, 0L, 1, null);
        }
        throw new o();
    }
}
