package ru.ozon.mapsdk.common.geoproxy.data.model;

import J8.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeSuggestResponse;", "", "suggestions", "", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeResponse;", "<init>", "(Ljava/util/List;)V", "getSuggestions", "()Ljava/util/List;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeocodeSuggestResponse {

    @b("suggestions")
    private final List<GeocodeResponse> suggestions;

    public GeocodeSuggestResponse(List<GeocodeResponse> list) {
        this.suggestions = list;
    }

    public final List<GeocodeResponse> getSuggestions() {
        return this.suggestions;
    }
}
