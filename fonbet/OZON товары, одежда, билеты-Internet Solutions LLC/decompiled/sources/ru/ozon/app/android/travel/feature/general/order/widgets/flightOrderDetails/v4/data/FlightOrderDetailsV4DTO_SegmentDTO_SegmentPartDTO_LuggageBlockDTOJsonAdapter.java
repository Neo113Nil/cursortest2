package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data;

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
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data.FlightOrderDetailsV4DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTO_LuggageBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;", "luggageItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableLuggageItemDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTO_LuggageBlockDTOJsonAdapter extends JsonAdapter<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO> luggageItemDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO> nullableLuggageItemDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FlightOrderDetailsV4DTO_SegmentDTO_SegmentPartDTO_LuggageBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("handCarry", "luggage", "extraLuggage", "button", SelectionItemFormDTO.TITLE_FIELD_NAME);
        M m11 = M.f71699a;
        this.luggageItemDTOAdapter = moshi.f(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO.class, m11, "handCarry");
        this.nullableLuggageItemDTOAdapter = moshi.f(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO.class, m11, "extraLuggage");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "button");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return b.c(87, "GeneratedJsonAdapter(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO luggageItemDTO = null;
        FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO luggageItemDTO2 = null;
        FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO luggageItemDTO3 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                luggageItemDTO = this.luggageItemDTOAdapter.fromJson(reader);
                if (luggageItemDTO == null) {
                    throw c.q("handCarry", "handCarry", reader);
                }
            } else if (v11 == 1) {
                luggageItemDTO2 = this.luggageItemDTOAdapter.fromJson(reader);
                if (luggageItemDTO2 == null) {
                    throw c.q("luggage", "luggage", reader);
                }
            } else if (v11 == 2) {
                luggageItemDTO3 = this.nullableLuggageItemDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO == null) {
                    throw c.q("button", "button", reader);
                }
            } else if (v11 == 4 && (textDTO = this.textDTOAdapter.fromJson(reader)) == null) {
                throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
        }
        reader.endObject();
        if (luggageItemDTO == null) {
            throw c.j("handCarry", "handCarry", reader);
        }
        if (luggageItemDTO2 == null) {
            throw c.j("luggage", "luggage", reader);
        }
        if (iconButtonV3DTO == null) {
            throw c.j("button", "button", reader);
        }
        if (textDTO != null) {
            return new FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO(luggageItemDTO, luggageItemDTO2, luggageItemDTO3, iconButtonV3DTO, textDTO);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("handCarry");
        this.luggageItemDTOAdapter.mo44toJson(writer, (x) value.getHandCarry());
        writer.w("luggage");
        this.luggageItemDTOAdapter.mo44toJson(writer, (x) value.getLuggage());
        writer.w("extraLuggage");
        this.nullableLuggageItemDTOAdapter.mo44toJson(writer, (x) value.getExtraLuggage());
        writer.w("button");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.p();
    }
}
