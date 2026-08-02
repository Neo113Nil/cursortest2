package ru.ozon.app.android.ugc.core.widgets.rowList.presentation;

import Bi.b;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isSelected", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "normal", "selected", "LWZ/t;", "tokenizedEvent", "<init>", "(JZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)V", "copy", "(JZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getNormal", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSelected", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "cellDto", "getCellDto", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RowListItemVO implements c {

    @NotNull
    private final CellDTO cellDto;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final CellDTO normal;
    private final CellDTO selected;
    private final t tokenizedEvent;

    public RowListItemVO(long j11, boolean z11, @NotNull CellDTO normal, CellDTO cellDTO, t tVar) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.id = j11;
        this.isSelected = z11;
        this.normal = normal;
        this.selected = cellDTO;
        this.tokenizedEvent = tVar;
        if (z11 && cellDTO != null) {
            normal = cellDTO;
        }
        this.cellDto = normal;
    }

    public static /* synthetic */ RowListItemVO copy$default(RowListItemVO rowListItemVO, long j11, boolean z11, CellDTO cellDTO, CellDTO cellDTO2, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = rowListItemVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = rowListItemVO.isSelected;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            cellDTO = rowListItemVO.normal;
        }
        CellDTO cellDTO3 = cellDTO;
        if ((i11 & 8) != 0) {
            cellDTO2 = rowListItemVO.selected;
        }
        CellDTO cellDTO4 = cellDTO2;
        if ((i11 & 16) != 0) {
            tVar = rowListItemVO.tokenizedEvent;
        }
        return rowListItemVO.copy(j12, z12, cellDTO3, cellDTO4, tVar);
    }

    @NotNull
    public final RowListItemVO copy(long id2, boolean isSelected, @NotNull CellDTO normal, CellDTO selected, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        return new RowListItemVO(id2, isSelected, normal, selected, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowListItemVO)) {
            return false;
        }
        RowListItemVO rowListItemVO = (RowListItemVO) other;
        return this.id == rowListItemVO.id && this.isSelected == rowListItemVO.isSelected && Intrinsics.d(this.normal, rowListItemVO.normal) && Intrinsics.d(this.selected, rowListItemVO.selected) && Intrinsics.d(this.tokenizedEvent, rowListItemVO.tokenizedEvent);
    }

    @NotNull
    public final CellDTO getCellDto() {
        return this.cellDto;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO getNormal() {
        return this.normal;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.normal, C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSelected), 31);
        CellDTO cellDTO = this.selected;
        int hashCode = (c11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSelected;
        CellDTO cellDTO = this.normal;
        CellDTO cellDTO2 = this.selected;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = Bl.b.c(j11, "RowListItemVO(id=", ", isSelected=", z11);
        c11.append(", normal=");
        c11.append(cellDTO);
        c11.append(", selected=");
        c11.append(cellDTO2);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
