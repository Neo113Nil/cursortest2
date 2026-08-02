package ru.ozon.app.android.travel.molecules.view.travelCellList.v2;

import B0.A0;
import B0.C2454a;
import Bl.C2639a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b/\u0010\u0019R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "backgroundColor", "", "topRadius", "bottomRadius", "cellsTopMargin", "blockBottomMargin", "blockTitleBottomMargin", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "cells", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;IIIIILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "I", "getTopRadius", "getBottomRadius", "getCellsTopMargin", "getBlockBottomMargin", "getBlockTitleBottomMargin", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelCellListV2VO implements c {
    private final String backgroundColor;
    private final int blockBottomMargin;
    private final int blockTitleBottomMargin;
    private final int bottomRadius;

    @NotNull
    private final List<AtomDTO> cells;
    private final int cellsTopMargin;
    private final long id;
    private final TextDTO subtitle;
    private final TextAtom title;
    private final int topRadius;

    /* JADX WARN: Multi-variable type inference failed */
    public TravelCellListV2VO(long j11, TextAtom textAtom, TextDTO textDTO, String str, int i11, int i12, int i13, int i14, int i15, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.title = textAtom;
        this.subtitle = textDTO;
        this.backgroundColor = str;
        this.topRadius = i11;
        this.bottomRadius = i12;
        this.cellsTopMargin = i13;
        this.blockBottomMargin = i14;
        this.blockTitleBottomMargin = i15;
        this.cells = cells;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListV2VO)) {
            return false;
        }
        TravelCellListV2VO travelCellListV2VO = (TravelCellListV2VO) other;
        return this.id == travelCellListV2VO.id && Intrinsics.d(this.title, travelCellListV2VO.title) && Intrinsics.d(this.subtitle, travelCellListV2VO.subtitle) && Intrinsics.d(this.backgroundColor, travelCellListV2VO.backgroundColor) && this.topRadius == travelCellListV2VO.topRadius && this.bottomRadius == travelCellListV2VO.bottomRadius && this.cellsTopMargin == travelCellListV2VO.cellsTopMargin && this.blockBottomMargin == travelCellListV2VO.blockBottomMargin && this.blockTitleBottomMargin == travelCellListV2VO.blockTitleBottomMargin && Intrinsics.d(this.cells, travelCellListV2VO.cells);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBlockBottomMargin() {
        return this.blockBottomMargin;
    }

    public final int getBlockTitleBottomMargin() {
        return this.blockTitleBottomMargin;
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

    public final TextDTO getSubtitle() {
        return this.subtitle;
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
        TextDTO textDTO = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.cells.hashCode() + C2454a.a(this.blockTitleBottomMargin, C2454a.a(this.blockBottomMargin, C2454a.a(this.cellsTopMargin, C2454a.a(this.bottomRadius, C2454a.a(this.topRadius, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextDTO textDTO = this.subtitle;
        String str = this.backgroundColor;
        int i11 = this.topRadius;
        int i12 = this.bottomRadius;
        int i13 = this.cellsTopMargin;
        int i14 = this.blockBottomMargin;
        int i15 = this.blockTitleBottomMargin;
        List<AtomDTO> list = this.cells;
        StringBuilder c11 = C2639a.c("TravelCellListV2VO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textDTO);
        c11.append(", backgroundColor=");
        c11.append(str);
        A0.c(i11, i12, ", topRadius=", ", bottomRadius=", c11);
        A0.c(i13, i14, ", cellsTopMargin=", ", blockBottomMargin=", c11);
        c11.append(", blockTitleBottomMargin=");
        c11.append(i15);
        c11.append(", cells=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
