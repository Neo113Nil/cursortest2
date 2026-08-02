package ru.ozon.app.android.geo.map.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO_MapObjectJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "nullableTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "coordinateAdapter", "nullableStringAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "nullableViewPortAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "nullableAdditionalPinContentAdapter", "stringAdapter", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapDTO_MapObjectJsonAdapter extends JsonAdapter<AddressEditMapDTO.MapObject> {

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.Coordinate> coordinateAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.AdditionalPinContent> nullableAdditionalPinContentAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.MapObject.Type> nullableTypeAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.ViewPort> nullableViewPortAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AddressEditMapDTO_MapObjectJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "coordinates", "pinsCount", "pinsCountColor", "image", "imageTintColor", "tintColor", "borderColor", "viewport", "additionalContent", "actionLink", "isSelected", "zPriority", "isClickEnabled", "ignoreCollapsedState", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableTypeAdapter = moshi.f(AddressEditMapDTO.MapObject.Type.class, m11, "type");
        this.coordinateAdapter = moshi.f(AddressEditMapDTO.Coordinate.class, m11, "coordinates");
        this.nullableStringAdapter = moshi.f(String.class, m11, "pinsCount");
        this.nullableViewPortAdapter = moshi.f(AddressEditMapDTO.ViewPort.class, m11, "viewport");
        this.nullableAdditionalPinContentAdapter = moshi.f(AddressEditMapDTO.AdditionalPinContent.class, m11, "additionalContent");
        this.stringAdapter = moshi.f(String.class, m11, "actionLink");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSelected");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "zPriority");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(AddressEditMapDTO.MapObject)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressEditMapDTO.MapObject fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AddressEditMapDTO.MapObject.Type type = null;
        AddressEditMapDTO.Coordinate coordinate = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        AddressEditMapDTO.ViewPort viewPort = null;
        AddressEditMapDTO.AdditionalPinContent additionalPinContent = null;
        String str7 = null;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            AddressEditMapDTO.MapObject.Type type2 = type;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    type = this.nullableTypeAdapter.fromJson(reader);
                    continue;
                case 1:
                    coordinate = this.coordinateAdapter.fromJson(reader);
                    if (coordinate == null) {
                        throw c.q("coordinates", "coordinates", reader);
                    }
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    viewPort = this.nullableViewPortAdapter.fromJson(reader);
                    break;
                case 9:
                    additionalPinContent = this.nullableAdditionalPinContentAdapter.fromJson(reader);
                    break;
                case 10:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("actionLink", "actionLink", reader);
                    }
                    break;
                case 11:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 12:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 13:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 14:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            type = type2;
        }
        AddressEditMapDTO.MapObject.Type type3 = type;
        reader.endObject();
        if (coordinate == null) {
            throw c.j("coordinates", "coordinates", reader);
        }
        if (str7 != null) {
            return new AddressEditMapDTO.MapObject(type3, coordinate, str, str2, str3, str4, str5, str6, viewPort, additionalPinContent, str7, bool, num, bool2, bool3, map);
        }
        throw c.j("actionLink", "actionLink", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressEditMapDTO.MapObject value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.nullableTypeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("coordinates");
        this.coordinateAdapter.mo44toJson(writer, (x) value.getCoordinates());
        writer.w("pinsCount");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPinsCount());
        writer.w("pinsCountColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPinsCountColor());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("imageTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageTintColor());
        writer.w("tintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTintColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("viewport");
        this.nullableViewPortAdapter.mo44toJson(writer, (x) value.getViewport());
        writer.w("additionalContent");
        this.nullableAdditionalPinContentAdapter.mo44toJson(writer, (x) value.getAdditionalContent());
        writer.w("actionLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getActionLink());
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSelected());
        writer.w("zPriority");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getZPriority());
        writer.w("isClickEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isClickEnabled());
        writer.w("ignoreCollapsedState");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getIgnoreCollapsedState());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
