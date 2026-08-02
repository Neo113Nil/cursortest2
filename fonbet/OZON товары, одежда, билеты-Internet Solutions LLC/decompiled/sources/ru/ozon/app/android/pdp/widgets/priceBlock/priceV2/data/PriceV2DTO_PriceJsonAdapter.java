package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data;

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
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO_PriceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;", "priceComponentAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullablePriceComponentAdapter", "nullableStringAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2DTO_PriceJsonAdapter extends JsonAdapter<PriceV2DTO.Price> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PriceV2DTO.PriceComponent> nullablePriceComponentAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceV2DTO.PriceComponent> priceComponentAdapter;

    public PriceV2DTO_PriceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", "priceDescription", "originalPrice", "strikethroughColor");
        M m11 = M.f71699a;
        this.priceComponentAdapter = moshi.f(PriceV2DTO.PriceComponent.class, m11, "price");
        this.nullablePriceComponentAdapter = moshi.f(PriceV2DTO.PriceComponent.class, m11, "priceDescription");
        this.nullableStringAdapter = moshi.f(String.class, m11, "strikethroughColor");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(PriceV2DTO.Price)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceV2DTO.Price fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PriceV2DTO.PriceComponent priceComponent = null;
        PriceV2DTO.PriceComponent priceComponent2 = null;
        PriceV2DTO.PriceComponent priceComponent3 = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                priceComponent = this.priceComponentAdapter.fromJson(reader);
                if (priceComponent == null) {
                    throw c.q("price", "price", reader);
                }
            } else if (v11 == 1) {
                priceComponent2 = this.nullablePriceComponentAdapter.fromJson(reader);
            } else if (v11 == 2) {
                priceComponent3 = this.nullablePriceComponentAdapter.fromJson(reader);
            } else if (v11 == 3) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (priceComponent != null) {
            return new PriceV2DTO.Price(priceComponent, priceComponent2, priceComponent3, str);
        }
        throw c.j("price", "price", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceV2DTO.Price value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceComponentAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceDescription");
        this.nullablePriceComponentAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("originalPrice");
        this.nullablePriceComponentAdapter.mo44toJson(writer, (x) value.getOriginalPrice());
        writer.w("strikethroughColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStrikethroughColor());
        writer.p();
    }
}
