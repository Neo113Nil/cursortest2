package com.tonicartos.superslim;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tonicartos.superslim.LayoutManager;

/* compiled from: LayoutState.java */
/* loaded from: classes14.dex */
public final class b {
    public final RecyclerView.v a;
    public final RecyclerView.a0 b;
    public final SparseArray<View> c;
    public final boolean d;

    /* compiled from: LayoutState.java */
    public static class a {
        public final View a;
        public final boolean b;

        public a(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        public final LayoutManager.b a() {
            return (LayoutManager.b) this.a.getLayoutParams();
        }
    }

    public b(LayoutManager layoutManager, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        this.c = new SparseArray<>(layoutManager.getChildCount());
        this.b = a0Var;
        this.a = vVar;
        this.d = layoutManager.getLayoutDirection() == 0;
    }

    public final void a(int i, View view) {
        this.c.put(i, view);
    }

    public final void b(int i) {
        this.c.remove(i);
    }

    public final a c(int i) {
        View view = this.c.get(i);
        boolean z = view != null;
        if (view == null) {
            try {
                view = this.a.f(i);
            } catch (Exception e) {
                e.toString();
            }
        }
        return new a(view, z);
    }
}
