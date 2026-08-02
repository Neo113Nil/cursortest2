package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data;

import Ak.b;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO_WeatherDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson-XsLcj5M", "(Lcom/squareup/moshi/n;)Ljava/util/List;", "fromJson", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson-iqvw_0E", "(Lcom/squareup/moshi/x;Ljava/util/List;)V", "toJson", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/data/SkiResortInfoDTO$WeatherItemDTO;", "listOfWeatherItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoDTO_WeatherDTOJsonAdapter extends JsonAdapter<SkiResortInfoDTO.WeatherDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<SkiResortInfoDTO.WeatherItemDTO>> listOfWeatherItemDTOAdapter;

    @NotNull
    private final n.a options;

    public SkiResortInfoDTO_WeatherDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("items");
        this.listOfWeatherItemDTOAdapter = moshi.f(D.e(List.class, SkiResortInfoDTO.WeatherItemDTO.class), M.f71699a, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ SkiResortInfoDTO.WeatherDTO fromJson(n nVar) {
        return SkiResortInfoDTO.WeatherDTO.m1417boximpl(m1424fromJsonXsLcj5M(nVar));
    }

    @NotNull
    /* renamed from: fromJson-XsLcj5M, reason: not valid java name */
    public List<? extends SkiResortInfoDTO.WeatherItemDTO> m1424fromJsonXsLcj5M(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<SkiResortInfoDTO.WeatherItemDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0 && (list = this.listOfWeatherItemDTOAdapter.fromJson(reader)) == null) {
                throw c.q("items", "items", reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return SkiResortInfoDTO.WeatherDTO.m1418constructorimpl(list);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public /* bridge */ /* synthetic */ void mo44toJson(x xVar, SkiResortInfoDTO.WeatherDTO weatherDTO) {
        SkiResortInfoDTO.WeatherDTO weatherDTO2 = weatherDTO;
        m1425toJsoniqvw_0E(xVar, weatherDTO2 != null ? weatherDTO2.getItems() : null);
    }

    /* renamed from: toJson-iqvw_0E, reason: not valid java name */
    public void m1425toJsoniqvw_0E(@NotNull x writer, List<? extends SkiResortInfoDTO.WeatherItemDTO> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.listOfWeatherItemDTOAdapter.mo44toJson(writer, (x) value);
        writer.p();
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(SkiResortInfoDTO.WeatherDTO)", "toString(...)");
    }
}
