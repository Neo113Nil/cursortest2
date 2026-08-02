package ru.ozon.app.android.pdp.widgets.crosssale.presentation;

import Sc.InterfaceC4008j;
import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "position", "", "shouldDraw", "(Landroidx/recyclerview/widget/RecyclerView;I)Z", "Landroid/graphics/Canvas;", "canvas", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "offset", "I", "rect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint$delegate", "LSc/j;", "getPaint", "()Landroid/graphics/Paint;", "paint", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleDecoration extends RecyclerView.n {
    private final int offset;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    @NotNull
    private Rect rect;

    public CrossSaleDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.offset = ResourceExtKt.toPx(4);
        this.rect = new Rect();
        this.paint = LazyUtilsKt.unsafeLazy(new CrossSaleDecoration$paint$2(context));
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final boolean shouldDraw(RecyclerView recyclerView, int position) {
        Object adapter = recyclerView.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return false;
        }
        c b11 = lVar.b(position);
        c b12 = lVar.b(position + 1);
        return b11 != null && b12 != null && (b11 instanceof CrossSaleVO) && (b12 instanceof CrossSaleVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if ((P.e(parent, "parent", state, "state", view) instanceof CrossSaleViewHolder) && shouldDraw(parent, parent.getChildLayoutPosition(view))) {
            outRect.bottom = this.offset;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (shouldDraw(parent, parent.getChildAdapterPosition(view))) {
                parent.getDecoratedBoundsWithMargins(view, this.rect);
                Rect rect = this.rect;
                rect.top = rect.bottom - this.offset;
                canvas.drawRect(rect, getPaint());
            }
        }
    }
}
