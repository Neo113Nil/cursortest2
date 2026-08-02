package ru.ozon.android.messenger.blocks.actionButton;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/blocks/actionButton/ActionButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO button;

    public ActionButtonDTO(@NotNull IconButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
    }

    public static /* synthetic */ ActionButtonDTO copy$default(ActionButtonDTO actionButtonDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = actionButtonDTO.button;
        }
        return actionButtonDTO.copy(iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final ActionButtonDTO copy(@NotNull IconButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new ActionButtonDTO(button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionButtonDTO) && Intrinsics.d(this.button, ((ActionButtonDTO) other).button);
    }

    @NotNull
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    public int hashCode() {
        return this.button.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActionButtonDTO(button=" + this.button + ")";
    }
}
