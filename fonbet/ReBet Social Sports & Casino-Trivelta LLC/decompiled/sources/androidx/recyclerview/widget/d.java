package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f22989h = new c();

    /* renamed from: a, reason: collision with root package name */
    public final q f22990a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.c f22991b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f22992c;

    /* renamed from: e, reason: collision with root package name */
    public List f22994e;

    /* renamed from: g, reason: collision with root package name */
    public int f22996g;

    /* renamed from: d, reason: collision with root package name */
    public final List f22993d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f22995f = Collections.EMPTY_LIST;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f22997a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f22998b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22999c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Runnable f23000d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0397a extends h.b {
            public C0397a() {
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int i10, int i11) {
                Object obj = a.this.f22997a.get(i10);
                Object obj2 = a.this.f22998b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f22991b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int i10, int i11) {
                Object obj = a.this.f22997a.get(i10);
                Object obj2 = a.this.f22998b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f22991b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public Object getChangePayload(int i10, int i11) {
                Object obj = a.this.f22997a.get(i10);
                Object obj2 = a.this.f22998b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f22991b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getNewListSize() {
                return a.this.f22998b.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getOldListSize() {
                return a.this.f22997a.size();
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h.e f23003a;

            public b(h.e eVar) {
                this.f23003a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f22996g == aVar.f22999c) {
                    dVar.c(aVar.f22998b, this.f23003a, aVar.f23000d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f22997a = list;
            this.f22998b = list2;
            this.f22999c = i10;
            this.f23000d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f22992c.execute(new b(h.b(new C0397a())));
        }
    }

    public interface b {
        void a(List list, List list2);
    }

    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f23005a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f23005a.post(runnable);
        }
    }

    public d(q qVar, androidx.recyclerview.widget.c cVar) {
        this.f22990a = qVar;
        this.f22991b = cVar;
        if (cVar.c() != null) {
            this.f22992c = cVar.c();
        } else {
            this.f22992c = f22989h;
        }
    }

    public void a(b bVar) {
        this.f22993d.add(bVar);
    }

    public List b() {
        return this.f22995f;
    }

    public void c(List list, h.e eVar, Runnable runnable) {
        List list2 = this.f22995f;
        this.f22994e = list;
        this.f22995f = Collections.unmodifiableList(list);
        eVar.b(this.f22990a);
        d(list2, runnable);
    }

    public final void d(List list, Runnable runnable) {
        Iterator it = this.f22993d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f22995f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(List list) {
        f(list, null);
    }

    public void f(List list, Runnable runnable) {
        int i10 = this.f22996g + 1;
        this.f22996g = i10;
        List list2 = this.f22994e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f22995f;
        if (list == null) {
            int size = list2.size();
            this.f22994e = null;
            this.f22995f = Collections.EMPTY_LIST;
            this.f22990a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f22991b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f22994e = list;
        this.f22995f = Collections.unmodifiableList(list);
        this.f22990a.a(0, list.size());
        d(list3, runnable);
    }
}
