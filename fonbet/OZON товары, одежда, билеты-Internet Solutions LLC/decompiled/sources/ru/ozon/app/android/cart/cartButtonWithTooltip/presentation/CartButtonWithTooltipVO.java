package ru.ozon.app.android.cart.cartButtonWithTooltip.presentation;

import Pk0.h;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;", "actionButton", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "<init>", "(JLru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)V", "copy", "(JLru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;", "getActionButton", "()Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "ActionButton", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartButtonWithTooltipVO implements c {

    @NotNull
    private final ActionButton actionButton;
    private final long id;
    private final CartTooltipVO tooltip;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO$ActionButton;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButton {
        public static final int $stable = TestInfo.$stable | AtomAction.$stable;

        @NotNull
        private final AtomAction action;
        private final TestInfo testInfo;

        @NotNull
        private final TextDTO text;

        public ActionButton(@NotNull TextDTO text, @NotNull AtomAction action, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.text, actionButton.text) && Intrinsics.d(this.action, actionButton.action) && Intrinsics.d(this.testInfo, actionButton.testInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.text.hashCode() * 31, 31);
            TestInfo testInfo = this.testInfo;
            return a11 + (testInfo == null ? 0 : testInfo.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            AtomAction atomAction = this.action;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ActionButton(text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    public CartButtonWithTooltipVO(long j11, @NotNull ActionButton actionButton, CartTooltipVO cartTooltipVO) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.actionButton = actionButton;
        this.tooltip = cartTooltipVO;
    }

    public static /* synthetic */ CartButtonWithTooltipVO copy$default(CartButtonWithTooltipVO cartButtonWithTooltipVO, long j11, ActionButton actionButton, CartTooltipVO cartTooltipVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cartButtonWithTooltipVO.id;
        }
        if ((i11 & 2) != 0) {
            actionButton = cartButtonWithTooltipVO.actionButton;
        }
        if ((i11 & 4) != 0) {
            cartTooltipVO = cartButtonWithTooltipVO.tooltip;
        }
        return cartButtonWithTooltipVO.copy(j11, actionButton, cartTooltipVO);
    }

    @NotNull
    public final CartButtonWithTooltipVO copy(long id2, @NotNull ActionButton actionButton, CartTooltipVO tooltip) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new CartButtonWithTooltipVO(id2, actionButton, tooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonWithTooltipVO)) {
            return false;
        }
        CartButtonWithTooltipVO cartButtonWithTooltipVO = (CartButtonWithTooltipVO) other;
        return this.id == cartButtonWithTooltipVO.id && Intrinsics.d(this.actionButton, cartButtonWithTooltipVO.actionButton) && Intrinsics.d(this.tooltip, cartButtonWithTooltipVO.tooltip);
    }

    @NotNull
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CartTooltipVO getTooltip() {
        return this.tooltip;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.actionButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CartTooltipVO cartTooltipVO = this.tooltip;
        return hashCode + (cartTooltipVO == null ? 0 : cartTooltipVO.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartButtonWithTooltipVO(id=" + this.id + ", actionButton=" + this.actionButton + ", tooltip=" + this.tooltip + ")";
    }
}
