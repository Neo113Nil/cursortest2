package K4;

import I4.g;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.util.j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import z.C6900a;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final t f6233c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final C6900a f6234a = new C6900a();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f6235b = new AtomicReference();

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f6234a) {
            tVar = (t) this.f6234a.get(b10);
        }
        this.f6235b.set(b10);
        return tVar;
    }

    public final j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f6235b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public boolean c(t tVar) {
        return f6233c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f6234a) {
            C6900a c6900a = this.f6234a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f6233c;
            }
            c6900a.put(jVar, tVar);
        }
    }
}
