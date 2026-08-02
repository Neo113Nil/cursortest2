package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation;

import An.C2439a;
import B90.C2618u;
import D3.g;
import D40.d;
import Fm.C3051a;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListItemVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u0001LB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u00104R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b9\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListItemVI;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "flightInfo", "luggageText", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineIcons", "airlinesText", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "wayThereDetails", "wayBackDetails", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "common", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getFlightInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getLuggageText", "Ljava/util/List;", "getAirlineIcons", "()Ljava/util/List;", "getAirlinesText", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "getWayBackDetails", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getCommon", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TripRouteVI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaFavoriteListFlightVI implements AviaFavoriteListItemVI {
    private final List<IconDTO> airlineIcons;
    private final TextDTO airlinesText;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final ButtonV3DTO button;
    private final AtomAction common;

    @NotNull
    private final FavoriteProductModel favoriteButton;

    @NotNull
    private final TextDTO flightInfo;
    private final long id;
    private final TextDTO luggageText;

    @NotNull
    private final PriceDTO price;
    private final t tokenizedEvent;
    private final TripRouteVI wayBackDetails;
    private final TripRouteVI wayThereDetails;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tripTime", "tripDuration", "routeInfo", "timeDifference", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;", "transfers", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getRouteInfo", "getTimeDifference", "Ljava/util/List;", "getTransfers", "()Ljava/util/List;", "TransferVI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripRouteVI {

        @NotNull
        private final TextDTO routeInfo;
        private final TextDTO timeDifference;

        @NotNull
        private final List<TransferVI> transfers;

        @NotNull
        private final TextDTO tripDuration;

        @NotNull
        private final TextDTO tripTime;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListFlightVI$TripRouteVI$TransferVI;", "", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atoms", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TransferVI {

            @NotNull
            private final List<AtomDTO> atoms;
            private final long id;

            /* JADX WARN: Multi-variable type inference failed */
            public TransferVI(long j11, @NotNull List<? extends AtomDTO> atoms) {
                Intrinsics.checkNotNullParameter(atoms, "atoms");
                this.id = j11;
                this.atoms = atoms;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TransferVI)) {
                    return false;
                }
                TransferVI transferVI = (TransferVI) other;
                return this.id == transferVI.id && Intrinsics.d(this.atoms, transferVI.atoms);
            }

            @NotNull
            public final List<AtomDTO> getAtoms() {
                return this.atoms;
            }

            public final long getId() {
                return this.id;
            }

            public int hashCode() {
                return this.atoms.hashCode() + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder b11 = b.b(this.id, "TransferVI(id=", ", atoms=", this.atoms);
                b11.append(")");
                return b11.toString();
            }
        }

        public TripRouteVI(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, TextDTO textDTO, @NotNull List<TransferVI> transfers) {
            Intrinsics.checkNotNullParameter(tripTime, "tripTime");
            Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            Intrinsics.checkNotNullParameter(transfers, "transfers");
            this.tripTime = tripTime;
            this.tripDuration = tripDuration;
            this.routeInfo = routeInfo;
            this.timeDifference = textDTO;
            this.transfers = transfers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TripRouteVI)) {
                return false;
            }
            TripRouteVI tripRouteVI = (TripRouteVI) other;
            return Intrinsics.d(this.tripTime, tripRouteVI.tripTime) && Intrinsics.d(this.tripDuration, tripRouteVI.tripDuration) && Intrinsics.d(this.routeInfo, tripRouteVI.routeInfo) && Intrinsics.d(this.timeDifference, tripRouteVI.timeDifference) && Intrinsics.d(this.transfers, tripRouteVI.transfers);
        }

        @NotNull
        public final TextDTO getRouteInfo() {
            return this.routeInfo;
        }

        public final TextDTO getTimeDifference() {
            return this.timeDifference;
        }

        @NotNull
        public final List<TransferVI> getTransfers() {
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
            int a11 = Ns.b.a(this.routeInfo, Ns.b.a(this.tripDuration, this.tripTime.hashCode() * 31, 31), 31);
            TextDTO textDTO = this.timeDifference;
            return this.transfers.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.tripTime;
            TextDTO textDTO2 = this.tripDuration;
            TextDTO textDTO3 = this.routeInfo;
            TextDTO textDTO4 = this.timeDifference;
            List<TransferVI> list = this.transfers;
            StringBuilder g10 = g.g("TripRouteVI(tripTime=", textDTO, ", tripDuration=", textDTO2, ", routeInfo=");
            d.e(", timeDifference=", ", transfers=", g10, textDTO3, textDTO4);
            return C2618u.h(g10, list, ")");
        }
    }

    public AviaFavoriteListFlightVI(long j11, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO flightInfo, TextDTO textDTO, List<IconDTO> list, TextDTO textDTO2, @NotNull FavoriteProductModel favoriteButton, TripRouteVI tripRouteVI, TripRouteVI tripRouteVI2, String str, AtomAction atomAction, ButtonV3DTO buttonV3DTO, t tVar) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(flightInfo, "flightInfo");
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        this.id = j11;
        this.price = price;
        this.badge = badgeDTO;
        this.flightInfo = flightInfo;
        this.luggageText = textDTO;
        this.airlineIcons = list;
        this.airlinesText = textDTO2;
        this.favoriteButton = favoriteButton;
        this.wayThereDetails = tripRouteVI;
        this.wayBackDetails = tripRouteVI2;
        this.backgroundColor = str;
        this.common = atomAction;
        this.button = buttonV3DTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaFavoriteListFlightVI)) {
            return false;
        }
        AviaFavoriteListFlightVI aviaFavoriteListFlightVI = (AviaFavoriteListFlightVI) other;
        return this.id == aviaFavoriteListFlightVI.id && Intrinsics.d(this.price, aviaFavoriteListFlightVI.price) && Intrinsics.d(this.badge, aviaFavoriteListFlightVI.badge) && Intrinsics.d(this.flightInfo, aviaFavoriteListFlightVI.flightInfo) && Intrinsics.d(this.luggageText, aviaFavoriteListFlightVI.luggageText) && Intrinsics.d(this.airlineIcons, aviaFavoriteListFlightVI.airlineIcons) && Intrinsics.d(this.airlinesText, aviaFavoriteListFlightVI.airlinesText) && Intrinsics.d(this.favoriteButton, aviaFavoriteListFlightVI.favoriteButton) && Intrinsics.d(this.wayThereDetails, aviaFavoriteListFlightVI.wayThereDetails) && Intrinsics.d(this.wayBackDetails, aviaFavoriteListFlightVI.wayBackDetails) && Intrinsics.d(this.backgroundColor, aviaFavoriteListFlightVI.backgroundColor) && Intrinsics.d(this.common, aviaFavoriteListFlightVI.common) && Intrinsics.d(this.button, aviaFavoriteListFlightVI.button) && Intrinsics.d(this.tokenizedEvent, aviaFavoriteListFlightVI.tokenizedEvent);
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

    public final AtomAction getCommon() {
        return this.common;
    }

    @NotNull
    public final FavoriteProductModel getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    public final TextDTO getFlightInfo() {
        return this.flightInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getLuggageText() {
        return this.luggageText;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return AviaFavoriteListItemVI.DefaultImpls.getScrollWidgetKey(this);
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return AviaFavoriteListItemVI.DefaultImpls.getViewItemKey(this);
    }

    public final TripRouteVI getWayBackDetails() {
        return this.wayBackDetails;
    }

    public final TripRouteVI getWayThereDetails() {
        return this.wayThereDetails;
    }

    public int hashCode() {
        int b11 = C3051a.b(this.price, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        int a11 = Ns.b.a(this.flightInfo, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.luggageText;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<IconDTO> list = this.airlineIcons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TextDTO textDTO2 = this.airlinesText;
        int hashCode3 = (this.favoriteButton.hashCode() + ((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31;
        TripRouteVI tripRouteVI = this.wayThereDetails;
        int hashCode4 = (hashCode3 + (tripRouteVI == null ? 0 : tripRouteVI.hashCode())) * 31;
        TripRouteVI tripRouteVI2 = this.wayBackDetails;
        int hashCode5 = (hashCode4 + (tripRouteVI2 == null ? 0 : tripRouteVI2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.common;
        int hashCode7 = (hashCode6 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode8 = (hashCode7 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode8 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO = this.flightInfo;
        TextDTO textDTO2 = this.luggageText;
        List<IconDTO> list = this.airlineIcons;
        TextDTO textDTO3 = this.airlinesText;
        FavoriteProductModel favoriteProductModel = this.favoriteButton;
        TripRouteVI tripRouteVI = this.wayThereDetails;
        TripRouteVI tripRouteVI2 = this.wayBackDetails;
        String str = this.backgroundColor;
        AtomAction atomAction = this.common;
        ButtonV3DTO buttonV3DTO = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("AviaFavoriteListFlightVI(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", flightInfo=");
        sb2.append(textDTO);
        sb2.append(", luggageText=");
        sb2.append(textDTO2);
        sb2.append(", airlineIcons=");
        sb2.append(list);
        sb2.append(", airlinesText=");
        sb2.append(textDTO3);
        sb2.append(", favoriteButton=");
        sb2.append(favoriteProductModel);
        sb2.append(", wayThereDetails=");
        sb2.append(tripRouteVI);
        sb2.append(", wayBackDetails=");
        sb2.append(tripRouteVI2);
        C2439a.c(", backgroundColor=", str, ", common=", sb2, atomAction);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
