package ru.ozon.app.android.travel.molecules.dto.tripRoute;

import Y9.b;
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
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/tripRoute/TripRouteDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableListOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "nullableTextAtomAdapter", "nullableStringAdapter", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TripRouteDTOJsonAdapter extends JsonAdapter<TripRouteDTO> {

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TripRouteDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("airlineIconUrls", "tripTime", "tripDuration", "routeInfo", "transferIcon", "transferInfo", "transferTime", "arrivalDays");
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        this.nullableListOfStringAdapter = moshi.f(e11, m11, "airlineIconUrls");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "tripTime");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "transferIcon");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "transferTime");
        this.nullableStringAdapter = moshi.f(String.class, m11, "arrivalDays");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(TripRouteDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TripRouteDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        Icon icon = null;
        TextAtom textAtom4 = null;
        TextAtom textAtom5 = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("tripTime", "tripTime", reader);
                    }
                    break;
                case 2:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("tripDuration", "tripDuration", reader);
                    }
                    break;
                case 3:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("routeInfo", "routeInfo", reader);
                    }
                    break;
                case 4:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 5:
                    textAtom4 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom4 == null) {
                        throw c.q("transferInfo", "transferInfo", reader);
                    }
                    break;
                case 6:
                    textAtom5 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j("tripTime", "tripTime", reader);
        }
        if (textAtom2 == null) {
            throw c.j("tripDuration", "tripDuration", reader);
        }
        if (textAtom3 == null) {
            throw c.j("routeInfo", "routeInfo", reader);
        }
        if (textAtom4 != null) {
            return new TripRouteDTO(list, textAtom, textAtom2, textAtom3, icon, textAtom4, textAtom5, str);
        }
        throw c.j("transferInfo", "transferInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TripRouteDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("airlineIconUrls");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getAirlineIconUrls());
        writer.w("tripTime");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTripTime());
        writer.w("tripDuration");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTripDuration());
        writer.w("routeInfo");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getRouteInfo());
        writer.w("transferIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getTransferIcon());
        writer.w("transferInfo");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTransferInfo());
        writer.w("transferTime");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTransferTime());
        writer.w("arrivalDays");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getArrivalDays());
        writer.p();
    }
}
