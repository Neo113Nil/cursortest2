package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data;

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
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO_MultipleCarriageTrainFresh_PremiumPointsItem_SignItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "nullableStringAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPremiumPointsTrainDTO_MultipleCarriageTrainFresh_PremiumPointsItem_SignItemJsonAdapter extends JsonAdapter<FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FreshPremiumPointsTrainDTO_MultipleCarriageTrainFresh_PremiumPointsItem_SignItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("signIcon", "signSize", "signIconTint");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "signIcon");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "signSize");
        this.nullableStringAdapter = moshi.f(String.class, m11, "signIconTint");
    }

    @NotNull
    public String toString() {
        return b.c(102, "GeneratedJsonAdapter(FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Integer num = null;
        String str2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("signIcon", "signIcon", reader);
                }
            } else if (v11 == 1) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem(str, num, str2);
        }
        throw c.j("signIcon", "signIcon", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("signIcon");
        this.stringAdapter.mo44toJson(writer, (x) value.getSignIcon());
        writer.w("signSize");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSignSize());
        writer.w("signIconTint");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSignIconTint());
        writer.p();
    }
}
