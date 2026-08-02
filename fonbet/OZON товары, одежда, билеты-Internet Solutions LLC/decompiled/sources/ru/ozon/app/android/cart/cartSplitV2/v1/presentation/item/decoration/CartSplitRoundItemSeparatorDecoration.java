package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.decoration;

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
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/decoration/CartSplitRoundItemSeparatorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "itemSeparatorConfig", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "validateChild", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "", "getBottomOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "Landroid/graphics/Canvas;", "canvas", "", "drawSeparator", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "bottomOffsetBeforeItem", "I", "Landroid/graphics/Paint;", "separatorPaint", "Landroid/graphics/Paint;", "offsetsPaint", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitRoundItemSeparatorDecoration extends RecyclerView.n {
    private final int bottomOffsetBeforeItem;

    @NotNull
    private final Context context;
    private final CartSplitV2DTO.SeparatorConfig itemSeparatorConfig;

    @NotNull
    private final Paint offsetsPaint;

    @NotNull
    private final Paint separatorPaint;

    public CartSplitRoundItemSeparatorDecoration(@NotNull Context context, CartSplitV2DTO.SeparatorConfig separatorConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.itemSeparatorConfig = separatorConfig;
        this.bottomOffsetBeforeItem = ResourceExtKt.toPx(separatorConfig != null ? separatorConfig.getHeight() : 16);
        Paint paint = new Paint();
        StyleParser styleParser = StyleParser.INSTANCE;
        paint.setColor(styleParser.parseColor(context, separatorConfig != null ? separatorConfig.getTintColor() : null, R$color.layer_floor_0));
        this.separatorPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(styleParser.parseColor(context, separatorConfig != null ? separatorConfig.getBackgroundColor() : null, R$color.layer_floor_1));
        this.offsetsPaint = paint2;
    }

    private final void drawSeparator(Canvas canvas, RecyclerView parent) {
        Canvas canvas2;
        int width;
        int i11;
        Integer rightPadding;
        Integer leftPadding;
        canvas.save();
        int i12 = 0;
        if (parent.getClipToPadding()) {
            i11 = parent.getPaddingLeft();
            width = parent.getWidth() - parent.getPaddingRight();
            canvas2 = canvas;
            canvas2.clipRect(i11, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
        } else {
            canvas2 = canvas;
            width = parent.getWidth();
            i11 = 0;
        }
        CartSplitV2DTO.SeparatorConfig separatorConfig = this.itemSeparatorConfig;
        int px = ResourceExtKt.toPx((separatorConfig == null || (leftPadding = separatorConfig.getLeftPadding()) == null) ? 0 : leftPadding.intValue(), this.context) + i11;
        CartSplitV2DTO.SeparatorConfig separatorConfig2 = this.itemSeparatorConfig;
        int px2 = width - ResourceExtKt.toPx((separatorConfig2 == null || (rightPadding = separatorConfig2.getRightPadding()) == null) ? 0 : rightPadding.intValue(), this.context);
        int childCount = parent.getChildCount();
        Rect rect = new Rect();
        while (i12 < childCount) {
            View childAt = parent.getChildAt(i12);
            parent.getDecoratedBoundsWithMargins(childAt, rect);
            int c11 = C6915b.c(childAt.getTranslationY()) + rect.bottom;
            int bottom = childAt.getBottom();
            if (validateChild(parent, childAt)) {
                float f7 = bottom;
                float f11 = c11;
                canvas2.drawRect(i11, f7, width, f11, this.offsetsPaint);
                canvas.drawRect(px, f7, px2, f11, this.separatorPaint);
            }
            i12++;
            canvas2 = canvas;
        }
        canvas.restore();
    }

    private final int getBottomOffset(RecyclerView parent, View child) {
        if (validateChild(parent, child)) {
            return this.bottomOffsetBeforeItem;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean validateChild(RecyclerView parent, View child) {
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
        return (b11 instanceof CartSplitV2ItemVO) && ((lVar3 != null ? lVar3.b(i11) : null) instanceof CartSplitV2ItemVO);
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
