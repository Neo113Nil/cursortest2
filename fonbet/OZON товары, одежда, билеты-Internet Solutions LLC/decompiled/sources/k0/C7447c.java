package k0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7447c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<K, V> f70247a = new LinkedHashMap<>(0, 0.75f, true);

    public final V a(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f70247a.get(key);
    }

    @NotNull
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> entrySet = this.f70247a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f70247a.isEmpty();
    }

    public final V d(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f70247a.put(key, value);
    }

    public final V e(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f70247a.remove(key);
    }
}
