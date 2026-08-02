package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data;

import B90.C2619v;
import Bi.b;
import G.g;
import HY.a;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.infoBadge.InfoBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003./0Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jy\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO;", "", "routeTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "notificationBadge", "", "Lru/ozon/app/android/travel/molecules/dto/infoBadge/InfoBadgeDTO;", "date", "trainsTransfer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer;", "stopsHeader", "showDetails", "hideDetails", "trainsList", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "routeDescription", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getRouteTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getNotificationBadge", "()Ljava/util/List;", "getDate", "getTrainsTransfer", "getStopsHeader", "getShowDetails", "getHideDetails", "getTrainsList", "getRouteDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrainTransfer", "Transfer", "TrainStopList", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTrainRouteDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextAtom date;
    private final TextAtom hideDetails;

    @NotNull
    private final List<InfoBadgeDTO> notificationBadge;

    @NotNull
    private final TextAtom routeDescription;

    @NotNull
    private final TextAtom routeTitle;
    private final TextAtom showDetails;

    @NotNull
    private final TextAtom stopsHeader;

    @NotNull
    private final List<TrainStopList> trainsList;

    @NotNull
    private final List<TrainTransfer> trainsTransfer;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer;", "", "transfer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "train", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;)V", "getTransfer", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "getTrain", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Train", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TrainTransfer {
        public static final int $stable;

        @NotNull
        private final Train train;
        private final Transfer transfer;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainTransfer$Train;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Train {
            public static final int $stable = TextAtom.$stable | Icon.$stable;
            private final TextAtom description;

            @NotNull
            private final Icon icon;

            @NotNull
            private final TextAtom name;

            public Train(@NotNull Icon icon, @NotNull TextAtom name, TextAtom textAtom) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(name, "name");
                this.icon = icon;
                this.name = name;
                this.description = textAtom;
            }

            public static /* synthetic */ Train copy$default(Train train, Icon icon, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    icon = train.icon;
                }
                if ((i11 & 2) != 0) {
                    textAtom = train.name;
                }
                if ((i11 & 4) != 0) {
                    textAtom2 = train.description;
                }
                return train.copy(icon, textAtom, textAtom2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getName() {
                return this.name;
            }

            /* renamed from: component3, reason: from getter */
            public final TextAtom getDescription() {
                return this.description;
            }

            @NotNull
            public final Train copy(@NotNull Icon icon, @NotNull TextAtom name, TextAtom description) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(name, "name");
                return new Train(icon, name, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Train)) {
                    return false;
                }
                Train train = (Train) other;
                return Intrinsics.d(this.icon, train.icon) && Intrinsics.d(this.name, train.name) && Intrinsics.d(this.description, train.description);
            }

            public final TextAtom getDescription() {
                return this.description;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextAtom getName() {
                return this.name;
            }

            public int hashCode() {
                int b11 = C2619v.b(this.icon.hashCode() * 31, 31, this.name);
                TextAtom textAtom = this.description;
                return b11 + (textAtom == null ? 0 : textAtom.hashCode());
            }

            @NotNull
            public String toString() {
                Icon icon = this.icon;
                TextAtom textAtom = this.name;
                TextAtom textAtom2 = this.description;
                StringBuilder sb2 = new StringBuilder("Train(icon=");
                sb2.append(icon);
                sb2.append(", name=");
                sb2.append(textAtom);
                sb2.append(", description=");
                return b.g(sb2, textAtom2, ")");
            }
        }

        static {
            int i11 = TextAtom.$stable;
            int i12 = Icon.$stable;
            $stable = i11 | i11 | i12 | i11 | i11 | i12;
        }

        public TrainTransfer(Transfer transfer, @NotNull Train train) {
            Intrinsics.checkNotNullParameter(train, "train");
            this.transfer = transfer;
            this.train = train;
        }

        public static /* synthetic */ TrainTransfer copy$default(TrainTransfer trainTransfer, Transfer transfer, Train train, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                transfer = trainTransfer.transfer;
            }
            if ((i11 & 2) != 0) {
                train = trainTransfer.train;
            }
            return trainTransfer.copy(transfer, train);
        }

        /* renamed from: component1, reason: from getter */
        public final Transfer getTransfer() {
            return this.transfer;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Train getTrain() {
            return this.train;
        }

        @NotNull
        public final TrainTransfer copy(Transfer transfer, @NotNull Train train) {
            Intrinsics.checkNotNullParameter(train, "train");
            return new TrainTransfer(transfer, train);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainTransfer)) {
                return false;
            }
            TrainTransfer trainTransfer = (TrainTransfer) other;
            return Intrinsics.d(this.transfer, trainTransfer.transfer) && Intrinsics.d(this.train, trainTransfer.train);
        }

        @NotNull
        public final Train getTrain() {
            return this.train;
        }

        public final Transfer getTransfer() {
            return this.transfer;
        }

        public int hashCode() {
            Transfer transfer = this.transfer;
            return this.train.hashCode() + ((transfer == null ? 0 : transfer.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "TrainTransfer(transfer=" + this.transfer + ", train=" + this.train + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "time", "stationTransition", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "getStationTransition", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Transfer {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon icon;
        private final TextAtom stationTransition;

        @NotNull
        private final TextAtom time;

        @NotNull
        private final TextAtom title;

        public Transfer(@NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom time, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(time, "time");
            this.icon = icon;
            this.title = title;
            this.time = time;
            this.stationTransition = textAtom;
        }

        public static /* synthetic */ Transfer copy$default(Transfer transfer, Icon icon, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = transfer.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = transfer.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = transfer.time;
            }
            if ((i11 & 8) != 0) {
                textAtom3 = transfer.stationTransition;
            }
            return transfer.copy(icon, textAtom, textAtom2, textAtom3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getTime() {
            return this.time;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getStationTransition() {
            return this.stationTransition;
        }

        @NotNull
        public final Transfer copy(@NotNull Icon icon, @NotNull TextAtom title, @NotNull TextAtom time, TextAtom stationTransition) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(time, "time");
            return new Transfer(icon, title, time, stationTransition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) other;
            return Intrinsics.d(this.icon, transfer.icon) && Intrinsics.d(this.title, transfer.title) && Intrinsics.d(this.time, transfer.time) && Intrinsics.d(this.stationTransition, transfer.stationTransition);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public final TextAtom getStationTransition() {
            return this.stationTransition;
        }

        @NotNull
        public final TextAtom getTime() {
            return this.time;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(C2619v.b(this.icon.hashCode() * 31, 31, this.title), 31, this.time);
            TextAtom textAtom = this.stationTransition;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return "Transfer(icon=" + this.icon + ", title=" + this.title + ", time=" + this.time + ", stationTransition=" + this.stationTransition + ")";
        }
    }

    public TravelTrainRouteDTO(@NotNull TextAtom routeTitle, @NotNull List<InfoBadgeDTO> notificationBadge, @NotNull TextAtom date, @NotNull List<TrainTransfer> trainsTransfer, @NotNull TextAtom stopsHeader, TextAtom textAtom, TextAtom textAtom2, @NotNull List<TrainStopList> trainsList, @NotNull TextAtom routeDescription) {
        Intrinsics.checkNotNullParameter(routeTitle, "routeTitle");
        Intrinsics.checkNotNullParameter(notificationBadge, "notificationBadge");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(trainsTransfer, "trainsTransfer");
        Intrinsics.checkNotNullParameter(stopsHeader, "stopsHeader");
        Intrinsics.checkNotNullParameter(trainsList, "trainsList");
        Intrinsics.checkNotNullParameter(routeDescription, "routeDescription");
        this.routeTitle = routeTitle;
        this.notificationBadge = notificationBadge;
        this.date = date;
        this.trainsTransfer = trainsTransfer;
        this.stopsHeader = stopsHeader;
        this.showDetails = textAtom;
        this.hideDetails = textAtom2;
        this.trainsList = trainsList;
        this.routeDescription = routeDescription;
    }

    public static /* synthetic */ TravelTrainRouteDTO copy$default(TravelTrainRouteDTO travelTrainRouteDTO, TextAtom textAtom, List list, TextAtom textAtom2, List list2, TextAtom textAtom3, TextAtom textAtom4, TextAtom textAtom5, List list3, TextAtom textAtom6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelTrainRouteDTO.routeTitle;
        }
        if ((i11 & 2) != 0) {
            list = travelTrainRouteDTO.notificationBadge;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = travelTrainRouteDTO.date;
        }
        if ((i11 & 8) != 0) {
            list2 = travelTrainRouteDTO.trainsTransfer;
        }
        if ((i11 & 16) != 0) {
            textAtom3 = travelTrainRouteDTO.stopsHeader;
        }
        if ((i11 & 32) != 0) {
            textAtom4 = travelTrainRouteDTO.showDetails;
        }
        if ((i11 & 64) != 0) {
            textAtom5 = travelTrainRouteDTO.hideDetails;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list3 = travelTrainRouteDTO.trainsList;
        }
        if ((i11 & 256) != 0) {
            textAtom6 = travelTrainRouteDTO.routeDescription;
        }
        List list4 = list3;
        TextAtom textAtom7 = textAtom6;
        TextAtom textAtom8 = textAtom4;
        TextAtom textAtom9 = textAtom5;
        TextAtom textAtom10 = textAtom3;
        TextAtom textAtom11 = textAtom2;
        return travelTrainRouteDTO.copy(textAtom, list, textAtom11, list2, textAtom10, textAtom8, textAtom9, list4, textAtom7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getRouteTitle() {
        return this.routeTitle;
    }

    @NotNull
    public final List<InfoBadgeDTO> component2() {
        return this.notificationBadge;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getDate() {
        return this.date;
    }

    @NotNull
    public final List<TrainTransfer> component4() {
        return this.trainsTransfer;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextAtom getStopsHeader() {
        return this.stopsHeader;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getShowDetails() {
        return this.showDetails;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getHideDetails() {
        return this.hideDetails;
    }

    @NotNull
    public final List<TrainStopList> component8() {
        return this.trainsList;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final TextAtom getRouteDescription() {
        return this.routeDescription;
    }

    @NotNull
    public final TravelTrainRouteDTO copy(@NotNull TextAtom routeTitle, @NotNull List<InfoBadgeDTO> notificationBadge, @NotNull TextAtom date, @NotNull List<TrainTransfer> trainsTransfer, @NotNull TextAtom stopsHeader, TextAtom showDetails, TextAtom hideDetails, @NotNull List<TrainStopList> trainsList, @NotNull TextAtom routeDescription) {
        Intrinsics.checkNotNullParameter(routeTitle, "routeTitle");
        Intrinsics.checkNotNullParameter(notificationBadge, "notificationBadge");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(trainsTransfer, "trainsTransfer");
        Intrinsics.checkNotNullParameter(stopsHeader, "stopsHeader");
        Intrinsics.checkNotNullParameter(trainsList, "trainsList");
        Intrinsics.checkNotNullParameter(routeDescription, "routeDescription");
        return new TravelTrainRouteDTO(routeTitle, notificationBadge, date, trainsTransfer, stopsHeader, showDetails, hideDetails, trainsList, routeDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTrainRouteDTO)) {
            return false;
        }
        TravelTrainRouteDTO travelTrainRouteDTO = (TravelTrainRouteDTO) other;
        return Intrinsics.d(this.routeTitle, travelTrainRouteDTO.routeTitle) && Intrinsics.d(this.notificationBadge, travelTrainRouteDTO.notificationBadge) && Intrinsics.d(this.date, travelTrainRouteDTO.date) && Intrinsics.d(this.trainsTransfer, travelTrainRouteDTO.trainsTransfer) && Intrinsics.d(this.stopsHeader, travelTrainRouteDTO.stopsHeader) && Intrinsics.d(this.showDetails, travelTrainRouteDTO.showDetails) && Intrinsics.d(this.hideDetails, travelTrainRouteDTO.hideDetails) && Intrinsics.d(this.trainsList, travelTrainRouteDTO.trainsList) && Intrinsics.d(this.routeDescription, travelTrainRouteDTO.routeDescription);
    }

    @NotNull
    public final TextAtom getDate() {
        return this.date;
    }

    public final TextAtom getHideDetails() {
        return this.hideDetails;
    }

    @NotNull
    public final List<InfoBadgeDTO> getNotificationBadge() {
        return this.notificationBadge;
    }

    @NotNull
    public final TextAtom getRouteDescription() {
        return this.routeDescription;
    }

    @NotNull
    public final TextAtom getRouteTitle() {
        return this.routeTitle;
    }

    public final TextAtom getShowDetails() {
        return this.showDetails;
    }

    @NotNull
    public final TextAtom getStopsHeader() {
        return this.stopsHeader;
    }

    @NotNull
    public final List<TrainStopList> getTrainsList() {
        return this.trainsList;
    }

    @NotNull
    public final List<TrainTransfer> getTrainsTransfer() {
        return this.trainsTransfer;
    }

    public int hashCode() {
        int b11 = C2619v.b(g.b(C2619v.b(g.b(this.routeTitle.hashCode() * 31, 31, this.notificationBadge), 31, this.date), 31, this.trainsTransfer), 31, this.stopsHeader);
        TextAtom textAtom = this.showDetails;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.hideDetails;
        return this.routeDescription.hashCode() + g.b((hashCode + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31, 31, this.trainsList);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.routeTitle;
        List<InfoBadgeDTO> list = this.notificationBadge;
        TextAtom textAtom2 = this.date;
        List<TrainTransfer> list2 = this.trainsTransfer;
        TextAtom textAtom3 = this.stopsHeader;
        TextAtom textAtom4 = this.showDetails;
        TextAtom textAtom5 = this.hideDetails;
        List<TrainStopList> list3 = this.trainsList;
        TextAtom textAtom6 = this.routeDescription;
        StringBuilder sb2 = new StringBuilder("TravelTrainRouteDTO(routeTitle=");
        sb2.append(textAtom);
        sb2.append(", notificationBadge=");
        sb2.append(list);
        sb2.append(", date=");
        sb2.append(textAtom2);
        sb2.append(", trainsTransfer=");
        sb2.append(list2);
        sb2.append(", stopsHeader=");
        C4636t5.c(", showDetails=", ", hideDetails=", sb2, textAtom3, textAtom4);
        sb2.append(textAtom5);
        sb2.append(", trainsList=");
        sb2.append(list3);
        sb2.append(", routeDescription=");
        return b.g(sb2, textAtom6, ")");
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList;", "", "transfer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "stations", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList$StopStation;", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;Ljava/util/List;)V", "getTransfer", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$Transfer;", "getStations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StopStation", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TrainStopList {
        public static final int $stable = 8;

        @NotNull
        private final List<StopStation> stations;
        private final Transfer transfer;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/data/TravelTrainRouteDTO$TrainStopList$StopStation;", "", "arrivalTime", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "stopTime", "departureTime", "station", "isHidden", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "getArrivalTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStopTime", "getDepartureTime", "getStation", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StopStation {
            public static final int $stable = TextAtom.$stable;
            private final TextAtom arrivalTime;
            private final TextAtom departureTime;
            private final boolean isHidden;

            @NotNull
            private final TextAtom station;
            private final TextAtom stopTime;

            public StopStation(TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, @NotNull TextAtom station, boolean z11) {
                Intrinsics.checkNotNullParameter(station, "station");
                this.arrivalTime = textAtom;
                this.stopTime = textAtom2;
                this.departureTime = textAtom3;
                this.station = station;
                this.isHidden = z11;
            }

            public static /* synthetic */ StopStation copy$default(StopStation stopStation, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = stopStation.arrivalTime;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = stopStation.stopTime;
                }
                if ((i11 & 4) != 0) {
                    textAtom3 = stopStation.departureTime;
                }
                if ((i11 & 8) != 0) {
                    textAtom4 = stopStation.station;
                }
                if ((i11 & 16) != 0) {
                    z11 = stopStation.isHidden;
                }
                boolean z12 = z11;
                TextAtom textAtom5 = textAtom3;
                return stopStation.copy(textAtom, textAtom2, textAtom5, textAtom4, z12);
            }

            /* renamed from: component1, reason: from getter */
            public final TextAtom getArrivalTime() {
                return this.arrivalTime;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getStopTime() {
                return this.stopTime;
            }

            /* renamed from: component3, reason: from getter */
            public final TextAtom getDepartureTime() {
                return this.departureTime;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextAtom getStation() {
                return this.station;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsHidden() {
                return this.isHidden;
            }

            @NotNull
            public final StopStation copy(TextAtom arrivalTime, TextAtom stopTime, TextAtom departureTime, @NotNull TextAtom station, boolean isHidden) {
                Intrinsics.checkNotNullParameter(station, "station");
                return new StopStation(arrivalTime, stopTime, departureTime, station, isHidden);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StopStation)) {
                    return false;
                }
                StopStation stopStation = (StopStation) other;
                return Intrinsics.d(this.arrivalTime, stopStation.arrivalTime) && Intrinsics.d(this.stopTime, stopStation.stopTime) && Intrinsics.d(this.departureTime, stopStation.departureTime) && Intrinsics.d(this.station, stopStation.station) && this.isHidden == stopStation.isHidden;
            }

            public final TextAtom getArrivalTime() {
                return this.arrivalTime;
            }

            public final TextAtom getDepartureTime() {
                return this.departureTime;
            }

            @NotNull
            public final TextAtom getStation() {
                return this.station;
            }

            public final TextAtom getStopTime() {
                return this.stopTime;
            }

            public int hashCode() {
                TextAtom textAtom = this.arrivalTime;
                int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
                TextAtom textAtom2 = this.stopTime;
                int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
                TextAtom textAtom3 = this.departureTime;
                return Boolean.hashCode(this.isHidden) + C2619v.b((hashCode2 + (textAtom3 != null ? textAtom3.hashCode() : 0)) * 31, 31, this.station);
            }

            public final boolean isHidden() {
                return this.isHidden;
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.arrivalTime;
                TextAtom textAtom2 = this.stopTime;
                TextAtom textAtom3 = this.departureTime;
                TextAtom textAtom4 = this.station;
                boolean z11 = this.isHidden;
                StringBuilder a11 = a.a("StopStation(arrivalTime=", textAtom, ", stopTime=", textAtom2, ", departureTime=");
                C4636t5.c(", station=", ", isHidden=", a11, textAtom3, textAtom4);
                return Pk0.a.a(")", a11, z11);
            }
        }

        public TrainStopList(Transfer transfer, @NotNull List<StopStation> stations) {
            Intrinsics.checkNotNullParameter(stations, "stations");
            this.transfer = transfer;
            this.stations = stations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrainStopList copy$default(TrainStopList trainStopList, Transfer transfer, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                transfer = trainStopList.transfer;
            }
            if ((i11 & 2) != 0) {
                list = trainStopList.stations;
            }
            return trainStopList.copy(transfer, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Transfer getTransfer() {
            return this.transfer;
        }

        @NotNull
        public final List<StopStation> component2() {
            return this.stations;
        }

        @NotNull
        public final TrainStopList copy(Transfer transfer, @NotNull List<StopStation> stations) {
            Intrinsics.checkNotNullParameter(stations, "stations");
            return new TrainStopList(transfer, stations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainStopList)) {
                return false;
            }
            TrainStopList trainStopList = (TrainStopList) other;
            return Intrinsics.d(this.transfer, trainStopList.transfer) && Intrinsics.d(this.stations, trainStopList.stations);
        }

        @NotNull
        public final List<StopStation> getStations() {
            return this.stations;
        }

        public final Transfer getTransfer() {
            return this.transfer;
        }

        public int hashCode() {
            Transfer transfer = this.transfer;
            return this.stations.hashCode() + ((transfer == null ? 0 : transfer.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "TrainStopList(transfer=" + this.transfer + ", stations=" + this.stations + ")";
        }

        public TrainStopList(Transfer transfer, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(transfer, (i11 & 2) != 0 ? K.f71697a : list);
        }
    }

    public TravelTrainRouteDTO(TextAtom textAtom, List list, TextAtom textAtom2, List list2, TextAtom textAtom3, TextAtom textAtom4, TextAtom textAtom5, List list3, TextAtom textAtom6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, (i11 & 2) != 0 ? K.f71697a : list, textAtom2, (i11 & 8) != 0 ? K.f71697a : list2, textAtom3, textAtom4, textAtom5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? K.f71697a : list3, textAtom6);
    }
}
