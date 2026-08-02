package ru.ozon.mapsdk.common.storage.convertors;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.convertors.BaseGeoProviderConfigConvertor;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/mapsdk/common/storage/convertors/MapGeoProviderConfigCacheConvertor;", "Lru/ozon/mapsdk/common/convertors/BaseGeoProviderConfigConvertor;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapGeoProviderConfigCacheConvertor extends BaseGeoProviderConfigConvertor {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapSdkTypeCacheConvertor f97561a = new MapSdkTypeCacheConvertor();

    @Override // ru.ozon.mapsdk.common.convertors.BaseGeoProviderConfigConvertor
    @NotNull
    protected final GeoProviderConfig.SdkType a(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        JsonElement jsonElement = jsonObject.get("sdkType");
        MapSdkTypeCacheConvertor mapSdkTypeCacheConvertor = this.f97561a;
        GeoProviderConfig.SdkType b11 = mapSdkTypeCacheConvertor.b(jsonElement);
        if (b11 != null) {
            return b11;
        }
        GeoProviderConfig.SdkType b12 = mapSdkTypeCacheConvertor.b(jsonObject.get("sdk"));
        return b12 == null ? GeoProviderConfig.SdkType.Unknown.INSTANCE : b12;
    }
}
