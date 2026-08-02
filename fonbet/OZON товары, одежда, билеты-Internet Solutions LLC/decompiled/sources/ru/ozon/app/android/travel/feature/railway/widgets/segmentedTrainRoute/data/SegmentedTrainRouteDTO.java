package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data;

import D40.d;
import G.g;
import K1.G;
import Kk.C3532b;
import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005%&'()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "segmentList", "", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;", "widgetBehaviorType", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$WidgetBehaviorType;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$WidgetBehaviorType;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSegmentList", "()Ljava/util/List;", "getWidgetBehaviorType", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$WidgetBehaviorType;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "WidgetBehaviorType", "AsyncBehaviorType", "SegmentDTO", "StopsBlockDTO", "StopDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentedTrainRouteDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SegmentDTO> segmentList;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final WidgetBehaviorType widgetBehaviorType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "ACTION", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        @i(name = "ACTION")
        public static final AsyncBehaviorType ACTION = new AsyncBehaviorType("ACTION", 2);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE, ACTION};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$SegmentDTO;", "", "transferInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trainInfo", "serviceBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "stopsBlock", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;)V", "getTransferInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrainInfo", "getServiceBadges", "()Ljava/util/List;", "getStopsBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentDTO {
        public static final int $stable = 8;
        private final List<BadgeDTO> serviceBadges;

        @NotNull
        private final StopsBlockDTO stopsBlock;

        @NotNull
        private final CellDTO trainInfo;
        private final CellDTO transferInfo;

        public SegmentDTO(CellDTO cellDTO, @NotNull CellDTO trainInfo, List<BadgeDTO> list, @NotNull StopsBlockDTO stopsBlock) {
            Intrinsics.checkNotNullParameter(trainInfo, "trainInfo");
            Intrinsics.checkNotNullParameter(stopsBlock, "stopsBlock");
            this.transferInfo = cellDTO;
            this.trainInfo = trainInfo;
            this.serviceBadges = list;
            this.stopsBlock = stopsBlock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, CellDTO cellDTO, CellDTO cellDTO2, List list, StopsBlockDTO stopsBlockDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = segmentDTO.transferInfo;
            }
            if ((i11 & 2) != 0) {
                cellDTO2 = segmentDTO.trainInfo;
            }
            if ((i11 & 4) != 0) {
                list = segmentDTO.serviceBadges;
            }
            if ((i11 & 8) != 0) {
                stopsBlockDTO = segmentDTO.stopsBlock;
            }
            return segmentDTO.copy(cellDTO, cellDTO2, list, stopsBlockDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getTransferInfo() {
            return this.transferInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getTrainInfo() {
            return this.trainInfo;
        }

        public final List<BadgeDTO> component3() {
            return this.serviceBadges;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StopsBlockDTO getStopsBlock() {
            return this.stopsBlock;
        }

        @NotNull
        public final SegmentDTO copy(CellDTO transferInfo, @NotNull CellDTO trainInfo, List<BadgeDTO> serviceBadges, @NotNull StopsBlockDTO stopsBlock) {
            Intrinsics.checkNotNullParameter(trainInfo, "trainInfo");
            Intrinsics.checkNotNullParameter(stopsBlock, "stopsBlock");
            return new SegmentDTO(transferInfo, trainInfo, serviceBadges, stopsBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentDTO)) {
                return false;
            }
            SegmentDTO segmentDTO = (SegmentDTO) other;
            return Intrinsics.d(this.transferInfo, segmentDTO.transferInfo) && Intrinsics.d(this.trainInfo, segmentDTO.trainInfo) && Intrinsics.d(this.serviceBadges, segmentDTO.serviceBadges) && Intrinsics.d(this.stopsBlock, segmentDTO.stopsBlock);
        }

        public final List<BadgeDTO> getServiceBadges() {
            return this.serviceBadges;
        }

        @NotNull
        public final StopsBlockDTO getStopsBlock() {
            return this.stopsBlock;
        }

        @NotNull
        public final CellDTO getTrainInfo() {
            return this.trainInfo;
        }

        public final CellDTO getTransferInfo() {
            return this.transferInfo;
        }

        public int hashCode() {
            CellDTO cellDTO = this.transferInfo;
            int c11 = Bi.b.c(this.trainInfo, (cellDTO == null ? 0 : cellDTO.hashCode()) * 31, 31);
            List<BadgeDTO> list = this.serviceBadges;
            return this.stopsBlock.hashCode() + ((c11 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "SegmentDTO(transferInfo=" + this.transferInfo + ", trainInfo=" + this.trainInfo + ", serviceBadges=" + this.serviceBadges + ", stopsBlock=" + this.stopsBlock + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopsBlockDTO;", "", "stops", "", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopDTO;", "localTimeInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "toggleDetailsButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getStops", "()Ljava/util/List;", "getLocalTimeInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getToggleDetailsButton", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopsBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO localTimeInfo;

        @NotNull
        private final List<StopDTO> stops;
        private final CellDTO toggleDetailsButton;

        public StopsBlockDTO(@NotNull List<StopDTO> stops, @NotNull TextDTO localTimeInfo, CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(stops, "stops");
            Intrinsics.checkNotNullParameter(localTimeInfo, "localTimeInfo");
            this.stops = stops;
            this.localTimeInfo = localTimeInfo;
            this.toggleDetailsButton = cellDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StopsBlockDTO copy$default(StopsBlockDTO stopsBlockDTO, List list, TextDTO textDTO, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = stopsBlockDTO.stops;
            }
            if ((i11 & 2) != 0) {
                textDTO = stopsBlockDTO.localTimeInfo;
            }
            if ((i11 & 4) != 0) {
                cellDTO = stopsBlockDTO.toggleDetailsButton;
            }
            return stopsBlockDTO.copy(list, textDTO, cellDTO);
        }

        @NotNull
        public final List<StopDTO> component1() {
            return this.stops;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getLocalTimeInfo() {
            return this.localTimeInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final CellDTO getToggleDetailsButton() {
            return this.toggleDetailsButton;
        }

        @NotNull
        public final StopsBlockDTO copy(@NotNull List<StopDTO> stops, @NotNull TextDTO localTimeInfo, CellDTO toggleDetailsButton) {
            Intrinsics.checkNotNullParameter(stops, "stops");
            Intrinsics.checkNotNullParameter(localTimeInfo, "localTimeInfo");
            return new StopsBlockDTO(stops, localTimeInfo, toggleDetailsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopsBlockDTO)) {
                return false;
            }
            StopsBlockDTO stopsBlockDTO = (StopsBlockDTO) other;
            return Intrinsics.d(this.stops, stopsBlockDTO.stops) && Intrinsics.d(this.localTimeInfo, stopsBlockDTO.localTimeInfo) && Intrinsics.d(this.toggleDetailsButton, stopsBlockDTO.toggleDetailsButton);
        }

        @NotNull
        public final TextDTO getLocalTimeInfo() {
            return this.localTimeInfo;
        }

        @NotNull
        public final List<StopDTO> getStops() {
            return this.stops;
        }

        public final CellDTO getToggleDetailsButton() {
            return this.toggleDetailsButton;
        }

        public int hashCode() {
            int a11 = Ns.b.a(this.localTimeInfo, this.stops.hashCode() * 31, 31);
            CellDTO cellDTO = this.toggleDetailsButton;
            return a11 + (cellDTO == null ? 0 : cellDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "StopsBlockDTO(stops=" + this.stops + ", localTimeInfo=" + this.localTimeInfo + ", toggleDetailsButton=" + this.toggleDetailsButton + ")";
        }
    }

    public SegmentedTrainRouteDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<SegmentDTO> segmentList, @NotNull WidgetBehaviorType widgetBehaviorType, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(segmentList, "segmentList");
        Intrinsics.checkNotNullParameter(widgetBehaviorType, "widgetBehaviorType");
        this.title = title;
        this.subtitle = textDTO;
        this.segmentList = segmentList;
        this.widgetBehaviorType = widgetBehaviorType;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SegmentedTrainRouteDTO copy$default(SegmentedTrainRouteDTO segmentedTrainRouteDTO, TextDTO textDTO, TextDTO textDTO2, List list, WidgetBehaviorType widgetBehaviorType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = segmentedTrainRouteDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = segmentedTrainRouteDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = segmentedTrainRouteDTO.segmentList;
        }
        if ((i11 & 8) != 0) {
            widgetBehaviorType = segmentedTrainRouteDTO.widgetBehaviorType;
        }
        if ((i11 & 16) != 0) {
            map = segmentedTrainRouteDTO.trackingInfo;
        }
        Map map2 = map;
        List list2 = list;
        return segmentedTrainRouteDTO.copy(textDTO, textDTO2, list2, widgetBehaviorType, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<SegmentDTO> component3() {
        return this.segmentList;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WidgetBehaviorType getWidgetBehaviorType() {
        return this.widgetBehaviorType;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SegmentedTrainRouteDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<SegmentDTO> segmentList, @NotNull WidgetBehaviorType widgetBehaviorType, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(segmentList, "segmentList");
        Intrinsics.checkNotNullParameter(widgetBehaviorType, "widgetBehaviorType");
        return new SegmentedTrainRouteDTO(title, subtitle, segmentList, widgetBehaviorType, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentedTrainRouteDTO)) {
            return false;
        }
        SegmentedTrainRouteDTO segmentedTrainRouteDTO = (SegmentedTrainRouteDTO) other;
        return Intrinsics.d(this.title, segmentedTrainRouteDTO.title) && Intrinsics.d(this.subtitle, segmentedTrainRouteDTO.subtitle) && Intrinsics.d(this.segmentList, segmentedTrainRouteDTO.segmentList) && Intrinsics.d(this.widgetBehaviorType, segmentedTrainRouteDTO.widgetBehaviorType) && Intrinsics.d(this.trackingInfo, segmentedTrainRouteDTO.trackingInfo);
    }

    @NotNull
    public final List<SegmentDTO> getSegmentList() {
        return this.segmentList;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final WidgetBehaviorType getWidgetBehaviorType() {
        return this.widgetBehaviorType;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (this.widgetBehaviorType.hashCode() + g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.segmentList)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<SegmentDTO> list = this.segmentList;
        WidgetBehaviorType widgetBehaviorType = this.widgetBehaviorType;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("SegmentedTrainRouteDTO(title=", textDTO, ", subtitle=", textDTO2, ", segmentList=");
        g10.append(list);
        g10.append(", widgetBehaviorType=");
        g10.append(widgetBehaviorType);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$WidgetBehaviorType;", "", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "hasTransfer", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;ZLru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$AsyncBehaviorType;", "getHasTransfer", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetBehaviorType {
        public static final int $stable = 0;
        private final AtomActionDTO action;

        @NotNull
        private final AsyncBehaviorType asyncBehaviorType;
        private final boolean hasTransfer;

        public WidgetBehaviorType(@NotNull AsyncBehaviorType asyncBehaviorType, boolean z11, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
            this.asyncBehaviorType = asyncBehaviorType;
            this.hasTransfer = z11;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ WidgetBehaviorType copy$default(WidgetBehaviorType widgetBehaviorType, AsyncBehaviorType asyncBehaviorType, boolean z11, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                asyncBehaviorType = widgetBehaviorType.asyncBehaviorType;
            }
            if ((i11 & 2) != 0) {
                z11 = widgetBehaviorType.hasTransfer;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = widgetBehaviorType.action;
            }
            return widgetBehaviorType.copy(asyncBehaviorType, z11, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AsyncBehaviorType getAsyncBehaviorType() {
            return this.asyncBehaviorType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasTransfer() {
            return this.hasTransfer;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final WidgetBehaviorType copy(@NotNull AsyncBehaviorType asyncBehaviorType, boolean hasTransfer, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
            return new WidgetBehaviorType(asyncBehaviorType, hasTransfer, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetBehaviorType)) {
                return false;
            }
            WidgetBehaviorType widgetBehaviorType = (WidgetBehaviorType) other;
            return this.asyncBehaviorType == widgetBehaviorType.asyncBehaviorType && this.hasTransfer == widgetBehaviorType.hasTransfer && Intrinsics.d(this.action, widgetBehaviorType.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final AsyncBehaviorType getAsyncBehaviorType() {
            return this.asyncBehaviorType;
        }

        public final boolean getHasTransfer() {
            return this.hasTransfer;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.asyncBehaviorType.hashCode() * 31, 31, this.hasTransfer);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
            boolean z11 = this.hasTransfer;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("WidgetBehaviorType(asyncBehaviorType=");
            sb2.append(asyncBehaviorType);
            sb2.append(", hasTransfer=");
            sb2.append(z11);
            sb2.append(", action=");
            return G.c(sb2, atomActionDTO, ")");
        }

        public /* synthetic */ WidgetBehaviorType(AsyncBehaviorType asyncBehaviorType, boolean z11, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(asyncBehaviorType, (i11 & 2) != 0 ? false : z11, atomActionDTO);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/data/SegmentedTrainRouteDTO$StopDTO;", "", "arrivalTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "departureTime", "city", "station", "isBoardingStop", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getArrivalTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDepartureTime", "getCity", "getStation", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopDTO {
        public static final int $stable = 0;

        @NotNull
        private final TextDTO arrivalTime;

        @NotNull
        private final TextDTO city;
        private final TextDTO departureTime;
        private final boolean isBoardingStop;
        private final TextDTO station;

        public StopDTO(@NotNull TextDTO arrivalTime, TextDTO textDTO, @NotNull TextDTO city, TextDTO textDTO2, boolean z11) {
            Intrinsics.checkNotNullParameter(arrivalTime, "arrivalTime");
            Intrinsics.checkNotNullParameter(city, "city");
            this.arrivalTime = arrivalTime;
            this.departureTime = textDTO;
            this.city = city;
            this.station = textDTO2;
            this.isBoardingStop = z11;
        }

        public static /* synthetic */ StopDTO copy$default(StopDTO stopDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = stopDTO.arrivalTime;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = stopDTO.departureTime;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = stopDTO.city;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = stopDTO.station;
            }
            if ((i11 & 16) != 0) {
                z11 = stopDTO.isBoardingStop;
            }
            boolean z12 = z11;
            TextDTO textDTO5 = textDTO3;
            return stopDTO.copy(textDTO, textDTO2, textDTO5, textDTO4, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getArrivalTime() {
            return this.arrivalTime;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getDepartureTime() {
            return this.departureTime;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getCity() {
            return this.city;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getStation() {
            return this.station;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBoardingStop() {
            return this.isBoardingStop;
        }

        @NotNull
        public final StopDTO copy(@NotNull TextDTO arrivalTime, TextDTO departureTime, @NotNull TextDTO city, TextDTO station, boolean isBoardingStop) {
            Intrinsics.checkNotNullParameter(arrivalTime, "arrivalTime");
            Intrinsics.checkNotNullParameter(city, "city");
            return new StopDTO(arrivalTime, departureTime, city, station, isBoardingStop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopDTO)) {
                return false;
            }
            StopDTO stopDTO = (StopDTO) other;
            return Intrinsics.d(this.arrivalTime, stopDTO.arrivalTime) && Intrinsics.d(this.departureTime, stopDTO.departureTime) && Intrinsics.d(this.city, stopDTO.city) && Intrinsics.d(this.station, stopDTO.station) && this.isBoardingStop == stopDTO.isBoardingStop;
        }

        @NotNull
        public final TextDTO getArrivalTime() {
            return this.arrivalTime;
        }

        @NotNull
        public final TextDTO getCity() {
            return this.city;
        }

        public final TextDTO getDepartureTime() {
            return this.departureTime;
        }

        public final TextDTO getStation() {
            return this.station;
        }

        public int hashCode() {
            int hashCode = this.arrivalTime.hashCode() * 31;
            TextDTO textDTO = this.departureTime;
            int a11 = Ns.b.a(this.city, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
            TextDTO textDTO2 = this.station;
            return Boolean.hashCode(this.isBoardingStop) + ((a11 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
        }

        public final boolean isBoardingStop() {
            return this.isBoardingStop;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.arrivalTime;
            TextDTO textDTO2 = this.departureTime;
            TextDTO textDTO3 = this.city;
            TextDTO textDTO4 = this.station;
            boolean z11 = this.isBoardingStop;
            StringBuilder g10 = D3.g.g("StopDTO(arrivalTime=", textDTO, ", departureTime=", textDTO2, ", city=");
            d.e(", station=", ", isBoardingStop=", g10, textDTO3, textDTO4);
            return Pk0.a.a(")", g10, z11);
        }

        public /* synthetic */ StopDTO(TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, textDTO3, textDTO4, (i11 & 16) != 0 ? false : z11);
        }
    }

    public SegmentedTrainRouteDTO(TextDTO textDTO, TextDTO textDTO2, List list, WidgetBehaviorType widgetBehaviorType, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, (i11 & 4) != 0 ? K.f71697a : list, widgetBehaviorType, map);
    }
}
