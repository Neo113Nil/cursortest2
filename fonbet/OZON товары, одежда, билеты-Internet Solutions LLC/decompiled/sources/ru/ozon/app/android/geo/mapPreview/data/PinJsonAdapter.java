package ru.ozon.app.android.geo.mapPreview.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/mapPreview/data/PinJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/mapPreview/data/Pin;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/mapPreview/data/Pin;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/mapPreview/data/Pin;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/geo/mapPreview/data/AnchorPoint;", "anchorPointAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/mapPreview/data/Coordinates;", "coordinatesAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PinJsonAdapter extends JsonAdapter<Pin> {

    @NotNull
    private final JsonAdapter<AnchorPoint> anchorPointAdapter;
    private volatile Constructor<Pin> constructorRef;

    @NotNull
    private final JsonAdapter<Coordinates> coordinatesAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PinJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("anchorPoint", "coordinates", "icon");
        M m11 = M.f71699a;
        this.anchorPointAdapter = moshi.f(AnchorPoint.class, m11, "anchorPoint");
        this.coordinatesAdapter = moshi.f(Coordinates.class, m11, "coordinates");
        this.stringAdapter = moshi.f(String.class, m11, "icon");
    }

    @NotNull
    public String toString() {
        return b.c(25, "GeneratedJsonAdapter(Pin)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Pin fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AnchorPoint anchorPoint = null;
        Coordinates coordinates = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                anchorPoint = this.anchorPointAdapter.fromJson(reader);
                if (anchorPoint == null) {
                    throw c.q("anchorPoint", "anchorPoint", reader);
                }
                i11 = -2;
            } else if (v11 == 1) {
                coordinates = this.coordinatesAdapter.fromJson(reader);
                if (coordinates == null) {
                    throw c.q("coordinates", "coordinates", reader);
                }
            } else if (v11 == 2 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("icon", "icon", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(anchorPoint, "null cannot be cast to non-null type ru.ozon.app.android.geo.mapPreview.data.AnchorPoint");
            if (coordinates == null) {
                throw c.j("coordinates", "coordinates", reader);
            }
            if (str != null) {
                return new Pin(anchorPoint, coordinates, str);
            }
            throw c.j("icon", "icon", reader);
        }
        Constructor<Pin> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Pin.class.getDeclaredConstructor(AnchorPoint.class, Coordinates.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (coordinates == null) {
            throw c.j("coordinates", "coordinates", reader);
        }
        if (str == null) {
            throw c.j("icon", "icon", reader);
        }
        Pin newInstance = constructor.newInstance(anchorPoint, coordinates, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Pin value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("anchorPoint");
        this.anchorPointAdapter.mo44toJson(writer, (x) value.getAnchorPoint());
        writer.w("coordinates");
        this.coordinatesAdapter.mo44toJson(writer, (x) value.getCoordinates());
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.p();
    }
}
