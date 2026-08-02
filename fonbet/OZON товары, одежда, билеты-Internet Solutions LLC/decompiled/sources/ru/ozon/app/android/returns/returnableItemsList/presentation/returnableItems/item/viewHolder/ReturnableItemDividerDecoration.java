package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewHolder;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemDividerDecoration;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/BaseReturnableItemsDecoration;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Rect;", "rect", "", "drawBottomDivider", "(Landroid/content/Context;Landroid/graphics/Canvas;Landroid/graphics/Rect;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "Landroid/view/View;", "group", "onDrawOverCard", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;Ljava/util/List;)V", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemDividerDecoration extends BaseReturnableItemsDecoration {

    @NotNull
    private final Paint dividerPaint;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float DIVIDER_WIDTH = ResourceExtKt.toPxF(1);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemDividerDecoration$Companion;", "", "<init>", "()V", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReturnableItemDividerDecoration() {
        Paint a11 = h.a(true);
        a11.setStrokeWidth(DIVIDER_WIDTH);
        this.dividerPaint = a11;
    }

    private final void drawBottomDivider(Context context, Canvas c11, Rect rect) {
        this.dividerPaint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        float f7 = rect.left;
        int i11 = rect.bottom;
        c11.drawLine(f7, i11, rect.right, i11, this.dividerPaint);
    }

    @Override // ru.ozon.app.android.returns.common.presentation.decorations.CalculateTopAndBottomInCardDecoration
    public void onDrawOverCard(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state, @NotNull List<? extends View> group) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(group, "group");
        for (View view : group) {
            boolean calculateIsBottomInCard = calculateIsBottomInCard(view, parent, state);
            Rect childRect = getChildRect();
            childRect.left = view.getLeft();
            childRect.top = view.getTop();
            childRect.right = view.getRight();
            childRect.bottom = view.getBottom();
            if (!calculateIsBottomInCard) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                drawBottomDivider(context, c11, getChildRect());
            }
        }
    }
}
