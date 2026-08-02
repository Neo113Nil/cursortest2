package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.w;
import defpackage.f8b;
import defpackage.fwd;
import defpackage.gwd;
import defpackage.prf;
import defpackage.qrf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class pcc extends w {
    private RecyclerView gm;
    private gwd pcc;
    private gwd sf;

    private gwd pcc(n nVar) {
        gwd gwdVar = this.pcc;
        if (gwdVar != null && gwdVar.a == nVar) {
            return gwdVar;
        }
        fwd fwdVar = new fwd(nVar, 1);
        this.pcc = fwdVar;
        return fwdVar;
    }

    private gwd sf(n nVar) {
        gwd gwdVar = this.sf;
        if (gwdVar != null && gwdVar.a == nVar) {
            return gwdVar;
        }
        fwd fwdVar = new fwd(nVar, 0);
        this.sf = fwdVar;
        return fwdVar;
    }

    @Override // androidx.recyclerview.widget.w
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.gm = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.w
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull n nVar, @NonNull View view) {
        int[] iArr = {0, 0};
        if (nVar.canScrollHorizontally()) {
            iArr[0] = pcc(view, sf(nVar));
            return iArr;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = pcc(view, pcc(nVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w
    @Nullable
    public s createScroller(@NonNull n nVar) {
        if (nVar instanceof prf) {
            return new f8b(this.gm.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.pcc.1
                @Override // defpackage.f8b
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // defpackage.f8b
                public int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // defpackage.f8b, androidx.recyclerview.widget.s
                public void onTargetFound(View view, qrf qrfVar, r rVar) {
                    pcc pccVar = pcc.this;
                    int[] calculateDistanceToFinalSnap = pccVar.calculateDistanceToFinalSnap(pccVar.gm.getLayoutManager(), view);
                    int i = calculateDistanceToFinalSnap[0];
                    int i2 = calculateDistanceToFinalSnap[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        rVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.w
    @Nullable
    public View findSnapView(@NonNull n nVar) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nVar;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                gwd pcc = pcc(nVar);
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = linearLayoutManager.getChildAt(i2);
                    int abs = Math.abs(pcc.e(childAt));
                    if (abs < i) {
                        view = childAt;
                        i = abs;
                    }
                }
                return view;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.w
    public int findTargetSnapPosition(n nVar, int i, int i2) {
        View findSnapView = findSnapView(nVar);
        int i3 = -1;
        if (findSnapView == null) {
            return -1;
        }
        int position = nVar.getPosition(findSnapView);
        if (nVar.canScrollVertically()) {
            i3 = i2 < 0 ? position - 1 : position + 1;
        }
        return Math.min(nVar.getItemCount() - 1, Math.max(i3, 0));
    }

    private int pcc(View view, @NonNull gwd gwdVar) {
        int e = gwdVar.e(view);
        return e >= gwdVar.k() / 2 ? e - gwdVar.k() : e;
    }
}
