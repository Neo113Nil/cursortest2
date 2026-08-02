package ru.ozon.app.android.delivery.customActionsHandlers.getDirections;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.customActionsHandlers.getDirections.GetDirectionsActionHandler;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/getDirections/GetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/delivery/customActionsHandlers/getDirections/GetDirectionsActionHandler$GetDirectionsInfoActionParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/delivery/customActionsHandlers/getDirections/GetDirectionsActionHandler$GetDirectionsInfoActionParams;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/delivery/customActionsHandlers/getDirections/GetDirectionsActionHandler$GetDirectionsInfoActionParams;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter extends JsonAdapter<GetDirectionsActionHandler.GetDirectionsInfoActionParams> {

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public GetDirectionsActionHandler_GetDirectionsInfoActionParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("latitude", "longitude", SelectionItemFormDTO.TITLE_FIELD_NAME);
        M m11 = M.f71699a;
        this.doubleAdapter = moshi.f(Double.TYPE, m11, "latitude");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(78, "GeneratedJsonAdapter(GetDirectionsActionHandler.GetDirectionsInfoActionParams)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GetDirectionsActionHandler.GetDirectionsInfoActionParams fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        Double d12 = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("latitude", "latitude", reader);
                }
            } else if (v11 == 1) {
                d12 = this.doubleAdapter.fromJson(reader);
                if (d12 == null) {
                    throw c.q("longitude", "longitude", reader);
                }
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (d11 == null) {
            throw c.j("latitude", "latitude", reader);
        }
        double doubleValue = d11.doubleValue();
        if (d12 != null) {
            return new GetDirectionsActionHandler.GetDirectionsInfoActionParams(doubleValue, d12.doubleValue(), str);
        }
        throw c.j("longitude", "longitude", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GetDirectionsActionHandler.GetDirectionsInfoActionParams value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("latitude");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getLatitude()));
        writer.w("longitude");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getLongitude()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.p();
    }
}
