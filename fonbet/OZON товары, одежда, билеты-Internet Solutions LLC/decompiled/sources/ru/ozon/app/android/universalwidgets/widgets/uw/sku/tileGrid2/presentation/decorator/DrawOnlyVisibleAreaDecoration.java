package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.separator.TileGrid2SeparatorVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.TileGrid2RootBgColorCache;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/DrawOnlyVisibleAreaDecoration;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/decorator/TileGrid2DecorationStrategy;", "Landroid/content/Context;", "context", "Landroid/graphics/Rect;", "bounds", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "bgColorCache", "Landroid/graphics/Paint;", "paint", "<init>", "(Landroid/content/Context;Landroid/graphics/Rect;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;Landroid/graphics/Paint;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "Landroid/content/Context;", "Landroid/graphics/Rect;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "Landroid/graphics/Paint;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrawOnlyVisibleAreaDecoration implements TileGrid2DecorationStrategy {

    @NotNull
    private final TileGrid2RootBgColorCache bgColorCache;

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Context context;

    @NotNull
    private final Paint paint;

    public DrawOnlyVisibleAreaDecoration(@NotNull Context context, @NotNull Rect bounds, @NotNull TileGrid2RootBgColorCache bgColorCache, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(bgColorCache, "bgColorCache");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.context = context;
        this.bounds = bounds;
        this.bgColorCache = bgColorCache;
        this.paint = paint;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator.TileGrid2DecorationStrategy
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            c b11 = lVar != null ? lVar.b(childAdapterPosition) : null;
            if (b11 instanceof BackgroundDecorated) {
                BackgroundDecorated backgroundDecorated = (BackgroundDecorated) b11;
                if (backgroundDecorated.getIndex() % 2 == 0) {
                    int backgroundColor = this.bgColorCache.getBackgroundColor(this.context, backgroundDecorated.getBackgroundColor());
                    if (this.paint.getColor() != backgroundColor) {
                        this.paint.setColor(backgroundColor);
                    }
                    Rect rect = this.bounds;
                    int top = view.getTop() - backgroundDecorated.getTopMargin();
                    int width = parent.getWidth();
                    int top2 = view.getTop();
                    TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
                    rect.set(0, top, width, tileGrid2Constants.getContainerCornerRadiusInt() + top2);
                    canvas.drawRect(this.bounds, this.paint);
                    this.bounds.set(view.getRight() - tileGrid2Constants.getContainerCornerRadiusInt(), tileGrid2Constants.getContainerCornerRadiusInt() + view.getTop(), tileGrid2Constants.getContainerHorizontalMargin() + view.getRight(), view.getBottom() - tileGrid2Constants.getContainerCornerRadiusInt());
                    canvas.drawRect(this.bounds, this.paint);
                    if (lVar.b(childAdapterPosition + 1) instanceof TileGrid2SeparatorVO) {
                        this.bounds.set(tileGrid2Constants.getContainerHorizontalMargin() + view.getRight(), tileGrid2Constants.getContainerCornerRadiusInt() + view.getTop(), parent.getWidth(), view.getBottom() - tileGrid2Constants.getContainerCornerRadiusInt());
                        canvas.drawRect(this.bounds, this.paint);
                    }
                    this.bounds.set(0, view.getBottom() - tileGrid2Constants.getContainerCornerRadiusInt(), parent.getWidth(), view.getBottom());
                    canvas.drawRect(this.bounds, this.paint);
                }
            }
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator.TileGrid2DecorationStrategy
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
