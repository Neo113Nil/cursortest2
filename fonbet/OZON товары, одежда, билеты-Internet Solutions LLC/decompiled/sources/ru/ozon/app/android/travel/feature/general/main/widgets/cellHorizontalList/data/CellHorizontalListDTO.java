package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.data;

import G.g;
import GR.b;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellGap", "Lru/ozon/uni/atoms/data/common/Paddings;", "settings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "cellSettings", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "getCellGap", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getCellSettings", "()Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CellSettingsDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CellHorizontalListDTO {
    public static final int $stable = 8;

    @NotNull
    private final Paddings cellGap;
    private final CellSettingsDTO cellSettings;

    @NotNull
    private final List<CellDTO> cells;
    private final TravelWidgetSettingsDTO settings;
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;", "", "minWidth", "", "minHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMinWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinHeight", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;", "equals", "", "other", "hashCode", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellSettingsDTO {
        public static final int $stable = 0;
        private final Integer minHeight;
        private final Integer minWidth;

        public CellSettingsDTO(Integer num, Integer num2) {
            this.minWidth = num;
            this.minHeight = num2;
        }

        public static /* synthetic */ CellSettingsDTO copy$default(CellSettingsDTO cellSettingsDTO, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = cellSettingsDTO.minWidth;
            }
            if ((i11 & 2) != 0) {
                num2 = cellSettingsDTO.minHeight;
            }
            return cellSettingsDTO.copy(num, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMinWidth() {
            return this.minWidth;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMinHeight() {
            return this.minHeight;
        }

        @NotNull
        public final CellSettingsDTO copy(Integer minWidth, Integer minHeight) {
            return new CellSettingsDTO(minWidth, minHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellSettingsDTO)) {
                return false;
            }
            CellSettingsDTO cellSettingsDTO = (CellSettingsDTO) other;
            return Intrinsics.d(this.minWidth, cellSettingsDTO.minWidth) && Intrinsics.d(this.minHeight, cellSettingsDTO.minHeight);
        }

        public final Integer getMinHeight() {
            return this.minHeight;
        }

        public final Integer getMinWidth() {
            return this.minWidth;
        }

        public int hashCode() {
            Integer num = this.minWidth;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.minHeight;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CellSettingsDTO(minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ")";
        }
    }

    public CellHorizontalListDTO(TextDTO textDTO, @NotNull List<CellDTO> cells, @NotNull Paddings cellGap, TravelWidgetSettingsDTO travelWidgetSettingsDTO, CellSettingsDTO cellSettingsDTO) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(cellGap, "cellGap");
        this.title = textDTO;
        this.cells = cells;
        this.cellGap = cellGap;
        this.settings = travelWidgetSettingsDTO;
        this.cellSettings = cellSettingsDTO;
    }

    public static /* synthetic */ CellHorizontalListDTO copy$default(CellHorizontalListDTO cellHorizontalListDTO, TextDTO textDTO, List list, Paddings paddings, TravelWidgetSettingsDTO travelWidgetSettingsDTO, CellSettingsDTO cellSettingsDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = cellHorizontalListDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = cellHorizontalListDTO.cells;
        }
        if ((i11 & 4) != 0) {
            paddings = cellHorizontalListDTO.cellGap;
        }
        if ((i11 & 8) != 0) {
            travelWidgetSettingsDTO = cellHorizontalListDTO.settings;
        }
        if ((i11 & 16) != 0) {
            cellSettingsDTO = cellHorizontalListDTO.cellSettings;
        }
        CellSettingsDTO cellSettingsDTO2 = cellSettingsDTO;
        Paddings paddings2 = paddings;
        return cellHorizontalListDTO.copy(textDTO, list, paddings2, travelWidgetSettingsDTO, cellSettingsDTO2);
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
    public final Paddings getCellGap() {
        return this.cellGap;
    }

    /* renamed from: component4, reason: from getter */
    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    /* renamed from: component5, reason: from getter */
    public final CellSettingsDTO getCellSettings() {
        return this.cellSettings;
    }

    @NotNull
    public final CellHorizontalListDTO copy(TextDTO title, @NotNull List<CellDTO> cells, @NotNull Paddings cellGap, TravelWidgetSettingsDTO settings, CellSettingsDTO cellSettings) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(cellGap, "cellGap");
        return new CellHorizontalListDTO(title, cells, cellGap, settings, cellSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellHorizontalListDTO)) {
            return false;
        }
        CellHorizontalListDTO cellHorizontalListDTO = (CellHorizontalListDTO) other;
        return Intrinsics.d(this.title, cellHorizontalListDTO.title) && Intrinsics.d(this.cells, cellHorizontalListDTO.cells) && this.cellGap == cellHorizontalListDTO.cellGap && Intrinsics.d(this.settings, cellHorizontalListDTO.settings) && Intrinsics.d(this.cellSettings, cellHorizontalListDTO.cellSettings);
    }

    @NotNull
    public final Paddings getCellGap() {
        return this.cellGap;
    }

    public final CellSettingsDTO getCellSettings() {
        return this.cellSettings;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final TravelWidgetSettingsDTO getSettings() {
        return this.settings;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int b11 = b.b(this.cellGap, g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.cells), 31);
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        int hashCode = (b11 + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31;
        CellSettingsDTO cellSettingsDTO = this.cellSettings;
        return hashCode + (cellSettingsDTO != null ? cellSettingsDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<CellDTO> list = this.cells;
        Paddings paddings = this.cellGap;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
        CellSettingsDTO cellSettingsDTO = this.cellSettings;
        StringBuilder e11 = G.e("CellHorizontalListDTO(title=", textDTO, ", cells=", list, ", cellGap=");
        e11.append(paddings);
        e11.append(", settings=");
        e11.append(travelWidgetSettingsDTO);
        e11.append(", cellSettings=");
        e11.append(cellSettingsDTO);
        e11.append(")");
        return e11.toString();
    }

    public CellHorizontalListDTO(TextDTO textDTO, List list, Paddings paddings, TravelWidgetSettingsDTO travelWidgetSettingsDTO, CellSettingsDTO cellSettingsDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings, travelWidgetSettingsDTO, cellSettingsDTO);
    }
}
