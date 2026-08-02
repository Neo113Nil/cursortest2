package ru.ozon.app.android.account.orders.orderlist.v2.data.dto;

import Ak.b;
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
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.SectionDTO;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableListOfSmallButtonAdapter", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "nullablePaymentInfoAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;", "nullableStatusProviderAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Product;", "nullableListOfProductAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;", "nullableStatusAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;", "nullableTimerAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionDTOJsonAdapter extends JsonAdapter<SectionDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SectionDTO.Product>> nullableListOfProductAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.SmallButton>> nullableListOfSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<SectionDTO.PaymentInfo> nullablePaymentInfoAdapter;

    @NotNull
    private final JsonAdapter<SectionDTO.Status> nullableStatusAdapter;

    @NotNull
    private final JsonAdapter<SectionDTO.StatusProvider> nullableStatusProviderAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<SectionDTO.Timer> nullableTimerAdapter;

    @NotNull
    private final n.a options;

    public SectionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "buttons", "description", "paymentInfo", "statusProvider", "products", "status", DynamicElementDTO.TIMER, "deliveryInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableListOfSmallButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.SmallButton.class), m11, "buttons");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "description");
        this.nullablePaymentInfoAdapter = moshi.f(SectionDTO.PaymentInfo.class, m11, "paymentInfo");
        this.nullableStatusProviderAdapter = moshi.f(SectionDTO.StatusProvider.class, m11, "statusProvider");
        this.nullableListOfProductAdapter = moshi.f(D.e(List.class, SectionDTO.Product.class), m11, "products");
        this.nullableStatusAdapter = moshi.f(SectionDTO.Status.class, m11, "status");
        this.nullableTimerAdapter = moshi.f(SectionDTO.Timer.class, m11, DynamicElementDTO.TIMER);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "deliveryInfo");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(SectionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SectionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        List<ButtonV3Atom.SmallButton> list = null;
        List<AtomDTO> list2 = null;
        SectionDTO.PaymentInfo paymentInfo = null;
        SectionDTO.StatusProvider statusProvider = null;
        List<SectionDTO.Product> list3 = null;
        SectionDTO.Status status = null;
        SectionDTO.Timer timer = null;
        TextDTO textDTO = null;
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
                    list = this.nullableListOfSmallButtonAdapter.fromJson(reader);
                    break;
                case 2:
                    list2 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    paymentInfo = this.nullablePaymentInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    statusProvider = this.nullableStatusProviderAdapter.fromJson(reader);
                    break;
                case 5:
                    list3 = this.nullableListOfProductAdapter.fromJson(reader);
                    break;
                case 6:
                    status = this.nullableStatusAdapter.fromJson(reader);
                    break;
                case 7:
                    timer = this.nullableTimerAdapter.fromJson(reader);
                    break;
                case 8:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new SectionDTO(str, list, list2, paymentInfo, statusProvider, list3, status, timer, textDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SectionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("buttons");
        this.nullableListOfSmallButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("description");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("paymentInfo");
        this.nullablePaymentInfoAdapter.mo44toJson(writer, (x) value.getPaymentInfo());
        writer.w("statusProvider");
        this.nullableStatusProviderAdapter.mo44toJson(writer, (x) value.getStatusProvider());
        writer.w("products");
        this.nullableListOfProductAdapter.mo44toJson(writer, (x) value.getProducts());
        writer.w("status");
        this.nullableStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("deliveryInfo");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDeliveryInfo());
        writer.p();
    }
}
