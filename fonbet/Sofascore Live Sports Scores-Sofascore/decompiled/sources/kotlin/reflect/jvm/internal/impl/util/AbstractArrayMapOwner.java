package kotlin.reflect.jvm.internal.impl.util;

import defpackage.eia;
import java.util.Iterator;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, eia {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {
        private final int id;

        public AbstractArrayMapAccessor(int i) {
            this.id = i;
        }

        @Nullable
        public final T extractValue(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner) {
            abstractArrayMapOwner.getClass();
            return abstractArrayMapOwner.getArrayMap().get(this.id);
        }
    }

    @NotNull
    public abstract ArrayMap<V> getArrayMap();

    @NotNull
    public abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public abstract void registerComponent(@NotNull String str, @NotNull V v);

    public final void registerComponent(@NotNull KClass<? extends K> kClass, @NotNull V v) {
        kClass.getClass();
        v.getClass();
        String qualifiedName = kClass.getQualifiedName();
        qualifiedName.getClass();
        registerComponent(qualifiedName, (String) v);
    }
}
