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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\"\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO_TrainDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "trainSummaryDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TimeInfoDTO;", "timeInfoDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$RouteInfoDTO;", "listOfRouteInfoDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "listOfIconButtonV3DTOAdapter", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$CarriageTypeDTO;", "listOfCarriageTypeDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4DTO_TrainDTOJsonAdapter extends JsonAdapter<TravelRailwaySearchResultsV4DTO.TrainDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TravelRailwaySearchResultsV4DTO.TrainDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySearchResultsV4DTO.CarriageTypeDTO>> listOfCarriageTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconButtonV3DTO>> listOfIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySearchResultsV4DTO.RouteInfoDTO>> listOfRouteInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelRailwaySearchResultsV4DTO.TimeInfoDTO> timeInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<TravelRailwaySearchResultsV4DTO.TrainSummaryDTO> trainSummaryDTOAdapter;

    public TravelRailwaySearchResultsV4DTO_TrainDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("promotionBadges", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "timeInfo", "routeInfo", ResultDTO.CONTENT_TYPE_SERVICES, "notificationBadge", "carriageTypes", "price", "milesBadge", "common", "onboardingKeys");
        b e11 = D.e(List.class, BadgeDTO.class);
        M m11 = M.f71699a;
        this.listOfBadgeDTOAdapter = moshi.f(e11, m11, "promotionBadges");
        this.trainSummaryDTOAdapter = moshi.f(TravelRailwaySearchResultsV4DTO.TrainSummaryDTO.class, m11, FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.timeInfoDTOAdapter = moshi.f(TravelRailwaySearchResultsV4DTO.TimeInfoDTO.class, m11, "timeInfo");
        this.listOfRouteInfoDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySearchResultsV4DTO.RouteInfoDTO.class), m11, "routeInfo");
        this.listOfIconButtonV3DTOAdapter = moshi.f(D.e(List.class, IconButtonV3DTO.class), m11, ResultDTO.CONTENT_TYPE_SERVICES);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "notificationBadge");
        this.listOfCarriageTypeDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySearchResultsV4DTO.CarriageTypeDTO.class), m11, "carriageTypes");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "onboardingKeys");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(62, "GeneratedJsonAdapter(TravelRailwaySearchResultsV4DTO.TrainDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySearchResultsV4DTO.TrainDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        List<BadgeDTO> list = null;
        TravelRailwaySearchResultsV4DTO.TrainSummaryDTO trainSummaryDTO = null;
        TravelRailwaySearchResultsV4DTO.TimeInfoDTO timeInfoDTO = null;
        List<TravelRailwaySearchResultsV4DTO.RouteInfoDTO> list2 = null;
        List<IconButtonV3DTO> list3 = null;
        BadgeDTO badgeDTO = null;
        List<TravelRailwaySearchResultsV4DTO.CarriageTypeDTO> list4 = null;
        PriceDTO priceDTO = null;
        BadgeDTO badgeDTO2 = null;
        CommonControlSettings commonControlSettings = null;
        List<String> list5 = null;
        while (true) {
            TravelRailwaySearchResultsV4DTO.TrainSummaryDTO trainSummaryDTO2 = trainSummaryDTO;
            if (!reader.hasNext()) {
                TravelRailwaySearchResultsV4DTO.TimeInfoDTO timeInfoDTO2 = timeInfoDTO;
                reader.endObject();
                if (i12 == -90) {
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsBadge.BadgeDTO>");
                    if (trainSummaryDTO2 == null) {
                        throw c.j(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
                    }
                    if (timeInfoDTO2 == null) {
                        throw c.j("timeInfo", "timeInfo", reader);
                    }
                    Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO.RouteInfoDTO>");
                    Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO>");
                    Intrinsics.g(list4, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4DTO.CarriageTypeDTO>");
                    if (priceDTO == null) {
                        throw c.j("price", "price", reader);
                    }
                    BadgeDTO badgeDTO3 = badgeDTO2;
                    PriceDTO priceDTO2 = priceDTO;
                    List<TravelRailwaySearchResultsV4DTO.CarriageTypeDTO> list6 = list4;
                    return new TravelRailwaySearchResultsV4DTO.TrainDTO(list, trainSummaryDTO2, timeInfoDTO2, list2, list3, badgeDTO, list6, priceDTO2, badgeDTO3, commonControlSettings, list5);
                }
                Constructor<TravelRailwaySearchResultsV4DTO.TrainDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = TravelRailwaySearchResultsV4DTO.TrainDTO.class.getDeclaredConstructor(List.class, TravelRailwaySearchResultsV4DTO.TrainSummaryDTO.class, TravelRailwaySearchResultsV4DTO.TimeInfoDTO.class, List.class, List.class, BadgeDTO.class, List.class, PriceDTO.class, BadgeDTO.class, CommonControlSettings.class, List.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<TravelRailwaySearchResultsV4DTO.TrainDTO> constructor2 = constructor;
                if (trainSummaryDTO2 == null) {
                    throw c.j(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
                }
                if (timeInfoDTO2 == null) {
                    throw c.j("timeInfo", "timeInfo", reader);
                }
                if (priceDTO == null) {
                    throw c.j("price", "price", reader);
                }
                TravelRailwaySearchResultsV4DTO.TrainDTO newInstance = constructor2.newInstance(list, trainSummaryDTO2, timeInfoDTO2, list2, list3, badgeDTO, list4, priceDTO, badgeDTO2, commonControlSettings, list5, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            TravelRailwaySearchResultsV4DTO.TimeInfoDTO timeInfoDTO3 = timeInfoDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 0:
                    list = this.listOfBadgeDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("promotionBadges", "promotionBadges", reader);
                    }
                    i12 &= -2;
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 1:
                    trainSummaryDTO = this.trainSummaryDTOAdapter.fromJson(reader);
                    if (trainSummaryDTO == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
                    }
                    timeInfoDTO = timeInfoDTO3;
                case 2:
                    timeInfoDTO = this.timeInfoDTOAdapter.fromJson(reader);
                    if (timeInfoDTO == null) {
                        throw c.q("timeInfo", "timeInfo", reader);
                    }
                    trainSummaryDTO = trainSummaryDTO2;
                case 3:
                    list2 = this.listOfRouteInfoDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("routeInfo", "routeInfo", reader);
                    }
                    i12 &= -9;
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 4:
                    list3 = this.listOfIconButtonV3DTOAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q(ResultDTO.CONTENT_TYPE_SERVICES, ResultDTO.CONTENT_TYPE_SERVICES, reader);
                    }
                    i12 &= -17;
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 6:
                    list4 = this.listOfCarriageTypeDTOAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw c.q("carriageTypes", "carriageTypes", reader);
                    }
                    i12 &= -65;
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 7:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 8:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 9:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                case 10:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
                default:
                    timeInfoDTO = timeInfoDTO3;
                    trainSummaryDTO = trainSummaryDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySearchResultsV4DTO.TrainDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("promotionBadges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getPromotionBadges());
        writer.w(FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.trainSummaryDTOAdapter.mo44toJson(writer, (x) value.getSummary());
        writer.w("timeInfo");
        this.timeInfoDTOAdapter.mo44toJson(writer, (x) value.getTimeInfo());
        writer.w("routeInfo");
        this.listOfRouteInfoDTOAdapter.mo44toJson(writer, (x) value.getRouteInfo());
        writer.w(ResultDTO.CONTENT_TYPE_SERVICES);
        this.listOfIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getServices());
        writer.w("notificationBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getNotificationBadge());
        writer.w("carriageTypes");
        this.listOfCarriageTypeDTOAdapter.mo44toJson(writer, (x) value.getCarriageTypes());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("milesBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getMilesBadge());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("onboardingKeys");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getOnboardingKeys());
        writer.p();
    }
}
