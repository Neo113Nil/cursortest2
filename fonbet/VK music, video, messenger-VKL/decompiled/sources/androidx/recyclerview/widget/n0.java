package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class n0 extends RecyclerView.l {
    public boolean g = true;

    @SuppressLint({"UnknownNullness"})
    public final void A(RecyclerView.e0 e0Var) {
        B(e0Var);
        h(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@NonNull RecyclerView.e0 e0Var, @Nullable RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.a) == (i2 = cVar2.a) && cVar.b == cVar2.b)) ? w(e0Var) : y(e0Var, i, cVar.b, i2, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@NonNull RecyclerView.e0 e0Var, @NonNull RecyclerView.e0 e0Var2, @NonNull RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (e0Var2.shouldIgnore()) {
            int i5 = cVar.a;
            i2 = cVar.b;
            i = i5;
        } else {
            i = cVar2.a;
            i2 = cVar2.b;
        }
        return x(e0Var, e0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@NonNull RecyclerView.e0 e0Var, @NonNull RecyclerView.l.c cVar, @Nullable RecyclerView.l.c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = e0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (e0Var.isRemoved() || (i == left && i2 == top)) {
            return z(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(e0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@NonNull RecyclerView.e0 e0Var, @NonNull RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i = cVar.a;
        int i2 = cVar2.a;
        if (i != i2 || cVar.b != cVar2.b) {
            return y(e0Var, i, cVar.b, i2, cVar2.b);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(@NonNull RecyclerView.e0 e0Var) {
        return !this.g || e0Var.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean w(RecyclerView.e0 e0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.e0 e0Var);

    @SuppressLint({"UnknownNullness"})
    public void B(RecyclerView.e0 e0Var) {
    }
}
