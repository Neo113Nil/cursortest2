package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject;

import Sc.InterfaceC4008j;
import T7.P;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ/\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u00105\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001b\u0010<\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010.R\u0014\u0010=\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/UniversalWidgetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectGridViewHolder;", "viewHolder", "", "offsetGridItem", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectGridViewHolder;)V", "getOffsetForMaxSpan", "(Landroid/graphics/Rect;)V", "", "spanIndex", "spanCount", "getOffsetForLargeSpan", "(Landroid/graphics/Rect;II)V", "spanSize", "getOffsetForMediumSpan", "(Landroid/graphics/Rect;III)V", "getOffsetForMinSpan", "Landroid/graphics/Canvas;", "c", "child", "Landroid/graphics/drawable/Drawable;", "divider", "drawBackgroundForWidget", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "horizontalMargin", "I", "itemMargin", "margin", "topBottomMargin$delegate", "LSc/j;", "getTopBottomMargin", "topBottomMargin", "whiteDivider", "Landroid/graphics/drawable/Drawable;", "bounds", "Landroid/graphics/Rect;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UniversalWidgetDecoration extends RecyclerView.n {

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Context context;
    private final int horizontalMargin;
    private final int itemMargin;
    private final int margin;

    /* renamed from: topBottomMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topBottomMargin;

    @NotNull
    private final Drawable whiteDivider;

    public UniversalWidgetDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.horizontalMargin = context.getResources().getDimensionPixelSize(R$dimen.default_margin);
        this.itemMargin = context.getResources().getDimensionPixelSize(R$dimen.padding_extra_small);
        this.margin = context.getResources().getDimensionPixelSize(R$dimen.margin);
        this.topBottomMargin = LazyUtilsKt.unsafeLazy(UniversalWidgetDecoration$topBottomMargin$2.INSTANCE);
        this.whiteDivider = new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.bounds = new Rect();
    }

    private final void drawBackgroundForWidget(Canvas c11, RecyclerView parent, View child, Drawable divider) {
        parent.getDecoratedBoundsWithMargins(child, this.bounds);
        divider.setBounds(this.bounds);
        divider.draw(c11);
    }

    private final void getOffsetForLargeSpan(Rect outRect, int spanIndex, int spanCount) {
        if (spanIndex % spanCount == 0) {
            outRect.left = this.horizontalMargin;
            outRect.right = this.itemMargin;
        } else {
            outRect.left = this.itemMargin;
            outRect.right = this.horizontalMargin;
        }
    }

    private final void getOffsetForMaxSpan(Rect outRect) {
        int i11 = this.horizontalMargin;
        outRect.left = i11;
        outRect.right = i11;
    }

    private final void getOffsetForMediumSpan(Rect outRect, int spanIndex, int spanCount, int spanSize) {
        if (spanIndex == 0) {
            outRect.left = this.horizontalMargin;
            outRect.right = 0;
        } else if (spanIndex + spanSize == spanCount) {
            outRect.left = 0;
            outRect.right = this.horizontalMargin;
        } else {
            int i11 = this.margin;
            outRect.left = i11;
            outRect.right = i11;
        }
    }

    private final void getOffsetForMinSpan(Rect outRect, int spanIndex, int spanCount, int spanSize) {
        if (spanIndex == 0) {
            outRect.left = this.horizontalMargin;
            outRect.right = 0;
        } else if (spanIndex + spanSize == spanCount) {
            outRect.left = 0;
            outRect.right = this.horizontalMargin;
        } else {
            int i11 = this.margin;
            outRect.left = i11;
            outRect.right = i11;
        }
    }

    private final int getTopBottomMargin() {
        return ((Number) this.topBottomMargin.getValue()).intValue();
    }

    private final void offsetGridItem(Rect outRect, View view, RecyclerView parent, UniversalObjectGridViewHolder viewHolder) {
        RecyclerView.g adapter;
        int intValue;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar == null) {
            return;
        }
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int g10 = gridLayoutManager.g();
        if (g10 == 1200 && (adapter = parent.getAdapter()) != null) {
            Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
            int intValue2 = valueOf.intValue();
            if (intValue2 < 0 || intValue2 >= adapter.getShimmersCount()) {
                valueOf = null;
            }
            Integer valueOf2 = Integer.valueOf(gridLayoutManager.getPosition(view));
            int intValue3 = valueOf2.intValue();
            if (intValue3 >= 0 && intValue3 < adapter.getShimmersCount()) {
                num = valueOf2;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else if (num == null) {
                return;
            } else {
                intValue = num.intValue();
            }
            int spanSize = gridLayoutManager.k().getSpanSize(intValue);
            int c11 = bVar.c();
            ObjectItemVO boundedData = viewHolder.getBoundedData();
            outRect.top = (boundedData == null || !boundedData.getNeedTopMargin()) ? this.itemMargin : getTopBottomMargin() + this.itemMargin;
            outRect.bottom = (boundedData == null || !boundedData.getNeedBottomMargin()) ? this.itemMargin : getTopBottomMargin() + this.itemMargin;
            if (spanSize == 300) {
                getOffsetForMinSpan(outRect, c11, g10, spanSize);
                return;
            }
            if (spanSize == 400) {
                getOffsetForMediumSpan(outRect, c11, g10, spanSize);
            } else if (spanSize == 600) {
                getOffsetForLargeSpan(outRect, c11, g10);
            } else {
                if (spanSize != 1200) {
                    return;
                }
                getOffsetForMaxSpan(outRect);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UniversalWidgetDecoration) && Intrinsics.d(this.context, ((UniversalWidgetDecoration) other).context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if (e11 instanceof UniversalObjectGridViewHolder) {
            offsetGridItem(outRect, view, parent, (UniversalObjectGridViewHolder) e11);
        }
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            if (parent.getChildViewHolder(childAt) instanceof UniversalObjectGridViewHolder) {
                Intrinsics.f(childAt);
                drawBackgroundForWidget(canvas, parent, childAt, this.whiteDivider);
            }
        }
    }

    @NotNull
    public String toString() {
        return "UniversalWidgetDecoration(context=" + this.context + ")";
    }
}
