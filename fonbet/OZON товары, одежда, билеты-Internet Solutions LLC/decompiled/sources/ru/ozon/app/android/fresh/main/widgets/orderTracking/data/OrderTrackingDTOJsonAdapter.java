package ru.ozon.app.android.fresh.main.widgets.orderTracking.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR&\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO$Item;", "nullableListOfItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "mapOfStringTokenizedTrackingInfoAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderTrackingDTOJsonAdapter extends JsonAdapter<OrderTrackingDTO> {

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> mapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<List<OrderTrackingDTO.Item>> nullableListOfItemAdapter;

    @NotNull
    private final n.a options;

    public OrderTrackingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("items", "widgetUpdatePeriod", "trackingInfo");
        b e11 = D.e(List.class, OrderTrackingDTO.Item.class);
        M m11 = M.f71699a;
        this.nullableListOfItemAdapter = moshi.f(e11, m11, "items");
        this.longAdapter = moshi.f(Long.TYPE, m11, "widgetUpdatePeriod");
        this.mapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(OrderTrackingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderTrackingDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<OrderTrackingDTO.Item> list = null;
        Long l11 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfItemAdapter.fromJson(reader);
            } else if (v11 == 1) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
                }
            } else if (v11 == 2 && (map = this.mapOfStringTokenizedTrackingInfoAdapter.fromJson(reader)) == null) {
                throw c.q("trackingInfo", "trackingInfo", reader);
            }
        }
        reader.endObject();
        if (l11 == null) {
            throw c.j("widgetUpdatePeriod", "widgetUpdatePeriod", reader);
        }
        long longValue = l11.longValue();
        if (map != null) {
            return new OrderTrackingDTO(list, longValue, map);
        }
        throw c.j("trackingInfo", "trackingInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderTrackingDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.nullableListOfItemAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("widgetUpdatePeriod");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getWidgetUpdatePeriod()));
        writer.w("trackingInfo");
        this.mapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
