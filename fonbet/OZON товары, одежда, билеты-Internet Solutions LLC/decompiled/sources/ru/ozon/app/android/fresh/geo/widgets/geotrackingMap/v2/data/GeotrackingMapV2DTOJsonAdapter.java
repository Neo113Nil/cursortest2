package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingMapV2DTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$Pin;", "pinAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO$CourierPinModification;", "nullableCourierPinModificationAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2DTOJsonAdapter extends JsonAdapter<GeotrackingMapV2DTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<GeotrackingMapV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<GeotrackingMapV2DTO.CourierPinModification> nullableCourierPinModificationAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<GeotrackingMapV2DTO.Pin> pinAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GeotrackingMapV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("courierPin", "destinationPin", "darkStorePin", "orderStatus", "isReceived", "defaultSheetHeightRatio", "locationTrackingInfo", "defaultSheetTrackingInfo", "expandedSheetTrackingInfo", "webSocketURL", "courierPinModification");
        M m11 = M.f71699a;
        this.pinAdapter = moshi.f(GeotrackingMapV2DTO.Pin.class, m11, "courierPin");
        this.stringAdapter = moshi.f(String.class, m11, "orderStatus");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isReceived");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "defaultSheetHeightRatio");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "locationTrackingInfo");
        this.nullableCourierPinModificationAdapter = moshi.f(GeotrackingMapV2DTO.CourierPinModification.class, m11, "courierPinModification");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(GeotrackingMapV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GeotrackingMapV2DTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        GeotrackingMapV2DTO.Pin pin = null;
        GeotrackingMapV2DTO.Pin pin2 = null;
        GeotrackingMapV2DTO.Pin pin3 = null;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        String str2 = null;
        GeotrackingMapV2DTO.CourierPinModification courierPinModification = null;
        while (true) {
            GeotrackingMapV2DTO.Pin pin4 = pin;
            GeotrackingMapV2DTO.Pin pin5 = pin2;
            GeotrackingMapV2DTO.Pin pin6 = pin3;
            String str3 = str;
            if (!reader.hasNext()) {
                Boolean bool2 = bool;
                reader.endObject();
                if (i12 == -33) {
                    if (pin4 == null) {
                        throw c.j("courierPin", "courierPin", reader);
                    }
                    if (pin5 == null) {
                        throw c.j("destinationPin", "destinationPin", reader);
                    }
                    if (pin6 == null) {
                        throw c.j("darkStorePin", "darkStorePin", reader);
                    }
                    if (str3 == null) {
                        throw c.j("orderStatus", "orderStatus", reader);
                    }
                    if (bool2 == null) {
                        throw c.j("isReceived", "isReceived", reader);
                    }
                    Map<String, TokenizedTrackingInfo> map4 = map3;
                    Map<String, TokenizedTrackingInfo> map5 = map2;
                    Map<String, TokenizedTrackingInfo> map6 = map;
                    Integer num2 = num;
                    boolean booleanValue = bool2.booleanValue();
                    if (str2 != null) {
                        return new GeotrackingMapV2DTO(pin4, pin5, pin6, str3, booleanValue, num2, map6, map5, map4, str2, courierPinModification);
                    }
                    throw c.j("webSocketURL", "webSocketURL", reader);
                }
                Map<String, TokenizedTrackingInfo> map7 = map3;
                Map<String, TokenizedTrackingInfo> map8 = map2;
                Map<String, TokenizedTrackingInfo> map9 = map;
                Integer num3 = num;
                Constructor<GeotrackingMapV2DTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = GeotrackingMapV2DTO.class.getDeclaredConstructor(GeotrackingMapV2DTO.Pin.class, GeotrackingMapV2DTO.Pin.class, GeotrackingMapV2DTO.Pin.class, String.class, Boolean.TYPE, Integer.class, Map.class, Map.class, Map.class, String.class, GeotrackingMapV2DTO.CourierPinModification.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<GeotrackingMapV2DTO> constructor2 = constructor;
                if (pin4 == null) {
                    throw c.j("courierPin", "courierPin", reader);
                }
                if (pin5 == null) {
                    throw c.j("destinationPin", "destinationPin", reader);
                }
                if (pin6 == null) {
                    throw c.j("darkStorePin", "darkStorePin", reader);
                }
                if (str3 == null) {
                    throw c.j("orderStatus", "orderStatus", reader);
                }
                if (bool2 == null) {
                    throw c.j("isReceived", "isReceived", reader);
                }
                if (str2 == null) {
                    throw c.j("webSocketURL", "webSocketURL", reader);
                }
                GeotrackingMapV2DTO newInstance = constructor2.newInstance(pin4, pin5, pin6, str3, bool2, num3, map9, map8, map7, str2, courierPinModification, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Boolean bool3 = bool;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 0:
                    pin = this.pinAdapter.fromJson(reader);
                    if (pin == null) {
                        throw c.q("courierPin", "courierPin", reader);
                    }
                    bool = bool3;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 1:
                    pin2 = this.pinAdapter.fromJson(reader);
                    if (pin2 == null) {
                        throw c.q("destinationPin", "destinationPin", reader);
                    }
                    bool = bool3;
                    pin = pin4;
                    pin3 = pin6;
                    str = str3;
                case 2:
                    pin3 = this.pinAdapter.fromJson(reader);
                    if (pin3 == null) {
                        throw c.q("darkStorePin", "darkStorePin", reader);
                    }
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    str = str3;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("orderStatus", "orderStatus", reader);
                    }
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                case 4:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isReceived", "isReceived", reader);
                    }
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                    i12 = -33;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 8:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 9:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("webSocketURL", "webSocketURL", reader);
                    }
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                case 10:
                    courierPinModification = this.nullableCourierPinModificationAdapter.fromJson(reader);
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
                default:
                    bool = bool3;
                    pin = pin4;
                    pin2 = pin5;
                    pin3 = pin6;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GeotrackingMapV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("courierPin");
        this.pinAdapter.mo44toJson(writer, (x) value.getCourierPin());
        writer.w("destinationPin");
        this.pinAdapter.mo44toJson(writer, (x) value.getDestinationPin());
        writer.w("darkStorePin");
        this.pinAdapter.mo44toJson(writer, (x) value.getDarkStorePin());
        writer.w("orderStatus");
        this.stringAdapter.mo44toJson(writer, (x) value.getOrderStatus());
        writer.w("isReceived");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isReceived()));
        writer.w("defaultSheetHeightRatio");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getDefaultSheetHeightRatio());
        writer.w("locationTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getLocationTrackingInfo());
        writer.w("defaultSheetTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDefaultSheetTrackingInfo());
        writer.w("expandedSheetTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getExpandedSheetTrackingInfo());
        writer.w("webSocketURL");
        this.stringAdapter.mo44toJson(writer, (x) value.getWebSocketURL());
        writer.w("courierPinModification");
        this.nullableCourierPinModificationAdapter.mo44toJson(writer, (x) value.getCourierPinModification());
        writer.p();
    }
}
