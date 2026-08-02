package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data.TravelTrainSeatInfoV2DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatPriceDTO;", "listOfSeatPriceDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatDiscountDTO;", "nullableSeatDiscountDTOAdapter", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainSeatInfoV2DTOJsonAdapter extends JsonAdapter<TravelTrainSeatInfoV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<TravelTrainSeatInfoV2DTO.SeatPriceDTO>> listOfSeatPriceDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelTrainSeatInfoV2DTO.SeatDiscountDTO> nullableSeatDiscountDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TravelTrainSeatInfoV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "serviceType", "carriageNumber", "seatsCount", "seatsDetailed", "selectionTitle", "seatPrices", "seatDiscount", "annotation", "typeBadge");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "type");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "serviceType");
        this.listOfSeatPriceDTOAdapter = moshi.f(D.e(List.class, TravelTrainSeatInfoV2DTO.SeatPriceDTO.class), m11, "seatPrices");
        this.nullableSeatDiscountDTOAdapter = moshi.f(TravelTrainSeatInfoV2DTO.SeatDiscountDTO.class, m11, "seatDiscount");
        this.nullableDisclaimerDTOAdapter = moshi.f(DisclaimerDTO.class, m11, "annotation");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "typeBadge");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(TravelTrainSeatInfoV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelTrainSeatInfoV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        TextDTO textDTO5 = null;
        TextDTO textDTO6 = null;
        List<TravelTrainSeatInfoV2DTO.SeatPriceDTO> list = null;
        TravelTrainSeatInfoV2DTO.SeatDiscountDTO seatDiscountDTO = null;
        DisclaimerDTO disclaimerDTO = null;
        BadgeDTO badgeDTO = null;
        while (true) {
            TextDTO textDTO7 = textDTO;
            TextDTO textDTO8 = textDTO2;
            if (!reader.hasNext()) {
                TextDTO textDTO9 = textDTO3;
                reader.endObject();
                if (textDTO7 == null) {
                    throw c.j("type", "type", reader);
                }
                if (textDTO9 == null) {
                    throw c.j("carriageNumber", "carriageNumber", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("seatsCount", "seatsCount", reader);
                }
                if (textDTO5 == null) {
                    throw c.j("seatsDetailed", "seatsDetailed", reader);
                }
                if (textDTO6 == null) {
                    throw c.j("selectionTitle", "selectionTitle", reader);
                }
                if (list != null) {
                    return new TravelTrainSeatInfoV2DTO(textDTO7, textDTO8, textDTO9, textDTO4, textDTO5, textDTO6, list, seatDiscountDTO, disclaimerDTO, badgeDTO);
                }
                throw c.j("seatPrices", "seatPrices", reader);
            }
            TextDTO textDTO10 = textDTO3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("type", "type", reader);
                    }
                    textDTO3 = textDTO10;
                    textDTO2 = textDTO8;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                case 2:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("carriageNumber", "carriageNumber", reader);
                    }
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 3:
                    textDTO4 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO4 == null) {
                        throw c.q("seatsCount", "seatsCount", reader);
                    }
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 4:
                    textDTO5 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO5 == null) {
                        throw c.q("seatsDetailed", "seatsDetailed", reader);
                    }
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 5:
                    textDTO6 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO6 == null) {
                        throw c.q("selectionTitle", "selectionTitle", reader);
                    }
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 6:
                    list = this.listOfSeatPriceDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("seatPrices", "seatPrices", reader);
                    }
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 7:
                    seatDiscountDTO = this.nullableSeatDiscountDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 8:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                case 9:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
                default:
                    textDTO3 = textDTO10;
                    textDTO = textDTO7;
                    textDTO2 = textDTO8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelTrainSeatInfoV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("serviceType");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getServiceType());
        writer.w("carriageNumber");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getCarriageNumber());
        writer.w("seatsCount");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSeatsCount());
        writer.w("seatsDetailed");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSeatsDetailed());
        writer.w("selectionTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSelectionTitle());
        writer.w("seatPrices");
        this.listOfSeatPriceDTOAdapter.mo44toJson(writer, (x) value.getSeatPrices());
        writer.w("seatDiscount");
        this.nullableSeatDiscountDTOAdapter.mo44toJson(writer, (x) value.getSeatDiscount());
        writer.w("annotation");
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("typeBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTypeBadge());
        writer.p();
    }
}
