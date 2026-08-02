package ru.ozon.mapsdk.common.geoproxy.data.customconverters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/customconverters/ProviderSuggestAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProviderSuggestAdapter extends TypeAdapter<GeoProviderConfig.ProviderSuggest> {
    @Override // com.google.gson.TypeAdapter
    public final GeoProviderConfig.ProviderSuggest read(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull();
            return null;
        }
        String nextString = reader.nextString();
        try {
            Intrinsics.f(nextString);
            String upperCase = nextString.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return GeoProviderConfig.ProviderSuggest.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, GeoProviderConfig.ProviderSuggest providerSuggest) {
        GeoProviderConfig.ProviderSuggest providerSuggest2 = providerSuggest;
        Intrinsics.checkNotNullParameter(out, "out");
        if (providerSuggest2 == null) {
            out.nullValue();
            return;
        }
        String lowerCase = providerSuggest2.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        out.value(lowerCase);
    }
}
