package B;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f487a = new AtomicReference(G.g.a());

    /* renamed from: b, reason: collision with root package name */
    public final Object f488b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Object f489c;

    public final Object a() {
        long id2 = Thread.currentThread().getId();
        return id2 == AbstractC1026a.b() ? this.f489c : ((G.f) this.f487a.get()).b(id2);
    }
}
