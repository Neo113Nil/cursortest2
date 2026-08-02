package ru.ozon.app.android.travel.molecules.view.travelCellList.v1;

import B0.A0;
import B0.C2454a;
import Bl.C2639a;
import D3.h;
import Sc.InterfaceC3999a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J`\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010\u0017R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "", "topRadius", "bottomRadius", "cellsTopMargin", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "cells", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IIILjava/util/List;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IIILjava/util/List;)Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getBackgroundColor", "I", "getTopRadius", "getBottomRadius", "getCellsTopMargin", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelCellListVO implements c {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final int bottomRadius;

    @NotNull
    private final List<AtomDTO> cells;
    private final int cellsTopMargin;
    private final long id;
    private final TextAtom title;
    private final int topRadius;

    /* JADX WARN: Multi-variable type inference failed */
    public TravelCellListVO(long j11, TextAtom textAtom, String str, int i11, int i12, int i13, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = textAtom;
        this.backgroundColor = str;
        this.topRadius = i11;
        this.bottomRadius = i12;
        this.cellsTopMargin = i13;
        this.cells = cells;
    }

    public static /* synthetic */ TravelCellListVO copy$default(TravelCellListVO travelCellListVO, long j11, TextAtom textAtom, String str, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j11 = travelCellListVO.id;
        }
        long j12 = j11;
        if ((i14 & 2) != 0) {
            textAtom = travelCellListVO.title;
        }
        TextAtom textAtom2 = textAtom;
        if ((i14 & 4) != 0) {
            str = travelCellListVO.backgroundColor;
        }
        String str2 = str;
        if ((i14 & 8) != 0) {
            i11 = travelCellListVO.topRadius;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = travelCellListVO.bottomRadius;
        }
        return travelCellListVO.copy(j12, textAtom2, str2, i15, i12, (i14 & 32) != 0 ? travelCellListVO.cellsTopMargin : i13, (i14 & 64) != 0 ? travelCellListVO.cells : list);
    }

    @NotNull
    public final TravelCellListVO copy(long id2, TextAtom title, String backgroundColor, int topRadius, int bottomRadius, int cellsTopMargin, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new TravelCellListVO(id2, title, backgroundColor, topRadius, bottomRadius, cellsTopMargin, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListVO)) {
            return false;
        }
        TravelCellListVO travelCellListVO = (TravelCellListVO) other;
        return this.id == travelCellListVO.id && Intrinsics.d(this.title, travelCellListVO.title) && Intrinsics.d(this.backgroundColor, travelCellListVO.backgroundColor) && this.topRadius == travelCellListVO.topRadius && this.bottomRadius == travelCellListVO.bottomRadius && this.cellsTopMargin == travelCellListVO.cellsTopMargin && Intrinsics.d(this.cells, travelCellListVO.cells);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBottomRadius() {
        return this.bottomRadius;
    }

    @NotNull
    public final List<AtomDTO> getCells() {
        return this.cells;
    }

    public final int getCellsTopMargin() {
        return this.cellsTopMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final int getTopRadius() {
        return this.topRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.cells.hashCode() + C2454a.a(this.cellsTopMargin, C2454a.a(this.bottomRadius, C2454a.a(this.topRadius, (hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.backgroundColor;
        int i11 = this.topRadius;
        int i12 = this.bottomRadius;
        int i13 = this.cellsTopMargin;
        List<AtomDTO> list = this.cells;
        StringBuilder c11 = C2639a.c("TravelCellListVO(id=", j11, ", title=", textAtom);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", topRadius=");
        c11.append(i11);
        A0.c(i12, i13, ", bottomRadius=", ", cellsTopMargin=", c11);
        return h.c(c11, ", cells=", list, ")");
    }
}
