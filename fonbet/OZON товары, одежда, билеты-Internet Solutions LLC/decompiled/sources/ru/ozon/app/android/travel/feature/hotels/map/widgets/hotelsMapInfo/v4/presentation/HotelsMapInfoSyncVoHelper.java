package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoSyncVoHelper;", "", "<init>", "()V", "selectPin", "", "vo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "id", "", "isSelected", "", "setPinFavoriteStatus", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "sku", "isFavorite", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoSyncVoHelper {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        r1 = r3.copy((r35 & 1) != 0 ? r3.id : null, (r35 & 2) != 0 ? r3.rank : 0.0f, (r35 & 4) != 0 ? r3.coords : null, (r35 & 8) != 0 ? r3.geohash : 0, (r35 & 16) != 0 ? r3.title : null, (r35 & 32) != 0 ? r3.price : null, (r35 & 64) != 0 ? r3.hasDiscount : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r3.isFavorite : false, (r35 & 256) != 0 ? r3.isViewed : false, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r3.isSelected : r26, (r35 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r3.isTop : false, (r35 & 2048) != 0 ? r3.sku : null, (r35 & 4096) != 0 ? r3.rightIconId : null, (r35 & 8192) != 0 ? r3.leftIconId : null, (r35 & 16384) != 0 ? r3.isIndivisiblePin : false, (r35 & 32768) != 0 ? r3.innerIds : null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void selectPin(@NotNull HotelsMapInfoV4VO vo, String id2, boolean isSelected) {
        HotelsMapInfoV4VO.Pin copy;
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (id2 == null || (r3 = vo.getPins().get(id2)) == null || copy == null) {
            return;
        }
        ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins = vo.getPins();
        HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy);
        pins.put(id2, copy);
    }

    public final HotelsMapInfoV4VO.Pin setPinFavoriteStatus(@NotNull HotelsMapInfoV4VO vo, @NotNull String sku, boolean isFavorite) {
        HotelsMapInfoV4VO.Pin copy;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(sku, "sku");
        for (Map.Entry<String, HotelsMapInfoV4VO.Pin> entry : vo.getPins().entrySet()) {
            if (Intrinsics.d(entry.getValue().getSku(), sku)) {
                copy = r4.copy((r35 & 1) != 0 ? r4.id : null, (r35 & 2) != 0 ? r4.rank : 0.0f, (r35 & 4) != 0 ? r4.coords : null, (r35 & 8) != 0 ? r4.geohash : 0L, (r35 & 16) != 0 ? r4.title : null, (r35 & 32) != 0 ? r4.price : null, (r35 & 64) != 0 ? r4.hasDiscount : false, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.isFavorite : isFavorite, (r35 & 256) != 0 ? r4.isViewed : false, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.isSelected : false, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.isTop : false, (r35 & 2048) != 0 ? r4.sku : null, (r35 & 4096) != 0 ? r4.rightIconId : null, (r35 & 8192) != 0 ? r4.leftIconId : null, (r35 & 16384) != 0 ? r4.isIndivisiblePin : false, (r35 & 32768) != 0 ? entry.getValue().innerIds : null);
                ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins = vo.getPins();
                String id2 = entry.getValue().getId();
                HotelsMapInfoV4VOKt.computeCacheHashAndZIndex(copy);
                pins.put(id2, copy);
                return entry.getValue();
            }
        }
        return null;
    }
}
