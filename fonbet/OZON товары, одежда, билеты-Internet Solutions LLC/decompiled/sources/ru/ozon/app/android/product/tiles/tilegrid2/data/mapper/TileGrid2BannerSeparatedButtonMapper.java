package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.pixel.presentation.PixelKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2BannerSeparatedButtonVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ButtonsVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2EmptyButtonVO;
import ru.ozon.app.android.product.tiles.utils.AccessibilityUtilsKt;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileItemDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2BannerSeparatedButtonMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "item", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO;", "index", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerSeparatedButtonMapper {
    @NotNull
    public final TileGrid2ButtonsVO map(@NotNull TileItemDTO.TileGrid2BannerDTO item, int index) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(item, "item");
        long bannerWidgetId = TileGrid2BannerMapper.INSTANCE.getBannerWidgetId(item);
        ButtonV3DTO button = item.getButton();
        if (button == null) {
            return TileGrid2EmptyButtonVO.INSTANCE.getInstance(bannerWidgetId);
        }
        long hashCode = button.hashCode();
        List<PixelDTO> pixel = item.getPixel();
        if (pixel != null) {
            List<PixelDTO> list = pixel;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(PixelKt.toVO((PixelDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new TileGrid2BannerSeparatedButtonVO(hashCode, bannerWidgetId, AccessibilityUtilsKt.toAccesibilityTileID(bannerWidgetId), index, button, arrayList, TileGrid2MapperKt.getSeparatedButtonOffset(button));
    }
}
