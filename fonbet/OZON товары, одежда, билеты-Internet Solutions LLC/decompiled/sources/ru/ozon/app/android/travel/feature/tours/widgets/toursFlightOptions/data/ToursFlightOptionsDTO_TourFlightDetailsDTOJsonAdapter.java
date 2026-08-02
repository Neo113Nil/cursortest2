package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data;

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
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO_TourFlightDetailsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightOptionsDTO_TourFlightDetailsDTOJsonAdapter extends JsonAdapter<ToursFlightOptionsDTO.TourFlightDetailsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ToursFlightOptionsDTO_TourFlightDetailsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("time", "counter", "airportCodes", "duration");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "time");
        this.nullableStringAdapter = moshi.f(String.class, m11, "counter");
    }

    @NotNull
    public String toString() {
        return b.c(64, "GeneratedJsonAdapter(ToursFlightOptionsDTO.TourFlightDetailsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ToursFlightOptionsDTO.TourFlightDetailsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        String str = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q("time", "time", reader);
                }
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                textAtom2 = this.textAtomAdapter.fromJson(reader);
                if (textAtom2 == null) {
                    throw c.q("airportCodes", "airportCodes", reader);
                }
            } else if (v11 == 3 && (textAtom3 = this.textAtomAdapter.fromJson(reader)) == null) {
                throw c.q("duration", "duration", reader);
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j("time", "time", reader);
        }
        if (textAtom2 == null) {
            throw c.j("airportCodes", "airportCodes", reader);
        }
        if (textAtom3 != null) {
            return new ToursFlightOptionsDTO.TourFlightDetailsDTO(textAtom, str, textAtom2, textAtom3);
        }
        throw c.j("duration", "duration", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ToursFlightOptionsDTO.TourFlightDetailsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("time");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTime());
        writer.w("counter");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w("airportCodes");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getAirportCodes());
        writer.w("duration");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getDuration());
        writer.p();
    }
}
