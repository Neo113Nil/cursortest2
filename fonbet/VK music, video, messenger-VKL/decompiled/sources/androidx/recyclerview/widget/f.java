package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.u0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import xsna.lhg;

/* compiled from: ConcatAdapterController.java */
/* loaded from: classes12.dex */
public final class f implements a0.b {
    public final ConcatAdapter a;
    public final u0 b;
    public final ArrayList c = new ArrayList();
    public final IdentityHashMap<RecyclerView.e0, a0> d = new IdentityHashMap<>();
    public final ArrayList e = new ArrayList();
    public a f = new a();

    @NonNull
    public final ConcatAdapter.Config.StableIdMode g;
    public final p0 h;

    /* compiled from: ConcatAdapterController.java */
    public static class a {
        public a0 a;
        public int b;
        public boolean c;
    }

    public f(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.a = concatAdapter;
        u0.a aVar = new u0.a();
        aVar.a = new SparseArray<>();
        aVar.b = 0;
        this.b = aVar;
        ConcatAdapter.Config.StableIdMode stableIdMode = config.a;
        this.g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.h = new p0.b();
            return;
        }
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            p0.a aVar2 = new p0.a();
            aVar2.a = 0L;
            this.h = aVar2;
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.h = new p0.c();
        }
    }

    public final void a() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            a0 a0Var = (a0) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = a0Var.c.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && a0Var.e == 0)) {
                break;
            }
        }
        ConcatAdapter concatAdapter = this.a;
        if (stateRestorationPolicy != concatAdapter.getStateRestorationPolicy()) {
            concatAdapter.x0(stateRestorationPolicy);
        }
    }

    public final int b(a0 a0Var) {
        a0 a0Var2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (a0Var2 = (a0) it.next()) != a0Var) {
            i += a0Var2.e;
        }
        return i;
    }

    @NonNull
    public final a c(int i) {
        a aVar = this.f;
        if (aVar.c) {
            aVar = new a();
        } else {
            aVar.c = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a0 a0Var = (a0) it.next();
            int i3 = a0Var.e;
            if (i3 > i2) {
                aVar.a = a0Var;
                aVar.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (aVar.a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(lhg.a(i, "Cannot find wrapper for "));
    }

    @NonNull
    public final a0 d(RecyclerView.e0 e0Var) {
        a0 a0Var = this.d.get(e0Var);
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
