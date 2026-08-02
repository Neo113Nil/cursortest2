package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.data;

import Fm.C3051a;
import G.g;
import H3.c;
import Ns.b;
import Tl.a;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO;", "", "segments", "", "<init>", "(Ljava/util/List;)V", "getSegments$annotations", "()V", "getSegments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderDTO", "FlightDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaFavoriteListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> segments;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001LB\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J»\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO;", "", "flightId", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "flightInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "luggageText", "airlineIcons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlinesText", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "wayThereDetails", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;", "wayBackDetails", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getFlightId", "()I", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getFlightInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLuggageText", "getAirlineIcons", "()Ljava/util/List;", "getAirlinesText", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;", "getWayBackDetails", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "TripRouteDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FlightDTO {
        public static final int $stable = 8;
        private final List<IconDTO> airlineIcons;
        private final TextDTO airlinesText;
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final ButtonV3DTO button;
        private final CommonControlSettings common;

        @NotNull
        private final FavoriteProductMoleculeV4 favoriteButton;
        private final int flightId;

        @NotNull
        private final TextDTO flightInfo;
        private final TextDTO luggageText;

        @NotNull
        private final PriceDTO price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final TripRouteDTO wayBackDetails;
        private final TripRouteDTO wayThereDetails;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO;", "", "tripTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tripDuration", "routeInfo", "transfers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO$TransferDTO;", "timeDifference", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTripTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getRouteInfo", "getTransfers", "()Ljava/util/List;", "getTimeDifference", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TransferDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TripRouteDTO {
            public static final int $stable = 8;

            @NotNull
            private final TextDTO routeInfo;
            private final TextDTO timeDifference;

            @NotNull
            private final List<TransferDTO> transfers;

            @NotNull
            private final TextDTO tripDuration;

            @NotNull
            private final TextDTO tripTime;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$FlightDTO$TripRouteDTO$TransferDTO;", "", "city", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getCity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TransferDTO {
                public static final int $stable = 8;

                @NotNull
                private final TextDTO city;
                private final List<IconDTO> icons;

                public TransferDTO(@NotNull TextDTO city, List<IconDTO> list) {
                    Intrinsics.checkNotNullParameter(city, "city");
                    this.city = city;
                    this.icons = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ TransferDTO copy$default(TransferDTO transferDTO, TextDTO textDTO, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = transferDTO.city;
                    }
                    if ((i11 & 2) != 0) {
                        list = transferDTO.icons;
                    }
                    return transferDTO.copy(textDTO, list);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getCity() {
                    return this.city;
                }

                public final List<IconDTO> component2() {
                    return this.icons;
                }

                @NotNull
                public final TransferDTO copy(@NotNull TextDTO city, List<IconDTO> icons) {
                    Intrinsics.checkNotNullParameter(city, "city");
                    return new TransferDTO(city, icons);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TransferDTO)) {
                        return false;
                    }
                    TransferDTO transferDTO = (TransferDTO) other;
                    return Intrinsics.d(this.city, transferDTO.city) && Intrinsics.d(this.icons, transferDTO.icons);
                }

                @NotNull
                public final TextDTO getCity() {
                    return this.city;
                }

                public final List<IconDTO> getIcons() {
                    return this.icons;
                }

                public int hashCode() {
                    int hashCode = this.city.hashCode() * 31;
                    List<IconDTO> list = this.icons;
                    return hashCode + (list == null ? 0 : list.hashCode());
                }

                @NotNull
                public String toString() {
                    return "TransferDTO(city=" + this.city + ", icons=" + this.icons + ")";
                }
            }

            public TripRouteDTO(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, @NotNull List<TransferDTO> transfers, TextDTO textDTO) {
                Intrinsics.checkNotNullParameter(tripTime, "tripTime");
                Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
                Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                this.tripTime = tripTime;
                this.tripDuration = tripDuration;
                this.routeInfo = routeInfo;
                this.transfers = transfers;
                this.timeDifference = textDTO;
            }

            public static /* synthetic */ TripRouteDTO copy$default(TripRouteDTO tripRouteDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, List list, TextDTO textDTO4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = tripRouteDTO.tripTime;
                }
                if ((i11 & 2) != 0) {
                    textDTO2 = tripRouteDTO.tripDuration;
                }
                if ((i11 & 4) != 0) {
                    textDTO3 = tripRouteDTO.routeInfo;
                }
                if ((i11 & 8) != 0) {
                    list = tripRouteDTO.transfers;
                }
                if ((i11 & 16) != 0) {
                    textDTO4 = tripRouteDTO.timeDifference;
                }
                TextDTO textDTO5 = textDTO4;
                TextDTO textDTO6 = textDTO3;
                return tripRouteDTO.copy(textDTO, textDTO2, textDTO6, list, textDTO5);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTripTime() {
                return this.tripTime;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTripDuration() {
                return this.tripDuration;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getRouteInfo() {
                return this.routeInfo;
            }

            @NotNull
            public final List<TransferDTO> component4() {
                return this.transfers;
            }

            /* renamed from: component5, reason: from getter */
            public final TextDTO getTimeDifference() {
                return this.timeDifference;
            }

            @NotNull
            public final TripRouteDTO copy(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, @NotNull List<TransferDTO> transfers, TextDTO timeDifference) {
                Intrinsics.checkNotNullParameter(tripTime, "tripTime");
                Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
                Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                return new TripRouteDTO(tripTime, tripDuration, routeInfo, transfers, timeDifference);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TripRouteDTO)) {
                    return false;
                }
                TripRouteDTO tripRouteDTO = (TripRouteDTO) other;
                return Intrinsics.d(this.tripTime, tripRouteDTO.tripTime) && Intrinsics.d(this.tripDuration, tripRouteDTO.tripDuration) && Intrinsics.d(this.routeInfo, tripRouteDTO.routeInfo) && Intrinsics.d(this.transfers, tripRouteDTO.transfers) && Intrinsics.d(this.timeDifference, tripRouteDTO.timeDifference);
            }

            @NotNull
            public final TextDTO getRouteInfo() {
                return this.routeInfo;
            }

            public final TextDTO getTimeDifference() {
                return this.timeDifference;
            }

            @NotNull
            public final List<TransferDTO> getTransfers() {
                return this.transfers;
            }

            @NotNull
            public final TextDTO getTripDuration() {
                return this.tripDuration;
            }

            @NotNull
            public final TextDTO getTripTime() {
                return this.tripTime;
            }

            public int hashCode() {
                int b11 = g.b(b.a(this.routeInfo, b.a(this.tripDuration, this.tripTime.hashCode() * 31, 31), 31), 31, this.transfers);
                TextDTO textDTO = this.timeDifference;
                return b11 + (textDTO == null ? 0 : textDTO.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.tripTime;
                TextDTO textDTO2 = this.tripDuration;
                TextDTO textDTO3 = this.routeInfo;
                List<TransferDTO> list = this.transfers;
                TextDTO textDTO4 = this.timeDifference;
                StringBuilder g10 = D3.g.g("TripRouteDTO(tripTime=", textDTO, ", tripDuration=", textDTO2, ", routeInfo=");
                a.e(g10, textDTO3, ", transfers=", list, ", timeDifference=");
                return Tl.b.e(g10, textDTO4, ")");
            }
        }

        public FlightDTO(int i11, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO flightInfo, TextDTO textDTO, List<IconDTO> list, TextDTO textDTO2, @NotNull FavoriteProductMoleculeV4 favoriteButton, TripRouteDTO tripRouteDTO, TripRouteDTO tripRouteDTO2, String str, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(flightInfo, "flightInfo");
            Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
            this.flightId = i11;
            this.price = price;
            this.badge = badgeDTO;
            this.flightInfo = flightInfo;
            this.luggageText = textDTO;
            this.airlineIcons = list;
            this.airlinesText = textDTO2;
            this.favoriteButton = favoriteButton;
            this.wayThereDetails = tripRouteDTO;
            this.wayBackDetails = tripRouteDTO2;
            this.backgroundColor = str;
            this.common = commonControlSettings;
            this.button = buttonV3DTO;
            this.trackingInfo = map;
        }

        /* renamed from: component1, reason: from getter */
        public final int getFlightId() {
            return this.flightId;
        }

        /* renamed from: component10, reason: from getter */
        public final TripRouteDTO getWayBackDetails() {
            return this.wayBackDetails;
        }

        /* renamed from: component11, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component12, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component13, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final Map<String, TokenizedTrackingInfo> component14() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getFlightInfo() {
            return this.flightInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getLuggageText() {
            return this.luggageText;
        }

        public final List<IconDTO> component6() {
            return this.airlineIcons;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getAirlinesText() {
            return this.airlinesText;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final FavoriteProductMoleculeV4 getFavoriteButton() {
            return this.favoriteButton;
        }

        /* renamed from: component9, reason: from getter */
        public final TripRouteDTO getWayThereDetails() {
            return this.wayThereDetails;
        }

        @NotNull
        public final FlightDTO copy(int flightId, @NotNull PriceDTO price, BadgeDTO badge, @NotNull TextDTO flightInfo, TextDTO luggageText, List<IconDTO> airlineIcons, TextDTO airlinesText, @NotNull FavoriteProductMoleculeV4 favoriteButton, TripRouteDTO wayThereDetails, TripRouteDTO wayBackDetails, String backgroundColor, CommonControlSettings common, ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(flightInfo, "flightInfo");
            Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
            return new FlightDTO(flightId, price, badge, flightInfo, luggageText, airlineIcons, airlinesText, favoriteButton, wayThereDetails, wayBackDetails, backgroundColor, common, button, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlightDTO)) {
                return false;
            }
            FlightDTO flightDTO = (FlightDTO) other;
            return this.flightId == flightDTO.flightId && Intrinsics.d(this.price, flightDTO.price) && Intrinsics.d(this.badge, flightDTO.badge) && Intrinsics.d(this.flightInfo, flightDTO.flightInfo) && Intrinsics.d(this.luggageText, flightDTO.luggageText) && Intrinsics.d(this.airlineIcons, flightDTO.airlineIcons) && Intrinsics.d(this.airlinesText, flightDTO.airlinesText) && Intrinsics.d(this.favoriteButton, flightDTO.favoriteButton) && Intrinsics.d(this.wayThereDetails, flightDTO.wayThereDetails) && Intrinsics.d(this.wayBackDetails, flightDTO.wayBackDetails) && Intrinsics.d(this.backgroundColor, flightDTO.backgroundColor) && Intrinsics.d(this.common, flightDTO.common) && Intrinsics.d(this.button, flightDTO.button) && Intrinsics.d(this.trackingInfo, flightDTO.trackingInfo);
        }

        public final List<IconDTO> getAirlineIcons() {
            return this.airlineIcons;
        }

        public final TextDTO getAirlinesText() {
            return this.airlinesText;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final FavoriteProductMoleculeV4 getFavoriteButton() {
            return this.favoriteButton;
        }

        public final int getFlightId() {
            return this.flightId;
        }

        @NotNull
        public final TextDTO getFlightInfo() {
            return this.flightInfo;
        }

        public final TextDTO getLuggageText() {
            return this.luggageText;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final TripRouteDTO getWayBackDetails() {
            return this.wayBackDetails;
        }

        public final TripRouteDTO getWayThereDetails() {
            return this.wayThereDetails;
        }

        public int hashCode() {
            int b11 = C3051a.b(this.price, Integer.hashCode(this.flightId) * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int a11 = b.a(this.flightInfo, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.luggageText;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            List<IconDTO> list = this.airlineIcons;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            TextDTO textDTO2 = this.airlinesText;
            int hashCode3 = (this.favoriteButton.hashCode() + ((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31;
            TripRouteDTO tripRouteDTO = this.wayThereDetails;
            int hashCode4 = (hashCode3 + (tripRouteDTO == null ? 0 : tripRouteDTO.hashCode())) * 31;
            TripRouteDTO tripRouteDTO2 = this.wayBackDetails;
            int hashCode5 = (hashCode4 + (tripRouteDTO2 == null ? 0 : tripRouteDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode7 = (hashCode6 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode8 = (hashCode7 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode8 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.flightId;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO = this.flightInfo;
            TextDTO textDTO2 = this.luggageText;
            List<IconDTO> list = this.airlineIcons;
            TextDTO textDTO3 = this.airlinesText;
            FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = this.favoriteButton;
            TripRouteDTO tripRouteDTO = this.wayThereDetails;
            TripRouteDTO tripRouteDTO2 = this.wayBackDetails;
            String str = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            ButtonV3DTO buttonV3DTO = this.button;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("FlightDTO(flightId=");
            sb2.append(i11);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", flightInfo=");
            sb2.append(textDTO);
            sb2.append(", luggageText=");
            a.e(sb2, textDTO2, ", airlineIcons=", list, ", airlinesText=");
            sb2.append(textDTO3);
            sb2.append(", favoriteButton=");
            sb2.append(favoriteProductMoleculeV4);
            sb2.append(", wayThereDetails=");
            sb2.append(tripRouteDTO);
            sb2.append(", wayBackDetails=");
            sb2.append(tripRouteDTO2);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/data/AviaFavoriteListDTO$HeaderDTO;", "", "headerId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getHeaderId", "()I", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 0;
        private final int headerId;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public HeaderDTO(int i11, @NotNull TextDTO title, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.headerId = i11;
            this.title = title;
            this.subtitle = textDTO;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, int i11, TextDTO textDTO, TextDTO textDTO2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = headerDTO.headerId;
            }
            if ((i12 & 2) != 0) {
                textDTO = headerDTO.title;
            }
            if ((i12 & 4) != 0) {
                textDTO2 = headerDTO.subtitle;
            }
            return headerDTO.copy(i11, textDTO, textDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeaderId() {
            return this.headerId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final HeaderDTO copy(int headerId, @NotNull TextDTO title, TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderDTO(headerId, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return this.headerId == headerDTO.headerId && Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle);
        }

        public final int getHeaderId() {
            return this.headerId;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.title, Integer.hashCode(this.headerId) * 31, 31);
            TextDTO textDTO = this.subtitle;
            return a11 + (textDTO == null ? 0 : textDTO.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.headerId;
            TextDTO textDTO = this.title;
            return Tl.b.e(C4055a.b(textDTO, "HeaderDTO(headerId=", ", title=", ", subtitle=", i11), this.subtitle, ")");
        }
    }

    public AviaFavoriteListDTO() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AviaFavoriteListDTO copy$default(AviaFavoriteListDTO aviaFavoriteListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aviaFavoriteListDTO.segments;
        }
        return aviaFavoriteListDTO.copy(list);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getSegments$annotations() {
    }

    @NotNull
    public final List<Object> component1() {
        return this.segments;
    }

    @NotNull
    public final AviaFavoriteListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "header", type = HeaderDTO.class), @ProtoOneOfSignature(name = "flight", type = FlightDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new AviaFavoriteListDTO(segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AviaFavoriteListDTO) && Intrinsics.d(this.segments, ((AviaFavoriteListDTO) other).segments);
    }

    @NotNull
    public final List<Object> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AviaFavoriteListDTO(segments=", ")", this.segments);
    }

    public AviaFavoriteListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "header", type = HeaderDTO.class), @ProtoOneOfSignature(name = "flight", type = FlightDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.segments = segments;
    }

    public AviaFavoriteListDTO(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list);
    }
}
