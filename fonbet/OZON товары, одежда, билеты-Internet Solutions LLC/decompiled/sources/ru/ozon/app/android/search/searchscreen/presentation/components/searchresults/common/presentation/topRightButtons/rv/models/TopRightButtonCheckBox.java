package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/models/TopRightButtonCheckBox;", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(ZLru/ozon/uni/atoms/data/AtomActionDTO;)V", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TopRightButtonCheckBox {
    public static final int $stable = 0;

    @NotNull
    private final AtomActionDTO action;
    private final boolean isSelected;

    public TopRightButtonCheckBox(boolean z11, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.isSelected = z11;
        this.action = action;
    }

    public static /* synthetic */ TopRightButtonCheckBox copy$default(TopRightButtonCheckBox topRightButtonCheckBox, boolean z11, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = topRightButtonCheckBox.isSelected;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = topRightButtonCheckBox.action;
        }
        return topRightButtonCheckBox.copy(z11, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TopRightButtonCheckBox copy(boolean isSelected, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new TopRightButtonCheckBox(isSelected, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopRightButtonCheckBox)) {
            return false;
        }
        TopRightButtonCheckBox topRightButtonCheckBox = (TopRightButtonCheckBox) other;
        return this.isSelected == topRightButtonCheckBox.isSelected && Intrinsics.d(this.action, topRightButtonCheckBox.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode() + (Boolean.hashCode(this.isSelected) * 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        return "TopRightButtonCheckBox(isSelected=" + this.isSelected + ", action=" + this.action + ")";
    }

    public /* synthetic */ TopRightButtonCheckBox(boolean z11, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, atomActionDTO);
    }
}
