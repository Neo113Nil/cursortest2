package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import xsna.ggz;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes12.dex */
public final class d<T> {
    public static final c h = new c();
    public final ggz a;
    public final androidx.recyclerview.widget.c<T> b;
    public final Executor c;

    @Nullable
    public List<T> e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    @NonNull
    public List<T> f = Collections.EMPTY_LIST;

    /* compiled from: AsyncListDiffer.java */
    public class a implements Runnable {
        public final /* synthetic */ List b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Runnable e;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0081a extends m.b {
            public C0081a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.m.b
            public final boolean areContentsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.c.areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.m.b
            public final boolean areItemsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.b.c.areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.m.b
            @Nullable
            public final Object getChangePayload(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.b.c.getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getNewListSize() {
                return a.this.c.size();
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getOldListSize() {
                return a.this.b.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        public class b implements Runnable {
            public final /* synthetic */ m.d b;

            public b(m.d dVar) {
                this.b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.d) {
                    List<T> list = aVar.c;
                    Runnable runnable = aVar.e;
                    List<T> list2 = dVar.f;
                    dVar.e = list;
                    dVar.f = Collections.unmodifiableList(list);
                    this.b.c(dVar.a);
                    dVar.a(list2, runnable);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.b = list;
            this.c = list2;
            this.d = i;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.c.execute(new b(m.a(new C0081a(), true)));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    public interface b<T> {
        void a(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    public static class c implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.b.post(runnable);
        }
    }

    public d(@NonNull ggz ggzVar, @NonNull androidx.recyclerview.widget.c<T> cVar) {
        this.a = ggzVar;
        this.b = cVar;
        Executor executor = cVar.a;
        if (executor != null) {
            this.c = executor;
        } else {
            this.c = h;
        }
    }

    public final void a(@NonNull List<T> list, @Nullable Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        ggz ggzVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            ggzVar.onRemoved(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.b.execute(new a(list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        ggzVar.onInserted(0, list.size());
        a(list3, runnable);
    }
}
