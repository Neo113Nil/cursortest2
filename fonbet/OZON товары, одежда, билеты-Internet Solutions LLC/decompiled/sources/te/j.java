package te;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f99463a = new a();

    static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f99464a;

        b(Throwable th2) {
            this.f99464a = th2;
        }

        @NotNull
        public final Throwable a() {
            Throwable th2 = this.f99464a;
            if (th2 != null) {
                return th2;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper", "getThrowable"));
        }

        public final String toString() {
            return this.f99464a.toString();
        }
    }

    @NotNull
    public static <V> Object a(V v11) {
        return v11 == null ? f99463a : v11;
    }

    @NotNull
    public static Object b(@NotNull Throwable th2) {
        return new b(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V c(@NotNull Object obj) {
        d(obj);
        if (obj == f99463a) {
            return null;
        }
        return obj;
    }

    public static void d(Object obj) {
        if (obj instanceof b) {
            d.b(((b) obj).a());
            throw null;
        }
    }
}
