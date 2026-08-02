package ru.ozon.app.android.autopicker.view.productpickersearch.data;

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
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1BodyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "mapOfStringStringAdapter", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerV1BodyJsonAdapter extends JsonAdapter<ProductPickerV1Body> {

    @NotNull
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ProductPickerV1BodyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "params");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.mapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "params");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(ProductPickerV1Body)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductPickerV1Body fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, String> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("currentStep", "currentStep", reader);
                }
            } else if (v11 == 2 && (map = this.mapOfStringStringAdapter.fromJson(reader)) == null) {
                throw c.q("params", "params", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
        }
        if (str2 == null) {
            throw c.j("currentStep", "currentStep", reader);
        }
        if (map != null) {
            return new ProductPickerV1Body(str, str2, map);
        }
        throw c.j("params", "params", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductPickerV1Body value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getActionType());
        writer.w("currentStep");
        this.stringAdapter.mo44toJson(writer, (x) value.getCurrentStep());
        writer.w("params");
        this.mapOfStringStringAdapter.mo44toJson(writer, (x) value.getParams());
        writer.p();
    }
}
