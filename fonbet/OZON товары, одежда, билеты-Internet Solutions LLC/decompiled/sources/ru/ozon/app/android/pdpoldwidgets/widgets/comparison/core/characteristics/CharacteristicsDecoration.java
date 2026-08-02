package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

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

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dividerHeight", "I", "dividerMargin", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsDecoration extends RecyclerView.n {
    private final int dividerHeight = ResourceExtKt.toPx(1);
    private final int dividerMargin = ResourceExtKt.toPx(12);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        canvas.save();
        int childCount = parent.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            Rect rect = new Rect();
            View childAt = parent.getChildAt(i11);
            RecyclerView.C childViewHolder = parent.getChildViewHolder(childAt);
            if ((childViewHolder instanceof CharacteristicsGroupViewHolder) && ((CharacteristicsGroupViewHolder) childViewHolder).getType() == CharacteristicsGroupViewHolderType.DEFAULT) {
                parent.getDecoratedBoundsWithMargins(childAt, rect);
                Paint paint = new Paint(1);
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
                paint.setStrokeWidth(this.dividerHeight);
                float f7 = rect.bottom - this.dividerHeight;
                canvas2 = canvas;
                canvas2.drawLine(rect.left + this.dividerMargin, f7, parent.getWidth(), f7, paint);
            } else {
                canvas2 = canvas;
            }
            i11++;
            canvas = canvas2;
        }
        canvas.restore();
    }
}
