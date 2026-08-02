package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.mapper;

import Sc.o;
import android.content.res.Resources;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileWidthConfig;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollItemMeasureWidthHelper;", "", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;", "widthConfig", "", "measureSingleItemWidth", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileWidthConfig;)I", "getSingleItemWidth", "itemWidth", "getNumberVisibleItems", "(I)I", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "width", "I", "measuredWidth", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollItemMeasureWidthHelper {
    private int measuredWidth;

    @NotNull
    private final Resources resources;
    private final int width;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int widgetHorizontalPaddings = UiExtKt.toPx(4);
    private static final int marginBetweenItems = UiExtKt.toPx(2);
    private static final int bannerWidth = UiExtKt.toPx(124);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/mapper/TileScrollItemMeasureWidthHelper$Companion;", "", "<init>", "()V", "UNKNOWN_WIDTH", "", "widgetHorizontalPaddings", "getWidgetHorizontalPaddings", "()I", "marginBetweenItems", "getMarginBetweenItems", "bannerWidth", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMarginBetweenItems() {
            return TileScrollItemMeasureWidthHelper.marginBetweenItems;
        }

        public final int getWidgetHorizontalPaddings() {
            return TileScrollItemMeasureWidthHelper.widgetHorizontalPaddings;
        }

        private Companion() {
        }
    }

    public TileScrollItemMeasureWidthHelper(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
        this.width = resources.getDisplayMetrics().widthPixels;
        this.measuredWidth = -1;
    }

    private final int measureSingleItemWidth(TileWidthConfig widthConfig) {
        if (widthConfig instanceof TileWidthConfig.Banner) {
            return bannerWidth;
        }
        if (!(widthConfig instanceof TileWidthConfig.Default)) {
            throw new o();
        }
        int widthCount = (int) (((this.width - widgetHorizontalPaddings) - (((int) r4.getWidthCount()) * marginBetweenItems)) / ((TileWidthConfig.Default) widthConfig).getWidthCount());
        int minWidthSize = SmallTileMoleculeView.INSTANCE.getMinWidthSize();
        return widthCount < minWidthSize ? minWidthSize : widthCount;
    }

    public final int getNumberVisibleItems(int itemWidth) {
        return C6915b.c((float) Math.ceil(this.width / itemWidth));
    }

    public final int getSingleItemWidth(@NotNull TileWidthConfig widthConfig) {
        Intrinsics.checkNotNullParameter(widthConfig, "widthConfig");
        if (this.measuredWidth == -1) {
            this.measuredWidth = measureSingleItemWidth(widthConfig);
        }
        return this.measuredWidth;
    }
}
