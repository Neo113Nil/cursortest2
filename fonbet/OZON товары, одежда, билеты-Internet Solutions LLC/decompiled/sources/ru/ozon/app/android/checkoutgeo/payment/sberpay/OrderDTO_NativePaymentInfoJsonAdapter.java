package ru.ozon.app.android.checkoutgeo.payment.sberpay;

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
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO_NativePaymentInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDTO_NativePaymentInfoJsonAdapter extends JsonAdapter<OrderDTO.NativePaymentInfo> {

    @NotNull
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OrderDTO_NativePaymentInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("orderNumber", "fullOrderSum", "orderSum", "paymentToken", "provider", "merchant", "gateway");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "orderNumber");
        this.bigDecimalAdapter = moshi.f(BigDecimal.class, m11, "fullOrderSum");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(OrderDTO.NativePaymentInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderDTO.NativePaymentInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.hasNext()) {
            String str6 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("orderNumber", "orderNumber", reader);
                    }
                    continue;
                case 1:
                    bigDecimal = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimal == null) {
                        throw c.q("fullOrderSum", "fullOrderSum", reader);
                    }
                    break;
                case 2:
                    bigDecimal2 = this.bigDecimalAdapter.fromJson(reader);
                    if (bigDecimal2 == null) {
                        throw c.q("orderSum", "orderSum", reader);
                    }
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("paymentToken", "paymentToken", reader);
                    }
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("provider", "provider", reader);
                    }
                    break;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("merchant", "merchant", reader);
                    }
                    break;
                case 6:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("gateway", "gateway", reader);
                    }
                    break;
            }
            str = str6;
        }
        String str7 = str;
        reader.endObject();
        if (str7 == null) {
            throw c.j("orderNumber", "orderNumber", reader);
        }
        if (bigDecimal == null) {
            throw c.j("fullOrderSum", "fullOrderSum", reader);
        }
        if (bigDecimal2 == null) {
            throw c.j("orderSum", "orderSum", reader);
        }
        if (str2 == null) {
            throw c.j("paymentToken", "paymentToken", reader);
        }
        if (str3 == null) {
            throw c.j("provider", "provider", reader);
        }
        if (str4 == null) {
            throw c.j("merchant", "merchant", reader);
        }
        if (str5 != null) {
            return new OrderDTO.NativePaymentInfo(str7, bigDecimal, bigDecimal2, str2, str3, str4, str5);
        }
        throw c.j("gateway", "gateway", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderDTO.NativePaymentInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("orderNumber");
        this.stringAdapter.mo44toJson(writer, (x) value.getOrderNumber());
        writer.w("fullOrderSum");
        this.bigDecimalAdapter.mo44toJson(writer, (x) value.getFullOrderSum());
        writer.w("orderSum");
        this.bigDecimalAdapter.mo44toJson(writer, (x) value.getOrderSum());
        writer.w("paymentToken");
        this.stringAdapter.mo44toJson(writer, (x) value.getPaymentToken());
        writer.w("provider");
        this.stringAdapter.mo44toJson(writer, (x) value.getProvider());
        writer.w("merchant");
        this.stringAdapter.mo44toJson(writer, (x) value.getMerchant());
        writer.w("gateway");
        this.stringAdapter.mo44toJson(writer, (x) value.getGateway());
        writer.p();
    }
}
