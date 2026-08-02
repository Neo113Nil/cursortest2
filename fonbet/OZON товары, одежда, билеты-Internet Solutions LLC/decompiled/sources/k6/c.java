package k6;

import V5.j;
import V5.t;
import androidx.collection.C5132a;
import h6.C6819g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final t<?, ?, ?> f70919c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new j(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C6819g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C5132a<p6.j, t<?, ?, ?>> f70920a = new C5132a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<p6.j> f70921b = new AtomicReference<>();

    public static boolean b(t tVar) {
        return f70919c.equals(tVar);
    }

    public final <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        p6.j andSet = this.f70921b.getAndSet(null);
        if (andSet == null) {
            andSet = new p6.j();
        }
        andSet.a(cls, cls2, cls3);
        synchronized (this.f70920a) {
            tVar = (t) this.f70920a.get(andSet);
        }
        this.f70921b.set(andSet);
        return tVar;
    }

    public final void c(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f70920a) {
            C5132a<p6.j, t<?, ?, ?>> c5132a = this.f70920a;
            p6.j jVar = new p6.j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f70919c;
            }
            c5132a.put(jVar, tVar);
        }
    }
}
