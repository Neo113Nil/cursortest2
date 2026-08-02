package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.data;

import Bl.C2639a;
import El.C2971a;
import G.g;
import K1.G;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "content", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$Content;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$Content;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getContent", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$Content;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Content", "CellBlock", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursDetailsAccordionDTO {
    public static final int $stable = 8;

    @NotNull
    private final Content content;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$Content;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cellBlock", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$CellBlock;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$CellBlock;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBadges", "()Ljava/util/List;", "getCellBlock", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$CellBlock;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = 8;
        private final List<BadgeDTO> badges;
        private final CellDTO cell;
        private final CellBlock cellBlock;

        public Content(CellDTO cellDTO, List<BadgeDTO> list, CellBlock cellBlock) {
            this.cell = cellDTO;
            this.badges = list;
            this.cellBlock = cellBlock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, CellDTO cellDTO, List list, CellBlock cellBlock, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = content.cell;
            }
            if ((i11 & 2) != 0) {
                list = content.badges;
            }
            if ((i11 & 4) != 0) {
                cellBlock = content.cellBlock;
            }
            return content.copy(cellDTO, list, cellBlock);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        public final List<BadgeDTO> component2() {
            return this.badges;
        }

        /* renamed from: component3, reason: from getter */
        public final CellBlock getCellBlock() {
            return this.cellBlock;
        }

        @NotNull
        public final Content copy(CellDTO cell, List<BadgeDTO> badges, CellBlock cellBlock) {
            return new Content(cell, badges, cellBlock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.cell, content.cell) && Intrinsics.d(this.badges, content.badges) && Intrinsics.d(this.cellBlock, content.cellBlock);
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final CellBlock getCellBlock() {
            return this.cellBlock;
        }

        public int hashCode() {
            CellDTO cellDTO = this.cell;
            int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            CellBlock cellBlock = this.cellBlock;
            return hashCode2 + (cellBlock != null ? cellBlock.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Content(cell=" + this.cell + ", badges=" + this.badges + ", cellBlock=" + this.cellBlock + ")";
        }
    }

    public ToursDetailsAccordionDTO(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull Content content, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content, "content");
        this.title = title;
        this.icon = icon;
        this.content = content;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToursDetailsAccordionDTO copy$default(ToursDetailsAccordionDTO toursDetailsAccordionDTO, TextDTO textDTO, IconDTO iconDTO, Content content, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = toursDetailsAccordionDTO.title;
        }
        if ((i11 & 2) != 0) {
            iconDTO = toursDetailsAccordionDTO.icon;
        }
        if ((i11 & 4) != 0) {
            content = toursDetailsAccordionDTO.content;
        }
        if ((i11 & 8) != 0) {
            map = toursDetailsAccordionDTO.trackingInfo;
        }
        return toursDetailsAccordionDTO.copy(textDTO, iconDTO, content, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursDetailsAccordionDTO copy(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull Content content, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ToursDetailsAccordionDTO(title, icon, content, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursDetailsAccordionDTO)) {
            return false;
        }
        ToursDetailsAccordionDTO toursDetailsAccordionDTO = (ToursDetailsAccordionDTO) other;
        return Intrinsics.d(this.title, toursDetailsAccordionDTO.title) && Intrinsics.d(this.icon, toursDetailsAccordionDTO.icon) && Intrinsics.d(this.content, toursDetailsAccordionDTO.content) && Intrinsics.d(this.trackingInfo, toursDetailsAccordionDTO.trackingInfo);
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + C2971a.a(this.icon, this.title.hashCode() * 31, 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        Content content = this.content;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2639a.d("ToursDetailsAccordionDTO(title=", ", icon=", ", content=", iconDTO, textDTO);
        d11.append(content);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/data/ToursDetailsAccordionDTO$CellBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlock {
        public static final int $stable = 8;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;

        @NotNull
        private final CornerRadius cornerRadius;
        private final TextDTO title;

        public CellBlock(TextDTO textDTO, @NotNull List<CellDTO> cells, @NotNull CornerRadius cornerRadius, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = textDTO;
            this.cells = cells;
            this.cornerRadius = cornerRadius;
            this.backgroundColor = backgroundColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellBlock copy$default(CellBlock cellBlock, TextDTO textDTO, List list, CornerRadius cornerRadius, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = cellBlock.title;
            }
            if ((i11 & 2) != 0) {
                list = cellBlock.cells;
            }
            if ((i11 & 4) != 0) {
                cornerRadius = cellBlock.cornerRadius;
            }
            if ((i11 & 8) != 0) {
                str = cellBlock.backgroundColor;
            }
            return cellBlock.copy(textDTO, list, cornerRadius, str);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<CellDTO> component2() {
            return this.cells;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CellBlock copy(TextDTO title, @NotNull List<CellDTO> cells, @NotNull CornerRadius cornerRadius, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new CellBlock(title, cells, cornerRadius, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlock)) {
                return false;
            }
            CellBlock cellBlock = (CellBlock) other;
            return Intrinsics.d(this.title, cellBlock.title) && Intrinsics.d(this.cells, cellBlock.cells) && this.cornerRadius == cellBlock.cornerRadius && Intrinsics.d(this.backgroundColor, cellBlock.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.backgroundColor.hashCode() + b.b(this.cornerRadius, g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.cells), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<CellDTO> list = this.cells;
            CornerRadius cornerRadius = this.cornerRadius;
            String str = this.backgroundColor;
            StringBuilder e11 = G.e("CellBlock(title=", textDTO, ", cells=", list, ", cornerRadius=");
            e11.append(cornerRadius);
            e11.append(", backgroundColor=");
            e11.append(str);
            e11.append(")");
            return e11.toString();
        }

        public /* synthetic */ CellBlock(TextDTO textDTO, List list, CornerRadius cornerRadius, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, list, (i11 & 4) != 0 ? CornerRadius.RADIUS_500 : cornerRadius, (i11 & 8) != 0 ? UniColors.BG_PRIMARY.getToken() : str);
        }
    }
}
