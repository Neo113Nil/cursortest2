package m3;

import android.os.Looper;
import er.RunnableC6383a;

/* renamed from: m3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8062d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8073o f74309a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8073o f74310b;

    /* renamed from: c, reason: collision with root package name */
    private final a<T> f74311c;

    /* renamed from: d, reason: collision with root package name */
    private T f74312d;

    /* renamed from: e, reason: collision with root package name */
    private T f74313e;

    /* renamed from: f, reason: collision with root package name */
    private int f74314f;

    /* renamed from: m3.d$a */
    public interface a<T> {
        void a(T t2, T t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8062d(Object obj, Looper looper, Looper looper2, C8053F c8053f, a aVar) {
        this.f74309a = c8053f.a(looper, null);
        this.f74310b = c8053f.a(looper2, null);
        this.f74312d = obj;
        this.f74313e = obj;
        this.f74311c = aVar;
    }

    public static void a(C8062d c8062d, t3.z zVar) {
        T t2 = (T) zVar.apply(c8062d.f74313e);
        c8062d.f74313e = t2;
        B.d dVar = new B.d(3, c8062d, t2);
        InterfaceC8073o interfaceC8073o = c8062d.f74310b;
        if (interfaceC8073o.h().getThread().isAlive()) {
            interfaceC8073o.i(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(C8062d c8062d, Object obj) {
        if (c8062d.f74314f == 0) {
            T t2 = c8062d.f74312d;
            c8062d.f74312d = obj;
            if (t2.equals(obj)) {
                return;
            }
            c8062d.f74311c.a(t2, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(C8062d c8062d, Object obj) {
        int i11 = c8062d.f74314f - 1;
        c8062d.f74314f = i11;
        if (i11 == 0) {
            T t2 = c8062d.f74312d;
            c8062d.f74312d = obj;
            if (t2.equals(obj)) {
                return;
            }
            c8062d.f74311c.a(t2, obj);
        }
    }

    public final void d(Runnable runnable) {
        InterfaceC8073o interfaceC8073o = this.f74309a;
        if (interfaceC8073o.h().getThread().isAlive()) {
            interfaceC8073o.i(runnable);
        }
    }

    public final void e(final T t2) {
        this.f74313e = t2;
        Runnable runnable = new Runnable() { // from class: m3.c
            @Override // java.lang.Runnable
            public final void run() {
                C8062d.b(C8062d.this, t2);
            }
        };
        InterfaceC8073o interfaceC8073o = this.f74310b;
        if (interfaceC8073o.h().getThread().isAlive()) {
            interfaceC8073o.i(runnable);
        }
    }

    public final void f(t3.y yVar, t3.z zVar) {
        G10.a.h(Looper.myLooper() == this.f74310b.h());
        this.f74314f++;
        d(new RunnableC6383a(1, this, zVar));
        T t2 = (T) yVar.apply(this.f74312d);
        T t11 = this.f74312d;
        this.f74312d = t2;
        if (t11.equals(t2)) {
            return;
        }
        this.f74311c.a(t11, t2);
    }
}
