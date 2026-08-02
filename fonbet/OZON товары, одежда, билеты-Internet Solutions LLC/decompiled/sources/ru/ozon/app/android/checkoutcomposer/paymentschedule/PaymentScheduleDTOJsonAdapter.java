package ru.ozon.app.android.checkoutcomposer.paymentschedule;

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
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$PaymentDTO;", "listOfPaymentDTOAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleDTO$TotalPriceDTO;", "nullableListOfTotalPriceDTOAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleDTOJsonAdapter extends JsonAdapter<PaymentScheduleDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<PaymentScheduleDTO.PaymentDTO>> listOfPaymentDTOAdapter;

    @NotNull
    private final JsonAdapter<List<PaymentScheduleDTO.TotalPriceDTO>> nullableListOfTotalPriceDTOAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public PaymentScheduleDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "payments", "totalAmount", "totalTitle", "totalSubtitle", "totalPrices");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "icon");
        this.listOfPaymentDTOAdapter = moshi.f(D.e(List.class, PaymentScheduleDTO.PaymentDTO.class), m11, "payments");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "totalAmount");
        this.nullableListOfTotalPriceDTOAdapter = moshi.f(D.e(List.class, PaymentScheduleDTO.TotalPriceDTO.class), m11, "totalPrices");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(PaymentScheduleDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PaymentScheduleDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        List<PaymentScheduleDTO.PaymentDTO> list = null;
        OzonSpannableString ozonSpannableString = null;
        String str4 = null;
        String str5 = null;
        List<PaymentScheduleDTO.TotalPriceDTO> list2 = null;
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
                    list = this.listOfPaymentDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("payments", "payments", reader);
                    }
                    break;
                case 4:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    list2 = this.nullableListOfTotalPriceDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new PaymentScheduleDTO(str, str2, str3, list, ozonSpannableString, str4, str5, list2);
        }
        throw c.j("payments", "payments", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PaymentScheduleDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("payments");
        this.listOfPaymentDTOAdapter.mo44toJson(writer, (x) value.getPayments());
        writer.w("totalAmount");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getTotalAmount());
        writer.w("totalTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTotalTitle());
        writer.w("totalSubtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTotalSubtitle());
        writer.w("totalPrices");
        this.nullableListOfTotalPriceDTOAdapter.mo44toJson(writer, (x) value.getTotalPrices());
        writer.p();
    }
}
