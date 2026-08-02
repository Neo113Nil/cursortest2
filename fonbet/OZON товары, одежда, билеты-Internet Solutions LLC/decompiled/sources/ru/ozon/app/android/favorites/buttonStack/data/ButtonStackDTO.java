package ru.ozon.app.android.favorites.buttonStack.data;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;", "", "leftButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightButton", "additionalButtons", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "isSticky", "", "paddings", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;)V", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButton", "getAdditionalButtons", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaddings", "()Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;)Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;", "equals", "other", "hashCode", "", "toString", "", "StackPaddings", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonStackDTO {
    private final List<IconButtonV3DTO> additionalButtons;
    private final Boolean isSticky;
    private final ButtonV3DTO leftButton;
    private final StackPaddings paddings;
    private final ButtonV3DTO rightButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "bottom", "top", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "getBottom", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StackPaddings {
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public StackPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.left = paddings;
            this.right = paddings2;
            this.bottom = paddings3;
            this.top = paddings4;
        }

        public static /* synthetic */ StackPaddings copy$default(StackPaddings stackPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = stackPaddings.left;
            }
            if ((i11 & 2) != 0) {
                paddings2 = stackPaddings.right;
            }
            if ((i11 & 4) != 0) {
                paddings3 = stackPaddings.bottom;
            }
            if ((i11 & 8) != 0) {
                paddings4 = stackPaddings.top;
            }
            return stackPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        public final StackPaddings copy(Paddings left, Paddings right, Paddings bottom, Paddings top) {
            return new StackPaddings(left, right, bottom, top);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StackPaddings)) {
                return false;
            }
            StackPaddings stackPaddings = (StackPaddings) other;
            return this.left == stackPaddings.left && this.right == stackPaddings.right && this.bottom == stackPaddings.bottom && this.top == stackPaddings.top;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.left;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.right;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.bottom;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.top;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.left;
            Paddings paddings2 = this.right;
            return b.e(p.b("StackPaddings(left=", paddings, ", right=", paddings2, ", bottom="), this.bottom, ", top=", this.top, ")");
        }
    }

    public ButtonStackDTO(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, List<IconButtonV3DTO> list, Boolean bool, StackPaddings stackPaddings) {
        this.leftButton = buttonV3DTO;
        this.rightButton = buttonV3DTO2;
        this.additionalButtons = list;
        this.isSticky = bool;
        this.paddings = stackPaddings;
    }

    public static /* synthetic */ ButtonStackDTO copy$default(ButtonStackDTO buttonStackDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, List list, Boolean bool, StackPaddings stackPaddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = buttonStackDTO.leftButton;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO2 = buttonStackDTO.rightButton;
        }
        if ((i11 & 4) != 0) {
            list = buttonStackDTO.additionalButtons;
        }
        if ((i11 & 8) != 0) {
            bool = buttonStackDTO.isSticky;
        }
        if ((i11 & 16) != 0) {
            stackPaddings = buttonStackDTO.paddings;
        }
        StackPaddings stackPaddings2 = stackPaddings;
        List list2 = list;
        return buttonStackDTO.copy(buttonV3DTO, buttonV3DTO2, list2, bool, stackPaddings2);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    public final List<IconButtonV3DTO> component3() {
        return this.additionalButtons;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component5, reason: from getter */
    public final StackPaddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final ButtonStackDTO copy(ButtonV3DTO leftButton, ButtonV3DTO rightButton, List<IconButtonV3DTO> additionalButtons, Boolean isSticky, StackPaddings paddings) {
        return new ButtonStackDTO(leftButton, rightButton, additionalButtons, isSticky, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStackDTO)) {
            return false;
        }
        ButtonStackDTO buttonStackDTO = (ButtonStackDTO) other;
        return Intrinsics.d(this.leftButton, buttonStackDTO.leftButton) && Intrinsics.d(this.rightButton, buttonStackDTO.rightButton) && Intrinsics.d(this.additionalButtons, buttonStackDTO.additionalButtons) && Intrinsics.d(this.isSticky, buttonStackDTO.isSticky) && Intrinsics.d(this.paddings, buttonStackDTO.paddings);
    }

    public final List<IconButtonV3DTO> getAdditionalButtons() {
        return this.additionalButtons;
    }

    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    public final StackPaddings getPaddings() {
        return this.paddings;
    }

    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    public int hashCode() {
        ButtonV3DTO buttonV3DTO = this.leftButton;
        int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
        ButtonV3DTO buttonV3DTO2 = this.rightButton;
        int hashCode2 = (hashCode + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
        List<IconButtonV3DTO> list = this.additionalButtons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isSticky;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        StackPaddings stackPaddings = this.paddings;
        return hashCode4 + (stackPaddings != null ? stackPaddings.hashCode() : 0);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "ButtonStackDTO(leftButton=" + this.leftButton + ", rightButton=" + this.rightButton + ", additionalButtons=" + this.additionalButtons + ", isSticky=" + this.isSticky + ", paddings=" + this.paddings + ")";
    }
}
