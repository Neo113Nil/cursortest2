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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO_PolygonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Polygon;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$PolygonPoint;", "listOfPolygonPointAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$ExcludedPath;", "listOfExcludedPathAdapter", "", "nullableFloatAdapter", "stringAdapter", "", "intAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/DistrictsDTO$Label;", "labelAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DistrictsDTO_PolygonJsonAdapter extends JsonAdapter<DistrictsDTO.Polygon> {
    private volatile Constructor<DistrictsDTO.Polygon> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<DistrictsDTO.Label> labelAdapter;

    @NotNull
    private final JsonAdapter<List<DistrictsDTO.ExcludedPath>> listOfExcludedPathAdapter;

    @NotNull
    private final JsonAdapter<List<DistrictsDTO.PolygonPoint>> listOfPolygonPointAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DistrictsDTO_PolygonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", "points", "excludedPaths", "strokeColor", "strokeWidth", "fillColor", "zIndex", "label");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "id");
        this.listOfPolygonPointAdapter = moshi.f(D.e(List.class, DistrictsDTO.PolygonPoint.class), m11, "points");
        this.listOfExcludedPathAdapter = moshi.f(D.e(List.class, DistrictsDTO.ExcludedPath.class), m11, "excludedPaths");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "strokeWidth");
        this.stringAdapter = moshi.f(String.class, m11, "fillColor");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "zIndex");
        this.labelAdapter = moshi.f(DistrictsDTO.Label.class, m11, "label");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(DistrictsDTO.Polygon)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DistrictsDTO.Polygon fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        List<DistrictsDTO.PolygonPoint> list = null;
        List<DistrictsDTO.ExcludedPath> list2 = null;
        String str2 = null;
        Float f7 = null;
        String str3 = null;
        Integer num = null;
        DistrictsDTO.Label label = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.listOfPolygonPointAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("points", "points", reader);
                    }
                    break;
                case 2:
                    list2 = this.listOfExcludedPathAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("excludedPaths", "excludedPaths", reader);
                    }
                    i12 = -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("fillColor", "fillColor", reader);
                    }
                    break;
                case 6:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("zIndex", "zIndex", reader);
                    }
                    break;
                case 7:
                    label = this.labelAdapter.fromJson(reader);
                    if (label == null) {
                        throw c.q("label", "label", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i12 == -5) {
            List<DistrictsDTO.PolygonPoint> list3 = list;
            String str4 = str;
            if (list3 == null) {
                throw c.j("points", "points", reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.hotels.map.shared.data.DistrictsDTO.ExcludedPath>");
            if (str3 == null) {
                throw c.j("fillColor", "fillColor", reader);
            }
            if (num == null) {
                throw c.j("zIndex", "zIndex", reader);
            }
            DistrictsDTO.Label label2 = label;
            int intValue = num.intValue();
            if (label2 == null) {
                throw c.j("label", "label", reader);
            }
            String str5 = str3;
            return new DistrictsDTO.Polygon(str4, list3, list2, str2, f7, str5, intValue, label2);
        }
        List<DistrictsDTO.PolygonPoint> list4 = list;
        String str6 = str;
        String str7 = str3;
        Float f11 = f7;
        String str8 = str2;
        List<DistrictsDTO.ExcludedPath> list5 = list2;
        DistrictsDTO.Label label3 = label;
        Constructor<DistrictsDTO.Polygon> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            i11 = i12;
            constructor = DistrictsDTO.Polygon.class.getDeclaredConstructor(String.class, List.class, List.class, String.class, Float.class, String.class, cls2, DistrictsDTO.Label.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<DistrictsDTO.Polygon> constructor2 = constructor;
        if (list4 == null) {
            throw c.j("points", "points", reader);
        }
        if (str7 == null) {
            throw c.j("fillColor", "fillColor", reader);
        }
        if (num == null) {
            throw c.j("zIndex", "zIndex", reader);
        }
        if (label3 == null) {
            throw c.j("label", "label", reader);
        }
        DistrictsDTO.Polygon newInstance = constructor2.newInstance(str6, list4, list5, str8, f11, str7, num, label3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DistrictsDTO.Polygon value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getId());
        writer.w("points");
        this.listOfPolygonPointAdapter.mo44toJson(writer, (x) value.getPoints());
        writer.w("excludedPaths");
        this.listOfExcludedPathAdapter.mo44toJson(writer, (x) value.getExcludedPaths());
        writer.w("strokeColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStrokeColor());
        writer.w("strokeWidth");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getStrokeWidth());
        writer.w("fillColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getFillColor());
        writer.w("zIndex");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getZIndex()));
        writer.w("label");
        this.labelAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.p();
    }
}
