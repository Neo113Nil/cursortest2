package kotlin.reflect.jvm.internal.impl.types;

import defpackage.zzl;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final KotlinType getEnhancement(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    @NotNull
    public static final UnwrappedType inheritEnhancement(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType, @NotNull Function1<? super KotlinType, ? extends KotlinType> function1) {
        unwrappedType.getClass();
        kotlinType.getClass();
        function1.getClass();
        KotlinType enhancement = getEnhancement(kotlinType);
        return wrapEnhancement(unwrappedType, enhancement != null ? (KotlinType) function1.invoke(enhancement) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final UnwrappedType wrapEnhancement(@NotNull UnwrappedType unwrappedType, @Nullable KotlinType kotlinType) {
        unwrappedType.getClass();
        if (unwrappedType instanceof TypeWithEnhancement) {
            return wrapEnhancement(((TypeWithEnhancement) unwrappedType).getOrigin(), kotlinType);
        }
        if (kotlinType == null || kotlinType.equals(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        zzl.b();
        return null;
    }

    @NotNull
    public static final UnwrappedType inheritEnhancement(@NotNull UnwrappedType unwrappedType, @NotNull KotlinType kotlinType) {
        unwrappedType.getClass();
        kotlinType.getClass();
        return wrapEnhancement(unwrappedType, getEnhancement(kotlinType));
    }
}
