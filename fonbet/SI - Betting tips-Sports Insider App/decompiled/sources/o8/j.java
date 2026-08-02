package o8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements x8.c, x8.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21125a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f21126b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.k f21127c;

    public j() {
        p8.k kVar = p8.k.f21561a;
        this.f21125a = new HashMap();
        this.f21126b = new ArrayDeque();
        this.f21127c = kVar;
    }

    public final synchronized void a(Executor executor, x8.a aVar) {
        try {
            executor.getClass();
            if (!this.f21125a.containsKey(h8.b.class)) {
                this.f21125a.put(h8.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f21125a.get(h8.b.class)).put(aVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
