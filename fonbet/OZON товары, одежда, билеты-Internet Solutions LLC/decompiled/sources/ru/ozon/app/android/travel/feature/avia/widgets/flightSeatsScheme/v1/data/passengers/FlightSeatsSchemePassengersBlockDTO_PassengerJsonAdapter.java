package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO_PassengerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;", "nullableSelectedSeatAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockDTO_PassengerJsonAdapter extends JsonAdapter<FlightSeatsSchemePassengersBlockDTO.Passenger> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemePassengersBlockDTO.SelectedSeat> nullableSelectedSeatAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public FlightSeatsSchemePassengersBlockDTO_PassengerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("id", AppMeasurementSdk.ConditionalUserProperty.NAME, "isCurrent", "shortName", "selectedSeat", "passengerSelectionTrackingInfo");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "id");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCurrent");
        this.nullableSelectedSeatAdapter = moshi.f(FlightSeatsSchemePassengersBlockDTO.SelectedSeat.class, m11, "selectedSeat");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "passengerSelectionTrackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(67, "GeneratedJsonAdapter(FlightSeatsSchemePassengersBlockDTO.Passenger)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemePassengersBlockDTO.Passenger fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        FlightSeatsSchemePassengersBlockDTO.SelectedSeat selectedSeat = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isCurrent", "isCurrent", reader);
                    }
                    break;
                case 3:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("shortName", "shortName", reader);
                    }
                    break;
                case 4:
                    selectedSeat = this.nullableSelectedSeatAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        Boolean bool2 = bool;
        if (num == null) {
            throw c.j("id", "id", reader);
        }
        int intValue = num.intValue();
        if (textAtom == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (bool2 == null) {
            throw c.j("isCurrent", "isCurrent", reader);
        }
        boolean booleanValue = bool2.booleanValue();
        if (textAtom2 != null) {
            return new FlightSeatsSchemePassengersBlockDTO.Passenger(intValue, textAtom, booleanValue, textAtom2, selectedSeat, map);
        }
        throw c.j("shortName", "shortName", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemePassengersBlockDTO.Passenger value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getId()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("isCurrent");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCurrent()));
        writer.w("shortName");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getShortName());
        writer.w("selectedSeat");
        this.nullableSelectedSeatAdapter.mo44toJson(writer, (x) value.getSelectedSeat());
        writer.w("passengerSelectionTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getPassengerSelectionTrackingInfo());
        writer.p();
    }
}
