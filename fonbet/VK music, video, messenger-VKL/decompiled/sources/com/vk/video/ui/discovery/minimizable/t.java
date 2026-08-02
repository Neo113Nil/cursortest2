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
import xsna.df90;
import xsna.e43;
import xsna.gsi0;
import xsna.gxp;
import xsna.gzs;
import xsna.hfz;
import xsna.j5g;
import xsna.kfs0;
import xsna.mwm0;
import xsna.pfs0;
import xsna.s3q0;
import xsna.vus0;
import xsna.whp;
import xsna.wus0;
import xsna.xus0;

/* compiled from: VideoMinimizableSeparateDiscoveryVideoRelatedItemsBinder.kt */
/* loaded from: classes7.dex */
public final class t implements c.n, c.i {
    public final boolean b;
    public final mwm0 c;
    public final vus0 d;
    public final wus0 e;
    public final xus0 f;
    public gzs<s3q0> g;
    public gzs<s3q0> h;
    public final Object i;
    public Object j;
    public gzs<s3q0> k;
    public gzs<s3q0> l;
    public boolean m;
    public s.e n;

    public t(boolean z, boolean z2, mwm0 mwm0Var, vus0 vus0Var, wus0 wus0Var, xus0 xus0Var) {
        this.b = z2;
        this.c = mwm0Var;
        this.d = vus0Var;
        this.e = wus0Var;
        this.f = xus0Var;
        EmptyList emptyList = EmptyList.b;
        this.i = emptyList;
        this.j = emptyList;
        this.m = z;
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.Fe();
        }
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        kfs0 kfs0Var = c() ? this.f.c.H0 : this.e.c.G0;
        List<hfz> list = kfs0Var != null ? kfs0Var.h.f : null;
        return list == null || list.isEmpty();
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.K9();
        }
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        if (df90Var != null) {
            RecyclerPaginatedView b = b();
            if (b != null) {
                b.M9(df90Var);
            }
            this.j = j5g.s0((Iterable) this.j, df90Var);
        }
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.Mk();
        }
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        if (df90Var != null) {
            RecyclerPaginatedView b = b();
            if (b != null) {
                b.Om(df90Var);
            }
            this.j = j5g.v0(df90Var, (Collection) this.j);
        }
    }

    public final void a() {
        s.e eVar = this.n;
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
        xus0 xus0Var = this.f;
        wus0 wus0Var = this.e;
        if (!c) {
            kfs0 kfs0Var = wus0Var.c.G0;
            if (kfs0Var != null) {
                List[] listArr = {list, list2};
                ListBuilder e = e43.e();
                for (int i = 0; i < 2; i++) {
                    List list4 = listArr[i];
                    if (e.isEmpty() && i > 0) {
                        break;
                    }
                    e.addAll(list4);
                }
                kfs0Var.setItems(e.g());
            }
            kfs0 kfs0Var2 = xus0Var.c.H0;
            if (kfs0Var2 != null) {
                kfs0Var2.setItems(EmptyList.b);
                return;
            }
            return;
        }
        List<hfz> list5 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (obj instanceof AboutVideoItem.a0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list5) {
            if (!(((hfz) obj2) instanceof AboutVideoItem.a0)) {
                arrayList2.add(obj2);
            }
        }
        kfs0 kfs0Var3 = wus0Var.c.G0;
        if (kfs0Var3 != null) {
            kfs0Var3.setItems(arrayList2);
        }
        kfs0 kfs0Var4 = xus0Var.c.H0;
        if (kfs0Var4 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                hfz hfzVar = (hfz) obj3;
                if (!(hfzVar instanceof AboutVideoItem.k) && !(hfzVar instanceof pfs0)) {
                    arrayList3.add(obj3);
                }
            }
            kfs0Var4.setItems(j5g.u0(arrayList3, arrayList));
        }
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) this.c.invoke();
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.f0();
        }
    }

    public final RecyclerPaginatedView b() {
        return c() ? (RecyclerPaginatedView) this.d.invoke() : (RecyclerPaginatedView) this.c.invoke();
    }

    public final boolean c() {
        return this.b && this.m;
    }

    public final RecyclerPaginatedView d() {
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
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.fj(th, gxpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.gl();
        }
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.lb();
        }
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.qg(whpVar);
        }
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setDataObserver(gzsVar);
        }
        this.l = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnLoadNextRetryClickListener(gzsVar);
        }
        this.h = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnRefreshListener(gzsVar);
        }
        this.k = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        RecyclerPaginatedView b = b();
        if (b != null) {
            b.setOnReloadRetryClickListener(gzsVar);
        }
        this.g = gzsVar;
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
    }
}
