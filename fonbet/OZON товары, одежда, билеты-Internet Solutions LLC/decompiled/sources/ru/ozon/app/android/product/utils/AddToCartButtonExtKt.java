package ru.ozon.app.android.product.utils;

import B0.C2454a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"getParams", "", "", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToCartButtonExtKt {
    public static final Map<String, String> getParams(@NotNull AddToCartButtonDTO addToCartButtonDTO) {
        Intrinsics.checkNotNullParameter(addToCartButtonDTO, "<this>");
        Map<String, String> extendMap = addToCartButtonDTO.getExtendMap();
        if (extendMap != null) {
            return extendMap;
        }
        AddToCartButtonDTO.Extend extend = addToCartButtonDTO.getExtend();
        if (extend != null) {
            return C2454a.b("enum", extend.toString());
        }
        return null;
    }
}
