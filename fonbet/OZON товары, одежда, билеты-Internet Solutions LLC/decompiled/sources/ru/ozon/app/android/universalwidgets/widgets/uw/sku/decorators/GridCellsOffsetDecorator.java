package ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#JC\u0010(\u001a\u00020\u000e*\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/decorators/GridCellsOffsetDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "Landroid/graphics/drawable/Drawable;", "divider", "", "drawBackgroundForWidget", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "", "spanPosition", "view", "Landroid/graphics/Rect;", "outRect", "itemOffsetWithSpanPosition", "(ILandroid/view/View;Landroid/graphics/Rect;)V", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/RecyclerView$C;", "decoratedVhClass", "", "needDecorate", "(Ljava/lang/Class;)Z", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "left", "right", "top", "bottom", "updateRect", "(Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "whiteDivider", "Landroid/graphics/drawable/Drawable;", "bounds", "Landroid/graphics/Rect;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GridCellsOffsetDecorator extends RecyclerView.n {

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Drawable whiteDivider;

    public GridCellsOffsetDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.whiteDivider = new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.bounds = new Rect();
    }

    private final void drawBackgroundForWidget(Canvas c11, RecyclerView parent, View child, Drawable divider) {
        parent.getDecoratedBoundsWithMargins(child, this.bounds);
        divider.setBounds(this.bounds);
        divider.draw(c11);
    }

    public static /* synthetic */ void updateRect$default(GridCellsOffsetDecorator gridCellsOffsetDecorator, Rect rect, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRect");
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            num3 = null;
        }
        if ((i11 & 8) != 0) {
            num4 = null;
        }
        gridCellsOffsetDecorator.updateRect(rect, num, num2, num3, num4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.g adapter;
        int intValue;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(view);
        if (findContainingViewHolder == null || !needDecorate(findContainingViewHolder.getClass())) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar == null) {
            return;
        }
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager.g() == 1200 && (adapter = parent.getAdapter()) != null) {
            Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
            int intValue2 = valueOf.intValue();
            if (intValue2 < 0 || intValue2 >= adapter.getItemCount()) {
                valueOf = null;
            }
            Integer valueOf2 = Integer.valueOf(gridLayoutManager.getPosition(view));
            int intValue3 = valueOf2.intValue();
            if (intValue3 >= 0 && intValue3 < adapter.getItemCount()) {
                num = valueOf2;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else if (num == null) {
                return;
            } else {
                intValue = num.intValue();
            }
            int spanSize = gridLayoutManager.k().getSpanSize(intValue);
            int c11 = bVar.c();
            itemOffsetWithSpanPosition(c11 == 0 ? 0 : c11 / spanSize, view, outRect);
        }
    }

    public abstract void itemOffsetWithSpanPosition(int spanPosition, @NotNull View view, @NotNull Rect outRect);

    public abstract boolean needDecorate(@NotNull Class<? extends RecyclerView.C> decoratedVhClass);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            if (needDecorate(parent.getChildViewHolder(childAt).getClass())) {
                Intrinsics.f(childAt);
                drawBackgroundForWidget(c11, parent, childAt, this.whiteDivider);
            }
        }
    }

    protected final void updateRect(@NotNull Rect rect, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        rect.set(num != null ? num.intValue() : rect.left, num3 != null ? num3.intValue() : rect.top, num2 != null ? num2.intValue() : rect.right, num4 != null ? num4.intValue() : rect.bottom);
    }
}
