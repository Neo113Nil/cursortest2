package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.header.FlightSeatsSchemeV2HeaderBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.legend.MobileLegendBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.scheme.FlightSeatsSchemeV2BlockDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/header/FlightSeatsSchemeV2HeaderBlockDTO;", "nullableFlightSeatsSchemeV2HeaderBlockDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/legend/MobileLegendBlockV2DTO;", "nullableMobileLegendBlockV2DTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/scheme/FlightSeatsSchemeV2BlockDTO;", "nullableFlightSeatsSchemeV2BlockDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "footerBlockV2DTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "nullableEmptyStateV2DTOAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2DTOJsonAdapter extends JsonAdapter<FlightSeatsSchemeV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<FlightSeatsSchemeV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<FooterBlockV2DTO> footerBlockV2DTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateV2DTO> nullableEmptyStateV2DTOAdapter;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemeV2BlockDTO> nullableFlightSeatsSchemeV2BlockDTOAdapter;

    @NotNull
    private final JsonAdapter<FlightSeatsSchemeV2HeaderBlockDTO> nullableFlightSeatsSchemeV2HeaderBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<MobileLegendBlockV2DTO> nullableMobileLegendBlockV2DTOAdapter;

    @NotNull
    private final n.a options;

    public FlightSeatsSchemeV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("headerBlock", "mobileLegendBlock", "schemeBlock", "footerBlock", "emptySchemeBlock", "shouldFetchState");
        M m11 = M.f71699a;
        this.nullableFlightSeatsSchemeV2HeaderBlockDTOAdapter = moshi.f(FlightSeatsSchemeV2HeaderBlockDTO.class, m11, "headerBlock");
        this.nullableMobileLegendBlockV2DTOAdapter = moshi.f(MobileLegendBlockV2DTO.class, m11, "mobileLegendBlock");
        this.nullableFlightSeatsSchemeV2BlockDTOAdapter = moshi.f(FlightSeatsSchemeV2BlockDTO.class, m11, "schemeBlock");
        this.footerBlockV2DTOAdapter = moshi.f(FooterBlockV2DTO.class, m11, "footerBlock");
        this.nullableEmptyStateV2DTOAdapter = moshi.f(EmptyStateV2DTO.class, m11, "emptySchemeBlock");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "shouldFetchState");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(FlightSeatsSchemeV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemeV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        MobileLegendBlockV2DTO mobileLegendBlockV2DTO = null;
        Boolean bool2 = bool;
        FlightSeatsSchemeV2HeaderBlockDTO flightSeatsSchemeV2HeaderBlockDTO = null;
        FooterBlockV2DTO footerBlockV2DTO = null;
        EmptyStateV2DTO emptyStateV2DTO = null;
        int i11 = -1;
        FlightSeatsSchemeV2BlockDTO flightSeatsSchemeV2BlockDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    flightSeatsSchemeV2HeaderBlockDTO = this.nullableFlightSeatsSchemeV2HeaderBlockDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    mobileLegendBlockV2DTO = this.nullableMobileLegendBlockV2DTOAdapter.fromJson(reader);
                    break;
                case 2:
                    flightSeatsSchemeV2BlockDTO = this.nullableFlightSeatsSchemeV2BlockDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    footerBlockV2DTO = this.footerBlockV2DTOAdapter.fromJson(reader);
                    if (footerBlockV2DTO == null) {
                        throw c.q("footerBlock", "footerBlock", reader);
                    }
                    break;
                case 4:
                    emptyStateV2DTO = this.nullableEmptyStateV2DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("shouldFetchState", "shouldFetchState", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            if (footerBlockV2DTO != null) {
                return new FlightSeatsSchemeV2DTO(flightSeatsSchemeV2HeaderBlockDTO, mobileLegendBlockV2DTO, flightSeatsSchemeV2BlockDTO, footerBlockV2DTO, emptyStateV2DTO, bool2.booleanValue());
            }
            throw c.j("footerBlock", "footerBlock", reader);
        }
        Constructor<FlightSeatsSchemeV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FlightSeatsSchemeV2DTO.class.getDeclaredConstructor(FlightSeatsSchemeV2HeaderBlockDTO.class, MobileLegendBlockV2DTO.class, FlightSeatsSchemeV2BlockDTO.class, FooterBlockV2DTO.class, EmptyStateV2DTO.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (footerBlockV2DTO == null) {
            throw c.j("footerBlock", "footerBlock", reader);
        }
        FooterBlockV2DTO footerBlockV2DTO2 = footerBlockV2DTO;
        EmptyStateV2DTO emptyStateV2DTO2 = emptyStateV2DTO;
        FlightSeatsSchemeV2DTO newInstance = constructor.newInstance(flightSeatsSchemeV2HeaderBlockDTO, mobileLegendBlockV2DTO, flightSeatsSchemeV2BlockDTO, footerBlockV2DTO2, emptyStateV2DTO2, bool2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemeV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("headerBlock");
        this.nullableFlightSeatsSchemeV2HeaderBlockDTOAdapter.mo44toJson(writer, (x) value.getHeaderBlock());
        writer.w("mobileLegendBlock");
        this.nullableMobileLegendBlockV2DTOAdapter.mo44toJson(writer, (x) value.getMobileLegendBlock());
        writer.w("schemeBlock");
        this.nullableFlightSeatsSchemeV2BlockDTOAdapter.mo44toJson(writer, (x) value.getSchemeBlock());
        writer.w("footerBlock");
        this.footerBlockV2DTOAdapter.mo44toJson(writer, (x) value.getFooterBlock());
        writer.w("emptySchemeBlock");
        this.nullableEmptyStateV2DTOAdapter.mo44toJson(writer, (x) value.getEmptySchemeBlock());
        writer.w("shouldFetchState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShouldFetchState()));
        writer.p();
    }
}
