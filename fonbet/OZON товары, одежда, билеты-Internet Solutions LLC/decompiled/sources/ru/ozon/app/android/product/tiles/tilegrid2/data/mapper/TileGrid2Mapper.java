package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.common.TileThemeConfigVOKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2EmptyButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.separator.TileGrid2SeparatorVO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileItemDTO;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "", "selectedProductsManager", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "teensModeService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "tileGrid2MapperUtil", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2MapperUtil;", "map", "", "state", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2Mapper {

    @NotNull
    private final TileGrid2MapperUtil tileGrid2MapperUtil;

    public TileGrid2Mapper(@NotNull SelectedProductsManager selectedProductsManager, @NotNull FeatureChecker featureChecker, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.tileGrid2MapperUtil = new TileGrid2MapperUtil(selectedProductsManager, featureChecker, teensModeService);
    }

    @NotNull
    public final List<Object> map(@NotNull TileGrid2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b builder = C7714v.B();
        HeaderDTO header = state.getHeader();
        if (header != null) {
            builder.add(header);
        }
        b builder2 = C7714v.B();
        TileGrid2DTO.Options options = state.getOptions();
        int i11 = 0;
        TileThemeConfigVO tileGrid2ThemeVO = TileThemeConfigVOKt.toTileGrid2ThemeVO(options != null ? options.getTheme() : null, false);
        int b11 = S8.b.b(0, state.getItems().size() - 1, 2);
        if (b11 >= 0) {
            while (true) {
                TileItemDTO tileItemDTO = state.getItems().get(i11);
                int i12 = i11 + 1;
                TileItemDTO tileItemDTO2 = (TileItemDTO) C7714v.Q(i12, state.getItems());
                builder2.add(this.tileGrid2MapperUtil.map(tileItemDTO, i11, state));
                if (tileItemDTO2 != null) {
                    builder2.add(this.tileGrid2MapperUtil.map(tileItemDTO2, i12, state));
                } else {
                    int hashCode = tileItemDTO.hashCode();
                    builder2.add(new TileGrid2SeparatorVO((hashCode + "_emptyState").hashCode(), null));
                }
                TileGrid2MapperUtil tileGrid2MapperUtil = this.tileGrid2MapperUtil;
                TileGrid2DTO.SharedData sharedData = state.getSharedData();
                Object mapSeparatedButton = tileGrid2MapperUtil.mapSeparatedButton(tileItemDTO, i11, sharedData != null ? sharedData.getOverlayItem() : null, tileGrid2ThemeVO);
                TileGrid2MapperUtil tileGrid2MapperUtil2 = this.tileGrid2MapperUtil;
                TileGrid2DTO.SharedData sharedData2 = state.getSharedData();
                Object mapSeparatedButton2 = tileGrid2MapperUtil2.mapSeparatedButton(tileItemDTO2, i12, sharedData2 != null ? sharedData2.getOverlayItem() : null, tileGrid2ThemeVO);
                if (!(mapSeparatedButton instanceof TileGrid2EmptyButtonVO) || !(mapSeparatedButton2 instanceof TileGrid2EmptyButtonVO)) {
                    builder2.add(mapSeparatedButton);
                    builder2.add(mapSeparatedButton2);
                }
                if (i11 == b11) {
                    break;
                }
                i11 += 2;
            }
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        builder.addAll(builder2.B());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
