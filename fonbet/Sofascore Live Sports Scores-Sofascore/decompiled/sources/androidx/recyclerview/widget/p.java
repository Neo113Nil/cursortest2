package androidx.recyclerview.widget;

import defpackage.bsk;
import defpackage.yqf;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p extends yqf {
    public final /* synthetic */ RecyclerView a;

    public p(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.yqf
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.yqf
    public final void c(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.h(4, i, i2, obj));
        aVar.f |= 4;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.yqf
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.h(1, i, i2, null));
        aVar.f |= 1;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.yqf
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i == i2) {
            return;
        }
        arrayList.add(aVar.h(8, i, i2, null));
        aVar.f |= 8;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.yqf
    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.assertNotInLayoutOrScroll(null);
        a aVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = aVar.b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(aVar.h(2, i, i2, null));
        aVar.f |= 2;
        if (arrayList.size() == 1) {
            h();
        }
    }

    @Override // defpackage.yqf
    public final void g() {
        l lVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView.mPendingSavedState == null || (lVar = recyclerView.mAdapter) == null || !lVar.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }

    public final void h() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = bsk.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
