package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data;

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
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO_TrainDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$TrainDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$TrainDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$TrainDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "badgeDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "listOfIconButtonV3DTOAdapter", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$CarriageTypeDTO;", "listOfCarriageTypeDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV3DTO_TrainDTOJsonAdapter extends JsonAdapter<TravelRailwaySearchResultsV3DTO.TrainDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;
    private volatile Constructor<TravelRailwaySearchResultsV3DTO.TrainDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelRailwaySearchResultsV3DTO.CarriageTypeDTO>> listOfCarriageTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconButtonV3DTO>> listOfIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TravelRailwaySearchResultsV3DTO_TrainDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("promotionBadges", "trainIcon", "trainName", "route", "travelTime", "travelTimeCaption", "departureArrivalTimes", "dayDifference", "departureStation", "arrivalStation", ResultDTO.CONTENT_TYPE_SERVICES, "notificationBadge", "carriageTypes", "price", "milesBadge", "common");
        b e11 = D.e(List.class, BadgeDTO.class);
        M m11 = M.f71699a;
        this.listOfBadgeDTOAdapter = moshi.f(e11, m11, "promotionBadges");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "trainIcon");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "trainName");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "route");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "dayDifference");
        this.listOfIconButtonV3DTOAdapter = moshi.f(D.e(List.class, IconButtonV3DTO.class), m11, ResultDTO.CONTENT_TYPE_SERVICES);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "notificationBadge");
        this.listOfCarriageTypeDTOAdapter = moshi.f(D.e(List.class, TravelRailwaySearchResultsV3DTO.CarriageTypeDTO.class), m11, "carriageTypes");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(62, "GeneratedJsonAdapter(TravelRailwaySearchResultsV3DTO.TrainDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySearchResultsV3DTO.TrainDTO fromJson(@NotNull n reader) {
        List<BadgeDTO> list;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<TravelRailwaySearchResultsV3DTO.CarriageTypeDTO> list2 = null;
        int i11 = -1;
        List<BadgeDTO> list3 = null;
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        TextDTO textDTO5 = null;
        TextDTO textDTO6 = null;
        TextDTO textDTO7 = null;
        List<IconButtonV3DTO> list4 = null;
        BadgeDTO badgeDTO2 = null;
        PriceDTO priceDTO = null;
        BadgeDTO badgeDTO3 = null;
        CommonControlSettings commonControlSettings = null;
        while (true) {
            IconDTO iconDTO2 = iconDTO;
            TextDTO textDTO8 = textDTO;
            BadgeDTO badgeDTO4 = badgeDTO;
            TextDTO textDTO9 = textDTO2;
            TextDTO textDTO10 = textDTO3;
            TextDTO textDTO11 = textDTO4;
            TextDTO textDTO12 = textDTO5;
            TextDTO textDTO13 = textDTO6;
            if (!reader.hasNext()) {
                TextDTO textDTO14 = textDTO7;
                reader.endObject();
                if (i11 == -5122) {
                    Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsBadge.BadgeDTO>");
                    if (iconDTO2 == null) {
                        throw c.j("trainIcon", "trainIcon", reader);
                    }
                    if (textDTO8 == null) {
                        throw c.j("trainName", "trainName", reader);
                    }
                    if (badgeDTO4 == null) {
                        throw c.j("route", "route", reader);
                    }
                    if (textDTO9 == null) {
                        throw c.j("travelTime", "travelTime", reader);
                    }
                    if (textDTO10 == null) {
                        throw c.j("travelTimeCaption", "travelTimeCaption", reader);
                    }
                    if (textDTO11 == null) {
                        throw c.j("departureArrivalTimes", "departureArrivalTimes", reader);
                    }
                    if (textDTO13 == null) {
                        throw c.j("departureStation", "departureStation", reader);
                    }
                    if (textDTO14 == null) {
                        throw c.j("arrivalStation", "arrivalStation", reader);
                    }
                    Intrinsics.g(list4, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO>");
                    Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3DTO.CarriageTypeDTO>");
                    if (priceDTO == null) {
                        throw c.j("price", "price", reader);
                    }
                    CommonControlSettings commonControlSettings2 = commonControlSettings;
                    return new TravelRailwaySearchResultsV3DTO.TrainDTO(list3, iconDTO2, textDTO8, badgeDTO4, textDTO9, textDTO10, textDTO11, textDTO12, textDTO13, textDTO14, list4, badgeDTO2, list2, priceDTO, badgeDTO3, commonControlSettings2);
                }
                PriceDTO priceDTO2 = priceDTO;
                List<TravelRailwaySearchResultsV3DTO.CarriageTypeDTO> list5 = list2;
                CommonControlSettings commonControlSettings3 = commonControlSettings;
                BadgeDTO badgeDTO5 = badgeDTO3;
                int i12 = i11;
                Constructor<TravelRailwaySearchResultsV3DTO.TrainDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    list = list3;
                    constructor = TravelRailwaySearchResultsV3DTO.TrainDTO.class.getDeclaredConstructor(List.class, IconDTO.class, TextDTO.class, BadgeDTO.class, TextDTO.class, TextDTO.class, TextDTO.class, TextDTO.class, TextDTO.class, TextDTO.class, List.class, BadgeDTO.class, List.class, PriceDTO.class, BadgeDTO.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    list = list3;
                }
                if (iconDTO2 == null) {
                    throw c.j("trainIcon", "trainIcon", reader);
                }
                if (textDTO8 == null) {
                    throw c.j("trainName", "trainName", reader);
                }
                if (badgeDTO4 == null) {
                    throw c.j("route", "route", reader);
                }
                if (textDTO9 == null) {
                    throw c.j("travelTime", "travelTime", reader);
                }
                if (textDTO10 == null) {
                    throw c.j("travelTimeCaption", "travelTimeCaption", reader);
                }
                if (textDTO11 == null) {
                    throw c.j("departureArrivalTimes", "departureArrivalTimes", reader);
                }
                if (textDTO13 == null) {
                    throw c.j("departureStation", "departureStation", reader);
                }
                if (textDTO14 == null) {
                    throw c.j("arrivalStation", "arrivalStation", reader);
                }
                if (priceDTO2 == null) {
                    throw c.j("price", "price", reader);
                }
                TravelRailwaySearchResultsV3DTO.TrainDTO newInstance = constructor.newInstance(list, iconDTO2, textDTO8, badgeDTO4, textDTO9, textDTO10, textDTO11, textDTO12, textDTO13, textDTO14, list4, badgeDTO2, list5, priceDTO2, badgeDTO5, commonControlSettings3, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            TextDTO textDTO15 = textDTO7;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 0:
                    list3 = this.listOfBadgeDTOAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("promotionBadges", "promotionBadges", reader);
                    }
                    i11 &= -2;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 1:
                    IconDTO fromJson = this.iconDTOAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("trainIcon", "trainIcon", reader);
                    }
                    iconDTO = fromJson;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 2:
                    TextDTO fromJson2 = this.textDTOAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("trainName", "trainName", reader);
                    }
                    textDTO = fromJson2;
                    iconDTO = iconDTO2;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 3:
                    BadgeDTO fromJson3 = this.badgeDTOAdapter.fromJson(reader);
                    if (fromJson3 == null) {
                        throw c.q("route", "route", reader);
                    }
                    badgeDTO = fromJson3;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 4:
                    TextDTO fromJson4 = this.textDTOAdapter.fromJson(reader);
                    if (fromJson4 == null) {
                        throw c.q("travelTime", "travelTime", reader);
                    }
                    textDTO2 = fromJson4;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 5:
                    TextDTO fromJson5 = this.textDTOAdapter.fromJson(reader);
                    if (fromJson5 == null) {
                        throw c.q("travelTimeCaption", "travelTimeCaption", reader);
                    }
                    textDTO3 = fromJson5;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 6:
                    TextDTO fromJson6 = this.textDTOAdapter.fromJson(reader);
                    if (fromJson6 == null) {
                        throw c.q("departureArrivalTimes", "departureArrivalTimes", reader);
                    }
                    textDTO4 = fromJson6;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 7:
                    textDTO5 = this.nullableTextDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 8:
                    textDTO6 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO6 == null) {
                        throw c.q("departureStation", "departureStation", reader);
                    }
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO7 = textDTO15;
                case 9:
                    textDTO7 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO7 == null) {
                        throw c.q("arrivalStation", "arrivalStation", reader);
                    }
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                case 10:
                    list4 = this.listOfIconButtonV3DTOAdapter.fromJson(reader);
                    if (list4 == null) {
                        throw c.q(ResultDTO.CONTENT_TYPE_SERVICES, ResultDTO.CONTENT_TYPE_SERVICES, reader);
                    }
                    i11 &= -1025;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 11:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 12:
                    list2 = this.listOfCarriageTypeDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("carriageTypes", "carriageTypes", reader);
                    }
                    i11 &= -4097;
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 13:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 14:
                    badgeDTO3 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                case 15:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
                default:
                    iconDTO = iconDTO2;
                    textDTO = textDTO8;
                    badgeDTO = badgeDTO4;
                    textDTO2 = textDTO9;
                    textDTO3 = textDTO10;
                    textDTO4 = textDTO11;
                    textDTO5 = textDTO12;
                    textDTO6 = textDTO13;
                    textDTO7 = textDTO15;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySearchResultsV3DTO.TrainDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("promotionBadges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getPromotionBadges());
        writer.w("trainIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getTrainIcon());
        writer.w("trainName");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTrainName());
        writer.w("route");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getRoute());
        writer.w("travelTime");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTravelTime());
        writer.w("travelTimeCaption");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTravelTimeCaption());
        writer.w("departureArrivalTimes");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDepartureArrivalTimes());
        writer.w("dayDifference");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDayDifference());
        writer.w("departureStation");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDepartureStation());
        writer.w("arrivalStation");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getArrivalStation());
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
        writer.p();
    }
}
