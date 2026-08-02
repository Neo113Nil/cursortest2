package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    @NotNull
    private final MemoizedFunctionToNullable<FqName, T> cache;

    @NotNull
    private final Map<FqName, T> states;

    @NotNull
    private final LockBasedStorageManager storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> map) {
        map.getClass();
        this.states = map;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.storageManager = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> createMemoizedFunctionWithNullableValues = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new NullabilityAnnotationStatesImpl$cache$1(this));
        createMemoizedFunctionWithNullableValues.getClass();
        this.cache = createMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    public T get(@NotNull FqName fqName) {
        fqName.getClass();
        return (T) this.cache.invoke(fqName);
    }

    @NotNull
    public final Map<FqName, T> getStates() {
        return this.states;
    }
}
