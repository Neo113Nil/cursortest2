package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rv5 implements hki, wgf {
    public final HashMap a;
    public ArrayDeque b;

    public rv5() {
        f9k f9kVar = f9k.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
    }

    public final synchronized void a(Executor executor, x06 x06Var) {
        try {
            if (!this.a.containsKey(td4.class)) {
                this.a.put(td4.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(td4.class)).put(x06Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
