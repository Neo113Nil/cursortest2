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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v5.data.HotelsMapInfoV5DTO;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "nullableBoundingBoxV2Adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfDoubleAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinsDisplaySettings;", "pinsDisplaySettingsAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$Actions;", "actionsAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$PinTypes;", "pinTypesAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "cardStyleAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "nullableDistrictsDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$MobileSettings;", "mobileSettingsAdapter", "nullableStringAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "pinLimitsAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v5/data/HotelsMapInfoV5DTO$TrackingInfo;", "nullableTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV5DTOJsonAdapter extends JsonAdapter<HotelsMapInfoV5DTO> {

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.Actions> actionsAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.CardStyle> cardStyleAdapter;
    private volatile Constructor<HotelsMapInfoV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.MobileSettings> mobileSettingsAdapter;

    @NotNull
    private final JsonAdapter<BoundingBoxV2> nullableBoundingBoxV2Adapter;

    @NotNull
    private final JsonAdapter<DistrictsDTO> nullableDistrictsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV5DTO.TrackingInfo> nullableTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.PinLimits> pinLimitsAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV5DTO.PinTypes> pinTypesAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.PinsDisplaySettings> pinsDisplaySettingsAdapter;

    public HotelsMapInfoV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("visibleRegion", "locationPoint", "pinsDisplaySettings", "actions", "pinTypes", "cardStyle", "districts", "mobileSettings", "regionHash", "pinLimits", "tracking");
        M m11 = M.f71699a;
        this.nullableBoundingBoxV2Adapter = moshi.f(BoundingBoxV2.class, m11, "visibleRegion");
        this.listOfDoubleAdapter = moshi.f(D.e(List.class, Double.class), m11, "locationPoint");
        this.pinsDisplaySettingsAdapter = moshi.f(HotelsMapInfoV4DTO.PinsDisplaySettings.class, m11, "pinsDisplaySettings");
        this.actionsAdapter = moshi.f(HotelsMapInfoV4DTO.Actions.class, m11, "actions");
        this.pinTypesAdapter = moshi.f(HotelsMapInfoV5DTO.PinTypes.class, m11, "pinTypes");
        this.cardStyleAdapter = moshi.f(HotelsMapInfoV4DTO.CardStyle.class, m11, "cardStyle");
        this.nullableDistrictsDTOAdapter = moshi.f(DistrictsDTO.class, m11, "districts");
        this.mobileSettingsAdapter = moshi.f(HotelsMapInfoV4DTO.MobileSettings.class, m11, "mobileSettings");
        this.nullableStringAdapter = moshi.f(String.class, m11, "regionHash");
        this.pinLimitsAdapter = moshi.f(HotelsMapInfoV4DTO.PinLimits.class, m11, "pinLimits");
        this.nullableTrackingInfoAdapter = moshi.f(HotelsMapInfoV5DTO.TrackingInfo.class, m11, "tracking");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(HotelsMapInfoV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV5DTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        BoundingBoxV2 boundingBoxV2 = null;
        List<Double> list = null;
        HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings = null;
        HotelsMapInfoV4DTO.Actions actions = null;
        HotelsMapInfoV5DTO.PinTypes pinTypes = null;
        HotelsMapInfoV4DTO.CardStyle cardStyle = null;
        DistrictsDTO districtsDTO = null;
        String str = null;
        String str2 = null;
        HotelsMapInfoV4DTO.PinLimits pinLimits = null;
        HotelsMapInfoV5DTO.TrackingInfo trackingInfo = null;
        while (true) {
            BoundingBoxV2 boundingBoxV22 = boundingBoxV2;
            HotelsMapInfoV4DTO.PinsDisplaySettings pinsDisplaySettings2 = pinsDisplaySettings;
            HotelsMapInfoV4DTO.Actions actions2 = actions;
            HotelsMapInfoV5DTO.PinTypes pinTypes2 = pinTypes;
            HotelsMapInfoV4DTO.CardStyle cardStyle2 = cardStyle;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i12 == -3) {
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
                    if (pinsDisplaySettings2 == null) {
                        throw c.j("pinsDisplaySettings", "pinsDisplaySettings", reader);
                    }
                    if (actions2 == null) {
                        throw c.j("actions", "actions", reader);
                    }
                    if (pinTypes2 == null) {
                        throw c.j("pinTypes", "pinTypes", reader);
                    }
                    if (cardStyle2 == null) {
                        throw c.j("cardStyle", "cardStyle", reader);
                    }
                    if (str == null) {
                        throw c.j("mobileSettings", "mobileSettings", reader);
                    }
                    if (pinLimits != null) {
                        return new HotelsMapInfoV5DTO(boundingBoxV22, list, pinsDisplaySettings2, actions2, pinTypes2, cardStyle2, districtsDTO, str, str2, pinLimits, trackingInfo, null);
                    }
                    throw c.j("pinLimits", "pinLimits", reader);
                }
                Constructor<HotelsMapInfoV5DTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = HotelsMapInfoV5DTO.class.getDeclaredConstructor(BoundingBoxV2.class, List.class, HotelsMapInfoV4DTO.PinsDisplaySettings.class, HotelsMapInfoV4DTO.Actions.class, HotelsMapInfoV5DTO.PinTypes.class, HotelsMapInfoV4DTO.CardStyle.class, DistrictsDTO.class, HotelsMapInfoV4DTO.MobileSettings.class, String.class, HotelsMapInfoV4DTO.PinLimits.class, HotelsMapInfoV5DTO.TrackingInfo.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<HotelsMapInfoV5DTO> constructor2 = constructor;
                if (pinsDisplaySettings2 == null) {
                    throw c.j("pinsDisplaySettings", "pinsDisplaySettings", reader);
                }
                if (actions2 == null) {
                    throw c.j("actions", "actions", reader);
                }
                if (pinTypes2 == null) {
                    throw c.j("pinTypes", "pinTypes", reader);
                }
                if (cardStyle2 == null) {
                    throw c.j("cardStyle", "cardStyle", reader);
                }
                if (str == null) {
                    throw c.j("mobileSettings", "mobileSettings", reader);
                }
                HotelsMapInfoV4DTO.MobileSettings m1324boximpl = HotelsMapInfoV4DTO.MobileSettings.m1324boximpl(str);
                if (pinLimits == null) {
                    throw c.j("pinLimits", "pinLimits", reader);
                }
                HotelsMapInfoV5DTO newInstance = constructor2.newInstance(boundingBoxV22, list, pinsDisplaySettings2, actions2, pinTypes2, cardStyle2, districtsDTO, m1324boximpl, str2, pinLimits, trackingInfo, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 0:
                    boundingBoxV2 = this.nullableBoundingBoxV2Adapter.fromJson(reader);
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 1:
                    list = this.listOfDoubleAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("locationPoint", "locationPoint", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                    i12 = -3;
                case 2:
                    pinsDisplaySettings = this.pinsDisplaySettingsAdapter.fromJson(reader);
                    if (pinsDisplaySettings == null) {
                        throw c.q("pinsDisplaySettings", "pinsDisplaySettings", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 3:
                    actions = this.actionsAdapter.fromJson(reader);
                    if (actions == null) {
                        throw c.q("actions", "actions", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 4:
                    pinTypes = this.pinTypesAdapter.fromJson(reader);
                    if (pinTypes == null) {
                        throw c.q("pinTypes", "pinTypes", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    cardStyle = cardStyle2;
                case 5:
                    cardStyle = this.cardStyleAdapter.fromJson(reader);
                    if (cardStyle == null) {
                        throw c.q("cardStyle", "cardStyle", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                case 6:
                    districtsDTO = this.nullableDistrictsDTOAdapter.fromJson(reader);
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 7:
                    HotelsMapInfoV4DTO.MobileSettings fromJson = this.mobileSettingsAdapter.fromJson(reader);
                    str = fromJson != null ? fromJson.m1330unboximpl() : null;
                    if (str == null) {
                        throw c.q("mobileSettings", "mobileSettings", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 9:
                    pinLimits = this.pinLimitsAdapter.fromJson(reader);
                    if (pinLimits == null) {
                        throw c.q("pinLimits", "pinLimits", reader);
                    }
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                case 10:
                    trackingInfo = this.nullableTrackingInfoAdapter.fromJson(reader);
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
                default:
                    boundingBoxV2 = boundingBoxV22;
                    pinsDisplaySettings = pinsDisplaySettings2;
                    actions = actions2;
                    pinTypes = pinTypes2;
                    cardStyle = cardStyle2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("visibleRegion");
        this.nullableBoundingBoxV2Adapter.mo44toJson(writer, (x) value.getVisibleRegion());
        writer.w("locationPoint");
        this.listOfDoubleAdapter.mo44toJson(writer, (x) value.getLocationPoint());
        writer.w("pinsDisplaySettings");
        this.pinsDisplaySettingsAdapter.mo44toJson(writer, (x) value.getPinsDisplaySettings());
        writer.w("actions");
        this.actionsAdapter.mo44toJson(writer, (x) value.getActions());
        writer.w("pinTypes");
        this.pinTypesAdapter.mo44toJson(writer, (x) value.getPinTypes());
        writer.w("cardStyle");
        this.cardStyleAdapter.mo44toJson(writer, (x) value.getCardStyle());
        writer.w("districts");
        this.nullableDistrictsDTOAdapter.mo44toJson(writer, (x) value.getDistricts());
        writer.w("mobileSettings");
        this.mobileSettingsAdapter.mo44toJson(writer, (x) HotelsMapInfoV4DTO.MobileSettings.m1324boximpl(value.m1336getMobileSettingsie92oRg()));
        writer.w("regionHash");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRegionHash());
        writer.w("pinLimits");
        this.pinLimitsAdapter.mo44toJson(writer, (x) value.getPinLimits());
        writer.w("tracking");
        this.nullableTrackingInfoAdapter.mo44toJson(writer, (x) value.getTracking());
        writer.p();
    }
}
