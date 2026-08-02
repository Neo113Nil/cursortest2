package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data.CheckoutTotalDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO_SummaryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Header;", "headerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "priceSectionAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableListOfCellDTOAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;", "nullableSpacersAdapter", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalDTO_SummaryJsonAdapter extends JsonAdapter<CheckoutTotalDTO.Summary> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CheckoutTotalDTO.Summary.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> nullableListOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<CheckoutTotalDTO.Summary.Spacers> nullableSpacersAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CheckoutTotalDTO.Summary.PriceSection> priceSectionAdapter;

    public CheckoutTotalDTO_SummaryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "priceSection", "infos", "spacers");
        M m11 = M.f71699a;
        this.headerAdapter = moshi.f(CheckoutTotalDTO.Summary.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.priceSectionAdapter = moshi.f(CheckoutTotalDTO.Summary.PriceSection.class, m11, "priceSection");
        this.nullableListOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "infos");
        this.nullableSpacersAdapter = moshi.f(CheckoutTotalDTO.Summary.Spacers.class, m11, "spacers");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CheckoutTotalDTO.Summary)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CheckoutTotalDTO.Summary fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CheckoutTotalDTO.Summary.Header header = null;
        CheckoutTotalDTO.Summary.PriceSection priceSection = null;
        List<CellDTO> list = null;
        CheckoutTotalDTO.Summary.Spacers spacers = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                header = this.headerAdapter.fromJson(reader);
                if (header == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                priceSection = this.priceSectionAdapter.fromJson(reader);
                if (priceSection == null) {
                    throw c.q("priceSection", "priceSection", reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfCellDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                spacers = this.nullableSpacersAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (header == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (priceSection != null) {
            return new CheckoutTotalDTO.Summary(header, priceSection, list, spacers);
        }
        throw c.j("priceSection", "priceSection", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CheckoutTotalDTO.Summary value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("priceSection");
        this.priceSectionAdapter.mo44toJson(writer, (x) value.getPriceSection());
        writer.w("infos");
        this.nullableListOfCellDTOAdapter.mo44toJson(writer, (x) value.getInfos());
        writer.w("spacers");
        this.nullableSpacersAdapter.mo44toJson(writer, (x) value.getSpacers());
        writer.p();
    }
}
