package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fwd;
import defpackage.gwd;
import defpackage.prf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class i extends w {
    public fwd a;
    public fwd b;

    public static int a(View view, gwd gwdVar) {
        return ((gwdVar.c(view) / 2) + gwdVar.e(view)) - ((gwdVar.l() / 2) + gwdVar.k());
    }

    public static View b(n nVar, gwd gwdVar) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l = (gwdVar.l() / 2) + gwdVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = nVar.getChildAt(i2);
            int abs = Math.abs(((gwdVar.c(childAt) / 2) + gwdVar.e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    public final gwd c(n nVar) {
        fwd fwdVar = this.b;
        if (fwdVar != null && fwdVar.a == nVar) {
            return fwdVar;
        }
        fwd fwdVar2 = new fwd(nVar, 0);
        this.b = fwdVar2;
        return fwdVar2;
    }

    @Override // androidx.recyclerview.widget.w
    public final int[] calculateDistanceToFinalSnap(n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            iArr[0] = a(view, c(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = a(view, d(nVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w
    public final s createScroller(n nVar) {
        if (nVar instanceof prf) {
            return new h(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final gwd d(n nVar) {
        fwd fwdVar = this.a;
        if (fwdVar != null && fwdVar.a == nVar) {
            return fwdVar;
        }
        fwd fwdVar2 = new fwd(nVar, 1);
        this.a = fwdVar2;
        return fwdVar2;
    }

    @Override // androidx.recyclerview.widget.w
    public View findSnapView(n nVar) {
        if (nVar.canScrollVertically()) {
            return b(nVar, d(nVar));
        }
        if (nVar.canScrollHorizontally()) {
            return b(nVar, c(nVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.w
    public final int findTargetSnapPosition(n nVar, int i, int i2) {
        PointF computeScrollVectorForPosition;
        int itemCount = nVar.getItemCount();
        if (itemCount != 0) {
            View view = null;
            gwd d = nVar.canScrollVertically() ? d(nVar) : nVar.canScrollHorizontally() ? c(nVar) : null;
            if (d != null) {
                int childCount = nVar.getChildCount();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = nVar.getChildAt(i5);
                    if (childAt != null) {
                        int a = a(childAt, d);
                        if (a <= 0 && a > i4) {
                            view2 = childAt;
                            i4 = a;
                        }
                        if (a >= 0 && a < i3) {
                            view = childAt;
                            i3 = a;
                        }
                    }
                }
                boolean z2 = !nVar.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return nVar.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return nVar.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = nVar.getPosition(view);
                    int itemCount2 = nVar.getItemCount();
                    if ((nVar instanceof prf) && (computeScrollVectorForPosition = ((prf) nVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || computeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        z = true;
                    }
                    int i6 = position + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }
}
