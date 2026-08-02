package ru.ozon.android.messenger.blocks.input;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/input/SendButtonModeDTO;", "", "modeName", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getModeName", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SendButtonModeDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO button;

    @NotNull
    private final String modeName;

    public SendButtonModeDTO(@NotNull String modeName, @NotNull IconButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(modeName, "modeName");
        Intrinsics.checkNotNullParameter(button, "button");
        this.modeName = modeName;
        this.button = button;
    }

    public static /* synthetic */ SendButtonModeDTO copy$default(SendButtonModeDTO sendButtonModeDTO, String str, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sendButtonModeDTO.modeName;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = sendButtonModeDTO.button;
        }
        return sendButtonModeDTO.copy(str, iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getModeName() {
        return this.modeName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final SendButtonModeDTO copy(@NotNull String modeName, @NotNull IconButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(modeName, "modeName");
        Intrinsics.checkNotNullParameter(button, "button");
        return new SendButtonModeDTO(modeName, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendButtonModeDTO)) {
            return false;
        }
        SendButtonModeDTO sendButtonModeDTO = (SendButtonModeDTO) other;
        return Intrinsics.d(this.modeName, sendButtonModeDTO.modeName) && Intrinsics.d(this.button, sendButtonModeDTO.button);
    }

    @NotNull
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final String getModeName() {
        return this.modeName;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.modeName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SendButtonModeDTO(modeName=" + this.modeName + ", button=" + this.button + ")";
    }
}
