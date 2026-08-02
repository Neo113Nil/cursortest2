package ru.ozon.app.android.checkoutcomposer.total.models;

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
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO_SummaryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Header;", "headerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price;", "listOfPriceAdapter", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Footer;", "footerAdapter", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice;", "nullableListOfFooterPriceAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTO_SummaryJsonAdapter extends JsonAdapter<TotalDTO.Summary> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TotalDTO.Summary.Footer> footerAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.Summary.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<List<TotalDTO.Summary.Price>> listOfPriceAdapter;

    @NotNull
    private final JsonAdapter<List<TotalDTO.Summary.FooterPrice>> nullableListOfFooterPriceAdapter;

    @NotNull
    private final n.a options;

    public TotalDTO_SummaryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "prices", CommentV3DTO.FOOTER_FIELD_NAME, "footerPrices");
        M m11 = M.f71699a;
        this.headerAdapter = moshi.f(TotalDTO.Summary.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfPriceAdapter = moshi.f(D.e(List.class, TotalDTO.Summary.Price.class), m11, "prices");
        this.footerAdapter = moshi.f(TotalDTO.Summary.Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableListOfFooterPriceAdapter = moshi.f(D.e(List.class, TotalDTO.Summary.FooterPrice.class), m11, "footerPrices");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(TotalDTO.Summary)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO.Summary fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TotalDTO.Summary.Header header = null;
        List<TotalDTO.Summary.Price> list = null;
        TotalDTO.Summary.Footer footer = null;
        List<TotalDTO.Summary.FooterPrice> list2 = null;
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
                list = this.listOfPriceAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("prices", "prices", reader);
                }
            } else if (v11 == 2) {
                footer = this.footerAdapter.fromJson(reader);
                if (footer == null) {
                    throw c.q(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
                }
            } else if (v11 == 3) {
                list2 = this.nullableListOfFooterPriceAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (header == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (list == null) {
            throw c.j("prices", "prices", reader);
        }
        if (footer != null) {
            return new TotalDTO.Summary(header, list, footer, list2);
        }
        throw c.j(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO.Summary value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("prices");
        this.listOfPriceAdapter.mo44toJson(writer, (x) value.getPrices());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.footerAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("footerPrices");
        this.nullableListOfFooterPriceAdapter.mo44toJson(writer, (x) value.getFooterPrices());
        writer.p();
    }
}
