package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO_PricePinStates_PinStylesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PricePinStates$PinStyles;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "iconDTOAdapter", "", "", "mapOfIntIconDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4DTO_PricePinStates_PinStylesJsonAdapter extends JsonAdapter<HotelsMapInfoV4DTO.PricePinStates.PinStyles> {
    private volatile Constructor<HotelsMapInfoV4DTO.PricePinStates.PinStyles> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<Integer, IconDTO>> mapOfIntIconDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsMapInfoV4DTO_PricePinStates_PinStylesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "borderColor", "text", "discountIcon", "favoriteIcon", "icons");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "text");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "discountIcon");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "favoriteIcon");
        this.mapOfIntIconDTOAdapter = moshi.f(D.e(Map.class, Integer.class, IconDTO.class), m11, "icons");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(HotelsMapInfoV4DTO.PricePinStates.PinStyles)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV4DTO.PricePinStates.PinStyles fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        Map<Integer, IconDTO> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 3:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    iconDTO2 = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO2 == null) {
                        throw c.q("favoriteIcon", "favoriteIcon", reader);
                    }
                    break;
                case 5:
                    map = this.mapOfIntIconDTOAdapter.fromJson(reader);
                    if (map == null) {
                        throw c.q("icons", "icons", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            IconDTO iconDTO3 = iconDTO2;
            IconDTO iconDTO4 = iconDTO;
            TextDTO textDTO2 = textDTO;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            if (textDTO2 == null) {
                throw c.j("text", "text", reader);
            }
            if (iconDTO3 == null) {
                throw c.j("favoriteIcon", "favoriteIcon", reader);
            }
            Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, ru.ozon.uni.atoms.data.icon.IconDTO>");
            return new HotelsMapInfoV4DTO.PricePinStates.PinStyles(str4, str3, textDTO2, iconDTO4, iconDTO3, map);
        }
        IconDTO iconDTO5 = iconDTO2;
        IconDTO iconDTO6 = iconDTO;
        TextDTO textDTO3 = textDTO;
        String str5 = str2;
        String str6 = str;
        Constructor<HotelsMapInfoV4DTO.PricePinStates.PinStyles> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsMapInfoV4DTO.PricePinStates.PinStyles.class.getDeclaredConstructor(String.class, String.class, TextDTO.class, IconDTO.class, IconDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<HotelsMapInfoV4DTO.PricePinStates.PinStyles> constructor2 = constructor;
        if (str6 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (textDTO3 == null) {
            throw c.j("text", "text", reader);
        }
        if (iconDTO5 == null) {
            throw c.j("favoriteIcon", "favoriteIcon", reader);
        }
        HotelsMapInfoV4DTO.PricePinStates.PinStyles newInstance = constructor2.newInstance(str6, str5, textDTO3, iconDTO6, iconDTO5, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV4DTO.PricePinStates.PinStyles value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("discountIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getDiscountIcon());
        writer.w("favoriteIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getFavoriteIcon());
        writer.w("icons");
        this.mapOfIntIconDTOAdapter.mo44toJson(writer, (x) value.getIcons());
        writer.p();
    }
}
