package ru.ozon.app.android.cart.cartButtonWithTooltip.data;

import Ih.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO;", "", "actionButton", "Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO$ActionButton;", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "<init>", "(Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO$ActionButton;Lru/ozon/uni/atoms/data/common/TooltipDTO;)V", "getActionButton", "()Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO$ActionButton;", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ActionButton", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartButtonWithTooltipDTO {
    public static final int $stable = 8;

    @NotNull
    private final ActionButton actionButton;
    private final TooltipDTO tooltip;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/data/CartButtonWithTooltipDTO$ActionButton;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButton {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final TestInfo testInfo;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ActionButton(@NotNull TextDTO text, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = actionButton.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = actionButton.action;
            }
            if ((i11 & 4) != 0) {
                map = actionButton.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                testInfo = actionButton.testInfo;
            }
            return actionButton.copy(textDTO, atomActionDTO, map, testInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final ActionButton copy(@NotNull TextDTO text, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ActionButton(text, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.text, actionButton.text) && Intrinsics.d(this.action, actionButton.action) && Intrinsics.d(this.trackingInfo, actionButton.trackingInfo) && Intrinsics.d(this.testInfo, actionButton.testInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.text.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ActionButton(text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return b.b(", testInfo=", ")", sb2, map, testInfo);
        }
    }

    public CartButtonWithTooltipDTO(@NotNull ActionButton actionButton, TooltipDTO tooltipDTO) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.actionButton = actionButton;
        this.tooltip = tooltipDTO;
    }

    public static /* synthetic */ CartButtonWithTooltipDTO copy$default(CartButtonWithTooltipDTO cartButtonWithTooltipDTO, ActionButton actionButton, TooltipDTO tooltipDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionButton = cartButtonWithTooltipDTO.actionButton;
        }
        if ((i11 & 2) != 0) {
            tooltipDTO = cartButtonWithTooltipDTO.tooltip;
        }
        return cartButtonWithTooltipDTO.copy(actionButton, tooltipDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component2, reason: from getter */
    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    @NotNull
    public final CartButtonWithTooltipDTO copy(@NotNull ActionButton actionButton, TooltipDTO tooltip) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new CartButtonWithTooltipDTO(actionButton, tooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonWithTooltipDTO)) {
            return false;
        }
        CartButtonWithTooltipDTO cartButtonWithTooltipDTO = (CartButtonWithTooltipDTO) other;
        return Intrinsics.d(this.actionButton, cartButtonWithTooltipDTO.actionButton) && Intrinsics.d(this.tooltip, cartButtonWithTooltipDTO.tooltip);
    }

    @NotNull
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    public final TooltipDTO getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = this.actionButton.hashCode() * 31;
        TooltipDTO tooltipDTO = this.tooltip;
        return hashCode + (tooltipDTO == null ? 0 : tooltipDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "CartButtonWithTooltipDTO(actionButton=" + this.actionButton + ", tooltip=" + this.tooltip + ")";
    }
}
