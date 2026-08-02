package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.u0;

/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes12.dex */
public final class a0 {

    @NonNull
    public final u0.b a;

    @NonNull
    public final p0.d b;
    public final RecyclerView.Adapter<RecyclerView.e0> c;
    public final b d;
    public int e;

    /* compiled from: NestedAdapterWrapper.java */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            a0 a0Var = a0.this;
            a0Var.e = a0Var.c.getItemCount();
            f fVar = (f) a0Var.d;
            fVar.a.notifyDataSetChanged();
            fVar.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            a0 a0Var = a0.this;
            f fVar = (f) a0Var.d;
            fVar.a.notifyItemRangeChanged(i + fVar.b(a0Var), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, @Nullable Object obj) {
            a0 a0Var = a0.this;
            f fVar = (f) a0Var.d;
            fVar.a.notifyItemRangeChanged(i + fVar.b(a0Var), i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            a0 a0Var = a0.this;
            a0Var.e += i2;
            f fVar = (f) a0Var.d;
            fVar.a.notifyItemRangeInserted(i + fVar.b(a0Var), i2);
            if (a0Var.e <= 0 || a0Var.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((f) a0Var.d).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            a0 a0Var = a0.this;
            f fVar = (f) a0Var.d;
            int b = fVar.b(a0Var);
            fVar.a.notifyItemMoved(i + b, i2 + b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            a0 a0Var = a0.this;
            a0Var.e -= i2;
            f fVar = (f) a0Var.d;
            fVar.a.notifyItemRangeRemoved(i + fVar.b(a0Var), i2);
            if (a0Var.e >= 1 || a0Var.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            ((f) a0Var.d).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void h() {
            ((f) a0.this.d).a();
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    public interface b {
    }

    public a0(RecyclerView.Adapter<RecyclerView.e0> adapter, b bVar, u0 u0Var, p0.d dVar) {
        a aVar = new a();
        this.c = adapter;
        this.d = bVar;
        this.a = u0Var.b(this);
        this.b = dVar;
        this.e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(aVar);
    }
}
