package K4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f6229a = new ArrayList();

    /* renamed from: K4.a$a, reason: collision with other inner class name */
    public static final class C0134a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f6230a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.d f6231b;

        public C0134a(Class cls, com.bumptech.glide.load.d dVar) {
            this.f6230a = cls;
            this.f6231b = dVar;
        }

        public boolean a(Class cls) {
            return this.f6230a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, com.bumptech.glide.load.d dVar) {
        this.f6229a.add(new C0134a(cls, dVar));
    }

    public synchronized com.bumptech.glide.load.d b(Class cls) {
        for (C0134a c0134a : this.f6229a) {
            if (c0134a.a(cls)) {
                return c0134a.f6231b;
            }
        }
        return null;
    }
}
