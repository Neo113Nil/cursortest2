package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data;

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
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "listOfTariffAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2DTOJsonAdapter extends JsonAdapter<TravelFlightCheckTariffV2DTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelFlightCheckTariffV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelFlightCheckTariffV2DTO.Tariff>> listOfTariffAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelFlightCheckTariffV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("refreshAction", "tariffs");
        M m11 = M.f71699a;
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "refreshAction");
        this.listOfTariffAdapter = moshi.f(D.e(List.class, TravelFlightCheckTariffV2DTO.Tariff.class), m11, "tariffs");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(TravelFlightCheckTariffV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelFlightCheckTariffV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AtomActionDTO atomActionDTO = null;
        List<TravelFlightCheckTariffV2DTO.Tariff> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfTariffAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("tariffs", "tariffs", reader);
                }
                i11 = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2DTO.Tariff>");
            return new TravelFlightCheckTariffV2DTO(atomActionDTO, list);
        }
        Constructor<TravelFlightCheckTariffV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelFlightCheckTariffV2DTO.class.getDeclaredConstructor(AtomActionDTO.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TravelFlightCheckTariffV2DTO newInstance = constructor.newInstance(atomActionDTO, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelFlightCheckTariffV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("refreshAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRefreshAction());
        writer.w("tariffs");
        this.listOfTariffAdapter.mo44toJson(writer, (x) value.getTariffs());
        writer.p();
    }
}
