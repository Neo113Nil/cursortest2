package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004B\u0015\b\u0007\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Parser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV3Parser implements Function2<String, String, GalleryV3DTO> {

    @NotNull
    private final JsonParser jsonDeserializer;

    public GalleryV3Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    @Override // kotlin.jvm.functions.Function2
    public GalleryV3DTO invoke(String params, String state) {
        GalleryV3DTO galleryV3DTO;
        GalleryV3DTO.GalleryItem copy;
        JsonParser jsonParser = this.jsonDeserializer;
        if (state == null || (galleryV3DTO = (GalleryV3DTO) jsonParser.fromJson(state, GalleryV3DTO.class)) == null) {
            return null;
        }
        List<GalleryV3DTO.GalleryItem> items = galleryV3DTO.getItems();
        ArrayList W02 = C7714v.W0(items);
        JSONArray jSONArray = new JSONObject(state).getJSONArray("items");
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            copy = GalleryV3ParserKt.copy((GalleryV3DTO.GalleryItem) obj, ((GalleryItemTokenizedTrackingInfo) jsonParser.fromJson(jSONArray.get(i11).toString(), GalleryItemTokenizedTrackingInfo.class)).getTrackingInfo());
            W02.set(i11, copy);
            i11 = i12;
        }
        return GalleryV3DTO.copy$default(galleryV3DTO, W02, null, null, null, null, null, null, null, 254, null);
    }
}
