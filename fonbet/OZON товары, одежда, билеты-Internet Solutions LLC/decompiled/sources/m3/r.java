package m3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j3.C7271m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m3.r;
import u3.C9929c;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8064f f74348a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8073o f74349b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f74350c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f74351d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f74352e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f74353f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f74354g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f74355h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f74356i;

    public interface a<T> {
        void invoke(T t2);
    }

    public interface b<T> {
        void d(T t2, C7271m c7271m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f74357a;

        /* renamed from: b, reason: collision with root package name */
        private C7271m.a f74358b = new C7271m.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f74359c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f74360d;

        public c(T t2) {
            this.f74357a = t2;
        }

        public final void a(int i11, a<T> aVar) {
            if (this.f74360d) {
                return;
            }
            if (i11 != -1) {
                this.f74358b.a(i11);
            }
            this.f74359c = true;
            aVar.invoke(this.f74357a);
        }

        public final void b(b<T> bVar) {
            if (this.f74360d || !this.f74359c) {
                return;
            }
            C7271m b11 = this.f74358b.b();
            this.f74358b = new C7271m.a();
            this.f74359c = false;
            bVar.d(this.f74357a, b11);
        }

        public final void c(b<T> bVar) {
            this.f74360d = true;
            if (this.f74359c) {
                this.f74359c = false;
                bVar.d(this.f74357a, this.f74358b.b());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f74357a.equals(((c) obj).f74357a);
        }

        public final int hashCode() {
            return this.f74357a.hashCode();
        }
    }

    public r(Looper looper, InterfaceC8064f interfaceC8064f, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC8064f, bVar, true);
    }

    public static void a(r rVar) {
        Iterator<c<T>> it = rVar.f74351d.iterator();
        while (it.hasNext()) {
            it.next().b(rVar.f74350c);
            if (rVar.f74349b.a()) {
                return;
            }
        }
    }

    private void i() {
        if (this.f74356i) {
            G10.a.h(Thread.currentThread() == this.f74349b.h().getThread());
        }
    }

    public final void b(T t2) {
        t2.getClass();
        synchronized (this.f74354g) {
            try {
                if (this.f74355h) {
                    return;
                }
                this.f74351d.add(new c<>(t2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r c(Looper looper, C9929c c9929c) {
        return new r(this.f74351d, looper, this.f74348a, c9929c, this.f74356i);
    }

    public final void d() {
        i();
        ArrayDeque<Runnable> arrayDeque = this.f74353f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC8073o interfaceC8073o = this.f74349b;
        if (!interfaceC8073o.a()) {
            interfaceC8073o.g(interfaceC8073o.b(1));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f74352e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void e(final int i11, final a<T> aVar) {
        i();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f74351d);
        this.f74353f.add(new Runnable() { // from class: m3.q
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((r.c) it.next()).a(i11, aVar);
                }
            }
        });
    }

    public final void f() {
        i();
        synchronized (this.f74354g) {
            this.f74355h = true;
        }
        Iterator<c<T>> it = this.f74351d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f74350c);
        }
        this.f74351d.clear();
    }

    public final void g(T t2) {
        i();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f74351d;
        Iterator<c<T>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f74357a.equals(t2)) {
                next.c(this.f74350c);
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    public final void h(int i11, a<T> aVar) {
        e(i11, aVar);
        d();
    }

    private r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC8064f interfaceC8064f, b<T> bVar, boolean z11) {
        this.f74348a = interfaceC8064f;
        this.f74351d = copyOnWriteArraySet;
        this.f74350c = bVar;
        this.f74354g = new Object();
        this.f74352e = new ArrayDeque<>();
        this.f74353f = new ArrayDeque<>();
        this.f74349b = interfaceC8064f.a(looper, new Handler.Callback() { // from class: m3.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                r.a(r.this);
                return true;
            }
        });
        this.f74356i = z11;
    }
}
