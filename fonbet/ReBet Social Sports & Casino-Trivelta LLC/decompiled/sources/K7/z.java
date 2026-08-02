package K7;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class z implements I {

    /* renamed from: a, reason: collision with root package name */
    public final Set f6357a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final C1372m f6358b = new C1372m();

    public final Object b(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f6357a.remove(obj);
        }
        return obj;
    }

    @Override // K7.I
    public Object get(int i10) {
        return b(this.f6358b.a(i10));
    }

    @Override // K7.I
    public Object pop() {
        return b(this.f6358b.f());
    }

    @Override // K7.I
    public void put(Object obj) {
        boolean add;
        synchronized (this) {
            add = this.f6357a.add(obj);
        }
        if (add) {
            this.f6358b.e(a(obj), obj);
        }
    }
}
