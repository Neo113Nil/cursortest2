package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface KotlinTypeChecker {
    public static final KotlinTypeChecker DEFAULT = NewKotlinTypeChecker.Companion.getDefault();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface TypeConstructorEquality {
        boolean equals(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
    }

    boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);

    boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2);
}
