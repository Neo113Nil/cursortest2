package K4;

import com.bumptech.glide.util.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import z.C6900a;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6236a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final C6900a f6237b = new C6900a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f6236a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f6237b) {
            list = (List) this.f6237b.get(jVar);
        }
        this.f6236a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f6237b) {
            this.f6237b.put(new j(cls, cls2, cls3), list);
        }
    }
}
