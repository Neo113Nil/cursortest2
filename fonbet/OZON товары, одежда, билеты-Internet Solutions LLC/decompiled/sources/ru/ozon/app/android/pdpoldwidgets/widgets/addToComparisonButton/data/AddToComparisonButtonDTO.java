package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/data/AddToComparisonButtonDTO;", "", "isAddedToComparison", "", "addToComparisonCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "goToComparisonCell", "<init>", "(ZLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "()Z", "getAddToComparisonCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getGoToComparisonCell", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToComparisonButtonDTO {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon addToComparisonCell;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon goToComparisonCell;
    private final boolean isAddedToComparison;

    public AddToComparisonButtonDTO(boolean z11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon addToComparisonCell, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon goToComparisonCell) {
        Intrinsics.checkNotNullParameter(addToComparisonCell, "addToComparisonCell");
        Intrinsics.checkNotNullParameter(goToComparisonCell, "goToComparisonCell");
        this.isAddedToComparison = z11;
        this.addToComparisonCell = addToComparisonCell;
        this.goToComparisonCell = goToComparisonCell;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getAddToComparisonCell() {
        return this.addToComparisonCell;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getGoToComparisonCell() {
        return this.goToComparisonCell;
    }

    /* renamed from: isAddedToComparison, reason: from getter */
    public final boolean getIsAddedToComparison() {
        return this.isAddedToComparison;
    }
}
