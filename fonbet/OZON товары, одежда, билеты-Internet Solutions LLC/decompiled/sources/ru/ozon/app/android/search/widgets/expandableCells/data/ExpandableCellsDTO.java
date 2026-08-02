package ru.ozon.app.android.search.widgets.expandableCells.data;

import G.g;
import T7.P;
import Tz.C4055a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO;", "", "cells", "", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "backgroundColor", "", "errorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "baseLink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Ljava/util/Map;)V", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getBaseLink", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ExpandableCell", "TilesType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExpandableCellsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final String baseLink;

    @NotNull
    private final List<ExpandableCell> cells;
    private final NotificationDTO errorNotification;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellId", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tilesType", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$TilesType;", "isExpanded", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$TilesType;Ljava/lang/Boolean;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellId", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTilesType", "()Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$TilesType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$TilesType;Ljava/lang/Boolean;)Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandableCell {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;

        @NotNull
        private final String cellId;
        private final Boolean isExpanded;
        private final TextDTO text;

        @NotNull
        private final TilesType tilesType;

        public ExpandableCell(@NotNull CellDTO cell, @NotNull String cellId, TextDTO textDTO, @NotNull TilesType tilesType, Boolean bool) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(cellId, "cellId");
            Intrinsics.checkNotNullParameter(tilesType, "tilesType");
            this.cell = cell;
            this.cellId = cellId;
            this.text = textDTO;
            this.tilesType = tilesType;
            this.isExpanded = bool;
        }

        public static /* synthetic */ ExpandableCell copy$default(ExpandableCell expandableCell, CellDTO cellDTO, String str, TextDTO textDTO, TilesType tilesType, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = expandableCell.cell;
            }
            if ((i11 & 2) != 0) {
                str = expandableCell.cellId;
            }
            if ((i11 & 4) != 0) {
                textDTO = expandableCell.text;
            }
            if ((i11 & 8) != 0) {
                tilesType = expandableCell.tilesType;
            }
            if ((i11 & 16) != 0) {
                bool = expandableCell.isExpanded;
            }
            Boolean bool2 = bool;
            TextDTO textDTO2 = textDTO;
            return expandableCell.copy(cellDTO, str, textDTO2, tilesType, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCellId() {
            return this.cellId;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TilesType getTilesType() {
            return this.tilesType;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsExpanded() {
            return this.isExpanded;
        }

        @NotNull
        public final ExpandableCell copy(@NotNull CellDTO cell, @NotNull String cellId, TextDTO text, @NotNull TilesType tilesType, Boolean isExpanded) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(cellId, "cellId");
            Intrinsics.checkNotNullParameter(tilesType, "tilesType");
            return new ExpandableCell(cell, cellId, text, tilesType, isExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandableCell)) {
                return false;
            }
            ExpandableCell expandableCell = (ExpandableCell) other;
            return Intrinsics.d(this.cell, expandableCell.cell) && Intrinsics.d(this.cellId, expandableCell.cellId) && Intrinsics.d(this.text, expandableCell.text) && this.tilesType == expandableCell.tilesType && Intrinsics.d(this.isExpanded, expandableCell.isExpanded);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        @NotNull
        public final String getCellId() {
            return this.cellId;
        }

        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        public final TilesType getTilesType() {
            return this.tilesType;
        }

        public int hashCode() {
            int a11 = g.a(this.cell.hashCode() * 31, 31, this.cellId);
            TextDTO textDTO = this.text;
            int hashCode = (this.tilesType.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            Boolean bool = this.isExpanded;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isExpanded() {
            return this.isExpanded;
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.cell;
            String str = this.cellId;
            TextDTO textDTO = this.text;
            TilesType tilesType = this.tilesType;
            Boolean bool = this.isExpanded;
            StringBuilder sb2 = new StringBuilder("ExpandableCell(cell=");
            sb2.append(cellDTO);
            sb2.append(", cellId=");
            sb2.append(str);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", tilesType=");
            sb2.append(tilesType);
            sb2.append(", isExpanded=");
            return D3.g.d(sb2, bool, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$TilesType;", "", "<init>", "(Ljava/lang/String;I)V", "TILE_GRID_2", "TILE_SCROLL", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TilesType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TilesType[] $VALUES;
        public static final TilesType TILE_GRID_2 = new TilesType("TILE_GRID_2", 0);
        public static final TilesType TILE_SCROLL = new TilesType("TILE_SCROLL", 1);

        private static final /* synthetic */ TilesType[] $values() {
            return new TilesType[]{TILE_GRID_2, TILE_SCROLL};
        }

        static {
            TilesType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TilesType(String str, int i11) {
        }

        public static TilesType valueOf(String str) {
            return (TilesType) Enum.valueOf(TilesType.class, str);
        }

        public static TilesType[] values() {
            return (TilesType[]) $VALUES.clone();
        }
    }

    public ExpandableCellsDTO(@NotNull List<ExpandableCell> cells, String str, NotificationDTO notificationDTO, @NotNull String baseLink, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(baseLink, "baseLink");
        this.cells = cells;
        this.backgroundColor = str;
        this.errorNotification = notificationDTO;
        this.baseLink = baseLink;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ExpandableCellsDTO copy$default(ExpandableCellsDTO expandableCellsDTO, List list, String str, NotificationDTO notificationDTO, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = expandableCellsDTO.cells;
        }
        if ((i11 & 2) != 0) {
            str = expandableCellsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = expandableCellsDTO.errorNotification;
        }
        if ((i11 & 8) != 0) {
            str2 = expandableCellsDTO.baseLink;
        }
        if ((i11 & 16) != 0) {
            map = expandableCellsDTO.trackingInfo;
        }
        Map map2 = map;
        NotificationDTO notificationDTO2 = notificationDTO;
        return expandableCellsDTO.copy(list, str, notificationDTO2, str2, map2);
    }

    @NotNull
    public final List<ExpandableCell> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBaseLink() {
        return this.baseLink;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ExpandableCellsDTO copy(@NotNull List<ExpandableCell> cells, String backgroundColor, NotificationDTO errorNotification, @NotNull String baseLink, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(baseLink, "baseLink");
        return new ExpandableCellsDTO(cells, backgroundColor, errorNotification, baseLink, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableCellsDTO)) {
            return false;
        }
        ExpandableCellsDTO expandableCellsDTO = (ExpandableCellsDTO) other;
        return Intrinsics.d(this.cells, expandableCellsDTO.cells) && Intrinsics.d(this.backgroundColor, expandableCellsDTO.backgroundColor) && Intrinsics.d(this.errorNotification, expandableCellsDTO.errorNotification) && Intrinsics.d(this.baseLink, expandableCellsDTO.baseLink) && Intrinsics.d(this.trackingInfo, expandableCellsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBaseLink() {
        return this.baseLink;
    }

    @NotNull
    public final List<ExpandableCell> getCells() {
        return this.cells;
    }

    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NotificationDTO notificationDTO = this.errorNotification;
        int a11 = g.a((hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31, 31, this.baseLink);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ExpandableCell> list = this.cells;
        String str = this.backgroundColor;
        NotificationDTO notificationDTO = this.errorNotification;
        String str2 = this.baseLink;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("ExpandableCellsDTO(cells=", ", backgroundColor=", str, ", errorNotification=", list);
        a11.append(notificationDTO);
        a11.append(", baseLink=");
        a11.append(str2);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }
}
