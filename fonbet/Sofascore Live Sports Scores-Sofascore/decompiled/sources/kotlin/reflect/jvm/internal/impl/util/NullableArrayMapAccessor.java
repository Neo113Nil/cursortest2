package kotlin.reflect.jvm.internal.impl.util;

import defpackage.xnf;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements xnf {
    public NullableArrayMapAccessor(int i) {
        super(i);
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner, @NotNull KProperty<?> kProperty) {
        abstractArrayMapOwner.getClass();
        kProperty.getClass();
        return extractValue(abstractArrayMapOwner);
    }

    @Override // defpackage.xnf
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }
}
