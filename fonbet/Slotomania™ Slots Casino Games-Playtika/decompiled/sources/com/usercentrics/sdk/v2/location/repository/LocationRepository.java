package com.usercentrics.sdk.v2.location.repository;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.v2.location.cache.ILocationCache;
import com.usercentrics.sdk.v2.location.data.LocationData;
import com.usercentrics.sdk.v2.location.data.LocationDataResponse;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* compiled from: LocationRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/v2/location/repository/LocationRepository;", "Lcom/usercentrics/sdk/v2/location/repository/ILocationRepository;", "locationCache", "Lcom/usercentrics/sdk/v2/location/cache/ILocationCache;", "jsonParser", "Lcom/usercentrics/sdk/core/json/JsonParser;", "(Lcom/usercentrics/sdk/v2/location/cache/ILocationCache;Lcom/usercentrics/sdk/core/json/JsonParser;)V", "getCachedLocation", "Lcom/usercentrics/sdk/v2/location/data/LocationData;", "getInjectedLocation", "parseJson", "responseBody", "", "storeLocation", "", FirebaseAnalytics.Param.LOCATION, "Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationRepository implements ILocationRepository {
    private final JsonParser jsonParser;
    private final ILocationCache locationCache;

    public LocationRepository(ILocationCache locationCache, JsonParser jsonParser) {
        Intrinsics.checkNotNullParameter(locationCache, "locationCache");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.locationCache = locationCache;
        this.jsonParser = jsonParser;
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public LocationData getCachedLocation() {
        String cachedLocation = this.locationCache.getCachedLocation();
        if (cachedLocation == null) {
            return null;
        }
        return parseJson(cachedLocation);
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public LocationData getInjectedLocation() {
        String injectedLocation = this.locationCache.getInjectedLocation();
        if (injectedLocation == null) {
            return null;
        }
        return parseJson(injectedLocation);
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public void storeLocation(UsercentricsLocation location) {
        Json json;
        Intrinsics.checkNotNullParameter(location, "location");
        ILocationCache iLocationCache = this.locationCache;
        LocationDataResponse locationDataResponse = new LocationDataResponse(new LocationData(location));
        json = JsonParserKt.json;
        Json json2 = json;
        KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(LocationDataResponse.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        iLocationCache.storeLocation(json2.encodeToString(serializer, locationDataResponse));
    }

    private final LocationData parseJson(String responseBody) {
        Json json;
        KSerializer<LocationDataResponse> serializer = LocationDataResponse.INSTANCE.serializer();
        json = JsonParserKt.json;
        return ((LocationDataResponse) json.decodeFromString(serializer, responseBody)).getData();
    }
}
