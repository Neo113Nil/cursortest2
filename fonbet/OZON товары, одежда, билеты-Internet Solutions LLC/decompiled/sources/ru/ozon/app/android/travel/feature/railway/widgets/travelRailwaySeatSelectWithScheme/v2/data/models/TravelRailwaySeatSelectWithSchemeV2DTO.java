package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import Cm.e;
import Ef0.c;
import G.g;
import HY.b;
import Hj.C3143a;
import I0.C3173b;
import J0.P;
import K1.G;
import N3.C3660k;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.tabsSelector.TabSelectorDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\b;<=>?@ABB\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u009b\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00052\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;", "tabSelector", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "seats", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", "seatTypes", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatTypeDTO;", "darkSchemeLink", "", "lightSchemeLink", "trainDirection", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TrainDirectionDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "compartmentGenders", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;", "genderIndicator", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$GenderIndicatorDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TrainDirectionDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getTabSelector", "()Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "getSeats", "()Ljava/util/List;", "getSeatTypes", "getDarkSchemeLink", "()Ljava/lang/String;", "getLightSchemeLink", "getTrainDirection", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TrainDirectionDTO;", "getFooter", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "getCompartmentGenders", "getGenderIndicator", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TrainDirectionDTO", "SeatDTO", "SelectedSeatDTO", "TooltipPosition", "SeatTypeDTO", "TextRectangle", "RectDTO", "GenderIndicatorDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectWithSchemeV2DTO implements TravelRailwaySeatSelectFooterWrapper {
    public static final int $stable = 8;
    private final List<TextRectangle> compartmentGenders;

    @NotNull
    private final String darkSchemeLink;

    @NotNull
    private final TravelRailwaySeatSelectFooterDTO footer;
    private final List<GenderIndicatorDTO> genderIndicator;

    @NotNull
    private final String lightSchemeLink;

    @NotNull
    private final List<SeatTypeDTO> seatTypes;

    @NotNull
    private final List<SeatDTO> seats;
    private final TabSelectorDTO tabSelector;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final TrainDirectionDTO trainDirection;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$GenderIndicatorDTO;", "", "layout", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getLayout", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderIndicatorDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final RectDTO layout;

        public GenderIndicatorDTO(@NotNull RectDTO layout, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.layout = layout;
            this.icon = icon;
        }

        public static /* synthetic */ GenderIndicatorDTO copy$default(GenderIndicatorDTO genderIndicatorDTO, RectDTO rectDTO, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rectDTO = genderIndicatorDTO.layout;
            }
            if ((i11 & 2) != 0) {
                iconDTO = genderIndicatorDTO.icon;
            }
            return genderIndicatorDTO.copy(rectDTO, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RectDTO getLayout() {
            return this.layout;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final GenderIndicatorDTO copy(@NotNull RectDTO layout, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new GenderIndicatorDTO(layout, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenderIndicatorDTO)) {
                return false;
            }
            GenderIndicatorDTO genderIndicatorDTO = (GenderIndicatorDTO) other;
            return Intrinsics.d(this.layout, genderIndicatorDTO.layout) && Intrinsics.d(this.icon, genderIndicatorDTO.icon);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final RectDTO getLayout() {
            return this.layout;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.layout.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "GenderIndicatorDTO(layout=" + this.layout + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;", "", "x", "", "y", "width", "height", "<init>", "(IIII)V", "getX", "()I", "getY", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RectDTO {
        public static final int $stable = 0;
        private final int height;
        private final int width;
        private final int x;
        private final int y;

        public RectDTO(int i11, int i12, int i13, int i14) {
            this.x = i11;
            this.y = i12;
            this.width = i13;
            this.height = i14;
        }

        public static /* synthetic */ RectDTO copy$default(RectDTO rectDTO, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = rectDTO.x;
            }
            if ((i15 & 2) != 0) {
                i12 = rectDTO.y;
            }
            if ((i15 & 4) != 0) {
                i13 = rectDTO.width;
            }
            if ((i15 & 8) != 0) {
                i14 = rectDTO.height;
            }
            return rectDTO.copy(i11, i12, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final RectDTO copy(int x11, int y11, int width, int height) {
            return new RectDTO(x11, y11, width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RectDTO)) {
                return false;
            }
            RectDTO rectDTO = (RectDTO) other;
            return this.x == rectDTO.x && this.y == rectDTO.y && this.width == rectDTO.width && this.height == rectDTO.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + C2454a.a(this.width, C2454a.a(this.y, Integer.hashCode(this.x) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.width, this.height, ", height=", ")", C2438a.a("RectDTO(x=", this.x, ", y=", ", width=", this.y));
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010$\u001a\u00020\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\t\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "selectedSeat", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;", "x", "", "y", "isTopLayer", "", "seatTypeName", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSelectedSeat", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;", "getX", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getY", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSeatTypeName", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatDTO;", "equals", "other", "hashCode", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatDTO {
        public static final int $stable = IconDTO.$stable;
        private final AtomActionDTO action;
        private final Boolean isTopLayer;
        private final TextDTO number;

        @NotNull
        private final String seatTypeName;
        private final SelectedSeatDTO selectedSeat;
        private final Integer x;
        private final Integer y;

        public SeatDTO(TextDTO textDTO, SelectedSeatDTO selectedSeatDTO, Integer num, Integer num2, Boolean bool, @NotNull String seatTypeName, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(seatTypeName, "seatTypeName");
            this.number = textDTO;
            this.selectedSeat = selectedSeatDTO;
            this.x = num;
            this.y = num2;
            this.isTopLayer = bool;
            this.seatTypeName = seatTypeName;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ SeatDTO copy$default(SeatDTO seatDTO, TextDTO textDTO, SelectedSeatDTO selectedSeatDTO, Integer num, Integer num2, Boolean bool, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = seatDTO.number;
            }
            if ((i11 & 2) != 0) {
                selectedSeatDTO = seatDTO.selectedSeat;
            }
            if ((i11 & 4) != 0) {
                num = seatDTO.x;
            }
            if ((i11 & 8) != 0) {
                num2 = seatDTO.y;
            }
            if ((i11 & 16) != 0) {
                bool = seatDTO.isTopLayer;
            }
            if ((i11 & 32) != 0) {
                str = seatDTO.seatTypeName;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = seatDTO.action;
            }
            String str2 = str;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Boolean bool2 = bool;
            Integer num3 = num;
            return seatDTO.copy(textDTO, selectedSeatDTO, num3, num2, bool2, str2, atomActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        /* renamed from: component2, reason: from getter */
        public final SelectedSeatDTO getSelectedSeat() {
            return this.selectedSeat;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getX() {
            return this.x;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getY() {
            return this.y;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsTopLayer() {
            return this.isTopLayer;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getSeatTypeName() {
            return this.seatTypeName;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final SeatDTO copy(TextDTO number, SelectedSeatDTO selectedSeat, Integer x11, Integer y11, Boolean isTopLayer, @NotNull String seatTypeName, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(seatTypeName, "seatTypeName");
            return new SeatDTO(number, selectedSeat, x11, y11, isTopLayer, seatTypeName, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatDTO)) {
                return false;
            }
            SeatDTO seatDTO = (SeatDTO) other;
            return Intrinsics.d(this.number, seatDTO.number) && Intrinsics.d(this.selectedSeat, seatDTO.selectedSeat) && Intrinsics.d(this.x, seatDTO.x) && Intrinsics.d(this.y, seatDTO.y) && Intrinsics.d(this.isTopLayer, seatDTO.isTopLayer) && Intrinsics.d(this.seatTypeName, seatDTO.seatTypeName) && Intrinsics.d(this.action, seatDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TextDTO getNumber() {
            return this.number;
        }

        @NotNull
        public final String getSeatTypeName() {
            return this.seatTypeName;
        }

        public final SelectedSeatDTO getSelectedSeat() {
            return this.selectedSeat;
        }

        public final Integer getX() {
            return this.x;
        }

        public final Integer getY() {
            return this.y;
        }

        public int hashCode() {
            TextDTO textDTO = this.number;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            SelectedSeatDTO selectedSeatDTO = this.selectedSeat;
            int hashCode2 = (hashCode + (selectedSeatDTO == null ? 0 : selectedSeatDTO.hashCode())) * 31;
            Integer num = this.x;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.y;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.isTopLayer;
            int a11 = g.a((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.seatTypeName);
            AtomActionDTO atomActionDTO = this.action;
            return a11 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        public final Boolean isTopLayer() {
            return this.isTopLayer;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.number;
            SelectedSeatDTO selectedSeatDTO = this.selectedSeat;
            Integer num = this.x;
            Integer num2 = this.y;
            Boolean bool = this.isTopLayer;
            String str = this.seatTypeName;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("SeatDTO(number=");
            sb2.append(textDTO);
            sb2.append(", selectedSeat=");
            sb2.append(selectedSeatDTO);
            sb2.append(", x=");
            c.e(sb2, num, ", y=", num2, ", isTopLayer=");
            b.c(bool, ", seatTypeName=", str, ", action=", sb2);
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SeatTypeDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "darkImageLink", "lightImageLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDarkImageLink", "getLightImageLink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatTypeDTO {
        public static final int $stable = 0;

        @NotNull
        private final String darkImageLink;

        @NotNull
        private final String lightImageLink;

        @NotNull
        private final String name;

        public SeatTypeDTO(@NotNull String name, @NotNull String darkImageLink, @NotNull String lightImageLink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(darkImageLink, "darkImageLink");
            Intrinsics.checkNotNullParameter(lightImageLink, "lightImageLink");
            this.name = name;
            this.darkImageLink = darkImageLink;
            this.lightImageLink = lightImageLink;
        }

        public static /* synthetic */ SeatTypeDTO copy$default(SeatTypeDTO seatTypeDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = seatTypeDTO.name;
            }
            if ((i11 & 2) != 0) {
                str2 = seatTypeDTO.darkImageLink;
            }
            if ((i11 & 4) != 0) {
                str3 = seatTypeDTO.lightImageLink;
            }
            return seatTypeDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDarkImageLink() {
            return this.darkImageLink;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLightImageLink() {
            return this.lightImageLink;
        }

        @NotNull
        public final SeatTypeDTO copy(@NotNull String name, @NotNull String darkImageLink, @NotNull String lightImageLink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(darkImageLink, "darkImageLink");
            Intrinsics.checkNotNullParameter(lightImageLink, "lightImageLink");
            return new SeatTypeDTO(name, darkImageLink, lightImageLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeatTypeDTO)) {
                return false;
            }
            SeatTypeDTO seatTypeDTO = (SeatTypeDTO) other;
            return Intrinsics.d(this.name, seatTypeDTO.name) && Intrinsics.d(this.darkImageLink, seatTypeDTO.darkImageLink) && Intrinsics.d(this.lightImageLink, seatTypeDTO.lightImageLink);
        }

        @NotNull
        public final String getDarkImageLink() {
            return this.darkImageLink;
        }

        @NotNull
        public final String getLightImageLink() {
            return this.lightImageLink;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.lightImageLink.hashCode() + g.a(this.name.hashCode() * 31, 31, this.darkImageLink);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.darkImageLink;
            return o0.c(C3660k.d("SeatTypeDTO(name=", str, ", darkImageLink=", str2, ", lightImageLink="), this.lightImageLink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TextRectangle;", "", "text", "", "textRectangleLayout", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;", "textStyle", "textColor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextRectangleLayout", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$RectDTO;", "getTextStyle", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextRectangle {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        @NotNull
        private final String textColor;

        @NotNull
        private final RectDTO textRectangleLayout;

        @NotNull
        private final String textStyle;

        public TextRectangle(@NotNull String text, @NotNull RectDTO textRectangleLayout, @NotNull String textStyle, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textRectangleLayout, "textRectangleLayout");
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.text = text;
            this.textRectangleLayout = textRectangleLayout;
            this.textStyle = textStyle;
            this.textColor = textColor;
        }

        public static /* synthetic */ TextRectangle copy$default(TextRectangle textRectangle, String str, RectDTO rectDTO, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textRectangle.text;
            }
            if ((i11 & 2) != 0) {
                rectDTO = textRectangle.textRectangleLayout;
            }
            if ((i11 & 4) != 0) {
                str2 = textRectangle.textStyle;
            }
            if ((i11 & 8) != 0) {
                str3 = textRectangle.textColor;
            }
            return textRectangle.copy(str, rectDTO, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final RectDTO getTextRectangleLayout() {
            return this.textRectangleLayout;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTextStyle() {
            return this.textStyle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final TextRectangle copy(@NotNull String text, @NotNull RectDTO textRectangleLayout, @NotNull String textStyle, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textRectangleLayout, "textRectangleLayout");
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new TextRectangle(text, textRectangleLayout, textStyle, textColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextRectangle)) {
                return false;
            }
            TextRectangle textRectangle = (TextRectangle) other;
            return Intrinsics.d(this.text, textRectangle.text) && Intrinsics.d(this.textRectangleLayout, textRectangle.textRectangleLayout) && Intrinsics.d(this.textStyle, textRectangle.textStyle) && Intrinsics.d(this.textColor, textRectangle.textColor);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final RectDTO getTextRectangleLayout() {
            return this.textRectangleLayout;
        }

        @NotNull
        public final String getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            return this.textColor.hashCode() + g.a((this.textRectangleLayout.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.textStyle);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            RectDTO rectDTO = this.textRectangleLayout;
            String str2 = this.textStyle;
            String str3 = this.textColor;
            StringBuilder sb2 = new StringBuilder("TextRectangle(text=");
            sb2.append(str);
            sb2.append(", textRectangleLayout=");
            sb2.append(rectDTO);
            sb2.append(", textStyle=");
            return C3173b.c(sb2, str2, ", textColor=", str3, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TooltipPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TooltipPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TooltipPosition[] $VALUES;

        @i(name = "top")
        public static final TooltipPosition TOP = new TooltipPosition("TOP", 0);

        @i(name = "bottom")
        public static final TooltipPosition BOTTOM = new TooltipPosition("BOTTOM", 1);

        private static final /* synthetic */ TooltipPosition[] $values() {
            return new TooltipPosition[]{TOP, BOTTOM};
        }

        static {
            TooltipPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private TooltipPosition(String str, int i11) {
        }

        public static TooltipPosition valueOf(String str) {
            return (TooltipPosition) Enum.valueOf(TooltipPosition.class, str);
        }

        public static TooltipPosition[] values() {
            return (TooltipPosition[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TrainDirectionDTO;", "", "description", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainDirectionDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final TextDTO description;

        @NotNull
        private final IconDTO icon;

        public TrainDirectionDTO(@NotNull TextDTO description, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.description = description;
            this.icon = icon;
        }

        public static /* synthetic */ TrainDirectionDTO copy$default(TrainDirectionDTO trainDirectionDTO, TextDTO textDTO, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = trainDirectionDTO.description;
            }
            if ((i11 & 2) != 0) {
                iconDTO = trainDirectionDTO.icon;
            }
            return trainDirectionDTO.copy(textDTO, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TrainDirectionDTO copy(@NotNull TextDTO description, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new TrainDirectionDTO(description, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainDirectionDTO)) {
                return false;
            }
            TrainDirectionDTO trainDirectionDTO = (TrainDirectionDTO) other;
            return Intrinsics.d(this.description, trainDirectionDTO.description) && Intrinsics.d(this.icon, trainDirectionDTO.icon);
        }

        @NotNull
        public final TextDTO getDescription() {
            return this.description;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.description.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TrainDirectionDTO(description=" + this.description + ", icon=" + this.icon + ")";
        }
    }

    public TravelRailwaySeatSelectWithSchemeV2DTO(TabSelectorDTO tabSelectorDTO, @NotNull List<SeatDTO> seats, @NotNull List<SeatTypeDTO> seatTypes, @NotNull String darkSchemeLink, @NotNull String lightSchemeLink, TrainDirectionDTO trainDirectionDTO, @NotNull TravelRailwaySeatSelectFooterDTO footer, List<TextRectangle> list, List<GenderIndicatorDTO> list2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(seats, "seats");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        Intrinsics.checkNotNullParameter(darkSchemeLink, "darkSchemeLink");
        Intrinsics.checkNotNullParameter(lightSchemeLink, "lightSchemeLink");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.tabSelector = tabSelectorDTO;
        this.seats = seats;
        this.seatTypes = seatTypes;
        this.darkSchemeLink = darkSchemeLink;
        this.lightSchemeLink = lightSchemeLink;
        this.trainDirection = trainDirectionDTO;
        this.footer = footer;
        this.compartmentGenders = list;
        this.genderIndicator = list2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelRailwaySeatSelectWithSchemeV2DTO copy$default(TravelRailwaySeatSelectWithSchemeV2DTO travelRailwaySeatSelectWithSchemeV2DTO, TabSelectorDTO tabSelectorDTO, List list, List list2, String str, String str2, TrainDirectionDTO trainDirectionDTO, TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO, List list3, List list4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tabSelectorDTO = travelRailwaySeatSelectWithSchemeV2DTO.tabSelector;
        }
        if ((i11 & 2) != 0) {
            list = travelRailwaySeatSelectWithSchemeV2DTO.seats;
        }
        if ((i11 & 4) != 0) {
            list2 = travelRailwaySeatSelectWithSchemeV2DTO.seatTypes;
        }
        if ((i11 & 8) != 0) {
            str = travelRailwaySeatSelectWithSchemeV2DTO.darkSchemeLink;
        }
        if ((i11 & 16) != 0) {
            str2 = travelRailwaySeatSelectWithSchemeV2DTO.lightSchemeLink;
        }
        if ((i11 & 32) != 0) {
            trainDirectionDTO = travelRailwaySeatSelectWithSchemeV2DTO.trainDirection;
        }
        if ((i11 & 64) != 0) {
            travelRailwaySeatSelectFooterDTO = travelRailwaySeatSelectWithSchemeV2DTO.footer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list3 = travelRailwaySeatSelectWithSchemeV2DTO.compartmentGenders;
        }
        if ((i11 & 256) != 0) {
            list4 = travelRailwaySeatSelectWithSchemeV2DTO.genderIndicator;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = travelRailwaySeatSelectWithSchemeV2DTO.trackingInfo;
        }
        List list5 = list4;
        Map map2 = map;
        TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO2 = travelRailwaySeatSelectFooterDTO;
        List list6 = list3;
        String str3 = str2;
        TrainDirectionDTO trainDirectionDTO2 = trainDirectionDTO;
        return travelRailwaySeatSelectWithSchemeV2DTO.copy(tabSelectorDTO, list, list2, str, str3, trainDirectionDTO2, travelRailwaySeatSelectFooterDTO2, list6, list5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TabSelectorDTO getTabSelector() {
        return this.tabSelector;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<SeatDTO> component2() {
        return this.seats;
    }

    @NotNull
    public final List<SeatTypeDTO> component3() {
        return this.seatTypes;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDarkSchemeLink() {
        return this.darkSchemeLink;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLightSchemeLink() {
        return this.lightSchemeLink;
    }

    /* renamed from: component6, reason: from getter */
    public final TrainDirectionDTO getTrainDirection() {
        return this.trainDirection;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TravelRailwaySeatSelectFooterDTO getFooter() {
        return this.footer;
    }

    public final List<TextRectangle> component8() {
        return this.compartmentGenders;
    }

    public final List<GenderIndicatorDTO> component9() {
        return this.genderIndicator;
    }

    @NotNull
    public final TravelRailwaySeatSelectWithSchemeV2DTO copy(TabSelectorDTO tabSelector, @NotNull List<SeatDTO> seats, @NotNull List<SeatTypeDTO> seatTypes, @NotNull String darkSchemeLink, @NotNull String lightSchemeLink, TrainDirectionDTO trainDirection, @NotNull TravelRailwaySeatSelectFooterDTO footer, List<TextRectangle> compartmentGenders, List<GenderIndicatorDTO> genderIndicator, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(seats, "seats");
        Intrinsics.checkNotNullParameter(seatTypes, "seatTypes");
        Intrinsics.checkNotNullParameter(darkSchemeLink, "darkSchemeLink");
        Intrinsics.checkNotNullParameter(lightSchemeLink, "lightSchemeLink");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new TravelRailwaySeatSelectWithSchemeV2DTO(tabSelector, seats, seatTypes, darkSchemeLink, lightSchemeLink, trainDirection, footer, compartmentGenders, genderIndicator, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectWithSchemeV2DTO)) {
            return false;
        }
        TravelRailwaySeatSelectWithSchemeV2DTO travelRailwaySeatSelectWithSchemeV2DTO = (TravelRailwaySeatSelectWithSchemeV2DTO) other;
        return Intrinsics.d(this.tabSelector, travelRailwaySeatSelectWithSchemeV2DTO.tabSelector) && Intrinsics.d(this.seats, travelRailwaySeatSelectWithSchemeV2DTO.seats) && Intrinsics.d(this.seatTypes, travelRailwaySeatSelectWithSchemeV2DTO.seatTypes) && Intrinsics.d(this.darkSchemeLink, travelRailwaySeatSelectWithSchemeV2DTO.darkSchemeLink) && Intrinsics.d(this.lightSchemeLink, travelRailwaySeatSelectWithSchemeV2DTO.lightSchemeLink) && Intrinsics.d(this.trainDirection, travelRailwaySeatSelectWithSchemeV2DTO.trainDirection) && Intrinsics.d(this.footer, travelRailwaySeatSelectWithSchemeV2DTO.footer) && Intrinsics.d(this.compartmentGenders, travelRailwaySeatSelectWithSchemeV2DTO.compartmentGenders) && Intrinsics.d(this.genderIndicator, travelRailwaySeatSelectWithSchemeV2DTO.genderIndicator) && Intrinsics.d(this.trackingInfo, travelRailwaySeatSelectWithSchemeV2DTO.trackingInfo);
    }

    public final List<TextRectangle> getCompartmentGenders() {
        return this.compartmentGenders;
    }

    @NotNull
    public final String getDarkSchemeLink() {
        return this.darkSchemeLink;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterWrapper
    @NotNull
    public TravelRailwaySeatSelectFooterDTO getFooter() {
        return this.footer;
    }

    public final List<GenderIndicatorDTO> getGenderIndicator() {
        return this.genderIndicator;
    }

    @NotNull
    public final String getLightSchemeLink() {
        return this.lightSchemeLink;
    }

    @NotNull
    public final List<SeatTypeDTO> getSeatTypes() {
        return this.seatTypes;
    }

    @NotNull
    public final List<SeatDTO> getSeats() {
        return this.seats;
    }

    public final TabSelectorDTO getTabSelector() {
        return this.tabSelector;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final TrainDirectionDTO getTrainDirection() {
        return this.trainDirection;
    }

    public int hashCode() {
        TabSelectorDTO tabSelectorDTO = this.tabSelector;
        int a11 = g.a(g.a(g.b(g.b((tabSelectorDTO == null ? 0 : tabSelectorDTO.hashCode()) * 31, 31, this.seats), 31, this.seatTypes), 31, this.darkSchemeLink), 31, this.lightSchemeLink);
        TrainDirectionDTO trainDirectionDTO = this.trainDirection;
        int hashCode = (this.footer.hashCode() + ((a11 + (trainDirectionDTO == null ? 0 : trainDirectionDTO.hashCode())) * 31)) * 31;
        List<TextRectangle> list = this.compartmentGenders;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GenderIndicatorDTO> list2 = this.genderIndicator;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TabSelectorDTO tabSelectorDTO = this.tabSelector;
        List<SeatDTO> list = this.seats;
        List<SeatTypeDTO> list2 = this.seatTypes;
        String str = this.darkSchemeLink;
        String str2 = this.lightSchemeLink;
        TrainDirectionDTO trainDirectionDTO = this.trainDirection;
        TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO = this.footer;
        List<TextRectangle> list3 = this.compartmentGenders;
        List<GenderIndicatorDTO> list4 = this.genderIndicator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelRailwaySeatSelectWithSchemeV2DTO(tabSelector=");
        sb2.append(tabSelectorDTO);
        sb2.append(", seats=");
        sb2.append(list);
        sb2.append(", seatTypes=");
        e.i(", darkSchemeLink=", str, ", lightSchemeLink=", sb2, list2);
        sb2.append(str2);
        sb2.append(", trainDirection=");
        sb2.append(trainDirectionDTO);
        sb2.append(", footer=");
        sb2.append(travelRailwaySeatSelectFooterDTO);
        sb2.append(", compartmentGenders=");
        sb2.append(list3);
        sb2.append(", genderIndicator=");
        return C3143a.h(sb2, list4, ", trackingInfo=", map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$SelectedSeatDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "tooltipTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tooltipDescription", "tooltipPosition", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TooltipPosition;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TooltipPosition;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTooltipTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTooltipDescription", "getTooltipPosition", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO$TooltipPosition;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedSeatDTO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;
        private final TextDTO tooltipDescription;

        @EnumNullFallback
        @NotNull
        private final TooltipPosition tooltipPosition;
        private final TextDTO tooltipTitle;

        public SelectedSeatDTO(@NotNull IconDTO icon, TextDTO textDTO, TextDTO textDTO2, @NotNull TooltipPosition tooltipPosition) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tooltipPosition, "tooltipPosition");
            this.icon = icon;
            this.tooltipTitle = textDTO;
            this.tooltipDescription = textDTO2;
            this.tooltipPosition = tooltipPosition;
        }

        public static /* synthetic */ SelectedSeatDTO copy$default(SelectedSeatDTO selectedSeatDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, TooltipPosition tooltipPosition, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = selectedSeatDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = selectedSeatDTO.tooltipTitle;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = selectedSeatDTO.tooltipDescription;
            }
            if ((i11 & 8) != 0) {
                tooltipPosition = selectedSeatDTO.tooltipPosition;
            }
            return selectedSeatDTO.copy(iconDTO, textDTO, textDTO2, tooltipPosition);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTooltipTitle() {
            return this.tooltipTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getTooltipDescription() {
            return this.tooltipDescription;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TooltipPosition getTooltipPosition() {
            return this.tooltipPosition;
        }

        @NotNull
        public final SelectedSeatDTO copy(@NotNull IconDTO icon, TextDTO tooltipTitle, TextDTO tooltipDescription, @NotNull TooltipPosition tooltipPosition) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tooltipPosition, "tooltipPosition");
            return new SelectedSeatDTO(icon, tooltipTitle, tooltipDescription, tooltipPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedSeatDTO)) {
                return false;
            }
            SelectedSeatDTO selectedSeatDTO = (SelectedSeatDTO) other;
            return Intrinsics.d(this.icon, selectedSeatDTO.icon) && Intrinsics.d(this.tooltipTitle, selectedSeatDTO.tooltipTitle) && Intrinsics.d(this.tooltipDescription, selectedSeatDTO.tooltipDescription) && this.tooltipPosition == selectedSeatDTO.tooltipPosition;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getTooltipDescription() {
            return this.tooltipDescription;
        }

        @NotNull
        public final TooltipPosition getTooltipPosition() {
            return this.tooltipPosition;
        }

        public final TextDTO getTooltipTitle() {
            return this.tooltipTitle;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            TextDTO textDTO = this.tooltipTitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.tooltipDescription;
            return this.tooltipPosition.hashCode() + ((hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.tooltipTitle;
            TextDTO textDTO2 = this.tooltipDescription;
            TooltipPosition tooltipPosition = this.tooltipPosition;
            StringBuilder i11 = Bi.b.i("SelectedSeatDTO(icon=", ", tooltipTitle=", ", tooltipDescription=", iconDTO, textDTO);
            i11.append(textDTO2);
            i11.append(", tooltipPosition=");
            i11.append(tooltipPosition);
            i11.append(")");
            return i11.toString();
        }

        public /* synthetic */ SelectedSeatDTO(IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, TooltipPosition tooltipPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(iconDTO, textDTO, textDTO2, (i11 & 8) != 0 ? TooltipPosition.BOTTOM : tooltipPosition);
        }
    }
}
