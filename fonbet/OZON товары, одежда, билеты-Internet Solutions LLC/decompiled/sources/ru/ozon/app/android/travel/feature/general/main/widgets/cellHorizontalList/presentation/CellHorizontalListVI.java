package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import B0.C2454a;
import Cm.e;
import G.g;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0002./BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "cells", "", "cellGap", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "cellSettings", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;)Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "I", "getCellGap", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "getCellSettings", "()Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "CellVO", "CellSettingsVO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CellHorizontalListVI implements c {
    private final int cellGap;
    private final CellSettingsVO cellSettings;

    @NotNull
    private final List<CellVO> cells;
    private final long id;
    private final TravelWidgetSettingsVO settings;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "", "", "minWidth", "minHeight", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinWidth", "getMinHeight", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellSettingsVO {
        private final int minHeight;
        private final int minWidth;

        public CellSettingsVO(int i11, int i12) {
            this.minWidth = i11;
            this.minHeight = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellSettingsVO)) {
                return false;
            }
            CellSettingsVO cellSettingsVO = (CellSettingsVO) other;
            return this.minWidth == cellSettingsVO.minWidth && this.minHeight == cellSettingsVO.minHeight;
        }

        public final int getMinHeight() {
            return this.minHeight;
        }

        public final int getMinWidth() {
            return this.minWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.minHeight) + (Integer.hashCode(this.minWidth) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("CellSettingsVO(minWidth=", this.minWidth, ", minHeight=", ")", this.minHeight);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "position", "getPosition", "setPosition", "(I)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellVO {

        @NotNull
        private final CellDTO cell;
        private final int id;
        private int position;

        public CellVO(int i11, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellVO)) {
                return false;
            }
            CellVO cellVO = (CellVO) other;
            return this.id == cellVO.id && Intrinsics.d(this.cell, cellVO.cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final int getId() {
            return this.id;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return this.cell.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public final void setPosition(int i11) {
            this.position = i11;
        }

        @NotNull
        public String toString() {
            return "CellVO(id=" + this.id + ", cell=" + this.cell + ")";
        }
    }

    public CellHorizontalListVI(long j11, TextDTO textDTO, @NotNull List<CellVO> cells, int i11, TravelWidgetSettingsVO travelWidgetSettingsVO, CellSettingsVO cellSettingsVO) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = textDTO;
        this.cells = cells;
        this.cellGap = i11;
        this.settings = travelWidgetSettingsVO;
        this.cellSettings = cellSettingsVO;
    }

    public static /* synthetic */ CellHorizontalListVI copy$default(CellHorizontalListVI cellHorizontalListVI, long j11, TextDTO textDTO, List list, int i11, TravelWidgetSettingsVO travelWidgetSettingsVO, CellSettingsVO cellSettingsVO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cellHorizontalListVI.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            textDTO = cellHorizontalListVI.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i12 & 4) != 0) {
            list = cellHorizontalListVI.cells;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            i11 = cellHorizontalListVI.cellGap;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            travelWidgetSettingsVO = cellHorizontalListVI.settings;
        }
        TravelWidgetSettingsVO travelWidgetSettingsVO2 = travelWidgetSettingsVO;
        if ((i12 & 32) != 0) {
            cellSettingsVO = cellHorizontalListVI.cellSettings;
        }
        return cellHorizontalListVI.copy(j12, textDTO2, list2, i13, travelWidgetSettingsVO2, cellSettingsVO);
    }

    @NotNull
    public final CellHorizontalListVI copy(long id2, TextDTO title, @NotNull List<CellVO> cells, int cellGap, TravelWidgetSettingsVO settings, CellSettingsVO cellSettings) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new CellHorizontalListVI(id2, title, cells, cellGap, settings, cellSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellHorizontalListVI)) {
            return false;
        }
        CellHorizontalListVI cellHorizontalListVI = (CellHorizontalListVI) other;
        return this.id == cellHorizontalListVI.id && Intrinsics.d(this.title, cellHorizontalListVI.title) && Intrinsics.d(this.cells, cellHorizontalListVI.cells) && this.cellGap == cellHorizontalListVI.cellGap && Intrinsics.d(this.settings, cellHorizontalListVI.settings) && Intrinsics.d(this.cellSettings, cellHorizontalListVI.cellSettings);
    }

    public final int getCellGap() {
        return this.cellGap;
    }

    public final CellSettingsVO getCellSettings() {
        return this.cellSettings;
    }

    @NotNull
    public final List<CellVO> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TravelWidgetSettingsVO getSettings() {
        return this.settings;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int a11 = C2454a.a(this.cellGap, g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.cells), 31);
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
        int hashCode2 = (a11 + (travelWidgetSettingsVO == null ? 0 : travelWidgetSettingsVO.hashCode())) * 31;
        CellSettingsVO cellSettingsVO = this.cellSettings;
        return hashCode2 + (cellSettingsVO != null ? cellSettingsVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<CellVO> list = this.cells;
        int i11 = this.cellGap;
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
        CellSettingsVO cellSettingsVO = this.cellSettings;
        StringBuilder b11 = a.b("CellHorizontalListVI(id=", j11, ", title=", textDTO);
        b11.append(", cells=");
        b11.append(list);
        b11.append(", cellGap=");
        b11.append(i11);
        b11.append(", settings=");
        b11.append(travelWidgetSettingsVO);
        b11.append(", cellSettings=");
        b11.append(cellSettingsVO);
        b11.append(")");
        return b11.toString();
    }
}
