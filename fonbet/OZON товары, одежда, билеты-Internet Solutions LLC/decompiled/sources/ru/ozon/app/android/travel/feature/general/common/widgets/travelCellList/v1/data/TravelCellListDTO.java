package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v1.data;

import Bl.b;
import Ef0.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JZ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v1/data/TravelCellListDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "topRadius", "", "bottomRadius", "cellsTopMargin", "cells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "getTopRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomRadius", "getCellsTopMargin", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v1/data/TravelCellListDTO;", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCellListDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Integer bottomRadius;

    @NotNull
    private final List<AtomDTO> cells;
    private final Integer cellsTopMargin;
    private final TextAtom title;
    private final Integer topRadius;

    /* JADX WARN: Multi-variable type inference failed */
    public TravelCellListDTO(TextAtom textAtom, String str, Integer num, Integer num2, Integer num3, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.title = textAtom;
        this.backgroundColor = str;
        this.topRadius = num;
        this.bottomRadius = num2;
        this.cellsTopMargin = num3;
        this.cells = cells;
    }

    public static /* synthetic */ TravelCellListDTO copy$default(TravelCellListDTO travelCellListDTO, TextAtom textAtom, String str, Integer num, Integer num2, Integer num3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelCellListDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = travelCellListDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            num = travelCellListDTO.topRadius;
        }
        if ((i11 & 8) != 0) {
            num2 = travelCellListDTO.bottomRadius;
        }
        if ((i11 & 16) != 0) {
            num3 = travelCellListDTO.cellsTopMargin;
        }
        if ((i11 & 32) != 0) {
            list = travelCellListDTO.cells;
        }
        Integer num4 = num3;
        List list2 = list;
        return travelCellListDTO.copy(textAtom, str, num, num2, num4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTopRadius() {
        return this.topRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBottomRadius() {
        return this.bottomRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getCellsTopMargin() {
        return this.cellsTopMargin;
    }

    @NotNull
    public final List<AtomDTO> component6() {
        return this.cells;
    }

    @NotNull
    public final TravelCellListDTO copy(TextAtom title, String backgroundColor, Integer topRadius, Integer bottomRadius, Integer cellsTopMargin, @NotNull List<? extends AtomDTO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new TravelCellListDTO(title, backgroundColor, topRadius, bottomRadius, cellsTopMargin, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListDTO)) {
            return false;
        }
        TravelCellListDTO travelCellListDTO = (TravelCellListDTO) other;
        return Intrinsics.d(this.title, travelCellListDTO.title) && Intrinsics.d(this.backgroundColor, travelCellListDTO.backgroundColor) && Intrinsics.d(this.topRadius, travelCellListDTO.topRadius) && Intrinsics.d(this.bottomRadius, travelCellListDTO.bottomRadius) && Intrinsics.d(this.cellsTopMargin, travelCellListDTO.cellsTopMargin) && Intrinsics.d(this.cells, travelCellListDTO.cells);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getBottomRadius() {
        return this.bottomRadius;
    }

    @NotNull
    public final List<AtomDTO> getCells() {
        return this.cells;
    }

    public final Integer getCellsTopMargin() {
        return this.cellsTopMargin;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Integer getTopRadius() {
        return this.topRadius;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.topRadius;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomRadius;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.cellsTopMargin;
        return this.cells.hashCode() + ((hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.backgroundColor;
        Integer num = this.topRadius;
        Integer num2 = this.bottomRadius;
        Integer num3 = this.cellsTopMargin;
        List<AtomDTO> list = this.cells;
        StringBuilder d11 = b.d("TravelCellListDTO(title=", ", backgroundColor=", str, ", topRadius=", textAtom);
        c.e(d11, num, ", bottomRadius=", num2, ", cellsTopMargin=");
        d11.append(num3);
        d11.append(", cells=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }

    public TravelCellListDTO(TextAtom textAtom, String str, Integer num, Integer num2, Integer num3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, str, num, num2, num3, (i11 & 32) != 0 ? K.f71697a : list);
    }
}
