package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import E0.C2942q;
import Sc.InterfaceC4008j;
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
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.OrderViewHolder;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderVO;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "backgroundColor", "I", "rect$delegate", "LSc/j;", "getRect", "()Landroid/graphics/Rect;", "rect", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "paint", "offsetVertical", "offsetHorizontal", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListDecoration extends RecyclerView.n {
    private final int backgroundColor;
    private final int offsetHorizontal;
    private final int offsetVertical;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    public OrderListDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColor = androidx.core.content.a.getColor(context, R$color.layer_floor_0);
        this.rect = LazyUtilsKt.unsafeLazy(OrderListDecoration$rect$2.INSTANCE);
        this.paint = LazyUtilsKt.unsafeLazy(new OrderListDecoration$paint$2(this));
        this.offsetVertical = context.getResources().getDimensionPixelSize(R$dimen.margin);
        this.offsetHorizontal = context.getResources().getDimensionPixelSize(R$dimen.default_margin);
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
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
        c b11 = lVar.b(childAdapterPosition);
        c b12 = lVar.b(childAdapterPosition - 1);
        if (b11 instanceof OrderVO) {
            int i11 = !(b12 instanceof OrderVO) ? this.offsetVertical : 0;
            int i12 = this.offsetHorizontal;
            outRect.set(i12, i11, i12, this.offsetVertical);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (parent.getChildViewHolder(view) instanceof OrderViewHolder) {
                parent.getDecoratedBoundsWithMargins(view, getRect());
                canvas.drawRect(getRect(), getPaint());
            }
        }
    }
}
