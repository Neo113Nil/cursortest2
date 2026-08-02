package ru.ozon.fintech.ui.toggleatom;

import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/toggleatom/ToggleAtomWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "toggleV3DTO", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getToggleV3DTO", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "provideId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleAtomWrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;

    @NotNull
    private final ToggleDTO toggleV3DTO;

    public ToggleAtomWrapperState(@NotNull Common common, @NotNull ToggleDTO toggleV3DTO) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(toggleV3DTO, "toggleV3DTO");
        this.common = common;
        this.toggleV3DTO = toggleV3DTO;
    }

    public static /* synthetic */ ToggleAtomWrapperState copy$default(ToggleAtomWrapperState toggleAtomWrapperState, Common common, ToggleDTO toggleDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = toggleAtomWrapperState.common;
        }
        if ((i11 & 2) != 0) {
            toggleDTO = toggleAtomWrapperState.toggleV3DTO;
        }
        return toggleAtomWrapperState.copy(common, toggleDTO);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ToggleDTO getToggleV3DTO() {
        return this.toggleV3DTO;
    }

    @NotNull
    public final ToggleAtomWrapperState copy(@NotNull Common common, @NotNull ToggleDTO toggleV3DTO) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(toggleV3DTO, "toggleV3DTO");
        return new ToggleAtomWrapperState(common, toggleV3DTO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleAtomWrapperState)) {
            return false;
        }
        ToggleAtomWrapperState toggleAtomWrapperState = (ToggleAtomWrapperState) other;
        return Intrinsics.d(this.common, toggleAtomWrapperState.common) && Intrinsics.d(this.toggleV3DTO, toggleAtomWrapperState.toggleV3DTO);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    @NotNull
    public final ToggleDTO getToggleV3DTO() {
        return this.toggleV3DTO;
    }

    public int hashCode() {
        return this.toggleV3DTO.hashCode() + (this.common.hashCode() * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        return "ToggleAtomWrapperState(common=" + this.common + ", toggleV3DTO=" + this.toggleV3DTO + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
