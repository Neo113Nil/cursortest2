package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme;

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
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "stringAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "airplaneSeatDTOAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO$RowDTO;", "listOfRowDTOAdapter", "listOfAirplaneSeatDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeBlockDTOJsonAdapter extends JsonAdapter<FlightSeatsSchemeBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AirplaneSeatDTO> airplaneSeatDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;
    private volatile Constructor<FlightSeatsSchemeBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<AirplaneSeatDTO>> listOfAirplaneSeatDTOAdapter;

    @NotNull
    private final JsonAdapter<List<FlightSeatsSchemeBlockDTO.RowDTO>> listOfRowDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FlightSeatsSchemeBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("schemeWidth", "seatCountInRow", "seatSelectionAction", "exitMarkingColor", "selectedSeatType", "rows", "seatTypes");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "schemeWidth");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "seatSelectionAction");
        this.stringAdapter = moshi.f(String.class, m11, "exitMarkingColor");
        this.airplaneSeatDTOAdapter = moshi.f(AirplaneSeatDTO.class, m11, "selectedSeatType");
        this.listOfRowDTOAdapter = moshi.f(D.e(List.class, FlightSeatsSchemeBlockDTO.RowDTO.class), m11, "rows");
        this.listOfAirplaneSeatDTOAdapter = moshi.f(D.e(List.class, AirplaneSeatDTO.class), m11, "seatTypes");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(FlightSeatsSchemeBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemeBlockDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        Integer num = null;
        Integer num2 = null;
        AtomActionDTO atomActionDTO = null;
        String str = null;
        AirplaneSeatDTO airplaneSeatDTO = null;
        List<FlightSeatsSchemeBlockDTO.RowDTO> list = null;
        List<AirplaneSeatDTO> list2 = null;
        while (reader.hasNext()) {
            Integer num3 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("schemeWidth", "schemeWidth", reader);
                    }
                    continue;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("seatCountInRow", "seatCountInRow", reader);
                    }
                    break;
                case 2:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("seatSelectionAction", "seatSelectionAction", reader);
                    }
                    break;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("exitMarkingColor", "exitMarkingColor", reader);
                    }
                    break;
                case 4:
                    airplaneSeatDTO = this.airplaneSeatDTOAdapter.fromJson(reader);
                    if (airplaneSeatDTO == null) {
                        throw c.q("selectedSeatType", "selectedSeatType", reader);
                    }
                    break;
                case 5:
                    list = this.listOfRowDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("rows", "rows", reader);
                    }
                    break;
                case 6:
                    list2 = this.listOfAirplaneSeatDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("seatTypes", "seatTypes", reader);
                    }
                    num = num3;
                    i12 = -65;
                    continue;
            }
            num = num3;
        }
        Integer num4 = num;
        reader.endObject();
        if (i12 == -65) {
            List<FlightSeatsSchemeBlockDTO.RowDTO> list3 = list;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if (num4 == null) {
                throw c.j("schemeWidth", "schemeWidth", reader);
            }
            String str2 = str;
            int intValue = num4.intValue();
            if (num2 == null) {
                throw c.j("seatCountInRow", "seatCountInRow", reader);
            }
            AirplaneSeatDTO airplaneSeatDTO2 = airplaneSeatDTO;
            int intValue2 = num2.intValue();
            if (atomActionDTO2 == null) {
                throw c.j("seatSelectionAction", "seatSelectionAction", reader);
            }
            if (str2 == null) {
                throw c.j("exitMarkingColor", "exitMarkingColor", reader);
            }
            if (airplaneSeatDTO2 == null) {
                throw c.j("selectedSeatType", "selectedSeatType", reader);
            }
            if (list3 == null) {
                throw c.j("rows", "rows", reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatDTO>");
            return new FlightSeatsSchemeBlockDTO(intValue, intValue2, atomActionDTO2, str2, airplaneSeatDTO2, list3, list2);
        }
        List<FlightSeatsSchemeBlockDTO.RowDTO> list4 = list;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        AirplaneSeatDTO airplaneSeatDTO3 = airplaneSeatDTO;
        Constructor<FlightSeatsSchemeBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            i11 = i12;
            constructor = FlightSeatsSchemeBlockDTO.class.getDeclaredConstructor(cls2, cls2, AtomActionDTO.class, String.class, AirplaneSeatDTO.class, List.class, List.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<FlightSeatsSchemeBlockDTO> constructor2 = constructor;
        if (num4 == null) {
            throw c.j("schemeWidth", "schemeWidth", reader);
        }
        if (num2 == null) {
            throw c.j("seatCountInRow", "seatCountInRow", reader);
        }
        if (atomActionDTO3 == null) {
            throw c.j("seatSelectionAction", "seatSelectionAction", reader);
        }
        if (str == null) {
            throw c.j("exitMarkingColor", "exitMarkingColor", reader);
        }
        if (airplaneSeatDTO3 == null) {
            throw c.j("selectedSeatType", "selectedSeatType", reader);
        }
        if (list4 == null) {
            throw c.j("rows", "rows", reader);
        }
        FlightSeatsSchemeBlockDTO newInstance = constructor2.newInstance(num4, num2, atomActionDTO3, str, airplaneSeatDTO3, list4, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemeBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("schemeWidth");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSchemeWidth()));
        writer.w("seatCountInRow");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSeatCountInRow()));
        writer.w("seatSelectionAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSeatSelectionAction());
        writer.w("exitMarkingColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getExitMarkingColor());
        writer.w("selectedSeatType");
        this.airplaneSeatDTOAdapter.mo44toJson(writer, (x) value.getSelectedSeatType());
        writer.w("rows");
        this.listOfRowDTOAdapter.mo44toJson(writer, (x) value.getRows());
        writer.w("seatTypes");
        this.listOfAirplaneSeatDTOAdapter.mo44toJson(writer, (x) value.getSeatTypes());
        writer.p();
    }
}
