package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top;

import kotlin.Metadata;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$TopWithFinBadge;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/top/PriceV4TopWithStarsBadgeViewMapper;", "Lru/ozon/app/android/pdp/widgets/priceV4/core/viewmapper/top/BasePriceV4TopWithBadgeViewMapper;", "<init>", "()V", "isStars", "", "()Z", "canMap", "state", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceV4TopWithStarsBadgeViewMapper extends BasePriceV4TopWithBadgeViewMapper {
    private final boolean isStars = true;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof PriceV4DtoWrapper$TopWithFinBadge)) {
            return false;
        }
        PriceV4DtoWrapper$TopWithFinBadge priceV4DtoWrapper$TopWithFinBadge = (PriceV4DtoWrapper$TopWithFinBadge) state;
        return priceV4DtoWrapper$TopWithFinBadge.getTopStarsBadge() != null && priceV4DtoWrapper$TopWithFinBadge.getTopFinBadge() == null;
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top.BasePriceV4TopWithBadgeViewMapper
    /* renamed from: isStars, reason: from getter */
    public boolean getIsStars() {
        return this.isStars;
    }
}
