package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.decoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SeparatorConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/decoration/CartSplitV2SeparatorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "itemSeparatorConfig", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "getBottomOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "Landroid/graphics/Canvas;", "canvas", "", "drawSeparator", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "", "validate", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "bottomOffsetBeforeItem", "I", "Landroid/graphics/Paint;", "separatorPaint", "Landroid/graphics/Paint;", "offsetsPaint", "decoratedBounds", "Landroid/graphics/Rect;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2SeparatorDecoration extends RecyclerView.n {
    private final int bottomOffsetBeforeItem;

    @NotNull
    private final Context context;

    @NotNull
    private final Rect decoratedBounds;
    private final SeparatorConfig itemSeparatorConfig;

    @NotNull
    private final Paint offsetsPaint;

    @NotNull
    private final Paint separatorPaint;

    public CartSplitV2SeparatorDecoration(@NotNull Context context, SeparatorConfig separatorConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.itemSeparatorConfig = separatorConfig;
        this.bottomOffsetBeforeItem = ResourceExtKt.toPx(separatorConfig != null ? separatorConfig.getHeight() : 1);
        Paint paint = new Paint();
        StyleParser styleParser = StyleParser.INSTANCE;
        paint.setColor(styleParser.parseColor(context, separatorConfig != null ? separatorConfig.getTintColor() : null, R$color.layer_floor_0));
        this.separatorPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(styleParser.parseColor(context, separatorConfig != null ? separatorConfig.getBackgroundColor() : null, R$color.layer_floor_1));
        this.offsetsPaint = paint2;
        this.decoratedBounds = new Rect();
    }

    private final void drawSeparator(Canvas canvas, RecyclerView parent) {
        int width;
        int i11;
        Integer rightPadding;
        Integer leftPadding;
        Canvas canvas2 = canvas;
        int save = canvas2.save();
        try {
            if (parent.getClipToPadding()) {
                int paddingLeft = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                canvas2.clipRect(paddingLeft, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
                i11 = paddingLeft;
            } else {
                width = parent.getWidth();
                i11 = 0;
            }
            int i12 = width;
            SeparatorConfig separatorConfig = this.itemSeparatorConfig;
            int px = i11 + ResourceExtKt.toPx((separatorConfig == null || (leftPadding = separatorConfig.getLeftPadding()) == null) ? 0 : leftPadding.intValue(), this.context);
            SeparatorConfig separatorConfig2 = this.itemSeparatorConfig;
            int px2 = i12 - ResourceExtKt.toPx((separatorConfig2 == null || (rightPadding = separatorConfig2.getRightPadding()) == null) ? 0 : rightPadding.intValue(), this.context);
            int childCount = parent.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = parent.getChildAt(i13);
                Intrinsics.f(childAt);
                if (validate(parent, childAt)) {
                    parent.getDecoratedBoundsWithMargins(childAt, this.decoratedBounds);
                    int c11 = this.decoratedBounds.bottom + C6915b.c(childAt.getTranslationY());
                    float top = childAt.getBottom() >= this.decoratedBounds.bottom ? childAt.getTop() : childAt.getBottom();
                    float f7 = c11;
                    canvas2.drawRect(i11, top, i12, f7, this.offsetsPaint);
                    try {
                        canvas2 = canvas;
                        canvas2.drawRect(px, top, px2, f7, this.separatorPaint);
                    } catch (Throwable th2) {
                        th = th2;
                        canvas2 = canvas;
                        canvas2.restoreToCount(save);
                        throw th;
                    }
                }
            }
            canvas2.restoreToCount(save);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final int getBottomOffset(RecyclerView parent, View child) {
        if (validate(parent, child)) {
            return this.bottomOffsetBeforeItem;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean validate(RecyclerView parent, View child) {
        int childAdapterPosition;
        RecyclerView.g adapter = parent.getAdapter();
        if (adapter == 0 || (childAdapterPosition = parent.getChildAdapterPosition(child)) < 0 || childAdapterPosition >= adapter.getShimmersCount() - 1 || !(adapter instanceof l)) {
            return false;
        }
        l lVar = (l) adapter;
        l lVar2 = lVar.a(childAdapterPosition) ? adapter : null;
        c b11 = lVar2 != null ? lVar2.b(childAdapterPosition) : null;
        int i11 = childAdapterPosition + 1;
        l lVar3 = adapter;
        if (!lVar.a(i11)) {
            lVar3 = null;
        }
        c b12 = lVar3 != null ? lVar3.b(i11) : null;
        if ((b11 instanceof CartSplitV2HeaderVO) || (b11 instanceof CartSplitV2CellItemVO) || (b12 instanceof CartSplitV2CellItemVO)) {
            return false;
        }
        return b12 instanceof CartSplitV2ProductVO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.bottom = getBottomOffset(parent, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        drawSeparator(canvas, parent);
    }
}
