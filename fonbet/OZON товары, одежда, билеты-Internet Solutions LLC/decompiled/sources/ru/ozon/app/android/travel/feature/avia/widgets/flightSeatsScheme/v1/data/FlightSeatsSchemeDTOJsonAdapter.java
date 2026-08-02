package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO;", "flightSeatsSchemePassengersBlockDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "orderTotalDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "nullableMobileLegendBlockDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "nullableFlightSeatsSchemeBlockDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "nullableFlightSeatsSchemeOrderDetailsDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeDTOJsonAdapter extends JsonAdapter<FlightSeatsSchemeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FlightSeatsSchemeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemePassengersBlockDTO> flightSeatsSchemePassengersBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemeBlockDTO> nullableFlightSeatsSchemeBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemeOrderDetailsDTO> nullableFlightSeatsSchemeOrderDetailsDTOAdapter;

    @NotNull
    private final JsonAdapter<MobileLegendBlockDTO> nullableMobileLegendBlockDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OrderTotalDTO> orderTotalDTOAdapter;

    public FlightSeatsSchemeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("passengersBlock", "orderTotalBlock", "mobileLegendBlock", "schemeBlock", "orderDetailsBlock", "emptySchemeBlock", "shouldFetchState");
        M m11 = M.f71699a;
        this.flightSeatsSchemePassengersBlockDTOAdapter = moshi.f(FlightSeatsSchemePassengersBlockDTO.class, m11, "passengersBlock");
        this.orderTotalDTOAdapter = moshi.f(OrderTotalDTO.class, m11, "orderTotalBlock");
        this.nullableMobileLegendBlockDTOAdapter = moshi.f(MobileLegendBlockDTO.class, m11, "mobileLegendBlock");
        this.nullableFlightSeatsSchemeBlockDTOAdapter = moshi.f(FlightSeatsSchemeBlockDTO.class, m11, "schemeBlock");
        this.nullableFlightSeatsSchemeOrderDetailsDTOAdapter = moshi.f(FlightSeatsSchemeOrderDetailsDTO.class, m11, "orderDetailsBlock");
        this.nullableEmptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "emptySchemeBlock");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldFetchState");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(FlightSeatsSchemeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        OrderTotalDTO orderTotalDTO = null;
        Boolean bool2 = bool;
        FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO = null;
        FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO = null;
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO = null;
        EmptyStateDTO emptyStateDTO = null;
        int i11 = -1;
        MobileLegendBlockDTO mobileLegendBlockDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    flightSeatsSchemePassengersBlockDTO = this.flightSeatsSchemePassengersBlockDTOAdapter.fromJson(reader);
                    if (flightSeatsSchemePassengersBlockDTO == null) {
                        throw c.q("passengersBlock", "passengersBlock", reader);
                    }
                    break;
                case 1:
                    orderTotalDTO = this.orderTotalDTOAdapter.fromJson(reader);
                    if (orderTotalDTO == null) {
                        throw c.q("orderTotalBlock", "orderTotalBlock", reader);
                    }
                    break;
                case 2:
                    mobileLegendBlockDTO = this.nullableMobileLegendBlockDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    flightSeatsSchemeBlockDTO = this.nullableFlightSeatsSchemeBlockDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    flightSeatsSchemeOrderDetailsDTO = this.nullableFlightSeatsSchemeOrderDetailsDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("shouldFetchState", "shouldFetchState", reader);
                    }
                    i11 = -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            if (flightSeatsSchemePassengersBlockDTO == null) {
                throw c.j("passengersBlock", "passengersBlock", reader);
            }
            if (orderTotalDTO != null) {
                return new FlightSeatsSchemeDTO(flightSeatsSchemePassengersBlockDTO, orderTotalDTO, mobileLegendBlockDTO, flightSeatsSchemeBlockDTO, flightSeatsSchemeOrderDetailsDTO, emptyStateDTO, bool2.booleanValue());
            }
            throw c.j("orderTotalBlock", "orderTotalBlock", reader);
        }
        Constructor<FlightSeatsSchemeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FlightSeatsSchemeDTO.class.getDeclaredConstructor(FlightSeatsSchemePassengersBlockDTO.class, OrderTotalDTO.class, MobileLegendBlockDTO.class, FlightSeatsSchemeBlockDTO.class, FlightSeatsSchemeOrderDetailsDTO.class, EmptyStateDTO.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (flightSeatsSchemePassengersBlockDTO == null) {
            throw c.j("passengersBlock", "passengersBlock", reader);
        }
        if (orderTotalDTO == null) {
            throw c.j("orderTotalBlock", "orderTotalBlock", reader);
        }
        FlightSeatsSchemeDTO newInstance = constructor.newInstance(flightSeatsSchemePassengersBlockDTO, orderTotalDTO, mobileLegendBlockDTO, flightSeatsSchemeBlockDTO, flightSeatsSchemeOrderDetailsDTO, emptyStateDTO, bool2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("passengersBlock");
        this.flightSeatsSchemePassengersBlockDTOAdapter.mo44toJson(writer, (x) value.getPassengersBlock());
        writer.w("orderTotalBlock");
        this.orderTotalDTOAdapter.mo44toJson(writer, (x) value.getOrderTotalBlock());
        writer.w("mobileLegendBlock");
        this.nullableMobileLegendBlockDTOAdapter.mo44toJson(writer, (x) value.getMobileLegendBlock());
        writer.w("schemeBlock");
        this.nullableFlightSeatsSchemeBlockDTOAdapter.mo44toJson(writer, (x) value.getSchemeBlock());
        writer.w("orderDetailsBlock");
        this.nullableFlightSeatsSchemeOrderDetailsDTOAdapter.mo44toJson(writer, (x) value.getOrderDetailsBlock());
        writer.w("emptySchemeBlock");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getEmptySchemeBlock());
        writer.w("shouldFetchState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldFetchState()));
        writer.p();
    }
}
