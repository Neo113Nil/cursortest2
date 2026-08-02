package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes12.dex */
public class g0 extends o0 {

    @Nullable
    private f0 mHorizontalHelper;

    @Nullable
    private f0 mVerticalHelper;

    /* compiled from: PagerSnapHelper.java */
    public class a extends v {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(@NonNull View view, @NonNull RecyclerView.a0 a0Var, @NonNull RecyclerView.z.a aVar) {
            g0 g0Var = g0.this;
            int[] calculateDistanceToFinalSnap = g0Var.calculateDistanceToFinalSnap(g0Var.mRecyclerView.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    private int distanceToCenter(@NonNull View view, f0 f0Var) {
        return ((f0Var.c(view) / 2) + f0Var.e(view)) - ((f0Var.l() / 2) + f0Var.k());
    }

    @Nullable
    private View findCenterView(RecyclerView.o oVar, f0 f0Var) {
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

    @NonNull
    private f0 getHorizontalHelper(@NonNull RecyclerView.o oVar) {
        f0 f0Var = this.mHorizontalHelper;
        if (f0Var == null || f0Var.a != oVar) {
            this.mHorizontalHelper = new d0(oVar);
        }
        return this.mHorizontalHelper;
    }

    @Nullable
    private f0 getOrientationHelper(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return getVerticalHelper(oVar);
        }
        if (oVar.canScrollHorizontally()) {
            return getHorizontalHelper(oVar);
        }
        return null;
    }

    @NonNull
    private f0 getVerticalHelper(@NonNull RecyclerView.o oVar) {
        f0 f0Var = this.mVerticalHelper;
        if (f0Var == null || f0Var.a != oVar) {
            this.mVerticalHelper = new e0(oVar);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.o oVar, int i, int i2) {
        return oVar.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.o oVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = oVar.getItemCount();
        if (!(oVar instanceof RecyclerView.z.b) || (computeScrollVectorForPosition = ((RecyclerView.z.b) oVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || computeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (oVar.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    public RecyclerView.z createScroller(@NonNull RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o0
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.o oVar) {
        if (oVar.canScrollVertically()) {
            return findCenterView(oVar, getVerticalHelper(oVar));
        }
        if (oVar.canScrollHorizontally()) {
            return findCenterView(oVar, getHorizontalHelper(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o0
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        f0 orientationHelper;
        int itemCount = oVar.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(oVar)) == null) {
            return -1;
        }
        int childCount = oVar.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = oVar.getChildAt(i5);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (distanceToCenter <= 0 && distanceToCenter > i4) {
                    view2 = childAt;
                    i4 = distanceToCenter;
                }
                if (distanceToCenter >= 0 && distanceToCenter < i3) {
                    view = childAt;
                    i3 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(oVar, i, i2);
        if (isForwardFling && view != null) {
            return oVar.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return oVar.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = oVar.getPosition(view) + (isReverseLayout(oVar) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
