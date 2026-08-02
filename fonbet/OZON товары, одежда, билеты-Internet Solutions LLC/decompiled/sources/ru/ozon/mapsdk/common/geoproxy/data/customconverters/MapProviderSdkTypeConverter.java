package ru.ozon.mapsdk.common.geoproxy.data.customconverters;

import com.google.gson.JsonElement;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/customconverters/MapProviderSdkTypeConverter;", "Lcom/google/gson/i;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapProviderSdkTypeConverter implements i<GeoProviderConfig.SdkType> {
    @Override // com.google.gson.i
    public final GeoProviderConfig.SdkType deserialize(JsonElement jsonElement, Type type, h hVar) {
        String X9 = kotlin.text.h.X(String.valueOf(jsonElement), "\"", "", false);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = X9.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -737882127) {
            return hashCode != 0 ? GeoProviderConfig.SdkType.MapLibre.INSTANCE : GeoProviderConfig.SdkType.MapLibre.INSTANCE;
        }
        if (lowerCase.equals("yandex")) {
            return GeoProviderConfig.SdkType.Yandex.INSTANCE;
        }
        return GeoProviderConfig.SdkType.Unknown.INSTANCE;
    }
}
