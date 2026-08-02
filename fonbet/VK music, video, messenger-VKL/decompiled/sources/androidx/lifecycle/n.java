package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import xsna.f5z;
import xsna.fr70;
import xsna.gg3;
import xsna.lzg0;
import xsna.zr;

/* compiled from: LiveData.java */
/* loaded from: classes.dex */
public abstract class n<T> {
    public static final Object k = new Object();
    public final Object a;
    public final lzg0<fr70<? super T>, n<T>.d> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a j;

    /* compiled from: LiveData.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (n.this.a) {
                obj = n.this.f;
                n.this.f = n.k;
            }
            n.this.k(obj);
        }
    }

    /* compiled from: LiveData.java */
    public class b extends n<T>.d {
        @Override // androidx.lifecycle.n.d
        public final boolean d() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    public class c extends n<T>.d implements l {
        public final f5z f;

        public c(f5z f5zVar, fr70<? super T> fr70Var) {
            super(fr70Var);
            this.f = f5zVar;
        }

        @Override // androidx.lifecycle.n.d
        public final void b() {
            this.f.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.n.d
        public final boolean c(f5z f5zVar) {
            return this.f == f5zVar;
        }

        @Override // androidx.lifecycle.n.d
        public final boolean d() {
            return this.f.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            f5z f5zVar2 = this.f;
            Lifecycle.State currentState = f5zVar2.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                n.this.j(this.b);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                a(d());
                state = currentState;
                currentState = f5zVar2.getLifecycle().getCurrentState();
            }
        }
    }

    public n(T t) {
        this.a = new Object();
        this.b = new lzg0<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }

    public static void a(String str) {
        gg3.a().g.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(zr.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(n<T>.d dVar) {
        if (dVar.c) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i = dVar.d;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.d = i2;
            dVar.b.a((Object) this.e);
        }
    }

    public final void c(n<T>.d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                b(dVar);
                dVar = null;
            } else {
                lzg0<fr70<? super T>, n<T>.d> lzg0Var = this.b;
                lzg0Var.getClass();
                lzg0.d dVar2 = new lzg0.d();
                lzg0Var.d.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    b((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T d() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public final void e(f5z f5zVar, fr70<? super T> fr70Var) {
        n<T>.d dVar;
        a("observe");
        if (f5zVar.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        c cVar = new c(f5zVar, fr70Var);
        lzg0<fr70<? super T>, n<T>.d> lzg0Var = this.b;
        lzg0.c<fr70<? super T>, n<T>.d> a2 = lzg0Var.a(fr70Var);
        if (a2 != null) {
            dVar = a2.c;
        } else {
            lzg0.c<K, V> cVar2 = new lzg0.c<>(fr70Var, cVar);
            lzg0Var.e++;
            lzg0.c<fr70<? super T>, n<T>.d> cVar3 = lzg0Var.c;
            if (cVar3 == 0) {
                lzg0Var.b = cVar2;
                lzg0Var.c = cVar2;
            } else {
                cVar3.d = cVar2;
                cVar2.e = cVar3;
                lzg0Var.c = cVar2;
            }
            dVar = null;
        }
        n<T>.d dVar2 = dVar;
        if (dVar2 != null && !dVar2.c(f5zVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        f5zVar.getLifecycle().addObserver(cVar);
    }

    public final void f(fr70<? super T> fr70Var) {
        n<T>.d dVar;
        a("observeForever");
        b bVar = new b(fr70Var);
        lzg0<fr70<? super T>, n<T>.d> lzg0Var = this.b;
        lzg0.c<fr70<? super T>, n<T>.d> a2 = lzg0Var.a(fr70Var);
        if (a2 != null) {
            dVar = a2.c;
        } else {
            lzg0.c<K, V> cVar = new lzg0.c<>(fr70Var, bVar);
            lzg0Var.e++;
            lzg0.c<fr70<? super T>, n<T>.d> cVar2 = lzg0Var.c;
            if (cVar2 == 0) {
                lzg0Var.b = cVar;
                lzg0Var.c = cVar;
            } else {
                cVar2.d = cVar;
                cVar.e = cVar2;
                lzg0Var.c = cVar;
            }
            dVar = null;
        }
        n<T>.d dVar2 = dVar;
        if (dVar2 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar2 != null) {
            return;
        }
        bVar.a(true);
    }

    public void i(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            gg3.a().c(this.j);
        }
    }

    public void j(fr70<? super T> fr70Var) {
        a("removeObserver");
        n<T>.d b2 = this.b.b(fr70Var);
        if (b2 == null) {
            return;
        }
        b2.b();
        b2.a(false);
    }

    public void k(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }

    public n() {
        this.a = new Object();
        this.b = new lzg0<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    /* compiled from: LiveData.java */
    public abstract class d {
        public final fr70<? super T> b;
        public boolean c;
        public int d = -1;

        public d(fr70<? super T> fr70Var) {
            this.b = fr70Var;
        }

        public final void a(boolean z) {
            if (z == this.c) {
                return;
            }
            this.c = z;
            int i = z ? 1 : -1;
            n nVar = n.this;
            int i2 = nVar.c;
            nVar.c = i + i2;
            if (!nVar.d) {
                nVar.d = true;
                while (true) {
                    try {
                        int i3 = nVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            nVar.g();
                        } else if (z3) {
                            nVar.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        nVar.d = false;
                        throw th;
                    }
                }
                nVar.d = false;
            }
            if (this.c) {
                nVar.c(this);
            }
        }

        public boolean c(f5z f5zVar) {
            return false;
        }

        public abstract boolean d();

        public void b() {
        }
    }

    public void g() {
    }

    public void h() {
    }
}
