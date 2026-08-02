package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class s0 extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public p0 f2544a;

    /* renamed from: b, reason: collision with root package name */
    public p0 f2545b;

    public static int a(View view, q0 q0Var) {
        return ((q0Var.c(view) / 2) + q0Var.e(view)) - ((q0Var.l() / 2) + q0Var.k());
    }

    public static View b(k1 k1Var, q0 q0Var) {
        int childCount = k1Var.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l6 = (q0Var.l() / 2) + q0Var.k();
        int i5 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k1Var.getChildAt(i10);
            int abs = Math.abs(((q0Var.c(childAt) / 2) + q0Var.e(childAt)) - l6);
            if (abs < i5) {
                view = childAt;
                i5 = abs;
            }
        }
        return view;
    }

    public final q0 c(k1 k1Var) {
        p0 p0Var = this.f2545b;
        if (p0Var == null || p0Var.f2514a != k1Var) {
            this.f2545b = new p0(k1Var, 0);
        }
        return this.f2545b;
    }

    @Override // androidx.recyclerview.widget.h2
    public final int[] calculateDistanceToFinalSnap(k1 k1Var, View view) {
        int[] iArr = new int[2];
        if (k1Var.canScrollHorizontally()) {
            iArr[0] = a(view, c(k1Var));
        } else {
            iArr[0] = 0;
        }
        if (k1Var.canScrollVertically()) {
            iArr[1] = a(view, d(k1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.h2
    public final y1 createScroller(k1 k1Var) {
        if (k1Var instanceof x1) {
            return new r0(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final q0 d(k1 k1Var) {
        p0 p0Var = this.f2544a;
        if (p0Var == null || p0Var.f2514a != k1Var) {
            this.f2544a = new p0(k1Var, 1);
        }
        return this.f2544a;
    }

    @Override // androidx.recyclerview.widget.h2
    public View findSnapView(k1 k1Var) {
        if (k1Var.canScrollVertically()) {
            return b(k1Var, d(k1Var));
        }
        if (k1Var.canScrollHorizontally()) {
            return b(k1Var, c(k1Var));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.h2
    public final int findTargetSnapPosition(k1 k1Var, int i5, int i10) {
        PointF computeScrollVectorForPosition;
        int itemCount = k1Var.getItemCount();
        if (itemCount != 0) {
            View view = null;
            q0 d10 = k1Var.canScrollVertically() ? d(k1Var) : k1Var.canScrollHorizontally() ? c(k1Var) : null;
            if (d10 != null) {
                int childCount = k1Var.getChildCount();
                boolean z5 = false;
                int i11 = Integer.MAX_VALUE;
                int i12 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = k1Var.getChildAt(i13);
                    if (childAt != null) {
                        int a7 = a(childAt, d10);
                        if (a7 <= 0 && a7 > i12) {
                            view2 = childAt;
                            i12 = a7;
                        }
                        if (a7 >= 0 && a7 < i11) {
                            view = childAt;
                            i11 = a7;
                        }
                    }
                }
                boolean z7 = !k1Var.canScrollHorizontally() ? i10 <= 0 : i5 <= 0;
                if (z7 && view != null) {
                    return k1Var.getPosition(view);
                }
                if (!z7 && view2 != null) {
                    return k1Var.getPosition(view2);
                }
                if (z7) {
                    view = view2;
                }
                if (view != null) {
                    int position = k1Var.getPosition(view);
                    int itemCount2 = k1Var.getItemCount();
                    if ((k1Var instanceof x1) && (computeScrollVectorForPosition = ((x1) k1Var).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
                        z5 = true;
                    }
                    int i14 = position + (z5 == z7 ? -1 : 1);
                    if (i14 >= 0 && i14 < itemCount) {
                        return i14;
                    }
                }
            }
        }
        return -1;
    }
}
