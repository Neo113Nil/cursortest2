package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class y6 extends l implements ysk {
    public boolean a;
    public final pk0 b;
    public final z88 c;
    public final /* synthetic */ ejg d;
    public final LayoutInflater e;

    public y6(Context context, j25 j25Var) {
        context.getClass();
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a;
        hs4 hs4Var2 = z45.a;
        r69Var.getClass();
        hs4Var2.getClass();
        pk0 pk0Var = new pk0(j25Var, new sz8(this, 5), r69Var, hs4Var2);
        this.b = pk0Var;
        super.setStateRestorationPolicy(wqf.c);
        registerAdapterDataObserver(new vp8(this, 2));
        o(new mzc(this));
        this.c = pk0Var.j;
        this.d = new ejg(context);
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.e = from;
    }

    @Override // defpackage.ysk
    public final int d() {
        return 0;
    }

    @Override // defpackage.ysk
    public final Object g(int i) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = p(i);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            return null;
        }
        return u2gVar;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        pk0 pk0Var = this.b;
        f5e f5eVar = (f5e) pk0Var.g.get();
        return f5eVar != null ? f5eVar.f() : pk0Var.h.d.f();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = p(i);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        return q(u2gVar);
    }

    @Override // defpackage.ysk
    public final int l() {
        return 0;
    }

    public final void o(Function1 function1) {
        pk0 pk0Var = this.b;
        pk0Var.getClass();
        AtomicReference atomicReference = pk0Var.k;
        if (atomicReference.get() == null) {
            u2 u2Var = pk0Var.m;
            u2Var.getClass();
            atomicReference.set(u2Var);
            lk0 lk0Var = pk0Var.h;
            lk0Var.getClass();
            hcc hccVar = lk0Var.e;
            hccVar.getClass();
            ((CopyOnWriteArrayList) ((nh0) hccVar.b).b).add(u2Var);
            p33 p33Var = (p33) ((fdi) hccVar.c).getValue();
            if (p33Var != null) {
                u2Var.invoke(p33Var);
            }
        }
        pk0Var.l.add(function1);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        km5 km5Var = km5.a;
        km5Var.getClass();
        this.d.y(this, p8Var, i, km5Var);
    }

    public final Object p(int i) {
        Object value;
        Object value2;
        Object value3;
        pk0 pk0Var = this.b;
        fdi fdiVar = pk0Var.e;
        do {
            try {
                value2 = fdiVar.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = fdiVar.getValue();
                    ((Boolean) value).getClass();
                } while (!fdiVar.k(value, Boolean.FALSE));
                throw th;
            }
        } while (!fdiVar.k(value2, Boolean.TRUE));
        pk0Var.f = i;
        f5e f5eVar = (f5e) pk0Var.g.get();
        Object w = f5eVar != null ? n9e.w(f5eVar, i) : pk0Var.h.a(i);
        do {
            value3 = fdiVar.getValue();
            ((Boolean) value3).getClass();
        } while (!fdiVar.k(value3, Boolean.FALSE));
        return w;
    }

    public abstract int q(Object obj);

    public final void r(g6b g6bVar, f6e f6eVar) {
        g6bVar.getClass();
        pk0 pk0Var = this.b;
        pk0Var.getClass();
        xw3.L(wca.x(g6bVar), null, null, new ok0(pk0Var, pk0Var.i.incrementAndGet(), f6eVar, (rq3) null, 0), 3);
    }

    @Override // androidx.recyclerview.widget.l
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.l
    public final void setStateRestorationPolicy(wqf wqfVar) {
        wqfVar.getClass();
        this.a = true;
        super.setStateRestorationPolicy(wqfVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i, List list) {
        p8 p8Var = (p8) uVar;
        p8Var.getClass();
        list.getClass();
        this.d.y(this, p8Var, i, list);
    }
}
