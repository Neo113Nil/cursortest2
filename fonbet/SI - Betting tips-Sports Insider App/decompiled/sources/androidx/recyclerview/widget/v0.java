package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements androidx.core.view.j, s2, d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2572a;

    public /* synthetic */ v0(RecyclerView recyclerView) {
        this.f2572a = recyclerView;
    }

    public void a(a aVar) {
        int i5 = aVar.f2316a;
        RecyclerView recyclerView = this.f2572a;
        if (i5 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, aVar.f2317b, aVar.f2319d);
            return;
        }
        if (i5 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, aVar.f2317b, aVar.f2319d);
        } else if (i5 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, aVar.f2317b, aVar.f2319d, aVar.f2318c);
        } else {
            if (i5 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, aVar.f2317b, aVar.f2319d, 1);
        }
    }

    public d2 b(int i5) {
        RecyclerView recyclerView = this.f2572a;
        d2 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i5, true);
        if (findViewHolderForPosition != null) {
            k kVar = recyclerView.mChildHelper;
            if (!kVar.f2451c.contains(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i5) {
        RecyclerView recyclerView = this.f2572a;
        View childAt = recyclerView.getChildAt(i5);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i5);
    }

    @Override // androidx.core.view.j
    public boolean d(float f6) {
        int i5;
        int i10;
        RecyclerView recyclerView = this.f2572a;
        if (recyclerView.mLayout.canScrollVertically()) {
            i10 = (int) f6;
            i5 = 0;
        } else if (recyclerView.mLayout.canScrollHorizontally()) {
            i5 = (int) f6;
            i10 = 0;
        } else {
            i5 = 0;
            i10 = 0;
        }
        if (i5 == 0 && i10 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i5, i10);
    }

    @Override // androidx.core.view.j
    public float e() {
        float f6;
        RecyclerView recyclerView = this.f2572a;
        if (recyclerView.mLayout.canScrollVertically()) {
            f6 = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.canScrollHorizontally()) {
                return 0.0f;
            }
            f6 = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f6;
    }

    @Override // androidx.core.view.j
    public void i() {
        this.f2572a.stopScroll();
    }
}
