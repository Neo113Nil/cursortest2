package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
