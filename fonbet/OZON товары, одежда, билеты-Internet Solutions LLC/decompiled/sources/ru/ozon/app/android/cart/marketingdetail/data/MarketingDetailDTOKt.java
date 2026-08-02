package ru.ozon.app.android.cart.marketingdetail.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.marketingdetail.data.MarketingDetailDTO;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO;", "Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO;", "flattenMarketingDetails", "", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarketingDetailDTOKt {
    private static final List<MarketingDetailVO.DetailListItem> flattenMarketingDetails(List<MarketingDetailDTO.Detail> list) {
        ArrayList arrayList = new ArrayList();
        for (MarketingDetailDTO.Detail detail : list) {
            arrayList.add(new MarketingDetailVO.DetailListItem.Title(detail.getTitle(), null, 2, null));
            List<MarketingDetailDTO.Detail.Action> actions = detail.getActions();
            ArrayList arrayList2 = new ArrayList(C7714v.z(actions, 10));
            for (MarketingDetailDTO.Detail.Action action : actions) {
                String name = action.getName();
                String description = action.getDescription();
                String str = (description == null || h.K(description)) ? null : description;
                String discountValueText = action.getDiscountValueText();
                String discountValueSubtext = action.getDiscountValueSubtext();
                arrayList2.add(new MarketingDetailVO.DetailListItem.Action(name, str, discountValueText, (discountValueSubtext == null || h.K(discountValueSubtext)) ? null : discountValueSubtext, null, 16, null));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new MarketingDetailVO.DetailListItem.Total(detail.getTotal().getTitle(), detail.getTotal().getPriceText(), null, 4, null));
        }
        return arrayList;
    }

    @NotNull
    public static final MarketingDetailVO toVO(@NotNull MarketingDetailDTO marketingDetailDTO) {
        Intrinsics.checkNotNullParameter(marketingDetailDTO, "<this>");
        return new MarketingDetailVO(marketingDetailDTO.hashCode(), flattenMarketingDetails(marketingDetailDTO.getList()));
    }
}
