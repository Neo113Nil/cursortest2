package p6;

/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    final class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f80266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f80267b;

        a(b bVar) {
            this.f80267b = bVar;
        }

        @Override // p6.f.b
        public final T get() {
            if (this.f80266a == null) {
                synchronized (this) {
                    try {
                        if (this.f80266a == null) {
                            T t2 = (T) this.f80267b.get();
                            k.c(t2, "Argument must not be null");
                            this.f80266a = t2;
                        }
                    } finally {
                    }
                }
            }
            return this.f80266a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
