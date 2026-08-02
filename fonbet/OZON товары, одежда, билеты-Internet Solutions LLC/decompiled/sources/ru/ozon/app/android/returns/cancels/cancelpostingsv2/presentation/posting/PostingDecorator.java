package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "marginLeft", "I", "marginRight", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostingDecorator extends RecyclerView.n {
    private final int marginLeft;
    private final int marginRight;

    @NotNull
    private final Paint paint;

    public PostingDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.marginLeft = ResourceExtKt.toPx(52, context);
        this.marginRight = ResourceExtKt.toPx(16, context);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(ResourceExtKt.toPxF(1, context) / 2);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.paint = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount() - 1;
        int i11 = 0;
        while (i11 < childCount) {
            RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(parent.getChildAt(i11));
            i11++;
            RecyclerView.C findContainingViewHolder2 = parent.findContainingViewHolder(parent.getChildAt(i11));
            if ((findContainingViewHolder instanceof CancelPostingsV2PostingViewHolder) && (findContainingViewHolder2 instanceof CancelPostingsV2PostingViewHolder)) {
                canvas2 = canvas;
                canvas2.drawLine(r1.getLeft() + this.marginLeft, r1.getBottom(), r1.getRight() - this.marginRight, r1.getBottom(), this.paint);
            } else {
                canvas2 = canvas;
            }
            canvas = canvas2;
        }
    }
}
