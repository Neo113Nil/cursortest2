package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3DTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "nullableTimerDTOAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$DateV3;", "nullableDateV3Adapter", "Lru/ozon/uni/atoms/data/price/Price;", "nullablePriceAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/data/TravelHotelCardV3DTO$PendingAction;", "nullablePendingActionAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelHotelCardV3DTOJsonAdapter extends JsonAdapter<TravelHotelCardV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TravelHotelCardV3DTO.DateV3> nullableDateV3Adapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TravelHotelCardV3DTO.PendingAction> nullablePendingActionAdapter;

    @NotNull
    private final JsonAdapter<Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<TimerDTO> nullableTimerDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelHotelCardV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badges", "payUntilBadge", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "checkInDate", "checkOutDate", "totalPrice", "priceDescription", "pendingAction", "trackingInfo");
        b e11 = D.e(List.class, Badge.class);
        M m11 = M.f71699a;
        this.nullableListOfBadgeAdapter = moshi.f(e11, m11, "badges");
        this.nullableTimerDTOAdapter = moshi.f(TimerDTO.class, m11, "payUntilBadge");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableDateV3Adapter = moshi.f(TravelHotelCardV3DTO.DateV3.class, m11, "checkInDate");
        this.nullablePriceAdapter = moshi.f(Price.class, m11, "totalPrice");
        this.nullablePendingActionAdapter = moshi.f(TravelHotelCardV3DTO.PendingAction.class, m11, "pendingAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(42, "GeneratedJsonAdapter(TravelHotelCardV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelHotelCardV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<Badge> list = null;
        TimerDTO timerDTO = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TravelHotelCardV3DTO.DateV3 dateV3 = null;
        TravelHotelCardV3DTO.DateV3 dateV32 = null;
        Price price = null;
        TextAtom textAtom3 = null;
        TravelHotelCardV3DTO.PendingAction pendingAction = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfBadgeAdapter.fromJson(reader);
                    break;
                case 1:
                    timerDTO = this.nullableTimerDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    dateV3 = this.nullableDateV3Adapter.fromJson(reader);
                    break;
                case 5:
                    dateV32 = this.nullableDateV3Adapter.fromJson(reader);
                    break;
                case 6:
                    price = this.nullablePriceAdapter.fromJson(reader);
                    break;
                case 7:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 8:
                    pendingAction = this.nullablePendingActionAdapter.fromJson(reader);
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textAtom != null) {
            return new TravelHotelCardV3DTO(list, timerDTO, textAtom, textAtom2, dateV3, dateV32, price, textAtom3, pendingAction, map);
        }
        throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelHotelCardV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("payUntilBadge");
        this.nullableTimerDTOAdapter.mo44toJson(writer, (x) value.getPayUntilBadge());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getName());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("checkInDate");
        this.nullableDateV3Adapter.mo44toJson(writer, (x) value.getCheckInDate());
        writer.w("checkOutDate");
        this.nullableDateV3Adapter.mo44toJson(writer, (x) value.getCheckOutDate());
        writer.w("totalPrice");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getTotalPrice());
        writer.w("priceDescription");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("pendingAction");
        this.nullablePendingActionAdapter.mo44toJson(writer, (x) value.getPendingAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
