package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data;

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
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO_TourFlightDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "tourFlightDetailsDTOAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "priceAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "listOfStringAdapter", "listOfBadgeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightOptionsDTO_TourFlightDTOJsonAdapter extends JsonAdapter<ToursFlightOptionsDTO.TourFlightDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;
    private volatile Constructor<ToursFlightOptionsDTO.TourFlightDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<Badge>> listOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Price> priceAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    @NotNull
    private final JsonAdapter<ToursFlightOptionsDTO.TourFlightDetailsDTO> tourFlightDetailsDTOAdapter;

    public ToursFlightOptionsDTO_TourFlightDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("agencyLogoImageURL", "warningBadge", "wayThereDetails", "wayBackDetails", "price", "priceDescription", "marketingText", "selectAction", "trackingInfo", "airlineLogoURLs", "flightFeatures");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "agencyLogoImageURL");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "warningBadge");
        this.tourFlightDetailsDTOAdapter = moshi.f(ToursFlightOptionsDTO.TourFlightDetailsDTO.class, m11, "wayThereDetails");
        this.priceAdapter = moshi.f(Price.class, m11, "price");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "priceDescription");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "marketingText");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "selectAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "airlineLogoURLs");
        this.listOfBadgeAdapter = moshi.f(D.e(List.class, Badge.class), m11, "flightFeatures");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(ToursFlightOptionsDTO.TourFlightDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ToursFlightOptionsDTO.TourFlightDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        Badge badge = null;
        ToursFlightOptionsDTO.TourFlightDetailsDTO tourFlightDetailsDTO = null;
        ToursFlightOptionsDTO.TourFlightDetailsDTO tourFlightDetailsDTO2 = null;
        Price price = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<String> list = null;
        List<Badge> list2 = null;
        while (true) {
            String str2 = str;
            Badge badge2 = badge;
            ToursFlightOptionsDTO.TourFlightDetailsDTO tourFlightDetailsDTO3 = tourFlightDetailsDTO;
            ToursFlightOptionsDTO.TourFlightDetailsDTO tourFlightDetailsDTO4 = tourFlightDetailsDTO2;
            if (!reader.hasNext()) {
                Price price2 = price;
                reader.endObject();
                if (i12 == -1537) {
                    if (str2 == null) {
                        throw c.j("agencyLogoImageURL", "agencyLogoImageURL", reader);
                    }
                    if (tourFlightDetailsDTO3 == null) {
                        throw c.j("wayThereDetails", "wayThereDetails", reader);
                    }
                    if (tourFlightDetailsDTO4 == null) {
                        throw c.j("wayBackDetails", "wayBackDetails", reader);
                    }
                    if (price2 == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (textAtom == null) {
                        throw c.j("priceDescription", "priceDescription", reader);
                    }
                    if (atomActionDTO == null) {
                        throw c.j("selectAction", "selectAction", reader);
                    }
                    Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.badge.Badge>");
                    Map<String, TokenizedTrackingInfo> map2 = map;
                    return new ToursFlightOptionsDTO.TourFlightDTO(str2, badge2, tourFlightDetailsDTO3, tourFlightDetailsDTO4, price2, textAtom, textAtom2, atomActionDTO, map2, list, list2);
                }
                Constructor<ToursFlightOptionsDTO.TourFlightDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = ToursFlightOptionsDTO.TourFlightDTO.class.getDeclaredConstructor(String.class, Badge.class, ToursFlightOptionsDTO.TourFlightDetailsDTO.class, ToursFlightOptionsDTO.TourFlightDetailsDTO.class, Price.class, TextAtom.class, TextAtom.class, AtomActionDTO.class, Map.class, List.class, List.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<ToursFlightOptionsDTO.TourFlightDTO> constructor2 = constructor;
                if (str2 == null) {
                    throw c.j("agencyLogoImageURL", "agencyLogoImageURL", reader);
                }
                if (tourFlightDetailsDTO3 == null) {
                    throw c.j("wayThereDetails", "wayThereDetails", reader);
                }
                if (tourFlightDetailsDTO4 == null) {
                    throw c.j("wayBackDetails", "wayBackDetails", reader);
                }
                if (price2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textAtom == null) {
                    throw c.j("priceDescription", "priceDescription", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("selectAction", "selectAction", reader);
                }
                ToursFlightOptionsDTO.TourFlightDTO newInstance = constructor2.newInstance(str2, badge2, tourFlightDetailsDTO3, tourFlightDetailsDTO4, price2, textAtom, textAtom2, atomActionDTO, map, list, list2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Price price3 = price;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("agencyLogoImageURL", "agencyLogoImageURL", reader);
                    }
                    price = price3;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 1:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    price = price3;
                    str = str2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 2:
                    tourFlightDetailsDTO = this.tourFlightDetailsDTOAdapter.fromJson(reader);
                    if (tourFlightDetailsDTO == null) {
                        throw c.q("wayThereDetails", "wayThereDetails", reader);
                    }
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 3:
                    tourFlightDetailsDTO2 = this.tourFlightDetailsDTOAdapter.fromJson(reader);
                    if (tourFlightDetailsDTO2 == null) {
                        throw c.q("wayBackDetails", "wayBackDetails", reader);
                    }
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                case 4:
                    price = this.priceAdapter.fromJson(reader);
                    if (price == null) {
                        throw c.q("price", "price", reader);
                    }
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 5:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("priceDescription", "priceDescription", reader);
                    }
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 6:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 7:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("selectAction", "selectAction", reader);
                    }
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 9:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("airlineLogoURLs", "airlineLogoURLs", reader);
                    }
                    i12 &= -513;
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                case 10:
                    list2 = this.listOfBadgeAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("flightFeatures", "flightFeatures", reader);
                    }
                    i12 &= -1025;
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
                default:
                    price = price3;
                    str = str2;
                    badge = badge2;
                    tourFlightDetailsDTO = tourFlightDetailsDTO3;
                    tourFlightDetailsDTO2 = tourFlightDetailsDTO4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ToursFlightOptionsDTO.TourFlightDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("agencyLogoImageURL");
        this.stringAdapter.mo44toJson(writer, (x) value.getAgencyLogoImageURL());
        writer.w("warningBadge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getWarningBadge());
        writer.w("wayThereDetails");
        this.tourFlightDetailsDTOAdapter.mo44toJson(writer, (x) value.getWayThereDetails());
        writer.w("wayBackDetails");
        this.tourFlightDetailsDTOAdapter.mo44toJson(writer, (x) value.getWayBackDetails());
        writer.w("price");
        this.priceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceDescription");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("marketingText");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getMarketingText());
        writer.w("selectAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSelectAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("airlineLogoURLs");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getAirlineLogoURLs());
        writer.w("flightFeatures");
        this.listOfBadgeAdapter.mo44toJson(writer, (x) value.getFlightFeatures());
        writer.p();
    }
}
