package k7;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f18919b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Object f18920a;

    public t(Object obj) {
        this.f18920a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18920a != f18919b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f18920a;
        Object obj2 = f18919b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f18920a = obj2;
        return obj;
    }
}
