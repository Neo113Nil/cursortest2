package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "", "", "isSelectedAll", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "selectAllButton", "deselectAllButton", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "copy", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getSelectAllButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getDeselectAllButton", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectionButtons {

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton deselectAllButton;
    private final boolean isSelectedAll;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton selectAllButton;

    public SelectionButtons(boolean z11, @NotNull ButtonV3Atom.LargeBorderlessButton selectAllButton, @NotNull ButtonV3Atom.LargeBorderlessButton deselectAllButton) {
        Intrinsics.checkNotNullParameter(selectAllButton, "selectAllButton");
        Intrinsics.checkNotNullParameter(deselectAllButton, "deselectAllButton");
        this.isSelectedAll = z11;
        this.selectAllButton = selectAllButton;
        this.deselectAllButton = deselectAllButton;
    }

    public static /* synthetic */ SelectionButtons copy$default(SelectionButtons selectionButtons, boolean z11, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = selectionButtons.isSelectedAll;
        }
        if ((i11 & 2) != 0) {
            largeBorderlessButton = selectionButtons.selectAllButton;
        }
        if ((i11 & 4) != 0) {
            largeBorderlessButton2 = selectionButtons.deselectAllButton;
        }
        return selectionButtons.copy(z11, largeBorderlessButton, largeBorderlessButton2);
    }

    @NotNull
    public final SelectionButtons copy(boolean isSelectedAll, @NotNull ButtonV3Atom.LargeBorderlessButton selectAllButton, @NotNull ButtonV3Atom.LargeBorderlessButton deselectAllButton) {
        Intrinsics.checkNotNullParameter(selectAllButton, "selectAllButton");
        Intrinsics.checkNotNullParameter(deselectAllButton, "deselectAllButton");
        return new SelectionButtons(isSelectedAll, selectAllButton, deselectAllButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionButtons)) {
            return false;
        }
        SelectionButtons selectionButtons = (SelectionButtons) other;
        return this.isSelectedAll == selectionButtons.isSelectedAll && Intrinsics.d(this.selectAllButton, selectionButtons.selectAllButton) && Intrinsics.d(this.deselectAllButton, selectionButtons.deselectAllButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getDeselectAllButton() {
        return this.deselectAllButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getSelectAllButton() {
        return this.selectAllButton;
    }

    public int hashCode() {
        return this.deselectAllButton.hashCode() + ((this.selectAllButton.hashCode() + (Boolean.hashCode(this.isSelectedAll) * 31)) * 31);
    }

    /* renamed from: isSelectedAll, reason: from getter */
    public final boolean getIsSelectedAll() {
        return this.isSelectedAll;
    }

    @NotNull
    public String toString() {
        return "SelectionButtons(isSelectedAll=" + this.isSelectedAll + ", selectAllButton=" + this.selectAllButton + ", deselectAllButton=" + this.deselectAllButton + ")";
    }
}
