package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import Nh.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "separatorHeight", "separatorColor", "separatorPadding", "<init>", "(III)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "getSeparatorHeight", "()I", "setSeparatorHeight", "(I)V", "getSeparatorColor", "setSeparatorColor", "getSeparatorPadding", "setSeparatorPadding", "Landroid/graphics/Paint;", "separatorDecorPaint", "Landroid/graphics/Paint;", "backgroundDecorPaint", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileItemDecorator extends RecyclerView.n {
    private int separatorColor;
    private int separatorHeight;
    private int separatorPadding;

    @NotNull
    private final Paint separatorDecorPaint = new Paint();

    @NotNull
    private final Paint backgroundDecorPaint = new Paint();

    public CartTileItemDecorator(int i11, int i12, int i13) {
        this.separatorHeight = i11;
        this.separatorColor = i12;
        this.separatorPadding = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (a.a(parent, "parent", state, "state", view) == state.b() - 1) {
            return;
        }
        outRect.set(0, 0, 0, this.separatorHeight);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        int color = this.separatorDecorPaint.getColor();
        int i11 = this.separatorColor;
        if (color != i11) {
            this.separatorDecorPaint.setColor(i11);
        }
        int b11 = state.b() - 1;
        for (int i12 = 0; i12 < b11; i12++) {
            RecyclerView.o layoutManager = parent.getLayoutManager();
            View childAt = layoutManager != null ? layoutManager.getChildAt(i12) : null;
            CartTileItemView cartTileItemView = childAt instanceof CartTileItemView ? (CartTileItemView) childAt : null;
            if (cartTileItemView == null) {
                return;
            }
            int tileBackgroundColor = cartTileItemView.getTileBackgroundColor();
            if (this.backgroundDecorPaint.getColor() != tileBackgroundColor) {
                this.backgroundDecorPaint.setColor(tileBackgroundColor);
            }
            canvas.drawRect(cartTileItemView.getLeft(), cartTileItemView.getBottom(), cartTileItemView.getRight(), cartTileItemView.getBottom() + this.separatorHeight, this.backgroundDecorPaint);
            canvas.drawRect(this.separatorPadding + cartTileItemView.getLeft(), cartTileItemView.getBottom(), cartTileItemView.getRight(), cartTileItemView.getBottom() + this.separatorHeight, this.separatorDecorPaint);
        }
    }

    public final void setSeparatorColor(int i11) {
        this.separatorColor = i11;
    }

    public final void setSeparatorHeight(int i11) {
        this.separatorHeight = i11;
    }

    public final void setSeparatorPadding(int i11) {
        this.separatorPadding = i11;
    }
}
