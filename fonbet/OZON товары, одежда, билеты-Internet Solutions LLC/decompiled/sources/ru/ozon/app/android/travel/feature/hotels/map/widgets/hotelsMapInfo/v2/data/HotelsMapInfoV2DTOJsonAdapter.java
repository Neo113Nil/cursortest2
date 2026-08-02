package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBox;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "nullableBoundingBoxAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "listOfPinAtJsonCollectionDecodingAdapter", "nullablePinAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction;", "nullableRestrictionAdapter", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "nullableTravelFiltersButtonDTOAdapter", "", "nullableListOfDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2DTOJsonAdapter extends JsonAdapter<HotelsMapInfoV2DTO> {
    private volatile Constructor<HotelsMapInfoV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<HotelsMapInfoV2DTO.Pin>> listOfPinAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<BoundingBox> nullableBoundingBoxAdapter;

    @NotNull
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV2DTO.Pin> nullablePinAdapter;

    @NotNull
    private final JsonAdapter<Restriction> nullableRestrictionAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<TravelFiltersButtonDTO> nullableTravelFiltersButtonDTOAdapter;

    @NotNull
    private final n.a options;

    public HotelsMapInfoV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("visibleRegion", "pins", "userLocationPin", "backButton", "locationDeniedAlert", "filtersButton", "zoomInButton", "zoomOutButton", "geolocationButton", "locationPoint");
        M m11 = M.f71699a;
        this.nullableBoundingBoxAdapter = moshi.f(BoundingBox.class, m11, "visibleRegion");
        this.listOfPinAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, HotelsMapInfoV2DTO.Pin.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "pins");
        this.nullablePinAdapter = moshi.f(HotelsMapInfoV2DTO.Pin.class, m11, "userLocationPin");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "backButton");
        this.nullableRestrictionAdapter = moshi.f(Restriction.class, m11, "locationDeniedAlert");
        this.nullableTravelFiltersButtonDTOAdapter = moshi.f(TravelFiltersButtonDTO.class, m11, "filtersButton");
        this.nullableListOfDoubleAdapter = moshi.f(D.e(List.class, Double.class), m11, "locationPoint");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(HotelsMapInfoV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        BoundingBox boundingBox = null;
        List<HotelsMapInfoV2DTO.Pin> list = null;
        HotelsMapInfoV2DTO.Pin pin = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        Restriction restriction = null;
        TravelFiltersButtonDTO travelFiltersButtonDTO = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        ButtonV3Atom.SmallIconButton smallIconButton3 = null;
        ButtonV3Atom.SmallIconButton smallIconButton4 = null;
        List<Double> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    boundingBox = this.nullableBoundingBoxAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.listOfPinAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("pins", "pins", reader);
                    }
                    i11 = -3;
                    break;
                case 2:
                    pin = this.nullablePinAdapter.fromJson(reader);
                    break;
                case 3:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    restriction = this.nullableRestrictionAdapter.fromJson(reader);
                    break;
                case 5:
                    travelFiltersButtonDTO = this.nullableTravelFiltersButtonDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    smallIconButton2 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    smallIconButton3 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    smallIconButton4 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 9:
                    list2 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTO.Pin>");
            ButtonV3Atom.SmallIconButton smallIconButton5 = smallIconButton4;
            ButtonV3Atom.SmallIconButton smallIconButton6 = smallIconButton3;
            ButtonV3Atom.SmallIconButton smallIconButton7 = smallIconButton2;
            TravelFiltersButtonDTO travelFiltersButtonDTO2 = travelFiltersButtonDTO;
            Restriction restriction2 = restriction;
            return new HotelsMapInfoV2DTO(boundingBox, list, pin, smallIconButton, restriction2, travelFiltersButtonDTO2, smallIconButton7, smallIconButton6, smallIconButton5, list2);
        }
        BoundingBox boundingBox2 = boundingBox;
        Constructor<HotelsMapInfoV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsMapInfoV2DTO.class.getDeclaredConstructor(BoundingBox.class, List.class, HotelsMapInfoV2DTO.Pin.class, ButtonV3Atom.SmallIconButton.class, Restriction.class, TravelFiltersButtonDTO.class, ButtonV3Atom.SmallIconButton.class, ButtonV3Atom.SmallIconButton.class, ButtonV3Atom.SmallIconButton.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HotelsMapInfoV2DTO newInstance = constructor.newInstance(boundingBox2, list, pin, smallIconButton, restriction, travelFiltersButtonDTO, smallIconButton2, smallIconButton3, smallIconButton4, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("visibleRegion");
        this.nullableBoundingBoxAdapter.mo44toJson(writer, (x) value.getVisibleRegion());
        writer.w("pins");
        this.listOfPinAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getPins());
        writer.w("userLocationPin");
        this.nullablePinAdapter.mo44toJson(writer, (x) value.getUserLocationPin());
        writer.w("backButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getBackButton());
        writer.w("locationDeniedAlert");
        this.nullableRestrictionAdapter.mo44toJson(writer, (x) value.getLocationDeniedAlert());
        writer.w("filtersButton");
        this.nullableTravelFiltersButtonDTOAdapter.mo44toJson(writer, (x) value.getFiltersButton());
        writer.w("zoomInButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getZoomInButton());
        writer.w("zoomOutButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getZoomOutButton());
        writer.w("geolocationButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getGeolocationButton());
        writer.w("locationPoint");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value.getLocationPoint());
        writer.p();
    }
}
