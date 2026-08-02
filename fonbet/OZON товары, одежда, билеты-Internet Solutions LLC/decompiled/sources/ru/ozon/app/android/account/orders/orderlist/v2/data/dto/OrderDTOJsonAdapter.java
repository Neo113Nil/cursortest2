package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

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
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.OrderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$Header;", "headerAdapter", "", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "nullableListOfSectionDTOAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;", "nullableProgressiveDiscountAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDTOJsonAdapter extends JsonAdapter<OrderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<OrderDTO.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<List<SectionDTO>> nullableListOfSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<OrderDTO.ProgressiveDiscount> nullableProgressiveDiscountAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OrderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("deeplink", CommentV3DTO.HEADER_FIELD_NAME, "sections", "progressiveDiscount");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "deeplink");
        this.headerAdapter = moshi.f(OrderDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfSectionDTOAdapter = moshi.f(D.e(List.class, SectionDTO.class), m11, "sections");
        this.nullableProgressiveDiscountAdapter = moshi.f(OrderDTO.ProgressiveDiscount.class, m11, "progressiveDiscount");
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(OrderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        OrderDTO.Header header = null;
        List<SectionDTO> list = null;
        OrderDTO.ProgressiveDiscount progressiveDiscount = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("deeplink", "deeplink", reader);
                }
            } else if (v11 == 1) {
                header = this.headerAdapter.fromJson(reader);
                if (header == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfSectionDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                progressiveDiscount = this.nullableProgressiveDiscountAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("deeplink", "deeplink", reader);
        }
        if (header != null) {
            return new OrderDTO(str, header, list, progressiveDiscount);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("sections");
        this.nullableListOfSectionDTOAdapter.mo44toJson(writer, (x) value.getSections());
        writer.w("progressiveDiscount");
        this.nullableProgressiveDiscountAdapter.mo44toJson(writer, (x) value.getProgressiveDiscount());
        writer.p();
    }
}
