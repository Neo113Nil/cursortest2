package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "intAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "stringAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;", "airplaneSeatTypeV2DTOAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO$RowV2DTO;", "listOfRowV2DTOAdapter", "listOfAirplaneSeatTypeV2DTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2BlockDTOJsonAdapter extends JsonAdapter<FlightSeatsSchemeV2BlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AirplaneSeatTypeV2DTO> airplaneSeatTypeV2DTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FlightSeatsSchemeV2BlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<AirplaneSeatTypeV2DTO>> listOfAirplaneSeatTypeV2DTOAdapter;

    @NotNull
    private final JsonAdapter<List<FlightSeatsSchemeV2BlockDTO.RowV2DTO>> listOfRowV2DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FlightSeatsSchemeV2BlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("schemeWidth", "seatCountInRow", "isBusiness", "countOfAisle", "seatSelectionAction", "exitMarkingColor", "selectedSeatType", "rows", "seatTypes", "switchPassengerOnReservedSeatClick");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "schemeWidth");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "seatCountInRow");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isBusiness");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "seatSelectionAction");
        this.stringAdapter = moshi.f(String.class, m11, "exitMarkingColor");
        this.airplaneSeatTypeV2DTOAdapter = moshi.f(AirplaneSeatTypeV2DTO.class, m11, "selectedSeatType");
        this.listOfRowV2DTOAdapter = moshi.f(D.e(List.class, FlightSeatsSchemeV2BlockDTO.RowV2DTO.class), m11, "rows");
        this.listOfAirplaneSeatTypeV2DTOAdapter = moshi.f(D.e(List.class, AirplaneSeatTypeV2DTO.class), m11, "seatTypes");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(FlightSeatsSchemeV2BlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemeV2BlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Integer num = null;
        Integer num2 = null;
        List<AirplaneSeatTypeV2DTO> list = null;
        Integer num3 = null;
        AtomActionDTO atomActionDTO = null;
        String str = null;
        AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO = null;
        List<FlightSeatsSchemeV2BlockDTO.RowV2DTO> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("seatCountInRow", "seatCountInRow", reader);
                    }
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isBusiness", "isBusiness", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("countOfAisle", "countOfAisle", reader);
                    }
                    break;
                case 4:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("seatSelectionAction", "seatSelectionAction", reader);
                    }
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("exitMarkingColor", "exitMarkingColor", reader);
                    }
                    break;
                case 6:
                    airplaneSeatTypeV2DTO = this.airplaneSeatTypeV2DTOAdapter.fromJson(reader);
                    if (airplaneSeatTypeV2DTO == null) {
                        throw c.q("selectedSeatType", "selectedSeatType", reader);
                    }
                    break;
                case 7:
                    list2 = this.listOfRowV2DTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("rows", "rows", reader);
                    }
                    break;
                case 8:
                    list = this.listOfAirplaneSeatTypeV2DTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("seatTypes", "seatTypes", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("switchPassengerOnReservedSeatClick", "switchPassengerOnReservedSeatClick", reader);
                    }
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -773) {
            if (num == null) {
                throw c.j("seatCountInRow", "seatCountInRow", reader);
            }
            int intValue = num.intValue();
            boolean booleanValue = bool2.booleanValue();
            if (num2 == null) {
                throw c.j("countOfAisle", "countOfAisle", reader);
            }
            int intValue2 = num2.intValue();
            if (atomActionDTO == null) {
                throw c.j("seatSelectionAction", "seatSelectionAction", reader);
            }
            if (str == null) {
                throw c.j("exitMarkingColor", "exitMarkingColor", reader);
            }
            if (airplaneSeatTypeV2DTO == null) {
                throw c.j("selectedSeatType", "selectedSeatType", reader);
            }
            if (list2 == null) {
                throw c.j("rows", "rows", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat.AirplaneSeatTypeV2DTO>");
            return new FlightSeatsSchemeV2BlockDTO(num3, intValue, booleanValue, intValue2, atomActionDTO, str, airplaneSeatTypeV2DTO, list2, list, bool3.booleanValue());
        }
        List<AirplaneSeatTypeV2DTO> list3 = list;
        Constructor<FlightSeatsSchemeV2BlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            constructor = FlightSeatsSchemeV2BlockDTO.class.getDeclaredConstructor(Integer.class, cls2, cls3, cls2, AtomActionDTO.class, String.class, AirplaneSeatTypeV2DTO.class, List.class, List.class, cls3, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num == null) {
            throw c.j("seatCountInRow", "seatCountInRow", reader);
        }
        if (num2 == null) {
            throw c.j("countOfAisle", "countOfAisle", reader);
        }
        if (atomActionDTO == null) {
            throw c.j("seatSelectionAction", "seatSelectionAction", reader);
        }
        if (str == null) {
            throw c.j("exitMarkingColor", "exitMarkingColor", reader);
        }
        if (airplaneSeatTypeV2DTO == null) {
            throw c.j("selectedSeatType", "selectedSeatType", reader);
        }
        if (list2 == null) {
            throw c.j("rows", "rows", reader);
        }
        FlightSeatsSchemeV2BlockDTO newInstance = constructor.newInstance(num3, num, bool2, num2, atomActionDTO, str, airplaneSeatTypeV2DTO, list2, list3, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemeV2BlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("schemeWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSchemeWidth());
        writer.w("seatCountInRow");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSeatCountInRow()));
        writer.w("isBusiness");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isBusiness()));
        writer.w("countOfAisle");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCountOfAisle()));
        writer.w("seatSelectionAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSeatSelectionAction());
        writer.w("exitMarkingColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getExitMarkingColor());
        writer.w("selectedSeatType");
        this.airplaneSeatTypeV2DTOAdapter.mo44toJson(writer, (x) value.getSelectedSeatType());
        writer.w("rows");
        this.listOfRowV2DTOAdapter.mo44toJson(writer, (x) value.getRows());
        writer.w("seatTypes");
        this.listOfAirplaneSeatTypeV2DTOAdapter.mo44toJson(writer, (x) value.getSeatTypes());
        writer.w("switchPassengerOnReservedSeatClick");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getSwitchPassengerOnReservedSeatClick()));
        writer.p();
    }
}
