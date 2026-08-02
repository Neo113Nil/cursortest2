package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import java.util.Map;
import kotlin.Metadata;
import kotlin.text.h;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"getUpdateCartActionFromParams", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileAddToCartButtonBinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToCartButtonDTO.QuantityButton.UpdateCartAction getUpdateCartActionFromParams(AtomActionDTO atomActionDTO) {
        String str;
        String str2;
        String str3;
        Integer w02;
        Map<String, String> params = atomActionDTO.getParams();
        Long l11 = null;
        if (params == null || (str = params.get("id")) == null) {
            return null;
        }
        Map<String, String> params2 = atomActionDTO.getParams();
        int intValue = (params2 == null || (str3 = params2.get("quantity")) == null || (w02 = h.w0(str3)) == null) ? 1 : w02.intValue();
        Map<String, String> params3 = atomActionDTO.getParams();
        if (params3 != null && (str2 = params3.get("selectedDeliverySchema")) != null) {
            l11 = h.y0(str2);
        }
        return new AddToCartButtonDTO.QuantityButton.UpdateCartAction(str, intValue, l11);
    }
}
