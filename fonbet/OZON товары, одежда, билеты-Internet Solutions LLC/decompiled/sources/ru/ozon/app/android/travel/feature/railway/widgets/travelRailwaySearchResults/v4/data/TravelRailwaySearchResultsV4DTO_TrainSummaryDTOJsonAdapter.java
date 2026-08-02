package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO_TrainSummaryDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "listOfIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "listOfTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4DTO_TrainSummaryDTOJsonAdapter extends JsonAdapter<TravelRailwaySearchResultsV4DTO.TrainSummaryDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<TravelRailwaySearchResultsV4DTO.TrainSummaryDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<IconDTO>> listOfIconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> listOfTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelRailwaySearchResultsV4DTO_TrainSummaryDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("trainIcons", "trainNames", "mobRouteButton");
        b e11 = D.e(List.class, IconDTO.class);
        M m11 = M.f71699a;
        this.listOfIconDTOAdapter = moshi.f(e11, m11, "trainIcons");
        this.listOfTextDTOAdapter = moshi.f(D.e(List.class, TextDTO.class), m11, "trainNames");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "mobRouteButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(69, "GeneratedJsonAdapter(TravelRailwaySearchResultsV4DTO.TrainSummaryDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySearchResultsV4DTO.TrainSummaryDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<IconDTO> list = null;
        List<TextDTO> list2 = null;
        ButtonV3DTO buttonV3DTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfIconDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("trainIcons", "trainIcons", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                list2 = this.listOfTextDTOAdapter.fromJson(reader);
                if (list2 == null) {
                    throw c.q("trainNames", "trainNames", reader);
                }
                i11 &= -3;
            } else if (v11 == 2 && (buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader)) == null) {
                throw c.q("mobRouteButton", "mobRouteButton", reader);
            }
        }
        reader.endObject();
        if (i11 == -4) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.icon.IconDTO>");
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.text.TextDTO>");
            if (buttonV3DTO != null) {
                return new TravelRailwaySearchResultsV4DTO.TrainSummaryDTO(list, list2, buttonV3DTO);
            }
            throw c.j("mobRouteButton", "mobRouteButton", reader);
        }
        Constructor<TravelRailwaySearchResultsV4DTO.TrainSummaryDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TravelRailwaySearchResultsV4DTO.TrainSummaryDTO.class.getDeclaredConstructor(List.class, List.class, ButtonV3DTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (buttonV3DTO == null) {
            throw c.j("mobRouteButton", "mobRouteButton", reader);
        }
        TravelRailwaySearchResultsV4DTO.TrainSummaryDTO newInstance = constructor.newInstance(list, list2, buttonV3DTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySearchResultsV4DTO.TrainSummaryDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("trainIcons");
        this.listOfIconDTOAdapter.mo44toJson(writer, (x) value.getTrainIcons());
        writer.w("trainNames");
        this.listOfTextDTOAdapter.mo44toJson(writer, (x) value.getTrainNames());
        writer.w("mobRouteButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getMobRouteButton());
        writer.p();
    }
}
