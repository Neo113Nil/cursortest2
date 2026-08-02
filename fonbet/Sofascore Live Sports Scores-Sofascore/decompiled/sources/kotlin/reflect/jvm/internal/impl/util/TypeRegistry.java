package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class TypeRegistry<K, V> {

    @NotNull
    private final ConcurrentHashMap<String, Integer> idPerType = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicInteger idCounter = new AtomicInteger(0);

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(@NotNull KClass<KK> kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(@NotNull KClass<T> kClass) {
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        qualifiedName.getClass();
        return getId(qualifiedName);
    }

    @NotNull
    public final Collection<Integer> getIndices() {
        Collection<Integer> values = this.idPerType.values();
        values.getClass();
        return values;
    }

    public final int getId(@NotNull String str) {
        str.getClass();
        return customComputeIfAbsent(this.idPerType, str, new TypeRegistry$getId$1(this));
    }
}
