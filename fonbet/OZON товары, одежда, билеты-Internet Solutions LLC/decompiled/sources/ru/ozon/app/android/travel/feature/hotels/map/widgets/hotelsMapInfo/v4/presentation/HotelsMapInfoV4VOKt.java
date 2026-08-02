package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"computeCacheHashAndZIndex", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4VOKt {
    public static final int computeCacheHashAndZIndex(@NotNull HotelsMapInfoV4VO.Pin pin) {
        Intrinsics.checkNotNullParameter(pin, "<this>");
        int hash = Objects.hash(Boolean.valueOf(pin.getIsViewed()), Boolean.valueOf(pin.getIsSelected()), Boolean.valueOf(pin.getIsFavorite()), pin.getTitle(), pin.getPrice(), Boolean.valueOf(pin.getIsTop()), Boolean.valueOf(pin.getHasDiscount()), pin.getRightIconId(), pin.getLeftIconId(), Integer.valueOf(pin.getInnerIds().size()));
        pin.setCacheHash(hash);
        pin.setZIndex(pin.getIsSelected() ? 5.0f : pin.getIsFavorite() ? 3.0f : (!pin.getIsTop() || (pin.getTitle() == null && pin.getPrice() == null)) ? 1.0f : 2.0f);
        return hash;
    }
}
