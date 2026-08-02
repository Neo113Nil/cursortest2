package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import Ak.C2436a;
import B3.p;
import D3.h;
import El.C2971a;
import GR.b;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001:\u000289Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000b\u0010-R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b\u0012\u0010-R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b5\u0010-\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "selectionControls", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "binButton", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$Spacers;", "spacers", "", "isTopCornersRounded", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "moveItemsButton", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "tooltipData", "isAnimationEnabled", "blockAnimation", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$Spacers;ZLWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSelectionControls", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBinButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$Spacers;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getMoveItemsButton", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "getTooltipData", "()Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "getBlockAnimation", "setBlockAnimation", "(Z)V", "Spacers", "TooltipData", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartControlsVO implements c {
    private final IconButtonV3DTO binButton;
    private boolean blockAnimation;
    private final long id;
    private final boolean isAnimationEnabled;
    private final boolean isTopCornersRounded;
    private final IconButtonV3DTO moveItemsButton;

    @NotNull
    private final CellDTO selectionControls;

    @NotNull
    private final Spacers spacers;
    private final t tokenizedEvent;
    private final TooltipData tooltipData;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$Spacers;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {

        @NotNull
        private final Paddings bottomPadding;

        @NotNull
        private final Paddings leftPadding;

        @NotNull
        private final Paddings rightPadding;

        @NotNull
        private final Paddings topPadding;

        public Spacers(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.topPadding == spacers.topPadding && this.bottomPadding == spacers.bottomPadding && this.leftPadding == spacers.leftPadding && this.rightPadding == spacers.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("Spacers(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO$TooltipData;", "", "", "key", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "Lorg/joda/time/DateTime;", "serverTimestamp", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Lorg/joda/time/DateTime;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "Lorg/joda/time/DateTime;", "getServerTimestamp", "()Lorg/joda/time/DateTime;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TooltipData {

        @NotNull
        private final String key;

        @NotNull
        private final DateTime serverTimestamp;
        private final t tokenizedEvent;

        @NotNull
        private final CartTooltipVO tooltip;

        public TooltipData(@NotNull String key, @NotNull CartTooltipVO tooltip, @NotNull DateTime serverTimestamp, t tVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(serverTimestamp, "serverTimestamp");
            this.key = key;
            this.tooltip = tooltip;
            this.serverTimestamp = serverTimestamp;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooltipData)) {
                return false;
            }
            TooltipData tooltipData = (TooltipData) other;
            return Intrinsics.d(this.key, tooltipData.key) && Intrinsics.d(this.tooltip, tooltipData.tooltip) && Intrinsics.d(this.serverTimestamp, tooltipData.serverTimestamp) && Intrinsics.d(this.tokenizedEvent, tooltipData.tokenizedEvent);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final DateTime getServerTimestamp() {
            return this.serverTimestamp;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final CartTooltipVO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int a11 = b.a(this.serverTimestamp, (this.tooltip.hashCode() + (this.key.hashCode() * 31)) * 31, 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "TooltipData(key=" + this.key + ", tooltip=" + this.tooltip + ", serverTimestamp=" + this.serverTimestamp + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    public CartControlsVO(long j11, @NotNull CellDTO selectionControls, IconButtonV3DTO iconButtonV3DTO, @NotNull Spacers spacers, boolean z11, t tVar, IconButtonV3DTO iconButtonV3DTO2, TooltipData tooltipData, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(selectionControls, "selectionControls");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.selectionControls = selectionControls;
        this.binButton = iconButtonV3DTO;
        this.spacers = spacers;
        this.isTopCornersRounded = z11;
        this.tokenizedEvent = tVar;
        this.moveItemsButton = iconButtonV3DTO2;
        this.tooltipData = tooltipData;
        this.isAnimationEnabled = z12;
        this.blockAnimation = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartControlsVO)) {
            return false;
        }
        CartControlsVO cartControlsVO = (CartControlsVO) other;
        return this.id == cartControlsVO.id && Intrinsics.d(this.selectionControls, cartControlsVO.selectionControls) && Intrinsics.d(this.binButton, cartControlsVO.binButton) && Intrinsics.d(this.spacers, cartControlsVO.spacers) && this.isTopCornersRounded == cartControlsVO.isTopCornersRounded && Intrinsics.d(this.tokenizedEvent, cartControlsVO.tokenizedEvent) && Intrinsics.d(this.moveItemsButton, cartControlsVO.moveItemsButton) && Intrinsics.d(this.tooltipData, cartControlsVO.tooltipData) && this.isAnimationEnabled == cartControlsVO.isAnimationEnabled && this.blockAnimation == cartControlsVO.blockAnimation;
    }

    public final IconButtonV3DTO getBinButton() {
        return this.binButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconButtonV3DTO getMoveItemsButton() {
        return this.moveItemsButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CellDTO getSelectionControls() {
        return this.selectionControls;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final TooltipData getTooltipData() {
        return this.tooltipData;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = Bi.b.c(this.selectionControls, Long.hashCode(this.id) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.binButton;
        int a11 = C3532b.a((this.spacers.hashCode() + ((c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31, 31, this.isTopCornersRounded);
        t tVar = this.tokenizedEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.moveItemsButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        TooltipData tooltipData = this.tooltipData;
        return Boolean.hashCode(this.blockAnimation) + C3532b.a((hashCode2 + (tooltipData != null ? tooltipData.hashCode() : 0)) * 31, 31, this.isAnimationEnabled);
    }

    /* renamed from: isAnimationEnabled, reason: from getter */
    public final boolean getIsAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    /* renamed from: isTopCornersRounded, reason: from getter */
    public final boolean getIsTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    public final void setBlockAnimation(boolean z11) {
        this.blockAnimation = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.selectionControls;
        IconButtonV3DTO iconButtonV3DTO = this.binButton;
        Spacers spacers = this.spacers;
        boolean z11 = this.isTopCornersRounded;
        t tVar = this.tokenizedEvent;
        IconButtonV3DTO iconButtonV3DTO2 = this.moveItemsButton;
        TooltipData tooltipData = this.tooltipData;
        boolean z12 = this.isAnimationEnabled;
        boolean z13 = this.blockAnimation;
        StringBuilder e11 = h.e("CartControlsVO(id=", j11, ", selectionControls=", cellDTO);
        e11.append(", binButton=");
        e11.append(iconButtonV3DTO);
        e11.append(", spacers=");
        e11.append(spacers);
        C2971a.d(e11, ", isTopCornersRounded=", z11, ", tokenizedEvent=", tVar);
        e11.append(", moveItemsButton=");
        e11.append(iconButtonV3DTO2);
        e11.append(", tooltipData=");
        e11.append(tooltipData);
        C2436a.e(", isAnimationEnabled=", ", blockAnimation=", e11, z12, z13);
        e11.append(")");
        return e11.toString();
    }

    public /* synthetic */ CartControlsVO(long j11, CellDTO cellDTO, IconButtonV3DTO iconButtonV3DTO, Spacers spacers, boolean z11, t tVar, IconButtonV3DTO iconButtonV3DTO2, TooltipData tooltipData, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, cellDTO, iconButtonV3DTO, spacers, z11, tVar, iconButtonV3DTO2, tooltipData, z12, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z13);
    }
}
