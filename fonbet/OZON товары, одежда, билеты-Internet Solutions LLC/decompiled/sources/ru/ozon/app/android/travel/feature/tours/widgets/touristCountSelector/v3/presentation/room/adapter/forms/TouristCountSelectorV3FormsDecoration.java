package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.adapter.forms;

import Nh.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/adapter/forms/TouristCountSelectorV3FormsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "offsetBetween", "I", "childBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "dividerPaint", "Landroid/graphics/Paint;", "dividerHeight", "dividerLeftPadding", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3FormsDecoration extends RecyclerView.n {

    @NotNull
    private final Rect childBounds;
    private final int dividerHeight;
    private final int dividerLeftPadding;

    @NotNull
    private final Paint dividerPaint;
    private final int offsetBetween;

    public TouristCountSelectorV3FormsDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.offsetBetween = ResourceExtKt.toPx(12, context);
        this.childBounds = new Rect();
        Paint paint = new Paint();
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        paint.setStyle(Paint.Style.FILL);
        this.dividerPaint = paint;
        this.dividerHeight = ResourceExtKt.toPx(1, context);
        this.dividerLeftPadding = ResourceExtKt.toPx(16, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 == -1) {
            return;
        }
        outRect.top = a11 > 0 ? this.offsetBetween : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int b11 = state.b() - 1;
        int i11 = 0;
        while (i11 < b11) {
            View findViewByPosition = layoutManager.findViewByPosition(i11);
            if (findViewByPosition == null) {
                canvas2 = canvas;
            } else {
                layoutManager.getDecoratedBoundsWithMargins(findViewByPosition, this.childBounds);
                int i12 = this.childBounds.bottom;
                int i13 = this.offsetBetween;
                float f7 = i12 + i13;
                canvas2 = canvas;
                canvas2.drawRect(r1.left + this.dividerLeftPadding, this.dividerHeight + f7, r1.right, i12 + i13, this.dividerPaint);
            }
            i11++;
            canvas = canvas2;
        }
    }
}
