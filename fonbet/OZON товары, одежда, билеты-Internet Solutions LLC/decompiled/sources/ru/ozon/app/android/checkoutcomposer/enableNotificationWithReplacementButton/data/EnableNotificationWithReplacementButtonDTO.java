package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO;", "", "enableNotificationButton", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;", "replacementButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "replacementButtonWithRedDot", "<init>", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;)V", "getEnableNotificationButton", "()Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;", "getReplacementButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getReplacementButtonWithRedDot", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonWithRedDotDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EnableNotificationWithReplacementButtonDTO {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    private final ButtonWithRedDotDTO enableNotificationButton;
    private final ButtonV3Atom.SmallIconButton replacementButton;
    private final ButtonWithRedDotDTO replacementButtonWithRedDot;

    public EnableNotificationWithReplacementButtonDTO(@NotNull ButtonWithRedDotDTO enableNotificationButton, ButtonV3Atom.SmallIconButton smallIconButton, ButtonWithRedDotDTO buttonWithRedDotDTO) {
        Intrinsics.checkNotNullParameter(enableNotificationButton, "enableNotificationButton");
        this.enableNotificationButton = enableNotificationButton;
        this.replacementButton = smallIconButton;
        this.replacementButtonWithRedDot = buttonWithRedDotDTO;
    }

    public static /* synthetic */ EnableNotificationWithReplacementButtonDTO copy$default(EnableNotificationWithReplacementButtonDTO enableNotificationWithReplacementButtonDTO, ButtonWithRedDotDTO buttonWithRedDotDTO, ButtonV3Atom.SmallIconButton smallIconButton, ButtonWithRedDotDTO buttonWithRedDotDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonWithRedDotDTO = enableNotificationWithReplacementButtonDTO.enableNotificationButton;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = enableNotificationWithReplacementButtonDTO.replacementButton;
        }
        if ((i11 & 4) != 0) {
            buttonWithRedDotDTO2 = enableNotificationWithReplacementButtonDTO.replacementButtonWithRedDot;
        }
        return enableNotificationWithReplacementButtonDTO.copy(buttonWithRedDotDTO, smallIconButton, buttonWithRedDotDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonWithRedDotDTO getEnableNotificationButton() {
        return this.enableNotificationButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getReplacementButton() {
        return this.replacementButton;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonWithRedDotDTO getReplacementButtonWithRedDot() {
        return this.replacementButtonWithRedDot;
    }

    @NotNull
    public final EnableNotificationWithReplacementButtonDTO copy(@NotNull ButtonWithRedDotDTO enableNotificationButton, ButtonV3Atom.SmallIconButton replacementButton, ButtonWithRedDotDTO replacementButtonWithRedDot) {
        Intrinsics.checkNotNullParameter(enableNotificationButton, "enableNotificationButton");
        return new EnableNotificationWithReplacementButtonDTO(enableNotificationButton, replacementButton, replacementButtonWithRedDot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableNotificationWithReplacementButtonDTO)) {
            return false;
        }
        EnableNotificationWithReplacementButtonDTO enableNotificationWithReplacementButtonDTO = (EnableNotificationWithReplacementButtonDTO) other;
        return Intrinsics.d(this.enableNotificationButton, enableNotificationWithReplacementButtonDTO.enableNotificationButton) && Intrinsics.d(this.replacementButton, enableNotificationWithReplacementButtonDTO.replacementButton) && Intrinsics.d(this.replacementButtonWithRedDot, enableNotificationWithReplacementButtonDTO.replacementButtonWithRedDot);
    }

    @NotNull
    public final ButtonWithRedDotDTO getEnableNotificationButton() {
        return this.enableNotificationButton;
    }

    public final ButtonV3Atom.SmallIconButton getReplacementButton() {
        return this.replacementButton;
    }

    public final ButtonWithRedDotDTO getReplacementButtonWithRedDot() {
        return this.replacementButtonWithRedDot;
    }

    public int hashCode() {
        int hashCode = this.enableNotificationButton.hashCode() * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.replacementButton;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonWithRedDotDTO buttonWithRedDotDTO = this.replacementButtonWithRedDot;
        return hashCode2 + (buttonWithRedDotDTO != null ? buttonWithRedDotDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EnableNotificationWithReplacementButtonDTO(enableNotificationButton=" + this.enableNotificationButton + ", replacementButton=" + this.replacementButton + ", replacementButtonWithRedDot=" + this.replacementButtonWithRedDot + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;", "", "hasRedDot", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getHasRedDot", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;", "equals", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWithRedDotDTO {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton button;
        private final Boolean hasRedDot;

        public ButtonWithRedDotDTO(Boolean bool, @NotNull ButtonV3Atom.SmallIconButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.hasRedDot = bool;
            this.button = button;
        }

        public static /* synthetic */ ButtonWithRedDotDTO copy$default(ButtonWithRedDotDTO buttonWithRedDotDTO, Boolean bool, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = buttonWithRedDotDTO.hasRedDot;
            }
            if ((i11 & 2) != 0) {
                smallIconButton = buttonWithRedDotDTO.button;
            }
            return buttonWithRedDotDTO.copy(bool, smallIconButton);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getHasRedDot() {
            return this.hasRedDot;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getButton() {
            return this.button;
        }

        @NotNull
        public final ButtonWithRedDotDTO copy(Boolean hasRedDot, @NotNull ButtonV3Atom.SmallIconButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new ButtonWithRedDotDTO(hasRedDot, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWithRedDotDTO)) {
                return false;
            }
            ButtonWithRedDotDTO buttonWithRedDotDTO = (ButtonWithRedDotDTO) other;
            return Intrinsics.d(this.hasRedDot, buttonWithRedDotDTO.hasRedDot) && Intrinsics.d(this.button, buttonWithRedDotDTO.button);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getButton() {
            return this.button;
        }

        public final Boolean getHasRedDot() {
            return this.hasRedDot;
        }

        public int hashCode() {
            Boolean bool = this.hasRedDot;
            return this.button.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonWithRedDotDTO(hasRedDot=" + this.hasRedDot + ", button=" + this.button + ")";
        }

        public /* synthetic */ ButtonWithRedDotDTO(Boolean bool, ButtonV3Atom.SmallIconButton smallIconButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bool, smallIconButton);
        }
    }
}
