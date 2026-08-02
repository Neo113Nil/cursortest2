package ru.ozon.app.android.csma.orderTracking.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/csma/orderTracking/data/OrderTrackingV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "nullablePaddingDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;", "nullableSideButtonDTOAdapter", "", "Lru/ozon/app/android/csma/orderTracking/data/TileDTO;", "listOfTileDTOAtJsonCollectionDecodingAdapter", "stringAdapter", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTrackingV4DTOJsonAdapter extends JsonAdapter<OrderTrackingV4DTO> {

    @NotNull
    private final JsonAdapter<List<TileDTO>> listOfTileDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<PaddingDTO> nullablePaddingDTOAdapter;

    @NotNull
    private final JsonAdapter<SideButtonDTO> nullableSideButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OrderTrackingV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("padding", "backgroundColor", "sideButton", "rightSideButton", "list", "actionName");
        M m11 = M.f71699a;
        this.nullablePaddingDTOAdapter = moshi.f(PaddingDTO.class, m11, "padding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableSideButtonDTOAdapter = moshi.f(SideButtonDTO.class, m11, "sideButton");
        this.listOfTileDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, TileDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.csma.orderTracking.data.OrderTrackingV4DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "list");
        this.stringAdapter = moshi.f(String.class, m11, "actionName");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(OrderTrackingV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderTrackingV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PaddingDTO paddingDTO = null;
        String str = null;
        SideButtonDTO sideButtonDTO = null;
        SideButtonDTO sideButtonDTO2 = null;
        List<TileDTO> list = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    paddingDTO = this.nullablePaddingDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    sideButtonDTO = this.nullableSideButtonDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    sideButtonDTO2 = this.nullableSideButtonDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.listOfTileDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("list", "list", reader);
                    }
                    break;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("actionName", "actionName", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("list", "list", reader);
        }
        if (str2 != null) {
            return new OrderTrackingV4DTO(paddingDTO, str, sideButtonDTO, sideButtonDTO2, list, str2);
        }
        throw c.j("actionName", "actionName", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderTrackingV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("padding");
        this.nullablePaddingDTOAdapter.mo44toJson(writer, (x) value.getPadding());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("sideButton");
        this.nullableSideButtonDTOAdapter.mo44toJson(writer, (x) value.getSideButton());
        writer.w("rightSideButton");
        this.nullableSideButtonDTOAdapter.mo44toJson(writer, (x) value.getRightSideButton());
        writer.w("list");
        this.listOfTileDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getList());
        writer.w("actionName");
        this.stringAdapter.mo44toJson(writer, (x) value.getActionName());
        writer.p();
    }
}
