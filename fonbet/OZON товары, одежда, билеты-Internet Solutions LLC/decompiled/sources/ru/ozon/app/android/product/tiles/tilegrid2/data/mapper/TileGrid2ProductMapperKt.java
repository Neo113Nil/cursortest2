package ru.ozon.app.android.product.tiles.tilegrid2.data.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedIconStateInfo;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToSelectedInfoIconState", "Lru/ozon/app/android/favorites/common/SelectedIconStateInfo;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "topRightCheckbox", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileGrid2ProductMapperKt {
    public static final SelectedIconStateInfo mapToSelectedInfoIconState(@NotNull TileGrid2CheckBoxVO tileGrid2CheckBoxVO) {
        Intrinsics.checkNotNullParameter(tileGrid2CheckBoxVO, "<this>");
        Long y02 = h.y0(tileGrid2CheckBoxVO.getTileId());
        if (y02 != null) {
            return new SelectedIconStateInfo(y02.longValue(), tileGrid2CheckBoxVO.getAtomDTO().getStatus() == CheckBoxDTO.CheckboxStatus.SELECTED);
        }
        return null;
    }

    public static final TileGrid2CheckBoxVO topRightCheckbox(@NotNull TileGrid2VO tileGrid2VO) {
        Intrinsics.checkNotNullParameter(tileGrid2VO, "<this>");
        List<Object> topRightButtons = tileGrid2VO.getTopRightButtons();
        if (topRightButtons == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : topRightButtons) {
            if (obj instanceof TileGrid2CheckBoxVO) {
                arrayList.add(obj);
            }
        }
        return (TileGrid2CheckBoxVO) C7714v.M(arrayList);
    }
}
