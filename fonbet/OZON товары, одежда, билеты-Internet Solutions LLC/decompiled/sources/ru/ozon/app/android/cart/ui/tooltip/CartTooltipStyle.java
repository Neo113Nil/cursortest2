package ru.ozon.app.android.cart.ui.tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\fB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;", "", "background", "Lru/ozon/uni/core/UniColors;", "titleColor", "subtitleColor", "<init>", "(Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;)V", "getBackground", "()Lru/ozon/uni/core/UniColors;", "getTitleColor", "getSubtitleColor", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartTooltipStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final UniColors background;

    @NotNull
    private final UniColors subtitleColor;

    @NotNull
    private final UniColors titleColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle$Companion;", "", "<init>", "()V", "default", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;", "staticLight", "staticDark", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final CartTooltipStyle m553default() {
            return new CartTooltipStyle(UniColors.LAYER_FLOOR_0_INVERTED, UniColors.TEXT_PRIMARY_INVERTED, UniColors.TEXT_SECONDARY_INVERTED, null);
        }

        @NotNull
        public final CartTooltipStyle staticDark() {
            return new CartTooltipStyle(UniColors.BG_DARK_KEY, UniColors.TEXT_PRIMARY_ON_DARK, UniColors.TEXT_SECONDARY_ON_DARK, null);
        }

        @NotNull
        public final CartTooltipStyle staticLight() {
            return new CartTooltipStyle(UniColors.BG_LIGHT_KEY, UniColors.TEXT_PRIMARY_ON_LIGHT, UniColors.TEXT_SECONDARY_ON_LIGHT, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartTooltipStyle(UniColors uniColors, UniColors uniColors2, UniColors uniColors3, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniColors, uniColors2, uniColors3);
    }

    @NotNull
    public final UniColors getBackground() {
        return this.background;
    }

    @NotNull
    public final UniColors getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final UniColors getTitleColor() {
        return this.titleColor;
    }

    private CartTooltipStyle(UniColors uniColors, UniColors uniColors2, UniColors uniColors3) {
        this.background = uniColors;
        this.titleColor = uniColors2;
        this.subtitleColor = uniColors3;
    }
}
