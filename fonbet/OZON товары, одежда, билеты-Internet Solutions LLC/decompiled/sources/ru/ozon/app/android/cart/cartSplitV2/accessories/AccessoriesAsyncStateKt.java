package ru.ozon.app.android.cart.cartSplitV2.accessories;

import WZ.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\"\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "", "isExistTokenizedEvent", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;)Z", "isShelfNotEmpty", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getShelfTokenizedEvent", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;)LWZ/t;", "shelfTokenizedEvent", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesAsyncStateKt {
    public static final t getShelfTokenizedEvent(AccessoriesAsyncState accessoriesAsyncState) {
        SkuThinScrollVO shelf;
        t tokenizedEvent;
        AccessoriesAsyncState.Success success = accessoriesAsyncState instanceof AccessoriesAsyncState.Success ? (AccessoriesAsyncState.Success) accessoriesAsyncState : null;
        if (success != null && (shelf = success.getShelf()) != null && (tokenizedEvent = shelf.getTokenizedEvent()) != null) {
            return tokenizedEvent;
        }
        AccessoriesAsyncState.Hided hided = accessoriesAsyncState instanceof AccessoriesAsyncState.Hided ? (AccessoriesAsyncState.Hided) accessoriesAsyncState : null;
        if (hided != null) {
            return hided.getEmptyShelfTokenizedEvent();
        }
        return null;
    }

    public static final boolean isExistTokenizedEvent(AccessoriesAsyncState accessoriesAsyncState) {
        List<SkuThinScrollVO.ItemVO> items;
        AccessoriesAsyncState.Success success = accessoriesAsyncState instanceof AccessoriesAsyncState.Success ? (AccessoriesAsyncState.Success) accessoriesAsyncState : null;
        SkuThinScrollVO shelf = success != null ? success.getShelf() : null;
        if ((shelf != null ? shelf.getTokenizedEvent() : null) != null) {
            return true;
        }
        if (shelf != null && (items = shelf.getItems()) != null) {
            List<SkuThinScrollVO.ItemVO> list = items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SkuThinScrollVO.ItemVO) it.next()).getTokenizedEvent() != null) {
                        return true;
                    }
                }
            }
        }
        AccessoriesAsyncState.Hided hided = accessoriesAsyncState instanceof AccessoriesAsyncState.Hided ? (AccessoriesAsyncState.Hided) accessoriesAsyncState : null;
        return (hided != null ? hided.getEmptyShelfTokenizedEvent() : null) != null;
    }

    public static final boolean isShelfNotEmpty(AccessoriesAsyncState accessoriesAsyncState) {
        SkuThinScrollVO shelf;
        List<SkuThinScrollVO.ItemVO> items;
        AccessoriesAsyncState.Success success = accessoriesAsyncState instanceof AccessoriesAsyncState.Success ? (AccessoriesAsyncState.Success) accessoriesAsyncState : null;
        return (success == null || (shelf = success.getShelf()) == null || (items = shelf.getItems()) == null || !(items.isEmpty() ^ true)) ? false : true;
    }
}
