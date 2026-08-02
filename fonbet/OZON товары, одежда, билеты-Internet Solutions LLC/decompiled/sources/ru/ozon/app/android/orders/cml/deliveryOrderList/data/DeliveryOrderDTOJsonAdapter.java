package ru.ozon.app.android.orders.cml.deliveryOrderList.data;

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
import ru.ozon.app.android.orders.cml.deliveryInfo.data.DeliveryInfoDTO;
import ru.ozon.app.android.orders.cml.groupButtons.data.GroupButtonsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orders/cml/deliveryOrderList/data/DeliveryOrderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "statusDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/CitiesDTO;", "nullableCitiesDTOAdapter", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "nullableInputDTOAdapter", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "deliveryInfoDTOAdapter", "Lru/ozon/app/android/orders/cml/groupButtons/data/GroupButtonsDTO;", "nullableGroupButtonsDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderDTOJsonAdapter extends JsonAdapter<DeliveryOrderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DeliveryInfoDTO> deliveryInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<CitiesDTO> nullableCitiesDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<GroupButtonsDTO> nullableGroupButtonsDTOAdapter;

    @NotNull
    private final JsonAdapter<InputDTO> nullableInputDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<StatusDTO> statusDTOAdapter;

    public DeliveryOrderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("status", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "cities", "input", "cellList", "buttons", "common");
        M m11 = M.f71699a;
        this.statusDTOAdapter = moshi.f(StatusDTO.class, m11, "status");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableCitiesDTOAdapter = moshi.f(CitiesDTO.class, m11, "cities");
        this.nullableInputDTOAdapter = moshi.f(InputDTO.class, m11, "input");
        this.deliveryInfoDTOAdapter = moshi.f(DeliveryInfoDTO.class, m11, "cellList");
        this.nullableGroupButtonsDTOAdapter = moshi.f(GroupButtonsDTO.class, m11, "buttons");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(DeliveryOrderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryOrderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        StatusDTO statusDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CitiesDTO citiesDTO = null;
        InputDTO inputDTO = null;
        DeliveryInfoDTO deliveryInfoDTO = null;
        GroupButtonsDTO groupButtonsDTO = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    statusDTO = this.statusDTOAdapter.fromJson(reader);
                    if (statusDTO == null) {
                        throw c.q("status", "status", reader);
                    }
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    citiesDTO = this.nullableCitiesDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    inputDTO = this.nullableInputDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    deliveryInfoDTO = this.deliveryInfoDTOAdapter.fromJson(reader);
                    if (deliveryInfoDTO == null) {
                        throw c.q("cellList", "cellList", reader);
                    }
                    break;
                case 6:
                    groupButtonsDTO = this.nullableGroupButtonsDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (statusDTO == null) {
            throw c.j("status", "status", reader);
        }
        if (deliveryInfoDTO != null) {
            return new DeliveryOrderDTO(statusDTO, textDTO, textDTO2, citiesDTO, inputDTO, deliveryInfoDTO, groupButtonsDTO, commonControlSettings);
        }
        throw c.j("cellList", "cellList", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryOrderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.statusDTOAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("cities");
        this.nullableCitiesDTOAdapter.mo44toJson(writer, (x) value.getCities());
        writer.w("input");
        this.nullableInputDTOAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("cellList");
        this.deliveryInfoDTOAdapter.mo44toJson(writer, (x) value.getCellList());
        writer.w("buttons");
        this.nullableGroupButtonsDTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
