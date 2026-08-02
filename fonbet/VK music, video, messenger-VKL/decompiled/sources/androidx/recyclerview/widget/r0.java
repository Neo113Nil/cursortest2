package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import xsna.dpj0;
import xsna.tvb0;
import xsna.x500;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class r0 {
    public final dpj0<RecyclerView.e0, a> a = new dpj0<>();
    public final x500<RecyclerView.e0> b = new x500<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes12.dex */
    public static class a {
        public static final tvb0 d = new tvb0(20);
        public int a;

        @Nullable
        public RecyclerView.l.c b;

        @Nullable
        public RecyclerView.l.c c;

        public static void a() {
            while (d.c() != null) {
            }
        }

        public static a b() {
            a aVar = (a) d.c();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    public interface b {
    }

    public final void a(RecyclerView.e0 e0Var, RecyclerView.l.c cVar) {
        dpj0<RecyclerView.e0, a> dpj0Var = this.a;
        a aVar = dpj0Var.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            dpj0Var.put(e0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    public final RecyclerView.l.c b(RecyclerView.e0 e0Var, int i) {
        a j;
        RecyclerView.l.c cVar;
        dpj0<RecyclerView.e0, a> dpj0Var = this.a;
        int d = dpj0Var.d(e0Var);
        if (d < 0 || (j = dpj0Var.j(d)) == null) {
            return null;
        }
        int i2 = j.a;
        if ((i2 & i) == 0) {
            return null;
        }
        int i3 = i2 & (~i);
        j.a = i3;
        if (i == 4) {
            cVar = j.b;
        } else {
            if (i != 8) {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
            }
            cVar = j.c;
        }
        if ((i3 & 12) == 0) {
            dpj0Var.h(d);
            a.c(j);
        }
        return cVar;
    }

    public final void c(RecyclerView.e0 e0Var) {
        a aVar = this.a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    public final void d(RecyclerView.e0 e0Var) {
        x500<RecyclerView.e0> x500Var = this.b;
        int size = x500Var.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (e0Var == x500Var.valueAt(size)) {
                x500Var.removeAt(size);
                break;
            }
            size--;
        }
        a remove = this.a.remove(e0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
