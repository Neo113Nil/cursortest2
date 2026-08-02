package ru.ozon.app.android.pdp.widgets.galleryV5.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5DTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$GalleryItem;", "listOfGalleryItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Button;", "nullableListOfButtonAdapter", "", "nullableDoubleAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5DTO$Zoom;", "nullableZoomAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5DTOJsonAdapter extends JsonAdapter<GalleryV5DTO> {
    public static final int $stable = 8;
    private volatile Constructor<GalleryV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<GalleryV5DTO.GalleryItem>> listOfGalleryItemAdapter;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<List<GalleryV5DTO.Button>> nullableListOfButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<GalleryV5DTO.Zoom> nullableZoomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GalleryV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("items", "fullViewDeeplink", "galleryId", "buttons", "galleryRatio", "backgroundColor", "trackingInfo", "zoom");
        b e11 = D.e(List.class, GalleryV5DTO.GalleryItem.class);
        M m11 = M.f71699a;
        this.listOfGalleryItemAdapter = moshi.f(e11, m11, "items");
        this.stringAdapter = moshi.f(String.class, m11, "fullViewDeeplink");
        this.nullableListOfButtonAdapter = moshi.f(D.e(List.class, GalleryV5DTO.Button.class), m11, "buttons");
        this.nullableDoubleAdapter = moshi.f(Double.class, m11, "galleryRatio");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableZoomAdapter = moshi.f(GalleryV5DTO.Zoom.class, m11, "zoom");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(GalleryV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GalleryV5DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<GalleryV5DTO.GalleryItem> list = null;
        String str = null;
        String str2 = null;
        List<GalleryV5DTO.Button> list2 = null;
        Double d11 = null;
        String str3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        GalleryV5DTO.Zoom zoom = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfGalleryItemAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("items", "items", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("fullViewDeeplink", "fullViewDeeplink", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("galleryId", "galleryId", reader);
                    }
                    break;
                case 3:
                    list2 = this.nullableListOfButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    i11 = -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    zoom = this.nullableZoomAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            Double d12 = d11;
            List<GalleryV5DTO.Button> list3 = list2;
            String str4 = str2;
            String str5 = str;
            List<GalleryV5DTO.GalleryItem> list4 = list;
            if (list4 == null) {
                throw c.j("items", "items", reader);
            }
            if (str5 == null) {
                throw c.j("fullViewDeeplink", "fullViewDeeplink", reader);
            }
            if (str4 == null) {
                throw c.j("galleryId", "galleryId", reader);
            }
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            return new GalleryV5DTO(list4, str5, str4, list3, d12, str3, map, zoom);
        }
        Double d13 = d11;
        List<GalleryV5DTO.Button> list5 = list2;
        String str6 = str2;
        String str7 = str;
        List<GalleryV5DTO.GalleryItem> list6 = list;
        Constructor<GalleryV5DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GalleryV5DTO.class.getDeclaredConstructor(List.class, String.class, String.class, List.class, Double.class, String.class, Map.class, GalleryV5DTO.Zoom.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list6 == null) {
            throw c.j("items", "items", reader);
        }
        if (str7 == null) {
            throw c.j("fullViewDeeplink", "fullViewDeeplink", reader);
        }
        if (str6 == null) {
            throw c.j("galleryId", "galleryId", reader);
        }
        GalleryV5DTO newInstance = constructor.newInstance(list6, str7, str6, list5, d13, str3, map, zoom, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GalleryV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.listOfGalleryItemAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("fullViewDeeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getFullViewDeeplink());
        writer.w("galleryId");
        this.stringAdapter.mo44toJson(writer, (x) value.getGalleryId());
        writer.w("buttons");
        this.nullableListOfButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("galleryRatio");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value.getGalleryRatio());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("zoom");
        this.nullableZoomAdapter.mo44toJson(writer, (x) value.getZoom());
        writer.p();
    }
}
