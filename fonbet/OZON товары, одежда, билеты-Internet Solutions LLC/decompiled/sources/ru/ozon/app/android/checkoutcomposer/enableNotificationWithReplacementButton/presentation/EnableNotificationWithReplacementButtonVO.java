package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "enableNotificationButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "replacementButton", "replacementButtonWithRedDot", "<init>", "(JLru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "getEnableNotificationButton", "()Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getReplacementButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getReplacementButtonWithRedDot", "ButtonWithRedDotVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EnableNotificationWithReplacementButtonVO implements c {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    private final ButtonWithRedDotVO enableNotificationButton;
    private final long id;
    private final ButtonV3Atom.SmallIconButton replacementButton;
    private final ButtonWithRedDotVO replacementButtonWithRedDot;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "", "", "hasRedDot", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasRedDot", "()Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWithRedDotVO {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton button;
        private final boolean hasRedDot;

        public ButtonWithRedDotVO(boolean z11, @NotNull ButtonV3Atom.SmallIconButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.hasRedDot = z11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWithRedDotVO)) {
                return false;
            }
            ButtonWithRedDotVO buttonWithRedDotVO = (ButtonWithRedDotVO) other;
            return this.hasRedDot == buttonWithRedDotVO.hasRedDot && Intrinsics.d(this.button, buttonWithRedDotVO.button);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getButton() {
            return this.button;
        }

        public final boolean getHasRedDot() {
            return this.hasRedDot;
        }

        public int hashCode() {
            return this.button.hashCode() + (Boolean.hashCode(this.hasRedDot) * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonWithRedDotVO(hasRedDot=" + this.hasRedDot + ", button=" + this.button + ")";
        }
    }

    public EnableNotificationWithReplacementButtonVO(long j11, @NotNull ButtonWithRedDotVO enableNotificationButton, ButtonV3Atom.SmallIconButton smallIconButton, ButtonWithRedDotVO buttonWithRedDotVO) {
        Intrinsics.checkNotNullParameter(enableNotificationButton, "enableNotificationButton");
        this.id = j11;
        this.enableNotificationButton = enableNotificationButton;
        this.replacementButton = smallIconButton;
        this.replacementButtonWithRedDot = buttonWithRedDotVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableNotificationWithReplacementButtonVO)) {
            return false;
        }
        EnableNotificationWithReplacementButtonVO enableNotificationWithReplacementButtonVO = (EnableNotificationWithReplacementButtonVO) other;
        return this.id == enableNotificationWithReplacementButtonVO.id && Intrinsics.d(this.enableNotificationButton, enableNotificationWithReplacementButtonVO.enableNotificationButton) && Intrinsics.d(this.replacementButton, enableNotificationWithReplacementButtonVO.replacementButton) && Intrinsics.d(this.replacementButtonWithRedDot, enableNotificationWithReplacementButtonVO.replacementButtonWithRedDot);
    }

    @NotNull
    public final ButtonWithRedDotVO getEnableNotificationButton() {
        return this.enableNotificationButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.SmallIconButton getReplacementButton() {
        return this.replacementButton;
    }

    public final ButtonWithRedDotVO getReplacementButtonWithRedDot() {
        return this.replacementButtonWithRedDot;
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
        int hashCode = (this.enableNotificationButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.replacementButton;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonWithRedDotVO buttonWithRedDotVO = this.replacementButtonWithRedDot;
        return hashCode2 + (buttonWithRedDotVO != null ? buttonWithRedDotVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EnableNotificationWithReplacementButtonVO(id=" + this.id + ", enableNotificationButton=" + this.enableNotificationButton + ", replacementButton=" + this.replacementButton + ", replacementButtonWithRedDot=" + this.replacementButtonWithRedDot + ")";
    }
}
