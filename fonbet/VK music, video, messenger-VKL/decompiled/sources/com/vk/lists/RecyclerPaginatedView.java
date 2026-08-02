package com.vk.lists;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.c7t0;
import xsna.cf90;
import xsna.d2e0;
import xsna.df90;
import xsna.ef90;
import xsna.gzs;
import xsna.l7s;
import xsna.pd90;
import xsna.s3q0;
import xsna.t96;
import xsna.too0;
import xsna.wjf0;

/* loaded from: classes3.dex */
public class RecyclerPaginatedView extends AbstractPaginatedView implements c.n {
    public boolean A;
    public AbstractPaginatedView.g B;
    public int C;
    public int D;
    public GridLayoutManager.c E;
    public gzs<s3q0> F;
    public gzs<s3q0> G;
    public RecyclerView.n H;
    public l I;
    public Boolean J;
    public final c.i K;
    public final j L;
    public final a M;
    public AbstractPaginatedView.h w;
    public RecyclerView x;
    public SwipeDrawableRefreshLayout y;
    public pd90 z;

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            gzs<s3q0> gzsVar = RecyclerPaginatedView.this.G;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            gzs<s3q0> gzsVar = RecyclerPaginatedView.this.G;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            gzs<s3q0> gzsVar = RecyclerPaginatedView.this.G;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public class b implements SwipeDrawableRefreshLayout.g {
        public b() {
        }

        @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
        public final void h() {
            gzs<s3q0> gzsVar;
            RecyclerPaginatedView recyclerPaginatedView = RecyclerPaginatedView.this;
            t96 t96Var = recyclerPaginatedView.h;
            if ((t96Var == null || !t96Var.c()) && (gzsVar = recyclerPaginatedView.F) != null) {
                gzsVar.invoke();
            }
        }
    }

    public class c extends StaggeredGridLayoutManager {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return getOrientation() == 0 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return getOrientation() == 1 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public class e extends LinearLayoutManager {
        public e(int i) {
            super(i, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return this.b == 0 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return this.b == 1 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public class f implements gzs<s3q0> {
        public f() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            pd90 pd90Var = RecyclerPaginatedView.this.z;
            if (pd90Var != null) {
                pd90Var.z0();
            }
            return s3q0.a;
        }
    }

    public class g implements gzs<s3q0> {
        public g() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            pd90 pd90Var = RecyclerPaginatedView.this.z;
            if (pd90Var != null) {
                pd90Var.y0();
            }
            return s3q0.a;
        }
    }

    public class h implements gzs<s3q0> {
        public h() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            pd90<?> pd90Var = RecyclerPaginatedView.this.z;
            if (pd90Var != null) {
                T t = pd90Var.c;
                if (pd90Var.h != 3 && pd90Var.f != null) {
                    boolean C0 = pd90Var.C0();
                    pd90Var.h = 3;
                    c7t0 c7t0Var = pd90Var.i;
                    if (c7t0Var != null) {
                        c7t0Var.a(pd90Var);
                    }
                    if (C0) {
                        pd90Var.notifyItemChanged(t.getItemCount());
                    } else {
                        pd90Var.notifyItemInserted(t.getItemCount());
                    }
                }
            }
            return s3q0.a;
        }
    }

    public class i implements gzs<s3q0> {
        public i() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            pd90 pd90Var = RecyclerPaginatedView.this.z;
            if (pd90Var != null) {
                pd90Var.A0();
            }
            return s3q0.a;
        }
    }

    public class j extends GridLayoutManager.c {
        public j() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            RecyclerPaginatedView recyclerPaginatedView = RecyclerPaginatedView.this;
            pd90 pd90Var = recyclerPaginatedView.z;
            if (pd90Var != null && pd90Var.B0(i)) {
                AbstractPaginatedView.g gVar = recyclerPaginatedView.B;
                return gVar != null ? gVar.c(recyclerPaginatedView.getMeasuredWidth()) : recyclerPaginatedView.D;
            }
            GridLayoutManager.c cVar = recyclerPaginatedView.E;
            if (cVar == null) {
                return 1;
            }
            int c = cVar.c(i);
            return c < 0 ? recyclerPaginatedView.D : c;
        }
    }

    public static class k implements gzs<pd90> {
        public final WeakReference<RecyclerPaginatedView> b;

        public k(RecyclerPaginatedView recyclerPaginatedView) {
            this.b = new WeakReference<>(recyclerPaginatedView);
        }

        @Override // xsna.gzs
        public final pd90 invoke() {
            RecyclerPaginatedView recyclerPaginatedView = this.b.get();
            if (recyclerPaginatedView != null) {
                return recyclerPaginatedView.z;
            }
            return null;
        }
    }

    public interface l {
        void a(Canvas canvas, RecyclerPaginatedView recyclerPaginatedView);
    }

    public static class m implements c.i {
        public k b;

        @Override // com.vk.lists.c.i
        public final boolean I() {
            pd90 pd90Var = (pd90) this.b.invoke();
            return pd90Var == null || pd90Var.c.getItemCount() == 0;
        }

        @Override // com.vk.lists.c.i
        public final void clear() {
            pd90 pd90Var = (pd90) this.b.invoke();
            if (pd90Var != null) {
                pd90Var.c.clear();
            }
        }
    }

    public static final class n extends AbstractPaginatedView.h {
        public final WeakReference<SwipeDrawableRefreshLayout> a;
        public final int b;

        public n(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
            this.a = new WeakReference<>(swipeDrawableRefreshLayout);
            this.b = swipeDrawableRefreshLayout.getProgressViewEndOffset();
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void a(@Nullable Integer num) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a.get();
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.s(swipeDrawableRefreshLayout.getProgressViewStartOffset(), this.b + (num != null ? num.intValue() : 0));
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void b(boolean z) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a.get();
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setEnabled(z);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void c(SwipeDrawableRefreshLayout.g gVar) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a.get();
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setOnRefreshListener(gVar);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void d(d2e0 d2e0Var) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a.get();
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setProgressDrawableFactory(d2e0Var);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void e(boolean z) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.a.get();
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setRefreshing(z);
            }
        }
    }

    public RecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = true;
        this.C = -1;
        this.D = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        this.J = Boolean.FALSE;
        this.K = v();
        this.L = new j();
        this.M = new a();
    }

    private void setSpanCountToLayoutManager(int i2) {
        if (this.x.getLayoutManager() == null || !(this.x.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        ((GridLayoutManager) this.x.getLayoutManager()).setSpanCount(i2);
        ((GridLayoutManager) this.x.getLayoutManager()).x = this.L;
    }

    @Override // com.vk.lists.c.n
    public void K9() {
        this.w.e(true);
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        this.x.removeOnScrollListener(new ef90(df90Var));
    }

    @Override // com.vk.lists.c.n
    public void Mk() {
        this.w.e(false);
    }

    @Override // com.vk.lists.AbstractPaginatedView, xsna.too0
    public void Ng() {
        super.Ng();
        l lVar = this.I;
        if (lVar instanceof too0) {
            ((too0) lVar).Ng();
        }
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        this.x.addOnScrollListener(new ef90(df90Var));
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.x.computeVerticalScrollOffset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        l lVar = this.I;
        if (lVar != null) {
            lVar.a(canvas, this);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public c.i getDataInfoProvider() {
        return this.K;
    }

    @Nullable
    public View getProgressView() {
        return this.b;
    }

    @NonNull
    public RecyclerView getRecyclerView() {
        return this.x;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public void j() {
        wjf0.c(this.x, new i());
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void k() {
        wjf0.c(this.x, new h());
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void l() {
        wjf0.c(this.x, new g());
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void m() {
        wjf0.c(this.x, new f());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int i6 = this.C;
        if (i6 > 0) {
            int max = Math.max(1, i2 / i6);
            this.D = max;
            setSpanCountToLayoutManager(max);
        } else {
            AbstractPaginatedView.g gVar = this.B;
            if (gVar != null) {
                setSpanCountToLayoutManager(gVar.c(i2));
            }
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public View q(Context context, @Nullable AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_view_recycler_paginated_view, (ViewGroup) this, false);
        this.y = (SwipeDrawableRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.x = (RecyclerView) inflate.findViewById(R.id.recycler);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
        if (!obtainStyledAttributes.getBoolean(0, false)) {
            this.x.setItemAnimator(null);
        }
        obtainStyledAttributes.recycle();
        if (context instanceof l7s) {
            this.y.setProgressBackgroundColorSchemeResource(R.color.vk_gray_750);
            this.y.setColorSchemeResources(R.color.vk_sky_300);
        }
        n nVar = new n(this.y);
        this.w = nVar;
        nVar.c(new b());
        return this.y;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroidx/recyclerview/widget/RecyclerView$e0;V:Landroidx/recyclerview/widget/RecyclerView$Adapter<TT;>;:Lxsna/vic;>(TV;)V */
    public void setAdapter(RecyclerView.Adapter adapter) {
        pd90 pd90Var = this.z;
        a aVar = this.M;
        if (pd90Var != null) {
            pd90Var.unregisterAdapterDataObserver(aVar);
        }
        pd90 pd90Var2 = new pd90(adapter, this.i, this.j, this.k, this.u);
        this.z = pd90Var2;
        this.x.setAdapter(pd90Var2);
        pd90 pd90Var3 = this.z;
        if (pd90Var3 != null) {
            pd90Var3.registerAdapterDataObserver(aVar);
        }
        aVar.b();
    }

    public void setCanScroll(boolean z) {
        this.A = z;
    }

    public void setColumnWidth(int i2) {
        this.C = i2;
        this.D = 0;
        this.B = null;
        if (getMeasuredWidth() <= 0 || i2 <= 0) {
            return;
        }
        int max = Math.max(1, getMeasuredWidth() / this.C);
        this.D = max;
        setSpanCountToLayoutManager(max);
    }

    @Override // com.vk.lists.c.n
    public void setDataObserver(gzs<s3q0> gzsVar) {
        this.G = gzsVar;
    }

    public void setDecoration(l lVar) {
        this.I = lVar;
        invalidate();
    }

    public void setFixedSpanCount(int i2) {
        this.D = i2;
        this.C = 0;
        this.B = null;
        setSpanCountToLayoutManager(i2);
    }

    public void setIgnoreRequestChildRectangleOnScreen(Boolean bool) {
        this.J = bool;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public void setItemDecoration(RecyclerView.n nVar) {
        RecyclerView.n nVar2 = this.H;
        if (nVar2 != null) {
            this.x.removeItemDecoration(nVar2);
        }
        this.H = nVar;
        if (nVar != null) {
            this.x.addItemDecoration(nVar, 0);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public void setLayoutManagerFromBuilder(AbstractPaginatedView.d dVar) {
        AbstractPaginatedView.LayoutType layoutType = dVar.a;
        if (layoutType == AbstractPaginatedView.LayoutType.STAGGERED_GRID) {
            this.x.setLayoutManager(new c(dVar.c, dVar.f));
            return;
        }
        if (layoutType != AbstractPaginatedView.LayoutType.GRID) {
            RecyclerView recyclerView = this.x;
            getContext();
            recyclerView.setLayoutManager(new e(dVar.f));
            return;
        }
        getContext();
        int i2 = dVar.c;
        if (i2 <= 0) {
            i2 = 1;
        }
        d dVar2 = new d(i2, dVar.f);
        dVar2.x = this.L;
        this.x.setLayoutManager(dVar2);
        int i3 = dVar.c;
        if (i3 > 0) {
            setFixedSpanCount(i3);
        } else {
            setSpanCountLookup(dVar.d);
        }
        setSpanSizeLookup(dVar.e);
    }

    @Override // com.vk.lists.c.n
    public void setOnRefreshListener(gzs<s3q0> gzsVar) {
        this.F = gzsVar;
    }

    public void setProgressDrawableFactory(@NonNull d2e0 d2e0Var) {
        this.w.d(d2e0Var);
    }

    public void setSpanCountLookup(AbstractPaginatedView.g gVar) {
        this.D = 0;
        this.C = 0;
        this.B = gVar;
        setSpanCountToLayoutManager(gVar.c(getMeasuredWidth()));
    }

    public void setSpanSizeLookup(GridLayoutManager.c cVar) {
        this.E = cVar;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public void setSwipeRefreshEnabled(boolean z) {
        this.w.b(z);
    }

    public void setSwipeRefreshLayoutNestedScrollEnabled(boolean z) {
        this.y.setNestedScrollingEnabled(z);
    }

    public final void u(df90 df90Var) {
        this.x.addOnLayoutChangeListener(new cf90(df90Var));
    }

    @NonNull
    public c.i v() {
        k kVar = new k(this);
        m mVar = new m();
        mVar.b = kVar;
        return mVar;
    }

    public final void w(df90 df90Var) {
        this.x.removeOnLayoutChangeListener(new cf90(df90Var));
    }

    public class d extends GridLayoutManager {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return this.b == 0 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return this.b == 1 && RecyclerPaginatedView.this.A;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            if (RecyclerPaginatedView.this.J.booleanValue()) {
                return false;
            }
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            if (RecyclerPaginatedView.this.J.booleanValue()) {
                return false;
            }
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z);
        }
    }

    public RecyclerPaginatedView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = true;
        this.C = -1;
        this.D = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        this.J = Boolean.FALSE;
        this.K = v();
        this.L = new j();
        this.M = new a();
    }

    public RecyclerPaginatedView(Context context) {
        super(context, null, 0);
        this.A = true;
        this.C = -1;
        this.D = -1;
        this.E = null;
        this.F = null;
        this.G = null;
        this.J = Boolean.FALSE;
        this.K = v();
        this.L = new j();
        this.M = new a();
    }
}
