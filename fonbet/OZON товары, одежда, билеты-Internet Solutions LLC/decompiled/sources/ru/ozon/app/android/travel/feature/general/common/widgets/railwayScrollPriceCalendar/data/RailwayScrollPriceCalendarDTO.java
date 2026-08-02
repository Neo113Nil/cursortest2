package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.data;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003123Bi\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003Jq\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO;", "", "dateTabs", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$DateTabDTO;", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$AsyncBehaviorType;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "corners", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;", "backgroundColor", "verticalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "isSticky", "", "roundedCornersOuterColor", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$AsyncBehaviorType;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;ZLjava/lang/String;)V", "getDateTabs", "()Ljava/util/List;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$AsyncBehaviorType;", "getViewTrackingInfo", "()Ljava/util/Map;", "getCorners", "()Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getVerticalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "()Z", "getRoundedCornersOuterColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "DateTabDTO", "AsyncBehaviorType", "CornersDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayScrollPriceCalendarDTO {
    public static final int $stable = 8;

    @EnumNullFallback
    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;
    private final String backgroundColor;

    @NotNull
    private final CornersDTO corners;

    @NotNull
    private final List<DateTabDTO> dateTabs;
    private final boolean isSticky;
    private final String roundedCornersOuterColor;

    @NotNull
    private final Paddings verticalPadding;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE};
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;", "", "topRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottomRadius", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTopRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomRadius", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornersDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final CornerRadius bottomRadius;

        @EnumNullFallback
        @NotNull
        private final CornerRadius topRadius;

        /* JADX WARN: Multi-variable type inference failed */
        public CornersDTO() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CornersDTO copy$default(CornersDTO cornersDTO, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = cornersDTO.topRadius;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = cornersDTO.bottomRadius;
            }
            return cornersDTO.copy(cornerRadius, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CornerRadius getTopRadius() {
            return this.topRadius;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getBottomRadius() {
            return this.bottomRadius;
        }

        @NotNull
        public final CornersDTO copy(@NotNull CornerRadius topRadius, @NotNull CornerRadius bottomRadius) {
            Intrinsics.checkNotNullParameter(topRadius, "topRadius");
            Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
            return new CornersDTO(topRadius, bottomRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornersDTO)) {
                return false;
            }
            CornersDTO cornersDTO = (CornersDTO) other;
            return this.topRadius == cornersDTO.topRadius && this.bottomRadius == cornersDTO.bottomRadius;
        }

        @NotNull
        public final CornerRadius getBottomRadius() {
            return this.bottomRadius;
        }

        @NotNull
        public final CornerRadius getTopRadius() {
            return this.topRadius;
        }

        public int hashCode() {
            return this.bottomRadius.hashCode() + (this.topRadius.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CornersDTO(topRadius=" + this.topRadius + ", bottomRadius=" + this.bottomRadius + ")";
        }

        public CornersDTO(@NotNull CornerRadius topRadius, @NotNull CornerRadius bottomRadius) {
            Intrinsics.checkNotNullParameter(topRadius, "topRadius");
            Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
            this.topRadius = topRadius;
            this.bottomRadius = bottomRadius;
        }

        public /* synthetic */ CornersDTO(CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, (i11 & 2) != 0 ? CornerRadius.RADIUS_500 : cornerRadius2);
        }
    }

    public RailwayScrollPriceCalendarDTO(@NotNull List<DateTabDTO> dateTabs, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, TokenizedTrackingInfo> map, @NotNull CornersDTO corners, String str, @NotNull Paddings verticalPadding, boolean z11, String str2) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        this.dateTabs = dateTabs;
        this.asyncBehaviorType = asyncBehaviorType;
        this.viewTrackingInfo = map;
        this.corners = corners;
        this.backgroundColor = str;
        this.verticalPadding = verticalPadding;
        this.isSticky = z11;
        this.roundedCornersOuterColor = str2;
    }

    public static /* synthetic */ RailwayScrollPriceCalendarDTO copy$default(RailwayScrollPriceCalendarDTO railwayScrollPriceCalendarDTO, List list, AsyncBehaviorType asyncBehaviorType, Map map, CornersDTO cornersDTO, String str, Paddings paddings, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = railwayScrollPriceCalendarDTO.dateTabs;
        }
        if ((i11 & 2) != 0) {
            asyncBehaviorType = railwayScrollPriceCalendarDTO.asyncBehaviorType;
        }
        if ((i11 & 4) != 0) {
            map = railwayScrollPriceCalendarDTO.viewTrackingInfo;
        }
        if ((i11 & 8) != 0) {
            cornersDTO = railwayScrollPriceCalendarDTO.corners;
        }
        if ((i11 & 16) != 0) {
            str = railwayScrollPriceCalendarDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            paddings = railwayScrollPriceCalendarDTO.verticalPadding;
        }
        if ((i11 & 64) != 0) {
            z11 = railwayScrollPriceCalendarDTO.isSticky;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = railwayScrollPriceCalendarDTO.roundedCornersOuterColor;
        }
        boolean z12 = z11;
        String str3 = str2;
        String str4 = str;
        Paddings paddings2 = paddings;
        return railwayScrollPriceCalendarDTO.copy(list, asyncBehaviorType, map, cornersDTO, str4, paddings2, z12, str3);
    }

    @NotNull
    public final List<DateTabDTO> component1() {
        return this.dateTabs;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.viewTrackingInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CornersDTO getCorners() {
        return this.corners;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Paddings getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRoundedCornersOuterColor() {
        return this.roundedCornersOuterColor;
    }

    @NotNull
    public final RailwayScrollPriceCalendarDTO copy(@NotNull List<DateTabDTO> dateTabs, @NotNull AsyncBehaviorType asyncBehaviorType, Map<String, TokenizedTrackingInfo> viewTrackingInfo, @NotNull CornersDTO corners, String backgroundColor, @NotNull Paddings verticalPadding, boolean isSticky, String roundedCornersOuterColor) {
        Intrinsics.checkNotNullParameter(dateTabs, "dateTabs");
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        return new RailwayScrollPriceCalendarDTO(dateTabs, asyncBehaviorType, viewTrackingInfo, corners, backgroundColor, verticalPadding, isSticky, roundedCornersOuterColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayScrollPriceCalendarDTO)) {
            return false;
        }
        RailwayScrollPriceCalendarDTO railwayScrollPriceCalendarDTO = (RailwayScrollPriceCalendarDTO) other;
        return Intrinsics.d(this.dateTabs, railwayScrollPriceCalendarDTO.dateTabs) && this.asyncBehaviorType == railwayScrollPriceCalendarDTO.asyncBehaviorType && Intrinsics.d(this.viewTrackingInfo, railwayScrollPriceCalendarDTO.viewTrackingInfo) && Intrinsics.d(this.corners, railwayScrollPriceCalendarDTO.corners) && Intrinsics.d(this.backgroundColor, railwayScrollPriceCalendarDTO.backgroundColor) && this.verticalPadding == railwayScrollPriceCalendarDTO.verticalPadding && this.isSticky == railwayScrollPriceCalendarDTO.isSticky && Intrinsics.d(this.roundedCornersOuterColor, railwayScrollPriceCalendarDTO.roundedCornersOuterColor);
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornersDTO getCorners() {
        return this.corners;
    }

    @NotNull
    public final List<DateTabDTO> getDateTabs() {
        return this.dateTabs;
    }

    public final String getRoundedCornersOuterColor() {
        return this.roundedCornersOuterColor;
    }

    @NotNull
    public final Paddings getVerticalPadding() {
        return this.verticalPadding;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.asyncBehaviorType.hashCode() + (this.dateTabs.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        int hashCode2 = (this.corners.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        String str = this.backgroundColor;
        int a11 = C3532b.a(GR.b.b(this.verticalPadding, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isSticky);
        String str2 = this.roundedCornersOuterColor;
        return a11 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "RailwayScrollPriceCalendarDTO(dateTabs=" + this.dateTabs + ", asyncBehaviorType=" + this.asyncBehaviorType + ", viewTrackingInfo=" + this.viewTrackingInfo + ", corners=" + this.corners + ", backgroundColor=" + this.backgroundColor + ", verticalPadding=" + this.verticalPadding + ", isSticky=" + this.isSticky + ", roundedCornersOuterColor=" + this.roundedCornersOuterColor + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$DateTabDTO;", "", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", "pricesItem", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "isActive", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Z)V", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPricesItem", "()Ljava/lang/Object;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTabDTO {
        public static final int $stable = 8;

        @NotNull
        private final AspectDTO aspect;

        @NotNull
        private final TextDTO date;
        private final boolean isActive;

        @NotNull
        private final Object pricesItem;

        public DateTabDTO(@NotNull TextDTO date, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "price", type = TextDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object pricesItem, @NotNull AspectDTO aspect, boolean z11) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(pricesItem, "pricesItem");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.date = date;
            this.pricesItem = pricesItem;
            this.aspect = aspect;
            this.isActive = z11;
        }

        public static /* synthetic */ DateTabDTO copy$default(DateTabDTO dateTabDTO, TextDTO textDTO, Object obj, AspectDTO aspectDTO, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                textDTO = dateTabDTO.date;
            }
            if ((i11 & 2) != 0) {
                obj = dateTabDTO.pricesItem;
            }
            if ((i11 & 4) != 0) {
                aspectDTO = dateTabDTO.aspect;
            }
            if ((i11 & 8) != 0) {
                z11 = dateTabDTO.isActive;
            }
            return dateTabDTO.copy(textDTO, obj, aspectDTO, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Object getPricesItem() {
            return this.pricesItem;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final DateTabDTO copy(@NotNull TextDTO date, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "price", type = TextDTO.class), @ProtoOneOfSignature(name = "icon", type = IconDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object pricesItem, @NotNull AspectDTO aspect, boolean isActive) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(pricesItem, "pricesItem");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            return new DateTabDTO(date, pricesItem, aspect, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTabDTO)) {
                return false;
            }
            DateTabDTO dateTabDTO = (DateTabDTO) other;
            return Intrinsics.d(this.date, dateTabDTO.date) && Intrinsics.d(this.pricesItem, dateTabDTO.pricesItem) && Intrinsics.d(this.aspect, dateTabDTO.aspect) && this.isActive == dateTabDTO.isActive;
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        public final Object getPricesItem() {
            return this.pricesItem;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + ((this.aspect.hashCode() + H00.a.c(this.date.hashCode() * 31, 31, this.pricesItem)) * 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            return "DateTabDTO(date=" + this.date + ", pricesItem=" + this.pricesItem + ", aspect=" + this.aspect + ", isActive=" + this.isActive + ")";
        }

        public /* synthetic */ DateTabDTO(TextDTO textDTO, Object obj, AspectDTO aspectDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, obj, aspectDTO, (i11 & 8) != 0 ? false : z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RailwayScrollPriceCalendarDTO(List list, AsyncBehaviorType asyncBehaviorType, Map map, CornersDTO cornersDTO, String str, Paddings paddings, boolean z11, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? AsyncBehaviorType.FETCH_STATE : asyncBehaviorType, map, (i11 & 8) != 0 ? new CornersDTO(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : cornersDTO, str, (i11 & 32) != 0 ? Paddings.PADDING_400 : paddings, (i11 & 64) != 0 ? false : z11, str2);
    }
}
