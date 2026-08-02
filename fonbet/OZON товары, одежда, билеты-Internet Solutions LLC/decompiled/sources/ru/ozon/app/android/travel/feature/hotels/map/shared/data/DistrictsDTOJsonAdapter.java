package ru.ozon.app.android.travel.feature.hotels.map.shared.data;

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
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "listOfPolygonAtJsonCollectionDecodingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "floatAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ControlShowPanel;", "controlShowPanelAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistrictsDTOJsonAdapter extends JsonAdapter<DistrictsDTO> {
    private volatile Constructor<DistrictsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DistrictsDTO.ControlShowPanel> controlShowPanelAdapter;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<List<DistrictsDTO.Polygon>> listOfPolygonAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public DistrictsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("districts", "startFillColorZoomAlpha", "endFillColorZoomAlpha", "controlShowPanel", "showLabelsZoom", "showDistrictsZoom");
        this.listOfPolygonAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, DistrictsDTO.Polygon.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "districts");
        M m11 = M.f71699a;
        this.floatAdapter = moshi.f(Float.TYPE, m11, "startFillColorZoomAlpha");
        this.controlShowPanelAdapter = moshi.f(DistrictsDTO.ControlShowPanel.class, m11, "controlShowPanel");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "showLabelsZoom");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(DistrictsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DistrictsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<DistrictsDTO.Polygon> list = null;
        Float f7 = null;
        Float f11 = null;
        DistrictsDTO.ControlShowPanel controlShowPanel = null;
        Integer num = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfPolygonAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("districts", "districts", reader);
                    }
                    i11 = -2;
                    break;
                case 1:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("startFillColorZoomAlpha", "startFillColorZoomAlpha", reader);
                    }
                    break;
                case 2:
                    f11 = this.floatAdapter.fromJson(reader);
                    if (f11 == null) {
                        throw c.q("endFillColorZoomAlpha", "endFillColorZoomAlpha", reader);
                    }
                    break;
                case 3:
                    controlShowPanel = this.controlShowPanelAdapter.fromJson(reader);
                    if (controlShowPanel == null) {
                        throw c.q("controlShowPanel", "controlShowPanel", reader);
                    }
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO.Polygon>");
            if (f7 == null) {
                throw c.j("startFillColorZoomAlpha", "startFillColorZoomAlpha", reader);
            }
            Float f12 = f11;
            float floatValue = f7.floatValue();
            if (f12 == null) {
                throw c.j("endFillColorZoomAlpha", "endFillColorZoomAlpha", reader);
            }
            Integer num3 = num2;
            Integer num4 = num;
            DistrictsDTO.ControlShowPanel controlShowPanel2 = controlShowPanel;
            float floatValue2 = f12.floatValue();
            if (controlShowPanel2 != null) {
                return new DistrictsDTO(list, floatValue, floatValue2, controlShowPanel2, num4, num3);
            }
            throw c.j("controlShowPanel", "controlShowPanel", reader);
        }
        Integer num5 = num2;
        Integer num6 = num;
        DistrictsDTO.ControlShowPanel controlShowPanel3 = controlShowPanel;
        Constructor<DistrictsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Float.TYPE;
            constructor = DistrictsDTO.class.getDeclaredConstructor(List.class, cls2, cls2, DistrictsDTO.ControlShowPanel.class, Integer.class, Integer.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (f7 == null) {
            throw c.j("startFillColorZoomAlpha", "startFillColorZoomAlpha", reader);
        }
        if (f11 == null) {
            throw c.j("endFillColorZoomAlpha", "endFillColorZoomAlpha", reader);
        }
        if (controlShowPanel3 == null) {
            throw c.j("controlShowPanel", "controlShowPanel", reader);
        }
        DistrictsDTO newInstance = constructor.newInstance(list, f7, f11, controlShowPanel3, num6, num5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DistrictsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("districts");
        this.listOfPolygonAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getDistricts());
        writer.w("startFillColorZoomAlpha");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getStartFillColorZoomAlpha()));
        writer.w("endFillColorZoomAlpha");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getEndFillColorZoomAlpha()));
        writer.w("controlShowPanel");
        this.controlShowPanelAdapter.mo44toJson(writer, (x) value.getControlShowPanel());
        writer.w("showLabelsZoom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getShowLabelsZoom());
        writer.w("showDistrictsZoom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getShowDistrictsZoom());
        writer.p();
    }
}
