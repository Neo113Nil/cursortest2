package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.SectionDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO_PaymentInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionDTO_PaymentInfoJsonAdapter extends JsonAdapter<SectionDTO.PaymentInfo> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SectionDTO_PaymentInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("link", "orderNumber", "payerEmail", "payerFirstName", "payerLastName", "paymentTypeId", "totalPrice", "useNewPaymentForm", "cardToken");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "link");
        this.longAdapter = moshi.f(Long.TYPE, m11, "paymentTypeId");
        this.bigDecimalAdapter = moshi.f(BigDecimal.class, m11, "totalPrice");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "useNewPaymentForm");
        this.nullableStringAdapter = moshi.f(String.class, m11, "cardToken");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(SectionDTO.PaymentInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SectionDTO.PaymentInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        BigDecimal bigDecimal = null;
        Boolean bool = null;
        String str6 = null;
        while (true) {
            Long l12 = l11;
            String str7 = str;
            if (!reader.hasNext()) {
                String str8 = str2;
                reader.endObject();
                if (str7 == null) {
                    throw c.j("link", "link", reader);
                }
                if (str8 == null) {
                    throw c.j("orderNumber", "orderNumber", reader);
                }
                if (str3 == null) {
                    throw c.j("payerEmail", "payerEmail", reader);
                }
                if (str4 == null) {
                    throw c.j("payerFirstName", "payerFirstName", reader);
                }
                if (str5 == null) {
                    throw c.j("payerLastName", "payerLastName", reader);
                }
                if (l12 == null) {
                    throw c.j("paymentTypeId", "paymentTypeId", reader);
                }
                long longValue = l12.longValue();
                if (bigDecimal != null) {
                    return new SectionDTO.PaymentInfo(str7, str8, str3, str4, str5, longValue, bigDecimal, bool, str6);
                }
                throw c.j("totalPrice", "totalPrice", reader);
            }
            String str9 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("link", "link", reader);
                    }
                    l11 = l12;
                    str2 = str9;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("orderNumber", "orderNumber", reader);
                    }
                    l11 = l12;
                    str = str7;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("payerEmail", "payerEmail", reader);
                    }
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("payerFirstName", "payerFirstName", reader);
                    }
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("payerLastName", "payerLastName", reader);
                    }
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 5:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("paymentTypeId", "paymentTypeId", reader);
                    }
                    str2 = str9;
                    str = str7;
                case 6:
                    bigDecimal = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimal == null) {
                        throw c.q("totalPrice", "totalPrice", reader);
                    }
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    l11 = l12;
                    str2 = str9;
                    str = str7;
                default:
                    l11 = l12;
                    str2 = str9;
                    str = str7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SectionDTO.PaymentInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("orderNumber");
        this.stringAdapter.mo44toJson(writer, (x) value.getOrderNumber());
        writer.w("payerEmail");
        this.stringAdapter.mo44toJson(writer, (x) value.getPayerEmail());
        writer.w("payerFirstName");
        this.stringAdapter.mo44toJson(writer, (x) value.getPayerFirstName());
        writer.w("payerLastName");
        this.stringAdapter.mo44toJson(writer, (x) value.getPayerLastName());
        writer.w("paymentTypeId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getPaymentTypeId()));
        writer.w("totalPrice");
        this.bigDecimalAdapter.mo44toJson(writer, (x) value.getTotalPrice());
        writer.w("useNewPaymentForm");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getUseNewPaymentForm());
        writer.w("cardToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCardToken());
        writer.p();
    }
}
