package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Ak.b;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.app.android.travel.molecules.dto.tabsSelector.TabSelectorDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "nullableTabSelectorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", "listOfSeatDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatTypeDTO;", "listOfSeatTypeDTOAdapter", "stringAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TrainDirectionDTO;", "nullableTrainDirectionDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "travelRailwaySeatSelectFooterDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;", "nullableListOfTextRectangleAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$GenderIndicatorDTO;", "nullableListOfGenderIndicatorDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeV2DTOJsonAdapter extends JsonAdapter<TravelRailwaySeatSelectWithSchemeV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO>> listOfSeatDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO>> listOfSeatTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO>> nullableListOfGenderIndicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle>> nullableListOfTextRectangleAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TabSelectorDTO> nullableTabSelectorDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelRailwaySeatSelectWithSchemeV2DTO.TrainDirectionDTO> nullableTrainDirectionDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TravelRailwaySeatSelectFooterDTO> travelRailwaySeatSelectFooterDTOAdapter;

    public TravelRailwaySeatSelectWithSchemeV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("tabSelector", "seats", "seatTypes", "darkSchemeLink", "lightSchemeLink", "trainDirection", CommentV3DTO.FOOTER_FIELD_NAME, "compartmentGenders", "genderIndicator", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableTabSelectorDTOAdapter = moshi.f(TabSelectorDTO.class, m11, "tabSelector");
        this.listOfSeatDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO.class), m11, "seats");
        this.listOfSeatTypeDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO.class), m11, "seatTypes");
        this.stringAdapter = moshi.f(String.class, m11, "darkSchemeLink");
        this.nullableTrainDirectionDTOAdapter = moshi.f(TravelRailwaySeatSelectWithSchemeV2DTO.TrainDirectionDTO.class, m11, "trainDirection");
        this.travelRailwaySeatSelectFooterDTOAdapter = moshi.f(TravelRailwaySeatSelectFooterDTO.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableListOfTextRectangleAdapter = moshi.f(D.e(List.class, TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle.class), m11, "compartmentGenders");
        this.nullableListOfGenderIndicatorDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO.class), m11, "genderIndicator");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(TravelRailwaySeatSelectWithSchemeV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySeatSelectWithSchemeV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TabSelectorDTO tabSelectorDTO = null;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list = null;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatTypeDTO> list2 = null;
        String str = null;
        String str2 = null;
        TravelRailwaySeatSelectWithSchemeV2DTO.TrainDirectionDTO trainDirectionDTO = null;
        TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO = null;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.TextRectangle> list3 = null;
        List<TravelRailwaySeatSelectWithSchemeV2DTO.GenderIndicatorDTO> list4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TabSelectorDTO tabSelectorDTO2 = tabSelectorDTO;
            if (!reader.hasNext()) {
                List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list5 = list;
                reader.endObject();
                if (list5 == null) {
                    throw c.j("seats", "seats", reader);
                }
                if (list2 == null) {
                    throw c.j("seatTypes", "seatTypes", reader);
                }
                if (str == null) {
                    throw c.j("darkSchemeLink", "darkSchemeLink", reader);
                }
                if (str2 == null) {
                    throw c.j("lightSchemeLink", "lightSchemeLink", reader);
                }
                if (travelRailwaySeatSelectFooterDTO != null) {
                    return new TravelRailwaySeatSelectWithSchemeV2DTO(tabSelectorDTO2, list5, list2, str, str2, trainDirectionDTO, travelRailwaySeatSelectFooterDTO, list3, list4, map);
                }
                throw c.j(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
            }
            List<TravelRailwaySeatSelectWithSchemeV2DTO.SeatDTO> list6 = list;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 0:
                    tabSelectorDTO = this.nullableTabSelectorDTOAdapter.fromJson(reader);
                    list = list6;
                case 1:
                    list = this.listOfSeatDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("seats", "seats", reader);
                    }
                    tabSelectorDTO = tabSelectorDTO2;
                case 2:
                    list2 = this.listOfSeatTypeDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("seatTypes", "seatTypes", reader);
                    }
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 3:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("darkSchemeLink", "darkSchemeLink", reader);
                    }
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 4:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("lightSchemeLink", "lightSchemeLink", reader);
                    }
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 5:
                    trainDirectionDTO = this.nullableTrainDirectionDTOAdapter.fromJson(reader);
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 6:
                    travelRailwaySeatSelectFooterDTO = this.travelRailwaySeatSelectFooterDTOAdapter.fromJson(reader);
                    if (travelRailwaySeatSelectFooterDTO == null) {
                        throw c.q(CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, reader);
                    }
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 7:
                    list3 = this.nullableListOfTextRectangleAdapter.fromJson(reader);
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 8:
                    list4 = this.nullableListOfGenderIndicatorDTOAdapter.fromJson(reader);
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
                default:
                    list = list6;
                    tabSelectorDTO = tabSelectorDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySeatSelectWithSchemeV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("tabSelector");
        this.nullableTabSelectorDTOAdapter.mo44toJson(writer, (x) value.getTabSelector());
        writer.w("seats");
        this.listOfSeatDTOAdapter.mo44toJson(writer, (x) value.getSeats());
        writer.w("seatTypes");
        this.listOfSeatTypeDTOAdapter.mo44toJson(writer, (x) value.getSeatTypes());
        writer.w("darkSchemeLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDarkSchemeLink());
        writer.w("lightSchemeLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getLightSchemeLink());
        writer.w("trainDirection");
        this.nullableTrainDirectionDTOAdapter.mo44toJson(writer, (x) value.getTrainDirection());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.travelRailwaySeatSelectFooterDTOAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("compartmentGenders");
        this.nullableListOfTextRectangleAdapter.mo44toJson(writer, (x) value.getCompartmentGenders());
        writer.w("genderIndicator");
        this.nullableListOfGenderIndicatorDTOAdapter.mo44toJson(writer, (x) value.getGenderIndicator());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
