package ru.ozon.fintech.ui.buttonV22;

import De.C2859b;
import Pk0.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/buttonV22/ButtonAtomWrapperV22State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "buttonDTO", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "isLoading", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "()Z", "provideId", "", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonAtomWrapperV22State implements RecyclerItem, WidgetState {

    @NotNull
    private final ButtonV3DTO buttonDTO;

    @NotNull
    private final Common common;
    private final boolean isLoading;

    public ButtonAtomWrapperV22State(@NotNull Common common, @NotNull ButtonV3DTO buttonDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        this.common = common;
        this.buttonDTO = buttonDTO;
        this.isLoading = z11;
    }

    public static /* synthetic */ ButtonAtomWrapperV22State copy$default(ButtonAtomWrapperV22State buttonAtomWrapperV22State, Common common, ButtonV3DTO buttonV3DTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            common = buttonAtomWrapperV22State.common;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = buttonAtomWrapperV22State.buttonDTO;
        }
        if ((i11 & 4) != 0) {
            z11 = buttonAtomWrapperV22State.isLoading;
        }
        return buttonAtomWrapperV22State.copy(common, buttonV3DTO, z11);
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
    public final ButtonV3DTO getButtonDTO() {
        return this.buttonDTO;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public final ButtonAtomWrapperV22State copy(@NotNull Common common, @NotNull ButtonV3DTO buttonDTO, boolean isLoading) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        return new ButtonAtomWrapperV22State(common, buttonDTO, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonAtomWrapperV22State)) {
            return false;
        }
        ButtonAtomWrapperV22State buttonAtomWrapperV22State = (ButtonAtomWrapperV22State) other;
        return Intrinsics.d(this.common, buttonAtomWrapperV22State.common) && Intrinsics.d(this.buttonDTO, buttonAtomWrapperV22State.buttonDTO) && this.isLoading == buttonAtomWrapperV22State.isLoading;
    }

    @NotNull
    public final ButtonV3DTO getButtonDTO() {
        return this.buttonDTO;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + C2859b.c(this.buttonDTO, this.common.hashCode() * 31, 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        ButtonV3DTO buttonV3DTO = this.buttonDTO;
        boolean z11 = this.isLoading;
        StringBuilder sb2 = new StringBuilder("ButtonAtomWrapperV22State(common=");
        sb2.append(common);
        sb2.append(", buttonDTO=");
        sb2.append(buttonV3DTO);
        sb2.append(", isLoading=");
        return a.a(")", sb2, z11);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ ButtonAtomWrapperV22State(Common common, ButtonV3DTO buttonV3DTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(common, buttonV3DTO, (i11 & 4) != 0 ? false : z11);
    }
}
