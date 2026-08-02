package androidx.recyclerview.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s0;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.euo;
import xsna.j0d0;
import xsna.l100;
import xsna.m0d0;
import xsna.s3q0;
import xsna.xqm0;

/* compiled from: PrefetchingViewPoolProvider.kt */
/* loaded from: classes12.dex */
public final class j0 implements s0 {
    public final h0 a;
    public final m0d0 b;
    public final k0 c;
    public final LayoutInflater d;
    public final Context e;
    public final l100 f;
    public final a g;
    public final Object h;
    public volatile RecyclerView i;
    public volatile int j;

    /* compiled from: PrefetchingViewPoolProvider.kt */
    public final class a implements m0d0.a {
        public a() {
        }

        @Override // xsna.m0d0.a
        public final boolean a(j0d0 j0d0Var) {
            return d(j0d0Var.c, j0d0Var.e);
        }

        @Override // xsna.m0d0.a
        public final RecyclerView.e0 b(int i) {
            j0 j0Var = j0.this;
            return j0Var.a().getAdapter().createViewHolder(j0Var.a(), i);
        }

        @Override // xsna.m0d0.a
        public final boolean c(int i, long j, long j2) {
            return j0.this.c.willCreateInTime(i, j, j2);
        }

        @Override // xsna.m0d0.a
        public final boolean d(int i, int i2) {
            if (i2 == j0.this.j) {
                Integer num = j0.this.a.e.get(Integer.valueOf(i));
                if ((num != null ? num.intValue() : 0) - j0.this.c.getRecycledViewCount(i) > 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.m0d0.a
        public final void e(j0d0 j0d0Var, String str) {
            j0 j0Var = j0.this;
            j0Var.f.a(j0Var.a.a + ", vh_" + j0d0Var.c + ' ' + str);
        }

        @Override // xsna.m0d0.a
        public final boolean f(j0d0 j0d0Var) {
            return j0d0Var.e == j0.this.j;
        }

        @Override // xsna.m0d0.a
        public final void g(int i, long j) {
            j0.this.c.factorInCreateTime(i, j);
        }

        @Override // xsna.m0d0.a
        public final void h(j0d0 j0d0Var, Throwable th) {
            StringBuilder sb = new StringBuilder("\n                adapter=");
            j0 j0Var = j0.this;
            h0 h0Var = j0Var.a;
            sb.append(h0Var.a);
            sb.append(",\n                viewType=");
            sb.append(j0d0Var.c);
            sb.append(",\n                mode=");
            sb.append(h0Var.g);
            sb.append("\n            ");
            j0Var.f.c(new ViewPoolException(xqm0.g(sb.toString()), th));
        }

        @Override // xsna.m0d0.a
        public final void i(RecyclerView.e0 e0Var) {
            j0.this.c.putRecycledView(e0Var);
        }
    }

    public j0(h0 h0Var) {
        m0d0 m0d0Var = h0Var.g.a;
        this.a = h0Var;
        this.b = m0d0Var;
        l100 l100Var = h0Var.d;
        this.c = new k0(l100Var, h0Var.e, null);
        Context context = h0Var.c;
        this.d = LayoutInflater.from(context);
        this.e = context;
        this.f = l100Var;
        this.g = new a();
        this.h = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    public final RecyclerView a() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = this.i;
        ref$ObjectRef.element = r1;
        if (r1 != 0) {
            return r1;
        }
        synchronized (this.h) {
            try {
                ?? r2 = this.i;
                ref$ObjectRef.element = r2;
                if (r2 == 0) {
                    ?? recyclerView = new RecyclerView(this.e);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    recyclerView.setAdapter(this.a.b.invoke(recyclerView.getContext()));
                    ref$ObjectRef.element = recyclerView;
                    this.i = recyclerView;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (RecyclerView) ref$ObjectRef.element;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void j() {
        m0d0 m0d0Var = this.b;
        if (m0d0Var.d) {
            m0d0Var.d = false;
            m0d0Var.b.clear();
            m0d0Var.a.b(m0d0Var.c);
            m0d0Var.c();
        }
        this.j++;
        this.i = null;
        k();
        m();
    }

    @Override // androidx.recyclerview.widget.s0
    public final void k() {
        this.c.clear();
    }

    @Override // androidx.recyclerview.widget.s0
    public final s3q0 l(Activity activity) {
        return s0.a.a(this, activity);
    }

    @Override // androidx.recyclerview.widget.s0
    public final void m() {
        if (this.b.d) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : this.a.e.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue() - this.c.getRecycledViewCount(intValue);
            for (int i = 0; i < intValue2; i++) {
                m0d0 m0d0Var = this.b;
                j0d0 j0d0Var = new j0d0(this.g, intValue, this.a.f, this.j);
                PriorityBlockingQueue<j0d0> priorityBlockingQueue = m0d0Var.b;
                boolean isEmpty = priorityBlockingQueue.isEmpty();
                priorityBlockingQueue.offer(j0d0Var);
                if (isEmpty && m0d0Var.d) {
                    m0d0Var.a.a(0L, m0d0Var.c);
                }
            }
        }
        m0d0 m0d0Var2 = this.b;
        if (m0d0Var2.d) {
            return;
        }
        m0d0Var2.d = true;
        m0d0Var2.a.a(0L, m0d0Var2.c);
        m0d0Var2.b();
    }

    @Override // androidx.recyclerview.widget.s0
    public final RecyclerView.e0 n(int i) {
        Object obj = this.b;
        if (obj instanceof euo) {
            return ((euo) obj).a(i, this.j, this.g);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.s0
    public final k0 o() {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.s0
    public final LayoutInflater p() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void q(int i) {
        m0d0 m0d0Var = this.b;
        if (m0d0Var.d) {
            m0d0Var.d = false;
            m0d0Var.b.clear();
            m0d0Var.a.b(m0d0Var.c);
            m0d0Var.c();
        }
        this.j++;
        this.i = null;
        k();
        p().getContext().setTheme(i);
        m0d0 m0d0Var2 = this.b;
        if (m0d0Var2.d) {
            return;
        }
        m0d0Var2.d = true;
        m0d0Var2.a.a(0L, m0d0Var2.c);
        m0d0Var2.b();
    }

    @Override // androidx.recyclerview.widget.s0
    public final void r() {
        m0d0 m0d0Var = this.b;
        if (m0d0Var.d) {
            m0d0Var.d = false;
            m0d0Var.b.clear();
            m0d0Var.a.b(m0d0Var.c);
            m0d0Var.c();
        }
    }
}
