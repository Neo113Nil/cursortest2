package com.vk.video.ui.discovery.minimizable;

import com.vk.lists.c;
import com.vk.video.ui.discovery.minimizable.s;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.df90;
import xsna.gxp;
import xsna.gzs;
import xsna.j5g;
import xsna.s3q0;
import xsna.whp;
import xsna.y3l0;
import xsna.znj0;

/* compiled from: SimilarSliderVideoRelatedItemsBinder.kt */
/* loaded from: classes7.dex */
public final class a implements c.n, c.i {
    public final y3l0 b;
    public gzs<s3q0> c;
    public gzs<s3q0> d;
    public final Object e;
    public Object f;
    public gzs<s3q0> g;
    public gzs<s3q0> h;
    public s.e i;

    public a(y3l0 y3l0Var) {
        this.b = y3l0Var;
        EmptyList emptyList = EmptyList.b;
        this.e = emptyList;
        this.f = emptyList;
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        znj0 a = a();
        if (a != null) {
            a.Fe();
        }
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        znj0 a = a();
        if (a != null) {
            return a.I();
        }
        return true;
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
        znj0 a = a();
        if (a != null) {
            a.K9();
        }
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        if (df90Var != null) {
            znj0 a = a();
            if (a != null) {
                a.M9(df90Var);
            }
            this.f = j5g.s0((Iterable) this.f, df90Var);
        }
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
        znj0 a = a();
        if (a != null) {
            a.Mk();
        }
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        if (df90Var != null) {
            znj0 a = a();
            if (a != null) {
                a.Om(df90Var);
            }
            this.f = j5g.v0(df90Var, (Collection) this.f);
        }
    }

    public final znj0 a() {
        return ((VideoMinimizableDiscoveryFragment) this.b.c).B0;
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
        znj0 a = a();
        if (a != null) {
            a.clear();
        }
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
        f0();
    }

    @Override // com.vk.lists.c.n
    public final void f0() {
        znj0 a = a();
        if (a != null) {
            a.f0();
        }
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        znj0 a = a();
        if (a != null) {
            a.fj(th, gxpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
        znj0 a = a();
        if (a != null) {
            a.gl();
        }
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        znj0 a = a();
        if (a != null) {
            a.lb();
        }
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
        znj0 a = a();
        if (a != null) {
            a.qg(whpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
        znj0 a = a();
        if (a != null) {
            a.setDataObserver(gzsVar);
        }
        this.h = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        znj0 a = a();
        if (a != null) {
            a.setOnLoadNextRetryClickListener(gzsVar);
        }
        this.d = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
        znj0 a = a();
        if (a != null) {
            a.setOnRefreshListener(gzsVar);
        }
        this.g = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        znj0 a = a();
        if (a != null) {
            a.setOnReloadRetryClickListener(gzsVar);
        }
        this.c = gzsVar;
    }
}
