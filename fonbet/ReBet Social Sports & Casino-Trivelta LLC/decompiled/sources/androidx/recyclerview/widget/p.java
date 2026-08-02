package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p extends RecyclerView.h {

    /* renamed from: a, reason: collision with root package name */
    public final d f23209a;

    /* renamed from: b, reason: collision with root package name */
    public final d.b f23210b;

    public class a implements d.b {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List list, List list2) {
            p.this.d(list, list2);
        }
    }

    public p(h.f fVar) {
        a aVar = new a();
        this.f23210b = aVar;
        d dVar = new d(new b(this), new c.a(fVar).a());
        this.f23209a = dVar;
        dVar.a(aVar);
    }

    public Object c(int i10) {
        return this.f23209a.b().get(i10);
    }

    public void d(List list, List list2) {
    }

    public void e(List list) {
        this.f23209a.e(list);
    }

    public void f(List list, Runnable runnable) {
        this.f23209a.f(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f23209a.b().size();
    }
}
