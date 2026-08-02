package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 implements c0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16363a;

    /* renamed from: b, reason: collision with root package name */
    public final u4 f16364b;

    /* renamed from: c, reason: collision with root package name */
    public final u4 f16365c;

    /* renamed from: d, reason: collision with root package name */
    public volatile k0 f16366d = null;

    public e2(b6 b6Var) {
        this.f16363a = b6Var;
        t tVar = new t(b6Var, 2);
        this.f16365c = new u4(tVar);
        this.f16364b = new u4(tVar);
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, h0 h0Var) {
        if (d6Var.f16462h == null) {
            d6Var.f16462h = "java";
        }
        if (w(d6Var, h0Var)) {
            t(d6Var);
            io.sentry.protocol.t tVar = this.f16363a.getSessionReplay().f16409k;
            if (tVar != null) {
                d6Var.f16457c = tVar;
            }
        }
        return d6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16366d != null) {
            this.f16366d.f16592f.shutdown();
        }
    }

    @Override // io.sentry.c0
    public final t4 k(t4 t4Var, h0 h0Var) {
        ArrayList arrayList;
        if (t4Var.f16462h == null) {
            t4Var.f16462h = "java";
        }
        Throwable th2 = t4Var.j;
        if (th2 != null) {
            u4 u4Var = this.f16365c;
            u4Var.getClass();
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            u4Var.a(th2, atomicInteger, hashSet, arrayDeque, null);
            t4Var.f17095t = new com.android.billingclient.api.m(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.d dVar = t4Var.f16467n;
        b6 b6Var = this.f16363a;
        io.sentry.protocol.d a7 = io.sentry.protocol.d.a(dVar, b6Var);
        if (a7 != null) {
            t4Var.f16467n = a7;
        }
        Map a10 = b6Var.getModulesLoader().a();
        if (a10 != null) {
            AbstractMap abstractMap = t4Var.f17100y;
            if (abstractMap == null) {
                t4Var.f17100y = new HashMap(a10);
            } else {
                abstractMap.putAll(a10);
            }
        }
        if (w(t4Var, h0Var)) {
            t(t4Var);
            com.android.billingclient.api.m mVar = t4Var.f17094s;
            if ((mVar != null ? mVar.f4046a : null) == null) {
                com.android.billingclient.api.m mVar2 = t4Var.f17095t;
                ArrayList arrayList2 = mVar2 == null ? null : mVar2.f4046a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    Iterator it = arrayList2.iterator();
                    arrayList = null;
                    while (it.hasNext()) {
                        io.sentry.protocol.u uVar = (io.sentry.protocol.u) it.next();
                        if (uVar.f16920f != null && uVar.f16918d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(uVar.f16918d);
                        }
                    }
                }
                boolean isAttachThreads = b6Var.isAttachThreads();
                boolean z5 = false;
                u4 u4Var2 = this.f16364b;
                if (isAttachThreads || io.sentry.hints.a.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
                    Object b10 = h0Var.b("sentry:typeCheckHint");
                    boolean isAttachStacktrace = b6Var.isAttachStacktrace();
                    if (b10 instanceof io.sentry.hints.a) {
                        z5 = ((io.sentry.hints.a) b10).c();
                        isAttachStacktrace = true;
                    }
                    u4Var2.getClass();
                    t4Var.f17094s = new com.android.billingclient.api.m(u4Var2.b(Thread.getAllStackTraces(), arrayList, z5, isAttachStacktrace));
                } else if (b6Var.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !io.sentry.hints.d.class.isInstance(h0Var.b("sentry:typeCheckHint")))) {
                    boolean isAttachStacktrace2 = b6Var.isAttachStacktrace();
                    u4Var2.getClass();
                    HashMap hashMap = new HashMap();
                    Thread currentThread = Thread.currentThread();
                    hashMap.put(currentThread, currentThread.getStackTrace());
                    t4Var.f17094s = new com.android.billingclient.api.m(u4Var2.b(hashMap, null, false, isAttachStacktrace2));
                    return t4Var;
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, h0 h0Var) {
        if (e0Var.f16462h == null) {
            e0Var.f16462h = "java";
        }
        io.sentry.protocol.d a7 = io.sentry.protocol.d.a(e0Var.f16467n, this.f16363a);
        if (a7 != null) {
            e0Var.f16467n = a7;
        }
        if (w(e0Var, h0Var)) {
            t(e0Var);
        }
        return e0Var;
    }

    public final void t(h4 h4Var) {
        if (h4Var.f16460f == null) {
            h4Var.f16460f = this.f16363a.getRelease();
        }
        if (h4Var.f16461g == null) {
            h4Var.f16461g = this.f16363a.getEnvironment();
        }
        if (h4Var.f16464k == null) {
            h4Var.f16464k = this.f16363a.getServerName();
        }
        if (this.f16363a.isAttachServerName() && h4Var.f16464k == null) {
            if (this.f16366d == null) {
                this.f16366d = k0.a();
            }
            if (this.f16366d != null) {
                k0 k0Var = this.f16366d;
                if (k0Var.f16589c < System.currentTimeMillis() && k0Var.f16590d.compareAndSet(false, true)) {
                    k0Var.b();
                }
                h4Var.f16464k = k0Var.f16588b;
            }
        }
        if (h4Var.f16465l == null) {
            h4Var.f16465l = this.f16363a.getDist();
        }
        if (h4Var.f16457c == null) {
            h4Var.f16457c = this.f16363a.getSdkVersion();
        }
        b6 b6Var = this.f16363a;
        if (h4Var.f16459e == null) {
            h4Var.f16459e = new HashMap(new HashMap(b6Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : b6Var.getTags().entrySet()) {
                if (!h4Var.f16459e.containsKey(entry.getKey())) {
                    h4Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.i0 i0Var = h4Var.f16463i;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            h4Var.f16463i = i0Var;
        }
        if (i0Var.f16819d == null && this.f16363a.isSendDefaultPii()) {
            i0Var.f16819d = "{{auto}}";
        }
    }

    public final boolean w(h4 h4Var, h0 h0Var) {
        if (k2.x.D(h0Var)) {
            return true;
        }
        this.f16363a.getLogger().h(b5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", h4Var.f16455a);
        return false;
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        return d5Var;
    }
}
