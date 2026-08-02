package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LoopLinearSnapHelper.java */
/* loaded from: classes12.dex */
public final class y extends o0 {

    @Nullable
    public e0 a;

    @Nullable
    public d0 b;
    public final long c;
    public RecyclerView e;
    public Scroller f;
    public final Handler d = new Handler();
    public final a g = new a();
    public final b h = new b();

    /* compiled from: LoopLinearSnapHelper.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y yVar = y.this;
            RecyclerView.o layoutManager = yVar.e.getLayoutManager();
            RecyclerView.Adapter adapter = yVar.e.getAdapter();
            if (!(layoutManager instanceof LoopingLinearLayoutManager) || adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LoopingLinearLayoutManager loopingLinearLayoutManager = (LoopingLinearLayoutManager) layoutManager;
            View x = loopingLinearLayoutManager.x(0, loopingLinearLayoutManager.getChildCount(), true, false);
            yVar.e.smoothScrollToPosition(((x == null ? -1 : loopingLinearLayoutManager.getPosition(x)) + 1) % adapter.getItemCount());
        }
    }

    /* compiled from: LoopLinearSnapHelper.java */
    public class b extends RecyclerView.t {
        public boolean b = false;

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            y yVar = y.this;
            if (i == 0 && this.b) {
                this.b = false;
                yVar.snapToTargetExistingView();
            }
            if (i != 0) {
                yVar.d.removeCallbacks(yVar.g);
            } else {
                yVar.h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.b = true;
        }
    }

    /* compiled from: LoopLinearSnapHelper.java */
    public class c extends v {
        public c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            y yVar = y.this;
            RecyclerView recyclerView = yVar.e;
            if (recyclerView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = yVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    public y(long j) {
        this.c = j;
    }

    @Nullable
    public static View e(RecyclerView.o oVar, f0 f0Var) {
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l = (f0Var.l() / 2) + f0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oVar.getChildAt(i2);
            int abs = Math.abs(((f0Var.c(childAt) / 2) + f0Var.e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.e;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            this.e.removeOnScrollListener(this.h);
            this.e.setOnFlingListener(null);
        }
        this.e = recyclerView;
        if (recyclerView != null) {
            if (this.e.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.e.addOnScrollListener(this.h);
            this.e.setOnFlingListener(this);
            this.f = new Scroller(this.e.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
            if (this.c > 0) {
                h();
            }
        }
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            f0 f = f(oVar);
            iArr[0] = ((f.c(view) / 2) + f.e(view)) - ((f.l() / 2) + f.k());
        } else {
            iArr[0] = 0;
        }
        if (!oVar.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        f0 g = g(oVar);
        iArr[1] = ((g.c(view) / 2) + g.e(view)) - ((g.l() / 2) + g.k());
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateScrollDistance(int i, int i2) {
        this.f.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f.getFinalX(), this.f.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        return createSnapScroller(oVar);
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    @Deprecated
    public final v createSnapScroller(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new c(this.e.getContext());
        }
        return null;
    }

    public final int d(RecyclerView.o oVar, f0 f0Var, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = oVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = oVar.getChildAt(i5);
                int position = oVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i4) {
                        view = childAt;
                        i4 = position;
                    }
                    if (position > i3) {
                        view2 = childAt;
                        i3 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(f0Var.b(view), f0Var.b(view2)) - Math.min(f0Var.e(view), f0Var.e(view2));
                if (max != 0) {
                    f = (max * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Math.round((Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / f);
    }

    @NonNull
    public final f0 f(@NonNull RecyclerView.o oVar) {
        d0 d0Var = this.b;
        if (d0Var == null || d0Var.a != oVar) {
            this.b = new d0(oVar);
        }
        return this.b;
    }

    @Override // androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return e(oVar, g(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return e(oVar, f(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        int itemCount;
        View findSnapView;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if ((oVar instanceof RecyclerView.z.b) && (itemCount = oVar.getItemCount()) != 0 && (findSnapView = findSnapView(oVar)) != null && (position = oVar.getPosition(findSnapView)) != -1 && (computeScrollVectorForPosition = ((RecyclerView.z.b) oVar).computeScrollVectorForPosition(itemCount - 1)) != null) {
            if (oVar.canScrollHorizontally()) {
                i4 = d(oVar, f(oVar), i, 0);
                if (computeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (oVar.canScrollVertically()) {
                i5 = d(oVar, g(oVar), 0, i2);
                if (computeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (oVar.canScrollVertically()) {
                i4 = i5;
            }
            if (i4 != 0) {
                int i6 = position + i4;
                int i7 = i6 >= 0 ? i6 : 0;
                return i7 >= itemCount ? i3 : i7;
            }
        }
        return -1;
    }

    @NonNull
    public final f0 g(@NonNull RecyclerView.o oVar) {
        e0 e0Var = this.a;
        if (e0Var == null || e0Var.a != oVar) {
            this.a = new e0(oVar);
        }
        return this.a;
    }

    public final void h() {
        this.d.removeCallbacks(this.g);
        long j = this.c;
        if (j <= 0 || this.e == null) {
            return;
        }
        this.d.postDelayed(this.g, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    @Override // androidx.recyclerview.widget.o0, androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFling(int i, int i2) {
        boolean z;
        v createSnapScroller;
        int findTargetSnapPosition;
        RecyclerView.o layoutManager = this.e.getLayoutManager();
        if (layoutManager == null || this.e.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.e.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if ((layoutManager instanceof RecyclerView.z.b) && (createSnapScroller = createSnapScroller(layoutManager)) != null && (findTargetSnapPosition = findTargetSnapPosition(layoutManager, i, i2)) != -1) {
                RecyclerView recyclerView = this.e;
                z = true;
                if (recyclerView == null || recyclerView.getScrollState() != 1) {
                    createSnapScroller.setTargetPosition(findTargetSnapPosition);
                    layoutManager.startSmoothScroll(createSnapScroller);
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.o0
    public final void snapToTargetExistingView() {
        RecyclerView.o layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.e;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i = calculateDistanceToFinalSnap[0];
        if (i == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.e.smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
    }
}
