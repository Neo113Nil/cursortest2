package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "isDisabled", "<init>", "(ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "copy", "(ILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Z)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Z", "()Z", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SwipeButtonVO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final AtomActionDTO action;
    private final int backgroundColor;
    private final IconButtonV3DTO iconButton;
    private final boolean isDisabled;

    public SwipeButtonVO(int i11, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, boolean z11) {
        this.backgroundColor = i11;
        this.iconButton = iconButtonV3DTO;
        this.action = atomActionDTO;
        this.isDisabled = z11;
    }

    public static /* synthetic */ SwipeButtonVO copy$default(SwipeButtonVO swipeButtonVO, int i11, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = swipeButtonVO.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            iconButtonV3DTO = swipeButtonVO.iconButton;
        }
        if ((i12 & 4) != 0) {
            atomActionDTO = swipeButtonVO.action;
        }
        if ((i12 & 8) != 0) {
            z11 = swipeButtonVO.isDisabled;
        }
        return swipeButtonVO.copy(i11, iconButtonV3DTO, atomActionDTO, z11);
    }

    @NotNull
    public final SwipeButtonVO copy(int backgroundColor, IconButtonV3DTO iconButton, AtomActionDTO action, boolean isDisabled) {
        return new SwipeButtonVO(backgroundColor, iconButton, action, isDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeButtonVO)) {
            return false;
        }
        SwipeButtonVO swipeButtonVO = (SwipeButtonVO) other;
        return this.backgroundColor == swipeButtonVO.backgroundColor && Intrinsics.d(this.iconButton, swipeButtonVO.iconButton) && Intrinsics.d(this.action, swipeButtonVO.action) && this.isDisabled == swipeButtonVO.isDisabled;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.backgroundColor) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return Boolean.hashCode(this.isDisabled) + ((hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0)) * 31);
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        return "SwipeButtonVO(backgroundColor=" + this.backgroundColor + ", iconButton=" + this.iconButton + ", action=" + this.action + ", isDisabled=" + this.isDisabled + ")";
    }

    public /* synthetic */ SwipeButtonVO(int i11, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, iconButtonV3DTO, atomActionDTO, (i12 & 8) != 0 ? false : z11);
    }
}
