package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2568a;

    public u1(RecyclerView recyclerView) {
        this.f2568a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f2568a;
        if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onChanged() {
        RecyclerView recyclerView = this.f2568a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f2600f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeChanged(int i5, int i10, Object obj) {
        RecyclerView recyclerView = this.f2568a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2324b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(bVar.h(obj, 4, i5, i10));
        bVar.f2328f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeInserted(int i5, int i10) {
        RecyclerView recyclerView = this.f2568a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2324b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(bVar.h(null, 1, i5, i10));
        bVar.f2328f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeMoved(int i5, int i10, int i11) {
        RecyclerView recyclerView = this.f2568a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2324b;
        if (i5 == i10) {
            return;
        }
        arrayList.add(bVar.h(null, 8, i5, i10));
        bVar.f2328f |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onItemRangeRemoved(int i5, int i10) {
        RecyclerView recyclerView = this.f2568a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2324b;
        if (i10 < 1) {
            return;
        }
        arrayList.add(bVar.h(null, 2, i5, i10));
        bVar.f2328f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.z0
    public final void onStateRestorationPolicyChanged() {
        x0 x0Var;
        RecyclerView recyclerView = this.f2568a;
        if (recyclerView.mPendingSavedState == null || (x0Var = recyclerView.mAdapter) == null || !x0Var.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
