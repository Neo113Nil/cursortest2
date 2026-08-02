package ru.ozon.app.android.geo.map.data;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007*\u00020\b¨\u0006\t"}, d2 = {"toPoint", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "Lru/ozon/app/android/geo/map/data/CurrentLocation;", "toRequest", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Lru/ozon/app/android/geo/map/data/AddressEditMapRequest;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapRequestKt {
    @NotNull
    public static final CoordinateModel toPoint(@NotNull CurrentLocation currentLocation) {
        Intrinsics.checkNotNullParameter(currentLocation, "<this>");
        return new CoordinateModel(currentLocation.getLatitude(), currentLocation.getLongitude());
    }

    @NotNull
    public static final HashMap<String, Object> toRequest(@NotNull AddressEditMapRequest addressEditMapRequest) {
        Intrinsics.checkNotNullParameter(addressEditMapRequest, "<this>");
        HashMap<String, Object> f7 = U.f(new Pair("map", addressEditMapRequest.getMap()));
        CurrentLocation currentLocation = addressEditMapRequest.getCurrentLocation();
        if (currentLocation != null) {
            f7.put("currentLocation", currentLocation);
        }
        return f7;
    }
}
