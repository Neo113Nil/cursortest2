package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001e¨\u0006*"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/presentation/SkuGrid2ItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/graphics/Canvas;", "canvas", "", "drawChildren", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "isTargetViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "backgroundColor", "I", "rect$delegate", "LSc/j;", "getRect", "()Landroid/graphics/Rect;", "rect", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "paint", "dp12", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuGrid2ItemDecoration extends RecyclerView.n {
    private final int backgroundColor;
    private final int dp12;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    public SkuGrid2ItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.rect = LazyUtilsKt.unsafeLazy(SkuGrid2ItemDecoration$rect$2.INSTANCE);
        this.paint = LazyUtilsKt.unsafeLazy(new SkuGrid2ItemDecoration$paint$2(this));
        this.dp12 = ResourceExtKt.toPx(12);
    }

    private final void drawChildren(RecyclerView parent, Canvas canvas) {
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (!(parent.getChildViewHolder(view) instanceof BackgroundDrawBySkuGrid2DecoratorDisabled)) {
                parent.getDecoratedBoundsWithMargins(view, getRect());
                canvas.drawRect(getRect(), getPaint());
            }
        }
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    private final boolean isTargetViewHolder(RecyclerView.C viewHolder) {
        return viewHolder instanceof SkuGrid2ViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
        Intrinsics.f(childViewHolder);
        if (isTargetViewHolder(childViewHolder) && (childAdapterPosition = parent.getChildAdapterPosition(view)) != -1) {
            RecyclerView.o layoutManager = parent.getLayoutManager();
            if (layoutManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int g10 = gridLayoutManager.g();
            int spanIndex = gridLayoutManager.k().getSpanIndex(childAdapterPosition, g10);
            int spanSize = gridLayoutManager.k().getSpanSize(childAdapterPosition);
            Pair pair = (spanIndex == 0 && spanSize == g10) ? new Pair(Integer.valueOf(this.dp12), Integer.valueOf(this.dp12)) : spanIndex == 0 ? new Pair(Integer.valueOf(this.dp12), 0) : spanIndex + spanSize == g10 ? new Pair(0, Integer.valueOf(this.dp12)) : new Pair(0, 0);
            int intValue = ((Number) pair.a()).intValue();
            int intValue2 = ((Number) pair.b()).intValue();
            outRect.left = intValue;
            outRect.right = intValue2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        drawChildren(parent, canvas);
    }
}
