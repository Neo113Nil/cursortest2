package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper;

import Tc.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.data.ProductDTO;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000¨\u0006\t"}, d2 = {"mapToVI", "", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Product;", "Lru/ozon/app/android/barcode/barcodeProductsList/data/ProductDTO;", "stateId", "", "withIdInActionParams", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "itemId", "barcode_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeProductsListMapperKt {
    @NotNull
    public static final List<ProductListItem.Product> mapToVI(@NotNull List<ProductDTO> list, @NotNull String stateId) {
        CommonControlSettings common;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        List<ProductDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ProductDTO productDTO = (ProductDTO) obj;
            ProductMediaDTO productMedia = productDTO.getImage().getProductMedia();
            if (productMedia == null || (common = productMedia.getCommon()) == null) {
                common = productDTO.getCommon();
            }
            int hashCode = list.hashCode();
            arrayList.add(new ProductListItem.Product((stateId + "-" + hashCode + "-" + i11).hashCode(), ImageVOKt.toVo(productDTO.getImage(), common != null ? common.getAction() : null, common != null ? common.getTrackingInfo() : null, K.f71697a), productDTO.getPrice(), productDTO.getPriceBadge(), productDTO.getTitle(), productDTO.getSubtitle(), productDTO.getCommon(), i11 != C7714v.P(list)));
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final ButtonV3DTO withIdInActionParams(@NotNull ButtonV3DTO buttonV3DTO, @NotNull String itemId) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(buttonV3DTO, "<this>");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        CommonControlSettings common = buttonV3DTO.getCommon();
        CommonControlSettings commonControlSettings = null;
        r1 = null;
        AtomActionDTO atomActionDTO = null;
        if (common != null) {
            CommonControlSettings common2 = buttonV3DTO.getCommon();
            if (common2 != null && (action = common2.getAction()) != null) {
                d builder = new d();
                CommonControlSettings common3 = buttonV3DTO.getCommon();
                if (common3 != null && (action2 = common3.getAction()) != null && (params = action2.getParams()) != null) {
                    builder.putAll(params);
                }
                builder.put("getProductPageID", itemId);
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, builder.u(), null, 23, null);
            }
            commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
        }
        return ButtonV3DTO.copy$default(buttonV3DTO, null, null, null, null, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, 122879, null);
    }
}
