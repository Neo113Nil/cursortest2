package kotlin.reflect.jvm.internal.impl.types;

import defpackage.zzl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FlexibleTypesKt {
    @NotNull
    public static final FlexibleType asFlexibleType(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap = kotlinType.unwrap();
        unwrap.getClass();
        return (FlexibleType) unwrap;
    }

    public static final boolean isFlexible(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    @NotNull
    public static final SimpleType lowerIfFlexible(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrap).getLowerBound();
        }
        if (unwrap instanceof SimpleType) {
            return (SimpleType) unwrap;
        }
        zzl.b();
        return null;
    }

    @NotNull
    public static final SimpleType upperIfFlexible(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrap).getUpperBound();
        }
        if (unwrap instanceof SimpleType) {
            return (SimpleType) unwrap;
        }
        zzl.b();
        return null;
    }
}
