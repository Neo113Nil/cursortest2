package ru.ozon.app.android.widgets.buttonWidget;

import GZ.e;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0084\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001c¨\u00067"}, d2 = {"Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "buttonV2", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "isSticky", "", "buttonV3", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hasShadowIfSticky", "align", "Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "buttonFill", "buttonHorizontalMargin", "", "buttonVerticalMargin", "hasBackgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/widgets/buttonWidget/AlignType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButtonV2", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "()Z", "getButtonV3", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getHasShadowIfSticky", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAlign", "()Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "getButtonFill", "getButtonHorizontalMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getButtonVerticalMargin", "getHasBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/widgets/buttonWidget/AlignType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "equals", "other", "hashCode", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ButtonWidgetDTO {
    private final AlignType align;
    private final ButtonV3Atom.LargeButton button;
    private final Boolean buttonFill;
    private final Integer buttonHorizontalMargin;
    private final ButtonDTO buttonV2;
    private final ButtonV3DTO buttonV3;
    private final Integer buttonVerticalMargin;
    private final Boolean hasBackgroundColor;
    private final Boolean hasShadowIfSticky;
    private final boolean isSticky;

    public ButtonWidgetDTO(ButtonV3Atom.LargeButton largeButton, ButtonDTO buttonDTO, boolean z11, ButtonV3DTO buttonV3DTO, Boolean bool, AlignType alignType, Boolean bool2, Integer num, Integer num2, Boolean bool3) {
        this.button = largeButton;
        this.buttonV2 = buttonDTO;
        this.isSticky = z11;
        this.buttonV3 = buttonV3DTO;
        this.hasShadowIfSticky = bool;
        this.align = alignType;
        this.buttonFill = bool2;
        this.buttonHorizontalMargin = num;
        this.buttonVerticalMargin = num2;
        this.hasBackgroundColor = bool3;
    }

    public static /* synthetic */ ButtonWidgetDTO copy$default(ButtonWidgetDTO buttonWidgetDTO, ButtonV3Atom.LargeButton largeButton, ButtonDTO buttonDTO, boolean z11, ButtonV3DTO buttonV3DTO, Boolean bool, AlignType alignType, Boolean bool2, Integer num, Integer num2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = buttonWidgetDTO.button;
        }
        if ((i11 & 2) != 0) {
            buttonDTO = buttonWidgetDTO.buttonV2;
        }
        if ((i11 & 4) != 0) {
            z11 = buttonWidgetDTO.isSticky;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = buttonWidgetDTO.buttonV3;
        }
        if ((i11 & 16) != 0) {
            bool = buttonWidgetDTO.hasShadowIfSticky;
        }
        if ((i11 & 32) != 0) {
            alignType = buttonWidgetDTO.align;
        }
        if ((i11 & 64) != 0) {
            bool2 = buttonWidgetDTO.buttonFill;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num = buttonWidgetDTO.buttonHorizontalMargin;
        }
        if ((i11 & 256) != 0) {
            num2 = buttonWidgetDTO.buttonVerticalMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool3 = buttonWidgetDTO.hasBackgroundColor;
        }
        Integer num3 = num2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        Integer num4 = num;
        Boolean bool6 = bool;
        AlignType alignType2 = alignType;
        return buttonWidgetDTO.copy(largeButton, buttonDTO, z11, buttonV3DTO, bool6, alignType2, bool5, num4, num3, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonDTO getButtonV2() {
        return this.buttonV2;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasShadowIfSticky() {
        return this.hasShadowIfSticky;
    }

    /* renamed from: component6, reason: from getter */
    public final AlignType getAlign() {
        return this.align;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getButtonFill() {
        return this.buttonFill;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getButtonVerticalMargin() {
        return this.buttonVerticalMargin;
    }

    @NotNull
    public final ButtonWidgetDTO copy(ButtonV3Atom.LargeButton button, ButtonDTO buttonV2, boolean isSticky, ButtonV3DTO buttonV3, Boolean hasShadowIfSticky, AlignType align, Boolean buttonFill, Integer buttonHorizontalMargin, Integer buttonVerticalMargin, Boolean hasBackgroundColor) {
        return new ButtonWidgetDTO(button, buttonV2, isSticky, buttonV3, hasShadowIfSticky, align, buttonFill, buttonHorizontalMargin, buttonVerticalMargin, hasBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWidgetDTO)) {
            return false;
        }
        ButtonWidgetDTO buttonWidgetDTO = (ButtonWidgetDTO) other;
        return Intrinsics.d(this.button, buttonWidgetDTO.button) && Intrinsics.d(this.buttonV2, buttonWidgetDTO.buttonV2) && this.isSticky == buttonWidgetDTO.isSticky && Intrinsics.d(this.buttonV3, buttonWidgetDTO.buttonV3) && Intrinsics.d(this.hasShadowIfSticky, buttonWidgetDTO.hasShadowIfSticky) && this.align == buttonWidgetDTO.align && Intrinsics.d(this.buttonFill, buttonWidgetDTO.buttonFill) && Intrinsics.d(this.buttonHorizontalMargin, buttonWidgetDTO.buttonHorizontalMargin) && Intrinsics.d(this.buttonVerticalMargin, buttonWidgetDTO.buttonVerticalMargin) && Intrinsics.d(this.hasBackgroundColor, buttonWidgetDTO.hasBackgroundColor);
    }

    public final AlignType getAlign() {
        return this.align;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final Boolean getButtonFill() {
        return this.buttonFill;
    }

    public final Integer getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    public final ButtonDTO getButtonV2() {
        return this.buttonV2;
    }

    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    public final Integer getButtonVerticalMargin() {
        return this.buttonVerticalMargin;
    }

    public final Boolean getHasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public final Boolean getHasShadowIfSticky() {
        return this.hasShadowIfSticky;
    }

    public int hashCode() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        int hashCode = (largeButton == null ? 0 : largeButton.hashCode()) * 31;
        ButtonDTO buttonDTO = this.buttonV2;
        int a11 = C3532b.a((hashCode + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31, 31, this.isSticky);
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        int hashCode2 = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Boolean bool = this.hasShadowIfSticky;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AlignType alignType = this.align;
        int hashCode4 = (hashCode3 + (alignType == null ? 0 : alignType.hashCode())) * 31;
        Boolean bool2 = this.buttonFill;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.buttonHorizontalMargin;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buttonVerticalMargin;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.hasBackgroundColor;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        ButtonDTO buttonDTO = this.buttonV2;
        boolean z11 = this.isSticky;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        Boolean bool = this.hasShadowIfSticky;
        AlignType alignType = this.align;
        Boolean bool2 = this.buttonFill;
        Integer num = this.buttonHorizontalMargin;
        Integer num2 = this.buttonVerticalMargin;
        Boolean bool3 = this.hasBackgroundColor;
        StringBuilder sb2 = new StringBuilder("ButtonWidgetDTO(button=");
        sb2.append(largeButton);
        sb2.append(", buttonV2=");
        sb2.append(buttonDTO);
        sb2.append(", isSticky=");
        sb2.append(z11);
        sb2.append(", buttonV3=");
        sb2.append(buttonV3DTO);
        sb2.append(", hasShadowIfSticky=");
        sb2.append(bool);
        sb2.append(", align=");
        sb2.append(alignType);
        sb2.append(", buttonFill=");
        e.d(bool2, num, ", buttonHorizontalMargin=", ", buttonVerticalMargin=", sb2);
        sb2.append(num2);
        sb2.append(", hasBackgroundColor=");
        sb2.append(bool3);
        sb2.append(")");
        return sb2.toString();
    }
}
