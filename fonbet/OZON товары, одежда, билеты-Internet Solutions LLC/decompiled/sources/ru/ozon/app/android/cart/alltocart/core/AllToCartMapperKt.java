package ru.ozon.app.android.cart.alltocart.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.text.h;
import ru.ozon.app.android.cart.alltocart.core.AllToCartDTO;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartVO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"toVo", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO;", "stateId", "", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO$CartData;", "extractIds", "", "", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AllToCartMapperKt {
    private static final Set<Long> extractIds(String str) {
        List m11 = h.m(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return C7714v.Y0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AllToCartVO toVo(AllToCartDTO allToCartDTO, String str) {
        long hashCode = str.hashCode();
        List<AllToCartDTO.CartData> skus = allToCartDTO.getSkus();
        ArrayList arrayList = new ArrayList(C7714v.z(skus, 10));
        Iterator<T> it = skus.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((AllToCartDTO.CartData) it.next()));
        }
        return new AllToCartVO(hashCode, arrayList, allToCartDTO.getButton(), extractIds(allToCartDTO.getButton().getId()));
    }

    private static final AllToCartVO.CartData toVo(AllToCartDTO.CartData cartData) {
        long parseLong = Long.parseLong(cartData.getId());
        int maxItems = cartData.getMaxItems();
        Integer addQuantity = cartData.getAddQuantity();
        int intValue = addQuantity != null ? addQuantity.intValue() : 0;
        Integer incrementQuantity = cartData.getIncrementQuantity();
        return new AllToCartVO.CartData(parseLong, maxItems, intValue, incrementQuantity != null ? incrementQuantity.intValue() : 0, cartData.getSelectedDeliverySchema() != null ? Long.valueOf(r6.intValue()) : null, cartData.getTrackingInfo());
    }
}
