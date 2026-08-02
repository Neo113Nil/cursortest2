package com.vk.video.ui.discovery.minimizable;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.video.ui.discovery.minimizable.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.d3j0;
import xsna.df90;
import xsna.e43;
import xsna.gsi0;
import xsna.gxp;
import xsna.gzs;
import xsna.hfz;
import xsna.ipq0;
import xsna.j5g;
import xsna.kfs0;
import xsna.kld0;
import xsna.pfs0;
import xsna.rus0;
import xsna.s3q0;
import xsna.sus0;
import xsna.whp;
import xsna.znj0;

/* compiled from: VideoMinimizableDiscoveryVideoRelatedItemsBinder.kt */
/* loaded from: classes7.dex */
public final class r implements c.n, c.i {
    public final boolean b;
    public final rus0 c;
    public final d3j0 d;
    public final ipq0 e;
    public final sus0 f;
    public final kld0 g;
    public gzs<s3q0> h;
    public gzs<s3q0> i;
    public final Object j;
    public Object k;
    public gzs<s3q0> l;
    public gzs<s3q0> m;
    public boolean n;
    public s.e o;

    public r(boolean z, boolean z2, rus0 rus0Var, d3j0 d3j0Var, ipq0 ipq0Var, sus0 sus0Var, kld0 kld0Var) {
        this.b = z2;
        this.c = rus0Var;
        this.d = d3j0Var;
        this.e = ipq0Var;
        this.f = sus0Var;
        this.g = kld0Var;
        EmptyList emptyList = EmptyList.b;
        this.j = emptyList;
        this.k = emptyList;
        this.n = z;
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.Fe();
        }
        znj0 d = d();
        if (d != null) {
            d.Fe();
        }
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        kfs0 kfs0Var = c() ? ((VideoMinimizableDiscoveryFragment) this.g.c).H0 : ((VideoMinimizableDiscoveryFragment) this.e.c).G0;
        List<hfz> list = kfs0Var != null ? kfs0Var.h.f : null;
        return list == null || list.isEmpty();
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.K9();
        }
        znj0 d = d();
        if (d != null) {
            d.K9();
        }
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        if (df90Var != null) {
            RecyclerPaginatedView b = b();
            if (b != null) {
                b.M9(df90Var);
            }
            znj0 d = d();
            if (d != null) {
                d.M9(df90Var);
            }
            this.k = j5g.s0((Iterable) this.k, df90Var);
        }
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.Mk();
        }
        znj0 d = d();
        if (d != null) {
            d.Mk();
        }
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        if (df90Var != null) {
            RecyclerPaginatedView b = b();
            if (b != null) {
                b.Om(df90Var);
            }
            znj0 d = d();
            if (d != null) {
                d.Om(df90Var);
            }
            this.k = j5g.v0(df90Var, (Collection) this.k);
        }
    }

    public final void a() {
        s.e eVar = this.o;
        if (eVar == null) {
            EmptyList emptyList = EmptyList.b;
            eVar = new s.e(emptyList, emptyList, emptyList);
        }
        List<hfz> list = eVar.a;
        List<hfz> list2 = eVar.b;
        List<hfz> list3 = eVar.c;
        if (gsi0.b().c) {
            list2 = list3;
        }
        boolean c = c();
        kld0 kld0Var = this.g;
        ipq0 ipq0Var = this.e;
        if (c) {
            List<hfz> list4 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list4) {
                if (obj instanceof AboutVideoItem.a0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list4) {
                if (!(((hfz) obj2) instanceof AboutVideoItem.a0)) {
                    arrayList2.add(obj2);
                }
            }
            kfs0 kfs0Var = ((VideoMinimizableDiscoveryFragment) ipq0Var.c).G0;
            if (kfs0Var != null) {
                kfs0Var.setItems(arrayList2);
            }
            kfs0 kfs0Var2 = ((VideoMinimizableDiscoveryFragment) kld0Var.c).H0;
            if (kfs0Var2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    hfz hfzVar = (hfz) obj3;
                    if (!(hfzVar instanceof AboutVideoItem.k) && !(hfzVar instanceof pfs0)) {
                        arrayList3.add(obj3);
                    }
                }
                kfs0Var2.setItems(j5g.u0(arrayList3, arrayList));
            }
            RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.c.invoke();
            if (recyclerPaginatedView != null) {
                recyclerPaginatedView.f0();
            }
        } else {
            kfs0 kfs0Var3 = ((VideoMinimizableDiscoveryFragment) ipq0Var.c).G0;
            if (kfs0Var3 != null) {
                List[] listArr = {list, list2};
                ListBuilder e = e43.e();
                for (int i = 0; i < 2; i++) {
                    List list5 = listArr[i];
                    if (e.isEmpty() && i > 0) {
                        break;
                    }
                    e.addAll(list5);
                }
                kfs0Var3.setItems(e.g());
            }
            kfs0 kfs0Var4 = ((VideoMinimizableDiscoveryFragment) kld0Var.c).H0;
            if (kfs0Var4 != null) {
                kfs0Var4.setItems(EmptyList.b);
            }
        }
        znj0 d = d();
        if (d != null) {
            d.e(eVar);
        }
    }

    public final RecyclerPaginatedView b() {
        return c() ? (RecyclerPaginatedView) this.d.invoke() : (RecyclerPaginatedView) this.c.invoke();
    }

    public final boolean c() {
        return this.b && this.n;
    }

    public final znj0 d() {
        return this.f.c.B0;
    }

    public final RecyclerPaginatedView e() {
        return c() ? (RecyclerPaginatedView) this.c.invoke() : (RecyclerPaginatedView) this.d.invoke();
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
        f0();
    }

    @Override // com.vk.lists.c.n
    public final void f0() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.f0();
        }
        znj0 d = d();
        if (d != null) {
            d.f0();
        }
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.fj(th, gxpVar);
        }
        znj0 d = d();
        if (d != null) {
            d.fj(th, gxpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.gl();
        }
        znj0 d = d();
        if (d != null) {
            d.gl();
        }
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.lb();
        }
        znj0 d = d();
        if (d != null) {
            d.lb();
        }
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.qg(whpVar);
        }
        znj0 d = d();
        if (d != null) {
            d.qg(whpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setDataObserver(gzsVar);
        }
        znj0 d = d();
        if (d != null) {
            d.setDataObserver(gzsVar);
        }
        this.m = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnLoadNextRetryClickListener(gzsVar);
        }
        znj0 d = d();
        if (d != null) {
            d.setOnLoadNextRetryClickListener(gzsVar);
        }
        this.i = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnRefreshListener(gzsVar);
        }
        znj0 d = d();
        if (d != null) {
            d.setOnRefreshListener(gzsVar);
        }
        this.l = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnReloadRetryClickListener(gzsVar);
        }
        znj0 d = d();
        if (d != null) {
            d.setOnReloadRetryClickListener(gzsVar);
        }
        this.h = gzsVar;
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
    }
}
