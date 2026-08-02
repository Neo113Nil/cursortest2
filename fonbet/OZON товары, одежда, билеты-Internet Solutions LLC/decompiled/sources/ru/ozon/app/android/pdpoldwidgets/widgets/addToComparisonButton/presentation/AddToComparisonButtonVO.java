package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation;

import Bl.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isAddedToComparison", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "addToComparisonCell", "goToComparisonCell", "<init>", "(JZLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "copy", "(JZLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getAddToComparisonCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getGoToComparisonCell", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddToComparisonButtonVO implements c {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon addToComparisonCell;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon goToComparisonCell;
    private final long id;
    private final boolean isAddedToComparison;

    public AddToComparisonButtonVO(long j11, boolean z11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon addToComparisonCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon goToComparisonCell) {
        Intrinsics.checkNotNullParameter(addToComparisonCell, "addToComparisonCell");
        Intrinsics.checkNotNullParameter(goToComparisonCell, "goToComparisonCell");
        this.id = j11;
        this.isAddedToComparison = z11;
        this.addToComparisonCell = addToComparisonCell;
        this.goToComparisonCell = goToComparisonCell;
    }

    public static /* synthetic */ AddToComparisonButtonVO copy$default(AddToComparisonButtonVO addToComparisonButtonVO, long j11, boolean z11, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addToComparisonButtonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = addToComparisonButtonVO.isAddedToComparison;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            cellWithSubtitle24Icon = addToComparisonButtonVO.addToComparisonCell;
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon3 = cellWithSubtitle24Icon;
        if ((i11 & 8) != 0) {
            cellWithSubtitle24Icon2 = addToComparisonButtonVO.goToComparisonCell;
        }
        return addToComparisonButtonVO.copy(j12, z12, cellWithSubtitle24Icon3, cellWithSubtitle24Icon2);
    }

    @NotNull
    public final AddToComparisonButtonVO copy(long id2, boolean isAddedToComparison, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon addToComparisonCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon goToComparisonCell) {
        Intrinsics.checkNotNullParameter(addToComparisonCell, "addToComparisonCell");
        Intrinsics.checkNotNullParameter(goToComparisonCell, "goToComparisonCell");
        return new AddToComparisonButtonVO(id2, isAddedToComparison, addToComparisonCell, goToComparisonCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToComparisonButtonVO)) {
            return false;
        }
        AddToComparisonButtonVO addToComparisonButtonVO = (AddToComparisonButtonVO) other;
        return this.id == addToComparisonButtonVO.id && this.isAddedToComparison == addToComparisonButtonVO.isAddedToComparison && Intrinsics.d(this.addToComparisonCell, addToComparisonButtonVO.addToComparisonCell) && Intrinsics.d(this.goToComparisonCell, addToComparisonButtonVO.goToComparisonCell);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getAddToComparisonCell() {
        return this.addToComparisonCell;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getGoToComparisonCell() {
        return this.goToComparisonCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.goToComparisonCell.hashCode() + ((this.addToComparisonCell.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isAddedToComparison)) * 31);
    }

    /* renamed from: isAddedToComparison, reason: from getter */
    public final boolean getIsAddedToComparison() {
        return this.isAddedToComparison;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isAddedToComparison;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.addToComparisonCell;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon2 = this.goToComparisonCell;
        StringBuilder c11 = b.c(j11, "AddToComparisonButtonVO(id=", ", isAddedToComparison=", z11);
        c11.append(", addToComparisonCell=");
        c11.append(cellWithSubtitle24Icon);
        c11.append(", goToComparisonCell=");
        c11.append(cellWithSubtitle24Icon2);
        c11.append(")");
        return c11.toString();
    }
}
