package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data;

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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data.AviaFavoriteListDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R(\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO_FlightDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableListOfIconDTOAdapter", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "favoriteProductMoleculeV4Adapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;", "nullableTripRouteDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListDTO_FlightDTOJsonAdapter extends JsonAdapter<AviaFavoriteListDTO.FlightDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<FavoriteProductMoleculeV4> favoriteProductMoleculeV4Adapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<List<IconDTO>> nullableListOfIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<AviaFavoriteListDTO.FlightDTO.TripRouteDTO> nullableTripRouteDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AviaFavoriteListDTO_FlightDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("flightId", "price", "badge", "flightInfo", "luggageText", "airlineIcons", "airlinesText", "favoriteButton", "wayThereDetails", "wayBackDetails", "backgroundColor", "common", "button", "trackingInfo");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "flightId");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "flightInfo");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "luggageText");
        this.nullableListOfIconDTOAdapter = moshi.f(D.e(List.class, IconDTO.class), m11, "airlineIcons");
        this.favoriteProductMoleculeV4Adapter = moshi.f(FavoriteProductMoleculeV4.class, m11, "favoriteButton");
        this.nullableTripRouteDTOAdapter = moshi.f(AviaFavoriteListDTO.FlightDTO.TripRouteDTO.class, m11, "wayThereDetails");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(AviaFavoriteListDTO.FlightDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AviaFavoriteListDTO.FlightDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        PriceDTO priceDTO = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<IconDTO> list = null;
        TextDTO textDTO3 = null;
        FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = null;
        AviaFavoriteListDTO.FlightDTO.TripRouteDTO tripRouteDTO = null;
        AviaFavoriteListDTO.FlightDTO.TripRouteDTO tripRouteDTO2 = null;
        String str = null;
        CommonControlSettings commonControlSettings = null;
        ButtonV3DTO buttonV3DTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Integer num2 = num;
            PriceDTO priceDTO2 = priceDTO;
            if (!reader.hasNext()) {
                BadgeDTO badgeDTO2 = badgeDTO;
                reader.endObject();
                if (num2 == null) {
                    throw c.j("flightId", "flightId", reader);
                }
                int intValue = num2.intValue();
                if (priceDTO2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textDTO == null) {
                    throw c.j("flightInfo", "flightInfo", reader);
                }
                if (favoriteProductMoleculeV4 != null) {
                    return new AviaFavoriteListDTO.FlightDTO(intValue, priceDTO2, badgeDTO2, textDTO, textDTO2, list, textDTO3, favoriteProductMoleculeV4, tripRouteDTO, tripRouteDTO2, str, commonControlSettings, buttonV3DTO, map);
                }
                throw c.j("favoriteButton", "favoriteButton", reader);
            }
            BadgeDTO badgeDTO3 = badgeDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("flightId", "flightId", reader);
                    }
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 1:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    num = num2;
                    badgeDTO = badgeDTO3;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    num = num2;
                    priceDTO = priceDTO2;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("flightInfo", "flightInfo", reader);
                    }
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 5:
                    list = this.nullableListOfIconDTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 6:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 7:
                    favoriteProductMoleculeV4 = this.favoriteProductMoleculeV4Adapter.fromJson(reader);
                    if (favoriteProductMoleculeV4 == null) {
                        throw c.q("favoriteButton", "favoriteButton", reader);
                    }
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 8:
                    tripRouteDTO = this.nullableTripRouteDTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 9:
                    tripRouteDTO2 = this.nullableTripRouteDTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 11:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 12:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                case 13:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
                default:
                    num = num2;
                    badgeDTO = badgeDTO3;
                    priceDTO = priceDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AviaFavoriteListDTO.FlightDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("flightId");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFlightId()));
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("flightInfo");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getFlightInfo());
        writer.w("luggageText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getLuggageText());
        writer.w("airlineIcons");
        this.nullableListOfIconDTOAdapter.mo44toJson(writer, (x) value.getAirlineIcons());
        writer.w("airlinesText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAirlinesText());
        writer.w("favoriteButton");
        this.favoriteProductMoleculeV4Adapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("wayThereDetails");
        this.nullableTripRouteDTOAdapter.mo44toJson(writer, (x) value.getWayThereDetails());
        writer.w("wayBackDetails");
        this.nullableTripRouteDTOAdapter.mo44toJson(writer, (x) value.getWayBackDetails());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("button");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
