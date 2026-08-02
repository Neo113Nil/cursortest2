package ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data;

import AZ.c;
import Bi.b;
import D3.g;
import Hj.C3143a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002)*BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO;", "", "backgroundColor", "", "backgroundImageApp", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "headerContent", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$HeaderContentDTO;", "cellBlocks", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$CellBlockDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$HeaderContentDTO;Ljava/util/List;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundImageApp", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getHeaderContent", "()Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$HeaderContentDTO;", "getCellBlocks", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderContentDTO", "CellBlockDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportPremiumCellsWithHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImageApp;

    @NotNull
    private final List<CellBlockDTO> cellBlocks;
    private final HeaderContentDTO headerContent;
    private final ImageDTO image;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$HeaderContentDTO;", "", "titleLeft", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleMid", "titleRight", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitleLeft", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleMid", "getTitleRight", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderContentDTO {
        public static final int $stable = 0;
        private final BadgeDTO badge;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO titleLeft;
        private final TextDTO titleMid;
        private final ImageDTO titleRight;

        public HeaderContentDTO(@NotNull TextDTO titleLeft, TextDTO textDTO, ImageDTO imageDTO, TextDTO textDTO2, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(titleLeft, "titleLeft");
            this.titleLeft = titleLeft;
            this.titleMid = textDTO;
            this.titleRight = imageDTO;
            this.subtitle = textDTO2;
            this.badge = badgeDTO;
        }

        public static /* synthetic */ HeaderContentDTO copy$default(HeaderContentDTO headerContentDTO, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, TextDTO textDTO3, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = headerContentDTO.titleLeft;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = headerContentDTO.titleMid;
            }
            if ((i11 & 4) != 0) {
                imageDTO = headerContentDTO.titleRight;
            }
            if ((i11 & 8) != 0) {
                textDTO3 = headerContentDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                badgeDTO = headerContentDTO.badge;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            ImageDTO imageDTO2 = imageDTO;
            return headerContentDTO.copy(textDTO, textDTO2, imageDTO2, textDTO3, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitleLeft() {
            return this.titleLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitleMid() {
            return this.titleMid;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageDTO getTitleRight() {
            return this.titleRight;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final HeaderContentDTO copy(@NotNull TextDTO titleLeft, TextDTO titleMid, ImageDTO titleRight, TextDTO subtitle, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(titleLeft, "titleLeft");
            return new HeaderContentDTO(titleLeft, titleMid, titleRight, subtitle, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderContentDTO)) {
                return false;
            }
            HeaderContentDTO headerContentDTO = (HeaderContentDTO) other;
            return Intrinsics.d(this.titleLeft, headerContentDTO.titleLeft) && Intrinsics.d(this.titleMid, headerContentDTO.titleMid) && Intrinsics.d(this.titleRight, headerContentDTO.titleRight) && Intrinsics.d(this.subtitle, headerContentDTO.subtitle) && Intrinsics.d(this.badge, headerContentDTO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitleLeft() {
            return this.titleLeft;
        }

        public final TextDTO getTitleMid() {
            return this.titleMid;
        }

        public final ImageDTO getTitleRight() {
            return this.titleRight;
        }

        public int hashCode() {
            int hashCode = this.titleLeft.hashCode() * 31;
            TextDTO textDTO = this.titleMid;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.titleRight;
            int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode4 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.titleLeft;
            TextDTO textDTO2 = this.titleMid;
            ImageDTO imageDTO = this.titleRight;
            TextDTO textDTO3 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            StringBuilder g10 = g.g("HeaderContentDTO(titleLeft=", textDTO, ", titleMid=", textDTO2, ", titleRight=");
            g10.append(imageDTO);
            g10.append(", subtitle=");
            g10.append(textDTO3);
            g10.append(", badge=");
            return c.b(g10, badgeDTO, ")");
        }
    }

    public SupportPremiumCellsWithHeaderDTO(@NotNull String backgroundColor, String str, ImageDTO imageDTO, HeaderContentDTO headerContentDTO, @NotNull List<CellBlockDTO> cellBlocks, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        this.backgroundColor = backgroundColor;
        this.backgroundImageApp = str;
        this.image = imageDTO;
        this.headerContent = headerContentDTO;
        this.cellBlocks = cellBlocks;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SupportPremiumCellsWithHeaderDTO copy$default(SupportPremiumCellsWithHeaderDTO supportPremiumCellsWithHeaderDTO, String str, String str2, ImageDTO imageDTO, HeaderContentDTO headerContentDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supportPremiumCellsWithHeaderDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = supportPremiumCellsWithHeaderDTO.backgroundImageApp;
        }
        if ((i11 & 4) != 0) {
            imageDTO = supportPremiumCellsWithHeaderDTO.image;
        }
        if ((i11 & 8) != 0) {
            headerContentDTO = supportPremiumCellsWithHeaderDTO.headerContent;
        }
        if ((i11 & 16) != 0) {
            list = supportPremiumCellsWithHeaderDTO.cellBlocks;
        }
        if ((i11 & 32) != 0) {
            map = supportPremiumCellsWithHeaderDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        return supportPremiumCellsWithHeaderDTO.copy(str, str2, imageDTO, headerContentDTO, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundImageApp() {
        return this.backgroundImageApp;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderContentDTO getHeaderContent() {
        return this.headerContent;
    }

    @NotNull
    public final List<CellBlockDTO> component5() {
        return this.cellBlocks;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SupportPremiumCellsWithHeaderDTO copy(@NotNull String backgroundColor, String backgroundImageApp, ImageDTO image, HeaderContentDTO headerContent, @NotNull List<CellBlockDTO> cellBlocks, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        return new SupportPremiumCellsWithHeaderDTO(backgroundColor, backgroundImageApp, image, headerContent, cellBlocks, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportPremiumCellsWithHeaderDTO)) {
            return false;
        }
        SupportPremiumCellsWithHeaderDTO supportPremiumCellsWithHeaderDTO = (SupportPremiumCellsWithHeaderDTO) other;
        return Intrinsics.d(this.backgroundColor, supportPremiumCellsWithHeaderDTO.backgroundColor) && Intrinsics.d(this.backgroundImageApp, supportPremiumCellsWithHeaderDTO.backgroundImageApp) && Intrinsics.d(this.image, supportPremiumCellsWithHeaderDTO.image) && Intrinsics.d(this.headerContent, supportPremiumCellsWithHeaderDTO.headerContent) && Intrinsics.d(this.cellBlocks, supportPremiumCellsWithHeaderDTO.cellBlocks) && Intrinsics.d(this.trackingInfo, supportPremiumCellsWithHeaderDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImageApp() {
        return this.backgroundImageApp;
    }

    @NotNull
    public final List<CellBlockDTO> getCellBlocks() {
        return this.cellBlocks;
    }

    public final HeaderContentDTO getHeaderContent() {
        return this.headerContent;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.backgroundColor.hashCode() * 31;
        String str = this.backgroundImageApp;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        HeaderContentDTO headerContentDTO = this.headerContent;
        int b11 = G.g.b((hashCode3 + (headerContentDTO == null ? 0 : headerContentDTO.hashCode())) * 31, 31, this.cellBlocks);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.backgroundImageApp;
        ImageDTO imageDTO = this.image;
        HeaderContentDTO headerContentDTO = this.headerContent;
        List<CellBlockDTO> list = this.cellBlocks;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SupportPremiumCellsWithHeaderDTO(backgroundColor=", str, ", backgroundImageApp=", str2, ", image=");
        d11.append(imageDTO);
        d11.append(", headerContent=");
        d11.append(headerContentDTO);
        d11.append(", cellBlocks=");
        return C3143a.h(d11, list, ", trackingInfo=", map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$CellBlockDTO;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;

        public CellBlockDTO(@NotNull List<CellDTO> cells, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.cells = cells;
            this.backgroundColor = backgroundColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cellBlockDTO.cells;
            }
            if ((i11 & 2) != 0) {
                str = cellBlockDTO.backgroundColor;
            }
            return cellBlockDTO.copy(list, str);
        }

        @NotNull
        public final List<CellDTO> component1() {
            return this.cells;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CellBlockDTO copy(@NotNull List<CellDTO> cells, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new CellBlockDTO(cells, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.cells, cellBlockDTO.cells) && Intrinsics.d(this.backgroundColor, cellBlockDTO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.cells.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return b.e("CellBlockDTO(cells=", ", backgroundColor=", this.backgroundColor, ")", this.cells);
        }

        public CellBlockDTO(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, str);
        }
    }

    public SupportPremiumCellsWithHeaderDTO(String str, String str2, ImageDTO imageDTO, HeaderContentDTO headerContentDTO, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, imageDTO, headerContentDTO, (i11 & 16) != 0 ? K.f71697a : list, map);
    }
}
