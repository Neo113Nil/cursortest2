package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div2.DivGallery;
import java.util.HashSet;
import java.util.Set;
import xsna.j5g;

/* compiled from: DivLinearLayoutManager.kt */
/* loaded from: classes12.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {
    public final BindingContext r;
    public final RecyclerView s;
    public final DivGallery t;
    public final HashSet<View> u;

    /* compiled from: DivLinearLayoutManager.kt */
    public static final class a extends RecyclerView.p {
        public int f;
        public int g;

        public a() {
            super(-2, -2);
            this.f = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(BindingContext bindingContext, DivRecyclerView divRecyclerView, DivGallery divGallery, int i) {
        super(i, false);
        divRecyclerView.getContext();
        this.r = bindingContext;
        this.s = divRecyclerView;
        this.t = divGallery;
        this.u = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void detachViewAt(int i) {
        super.detachViewAt(i);
        _detachViewAt(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        a aVar = new a(context, attributeSet);
        aVar.f = Integer.MAX_VALUE;
        aVar.g = Integer.MAX_VALUE;
        return aVar;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final BindingContext getBindingContext() {
        return this.r;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final Set getChildrenToRelayout() {
        return this.u;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final DivGallery getDiv() {
        return this.t;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final DivItemBuilderResult getItemDiv(int i) {
        return (DivItemBuilderResult) j5g.b0(i, ((DivGalleryAdapter) this.s.getAdapter()).getVisibleItems());
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final int getLayoutManagerOrientation() {
        return this.b;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final RecyclerView getView() {
        return this.s;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final void instantScrollToPosition(int i, ScrollPosition scrollPosition) {
        DivGalleryItemHelper.instantScroll$default(this, i, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final void instantScrollToPositionWithOffset(int i, int i2, ScrollPosition scrollPosition) {
        instantScroll(i, scrollPosition, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i, i2, i3, i4, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        a aVar = (a) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.s.getItemDecorInsetsForChild(view);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.g, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.f, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, aVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        _onDetachedFromWindow(recyclerView, vVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        _onLayoutCompleted(a0Var);
        super.onLayoutCompleted(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void removeAndRecycleAllViews(RecyclerView.v vVar) {
        _removeAndRecycleAllViews(vVar);
        super.removeAndRecycleAllViews(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void removeView(View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void removeViewAt(int i) {
        super.removeViewAt(i);
        _removeViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final void superLayoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            a aVar2 = new a(aVar);
            aVar2.f = Integer.MAX_VALUE;
            aVar2.g = Integer.MAX_VALUE;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
            return aVar2;
        }
        if (layoutParams instanceof RecyclerView.p) {
            a aVar3 = new a((RecyclerView.p) layoutParams);
            aVar3.f = Integer.MAX_VALUE;
            aVar3.g = Integer.MAX_VALUE;
            return aVar3;
        }
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            a aVar4 = new a(divLayoutParams);
            aVar4.f = Integer.MAX_VALUE;
            aVar4.g = Integer.MAX_VALUE;
            aVar4.f = divLayoutParams.getMaxHeight();
            aVar4.g = divLayoutParams.getMaxWidth();
            return aVar4;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar5 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar5.f = Integer.MAX_VALUE;
            aVar5.g = Integer.MAX_VALUE;
            return aVar5;
        }
        a aVar6 = new a(layoutParams);
        aVar6.f = Integer.MAX_VALUE;
        aVar6.g = Integer.MAX_VALUE;
        return aVar6;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public final RecyclerView.o toLayoutManager() {
        return this;
    }
}
