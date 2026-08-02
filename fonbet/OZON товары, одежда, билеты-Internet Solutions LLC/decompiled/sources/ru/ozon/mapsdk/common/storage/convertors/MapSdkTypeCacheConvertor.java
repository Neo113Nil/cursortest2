package ru.ozon.mapsdk.common.storage.convertors;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import java.lang.reflect.Type;
import kotlin.Metadata;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/mapsdk/common/storage/convertors/MapSdkTypeCacheConvertor;", "Lcom/google/gson/m;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "Lcom/google/gson/i;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapSdkTypeCacheConvertor implements m<GeoProviderConfig.SdkType>, i<GeoProviderConfig.SdkType> {
    @Override // com.google.gson.m
    public final JsonPrimitive a(Object obj) {
        GeoProviderConfig.SdkType sdkType = (GeoProviderConfig.SdkType) obj;
        if (sdkType != null) {
            return new JsonPrimitive(sdkType.getName$mapsdk_fullFirebaseOpenglRelease());
        }
        return null;
    }

    public final GeoProviderConfig.SdkType b(JsonElement jsonElement) {
        String asString;
        if (jsonElement != null) {
            if (!jsonElement.isJsonPrimitive()) {
                jsonElement = null;
            }
            if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                return GeoProviderConfig.SdkType.INSTANCE.fromName(asString);
            }
        }
        return null;
    }

    @Override // com.google.gson.i
    public final /* bridge */ /* synthetic */ GeoProviderConfig.SdkType deserialize(JsonElement jsonElement, Type type, h hVar) {
        return b(jsonElement);
    }
}
