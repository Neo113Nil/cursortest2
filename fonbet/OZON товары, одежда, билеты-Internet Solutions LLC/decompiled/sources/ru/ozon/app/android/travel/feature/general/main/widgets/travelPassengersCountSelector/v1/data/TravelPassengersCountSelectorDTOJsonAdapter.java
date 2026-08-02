package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data;

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
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "listOfTravelQuantityCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO;", "listOfAlertDTOAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;", "nullableTravelClassSelectorDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableMapOfStringTextDTOAdapter", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersCountSelectorDTOJsonAdapter extends JsonAdapter<TravelPassengersCountSelectorDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<TravelPassengersCountSelectorDTO.AlertDTO>> listOfAlertDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelQuantityCellDTO>> listOfTravelQuantityCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TextDTO>> nullableMapOfStringTextDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelPassengersCountSelectorDTO.TravelClassSelectorDTO> nullableTravelClassSelectorDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelPassengersCountSelectorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("cells", "maxSumValue", "alerts", "travelClassSelector", "applyButton", "additionalClassInfo");
        b e11 = D.e(List.class, TravelQuantityCellDTO.class);
        M m11 = M.f71699a;
        this.listOfTravelQuantityCellDTOAdapter = moshi.f(e11, m11, "cells");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxSumValue");
        this.listOfAlertDTOAdapter = moshi.f(D.e(List.class, TravelPassengersCountSelectorDTO.AlertDTO.class), m11, "alerts");
        this.nullableTravelClassSelectorDTOAdapter = moshi.f(TravelPassengersCountSelectorDTO.TravelClassSelectorDTO.class, m11, "travelClassSelector");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "applyButton");
        this.nullableMapOfStringTextDTOAdapter = moshi.f(D.e(Map.class, String.class, TextDTO.class), m11, "additionalClassInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(54, "GeneratedJsonAdapter(TravelPassengersCountSelectorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelPassengersCountSelectorDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        List<TravelQuantityCellDTO> list = null;
        List<TravelPassengersCountSelectorDTO.AlertDTO> list2 = null;
        TravelPassengersCountSelectorDTO.TravelClassSelectorDTO travelClassSelectorDTO = null;
        ButtonV3Atom.LargeButton largeButton = null;
        Map<String, TextDTO> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfTravelQuantityCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cells", "cells", reader);
                    }
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxSumValue", "maxSumValue", reader);
                    }
                    break;
                case 2:
                    list2 = this.listOfAlertDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("alerts", "alerts", reader);
                    }
                    break;
                case 3:
                    travelClassSelectorDTO = this.nullableTravelClassSelectorDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("applyButton", "applyButton", reader);
                    }
                    break;
                case 5:
                    map = this.nullableMapOfStringTextDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("cells", "cells", reader);
        }
        if (num == null) {
            throw c.j("maxSumValue", "maxSumValue", reader);
        }
        int intValue = num.intValue();
        if (list2 == null) {
            throw c.j("alerts", "alerts", reader);
        }
        if (largeButton != null) {
            return new TravelPassengersCountSelectorDTO(list, intValue, list2, travelClassSelectorDTO, largeButton, map);
        }
        throw c.j("applyButton", "applyButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelPassengersCountSelectorDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cells");
        this.listOfTravelQuantityCellDTOAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("maxSumValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxSumValue()));
        writer.w("alerts");
        this.listOfAlertDTOAdapter.mo44toJson(writer, (x) value.getAlerts());
        writer.w("travelClassSelector");
        this.nullableTravelClassSelectorDTOAdapter.mo44toJson(writer, (x) value.getTravelClassSelector());
        writer.w("applyButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getApplyButton());
        writer.w("additionalClassInfo");
        this.nullableMapOfStringTextDTOAdapter.mo44toJson(writer, (x) value.getAdditionalClassInfo());
        writer.p();
    }
}
