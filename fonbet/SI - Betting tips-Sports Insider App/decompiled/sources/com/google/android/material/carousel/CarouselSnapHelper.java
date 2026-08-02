package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.w1;
import androidx.recyclerview.widget.x1;
import androidx.recyclerview.widget.y1;
import androidx.recyclerview.widget.z1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class CarouselSnapHelper extends h2 {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@NonNull k1 k1Var, @NonNull View view, boolean z5) {
        if (!(k1Var instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) k1Var, z5);
        return k1Var.canScrollHorizontally() ? new int[]{distanceToFirstFocalKeyline, 0} : k1Var.canScrollVertically() ? new int[]{0, distanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z5) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z5);
    }

    private View findViewNearestFirstKeyline(k1 k1Var) {
        int childCount = k1Var.getChildCount();
        View view = null;
        if (childCount != 0 && (k1Var instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) k1Var;
            int i5 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k1Var.getChildAt(i10);
                int abs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(k1Var.getPosition(childAt), false));
                if (abs < i5) {
                    view = childAt;
                    i5 = abs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(k1 k1Var, int i5, int i10) {
        return k1Var.canScrollHorizontally() ? i5 > 0 : i10 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(k1 k1Var) {
        PointF computeScrollVectorForPosition;
        int itemCount = k1Var.getItemCount();
        if (!(k1Var instanceof x1) || (computeScrollVectorForPosition = ((x1) k1Var).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.h2
    public void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.h2
    public int[] calculateDistanceToFinalSnap(@NonNull k1 k1Var, @NonNull View view) {
        return calculateDistanceToSnap(k1Var, view, false);
    }

    @Override // androidx.recyclerview.widget.h2
    public y1 createScroller(@NonNull final k1 k1Var) {
        if (k1Var instanceof x1) {
            return new m0(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.m0
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f6;
                    float f10;
                    if (k1Var.canScrollVertically()) {
                        f6 = displayMetrics.densityDpi;
                        f10 = CarouselSnapHelper.VERTICAL_SNAP_SPEED;
                    } else {
                        f6 = displayMetrics.densityDpi;
                        f10 = CarouselSnapHelper.HORIZONTAL_SNAP_SPEED;
                    }
                    return f10 / f6;
                }

                @Override // androidx.recyclerview.widget.m0, androidx.recyclerview.widget.y1
                public void onTargetFound(View view, z1 z1Var, w1 w1Var) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i5 = calculateDistanceToSnap[0];
                        int i10 = calculateDistanceToSnap[1];
                        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i5), Math.abs(i10)));
                        if (calculateTimeForDeceleration > 0) {
                            w1Var.b(i5, i10, this.mDecelerateInterpolator, calculateTimeForDeceleration);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.h2
    public View findSnapView(k1 k1Var) {
        return findViewNearestFirstKeyline(k1Var);
    }

    @Override // androidx.recyclerview.widget.h2
    public int findTargetSnapPosition(k1 k1Var, int i5, int i10) {
        int itemCount;
        if (!this.disableFling || (itemCount = k1Var.getItemCount()) == 0) {
            return -1;
        }
        int childCount = k1Var.getChildCount();
        View view = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = k1Var.getChildAt(i13);
            if (childAt != null) {
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) k1Var, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i12) {
                    view2 = childAt;
                    i12 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i11) {
                    view = childAt;
                    i11 = distanceToFirstFocalKeyline;
                }
            }
        }
        boolean isForwardFling = isForwardFling(k1Var, i5, i10);
        if (isForwardFling && view != null) {
            return k1Var.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return k1Var.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = k1Var.getPosition(view) + (isReverseLayout(k1Var) == isForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper(boolean z5) {
        this.disableFling = z5;
    }
}
