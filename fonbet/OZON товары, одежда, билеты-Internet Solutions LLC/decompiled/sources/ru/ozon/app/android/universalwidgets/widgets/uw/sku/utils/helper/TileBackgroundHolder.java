package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/helper/TileBackgroundHolder;", "", "tileGrid2RootBgColorCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;)V", "backgroundDrawable", "Landroid/graphics/drawable/InsetDrawable;", "tileBackgroundColorToken", "", "tileBackgroundColor", "", "Ljava/lang/Integer;", "getBackground", "Landroid/graphics/drawable/Drawable;", "updateBackground", "", "backgroundColor", "islandBackgroundColor", "context", "Landroid/content/Context;", "initTileBackgroundColor", "color", "getTileBackgroundColor", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileBackgroundHolder {

    @NotNull
    private final InsetDrawable backgroundDrawable;
    private Integer tileBackgroundColor;
    private String tileBackgroundColorToken;

    @NotNull
    private final TileGrid2RootBgColorCache tileGrid2RootBgColorCache;

    public TileBackgroundHolder(@NotNull TileGrid2RootBgColorCache tileGrid2RootBgColorCache) {
        Intrinsics.checkNotNullParameter(tileGrid2RootBgColorCache, "tileGrid2RootBgColorCache");
        this.tileGrid2RootBgColorCache = tileGrid2RootBgColorCache;
        GradientDrawable gradientDrawable = new GradientDrawable();
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        gradientDrawable.setCornerRadius(tileGrid2Constants.getContainerCornerRadius());
        this.backgroundDrawable = new InsetDrawable((Drawable) gradientDrawable, 0, tileGrid2Constants.getContainerBackgroundTopInset(), 0, 0);
    }

    private final int getTileBackgroundColor(String islandBackgroundColor, Context context) {
        if (!Intrinsics.d(islandBackgroundColor, this.tileBackgroundColorToken)) {
            initTileBackgroundColor(islandBackgroundColor, context);
        }
        Integer num = this.tileBackgroundColor;
        return num != null ? num.intValue() : initTileBackgroundColor(islandBackgroundColor, context);
    }

    private final int initTileBackgroundColor(String color, Context context) {
        this.tileBackgroundColorToken = color;
        int parseColor = StyleParser.INSTANCE.parseColor(context, color, R$color.layer_floor_1);
        this.tileBackgroundColor = Integer.valueOf(parseColor);
        return parseColor;
    }

    @NotNull
    public final Drawable getBackground() {
        return this.backgroundDrawable;
    }

    public final void updateBackground(String backgroundColor, String islandBackgroundColor, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = this.backgroundDrawable.getDrawable();
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getTileBackgroundColor(islandBackgroundColor, context));
        }
        this.tileGrid2RootBgColorCache.cacheColor(context, backgroundColor);
    }
}
