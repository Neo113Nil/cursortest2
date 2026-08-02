package androidx.recyclerview.widget;

import android.os.Trace;
import defpackage.a70;
import defpackage.asj;
import defpackage.fv8;
import defpackage.qrf;
import defpackage.se7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final se7 f = new se7(13);
    public long b;
    public long c;
    public final ArrayList a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static u c(RecyclerView recyclerView, int i, long j) {
        int h = recyclerView.mChildHelper.h();
        for (int i2 = 0; i2 < h; i2++) {
            u childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        o oVar = recyclerView.mRecycler;
        if (j == Long.MAX_VALUE) {
            try {
                if (asj.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        u m = oVar.m(i, j);
        if (m != null) {
            if (!m.isBound() || m.isInvalid()) {
                oVar.a(m, false);
            } else {
                oVar.j(m.itemView);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return m;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.a.contains(recyclerView)) {
                a70.r("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        e eVar = recyclerView.mPrefetchRegistry;
        eVar.a = i;
        eVar.b = i2;
    }

    public final void b(long j) {
        fv8 fv8Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        fv8 fv8Var2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                e eVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(eVar.b) + Math.abs(eVar.a);
                int i5 = z ? 1 : 0;
                while (i5 < eVar.d * 2) {
                    if (i4 >= arrayList2.size()) {
                        fv8Var2 = new fv8();
                        arrayList2.add(fv8Var2);
                    } else {
                        fv8Var2 = (fv8) arrayList2.get(i4);
                    }
                    int[] iArr = eVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    }
                    fv8Var2.a = z;
                    fv8Var2.b = abs;
                    fv8Var2.c = i6;
                    fv8Var2.d = recyclerView4;
                    fv8Var2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (fv8Var = (fv8) arrayList2.get(i7)).d) != null; i7++) {
            u c = c(recyclerView, fv8Var.e, fv8Var.a ? Long.MAX_VALUE : j);
            if (c != null && c.mNestedRecyclerView != null && c.isBound() && !c.isInvalid() && (recyclerView2 = c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                e eVar2 = recyclerView2.mPrefetchRegistry;
                eVar2.b(recyclerView2, true);
                if (eVar2.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        qrf qrfVar = recyclerView2.mState;
                        l lVar = recyclerView2.mAdapter;
                        qrfVar.d = 1;
                        qrfVar.e = lVar.getItemCount();
                        qrfVar.g = false;
                        qrfVar.h = false;
                        qrfVar.i = false;
                        for (int i8 = 0; i8 < eVar2.d * 2; i8 += 2) {
                            c(recyclerView2, eVar2.c[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            fv8Var.a = false;
            fv8Var.b = 0;
            fv8Var.c = 0;
            fv8Var.d = null;
            fv8Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
