package io.sentry;

import io.sentry.protocol.C7188d;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7228z0 implements InterfaceC7227z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f68685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b3 f68686b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final A2 f68687c;

    /* renamed from: d, reason: collision with root package name */
    private volatile H f68688d = null;

    public C7228z0(@NotNull W2 w22) {
        this.f68685a = w22;
        a3 a3Var = new a3(w22);
        this.f68687c = new A2(a3Var);
        this.f68686b = new b3(a3Var);
    }

    private void k(@NotNull O1 o12) {
        if (o12.J() == null) {
            o12.X(this.f68685a.getRelease());
        }
        if (o12.F() == null) {
            o12.T(this.f68685a.getEnvironment());
        }
        if (o12.M() == null) {
            o12.a0(this.f68685a.getServerName());
        }
        if (this.f68685a.isAttachServerName() && o12.M() == null) {
            if (this.f68688d == null) {
                this.f68688d = H.d();
            }
            if (this.f68688d != null) {
                o12.a0(this.f68688d.c());
            }
        }
        if (o12.E() == null) {
            o12.S(this.f68685a.getDist());
        }
        if (o12.L() == null) {
            o12.Z(this.f68685a.getSdkVersion());
        }
        Map<String, String> N11 = o12.N();
        W2 w22 = this.f68685a;
        if (N11 == null) {
            o12.c0(new HashMap(w22.getTags()));
        } else {
            for (Map.Entry<String, String> entry : w22.getTags().entrySet()) {
                if (!o12.N().containsKey(entry.getKey())) {
                    o12.b0(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.E P11 = o12.P();
        if (P11 == null) {
            P11 = new io.sentry.protocol.E();
            o12.d0(P11);
        }
        if (P11.k() == null && this.f68685a.isSendDefaultPii()) {
            P11.o();
        }
    }

    private boolean m(@NotNull O1 o12, @NotNull E e11) {
        if (io.sentry.util.h.d(e11)) {
            return true;
        }
        this.f68685a.getLogger().c(I2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", o12.G());
        return false;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final X2 c(@NotNull X2 x22, @NotNull E e11) {
        if (x22.I() == null) {
            x22.W("java");
        }
        if (m(x22, e11)) {
            k(x22);
            io.sentry.protocol.r q11 = this.f68685a.getSessionReplay().q();
            if (q11 != null) {
                x22.Z(q11);
            }
        }
        return x22;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f68688d != null) {
            this.f68688d.b();
        }
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull E e11) {
        ArrayList arrayList;
        if (c7230z2.I() == null) {
            c7230z2.W("java");
        }
        Throwable th2 = c7230z2.f66704j;
        if (th2 != null) {
            A2 a22 = this.f68687c;
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            a22.a(th2, atomicInteger, hashSet, arrayDeque, null);
            c7230z2.x0(new ArrayList(arrayDeque));
        }
        C7188d D11 = c7230z2.D();
        W2 w22 = this.f68685a;
        C7188d c11 = C7188d.c(D11, w22);
        if (c11 != null) {
            c7230z2.R(c11);
        }
        Map<String, String> a11 = w22.getModulesLoader().a();
        if (a11 != null) {
            Map<String, String> r02 = c7230z2.r0();
            if (r02 == null) {
                c7230z2.C0(a11);
            } else {
                r02.putAll(a11);
            }
        }
        if (m(c7230z2, e11)) {
            k(c7230z2);
            if (c7230z2.s0() == null) {
                ArrayList n02 = c7230z2.n0();
                if (n02 == null || n02.isEmpty()) {
                    arrayList = null;
                } else {
                    Iterator it = n02.iterator();
                    arrayList = null;
                    while (it.hasNext()) {
                        io.sentry.protocol.s sVar = (io.sentry.protocol.s) it.next();
                        if (sVar.g() != null && sVar.j() != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(sVar.j());
                        }
                    }
                }
                boolean isAttachThreads = w22.isAttachThreads();
                b3 b3Var = this.f68686b;
                boolean z11 = false;
                if (isAttachThreads || io.sentry.hints.a.class.isInstance(e11.d("sentry:typeCheckHint"))) {
                    Object d11 = e11.d("sentry:typeCheckHint");
                    boolean isAttachStacktrace = w22.isAttachStacktrace();
                    if (d11 instanceof io.sentry.hints.a) {
                        z11 = ((io.sentry.hints.a) d11).c();
                        isAttachStacktrace = true;
                    }
                    c7230z2.D0(b3Var.a(Thread.getAllStackTraces(), arrayList, z11, isAttachStacktrace));
                } else if (w22.isAttachStacktrace() && ((n02 == null || n02.isEmpty()) && !io.sentry.hints.e.class.isInstance(e11.d("sentry:typeCheckHint")))) {
                    boolean isAttachStacktrace2 = w22.isAttachStacktrace();
                    HashMap hashMap = new HashMap();
                    Thread currentThread = Thread.currentThread();
                    hashMap.put(currentThread, currentThread.getStackTrace());
                    c7230z2.D0(b3Var.a(hashMap, null, false, isAttachStacktrace2));
                    return c7230z2;
                }
            }
        }
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull E e11) {
        if (a11.I() == null) {
            a11.W("java");
        }
        C7188d c11 = C7188d.c(a11.D(), this.f68685a);
        if (c11 != null) {
            a11.R(c11);
        }
        if (m(a11, e11)) {
            k(a11);
        }
        return a11;
    }
}
