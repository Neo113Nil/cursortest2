package ru.ozon.app.android.storefront.widgets.naviBlocksV5.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider;", "", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "getStyle", "(Lru/ozon/app/android/utils/AppType;)Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "bxStyle", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "selectStyle", "LZ1/h;", "horizontalMargin", "F", "getHorizontalMargin-D9Ej5fM", "()F", "blockMargin", "getBlockMargin-D9Ej5fM", "Lru/ozon/uni/core/models/UniColorToken;", "widgetBackgroundColor", "Lru/ozon/uni/core/models/UniColorToken;", "getWidgetBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "blockBackgroundColor", "getBlockBackgroundColor", "Style", "Bx", "Select", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocks5StyleProvider {
    public static final int $stable = UniColorToken.$stable;

    @NotNull
    private final UniColorToken blockBackgroundColor;
    private final float blockMargin;

    @NotNull
    private final Style bxStyle;
    private final float horizontalMargin;

    @NotNull
    private final Style selectStyle;

    @NotNull
    private final UniColorToken widgetBackgroundColor;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Bx;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Bx extends Style {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bx() {
            super(r2, r3, r0.getColorTokens().getLayerFloor1(), r0.getColorTokens().getBgSecondary(), null);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            float m1845getDp16D9Ej5fM = dsSpacings.m1845getDp16D9Ej5fM();
            float m1861getDp8D9Ej5fM = dsSpacings.m1861getDp8D9Ej5fM();
            UniTheme uniTheme = UniTheme.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Select;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Select extends Style {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Select() {
            super(r2, r3, r0.getColorTokens().getBgDarkKey(), r0.getColorTokens().getClearLightKey300(), null);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            float m1854getDp4D9Ej5fM = dsSpacings.m1854getDp4D9Ej5fM();
            float m1854getDp4D9Ej5fM2 = dsSpacings.m1854getDp4D9Ej5fM();
            UniTheme uniTheme = UniTheme.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Style;", "", "LZ1/h;", "horizontalMargin", "blockMargin", "Lru/ozon/uni/core/models/UniColorToken;", "widgetBackgroundColor", "blockBackgroundColor", "<init>", "(FFLru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;)V", "F", "getHorizontalMargin-D9Ej5fM", "()F", "getBlockMargin-D9Ej5fM", "Lru/ozon/uni/core/models/UniColorToken;", "getWidgetBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "getBlockBackgroundColor", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Bx;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider$Select;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class Style {

        @NotNull
        private final UniColorToken blockBackgroundColor;
        private final float blockMargin;
        private final float horizontalMargin;

        @NotNull
        private final UniColorToken widgetBackgroundColor;

        public /* synthetic */ Style(float f7, float f11, UniColorToken uniColorToken, UniColorToken uniColorToken2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, uniColorToken, uniColorToken2);
        }

        @NotNull
        public final UniColorToken getBlockBackgroundColor() {
            return this.blockBackgroundColor;
        }

        /* renamed from: getBlockMargin-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBlockMargin() {
            return this.blockMargin;
        }

        /* renamed from: getHorizontalMargin-D9Ej5fM, reason: not valid java name and from getter */
        public final float getHorizontalMargin() {
            return this.horizontalMargin;
        }

        @NotNull
        public final UniColorToken getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        private Style(float f7, float f11, UniColorToken widgetBackgroundColor, UniColorToken blockBackgroundColor) {
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(blockBackgroundColor, "blockBackgroundColor");
            this.horizontalMargin = f7;
            this.blockMargin = f11;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.blockBackgroundColor = blockBackgroundColor;
        }
    }

    public NaviBlocks5StyleProvider(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.bxStyle = new Bx();
        this.selectStyle = new Select();
        this.horizontalMargin = getStyle(appType).getHorizontalMargin();
        this.blockMargin = getStyle(appType).getBlockMargin();
        this.widgetBackgroundColor = getStyle(appType).getWidgetBackgroundColor();
        this.blockBackgroundColor = getStyle(appType).getBlockBackgroundColor();
    }

    private final Style getStyle(AppType appType) {
        return appType == AppType.SELECT ? this.selectStyle : this.bxStyle;
    }

    @NotNull
    public final UniColorToken getBlockBackgroundColor() {
        return this.blockBackgroundColor;
    }

    /* renamed from: getBlockMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBlockMargin() {
        return this.blockMargin;
    }

    /* renamed from: getHorizontalMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalMargin() {
        return this.horizontalMargin;
    }

    @NotNull
    public final UniColorToken getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }
}
