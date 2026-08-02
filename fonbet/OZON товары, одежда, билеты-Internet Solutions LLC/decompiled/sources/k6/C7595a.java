package k6;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7595a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f70915a = new ArrayList();

    /* renamed from: k6.a$a, reason: collision with other inner class name */
    private static final class C1158a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f70916a;

        /* renamed from: b, reason: collision with root package name */
        final T5.d<T> f70917b;

        C1158a(@NonNull Class<T> cls, @NonNull T5.d<T> dVar) {
            this.f70916a = cls;
            this.f70917b = dVar;
        }

        final boolean a(@NonNull Class<?> cls) {
            return this.f70916a.isAssignableFrom(cls);
        }
    }

    public final synchronized <T> void a(@NonNull Class<T> cls, @NonNull T5.d<T> dVar) {
        this.f70915a.add(new C1158a(cls, dVar));
    }

    public final synchronized <T> T5.d<T> b(@NonNull Class<T> cls) {
        Iterator it = this.f70915a.iterator();
        while (it.hasNext()) {
            C1158a c1158a = (C1158a) it.next();
            if (c1158a.a(cls)) {
                return c1158a.f70917b;
            }
        }
        return null;
    }
}
