package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.data;

import B4.V;
import G.g;
import Pk0.a;
import Tz.C4055a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jb\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO;", "", "cells", "", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO$Cell;", "background", "", "radius", "", "successMessage", "errorMessage", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCells", "()Ljava/util/List;", "getBackground", "()Ljava/lang/String;", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSuccessMessage", "getErrorMessage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO;", "equals", "", "other", "hashCode", "toString", "Cell", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WholeSaleDTO {
    public static final int $stable = 8;
    private final String background;

    @NotNull
    private final List<Cell> cells;

    @NotNull
    private final String errorMessage;
    private final Integer radius;

    @NotNull
    private final String successMessage;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO$Cell;", "", "titleSubtitleCell", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hasSeparator", "", "<init>", "(Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "getTitleSubtitleCell", "()Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHasSeparator", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell {
        public static final int $stable = TitleSubtitleCellDTO.$stable;
        private final ButtonV3DTO button;
        private final boolean hasSeparator;

        @NotNull
        private final TitleSubtitleCellDTO titleSubtitleCell;

        public Cell(@NotNull TitleSubtitleCellDTO titleSubtitleCell, ButtonV3DTO buttonV3DTO, boolean z11) {
            Intrinsics.checkNotNullParameter(titleSubtitleCell, "titleSubtitleCell");
            this.titleSubtitleCell = titleSubtitleCell;
            this.button = buttonV3DTO;
            this.hasSeparator = z11;
        }

        public static /* synthetic */ Cell copy$default(Cell cell, TitleSubtitleCellDTO titleSubtitleCellDTO, ButtonV3DTO buttonV3DTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                titleSubtitleCellDTO = cell.titleSubtitleCell;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO = cell.button;
            }
            if ((i11 & 4) != 0) {
                z11 = cell.hasSeparator;
            }
            return cell.copy(titleSubtitleCellDTO, buttonV3DTO, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TitleSubtitleCellDTO getTitleSubtitleCell() {
            return this.titleSubtitleCell;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @NotNull
        public final Cell copy(@NotNull TitleSubtitleCellDTO titleSubtitleCell, ButtonV3DTO button, boolean hasSeparator) {
            Intrinsics.checkNotNullParameter(titleSubtitleCell, "titleSubtitleCell");
            return new Cell(titleSubtitleCell, button, hasSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return Intrinsics.d(this.titleSubtitleCell, cell.titleSubtitleCell) && Intrinsics.d(this.button, cell.button) && this.hasSeparator == cell.hasSeparator;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @NotNull
        public final TitleSubtitleCellDTO getTitleSubtitleCell() {
            return this.titleSubtitleCell;
        }

        public int hashCode() {
            int hashCode = this.titleSubtitleCell.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return Boolean.hashCode(this.hasSeparator) + ((hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TitleSubtitleCellDTO titleSubtitleCellDTO = this.titleSubtitleCell;
            ButtonV3DTO buttonV3DTO = this.button;
            boolean z11 = this.hasSeparator;
            StringBuilder sb2 = new StringBuilder("Cell(titleSubtitleCell=");
            sb2.append(titleSubtitleCellDTO);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", hasSeparator=");
            return a.a(")", sb2, z11);
        }
    }

    public WholeSaleDTO(@NotNull List<Cell> cells, String str, Integer num, @NotNull String successMessage, @NotNull String errorMessage, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.cells = cells;
        this.background = str;
        this.radius = num;
        this.successMessage = successMessage;
        this.errorMessage = errorMessage;
        this.trackingInfo = map;
    }

    public static /* synthetic */ WholeSaleDTO copy$default(WholeSaleDTO wholeSaleDTO, List list, String str, Integer num, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wholeSaleDTO.cells;
        }
        if ((i11 & 2) != 0) {
            str = wholeSaleDTO.background;
        }
        if ((i11 & 4) != 0) {
            num = wholeSaleDTO.radius;
        }
        if ((i11 & 8) != 0) {
            str2 = wholeSaleDTO.successMessage;
        }
        if ((i11 & 16) != 0) {
            str3 = wholeSaleDTO.errorMessage;
        }
        if ((i11 & 32) != 0) {
            map = wholeSaleDTO.trackingInfo;
        }
        String str4 = str3;
        Map map2 = map;
        return wholeSaleDTO.copy(list, str, num, str2, str4, map2);
    }

    @NotNull
    public final List<Cell> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final WholeSaleDTO copy(@NotNull List<Cell> cells, String background, Integer radius, @NotNull String successMessage, @NotNull String errorMessage, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new WholeSaleDTO(cells, background, radius, successMessage, errorMessage, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WholeSaleDTO)) {
            return false;
        }
        WholeSaleDTO wholeSaleDTO = (WholeSaleDTO) other;
        return Intrinsics.d(this.cells, wholeSaleDTO.cells) && Intrinsics.d(this.background, wholeSaleDTO.background) && Intrinsics.d(this.radius, wholeSaleDTO.radius) && Intrinsics.d(this.successMessage, wholeSaleDTO.successMessage) && Intrinsics.d(this.errorMessage, wholeSaleDTO.errorMessage) && Intrinsics.d(this.trackingInfo, wholeSaleDTO.trackingInfo);
    }

    public final String getBackground() {
        return this.background;
    }

    @NotNull
    public final List<Cell> getCells() {
        return this.cells;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    @NotNull
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        String str = this.background;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.radius;
        int a11 = g.a(g.a((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.successMessage), 31, this.errorMessage);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Cell> list = this.cells;
        String str = this.background;
        Integer num = this.radius;
        String str2 = this.successMessage;
        String str3 = this.errorMessage;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("WholeSaleDTO(cells=", ", background=", str, ", radius=", list);
        V.f(num, ", successMessage=", str2, ", errorMessage=", a11);
        return C4070a.a(a11, str3, ", trackingInfo=", map, ")");
    }
}
