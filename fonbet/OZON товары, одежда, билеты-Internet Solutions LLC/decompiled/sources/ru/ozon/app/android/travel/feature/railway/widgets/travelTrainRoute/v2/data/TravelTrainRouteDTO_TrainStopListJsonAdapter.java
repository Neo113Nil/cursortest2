package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO_TrainStopListJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "nullableTransferAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList$StopStation;", "listOfStopStationAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteDTO_TrainStopListJsonAdapter extends JsonAdapter<TravelTrainRouteDTO.TrainStopList> {
    public static final int $stable = 8;
    private volatile Constructor<TravelTrainRouteDTO.TrainStopList> constructorRef;

    @NotNull
    private final JsonAdapter<List<TravelTrainRouteDTO.TrainStopList.StopStation>> listOfStopStationAdapter;

    @NotNull
    private final JsonAdapter<TravelTrainRouteDTO.Transfer> nullableTransferAdapter;

    @NotNull
    private final n.a options;

    public TravelTrainRouteDTO_TrainStopListJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("transfer", "stations");
        M m11 = M.f71699a;
        this.nullableTransferAdapter = moshi.f(TravelTrainRouteDTO.Transfer.class, m11, "transfer");
        this.listOfStopStationAdapter = moshi.f(D.e(List.class, TravelTrainRouteDTO.TrainStopList.StopStation.class), m11, "stations");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(TravelTrainRouteDTO.TrainStopList)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelTrainRouteDTO.TrainStopList fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TravelTrainRouteDTO.Transfer transfer = null;
        List<TravelTrainRouteDTO.TrainStopList.StopStation> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                transfer = this.nullableTransferAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfStopStationAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("stations", "stations", reader);
                }
                i11 = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteDTO.TrainStopList.StopStation>");
            return new TravelTrainRouteDTO.TrainStopList(transfer, list);
        }
        Constructor<TravelTrainRouteDTO.TrainStopList> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelTrainRouteDTO.TrainStopList.class.getDeclaredConstructor(TravelTrainRouteDTO.Transfer.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TravelTrainRouteDTO.TrainStopList newInstance = constructor.newInstance(transfer, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelTrainRouteDTO.TrainStopList value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("transfer");
        this.nullableTransferAdapter.mo44toJson(writer, (x) value.getTransfer());
        writer.w("stations");
        this.listOfStopStationAdapter.mo44toJson(writer, (x) value.getStations());
        writer.p();
    }
}
