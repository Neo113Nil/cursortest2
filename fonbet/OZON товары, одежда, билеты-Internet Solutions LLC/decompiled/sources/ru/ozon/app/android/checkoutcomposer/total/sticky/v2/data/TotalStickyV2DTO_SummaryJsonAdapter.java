package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data;

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
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2DTO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO_SummaryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO$Summary;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "nullablePriceAdapter", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "nullablePartnerBanksDTOAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalStickyV2DTO_SummaryJsonAdapter extends JsonAdapter<TotalStickyV2DTO.Summary> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PartnerBanksDTO> nullablePartnerBanksDTOAdapter;

    @NotNull
    private final JsonAdapter<Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    public TotalStickyV2DTO_SummaryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", "infoText", "secondPrice", "partnerBanksMolecule");
        M m11 = M.f71699a;
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "infoText");
        this.nullablePriceAdapter = moshi.f(Price.class, m11, "secondPrice");
        this.nullablePartnerBanksDTOAdapter = moshi.f(PartnerBanksDTO.class, m11, "partnerBanksMolecule");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(TotalStickyV2DTO.Summary)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalStickyV2DTO.Summary fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Price price = null;
        TextAtom textAtom = null;
        Price price2 = null;
        PartnerBanksDTO partnerBanksDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                price = this.priceAdapter.fromJson(reader);
                if (price == null) {
                    throw c.q("price", "price", reader);
                }
            } else if (v11 == 1) {
                textAtom = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 2) {
                price2 = this.nullablePriceAdapter.fromJson(reader);
            } else if (v11 == 3) {
                partnerBanksDTO = this.nullablePartnerBanksDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (price != null) {
            return new TotalStickyV2DTO.Summary(price, textAtom, price2, partnerBanksDTO);
        }
        throw c.j("price", "price", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalStickyV2DTO.Summary value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("infoText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getInfoText());
        writer.w("secondPrice");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getSecondPrice());
        writer.w("partnerBanksMolecule");
        this.nullablePartnerBanksDTOAdapter.mo44toJson(writer, (x) value.getPartnerBanksMolecule());
        writer.p();
    }
}
