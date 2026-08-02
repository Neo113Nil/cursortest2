package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface StorageManager {
    <T> T compute(@NotNull Function0<? extends T> function0);

    @NotNull
    <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    @NotNull
    <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues();

    @NotNull
    <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0);

    @NotNull
    <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, @Nullable Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function12);

    @NotNull
    <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0);

    @NotNull
    <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t);
}
