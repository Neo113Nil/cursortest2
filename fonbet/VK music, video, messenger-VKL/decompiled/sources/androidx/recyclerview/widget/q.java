package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import xsna.pdp0;

/* compiled from: GapWorker.java */
/* loaded from: classes12.dex */
public final class q implements Runnable {
    public static final ThreadLocal<q> f = new ThreadLocal<>();
    public static final a g = new a();
    public long c;
    public long d;
    public final ArrayList<RecyclerView> b = new ArrayList<>();
    public final ArrayList<c> e = new ArrayList<>();

    /* compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i = cVar4.b - cVar3.b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.c - cVar4.c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.g()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
            }
            int i = this.d;
            if (i > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.q();
            }
        }
    }

    /* compiled from: GapWorker.java */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.e0 d(RecyclerView recyclerView, int i, long j) {
        int h = recyclerView.mChildHelper.h();
        for (int i2 = 0; i2 < h; i2++) {
            RecyclerView.e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.e0 o = vVar.o(i, j);
            if (o != null) {
                if (!o.isBound() || o.isInvalid()) {
                    vVar.a(o, false);
                } else {
                    vVar.k(o.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return o;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView) {
        boolean z = RecyclerView.sDebugAssertionsEnabled;
        ArrayList<RecyclerView> arrayList = this.b;
        if (z && arrayList.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        arrayList.add(recyclerView);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.c == 0) {
                this.c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a = i;
        bVar.b = i2;
    }

    public final void c(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList<c> arrayList2 = this.e;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar2.a = i6 <= abs;
                    cVar2.b = abs;
                    cVar2.c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, g);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i7)).d) != null; i7++) {
            RecyclerView.e0 d = d(recyclerView, cVar.e, cVar.a ? Long.MAX_VALUE : j);
            if (d != null && d.mNestedRecyclerView != null && d.isBound() && !d.isInvalid() && (recyclerView2 = d.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = pdp0.a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.a0 a0Var = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        a0Var.d = 1;
                        a0Var.e = adapter.getItemCount();
                        a0Var.g = false;
                        a0Var.h = false;
                        a0Var.i = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            d(recyclerView2, bVar2.c[i9], j);
                        }
                        Trace.endSection();
                        cVar.a = false;
                        cVar.b = 0;
                        cVar.c = 0;
                        cVar.d = null;
                        cVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = pdp0.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    public final void e(RecyclerView recyclerView) {
        boolean remove = this.b.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.b;
        try {
            int i = pdp0.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    c(TimeUnit.MILLISECONDS.toNanos(j) + this.d);
                }
            }
            this.c = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.c = 0L;
            int i3 = pdp0.a;
            Trace.endSection();
            throw th;
        }
    }
}
