package ru.ozon.app.android.orderdetails.orderTotal.data;

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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderTotal/data/PriceBlockDTO;", "nullablePriceBlockDTOAdapter", "Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "headerDTOAdapter", "nullableListOfPriceBlockDTOAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryDTOJsonAdapter extends JsonAdapter<SummaryDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<HeaderDTO> headerDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<PriceBlockDTO>> nullableListOfPriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceBlockDTO> nullablePriceBlockDTOAdapter;

    @NotNull
    private final n.a options;

    public SummaryDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badges", CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.HEADER_FIELD_NAME, "prices");
        b e11 = D.e(List.class, Badge.class);
        M m11 = M.f71699a;
        this.nullableListOfBadgeAdapter = moshi.f(e11, m11, "badges");
        this.nullablePriceBlockDTOAdapter = moshi.f(PriceBlockDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.headerDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfPriceBlockDTOAdapter = moshi.f(D.e(List.class, PriceBlockDTO.class), m11, "prices");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(SummaryDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SummaryDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<Badge> list = null;
        PriceBlockDTO priceBlockDTO = null;
        HeaderDTO headerDTO = null;
        List<PriceBlockDTO> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfBadgeAdapter.fromJson(reader);
            } else if (v11 == 1) {
                priceBlockDTO = this.nullablePriceBlockDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                headerDTO = this.headerDTOAdapter.fromJson(reader);
                if (headerDTO == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 3) {
                list2 = this.nullableListOfPriceBlockDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (headerDTO != null) {
            return new SummaryDTO(list, priceBlockDTO, headerDTO, list2);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SummaryDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullablePriceBlockDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("prices");
        this.nullableListOfPriceBlockDTOAdapter.mo44toJson(writer, (x) value.getPrices());
        writer.p();
    }
}
