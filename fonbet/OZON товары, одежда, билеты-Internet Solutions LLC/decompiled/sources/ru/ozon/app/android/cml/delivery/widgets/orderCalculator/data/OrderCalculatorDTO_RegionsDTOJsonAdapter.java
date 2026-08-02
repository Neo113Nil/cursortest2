package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data;

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
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data.OrderCalculatorDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO_RegionsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$TextFieldDTO;", "textFieldDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderCalculatorDTO_RegionsDTOJsonAdapter extends JsonAdapter<OrderCalculatorDTO.RegionsDTO> {

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OrderCalculatorDTO.TextFieldDTO> textFieldDTOAdapter;

    public OrderCalculatorDTO_RegionsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("source", "destination", "swapButton");
        M m11 = M.f71699a;
        this.textFieldDTOAdapter = moshi.f(OrderCalculatorDTO.TextFieldDTO.class, m11, "source");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "swapButton");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(OrderCalculatorDTO.RegionsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderCalculatorDTO.RegionsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OrderCalculatorDTO.TextFieldDTO textFieldDTO = null;
        OrderCalculatorDTO.TextFieldDTO textFieldDTO2 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textFieldDTO = this.textFieldDTOAdapter.fromJson(reader);
                if (textFieldDTO == null) {
                    throw c.q("source", "source", reader);
                }
            } else if (v11 == 1) {
                textFieldDTO2 = this.textFieldDTOAdapter.fromJson(reader);
                if (textFieldDTO2 == null) {
                    throw c.q("destination", "destination", reader);
                }
            } else if (v11 == 2 && (iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader)) == null) {
                throw c.q("swapButton", "swapButton", reader);
            }
        }
        reader.endObject();
        if (textFieldDTO == null) {
            throw c.j("source", "source", reader);
        }
        if (textFieldDTO2 == null) {
            throw c.j("destination", "destination", reader);
        }
        if (iconButtonV3DTO != null) {
            return new OrderCalculatorDTO.RegionsDTO(textFieldDTO, textFieldDTO2, iconButtonV3DTO);
        }
        throw c.j("swapButton", "swapButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderCalculatorDTO.RegionsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("source");
        this.textFieldDTOAdapter.mo44toJson(writer, (x) value.getSource());
        writer.w("destination");
        this.textFieldDTOAdapter.mo44toJson(writer, (x) value.getDestination());
        writer.w("swapButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSwapButton());
        writer.p();
    }
}
