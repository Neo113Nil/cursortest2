package nd;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nd.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8542i<V> extends AbstractC8526a<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Class<?>, V> f76985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<?>, V> f76986b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8542i(@NotNull Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f76985a = compute;
        this.f76986b = new ConcurrentHashMap<>();
    }

    @Override // nd.AbstractC8526a
    public final V a(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f76986b;
        V v11 = (V) concurrentHashMap.get(key);
        if (v11 != null) {
            return v11;
        }
        V invoke = this.f76985a.invoke(key);
        V v12 = (V) concurrentHashMap.putIfAbsent(key, invoke);
        return v12 == null ? invoke : v12;
    }
}
