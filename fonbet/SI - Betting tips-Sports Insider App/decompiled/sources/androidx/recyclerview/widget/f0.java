package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2384e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final s f2385f = new s(1);

    /* renamed from: b, reason: collision with root package name */
    public long f2387b;

    /* renamed from: c, reason: collision with root package name */
    public long f2388c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2386a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2389d = new ArrayList();

    public static d2 c(RecyclerView recyclerView, int i5, long j) {
        int h10 = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i5 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        s1 s1Var = recyclerView.mRecycler;
        if (j == LongCompanionObject.MAX_VALUE) {
            try {
                if (l0.k.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        d2 m6 = s1Var.m(i5, j);
        if (m6 != null) {
            if (!m6.isBound() || m6.isInvalid()) {
                s1Var.a(m6, false);
            } else {
                s1Var.j(m6.itemView);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return m6;
    }

    public final void a(RecyclerView recyclerView, int i5, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f2386a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2387b == 0) {
                this.f2387b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        d0 d0Var = recyclerView.mPrefetchRegistry;
        d0Var.f2365a = i5;
        d0Var.f2366b = i10;
    }

    public final void b(long j) {
        e0 e0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        e0 e0Var2;
        ArrayList arrayList = this.f2386a;
        int size = arrayList.size();
        int i5 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i10 += recyclerView3.mPrefetchRegistry.f2368d;
            }
        }
        ArrayList arrayList2 = this.f2389d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                d0 d0Var = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(d0Var.f2366b) + Math.abs(d0Var.f2365a);
                for (int i14 = i5; i14 < d0Var.f2368d * 2; i14 += 2) {
                    if (i13 >= arrayList2.size()) {
                        e0Var2 = new e0();
                        arrayList2.add(e0Var2);
                    } else {
                        e0Var2 = (e0) arrayList2.get(i13);
                    }
                    int[] iArr = d0Var.f2367c;
                    int i15 = iArr[i14 + 1];
                    e0Var2.f2370a = i15 <= abs;
                    e0Var2.f2371b = abs;
                    e0Var2.f2372c = i15;
                    e0Var2.f2373d = recyclerView4;
                    e0Var2.f2374e = iArr[i14];
                    i13++;
                }
            }
            i12++;
            i5 = 0;
        }
        Collections.sort(arrayList2, f2385f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (e0Var = (e0) arrayList2.get(i16)).f2373d) != null; i16++) {
            d2 c2 = c(recyclerView, e0Var.f2374e, e0Var.f2370a ? Long.MAX_VALUE : j);
            if (c2 != null && c2.mNestedRecyclerView != null && c2.isBound() && !c2.isInvalid() && (recyclerView2 = c2.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                d0 d0Var2 = recyclerView2.mPrefetchRegistry;
                d0Var2.b(recyclerView2, true);
                if (d0Var2.f2368d != 0) {
                    try {
                        Trace.beginSection(j == LongCompanionObject.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        z1 z1Var = recyclerView2.mState;
                        x0 x0Var = recyclerView2.mAdapter;
                        z1Var.f2598d = 1;
                        z1Var.f2599e = x0Var.getItemCount();
                        z1Var.f2601g = false;
                        z1Var.f2602h = false;
                        z1Var.f2603i = false;
                        for (int i17 = 0; i17 < d0Var2.f2368d * 2; i17 += 2) {
                            c(recyclerView2, d0Var2.f2367c[i17], j);
                        }
                        Trace.endSection();
                        e0Var.f2370a = false;
                        e0Var.f2371b = 0;
                        e0Var.f2372c = 0;
                        e0Var.f2373d = null;
                        e0Var.f2374e = 0;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            e0Var.f2370a = false;
            e0Var.f2371b = 0;
            e0Var.f2372c = 0;
            e0Var.f2373d = null;
            e0Var.f2374e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2386a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f2388c);
                }
            }
        } finally {
            this.f2387b = 0L;
            Trace.endSection();
        }
    }
}
