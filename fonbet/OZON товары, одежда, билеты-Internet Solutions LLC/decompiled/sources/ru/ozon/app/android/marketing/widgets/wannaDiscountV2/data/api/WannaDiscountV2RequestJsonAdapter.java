package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api;

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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableLongAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "stringAdapter", "", "booleanAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2RequestJsonAdapter extends JsonAdapter<WannaDiscountV2Request> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public WannaDiscountV2RequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", "userPrice", "pressedDiscount", "doesAddSellerNotification", "userQuantityMin", "userQuantityMax");
        M m11 = M.f71699a;
        this.nullableLongAdapter = moshi.f(Long.class, m11, "sku");
        this.nullableDoubleAdapter = moshi.f(Double.class, m11, "userPrice");
        this.stringAdapter = moshi.f(String.class, m11, "pressedDiscount");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "doesAddSellerNotification");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(WannaDiscountV2Request)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WannaDiscountV2Request fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Long l11 = null;
        Double d11 = null;
        String str = null;
        Long l12 = null;
        Long l13 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 1:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("pressedDiscount", "pressedDiscount", reader);
                    }
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("doesAddSellerNotification", "doesAddSellerNotification", reader);
                    }
                    break;
                case 4:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 5:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("pressedDiscount", "pressedDiscount", reader);
        }
        if (bool != null) {
            return new WannaDiscountV2Request(l11, d11, str, bool.booleanValue(), l12, l13);
        }
        throw c.j("doesAddSellerNotification", "doesAddSellerNotification", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WannaDiscountV2Request value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("userPrice");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value.getUserPrice());
        writer.w("pressedDiscount");
        this.stringAdapter.mo44toJson(writer, (x) value.getPressedDiscount());
        writer.w("doesAddSellerNotification");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getDoesAddSellerNotification()));
        writer.w("userQuantityMin");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getUserQuantityMin());
        writer.w("userQuantityMax");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getUserQuantityMax());
        writer.p();
    }
}
