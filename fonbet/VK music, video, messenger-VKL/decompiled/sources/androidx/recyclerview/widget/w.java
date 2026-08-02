package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes.dex */
public class w extends o0 {

    @Nullable
    public e0 a;

    @Nullable
    public d0 b;

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
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view) {
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
    public View findSnapView(RecyclerView.o oVar) {
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
}
