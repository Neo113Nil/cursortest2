package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data;

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
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryTimeSelectorV2DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;", "nullableListOfDeliveryDateDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableListOfCellDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSelectorV2DTOJsonAdapter extends JsonAdapter<DeliveryTimeSelectorV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> nullableListOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<DeliveryTimeSelectorV2DTO.DeliveryDateDTO>> nullableListOfDeliveryDateDTOAdapter;

    @NotNull
    private final n.a options;

    public DeliveryTimeSelectorV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("deliveryDates", "timeSlots", "button");
        b e11 = D.e(List.class, DeliveryTimeSelectorV2DTO.DeliveryDateDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfDeliveryDateDTOAdapter = moshi.f(e11, m11, "deliveryDates");
        this.nullableListOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "timeSlots");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(47, "GeneratedJsonAdapter(DeliveryTimeSelectorV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryTimeSelectorV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<DeliveryTimeSelectorV2DTO.DeliveryDateDTO> list = null;
        List<CellDTO> list2 = null;
        ButtonV3DTO buttonV3DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfDeliveryDateDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list2 = this.nullableListOfCellDTOAdapter.fromJson(reader);
            } else if (v11 == 2 && (buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader)) == null) {
                throw c.q("button", "button", reader);
            }
        }
        reader.endObject();
        if (buttonV3DTO != null) {
            return new DeliveryTimeSelectorV2DTO(list, list2, buttonV3DTO);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryTimeSelectorV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("deliveryDates");
        this.nullableListOfDeliveryDateDTOAdapter.mo44toJson(writer, (x) value.getDeliveryDates());
        writer.w("timeSlots");
        this.nullableListOfCellDTOAdapter.mo44toJson(writer, (x) value.getTimeSlots());
        writer.w("button");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.p();
    }
}
