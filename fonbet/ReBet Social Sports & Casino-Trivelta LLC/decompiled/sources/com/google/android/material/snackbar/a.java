package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static a f36128e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f36129a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f36130b = new Handler(Looper.getMainLooper(), new C0503a());

    /* renamed from: c, reason: collision with root package name */
    public c f36131c;

    /* renamed from: d, reason: collision with root package name */
    public c f36132d;

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0503a implements Handler.Callback {
        public C0503a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a(int i10);

        void show();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f36134a;

        /* renamed from: b, reason: collision with root package name */
        public int f36135b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f36136c;

        public c(int i10, b bVar) {
            this.f36134a = new WeakReference(bVar);
            this.f36135b = i10;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f36134a.get() == bVar;
        }
    }

    public static a c() {
        if (f36128e == null) {
            f36128e = new a();
        }
        return f36128e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = (b) cVar.f36134a.get();
        if (bVar == null) {
            return false;
        }
        this.f36130b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    a(this.f36131c, i10);
                } else if (g(bVar)) {
                    a(this.f36132d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.f36129a) {
            try {
                if (this.f36131c != cVar) {
                    if (this.f36132d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f36129a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public final boolean f(b bVar) {
        c cVar = this.f36131c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.f36132d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    this.f36131c = null;
                    if (this.f36132d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    l(this.f36131c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f36131c;
                    if (!cVar.f36136c) {
                        cVar.f36136c = true;
                        this.f36130b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f36131c;
                    if (cVar.f36136c) {
                        cVar.f36136c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(c cVar) {
        int i10 = cVar.f36135b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f36130b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f36130b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public void m(int i10, b bVar) {
        synchronized (this.f36129a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f36131c;
                    cVar.f36135b = i10;
                    this.f36130b.removeCallbacksAndMessages(cVar);
                    l(this.f36131c);
                    return;
                }
                if (g(bVar)) {
                    this.f36132d.f36135b = i10;
                } else {
                    this.f36132d = new c(i10, bVar);
                }
                c cVar2 = this.f36131c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f36131c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n() {
        c cVar = this.f36132d;
        if (cVar != null) {
            this.f36131c = cVar;
            this.f36132d = null;
            b bVar = (b) cVar.f36134a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f36131c = null;
            }
        }
    }
}
