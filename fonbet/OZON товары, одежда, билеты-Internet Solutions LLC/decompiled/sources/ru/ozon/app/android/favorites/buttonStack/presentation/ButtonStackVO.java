package ru.ozon.app.android.favorites.buttonStack.presentation;

import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b\u000b\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "leftButton", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "", "isSticky", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "paddings", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLeftButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "getPaddings", "()Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonStackVO implements c {
    private final IconButtonV3DTO iconButton;
    private final long id;
    private final Boolean isSticky;
    private final ButtonV3DTO leftButton;
    private final ButtonStackDTO.StackPaddings paddings;
    private final ButtonV3DTO rightButton;

    public ButtonStackVO(long j11, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, IconButtonV3DTO iconButtonV3DTO, Boolean bool, ButtonStackDTO.StackPaddings stackPaddings) {
        this.id = j11;
        this.leftButton = buttonV3DTO;
        this.rightButton = buttonV3DTO2;
        this.iconButton = iconButtonV3DTO;
        this.isSticky = bool;
        this.paddings = stackPaddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStackVO)) {
            return false;
        }
        ButtonStackVO buttonStackVO = (ButtonStackVO) other;
        return this.id == buttonStackVO.id && Intrinsics.d(this.leftButton, buttonStackVO.leftButton) && Intrinsics.d(this.rightButton, buttonStackVO.rightButton) && Intrinsics.d(this.iconButton, buttonStackVO.iconButton) && Intrinsics.d(this.isSticky, buttonStackVO.isSticky) && Intrinsics.d(this.paddings, buttonStackVO.paddings);
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3DTO getLeftButton() {
        return this.leftButton;
    }

    public final ButtonStackDTO.StackPaddings getPaddings() {
        return this.paddings;
    }

    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO2 = this.rightButton;
        int hashCode3 = (hashCode2 + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Boolean bool = this.isSticky;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ButtonStackDTO.StackPaddings stackPaddings = this.paddings;
        return hashCode5 + (stackPaddings != null ? stackPaddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.leftButton;
        ButtonV3DTO buttonV3DTO2 = this.rightButton;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        Boolean bool = this.isSticky;
        ButtonStackDTO.StackPaddings stackPaddings = this.paddings;
        StringBuilder c11 = G.c("ButtonStackVO(id=", j11, ", leftButton=", buttonV3DTO);
        c11.append(", rightButton=");
        c11.append(buttonV3DTO2);
        c11.append(", iconButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", isSticky=");
        c11.append(bool);
        c11.append(", paddings=");
        c11.append(stackPaddings);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ ButtonStackVO(long j11, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, IconButtonV3DTO iconButtonV3DTO, Boolean bool, ButtonStackDTO.StackPaddings stackPaddings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, buttonV3DTO, buttonV3DTO2, (i11 & 8) != 0 ? null : iconButtonV3DTO, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : stackPaddings);
    }
}
