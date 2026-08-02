package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f23123e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static Comparator f23124f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f23126b;

    /* renamed from: c, reason: collision with root package name */
    public long f23127c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f23125a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23128d = new ArrayList();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f23135d;
            if ((recyclerView == null) != (cVar2.f23135d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f23132a;
            if (z10 != cVar2.f23132a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f23133b - cVar.f23133b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f23134c - cVar2.f23134c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.q.c {

        /* renamed from: a, reason: collision with root package name */
        public int f23129a;

        /* renamed from: b, reason: collision with root package name */
        public int f23130b;

        /* renamed from: c, reason: collision with root package name */
        public int f23131c;
        int[] mPrefetchArray;

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f23131c;
            int i13 = i12 * 2;
            int[] iArr = this.mPrefetchArray;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.mPrefetchArray = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.mPrefetchArray = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.mPrefetchArray;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f23131c++;
        }

        public void b() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f23131c = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f23131c = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f22796n;
            if (recyclerView.f22795m == null || qVar == null || !qVar.F0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f22780e.p()) {
                    qVar.F(recyclerView.f22795m.getItemCount(), this);
                }
            } else if (!recyclerView.x0()) {
                qVar.E(this.f23129a, this.f23130b, recyclerView.f22754Q4, this);
            }
            int i10 = this.f23131c;
            if (i10 > qVar.f22887m) {
                qVar.f22887m = i10;
                qVar.f22888n = z10;
                recyclerView.f22776c.P();
            }
        }

        public boolean d(int i10) {
            if (this.mPrefetchArray != null) {
                int i11 = this.f23131c * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.mPrefetchArray[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f23129a = i10;
            this.f23130b = i11;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23132a;

        /* renamed from: b, reason: collision with root package name */
        public int f23133b;

        /* renamed from: c, reason: collision with root package name */
        public int f23134c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f23135d;

        /* renamed from: e, reason: collision with root package name */
        public int f23136e;

        public void a() {
            this.f23132a = false;
            this.f23133b = 0;
            this.f23134c = 0;
            this.f23135d = null;
            this.f23136e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f22782f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.F p02 = RecyclerView.p0(recyclerView.f22782f.i(i11));
            if (p02.mPosition == i10 && !p02.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f22731j5 && this.f23125a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f23125a.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f23125a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f23125a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f22753P4.c(recyclerView, false);
                i10 += recyclerView.f22753P4.f23131c;
            }
        }
        this.f23128d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f23125a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f22753P4;
                int abs = Math.abs(bVar.f23129a) + Math.abs(bVar.f23130b);
                for (int i14 = 0; i14 < bVar.f23131c * 2; i14 += 2) {
                    if (i12 >= this.f23128d.size()) {
                        cVar = new c();
                        this.f23128d.add(cVar);
                    } else {
                        cVar = (c) this.f23128d.get(i12);
                    }
                    int[] iArr = bVar.mPrefetchArray;
                    int i15 = iArr[i14 + 1];
                    cVar.f23132a = i15 <= abs;
                    cVar.f23133b = abs;
                    cVar.f23134c = i15;
                    cVar.f23135d = recyclerView2;
                    cVar.f23136e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f23128d, f23124f);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.F i10 = i(cVar.f23135d, cVar.f23136e, cVar.f23132a ? LongCompanionObject.MAX_VALUE : j10);
        if (i10 == null || i10.mNestedRecyclerView == null || !i10.isBound() || i10.isInvalid()) {
            return;
        }
        h(i10.mNestedRecyclerView.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f23128d.size(); i10++) {
            c cVar = (c) this.f23128d.get(i10);
            if (cVar.f23135d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f22731j5 && !this.f23125a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f23126b == 0) {
                this.f23126b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f22753P4.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f22743E && recyclerView.f22782f.j() != 0) {
            recyclerView.i1();
        }
        b bVar = recyclerView.f22753P4;
        bVar.c(recyclerView, true);
        if (bVar.f23131c != 0) {
            try {
                Trace.beginSection(j10 == LongCompanionObject.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f22754Q4.f(recyclerView.f22795m);
                for (int i10 = 0; i10 < bVar.f23131c * 2; i10 += 2) {
                    i(recyclerView, bVar.mPrefetchArray[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final RecyclerView.F i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f22776c;
        if (j10 == LongCompanionObject.MAX_VALUE) {
            try {
                if (u0.o.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.U0(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.S0();
        RecyclerView.F N10 = xVar.N(i10, false, j10);
        if (N10 != null) {
            if (!N10.isBound() || N10.isInvalid()) {
                xVar.a(N10, false);
            } else {
                xVar.G(N10.itemView);
            }
        }
        recyclerView.U0(false);
        Trace.endSection();
        return N10;
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f23125a.remove(recyclerView);
        if (RecyclerView.f22731j5 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f23125a.isEmpty()) {
                int size = this.f23125a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f23125a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f23127c);
                }
            }
        } finally {
            this.f23126b = 0L;
            Trace.endSection();
        }
    }
}
