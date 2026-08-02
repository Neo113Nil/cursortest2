package n8;

import com.google.firebase.messaging.C5938t;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import v8.C10272a;
import v8.InterfaceC10273b;

/* loaded from: classes.dex */
final class p implements v8.d, v8.c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f76606a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private ArrayDeque f76607b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f76608c;

    p(Executor executor) {
        this.f76608c = executor;
    }

    @Override // v8.d
    public final void a(C5938t c5938t) {
        b(this.f76608c, c5938t);
    }

    @Override // v8.d
    public final synchronized void b(Executor executor, InterfaceC10273b interfaceC10273b) {
        try {
            executor.getClass();
            if (!this.f76606a.containsKey(k8.b.class)) {
                this.f76606a.put(k8.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f76606a.get(k8.b.class)).put(interfaceC10273b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        ArrayDeque<C10272a> arrayDeque;
        Set<Map.Entry> entrySet;
        synchronized (this) {
            arrayDeque = this.f76607b;
            if (arrayDeque != null) {
                this.f76607b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (C10272a c10272a : arrayDeque) {
                c10272a.getClass();
                synchronized (this) {
                    try {
                        ArrayDeque arrayDeque2 = this.f76607b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(c10272a);
                        } else {
                            synchronized (this) {
                                try {
                                    Map map = (Map) this.f76606a.get(null);
                                    entrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry : entrySet) {
                                ((Executor) entry.getValue()).execute(new Lo.b(4, entry, c10272a));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
