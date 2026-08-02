package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

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
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO_PriceInputBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$InputBlock;", "inputBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock$PriceError;", "priceErrorAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2DTO_PriceInputBlockJsonAdapter extends JsonAdapter<WannaDiscountV2DTO.PriceInputBlock> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.InputBlock> inputBlockAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<WannaDiscountV2DTO.PriceInputBlock.PriceError> priceErrorAdapter;

    public WannaDiscountV2DTO_PriceInputBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("input", "minPrice", "error");
        M m11 = M.f71699a;
        this.inputBlockAdapter = moshi.f(WannaDiscountV2DTO.InputBlock.class, m11, "input");
        this.doubleAdapter = moshi.f(Double.TYPE, m11, "minPrice");
        this.priceErrorAdapter = moshi.f(WannaDiscountV2DTO.PriceInputBlock.PriceError.class, m11, "error");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(WannaDiscountV2DTO.PriceInputBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public WannaDiscountV2DTO.PriceInputBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        WannaDiscountV2DTO.InputBlock inputBlock = null;
        Double d11 = null;
        WannaDiscountV2DTO.PriceInputBlock.PriceError priceError = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                inputBlock = this.inputBlockAdapter.fromJson(reader);
                if (inputBlock == null) {
                    throw c.q("input", "input", reader);
                }
            } else if (v11 == 1) {
                d11 = this.doubleAdapter.fromJson(reader);
                if (d11 == null) {
                    throw c.q("minPrice", "minPrice", reader);
                }
            } else if (v11 == 2 && (priceError = this.priceErrorAdapter.fromJson(reader)) == null) {
                throw c.q("error", "error", reader);
            }
        }
        reader.endObject();
        if (inputBlock == null) {
            throw c.j("input", "input", reader);
        }
        if (d11 == null) {
            throw c.j("minPrice", "minPrice", reader);
        }
        double doubleValue = d11.doubleValue();
        if (priceError != null) {
            return new WannaDiscountV2DTO.PriceInputBlock(inputBlock, doubleValue, priceError);
        }
        throw c.j("error", "error", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, WannaDiscountV2DTO.PriceInputBlock value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("input");
        this.inputBlockAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("minPrice");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value.getMinPrice()));
        writer.w("error");
        this.priceErrorAdapter.mo44toJson(writer, (x) value.getError());
        writer.p();
    }
}
