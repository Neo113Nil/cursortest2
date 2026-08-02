package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data;

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
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data.HotelsMapInfoV5DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO_PricePinStatesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PricePinStates$PinStyles;", "pinStylesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullablePinStylesAdapter", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "mapOfIntIconDTOAdapter", "iconDTOAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV5DTO_PricePinStatesJsonAdapter extends JsonAdapter<HotelsMapInfoV5DTO.PricePinStates> {
    private volatile Constructor<HotelsMapInfoV5DTO.PricePinStates> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<Integer, IconDTO>> mapOfIntIconDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV5DTO.PricePinStates.PinStyles> nullablePinStylesAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV5DTO.PricePinStates.PinStyles> pinStylesAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HotelsMapInfoV5DTO_PricePinStatesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("default", "selected", "viewed", "icons", "favoriteIcon", "singlePinTemplateTitle", "clusterPinTemplateTitle");
        M m11 = M.f71699a;
        this.pinStylesAdapter = moshi.f(HotelsMapInfoV5DTO.PricePinStates.PinStyles.class, m11, "default");
        this.nullablePinStylesAdapter = moshi.f(HotelsMapInfoV5DTO.PricePinStates.PinStyles.class, m11, "selected");
        this.mapOfIntIconDTOAdapter = moshi.f(D.e(Map.class, Integer.class, IconDTO.class), m11, "icons");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "favoriteIcon");
        this.stringAdapter = moshi.f(String.class, m11, "singlePinTemplateTitle");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(HotelsMapInfoV5DTO.PricePinStates)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV5DTO.PricePinStates fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles = null;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles2 = null;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles3 = null;
        Map<Integer, IconDTO> map = null;
        IconDTO iconDTO = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    pinStyles = this.pinStylesAdapter.fromJson(reader);
                    if (pinStyles == null) {
                        throw c.q("default", "default", reader);
                    }
                    break;
                case 1:
                    pinStyles2 = this.nullablePinStylesAdapter.fromJson(reader);
                    break;
                case 2:
                    pinStyles3 = this.nullablePinStylesAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.mapOfIntIconDTOAdapter.fromJson(reader);
                    if (map == null) {
                        throw c.q("icons", "icons", reader);
                    }
                    i11 = -9;
                    break;
                case 4:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("favoriteIcon", "favoriteIcon", reader);
                    }
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("singlePinTemplateTitle", "singlePinTemplateTitle", reader);
                    }
                    break;
                case 6:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("clusterPinTemplateTitle", "clusterPinTemplateTitle", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles4 = pinStyles3;
            HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles5 = pinStyles2;
            HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles6 = pinStyles;
            if (pinStyles6 == null) {
                throw c.j("default", "default", reader);
            }
            Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, ru.ozon.uni.atoms.data.icon.IconDTO>");
            if (iconDTO == null) {
                throw c.j("favoriteIcon", "favoriteIcon", reader);
            }
            if (str == null) {
                throw c.j("singlePinTemplateTitle", "singlePinTemplateTitle", reader);
            }
            if (str2 == null) {
                throw c.j("clusterPinTemplateTitle", "clusterPinTemplateTitle", reader);
            }
            String str3 = str2;
            return new HotelsMapInfoV5DTO.PricePinStates(pinStyles6, pinStyles5, pinStyles4, map, iconDTO, str, str3);
        }
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles7 = pinStyles3;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles8 = pinStyles2;
        HotelsMapInfoV5DTO.PricePinStates.PinStyles pinStyles9 = pinStyles;
        Constructor<HotelsMapInfoV5DTO.PricePinStates> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsMapInfoV5DTO.PricePinStates.class.getDeclaredConstructor(HotelsMapInfoV5DTO.PricePinStates.PinStyles.class, HotelsMapInfoV5DTO.PricePinStates.PinStyles.class, HotelsMapInfoV5DTO.PricePinStates.PinStyles.class, Map.class, IconDTO.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (pinStyles9 == null) {
            throw c.j("default", "default", reader);
        }
        if (iconDTO == null) {
            throw c.j("favoriteIcon", "favoriteIcon", reader);
        }
        if (str == null) {
            throw c.j("singlePinTemplateTitle", "singlePinTemplateTitle", reader);
        }
        if (str2 == null) {
            throw c.j("clusterPinTemplateTitle", "clusterPinTemplateTitle", reader);
        }
        HotelsMapInfoV5DTO.PricePinStates newInstance = constructor.newInstance(pinStyles9, pinStyles8, pinStyles7, map, iconDTO, str, str2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV5DTO.PricePinStates value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("default");
        this.pinStylesAdapter.mo44toJson(writer, (x) value.getDefault());
        writer.w("selected");
        this.nullablePinStylesAdapter.mo44toJson(writer, (x) value.getSelected());
        writer.w("viewed");
        this.nullablePinStylesAdapter.mo44toJson(writer, (x) value.getViewed());
        writer.w("icons");
        this.mapOfIntIconDTOAdapter.mo44toJson(writer, (x) value.getIcons());
        writer.w("favoriteIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getFavoriteIcon());
        writer.w("singlePinTemplateTitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getSinglePinTemplateTitle());
        writer.w("clusterPinTemplateTitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getClusterPinTemplateTitle());
        writer.p();
    }
}
