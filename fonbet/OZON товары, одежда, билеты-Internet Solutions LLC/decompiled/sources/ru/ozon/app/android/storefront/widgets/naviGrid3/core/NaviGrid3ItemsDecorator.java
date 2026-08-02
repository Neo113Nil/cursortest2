package ru.ozon.app.android.storefront.widgets.naviGrid3.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.NaviGrid3ViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid3/core/NaviGrid3ItemsDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "", "marginBetween", "I", "marginSide", "verticalMargin", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGrid3ItemsDecorator extends RecyclerView.n {

    @NotNull
    private final Context context;
    private final int marginBetween;
    private final int marginSide;
    private final int verticalMargin;

    public NaviGrid3ItemsDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.marginBetween = ResourceExtKt.toPx(8, context);
        this.marginSide = ResourceExtKt.toPx(16, context);
        this.verticalMargin = ResourceExtKt.toPx(4, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.g adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar == null || !(parent.getChildViewHolder(view) instanceof NaviGrid3ViewHolder) || (adapter = parent.getAdapter()) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        int intValue = valueOf.intValue();
        if (intValue >= 0 && intValue < adapter.getShimmersCount()) {
            num = valueOf;
        }
        if (num != null) {
            int c11 = bVar.c() / gridLayoutManager.k().getSpanSize(num.intValue());
            Pair pair = c11 != 0 ? c11 != 1 ? c11 != 2 ? new Pair(0, 0) : new Pair(0, Integer.valueOf(this.marginSide)) : new Pair(Integer.valueOf(this.marginBetween), Integer.valueOf(this.marginBetween)) : new Pair(Integer.valueOf(this.marginSide), 0);
            int intValue2 = ((Number) pair.a()).intValue();
            int intValue3 = ((Number) pair.b()).intValue();
            int i11 = this.verticalMargin;
            outRect.set(intValue2, i11, intValue3, i11);
        }
    }
}
