package ru.ozon.fintech.ui.checkbox;

import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/checkbox/CheckBoxWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "checkBoxDTO", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getCheckBoxDTO", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "provideId", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckBoxWrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final CheckBoxDTO checkBoxDTO;

    @NotNull
    private final Common common;

    public CheckBoxWrapperState(@NotNull Common common, @NotNull CheckBoxDTO checkBoxDTO) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(checkBoxDTO, "checkBoxDTO");
        this.common = common;
        this.checkBoxDTO = checkBoxDTO;
    }

    public static /* synthetic */ CheckBoxWrapperState copy$default(CheckBoxWrapperState checkBoxWrapperState, Common common, CheckBoxDTO checkBoxDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = checkBoxWrapperState.common;
        }
        if ((i11 & 2) != 0) {
            checkBoxDTO = checkBoxWrapperState.checkBoxDTO;
        }
        return checkBoxWrapperState.copy(common, checkBoxDTO);
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
    public final CheckBoxDTO getCheckBoxDTO() {
        return this.checkBoxDTO;
    }

    @NotNull
    public final CheckBoxWrapperState copy(@NotNull Common common, @NotNull CheckBoxDTO checkBoxDTO) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(checkBoxDTO, "checkBoxDTO");
        return new CheckBoxWrapperState(common, checkBoxDTO);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxWrapperState)) {
            return false;
        }
        CheckBoxWrapperState checkBoxWrapperState = (CheckBoxWrapperState) other;
        return Intrinsics.d(this.common, checkBoxWrapperState.common) && Intrinsics.d(this.checkBoxDTO, checkBoxWrapperState.checkBoxDTO);
    }

    @NotNull
    public final CheckBoxDTO getCheckBoxDTO() {
        return this.checkBoxDTO;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public int hashCode() {
        return this.checkBoxDTO.hashCode() + (this.common.hashCode() * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        return "CheckBoxWrapperState(common=" + this.common + ", checkBoxDTO=" + this.checkBoxDTO + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
