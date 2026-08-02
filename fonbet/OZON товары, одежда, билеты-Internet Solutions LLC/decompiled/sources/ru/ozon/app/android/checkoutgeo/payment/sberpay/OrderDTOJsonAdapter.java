package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$Error;", "nullableErrorAdapter", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$NativePaymentInfo;", "nullableNativePaymentInfoAdapter", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$FastPayInfo;", "nullableFastPayInfoAdapter", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDTO$SberPayInfo;", "nullableSberPayInfoAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDTOJsonAdapter extends JsonAdapter<OrderDTO> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<OrderDTO.Error> nullableErrorAdapter;

    @NotNull
    private final JsonAdapter<OrderDTO.FastPayInfo> nullableFastPayInfoAdapter;

    @NotNull
    private final JsonAdapter<OrderDTO.NativePaymentInfo> nullableNativePaymentInfoAdapter;

    @NotNull
    private final JsonAdapter<OrderDTO.SberPayInfo> nullableSberPayInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public OrderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("link", "redirectLink", "cancelLink", "error", "authorizePaymentUrl", "nativePaymentInfo", "fastPayInfo", "sberPayInfo", "authorizeComposerActionName", "action");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "link");
        this.nullableErrorAdapter = moshi.f(OrderDTO.Error.class, m11, "error");
        this.nullableNativePaymentInfoAdapter = moshi.f(OrderDTO.NativePaymentInfo.class, m11, "nativePaymentInfo");
        this.nullableFastPayInfoAdapter = moshi.f(OrderDTO.FastPayInfo.class, m11, "fastPayInfo");
        this.nullableSberPayInfoAdapter = moshi.f(OrderDTO.SberPayInfo.class, m11, "sberPayInfo");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
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
        String str2 = null;
        String str3 = null;
        OrderDTO.Error error = null;
        String str4 = null;
        OrderDTO.NativePaymentInfo nativePaymentInfo = null;
        OrderDTO.FastPayInfo fastPayInfo = null;
        OrderDTO.SberPayInfo sberPayInfo = null;
        String str5 = null;
        AtomActionDTO atomActionDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    error = this.nullableErrorAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    nativePaymentInfo = this.nullableNativePaymentInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    fastPayInfo = this.nullableFastPayInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    sberPayInfo = this.nullableSberPayInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new OrderDTO(str, str2, str3, error, str4, nativePaymentInfo, fastPayInfo, sberPayInfo, str5, atomActionDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("link");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("redirectLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRedirectLink());
        writer.w("cancelLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCancelLink());
        writer.w("error");
        this.nullableErrorAdapter.mo44toJson(writer, (x) value.getError());
        writer.w("authorizePaymentUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAuthorizePaymentUrl());
        writer.w("nativePaymentInfo");
        this.nullableNativePaymentInfoAdapter.mo44toJson(writer, (x) value.getNativePaymentInfo());
        writer.w("fastPayInfo");
        this.nullableFastPayInfoAdapter.mo44toJson(writer, (x) value.getFastPayInfo());
        writer.w("sberPayInfo");
        this.nullableSberPayInfoAdapter.mo44toJson(writer, (x) value.getSberPayInfo());
        writer.w("authorizeComposerActionName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAuthorizeComposerActionName());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.p();
    }
}
