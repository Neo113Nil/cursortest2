package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.bot_actions.bot_snackbar_action.WrapContentRecyclerView;

/* compiled from: FinishAnimationItemDecorator.kt */
/* loaded from: classes12.dex */
public final class p extends RecyclerView.l {
    public final RecyclerView.l g;
    public final WrapContentRecyclerView.b h;

    public p(RecyclerView.l lVar, WrapContentRecyclerView.b bVar) {
        this.g = lVar;
        this.h = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return this.g.a(e0Var, cVar, cVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return this.g.b(e0Var, e0Var2, cVar, cVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean c(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return this.g.c(e0Var, cVar, cVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        return this.g.d(e0Var, cVar, cVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j(RecyclerView.e0 e0Var) {
        this.g.j(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void k() {
        this.g.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final long l() {
        return this.g.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final long m() {
        return this.g.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean n() {
        return this.g.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        RecyclerView.l lVar = this.g;
        lVar.r();
        lVar.o(new RecyclerView.l.a() { // from class: xsna.hhr
            @Override // androidx.recyclerview.widget.RecyclerView.l.a
            public final void a() {
                androidx.recyclerview.widget.p.this.h.invoke();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void s() {
        this.g.s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void t() {
        this.g.t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void u(RecyclerView.l.b bVar) {
        this.g.u(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void v() {
        this.g.v();
    }
}
