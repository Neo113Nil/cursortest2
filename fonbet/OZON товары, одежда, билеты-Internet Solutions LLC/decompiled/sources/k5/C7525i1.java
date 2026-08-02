package k5;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: k5.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7525i1 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final HashMap f70752a;

    /* renamed from: b, reason: collision with root package name */
    private C7558q2 f70753b;

    public C7525i1(@NonNull Map<Class<?>, InterfaceC7505d1> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Base feature holders should be provided!");
        }
        this.f70752a = new HashMap(map);
    }

    @NonNull
    public final <T> T a(Class<T> cls) {
        if (this.f70753b == null) {
            this.f70753b = new C7558q2(cls, Thread.currentThread().getName(), new Throwable());
            T b11 = b(cls).b();
            this.f70753b = null;
            return b11;
        }
        throw new IllegalStateException("Concurrent feature requests not supported!\nMaybe You used 'getFeature' from DI code - if so replace it with 'getDependency' \nDetails: \n\n\trequestedFeature = " + cls.getName() + "\n\tcurrentThread = " + Thread.currentThread().getName() + "\n\tcurrentBuildFeatureContext = " + this.f70753b);
    }

    @NonNull
    public final <T> InterfaceC7505d1<T> b(Class<T> cls) {
        InterfaceC7505d1<T> interfaceC7505d1 = (InterfaceC7505d1) this.f70752a.get(cls);
        if (interfaceC7505d1 != null) {
            return interfaceC7505d1;
        }
        throw new IllegalStateException(U7.m.a(cls, "Failed to get feature with key = "));
    }

    public final Object c() {
        C7558q2 c7558q2 = this.f70753b;
        if (c7558q2 == null) {
            return a(Y1.class);
        }
        c7558q2.a();
        Object b11 = b(Y1.class).b();
        this.f70753b.b();
        return b11;
    }

    public final void d(Map<Class<?>, InterfaceC7505d1> map) {
        this.f70752a.putAll(map);
    }
}
