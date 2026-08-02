package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "view", "", "width", "", "drawIslandBelowProduct", "(Landroid/graphics/Canvas;Landroid/view/View;F)V", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "physicalPartHeight", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewDecoration extends RecyclerView.n {

    @NotNull
    private final Paint paint;
    private final float physicalPartHeight;

    public ProductsForReviewDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.physicalPartHeight = ResourceExtKt.toPxF(4);
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
    }

    private final void drawIslandBelowProduct(Canvas canvas, View view, float width) {
        float bottom = view.getBottom();
        IslandSeparatorView.Companion companion = IslandSeparatorView.INSTANCE;
        float corner_height_px = bottom - companion.getCORNER_HEIGHT_PX();
        Path path = new Path();
        path.moveTo(0.0f, companion.getCORNER_ARC_OFFSET() + corner_height_px);
        path.quadTo(0.0f, companion.getCORNER_HEIGHT_PX() + corner_height_px, companion.getCORNER_HEIGHT_PX() - companion.getCORNER_ARC_OFFSET(), companion.getCORNER_HEIGHT_PX() + corner_height_px);
        path.lineTo(companion.getCORNER_ARC_OFFSET() + (width - companion.getCORNER_HEIGHT_PX()), companion.getCORNER_HEIGHT_PX() + corner_height_px);
        path.quadTo(width, companion.getCORNER_HEIGHT_PX() + corner_height_px, width, companion.getCORNER_ARC_OFFSET() + corner_height_px);
        float corner_height_px2 = companion.getCORNER_HEIGHT_PX() + corner_height_px + this.physicalPartHeight;
        path.lineTo(width, corner_height_px2);
        float corner_height_px3 = companion.getCORNER_HEIGHT_PX() + corner_height_px2;
        path.lineTo(width, corner_height_px3 - companion.getCORNER_ARC_OFFSET());
        path.quadTo(width, corner_height_px3 - companion.getCORNER_HEIGHT_PX(), companion.getCORNER_ARC_OFFSET() + (width - companion.getCORNER_HEIGHT_PX()), corner_height_px3 - companion.getCORNER_HEIGHT_PX());
        path.lineTo(companion.getCORNER_HEIGHT_PX() - companion.getCORNER_ARC_OFFSET(), corner_height_px3 - companion.getCORNER_HEIGHT_PX());
        path.quadTo(0.0f, corner_height_px3 - companion.getCORNER_HEIGHT_PX(), 0.0f, corner_height_px3 - companion.getCORNER_ARC_OFFSET());
        path.lineTo(0.0f, corner_height_px2);
        path.lineTo(0.0f, companion.getCORNER_ARC_OFFSET() + corner_height_px);
        path.close();
        canvas.drawPath(path, this.paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (P.e(parent, "parent", state, "state", view) instanceof ProductForReviewViewHolder) {
            outRect.set(0, 0, 0, (int) this.physicalPartHeight);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            if (parent.getChildViewHolder(childAt) instanceof ProductForReviewViewHolder) {
                Intrinsics.f(childAt);
                drawIslandBelowProduct(canvas, childAt, parent.getWidth());
            }
        }
    }
}
