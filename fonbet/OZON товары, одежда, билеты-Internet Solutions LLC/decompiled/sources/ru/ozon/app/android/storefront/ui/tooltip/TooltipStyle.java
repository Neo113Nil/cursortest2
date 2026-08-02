package ru.ozon.app.android.storefront.ui.tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/TooltipStyle;", "", "background", "Lru/ozon/uni/core/UniColors;", "titleColor", "subtitleColor", "closeIconBackground", "closeIconColor", "<init>", "(Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;Lru/ozon/uni/core/UniColors;)V", "getBackground", "()Lru/ozon/uni/core/UniColors;", "getTitleColor", "getSubtitleColor", "getCloseIconBackground", "getCloseIconColor", "Companion", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final UniColors background;

    @NotNull
    private final UniColors closeIconBackground;

    @NotNull
    private final UniColors closeIconColor;

    @NotNull
    private final UniColors subtitleColor;

    @NotNull
    private final UniColors titleColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/TooltipStyle$Companion;", "", "<init>", "()V", "default", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipStyle;", "staticLight", "staticDark", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final TooltipStyle m1022default() {
            return new TooltipStyle(UniColors.LAYER_FLOOR_0_INVERTED, UniColors.TEXT_PRIMARY_INVERTED, UniColors.TEXT_SECONDARY_INVERTED, UniColors.CLEAR_LIGHT_KEY_0, UniColors.GRAPHIC_TERTIARY_INVERTED, null);
        }

        @NotNull
        public final TooltipStyle staticDark() {
            return new TooltipStyle(UniColors.BG_DARK_KEY, UniColors.TEXT_PRIMARY_ON_DARK, UniColors.TEXT_SECONDARY_ON_DARK, UniColors.CLEAR_LIGHT_KEY_0, UniColors.GRAPHIC_TERTIARY_ON_DARK, null);
        }

        @NotNull
        public final TooltipStyle staticLight() {
            return new TooltipStyle(UniColors.BG_LIGHT_KEY, UniColors.TEXT_PRIMARY_ON_LIGHT, UniColors.TEXT_SECONDARY_ON_LIGHT, UniColors.CLEAR_LIGHT_KEY_0, UniColors.GRAPHIC_TERTIARY_ON_LIGHT, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TooltipStyle(UniColors uniColors, UniColors uniColors2, UniColors uniColors3, UniColors uniColors4, UniColors uniColors5, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniColors, uniColors2, uniColors3, uniColors4, uniColors5);
    }

    @NotNull
    public final UniColors getBackground() {
        return this.background;
    }

    @NotNull
    public final UniColors getCloseIconBackground() {
        return this.closeIconBackground;
    }

    @NotNull
    public final UniColors getCloseIconColor() {
        return this.closeIconColor;
    }

    @NotNull
    public final UniColors getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final UniColors getTitleColor() {
        return this.titleColor;
    }

    private TooltipStyle(UniColors uniColors, UniColors uniColors2, UniColors uniColors3, UniColors uniColors4, UniColors uniColors5) {
        this.background = uniColors;
        this.titleColor = uniColors2;
        this.subtitleColor = uniColors3;
        this.closeIconBackground = uniColors4;
        this.closeIconColor = uniColors5;
    }
}
