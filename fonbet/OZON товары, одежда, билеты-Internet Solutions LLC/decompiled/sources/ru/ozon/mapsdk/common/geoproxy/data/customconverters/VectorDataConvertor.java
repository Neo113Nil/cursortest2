package ru.ozon.mapsdk.common.geoproxy.data.customconverters;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/customconverters/VectorDataConvertor;", "Lcom/google/gson/i;", "Lru/ozon/mapsdk/common/geoproxy/data/model/VectorData;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VectorDataConvertor implements i<VectorData> {
    @Override // com.google.gson.i
    public final VectorData deserialize(JsonElement jsonElement, Type type, h hVar) {
        JsonObject asJsonObject;
        if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
            return null;
        }
        double asDouble = asJsonObject.get("maxZoom").getAsDouble();
        double asDouble2 = asJsonObject.get("minZoom").getAsDouble();
        String asString = asJsonObject.get("sdk").getAsString();
        int asInt = asJsonObject.get("tileSize").getAsInt();
        String asString2 = asJsonObject.get("tileUrl").getAsString();
        String asString3 = asJsonObject.get("styleUrl").getAsString();
        Map map = hVar != null ? (Map) hVar.a(asJsonObject.get("styleUrls"), new a().getType()) : null;
        Intrinsics.f(asString);
        Intrinsics.f(asString2);
        Intrinsics.f(asString3);
        return new VectorData(asDouble, asDouble2, asString, asInt, asString2, asString3, map);
    }
}
