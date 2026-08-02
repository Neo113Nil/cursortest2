package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.m;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.asu0;

/* compiled from: ListAdapter.java */
/* loaded from: classes12.dex */
public abstract class x<T, VH extends RecyclerView.e0> extends RecyclerView.Adapter<VH> {
    final d<T> mDiffer;
    private final d.b<T> mListener;

    /* compiled from: ListAdapter.java */
    public class a implements d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public final void a(@NonNull List<T> list, @NonNull List<T> list2) {
            x.this.onCurrentListChanged(list, list2);
        }
    }

    public x(@NonNull m.e<T> eVar) {
        a aVar = new a();
        this.mListener = aVar;
        b bVar = new b(this);
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    asu0.a.getClass();
                    ExecutorService D = asu0.D();
                    c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d<T> dVar = new d<>(bVar, new c(null, c.a.b, eVar));
        this.mDiffer = dVar;
        dVar.d.add(aVar);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.mDiffer.f;
    }

    public T getItem(int i) {
        return this.mDiffer.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.f.size();
    }

    public void submitList(@Nullable List<T> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }

    public x(@NonNull c<T> cVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.mDiffer = dVar;
        dVar.d.add(aVar);
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }
}
