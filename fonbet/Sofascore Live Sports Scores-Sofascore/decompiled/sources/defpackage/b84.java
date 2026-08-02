package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.w;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b84 extends w {
    public fwd a;
    public fwd b;
    public final int c;
    public final float d = 100.0f;
    public final int e = 500;
    public Context f;
    public fwd g;
    public Scroller h;
    public int i;
    public final /* synthetic */ CupTreeExtendedView j;

    public b84(CupTreeExtendedView cupTreeExtendedView, int i) {
        this.j = cupTreeExtendedView;
        this.c = i;
    }

    public final int a(n nVar, gwd gwdVar, int i, int i2) {
        int[] calculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = nVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = nVar.getChildAt(i5);
                int position = nVar.getPosition(childAt);
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
                int max = Math.max(gwdVar.b(view), gwdVar.b(view2)) - Math.min(gwdVar.e(view), gwdVar.e(view2));
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

    @Override // androidx.recyclerview.widget.w
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView.getContext();
        this.h = new Scroller(this.f, new DecelerateInterpolator());
        this.g = new fwd(recyclerView.getLayoutManager(), 0);
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.w
    public final int[] calculateDistanceToFinalSnap(n nVar, View view) {
        nVar.getClass();
        view.getClass();
        fwd fwdVar = this.g;
        if (fwdVar != null) {
            return new int[]{(fwdVar.e(view) - fwdVar.a.getPaddingLeft()) - this.c, 0};
        }
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            fwd fwdVar2 = this.b;
            if (fwdVar2 == null || fwdVar2.a != nVar) {
                fwdVar2 = new fwd(nVar, 0);
                this.b = fwdVar2;
            }
            iArr[0] = ((fwdVar2.c(view) / 2) + fwdVar2.e(view)) - ((fwdVar2.l() / 2) + fwdVar2.k());
        } else {
            iArr[0] = 0;
        }
        if (!nVar.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        fwd fwdVar3 = this.a;
        if (fwdVar3 == null || fwdVar3.a != nVar) {
            fwdVar3 = new fwd(nVar, 1);
            this.a = fwdVar3;
        }
        iArr[1] = ((fwdVar3.c(view) / 2) + fwdVar3.e(view)) - ((fwdVar3.l() / 2) + fwdVar3.k());
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w
    public final int[] calculateScrollDistance(int i, int i2) {
        int[] iArr = new int[2];
        fwd fwdVar = this.g;
        if (fwdVar == null) {
            return iArr;
        }
        int i3 = this.i;
        if (i3 == 0) {
            i3 = (fwdVar.g() - fwdVar.a.getPaddingLeft()) / 2;
            this.i = i3;
        }
        int i4 = i3;
        Scroller scroller = this.h;
        if (scroller != null) {
            scroller.fling(0, 0, i, i2, -i4, i4, 0, 0);
        }
        Scroller scroller2 = this.h;
        iArr[0] = yid.m(scroller2 != null ? Integer.valueOf(scroller2.getFinalX()) : null);
        Scroller scroller3 = this.h;
        iArr[1] = yid.m(scroller3 != null ? Integer.valueOf(scroller3.getFinalY()) : null);
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w
    public final s createScroller(n nVar) {
        if (!(nVar instanceof prf)) {
            return createSnapScroller(nVar);
        }
        Context context = this.f;
        if (context == null) {
            return null;
        }
        return new a84(context, this, nVar);
    }

    @Override // androidx.recyclerview.widget.w
    public final View findSnapView(n nVar) {
        int childCount;
        fwd fwdVar = this.g;
        View view = null;
        if (fwdVar == null || (childCount = nVar.getChildCount()) == 0) {
            return null;
        }
        int paddingLeft = fwdVar.a.getPaddingLeft();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = nVar.getChildAt(i2);
            int abs = Math.abs(fwdVar.e(childAt) - paddingLeft);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.w
    public final int findTargetSnapPosition(n nVar, int i, int i2) {
        int itemCount;
        View findSnapView;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if ((nVar instanceof prf) && (itemCount = nVar.getItemCount()) != 0 && (findSnapView = findSnapView(nVar)) != null && (position = nVar.getPosition(findSnapView)) != -1 && (computeScrollVectorForPosition = ((prf) nVar).computeScrollVectorForPosition(itemCount - 1)) != null) {
            if (nVar.canScrollHorizontally()) {
                fwd fwdVar = this.b;
                if (fwdVar == null || fwdVar.a != nVar) {
                    fwdVar = new fwd(nVar, 0);
                    this.b = fwdVar;
                }
                i4 = a(nVar, fwdVar, i, 0);
                if (computeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (nVar.canScrollVertically()) {
                fwd fwdVar2 = this.a;
                if (fwdVar2 == null || fwdVar2.a != nVar) {
                    fwdVar2 = new fwd(nVar, 1);
                    this.a = fwdVar2;
                }
                i5 = a(nVar, fwdVar2, 0, i2);
                if (computeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (nVar.canScrollVertically()) {
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

    @Override // androidx.recyclerview.widget.w, defpackage.jrf
    public final boolean onFling(int i, int i2) {
        CupTreeExtendedView cupTreeExtendedView = this.j;
        nr1 nr1Var = cupTreeExtendedView.d;
        if (Math.abs(i) > ViewConfiguration.get(cupTreeExtendedView.getContext()).getScaledMinimumFlingVelocity()) {
            int i3 = cupTreeExtendedView.e;
            Context context = cupTreeExtendedView.getContext();
            context.getClass();
            int i4 = (!hkg.c0(context) ? i > 0 : i < 0) ? i3 - 1 : i3 + 1;
            l adapter = ((RecyclerView) nr1Var.i).getAdapter();
            int m = yid.m(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
            if (i4 >= 0 && i4 < m) {
                cupTreeExtendedView.e = i4;
                u findViewHolderForAdapterPosition = ((RecyclerView) nr1Var.i).findViewHolderForAdapterPosition(i4);
                View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
                n layoutManager = ((RecyclerView) nr1Var.i).getLayoutManager();
                if (layoutManager != null && view != null) {
                    ((RecyclerView) nr1Var.i).smoothScrollBy(calculateDistanceToFinalSnap(layoutManager, view)[0], 0);
                    return true;
                }
            }
        }
        return false;
    }
}
