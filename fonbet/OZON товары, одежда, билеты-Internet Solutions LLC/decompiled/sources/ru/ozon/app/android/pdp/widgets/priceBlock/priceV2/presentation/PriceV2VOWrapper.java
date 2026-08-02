package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/PriceV2VOWrapper;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PriceV2VOWrapper extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull PriceV2VOWrapper priceV2VOWrapper) {
            return null;
        }

        public static int getViewItemKey(@NotNull PriceV2VOWrapper priceV2VOWrapper) {
            return priceV2VOWrapper.hashCode();
        }
    }
}
