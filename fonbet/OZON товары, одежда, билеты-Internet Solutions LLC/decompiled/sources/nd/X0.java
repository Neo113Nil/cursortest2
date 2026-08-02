package nd;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;

/* loaded from: classes.dex */
public final class X0 {

    public static class a<T> extends b<T> implements Function0<T> {

        /* renamed from: b, reason: collision with root package name */
        private final Function0<T> f76945b;

        /* renamed from: c, reason: collision with root package name */
        private volatile SoftReference<Object> f76946c;

        public a(InterfaceC9836b interfaceC9836b, @NotNull Function0 function0) {
            if (function0 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.f76946c = null;
            this.f76945b = function0;
            if (interfaceC9836b != null) {
                this.f76946c = new SoftReference<>(b.a(interfaceC9836b));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f76946c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return (T) b.b(obj);
            }
            T invoke = this.f76945b.invoke();
            this.f76946c = new SoftReference<>(b.a(invoke));
            return invoke;
        }
    }

    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f76947a = new a();

        static class a {
        }

        protected static Object a(Object obj) {
            return obj == null ? f76947a : obj;
        }

        protected static Object b(Object obj) {
            if (obj == f76947a) {
                return null;
            }
            return obj;
        }
    }

    @NotNull
    public static a a(InterfaceC9836b interfaceC9836b, @NotNull Function0 function0) {
        if (function0 != null) {
            return new a(interfaceC9836b, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }
}
