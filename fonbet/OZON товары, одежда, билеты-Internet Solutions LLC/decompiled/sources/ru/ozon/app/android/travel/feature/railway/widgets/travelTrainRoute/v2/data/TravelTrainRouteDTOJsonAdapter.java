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
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "listOfInfoBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer;", "listOfTrainTransferAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "listOfTrainStopListAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteDTOJsonAdapter extends JsonAdapter<TravelTrainRouteDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelTrainRouteDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<InfoBadgeDTO>> listOfInfoBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelTrainRouteDTO.TrainStopList>> listOfTrainStopListAdapter;

    @NotNull
    private final JsonAdapter<List<TravelTrainRouteDTO.TrainTransfer>> listOfTrainTransferAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public TravelTrainRouteDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("routeTitle", "notificationBadge", "date", "trainsTransfer", "stopsHeader", "showDetails", "hideDetails", "trainsList", "routeDescription");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "routeTitle");
        this.listOfInfoBadgeDTOAdapter = moshi.f(D.e(List.class, InfoBadgeDTO.class), m11, "notificationBadge");
        this.listOfTrainTransferAdapter = moshi.f(D.e(List.class, TravelTrainRouteDTO.TrainTransfer.class), m11, "trainsTransfer");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "showDetails");
        this.listOfTrainStopListAdapter = moshi.f(D.e(List.class, TravelTrainRouteDTO.TrainStopList.class), m11, "trainsList");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(TravelTrainRouteDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelTrainRouteDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextAtom textAtom = null;
        List<InfoBadgeDTO> list = null;
        TextAtom textAtom2 = null;
        List<TravelTrainRouteDTO.TrainTransfer> list2 = null;
        TextAtom textAtom3 = null;
        TextAtom textAtom4 = null;
        TextAtom textAtom5 = null;
        List<TravelTrainRouteDTO.TrainStopList> list3 = null;
        TextAtom textAtom6 = null;
        while (reader.hasNext()) {
            TextAtom textAtom7 = textAtom;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("routeTitle", "routeTitle", reader);
                    }
                    continue;
                case 1:
                    list = this.listOfInfoBadgeDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("notificationBadge", "notificationBadge", reader);
                    }
                    i12 &= -3;
                    break;
                case 2:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("date", "date", reader);
                    }
                    break;
                case 3:
                    list2 = this.listOfTrainTransferAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("trainsTransfer", "trainsTransfer", reader);
                    }
                    i12 &= -9;
                    break;
                case 4:
                    textAtom3 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom3 == null) {
                        throw c.q("stopsHeader", "stopsHeader", reader);
                    }
                    break;
                case 5:
                    textAtom4 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom5 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.listOfTrainStopListAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("trainsList", "trainsList", reader);
                    }
                    i12 &= -129;
                    break;
                case 8:
                    textAtom6 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom6 == null) {
                        throw c.q("routeDescription", "routeDescription", reader);
                    }
                    break;
            }
            textAtom = textAtom7;
        }
        TextAtom textAtom8 = textAtom;
        reader.endObject();
        if (i12 == -139) {
            if (textAtom8 == null) {
                throw c.j("routeTitle", "routeTitle", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO>");
            if (textAtom2 == null) {
                throw c.j("date", "date", reader);
            }
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteDTO.TrainTransfer>");
            if (textAtom3 == null) {
                throw c.j("stopsHeader", "stopsHeader", reader);
            }
            Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteDTO.TrainStopList>");
            if (textAtom6 == null) {
                throw c.j("routeDescription", "routeDescription", reader);
            }
            TextAtom textAtom9 = textAtom6;
            List<TravelTrainRouteDTO.TrainStopList> list4 = list3;
            TextAtom textAtom10 = textAtom5;
            TextAtom textAtom11 = textAtom4;
            TextAtom textAtom12 = textAtom3;
            return new TravelTrainRouteDTO(textAtom8, list, textAtom2, list2, textAtom12, textAtom11, textAtom10, list4, textAtom9);
        }
        Constructor<TravelTrainRouteDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = TravelTrainRouteDTO.class.getDeclaredConstructor(TextAtom.class, List.class, TextAtom.class, List.class, TextAtom.class, TextAtom.class, TextAtom.class, List.class, TextAtom.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<TravelTrainRouteDTO> constructor2 = constructor;
        if (textAtom8 == null) {
            throw c.j("routeTitle", "routeTitle", reader);
        }
        if (textAtom2 == null) {
            throw c.j("date", "date", reader);
        }
        if (textAtom3 == null) {
            throw c.j("stopsHeader", "stopsHeader", reader);
        }
        if (textAtom6 == null) {
            throw c.j("routeDescription", "routeDescription", reader);
        }
        TravelTrainRouteDTO newInstance = constructor2.newInstance(textAtom8, list, textAtom2, list2, textAtom3, textAtom4, textAtom5, list3, textAtom6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelTrainRouteDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("routeTitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getRouteTitle());
        writer.w("notificationBadge");
        this.listOfInfoBadgeDTOAdapter.mo44toJson(writer, (x) value.getNotificationBadge());
        writer.w("date");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getDate());
        writer.w("trainsTransfer");
        this.listOfTrainTransferAdapter.mo44toJson(writer, (x) value.getTrainsTransfer());
        writer.w("stopsHeader");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getStopsHeader());
        writer.w("showDetails");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getShowDetails());
        writer.w("hideDetails");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getHideDetails());
        writer.w("trainsList");
        this.listOfTrainStopListAdapter.mo44toJson(writer, (x) value.getTrainsList());
        writer.w("routeDescription");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getRouteDescription());
        writer.p();
    }
}
