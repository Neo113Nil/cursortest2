package mb;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tb.C6456a;
import tb.InterfaceC6457b;
import tb.InterfaceC6458c;
import tb.InterfaceC6459d;

/* loaded from: classes3.dex */
public class u implements InterfaceC6459d, InterfaceC6458c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f56487a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Queue f56488b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f56489c;

    public u(Executor executor) {
        this.f56489c = executor;
    }

    @Override // tb.InterfaceC6459d
    public synchronized void a(Class cls, Executor executor, InterfaceC6457b interfaceC6457b) {
        try {
            AbstractC5573C.b(cls);
            AbstractC5573C.b(interfaceC6457b);
            AbstractC5573C.b(executor);
            if (!this.f56487a.containsKey(cls)) {
                this.f56487a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f56487a.get(cls)).put(interfaceC6457b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // tb.InterfaceC6458c
    public void b(final C6456a c6456a) {
        AbstractC5573C.b(c6456a);
        synchronized (this) {
            try {
                Queue queue = this.f56488b;
                if (queue != null) {
                    queue.add(c6456a);
                    return;
                }
                for (final Map.Entry entry : g(c6456a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: mb.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC6457b) entry.getKey()).a(c6456a);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tb.InterfaceC6459d
    public synchronized void c(Class cls, InterfaceC6457b interfaceC6457b) {
        AbstractC5573C.b(cls);
        AbstractC5573C.b(interfaceC6457b);
        if (this.f56487a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f56487a.get(cls);
            concurrentHashMap.remove(interfaceC6457b);
            if (concurrentHashMap.isEmpty()) {
                this.f56487a.remove(cls);
            }
        }
    }

    @Override // tb.InterfaceC6459d
    public void d(Class cls, InterfaceC6457b interfaceC6457b) {
        a(cls, this.f56489c, interfaceC6457b);
    }

    public void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f56488b;
                if (queue != null) {
                    this.f56488b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                b((C6456a) it.next());
            }
        }
    }

    public final synchronized Set g(C6456a c6456a) {
        Map map;
        try {
            map = (Map) this.f56487a.get(c6456a.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }
}
