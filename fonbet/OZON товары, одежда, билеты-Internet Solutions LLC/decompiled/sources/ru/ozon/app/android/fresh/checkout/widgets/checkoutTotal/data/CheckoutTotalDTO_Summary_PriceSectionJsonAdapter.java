package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data;

import Y9.b;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data.CheckoutTotalDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO_Summary_PriceSectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection$PriceBlock;", "listOfPriceBlockAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalDTO_Summary_PriceSectionJsonAdapter extends JsonAdapter<CheckoutTotalDTO.Summary.PriceSection> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<CheckoutTotalDTO.Summary.PriceSection.PriceBlock>> listOfPriceBlockAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public CheckoutTotalDTO_Summary_PriceSectionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("prices", "backgroundColor", "cornerRadius");
        b e11 = D.e(List.class, CheckoutTotalDTO.Summary.PriceSection.PriceBlock.class);
        M m11 = M.f71699a;
        this.listOfPriceBlockAdapter = moshi.f(e11, m11, "prices");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(59, "GeneratedJsonAdapter(CheckoutTotalDTO.Summary.PriceSection)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CheckoutTotalDTO.Summary.PriceSection fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<CheckoutTotalDTO.Summary.PriceSection.PriceBlock> list = null;
        String str = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfPriceBlockAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("prices", "prices", reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new CheckoutTotalDTO.Summary.PriceSection(list, str, cornerRadius);
        }
        throw c.j("prices", "prices", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CheckoutTotalDTO.Summary.PriceSection value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("prices");
        this.listOfPriceBlockAdapter.mo44toJson(writer, (x) value.getPrices());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
