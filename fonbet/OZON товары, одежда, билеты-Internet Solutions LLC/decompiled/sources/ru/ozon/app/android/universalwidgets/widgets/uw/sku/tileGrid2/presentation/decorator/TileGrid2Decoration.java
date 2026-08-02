package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.tiles.tilegrid2.flags.TileGrid2BackgroundsOverdrawEnabled;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/TileGrid2Decoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "bgColorCache", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "Landroid/content/Context;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "bounds", "Landroid/graphics/Rect;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/TileGrid2DecorationStrategy;", "decorationStrategy", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/TileGrid2DecorationStrategy;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2Decoration extends RecyclerView.n {

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Context context;

    @NotNull
    private final TileGrid2DecorationStrategy decorationStrategy;

    @NotNull
    private final Paint paint;

    public TileGrid2Decoration(@NotNull Context context, @NotNull TileGrid2RootBgColorCache bgColorCache, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bgColorCache, "bgColorCache");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.context = context;
        Paint a11 = h.a(true);
        a11.setStyle(Paint.Style.FILL);
        this.paint = a11;
        Rect rect = new Rect();
        this.bounds = rect;
        this.decorationStrategy = featureChecker.isEnabled(TileGrid2BackgroundsOverdrawEnabled.INSTANCE) ? new DrawAllAreaDecoration(context, rect, bgColorCache, a11) : new DrawOnlyVisibleAreaDecoration(context, rect, bgColorCache, a11);
        bgColorCache.checkChangeTheme(ThemeExtKt.isDarkThemeActive(context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        this.decorationStrategy.onDraw(canvas, parent, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        this.decorationStrategy.onDrawOver(canvas, parent, state);
    }
}
