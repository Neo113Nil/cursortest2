package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view.ProductToPayWidgetView;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPaySeparatorDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "separatorPaint", "Landroid/graphics/Paint;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPaySeparatorDecorator extends RecyclerView.n {

    @NotNull
    private final Rect rect;

    @NotNull
    private final Paint separatorPaint;
    public static final int $stable = 8;
    private static final int SEPARATOR_HEIGHT = ResourceExtKt.toPx(1);

    public ProductsToPaySeparatorDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.rect = new Rect();
        Paint paint = new Paint();
        paint.setColor(a.getColor(context, R$color.graphic_neutral));
        this.separatorPaint = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return;
        }
        for (View view : ViewGroupExtKt.children(parent)) {
            c b11 = lVar.b(parent.getChildAdapterPosition(view));
            ProductsToPayVO productsToPayVO = b11 instanceof ProductsToPayVO ? (ProductsToPayVO) b11 : null;
            if (productsToPayVO != null) {
                parent.getDecoratedBoundsWithMargins(view, this.rect);
                if (!productsToPayVO.getDisableSeparator()) {
                    ProductToPayWidgetView productToPayWidgetView = view instanceof ProductToPayWidgetView ? (ProductToPayWidgetView) view : null;
                    if (productToPayWidgetView != null) {
                        Rect rect = this.rect;
                        rect.top = rect.bottom - SEPARATOR_HEIGHT;
                        rect.left = productToPayWidgetView.getImageBarrier().getRight();
                        canvas.drawRect(this.rect, this.separatorPaint);
                    }
                }
            }
        }
    }
}
