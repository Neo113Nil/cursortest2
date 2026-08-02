package e1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b1.C2364s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4155w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4143j f45571a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4152t f45572b;

    /* renamed from: c, reason: collision with root package name */
    public final b f45573c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f45574d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f45575e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f45576f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f45577g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45578h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45579i;

    /* renamed from: e1.w$a */
    public interface a {
        void invoke(Object obj);
    }

    /* renamed from: e1.w$b */
    public interface b {
        void a(Object obj, C2364s c2364s);
    }

    /* renamed from: e1.w$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f45580a;

        /* renamed from: b, reason: collision with root package name */
        public C2364s.b f45581b = new C2364s.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f45582c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f45583d;

        public c(Object obj) {
            this.f45580a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f45583d) {
                return;
            }
            if (i10 != -1) {
                this.f45581b.a(i10);
            }
            this.f45582c = true;
            aVar.invoke(this.f45580a);
        }

        public void b(b bVar) {
            if (this.f45583d || !this.f45582c) {
                return;
            }
            C2364s e10 = this.f45581b.e();
            this.f45581b = new C2364s.b();
            this.f45582c = false;
            bVar.a(this.f45580a, e10);
        }

        public void c(b bVar) {
            this.f45583d = true;
            if (this.f45582c) {
                this.f45582c = false;
                bVar.a(this.f45580a, this.f45581b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f45580a.equals(((c) obj).f45580a);
        }

        public int hashCode() {
            return this.f45580a.hashCode();
        }
    }

    public C4155w(Looper looper, InterfaceC4143j interfaceC4143j, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC4143j, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(Object obj) {
        AbstractC4134a.e(obj);
        synchronized (this.f45577g) {
            try {
                if (this.f45578h) {
                    return;
                }
                this.f45574d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C4155w d(Looper looper, InterfaceC4143j interfaceC4143j, b bVar) {
        return new C4155w(this.f45574d, looper, interfaceC4143j, bVar, this.f45579i);
    }

    public C4155w e(Looper looper, b bVar) {
        return d(looper, this.f45571a, bVar);
    }

    public void f() {
        l();
        if (this.f45576f.isEmpty()) {
            return;
        }
        if (!this.f45572b.c(1)) {
            InterfaceC4152t interfaceC4152t = this.f45572b;
            interfaceC4152t.d(interfaceC4152t.b(1));
        }
        boolean isEmpty = this.f45575e.isEmpty();
        this.f45575e.addAll(this.f45576f);
        this.f45576f.clear();
        if (isEmpty) {
            while (!this.f45575e.isEmpty()) {
                ((Runnable) this.f45575e.peekFirst()).run();
                this.f45575e.removeFirst();
            }
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.f45574d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f45573c);
            if (this.f45572b.c(1)) {
                break;
            }
        }
        return true;
    }

    public void h(final int i10, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f45574d);
        this.f45576f.add(new Runnable() { // from class: e1.v
            @Override // java.lang.Runnable
            public final void run() {
                C4155w.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f45577g) {
            this.f45578h = true;
        }
        Iterator it = this.f45574d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f45573c);
        }
        this.f45574d.clear();
    }

    public void j(Object obj) {
        l();
        Iterator it = this.f45574d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f45580a.equals(obj)) {
                cVar.c(this.f45573c);
                this.f45574d.remove(cVar);
            }
        }
    }

    public void k(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    public final void l() {
        if (this.f45579i) {
            AbstractC4134a.g(Thread.currentThread() == this.f45572b.h().getThread());
        }
    }

    public C4155w(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC4143j interfaceC4143j, b bVar, boolean z10) {
        this.f45571a = interfaceC4143j;
        this.f45574d = copyOnWriteArraySet;
        this.f45573c = bVar;
        this.f45577g = new Object();
        this.f45575e = new ArrayDeque();
        this.f45576f = new ArrayDeque();
        this.f45572b = interfaceC4143j.d(looper, new Handler.Callback() { // from class: e1.u
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = C4155w.this.g(message);
                return g10;
            }
        });
        this.f45579i = z10;
    }
}
