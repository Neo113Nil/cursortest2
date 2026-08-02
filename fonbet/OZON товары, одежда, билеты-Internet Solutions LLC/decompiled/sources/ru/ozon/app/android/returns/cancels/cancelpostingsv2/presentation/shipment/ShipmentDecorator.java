package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.shipment;

import E0.C2942q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.MonopostingVO;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.PostingVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/shipment/ShipmentDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "position", "Lm10/l;", "adapter", "getItemTopMargin", "(ILm10/l;)I", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "marginTop", "I", "marginBottom", "Landroid/graphics/Paint;", "backgroundDecorPaint", "Landroid/graphics/Paint;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShipmentDecorator extends RecyclerView.n {

    @NotNull
    private final Paint backgroundDecorPaint;
    private final int marginBottom;
    private final int marginTop;

    public ShipmentDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.marginTop = ResourceExtKt.toPx(16, context);
        this.marginBottom = ResourceExtKt.toPx(8, context);
        Paint paint = new Paint(1);
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, UniColors.BG_SECONDARY.getToken());
        paint.setColor(parseColor != null ? parseColor.intValue() : 0);
        this.backgroundDecorPaint = paint;
    }

    private final int getItemTopMargin(int position, l adapter) {
        int i11 = position - 1;
        if ((i11 < 0 || !(adapter.b(i11) instanceof PostingVO)) && !(adapter.b(i11) instanceof MonopostingVO)) {
            return 0;
        }
        return this.marginTop;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (lVar.b(childAdapterPosition) instanceof ShipmentVO) {
            outRect.set(0, getItemTopMargin(childAdapterPosition, lVar), 0, this.marginBottom);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Object a11 = C2942q.a(parent, "parent", state, "state");
        l lVar = a11 instanceof l ? (l) a11 : null;
        if (lVar == null) {
            return;
        }
        int childCount = parent.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            int childAdapterPosition = parent.getChildAdapterPosition(parent.getChildAt(i11));
            if (childAdapterPosition == -1 || !(lVar.b(childAdapterPosition) instanceof ShipmentVO)) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(r2.getLeft(), r2.getTop() - getItemTopMargin(childAdapterPosition, lVar), r2.getRight(), r2.getBottom() + this.marginBottom, this.backgroundDecorPaint);
            }
            i11++;
            canvas = canvas2;
        }
    }
}
