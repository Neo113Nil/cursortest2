package ru.ozon.app.android.orders.cml.groupButtons.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/data/TextAndIconButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextAndIconButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final ButtonV3DTO button;
    private final IconButtonV3DTO iconButton;

    public TextAndIconButtonDTO(@NotNull ButtonV3DTO button, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.iconButton = iconButtonV3DTO;
    }

    public static /* synthetic */ TextAndIconButtonDTO copy$default(TextAndIconButtonDTO textAndIconButtonDTO, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = textAndIconButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = textAndIconButtonDTO.iconButton;
        }
        return textAndIconButtonDTO.copy(buttonV3DTO, iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextAndIconButtonDTO copy(@NotNull ButtonV3DTO button, IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new TextAndIconButtonDTO(button, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAndIconButtonDTO)) {
            return false;
        }
        TextAndIconButtonDTO textAndIconButtonDTO = (TextAndIconButtonDTO) other;
        return Intrinsics.d(this.button, textAndIconButtonDTO.button) && Intrinsics.d(this.iconButton, textAndIconButtonDTO.iconButton);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TextAndIconButtonDTO(button=" + this.button + ", iconButton=" + this.iconButton + ")";
    }
}
