package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R(\u00100\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO_FlightJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "listOfIconDTOAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;", "tripRouteAdapter", "nullableTripRouteAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;", "nullableAdditionalInfoDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4DTO_FlightJsonAdapter extends JsonAdapter<AviaSearchResultV4DTO.Flight> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AviaSearchResultV4DTO.Flight> constructorRef;

    @NotNull
    private final JsonAdapter<List<IconDTO>> listOfIconDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaSearchResultV4DTO.Flight.AdditionalInfoDTO> nullableAdditionalInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<AviaSearchResultV4DTO.Flight.TripRoute> nullableTripRouteAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaSearchResultV4DTO.Flight.TripRoute> tripRouteAdapter;

    public AviaSearchResultV4DTO_FlightJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("flightId", "badges", "price", "premiumBadge", "luggageText", "airlineIcons", "airlinesText", "wayThereDetails", "wayBackDetails", "borderColor", "backgroundColor", "cardClickAction", "canShowOnboarding", "additionalInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "flightId");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "premiumBadge");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "luggageText");
        this.listOfIconDTOAdapter = moshi.f(D.e(List.class, IconDTO.class), m11, "airlineIcons");
        this.tripRouteAdapter = moshi.f(AviaSearchResultV4DTO.Flight.TripRoute.class, m11, "wayThereDetails");
        this.nullableTripRouteAdapter = moshi.f(AviaSearchResultV4DTO.Flight.TripRoute.class, m11, "wayBackDetails");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "cardClickAction");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "canShowOnboarding");
        this.nullableAdditionalInfoDTOAdapter = moshi.f(AviaSearchResultV4DTO.Flight.AdditionalInfoDTO.class, m11, "additionalInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(AviaSearchResultV4DTO.Flight)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AviaSearchResultV4DTO.Flight fromJson(@NotNull n reader) {
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        List<BadgeDTO> list = null;
        Boolean bool2 = bool;
        Integer num = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO2 = null;
        List<IconDTO> list2 = null;
        TextDTO textDTO3 = null;
        AviaSearchResultV4DTO.Flight.TripRoute tripRoute = null;
        AviaSearchResultV4DTO.Flight.TripRoute tripRoute2 = null;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        AviaSearchResultV4DTO.Flight.AdditionalInfoDTO additionalInfoDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        PriceDTO priceDTO = null;
        while (true) {
            Integer num2 = num;
            List<BadgeDTO> list3 = list;
            PriceDTO priceDTO2 = priceDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO4 = textDTO2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -4097) {
                    if (priceDTO2 == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (textDTO4 == null) {
                        throw c.j("luggageText", "luggageText", reader);
                    }
                    if (list2 == null) {
                        throw c.j("airlineIcons", "airlineIcons", reader);
                    }
                    if (textDTO3 == null) {
                        throw c.j("airlinesText", "airlinesText", reader);
                    }
                    if (tripRoute == null) {
                        throw c.j("wayThereDetails", "wayThereDetails", reader);
                    }
                    if (atomActionDTO == null) {
                        throw c.j("cardClickAction", "cardClickAction", reader);
                    }
                    return new AviaSearchResultV4DTO.Flight(num2, list3, priceDTO2, badgeDTO2, textDTO4, list2, textDTO3, tripRoute, tripRoute2, str, str2, atomActionDTO, bool2.booleanValue(), additionalInfoDTO, map);
                }
                AviaSearchResultV4DTO.Flight.TripRoute tripRoute3 = tripRoute2;
                List<IconDTO> list4 = list2;
                AviaSearchResultV4DTO.Flight.TripRoute tripRoute4 = tripRoute;
                int i12 = i11;
                TextDTO textDTO5 = textDTO3;
                Constructor<AviaSearchResultV4DTO.Flight> constructor = this.constructorRef;
                if (constructor == null) {
                    textDTO = textDTO4;
                    constructor = AviaSearchResultV4DTO.Flight.class.getDeclaredConstructor(Integer.class, List.class, PriceDTO.class, BadgeDTO.class, TextDTO.class, List.class, TextDTO.class, AviaSearchResultV4DTO.Flight.TripRoute.class, AviaSearchResultV4DTO.Flight.TripRoute.class, String.class, String.class, AtomActionDTO.class, Boolean.TYPE, AviaSearchResultV4DTO.Flight.AdditionalInfoDTO.class, Map.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    textDTO = textDTO4;
                }
                if (priceDTO2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textDTO == null) {
                    throw c.j("luggageText", "luggageText", reader);
                }
                if (list4 == null) {
                    throw c.j("airlineIcons", "airlineIcons", reader);
                }
                if (textDTO5 == null) {
                    throw c.j("airlinesText", "airlinesText", reader);
                }
                if (tripRoute4 == null) {
                    throw c.j("wayThereDetails", "wayThereDetails", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("cardClickAction", "cardClickAction", reader);
                }
                AviaSearchResultV4DTO.Flight newInstance = constructor.newInstance(num2, list3, priceDTO2, badgeDTO2, textDTO, list4, textDTO5, tripRoute4, tripRoute3, str, str2, atomActionDTO, bool2, additionalInfoDTO, map, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 1:
                    list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    num = num2;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 2:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    num = num2;
                    list = list3;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 3:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    textDTO2 = textDTO4;
                case 4:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("luggageText", "luggageText", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                case 5:
                    list2 = this.listOfIconDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("airlineIcons", "airlineIcons", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 6:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("airlinesText", "airlinesText", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 7:
                    tripRoute = this.tripRouteAdapter.fromJson(reader);
                    if (tripRoute == null) {
                        throw c.q("wayThereDetails", "wayThereDetails", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 8:
                    tripRoute2 = this.nullableTripRouteAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 9:
                    str = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 11:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("cardClickAction", "cardClickAction", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 12:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("canShowOnboarding", "canShowOnboarding", reader);
                    }
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                    i11 = -4097;
                case 13:
                    additionalInfoDTO = this.nullableAdditionalInfoDTOAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                case 14:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
                default:
                    num = num2;
                    list = list3;
                    priceDTO = priceDTO2;
                    badgeDTO = badgeDTO2;
                    textDTO2 = textDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AviaSearchResultV4DTO.Flight value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("flightId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getFlightId());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("premiumBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPremiumBadge());
        writer.w("luggageText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getLuggageText());
        writer.w("airlineIcons");
        this.listOfIconDTOAdapter.mo44toJson(writer, (x) value.getAirlineIcons());
        writer.w("airlinesText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getAirlinesText());
        writer.w("wayThereDetails");
        this.tripRouteAdapter.mo44toJson(writer, (x) value.getWayThereDetails());
        writer.w("wayBackDetails");
        this.nullableTripRouteAdapter.mo44toJson(writer, (x) value.getWayBackDetails());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cardClickAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getCardClickAction());
        writer.w("canShowOnboarding");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getCanShowOnboarding()));
        writer.w("additionalInfo");
        this.nullableAdditionalInfoDTOAdapter.mo44toJson(writer, (x) value.getAdditionalInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
