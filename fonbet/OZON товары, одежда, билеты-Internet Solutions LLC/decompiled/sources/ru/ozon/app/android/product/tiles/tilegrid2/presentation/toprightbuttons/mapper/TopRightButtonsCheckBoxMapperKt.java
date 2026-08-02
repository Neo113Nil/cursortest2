package ru.ozon.app.android.product.tiles.tilegrid2.presentation.toprightbuttons.mapper;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/toprightbuttons/TopRightButtonCheckBox;", "", "extractSku", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/toprightbuttons/TopRightButtonCheckBox;)Ljava/lang/Long;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonsCheckBoxMapperKt {
    public static final Long extractSku(@NotNull TopRightButtonCheckBox topRightButtonCheckBox) {
        String str;
        Intrinsics.checkNotNullParameter(topRightButtonCheckBox, "<this>");
        Map<String, String> params = topRightButtonCheckBox.getAction().getParams();
        if (params == null || (str = params.get("sku")) == null) {
            return null;
        }
        return h.y0(str);
    }
}
